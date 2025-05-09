package com.taobao.message.lab.comfrm.inner2;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.lab.comfrm.core.Action;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class DiffDispatchTransfomer implements Transformer {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final DiffTransfomer mDiffTransformer;

    static {
        t2o.a(537919595);
        t2o.a(537919673);
    }

    public DiffDispatchTransfomer(DiffTransfomer diffTransfomer) {
        this.mDiffTransformer = diffTransfomer;
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Transformer
    public SharedState transform(Action action, SharedState sharedState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedState) ipChange.ipc$dispatch("e602685c", new Object[]{this, action, sharedState});
        }
        Diff diff = sharedState.getDiff();
        DiffResult transform = this.mDiffTransformer.transform(action, sharedState, diff);
        if (transform == null) {
            return sharedState;
        }
        if (transform.getSharedState() == sharedState) {
            return transform.getSharedState();
        }
        if (transform.getDiff() == null || transform.getDiff() == diff) {
            return transform.getSharedState();
        }
        return transform.getSharedState().setDiff(transform.getDiff());
    }
}
