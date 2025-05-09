package com.taobao.linkmanager.afc.reduction;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class AfcReductResult implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String adid;
    private boolean autoLogin;
    private String channel;
    private boolean isGrowthWord;
    private int type;
    private String url;

    static {
        t2o.a(744489011);
    }

    public String getAdid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a4e8a85", new Object[]{this});
        }
        return this.adid;
    }

    public String getChannel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3babe84c", new Object[]{this});
        }
        return this.channel;
    }

    public int getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue();
        }
        return this.type;
    }

    public String getUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return this.url;
    }

    public boolean isAutoLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d974257b", new Object[]{this})).booleanValue();
        }
        return this.autoLogin;
    }

    public boolean isIsGrowthWord() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e60c8a90", new Object[]{this})).booleanValue();
        }
        return this.isGrowthWord;
    }

    public void setAdid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4020691", new Object[]{this, str});
        } else {
            this.adid = str;
        }
    }

    public void setAutoLogin(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64f3e975", new Object[]{this, new Boolean(z)});
        } else {
            this.autoLogin = z;
        }
    }

    public void setChannel(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40d4aa12", new Object[]{this, str});
        } else {
            this.channel = str;
        }
    }

    public void setIsGrowthWord(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77212190", new Object[]{this, new Boolean(z)});
        } else {
            this.isGrowthWord = z;
        }
    }

    public void setType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77e09620", new Object[]{this, new Integer(i)});
        } else {
            this.type = i;
        }
    }

    public void setUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dea87e", new Object[]{this, str});
        } else {
            this.url = str;
        }
    }
}
