pipeline {
  agent any
	
  triggers {
    pollSCM('* * * * *')
  }
	
  stages {
    stage("Compile") {
      steps {
        sh "./gradlew compileJava"
      }
    }
	  
    stage("Unit test") {
      steps {
        sh "./gradlew test"
      }
    }
	
    stage("Code coverage") {
      steps {
        sh "./gradlew jacocoTestReport"
        publishHTML (target: [
               reportDir: 'build/reports/jacoco/test/html',
               reportFiles: 'index.html',
               reportName: "JaCoCo Report" ])
        sh "./gradlew jacocoTestCoverageVerification"
      }
    }

    stage("Static code analysis") {
      steps {
        sh "./gradlew checkstyleMain"
        publishHTML (target: [
               reportDir: 'build/reports/checkstyle/',
               reportFiles: 'main.html',
               reportName: "Checkstyle Report" ])
      }
    }

    stage("Build") {
      steps {
        sh "./gradlew build"
      }
    }

    stage("Docker build") {
      steps {
        sh "docker build -t leszko/calculator:${BUILD_TIMESTAMP} ."
      }
    }

    stage("Docker login") {
      steps {
        withCredentials([[$class: 'UsernamePasswordMultiBinding', credentialsId: 'leszko',
                          usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD']]) {
          sh "docker login --username $USERNAME --password $PASSWORD"
        }
      }
    }

    stage("Docker push") {
      steps {
        sh "docker push leszko/calculator:${BUILD_TIMESTAMP}"
      }
    }

    stage("Deploy to staging") {
      steps {
        sh "ansible-playbook playbook.yml -i inventory/staging"
        sleep 60
      }
    }

    stage("Acceptance test") {
      steps {
	sh "./acceptance_test.sh 192.168.0.166"
      }
    }
	  
    // Performance test stages

    stage("Release") {
      steps {
        sh "ansible-playbook playbook.yml -i inventory/production"
        sleep 60
      }
    }

    stage("Smoke test") {
      steps {
	sh "./smoke_test.sh 192.168.0.115"
      }
    }
  }
}
