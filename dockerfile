# Start with an official Python 3.10 base image
FROM python:3.7-slim-buster

# Install necessary dependencies
RUN apt-get update && apt-get install -y \
    unzip \
    curl \
    zip \
    git \
    && rm -rf /var/lib/apt/lists/*

# Install RASA and RASA SDK
RUN pip install --no-cache-dir rasa rasa-sdk

# Install Gradle using SDKMAN (for Java dependencies)
RUN curl -s "https://get.sdkman.io" | bash \
    && bash -c "source $HOME/.sdkman/bin/sdkman-init.sh && sdk install gradle"

# Set the working directory
WORKDIR /app

# Copy the application code
COPY . /app

# Expose necessary ports
EXPOSE 5005 5055 8080

# Default command to start bash
CMD ["bash"]
