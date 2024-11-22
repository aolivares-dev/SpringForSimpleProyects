CREATE TABLE MEMDB.PUBLIC.TASK
(
    id          BIGINT AUTO_INCREMENT PRIMARY KEY,
    name        VARCHAR(255) NOT NULL,
    status      VARCHAR(50),
    priority    VARCHAR(50),
    description TEXT
);
