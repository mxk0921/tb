package com.taobao.themis.mix;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.windvane.TBACCS;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.mix.h5_render.TMSTinyH5APIBridge;
import com.taobao.themis.mix.h5_render.TMSTinyH5EventBridge;
import com.taobao.themis.mix.utils.MixPageInfo;
import com.taobao.themis.mix.weex_render.TMSWeexAPIBridge;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import tb.a07;
import tb.ak1;
import tb.bbs;
import tb.ckf;
import tb.e9s;
import tb.eas;
import tb.fsw;
import tb.ocs;
import tb.pds;
import tb.qcs;
import tb.qml;
import tb.t2o;
import tb.t8s;
import tb.ubs;
import tb.ves;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\u00020\u00012\u00020\u0002:\u0001\u0016B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR \u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/taobao/themis/mix/TMSTinyAppRenderFactory;", "Ltb/e9s;", "Ljava/io/Serializable;", "Ltb/bbs;", "instance", "<init>", "(Ltb/bbs;)V", "Lcom/taobao/themis/kernel/page/ITMSPage;", "page", "Ltb/ocs;", "renderListener", "Ltb/qcs;", "createRender", "(Lcom/taobao/themis/kernel/page/ITMSPage;Ltb/ocs;)Ltb/qcs;", "", "Lcom/taobao/themis/mix/utils/MixPageInfo;", "mPageInfoList", "Ljava/util/List;", "Lcom/alibaba/fastjson/JSONObject;", "mPHAManifest", "Lcom/alibaba/fastjson/JSONObject;", "Companion", "a", "themis_mix_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSTinyAppRenderFactory extends e9s implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    private static final String TAG = "TMSTinyAppRenderFactory";
    private JSONObject mPHAManifest;
    private List<MixPageInfo> mPageInfoList;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(840957955);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(840957954);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TMSTinyAppRenderFactory(bbs bbsVar) {
        super(bbsVar);
        ckf.g(bbsVar, "instance");
        fsw.h("Triver", TMSTinyH5APIBridge.class);
        fsw.h("TriverEvent", TMSTinyH5EventBridge.class);
        MUSEngine.registerModule("openApi", TMSWeexAPIBridge.class);
        try {
            IpChange ipChange = TBACCS.$ipChange;
            fsw.i("WVACCS", TBACCS.class, true);
        } catch (ClassNotFoundException e) {
            TMSLogger.b(TAG, ckf.p("Register WVACCS Module Faild: ", e.getMessage()));
        }
    }

    public static /* synthetic */ Object ipc$super(TMSTinyAppRenderFactory tMSTinyAppRenderFactory, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/mix/TMSTinyAppRenderFactory");
    }

    @Override // tb.twd
    public qcs createRender(ITMSPage iTMSPage, ocs ocsVar) {
        MixPageInfo mixPageInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qcs) ipChange.ipc$dispatch("2e8fbe8e", new Object[]{this, iTMSPage, ocsVar});
        }
        ckf.g(iTMSPage, "page");
        ckf.g(ocsVar, "renderListener");
        if (t8s.f(iTMSPage.c())) {
            return new pds(iTMSPage, iTMSPage.c(), ocsVar);
        }
        if (t8s.g(iTMSPage.c())) {
            return new ak1(iTMSPage, ocsVar);
        }
        List<MixPageInfo> list = this.mPageInfoList;
        if (list == null || !(!list.isEmpty())) {
            this.mPageInfoList = ubs.e(getMInstance().U());
        }
        List<MixPageInfo> list2 = this.mPageInfoList;
        if (list2 == null || !(!list2.isEmpty())) {
            this.mPHAManifest = ubs.f(getMInstance().U());
        }
        if (qml.z(iTMSPage)) {
            if (this.mPageInfoList != null) {
                String e0 = getMInstance().e0();
                ckf.f(e0, "mInstance.url");
                List<MixPageInfo> list3 = this.mPageInfoList;
                ckf.d(list3);
                mixPageInfo = ubs.d(e0, list3);
            } else {
                mixPageInfo = null;
            }
            if (mixPageInfo == null && this.mPHAManifest != null) {
                TMSLogger.b(TAG, "hit tms by pha");
                getMInstance().x0(eas.k);
                return new pds(iTMSPage, "", ocsVar);
            }
        } else {
            mixPageInfo = ubs.g(this.mPageInfoList, iTMSPage.c());
            if (mixPageInfo == null) {
                String g = iTMSPage.getPageParams().g();
                String c = iTMSPage.c();
                MixPageInfo mixPageInfo2 = new MixPageInfo();
                mixPageInfo2.setPageType(g);
                mixPageInfo2.setPageUrl(c);
                mixPageInfo = mixPageInfo2;
            }
        }
        if (mixPageInfo != null) {
            if (TextUtils.equals("h5", mixPageInfo.getPageType())) {
                TMSLogger.b(TAG, ckf.p("tms h5 renderUrl: ", mixPageInfo.getPageUrl()));
                return new pds(iTMSPage, mixPageInfo.getPageUrl(), ocsVar);
            } else if (TextUtils.equals("weex2", mixPageInfo.getPageType())) {
                TMSLogger.b(TAG, ckf.p("tms weex2 renderUrl: ", mixPageInfo.getPageUrl()));
                String pageUrl = mixPageInfo.getPageUrl();
                ckf.d(pageUrl);
                return new ves(iTMSPage, pageUrl, ocsVar);
            }
        }
        TMSLogger.b(TAG, "unknown render type");
        getMInstance().x0(eas.e);
        return new pds(iTMSPage, "", ocsVar);
    }
}
