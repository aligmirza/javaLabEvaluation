package javaLabEvaluation;

public class Library {
    private LibraryItem[] libraryItems;

    public Library() {
        libraryItems = new LibraryItem[100];
    }
    public Library(LibraryItem[] libraryItems) {
        this.libraryItems = libraryItems;
    }

    public LibraryItem[] getLibraryItems() {
        return libraryItems;
    }

    public void setLibraryItems(LibraryItem[] libraryItems) {
        this.libraryItems = libraryItems;
    }

    public void addItem(Book book) {
        for (int i = 0; i < libraryItems.length; i++) {
            if (libraryItems[i] == null) {
                libraryItems[i] = book;
                return;
            }
        }
    }

    public void addItem(Magazine magazine){
        for (int i = 0; i < libraryItems.length; i++) {
            if (libraryItems[i] == null) {
                libraryItems[i] = magazine;
                return;
            }
        }
    }

    public void displayAvailableItems() {
        for (LibraryItem item : libraryItems) {
            if (item != null && !item.isBorrowed()) {
                System.out.println(item.getTitle());
            }
        }
    }

    public void borrowItem(LibraryItem item) {
        for (int i = 0; i < libraryItems.length; i++) {
            if (libraryItems[i] != null && libraryItems[i].equals(item) && !libraryItems[i].isBorrowed()) {
                libraryItems[i].setBorrowed(true);
                return;
            }
        }
    }

    public void displayBorrowedItems() {
        for (LibraryItem item : libraryItems) {
            if (item != null && item.isBorrowed()) {
                System.out.println(item.getTitle());
            }
        }
    }

    public void returnItem(LibraryItem item) {
        for (int i = 0; i < libraryItems.length; i++) {
            if (libraryItems[i] != null && libraryItems[i].equals(item) && libraryItems[i].isBorrowed()) {
                libraryItems[i].setBorrowed(false);
                return;
            }
        }
    }





}
