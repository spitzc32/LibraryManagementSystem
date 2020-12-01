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
-- Table structure for table `materials`
--

DROP TABLE IF EXISTS `materials`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `materials` (
  `id` int NOT NULL AUTO_INCREMENT,
  `Title` varchar(55) DEFAULT NULL,
  `Description` varchar(60) DEFAULT NULL,
  `Edition` varchar(25) DEFAULT NULL,
  `YearOfPublication` date DEFAULT NULL,
  `DatePublished` date DEFAULT NULL,
  `TypeOfMaterial` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `materials`
--

LOCK TABLES `materials` WRITE;
/*!40000 ALTER TABLE `materials` DISABLE KEYS */;
INSERT INTO `materials` VALUES (1,'A chair for my mother','in memory of authors mother','25th anniversary ed.','1982-01-01','2007-01-23','Book'),(2,'beautiful oblivion','adult romance','kindle edition','2014-01-01','2014-07-01','Book'),(3,'The goblin Emperor','fantasy of manners','1st edition','2014-01-01','2014-04-01','Book'),(4,'The never war','fantasy novel','1st edition','2003-01-01','2003-05-01','Book'),(5,'Computer-based technology and student engagement','affinity of computer in life','1st edition','2017-01-01','2017-10-02','ResearchPaper'),(6,'Using deep learning to solve computer security','computer security challenge','1st edition','2003-01-01','2003-02-23','ResearchPaper'),(7,'Laptop Computer vs Desktop Computers','Laptop Computer vs Desktop Computers','1st edition','2004-01-01','2004-04-29','Thesis'),(8,'Virus and Malicious Codes','Identifying malicious','1st edition','2009-01-01','2009-08-30','Thesis'),(9,'Why a Slack acquisition make sense for Salesforce','rumour deal','n/a','2020-01-01','2020-11-26','Newspaper'),(10,'Microsoft add Teams integrations for video meetings','feature release','n/a','2020-01-01','2020-11-17','Newspaper');
/*!40000 ALTER TABLE `materials` ENABLE KEYS */;
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
