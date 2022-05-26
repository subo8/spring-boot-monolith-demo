CREATE TABLE IF NOT EXISTS `student` (
  `id` int NOT NULL,
  `dob` date DEFAULT NULL,
  `gpa` double DEFAULT NULL,
  `age` int DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;