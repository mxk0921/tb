package tb;

import com.alibaba.ability.impl.nfc.NfcAbility;
import com.alibaba.ability.impl.rocketbundle.RocketBundleAbility;
import com.alibaba.ability.localization.Localization;
import com.alibaba.ability.utils.MegaTrace;
import com.alibaba.alibity.container.file.FileAbility;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.AttributionReporter;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import com.taobao.android.layoutmanager.setup.WindvanePluginRegister;
import com.taobao.android.opencart.weex.DismissPopWeexModule;
import com.taobao.mytaobao.newsetting.GeneralSetting;
import com.taobao.runtimepermission.api.TBRunTimePermission;
import com.taobao.tao.flexbox.layoutmanager.container.dx.DxContainerActivity;
import com.taobao.tao.powermsg.outter.PowerMsgAbility;
import com.taobao.weex.adapter.IWXUserTrackAdapter;
import com.uc.webview.export.media.CommandID;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.a;
import tb.i11;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class eey implements mdb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final mdb x0;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference<rq> f18522a = new AtomicReference<>();
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
    public final AtomicReference<rq> K = new AtomicReference<>();
    public final AtomicReference<rq> L = new AtomicReference<>();
    public final AtomicReference<rq> M = new AtomicReference<>();
    public final AtomicReference<rq> N = new AtomicReference<>();
    public final AtomicReference<rq> O = new AtomicReference<>();
    public final AtomicReference<rq> P = new AtomicReference<>();
    public final AtomicReference<rq> Q = new AtomicReference<>();
    public final AtomicReference<rq> R = new AtomicReference<>();
    public final AtomicReference<rq> S = new AtomicReference<>();
    public final AtomicReference<rq> T = new AtomicReference<>();
    public final AtomicReference<rq> U = new AtomicReference<>();
    public final AtomicReference<rq> V = new AtomicReference<>();
    public final AtomicReference<rq> W = new AtomicReference<>();
    public final AtomicReference<rq> X = new AtomicReference<>();
    public final AtomicReference<rq> Y = new AtomicReference<>();
    public final AtomicReference<rq> Z = new AtomicReference<>();
    public final AtomicReference<rq> a0 = new AtomicReference<>();
    public final AtomicReference<rq> b0 = new AtomicReference<>();
    public final AtomicReference<rq> c0 = new AtomicReference<>();
    public final AtomicReference<rq> d0 = new AtomicReference<>();
    public final AtomicReference<rq> e0 = new AtomicReference<>();
    public final AtomicReference<rq> f0 = new AtomicReference<>();
    public final AtomicReference<rq> g0 = new AtomicReference<>();
    public final AtomicReference<rq> h0 = new AtomicReference<>();
    public final AtomicReference<rq> i0 = new AtomicReference<>();
    public final AtomicReference<rq> j0 = new AtomicReference<>();
    public final AtomicReference<rq> k0 = new AtomicReference<>();
    public final AtomicReference<rq> l0 = new AtomicReference<>();
    public final AtomicReference<rq> m0 = new AtomicReference<>();
    public final AtomicReference<rq> n0 = new AtomicReference<>();
    public final AtomicReference<rq> o0 = new AtomicReference<>();
    public final AtomicReference<rq> p0 = new AtomicReference<>();
    public final AtomicReference<rq> q0 = new AtomicReference<>();
    public final AtomicReference<rq> y0 = new AtomicReference<>();
    public final AtomicReference<rq> r0 = new AtomicReference<>();
    public final AtomicReference<rq> s0 = new AtomicReference<>();
    public final AtomicReference<rq> t0 = new AtomicReference<>();
    public final AtomicReference<rq> u0 = new AtomicReference<>();
    public final AtomicReference<rq> v0 = new AtomicReference<>();
    public final AtomicReference<rq> w0 = new AtomicReference<>();

    static {
        t2o.a(524288004);
        t2o.a(144703546);
    }

    public eey(mdb mdbVar) {
        this.x0 = mdbVar;
    }

    public final rq C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("c1927da8", new Object[]{this});
        }
        rq rqVar = this.B.get();
        if (rqVar == null) {
            rqVar = new rq(new hun("com.alibaba.ability.impl.file.FilePickerAbility", 3, v3i.f(jpu.a("open", i11.Companion.b())), "com.taobao.android.abilityidl.ability.FilePickerAbilityWrapper"), null, 2, null);
            if (!sng.a(this.B, null, rqVar)) {
                rqVar = this.B.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("406ac951", new Object[]{this});
        }
        rq rqVar = this.C.get();
        if (rqVar == null) {
            rqVar = new rq(new hun("com.taobao.mytaobao.footprint.FootprintAbility", 3, v3i.f(jpu.a("requestFootprintList", i11.Companion.a())), "com.taobao.android.abilityidl.ability.FootprintAbilityWrapper"), null, 2, null);
            if (!sng.a(this.C, null, rqVar)) {
                rqVar = this.C.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("dab2e020", new Object[]{this});
        }
        rq rqVar = this.E.get();
        if (rqVar == null) {
            rqVar = new rq(new hun("com.taobao.uikit.actionbar.ShowMenuAbility", 3, v3i.f(jpu.a("show", i11.Companion.b())), "com.taobao.android.abilityidl.ability.GlobalMenuAbilityWrapper"), null, 2, null);
            if (!sng.a(this.E, null, rqVar)) {
                rqVar = this.E.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("76fdc287", new Object[]{this});
        }
        rq rqVar = this.F.get();
        if (rqVar == null) {
            rqVar = new rq(new hun("com.taobao.android.hudong.TBHDUserIntentAbility", 3, v3i.f(jpu.a("trigger", i11.Companion.b())), "com.taobao.android.abilityidl.ability.HDUserIntentAnalyzerAbilityWrapper"), null, 2, null);
            if (!sng.a(this.F, null, rqVar)) {
                rqVar = this.F.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("34a9e0d9", new Object[]{this});
        }
        rq rqVar = this.G.get();
        if (rqVar == null) {
            rqVar = new rq(new hun("com.alibaba.ability.impl.http_request.HttpRequestAbility", 3, v3i.f(jpu.a("send", i11.Companion.a())), "com.taobao.android.abilityidl.ability.HTTPRequestAbilityWrapper"), null, 2, null);
            if (!sng.a(this.G, null, rqVar)) {
                rqVar = this.G.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("10cd024a", new Object[]{this});
        }
        rq rqVar = this.P.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.taobao.alimama.mega.MunionAbility", 3, a.j(jpu.a("commitIFSTrack", aVar.a()), jpu.a("generateClickIdBy", aVar.a()), jpu.a("commitTaokeTrack", aVar.a()), jpu.a("commitInteractTrack", aVar.a()), jpu.a("handleAdUrl", aVar.a())), "com.taobao.android.abilityidl.ability.MunionMonitorAbilityWrapper"), null, 2, null);
            if (!sng.a(this.P, null, rqVar)) {
                rqVar = this.P.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("9c9d7688", new Object[]{this});
        }
        rq rqVar = this.U.get();
        if (rqVar == null) {
            rqVar = new rq(new hun("com.taobao.android.opencart.ability.OpenCartMegaAbility", 3, v3i.f(jpu.a("addBag", i11.Companion.a())), "com.taobao.android.abilityidl.ability.OpenCartAbilityWrapper"), null, 2, null);
            if (!sng.a(this.U, null, rqVar)) {
                rqVar = this.U.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("4a093ea9", new Object[]{this});
        }
        rq rqVar = this.V.get();
        if (rqVar == null) {
            rqVar = new rq(new hun("com.taobao.themis.open.mega.TMSOpenContainerAbility", 3, v3i.f(jpu.a("preLoadAppInfo", i11.Companion.a())), "com.taobao.android.abilityidl.ability.OpenContainerAbilityWrapper"), null, 2, null);
            if (!sng.a(this.V, null, rqVar)) {
                rqVar = this.V.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("c404f05a", new Object[]{this});
        }
        rq rqVar = this.W.get();
        if (rqVar == null) {
            rqVar = new rq(new hun("com.taobao.themis.canvas.mega.TMSOpenGameAbility", 3, v3i.f(jpu.a("onFirstFrame", i11.Companion.a())), "com.taobao.android.abilityidl.ability.OpenGameAbilityWrapper"), jfp.c("canvas"));
            if (!sng.a(this.W, null, rqVar)) {
                rqVar = this.W.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("5dd4b3ac", new Object[]{this});
        }
        rq rqVar = this.X.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.alibaba.ability.impl.orange.OrangeAbility", 3, a.j(jpu.a("get", aVar.a()), jpu.a("getStandardGroup", aVar.a()), jpu.a("getCustomGroup", aVar.a()), jpu.a("getIndexAndConfigs", aVar.a()), jpu.a("downloadConfigWithParams", aVar.a())), "com.taobao.android.abilityidl.ability.OrangeAbilityWrapper"), null, 2, null);
            if (!sng.a(this.X, null, rqVar)) {
                rqVar = this.X.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("e02d8c31", new Object[]{this});
        }
        rq rqVar = this.f18522a.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.alibaba.ability.impl.abtest.ABTestAbility", 3, a.j(jpu.a("getVariation", aVar.a()), jpu.a("getVariationAndExperimentInfo", aVar.a())), "com.taobao.android.abilityidl.ability.ABTestAbilityWrapper"), null, 2, null);
            if (!sng.a(this.f18522a, null, rqVar)) {
                rqVar = this.f18522a.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("ee446c15", new Object[]{this});
        }
        rq rqVar = this.d0.get();
        if (rqVar == null) {
            rqVar = new rq(new hun("com.taobao.privacyguard.minors.MegaPrivacyComplianceAbility", 3, v3i.f(jpu.a("requestMinorsStatus", i11.Companion.a())), "com.taobao.android.abilityidl.ability.PrivacyComplianceAbilityWrapper"), null, 2, null);
            if (!sng.a(this.d0, null, rqVar)) {
                rqVar = this.d0.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("3f751b2e", new Object[]{this});
        }
        rq rqVar = this.f.get();
        if (rqVar == null) {
            rqVar = new rq(new hun("com.alibaba.ability.impl.alert.AlertAbility", 3, v3i.f(jpu.a("show", i11.Companion.b())), "com.taobao.android.abilityidl.ability.AlertAbilityWrapper"), null, 2, null);
            if (!sng.a(this.f, null, rqVar)) {
                rqVar = this.f.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    @Override // tb.mdb
    public idb get(String str, String str2, String str3) {
        idb idbVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (idb) ipChange.ipc$dispatch("1c2b338c", new Object[]{this, str, str2, str3});
        }
        ckf.g(str, "name");
        ckf.g(str2, "namespace");
        ckf.g(str3, "businessId");
        dud j = cjf.INSTANCE.j();
        if (j == null || (idbVar = j.e(str)) == null) {
            mdb mdbVar = this.x0;
            if (mdbVar != null) {
                idbVar = mdbVar.get(str, str2, str3);
            } else {
                idbVar = null;
            }
        }
        if (idbVar != null) {
            return idbVar;
        }
        rq m = m(str);
        if (m != null) {
            return m.a(str2);
        }
        return null;
    }

    public final rq h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("864eb808", new Object[]{this});
        }
        rq rqVar = this.g0.get();
        if (rqVar == null) {
            rqVar = new rq(new hun("com.taobao.taobao.scancode.uniapi.TBScanCodeAbility", 3, v3i.f(jpu.a("scan", i11.Companion.b())), "com.taobao.android.abilityidl.ability.ScanCodeAbilityWrapper"), null, 2, null);
            if (!sng.a(this.g0, null, rqVar)) {
                rqVar = this.g0.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("c740cbf7", new Object[]{this});
        }
        rq rqVar = this.i.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.alibaba.ability.utimpl.AppMonitorAbility", 3, a.j(jpu.a("alarmSuccess", aVar.a()), jpu.a("alarmFail", aVar.a()), jpu.a(IWXUserTrackAdapter.COUNTER, aVar.a())), "com.taobao.android.abilityidl.ability.AppMonitorAbilityWrapper"), null, 2, null);
            if (!sng.a(this.i, null, rqVar)) {
                rqVar = this.i.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final rq m(String str) {
        rq rqVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("ec3de9e8", new Object[]{this, str});
        }
        MegaTrace megaTrace = MegaTrace.INSTANCE;
        megaTrace.b("AbilityMap#getBuilderBox");
        switch (str.hashCode()) {
            case -2059366032:
                if (str.equals("StepCounter")) {
                    rqVar = m0();
                    break;
                }
                rqVar = null;
                break;
            case -1968730096:
                if (str.equals("NavBar")) {
                    rqVar = R();
                    break;
                }
                rqVar = null;
                break;
            case -1926142983:
                if (str.equals("appMonitor")) {
                    rqVar = i();
                    break;
                }
                rqVar = null;
                break;
            case -1924984242:
                if (str.equals("Orange")) {
                    rqVar = Y();
                    break;
                }
                rqVar = null;
                break;
            case -1841265815:
                if (str.equals("Router")) {
                    rqVar = g0();
                    break;
                }
                rqVar = null;
                break;
            case -1792596402:
                if (str.equals("ClientPrerender")) {
                    rqVar = q();
                    break;
                }
                rqVar = null;
                break;
            case -1618876223:
                if (str.equals("broadcast")) {
                    rqVar = l();
                    break;
                }
                rqVar = null;
                break;
            case -1351342685:
                if (str.equals("PrivacyCompliance")) {
                    rqVar = e0();
                    break;
                }
                rqVar = null;
                break;
            case -1312436479:
                if (str.equals("tinyApp")) {
                    rqVar = p0();
                    break;
                }
                rqVar = null;
                break;
            case -1255887535:
                if (str.equals("ErrorViewWidget")) {
                    rqVar = x();
                    break;
                }
                rqVar = null;
                break;
            case -1182873450:
                if (str.equals("AliUploadService")) {
                    rqVar = g();
                    break;
                }
                rqVar = null;
                break;
            case -970175392:
                if (str.equals("TradeHybrid")) {
                    rqVar = r0();
                    break;
                }
                rqVar = null;
                break;
            case -909811481:
                if (str.equals("HTTPRequest")) {
                    rqVar = H();
                    break;
                }
                rqVar = null;
                break;
            case -907689876:
                if (str.equals("screen")) {
                    rqVar = i0();
                    break;
                }
                rqVar = null;
                break;
            case -887328209:
                if (str.equals("system")) {
                    rqVar = n0();
                    break;
                }
                rqVar = null;
                break;
            case -850530672:
                if (str.equals("kvStorage")) {
                    rqVar = J();
                    break;
                }
                rqVar = null;
                break;
            case -826358230:
                if (str.equals("ScanCode")) {
                    rqVar = h0();
                    break;
                }
                rqVar = null;
                break;
            case -783253038:
                if (str.equals("NextRPC")) {
                    rqVar = T();
                    break;
                }
                rqVar = null;
                break;
            case -647685447:
                if (str.equals(Localization.LOG_MODULE)) {
                    rqVar = M();
                    break;
                }
                rqVar = null;
                break;
            case -596330166:
                if (str.equals("FilePicker")) {
                    rqVar = C();
                    break;
                }
                rqVar = null;
                break;
            case -517618225:
                if (str.equals(AttributionReporter.SYSTEM_PERMISSION)) {
                    rqVar = a0();
                    break;
                }
                rqVar = null;
                break;
            case -502807437:
                if (str.equals("Contacts")) {
                    rqVar = r();
                    break;
                }
                rqVar = null;
                break;
            case -470505191:
                if (str.equals("AudioContext")) {
                    rqVar = j();
                    break;
                }
                rqVar = null;
                break;
            case -440515414:
                if (str.equals(DismissPopWeexModule.MODULE_NAME)) {
                    rqVar = V();
                    break;
                }
                rqVar = null;
                break;
            case -440396420:
                if (str.equals("OpenGame")) {
                    rqVar = X();
                    break;
                }
                rqVar = null;
                break;
            case -352187102:
                if (str.equals("OrangeListener")) {
                    rqVar = Z();
                    break;
                }
                rqVar = null;
                break;
            case -262361259:
                if (str.equals("Downloader")) {
                    rqVar = v();
                    break;
                }
                rqVar = null;
                break;
            case -86156914:
                if (str.equals("CLDRFormat")) {
                    rqVar = n();
                    break;
                }
                rqVar = null;
                break;
            case -53032474:
                if (str.equals("PopCenter")) {
                    rqVar = c0();
                    break;
                }
                rqVar = null;
                break;
            case 3743:
                if (str.equals(BHRTaskConfigBase.TYPE_CONFIG_UT)) {
                    rqVar = w0();
                    break;
                }
                rqVar = null;
                break;
            case 65022:
                if (str.equals("APM")) {
                    rqVar = b();
                    break;
                }
                rqVar = null;
                break;
            case 81514:
                if (str.equals("RUM")) {
                    rqVar = f0();
                    break;
                }
                rqVar = null;
                break;
            case 83801:
                if (str.equals("UBF")) {
                    rqVar = s0();
                    break;
                }
                rqVar = null;
                break;
            case 96801:
                if (str.equals("app")) {
                    rqVar = h();
                    break;
                }
                rqVar = null;
                break;
            case 107332:
                if (str.equals("log")) {
                    rqVar = O();
                    break;
                }
                rqVar = null;
                break;
            case 2092864:
                if (str.equals("Cart")) {
                    rqVar = p();
                    break;
                }
                rqVar = null;
                break;
            case 2155139:
                if (str.equals("Edlp")) {
                    rqVar = w();
                    break;
                }
                rqVar = null;
                break;
            case 2189724:
                if (str.equals("File")) {
                    rqVar = B();
                    break;
                }
                rqVar = null;
                break;
            case 2464362:
                if (str.equals("Open")) {
                    rqVar = U();
                    break;
                }
                rqVar = null;
                break;
            case 2988050:
                if (str.equals("accs")) {
                    rqVar = d();
                    break;
                }
                rqVar = null;
                break;
            case 3599307:
                if (str.equals("user")) {
                    rqVar = u0();
                    break;
                }
                rqVar = null;
                break;
            case 63347004:
                if (str.equals("Alert")) {
                    rqVar = f();
                    break;
                }
                rqVar = null;
                break;
            case 67643165:
                if (str.equals("Falco")) {
                    rqVar = z();
                    break;
                }
                rqVar = null;
                break;
            case 80774569:
                if (str.equals("Theme")) {
                    rqVar = o0();
                    break;
                }
                rqVar = null;
                break;
            case 106642994:
                if (str.equals("photo")) {
                    rqVar = b0();
                    break;
                }
                rqVar = null;
                break;
            case 110532135:
                if (str.equals("toast")) {
                    rqVar = q0();
                    break;
                }
                rqVar = null;
                break;
            case 122977368:
                if (str.equals("MunionMonitor")) {
                    rqVar = Q();
                    break;
                }
                rqVar = null;
                break;
            case 216262967:
                if (str.equals("OpenContainer")) {
                    rqVar = W();
                    break;
                }
                rqVar = null;
                break;
            case 332062641:
                if (str.equals("WidgetService")) {
                    rqVar = x0();
                    break;
                }
                rqVar = null;
                break;
            case 336650556:
                if (str.equals("loading")) {
                    rqVar = L();
                    break;
                }
                rqVar = null;
                break;
            case 444398093:
                if (str.equals("ImagePreview")) {
                    rqVar = I();
                    break;
                }
                rqVar = null;
                break;
            case 516961236:
                if (str.equals(mtv.PAGE_NAME_ADDRESS)) {
                    rqVar = e();
                    break;
                }
                rqVar = null;
                break;
            case 680049882:
                if (str.equals("SessionKVStorage")) {
                    rqVar = j0();
                    break;
                }
                rqVar = null;
                break;
            case 752822871:
                if (str.equals("navigator")) {
                    rqVar = S();
                    break;
                }
                rqVar = null;
                break;
            case 858541116:
                if (str.equals("powerMsg")) {
                    rqVar = d0();
                    break;
                }
                rqVar = null;
                break;
            case 885286011:
                if (str.equals("MEMKVStorage")) {
                    rqVar = P();
                    break;
                }
                rqVar = null;
                break;
            case 1098210645:
                if (str.equals("SpeechRecognition")) {
                    rqVar = l0();
                    break;
                }
                rqVar = null;
                break;
            case 1103756662:
                if (str.equals("CacheTracker")) {
                    rqVar = o();
                    break;
                }
                rqVar = null;
                break;
            case 1115434428:
                if (str.equals("Favorite")) {
                    rqVar = A();
                    break;
                }
                rqVar = null;
                break;
            case 1134485442:
                if (str.equals("GlobalMenu")) {
                    rqVar = F();
                    break;
                }
                rqVar = null;
                break;
            case 1178114853:
                if (str.equals("userKVStorage")) {
                    rqVar = v0();
                    break;
                }
                rqVar = null;
                break;
            case 1335853252:
                if (str.equals("TradePay")) {
                    rqVar = y0();
                    break;
                }
                rqVar = null;
                break;
            case 1367235295:
                if (str.equals("Footprint")) {
                    rqVar = D();
                    break;
                }
                rqVar = null;
                break;
            case 1397617949:
                if (str.equals("UmiPrivatePublish")) {
                    rqVar = t0();
                    break;
                }
                rqVar = null;
                break;
            case 1436297705:
                if (str.equals("BehaviX")) {
                    rqVar = k();
                    break;
                }
                rqVar = null;
                break;
            case 1449607721:
                if (str.equals("HDUserIntentAnalyzer")) {
                    rqVar = G();
                    break;
                }
                rqVar = null;
                break;
            case 1496834095:
                if (str.equals("Accelerometer")) {
                    rqVar = c();
                    break;
                }
                rqVar = null;
                break;
            case 1593011297:
                if (str.equals("Container")) {
                    rqVar = s();
                    break;
                }
                rqVar = null;
                break;
            case 1628674167:
                if (str.equals("SharePannel")) {
                    rqVar = k0();
                    break;
                }
                rqVar = null;
                break;
            case 1672091434:
                if (str.equals("LifeCycle")) {
                    rqVar = K();
                    break;
                }
                rqVar = null;
                break;
            case 1845302376:
                if (str.equals(GeneralSetting.TAG)) {
                    rqVar = E();
                    break;
                }
                rqVar = null;
                break;
            case 1901043637:
                if (str.equals("location")) {
                    rqVar = N();
                    break;
                }
                rqVar = null;
                break;
            case 1923500580:
                if (str.equals("ContentCommission")) {
                    rqVar = t();
                    break;
                }
                rqVar = null;
                break;
            case 1924450387:
                if (str.equals("ABTest")) {
                    rqVar = a();
                    break;
                }
                rqVar = null;
                break;
            case 2043610225:
                if (str.equals("Detail")) {
                    rqVar = u();
                    break;
                }
                rqVar = null;
                break;
            case 2107661555:
                if (str.equals("Executor")) {
                    rqVar = y();
                    break;
                }
                rqVar = null;
                break;
            default:
                rqVar = null;
                break;
        }
        megaTrace.e();
        return rqVar;
    }

    public final rq n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("1f89bfec", new Object[]{this});
        }
        rq rqVar = this.m.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.taobao.android.ovs.CLDRFormatAbility", 3, a.j(jpu.a("getFormatDate", aVar.a()), jpu.a("getFormatTime", aVar.a()), jpu.a("getFormatDateTime", aVar.a()), jpu.a("getFormatCustomDateTime", aVar.a()), jpu.a("getFormatNumber", aVar.a())), "com.taobao.android.abilityidl.ability.CLDRFormatAbilityWrapper"), null, 2, null);
            if (!sng.a(this.m, null, rqVar)) {
                rqVar = this.m.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("3a3afa54", new Object[]{this});
        }
        rq rqVar = this.n.get();
        if (rqVar == null) {
            rqVar = new rq(new hun("com.taobao.themis.web.cache.CacheTrackerAbility", 3, v3i.f(jpu.a("report", i11.Companion.b())), "com.taobao.android.abilityidl.ability.CacheTrackerAbilityWrapper"), null, 2, null);
            if (!sng.a(this.n, null, rqVar)) {
                rqVar = this.n.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("45ce6d79", new Object[]{this});
        }
        rq rqVar = this.p0.get();
        if (rqVar == null) {
            rqVar = new rq(new hun("com.alibaba.ability.impl.toast.ToastAbility", 3, v3i.f(jpu.a("show", i11.Companion.b())), "com.taobao.android.abilityidl.ability.ToastAbilityWrapper"), null, 2, null);
            if (!sng.a(this.p0, null, rqVar)) {
                rqVar = this.p0.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("a4e7116", new Object[]{this});
        }
        rq rqVar = this.s.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.taobao.taolive.sdk.business.commission.ContentCommissionService", 3, a.j(jpu.a("commitContentCommissionTrack", aVar.a()), jpu.a("commitOuterCommissionTrack", aVar.a()), jpu.a("commitLiveCommissionTrack", aVar.a())), "com.taobao.android.abilityidl.ability.ContentCommissionAbilityWrapper"), null, 2, null);
            if (!sng.a(this.s, null, rqVar)) {
                rqVar = this.s.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("34435933", new Object[]{this});
        }
        rq rqVar = this.u.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.alibaba.ability.impl.downloader.DownloaderAbility", 3, a.j(jpu.a("download", aVar.a()), jpu.a("cancel", aVar.a())), "com.taobao.android.abilityidl.ability.DownloaderAbilityWrapper"), null, 2, null);
            if (!sng.a(this.u, null, rqVar)) {
                rqVar = this.u.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq x0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("6839b223", new Object[]{this});
        }
        rq rqVar = this.w0.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.taobao.desktop.widget.jsbridge.WidgetServiceNextAbility", 3, a.j(jpu.a("isSupported", aVar.a()), jpu.a("isInstalled", aVar.a()), jpu.a("addWidget", aVar.a()), jpu.a("editWidget", aVar.a())), "com.taobao.android.abilityidl.ability.WidgetServiceAbilityWrapper"), null, 2, null);
            if (!sng.a(this.w0, null, rqVar)) {
                rqVar = this.w0.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("98165351", new Object[]{this});
        }
        rq rqVar = this.x.get();
        if (rqVar == null) {
            rqVar = new rq(new hun("com.alibaba.ability.impl.executor.BatchExecutorAbility", 3, v3i.f(jpu.a("batchExecute", i11.Companion.a())), "com.taobao.android.abilityidl.ability.ExecutorAbilityWrapper"), null, 2, null);
            if (!sng.a(this.x, null, rqVar)) {
                rqVar = this.x.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("aaff398f", new Object[]{this});
        }
        rq rqVar = this.y.get();
        if (rqVar == null) {
            rqVar = new rq(new hun("com.taobao.falco.mega.FalcoAbility", 3, v3i.f(jpu.a("updateScreenshotMonitorParams", i11.Companion.a())), "com.taobao.android.abilityidl.ability.FalcoAbilityWrapper"), null, 2, null);
            if (!sng.a(this.y, null, rqVar)) {
                rqVar = this.y.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("4a6a8b1c", new Object[]{this});
        }
        rq rqVar = this.J.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.taobao.themis.ability.basic.lifecycle.TMSLifeCycleAbility", 3, a.j(jpu.a("addPageLifeCycleListener", aVar.b()), jpu.a("removePageLifeCycleListener", aVar.b())), "com.taobao.android.abilityidl.ability.LifeCycleAbilityWrapper"), kfp.h("weex", "windvane", "canvas"));
            if (!sng.a(this.J, null, rqVar)) {
                rqVar = this.J.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("89deb88e", new Object[]{this});
        }
        rq rqVar = this.K.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.alibaba.ability.impl.loading.LoadingAbility", 3, a.j(jpu.a("show", aVar.b()), jpu.a("hide", aVar.b())), "com.taobao.android.abilityidl.ability.LoadingAbilityWrapper"), null, 2, null);
            if (!sng.a(this.K, null, rqVar)) {
                rqVar = this.K.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("d60aab33", new Object[]{this});
        }
        rq rqVar = this.M.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.alibaba.ability.impl.location.LocationAbility", 3, a.j(jpu.a("request", aVar.a()), jpu.a("getCache", aVar.a())), "com.taobao.android.abilityidl.ability.LocationAbilityWrapper"), null, 2, null);
            if (!sng.a(this.M, null, rqVar)) {
                rqVar = this.M.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("8b534748", new Object[]{this});
        }
        rq rqVar = this.T.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.taobao.themis.open.mega.TMSOpenAbility", 3, a.j(jpu.a("loadSubPackage", aVar.a()), jpu.a("check", aVar.a()), jpu.a("checkAuth", aVar.a()), jpu.a("getAuthorize", aVar.a()), jpu.a("getSetting", aVar.a()), jpu.a("getAuthTokenInfo", aVar.a()), jpu.a("clearAccessToken", aVar.a())), "com.taobao.android.abilityidl.ability.OpenAbilityWrapper"), kfp.h("widget", "miniapp", "canvas"));
            if (!sng.a(this.T, null, rqVar)) {
                rqVar = this.T.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("10fd6280", new Object[]{this});
        }
        rq rqVar = this.Y.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.alibaba.ability.impl.orange.OrangeListenerAbility", 3, a.j(jpu.a("setListener", aVar.a()), jpu.a("unsetListener", aVar.a())), "com.taobao.android.abilityidl.ability.OrangeListenerAbilityWrapper"), null, 2, null);
            if (!sng.a(this.Y, null, rqVar)) {
                rqVar = this.Y.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("c104f370", new Object[]{this});
        }
        rq rqVar = this.b.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.taobao.themis.ability.basic.apm.TMSAPMAbility", 3, a.j(jpu.a("addPageStage", aVar.c()), jpu.a("addPageProperty", aVar.c()), jpu.a("getCurrentProcedure", aVar.b()), jpu.a("requestSubCurrentProcedure", aVar.b())), "com.taobao.android.abilityidl.ability.APMAbilityWrapper"), kfp.h("weex", "windvane", "canvas", "miniapp"));
            if (!sng.a(this.b, null, rqVar)) {
                rqVar = this.b.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("4a0bb1a1", new Object[]{this});
        }
        rq rqVar = this.c.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.alibaba.ability.impl.sensor.AccelerometerAbility", 3, a.j(jpu.a("setShakeListener", aVar.a()), jpu.a("unsetShakeListener", aVar.a())), "com.taobao.android.abilityidl.ability.AccelerometerAbilityWrapper"), null, 2, null);
            if (!sng.a(this.c, null, rqVar)) {
                rqVar = this.c.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("d2c4e9dc", new Object[]{this});
        }
        rq rqVar = this.e0.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.taobao.themis.ability.basic.rum.TMSRUMAbility", 3, a.j(jpu.a("addStandardStage", aVar.c()), jpu.a("addStandardProperty", aVar.c()), jpu.a("addContainerStage", aVar.c()), jpu.a("addContainerProperty", aVar.c()), jpu.a("addCustomStage", aVar.c()), jpu.a("addCustomProperty", aVar.c()), jpu.a("getCurrentPageData", aVar.a())), "com.taobao.android.abilityidl.ability.RUMAbilityWrapper"), kfp.h("weex", "windvane", "canvas"));
            if (!sng.a(this.e0, null, rqVar)) {
                rqVar = this.e0.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("5268ba74", new Object[]{this});
        }
        rq rqVar = this.g.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.alibaba.ability.impl.aliuploaderservice.AliUploadServiceAbility", 3, a.j(jpu.a("upload", aVar.a()), jpu.a("cancel", aVar.a())), "com.taobao.android.abilityidl.ability.AliUploadServiceAbilityWrapper"), null, 2, null);
            if (!sng.a(this.g, null, rqVar)) {
                rqVar = this.g.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq g0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("97929247", new Object[]{this});
        }
        rq rqVar = this.f0.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.taobao.themis.ability.basic.router.TMSRouterAbility", 3, a.j(jpu.a(t6s.BRIDGE_ACTION_PUSHPAGE, aVar.b()), jpu.a("popPage", aVar.b()), jpu.a("popToRoot", aVar.b()), jpu.a("closeApp", aVar.b()), jpu.a("replacePage", aVar.b()), jpu.a("resetToPage", aVar.b()), jpu.a("getPageProps", aVar.a())), "com.taobao.android.abilityidl.ability.RouterAbilityWrapper"), kfp.h("weex", "windvane", "canvas", "miniapp"));
            if (!sng.a(this.f0, null, rqVar)) {
                rqVar = this.f0.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq p0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("e3aea8d3", new Object[]{this});
        }
        rq rqVar = this.o0.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.taobao.themis.ability_taobao.tiny_app.TMSTinyAppAbility", 3, a.j(jpu.a("addUserActiveAddIconListener", aVar.a()), jpu.a("removeUserActiveAddIconListener", aVar.a()), jpu.a("showActiveReplacePopup", aVar.b()), jpu.a("showICONChangeGuide", aVar.b()), jpu.a("checkAddIconButton", aVar.b())), "com.taobao.android.abilityidl.ability.TinyAppAbilityWrapper"), kfp.h("weex", "windvane", "canvas"));
            if (!sng.a(this.o0, null, rqVar)) {
                rqVar = this.o0.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("1e617ad1", new Object[]{this});
        }
        rq rqVar = this.q.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.alibaba.ability.impl.contacts.ContactsAbilityImpl", 3, a.j(jpu.a("choose", aVar.b()), jpu.a("query", aVar.b())), "com.taobao.android.abilityidl.ability.ContactsAbilityWrapper"), null, 2, null);
            if (!sng.a(this.q, null, rqVar)) {
                rqVar = this.q.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("b36f3be1", new Object[]{this});
        }
        rq rqVar = this.v.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.taobao.edlp.mega.TBEdlpModuleAbility", 3, a.j(jpu.a("requestPreloadData", aVar.a()), jpu.a("notifyRenderSuccess", aVar.a())), "com.taobao.android.abilityidl.ability.EdlpAbilityWrapper"), null, 2, null);
            if (!sng.a(this.v, null, rqVar)) {
                rqVar = this.v.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("6e639d43", new Object[]{this});
        }
        rq rqVar = this.w.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.taobao.errorview.mega.ErrorViewWidgetAbility", 3, a.j(jpu.a("show", aVar.b()), jpu.a("dismiss", aVar.b())), "com.taobao.android.abilityidl.ability.ErrorViewWidgetAbilityWrapper"), null, 2, null);
            if (!sng.a(this.w, null, rqVar)) {
                rqVar = this.w.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("188effa2", new Object[]{this});
        }
        rq rqVar = this.y0.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.taobao.taobao.ability.TradePayAbility", 3, a.j(jpu.a("openWeChatEntrust", aVar.b()), jpu.a("openAlipayEntrust", aVar.b())), "com.taobao.android.abilityidl.ability.TradePayAbilityWrapper"), null, 2, null);
            if (!sng.a(this.y0, null, rqVar)) {
                rqVar = this.y0.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("a335289a", new Object[]{this});
        }
        rq rqVar = this.z.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.taobao.favorite.export.MtbFavoriteAbility", 3, a.j(jpu.a("getFavoriteCount", aVar.a()), jpu.a("getFavoriteCountWithDefaultCount", aVar.a()), jpu.a("requestFavoriteStatus", aVar.a()), jpu.a("getFavoriteStatus", aVar.a()), jpu.a("addFavorite", aVar.a()), jpu.a("removeFavorite", aVar.a()), jpu.a("markFavorite", aVar.a()), jpu.a("needShowGuide", aVar.a())), "com.taobao.android.abilityidl.ability.FavoriteAbilityWrapper"), null, 2, null);
            if (!sng.a(this.z, null, rqVar)) {
                rqVar = this.z.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("f08fef7a", new Object[]{this});
        }
        rq rqVar = this.A.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rq rqVar2 = new rq(new hun("com.alibaba.ability.impl.file.FileAbility", 3, a.j(jpu.a(FileAbility.API_EXISTS, aVar.a()), jpu.a("existsSync", aVar.a()), jpu.a(FileAbility.API_GET_DIR_INFO, aVar.a()), jpu.a("getDirInfoSync", aVar.a()), jpu.a(FileAbility.API_MAKE_DIR, aVar.a()), jpu.a("makeDirSync", aVar.a()), jpu.a(FileAbility.API_REMOVE_DIR, aVar.a()), jpu.a("removeDirSync", aVar.a()), jpu.a(FileAbility.API_READ_AS_STRING, aVar.a()), jpu.a("readAsStringSync", aVar.a()), jpu.a(FileAbility.API_COPY_FILE, aVar.a()), jpu.a("copyFileSync", aVar.a()), jpu.a(FileAbility.API_WRITE_FILE, aVar.a()), jpu.a("writeFileSync", aVar.a()), jpu.a(FileAbility.API_APPEND_FILE, aVar.a()), jpu.a("appendFileSync", aVar.a()), jpu.a(FileAbility.API_REMOVE_FILE, aVar.a()), jpu.a("removeFileSync", aVar.a()), jpu.a(FileAbility.API_GET_FILE_INFO, aVar.a()), jpu.a("getFileInfoSync", aVar.a()), jpu.a(FileAbility.API_RENAME, aVar.a()), jpu.a("renameSync", aVar.a()), jpu.a(FileAbility.API_UNZIP, aVar.a()), jpu.a("unzipSync", aVar.a())), "com.taobao.android.abilityidl.ability.FileAbilityWrapper"), null, 2, null);
            rqVar = !sng.a(this.A, null, rqVar2) ? this.A.get() : rqVar2;
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("2505ccc6", new Object[]{this});
        }
        rq rqVar = this.D.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.taobao.global.setting.megability.GeneralSettingAbility", 3, a.j(jpu.a("get", aVar.a()), jpu.a("setChangeListener", aVar.a()), jpu.a("unsetChangeListener", aVar.a())), "com.taobao.android.abilityidl.ability.GeneralSettingAbilityWrapper"), null, 2, null);
            if (!sng.a(this.D, null, rqVar)) {
                rqVar = this.D.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("714da26b", new Object[]{this});
        }
        rq rqVar = this.H.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.alibaba.ability.impl.imagepreview.ImagePreviewAbility", 3, a.j(jpu.a("show", aVar.b()), jpu.a("remove", aVar.b()), jpu.a("insert", aVar.b())), "com.taobao.android.abilityidl.ability.ImagePreviewAbilityWrapper"), null, 2, null);
            if (!sng.a(this.H, null, rqVar)) {
                rqVar = this.H.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("5005e562", new Object[]{this});
        }
        rq rqVar = this.I.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.alibaba.ability.impl.kvstorage.KVStorageAbility", 3, a.j(jpu.a("setItem", aVar.a()), jpu.a("getItem", aVar.a()), jpu.a("removeItem", aVar.a()), jpu.a("getAllKeys", aVar.a()), jpu.a(pg1.ATOM_EXT_clear, aVar.a()), jpu.a(RocketBundleAbility.API_GET_CURRENT_INFO, aVar.a()), jpu.a("getCurrentInfoAndKeys", aVar.a())), "com.taobao.android.abilityidl.ability.KVStorageAbilityWrapper"), null, 2, null);
            if (!sng.a(this.I, null, rqVar)) {
                rqVar = this.I.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("9f4d9917", new Object[]{this});
        }
        rq rqVar = this.L.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.alibaba.ability.impl.localization.LocalizationAbility", 3, a.j(jpu.a(vqx.HUMMER_FOUNDATION_GET_LANGUAGE, aVar.a()), jpu.a("getLocation", aVar.a()), jpu.a("setLocale", aVar.a()), jpu.a("isCnSite", aVar.a()), jpu.a("isI18nEdition", aVar.a())), "com.taobao.android.abilityidl.ability.LocalizationAbilityWrapper"), null, 2, null);
            if (!sng.a(this.L, null, rqVar)) {
                rqVar = this.L.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("1bb17396", new Object[]{this});
        }
        rq rqVar = this.N.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.alibaba.ability.impl.log.LogAbility", 3, a.j(jpu.a("error", aVar.a()), jpu.a("warn", aVar.a()), jpu.a("info", aVar.a()), jpu.a("debug", aVar.a())), "com.taobao.android.abilityidl.ability.LogAbilityWrapper"), null, 2, null);
            if (!sng.a(this.N, null, rqVar)) {
                rqVar = this.N.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("e21503d9", new Object[]{this});
        }
        rq rqVar = this.O.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.alibaba.ability.impl.memkvstorage.MEMKVStorageAbility", 3, a.j(jpu.a("setItem", aVar.a()), jpu.a("getItem", aVar.a()), jpu.a("removeItem", aVar.a()), jpu.a("setItemTTL", aVar.a()), jpu.a("getItemTTL", aVar.a())), "com.taobao.android.abilityidl.ability.MEMKVStorageAbilityWrapper"), null, 2, null);
            if (!sng.a(this.O, null, rqVar)) {
                rqVar = this.O.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("49bb526e", new Object[]{this});
        }
        rq rqVar = this.Q.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rq rqVar2 = new rq(new hun("com.taobao.themis.ability.basic.navbar.TMSNavBarAbility", 3, a.j(jpu.a("show", aVar.b()), jpu.a("hide", aVar.b()), jpu.a("setShareConfig", aVar.c()), jpu.a("setTitle", aVar.b()), jpu.a("setTitleImage", aVar.b()), jpu.a("setTitleColor", aVar.b()), jpu.a("setBgColor", aVar.b()), jpu.a("setTheme", aVar.b()), jpu.a("setImmersive", aVar.b()), jpu.a(DxContainerActivity.PARAMS_SHOW_STATUS_BAR, aVar.b()), jpu.a("hideStatusBar", aVar.b()), jpu.a("setRightItem", aVar.b()), jpu.a("hideRightItem", aVar.b()), jpu.a("showBackButton", aVar.b()), jpu.a("hideBackButton", aVar.b())), "com.taobao.android.abilityidl.ability.NavBarAbilityWrapper"), kfp.h("weex", "windvane", "canvas", "miniapp"));
            rqVar = !sng.a(this.Q, null, rqVar2) ? this.Q.get() : rqVar2;
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("258464a9", new Object[]{this});
        }
        rq rqVar = this.R.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.alibaba.ability.impl.navigator.NavigatorAbility", 3, a.j(jpu.a("openURL", aVar.b()), jpu.a("openExternalURL", aVar.b()), jpu.a("close", aVar.b()), jpu.a("replace", aVar.b()), jpu.a("setSystemBackBlockListener", aVar.b()), jpu.a("removeSystemBackBlockListener", aVar.b())), "com.taobao.android.abilityidl.ability.NavigatorAbilityWrapper"), null, 2, null);
            if (!sng.a(this.R, null, rqVar)) {
                rqVar = this.R.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("8409dc44", new Object[]{this});
        }
        rq rqVar = this.S.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.alibaba.android.nextrpc.NextRPCAbility", 3, a.j(jpu.a(pg1.ATOM_EXT_bind, aVar.a()), jpu.a("unbind", aVar.a()), jpu.a("cancel", aVar.a()), jpu.a("request", aVar.a())), "com.taobao.android.abilityidl.ability.NextRPCAbilityWrapper"), null, 2, null);
            if (!sng.a(this.S, null, rqVar)) {
                rqVar = this.S.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("559d8cd", new Object[]{this});
        }
        rq rqVar = this.Z.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.taobao.runtimepermission.MegaPermissionAbility", 3, a.j(jpu.a(TBRunTimePermission.REQUEST_PERMISSION_API_NAME, aVar.b()), jpu.a("check", aVar.b()), jpu.a("request", aVar.b())), "com.taobao.android.abilityidl.ability.PermissionAbilityWrapper"), null, 2, null);
            if (!sng.a(this.Z, null, rqVar)) {
                rqVar = this.Z.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("dbf4fb04", new Object[]{this});
        }
        rq rqVar = this.a0.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.alibaba.ability.impl.photo.PhotoAbility", 3, a.j(jpu.a("takeFromPhotoLibrary", aVar.b()), jpu.a("takeFromCamera", aVar.b()), jpu.a("takeFromScreen", aVar.b()), jpu.a("saveToAlbum", aVar.b()), jpu.a("saveMediaToAlbum", aVar.a())), "com.taobao.android.abilityidl.ability.PhotoAbilityWrapper"), null, 2, null);
            if (!sng.a(this.a0, null, rqVar)) {
                rqVar = this.a0.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("b1921bd8", new Object[]{this});
        }
        rq rqVar = this.b0.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.taobao.tbpoplayer.view.jsbridge.TBPopCenterAbility", 3, a.j(jpu.a("setProperties", aVar.a()), jpu.a("checkShouldPop", aVar.a()), jpu.a("triggerPop", aVar.a()), jpu.a("closePop", aVar.a()), jpu.a("recordPopAction", aVar.a())), "com.taobao.android.abilityidl.ability.PopCenterAbilityWrapper"), null, 2, null);
            if (!sng.a(this.b0, null, rqVar)) {
                rqVar = this.b0.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("bf8a9d10", new Object[]{this});
        }
        rq rqVar = this.d.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.taobao.accs.mega.MegaAccsAbility", 3, a.j(jpu.a("connection", aVar.a()), jpu.a("addConnectionListener", aVar.a()), jpu.a("removeConnectionListener", aVar.a()), jpu.a("bindService", aVar.a()), jpu.a("unBindService", aVar.a()), jpu.a("send", aVar.a())), "com.taobao.android.abilityidl.ability.AccsAbilityWrapper"), null, 2, null);
            if (!sng.a(this.d, null, rqVar)) {
                rqVar = this.d.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("61c4fb3a", new Object[]{this});
        }
        rq rqVar = this.c0.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rq rqVar2 = new rq(new hun("com.taobao.tao.powermsg.outter.PowerMsgAbility", 3, a.j(jpu.a("constructClient", aVar.a()), jpu.a("destroyClient", aVar.a()), jpu.a("subscribe", aVar.a()), jpu.a(NfcAbility.API_UNSUBSCRIBE, aVar.a()), jpu.a("sendMessage", aVar.a()), jpu.a("sendText", aVar.a()), jpu.a("countValue", aVar.a()), jpu.a("requestTopicStatus", aVar.a()), jpu.a("requestTopicUsers", aVar.a()), jpu.a("requestHistoryMessages", aVar.a()), jpu.a(PowerMsgAbility.API_ADD_EVENT_LISTENER, aVar.a()), jpu.a(PowerMsgAbility.API_REMOVE_EVENT_LISTENER, aVar.a()), jpu.a("send", aVar.a()), jpu.a("query", aVar.a()), jpu.a(PowerMsgAbility.API_PRE_CONNECT, aVar.a())), "com.taobao.android.abilityidl.ability.PowerMsgAbilityWrapper"), null, 2, null);
            rqVar = !sng.a(this.c0, null, rqVar2) ? this.c0.get() : rqVar2;
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("2f8dcf46", new Object[]{this});
        }
        rq rqVar = this.e.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.taobao.android.address.ability.AddressMegaAbility", 3, a.j(jpu.a("open", aVar.b()), jpu.a("requestParams", aVar.b()), jpu.a("close", aVar.b())), "com.taobao.android.abilityidl.ability.AddressAbilityWrapper"), null, 2, null);
            if (!sng.a(this.e, null, rqVar)) {
                rqVar = this.e.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("b2662cea", new Object[]{this});
        }
        rq rqVar = this.h0.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rq rqVar2 = new rq(new hun("com.alibaba.ability.impl.screen.ScreenAbility", 3, a.j(jpu.a("keepOn", aVar.b()), jpu.a("getOrientation", aVar.a()), jpu.a("getInfo", aVar.a()), jpu.a(WindvanePluginRegister.WVWindowInfoPlugin.ACTION_GET_STATUS_BAR_HEIGHT, aVar.a()), jpu.a("getBrightness", aVar.a()), jpu.a("requestBrightness", aVar.a()), jpu.a("setBrightness", aVar.b()), jpu.a("setCaptureEnabledForAndroid", aVar.b()), jpu.a("setCaptureEnabled", aVar.b()), jpu.a("setOrientation", aVar.b()), jpu.a("setCaptureListener", aVar.a()), jpu.a("unsetCaptureListener", aVar.a()), jpu.a("setOrientationListener", aVar.a()), jpu.a("unsetOrientationListener", aVar.a())), "com.taobao.android.abilityidl.ability.ScreenAbilityWrapper"), null, 2, null);
            rqVar = !sng.a(this.h0, null, rqVar2) ? this.h0.get() : rqVar2;
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("7c805777", new Object[]{this});
        }
        rq rqVar = this.j.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.alibaba.ability.impl.audio.AudioAbility", 3, a.j(jpu.a("prepare", aVar.a()), jpu.a("play", aVar.a()), jpu.a("pause", aVar.a()), jpu.a("seek", aVar.a()), jpu.a("stop", aVar.a()), jpu.a("setEventListener", aVar.a()), jpu.a("setLoop", aVar.a()), jpu.a(CommandID.setMuted, aVar.a()), jpu.a(CommandID.setVolume, aVar.a()), jpu.a("setPauseInBackground", aVar.a())), "com.taobao.android.abilityidl.ability.AudioContextAbilityWrapper"), null, 2, null);
            if (!sng.a(this.j, null, rqVar)) {
                rqVar = this.j.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq j0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("8a2b50b8", new Object[]{this});
        }
        rq rqVar = this.i0.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.alibaba.ability.impl.sessionkvstorage.SessionKVStorageAbility", 3, a.j(jpu.a("setItem", aVar.a()), jpu.a("getItem", aVar.a()), jpu.a("removeItem", aVar.a()), jpu.a("getAllKeys", aVar.a()), jpu.a(pg1.ATOM_EXT_clear, aVar.a()), jpu.a(RocketBundleAbility.API_GET_CURRENT_INFO, aVar.a())), "com.taobao.android.abilityidl.ability.SessionKVStorageAbilityWrapper"), null, 2, null);
            if (!sng.a(this.i0, null, rqVar)) {
                rqVar = this.i0.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("ffbaefdb", new Object[]{this});
        }
        rq rqVar = this.k.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.taobao.android.behavix.megaAbility.BehaviXAndroidAbility", 3, a.j(jpu.a("commitVisualCenter", aVar.a()), jpu.a("trackScrollStart", aVar.a()), jpu.a("trackScrolling", aVar.a()), jpu.a("trackScrollEnd", aVar.a()), jpu.a("getFeature", aVar.a())), "com.taobao.android.abilityidl.ability.BehaviXAbilityWrapper"), null, 2, null);
            if (!sng.a(this.k, null, rqVar)) {
                rqVar = this.k.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("5a9de069", new Object[]{this});
        }
        rq rqVar = this.j0.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.alibaba.ability.impl.share.SharePannelAbility", 3, a.j(jpu.a("open", aVar.b()), jpu.a("saveImage", aVar.b()), jpu.a("requestShortLinkQRCode", aVar.b())), "com.taobao.android.abilityidl.ability.SharePannelAbilityWrapper"), null, 2, null);
            if (!sng.a(this.j0, null, rqVar)) {
                rqVar = this.j0.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("aafa9813", new Object[]{this});
        }
        rq rqVar = this.l.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.alibaba.ability.impl.broadcast.BroadcastAbility", 3, a.j(jpu.a("addEventListener", aVar.a()), jpu.a("dispatchEvent", aVar.a()), jpu.a("removeEventListener", aVar.a())), "com.taobao.android.abilityidl.ability.BroadcastAbilityWrapper"), null, 2, null);
            if (!sng.a(this.l, null, rqVar)) {
                rqVar = this.l.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("c0abcc7", new Object[]{this});
        }
        rq rqVar = this.k0.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.alibaba.ability.impl.speechrecognition.SpeechRecognitionAbility", 3, a.j(jpu.a(txq.IS_SUPPORT_KEY, aVar.a()), jpu.a("showPanel", aVar.b()), jpu.a("prepare", aVar.a()), jpu.a("start", aVar.a()), jpu.a("stop", aVar.a())), "com.taobao.android.abilityidl.ability.SpeechRecognitionAbilityWrapper"), null, 2, null);
            if (!sng.a(this.k0, null, rqVar)) {
                rqVar = this.k0.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("64aff5e2", new Object[]{this});
        }
        rq rqVar = this.l0.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.taobao.leftsdk.impl.stepCounter.StepCounterAbility", 3, a.j(jpu.a("requestStepCountSupportStatus", aVar.a()), jpu.a("requestStepsAutoUploadStatus", aVar.a()), jpu.a("setStepsAutoUploadStatus", aVar.a()), jpu.a("uploadSteps", aVar.b()), jpu.a("requestDailySteps", aVar.b()), jpu.a("requestStepsHistory", aVar.b())), "com.taobao.android.abilityidl.ability.StepCounterAbilityWrapper"), null, 2, null);
            if (!sng.a(this.l0, null, rqVar)) {
                rqVar = this.l0.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq o0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("390a5e1b", new Object[]{this});
        }
        rq rqVar = this.n0.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.taobao.android.festival.ability.ThemeAbility", 3, a.j(jpu.a("requestThemeType", aVar.a()), jpu.a("getThemeType", aVar.a()), jpu.a("requestThemeInfo", aVar.a()), jpu.a("getThemeInfo", aVar.a())), "com.taobao.android.abilityidl.ability.ThemeAbilityWrapper"), null, 2, null);
            if (!sng.a(this.n0, null, rqVar)) {
                rqVar = this.n0.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("3f4bc71e", new Object[]{this});
        }
        rq rqVar = this.o.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.taobao.android.icart.weex.ability.CartAbility", 3, a.j(jpu.a("getGlobalStatus", aVar.a()), jpu.a("setGlobalStatus", aVar.a()), jpu.a("callMainInstance", aVar.a()), jpu.a("callNative", aVar.a()), jpu.a("mainInstanceCallback", aVar.a())), "com.taobao.android.abilityidl.ability.CartAbilityWrapper"), null, 2, null);
            if (!sng.a(this.o, null, rqVar)) {
                rqVar = this.o.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("f8e1b4c0", new Object[]{this});
        }
        rq rqVar = this.p.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.taobao.themis.ability.basic.prerender.TMSClientPrerenderAbility", 3, a.j(jpu.a("start", aVar.b()), jpu.a("prerender", aVar.a()), jpu.a("reportPrerenderStatus", aVar.b()), jpu.a("addPrerenderAttachEventListener", aVar.b()), jpu.a("removePrerenderAttachEventListener", aVar.b())), "com.taobao.android.abilityidl.ability.ClientPrerenderAbilityWrapper"), null, 2, null);
            if (!sng.a(this.p, null, rqVar)) {
                rqVar = this.p.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq r0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("3fff28d2", new Object[]{this});
        }
        rq rqVar = this.q0.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.alibaba.android.ultron.vfw.weex2.ability.TradeHybridAbility", 3, a.j(jpu.a("notifyStage", aVar.b()), jpu.a("notifyBizLifecycle", aVar.b()), jpu.a("onBindPreData", aVar.b()), jpu.a("unexpectedReachMark", aVar.b()), jpu.a("unexpectedReachDone", aVar.b())), "com.taobao.android.abilityidl.ability.TradeHybridAbilityWrapper"), null, 2, null);
            if (!sng.a(this.q0, null, rqVar)) {
                rqVar = this.q0.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("a7c3dbd3", new Object[]{this});
        }
        rq rqVar = this.r.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rq rqVar2 = new rq(new hun("com.taobao.themis.ability.basic.container.TMSContainerAbility", 3, a.j(jpu.a("registerPage", aVar.b()), jpu.a("showErrorPage", aVar.b()), jpu.a("hideErrorPage", aVar.b()), jpu.a("setPageBgColor", aVar.b()), jpu.a("addPageResizeListener", aVar.b()), jpu.a("removePageResizeListener", aVar.b()), jpu.a("interceptPageClose", aVar.b()), jpu.a("disableInterceptPageClose", aVar.b()), jpu.a("preRenderSubPage", aVar.b()), jpu.a("reportSubPagePreRenderStatus", aVar.b()), jpu.a("addTabSwitchListener", aVar.b()), jpu.a("removeTabSwitchListener", aVar.b()), jpu.a("showTab", aVar.b()), jpu.a("hideTab", aVar.b()), jpu.a("switchTab", aVar.b()), jpu.a("setTabBarMode", aVar.b()), jpu.a("setTabBarItem", aVar.b()), jpu.a("swizzleTab", aVar.b()), jpu.a("interceptTabBarClick", aVar.b()), jpu.a("setTabBarBadge", aVar.b()), jpu.a("removeTabBarBadge", aVar.b()), jpu.a("addSwiperSwitchListener", aVar.b()), jpu.a("removeSwiperSwitchListener", aVar.b()), jpu.a("slideTo", aVar.b()), jpu.a("showSwiperHeader", aVar.b()), jpu.a("hideSwiperHeader", aVar.b()), jpu.a("setSwiperEnable", aVar.b()), jpu.a("addSwiperItem", aVar.b()), jpu.a("removeSwiperItem", aVar.b()), jpu.a("addTabItem", aVar.b()), jpu.a("removeTabItem", aVar.b()), jpu.a("setOrientation", aVar.b()), jpu.a("requestContainerPosition", aVar.b()), jpu.a("prewarmResource", aVar.b()), jpu.a("prewarmMultiResource", aVar.b())), "com.taobao.android.abilityidl.ability.ContainerAbilityWrapper"), kfp.h("weex", "windvane", "canvas", "miniapp"));
            rqVar = !sng.a(this.r, null, rqVar2) ? this.r.get() : rqVar2;
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq s0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("9399ca4b", new Object[]{this});
        }
        rq rqVar = this.r0.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.alibaba.ability.utimpl.UBFAbility", 3, a.j(jpu.a("beginUBF", aVar.b()), jpu.a("endUBF", aVar.b()), jpu.a("updateUBF", aVar.b()), jpu.a("beginPage", aVar.b()), jpu.a("endPage", aVar.b()), jpu.a("updatePage", aVar.b()), jpu.a("beginComponent", aVar.b()), jpu.a("endComponent", aVar.b()), jpu.a("updateComponent", aVar.b()), jpu.a("sendEvent", aVar.b())), "com.taobao.android.abilityidl.ability.UBFAbilityWrapper"), null, 2, null);
            if (!sng.a(this.r0, null, rqVar)) {
                rqVar = this.r0.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("1774388f", new Object[]{this});
        }
        rq rqVar = this.t0.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rq rqVar2 = new rq(new hun("com.taobao.umipublish.mega.UmiMegaPublisherAbility", 3, a.j(jpu.a("queryDraftsSize", aVar.b()), jpu.a("saveDraft", aVar.b()), jpu.a("fetchDraftList", aVar.b()), jpu.a("deleteDrafts", aVar.b()), jpu.a("asyncPublish", aVar.b()), jpu.a("submit", aVar.b()), jpu.a("requestParams", aVar.b()), jpu.a("setParams", aVar.b()), jpu.a("setCallbackResult", aVar.b()), jpu.a("appendMedia", aVar.b()), jpu.a("deleteMedia", aVar.b()), jpu.a("changeCover", aVar.b()), jpu.a("openImageEdit", aVar.b()), jpu.a("openImageBrowser", aVar.b()), jpu.a("openVideoEdit", aVar.b()), jpu.a("openVideoBrowser", aVar.b()), jpu.a("comprehensionRecommend", aVar.b())), "com.taobao.android.abilityidl.ability.UmiPrivatePublishAbilityWrapper"), null, 2, null);
            rqVar = !sng.a(this.t0, null, rqVar2) ? this.t0.get() : rqVar2;
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("1fae974f", new Object[]{this});
        }
        rq rqVar = this.t.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.taobao.android.detail.ttdetail.mega.DetailMegaAbility", 3, a.j(jpu.a("requestPicGallery", aVar.a()), jpu.a("openInnerSKU", aVar.a()), jpu.a(y3l.EVENT_TYPE, aVar.a())), "com.taobao.android.abilityidl.ability.DetailAbilityWrapper"), null, 2, null);
            if (!sng.a(this.t, null, rqVar)) {
                rqVar = this.t.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq u0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("461e6d49", new Object[]{this});
        }
        rq rqVar = this.u0.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.alibaba.ability.impl.user.UserAbility", 3, a.j(jpu.a("isLogin", aVar.b()), jpu.a("login", aVar.b()), jpu.a("recordAndCheckNeedLogin", aVar.b())), "com.taobao.android.abilityidl.ability.UserAbilityWrapper"), null, 2, null);
            if (!sng.a(this.u0, null, rqVar)) {
                rqVar = this.u0.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq v0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("7934c777", new Object[]{this});
        }
        rq rqVar = this.v0.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.alibaba.ability.impl.userkvstorage.UserKVStorageAbility", 3, a.j(jpu.a("setItem", aVar.a()), jpu.a("getItem", aVar.a()), jpu.a("removeItem", aVar.a()), jpu.a("getAllKeys", aVar.a()), jpu.a(pg1.ATOM_EXT_clear, aVar.a()), jpu.a(RocketBundleAbility.API_GET_CURRENT_INFO, aVar.a())), "com.taobao.android.abilityidl.ability.UserKVStorageAbilityWrapper"), null, 2, null);
            if (!sng.a(this.v0, null, rqVar)) {
                rqVar = this.v0.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("e6fdf9d", new Object[]{this});
        }
        rq rqVar = this.s0.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rq rqVar2 = new rq(new hun("com.alibaba.ability.utimpl.UTAbility", 3, a.j(jpu.a("commitEvent", aVar.a()), jpu.a(a1v.PAGE_APPEAR, aVar.b()), jpu.a("pageDisAppear", aVar.b()), jpu.a(a1v.SKIP_PAGE, aVar.b()), jpu.a("pageAppearDonotSkip", aVar.b()), jpu.a("updatePageName", aVar.b()), jpu.a(a1v.UPDATE_PAGEURL, aVar.b()), jpu.a("updatePageStatus", aVar.b()), jpu.a(a1v.UPDATE_PAGE_UTPARAM, aVar.b()), jpu.a("updateNextPageUtparam", aVar.b()), jpu.a(a1v.UPDATE_PAGE_PROPERTIES, aVar.b()), jpu.a(a1v.UPDATE_NEXT_PAGE_PROPERTIES, aVar.b()), jpu.a(a1v.UPDATE_SESSION_PROPERTY, aVar.b()), jpu.a("updateNextPageUtparamCnt", aVar.b()), jpu.a(a1v.GET_PAGE_SPM_URL, aVar.b()), jpu.a(a1v.GET_PAGE_SPM_PRE, aVar.b()), jpu.a("requestPageAllProperties", aVar.b())), "com.taobao.android.abilityidl.ability.UTAbilityWrapper"), null, 2, null);
            rqVar = !sng.a(this.s0, null, rqVar2) ? this.s0.get() : rqVar2;
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("c6e7d8f3", new Object[]{this});
        }
        rq rqVar = this.h.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.alibaba.ability.impl.app.AppAbility", 3, a.j(jpu.a("getInfo", aVar.a()), jpu.a("getVersion", aVar.a()), jpu.a("getUTDID", aVar.a()), jpu.a("getTTID", aVar.a()), jpu.a("isForeground", aVar.a()), jpu.a("getNavBarHeight", aVar.a()), jpu.a("getBottomBarHeight", aVar.a()), jpu.a("suspend", aVar.a()), jpu.a("getEnv", aVar.a())), "com.taobao.android.abilityidl.ability.AppAbilityWrapper"), null, 2, null);
            if (!sng.a(this.h, null, rqVar)) {
                rqVar = this.h.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }

    public final rq n0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rq) ipChange.ipc$dispatch("6a2ea02d", new Object[]{this});
        }
        rq rqVar = this.m0.get();
        if (rqVar == null) {
            i11.a aVar = i11.Companion;
            rqVar = new rq(new hun("com.alibaba.ability.impl.system.SystemAbility", 3, a.j(jpu.a("checkAppInstallStatus", aVar.a()), jpu.a("openAppSettings", aVar.a()), jpu.a("openNotificationSettings", aVar.a()), jpu.a("checkLocation", aVar.a()), jpu.a("openLocationSettings", aVar.a()), jpu.a("isNFCReadingSupported", aVar.a()), jpu.a("isVoiceOverOn", aVar.a()), jpu.a("requestNotificationSettings", aVar.a()), jpu.a(t6s.BRIDGE_ACTION_OPENBROWSER, aVar.b())), "com.taobao.android.abilityidl.ability.SystemAbilityWrapper"), null, 2, null);
            if (!sng.a(this.m0, null, rqVar)) {
                rqVar = this.m0.get();
            }
        }
        ckf.f(rqVar, "builderBox");
        return rqVar;
    }
}
