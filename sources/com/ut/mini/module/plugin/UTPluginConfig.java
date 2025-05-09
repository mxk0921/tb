package com.ut.mini.module.plugin;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class UTPluginConfig implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<String> close;
    private List<String> open;
    private String other;

    static {
        t2o.a(962593313);
    }

    public List<String> getClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ef430f5e", new Object[]{this});
        }
        return this.close;
    }

    public List<String> getOpen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f40a4820", new Object[]{this});
        }
        return this.open;
    }

    public String getOther() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5757c5df", new Object[]{this});
        }
        return this.other;
    }

    public void setClose(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1da54b2e", new Object[]{this, list});
        } else {
            this.close = list;
        }
    }

    public void setOpen(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17c59b44", new Object[]{this, list});
        } else {
            this.open = list;
        }
    }

    public void setOther(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40798bdf", new Object[]{this, str});
        } else {
            this.other = str;
        }
    }
}
