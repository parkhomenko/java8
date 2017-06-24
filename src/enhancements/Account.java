package enhancements;

interface Account {
    public default String getId() {
        return "0000";
    }
}
