package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.kmp.nexus.arch.openArch.definition.OpenArchBizCode;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.random.Random;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class a2l {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a2l INSTANCE;
    public static boolean b;

    /* renamed from: a  reason: collision with root package name */
    public static final u2g<oyk, fyk> f15509a = u2g.Companion.a();
    public static final njg c = kotlin.a.a(LazyThreadSafetyMode.PUBLICATION, new d1a() { // from class: tb.y1l
        @Override // tb.d1a
        public final Object invoke() {
            boolean k;
            k = a2l.k();
            return Boolean.valueOf(k);
        }
    });

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            t2o.a(1004535812);
            int[] iArr = new int[OpenArchBizCode.values().length];
            try {
                iArr[OpenArchBizCode.SingleLiveRoomPublic.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OpenArchBizCode.SingleLiveRoomShopTab3.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OpenArchBizCode.SingleLiveRoomShopLoft.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OpenArchBizCode.SingleLiveRoomCard.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OpenArchBizCode.WatchLiveRoomPublic.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[OpenArchBizCode.WatchLiveRoomAppTab2.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[OpenArchBizCode.WatchLiveRoomHomeTab.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[OpenArchBizCode.WatchLiveRoomChanelMix.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        t2o.a(1004535811);
        a2l a2lVar = new a2l();
        INSTANCE = a2lVar;
        a2lVar.c();
    }

    public static final oyk e(fyk fykVar, hic hicVar) {
        OpenArchBizCode openArchBizCode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oyk) ipChange.ipc$dispatch("4c1530e6", new Object[]{fykVar, hicVar});
        }
        ckf.g(hicVar, AdvanceSetting.NETWORK_TYPE);
        i2g l = fykVar.l();
        if (!(l instanceof gyk)) {
            l = null;
        }
        gyk gykVar = (gyk) l;
        if (gykVar == null || (openArchBizCode = gykVar.e()) == null) {
            openArchBizCode = OpenArchBizCode.Undefined;
        }
        switch (a.$EnumSwitchMapping$0[openArchBizCode.ordinal()]) {
            case 1:
                return new ryk(fykVar);
            case 2:
                return new uyk(fykVar);
            case 3:
                return new tyk(fykVar);
            case 4:
                return new vyk(fykVar);
            case 5:
                return new syk(fykVar);
            case 6:
                return new pyk(fykVar);
            case 7:
                return new qyk(fykVar);
            case 8:
                return new qyk(fykVar);
            default:
                return new oyk(fykVar);
        }
    }

    public static final boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd1ef002", new Object[0])).booleanValue();
        }
        return com.taobao.uniinfra_kmp.common_utils.app.a.g();
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("157e62e0", new Object[]{this});
            return;
        }
        int i = 100;
        int nextInt = Random.Default.nextInt(0, 100);
        zrb<?> zrbVar = j2g.Companion.a().get(ewe.Companion.n().x());
        if (!(zrbVar instanceof uhc)) {
            zrbVar = null;
        }
        uhc uhcVar = (uhc) zrbVar;
        if (uhcVar != null) {
            i = uhcVar.o(vhc.a(uhcVar), "LogServiceSamplingRate", 100);
        }
        if (nextInt <= i) {
            b = true;
        }
    }

    public final oyk d(final fyk fykVar) {
        String k;
        oyk g;
        List<String> e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oyk) ipChange.ipc$dispatch("aa2769d0", new Object[]{this, fykVar});
        }
        ckf.g(fykVar, "context");
        oyk oykVar = (oyk) fykVar.e(new g1a() { // from class: tb.z1l
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                oyk e2;
                e2 = a2l.e(fyk.this, (hic) obj);
                return e2;
            }
        });
        String a2 = u2g.e(f15509a, oykVar, fykVar, false, 4, null).a();
        oykVar.v(a2);
        fykVar.n(a2);
        fyk m = fykVar.m();
        if (!(m == null || (k = m.k()) == null || (g = INSTANCE.g(k)) == null || (e = g.e()) == null)) {
            e.add(a2);
        }
        oykVar.y();
        return oykVar;
    }

    public final t2g<oyk, fyk> f(oyk oykVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t2g) ipChange.ipc$dispatch("d99ffad", new Object[]{this, oykVar});
        }
        return f15509a.c(oykVar.k());
    }

    public final oyk g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oyk) ipChange.ipc$dispatch("f2cd5ce2", new Object[]{this, str});
        }
        t2g<oyk, fyk> c2 = f15509a.c(str);
        if (c2 != null) {
            return c2.b();
        }
        return null;
    }

    public final boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("847e1cc0", new Object[]{this})).booleanValue();
        }
        return b;
    }

    public final void i(oyk oykVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b53adccf", new Object[]{this, oykVar});
            return;
        }
        ckf.g(oykVar, "entity");
        t2g<oyk, fyk> f = f(oykVar);
        if (f != null) {
            f.c(false);
        }
    }

    public final boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20df622f", new Object[]{this})).booleanValue();
        }
        return ((Boolean) c.getValue()).booleanValue();
    }

    public final void l(List<String> list, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adaa4058", new Object[]{this, list, str, str2, new Boolean(z)});
            return;
        }
        String j0 = i04.j0(list, " ", null, null, 0, null, null, 62, null);
        if (z) {
            pus.INSTANCE.f(str, str2, j0);
        } else {
            pus.INSTANCE.k(str, str2, j0);
        }
    }

    public final void m(List<String> list, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b98e9e4f", new Object[]{this, list, str, str2});
        } else {
            l(list, str, str2, true);
        }
    }

    public final void n(Object obj, String str, oyk oykVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931a98eb", new Object[]{this, obj, str, oykVar});
            return;
        }
        ckf.g(obj, "from");
        ckf.g(str, "msg");
        if (j()) {
            m(xz3.e("|" + str + "|from:" + obj), "EntityInfo", oykVar != null ? oykVar.k() : null);
        }
    }

    public final void o(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ff156a5", new Object[]{this, obj, str});
            return;
        }
        ckf.g(obj, "from");
        ckf.g(str, "msg");
        if (j()) {
            m(xz3.e("|" + str + "|from:" + obj), "IntentPerform", "");
        }
    }

    public final void p(Object obj, String str, oyk oykVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22507ef2", new Object[]{this, obj, str, oykVar});
            return;
        }
        ckf.g(obj, "from");
        ckf.g(str, "msg");
        if (j()) {
            m(xz3.e("|" + str + "|from:" + obj), "MemoryIssue", oykVar != null ? oykVar.k() : null);
        }
    }

    public final void q(oyk oykVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b419a6b", new Object[]{this, oykVar});
            return;
        }
        ckf.g(oykVar, "entity");
        i(oykVar);
        r(oykVar);
        oykVar.f();
    }

    public final void r(oyk oykVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77767c68", new Object[]{this, oykVar});
            return;
        }
        ckf.g(oykVar, "entity");
        t2g<oyk, fyk> f = f(oykVar);
        if (f != null) {
            f15509a.f(f);
        }
    }
}
