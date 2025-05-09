package tb;

import com.alibaba.ability.impl.akhub.AkHubAbility;
import com.alibaba.ability.impl.appedition.AppEditionAbility;
import com.alibaba.ability.impl.barcode.BarCodeAbility;
import com.alibaba.ability.impl.hapticsengine.HapticsEngineAbility;
import com.alibaba.ability.impl.mtop.MtopAbility;
import com.alibaba.ability.impl.nfc.NfcAbility;
import com.alibaba.ability.impl.performance.PerformanceAbility;
import com.alibaba.ability.impl.riverlogtoggle.RiverlogToggleAbility;
import com.alibaba.ability.impl.rocketbundle.RocketBundleAbility;
import com.alibaba.ability.impl.stdpop.StdPopAbility;
import com.alibaba.ability.impl.uttracker.UTTrackerAbility;
import com.alibaba.alibity.container.file.FileAbility;
import com.alibaba.alibity.container.ssr.FirstChunkCacheAbility;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.network.diagnosis.model.NetworkAbility;
import com.taobao.message.message_open_api_adapter.OpenAPI4Uni;
import com.taobao.tao.powermsg.outter.PowerMsgAbility;
import com.taobao.themis.open.ability.calendar.TMSCalendarBridge;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import tb.i11;
import tb.idb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class cwy implements mdb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static final rq K = new rq(new b(1, kotlin.collections.a.h()), null, 2, null);

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference<rq> f17403a = new AtomicReference<>();
    public final AtomicReference<rq> b = new AtomicReference<>();
    public final AtomicReference<rq> c = new AtomicReference<>();
    public final AtomicReference<rq> d = new AtomicReference<>();
    public final AtomicReference<rq> e = new AtomicReference<>();
    public final AtomicReference<rq> f = new AtomicReference<>();
    public final AtomicReference<rq> g = new AtomicReference<>();
    public final AtomicReference<rq> h = new AtomicReference<>();
    public final AtomicReference<rq> i = new AtomicReference<>();
    public final AtomicReference<rq> j = new AtomicReference<>();
    public final AtomicReference<rq> k = new AtomicReference<>();
    public final AtomicReference<rq> l = new AtomicReference<>();
    public final AtomicReference<rq> m = new AtomicReference<>();
    public final AtomicReference<rq> n = new AtomicReference<>();
    public final AtomicReference<rq> o = new AtomicReference<>();
    public final AtomicReference<rq> p = new AtomicReference<>();
    public final AtomicReference<rq> q = new AtomicReference<>();
    public final AtomicReference<rq> r = new AtomicReference<>();
    public final AtomicReference<rq> s = new AtomicReference<>();
    public final AtomicReference<rq> t = new AtomicReference<>();
    public final AtomicReference<rq> u = new AtomicReference<>();
    public final AtomicReference<rq> v = new AtomicReference<>();
    public final AtomicReference<rq> w = new AtomicReference<>();
    public final AtomicReference<rq> x = new AtomicReference<>();
    public final AtomicReference<rq> y = new AtomicReference<>();
    public final AtomicReference<rq> z = new AtomicReference<>();
    public final AtomicReference<rq> A = new AtomicReference<>();
    public final AtomicReference<rq> B = new AtomicReference<>();
    public final AtomicReference<rq> C = new AtomicReference<>();
    public final AtomicReference<rq> D = new AtomicReference<>();
    public final AtomicReference<rq> E = new AtomicReference<>();
    public final AtomicReference<rq> F = new AtomicReference<>();
    public final AtomicReference<rq> G = new AtomicReference<>();
    public final AtomicReference<rq> H = new AtomicReference<>();
    public final AtomicReference<rq> I = new AtomicReference<>();
    public final AtomicReference<rq> J = new AtomicReference<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public final rq a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (rq) ipChange.ipc$dispatch("26804502", new Object[]{this});
            }
            return cwy.a();
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b implements idb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Map<String, i11> f17404a;

        public b(int i, Map<String, i11> map) {
            ckf.g(map, "apiSpecs");
            this.f17404a = map;
        }

        @Override // tb.idb
        public int a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e589b895", new Object[]{this, str})).intValue();
            }
            ckf.g(str, "api");
            return idb.a.a(this, str);
        }

        @Override // tb.idb
        public boolean b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("96108063", new Object[]{this, str})).booleanValue();
            }
            ckf.g(str, "api");
            return true;
        }

        @Override // tb.idb
        public hdb build() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (hdb) ipChange.ipc$dispatch("c75cea09", new Object[]{this});
            }
            return null;
        }

        @Override // tb.idb
        public int c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("52ec830e", new Object[]{this})).intValue();
            }
            return 1;
        }
    }

    public static final /* synthetic */ rq a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("b54a2bbf", new Object[0]);
        }
        return K;
    }

    public final rq D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("374fcab6", new Object[]{this});
        }
        rq rqVar = this.l.get();
        if (rqVar == null) {
            rqVar = new rq(new hun("com.alibaba.ability.impl.riverlogtoggle.RiverlogToggleAbility", 1, v3i.f(jpu.a(RiverlogToggleAbility.API_TOGGLE, i11.Companion.a())), null, 8, null), null, 2, null);
            if (!sng.a(this.l, null, rqVar)) {
                rqVar = this.l.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("1a29d574", new Object[]{this});
        }
        rq rqVar = this.w.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.alibaba.ability.impl.rocketbundle.RocketBundleAbility", 3, kotlin.collections.a.j(jpu.a(RocketBundleAbility.API_GET_CURRENT_INFO, aVar.a()), jpu.a("download", aVar.a()), jpu.a(RocketBundleAbility.API_ENABLE_ROCKET, aVar.a())), null, 8, null), null, 2, null);
            if (!sng.a(this.w, null, rqVar)) {
                rqVar = this.w.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("92095bed", new Object[]{this});
        }
        rq rqVar = this.o.get();
        if (rqVar == null) {
            rqVar = new rq(new hun("com.alibaba.ability.impl.telephone.TelePhoneAbility", 3, v3i.f(jpu.a("call", i11.Companion.a())), null, 8, null), null, 2, null);
            if (!sng.a(this.o, null, rqVar)) {
                rqVar = this.o.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("6839b223", new Object[]{this});
        }
        rq rqVar = this.E.get();
        if (rqVar == null) {
            try {
                rqVar = new rq(new qq(kcx.class, 3, null, 4, null), jfp.c("miniapp"));
            } catch (NoClassDefFoundError unused) {
                rqVar = Companion.a();
            }
            if (!sng.a(this.E, null, rqVar)) {
                rqVar = this.E.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("c4cc45a6", new Object[]{this});
        }
        rq rqVar = this.t.get();
        if (rqVar == null) {
            rqVar = new rq(new hun("com.alibaba.ability.impl.zcache.ZCacheAbility", 3, v3i.f(jpu.a("prefetch", i11.Companion.a())), null, 8, null), null, 2, null);
            if (!sng.a(this.t, null, rqVar)) {
                rqVar = this.t.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq b() {
        rq rqVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("1b18c069", new Object[]{this});
        }
        rq rqVar2 = this.c.get();
        if (rqVar2 == null) {
            try {
                rqVar = new rq(new qq(AkHubAbility.class, 3, null, 4, null), null, 2, null);
            } catch (NoClassDefFoundError unused) {
                rqVar = Companion.a();
            }
            if (!sng.a(this.c, null, rqVar)) {
                rqVar2 = this.c.get();
            } else {
                rqVar2 = rqVar;
            }
        }
        ckf.f(rqVar2, "builderBox");
        return rqVar2;
    }

    public final rq d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("3f751b2e", new Object[]{this});
        }
        rq rqVar = this.A.get();
        if (rqVar == null) {
            rqVar = new rq(new hun("com.alibaba.ability.impl.modal.ModalAbility", 3, v3i.f(jpu.a("show", i11.Companion.b())), null, 8, null), null, 2, null);
            if (!sng.a(this.A, null, rqVar)) {
                rqVar = this.A.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("e196b65b", new Object[]{this});
        }
        rq rqVar = this.n.get();
        if (rqVar == null) {
            rqVar = new rq(new hun("com.alibaba.ability.impl.appedition.AppEditionAbility", 3, v3i.f(jpu.a(AppEditionAbility.API_CHECK_VERSION_CODE, i11.Companion.a())), null, 8, null), null, 2, null);
            if (!sng.a(this.n, null, rqVar)) {
                rqVar = this.n.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("3d3d4b3b", new Object[]{this});
        }
        rq rqVar = this.G.get();
        if (rqVar == null) {
            rqVar = new rq(new hun("com.alibaba.ability.abilitys.Authorize", 3, kotlin.collections.a.h(), null, 8, null), jfp.c(MspGlobalDefine.TINY_APP));
            if (!sng.a(this.G, null, rqVar)) {
                rqVar = this.G.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    @Override // tb.mdb
    public idb get(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (idb) ipChange.ipc$dispatch("1c2b338c", new Object[]{this, str, str2, str3});
        }
        ckf.g(str, "name");
        ckf.g(str2, "namespace");
        ckf.g(str3, "businessId");
        rq j = j(str);
        if (j != null) {
            return j.a(str2);
        }
        return null;
    }

    public final rq i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("7aed65f2", new Object[]{this});
        }
        rq rqVar = this.C.get();
        if (rqVar == null) {
            rqVar = new rq(new hun("com.alibaba.ability.impl.barcode.BarCodeAbility", 3, v3i.f(jpu.a(BarCodeAbility.API_DECODE_QR, i11.Companion.b())), null, 8, null), null, 2, null);
            if (!sng.a(this.C, null, rqVar)) {
                rqVar = this.C.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a1, code lost:
        if (r5.equals("telephone") != false) goto L_0x012c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e6, code lost:
        if (r5.equals("mtop") != false) goto L_0x0100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00fe, code lost:
        if (r5.equals("MTOP") != false) goto L_0x0100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0100, code lost:
        r5 = w();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x012a, code lost:
        if (r5.equals("Tel") != false) goto L_0x012c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x012c, code lost:
        r5 = H();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final tb.rq j(java.lang.String r5) {
        /*
            Method dump skipped, instructions count: 734
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.cwy.j(java.lang.String):tb.rq");
    }

    public final rq m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("4f39f9d8", new Object[]{this});
        }
        rq rqVar = this.J.get();
        if (rqVar == null) {
            try {
                rqVar = new rq(new qq(xe8.class, 3, v3i.f(jpu.a("unsubscribe", i11.Companion.a()))), jfp.c("dx"));
            } catch (NoClassDefFoundError unused) {
                rqVar = Companion.a();
            }
            if (!sng.a(this.J, null, rqVar)) {
                rqVar = this.J.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("1dc04c89", new Object[]{this});
        }
        rq rqVar = this.D.get();
        if (rqVar == null) {
            try {
                rqVar = new rq(new qq(huw.class, 3, null, 4, null), jfp.c("weex"));
            } catch (NoClassDefFoundError unused) {
                rqVar = Companion.a();
            }
            if (!sng.a(this.D, null, rqVar)) {
                rqVar = this.D.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq t() {
        rq rqVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("d13c37d4", new Object[]{this});
        }
        rq rqVar2 = this.H.get();
        if (rqVar2 == null) {
            try {
                rqVar = new rq(new qq(OpenAPI4Uni.class, 3, v3i.f(jpu.a("trigger", i11.Companion.a()))), null, 2, null);
            } catch (NoClassDefFoundError unused) {
                rqVar = Companion.a();
            }
            rqVar2 = !sng.a(this.H, null, rqVar) ? this.H.get() : rqVar;
        }
        ckf.f(rqVar2, "builderBox");
        return rqVar2;
    }

    public final rq v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("c02fd4ff", new Object[]{this});
        }
        rq rqVar = this.f.get();
        if (rqVar == null) {
            rqVar = new rq(new hun("com.alibaba.ability.impl.modal.ModalAbility", 3, v3i.f(jpu.a("confirm", i11.Companion.b())), null, 8, null), null, 2, null);
            if (!sng.a(this.f, null, rqVar)) {
                rqVar = this.f.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq x() {
        rq rqVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("5ccd5ab1", new Object[]{this});
        }
        rq rqVar2 = this.i.get();
        if (rqVar2 == null) {
            try {
                rqVar = new rq(new qq(fpj.class, 3, v3i.f(jpu.a("setTitle", i11.Companion.b()))), null, 2, null);
            } catch (NoClassDefFoundError unused) {
                rqVar = Companion.a();
            }
            rqVar2 = !sng.a(this.i, null, rqVar) ? this.i.get() : rqVar;
        }
        ckf.f(rqVar2, "builderBox");
        return rqVar2;
    }

    public final rq B() {
        rq rqVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("788563cc", new Object[]{this});
        }
        rq rqVar2 = this.q.get();
        if (rqVar2 == null) {
            try {
                i11.a aVar = i11.Companion;
                rqVar = new rq(new qq(d2m.class, 3, kotlin.collections.a.j(jpu.a(d2m.API_SHOW_IRP, aVar.b()), jpu.a(d2m.API_CLOSE_IRP, aVar.b()))), null, 2, null);
            } catch (NoClassDefFoundError unused) {
                rqVar = Companion.a();
            }
            rqVar2 = !sng.a(this.q, null, rqVar) ? this.q.get() : rqVar;
        }
        ckf.f(rqVar2, "builderBox");
        return rqVar2;
    }

    public final rq I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("b6ab9aeb", new Object[]{this});
        }
        rq rqVar = this.m.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.alibaba.ability.impl.uttracker.UTTrackerAbility", 3, kotlin.collections.a.j(jpu.a(UTTrackerAbility.API_GET_PAGE_NAME, aVar.b()), jpu.a("subscribe", aVar.b()), jpu.a("unsubscribe", aVar.b())), null, 8, null), null, 2, null);
            if (!sng.a(this.m, null, rqVar)) {
                rqVar = this.m.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("93050e19", new Object[]{this});
        }
        rq rqVar = this.x.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.alibaba.ability.impl.websocket.WebSocketAbility", 3, kotlin.collections.a.j(jpu.a("connect", aVar.a()), jpu.a("send", aVar.a()), jpu.a("close", aVar.a())), null, 8, null), null, 2, null);
            if (!sng.a(this.x, null, rqVar)) {
                rqVar = this.x.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("c25ca99b", new Object[]{this});
        }
        rq rqVar = this.r.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.alibaba.ability.impl.actionsheet.ActionSheetAbility", 3, kotlin.collections.a.j(jpu.a("show", aVar.b()), jpu.a("hide", aVar.b())), null, 8, null), null, 2, null);
            if (!sng.a(this.r, null, rqVar)) {
                rqVar = this.r.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("65051923", new Object[]{this});
        }
        rq rqVar = this.f17403a.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.alibaba.ability.impl.localstorage.LocalStorageAbility", 1, kotlin.collections.a.j(jpu.a("get", aVar.a()), jpu.a("set", aVar.a()), jpu.a("remove", aVar.a())), null, 8, null), null, 2, null);
            if (!sng.a(this.f17403a, null, rqVar)) {
                rqVar = this.f17403a.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("99ed8b4b", new Object[]{this});
        }
        rq rqVar = this.u.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.alibaba.ability.impl.audio.AudioServiceAbility", 3, kotlin.collections.a.j(jpu.a("requestInfo", aVar.b()), jpu.a("play", aVar.b()), jpu.a("resume", aVar.b()), jpu.a("pause", aVar.b()), jpu.a("stop", aVar.b()), jpu.a("seek", aVar.b()), jpu.a("setEventListener", aVar.b()), jpu.a("requestProperties", aVar.b()), jpu.a("setProperties", aVar.b())), null, 8, null), null, 2, null);
            if (!sng.a(this.u, null, rqVar)) {
                rqVar = this.u.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("196d1768", new Object[]{this});
        }
        rq rqVar = this.b.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.alibaba.ability.impl.clipboard.ClipboardAbility", 3, kotlin.collections.a.j(jpu.a("set", aVar.a()), jpu.a("get", aVar.a())), null, 8, null), null, 2, null);
            if (!sng.a(this.b, null, rqVar)) {
                rqVar = this.b.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("263ebfd4", new Object[]{this});
        }
        rq rqVar = this.g.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.alibaba.ability.impl.device.Device", 3, kotlin.collections.a.j(jpu.a("getMediaVolume", aVar.a()), jpu.a("requestMediaVolume", aVar.a()), jpu.a("getInfo", aVar.a()), jpu.a("getScreenType", aVar.a()), jpu.a(NetworkAbility.API_GET_TYPE, aVar.a()), jpu.a("setMediaVolumeListener", aVar.a()), jpu.a("unsetMediaVolumeListener", aVar.a())), null, 8, null), null, 2, null);
            if (!sng.a(this.g, null, rqVar)) {
                rqVar = this.g.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("f0873be", new Object[]{this});
        }
        rq rqVar = this.s.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.alibaba.ability.impl.nativekeytracker.NativeKeyTrackerAbility", 3, kotlin.collections.a.j(jpu.a("subscribe", aVar.b()), jpu.a("unsubscribe", aVar.b())), null, 8, null), null, 2, null);
            if (!sng.a(this.s, null, rqVar)) {
                rqVar = this.s.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("6c0d382b", new Object[]{this});
        }
        rq rqVar = this.I.get();
        if (rqVar == null) {
            try {
                i11.a aVar = i11.Companion;
                rqVar = new rq(new qq(ze8.class, 3, kotlin.collections.a.j(jpu.a("get", aVar.a()), jpu.a("set", aVar.a()), jpu.a("remove", aVar.a()))), jfp.c("dx"));
            } catch (NoClassDefFoundError unused) {
                rqVar = Companion.a();
            }
            if (!sng.a(this.I, null, rqVar)) {
                rqVar = this.I.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("9c2aedc6", new Object[]{this});
        }
        rq rqVar = this.d.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.alibaba.ability.impl.mtop.MtopAbility", 3, kotlin.collections.a.j(jpu.a("send", aVar.a()), jpu.a(MtopAbility.API_REQUEST_DATA, aVar.a()), jpu.a(MtopAbility.API_ACCOUNT_SITE, aVar.a()), jpu.a(MtopAbility.API_PREFETCH_DATA, aVar.a()), jpu.a(MtopAbility.API_REQUEST_STREAM, aVar.a())), null, 8, null), null, 2, null);
            if (!sng.a(this.d, null, rqVar)) {
                rqVar = this.d.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("e2c80d7d", new Object[]{this});
        }
        rq rqVar = this.h.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.alibaba.ability.impl.nfc.NfcAbility", 3, kotlin.collections.a.j(jpu.a("subscribe", aVar.b()), jpu.a("checkStatus", aVar.b()), jpu.a(NfcAbility.API_UNSUBSCRIBE, aVar.b())), null, 8, null), null, 2, null);
            if (!sng.a(this.h, null, rqVar)) {
                rqVar = this.h.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("5ff36c82", new Object[]{this});
        }
        rq rqVar = this.y.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.alibaba.ability.impl.performance.PerformanceAbility", 3, kotlin.collections.a.j(jpu.a(PerformanceAbility.API_ADD_GLOBAL_WARNING_LISTENER, aVar.a()), jpu.a(PerformanceAbility.API_ADD_MEMORY_WARNING_LISTENER, aVar.a()), jpu.a(PerformanceAbility.API_ADD_CPU_WARNING_LISTENER, aVar.a()), jpu.a(PerformanceAbility.API_ADD_BATTERY_WARNING_LISTENER, aVar.a()), jpu.a(PerformanceAbility.API_REMOVE_GLOBAL_WARNING_LISTENER, aVar.a()), jpu.a(PerformanceAbility.API_REMOVE_MEMORY_WARNING_LISTENER, aVar.a()), jpu.a(PerformanceAbility.API_REMOVE_CPU_WARNING_LISTENER, aVar.a()), jpu.a(PerformanceAbility.API_REMOVE_BATTERY_WARNING_LISTENER, aVar.a()), jpu.a(PerformanceAbility.API_GET_MEMORY_INFO, aVar.a()), jpu.a(PerformanceAbility.API_GET_CPU_INFO, aVar.a()), jpu.a(PerformanceAbility.API_GET_BATTERY_INFO, aVar.a()), jpu.a(PerformanceAbility.API_GET_DEVICE_LEVEL, aVar.a())), null, 8, null), null, 2, null);
            if (!sng.a(this.y, null, rqVar)) {
                rqVar = this.y.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq C() {
        rq rqVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("61c4fb3a", new Object[]{this});
        }
        rq rqVar2 = this.v.get();
        if (rqVar2 == null) {
            try {
                i11.a aVar = i11.Companion;
                rqVar = new rq(new hun("com.taobao.tao.powermsg.outter.PowerMsgAbility", 3, kotlin.collections.a.j(jpu.a("query", aVar.a()), jpu.a("send", aVar.a()), jpu.a(PowerMsgAbility.API_ADD_EVENT_LISTENER, aVar.a()), jpu.a(PowerMsgAbility.API_REMOVE_EVENT_LISTENER, aVar.a()), jpu.a(PowerMsgAbility.API_PRE_CONNECT, aVar.a())), "com.taobao.android.abilityidl.ability.PowerMsgAbilityWrapper"), null, 2, null);
            } catch (NoClassDefFoundError unused) {
                rqVar = Companion.a();
            }
            rqVar2 = !sng.a(this.v, null, rqVar) ? this.v.get() : rqVar;
        }
        ckf.f(rqVar2, "builderBox");
        return rqVar2;
    }

    public final rq F() {
        rq rqVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("18a5b564", new Object[]{this});
        }
        rq rqVar2 = this.j.get();
        if (rqVar2 == null) {
            try {
                i11.a aVar = i11.Companion;
                rqVar = new rq(new qq(FirstChunkCacheAbility.class, 3, kotlin.collections.a.j(jpu.a("setFirstChunkCache", aVar.b()), jpu.a("removeFirstChunkCache", aVar.b()), jpu.a("prerender", aVar.b()), jpu.a("preloadFirstChunk", aVar.a()), jpu.a("preload", aVar.a()))), null, 2, null);
            } catch (NoClassDefFoundError unused) {
                rqVar = Companion.a();
            }
            rqVar2 = !sng.a(this.j, null, rqVar) ? this.j.get() : rqVar;
        }
        ckf.f(rqVar2, "builderBox");
        return rqVar2;
    }

    public final rq G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("3764b2ac", new Object[]{this});
        }
        rq rqVar = this.e.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.alibaba.ability.impl.stdpop.StdPopAbility", 3, kotlin.collections.a.j(jpu.a(StdPopAbility.API_CHG_SIZE, aVar.b()), jpu.a("close", aVar.b()), jpu.a(StdPopAbility.API_DX, aVar.b()), jpu.a(StdPopAbility.API_H5, aVar.b()), jpu.a(StdPopAbility.API_NATIVE, aVar.b()), jpu.a(StdPopAbility.API_STD_DX, aVar.b()), jpu.a(StdPopAbility.API_ULTRON, aVar.b()), jpu.a(StdPopAbility.API_WEEX, aVar.b()), jpu.a(StdPopAbility.API_WEEX2, aVar.b()), jpu.a(StdPopAbility.API_CONFIG_CORNER, aVar.b())), null, 8, null), null, 2, null);
            if (!sng.a(this.e, null, rqVar)) {
                rqVar = this.e.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq k() {
        rq rqVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("d2a35c69", new Object[]{this});
        }
        rq rqVar2 = this.z.get();
        if (rqVar2 == null) {
            try {
                i11.a aVar = i11.Companion;
                rqVar = new rq(new qq(pu2.class, 3, kotlin.collections.a.j(jpu.a(iu2.CALENDAR_EVENT_ADD, aVar.b()), jpu.a(iu2.CALENDAR_EVENT_QUERY, aVar.b()), jpu.a(iu2.CALENDAR_EVENT_REMOVE, aVar.b()))), null, 2, null);
            } catch (NoClassDefFoundError unused) {
                rqVar = Companion.a();
            }
            rqVar2 = !sng.a(this.z, null, rqVar) ? this.z.get() : rqVar;
        }
        ckf.f(rqVar2, "builderBox");
        return rqVar2;
    }

    public final rq q() {
        cwy cwyVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("f08fef7a", new Object[]{this});
        }
        rq rqVar = this.F.get();
        if (rqVar == null) {
            try {
                i11.a aVar = i11.Companion;
                cwyVar = this;
                rqVar = new rq(new qq(FileAbility.class, 3, kotlin.collections.a.k(jpu.a(FileAbility.API_EXISTS, aVar.b()), jpu.a(FileAbility.API_GET_DIR_INFO, aVar.b()), jpu.a(FileAbility.API_MAKE_DIR, aVar.b()), jpu.a(FileAbility.API_REMOVE_DIR, aVar.b()), jpu.a(FileAbility.API_READ_AS_STRING, aVar.b()), jpu.a(FileAbility.API_READ_AS_ARRAY_BUFFER, aVar.b()), jpu.a(FileAbility.API_COPY_FILE, aVar.b()), jpu.a(FileAbility.API_WRITE_FILE, aVar.b()), jpu.a(FileAbility.API_APPEND_FILE, aVar.b()), jpu.a(FileAbility.API_REMOVE_FILE, aVar.b()), jpu.a(FileAbility.API_GET_FILE_INFO, aVar.b()), jpu.a(FileAbility.API_RENAME, aVar.b()), jpu.a(FileAbility.API_UNZIP, aVar.b()))), jfp.c(TMSCalendarBridge.namespace));
            } catch (NoClassDefFoundError unused) {
                rqVar = Companion.a();
                cwyVar = this;
            }
            if (!sng.a(cwyVar.F, null, rqVar)) {
                rqVar = cwyVar.F.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("89db72f0", new Object[]{this});
        }
        rq rqVar = this.p.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.alibaba.ability.impl.hapticsengine.HapticsEngineAbility", 3, kotlin.collections.a.j(jpu.a(HapticsEngineAbility.API_IMPACT_LIGHT, aVar.b()), jpu.a(HapticsEngineAbility.API_IMPACT_MEDIUM, aVar.b()), jpu.a(HapticsEngineAbility.API_IMPACT_HEAVY, aVar.b()), jpu.a(HapticsEngineAbility.API_IMPACT_SOFT, aVar.b()), jpu.a(HapticsEngineAbility.API_IMPACT_RIGID, aVar.b()), jpu.a(HapticsEngineAbility.API_NOTIFICATION_SUCCESS, aVar.b()), jpu.a(HapticsEngineAbility.API_NOTIFICATION_WARNING, aVar.b()), jpu.a(HapticsEngineAbility.API_NOTIFICATION_ERROR, aVar.b()), jpu.a(HapticsEngineAbility.API_SELECTION_CHANGE, aVar.b()), jpu.a(HapticsEngineAbility.API_VIBRATE, aVar.b()), jpu.a("cancel", aVar.b())), null, 8, null), null, 2, null);
            if (!sng.a(this.p, null, rqVar)) {
                rqVar = this.p.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("12009aad", new Object[]{this});
        }
        rq rqVar = this.B.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.alibaba.ability.impl.photo.PhotoAbility", 3, kotlin.collections.a.j(jpu.a("takeFromPhotoLibrary", aVar.b()), jpu.a("takeFromCamera", aVar.b()), jpu.a("takeFromScreen", aVar.b()), jpu.a("saveToAlbum", aVar.b())), "com.taobao.android.abilityidl.ability.PhotoAbilityWrapper"), null, 2, null);
            if (!sng.a(this.B, null, rqVar)) {
                rqVar = this.B.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("321cea80", new Object[]{this});
        }
        rq rqVar = this.k.get();
        if (rqVar == null) {
            try {
                i11.a aVar = i11.Companion;
                rqVar = new rq(new qq(NetworkAbility.class, 3, kotlin.collections.a.j(jpu.a(NetworkAbility.API_GET_NETWORK_STATUS, aVar.a()), jpu.a(NetworkAbility.API_REGISTER_NETWORK_LISTENER, aVar.a()), jpu.a(NetworkAbility.API_GET_TYPE, aVar.a()), jpu.a(NetworkAbility.API_ADD_TYPE_EVENT_LISTENER, aVar.a()), jpu.a(NetworkAbility.API_GET_QUALITY_LEVEL, aVar.a()), jpu.a(NetworkAbility.API_ADD_QUALITY_EVENT_LISTENER, aVar.a()), jpu.a(NetworkAbility.API_GET_DOWNLINK, aVar.a()), jpu.a(NetworkAbility.API_GET_PREDICT_DOWNLINK, aVar.a()), jpu.a(NetworkAbility.API_REMOVE_TYPE_EVENT_LISTENER, aVar.a()), jpu.a(NetworkAbility.API_REMOVE_QUALITY_EVENT_LISTENER, aVar.a()))), null, 2, null);
            } catch (NoClassDefFoundError unused) {
                rqVar = Companion.a();
            }
            if (!sng.a(this.k, null, rqVar)) {
                rqVar = this.k.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }
}
