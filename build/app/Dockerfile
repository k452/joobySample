FROM openjdk:17-jdk-alpine

RUN \ 
	apk update \
	apk add --no-cache \
	sudo \
	wget \
	unzip \
	lsof

WORKDIR /jooby
RUN wget https://repo1.maven.org/maven2/io/jooby/jooby-cli/2.15.1/jooby-cli-2.15.1.zip
RUN unzip jooby-cli-2.15.1.zip
RUN rm jooby-cli-2.15.1.zip
ENV PATH $PATH:/jooby/bin:/jooby/lib
