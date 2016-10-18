CREATE TABLE Books (
  id          INT         NOT NULL AUTO_INCREMENT PRIMARY KEY,
  title       VARCHAR(60) NOT NULL,
  book_type        VARCHAR(40) NOT NULL,
  author      VARCHAR(50) NOT NULL,
  year_of_pub INT         ,
  UNIQUE (title)
);

INSERT INTO Books (title, book_type, author, year_of_pub) VALUES ('Преступление и наказание', 'Роман', 'Достоевский Ф.М.','1866');
INSERT INTO Books (title, book_type, author, year_of_pub) VALUES ('Чистый код', 'Техническая литература', 'Роберт Мартин','2014');
INSERT INTO Books (title, book_type, author, year_of_pub) VALUES ('Ромео и Джульетта', 'Трагедия', 'Уильям Шекспир','1597');