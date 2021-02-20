CREATE TABLE AUTHOR (
    ID BIGINT AUTO_INCREMENT NOT NULL,
    NAME VARCHAR(50) NOT NULL,
    LINKEDIN VARCHAR(100),
    FACEBOOK VARCHAR(100),
    TWITTER VARCHAR(100),
    SUMMARY TEXT,
    CONSTRAINT PK_AUTHOR PRIMARY KEY (ID),
    CONSTRAINT U_AUTHOR_NAME UNIQUE (NAME)
);