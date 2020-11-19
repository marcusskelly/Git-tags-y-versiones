# GitTags,localizar versiones

# Primer paso
1. Nos situamos en la carpetaCasa, para realizar la creacion de un **tag** en uno de los commits realizados en este repositorio local.
  * Para visualizar el historial de commits realizados en este repositorio, usaremos el comando **git log**.
  * A continuación, seleccionamos el primer commit realizado en el repositorio y procedemos a crear una **etiqueta ligera** mediante el comando git tag 1.0.0 + codigo 
    alfa numerico, donde 1.0.0 es el nombre que le daremos a nuestra etiqueta.  
  * Realizamos un git log para confirmar la realización de esta etiqueta sobre el commit deseado.
# Segundo paso
2. Para subir esta etiqueta creada en nuestro repositorio local, a nuestro repositorio remoto, utilizaremos el comando **git push --tags + URL de repositorio remoto**. 
 * Una vez realizado esto, crearemos otra etiqueta ligera en un commit más reciente del repositorio local carpetaCasa. Esta etiqueta llevará el nombre de 1.1.0.
 * Con el fin de navegar entre los commits que contienen tags, usaremos el comando **git checkout 1.0.0** que nos permite situarnos en el primer commit con etiqueta 1.0.0.
 * Una vez situados en este commit, procedemos a crear una nueva clase en la carpetaCasa llamada **Ej05.java** seguido de un git add. y un git commit -m"". 
 * Finalmente, usaremos un git push [Link a Github] para subir estos cambios.
# Tercer paso
3. Nos encontraremos con un error al intentar realizar un git push desde carpetaCasa a nuestro repositorio remoto.
*  El error en este caso, sería: failed to push some refs to remote.
*  Este error lo solucionaremos con la introducción del comando **git merge master** mediante el cual nos dara la opcion de merge by recursive strategy presionando :qa. 
*  Mediante este comando, podemos finalmente subir los cambios realizados en el repositorio local al remoto mediante el uso de **git push + [Link a github] Head:master**
# Cuarto paso

