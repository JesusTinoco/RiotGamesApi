package dto.team;

import java.util.List;

/**
 * @version 2.4
 */
public class Roster {

    private List<TeamMemberInfo> memberList;
    private long ownerId;

    public List<TeamMemberInfo> getMemberList() {
        return memberList;
    }

    public long getOwnerId() {
        return ownerId;
    }
}
