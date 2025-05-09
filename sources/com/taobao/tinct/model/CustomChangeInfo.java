package com.taobao.tinct.model;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tinct.impl.config.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class CustomChangeInfo extends BaseChangeInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String configType;
    public String customType;
    public long fullExpireTime;
    public Boolean grayFlag;
    public String hashKey;
    @JSONField(serialize = false)
    public boolean isStatistics;
    public String tinctTag;
    public String version;

    public CustomChangeInfo() {
        this("", "", "", "", null);
    }

    public static /* synthetic */ Object ipc$super(CustomChangeInfo customChangeInfo, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tinct/model/CustomChangeInfo");
    }

    public String getConfigType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6830f0a7", new Object[]{this});
        }
        return this.configType;
    }

    public String getCustomType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c9392b58", new Object[]{this});
        }
        return this.customType;
    }

    public long getFullExpireTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("429ba56c", new Object[]{this})).longValue();
        }
        return this.fullExpireTime;
    }

    public Boolean getGrayFlag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("9d54ca69", new Object[]{this});
        }
        return this.grayFlag;
    }

    public String getHashKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c743939e", new Object[]{this});
        }
        return this.hashKey;
    }

    @Override // com.taobao.tinct.model.BaseChangeInfo
    public String getTinctTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f9becd3", new Object[]{this});
        }
        return this.tinctTag;
    }

    public String getVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this});
        }
        return this.version;
    }

    @JSONField(serialize = false)
    public boolean isExpire() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f97d6f4", new Object[]{this})).booleanValue();
        }
        if (this.fullExpireTime != -1) {
            if (System.currentTimeMillis() > this.fullExpireTime) {
                return true;
            }
            return false;
        } else if (System.currentTimeMillis() - this.updateTime > a.c(this) + a.d(this)) {
            return true;
        } else {
            return false;
        }
    }

    @JSONField(serialize = false)
    public boolean isFull() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1ffb6ee4", new Object[]{this})).booleanValue();
        }
        return a.v(this);
    }

    @JSONField(serialize = false)
    public boolean isGray() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d71bccb8", new Object[]{this})).booleanValue();
        }
        return a.w(this);
    }

    public boolean isStatistics() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d34a73f8", new Object[]{this})).booleanValue();
        }
        return this.isStatistics;
    }

    @JSONField(serialize = false)
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        if (!isParamValid(this.customType) || !isParamValid(this.configType) || !isParamValid(this.version)) {
            return false;
        }
        return true;
    }

    public void setBizName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8853690d", new Object[]{this, str});
        } else {
            this.bizName = str;
        }
    }

    public void setConfigType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14d6abaf", new Object[]{this, str});
        } else {
            this.configType = str;
        }
    }

    public void setCustomType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4d5c71e", new Object[]{this, str});
        } else {
            this.customType = str;
        }
    }

    public void setFullExpireTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f1e3fc0", new Object[]{this, new Long(j)});
        } else {
            this.fullExpireTime = j;
        }
    }

    public void setGrayFlag(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91586555", new Object[]{this, bool});
        } else {
            this.grayFlag = bool;
        }
    }

    public void setHashKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28326900", new Object[]{this, str});
        } else {
            this.hashKey = str;
        }
    }

    public void setTinctTag(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eebf0803", new Object[]{this, str});
        } else {
            this.tinctTag = str;
        }
    }

    public void setVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e718c27", new Object[]{this, str});
        } else {
            this.version = str;
        }
    }

    public void updateFullExpireTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab2bf82b", new Object[]{this});
        } else {
            this.fullExpireTime = System.currentTimeMillis() + a.c(this);
        }
    }

    public CustomChangeInfo(String str, String str2, String str3, String str4, Boolean bool) {
        super(ChangeType.CUSTOM);
        this.customType = str;
        this.configType = str2;
        this.version = str3;
        this.bizName = str4;
        this.grayFlag = bool;
        this.isStatistics = false;
        String str5 = str + "|" + str2;
        this.hashKey = str5;
        this.tinctTag = str5 + "|" + str3;
        this.fullExpireTime = -1L;
    }

    public void setStatistics() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32d212c", new Object[]{this});
        } else {
            this.isStatistics = true;
        }
    }

    private static boolean isParamValid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a362e0e", new Object[]{str})).booleanValue();
        }
        return !TextUtils.isEmpty(str) && !str.contains("^") && !str.contains("|");
    }
}
