CREATE DATABASE  IF NOT EXISTS `library` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `library`;
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
-- Table structure for table `associate_studentmaterialtracker`
--

DROP TABLE IF EXISTS `associate_studentmaterialtracker`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `associate_studentmaterialtracker` (
  `id` int NOT NULL,
  `studentId` int DEFAULT '0',
  `subjectId` int DEFAULT '0',
  `libririanId` int DEFAULT '0',
  `MaterialId` int DEFAULT '0',
  `dateBorrowed` date DEFAULT NULL,
  `dateReturned` date DEFAULT NULL,
  `isDue` tinyint DEFAULT NULL,
  `isReturned` tinyint DEFAULT NULL,
  `assignedDateReturn` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_idx` (`studentId`),
  KEY `id_idx1` (`subjectId`),
  KEY `id_idx2` (`libririanId`),
  KEY `id_idx3` (`MaterialId`),
  CONSTRAINT `librarianid` FOREIGN KEY (`libririanId`) REFERENCES `libririan` (`id`),
  CONSTRAINT `materialid` FOREIGN KEY (`MaterialId`) REFERENCES `materials` (`id`),
  CONSTRAINT `studentid` FOREIGN KEY (`studentId`) REFERENCES `student` (`id`),
  CONSTRAINT `subjectid` FOREIGN KEY (`subjectId`) REFERENCES `subject` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `associate_studentmaterialtracker`
--

LOCK TABLES `associate_studentmaterialtracker` WRITE;
/*!40000 ALTER TABLE `associate_studentmaterialtracker` DISABLE KEYS */;
/*!40000 ALTER TABLE `associate_studentmaterialtracker` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-11-23 17:19:48
