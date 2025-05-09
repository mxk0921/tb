package tb;

import com.alibaba.security.realidentity.p1;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.updown.model.TaoLiveKtSwitchModel;
import com.taobao.kmp.live.updown.model.TaoLiveKtUpDownResponse;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJSONUtils_androidKt;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Ref$ObjectRef;
import tb.thc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class e5t {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final e5t INSTANCE = new e5t();

    static {
        t2o.a(1010827409);
    }

    public final void a(ziv zivVar, String str, w1a<? super l0g, ? super Boolean, ? super TaoLiveKtUpDownResponse, xhv> w1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aba8ae3", new Object[]{this, zivVar, str, w1aVar});
            return;
        }
        ckf.g(zivVar, "requestModel");
        ckf.g(w1aVar, "callback");
        p1t p1tVar = p1t.INSTANCE;
        Map<String, ? extends Object> k = zivVar.k();
        b bVar = new b(w1aVar, str);
        Map f = v3i.f(jpu.a(p1t.kLiveMtopBizCodeKey, "TAOBAO"));
        pus pusVar = pus.INSTANCE;
        String valueOf = String.valueOf(((ns3) dun.b(p1tVar.getClass())).getSimpleName());
        pusVar.f(valueOf, "", "input api:mtop.tblive.recommend.updown.lives version:1.0 data:" + l1t.INSTANCE.c(k));
        thc.a.b(mhr.d0(), "mtop.tblive.recommend.updown.lives", "1.0", k, f, null, null, null, new a("mtop.tblive.recommend.updown.lives", bVar), 112, null);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements u1a<l0g, Boolean, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ w1a f18298a;

        /* compiled from: Taobao */
        /* renamed from: tb.e5t$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public static final class C0909a implements d1a<String> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f18299a;
            public final /* synthetic */ l0g b;

            public C0909a(String str, l0g l0gVar) {
                this.f18299a = str;
                this.b = l0gVar;
            }

            /* renamed from: a */
            public final String invoke() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("4d5ae581", new Object[]{this});
                }
                return "TaoLiveKtMTop output callback api:" + this.f18299a + " data:" + this.b.a();
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public static final class b implements d1a<String> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f18300a;
            public final /* synthetic */ Ref$ObjectRef b;

            public b(String str, Ref$ObjectRef ref$ObjectRef) {
                this.f18300a = str;
                this.b = ref$ObjectRef;
            }

            /* renamed from: a */
            public final String invoke() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("4d5ae581", new Object[]{this});
                }
                return "TaoLiveKtMTop output success api:" + this.f18300a + " model:" + this.b.element;
            }
        }

        public a(String str, w1a w1aVar) {
            this.f18298a = w1aVar;
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
            l1tVar.a(new C0909a("mtop.tblive.recommend.updown.lives", l0gVar));
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            if (l0gVar.a() != null) {
                try {
                    Map<String, Object> a2 = l0gVar.a();
                    if (a2 == null) {
                        a2 = null;
                    }
                    ref$ObjectRef.element = KMPJSONUtils_androidKt.decodeFromJsonObject(com.taobao.uniinfra_kmp.common_utils.serialization.a.Companion, new KMPJsonObject(a2), dun.b(TaoLiveKtUpDownResponse.class));
                    l1tVar.a(new b("mtop.tblive.recommend.updown.lives", ref$ObjectRef));
                } catch (Exception unused) {
                    mhr.a0(p1t.TaoLiveKtMTopTag, "TaoLiveKtMTop output error api:mtop.tblive.recommend.updown.lives data:" + l1t.INSTANCE.c(l0gVar.a()));
                }
            }
            w1a w1aVar = this.f18298a;
            if (w1aVar != null) {
                w1aVar.invoke(l0gVar, Boolean.valueOf(z), ref$ObjectRef.element);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class b implements w1a<l0g, Boolean, TaoLiveKtUpDownResponse, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ w1a<l0g, Boolean, TaoLiveKtUpDownResponse, xhv> f18301a;
        public final /* synthetic */ String b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(w1a<? super l0g, ? super Boolean, ? super TaoLiveKtUpDownResponse, xhv> w1aVar, String str) {
            this.f18301a = w1aVar;
            this.b = str;
        }

        @Override // tb.w1a
        public /* bridge */ /* synthetic */ xhv invoke(l0g l0gVar, Boolean bool, TaoLiveKtUpDownResponse taoLiveKtUpDownResponse) {
            a(l0gVar, bool.booleanValue(), taoLiveKtUpDownResponse);
            return xhv.INSTANCE;
        }

        public void a(l0g l0gVar, boolean z, TaoLiveKtUpDownResponse taoLiveKtUpDownResponse) {
            List<TaoLiveKtSwitchModel> model;
            TaoLiveKtSwitchModel taoLiveKtSwitchModel;
            TaoLiveKtSwitchModel taoLiveKtSwitchModel2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a47058d6", new Object[]{this, l0gVar, new Boolean(z), taoLiveKtUpDownResponse});
                return;
            }
            ckf.g(l0gVar, "receiveResult");
            if (taoLiveKtUpDownResponse == null) {
                taoLiveKtUpDownResponse = new TaoLiveKtUpDownResponse();
            }
            taoLiveKtUpDownResponse.setOriginData(l0gVar.a());
            if (taoLiveKtUpDownResponse.getOriginData() == null) {
                this.f18301a.invoke(l0gVar, Boolean.valueOf(z), taoLiveKtUpDownResponse);
            }
            Map<String, Object> originData = taoLiveKtUpDownResponse.getOriginData();
            if (originData != null) {
                Object obj = originData.get("model");
                ArrayList arrayList = null;
                List list = obj instanceof List ? (List) obj : null;
                if (list != null) {
                    arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (obj2 instanceof Map) {
                            arrayList.add(obj2);
                        }
                    }
                }
                if (arrayList != null && !arrayList.isEmpty() && (model = taoLiveKtUpDownResponse.getModel()) != null && arrayList.size() == model.size()) {
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        List<TaoLiveKtSwitchModel> model2 = taoLiveKtUpDownResponse.getModel();
                        if (!(model2 == null || (taoLiveKtSwitchModel2 = model2.get(i)) == null)) {
                            taoLiveKtSwitchModel2.setOriginData((Map) arrayList.get(i));
                        }
                        List<TaoLiveKtSwitchModel> model3 = taoLiveKtUpDownResponse.getModel();
                        if (!(model3 == null || (taoLiveKtSwitchModel = model3.get(i)) == null)) {
                            taoLiveKtSwitchModel.setRequestType(a4t.INSTANCE.a().get(this.b));
                        }
                    }
                }
                this.f18301a.invoke(l0gVar, Boolean.valueOf(z), taoLiveKtUpDownResponse);
            }
        }
    }
}
