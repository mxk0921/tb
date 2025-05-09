package com.alipay.mobile.verifyidentity.prod.manager.engine;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.mobile.verifyidentity.callback.ProdManagerListener;
import com.alipay.mobile.verifyidentity.callback.RecommendBioListener;
import com.alipay.mobile.verifyidentity.common.ModuleConstants;
import com.alipay.mobile.verifyidentity.data.ProdManagerResult;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.engine.VerifyIdentityEngine;
import com.alipay.mobile.verifyidentity.info.EnvInfoUtil;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.log.behavior.VerifyLogger;
import com.alipay.mobile.verifyidentity.prod.manager.ProdManagerMetaInfo;
import com.alipay.mobile.verifyidentity.prod.manager.module.BaseProdManager;
import com.alipay.mobile.verifyidentity.rpc.RpcException;
import com.alipay.mobile.verifyidentity.rpc.biz.MICRpcServiceBiz;
import com.alipay.mobile.verifyidentity.utils.task.AsyncTaskExecutor;
import com.alipay.mobileic.core.model.rpc.MICProdmngRequest;
import com.alipay.mobileic.core.model.rpc.MICProdmngResponse;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import tb.iv8;
import tb.upx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ProductManagerEngine {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile ProductManagerEngine c;

    /* renamed from: a  reason: collision with root package name */
    public String f4339a;
    public long b;

    public ProductManagerEngine(Context context) {
        VerifyIdentityEngine.getInstance(context);
    }

    public static BaseProdManager a(String str) {
        String str2 = ProdManagerMetaInfo.f4338a.get(str);
        try {
            return (BaseProdManager) Class.forName(str2).newInstance();
        } catch (Throwable th) {
            VerifyLogCat.e("ProductManagerEngine", "Fail to load " + str2, th);
            return null;
        }
    }

    public static /* synthetic */ void access$000(ProductManagerEngine productManagerEngine, MICProdmngResponse mICProdmngResponse, String str, Bundle bundle, ProdManagerListener prodManagerListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8e1e254", new Object[]{productManagerEngine, mICProdmngResponse, str, bundle, prodManagerListener});
            return;
        }
        VerifyLogCat.i("ProductManagerEngine", "bio response code:" + mICProdmngResponse.code + ", success:" + mICProdmngResponse.success + "，message:" + mICProdmngResponse.message + ",token:" + mICProdmngResponse.token);
        productManagerEngine.f4339a = bundle.getString("forbidUI");
        String string = bundle.getString("sceneId");
        String string2 = bundle.getString(upx.PRODUCT_ID);
        Map<String, String> map = mICProdmngResponse.nextStep;
        if (mICProdmngResponse.success) {
            boolean z = mICProdmngResponse.finish;
            if (!z) {
                if (map == null || map.isEmpty()) {
                    VerifyLogCat.i("ProductManagerEngine", "nextStep为空");
                    if (!"true".equalsIgnoreCase(productManagerEngine.f4339a)) {
                        j();
                    }
                    productManagerEngine.c(mICProdmngResponse, string, string2);
                    d(str, "1001", prodManagerListener);
                    return;
                }
                VerifyLogCat.i("ProductManagerEngine", "startProManager:" + mICProdmngResponse.code);
                i(mICProdmngResponse.token, map, mICProdmngResponse.code, mICProdmngResponse.data, bundle, prodManagerListener);
            } else if (z) {
                VerifyLogCat.i("ProductManagerEngine", "重复开通");
                if ("1000".equalsIgnoreCase(mICProdmngResponse.finishCode)) {
                    productManagerEngine.c(mICProdmngResponse, string, string2);
                    d(str, "1000", prodManagerListener);
                    return;
                }
                if (!"true".equalsIgnoreCase(productManagerEngine.f4339a)) {
                    j();
                }
                productManagerEngine.c(mICProdmngResponse, string, string2);
                d(str, "1001", prodManagerListener);
            }
        } else if (mICProdmngResponse.finish && "SYSTEM_ERROR".equalsIgnoreCase(mICProdmngResponse.code)) {
            VerifyLogCat.i("ProductManagerEngine", "系统异常");
            if (!"true".equalsIgnoreCase(productManagerEngine.f4339a)) {
                j();
            }
            productManagerEngine.c(mICProdmngResponse, string, string2);
            d(str, "1001", prodManagerListener);
        } else if (!mICProdmngResponse.finish && "FACE_REGISTER_ERROR_CODE".equalsIgnoreCase(mICProdmngResponse.code)) {
            VerifyLogCat.i("ProductManagerEngine", "人脸开通错误");
            productManagerEngine.c(mICProdmngResponse, string, string2);
            g(str, iv8.FCANVAS_ERROR_OPEN_GL, mICProdmngResponse.message, prodManagerListener);
        } else if (!mICProdmngResponse.finish && "not_exist_bic_feature".equalsIgnoreCase(mICProdmngResponse.code)) {
            VerifyLogCat.i("ProductManagerEngine", "未录入生物特征");
            i(mICProdmngResponse.token, map, mICProdmngResponse.code, mICProdmngResponse.data, bundle, prodManagerListener);
        } else if (!mICProdmngResponse.finish && "not_install_ifaa".equalsIgnoreCase(mICProdmngResponse.code)) {
            VerifyLogCat.i("ProductManagerEngine", "未安装生物服务");
            i(mICProdmngResponse.token, map, mICProdmngResponse.code, mICProdmngResponse.data, bundle, prodManagerListener);
        } else if (!mICProdmngResponse.finish || !"2001".equalsIgnoreCase(mICProdmngResponse.finishCode)) {
            VerifyLogCat.i("ProductManagerEngine", "系统异常");
            if (!"true".equalsIgnoreCase(productManagerEngine.f4339a)) {
                j();
            }
            productManagerEngine.c(mICProdmngResponse, string, string2);
            d(str, "1001", prodManagerListener);
        } else {
            i(mICProdmngResponse.token, map, mICProdmngResponse.code, mICProdmngResponse.data, bundle, prodManagerListener);
        }
    }

    public static /* synthetic */ String access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c2478e8", new Object[0]);
        }
        return "ProductManagerEngine";
    }

    public static /* synthetic */ String access$200(ProductManagerEngine productManagerEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b8c2324d", new Object[]{productManagerEngine});
        }
        return productManagerEngine.f4339a;
    }

    public static /* synthetic */ void access$300(ProductManagerEngine productManagerEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebba08d2", new Object[]{productManagerEngine});
        } else {
            b();
        }
    }

    public static /* synthetic */ void access$400(ProductManagerEngine productManagerEngine, String str, ProdManagerListener prodManagerListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1b20e4", new Object[]{productManagerEngine, str, prodManagerListener});
        } else {
            d(str, "2003", prodManagerListener);
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            MicroModuleContext.getInstance().toast("网络不给力", R.drawable.warning, 0);
        }
    }

    public static void d(String str, String str2, ProdManagerListener prodManagerListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a2159c3", new Object[]{str, str2, prodManagerListener});
        } else {
            g(str, str2, "", prodManagerListener);
        }
    }

    public static void e(String str, String str2, RecommendBioListener recommendBioListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8934183", new Object[]{str, str2, recommendBioListener});
        } else if (recommendBioListener == null) {
            VerifyLogCat.i("ProductManagerEngine", "调用方没有传入回调，放弃回调");
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", (Object) str2);
            jSONObject.put("result", (Object) str);
            recommendBioListener.onResult(jSONObject.toJSONString());
        }
    }

    public static void g(String str, String str2, String str3, ProdManagerListener prodManagerListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8beae5b9", new Object[]{str, str2, str3, prodManagerListener});
        } else if (prodManagerListener == null) {
            VerifyLogCat.i("ProductManagerEngine", "调用方没有传入回调，放弃回调");
        } else {
            ProdManagerResult prodManagerResult = new ProdManagerResult(str2);
            if (!TextUtils.isEmpty(str3)) {
                prodManagerResult.setMessage(str3);
            }
            prodManagerListener.onResult(str, prodManagerResult);
        }
    }

    public static ProductManagerEngine getInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ProductManagerEngine) ipChange.ipc$dispatch("99234b2", new Object[]{context});
        }
        if (c == null) {
            synchronized (ProductManagerEngine.class) {
                try {
                    if (c == null) {
                        c = new ProductManagerEngine(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public static void h(String str, String str2, String str3, String str4, String str5, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2562e1a4", new Object[]{str, str2, str3, str4, str5, str6});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("success", str2);
        hashMap.put("code", str3);
        hashMap.put(MspFlybirdDefine.FLYBIRD_VIDATA_FINISH_CODE, str4);
        hashMap.put("sceneId", str5);
        hashMap.put(upx.PRODUCT_ID, str6);
        VerifyLogger.getInstance().eventBehavior(str, "", "", "", hashMap);
    }

    public static void i(String str, Map<String, String> map, String str2, Map<String, String> map2, Bundle bundle, ProdManagerListener prodManagerListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a0c4333", new Object[]{str, map, str2, map2, bundle, prodManagerListener});
            return;
        }
        VerifyLogCat.i("ProductManagerEngine", "启动对应产品管理类:" + str2);
        String str3 = map.get("module");
        String str4 = map.get("action");
        BaseProdManager a2 = a(str3);
        if (a2 != null) {
            a2.mName = str3;
            a2.create(str, str4, str2, JSON.toJSONString(map2), JSON.toJSONString(map), bundle, prodManagerListener);
            return;
        }
        d(str, "1002", prodManagerListener);
        VerifyLogCat.i("ProductManagerEngine", "启动产品管理类异常");
    }

    public static void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else {
            MicroModuleContext.getInstance().toast("系统正忙，稍后再试", R.drawable.warning, 0);
        }
    }

    public final void c(MICProdmngResponse mICProdmngResponse, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71c1b2e0", new Object[]{this, mICProdmngResponse, str, str2});
        } else if ("true".equalsIgnoreCase(this.f4339a)) {
            h("UC-MobileIC-20180315-3", String.valueOf(mICProdmngResponse.success), mICProdmngResponse.code, mICProdmngResponse.finishCode, str, str2);
        } else {
            h("UC-MobileIC-20180315-2", String.valueOf(mICProdmngResponse.success), mICProdmngResponse.code, mICProdmngResponse.finishCode, str, str2);
        }
    }

    public final void f(final String str, final String str2, final String str3, final Bundle bundle, final ProdManagerListener prodManagerListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a545231", new Object[]{this, str, str2, str3, bundle, prodManagerListener});
            return;
        }
        final Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        AsyncTaskExecutor.getInstance().execute(new Runnable() { // from class: com.alipay.mobile.verifyidentity.prod.manager.engine.ProductManagerEngine.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    MicroModuleContext.getInstance().showProgressProDialog("");
                    MICProdmngRequest mICProdmngRequest = new MICProdmngRequest();
                    mICProdmngRequest.token = str;
                    mICProdmngRequest.module = str2;
                    mICProdmngRequest.action = str3;
                    Map<String, Object> baseEnvData = EnvInfoUtil.getBaseEnvData();
                    baseEnvData.put(ModuleConstants.VI_MODULE_BIO_METAINFO, EnvInfoUtil.getBioMetaInfo());
                    mICProdmngRequest.envData = baseEnvData;
                    mICProdmngRequest.params = new HashMap();
                    for (String str4 : bundle2.keySet()) {
                        mICProdmngRequest.params.put(str4, bundle2.get(str4));
                    }
                    ProductManagerEngine.access$000(ProductManagerEngine.this, new MICRpcServiceBiz().prodmng(mICProdmngRequest), str, bundle, prodManagerListener);
                    MicroModuleContext.getInstance().dismissProgressDialog();
                } catch (RpcException unused) {
                    VerifyLogCat.i(ProductManagerEngine.access$100(), "RPC异常");
                    MicroModuleContext.getInstance().dismissProgressDialog();
                    if (!"true".equalsIgnoreCase(ProductManagerEngine.access$200(ProductManagerEngine.this))) {
                        ProductManagerEngine.access$300(ProductManagerEngine.this);
                    }
                    ProductManagerEngine.access$400(ProductManagerEngine.this, str, prodManagerListener);
                }
            }
        }, "getNextStep");
    }

    public boolean isDoubleClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f3d16b8", new Object[]{this})).booleanValue();
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.b;
        if (0 < j && j < 1000) {
            return true;
        }
        this.b = elapsedRealtime;
        return false;
    }

    public synchronized void startByToken(String str, String str2, String str3, Bundle bundle, ProdManagerListener prodManagerListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6f69870", new Object[]{this, str, str2, str3, bundle, prodManagerListener});
        } else if (!isDoubleClick()) {
            f(str, str2, str3, bundle, prodManagerListener);
        }
    }

    public synchronized void startByVIData(String str, Bundle bundle, RecommendBioListener recommendBioListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2dbb0d4", new Object[]{this, str, bundle, recommendBioListener});
            return;
        }
        VerifyLogCat.i("ProductManagerEngine", "启动支付后推荐开通");
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject parseObject = JSON.parseObject(str);
                if (parseObject != null) {
                    String string = parseObject.getString("token");
                    String string2 = parseObject.getString("productCode");
                    h("UC-MobileIC-20180904-1", "", "", "", parseObject.getString("sceneId"), parseObject.getString(upx.PRODUCT_ID));
                    if (bundle != null) {
                        bundle.putString("source", "startByVIData");
                    } else {
                        bundle = new Bundle();
                        bundle.putString("source", "startByVIData");
                    }
                    BaseProdManager a2 = a(string2);
                    if (a2 != null) {
                        a2.mName = string2;
                        a2.create(string, str, bundle, recommendBioListener);
                        return;
                    }
                    e(string, "1002", recommendBioListener);
                    VerifyLogCat.i("ProductManagerEngine", "启动支付后推荐异常");
                }
                return;
            } catch (Exception unused) {
            }
        }
        e("", "1002", recommendBioListener);
    }

    public synchronized void startByToken(String str, Bundle bundle, ProdManagerListener prodManagerListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d19fc4dc", new Object[]{this, str, bundle, prodManagerListener});
        } else {
            f(str, "", "", bundle, prodManagerListener);
        }
    }
}
