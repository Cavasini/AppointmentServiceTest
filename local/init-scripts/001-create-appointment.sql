-- Ativa a extensão para geração de UUIDs, se ainda não estiver ativa
CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE appointment (
                             id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
                             user_id UUID NOT NULL,
                             client_id UUID NOT NULL,
                             date DATE NOT NULL,
                             start_time TIME NOT NULL,
                             end_time TIME NOT NULL,
                             service_type VARCHAR(100),
                             notes TEXT,
                             status VARCHAR(50),
                             created TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                             modified TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
