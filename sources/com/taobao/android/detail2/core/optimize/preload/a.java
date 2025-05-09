package com.taobao.android.detail2.core.optimize.preload;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.service.BUFS;
import com.taobao.android.detail2.core.framework.data.DetailDataManager;
import com.taobao.android.detail2.core.framework.data.net.recommend.RecInfoManager;
import com.taobao.android.detail2.core.framework.data.net.recommend.RecRequestParamsV2;
import java.net.URLEncoder;
import mtopsdk.mtop.domain.MtopResponse;
import tb.c4x;
import tb.h5o;
import tb.mp8;
import tb.mqj;
import tb.o2r;
import tb.oj7;
import tb.p7l;
import tb.q0j;
import tb.r19;
import tb.syj;
import tb.t2o;
import tb.txj;
import tb.ue7;
import tb.vv6;
import tb.x3w;
import tb.zxu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.detail2.core.optimize.preload.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class C0395a {

        /* renamed from: a  reason: collision with root package name */
        public JSONObject f7233a;
        public String b;
        public String c;
        public String d;
        public String e;
        public boolean f = false;

        static {
            t2o.a(352322201);
        }
    }

    static {
        t2o.a(352322200);
    }

    public static RecRequestParamsV2 a(RecRequestParamsV2 recRequestParamsV2, com.taobao.android.detail2.core.framework.data.global.a aVar, h5o h5oVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecRequestParamsV2) ipChange.ipc$dispatch("1f74530", new Object[]{recRequestParamsV2, aVar, h5oVar, new Integer(i)});
        }
        if (recRequestParamsV2 == null) {
            recRequestParamsV2 = new RecRequestParamsV2();
        }
        recRequestParamsV2.setItemId(h5oVar.j).setPageNum(String.valueOf(i)).setQueryParams(aVar.S()).setHalfScreenGuideIndexList(aVar.A()).setNewDetailVisibleSizeInfo(oj7.e(aVar)).setEntranceCardParams(aVar.n()).setAppId(RecInfoManager.REC_APP_ID).setIsOpenImmediatelyMode(aVar.D0()).setCustomBizParams(h5oVar.i).setPassParams(h5oVar.h).setNewDetailChannel(aVar.R().x).setNewType(aVar.R().t);
        if (vv6.a()) {
            recRequestParamsV2.setMockSpecifyLiveId(aVar.N().W());
        }
        return recRequestParamsV2;
    }

    public static RecRequestParamsV2 b(com.taobao.android.detail2.core.framework.data.global.a aVar, h5o h5oVar, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecRequestParamsV2) ipChange.ipc$dispatch("6a9e6552", new Object[]{aVar, h5oVar, new Boolean(z)});
        }
        int e = e(z, h5oVar);
        RecRequestParamsV2 recRequestParamsV2 = new RecRequestParamsV2();
        if (z) {
            str = "up";
        } else {
            str = "down";
        }
        recRequestParamsV2.setSlideMode(str);
        if ((aVar.N().g() && e != 0) || (aVar.N().h() && e == 0)) {
            long currentTimeMillis = System.currentTimeMillis();
            String feature = BUFS.getFeature(new BUFS.QueryArgs(), aVar.p().c(), aVar.p().a(), aVar.p().b());
            txj.e(txj.TAG_RENDER, "BUFS.getFeature耗时：" + (System.currentTimeMillis() - currentTimeMillis));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("bxFeature", (Object) feature);
            recRequestParamsV2.addBizParams(jSONObject);
        }
        recRequestParamsV2.setPreloadPassParams(aVar.P());
        recRequestParamsV2.setExposedItemIds(h5oVar.c.getAppendString());
        if (e == 0) {
            recRequestParamsV2.setLastUnExposedItemIdsStr(aVar.D());
        }
        if (aVar.p0()) {
            recRequestParamsV2.setExposedComplexIds(h5oVar.d.getAppendString());
        }
        recRequestParamsV2.setExposedCardSubTypes(h5oVar.e.getAppendString());
        recRequestParamsV2.setExposedItemCount(String.valueOf(h5oVar.g));
        return recRequestParamsV2;
    }

    public static h5o c(com.taobao.android.detail2.core.framework.data.global.a aVar, ue7 ue7Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h5o) ipChange.ipc$dispatch("276e9331", new Object[]{aVar, ue7Var, new Boolean(z)});
        }
        try {
            o2r.a("generatePreRealRequestParams");
            h5o d = d(aVar, ue7Var);
            RecRequestParamsV2 b = b(aVar, d, z);
            a(b, aVar, d, e(z, d));
            b.setNavRequest(true);
            d.k = b;
            return d;
        } finally {
            o2r.b();
        }
    }

    public static h5o d(com.taobao.android.detail2.core.framework.data.global.a aVar, x3w x3wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h5o) ipChange.ipc$dispatch("2e769937", new Object[]{aVar, x3wVar});
        }
        h5o h5oVar = new h5o();
        f(aVar, h5oVar);
        j(aVar, h5oVar, x3wVar);
        if (!com.taobao.android.detail2.core.framework.data.global.a.NO_ID_DEFAULT.equals(aVar.u())) {
            String u = aVar.u();
            h5oVar.c.add(u);
            String str = "_";
            if (x3wVar != null) {
                str = x3wVar.L(str);
            }
            h5oVar.e.add(str);
            if (aVar.N().u()) {
                mp8 mp8Var = new mp8();
                mp8Var.f24203a = u;
                mp8Var.b = str;
                h5oVar.f.add(mp8Var);
            }
        }
        return h5oVar;
    }

    public static int e(boolean z, h5o h5oVar) {
        DetailDataManager.f fVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fa2e6322", new Object[]{new Boolean(z), h5oVar})).intValue();
        }
        if (z) {
            fVar = h5oVar.f20425a;
        } else {
            fVar = h5oVar.b;
        }
        return fVar.f7119a + 1;
    }

    public static void f(com.taobao.android.detail2.core.framework.data.global.a aVar, h5o h5oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28ae82d", new Object[]{aVar, h5oVar});
            return;
        }
        try {
            String E = aVar.E(aVar.s());
            if (!TextUtils.isEmpty(E)) {
                Uri parse = Uri.parse(E);
                String str = parse.getHost() + parse.getPath();
                JSONObject jSONObject = new JSONObject();
                if (r19.q0()) {
                    jSONObject.put("assetsReleaseVersion", (Object) mqj.e(E));
                } else {
                    jSONObject.put("assetsReleaseVersion", (Object) c4x.c(E));
                }
                h5oVar.i.put(URLEncoder.encode(str, "UTF-8"), (Object) jSONObject);
            }
        } catch (Throwable th) {
            txj.f("new_detail异常", "initJSVersionForRequest异常", th);
        }
    }

    public static void j(com.taobao.android.detail2.core.framework.data.global.a aVar, h5o h5oVar, x3w x3wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95905523", new Object[]{aVar, h5oVar, x3wVar});
        } else if (!aVar.R().E && x3wVar != null) {
            h5oVar.j = x3wVar.N0();
        } else if (!TextUtils.isEmpty(aVar.t())) {
            h5oVar.j = aVar.t();
        }
    }

    public static void k(JSONObject jSONObject, h5o h5oVar) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71d0e268", new Object[]{jSONObject, h5oVar});
        } else if (h5oVar != null && (jSONObject2 = jSONObject.getJSONObject("passParams")) != null) {
            h5oVar.h = jSONObject2;
        }
    }

    public static C0395a g(MtopResponse mtopResponse) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C0395a) ipChange.ipc$dispatch("c4c97f0b", new Object[]{mtopResponse});
        }
        C0395a aVar = new C0395a();
        try {
            jSONObject = JSON.parseObject(new String(mtopResponse.getBytedata())).getJSONObject("data");
        } catch (Exception e) {
            txj.f("new_detail异常", "mtopresponse解析失败", e);
            jSONObject = null;
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            txj.e(txj.TAG_RENDER, "预请求preCheckMtopData，拿到的data为空");
            aVar.f7233a = null;
            aVar.b = "data null";
            return aVar;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("preloadSectionList");
        if (jSONObject2 == null || jSONObject2.isEmpty()) {
            txj.e(txj.TAG_RENDER, "预请求preCheckMtopData，拿到的preloadSectionList为空");
            aVar.f7233a = null;
            aVar.b = "data null";
            return aVar;
        }
        aVar.f7233a = jSONObject2;
        aVar.f = true;
        return aVar;
    }

    public static C0395a h(MtopResponse mtopResponse, boolean z, int i, h5o h5oVar) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C0395a) ipChange.ipc$dispatch("b200e88b", new Object[]{mtopResponse, new Boolean(z), new Integer(i), h5oVar});
        }
        C0395a aVar = new C0395a();
        try {
            jSONObject = JSON.parseObject(new String(mtopResponse.getBytedata())).getJSONObject("data");
        } catch (Throwable th) {
            th.printStackTrace();
            jSONObject = null;
        }
        String g = zxu.g(mtopResponse);
        if (jSONObject == null || jSONObject.keySet().size() == 0) {
            aVar.c = q0j.ERROR_CODE_RECOMMEND_DATA_EMPTY;
            aVar.e = g;
            aVar.d = "推荐data数据为空, itemId: " + h5oVar.j + ", isPageUp: " + z + ", pageIndex: " + i;
            aVar.f7233a = jSONObject;
            aVar.b = "empty data";
            return aVar;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("sectionList");
        if (jSONArray == null || jSONArray.isEmpty()) {
            aVar.c = q0j.ERROR_CODE_RECOMMEND_SECTION_EMPTY;
            aVar.e = g;
            aVar.d = "推荐section列表数据为空, itemId: " + h5oVar.j + ", isPageUp: " + z + ", pageIndex: " + i;
            aVar.f7233a = null;
            aVar.b = "empty sectionList";
            return aVar;
        }
        aVar.e = g;
        aVar.f7233a = jSONObject;
        aVar.f = true;
        return aVar;
    }

    public static void i(com.taobao.android.detail2.core.framework.data.global.a aVar, ue7 ue7Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("517eb312", new Object[]{aVar, ue7Var, new Boolean(z)});
        } else if (!z) {
            aVar.d1(true);
            try {
                JSONObject B = ue7Var.B();
                aVar.W0(B.getBooleanValue("enableWeexKeepLive"));
                aVar.X0(B.getBooleanValue("enableWeexKeepLiveWithActivity"));
                JSONObject jSONObject = B.getJSONObject("optimizeConfig");
                if (jSONObject != null) {
                    aVar.g1(new p7l(jSONObject));
                    ue7Var.b("optimizeConfig", aVar.M().a(aVar.R().x));
                }
            } catch (Throwable th) {
                txj.f("new_detail异常", "savePreloadFeature异常", th);
            }
            JSONObject H = ue7Var.H();
            if (r19.w()) {
                if (H == null) {
                    H = new JSONObject();
                }
                if (syj.a(ue7Var)) {
                    H.put(syj.ND_CLIENT_ALIGN_PREF_HOME_URL, "true");
                    txj.e(txj.TAG_TIP, "Result-AutoAlignWeexUrl align_pref_home , pref or guide-true");
                } else {
                    H.put(syj.ND_CLIENT_ALIGN_PREF_HOME_URL, "false");
                    txj.e(txj.TAG_TIP, "Result-AutoAlignWeexUrl align_pref_home , pref or guide-false");
                }
            }
            aVar.h1(H);
        }
    }
}
