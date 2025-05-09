package tb;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.collections.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class wus {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final wus INSTANCE = new wus();

    /* renamed from: a  reason: collision with root package name */
    public static int f30941a;
    public static int b;
    public static int c;

    static {
        t2o.a(1003487247);
    }

    public static final xhv f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("95768528", new Object[0]);
        }
        pus.INSTANCE.i("TaoLiveCommonMTopStability", "", new d1a() { // from class: tb.tus
            @Override // tb.d1a
            public final Object invoke() {
                String g;
                g = wus.g();
                return g;
            }
        });
        if (rwt.c()) {
            rwt.d("KMP_Stability", "MTOP", a.j(jpu.a("totalCount", Integer.valueOf(f30941a)), jpu.a("successCount", Integer.valueOf(b)), jpu.a("failCount", Integer.valueOf(c))));
        }
        f30941a = 0;
        b = 0;
        c = 0;
        return xhv.INSTANCE;
    }

    public static final String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a8d9be02", new Object[0]);
        }
        return "commit t:" + f30941a + " s:" + b + " f:" + c;
    }

    public static final xhv i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("d6eb52af", new Object[0]);
        }
        c++;
        f30941a++;
        return xhv.INSTANCE;
    }

    public static final xhv k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("979e47cf", new Object[0]);
        }
        b++;
        f30941a++;
        return xhv.INSTANCE;
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e781a9f", new Object[]{this});
        } else {
            cvs.Companion.e(new d1a() { // from class: tb.sus
                @Override // tb.d1a
                public final Object invoke() {
                    xhv f;
                    f = wus.f();
                    return f;
                }
            });
        }
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("945a8d76", new Object[]{this});
        } else {
            cvs.Companion.e(new d1a() { // from class: tb.uus
                @Override // tb.d1a
                public final Object invoke() {
                    xhv i;
                    i = wus.i();
                    return i;
                }
            });
        }
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a82e7b5", new Object[]{this});
        } else {
            cvs.Companion.e(new d1a() { // from class: tb.vus
                @Override // tb.d1a
                public final Object invoke() {
                    xhv k;
                    k = wus.k();
                    return k;
                }
            });
        }
    }
}
