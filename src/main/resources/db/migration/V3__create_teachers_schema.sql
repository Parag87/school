CREATE TABLE `teachers` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `version` INT  NOT NULL  DEFAULT 0,
  `name` VARCHAR(45) NOT NULL,
  `age` INT NOT NULL,
  `gender` ENUM('M', 'F') NOT NULL,
  PRIMARY KEY (`id`));