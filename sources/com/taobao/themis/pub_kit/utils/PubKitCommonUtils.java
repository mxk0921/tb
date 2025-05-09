package com.taobao.themis.pub_kit.utils;

import android.content.Context;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.metaInfo.manifest.AppManifest;
import com.taobao.themis.kernel.utils.CommonExtKt;
import com.taobao.themis.pub_kit.config.PubContainerContext;
import com.taobao.themis.pub_kit.config.PubRecommendClient;
import com.taobao.themis.pub_kit.guide.model.PubUserGuideModule;
import tb.ckf;
import tb.mcs;
import tb.ner;
import tb.t2o;
import tb.u3n;
import tb.xhv;
import tb.z54;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class PubKitCommonUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final PubKitCommonUtils INSTANCE = new PubKitCommonUtils();

    static {
        t2o.a(845152376);
    }

    public static /* synthetic */ Runnable d(PubKitCommonUtils pubKitCommonUtils, Context context, String str, String str2, JSONObject jSONObject, JSONArray jSONArray, PubUserGuideModule pubUserGuideModule, PubContainerContext pubContainerContext, String str3, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("2ee22aef", new Object[]{pubKitCommonUtils, context, str, str2, jSONObject, jSONArray, pubUserGuideModule, pubContainerContext, str3, new Integer(i), obj});
        }
        return pubKitCommonUtils.c(context, str, str2, jSONObject, jSONArray, pubUserGuideModule, pubContainerContext, (i & 128) != 0 ? null : str3);
    }

    public final boolean a(AppModel appModel) {
        JSONObject extendInfos;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb061b35", new Object[]{this, appModel})).booleanValue();
        }
        String str = null;
        if (!(appModel == null || (extendInfos = appModel.getExtendInfos()) == null)) {
            str = extendInfos.getString("needTeenagerProtection");
        }
        return ckf.b(str, "true");
    }

    public final boolean b(AppManifest appManifest) {
        AppManifest.AppInfo appInfo;
        JSONObject bizInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6be3a99", new Object[]{this, appManifest})).booleanValue();
        }
        String str = null;
        if (!(appManifest == null || (appInfo = appManifest.getAppInfo()) == null || (bizInfo = appInfo.getBizInfo()) == null)) {
            str = bizInfo.getString("needTeenagerProtection");
        }
        return ckf.b(str, "true");
    }

    public final Runnable c(final Context context, final String str, final String str2, final JSONObject jSONObject, final JSONArray jSONArray, final PubUserGuideModule pubUserGuideModule, final PubContainerContext pubContainerContext, final String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("1ce319d2", new Object[]{this, context, str, str2, jSONObject, jSONArray, pubUserGuideModule, pubContainerContext, str3});
        }
        ckf.g(context, "context");
        ckf.g(str, "appId");
        ckf.g(str2, "userId");
        ckf.g(jSONObject, "delta");
        ckf.g(jSONArray, "homePagePopDataList");
        ckf.g(pubUserGuideModule, "userGuideModule");
        ckf.g(pubContainerContext, "pubContainerContext");
        return new Runnable() { // from class: com.taobao.themis.pub_kit.utils.PubKitCommonUtils$getShowRecommendGuideRunnable$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                CommonExtKt.l(this);
                final String d = mcs.d("PubRecommendClient");
                mcs.e("PubRecommendClient", mcs.EVENT_ON_INIT, str3, d, new JSONObject());
                if (!ner.k(jSONArray)) {
                    String str4 = str3;
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put((JSONObject) "errorMsg", "首页侧未开启算法推荐弹窗");
                    xhv xhvVar = xhv.INSTANCE;
                    mcs.c("PubRecommendClient", mcs.EVENT_ON_ERROR, str4, d, jSONObject2);
                } else if (ner.o(jSONArray)) {
                    String str5 = str3;
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put((JSONObject) "errorMsg", "当前轻应用在首页");
                    xhv xhvVar2 = xhv.INSTANCE;
                    mcs.c("PubRecommendClient", mcs.EVENT_ON_ERROR, str5, d, jSONObject3);
                } else {
                    Integer c = u3n.c(pubUserGuideModule);
                    Integer b = u3n.b(pubUserGuideModule);
                    if (c == null && b == null) {
                        String str6 = str3;
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put((JSONObject) "errorMsg", "strongGuideAlgorithmUserStayTime or strongGuideAlgorithmUserClickTime is null");
                        xhv xhvVar3 = xhv.INSTANCE;
                        mcs.c("PubRecommendClient", mcs.EVENT_ON_ERROR, str6, d, jSONObject4);
                    }
                    PubRecommendClient.PubRecommendRequestParam pubRecommendRequestParam = new PubRecommendClient.PubRecommendRequestParam(str, jSONObject, c == null ? 0 : c.intValue(), b == null ? 0 : b.intValue(), (int) ((System.currentTimeMillis() - pubContainerContext.getUserEnterTime()) / 1000), pubContainerContext.getUserClickedCount() - 1);
                    mcs.e("PubRecommendClient", mcs.EVENT_ON_START, str3, d, new JSONObject(pubRecommendRequestParam.toMap()));
                    if (!pubContainerContext.isRecommendGuideShowing()) {
                        pubContainerContext.setRecommendGuideShowing(true);
                        final String str7 = str3;
                        final Context context2 = context;
                        final PubUserGuideModule pubUserGuideModule2 = pubUserGuideModule;
                        final JSONArray jSONArray2 = jSONArray;
                        final String str8 = str;
                        final String str9 = str2;
                        new PubRecommendClient(pubRecommendRequestParam, new z54<JSONObject, JSONObject>() { // from class: com.taobao.themis.pub_kit.utils.PubKitCommonUtils$getShowRecommendGuideRunnable$1$run$4
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            /* renamed from: a */
                            public void onFailure(String str10, String str11, JSONObject jSONObject5) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("476d5dea", new Object[]{this, str10, str11, jSONObject5});
                                    return;
                                }
                                String str12 = str7;
                                String str13 = d;
                                JSONObject jSONObject6 = new JSONObject();
                                jSONObject6.put((JSONObject) "errorCode", str10);
                                jSONObject6.put((JSONObject) "errorMsg", str11);
                                jSONObject6.put((JSONObject) "response", (String) jSONObject5);
                                xhv xhvVar4 = xhv.INSTANCE;
                                mcs.c("PubRecommendClient", mcs.EVENT_ON_ERROR, str12, str13, jSONObject6);
                            }

                            /* renamed from: b */
                            public void onSuccess(JSONObject jSONObject5) {
                                boolean z = false;
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("980108a5", new Object[]{this, jSONObject5});
                                    return;
                                }
                                mcs.e("PubRecommendClient", mcs.EVENT_ON_SUCCESS, str7, d, jSONObject5);
                                if (jSONObject5 != null) {
                                    z = ckf.b(jSONObject5.getBoolean("isReplace"), Boolean.TRUE);
                                }
                                if (!z || jSONObject5.getJSONObject("delta") == null) {
                                    String str10 = str7;
                                    String str11 = d;
                                    JSONObject jSONObject6 = new JSONObject();
                                    jSONObject6.put((JSONObject) "errorMsg", "response isReplace is false or delta is null");
                                    jSONObject6.put((JSONObject) "response", (String) jSONObject5);
                                    xhv xhvVar4 = xhv.INSTANCE;
                                    mcs.c("PubRecommendClient", mcs.EVENT_ON_ERROR, str10, str11, jSONObject6);
                                    return;
                                }
                                CommonExtKt.o(new PubKitCommonUtils$getShowRecommendGuideRunnable$1$run$4$onSuccess$1(context2, pubUserGuideModule2, jSONArray2, jSONObject5, d, str8, str9));
                            }
                        }).a();
                    }
                }
            }
        };
    }
}
