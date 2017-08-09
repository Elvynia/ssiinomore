LOCK TABLES `utilisateur`, `role` WRITE;
/*!40000 ALTER TABLE `entreprise` DISABLE KEYS */;
INSERT INTO role VALUES (1, 'ADMIN');
INSERT INTO utilisateur VALUES (null, '192.168.0.1', 'Masson', 'Jérémy', NOW(), 'jmasson', '$2a$10$LilZuLjPLnWb20/vgbcwOuzXDv9REDu5WBxFfw0QnxKICInxlfERW', 1, 1);
/*!40000 ALTER TABLE `entreprise` ENABLE KEYS */;
UNLOCK TABLES;