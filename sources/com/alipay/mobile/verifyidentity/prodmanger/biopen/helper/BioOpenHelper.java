package com.alipay.mobile.verifyidentity.prodmanger.biopen.helper;

import android.os.Bundle;
import android.os.SystemClock;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.mobile.verifyidentity.bio.BioPreOpenHelper;
import com.alipay.mobile.verifyidentity.common.Constants;
import com.alipay.mobile.verifyidentity.common.ModuleConstants;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.info.EnvInfoUtil;
import com.alipay.mobile.verifyidentity.log.BehaviourIdEnum;
import com.alipay.mobile.verifyidentity.log.VerifyBehavorLogger;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.log.behavior.VerifyLogger;
import com.alipay.mobile.verifyidentity.prodmanger.biopen.callback.BioCheckCallback;
import com.alipay.mobile.verifyidentity.prodmanger.biopen.utils.BioCheckManager;
import com.alipay.mobile.verifyidentity.rpc.RpcException;
import com.alipay.mobile.verifyidentity.rpc.biz.MICRpcServiceBiz;
import com.alipay.mobile.verifyidentity.utils.VIUtils;
import com.alipay.mobile.verifyidentity.utils.task.AsyncTaskExecutor;
import com.alipay.mobileic.core.model.rpc.MICProdmngRequest;
import com.alipay.mobileic.core.model.rpc.MICProdmngResponse;
import com.alipay.security.mobile.api.AuthenticatorApi;
import com.alipay.security.mobile.auth.message.AuthenticatorResponse;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.musie.list.horizontal.HorizontalXslComponent;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import tb.upx;
import tb.yj4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class BioOpenHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "BioOpenHelper";

    /* renamed from: a  reason: collision with root package name */
    public static long f4369a;
    public static long b;
    public static String c;
    public static String d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface RpcCallBack {
        void onResult(String str, String str2, String str3, boolean z, MICProdmngResponse mICProdmngResponse);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        try {
            JSONObject jSONObject = JSON.parseObject(str).getJSONObject("pageModel");
            if (jSONObject == null) {
                return "";
            }
            String string = jSONObject.getString("registerCommand");
            jSONObject.getString(yj4.PARAM_PRODUCT_TYPE);
            String str2 = TAG;
            VerifyLogCat.i(str2, "registerCommand:" + string);
            JSONObject jSONObject2 = jSONObject.getJSONObject(HorizontalXslComponent.ATTR_PAGE_INFO);
            if (jSONObject2 == null) {
                return string;
            }
            VerifyLogCat.i(str2, "pageInfo not null");
            jSONObject2.getString("forceVerify");
            jSONObject2.getString("clientTexts");
            jSONObject2.getString("bizType");
            return string;
        } catch (Exception unused) {
            VerifyLogCat.e(TAG, "json fail");
            return null;
        }
    }

    public static /* synthetic */ void access$000(String str, String str2, MICProdmngResponse mICProdmngResponse, RpcCallBack rpcCallBack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e445d51", new Object[]{str, str2, mICProdmngResponse, rpcCallBack});
            return;
        }
        b = SystemClock.elapsedRealtime();
        if (mICProdmngResponse == null) {
            String str3 = TAG;
            VerifyLogCat.i(str3, "产品管理启动rpc异常 response: " + mICProdmngResponse);
            rpcCallBack.onResult(str2, str, "RPC_EXCEPTION", true, null);
        } else if ("QUERY_USERID".equalsIgnoreCase(str)) {
            rpcCallBack.onResult("", str, "", false, mICProdmngResponse);
        } else {
            if ("REGISTER_BIO_PREPARE".equalsIgnoreCase(str)) {
                b("UC-MobileIC-20180315-3", "", "", mICProdmngResponse.code, String.valueOf(mICProdmngResponse.success), String.valueOf(mICProdmngResponse.finish), "");
            } else if ("CLOSE_BIO".equalsIgnoreCase(str)) {
                b("UC-MobileIC-20180315-9", "", String.valueOf(b - f4369a), "", "", "", mICProdmngResponse.finishCode);
            } else if ("REGISTER_BIO_SUBMIT".equalsIgnoreCase(str)) {
                b("UC-MobileIC-20180315-8", "", String.valueOf(b - f4369a), "", "", "", mICProdmngResponse.finishCode);
            }
            if ("REGISTER_BIO_PREPARE".equalsIgnoreCase(str)) {
                Map<String, String> map = mICProdmngResponse.nextStep;
                if (!mICProdmngResponse.success) {
                    if (mICProdmngResponse.finish || !"SYSTEM_ERROR".equalsIgnoreCase(mICProdmngResponse.code)) {
                        if ("SYSTEM_ERROR".equalsIgnoreCase(mICProdmngResponse.code) && "1001".equalsIgnoreCase(mICProdmngResponse.finishCode)) {
                            rpcCallBack.onResult(str2, str, "SYSTEM_ERROR", false, mICProdmngResponse);
                            return;
                        } else if (map == null || map.isEmpty()) {
                            rpcCallBack.onResult(str2, str, "RPC_EXCEPTION", true, mICProdmngResponse);
                            return;
                        } else if (!mICProdmngResponse.finish && "not_exist_bic_feature".equalsIgnoreCase(mICProdmngResponse.code)) {
                            rpcCallBack.onResult(str2, str, "1000", true, mICProdmngResponse);
                            return;
                        } else if (!mICProdmngResponse.finish && "not_install_ifaa".equalsIgnoreCase(mICProdmngResponse.code)) {
                            rpcCallBack.onResult(str2, str, "1000", true, mICProdmngResponse);
                            return;
                        }
                    }
                    rpcCallBack.onResult(str2, str, "SYSTEM_ERROR", true, mICProdmngResponse);
                } else if (mICProdmngResponse.finish) {
                    rpcCallBack.onResult(str2, str, "1004", false, mICProdmngResponse);
                } else {
                    rpcCallBack.onResult(str2, str, "1000", false, mICProdmngResponse);
                }
            } else if (mICProdmngResponse.success) {
                rpcCallBack.onResult(str2, str, "1000", false, mICProdmngResponse);
            } else if ("RPC_EXCEPTION".equalsIgnoreCase(mICProdmngResponse.code)) {
                rpcCallBack.onResult(str2, str, "RPC_EXCEPTION", true, mICProdmngResponse);
            } else if (mICProdmngResponse.finish || !"SYSTEM_ERROR".equalsIgnoreCase(mICProdmngResponse.code)) {
                rpcCallBack.onResult(str2, str, "SYSTEM_ERROR", false, mICProdmngResponse);
            } else {
                rpcCallBack.onResult(str2, str, "SYSTEM_ERROR", true, mICProdmngResponse);
            }
        }
    }

    public static /* synthetic */ String access$100(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("30255a5e", new Object[]{str});
        }
        return a(str);
    }

    public static void b(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54b86a6e", new Object[]{str, str2, str3, str4, str5, str6, str7});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("code", str4);
        hashMap.put("success", str5);
        hashMap.put("finish", str6);
        hashMap.put(MspFlybirdDefine.FLYBIRD_VIDATA_FINISH_CODE, str7);
        hashMap.put("sceneId", d);
        hashMap.put(upx.PRODUCT_ID, c);
        VerifyLogger.getInstance().eventBehavior(str, "", str2, str3, hashMap);
    }

    public static void doBioRpcRequest(String str, String str2, String str3, Bundle bundle, RpcCallBack rpcCallBack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a0c76d2", new Object[]{str, str2, str3, bundle, rpcCallBack});
            return;
        }
        f4369a = SystemClock.elapsedRealtime();
        if (bundle != null) {
            c = bundle.getString(upx.PRODUCT_ID);
            d = bundle.getString("sceneId");
        }
        doBioRpcRequest(str, str2, str3, bundle, true, rpcCallBack);
    }

    public static void openBioPayRpcRequest(final String str, final String str2, final RpcCallBack rpcCallBack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("506b08cb", new Object[]{str, str2, rpcCallBack});
        } else {
            AsyncTaskExecutor.getInstance().execute(new Runnable() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.helper.BioOpenHelper.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        MICProdmngRequest mICProdmngRequest = new MICProdmngRequest();
                        mICProdmngRequest.module = str;
                        String str3 = str2;
                        mICProdmngRequest.action = str3;
                        if ("queryComponent".equalsIgnoreCase(str3)) {
                            String envData = EnvInfoUtil.getEnvData(null);
                            HashMap hashMap = new HashMap();
                            hashMap.put("viData", JSON.parse(envData));
                            mICProdmngRequest.envData = hashMap;
                        } else {
                            Map<String, Object> baseEnvData = EnvInfoUtil.getBaseEnvData();
                            baseEnvData.put(ModuleConstants.VI_MODULE_BIO_METAINFO, EnvInfoUtil.getBioMetaInfo());
                            mICProdmngRequest.envData = baseEnvData;
                        }
                        HashMap hashMap2 = new HashMap();
                        mICProdmngRequest.params = hashMap2;
                        hashMap2.put("tbsid", null);
                        mICProdmngRequest.params.put("secData", AuthenticatorApi.getRegAuthData(MicroModuleContext.getInstance().getContext(), 0, 0, VIUtils.getUserId()));
                        mICProdmngRequest.params.put(upx.PRODUCT_ID, BioPreOpenHelper.g());
                        mICProdmngRequest.params.put("bizId", "5344");
                        mICProdmngRequest.params.put("sceneId", "mobileic_tbbiopay_tbbiopay_setup_alipay_mobileClient");
                        mICProdmngRequest.params.put("alertText", null);
                        mICProdmngRequest.params.put("needOpenBioPay", "true");
                        mICProdmngRequest.params.put("userId", BioPreOpenHelper.h());
                        mICProdmngRequest.params.put(yj4.PARAM_PRODUCT_TYPE, BioPreOpenHelper.f());
                        VerifyLogCat.e("Verifyidentity", JSON.toJSONString(mICProdmngRequest));
                        MICProdmngResponse prodmng = new MICRpcServiceBiz().prodmng(mICProdmngRequest);
                        if (prodmng.success) {
                            VerifyLogCat.e("Verifyidentity", "Prepre Success,rep:" + JSON.toJSONString(prodmng));
                            rpcCallBack.onResult(prodmng.token, str2, "1000", false, prodmng);
                            return;
                        }
                        VerifyLogCat.e("Verifyidentity", "Prepre Fail,rep:" + JSON.toJSONString(prodmng));
                        rpcCallBack.onResult(prodmng.token, str2, "SYSTEM_ERROR", false, prodmng);
                    } catch (RpcException unused) {
                        MicroModuleContext.getInstance().dismissProgressDialog();
                        MICProdmngResponse mICProdmngResponse = new MICProdmngResponse();
                        mICProdmngResponse.code = "2003";
                        rpcCallBack.onResult("", str2, "RPC_EXCEPTION", true, mICProdmngResponse);
                    }
                }
            }, str2);
        }
    }

    public static void preOpenBioPayRpcRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bd7ae3e", new Object[0]);
            return;
        }
        VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, "UC-MobileIC-240620-11", Constants.VI_ENGINE_APPID, "obfp", "", "", null, new HashMap());
        openBioPayRpcRequest("BIC", "REGISTER_BIO_PREPARE", new RpcCallBack() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.helper.BioOpenHelper.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.mobile.verifyidentity.prodmanger.biopen.helper.BioOpenHelper.RpcCallBack
            public final void onResult(final String str, String str2, String str3, boolean z, final MICProdmngResponse mICProdmngResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c40fbbe1", new Object[]{this, str, str2, str3, new Boolean(z), mICProdmngResponse});
                } else if (str3.equalsIgnoreCase("1000")) {
                    BioCheckManager bioCheckManager = new BioCheckManager(MicroModuleContext.getInstance().getContext());
                    mICProdmngResponse.data.get("pageModel");
                    bioCheckManager.a(1, BioOpenHelper.access$100(JSON.toJSONString(mICProdmngResponse.data)), "mobileic_tbbiopay_tbbiopay_setup_alipay_mobileClient", "", new BioCheckCallback() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.helper.BioOpenHelper.2.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.alipay.mobile.verifyidentity.prodmanger.biopen.callback.BioCheckCallback
                        public void onBioCheckResult(AuthenticatorResponse authenticatorResponse) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("51346624", new Object[]{this, authenticatorResponse});
                                return;
                            }
                            try {
                                VerifyLogCat.i(VerifyBehavorLogger.LOG_BIZ_TYPE, "PreBioRep result :" + authenticatorResponse.getResult());
                                if (authenticatorResponse.getResult() == 100) {
                                    HashMap hashMap = new HashMap();
                                    hashMap.put("sceneId", "mobileic_tbbiopay_tbbiopay_setup_alipay_mobileClient");
                                    hashMap.put("bizId", "5344");
                                    hashMap.put(yj4.PARAM_PRODUCT_TYPE, BioPreOpenHelper.f());
                                    hashMap.put("data", authenticatorResponse.getData());
                                    hashMap.put("secData", AuthenticatorApi.getRegAuthData(MicroModuleContext.getInstance().getContext(), 0, 0, VIUtils.getUserId()));
                                    VerifyLogCat.e("Verifyidentity", "preOpenBio:userId from cashier:" + BioPreOpenHelper.h() + "userId origin:" + VIUtils.getUserId());
                                    HashMap hashMap2 = new HashMap();
                                    hashMap2.put("token", str);
                                    hashMap2.put("module", mICProdmngResponse.nextStep.get("module"));
                                    hashMap2.put("action", "REGISTER_BIO_SUBMIT");
                                    hashMap2.put("envData", JSON.parse(EnvInfoUtil.getEnvData(null)));
                                    hashMap2.put("params", hashMap);
                                    BioPreOpenHelper.b(JSON.toJSONString(hashMap2));
                                    VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, "UC-MobileIC-240620-6", Constants.VI_ENGINE_APPID, "obfp", "", "", null, new HashMap());
                                    return;
                                }
                                VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, "UC-MobileIC-240620-5", Constants.VI_ENGINE_APPID, "obfp", "", "", null, new HashMap());
                            } catch (Throwable unused) {
                                VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, "UC-MobileIC-240620-10", Constants.VI_ENGINE_APPID, "obfp", "", "", null, new HashMap());
                                VerifyLogCat.e(BioOpenHelper.TAG, "BioChecke Json Parse Error");
                            }
                        }
                    });
                }
            }
        });
    }

    public static void doBioRpcRequest(final String str, final String str2, final String str3, final Bundle bundle, final boolean z, final RpcCallBack rpcCallBack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc1ff8ce", new Object[]{str, str2, str3, bundle, new Boolean(z), rpcCallBack});
            return;
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        AsyncTaskExecutor.getInstance().execute(new Runnable() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.helper.BioOpenHelper.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    if (z) {
                        if ("REGISTER_BIO_SUBMIT".equalsIgnoreCase(str3)) {
                            MicroModuleContext.getInstance().showProgressProDialog(MicroModuleContext.getInstance().getContext().getString(R.string.open_loading));
                        } else if ("CLOSE_BIO".equalsIgnoreCase(str3)) {
                            MicroModuleContext.getInstance().showProgressProDialog(MicroModuleContext.getInstance().getContext().getString(R.string.close_loading));
                        } else {
                            MicroModuleContext.getInstance().showProgressProDialog("");
                        }
                    }
                    MICProdmngRequest mICProdmngRequest = new MICProdmngRequest();
                    mICProdmngRequest.token = str;
                    mICProdmngRequest.module = str2;
                    String str4 = str3;
                    mICProdmngRequest.action = str4;
                    if ("queryComponent".equalsIgnoreCase(str4)) {
                        String envData = EnvInfoUtil.getEnvData(null);
                        HashMap hashMap = new HashMap();
                        hashMap.put("viData", JSON.parse(envData));
                        mICProdmngRequest.envData = hashMap;
                    } else {
                        Map<String, Object> baseEnvData = EnvInfoUtil.getBaseEnvData();
                        baseEnvData.put(ModuleConstants.VI_MODULE_BIO_METAINFO, EnvInfoUtil.getBioMetaInfo());
                        mICProdmngRequest.envData = baseEnvData;
                    }
                    mICProdmngRequest.params = new HashMap();
                    for (String str5 : bundle.keySet()) {
                        mICProdmngRequest.params.put(str5, bundle.get(str5));
                    }
                    MICProdmngResponse prodmng = new MICRpcServiceBiz().prodmng(mICProdmngRequest);
                    MicroModuleContext.getInstance().dismissProgressDialog();
                    BioOpenHelper.access$000(str3, str, prodmng, rpcCallBack);
                } catch (RpcException unused) {
                    MicroModuleContext.getInstance().dismissProgressDialog();
                    MICProdmngResponse mICProdmngResponse = new MICProdmngResponse();
                    mICProdmngResponse.code = "2003";
                    rpcCallBack.onResult(str, str3, "RPC_EXCEPTION", true, mICProdmngResponse);
                }
            }
        }, str3);
    }
}
