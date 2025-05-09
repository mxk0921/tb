package com.taobao.themis.kernel.metaInfo.manifest;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TabBarItem implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private transient String badgeText;
    private String iconNormal;
    private String iconSelected;
    private String label;
    private String pageId;
    private QueryPass queryPass;

    static {
        t2o.a(839909827);
    }

    public final String getBadgeText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5b70a7f", new Object[]{this});
        }
        return this.badgeText;
    }

    public final String getIconNormal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("92f9fe03", new Object[]{this});
        }
        return this.iconNormal;
    }

    public final String getIconSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1c72008f", new Object[]{this});
        }
        return this.iconSelected;
    }

    public final String getLabel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("730a5c7b", new Object[]{this});
        }
        return this.label;
    }

    public final String getPageId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("551c67f9", new Object[]{this});
        }
        return this.pageId;
    }

    public final QueryPass getQueryPass() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (QueryPass) ipChange.ipc$dispatch("41878722", new Object[]{this});
        }
        return this.queryPass;
    }

    public final void setBadgeText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7368013f", new Object[]{this, str});
        } else {
            this.badgeText = str;
        }
    }

    public final void setIconNormal(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("432f49d3", new Object[]{this, str});
        } else {
            this.iconNormal = str;
        }
    }

    public final void setIconSelected(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26c85c7", new Object[]{this, str});
        } else {
            this.iconSelected = str;
        }
    }

    public final void setLabel(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b19c8c3", new Object[]{this, str});
        } else {
            this.label = str;
        }
    }

    public final void setPageId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee1a849d", new Object[]{this, str});
        } else {
            this.pageId = str;
        }
    }

    public final void setQueryPass(QueryPass queryPass) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fda3a314", new Object[]{this, queryPass});
        } else {
            this.queryPass = queryPass;
        }
    }
}
