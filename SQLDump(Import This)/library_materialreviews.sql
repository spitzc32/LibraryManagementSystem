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
-- Table structure for table `materialreviews`
--

DROP TABLE IF EXISTS `materialreviews`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `materialreviews` (
  `id` int NOT NULL AUTO_INCREMENT,
  `MaterialId` int DEFAULT NULL,
  `StudentId` int DEFAULT NULL,
  `ProfessorId` int DEFAULT NULL,
  `comment` varchar(45) DEFAULT NULL,
  `timestamp` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `MRmaterialId_idx` (`MaterialId`),
  CONSTRAINT `MRmaterialId` FOREIGN KEY (`MaterialId`) REFERENCES `materials` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `materialreviews`
--

LOCK TABLES `materialreviews` WRITE;
/*!40000 ALTER TABLE `materialreviews` DISABLE KEYS */;
INSERT INTO `materialreviews` VALUES (1,1,1,1,'Emotional yet embracing','2020-12-11 16:00:00'),(2,10,5,2,'Too technical yet understandable','2020-11-24 16:00:00'),(3,8,4,4,'Trojan in a nutshell','2021-11-10 16:00:00'),(4,7,8,5,'Im persueded','2021-06-10 16:00:00'),(5,7,4,6,'Too confusing ','2020-05-10 16:00:00'),(6,3,9,8,'Im at one yet the other','2020-01-10 16:00:00'),(7,5,6,8,'Im infected','2021-11-09 16:00:00'),(8,9,7,9,'Nice work','2021-05-09 16:00:00'),(9,1,10,10,'Free stuff, nice.','2020-09-09 16:00:00'),(10,4,3,3,'Adventurous but deep','2021-08-08 16:00:00');
/*!40000 ALTER TABLE `materialreviews` ENABLE KEYS */;
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
