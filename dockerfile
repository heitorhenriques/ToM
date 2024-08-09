# Start with an official Python 3.10 base image
FROM python:3.7-slim-buster

USER root

ENV JACAMO_HOME=/jacamo
ENV PATH $PATH:$JAVA_HOME/bin #:$JACAMO_HOME/scripts


# Install necessary dependencies
RUN apt-get update && apt-get install -y \
    build-essential \
    python3-dev \
    libopenblas-dev \
    openjdk-11-jdk \
    git \
    gradle \
    bash \
    fontconfig \
    ttf-dejavu \
    graphviz \
    unzip \
    curl \
    zip \
    && rm -rf /var/lib/apt/lists/*

# Install RASA and RASA SDK
RUN pip install --no-cache-dir rasa rasa-sdk docker

RUN pip install spacy && \
    python -m spacy download pt_core_news_lg

# Set the working directory
WORKDIR /app

# Copy the application code
COPY . /app

# Expose necessary ports
EXPOSE 5005 5055 8080

# Default command to start bash
CMD []
