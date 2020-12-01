-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: library
-- ------------------------------------------------------
-- Server version	8.0.22

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `professor`
--

DROP TABLE IF EXISTS `professor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `professor` (
  `id` int NOT NULL AUTO_INCREMENT,
  `FirstName` varchar(30) NOT NULL,
  `LastName` varchar(15) NOT NULL,
  `MiddleName` varchar(15) NOT NULL,
  `Webmail` varchar(45) DEFAULT NULL,
  `DateOfBirth` date NOT NULL,
  `StreetAddress` varchar(45) NOT NULL,
  `City` varchar(15) DEFAULT NULL,
  `Province` varchar(15) DEFAULT NULL,
  `Course` varchar(45) NOT NULL,
  `shift` varchar(15) NOT NULL,
  `isWorking` tinyint DEFAULT NULL,
  `isActive` tinyint NOT NULL,
  `isResigned` tinyint NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `professor`
--

LOCK TABLES `professor` WRITE;
/*!40000 ALTER TABLE `professor` DISABLE KEYS */;
INSERT INTO `professor` VALUES (1,'Sokrates','Cynebald','Hayashi','shcynebald@pup.edu.ph','1984-11-24','11 Ortigas ave','Pasig City','Metro Manila','BSCS','Day',1,1,0),(2,'Yuuna','Aoki','Owain','yoaoki@pup.edu.ph','1991-06-10','12 Gilmore','Quezon City','Metro Manila','BSCS','Day',1,1,0),(3,'Cassandra','Goteleib','Miyamoto','cmgoteleib@pup.edu.ph','1979-12-01','65 Legaspi Vil','Manila','Metro Manila','BSCS','Day',0,0,1),(4,'Tatiana','Theodoros','Nakano','tntheodoros@pup.edu.ph','1970-06-07','56 Novaliches','Quezon City','Metro Manila','BSCS','Noon',1,1,0),(5,'Brunhild','Yoshino','Honda','bhyoshino@pup.edu.ph','1954-12-05','943 Recto','Manila','Metro Manila','BSCS','Noon',1,1,0),(6,'Morotheus','Haruna','Hildr','dhharuna@pup.edu.ph','1986-11-03','512 Balubaran','Malinta','Valenzuela','BSIT','Noon',1,1,0),(7,'Ixos','Unnr','Himura','ihunnr@pup.edu.ph','1992-06-04','825 Sta. Crus','Manila','Metro Manila','BSIT','Night',0,1,0),(8,'Aglaea','Kamala','Kubo','akkamala@pup.edu.ph','1979-01-05','173 Francis Square','Pasig','Metro Manila','BSIT','Night',1,1,0),(9,'Myrrhine','Aetius','Kuroda','mkaetius@pup.edu.ph','1989-02-03','314  Loakan Rd. ','Baguio','Benguet','BSIT','Night',1,1,0),(10,'Eusebuis','Yasuda','Rokuro','eryasuda@pup.edu.ph','1987-02-04','862 Aurora','Quezon City','Metro Manila','BSIT','Day',0,0,1);
/*!40000 ALTER TABLE `professor` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-12-01 11:11:18
