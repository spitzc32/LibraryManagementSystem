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
-- Table structure for table `librarian`
--

DROP TABLE IF EXISTS `librarian`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `librarian` (
  `id` int NOT NULL AUTO_INCREMENT,
  `FirstName` varchar(30) NOT NULL,
  `LastName` varchar(15) NOT NULL,
  `MiddleName` varchar(45) NOT NULL,
  `Webmail` varchar(45) DEFAULT NULL,
  `DateOfBirth` date DEFAULT NULL,
  `StreetAddress` varchar(45) NOT NULL,
  `City` varchar(15) DEFAULT NULL,
  `Province` varchar(15) DEFAULT NULL,
  `isWorking` tinyint DEFAULT NULL,
  `shift` varchar(15) DEFAULT NULL,
  `isActive` tinyint DEFAULT NULL,
  `isResigned` tinyint DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `librarian`
--

LOCK TABLES `librarian` WRITE;
/*!40000 ALTER TABLE `librarian` DISABLE KEYS */;
INSERT INTO `librarian` VALUES (1,'Neilos','Ansehelm','Minami','nmansehelm@librarian.ph','1975-05-12','12 Azucena','Malabon','Metro Manila',1,'day',1,0),(2,'Azucena	','Tullus','Takeuchi','mttullus@librarian.ph','1971-06-03','754 Greenbelt','Makati','Metro Manila',1,'Day',1,0),(3,'Yaeko','Dudda','Ueda','yududda@librarian.ph','1987-05-08','742 Legaspi Vil','Makati','Metro Manila',1,'Day',1,0),(4,'Gorou','Honoria','Ito','gihonoria@librarian.ph','1991-08-10','451 Parkway','Quezon City','Metro Manila',1,'Noon',1,0),(5,'Maeve','Hilaria','Fukui','mfhilaria@librarian.ph','1986-06-01','69 Royal Bay','Manila','Metro Manila',0,'Noon',0,1),(6,'Lamber','Fedelmid','Morimoto','lmfedelmid@librarian.ph','1978-08-04','163 Araneta','Quezon City','Metro Manila',1,'Noon',1,0),(7,'Drakon','Alfarr','Iwata','dialfarr@librarian.ph','1985-01-03','926 General Luna','Manila','Metro Manila',1,'Night',1,0),(8,'Kleio','Brigid','Brigid','ksbrigid@librarian.ph','1986-11-09','124 Ermita','Manila','Metro Manila',1,'Night',1,0),(9,'Rufus','Aimi','Rambio','rraimi@librarian.ph','1981-11-06','128 Esguerra','Quezon City','Metro Manila',1,'Night',1,0),(10,'Shani','Cepheus','Hamasaki','shcephus@librarian.ph','1981-04-12','95 UN Avenue','Manila','Metro Manila',0,'Day',0,1);
/*!40000 ALTER TABLE `librarian` ENABLE KEYS */;
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
