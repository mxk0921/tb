package tb;

import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.android.alibaba.ip.runtime.IpChange;
import com.loc.at;
import kotlin.Metadata;
import tb.gic;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0017\u0018\u0000 \u0017*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\rB\u001d\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00018\u0000\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bR$\u0010\u0004\u001a\u0004\u0018\u00018\u00008\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0006\u001a\u00020\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Ltb/e2g;", "Ltb/gic;", "T", "Ltb/jic;", "data", "", "state", "<init>", "(Ltb/gic;Z)V", "Ltb/xhv;", "c", "()V", "f", "a", "Ltb/gic;", "()Ltb/gic;", "e", "(Ltb/gic;)V", TplMsg.VALUE_T_NATIVE_RETURN, "Z", "()Z", at.f, "(Z)V", "Companion", "kernel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class e2g<T extends gic> implements jic {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private T f18226a;
    private boolean b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1002438662);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public static /* synthetic */ e2g c(a aVar, gic gicVar, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e2g) ipChange.ipc$dispatch("b06cf6b8", new Object[]{aVar, gicVar, new Integer(i), obj});
            }
            if ((i & 1) != 0) {
                gicVar = null;
            }
            return aVar.b(gicVar);
        }

        public final <T extends gic> e2g<T> a(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e2g) ipChange.ipc$dispatch("a61bdd07", new Object[]{this, t});
            }
            return new e2g<>(t, false);
        }

        public final <T extends gic> e2g<T> b(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e2g) ipChange.ipc$dispatch("131094cf", new Object[]{this, t});
            }
            return new e2g<>(t, true);
        }

        public a() {
        }
    }

    static {
        t2o.a(1002438661);
        t2o.a(1002438710);
    }

    public e2g() {
        this(null, false, 3, null);
    }

    public T a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((gic) ipChange.ipc$dispatch("552d4ea5", new Object[]{this}));
        }
        return this.f18226a;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("830709e6", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d746f200", new Object[]{this});
        }
    }

    public void e(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b947e409", new Object[]{this, t});
        } else {
            this.f18226a = t;
        }
    }

    @Override // tb.jic
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78a483ed", new Object[]{this});
        } else {
            e(null);
        }
    }

    public void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bff333e", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public e2g(T t, boolean z) {
        this.f18226a = t;
        this.b = z;
    }

    public /* synthetic */ e2g(gic gicVar, boolean z, int i, a07 a07Var) {
        this((i & 1) != 0 ? null : gicVar, (i & 2) != 0 ? false : z);
    }
}
