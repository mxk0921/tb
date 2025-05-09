package com.taobao.themis.kernel.metaInfo.manifest;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TabBar implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean invisible;
    private List<TabBarItem> items;
    private String mode;

    static {
        t2o.a(839909826);
    }

    public final boolean getInvisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7286202", new Object[]{this})).booleanValue();
        }
        return this.invisible;
    }

    public final List<TabBarItem> getItems() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("46e3e096", new Object[]{this});
        }
        return this.items;
    }

    public final String getMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24310680", new Object[]{this});
        }
        return this.mode;
    }

    public final boolean isAct() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9815ab93", new Object[]{this})).booleanValue();
        }
        return ckf.b(this.mode, "act");
    }

    public final boolean isBulge() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88e23418", new Object[]{this})).booleanValue();
        }
        List<TabBarItem> list = this.items;
        if (list == null) {
            i = 0;
        } else {
            i = list.size();
        }
        if (i % 2 != 1 || !ckf.b(this.mode, "bulge")) {
            return false;
        }
        return true;
    }

    public final void setInvisible(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5daf8a2", new Object[]{this, new Boolean(z)});
        } else {
            this.invisible = z;
        }
    }

    public final void setItems(List<TabBarItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba1ea0f6", new Object[]{this, list});
        } else {
            this.items = list;
        }
    }

    public final void setMode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f66f09f6", new Object[]{this, str});
        } else {
            this.mode = str;
        }
    }
}
