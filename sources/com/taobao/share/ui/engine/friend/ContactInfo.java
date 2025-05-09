package com.taobao.share.ui.engine.friend;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ContactInfo implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String bizSubType;
    private String contactType;
    private String displayName;
    private Map<String, String> extendFeatures;
    private String groupId;
    private String groupUserNum;
    private String headUrl;
    private String isFriend;
    private String position;
    private String pvid;
    private String scm;
    private String shareTraceId;
    private String sourceType;
    private String subName;
    private String subPic;
    private String userId;

    static {
        t2o.a(667942933);
    }

    public String getBizSubType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("605761c", new Object[]{this});
        }
        return this.bizSubType;
    }

    public String getContactType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("38d12335", new Object[]{this});
        }
        return this.contactType;
    }

    public String getDisplayName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f9684a22", new Object[]{this});
        }
        return this.displayName;
    }

    public Map<String, String> getExtendFeatures() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d28cd7a9", new Object[]{this});
        }
        return this.extendFeatures;
    }

    public String getGroupId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("99b7d9b5", new Object[]{this});
        }
        return this.groupId;
    }

    public String getGroupUserNum() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6e94b87", new Object[]{this});
        }
        return this.groupUserNum;
    }

    public String getHeadUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4248ad60", new Object[]{this});
        }
        return this.headUrl;
    }

    public String getIsFriend() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97636bdb", new Object[]{this});
        }
        return this.isFriend;
    }

    public String getPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("216f01ba", new Object[]{this});
        }
        return this.position;
    }

    public String getPvid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("813f1942", new Object[]{this});
        }
        return this.pvid;
    }

    public String getScm() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1429a872", new Object[]{this});
        }
        return this.scm;
    }

    public String getShareTraceId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e681dc82", new Object[]{this});
        }
        return this.shareTraceId;
    }

    public String getSourceType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c62001ee", new Object[]{this});
        }
        return this.sourceType;
    }

    public String getSubName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("857a5964", new Object[]{this});
        }
        return this.subName;
    }

    public String getSubPic() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a4a54cd9", new Object[]{this});
        }
        return this.subPic;
    }

    public String getUserId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this});
        }
        return this.userId;
    }

    public void setBizSubType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3192d4da", new Object[]{this, str});
        } else {
            this.bizSubType = str;
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

    public void setDisplayName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b5828fc", new Object[]{this, str});
        } else {
            this.displayName = str;
        }
    }

    public void setExtendFeatures(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9c66905", new Object[]{this, map});
        } else {
            this.extendFeatures = map;
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

    public void setGroupUserNum(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66de99cf", new Object[]{this, str});
        } else {
            this.groupUserNum = str;
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

    public void setIsFriend(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfe769fb", new Object[]{this, str});
        } else {
            this.isFriend = str;
        }
    }

    public void setPosition(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("974e8ffc", new Object[]{this, str});
        } else {
            this.position = str;
        }
    }

    public void setPvid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b234f74", new Object[]{this, str});
        } else {
            this.pvid = str;
        }
    }

    public void setScm(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f9848ac", new Object[]{this, str});
        } else {
            this.scm = str;
        }
    }

    public void setShareTraceId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a582834", new Object[]{this, str});
        } else {
            this.shareTraceId = str;
        }
    }

    public void setSourceType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74c9c348", new Object[]{this, str});
        } else {
            this.sourceType = str;
        }
    }

    public void setSubName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30d45bfa", new Object[]{this, str});
        } else {
            this.subName = str;
        }
    }

    public void setSubPic(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fae3bbd", new Object[]{this, str});
        } else {
            this.subPic = str;
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
