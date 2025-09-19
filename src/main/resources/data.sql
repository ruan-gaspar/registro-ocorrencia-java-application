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
