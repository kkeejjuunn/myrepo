FROM node:22

WORKDIR myapp

COPY main.js .
COPY package*.json .
COPY public public
COPY views views

RUN npm ci

ENV PORT=3000
ENV INSTANCE_NAME=dov-bear
ENV INSTANCE_HASH=b5f91cf35c498a0919ffce3a31419158791f37c4694313e1a1c122492b35cb6a

EXPOSE ${PORT}

ENTRYPOINT node main

