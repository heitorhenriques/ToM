FROM alpine:3.14.8

#ENV JAVA_HOME=/opt/java/current
ENV JACAMO_HOME=/jacamo
ENV PATH $PATH:$JAVA_HOME/bin #:$JACAMO_HOME/scripts

RUN apk add --update --no-cache git gradle bash fontconfig ttf-dejavu graphviz
COPY jacamo-0.9/ /jacamo/

COPY . /app

RUN cd app && gradle build

EXPOSE 3271
EXPOSE 3272
EXPOSE 3273
EXPOSE 8080

WORKDIR /app


ENTRYPOINT [ "gradle", "run" ]

CMD []