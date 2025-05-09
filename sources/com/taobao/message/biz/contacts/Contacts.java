package com.taobao.message.biz.contacts;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class Contacts implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = 1;
    private int bizType;
    private String displayName;
    private String entityType;
    private String groupId;
    private String headUrl;
    private long lastContactTime;
    private String userId;
    private String userType;

    static {
        t2o.a(529530888);
    }

    public int getBizType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8f974bb1", new Object[]{this})).intValue();
        }
        return this.bizType;
    }

    public String getDisplayName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f9684a22", new Object[]{this});
        }
        return this.displayName;
    }

    public String getEntityType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f36bd726", new Object[]{this});
        }
        return this.entityType;
    }

    public String getGroupId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("99b7d9b5", new Object[]{this});
        }
        return this.groupId;
    }

    public String getHeadUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4248ad60", new Object[]{this});
        }
        return this.headUrl;
    }

    public long getLastContactTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1028d45c", new Object[]{this})).longValue();
        }
        return this.lastContactTime;
    }

    public String getUserId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this});
        }
        return this.userId;
    }

    public String getUserType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6b04eebe", new Object[]{this});
        }
        return this.userType;
    }

    public void setBizType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("999b9a11", new Object[]{this, new Integer(i)});
        } else {
            this.bizType = i;
        }
    }

    public void setDisplayName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b5828fc", new Object[]{this, str});
        } else {
            this.displayName = str;
        }
    }

    public void setEntityType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0f89510", new Object[]{this, str});
        } else {
            this.entityType = str;
        }
    }

    public void setGroupId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a446e5c9", new Object[]{this, str});
        } else {
            this.groupId = str;
        }
    }

    public void setHeadUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd0877e", new Object[]{this, str});
        } else {
            this.headUrl = str;
        }
    }

    public void setLastContactTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f455e68", new Object[]{this, new Long(j)});
        } else {
            this.lastContactTime = j;
        }
    }

    public void setUserId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ca419d9", new Object[]{this, str});
        } else {
            this.userId = str;
        }
    }

    public void setUserType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80764378", new Object[]{this, str});
        } else {
            this.userType = str;
        }
    }
}
