package com.taobao.accs.sync.queue;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Comparator;
import java.util.concurrent.PriorityBlockingQueue;
import tb.f2r;
import tb.pmo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class BaseQueue extends PriorityBlockingQueue<f2r> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DEFAULT_INITIAL_CAPACITY = 64;
    private static final String TAG = "BaseQueue";
    public volatile f2r mLast;
    public final int minSeq;

    static {
        t2o.a(343933193);
    }

    public BaseQueue(int i, Comparator<? super f2r> comparator) {
        super(64, comparator);
        this.minSeq = i;
    }

    public static /* synthetic */ Object ipc$super(BaseQueue baseQueue, String str, Object... objArr) {
        if (str.hashCode() == 1107930627) {
            return new Boolean(super.offer((BaseQueue) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/accs/sync/queue/BaseQueue");
    }

    public boolean isNext(f2r f2rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("211f6a95", new Object[]{this, f2rVar})).booleanValue();
        }
        if (f2rVar == null || this.mLast == null || comparator().compare(f2rVar, this.mLast) != 1) {
            return false;
        }
        return true;
    }

    public boolean offer(f2r f2rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ce04ce74", new Object[]{this, f2rVar})).booleanValue();
        }
        int b = f2rVar.b();
        int i = this.minSeq;
        if (b <= i) {
            pmo.c(TAG, "offer failed", "lastSeq", Integer.valueOf(i), "message", f2rVar);
            return false;
        } else if (size() >= 1000) {
            pmo.c(TAG, "offer.overflow", "size", 1000);
            return false;
        } else if (contains(f2rVar)) {
            pmo.c(TAG, "offer.exist", "message", f2rVar);
            return false;
        } else {
            this.mLast = f2rVar;
            return super.offer((BaseQueue) f2rVar);
        }
    }
}
