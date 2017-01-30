CREATE TABLE `klassmapping` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `teacherid` int(11) DEFAULT NULL,
  `klassid` int(11) DEFAULT NULL,
  `version` varchar(45) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `teacherid_idx` (`teacherid`),
  KEY `klassid_idx` (`klassid`),
  CONSTRAINT `klassid` FOREIGN KEY (`klassid`) REFERENCES `klasses` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `teacherid` FOREIGN KEY (`teacherid`) REFERENCES `teachers` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;