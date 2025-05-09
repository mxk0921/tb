package com.taobao.tbreachflow.shortcuts.bean;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ItemVO implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String disableToast;
    private String iconName;
    private String iconUrl;
    private String id;
    private String linkUrl;
    private Integer rank;
    private String title;

    public String getDisableToast() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6932e784", new Object[]{this});
        }
        return this.disableToast;
    }

    public String getIconName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c1f1f1f", new Object[]{this});
        }
        return this.iconName;
    }

    public String getIconUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43d20f9", new Object[]{this});
        }
        return this.iconUrl;
    }

    public String getId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81e05888", new Object[]{this});
        }
        return this.id;
    }

    public String getLinkUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a02c617a", new Object[]{this});
        }
        return this.linkUrl;
    }

    public int getRank() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8b0b181c", new Object[]{this})).intValue();
        }
        return this.rank.intValue();
    }

    public String getTitle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5267f97", new Object[]{this});
        }
        return this.title;
    }

    public boolean isValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        if (TextUtils.isEmpty(this.id) || TextUtils.isEmpty(this.iconUrl) || TextUtils.isEmpty(this.iconName) || TextUtils.isEmpty(this.title) || TextUtils.isEmpty(this.linkUrl) || TextUtils.isEmpty(this.disableToast)) {
            return false;
        }
        return true;
    }

    public void setDisableToast(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dc87d72", new Object[]{this, str});
        } else {
            this.disableToast = str;
        }
    }

    public void setIconName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a21f37", new Object[]{this, str});
        } else {
            this.iconName = str;
        }
    }

    public void setIconUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a6a8705", new Object[]{this, str});
        } else {
            this.iconUrl = str;
        }
    }

    public void setId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb80bee", new Object[]{this, str});
        } else {
            this.id = str;
        }
    }

    public void setLinkUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c6356a4", new Object[]{this, str});
        } else {
            this.linkUrl = str;
        }
    }

    public void setRank(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32ac206e", new Object[]{this, new Integer(i)});
        } else {
            this.rank = Integer.valueOf(i);
        }
    }

    public void setTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
        } else {
            this.title = str;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ItemVO{id='" + this.id + "', iconUrl='" + this.iconUrl + "', iconName='" + this.iconName + "', title='" + this.title + "', linkUrl='" + this.linkUrl + "', disableToast='" + this.disableToast + "', rank=" + this.rank + '}';
    }
}
