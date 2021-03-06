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
-- Table structure for table `associate_materialsubject`
--

DROP TABLE IF EXISTS `associate_materialsubject`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `associate_materialsubject` (
  `id` int NOT NULL AUTO_INCREMENT,
  `MaterialId` int DEFAULT NULL,
  `SubjectId` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `materialId_idx` (`MaterialId`),
  KEY `subjectId_idx` (`SubjectId`),
  KEY `AMSmaterialId_idx` (`MaterialId`),
  KEY `AMSsubjectId_idx` (`SubjectId`),
  CONSTRAINT `AMSmaterialId` FOREIGN KEY (`MaterialId`) REFERENCES `materials` (`id`),
  CONSTRAINT `AMSsubjectId` FOREIGN KEY (`SubjectId`) REFERENCES `subject` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `associate_materialsubject`
--

LOCK TABLES `associate_materialsubject` WRITE;
/*!40000 ALTER TABLE `associate_materialsubject` DISABLE KEYS */;
INSERT INTO `associate_materialsubject` VALUES (1,1,7),(2,2,6),(3,3,8),(4,4,10),(5,5,1),(6,6,1),(7,7,4),(8,8,5),(9,9,2),(10,10,3);
/*!40000 ALTER TABLE `associate_materialsubject` ENABLE KEYS */;
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
