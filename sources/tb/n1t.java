package tb;

import com.alibaba.security.realidentity.p1;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.liveBizComponent.model.base.TaoLiveKtBaseModel;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJSONUtils_androidKt;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject;
import java.util.Map;
import kotlin.jvm.internal.Ref$ObjectRef;
import tb.thc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class n1t {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final n1t INSTANCE = new n1t();

    static {
        t2o.a(1010827277);
    }

    public final void a(Map<String, ? extends Object> map, g1a<? super Boolean, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dab4a2de", new Object[]{this, map, g1aVar});
            return;
        }
        ckf.g(map, "params");
        ckf.g(g1aVar, "callback");
        p1t p1tVar = p1t.INSTANCE;
        b bVar = new b(g1aVar);
        Map f = v3i.f(jpu.a(p1t.kLiveMtopBizCodeKey, "TAOBAO"));
        pus pusVar = pus.INSTANCE;
        String valueOf = String.valueOf(((ns3) dun.b(p1tVar.getClass())).getSimpleName());
        pusVar.f(valueOf, "", "input api:mtop.taobao.iliad.recommend.publish version:1.0 data:" + l1t.INSTANCE.c(map));
        thc.a.a(mhr.d0(), "mtop.taobao.iliad.recommend.publish", "1.0", map, f, null, null, null, new a("mtop.taobao.iliad.recommend.publish", bVar), 112, null);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements u1a<l0g, Boolean, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ w1a f24453a;

        /* compiled from: Taobao */
        /* renamed from: tb.n1t$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public static final class C1002a implements d1a<String> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f24454a;
            public final /* synthetic */ l0g b;

            public C1002a(String str, l0g l0gVar) {
                this.f24454a = str;
                this.b = l0gVar;
            }

            /* renamed from: a */
            public final String invoke() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("4d5ae581", new Object[]{this});
                }
                return "TaoLiveKtMTop output callback api:" + this.f24454a + " data:" + this.b.a();
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public static final class b implements d1a<String> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f24455a;
            public final /* synthetic */ Ref$ObjectRef b;

            public b(String str, Ref$ObjectRef ref$ObjectRef) {
                this.f24455a = str;
                this.b = ref$ObjectRef;
            }

            /* renamed from: a */
            public final String invoke() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("4d5ae581", new Object[]{this});
                }
                return "TaoLiveKtMTop output success api:" + this.f24455a + " model:" + this.b.element;
            }
        }

        public a(String str, w1a w1aVar) {
            this.f24453a = w1aVar;
        }

        @Override // tb.u1a
        public /* bridge */ /* synthetic */ xhv invoke(l0g l0gVar, Boolean bool) {
            a(l0gVar, bool.booleanValue());
            return xhv.INSTANCE;
        }

        /* JADX WARN: Type inference failed for: r5v3, types: [T, java.io.Serializable] */
        public void a(l0g l0gVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("29a12193", new Object[]{this, l0gVar, new Boolean(z)});
                return;
            }
            ckf.g(l0gVar, p1.d);
            l1t l1tVar = l1t.INSTANCE;
            l1tVar.a(new C1002a("mtop.taobao.iliad.recommend.publish", l0gVar));
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            if (l0gVar.a() != null) {
                try {
                    Map<String, Object> a2 = l0gVar.a();
                    if (a2 == null) {
                        a2 = null;
                    }
                    ref$ObjectRef.element = KMPJSONUtils_androidKt.decodeFromJsonObject(com.taobao.uniinfra_kmp.common_utils.serialization.a.Companion, new KMPJsonObject(a2), dun.b(TaoLiveKtBaseModel.class));
                    l1tVar.a(new b("mtop.taobao.iliad.recommend.publish", ref$ObjectRef));
                } catch (Exception unused) {
                    mhr.a0(p1t.TaoLiveKtMTopTag, "TaoLiveKtMTop output error api:mtop.taobao.iliad.recommend.publish data:" + l1t.INSTANCE.c(l0gVar.a()));
                }
            }
            w1a w1aVar = this.f24453a;
            if (w1aVar != null) {
                w1aVar.invoke(l0gVar, Boolean.valueOf(z), ref$ObjectRef.element);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class b implements w1a<l0g, Boolean, TaoLiveKtBaseModel, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g1a<Boolean, xhv> f24456a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(g1a<? super Boolean, xhv> g1aVar) {
            this.f24456a = g1aVar;
        }

        @Override // tb.w1a
        public /* bridge */ /* synthetic */ xhv invoke(l0g l0gVar, Boolean bool, TaoLiveKtBaseModel taoLiveKtBaseModel) {
            a(l0gVar, bool.booleanValue(), taoLiveKtBaseModel);
            return xhv.INSTANCE;
        }

        public void a(l0g l0gVar, boolean z, TaoLiveKtBaseModel taoLiveKtBaseModel) {
            boolean z2 = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f542b33", new Object[]{this, l0gVar, new Boolean(z), taoLiveKtBaseModel});
                return;
            }
            ckf.g(l0gVar, "receiveResult");
            Map<String, Object> a2 = l0gVar.a();
            if (a2 == null) {
                a2 = null;
            }
            KMPJsonObject kMPJsonObject = new KMPJsonObject(a2);
            g1a<Boolean, xhv> g1aVar = this.f24456a;
            if (!z || !ckf.b(kMPJsonObject.getBoolean("result"), Boolean.TRUE)) {
                z2 = false;
            }
            g1aVar.invoke(Boolean.valueOf(z2));
        }
    }
}
