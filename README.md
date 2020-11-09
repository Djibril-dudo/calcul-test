Calculator unit test example in Java
===============

You should use Maven to build project.
Also I would like to recommend you edit code Intellij Idea.

1 - CREER L' IMAGE 

docker build -t nom:tag .

ex : docker build -t tp-sir:1.1.0 .

2 - VERIFIER SI l'image est bien créée

docker images

3 - DEMARRER UN CONTENEUR

docker run -t nom:tag

ex docker run -t tp-sir:1.1.0

ex docker run -d -t tp-sir:1.1.0
