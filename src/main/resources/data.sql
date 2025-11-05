INSERT INTO OCORRENCIA
(id, titulo, descricao, data_registro, numero_ocorrencia, codigo_ocorrencia, local_ocorrencia, status_concluido, categoria)
VALUES
    (RANDOM_UUID(),'Furto de Celular', 'O noticiante relatou furto do celular no ponto de ônibus.', '2025-09-19 10:30:00', 1001, 157, 'Praça da Sé - SP', false, 'furto');

INSERT INTO OCORRENCIA
(id, titulo, descricao, data_registro, numero_ocorrencia, codigo_ocorrencia, local_ocorrencia, status_concluido, categoria)
VALUES
    (RANDOM_UUID(),'Roubo a mão armada', 'Assalto em frente ao banco com uso de arma de fogo.', '2025-09-18 14:15:00', 1002, 157, 'Av. Paulista, 1000 - SP', false, 'assalto');

INSERT INTO OCORRENCIA
(id, titulo, descricao, data_registro, numero_ocorrencia, codigo_ocorrencia, local_ocorrencia, status_concluido, categoria)
VALUES
    (RANDOM_UUID(),'Perda de documentos', 'Noticiante perdeu carteira de identidade e CPF.', '2025-09-17 09:45:00', 1003, 171, 'Rua Augusta, 200 - SP', true, 'perda_documentos');

INSERT INTO OCORRENCIA
(id, titulo, descricao, data_registro, numero_ocorrencia, codigo_ocorrencia, local_ocorrencia, status_concluido, categoria)
VALUES
    (RANDOM_UUID(),'Acidente de trânsito', 'Colisão entre dois carros no cruzamento.', '2025-09-16 18:20:00', 1004, 302, 'Av. Brasil, 500 - SP', true, 'sinistro_veicular');

INSERT INTO OCORRENCIA
(id, titulo, descricao, data_registro, numero_ocorrencia, codigo_ocorrencia, local_ocorrencia, status_concluido, categoria)
VALUES
    (RANDOM_UUID(),'Furto de bicicleta', 'Bicicleta foi furtada na ciclovia.', '2025-09-15 07:30:00', 1005, 157, 'Parque Ibirapuera - SP', false, 'furto');

INSERT INTO OCORRENCIA (id, titulo, descricao, data_registro, numero_ocorrencia, codigo_ocorrencia, local_ocorrencia, status_concluido, categoria) VALUES (RANDOM_UUID(),'Homicídio Doloso', 'Vítima encontrada sem sinais vitais em residência.', '2025-09-14 21:00:00', 1006, 101, 'Rua das Flores, 345 - SP', false, 'homicidio');

INSERT INTO OCORRENCIA (id, titulo, descricao, data_registro, numero_ocorrencia, codigo_ocorrencia, local_ocorrencia, status_concluido, categoria) VALUES (RANDOM_UUID(),'Lesão Corporal', 'Briga envolvendo duas pessoas em bar.', '2025-09-14 18:40:00', 1007, 102, 'Bar da Praça, Centro - SP', false, 'lesao_corp');
INSERT INTO OCORRENCIA (id, titulo, descricao, data_registro, numero_ocorrencia, codigo_ocorrencia, local_ocorrencia, status_concluido, categoria) VALUES (RANDOM_UUID(),'Tráfico de Drogas', 'Apreensão de entorpecentes em abordagem policial.', '2025-09-13 10:30:00', 1008, 502, 'Favela Nova Esperança - SP', true, 'drogas');
INSERT INTO OCORRENCIA (id, titulo, descricao, data_registro, numero_ocorrencia, codigo_ocorrencia, local_ocorrencia, status_concluido, categoria) VALUES (RANDOM_UUID(),'Roubo de Veículo', 'Furto de carro em estacionamento de supermercado.', '2025-09-13 15:50:00', 1009, 157, 'Supermercado Bom Preço - SP', false, 'roubo');
INSERT INTO OCORRENCIA (id, titulo, descricao, data_registro, numero_ocorrencia, codigo_ocorrencia, local_ocorrencia, status_concluido, categoria) VALUES (RANDOM_UUID(),'Furto Residencial', 'Arrombamento e saque de objetos eletrônicos.', '2025-09-12 09:00:00', 1010, 157, 'Rua das Acácias, 111 - SP', false, 'furto');
INSERT INTO OCORRENCIA (id, titulo, descricao, data_registro, numero_ocorrencia, codigo_ocorrencia, local_ocorrencia, status_concluido, categoria) VALUES (RANDOM_UUID(),'Acidente com vítima fatal', 'Colisão frontal entre dois veículos na rodovia.', '2025-09-12 22:20:00', 1011, 302, 'Rodovia BR-101 KM 25', true, 'sinistro_veicular');
INSERT INTO OCORRENCIA (id, titulo, descricao, data_registro, numero_ocorrencia, codigo_ocorrencia, local_ocorrencia, status_concluido, categoria) VALUES (RANDOM_UUID(),'Estelionato', 'Fraude em compra online com uso de cartão clonado.', '2025-09-11 16:45:00', 1012, 615, 'Shopping Central - SP', false, 'estelionato');
INSERT INTO OCORRENCIA (id, titulo, descricao, data_registro, numero_ocorrencia, codigo_ocorrencia, local_ocorrencia, status_concluido, categoria) VALUES (RANDOM_UUID(),'Desaparecimento', 'Pessoa não localizada desde última sexta-feira.', '2025-09-11 08:15:00', 1013, 703, 'Rua dos Jasmins, 50 - SP', false, 'desaparecido');
INSERT INTO OCORRENCIA (id, titulo, descricao, data_registro, numero_ocorrencia, codigo_ocorrencia, local_ocorrencia, status_concluido, categoria) VALUES (RANDOM_UUID(),'Perturbação de Sossego', 'Queixa de som alto em residência vizinha.', '2025-09-10 23:30:00', 1014, 801, 'Condomínio Bela Vista - SP', true, 'perturbacao');
INSERT INTO OCORRENCIA (id, titulo, descricao, data_registro, numero_ocorrencia, codigo_ocorrencia, local_ocorrencia, status_concluido, categoria) VALUES (RANDOM_UUID(),'Violência Doméstica', 'Mulher vítima de agressão relatada em boletim.', '2025-09-10 14:00:00', 1015, 406, 'Rua das Oliveiras, 420 - SP', false, 'violencia_domestica');
INSERT INTO OCORRENCIA (id, titulo, descricao, data_registro, numero_ocorrencia, codigo_ocorrencia, local_ocorrencia, status_concluido, categoria) VALUES (RANDOM_UUID(),'Ameaça', 'Denúncia de ameaça com arma branca.', '2025-09-09 19:30:00', 1016, 407, 'Praça Central - SP', false, 'ameaca');
INSERT INTO OCORRENCIA (id, titulo, descricao, data_registro, numero_ocorrencia, codigo_ocorrencia, local_ocorrencia, status_concluido, categoria) VALUES (RANDOM_UUID(),'Posse Ilegal de Arma', 'Arma de fogo apreendida em residência.', '2025-09-09 11:45:00', 1017, 503, 'Rua das Mimosas, 90 - SP', true, 'posse_arma');
INSERT INTO OCORRENCIA (id, titulo, descricao, data_registro, numero_ocorrencia, codigo_ocorrencia, local_ocorrencia, status_concluido, categoria) VALUES (RANDOM_UUID(),'Furto em Comércio', 'Ladrões levaram mercadorias da loja.', '2025-09-08 13:25:00', 1018, 157, 'Rua 25 de Março, 800 - SP', false, 'furto');
INSERT INTO OCORRENCIA (id, titulo, descricao, data_registro, numero_ocorrencia, codigo_ocorrencia, local_ocorrencia, status_concluido, categoria) VALUES (RANDOM_UUID(),'Homicídio Culposo', 'Acidente de trânsito com vítima fatal.', '2025-09-07 18:50:00', 1019, 102, 'Av. Getúlio Vargas, 120 - SP', true, 'homicidio_culposo');
INSERT INTO OCORRENCIA (id, titulo, descricao, data_registro, numero_ocorrencia, codigo_ocorrencia, local_ocorrencia, status_concluido, categoria) VALUES (RANDOM_UUID(),'Roubo a Estabelecimento', 'Assalto à mão armada em loja de conveniência.', '2025-09-07 21:20:00', 1020, 157, 'Av. Brasil, 1020 - SP', false, 'roubo');
INSERT INTO OCORRENCIA (id, titulo, descricao, data_registro, numero_ocorrencia, codigo_ocorrencia, local_ocorrencia, status_concluido, categoria) VALUES (RANDOM_UUID(),'Desacato', 'Pessoa desacatou funcionário público durante abordagem.', '2025-09-06 22:40:00', 1021, 901, 'Rua das Palmeiras, 30 - SP', true, 'desacato');
INSERT INTO OCORRENCIA (id, titulo, descricao, data_registro, numero_ocorrencia, codigo_ocorrencia, local_ocorrencia, status_concluido, categoria) VALUES (RANDOM_UUID(),'Estupro', 'Vítima relatou agressão sexual em via pública.', '2025-09-06 01:15:00', 1022, 201, 'Praça da Bandeira - SP', false, 'estupro');
INSERT INTO OCORRENCIA (id, titulo, descricao, data_registro, numero_ocorrencia, codigo_ocorrencia, local_ocorrencia, status_concluido, categoria) VALUES (RANDOM_UUID(),'Receptação', 'Venda de produto furtado em comércio local.', '2025-09-05 15:30:00', 1023, 604, 'Feira Livre do Centro - SP', false, 'receptacao');
INSERT INTO OCORRENCIA (id, titulo, descricao, data_registro, numero_ocorrencia, codigo_ocorrencia, local_ocorrencia, status_concluido, categoria) VALUES (RANDOM_UUID(),'Invasão de Propriedade', 'Pessoas removidas de terreno particular.', '2025-09-05 09:00:00', 1024, 802, 'Zona Rural - SP', false, 'invasao');
INSERT INTO OCORRENCIA (id, titulo, descricao, data_registro, numero_ocorrencia, codigo_ocorrencia, local_ocorrencia, status_concluido, categoria) VALUES (RANDOM_UUID(),'Posse Irregular de Droga', 'Maconha apreendida durante abordagem.', '2025-09-04 20:25:00', 1025, 502, 'Favela do Sol Nascente - SP', true, 'drogas');
INSERT INTO OCORRENCIA (id, titulo, descricao, data_registro, numero_ocorrencia, codigo_ocorrencia, local_ocorrencia, status_concluido, categoria) VALUES (RANDOM_UUID(),'Lesão Corporal Grave', 'Vítima hospitalizada após agressão.', '2025-09-04 13:40:00', 1026, 103, 'Rua das Laranjeiras, 100 - SP', false, 'lesao_corp');
INSERT INTO OCORRENCIA (id, titulo, descricao, data_registro, numero_ocorrencia, codigo_ocorrencia, local_ocorrencia, status_concluido, categoria) VALUES (RANDOM_UUID(),'Abandono de Incapaz', 'Denúncia de negligência familiar.', '2025-09-03 17:10:00', 1027, 805, 'Rua Florianópolis, 250 - SP', false, 'abandono');
INSERT INTO OCORRENCIA (id, titulo, descricao, data_registro, numero_ocorrencia, codigo_ocorrencia, local_ocorrencia, status_concluido, categoria) VALUES (RANDOM_UUID(),'Dano ao Patrimônio', 'Pichação em patrimônio público.', '2025-09-03 21:55:00', 1028, 604, 'Praça do Ciclista - SP', true, 'dano');
INSERT INTO OCORRENCIA (id, titulo, descricao, data_registro, numero_ocorrencia, codigo_ocorrencia, local_ocorrencia, status_concluido, categoria) VALUES (RANDOM_UUID(),'Extorsão', 'Pessoa ameaçada para entregar valores.', '2025-09-02 22:00:00', 1029, 405, 'Rua do Comércio, 80 - SP', false, 'extorsao');
INSERT INTO OCORRENCIA (id, titulo, descricao, data_registro, numero_ocorrencia, codigo_ocorrencia, local_ocorrencia, status_concluido, categoria) VALUES (RANDOM_UUID(),'Desocupação Legal', 'Retirada de invasores de imóvel público.', '2025-09-02 09:30:00', 1030, 701, 'Área Central - SP', true, 'desocupacao');
INSERT INTO OCORRENCIA (id, titulo, descricao, data_registro, numero_ocorrencia, codigo_ocorrencia, local_ocorrencia, status_concluido, categoria) VALUES (RANDOM_UUID(),'Corrupção', 'Investigação de crimes contra a administração pública.', '2025-09-01 10:00:00', 1031, 905, 'Escritório Governamental - SP', false, 'corrupcao');
INSERT INTO OCORRENCIA (id, titulo, descricao, data_registro, numero_ocorrencia, codigo_ocorrencia, local_ocorrencia, status_concluido, categoria) VALUES (RANDOM_UUID(),'Furto de Animais', 'Roubo de gado em propriedade rural.', '2025-09-01 06:15:00', 1032, 157, 'Fazenda Boa Vista - SP', false, 'furto');
INSERT INTO OCORRENCIA (id, titulo, descricao, data_registro, numero_ocorrencia, codigo_ocorrencia, local_ocorrencia, status_concluido, categoria) VALUES (RANDOM_UUID(),'Abuso de Autoridade', 'Denúncia contra agente público.', '2025-08-31 13:45:00', 1033, 911, 'Delegacia Central - SP', false, 'abuso_autoridade');
INSERT INTO OCORRENCIA (id, titulo, descricao, data_registro, numero_ocorrencia, codigo_ocorrencia, local_ocorrencia, status_concluido, categoria) VALUES (RANDOM_UUID(),'Injúria', 'Ofensas verbais entre vizinhos.', '2025-08-31 19:20:00', 1034, 907, 'Rua das Violetas, 77 - SP', true, 'injuria');
INSERT INTO OCORRENCIA (id, titulo, descricao, data_registro, numero_ocorrencia, codigo_ocorrencia, local_ocorrencia, status_concluido, categoria) VALUES (RANDOM_UUID(),'Furto em Veículo', 'Roubo de objetos dentro do carro.', '2025-08-30 16:00:00', 1035, 157, 'Estacionamento Shopping - SP', false, 'furto');
INSERT INTO OCORRENCIA (id, titulo, descricao, data_registro, numero_ocorrencia, codigo_ocorrencia, local_ocorrencia, status_concluido, categoria) VALUES (RANDOM_UUID(),'Violência contra idoso', 'Lesão em pessoa idosa em residência.', '2025-08-29 18:30:00', 1036, 408, 'Rua das Palmeiras, 202 - SP', false, 'violencia_domestica');
INSERT INTO OCORRENCIA (id, titulo, descricao, data_registro, numero_ocorrencia, codigo_ocorrencia, local_ocorrencia, status_concluido, categoria) VALUES (RANDOM_UUID(),'Perturbação de Sossego', 'Denúncia por som alto em festa.', '2025-08-29 21:45:00', 1037, 801, 'Bairro Jardim, SP', true, 'perturbacao');
INSERT INTO OCORRENCIA (id, titulo, descricao, data_registro, numero_ocorrencia, codigo_ocorrencia, local_ocorrencia, status_concluido, categoria) VALUES (RANDOM_UUID(),'Ameaça com arma de fogo', 'Briga com ameaça na rua.', '2025-08-28 20:10:00', 1038, 407, 'Rua Nova, 300 - SP', false, 'ameaca');
INSERT INTO OCORRENCIA (id, titulo, descricao, data_registro, numero_ocorrencia, codigo_ocorrencia, local_ocorrencia, status_concluido, categoria) VALUES (RANDOM_UUID(),'Uso de documentos falsos', 'Pessoa apreendida com documentos falsificados.', '2025-08-28 14:50:00', 1039, 615, 'Terminal Rodoviário - SP', true, 'falsificacao');
INSERT INTO OCORRENCIA (id, titulo, descricao, data_registro, numero_ocorrencia, codigo_ocorrencia, local_ocorrencia, status_concluido, categoria) VALUES (RANDOM_UUID(),'Tentativa de Furto', 'Tentativa frustrada de furto em residência.', '2025-08-27 19:35:00', 1040, 157, 'Rua das Flores, 457 - SP', false, 'furto');
INSERT INTO OCORRENCIA (id, titulo, descricao, data_registro, numero_ocorrencia, codigo_ocorrencia, local_ocorrencia, status_concluido, categoria) VALUES (RANDOM_UUID(),'Cristalização', 'Recuperação de veículo furtado.', '2025-08-26 12:00:00', 1041, 157, 'Delegacia de Polícia - SP', true, 'recuperacao');


INSERT INTO AGENTE_RESPONSAVEL (id, nome_completo, cargo) VALUES (RANDOM_UUID(),'Carlos Eduardo Oliveira', 'Soldado');
INSERT INTO AGENTE_RESPONSAVEL (id, nome_completo, cargo) VALUES (RANDOM_UUID(),'Marina Souza Lima', 'Cabo');
INSERT INTO AGENTE_RESPONSAVEL (id, nome_completo, cargo) VALUES (RANDOM_UUID(),'Felipe Santos Rocha', '3º Sargento');
INSERT INTO AGENTE_RESPONSAVEL (id, nome_completo, cargo) VALUES (RANDOM_UUID(),'Ana Paula Mendes', '2º Sargento');
INSERT INTO AGENTE_RESPONSAVEL (id, nome_completo, cargo) VALUES (RANDOM_UUID(),'Bruno Costa Almeida', '1º Sargento');
INSERT INTO AGENTE_RESPONSAVEL (id, nome_completo, cargo) VALUES (RANDOM_UUID(),'Juliana Ferreira', 'Subtenente');
INSERT INTO AGENTE_RESPONSAVEL (id, nome_completo, cargo) VALUES (RANDOM_UUID(),'Rafael Dias', 'Aspirante a Oficial');
INSERT INTO AGENTE_RESPONSAVEL (id, nome_completo, cargo) VALUES (RANDOM_UUID(),'Patrícia Santos', '2º Tenente');
INSERT INTO AGENTE_RESPONSAVEL (id, nome_completo, cargo) VALUES (RANDOM_UUID(),'João Ribeiro', '1º Tenente');
INSERT INTO AGENTE_RESPONSAVEL (id, nome_completo, cargo) VALUES (RANDOM_UUID(),'Cláudia Martins', 'Capitã');
INSERT INTO AGENTE_RESPONSAVEL (id, nome_completo, cargo) VALUES (RANDOM_UUID(),'Lucas Almeida', 'Major');
INSERT INTO AGENTE_RESPONSAVEL (id, nome_completo, cargo) VALUES (RANDOM_UUID(),'Fernanda Lima', 'Tenente-Coronel');
INSERT INTO AGENTE_RESPONSAVEL (id, nome_completo, cargo) VALUES (RANDOM_UUID(),'Eduardo Castro', 'Coronel');
INSERT INTO AGENTE_RESPONSAVEL (id, nome_completo, cargo) VALUES (RANDOM_UUID(),'Larissa Costa', 'Delegada');
INSERT INTO AGENTE_RESPONSAVEL (id, nome_completo, cargo) VALUES (RANDOM_UUID(),'Gustavo Moura', 'Investigador');
INSERT INTO AGENTE_RESPONSAVEL (id, nome_completo, cargo) VALUES (RANDOM_UUID(),'Isabella Ferreira', 'Escrivã');
INSERT INTO AGENTE_RESPONSAVEL (id, nome_completo, cargo) VALUES (RANDOM_UUID(),'Thiago Souza', 'Perito Criminal');
INSERT INTO AGENTE_RESPONSAVEL (id, nome_completo, cargo) VALUES (RANDOM_UUID(),'Carla Nunes', 'Soldada');
INSERT INTO AGENTE_RESPONSAVEL (id, nome_completo, cargo) VALUES (RANDOM_UUID(),'Marcos Vinicius', 'Cabo');
INSERT INTO AGENTE_RESPONSAVEL (id, nome_completo, cargo) VALUES (RANDOM_UUID(),'Fabiana Rocha', '3º Sargento');
INSERT INTO AGENTE_RESPONSAVEL (id, nome_completo, cargo) VALUES (RANDOM_UUID(),'André Luiz', '2º Sargento');
INSERT INTO AGENTE_RESPONSAVEL (id, nome_completo, cargo) VALUES (RANDOM_UUID(),'Jessica Melo', '1º Sargento');
INSERT INTO AGENTE_RESPONSAVEL (id, nome_completo, cargo) VALUES (RANDOM_UUID(),'Marcelo Dias', 'Subtenente');
INSERT INTO AGENTE_RESPONSAVEL (id, nome_completo, cargo) VALUES (RANDOM_UUID(),'Tatiane Alves', 'Aspirante a Oficial');
INSERT INTO AGENTE_RESPONSAVEL (id, nome_completo, cargo) VALUES (RANDOM_UUID(),'Ricardo Lima', '2º Tenente');
INSERT INTO AGENTE_RESPONSAVEL (id, nome_completo, cargo) VALUES (RANDOM_UUID(),'Daniela Gomes', '1º Tenente');
INSERT INTO AGENTE_RESPONSAVEL (id, nome_completo, cargo) VALUES (RANDOM_UUID(),'Fábio Silva', 'Capitão');
INSERT INTO AGENTE_RESPONSAVEL (id, nome_completo, cargo) VALUES (RANDOM_UUID(),'Sofia Pereira', 'Major');
INSERT INTO AGENTE_RESPONSAVEL (id, nome_completo, cargo) VALUES (RANDOM_UUID(),'Vitor Santos', 'Tenente-Coronel');
INSERT INTO AGENTE_RESPONSAVEL (id, nome_completo, cargo) VALUES (RANDOM_UUID(),'Cíntia Moreira', 'Coronel');
INSERT INTO AGENTE_RESPONSAVEL (id, nome_completo, cargo) VALUES (RANDOM_UUID(),'Bruna Oliveira', 'Delegada');
INSERT INTO AGENTE_RESPONSAVEL (id, nome_completo, cargo) VALUES (RANDOM_UUID(),'Leandro Alves', 'Investigador');
INSERT INTO AGENTE_RESPONSAVEL (id, nome_completo, cargo) VALUES (RANDOM_UUID(),'Mariana Souza', 'Escrivã');
INSERT INTO AGENTE_RESPONSAVEL (id, nome_completo, cargo) VALUES (RANDOM_UUID(),'Rodrigo Fernandes', 'Perito Criminal');
INSERT INTO AGENTE_RESPONSAVEL (id, nome_completo, cargo) VALUES (RANDOM_UUID(),'Patrícia Ramos', 'Soldada');
INSERT INTO AGENTE_RESPONSAVEL (id, nome_completo, cargo) VALUES (RANDOM_UUID(),'Renato Costa', 'Cabo');
INSERT INTO AGENTE_RESPONSAVEL (id, nome_completo, cargo) VALUES (RANDOM_UUID(),'Larissa Rezende', '3º Sargento');
INSERT INTO AGENTE_RESPONSAVEL (id, nome_completo, cargo) VALUES (RANDOM_UUID(),'Guilherme Martins', '2º Sargento');
INSERT INTO AGENTE_RESPONSAVEL (id, nome_completo, cargo) VALUES (RANDOM_UUID(),'Amanda Borges', '1º Sargento');
INSERT INTO AGENTE_RESPONSAVEL (id, nome_completo, cargo) VALUES (RANDOM_UUID(),'Paulo Viana', 'Subtenente');
INSERT INTO AGENTE_RESPONSAVEL (id, nome_completo, cargo) VALUES (RANDOM_UUID(),'Camila Santana', 'Aspirante a Oficial');
INSERT INTO AGENTE_RESPONSAVEL (id, nome_completo, cargo) VALUES (RANDOM_UUID(),'Luiz Fernando', '2º Tenente');
INSERT INTO AGENTE_RESPONSAVEL (id, nome_completo, cargo) VALUES (RANDOM_UUID(),'Juliana Ribeiro', '1º Tenente');
INSERT INTO AGENTE_RESPONSAVEL (id, nome_completo, cargo) VALUES (RANDOM_UUID(),'Thiago Carvalho', 'Capitão');
INSERT INTO AGENTE_RESPONSAVEL (id, nome_completo, cargo) VALUES (RANDOM_UUID(),'Flávia Nunes', 'Major');
INSERT INTO AGENTE_RESPONSAVEL (id, nome_completo, cargo) VALUES (RANDOM_UUID(),'Eduardo Lima', 'Tenente-Coronel');
INSERT INTO AGENTE_RESPONSAVEL (id, nome_completo, cargo) VALUES (RANDOM_UUID(),'Beatriz Fonseca', 'Coronel');
INSERT INTO AGENTE_RESPONSAVEL (id, nome_completo, cargo) VALUES (RANDOM_UUID(),'Marcelo Campos', 'Delegado');
INSERT INTO AGENTE_RESPONSAVEL (id, nome_completo, cargo) VALUES (RANDOM_UUID(),'Renata Moura', 'Investigadora');
INSERT INTO AGENTE_RESPONSAVEL (id, nome_completo, cargo) VALUES (RANDOM_UUID(),'Anderson Pinto', 'Escrivão');
INSERT INTO AGENTE_RESPONSAVEL (id, nome_completo, cargo) VALUES (RANDOM_UUID(),'Sabrina Rocha', 'Perito Criminal');
INSERT INTO DELEGACIA (id, titulo, delegado_responsavel, endereco, telefone) VALUES (RANDOM_UUID(), 'Delegacia Central', 'Carlos Eduardo Oliveira', 'Av. São João, 1000 - Centro, SP', '(11) 3333-4444');

INSERT INTO DELEGACIA (id, titulo, delegado_responsavel, endereco, telefone) VALUES (RANDOM_UUID(),'Delegacia Sul', 'Marina Souza Lima', 'Rua das Flores, 200 - Bairro Sul, SP', '(11) 3344-5566');
INSERT INTO DELEGACIA (id, titulo, delegado_responsavel, endereco, telefone) VALUES (RANDOM_UUID(),'Delegacia Norte', 'Felipe Santos Rocha', 'Av. Norte, 1500 - Zona Norte, SP', '(11) 3355-6677');
INSERT INTO DELEGACIA (id, titulo, delegado_responsavel, endereco, telefone) VALUES (RANDOM_UUID(),'Delegacia Leste', 'Ana Paula Mendes', 'Rua Leste, 320 - Bairro Leste, SP', '(11) 3366-7788');
INSERT INTO DELEGACIA (id, titulo, delegado_responsavel, endereco, telefone) VALUES (RANDOM_UUID(),'Delegacia Oeste', 'Bruno Costa Almeida', 'Rua Oeste, 870 - Bairro Oeste, SP', '(11) 3377-8899');
INSERT INTO DELEGACIA (id, titulo, delegado_responsavel, endereco, telefone) VALUES (RANDOM_UUID(),'Delegacia Centro Histórico', 'Juliana Ferreira', 'Rua 7 de Setembro, 500 - Centro Histórico, SP', '(11) 3388-9900');
INSERT INTO DELEGACIA (id, titulo, delegado_responsavel, endereco, telefone) VALUES (RANDOM_UUID(),'Delegacia da Vila Mariana', 'Rafael Dias', 'Av. Paulista, 1000 - Vila Mariana, SP', '(11) 3399-1010');
INSERT INTO DELEGACIA (id, titulo, delegado_responsavel, endereco, telefone) VALUES (RANDOM_UUID(),'Delegacia de Pinheiros', 'Patrícia Santos', 'Rua dos Pinheiros, 790 - Pinheiros, SP', '(11) 3400-1212');
INSERT INTO DELEGACIA (id, titulo, delegado_responsavel, endereco, telefone) VALUES (RANDOM_UUID(),'Delegacia de Moema', 'João Ribeiro', 'Av. Moema, 650 - Moema, SP', '(11) 3411-1313');
INSERT INTO DELEGACIA (id, titulo, delegado_responsavel, endereco, telefone) VALUES (RANDOM_UUID(),'Delegacia Campo Belo', 'Cláudia Martins', 'Rua Campo Belo, 250 - Campo Belo, SP', '(11) 3422-1414');
INSERT INTO DELEGACIA (id, titulo, delegado_responsavel, endereco, telefone) VALUES (RANDOM_UUID(),'Delegacia Butantã', 'Lucas Almeida', 'Rua Butantã, 1.100 - Butantã, SP', '(11) 3433-1515');
INSERT INTO DELEGACIA (id, titulo, delegado_responsavel, endereco, telefone) VALUES (RANDOM_UUID(),'Delegacia Santo Amaro', 'Fernanda Lima', 'Av. Santo Amaro, 2500 - Santo Amaro, SP', '(11) 3444-1616');
INSERT INTO DELEGACIA (id, titulo, delegado_responsavel, endereco, telefone) VALUES (RANDOM_UUID(),'Delegacia Vila Prudente', 'Eduardo Castro', 'Rua Vila Prudente, 880 - Vila Prudente, SP', '(11) 3455-1717');
INSERT INTO DELEGACIA (id, titulo, delegado_responsavel, endereco, telefone) VALUES (RANDOM_UUID(),'Delegacia Tatuapé', 'Larissa Costa', 'Av. Tatuapé, 3700 - Tatuapé, SP', '(11) 3466-1818');
INSERT INTO DELEGACIA (id, titulo, delegado_responsavel, endereco, telefone) VALUES (RANDOM_UUID(),'Delegacia Santana', 'Gustavo Moura', 'Rua Santana, 500 - Santana, SP', '(11) 3477-1919');
INSERT INTO DELEGACIA (id, titulo, delegado_responsavel, endereco, telefone) VALUES (RANDOM_UUID(),'Delegacia Lapa', 'Isabella Ferreira', 'Rua Lapa, 1350 - Lapa, SP', '(11) 3488-2020');
INSERT INTO DELEGACIA (id, titulo, delegado_responsavel, endereco, telefone) VALUES (RANDOM_UUID(),'Delegacia Ipiranga', 'Thiago Souza', 'Av. Ipiranga, 2100 - Ipiranga, SP', '(11) 3499-2121');
INSERT INTO DELEGACIA (id, titulo, delegado_responsavel, endereco, telefone) VALUES (RANDOM_UUID(),'Delegacia Sapopemba', 'Carla Nunes', 'Rua Sapopemba, 900 - Sapopemba, SP', '(11) 3500-2222');
INSERT INTO DELEGACIA (id, titulo, delegado_responsavel, endereco, telefone) VALUES (RANDOM_UUID(),'Delegacia Penha', 'Marcos Vinicius', 'Av. Penha, 1450 - Penha, SP', '(11) 3511-2323');
INSERT INTO DELEGACIA (id, titulo, delegado_responsavel, endereco, telefone) VALUES (RANDOM_UUID(),'Delegacia Móoca', 'Fabiana Rocha', 'Rua da Móoca, 600 - Móoca, SP', '(11) 3522-2424');
INSERT INTO DELEGACIA (id, titulo, delegado_responsavel, endereco, telefone) VALUES (RANDOM_UUID(),'Delegacia Vila Formosa', 'André Luiz', 'Rua Vila Formosa, 230 - Vila Formosa, SP', '(11) 3533-2525');
INSERT INTO DELEGACIA (id, titulo, delegado_responsavel, endereco, telefone) VALUES (RANDOM_UUID(),'Delegacia Jardim Ângela', 'Jessica Melo', 'Rua Jardim Ângela, 170 - Jardim Ângela, SP', '(11) 3544-2626');
INSERT INTO DELEGACIA (id, titulo, delegado_responsavel, endereco, telefone) VALUES (RANDOM_UUID(),'Delegacia São Mateus', 'Marcelo Dias', 'Av. São Mateus, 900 - São Mateus, SP', '(11) 3555-2727');
INSERT INTO DELEGACIA (id, titulo, delegado_responsavel, endereco, telefone) VALUES (RANDOM_UUID(),'Delegacia Cidade Ademar', 'Tatiane Alves', 'Rua Cidade Ademar, 345 - Cidade Ademar, SP', '(11) 3566-2828');
INSERT INTO DELEGACIA (id, titulo, delegado_responsavel, endereco, telefone) VALUES (RANDOM_UUID(),'Delegacia Itaquera', 'Ricardo Lima', 'Rua Itaquera, 780 - Itaquera, SP', '(11) 3577-2929');
INSERT INTO DELEGACIA (id, titulo, delegado_responsavel, endereco, telefone) VALUES (RANDOM_UUID(),'Delegacia São Miguel', 'Daniela Gomes', 'Av. São Miguel, 1600 - São Miguel, SP', '(11) 3588-3030');
INSERT INTO DELEGACIA (id, titulo, delegado_responsavel, endereco, telefone) VALUES (RANDOM_UUID(),'Delegacia Lins de Vasconcelos', 'Fábio Silva', 'Rua Lins de Vasconcelos, 222 - Lins de Vasconcelos, SP', '(11) 3599-3131');
INSERT INTO DELEGACIA (id, titulo, delegado_responsavel, endereco, telefone) VALUES (RANDOM_UUID(),'Delegacia Grajaú', 'Sofia Pereira', 'Rua Grajaú, 440 - Grajaú, SP', '(11) 3600-3232');
INSERT INTO DELEGACIA (id, titulo, delegado_responsavel, endereco, telefone) VALUES (RANDOM_UUID(),'Delegacia Pirituba', 'Vitor Santos', 'Av. Pirituba, 1230 - Pirituba, SP', '(11) 3611-3333');
INSERT INTO DELEGACIA (id, titulo, delegado_responsavel, endereco, telefone) VALUES (RANDOM_UUID(),'Delegacia Perus', 'Cíntia Moreira', 'Rua Perus, 310 - Perus, SP', '(11) 3622-3434');
INSERT INTO DELEGACIA (id, titulo, delegado_responsavel, endereco, telefone) VALUES (RANDOM_UUID(),'Delegacia Jardins', 'Bruna Oliveira', 'Rua Haddock Lobo, 97 - Jardins, SP', '(11) 3633-3535');
INSERT INTO DELEGACIA (id, titulo, delegado_responsavel, endereco, telefone) VALUES (RANDOM_UUID(),'Delegacia Barra Funda', 'Leandro Alves', 'Av. Marquês de São Vicente, 500 - Barra Funda, SP', '(11) 3644-3636');
INSERT INTO DELEGACIA (id, titulo, delegado_responsavel, endereco, telefone) VALUES (RANDOM_UUID(),'Delegacia Consolação', 'Mariana Souza', 'Rua Consolação, 1800 - Consolação, SP', '(11) 3655-3737');
INSERT INTO DELEGACIA (id, titulo, delegado_responsavel, endereco, telefone) VALUES (RANDOM_UUID(),'Delegacia Liberdade', 'Rodrigo Fernandes', 'Rua Liberdade, 900 - Liberdade, SP', '(11) 3666-3838');
INSERT INTO DELEGACIA (id, titulo, delegado_responsavel, endereco, telefone) VALUES (RANDOM_UUID(),'Delegacia Bela Vista', 'Patrícia Ramos', 'Rua Bela Vista, 770 - Bela Vista, SP', '(11) 3677-3939');
INSERT INTO DELEGACIA (id, titulo, delegado_responsavel, endereco, telefone) VALUES (RANDOM_UUID(),'Delegacia Campo Limpo', 'Renato Costa', 'Rua Campo Limpo, 150 - Campo Limpo, SP', '(11) 3688-4040');
INSERT INTO DELEGACIA (id, titulo, delegado_responsavel, endereco, telefone) VALUES (RANDOM_UUID(),'Delegacia Capão Redondo', 'Larissa Rezende', 'Rua Capão Redondo, 250 - Capão Redondo, SP', '(11) 3699-4141');
INSERT INTO DELEGACIA (id, titulo, delegado_responsavel, endereco, telefone) VALUES (RANDOM_UUID(),'Delegacia Vila Mariana', 'Guilherme Martins', 'Av. Ibirapuera, 2000 - Vila Mariana, SP', '(11) 3700-4242');
INSERT INTO DELEGACIA (id, titulo, delegado_responsavel, endereco, telefone) VALUES (RANDOM_UUID(),'Delegacia Saúde', 'Amanda Borges', 'Rua da Saúde, 144 - Saúde, SP', '(11) 3711-4343');
INSERT INTO DELEGACIA (id, titulo, delegado_responsavel, endereco, telefone) VALUES (RANDOM_UUID(),'Delegacia Mooca', 'Paulo Viana', 'Rua da Mooca, 850 - Mooca, SP', '(11) 3722-4444');
INSERT INTO DELEGACIA (id, titulo, delegado_responsavel, endereco, telefone) VALUES (RANDOM_UUID(),'Delegacia Penha', 'Camila Santana', 'Av. Penha, 2300 - Penha, SP', '(11) 3733-4545');
INSERT INTO DELEGACIA (id, titulo, delegado_responsavel, endereco, telefone) VALUES (RANDOM_UUID(),'Delegacia Tucuruvi', 'Luiz Fernando', 'Rua Tucuruvi, 110 - Tucuruvi, SP', '(11) 3744-4646');
INSERT INTO DELEGACIA (id, titulo, delegado_responsavel, endereco, telefone) VALUES (RANDOM_UUID(),'Delegacia Santana', 'Juliana Ribeiro', 'Av. Nova Cantareira, 780 - Santana, SP', '(11) 3755-4747');
INSERT INTO DELEGACIA (id, titulo, delegado_responsavel, endereco, telefone) VALUES (RANDOM_UUID(),'Delegacia Vila Guilherme', 'Thiago Carvalho', 'Rua Vila Guilherme, 540 - Vila Guilherme, SP', '(11) 3766-4848');
INSERT INTO DELEGACIA (id, titulo, delegado_responsavel, endereco, telefone) VALUES (RANDOM_UUID(),'Delegacia São Miguel Paulista', 'Flávia Nunes', 'Av. São Miguel, 6700 - São Miguel Paulista, SP', '(11) 3777-4949');
INSERT INTO DELEGACIA (id, titulo, delegado_responsavel, endereco, telefone) VALUES (RANDOM_UUID(),'Delegacia Jardim Paulista', 'Eduardo Lima', 'Rua Pamplona, 100 - Jardim Paulista, SP', '(11) 3788-5050');
INSERT INTO NOTICIANTE (id, nome_completo, cpf, rg, idade, endereco, telefone, email, estado_civil) VALUES (RANDOM_UUID(), 'Ana Paula Mendes', '12345678901', 'MG1234567', 34, 'Rua das Flores, 300 - SP', '(11) 91234-5678', 'ana.mendes@email.com', 'Solteira');
INSERT INTO NOTICIANTE (id, nome_completo, cpf, rg, idade, endereco, telefone, email, estado_civil) VALUES (RANDOM_UUID(), 'Bruno Costa', '10987654321', 'SP7654321', 42, 'Av. Paulista, 1500 - SP', '(11) 98765-4321', 'bruno.costa@email.com', 'Casado');
INSERT INTO NOTICIANTE (id, nome_completo, cpf, rg, idade, endereco, telefone, email, estado_civil) VALUES (RANDOM_UUID(), 'Carla Nunes', '14523698710', 'RJ1827364', 29, 'Rua São João, 500 - SP', '(11) 93456-7890', 'carla.nunes@email.com', 'Solteira');
INSERT INTO NOTICIANTE (id, nome_completo, cpf, rg, idade, endereco, telefone, email, estado_civil) VALUES (RANDOM_UUID(), 'Diego Rocha', '17894563210', 'MG9384756', 38, 'Rua das Palmeiras, 420 - SP', '(11) 94567-8901', 'diego.rocha@email.com', 'Divorciado');
INSERT INTO NOTICIANTE (id, nome_completo, cpf, rg, idade, endereco, telefone, email, estado_civil) VALUES (RANDOM_UUID(), 'Eduarda Lima', '13254769810', 'SP5647382', 26, 'Av. Brasil, 1000 - SP', '(11) 95678-9012', 'eduarda.lima@email.com', 'Casada');
INSERT INTO NOTICIANTE (id, nome_completo, cpf, rg, idade, endereco, telefone, email, estado_civil) VALUES (RANDOM_UUID(), 'Felipe Santos', '19827364501', 'RJ9473628', 31, 'Rua Augusta, 200 - SP', '(11) 96789-0123', 'felipe.santos@email.com', 'Solteiro');
INSERT INTO NOTICIANTE (id, nome_completo, cpf, rg, idade, endereco, telefone, email, estado_civil) VALUES (RANDOM_UUID(), 'Gabriela Ferreira', '18623547901', 'MG7854692', 36, 'Rua das Acácias, 111 - SP', '(11) 97890-1234', 'gabriela.ferreira@email.com', 'Viúva');
INSERT INTO NOTICIANTE (id, nome_completo, cpf, rg, idade, endereco, telefone, email, estado_civil) VALUES (RANDOM_UUID(), 'Helena Marques', '17649382015', 'SP6849271', 25, 'Rua das Mimosas, 90 - SP', '(11) 98901-2345', 'helena.marques@email.com', 'Solteira');
INSERT INTO NOTICIANTE (id, nome_completo, cpf, rg, idade, endereco, telefone, email, estado_civil) VALUES (RANDOM_UUID(), 'Igor Mendes', '16584930271', 'RJ2847569', 40, 'Av. Ipiranga, 2100 - SP', '(11) 99012-3456', 'igor.mendes@email.com', 'Casado');
INSERT INTO NOTICIANTE (id, nome_completo, cpf, rg, idade, endereco, telefone, email, estado_civil) VALUES (RANDOM_UUID(), 'Janaina Dias', '15483920176', 'MG3029485', 33, 'Rua Sapopemba, 900 - SP', '(11) 90123-4567', 'janaina.dias@email.com', 'Separada');
INSERT INTO NOTICIANTE (id, nome_completo, cpf, rg, idade, endereco, telefone, email, estado_civil) VALUES (RANDOM_UUID(), 'Lucas Almeida', '14325678901', 'SP7564832', 28, 'Rua das Flores, 100 - SP', '(11) 91238-4567', 'lucas.almeida@email.com', 'Solteiro');
INSERT INTO NOTICIANTE (id, nome_completo, cpf, rg, idade, endereco, telefone, email, estado_civil) VALUES (RANDOM_UUID(), 'Mariana Sousa', '13245769810', 'RJ8765432', 37, 'Av. Brasil, 150 - SP', '(11) 92345-6789', 'mariana.sousa@email.com', 'Casada');
INSERT INTO NOTICIANTE (id, nome_completo, cpf, rg, idade, endereco, telefone, email, estado_civil) VALUES (RANDOM_UUID(), 'Nathalia Cruz', '12125467890', 'MG3456789', 32, 'Rua Central, 300 - SP', '(11) 93456-7890', 'nathalia.cruz@email.com', 'Solteira');
INSERT INTO NOTICIANTE (id, nome_completo, cpf, rg, idade, endereco, telefone, email, estado_civil) VALUES (RANDOM_UUID(), 'Otavio Silva', '11098765432', 'SP9876543', 45, 'Av. Paulista, 900 - SP', '(11) 94567-8901', 'otavio.silva@email.com', 'Casado');
INSERT INTO NOTICIANTE (id, nome_completo, cpf, rg, idade, endereco, telefone, email, estado_civil) VALUES (RANDOM_UUID(), 'Paula Lima', '10987654321', 'RJ1234567', 29, 'Rua das Acácias, 120 - SP', '(11) 95678-9012', 'paula.lima@email.com', 'Separada');
INSERT INTO NOTICIANTE (id, nome_completo, cpf, rg, idade, endereco, telefone, email, estado_civil) VALUES (RANDOM_UUID(), 'Ricardo Viana', '09876543210', 'MG9876543', 38, 'Rua das Oliveiras, 80 - SP', '(11) 96789-0123', 'ricardo.viana@email.com', 'Divorciado');
INSERT INTO NOTICIANTE (id, nome_completo, cpf, rg, idade, endereco, telefone, email, estado_civil) VALUES (RANDOM_UUID(), 'Sabrina Rocha', '08765432109', 'SP2345678', 26, 'Av. Santos, 75 - SP', '(11) 97890-1234', 'sabrina.rocha@email.com', 'Solteira');
INSERT INTO NOTICIANTE (id, nome_completo, cpf, rg, idade, endereco, telefone, email, estado_civil) VALUES (RANDOM_UUID(), 'Thiago Santos', '07654321098', 'RJ3456789', 33, 'Rua do Comércio, 410 - SP', '(11) 98901-2345', 'thiago.santos@email.com', 'Casado');
INSERT INTO NOTICIANTE (id, nome_completo, cpf, rg, idade, endereco, telefone, email, estado_civil) VALUES (RANDOM_UUID(), 'Valentina Gomes', '06543210987', 'MG4567890', 27, 'Rua Boa Vista, 220 - SP', '(11) 99012-3456', 'valentina.gomes@email.com', 'Viúva');
INSERT INTO NOTICIANTE (id, nome_completo, cpf, rg, idade, endereco, telefone, email, estado_civil) VALUES (RANDOM_UUID(), 'Victor Amaral', '05432109876', 'SP5678901', 41, 'Av. Brasil, 1850 - SP', '(11) 90123-4567', 'victor.amaral@email.com', 'Casado');
INSERT INTO NOTICIANTE (id, nome_completo, cpf, rg, idade, endereco, telefone, email, estado_civil) VALUES (RANDOM_UUID(), 'Wesley Martins', '04321098765', 'RJ6789012', 35, 'Rua das Flores, 100 - SP', '(11) 91234-5678', 'wesley.martins@email.com', 'Solteiro');
INSERT INTO NOTICIANTE (id, nome_completo, cpf, rg, idade, endereco, telefone, email, estado_civil) VALUES (RANDOM_UUID(), 'Yasmin Freitas', '03210987654', 'MG7890123', 30, 'Rua Central, 33 - SP', '(11) 92345-6789', 'yasmin.freitas@email.com', 'Casada');
INSERT INTO NOTICIANTE (id, nome_completo, cpf, rg, idade, endereco, telefone, email, estado_civil) VALUES (RANDOM_UUID(), 'Zeca Alves', '02109876543', 'SP8901234', 48, 'Av. Santos, 50 - SP', '(11) 93456-7890', 'zeca.alves@email.com', 'Divorciado');
INSERT INTO NOTICIANTE (id, nome_completo, cpf, rg, idade, endereco, telefone, email, estado_civil) VALUES (RANDOM_UUID(), 'Adriana Melo', '01098765432', 'RJ9012345', 28, 'Rua Boa Vista, 12 - SP', '(11) 94567-8901', 'adriana.melo@email.com', 'Solteira');
INSERT INTO NOTICIANTE (id, nome_completo, cpf, rg, idade, endereco, telefone, email, estado_civil) VALUES (RANDOM_UUID(), 'Bruno Baptista', '99876543210', 'MG1230987', 37, 'Av. Central, 800 - SP', '(11) 95678-9012', 'bruno.baptista@email.com', 'Casado');
INSERT INTO NOTICIANTE (id, nome_completo, cpf, rg, idade, endereco, telefone, email, estado_civil) VALUES (RANDOM_UUID(), 'Camila Braga', '98765432109', 'SP2109876', 31, 'Rua do Comércio, 290 - SP', '(11) 96789-0123', 'camila.braga@email.com', 'Separada');
INSERT INTO NOTICIANTE (id, nome_completo, cpf, rg, idade, endereco, telefone, email, estado_civil) VALUES (RANDOM_UUID(), 'Danilo Freitas', '97654321098', 'RJ3210987', 34, 'Rua das Oliveiras, 77 - SP', '(11) 97890-1234', 'danilo.freitas@email.com', 'Viúvo');
INSERT INTO NOTICIANTE (id, nome_completo, cpf, rg, idade, endereco, telefone, email, estado_civil) VALUES (RANDOM_UUID(), 'Elaine Santos', '96543210987', 'MG4321098', 29, 'Av. Brasil, 1200 - SP', '(11) 98901-2345', 'elaine.santos@email.com', 'Solteira');
INSERT INTO NOTICIANTE (id, nome_completo, cpf, rg, idade, endereco, telefone, email, estado_civil) VALUES (RANDOM_UUID(), 'Fábio Oliveira', '95432109876', 'SP5432109', 39, 'Rua São João, 230 - SP', '(11) 99012-3456', 'fabio.oliveira@email.com', 'Casado');
INSERT INTO NOTICIANTE (id, nome_completo, cpf, rg, idade, endereco, telefone, email, estado_civil) VALUES (RANDOM_UUID(), 'Gloria Castro', '94321098765', 'RJ6543210', 33, 'Rua das Flores, 150 - SP', '(11) 90123-4567', 'gloria.castro@email.com', 'Solteira');
INSERT INTO NOTICIANTE (id, nome_completo, cpf, rg, idade, endereco, telefone, email, estado_civil) VALUES (RANDOM_UUID(), 'Hugo Martins', '93210987654', 'MG7654321', 41, 'Av. Paulista, 800 - SP', '(11) 91234-5678', 'hugo.martins@email.com', 'Casado');
INSERT INTO NOTICIANTE (id, nome_completo, cpf, rg, idade, endereco, telefone, email, estado_civil) VALUES (RANDOM_UUID(), 'Isabel Moura', '92109876543', 'SP8765432', 27, 'Rua das Mimosas, 88 - SP', '(11) 92345-6789', 'isabel.moura@email.com', 'Casada');
INSERT INTO NOTICIANTE (id, nome_completo, cpf, rg, idade, endereco, telefone, email, estado_civil) VALUES (RANDOM_UUID(), 'Joana Ribeiro', '91098765432', 'RJ9876543', 36, 'Rua das Palmeiras, 460 - SP', '(11) 93456-7890', 'joana.ribeiro@email.com', 'Separada');
INSERT INTO NOTICIANTE (id, nome_completo, cpf, rg, idade, endereco, telefone, email, estado_civil) VALUES (RANDOM_UUID(), 'Keila Fernandes', '90987654321', 'MG0987654', 32, 'Av. Brasil, 1350 - SP', '(11) 94567-8901', 'keila.fernandes@email.com', 'Solteira');
INSERT INTO NOTICIANTE (id, nome_completo, cpf, rg, idade, endereco, telefone, email, estado_civil) VALUES (RANDOM_UUID(), 'Leandro Gomes', '89876543210', 'SP1098765', 38, 'Rua Central, 270 - SP', '(11) 95678-9012', 'leandro.gomes@email.com', 'Casado');
INSERT INTO NOTICIANTE (id, nome_completo, cpf, rg, idade, endereco, telefone, email, estado_civil) VALUES (RANDOM_UUID(), 'Marina Leal', '88765432109', 'RJ2109876', 29, 'Rua das Oliveiras, 390 - SP', '(11) 96789-0123', 'marina.leal@email.com', 'Viúva');
INSERT INTO NOTICIANTE (id, nome_completo, cpf, rg, idade, endereco, telefone, email, estado_civil) VALUES (RANDOM_UUID(), 'Nathalia Cruz', '87654321098', 'MG3210987', 33, 'Av. Paulista, 1400 - SP', '(11) 97890-1234', 'nathalia.cruz@email.com', 'Solteira');
INSERT INTO NOTICIANTE (id, nome_completo, cpf, rg, idade, endereco, telefone, email, estado_civil) VALUES (RANDOM_UUID(), 'Otavio Silva', '86543210987', 'SP4321098', 40, 'Rua São João, 305 - SP', '(11) 98901-2345', 'otavio.silva@email.com', 'Casado');
INSERT INTO TERCEIROS (id, nome_completo, cpf, rg, idade, endereco, telefone) VALUES (RANDOM_UUID(), 'Carlos Eduardo Oliveira', '12345678901', 'MG1234567', 34, 'Rua das Flores, 300 - SP', '(11) 91234-5678');
INSERT INTO TERCEIROS (id, nome_completo, cpf, rg, idade, endereco, telefone) VALUES (RANDOM_UUID(), 'Marina Souza Lima', '10987654321', 'SP7654321', 42, 'Av. Paulista, 1500 - SP', '(11) 98765-4321');
INSERT INTO TERCEIROS (id, nome_completo, cpf, rg, idade, endereco, telefone) VALUES (RANDOM_UUID(), 'Felipe Santos Rocha', '14523698710', 'RJ1827364', 29, 'Rua São João, 500 - SP', '(11) 93456-7890');
INSERT INTO TERCEIROS (id, nome_completo, cpf, rg, idade, endereco, telefone) VALUES (RANDOM_UUID(), 'Ana Paula Mendes', '17894563210', 'MG9384756', 38, 'Rua das Palmeiras, 420 - SP', '(11) 94567-8901');
INSERT INTO TERCEIROS (id, nome_completo, cpf, rg, idade, endereco, telefone) VALUES (RANDOM_UUID(), 'Bruno Costa Almeida', '13254769810', 'SP5647382', 26, 'Av. Brasil, 1000 - SP', '(11) 95678-9012');
INSERT INTO TERCEIROS (id, nome_completo, cpf, rg, idade, endereco, telefone) VALUES (RANDOM_UUID(), 'Juliana Ferreira', '19827364501', 'RJ9473628', 31, 'Rua Augusta, 200 - SP', '(11) 96789-0123');
INSERT INTO TERCEIROS (id, nome_completo, cpf, rg, idade, endereco, telefone) VALUES (RANDOM_UUID(), 'Rafael Dias', '18623547901', 'MG7854692', 36, 'Rua das Acácias, 111 - SP', '(11) 97890-1234');
INSERT INTO TERCEIROS (id, nome_completo, cpf, rg, idade, endereco, telefone) VALUES (RANDOM_UUID(), 'Patrícia Santos', '17649382015', 'SP6849271', 25, 'Rua das Mimosas, 90 - SP', '(11) 98901-2345');
INSERT INTO TERCEIROS (id, nome_completo, cpf, rg, idade, endereco, telefone) VALUES (RANDOM_UUID(), 'João Ribeiro', '16584930271', 'RJ2847569', 40, 'Av. Ipiranga, 2100 - SP', '(11) 99012-3456');
INSERT INTO TERCEIROS (id, nome_completo, cpf, rg, idade, endereco, telefone) VALUES (RANDOM_UUID(), 'Cláudia Martins', '15483920176', 'MG3029485', 33, 'Rua Sapopemba, 900 - SP', '(11) 90123-4567');
INSERT INTO TERCEIROS (id, nome_completo, cpf, rg, idade, endereco, telefone) VALUES (RANDOM_UUID(), 'Lucas Almeida', '14325678901', 'SP7564832', 28, 'Rua das Flores, 100 - SP', '(11) 91238-4567');
INSERT INTO TERCEIROS (id, nome_completo, cpf, rg, idade, endereco, telefone) VALUES (RANDOM_UUID(), 'Fernanda Lima', '13245769810', 'RJ8765432', 37, 'Av. Brasil, 150 - SP', '(11) 92345-6789');
INSERT INTO TERCEIROS (id, nome_completo, cpf, rg, idade, endereco, telefone) VALUES (RANDOM_UUID(), 'Eduardo Castro', '12125467890', 'MG3456789', 32, 'Rua Central, 300 - SP', '(11) 93456-7890');
INSERT INTO TERCEIROS (id, nome_completo, cpf, rg, idade, endereco, telefone) VALUES (RANDOM_UUID(), 'Larissa Costa', '11098765432', 'SP9876543', 45, 'Av. Paulista, 900 - SP', '(11) 94567-8901');
INSERT INTO TERCEIROS (id, nome_completo, cpf, rg, idade, endereco, telefone) VALUES (RANDOM_UUID(), 'Gustavo Moura', '10987654321', 'RJ1234567', 29, 'Rua das Acácias, 120 - SP', '(11) 95678-9012');
INSERT INTO TERCEIROS (id, nome_completo, cpf, rg, idade, endereco, telefone) VALUES (RANDOM_UUID(), 'Isabella Ferreira', '09876543210', 'MG9876543', 38, 'Rua das Oliveiras, 80 - SP', '(11) 96789-0123');
INSERT INTO TERCEIROS (id, nome_completo, cpf, rg, idade, endereco, telefone) VALUES (RANDOM_UUID(), 'Thiago Souza', '08765432109', 'SP2345678', 26, 'Av. Santos, 75 - SP', '(11) 97890-1234');
INSERT INTO TERCEIROS (id, nome_completo, cpf, rg, idade, endereco, telefone) VALUES (RANDOM_UUID(), 'Carla Nunes', '07654321098', 'RJ3456789', 33, 'Rua do Comércio, 410 - SP', '(11) 98901-2345');
INSERT INTO TERCEIROS (id, nome_completo, cpf, rg, idade, endereco, telefone) VALUES (RANDOM_UUID(), 'Marcos Vinicius', '06543210987', 'MG4567890', 27, 'Rua Boa Vista, 220 - SP', '(11) 99012-3456');
INSERT INTO TERCEIROS (id, nome_completo, cpf, rg, idade, endereco, telefone) VALUES (RANDOM_UUID(), 'Fabiana Rocha', '05432109876', 'SP5678901', 41, 'Av. Brasil, 1850 - SP', '(11) 90123-4567');
INSERT INTO TERCEIROS (id, nome_completo, cpf, rg, idade, endereco, telefone) VALUES (RANDOM_UUID(), 'André Luiz', '04321098765', 'RJ6789012', 35, 'Rua das Flores, 100 - SP', '(11) 91234-5678');
INSERT INTO TERCEIROS (id, nome_completo, cpf, rg, idade, endereco, telefone) VALUES (RANDOM_UUID(), 'Jessica Melo', '03210987654', 'MG7890123', 30, 'Rua Central, 33 - SP', '(11) 92345-6789');
INSERT INTO TERCEIROS (id, nome_completo, cpf, rg, idade, endereco, telefone) VALUES (RANDOM_UUID(), 'Marcelo Dias', '02109876543', 'SP8901234', 48, 'Av. Santos, 50 - SP', '(11) 93456-7890');
INSERT INTO TERCEIROS (id, nome_completo, cpf, rg, idade, endereco, telefone) VALUES (RANDOM_UUID(), 'Tatiane Alves', '01098765432', 'RJ9012345', 28, 'Rua Boa Vista, 12 - SP', '(11) 94567-8901');
INSERT INTO TERCEIROS (id, nome_completo, cpf, rg, idade, endereco, telefone) VALUES (RANDOM_UUID(), 'Ricardo Lima', '99876543210', 'MG1230987', 37, 'Av. Central, 800 - SP', '(11) 95678-9012');
INSERT INTO TERCEIROS (id, nome_completo, cpf, rg, idade, endereco, telefone) VALUES (RANDOM_UUID(), 'Daniela Gomes', '98765432109', 'SP2109876', 31, 'Rua do Comércio, 290 - SP', '(11) 96789-0123');
INSERT INTO TERCEIROS (id, nome_completo, cpf, rg, idade, endereco, telefone) VALUES (RANDOM_UUID(), 'Fábio Silva', '97654321098', 'RJ3210987', 34, 'Rua das Oliveiras, 77 - SP', '(11) 97890-1234');
INSERT INTO TERCEIROS (id, nome_completo, cpf, rg, idade, endereco, telefone) VALUES (RANDOM_UUID(), 'Sofia Pereira', '96543210987', 'MG4321098', 29, 'Av. Brasil, 1200 - SP', '(11) 98901-2345');
INSERT INTO TERCEIROS (id, nome_completo, cpf, rg, idade, endereco, telefone) VALUES (RANDOM_UUID(), 'Vitor Santos', '95432109876', 'SP5432109', 39, 'Rua São João, 230 - SP', '(11) 99012-3456');
INSERT INTO TERCEIROS (id, nome_completo, cpf, rg, idade, endereco, telefone) VALUES (RANDOM_UUID(), 'Cíntia Moreira', '94321098765', 'RJ6543210', 33, 'Rua das Flores, 150 - SP', '(11) 90123-4567');
INSERT INTO TERCEIROS (id, nome_completo, cpf, rg, idade, endereco, telefone) VALUES (RANDOM_UUID(), 'Bruna Oliveira', '93210987654', 'MG7654321', 41, 'Av. Paulista, 800 - SP', '(11) 91234-5678');
INSERT INTO TERCEIROS (id, nome_completo, cpf, rg, idade, endereco, telefone) VALUES (RANDOM_UUID(), 'Leandro Alves', '92109876543', 'SP8765432', 27, 'Rua das Mimosas, 88 - SP', '(11) 92345-6789');
INSERT INTO TERCEIROS (id, nome_completo, cpf, rg, idade, endereco, telefone) VALUES (RANDOM_UUID(), 'Mariana Souza', '91098765432', 'RJ9876543', 36, 'Rua das Palmeiras, 460 - SP', '(11) 93456-7890');
INSERT INTO TERCEIROS (id, nome_completo, cpf, rg, idade, endereco, telefone) VALUES (RANDOM_UUID(), 'Rodrigo Fernandes', '90987654321', 'MG0987654', 32, 'Av. Brasil, 1350 - SP', '(11) 94567-8901');
INSERT INTO TERCEIROS (id, nome_completo, cpf, rg, idade, endereco, telefone) VALUES (RANDOM_UUID(), 'Patrícia Ramos', '89876543210', 'SP1098765', 38, 'Rua Central, 270 - SP', '(11) 95678-9012');
INSERT INTO TERCEIROS (id, nome_completo, cpf, rg, idade, endereco, telefone) VALUES (RANDOM_UUID(), 'Renato Costa', '88765432109', 'RJ2109876', 29, 'Rua das Oliveiras, 390 - SP', '(11) 96789-0123');
INSERT INTO TERCEIROS (id, nome_completo, cpf, rg, idade, endereco, telefone) VALUES (RANDOM_UUID(), 'Larissa Rezende', '87654321098', 'MG3210987', 33, 'Av. Paulista, 1400 - SP', '(11) 97890-1234');
INSERT INTO TERCEIROS (id, nome_completo, cpf, rg, idade, endereco, telefone) VALUES (RANDOM_UUID(), 'Guilherme Martins', '86543210987', 'SP4321098', 40, 'Rua São João, 305 - SP', '(11) 98901-2345');
INSERT INTO TERCEIROS (id, nome_completo, cpf, rg, idade, endereco, telefone) VALUES (RANDOM_UUID(), 'Amanda Borges', '85432109876', 'RJ5432109', 35, 'Rua das Flores, 250 - SP', '(11) 99012-3456');
INSERT INTO TERCEIROS (id, nome_completo, cpf, rg, idade, endereco, telefone) VALUES (RANDOM_UUID(), 'Paulo Viana', '84321098765', 'MG6543210', 42, 'Av. Brasil, 1750 - SP', '(11) 90123-4567');
INSERT INTO TERCEIROS (id, nome_completo, cpf, rg, idade, endereco, telefone) VALUES (RANDOM_UUID(), 'Camila Santana', '83210987654', 'SP7654321', 28, 'Rua Central, 120 - SP', '(11) 91234-5678');
