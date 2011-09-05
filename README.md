# Geishatokyo archetypes


## first you install all archetypes

run `mvn install`



## generate scala project

You change groupId and artifactId.

    mvn archetype:create \
    
    -DgroupId=org.sample \

    -DartifactId=sample \

    -DarchetypeGroupId=com.geishatokyo.archetypes \

    -DarchetypeArtifactId=gte-scala \

    -DarchetypeVersion=1.0


    
for windows user copy/paste

`mvn archetype:create -DgroupId=org.sample -DartifactId=sample -DarchetypeGroupId=com.geishatokyo.archetypes -DarchetypeArtifactId=gte-scala -DarchetypeVersion=1.0`


## generate parent project for component

You change groupId and artifactId.

    mvn archetype:create \
    
    -DgroupId=org.sample \

    -DartifactId=sample \

    -DarchetypeGroupId=com.geishatokyo.archetypes \

    -DarchetypeArtifactId=gte-component \

    -DarchetypeVersion=1.0


    
for windows user copy/paste

`mvn archetype:create -DgroupId=org.sample -DartifactId=sample -DarchetypeGroupId=com.geishatokyo.archetypes -DarchetypeArtifactId=gte-component -DarchetypeVersion=1.0`
