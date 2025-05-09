package com.taobao.message.sp.framework.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class SimpleBaseProfile implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String avatarURL;
    public String displayName;
    public Map<String, String> extInfo;
    public long modifyTime;
    public long serverTime;
    public SimpleTarget target;

    static {
        t2o.a(552599661);
    }

    public String getAvatarURL() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ed2bc459", new Object[]{this});
        }
        return this.avatarURL;
    }

    public String getDisplayName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f9684a22", new Object[]{this});
        }
        return this.displayName;
    }

    public Map<String, String> getExtInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a7858875", new Object[]{this});
        }
        if (this.extInfo == null) {
            this.extInfo = new HashMap();
        }
        return this.extInfo;
    }

    public long getModifyTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8999f898", new Object[]{this})).longValue();
        }
        return this.modifyTime;
    }

    public long getServerTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7cda1621", new Object[]{this})).longValue();
        }
        return this.serverTime;
    }

    public SimpleTarget getTarget() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SimpleTarget) ipChange.ipc$dispatch("9c76a0a6", new Object[]{this});
        }
        return this.target;
    }

    public void setAvatarURL(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a8a82a5", new Object[]{this, str});
        } else {
            this.avatarURL = str;
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

    public void setExtInfo(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30abe351", new Object[]{this, map});
        } else if (map != null) {
            this.extInfo = map;
        }
    }

    public void setExtInfoValue(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40c41fdf", new Object[]{this, str, str2});
            return;
        }
        if (this.extInfo == null) {
            this.extInfo = new HashMap();
        }
        this.extInfo.put(str, str2);
    }

    public void setModifyTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e07c2c14", new Object[]{this, new Long(j)});
        } else {
            this.modifyTime = j;
        }
    }

    public void setServerTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("553fbfab", new Object[]{this, new Long(j)});
        } else {
            this.serverTime = j;
        }
    }

    public void setTarget(SimpleTarget simpleTarget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("480ce878", new Object[]{this, simpleTarget});
        } else {
            this.target = simpleTarget;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "BaseProfile{target='" + this.target.toString() + "', displayName='" + this.displayName + "', avatarURL='" + this.avatarURL + "', modifyTime=" + this.modifyTime + ", serverTime=" + this.serverTime + '}';
    }
}
