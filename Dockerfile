FROM ubuntu:latest
RUN apt-get update && apt-get install -y \
    default-jdk \
    maven \
    chromium-browser
COPY tests /usr/src/app/tests
WORKDIR /usr/src/app/tests
RUN mvn clean test
CMD ["mvn", "test"]





