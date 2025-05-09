package com.taobao.share.core.contacts.mtop.response;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class RecentContactsModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int bizType;
    private String ccode;
    private String contactType;
    private String groupId;
    private long lastContactTime;
    private String userId;

    static {
        t2o.a(664797238);
    }

    public int getBizType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8f974bb1", new Object[]{this})).intValue();
        }
        return this.bizType;
    }

    public String getCcode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f01981f", new Object[]{this});
        }
        return this.ccode;
    }

    public String getContactType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("38d12335", new Object[]{this});
        }
        return this.contactType;
    }

    public String getGroupId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("99b7d9b5", new Object[]{this});
        }
        return this.groupId;
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

    public void setBizType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("999b9a11", new Object[]{this, new Integer(i)});
        } else {
            this.bizType = i;
        }
    }

    public void setCcode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e0a019f", new Object[]{this, str});
        } else {
            this.ccode = str;
        }
    }

    public void setContactType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f90a7249", new Object[]{this, str});
        } else {
            this.contactType = str;
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
}
