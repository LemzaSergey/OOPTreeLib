package lib.TreeBidiMap.Interface;

public enum DataElement {
    KEY("key"), VALUE("value");

    private final String description;

    /**
     * Create a new TreeBidiMap.DataElement.
     *
     * @param description  the description for the element
     */
    DataElement(final String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
