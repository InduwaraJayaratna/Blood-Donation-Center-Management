-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 28, 2023 at 06:11 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `life`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id` int(11) NOT NULL,
  `username` varchar(100) NOT NULL,
  `pass` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `username`, `pass`) VALUES
(1, 'jack', '123');

-- --------------------------------------------------------

--
-- Table structure for table `appointment`
--

CREATE TABLE `appointment` (
  `a_id` int(11) NOT NULL,
  `user_id` int(11) DEFAULT NULL,
  `center` varchar(20) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `blood_type` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `appointment`
--

INSERT INTO `appointment` (`a_id`, `user_id`, `center`, `date`, `blood_type`) VALUES
(3, 5, 'Kandana', '2024-01-05', 'O-'),
(4, 6, 'Panadura', '2024-01-02', 'O+'),
(5, 2, 'Kadawatha', '2024-01-01', 'B+'),
(6, 2, 'Kadawatha', '2024-01-01', 'B+'),
(7, 7, 'Panadura', '2024-01-01', 'O+'),
(8, 6, 'Panadura', '2024-01-02', 'O+'),
(9, 1, 'Panadura', '2024-01-02', 'O+'),
(10, 8, 'Kandana', '2024-01-05', 'B+'),
(12, 9, 'Gampaha', '2024-01-02', 'B+'),
(13, 1, 'Panadura', '2024-12-03', 'O+'),
(14, 1, 'Panadura', '2024-01-01', 'O+');

-- --------------------------------------------------------

--
-- Table structure for table `donation`
--

CREATE TABLE `donation` (
  `donate_id` int(11) NOT NULL,
  `a_id` int(10) DEFAULT NULL,
  `user_id` int(10) DEFAULT NULL,
  `center` varchar(20) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `blood_type` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `donation`
--

INSERT INTO `donation` (`donate_id`, `a_id`, `user_id`, `center`, `date`, `blood_type`) VALUES
(1, 6, 2, 'Kadawatha', '2024-01-01', 'B+'),
(3, 9, 1, 'Panadura', '2024-01-02', 'O+'),
(4, 9, 1, 'Panadura', '2024-01-02', 'O+'),
(5, 12, 9, 'Gampaha', '2024-01-02', 'B+'),
(6, 4, 6, 'Panadura', '2024-01-02', 'O+');

-- --------------------------------------------------------

--
-- Table structure for table `feedbacks`
--

CREATE TABLE `feedbacks` (
  `feedback_id` int(11) NOT NULL,
  `user_id` int(10) DEFAULT NULL,
  `name` varchar(10) DEFAULT NULL,
  `feedbacks` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `feedbacks`
--

INSERT INTO `feedbacks` (`feedback_id`, `user_id`, `name`, `feedbacks`) VALUES
(1, 2, 'chamo', 'Feedback is 1'),
(6, 7, 'Swairi ', 'feedback from swairi'),
(7, 1, 'induwara', 'feedback from induwara'),
(11, 2, 'chamo', 'feedback '),
(13, 9, 'kavindu', 'kavindu\'s feedback');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `user_id` int(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `name` varchar(100) NOT NULL,
  `gender` varchar(100) NOT NULL,
  `dob` date NOT NULL,
  `blood_group` varchar(100) NOT NULL,
  `pass` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`user_id`, `email`, `name`, `gender`, `dob`, `blood_group`, `pass`) VALUES
(1, 'i@j.com', 'induwara', 'Male', '2002-05-06', 'O+', '123'),
(2, 'chamo@gmail.com', 'chamo', 'Female', '2002-10-05', 'B+', '123'),
(3, 'kavindu@j.com', 'Niranga', 'Male', '2005-07-29', 'B+', '123'),
(4, 'g@g.om', 'topG', 'Male', '2002-05-06', 'O+', '123'),
(5, 'j@g.com', 'jayz', 'Male', '1968-08-08', 'O-', '123'),
(6, 'capy@gmail.com', 'Capybara', 'Male', '2002-05-06', 'O+', '123'),
(7, 'swairi@j.com', 'Swairi', 'Female', '2000-02-11', 'O+', '123'),
(8, 'himaya@gmail.com', 'himaya', 'Female', '2004-12-12', 'B+', '123'),
(9, 'kavindu@gmail.com', 'kavindu', 'Male', '2001-04-14', 'B+', '123'),
(10, 'j@i.com', 'jaya', 'Male', '2002-01-03', 'A+', '123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `appointment`
--
ALTER TABLE `appointment`
  ADD PRIMARY KEY (`a_id`),
  ADD KEY `user_id` (`user_id`);

--
-- Indexes for table `donation`
--
ALTER TABLE `donation`
  ADD PRIMARY KEY (`donate_id`),
  ADD KEY `a_id` (`a_id`),
  ADD KEY `user_id` (`user_id`);

--
-- Indexes for table `feedbacks`
--
ALTER TABLE `feedbacks`
  ADD PRIMARY KEY (`feedback_id`),
  ADD KEY `user_id` (`user_id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`user_id`),
  ADD UNIQUE KEY `email` (`email`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `appointment`
--
ALTER TABLE `appointment`
  MODIFY `a_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `donation`
--
ALTER TABLE `donation`
  MODIFY `donate_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `feedbacks`
--
ALTER TABLE `feedbacks`
  MODIFY `feedback_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `user_id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `appointment`
--
ALTER TABLE `appointment`
  ADD CONSTRAINT `appointment_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`);

--
-- Constraints for table `donation`
--
ALTER TABLE `donation`
  ADD CONSTRAINT `donation_ibfk_1` FOREIGN KEY (`a_id`) REFERENCES `appointment` (`a_id`),
  ADD CONSTRAINT `donation_ibfk_2` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`);

--
-- Constraints for table `feedbacks`
--
ALTER TABLE `feedbacks`
  ADD CONSTRAINT `feedbacks_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
