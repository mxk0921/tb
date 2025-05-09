package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.kernel.metaInfo.manifest.AppManifest;
import com.taobao.themis.kernel.utils.CommonExtKt;
import com.taobao.themis.kernel.utils.TMSInstanceExtKt;
import com.taobao.themis.uniapp.solution.extension.instance.MTOPPrefetchExtension;
import tb.ges;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class rcs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(848298005);
    }

    public static /* synthetic */ void b(TMSBaseLaunchStep tMSBaseLaunchStep, boolean z, bbs bbsVar, TMSMetaInfoWrapper tMSMetaInfoWrapper, boolean z2, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8f3c832", new Object[]{tMSBaseLaunchStep, new Boolean(z), bbsVar, tMSMetaInfoWrapper, new Boolean(z2), new Integer(i), obj});
            return;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        a(tMSBaseLaunchStep, z, bbsVar, tMSMetaInfoWrapper, z2);
    }

    public static final void a(TMSBaseLaunchStep tMSBaseLaunchStep, boolean z, bbs bbsVar, TMSMetaInfoWrapper tMSMetaInfoWrapper, boolean z2) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c51fbb0", new Object[]{tMSBaseLaunchStep, new Boolean(z), bbsVar, tMSMetaInfoWrapper, new Boolean(z2)});
            return;
        }
        ckf.g(tMSBaseLaunchStep, "<this>");
        ckf.g(bbsVar, "instance");
        ckf.g(tMSMetaInfoWrapper, "manifestWrapper");
        tMSBaseLaunchStep.b.s0(tMSMetaInfoWrapper);
        AppManifest r = tMSMetaInfoWrapper.r();
        bbsVar.X().e("manifestLoadEnd");
        gld m = CommonExtKt.m(bbsVar);
        if (m != null) {
            m.C("manifestLoadEnd");
        }
        bbsVar.S().a("isManifestLocal", String.valueOf(z));
        bbsVar.S().b("manifestStepFinish");
        ges gesVar = ges.INSTANCE;
        String e0 = bbsVar.e0();
        ckf.f(e0, "instance.url");
        ges.a o = gesVar.o(e0);
        if (!(r == null || o == null || o.e() == null || o.d() == null)) {
            MTOPPrefetchExtension b = zgv.INSTANCE.b(o.d());
            if (b != null) {
                String str2 = tMSBaseLaunchStep.c;
                ckf.f(str2, "mLogTraceId");
                mcs.e("Themis/Performance/Prefetch", "HIT_DATA_PREFETCH", str2, mcs.d(str2), new JSONObject());
                bbsVar.k0(b);
            } else {
                MTOPPrefetchExtension mTOPPrefetchExtension = new MTOPPrefetchExtension();
                bbsVar.k0(mTOPPrefetchExtension);
                String e = o.e();
                ckf.d(e);
                String d = o.d();
                ckf.d(d);
                mTOPPrefetchExtension.e0(e, d);
            }
        }
        String str3 = tMSBaseLaunchStep.c;
        ckf.f(str3, "mLogTraceId");
        String d2 = mcs.d(str3);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "manifest", (String) JSON.parseObject(JSON.toJSONString(tMSMetaInfoWrapper.r())));
        jSONObject.put((JSONObject) "isLocal", (String) Boolean.valueOf(z));
        jSONObject.put((JSONObject) "fromHeader", (String) Boolean.valueOf(z2));
        xhv xhvVar = xhv.INSTANCE;
        mcs.e(mcs.MODULE_LAUNCH_APPINFO, "ON_GET_MANIFEST", str3, d2, jSONObject);
        AppManifest r2 = tMSMetaInfoWrapper.r();
        if (r2 != null && r2.getPreset()) {
            str = "preset";
        } else if (z) {
            str = "disk";
        } else {
            str = "network";
        }
        bbsVar.X().onProperty("manifestSource", str);
    }

    public static final void c(TMSBaseLaunchStep tMSBaseLaunchStep, ges.a aVar) {
        boolean z = true;
        z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c683842", new Object[]{tMSBaseLaunchStep, aVar});
            return;
        }
        ckf.g(tMSBaseLaunchStep, "<this>");
        ckf.g(aVar, "baseInfo");
        if (tMSBaseLaunchStep.b.U() != null) {
            String h = tMSBaseLaunchStep.b().h("mainDocumentPageVersion");
            Object obj = null;
            String str = "";
            if (h == null || !q9s.INSTANCE.I()) {
                String h2 = tMSBaseLaunchStep.b().h("mainDocumentManifestVersion");
                if (h2 != null) {
                    String c = tMSBaseLaunchStep.c();
                    StringBuilder sb = new StringBuilder("checking manifest version. mainDocumentManifestVersion[");
                    sb.append(h2);
                    sb.append("] manifestVersion[");
                    TMSMetaInfoWrapper U = tMSBaseLaunchStep.b.U();
                    if (U != null) {
                        obj = U.l();
                    }
                    sb.append(obj);
                    sb.append(']');
                    TMSLogger.a(c, sb.toString());
                    if (tMSBaseLaunchStep.b.U() != null) {
                        TMSMetaInfoWrapper U2 = tMSBaseLaunchStep.b.U();
                        ckf.d(U2);
                        if (!ckf.b(U2.l(), h2)) {
                            TMSLogger.b(tMSBaseLaunchStep.c(), "manifest version incompatible. reload the main document request");
                            str = "manifest version incompatible";
                            z = true;
                        }
                    }
                    obj = xhv.INSTANCE;
                }
                if (obj == null) {
                    TMSLogger.b(tMSBaseLaunchStep.c(), "mainDocumentManifestVersion is null");
                }
            } else {
                ges gesVar = ges.INSTANCE;
                TMSMetaInfoWrapper U3 = tMSBaseLaunchStep.b.U();
                ckf.d(U3);
                AppManifest.Page h3 = gesVar.h(aVar, U3);
                if (h3 != null) {
                    obj = h3.getVersion();
                }
                if (obj != null && !ckf.b(h, h3.getVersion())) {
                    TMSLogger.b(tMSBaseLaunchStep.c(), "x-page-version incompatible. reload the main document request");
                    str = "x-page-version incompatible";
                    z = true;
                }
            }
            String h4 = tMSBaseLaunchStep.b().h("mainDocumentErrorCode");
            if (h4 != null) {
                TMSLogger.a(tMSBaseLaunchStep.c(), ckf.p("mainDocument load error.ErrorCode: ", h4));
                str = ckf.p("mainDocument load error.ErrorCode: ", h4);
            }
            if (z && q9s.INSTANCE.u2()) {
                String str2 = tMSBaseLaunchStep.e;
                String str3 = tMSBaseLaunchStep.d;
                String str4 = tMSBaseLaunchStep.c;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put((JSONObject) "reloadMsg", str);
                xhv xhvVar = xhv.INSTANCE;
                mcs.c(str2, "RELOAD", str3, str4, jSONObject);
                tMSBaseLaunchStep.b.S().a("tms_reload", str);
                bbs bbsVar = tMSBaseLaunchStep.b;
                ckf.f(bbsVar, "mInstance");
                TMSInstanceExtKt.a(bbsVar);
            }
        }
    }
}
