public class SupportTicket {
    private final String issue;
    private final int level; // 1 = low, 2 = medium, 3 = high

    public SupportTicket(String issue, int level) {
        this.issue = issue;
        this.level = level;
    }

    public String getIssue() {
        return issue;
    }

    public int getLevel() {
        return level;
    }
}
