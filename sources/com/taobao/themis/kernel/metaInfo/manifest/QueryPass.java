package com.taobao.themis.kernel.metaInfo.manifest;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class QueryPass implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<String> allow;
    private List<String> ignore;

    static {
        t2o.a(839909822);
    }

    public final List<String> getAllow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7aabfe6d", new Object[]{this});
        }
        return this.allow;
    }

    public final List<String> getIgnore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("405c2918", new Object[]{this});
        }
        return this.ignore;
    }

    public final void setAllow(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff5a3dff", new Object[]{this, list});
        } else {
            this.allow = list;
        }
    }

    public final void setIgnore(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95a1c64c", new Object[]{this, list});
        } else {
            this.ignore = list;
        }
    }
}
