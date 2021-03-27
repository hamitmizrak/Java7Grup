CREATE TABLE `hastane_otomasyonu`.`admin6` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(450) NULL,
  `surname` VARCHAR(450) NULL,
  `password` VARCHAR(450) NULL,
  `email` VARCHAR(450) NULL,
  `creation_date` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;
