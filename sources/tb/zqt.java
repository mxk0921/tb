package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uniinfra_kmp.common_utils.ContainerType;
import kotlin.a;
import tb.pzf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class zqt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final zqt INSTANCE = new zqt();

    /* renamed from: a  reason: collision with root package name */
    public static final njg f32956a = a.b(new d1a() { // from class: tb.uqt
        @Override // tb.d1a
        public final Object invoke() {
            pzf j;
            j = zqt.j();
            return j;
        }
    });
    public static final njg b = a.b(new d1a() { // from class: tb.vqt
        @Override // tb.d1a
        public final Object invoke() {
            pzf g;
            g = zqt.g();
            return g;
        }
    });

    static {
        t2o.a(1007681545);
    }

    public static final pzf g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pzf) ipChange.ipc$dispatch("30ced21d", new Object[0]);
        }
        pzf a2 = new re4().a();
        pzf.a.a(a2, "favorite_main", ContainerType.KMain, 0, 4, null);
        return a2;
    }

    public static final xhv i(wio wioVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("372ce641", new Object[]{wioVar});
        }
        wioVar.run();
        return xhv.INSTANCE;
    }

    public static final pzf j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pzf) ipChange.ipc$dispatch("a177fcf5", new Object[0]);
        }
        pzf a2 = new re4().a();
        pzf.a.a(a2, "favorite_sdk", ContainerType.KSerial, 0, 4, null);
        return a2;
    }

    public final pzf d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pzf) ipChange.ipc$dispatch("8560ef3b", new Object[]{this});
        }
        return (pzf) b.getValue();
    }

    public final pzf e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pzf) ipChange.ipc$dispatch("bb1dc69e", new Object[]{this});
        }
        return f();
    }

    public final pzf f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pzf) ipChange.ipc$dispatch("e5f1429e", new Object[]{this});
        }
        return (pzf) f32956a.getValue();
    }

    public final void h(final wio wioVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d837f135", new Object[]{this, wioVar});
            return;
        }
        ckf.g(wioVar, "task");
        d().a(new d1a() { // from class: tb.wqt
            @Override // tb.d1a
            public final Object invoke() {
                xhv i;
                i = zqt.i(wio.this);
                return i;
            }
        });
    }
}
