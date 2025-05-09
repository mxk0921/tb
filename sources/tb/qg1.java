package tb;

import com.alipay.android.msp.framework.dynfun.TplMsg;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import tb.t8u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class qg1 {
    public static final AtomicIntegerFieldUpdater<qg1> c = AtomicIntegerFieldUpdater.newUpdater(qg1.class, TplMsg.VALUE_T_NATIVE_RETURN);

    /* renamed from: a  reason: collision with root package name */
    public final t8u f26734a;
    public volatile int b;

    public qg1(boolean z, t8u t8uVar) {
        ckf.g(t8uVar, "trace");
        this.f26734a = t8uVar;
        this.b = z ? 1 : 0;
    }

    public final boolean a(boolean z) {
        int andSet = c.getAndSet(this, z ? 1 : 0);
        t8u.a aVar = t8u.a.INSTANCE;
        t8u t8uVar = this.f26734a;
        if (t8uVar != aVar) {
            t8uVar.a("getAndSet(" + z + "):" + andSet);
        }
        if (andSet == 1) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.b != 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return String.valueOf(b());
    }
}
