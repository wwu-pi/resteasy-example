FROM jboss/wildfly:13.0.0.Final

WORKDIR $JBOSS_HOME
RUN ./bin/add-user.sh admin admin --silent
COPY resteasy-example/build/libs/resteasy-example.ear standalone/deployments/resteasy-example.ear

CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0", "-bmanagement", "0.0.0.0"]
