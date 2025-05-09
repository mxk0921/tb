package tb;

import com.alibaba.security.realidentity.p1;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.kernel.serviceinterface.KSMTOPRequestMethod;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJSONUtils_androidKt;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject;
import java.io.Serializable;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import tb.thc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class rus {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final rus INSTANCE = new rus();

    /* renamed from: a  reason: collision with root package name */
    public static final njg f27621a = kotlin.a.a(LazyThreadSafetyMode.PUBLICATION, new d1a() { // from class: tb.qus
        @Override // tb.d1a
        public final Object invoke() {
            boolean b;
            b = rus.b();
            return Boolean.valueOf(b);
        }
    });

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements u1a<l0g, Boolean, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ wyf<T> f27622a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Map<String, Object> c;
        public final /* synthetic */ w1a<l0g, Boolean, T, xhv> d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(wyf<T> wyfVar, String str, Map<String, ? extends Object> map, w1a<? super l0g, ? super Boolean, ? super T, xhv> w1aVar) {
            this.f27622a = wyfVar;
            this.b = str;
            this.c = map;
            this.d = w1aVar;
        }

        public void a(l0g l0gVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("29a12193", new Object[]{this, l0gVar, new Boolean(z)});
                return;
            }
            ckf.g(l0gVar, p1.d);
            Serializable serializable = null;
            if (l0gVar.a() != null) {
                try {
                    Map<String, Object> a2 = l0gVar.a();
                    if (a2 == null) {
                        a2 = null;
                    }
                    serializable = KMPJSONUtils_androidKt.decodeFromJsonObject(com.taobao.uniinfra_kmp.common_utils.serialization.a.Companion, new KMPJsonObject(a2), this.f27622a);
                    k0g c = l0gVar.c();
                    if (c != null) {
                        c.c(Long.valueOf(bvt.d(ftt.Companion)));
                    }
                } catch (Exception e) {
                    pus.INSTANCE.g(String.valueOf(((ns3) dun.b(a.class)).getSimpleName()), "", "err === " + e.getMessage() + ", api === " + this.b + ", data === " + this.c);
                }
            }
            if (z) {
                wus.INSTANCE.j();
            } else {
                wus.INSTANCE.h();
            }
            w1a<l0g, Boolean, T, xhv> w1aVar = this.d;
            if (w1aVar != 0) {
                w1aVar.invoke(l0gVar, Boolean.valueOf(z), serializable);
            }
        }

        @Override // tb.u1a
        public /* bridge */ /* synthetic */ xhv invoke(l0g l0gVar, Boolean bool) {
            a(l0gVar, bool.booleanValue());
            return xhv.INSTANCE;
        }
    }

    static {
        t2o.a(1003487245);
    }

    public static final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ef1d38b", new Object[0])).booleanValue();
        }
        return mhr.e0().getBoolean("enableKMPMTopNoInline", true);
    }

    public static /* synthetic */ void e(rus rusVar, String str, String str2, wyf wyfVar, Map map, Map map2, w1a w1aVar, int i, Object obj) {
        Map map3;
        Map map4;
        w1a w1aVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21b71fd0", new Object[]{rusVar, str, str2, wyfVar, map, map2, w1aVar, new Integer(i), obj});
            return;
        }
        if ((8 & i) != 0) {
            map3 = null;
        } else {
            map3 = map;
        }
        if ((i & 16) != 0) {
            map4 = null;
        } else {
            map4 = map2;
        }
        if ((i & 32) != 0) {
            w1aVar2 = null;
        } else {
            w1aVar2 = w1aVar;
        }
        rusVar.d(str, str2, wyfVar, map3, map4, w1aVar2);
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5043e342", new Object[]{this})).booleanValue();
        }
        return ((Boolean) f27621a.getValue()).booleanValue();
    }

    public final <T extends Serializable> void d(String str, String str2, wyf<T> wyfVar, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, w1a<? super l0g, ? super Boolean, ? super T, xhv> w1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1c5e64f", new Object[]{this, str, str2, wyfVar, map, map2, w1aVar});
            return;
        }
        ckf.g(str, "api");
        ckf.g(str2, "version");
        ckf.g(wyfVar, "clazz");
        f(str, str2, wyfVar, KSMTOPRequestMethod.POST, map, map2, w1aVar);
    }

    public final <T extends Serializable> void f(String str, String str2, wyf<T> wyfVar, KSMTOPRequestMethod kSMTOPRequestMethod, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, w1a<? super l0g, ? super Boolean, ? super T, xhv> w1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dec7a8b", new Object[]{this, str, str2, wyfVar, kSMTOPRequestMethod, map, map2, w1aVar});
        } else {
            thc.a.c(mhr.d0(), str, str2, map, map2 == null ? v3i.f(jpu.a(p1t.kLiveMtopBizCodeKey, "TAOBAO")) : map2, null, kSMTOPRequestMethod, null, null, new a(wyfVar, str, map, w1aVar), 208, null);
        }
    }
}
