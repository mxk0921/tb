package tb;

import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.m;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class ruf extends ha4 implements rr7, yse {
    public JobSupport g;

    @Override // tb.rr7
    public void dispose() {
        q().f1(this);
    }

    @Override // tb.yse
    public f5k getList() {
        return null;
    }

    public m getParent() {
        return q();
    }

    @Override // tb.yse
    public boolean isActive() {
        return true;
    }

    public final JobSupport q() {
        JobSupport jobSupport = this.g;
        if (jobSupport != null) {
            return jobSupport;
        }
        ckf.y("job");
        throw null;
    }

    public final void r(JobSupport jobSupport) {
        this.g = jobSupport;
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    public String toString() {
        return ov6.a(this) + '@' + ov6.b(this) + "[job@" + ov6.b(q()) + ']';
    }
}
