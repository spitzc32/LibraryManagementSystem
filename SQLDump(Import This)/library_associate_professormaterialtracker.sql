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
-- Table structure for table `associate_professormaterialtracker`
--

DROP TABLE IF EXISTS `associate_professormaterialtracker`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `associate_professormaterialtracker` (
  `id` int NOT NULL AUTO_INCREMENT,
  `professorId` int DEFAULT NULL,
  `psubjectId` int DEFAULT NULL,
  `plibririanId` int DEFAULT NULL,
  `pMaterialId` int DEFAULT NULL,
  `dateBorrowed` date DEFAULT NULL,
  `dateReturned` date DEFAULT NULL,
  `isDue` tinyint DEFAULT NULL,
  `isReturned` tinyint DEFAULT NULL,
  `assignedDateReturn` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `APMmaterialId_idx` (`pMaterialId`),
  KEY `APMProfessorId_idx` (`professorId`),
  KEY `APMSubjectId_idx` (`psubjectId`),
  KEY `APMlibrarianId_idx` (`plibririanId`),
  CONSTRAINT `APMlibrarianId` FOREIGN KEY (`plibririanId`) REFERENCES `libririan` (`id`),
  CONSTRAINT `APMmaterialId` FOREIGN KEY (`pMaterialId`) REFERENCES `materials` (`id`),
  CONSTRAINT `APMProfessorId` FOREIGN KEY (`professorId`) REFERENCES `professor` (`id`),
  CONSTRAINT `APMSubjectId` FOREIGN KEY (`psubjectId`) REFERENCES `subject` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `associate_professormaterialtracker`
--

LOCK TABLES `associate_professormaterialtracker` WRITE;
/*!40000 ALTER TABLE `associate_professormaterialtracker` DISABLE KEYS */;
/*!40000 ALTER TABLE `associate_professormaterialtracker` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-11-25 14:09:41
