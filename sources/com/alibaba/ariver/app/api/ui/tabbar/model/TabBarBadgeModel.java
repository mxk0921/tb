package com.alibaba.ariver.app.api.ui.tabbar.model;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class TabBarBadgeModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int badgeColor;
    private int badgeSize;
    private String badgeText;

    public int getBadgeColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fcf902f0", new Object[]{this})).intValue();
        }
        return this.badgeColor;
    }

    public int getBadgeSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1dfde508", new Object[]{this})).intValue();
        }
        return this.badgeSize;
    }

    public String getBadgeText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5b70a7f", new Object[]{this});
        }
        return this.badgeText;
    }

    public void setBadgeColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8fe691a", new Object[]{this, new Integer(i)});
        } else {
            this.badgeColor = i;
        }
    }

    public void setBadgeSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69b5989a", new Object[]{this, new Integer(i)});
        } else {
            this.badgeSize = i;
        }
    }

    public void setBadgeText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7368013f", new Object[]{this, str});
        } else {
            this.badgeText = str;
        }
    }
}
