FROM ubuntu:trusty
RUN apt-get update && \
         apt-get install -yq curl
ADD test.sh .
CMD ["bash", "test.sh"]

