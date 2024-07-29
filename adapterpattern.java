interface NewSystem {
    void process();
}

class LegacySystem {
    void oldProcess() {
        System.out.println("Processing in the legacy system.");
    }
}

class LegacySystemAdapter implements NewSystem {
    private LegacySystem legacySystem;

    public LegacySystemAdapter(LegacySystem legacySystem) {
        this.legacySystem = legacySystem;
    }

    @Override
    public void process() {
        legacySystem.oldProcess();
    }
}
