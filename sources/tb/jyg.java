package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.nexus.arch.openArch.dto_and_do.response_declared_do.BroadCaster;
import com.taobao.kmp.nexus.arch.openArch.dto_and_do.response_declared_do.LiveDetailResponseData;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJSONUtils_androidKt;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject;
import java.io.Serializable;
import java.util.Map;
import tb.ftt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class jyg {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final jyg INSTANCE = new jyg();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements g1a<Object, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ w1a f22288a;
        public final /* synthetic */ String b;
        public final /* synthetic */ u1a c;

        public a(u1a u1aVar, w1a w1aVar, String str, u1a u1aVar2) {
            this.f22288a = w1aVar;
            this.b = str;
            this.c = u1aVar2;
        }

        public final void a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b5411b1b", new Object[]{this, obj});
                return;
            }
            mus musVar = new mus();
            ftt.a aVar = ftt.Companion;
            musVar.c(Long.valueOf(bvt.d(aVar)));
            pus pusVar = pus.INSTANCE;
            String valueOf = String.valueOf(((ns3) dun.b(lus.INSTANCE.getClass())).getSimpleName());
            pusVar.f(valueOf, "", "成功: model: " + obj);
            KMPJsonObject kMPJsonObject = obj instanceof KMPJsonObject ? (KMPJsonObject) obj : null;
            if (kMPJsonObject != null) {
                w1a w1aVar = this.f22288a;
                pusVar.f(String.valueOf(((ns3) dun.b(KMPJsonObject.class)).getSimpleName()), "", "HttpResp JSONObj Is Not Null");
                Serializable decodeFromJsonObject = KMPJSONUtils_androidKt.decodeFromJsonObject(com.taobao.uniinfra_kmp.common_utils.serialization.a.Companion, kMPJsonObject, dun.b(LiveDetailResponseData.class));
                if (decodeFromJsonObject != null) {
                    String valueOf2 = String.valueOf(((ns3) dun.b(KMPJsonObject.class)).getSimpleName());
                    pusVar.f(valueOf2, "", "HttpResp ktModel: " + decodeFromJsonObject);
                    musVar.d(Long.valueOf(bvt.d(aVar)));
                    if (w1aVar != null) {
                        w1aVar.invoke(decodeFromJsonObject, obj, musVar);
                        return;
                    }
                    return;
                }
                return;
            }
            String str = this.b;
            u1a u1aVar = this.c;
            String valueOf3 = String.valueOf(((ns3) dun.b(lus.class)).getSimpleName());
            pusVar.g(valueOf3, "", "HttpResp Model Cast To KMPJsonObject failed，url= " + str);
            if (u1aVar != null) {
                u1aVar.invoke(500, "HttpResp Model Cast To KMPJsonObject failed");
            }
        }

        @Override // tb.g1a
        public /* bridge */ /* synthetic */ xhv invoke(Object obj) {
            a(obj);
            return xhv.INSTANCE;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class b implements u1a<Integer, String, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ u1a f22289a;

        public b(u1a u1aVar) {
            this.f22289a = u1aVar;
        }

        public final void a(Integer num, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("795a6ae2", new Object[]{this, num, str});
                return;
            }
            pus pusVar = pus.INSTANCE;
            String valueOf = String.valueOf(((ns3) dun.b(lus.INSTANCE.getClass())).getSimpleName());
            pusVar.g(valueOf, "", "失败: 错误代码: " + num + ", 消息: " + str);
            u1a u1aVar = this.f22289a;
            if (u1aVar != null) {
                u1aVar.invoke(num, str);
            }
        }

        @Override // tb.u1a
        public /* bridge */ /* synthetic */ xhv invoke(Integer num, String str) {
            a(num, str);
            return xhv.INSTANCE;
        }
    }

    static {
        t2o.a(1004536541);
    }

    public static final xhv f(y1a y1aVar, LiveDetailResponseData liveDetailResponseData, KMPJsonObject kMPJsonObject, mus musVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("f87d9159", new Object[]{y1aVar, liveDetailResponseData, kMPJsonObject, musVar});
        }
        Long l = null;
        Map<String, Object> map = kMPJsonObject != null ? kMPJsonObject.toMap() : null;
        if (liveDetailResponseData != null) {
            pus pusVar = pus.INSTANCE;
            StringBuilder sb = new StringBuilder("live detail cdn callback success: ");
            sb.append(liveDetailResponseData.getLiveId());
            sb.append(' ');
            BroadCaster broadCaster = liveDetailResponseData.getBroadCaster();
            sb.append(broadCaster != null ? broadCaster.getAccountName() : null);
            sb.append(' ');
            sb.append(map != null ? map.get("liveId") : null);
            pusVar.k("LiveEngine", "", sb.toString());
            Boolean bool = Boolean.TRUE;
            Long a2 = musVar != null ? musVar.a() : null;
            if (musVar != null) {
                l = musVar.b();
            }
            y1aVar.invoke(map, bool, liveDetailResponseData, new byg(a2, l));
        } else {
            pus.INSTANCE.k("LiveEngine", "", "live detail cdn callback failed.}");
            y1aVar.invoke(null, Boolean.FALSE, null, null);
        }
        return xhv.INSTANCE;
    }

    public static final xhv g(y1a y1aVar, Integer num, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("54afba6", new Object[]{y1aVar, num, str});
        }
        pus.INSTANCE.k("LiveEngine", "", "live detail cdn callback error.}");
        y1aVar.invoke(null, Boolean.FALSE, null, null);
        return xhv.INSTANCE;
    }

    public static final xhv i(String str, kyg kygVar, y1a y1aVar, l0g l0gVar, boolean z, LiveDetailResponseData liveDetailResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("d5200782", new Object[]{str, kygVar, y1aVar, l0gVar, new Boolean(z), liveDetailResponseData});
        }
        ckf.g(l0gVar, "resultData");
        pus pusVar = pus.INSTANCE;
        pusVar.k("LiveEngine", "", "live detail request callback: " + str + ' ' + l0gVar);
        if (!z || l0gVar.a() == null) {
            INSTANCE.e(kygVar, y1aVar);
        } else {
            Map<String, Object> a2 = l0gVar.a();
            Boolean valueOf = Boolean.valueOf(z);
            k0g c = l0gVar.c();
            Long l = null;
            Long b2 = c != null ? c.b() : null;
            k0g c2 = l0gVar.c();
            if (c2 != null) {
                l = c2.a();
            }
            y1aVar.invoke(a2, valueOf, liveDetailResponseData, new byg(b2, l));
        }
        return xhv.INSTANCE;
    }

    public static final xhv j(String str, kyg kygVar, y1a y1aVar, l0g l0gVar, boolean z, LiveDetailResponseData liveDetailResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("faeeaa03", new Object[]{str, kygVar, y1aVar, l0gVar, new Boolean(z), liveDetailResponseData});
        }
        ckf.g(l0gVar, "resultData");
        pus pusVar = pus.INSTANCE;
        pusVar.k("LiveEngine", "", "live detail request callback: " + str + ' ' + l0gVar);
        if (!z || l0gVar.a() == null) {
            INSTANCE.e(kygVar, y1aVar);
        } else {
            Map<String, Object> a2 = l0gVar.a();
            Boolean valueOf = Boolean.valueOf(z);
            k0g c = l0gVar.c();
            Long l = null;
            Long b2 = c != null ? c.b() : null;
            k0g c2 = l0gVar.c();
            if (c2 != null) {
                l = c2.a();
            }
            y1aVar.invoke(a2, valueOf, liveDetailResponseData, new byg(b2, l));
        }
        return xhv.INSTANCE;
    }

    public final void h(final kyg kygVar, final y1a<? super Map<String, ? extends Object>, ? super Boolean, ? super LiveDetailResponseData, ? super byg, xhv> y1aVar) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37a08974", new Object[]{this, kygVar, y1aVar});
            return;
        }
        ckf.g(kygVar, "requestModel");
        ckf.g(y1aVar, "callback");
        final String a2 = kygVar.a();
        if ((a2 == null || ckf.b(a2, "0") || ckf.b(a2, "") || ckf.b(a2, "(null)")) && (ckf.b(kygVar.b(), "true") || ckf.b(kygVar.b(), "1"))) {
            str2 = "mtop.tblive.live.recommend.home";
            str = "1.0";
        } else {
            str2 = zxg.LIVE_DETAIL_QUERY;
            str = "4.0";
        }
        Map<String, ? extends Object> s = kygVar.s();
        pus pusVar = pus.INSTANCE;
        pusVar.k("LiveEngine", "", "livedetail request send: " + str2 + ' ' + a2);
        rus rusVar = rus.INSTANCE;
        if (rusVar.c()) {
            rus.e(rusVar, str2, str, dun.b(LiveDetailResponseData.class), s, null, new w1a() { // from class: tb.fyg
                @Override // tb.w1a
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    xhv i;
                    kyg kygVar2 = kygVar;
                    y1a y1aVar2 = y1aVar;
                    i = jyg.i(a2, kygVar2, y1aVar2, (l0g) obj, ((Boolean) obj2).booleanValue(), (LiveDetailResponseData) obj3);
                    return i;
                }
            }, 16, null);
        } else {
            rusVar.d(str2, str, dun.b(LiveDetailResponseData.class), s, null, new w1a() { // from class: tb.gyg
                @Override // tb.w1a
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    xhv j;
                    kyg kygVar2 = kygVar;
                    y1a y1aVar2 = y1aVar;
                    j = jyg.j(a2, kygVar2, y1aVar2, (l0g) obj, ((Boolean) obj2).booleanValue(), (LiveDetailResponseData) obj3);
                    return j;
                }
            });
        }
    }

    public final void e(kyg kygVar, final y1a<? super Map<String, ? extends Object>, ? super Boolean, ? super LiveDetailResponseData, ? super byg, xhv> y1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84e6a4df", new Object[]{this, kygVar, y1aVar});
            return;
        }
        String str = "http://live-spare.alicdn.com/mediaplatform/" + kygVar.a();
        pus.INSTANCE.k("LiveEngine", "", "livedetail cdn send: " + str);
        IpChange ipChange2 = lus.$ipChange;
        w1a hygVar = new w1a() { // from class: tb.hyg
            @Override // tb.w1a
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                xhv f;
                f = jyg.f(y1a.this, (LiveDetailResponseData) obj, (KMPJsonObject) obj2, (mus) obj3);
                return f;
            }
        };
        u1a iygVar = new u1a() { // from class: tb.iyg
            @Override // tb.u1a
            public final Object invoke(Object obj, Object obj2) {
                xhv g;
                g = jyg.g(y1a.this, (Integer) obj, (String) obj2);
                return g;
            }
        };
        mhr.X().D(str, new a(null, hygVar, str, iygVar), new b(iygVar), kotlin.collections.a.k(jpu.a(pg1.ATOM_callee, "KMP")));
    }
}
