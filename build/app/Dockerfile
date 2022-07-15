FROM openjdk:14-jdk-alpine

RUN \ 
	apk update \
	apk add --no-cache \
	sudo \
	wget \
	unzip \
	lsof

WORKDIR /jooby
RUN wget https://repo1.maven.org/maven2/io/jooby/jooby-cli/2.8.7/jooby-cli-2.8.7.zip
RUN unzip jooby-cli-2.8.7.zip
RUN rm jooby-cli-2.8.7.zip
ENV PATH $PATH:/jooby/bin:/jooby/lib
