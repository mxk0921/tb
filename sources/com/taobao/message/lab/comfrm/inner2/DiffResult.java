package com.taobao.message.lab.comfrm.inner2;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class DiffResult {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Diff diff;
    private final SharedState sharedState;

    static {
        t2o.a(537919596);
    }

    public DiffResult(SharedState sharedState, Diff diff) {
        this.sharedState = sharedState;
        this.diff = diff;
    }

    public Diff getDiff() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Diff) ipChange.ipc$dispatch("e180228d", new Object[]{this});
        }
        return this.diff;
    }

    public SharedState getSharedState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedState) ipChange.ipc$dispatch("7043125d", new Object[]{this});
        }
        return this.sharedState;
    }
}
