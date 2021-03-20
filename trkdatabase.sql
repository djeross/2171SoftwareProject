-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 20, 2021 at 09:34 PM
-- Server version: 10.4.16-MariaDB
-- PHP Version: 7.4.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `trkdatabase`
--
CREATE DATABASE IF NOT EXISTS `trkdatabase` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_bin;
USE `trkdatabase`;

-- --------------------------------------------------------

--
-- Table structure for table `contains`
--

CREATE TABLE `contains` (
  `EventID` varchar(20) COLLATE utf8mb4_bin NOT NULL,
  `EquipmentID` varchar(8) COLLATE utf8mb4_bin NOT NULL,
  `Quantity` smallint(5) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

--
-- Dumping data for table `contains`
--

INSERT INTO `contains` (`EventID`, `EquipmentID`, `Quantity`) VALUES
('lala', 'Cha#tcn', 50),
('lala', 'tabl#123', 50),
('lala', 'tent#556', 50);

-- --------------------------------------------------------

--
-- Table structure for table `resource`
--

CREATE TABLE `resource` (
  `EquipmentID` varchar(8) COLLATE utf8mb4_bin NOT NULL,
  `EquipmentName` varchar(100) COLLATE utf8mb4_bin NOT NULL,
  `Total_Quantity` int(7) UNSIGNED NOT NULL,
  `Remaining_Quantity` int(7) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

--
-- Dumping data for table `resource`
--

INSERT INTO `resource` (`EquipmentID`, `EquipmentName`, `Total_Quantity`, `Remaining_Quantity`) VALUES
('Cha#tcn', 'Chair', 1500, 450),
('goca#134', 'GoCart', 10, 10),
('tabl#123', 'Table', 5000, 4350),
('tent#556', 'Tent', 3000, 400);

-- --------------------------------------------------------

--
-- Table structure for table `schedule`
--

CREATE TABLE `schedule` (
  `EventID` varchar(20) COLLATE utf8mb4_bin NOT NULL,
  `Location` varchar(100) COLLATE utf8mb4_bin NOT NULL,
  `Date` date NOT NULL,
  `Start_Time` time NOT NULL,
  `End_Time` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

--
-- Dumping data for table `schedule`
--

INSERT INTO `schedule` (`EventID`, `Location`, `Date`, `Start_Time`, `End_Time`) VALUES
('go', 'afdshh', '2345-11-23', '12:43:00', '14:24:00'),
('lala', 'sweet', '2021-03-30', '12:00:00', '14:20:00'),
('my Party', 'uwi', '2022-11-12', '15:00:00', '21:00:00'),
('my house', 'your house', '2021-11-23', '12:00:00', '00:00:00'),
('mybed', 'your bed', '2025-11-23', '12:00:00', '10:00:00'),
('party', 'kingston', '2024-12-26', '12:56:00', '14:44:00'),
('world', 'potatohill', '2023-11-01', '233:33:00', '24:00:00');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `First_Name` varchar(50) COLLATE utf8mb4_bin NOT NULL,
  `Last_Name` varchar(50) COLLATE utf8mb4_bin NOT NULL,
  `Username` varchar(100) COLLATE utf8mb4_bin NOT NULL,
  `Password` varchar(128) COLLATE utf8mb4_bin NOT NULL,
  `Salt` varchar(100) COLLATE utf8mb4_bin NOT NULL,
  `Position` varchar(10) COLLATE utf8mb4_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`First_Name`, `Last_Name`, `Username`, `Password`, `Salt`, `Position`) VALUES
('Rodje', 'Ross', 'djeross', '2121daa53d0cba23b85d48b3d0556ceb36ad8488da7e3d0def7020b2e62610e461863629784cb2a472c155c1a45aad1dbc9cdf79991aa1f5eaad4c888f0187ae', '9f397a84d30b4f48b8b447d120ff94d443f17e19', 'developer'),
('Maria', 'Mckenzie', 'marmck', 'e5b62c7fef1a865b62b4d75271c428017805c0810f585605ab850e1c178b751cac1bb847323fb1047fe353ede0bd114dad3705f98bea8ab1d4e1702ef5c67d5f', '6eeb00ff819c800f389e07b7fe4f80fdbb3117f6', 'developer');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `contains`
--
ALTER TABLE `contains`
  ADD PRIMARY KEY (`EquipmentID`,`EventID`);

--
-- Indexes for table `resource`
--
ALTER TABLE `resource`
  ADD PRIMARY KEY (`EquipmentID`);

--
-- Indexes for table `schedule`
--
ALTER TABLE `schedule`
  ADD PRIMARY KEY (`EventID`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`Username`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
