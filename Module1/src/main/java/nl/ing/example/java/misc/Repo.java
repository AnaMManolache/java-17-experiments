package nl.ing.example.java.misc;

record Repo(Branch branch) {

    record Branch (Author author) { }

    record Author(String firstName, String lastName, String email) { }
}
