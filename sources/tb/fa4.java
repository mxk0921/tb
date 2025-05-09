package tb;

import com.alipay.android.msp.framework.dynfun.TplMsg;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.Volatile;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class fa4 {
    public static final AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(fa4.class, TplMsg.VALUE_T_NATIVE_RETURN);

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f19137a;
    @Volatile
    public volatile int b;

    public fa4(Throwable th, boolean z) {
        this.f19137a = th;
        this.b = z ? 1 : 0;
    }

    public final boolean a() {
        if (c.get(this) != 0) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        return c.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return ov6.a(this) + '[' + this.f19137a + ']';
    }

    public /* synthetic */ fa4(Throwable th, boolean z, int i, a07 a07Var) {
        this(th, (i & 2) != 0 ? false : z);
    }
}
