package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class b83 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final HashMap<String, Runnable> c;
    public static final b83 INSTANCE = new b83();

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<String, MuiseCellBean> f16239a = new HashMap<>();
    public static final HashMap<String, MuiseBean> b = new HashMap<>();
    public static final i8j d = new i8j();
    public static final h8j e = new h8j();

    static {
        t2o.a(815792820);
        HashMap<String, Runnable> hashMap = new HashMap<>();
        c = hashMap;
        hashMap.put(a83.CARD_M3, new Runnable() { // from class: tb.v0z
            @Override // java.lang.Runnable
            public final void run() {
                b83.z();
            }
        });
        hashMap.put(a83.CARD_NEW_M3, new Runnable() { // from class: tb.a1z
            @Override // java.lang.Runnable
            public final void run() {
                b83.A();
            }
        });
        hashMap.put(a83.ELDER_M3, new Runnable() { // from class: tb.b1z
            @Override // java.lang.Runnable
            public final void run() {
                b83.D();
            }
        });
        hashMap.put(a83.CARD_I18_M1, new Runnable() { // from class: tb.c1z
            @Override // java.lang.Runnable
            public final void run() {
                b83.E();
            }
        });
        hashMap.put(a83.CARD_I18_LOCAL_M1, new Runnable() { // from class: tb.d1z
            @Override // java.lang.Runnable
            public final void run() {
                b83.F();
            }
        });
        hashMap.put(a83.CARD_TJB, new Runnable() { // from class: tb.e1z
            @Override // java.lang.Runnable
            public final void run() {
                b83.G();
            }
        });
        hashMap.put(a83.CARD_HONG_BAO, new Runnable() { // from class: tb.f1z
            @Override // java.lang.Runnable
            public final void run() {
                b83.H();
            }
        });
        hashMap.put(a83.CARD_BABA_FARM, new Runnable() { // from class: tb.g1z
            @Override // java.lang.Runnable
            public final void run() {
                b83.I();
            }
        });
        hashMap.put(a83.CARD_TMGJ, new Runnable() { // from class: tb.w0z
            @Override // java.lang.Runnable
            public final void run() {
                b83.J();
            }
        });
        hashMap.put(a83.CARD_TAO_FACTORY, new Runnable() { // from class: tb.x0z
            @Override // java.lang.Runnable
            public final void run() {
                b83.K();
            }
        });
        hashMap.put(a83.TOP_BAR_DEFAULT, new Runnable() { // from class: tb.y0z
            @Override // java.lang.Runnable
            public final void run() {
                b83.B();
            }
        });
        hashMap.put(a83.TOP_BAR_CHANNEL, new Runnable() { // from class: tb.z0z
            @Override // java.lang.Runnable
            public final void run() {
                b83.C();
            }
        });
    }

    public static final void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8181e8ef", new Object[0]);
        } else {
            INSTANCE.w();
        }
    }

    public static final void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeda154f", new Object[0]);
        } else {
            INSTANCE.u(a83.TOP_BAR_DATA_KEY, a83.TOP_BAR_DEFAULT);
        }
    }

    public static final void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aee82cd0", new Object[0]);
        } else {
            INSTANCE.u(a83.TOP_BAR_CHANNEL_DATA_KEY, a83.TOP_BAR_CHANNEL);
        }
    }

    public static final void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81900070", new Object[0]);
        } else {
            INSTANCE.m();
        }
    }

    public static final void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("819e17f1", new Object[0]);
        } else {
            INSTANCE.p();
        }
    }

    public static final void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81ac2f72", new Object[0]);
        } else {
            INSTANCE.p();
        }
    }

    public static final void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81ba46f3", new Object[0]);
        } else {
            INSTANCE.r();
        }
    }

    public static final void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81c85e74", new Object[0]);
        } else {
            INSTANCE.o();
        }
    }

    public static final void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81d675f5", new Object[0]);
        } else {
            INSTANCE.n();
        }
    }

    public static final void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81e48d76", new Object[0]);
        } else {
            INSTANCE.s();
        }
    }

    public static final void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81f2a4f7", new Object[0]);
        } else {
            INSTANCE.t();
        }
    }

    public static final void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8173d16e", new Object[0]);
        } else {
            INSTANCE.q();
        }
    }

    public final MuiseCellBean j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MuiseCellBean) ipChange.ipc$dispatch("bb2bcd70", new Object[]{this, str});
        }
        ckf.g(str, "type");
        HashMap<String, MuiseCellBean> hashMap = f16239a;
        MuiseCellBean muiseCellBean = hashMap.get(str);
        if (muiseCellBean != null) {
            return muiseCellBean;
        }
        Runnable runnable = c.get(str);
        if (runnable != null) {
            runnable.run();
        }
        return hashMap.get(str);
    }

    public final MuiseBean k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MuiseBean) ipChange.ipc$dispatch("4472c326", new Object[]{this, str});
        }
        ckf.g(str, "type");
        HashMap<String, MuiseBean> hashMap = b;
        MuiseBean muiseBean = hashMap.get(str);
        if (muiseBean != null) {
            return muiseBean;
        }
        Runnable runnable = c.get(str);
        if (runnable != null) {
            runnable.run();
        }
        return hashMap.get(str);
    }

    public final void l(String str, String str2) {
        MuiseCellBean muiseCellBean;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2924a0f5", new Object[]{this, str, str2});
            return;
        }
        String O = o4p.O(str);
        if (!TextUtils.isEmpty(O) && (muiseCellBean = (MuiseCellBean) d.f(JSON.parseObject(O), null)) != null) {
            f16239a.put(str2, muiseCellBean);
        }
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23796646", new Object[]{this});
        } else {
            l(a83.CARD_M3_DATA_KEY, a83.ELDER_M3);
        }
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("302fee4c", new Object[]{this});
        } else {
            l(a83.CARD_FARM_DATA_KEY, a83.CARD_BABA_FARM);
        }
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c763ec26", new Object[]{this});
        } else {
            l(a83.CARD_HB_DATA_KEY, a83.CARD_HONG_BAO);
        }
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa923d86", new Object[]{this});
            return;
        }
        l(a83.CARD_LOCAL_M1_DATA_KEY, a83.CARD_I18_M1);
        HashMap<String, MuiseCellBean> hashMap = f16239a;
        hashMap.put(a83.CARD_I18_LOCAL_M1, hashMap.get(a83.CARD_I18_M1));
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88c6f37c", new Object[]{this});
        } else {
            l(a83.CARD_M3_DATA_KEY, a83.CARD_M3);
        }
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb7ba6e2", new Object[]{this});
        } else {
            l(a83.CARD_TJB_DATA_KEY, a83.CARD_TJB);
        }
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41f93b92", new Object[]{this});
        } else {
            l(a83.CARD_TM_DATA_KEY, a83.CARD_TMGJ);
        }
    }

    public final void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d772229e", new Object[]{this});
        } else {
            l(a83.CARD_TGC_DATA_KEY, a83.CARD_TAO_FACTORY);
        }
    }

    public final void u(String str, String str2) {
        MuiseBean muiseBean;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a971d559", new Object[]{this, str, str2});
            return;
        }
        String O = o4p.O(str);
        if (!TextUtils.isEmpty(O) && (muiseBean = (MuiseBean) e.f(JSON.parseObject(O), null)) != null) {
            b.put(str2, muiseBean);
        }
    }

    public final void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29ed70dc", new Object[]{this});
        } else {
            l(a83.CARD_M3_DATA_KEY, a83.CARD_NEW_M3);
        }
    }
}
