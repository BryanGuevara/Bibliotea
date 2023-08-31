-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost:3307
-- Tiempo de generación: 31-08-2023 a las 23:41:14
-- Versión del servidor: 10.4.25-MariaDB
-- Versión de PHP: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `libreriaerrante`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `frase`
--

CREATE TABLE `frase` (
  `ID` int(11) NOT NULL,
  `frases` varchar(100) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `frase`
--

INSERT INTO `frase` (`ID`, `frases`) VALUES
(1, 'Saqueo las bibliotecas públicas y las encuentro llenas de tesoros hundidos'),
(2, 'Siempre imaginé que el Paraíso sería algún tipo de biblioteca'),
(3, 'Si cerca de la biblioteca tenéis un jardín ya no os faltará de nada'),
(4, 'La biblioteca destinada a la educación universal, es más poderosa que nuestros ejércitos'),
(5, 'El destino de muchos hombres dependió de tener o no una biblioteca en su hogar paterno'),
(6, 'Mi patria es mi hijo y mi biblioteca'),
(7, 'En caso de duda, ve a la biblioteca.'),
(8, '¿Qué tenemos sin bibliotecas? No tenemos pasado y no tenemos futuro'),
(9, 'Una biblioteca no es un lujo, sino una de las necesidades de la vida');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `libros`
--

CREATE TABLE `libros` (
  `ID` int(11) NOT NULL,
  `Nombre` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `Creador` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `libros`
--

INSERT INTO `libros` (`ID`, `Nombre`, `Creador`) VALUES
(1, 'Don Quijote de la Mancha', 'Miguel de Cervantes'),
(2, 'Biblia', ' aprox. 40 hombres'),
(3, 'Almas Errantes', 'Guillermo Mimica'),
(4, 'Almuric', 'Robert E. Howard'),
(5, 'Amadís de Gaula', 'Garci Rodríguez de Montalvo '),
(6, 'Amado y Aborresido', 'Pedro Calderón de la Barca'),
(7, 'Amalia', 'José Mármol'),
(8, 'Amar Después de la Muerte', 'Pedro Calderón de la Barca'),
(9, 'Amaury', 'Amaury Gutiérrez'),
(10, 'Amina la Vengadora', 'Emilio Salgari'),
(11, 'Aire Frio', 'Howard Phillips Lovecraft'),
(12, 'Aita Tettauen', 'Benito Pérez Galdós'),
(13, 'Libro Ajedrez y su Enzeñanza', 'Multiplea Autores'),
(14, 'La Bola de Cristal', 'Hermanos Grimm'),
(15, 'La Bestia en la Cueva', 'H.P. Lovecraft'),
(16, 'La Asamblea de las Mujeres', 'Aristofanes'),
(17, 'La Amada Inmovil', 'Amado Nervo'),
(18, 'La Alondra Cantarina y Saltarina', 'Hermanos Grimm'),
(19, 'La Aldea Perdida', 'Armando Palacio Valdes'),
(20, 'La Agonia del Cristiano', 'Unamuno Miguel'),
(21, 'La Abeja Reina', 'Hermanos Grimm'),
(22, 'La Abeja Haragana', 'Horacio Quiroga'),
(23, 'La Abadia de Northanger', 'Jane Austen'),
(24, 'Miau', 'Benito Perez Galdos'),
(25, 'Mas alla del Principio del Placer', 'Sigmund_Freud'),
(26, 'Mas alla del Bien y del Mal', 'Friedrich Nietzsche'),
(27, 'Maravillosas Aventuras de Antifer', 'Verne Julio'),
(28, 'Manuscrito Hallado en Una Botella', 'Allan Poe Edgar'),
(29, 'Manuscrito de Economia y Filosofia', 'Marx Karl'),
(30, 'Mansfield Park', 'Jane Austen'),
(31, 'Manifiesto Comunista', 'Marx Karl'),
(32, 'Maese Perez el Organista', 'Gustavo Adolfo Becquer'),
(33, 'Madame Bovary', 'Gustave Flaubert'),
(34, 'Macbeth', 'Shakespeare William');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `ID` int(11) NOT NULL,
  `Username` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `Password` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `Nombre` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `Correo` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`ID`, `Username`, `Password`, `Nombre`, `Correo`) VALUES
(1, 'Bryan', '12345', 'Bryan Guevara', 'bryan@libros.com'),
(2, 'Carlos', '123', 'Carlos Raul', 'carlos@libros.com');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `frase`
--
ALTER TABLE `frase`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `libros`
--
ALTER TABLE `libros`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `frase`
--
ALTER TABLE `frase`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `libros`
--
ALTER TABLE `libros`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=35;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
