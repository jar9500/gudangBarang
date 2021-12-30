-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 30, 2021 at 05:45 PM
-- Server version: 10.4.19-MariaDB
-- PHP Version: 7.4.20

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `gudang_barang`
--

-- --------------------------------------------------------

--
-- Table structure for table `barang`
--

CREATE TABLE `barang` (
  `kd_barang` varchar(5) NOT NULL,
  `nama_barang` varchar(20) NOT NULL,
  `stok` int(11) NOT NULL,
  `tgl_exp` date NOT NULL,
  `barang_masuk` date DEFAULT NULL,
  `keterangan` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `barang`
--

INSERT INTO `barang` (`kd_barang`, `nama_barang`, `stok`, `tgl_exp`, `barang_masuk`, `keterangan`) VALUES
('A1', 'Aqua 600 ML', 1, '2050-01-01', '2021-12-29', 'Aqua Botol'),
('A2', 'Aqua 600 ML', 124, '2022-12-01', '2017-01-31', 'Aqua Botol'),
('A3', 'Aqua 300 ML', 299, '2090-08-09', '2021-12-31', 'Aqua Botol'),
('A4', 'Teh Pucuk 300 ML', 500, '2024-09-05', '2021-12-30', ''),
('A5', 'Fanta 300 ML', 200, '2027-02-10', '2021-12-31', ''),
('A6', 'Sprite 300 ML', 390, '2028-09-21', '2021-12-31', ''),
('A7', 'Fanta 1L', 320, '2025-09-08', '2021-12-31', '');

-- --------------------------------------------------------

--
-- Table structure for table `barang_keluar`
--

CREATE TABLE `barang_keluar` (
  `id_barang_keluar` varchar(5) NOT NULL,
  `barang_keluar` date NOT NULL,
  `kd_barang` varchar(5) NOT NULL,
  `nama_barang` varchar(20) NOT NULL,
  `barang_masuk` date NOT NULL,
  `jumlah_barang_keluar` int(11) NOT NULL,
  `tgl_exp` date NOT NULL,
  `keterangan_keluar` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `barang_keluar`
--

INSERT INTO `barang_keluar` (`id_barang_keluar`, `barang_keluar`, `kd_barang`, `nama_barang`, `barang_masuk`, `jumlah_barang_keluar`, `tgl_exp`, `keterangan_keluar`) VALUES
('BK01', '2021-05-05', 'A1', 'Aqua 600 ML', '2021-12-29', 100, '2050-01-01', 'Keluar'),
('BK02', '2022-01-01', 'A1', 'Aqua 600 ML', '2021-12-29', 99, '2050-01-01', 'Keluar'),
('BK03', '2022-01-01', 'A1', 'Aqua 600 ML', '2021-12-29', 99, '2050-01-01', 'Tes'),
('BK04', '2022-12-12', 'A1', 'Aqua 600 ML', '2021-12-29', 99, '2050-01-01', 'Tes kedua'),
('BK05', '2001-12-12', 'A1', 'Aqua 600 ML', '2021-12-29', 998, '2050-01-01', 'Tes Ketiga'),
('BK06', '2022-01-01', 'A3', 'Aqua 300 ML', '2021-12-31', 700, '2090-08-09', 'Keluar');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `username` varchar(50) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`username`, `password`) VALUES
('admin', 'admin'),
('admin123', 'admin123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`kd_barang`);

--
-- Indexes for table `barang_keluar`
--
ALTER TABLE `barang_keluar`
  ADD PRIMARY KEY (`id_barang_keluar`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`username`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
