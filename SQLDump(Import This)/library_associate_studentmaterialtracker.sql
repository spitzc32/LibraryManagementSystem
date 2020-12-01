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
  `id` int NOT NULL AUTO_INCREMENT,
  `studentId` int DEFAULT NULL,
  `subjectId` int DEFAULT NULL,
  `libririanId` int DEFAULT NULL,
  `MaterialId` int DEFAULT NULL,
  `dateBorrowed` date DEFAULT NULL,
  `dateReturned` date DEFAULT NULL,
  `isDue` tinyint DEFAULT NULL,
  `isReturned` tinyint DEFAULT NULL,
  `assignedDateReturn` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `ASMsubjectId_idx` (`subjectId`),
  KEY `ASMstudentId_idx` (`studentId`),
  KEY `ASMlibrarianId_idx` (`libririanId`),
  KEY `ASMMaterialId_idx` (`MaterialId`),
  CONSTRAINT `ASMlibrarianId` FOREIGN KEY (`libririanId`) REFERENCES `librarian` (`id`),
  CONSTRAINT `ASMMaterialId` FOREIGN KEY (`MaterialId`) REFERENCES `materials` (`id`),
  CONSTRAINT `ASMstudentId` FOREIGN KEY (`studentId`) REFERENCES `student` (`id`),
  CONSTRAINT `ASMsubjectId` FOREIGN KEY (`subjectId`) REFERENCES `subject` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `associate_studentmaterialtracker`
--

LOCK TABLES `associate_studentmaterialtracker` WRITE;
/*!40000 ALTER TABLE `associate_studentmaterialtracker` DISABLE KEYS */;
INSERT INTO `associate_studentmaterialtracker` VALUES (1,1,1,1,1,'2020-12-12','2020-12-15',0,1,'2020-12-19'),(2,5,3,2,10,'2020-11-25','2020-11-25',0,1,'2020-12-01'),(3,4,4,3,8,'2020-11-23','2020-11-25',0,1,'2020-12-01'),(4,8,1,4,6,'2020-11-18','2021-11-24',0,1,'2020-11-25'),(5,4,1,6,6,'2020-11-05','2020-11-05',0,1,'2020-11-12'),(6,9,8,7,3,'2020-11-01','2020-11-13',1,0,'2020-11-09'),(7,6,1,8,5,'2020-10-23','2021-11-11',1,0,'2022-10-30'),(8,6,2,9,9,'2020-10-17','2022-10-19',0,1,'2021-10-24'),(9,10,7,7,1,'2020-10-09','2020-10-10',0,1,'2021-10-16'),(10,3,10,10,4,'2020-09-20','2021-09-20',0,1,'2022-09-27');
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

-- Dump completed on 2020-12-01 11:11:18
