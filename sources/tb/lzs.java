package tb;

import com.alibaba.security.realidentity.p1;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.emoji.TaoLiveKtEmojiViewModel;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJSONUtils_androidKt;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject;
import java.util.Map;
import kotlin.jvm.internal.Ref$ObjectRef;
import tb.thc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class lzs {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final lzs INSTANCE = new lzs();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class b implements w1a<l0g, Boolean, TaoLiveKtEmojiViewModel, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g1a<TaoLiveKtEmojiViewModel, xhv> f23677a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(g1a<? super TaoLiveKtEmojiViewModel, xhv> g1aVar) {
            this.f23677a = g1aVar;
        }

        public void a(l0g l0gVar, boolean z, TaoLiveKtEmojiViewModel taoLiveKtEmojiViewModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dfa0d98f", new Object[]{this, l0gVar, new Boolean(z), taoLiveKtEmojiViewModel});
                return;
            }
            ckf.g(l0gVar, p1.d);
            if (z && taoLiveKtEmojiViewModel != null) {
                taoLiveKtEmojiViewModel.setOriginData(l0gVar.a());
                this.f23677a.invoke(taoLiveKtEmojiViewModel);
            }
        }

        @Override // tb.w1a
        public /* bridge */ /* synthetic */ xhv invoke(l0g l0gVar, Boolean bool, TaoLiveKtEmojiViewModel taoLiveKtEmojiViewModel) {
            a(l0gVar, bool.booleanValue(), taoLiveKtEmojiViewModel);
            return xhv.INSTANCE;
        }
    }

    static {
        t2o.a(1010827272);
    }

    public final void a(Map<String, ? extends Object> map, g1a<? super TaoLiveKtEmojiViewModel, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("922f9aae", new Object[]{this, map, g1aVar});
            return;
        }
        ckf.g(map, "params");
        ckf.g(g1aVar, "callback");
        p1t p1tVar = p1t.INSTANCE;
        b bVar = new b(g1aVar);
        Map f = v3i.f(jpu.a(p1t.kLiveMtopBizCodeKey, "TAOBAO"));
        pus pusVar = pus.INSTANCE;
        String valueOf = String.valueOf(((ns3) dun.b(p1tVar.getClass())).getSimpleName());
        pusVar.f(valueOf, "", "input api:mtop.tblive.live.atmosphere.resource.list version:2.0 data:" + l1t.INSTANCE.c(map));
        thc.a.a(mhr.d0(), "mtop.tblive.live.atmosphere.resource.list", "2.0", map, f, null, null, null, new a("mtop.tblive.live.atmosphere.resource.list", bVar), 112, null);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements u1a<l0g, Boolean, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ w1a f23674a;

        /* compiled from: Taobao */
        /* renamed from: tb.lzs$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public static final class C0986a implements d1a<String> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f23675a;
            public final /* synthetic */ l0g b;

            public C0986a(String str, l0g l0gVar) {
                this.f23675a = str;
                this.b = l0gVar;
            }

            /* renamed from: a */
            public final String invoke() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("4d5ae581", new Object[]{this});
                }
                return "TaoLiveKtMTop output callback api:" + this.f23675a + " data:" + this.b.a();
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public static final class b implements d1a<String> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f23676a;
            public final /* synthetic */ Ref$ObjectRef b;

            public b(String str, Ref$ObjectRef ref$ObjectRef) {
                this.f23676a = str;
                this.b = ref$ObjectRef;
            }

            /* renamed from: a */
            public final String invoke() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("4d5ae581", new Object[]{this});
                }
                return "TaoLiveKtMTop output success api:" + this.f23676a + " model:" + this.b.element;
            }
        }

        public a(String str, w1a w1aVar) {
            this.f23674a = w1aVar;
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
            l1tVar.a(new C0986a("mtop.tblive.live.atmosphere.resource.list", l0gVar));
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            if (l0gVar.a() != null) {
                try {
                    Map<String, Object> a2 = l0gVar.a();
                    if (a2 == null) {
                        a2 = null;
                    }
                    ref$ObjectRef.element = KMPJSONUtils_androidKt.decodeFromJsonObject(com.taobao.uniinfra_kmp.common_utils.serialization.a.Companion, new KMPJsonObject(a2), dun.b(TaoLiveKtEmojiViewModel.class));
                    l1tVar.a(new b("mtop.tblive.live.atmosphere.resource.list", ref$ObjectRef));
                } catch (Exception unused) {
                    mhr.a0(p1t.TaoLiveKtMTopTag, "TaoLiveKtMTop output error api:mtop.tblive.live.atmosphere.resource.list data:" + l1t.INSTANCE.c(l0gVar.a()));
                }
            }
            w1a w1aVar = this.f23674a;
            if (w1aVar != null) {
                w1aVar.invoke(l0gVar, Boolean.valueOf(z), ref$ObjectRef.element);
            }
        }
    }
}
