package com.taobao.message.window;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class FloatWindowVO {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean bigMode;
    private int gravity;
    private String iconBackgroundUrl;
    private String iconUrl;
    private String navUrl;
    private String text;
    private int timeSecond = -1;

    static {
        t2o.a(530579524);
    }

    public int getGravity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19666692", new Object[]{this})).intValue();
        }
        return this.gravity;
    }

    public String getIconBackgroundUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b7e1e987", new Object[]{this});
        }
        return this.iconBackgroundUrl;
    }

    public String getIconUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43d20f9", new Object[]{this});
        }
        return this.iconUrl;
    }

    public String getNavUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f7553bf7", new Object[]{this});
        }
        return this.navUrl;
    }

    public String getText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97297536", new Object[]{this});
        }
        return this.text;
    }

    public int getTimeSecond() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("afb60e91", new Object[]{this})).intValue();
        }
        return this.timeSecond;
    }

    public boolean isBigMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6400b244", new Object[]{this})).booleanValue();
        }
        return this.bigMode;
    }

    public void setBigMode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0b2e3cc", new Object[]{this, new Boolean(z)});
        } else {
            this.bigMode = z;
        }
    }

    public void setGravity(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49afdb50", new Object[]{this, new Integer(i)});
        } else {
            this.gravity = i;
        }
    }

    public void setIconBackgroundUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41da4f37", new Object[]{this, str});
        } else {
            this.iconBackgroundUrl = str;
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

    public void setNavUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92fc305f", new Object[]{this, str});
        } else {
            this.navUrl = str;
        }
    }

    public void setText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2847200", new Object[]{this, str});
        } else {
            this.text = str;
        }
    }

    public void setTimeSecond(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7de2d199", new Object[]{this, new Integer(i)});
        } else {
            this.timeSecond = i;
        }
    }
}
