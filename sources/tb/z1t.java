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
public final class z1t {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final z1t INSTANCE = new z1t();

    static {
        t2o.a(1010827395);
    }

    public final void a(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71f94344", new Object[]{this, map});
            return;
        }
        ckf.g(map, "params");
        p1t p1tVar = p1t.INSTANCE;
        Map f = v3i.f(jpu.a(p1t.kLiveMtopBizCodeKey, "TAOBAO"));
        pus pusVar = pus.INSTANCE;
        String valueOf = String.valueOf(((ns3) dun.b(p1tVar.getClass())).getSimpleName());
        pusVar.f(valueOf, "", "input api:mtop.iliad.interact.rank.public.notice.tonotice version:1.0 data:" + l1t.INSTANCE.c(map));
        thc.a.a(mhr.d0(), "mtop.iliad.interact.rank.public.notice.tonotice", "1.0", map, f, null, null, null, new a("mtop.iliad.interact.rank.public.notice.tonotice", null), 112, null);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements u1a<l0g, Boolean, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: tb.z1t$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public static final class C1112a implements d1a<String> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f32471a;
            public final /* synthetic */ l0g b;

            public C1112a(String str, l0g l0gVar) {
                this.f32471a = str;
                this.b = l0gVar;
            }

            /* renamed from: a */
            public final String invoke() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("4d5ae581", new Object[]{this});
                }
                return "TaoLiveKtMTop output callback api:" + this.f32471a + " data:" + this.b.a();
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public static final class b implements d1a<String> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f32472a;
            public final /* synthetic */ Ref$ObjectRef b;

            public b(String str, Ref$ObjectRef ref$ObjectRef) {
                this.f32472a = str;
                this.b = ref$ObjectRef;
            }

            /* renamed from: a */
            public final String invoke() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("4d5ae581", new Object[]{this});
                }
                return "TaoLiveKtMTop output success api:" + this.f32472a + " model:" + this.b.element;
            }
        }

        public a(String str, w1a w1aVar) {
        }

        @Override // tb.u1a
        public /* bridge */ /* synthetic */ xhv invoke(l0g l0gVar, Boolean bool) {
            a(l0gVar, bool.booleanValue());
            return xhv.INSTANCE;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [T, java.io.Serializable] */
        public void a(l0g l0gVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("29a12193", new Object[]{this, l0gVar, new Boolean(z)});
                return;
            }
            ckf.g(l0gVar, p1.d);
            l1t l1tVar = l1t.INSTANCE;
            l1tVar.a(new C1112a("mtop.iliad.interact.rank.public.notice.tonotice", l0gVar));
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            if (l0gVar.a() != null) {
                try {
                    Map<String, Object> a2 = l0gVar.a();
                    if (a2 == null) {
                        a2 = null;
                    }
                    ref$ObjectRef.element = KMPJSONUtils_androidKt.decodeFromJsonObject(com.taobao.uniinfra_kmp.common_utils.serialization.a.Companion, new KMPJsonObject(a2), dun.b(TaoLiveKtBaseModel.class));
                    l1tVar.a(new b("mtop.iliad.interact.rank.public.notice.tonotice", ref$ObjectRef));
                } catch (Exception unused) {
                    mhr.a0(p1t.TaoLiveKtMTopTag, "TaoLiveKtMTop output error api:mtop.iliad.interact.rank.public.notice.tonotice data:" + l1t.INSTANCE.c(l0gVar.a()));
                }
            }
        }
    }
}
