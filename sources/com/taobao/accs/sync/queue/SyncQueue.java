package com.taobao.accs.sync.queue;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Comparator;
import tb.f2r;
import tb.pmo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class SyncQueue extends BaseQueue {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "SyncQueue";
    private int curSeq;

    static {
        t2o.a(343933203);
    }

    public SyncQueue(int i, Comparator<f2r> comparator) {
        super(i, comparator);
        this.curSeq = i;
    }

    public static /* synthetic */ Object ipc$super(SyncQueue syncQueue, String str, Object... objArr) {
        if (str.hashCode() == -838545804) {
            return new Boolean(super.offer((f2r) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/accs/sync/queue/SyncQueue");
    }

    public int getCurSeq() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4580beef", new Object[]{this})).intValue();
        }
        return this.curSeq;
    }

    public void incrementSeq() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20661af7", new Object[]{this});
            return;
        }
        int i = this.curSeq + 1;
        this.curSeq = i;
        pmo.c(TAG, "incrementSeq", "curIndex", Integer.valueOf(i));
    }

    @Override // com.taobao.accs.sync.queue.BaseQueue
    public boolean isNext(f2r f2rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("211f6a95", new Object[]{this, f2rVar})).booleanValue();
        }
        if (f2rVar.b() - this.curSeq == 1) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.accs.sync.queue.BaseQueue
    public boolean offer(f2r f2rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ce04ce74", new Object[]{this, f2rVar})).booleanValue();
        }
        if (!super.offer(f2rVar)) {
            return false;
        }
        pmo.c(TAG, "offer", "msg", f2rVar);
        this.curSeq = f2rVar.b();
        return true;
    }
}
