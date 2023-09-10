# PlaceTITest
desafio 2
Instalando o Docker
O Docker é uma plataforma para desenvolver, enviar e executar aplicativos em contêineres. Siga estas etapas para instalá-lo:

1. Atualize o banco de dados de pacotes:
bash
Copy code
sudo apt-get update

2. Instale as dependências necessárias para permitir que o apt use um repositório via HTTPS:
bash
Copy code
sudo apt-get install -y apt-transport-https ca-certificates curl software-properties-common

3. Importe a chave GPG oficial do Docker:
bash
Copy code
curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo gpg --dearmor -o /usr/share/keyrings/docker-archive-keyring.gpg

4. Adicione o repositório Docker ao sistema:
bash
Copy code
echo "deb [signed-by=/usr/share/keyrings/docker-archive-keyring.gpg] https://download.docker.com/linux/ubuntu $(lsb_release -cs) stable" | sudo tee /etc/apt/sources.list.d/docker.list > /dev/null

5. Atualize o banco de dados de pacotes novamente para incluir o repositório Docker:
bash
Copy code
sudo apt-get update

6. Instale a versão mais recente do Docker:
bash
Copy code
sudo apt-get install -y docker-ce docker-ce-cli containerd.io

7. Inicie e habilite o serviço Docker:
bash
Copy code
sudo systemctl start docker
sudo systemctl enable docker

8. Verifique a instalação do Docker executando o seguinte comando:
bash
Copy code
docker --version
Agora, o Docker está instalado em seu sistema.

Instalando o Docker Compose
O Docker Compose é uma ferramenta para definir e executar aplicativos Docker multi-container. Siga estas etapas para instalá-lo:

1. Faça o download da versão mais recente do Docker Compose:
bash
Copy code
sudo curl -L "https://github.com/docker/compose/releases/latest/download/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose

2. Torne o arquivo baixado executável:
bash
Copy code
sudo chmod +x /usr/local/bin/docker-compose

3. Verifique a instalação do Docker Compose:
bash
Copy code
docker-compose --version
Agora, o Docker Compose está instalado em seu sistema.

