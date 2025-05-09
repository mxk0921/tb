package com.tmall.android.dai.internal.usertrack;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.DAICallback;
import java.util.Map;
import java.util.TreeMap;
import tb.frq;
import tb.kzo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class UserTrackDO {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COLUMN_ARG1 = "arg1";
    public static final String COLUMN_ARG2 = "arg2";
    public static final String COLUMN_ARG3 = "arg3";
    public static final String COLUMN_ARGS = "args";
    public static final String COLUMN_AUCTION_ID = "auction_id";
    public static final String COLUMN_COLUMN1 = "col1";
    public static final String COLUMN_COLUMN2 = "col2";
    public static final String COLUMN_CREATE_TIME = "create_time";
    public static final String COLUMN_EVENT_ID = "event_id";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_OWNER_ID = "owner_id";
    public static final String COLUMN_PAGE_NAME = "page_name";
    public static final String COLUMN_PAGE_STAY_TIME = "page_stay_time";
    private String arg1;
    private String arg2;
    private String arg3;
    private Map<String, String> args;
    private long auctionId;
    private DAICallback callback;
    private long createTime;
    private int eventId;
    private long id;
    private String ownerId;
    private String pageName;
    public int pageNameSizeForUtext = 0;
    private long pageStayTime;
    private String sessionId;

    static {
        t2o.a(1034944667);
    }

    public String getArg1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("715cfa88", new Object[]{this});
        }
        return this.arg1;
    }

    public String getArg2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f7e2b527", new Object[]{this});
        }
        return this.arg2;
    }

    public String getArg3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e686fc6", new Object[]{this});
        }
        return this.arg3;
    }

    public Map<String, String> getArgs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("46c4490f", new Object[]{this});
        }
        return this.args;
    }

    public long getAuctionId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("feb81483", new Object[]{this})).longValue();
        }
        return this.auctionId;
    }

    public long getCreateTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9b0beda", new Object[]{this})).longValue();
        }
        return this.createTime;
    }

    public int getEventId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce275619", new Object[]{this})).intValue();
        }
        return this.eventId;
    }

    public long getId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1ddaaf0c", new Object[]{this})).longValue();
        }
        return this.id;
    }

    public String getOwnerId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1fa6301", new Object[]{this});
        }
        return this.ownerId;
    }

    public String getPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this});
        }
        return this.pageName;
    }

    public int getPageNameSizeForUtext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d79fd9c4", new Object[]{this})).intValue();
        }
        return this.pageNameSizeForUtext;
    }

    public long getPageStayTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("801669e6", new Object[]{this})).longValue();
        }
        return this.pageStayTime;
    }

    public String getSesionId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("47b4a501", new Object[]{this});
        }
        return this.sessionId;
    }

    public String getSummary() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9114d189", new Object[]{this});
        }
        return "pageName='" + this.pageName + "', eventId=" + this.eventId + ", arg1='" + this.arg1 + '\'';
    }

    public void setArg1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ec196ee", new Object[]{this, str});
        } else {
            this.arg1 = str;
        }
    }

    public void setArg2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98f3302f", new Object[]{this, str});
        } else {
            this.arg2 = str;
        }
    }

    public void setArg3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e324c970", new Object[]{this, str});
        } else {
            this.arg3 = str;
        }
    }

    public void setArgs(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fb6655f", new Object[]{this, map});
        } else {
            this.args = map;
        }
    }

    public void setAuctionId(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0415c21", new Object[]{this, new Long(j)});
        } else {
            this.auctionId = j;
        }
    }

    public void setCreateTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c33e2e12", new Object[]{this, new Long(j)});
        } else {
            this.createTime = j;
        }
    }

    public void setEventId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d0cdca9", new Object[]{this, new Integer(i)});
        } else {
            this.eventId = i;
        }
    }

    public void setId(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10ecf820", new Object[]{this, new Long(j)});
        } else {
            this.id = j;
        }
    }

    public void setOwnerId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("545585fd", new Object[]{this, str});
        } else {
            this.ownerId = str;
        }
    }

    public void setPageName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a5935cd", new Object[]{this, str});
        } else {
            this.pageName = str;
        }
    }

    public void setPageNameSizeForUtext(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66282bc6", new Object[]{this, new Integer(i)});
        } else {
            this.pageNameSizeForUtext = i;
        }
    }

    public void setPageStayTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e4d5786", new Object[]{this, new Long(j)});
        } else {
            this.pageStayTime = j;
        }
    }

    public void setSessionId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("648aa560", new Object[]{this, str});
        } else {
            this.sessionId = str;
        }
    }

    public Map<String, String> toHashMapValues() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1fca34b1", new Object[]{this});
        }
        TreeMap treeMap = new TreeMap();
        treeMap.put("page_name", this.pageName);
        treeMap.put(COLUMN_EVENT_ID, "" + this.eventId);
        treeMap.put(COLUMN_AUCTION_ID, "" + this.auctionId);
        treeMap.put(COLUMN_PAGE_STAY_TIME, "" + this.pageStayTime);
        treeMap.put("arg1", this.arg1);
        treeMap.put("arg2", this.arg2);
        treeMap.put("arg3", this.arg3);
        treeMap.put("args", frq.a(this.args, "=", ",", kzo.c().g()));
        if (TextUtils.isEmpty(this.ownerId)) {
            treeMap.put("owner_id", "0");
        } else {
            treeMap.put("owner_id", this.ownerId);
        }
        if (this.createTime > 0) {
            treeMap.put("create_time", "" + this.createTime);
        }
        treeMap.put(COLUMN_COLUMN1, this.sessionId);
        return treeMap;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "UserTrackDO{id=" + this.id + ", pageName='" + this.pageName + "', eventId=" + this.eventId + ", arg1='" + this.arg1 + "', arg2='" + this.arg2 + "', arg3='" + this.arg3 + "', args=" + this.args + ", auctionId=" + this.auctionId + ", pageStayTime=" + this.pageStayTime + ", ownerId='" + this.ownerId + "', createTime=" + this.createTime + ", sessionId='" + this.sessionId + "'}";
    }
}
