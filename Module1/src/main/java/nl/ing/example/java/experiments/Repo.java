package nl.ing.example.java.experiments;

record Repo(Branch branch) {

    record Branch (Author author) { }

    record Author(String firstName, String lastName, String email) { }
}
