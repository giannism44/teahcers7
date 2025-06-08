# 📚 Εφαρμογή Διαχείρισης Καθηγητών (Spring Boot)

Αυτή η εφαρμογή αναπτύχθηκε στο πλαίσιο του μαθήματος **Java Spring Boot** του Coding Factory (ΟΠΑ) και **δεν αποτελεί προσωπικό project**. Είναι μέρος εκπαιδευτικής δραστηριότητας.

## 🔧 Τεχνολογίες που χρησιμοποιήθηκαν

- Java 
- Spring Boot 3
- Spring Security (login, register)
- Thymeleaf για το frontend (HTML templating)
- Spring Data JPA με Hibernate
- H2 / MySQL για τη βάση δεδομένων
- Lombok
- Gradle

## 🔐 Λειτουργίες αυθεντικοποίησης
- Δημιουργία λογαριασμού χρήστη (register)
- Σύνδεση χρήστη (login)
- Ρόλοι χρηστών με έλεγχο πρόσβασης (π.χ. `TEACHER`)

## 👨‍🏫 Διαχείριση Καθηγητών
- Προσθήκη νέου καθηγητή
- Προβολή λίστας καθηγητών με σελιδοποίηση
- Εμφάνιση στοιχείων καθηγητή
- (Η εφαρμογή μπορεί να επεκταθεί και με επεξεργασία ή διαγραφή)

## 📂 Δομή project

- `model`: Οντότητες (User, Teacher κ.λπ.)
- `dto`: Data Transfer Objects
- `repository`: Repositories με χρήση JPA
- `service`: Business λογική
- `controller`: Web controllers για κάθε λειτουργία
- `resources/templates`: HTML views (με Thymeleaf)
- `resources/static`: CSS, εικόνες

## ⚠️ Σημείωση
Η εφαρμογή αναπτύχθηκε **καθαρά για εκπαιδευτικούς σκοπούς**. Δεν αποτελεί τελικό προϊόν ούτε προσωπική εργασία εκτός μαθήματος.

