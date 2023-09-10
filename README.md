# PlaceTITest
desafio 2

# Instalando o Docker
O Docker é uma plataforma para desenvolver, enviar e executar aplicativos em contêineres. Siga estas etapas para instalá-lo:

# 1. Atualize o banco de dados de pacotes:
    sudo apt-get update

# 2. Instale a versão mais recente do Docker:
   sudo apt-get install -y docker-ce docker-ce-cli containerd.io

# 3. Inicie e habilite o serviço Docker:
  sudo systemctl start docker
  sudo systemctl enable docker

# 4. Verifique a instalação do Docker executando o seguinte comando:
  docker --version

# Instalando o Docker Compose

# 1. Faça o download da versão mais recente do Docker Compose:
  sudo curl -L "https://github.com/docker/compose/releases/latest/download/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose

# 2. Torne o arquivo baixado executável:
  sudo chmod +x /usr/local/bin/docker-compose

# 3. Verifique a instalação do Docker Compose:
  docker-compose --version

# Pré-requisitos para inicializar o spring boot

- Java Development Kit (JDK): Certifique-se de ter o JDK instalado em seu sistema. Versão do projeto: JDK 11.

- Apache Maven: Você precisa ter o Apache Maven instalado. Verifique a instalação com o comando mvn -version.

# Como instalar o Maven

sudo apt-get update
sudo apt-get install maven
mvn -version
nano ~/.bashrc
export M2_HOME=/usr/share/maven
export M2=$M2_HOME/bin
export PATH=$M2:$PATH

Salve o arquivo e saia do editor.

source ~/.bashrc

# Subindo projeto localmente 

Vá no repostitório do projeto e copie a URL.

Dentro de um diretório abra o terminal e escreva: git clone <URL_do_Projeto>

Entre na pasta do projeto usando: cd <projeto> 

Escreva o seguinte comando: mvn compile

Entre na pasta docker usando: cd docker

Após o comando, escreva: docker-compose up -d

Para ver se está rodando o container use o comando: docker ps

Após o comando acima vá para o diretório principal do projeto e escreva: mvn spring-boot:run
