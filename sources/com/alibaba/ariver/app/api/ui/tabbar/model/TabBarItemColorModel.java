package com.alibaba.ariver.app.api.ui.tabbar.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class TabBarItemColorModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField
    private String activeIcon;
    @JSONField
    private String icon;

    public String getActiveIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("515984", new Object[]{this});
        }
        return this.activeIcon;
    }

    public String getIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e32456a", new Object[]{this});
        }
        return this.icon;
    }

    public void setActiveIcon(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80c35e72", new Object[]{this, str});
        } else {
            this.activeIcon = str;
        }
    }

    public void setIcon(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c95a84c", new Object[]{this, str});
        } else {
            this.icon = str;
        }
    }
}
