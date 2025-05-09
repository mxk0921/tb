package com.alipay.mobile.verifyidentity.prodmanger;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager;
import com.alipay.mobile.verifyidentity.callback.ProdManagerListener;
import com.alipay.mobile.verifyidentity.common.ModuleConstants;
import com.alipay.mobile.verifyidentity.data.ProdManagerResult;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.engine.VerifyIdentityEngine;
import com.alipay.mobile.verifyidentity.info.EnvInfoUtil;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.log.behavior.VerifyLogger;
import com.alipay.mobile.verifyidentity.prod.manager.engine.ProductManagerEngine;
import com.alipay.mobile.verifyidentity.prodmanger.biopen.data.BioInfoFull;
import com.alipay.mobile.verifyidentity.prodmanger.biopen.helper.BioOpenHelper;
import com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity;
import com.alipay.mobile.verifyidentity.utils.ReflectUtils;
import com.alipay.mobileic.core.model.rpc.MICProdmngResponse;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import tb.upx;
import tb.yj4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class BioVerifyStarter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile BioVerifyStarter f4345a;

    public BioVerifyStarter(Context context) {
        VerifyIdentityEngine.getInstance(context);
    }

    public static String a(MICProdmngResponse mICProdmngResponse, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("69cf0ca", new Object[]{mICProdmngResponse, str});
        }
        String str2 = "";
        if (mICProdmngResponse == null || "RPC_EXCEPTION".equalsIgnoreCase(str)) {
            VerifyLogCat.i("BioVerifyStarter", "RPC_EXCEPTION");
            return str2;
        } else if (mICProdmngResponse.success || !"SYSTEM_ERROR".equalsIgnoreCase(mICProdmngResponse.code)) {
            Map<String, String> map = mICProdmngResponse.data;
            if (map == null || map.isEmpty()) {
                VerifyLogCat.i("BioVerifyStarter", "data为空");
                return str2;
            }
            try {
                String str3 = map.get("targetURL");
                if (mICProdmngResponse.success && !TextUtils.isEmpty(str3)) {
                    VerifyLogCat.i("BioVerifyStarter", "targetURL: " + str3);
                    str2 = Uri.parse(str3).getQueryParameter("sceneId");
                }
            } catch (Throwable th) {
                VerifyLogCat.e("BioVerifyStarter", "getSceneId exp: ", th);
            }
            VerifyLogCat.i("BioVerifyStarter", "sceneId: " + str2);
            return str2;
        } else {
            VerifyLogCat.i("BioVerifyStarter", "SYSTEM_ERROR");
            return str2;
        }
    }

    public static /* synthetic */ String access$100(BioVerifyStarter bioVerifyStarter, MICProdmngResponse mICProdmngResponse, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cca250bf", new Object[]{bioVerifyStarter, mICProdmngResponse, str});
        }
        String str2 = "BIC";
        if (mICProdmngResponse == null || "RPC_EXCEPTION".equalsIgnoreCase(str)) {
            VerifyLogCat.i("BioVerifyStarter", "RPC_EXCEPTION");
            return str2;
        } else if (mICProdmngResponse.success || !"SYSTEM_ERROR".equalsIgnoreCase(mICProdmngResponse.code)) {
            Map<String, String> map = mICProdmngResponse.nextStep;
            if (map == null || map.isEmpty()) {
                VerifyLogCat.i("BioVerifyStarter", "nextStep为空");
                return str2;
            }
            String str3 = map.get("module");
            if (mICProdmngResponse.success && !TextUtils.isEmpty(str3) && !"NONE".equalsIgnoreCase(str3)) {
                str2 = str3;
            }
            VerifyLogCat.i("BioVerifyStarter", "module: " + str2);
            return str2;
        } else {
            VerifyLogCat.i("BioVerifyStarter", "SYSTEM_ERROR");
            return str2;
        }
    }

    public static /* synthetic */ String access$200(BioVerifyStarter bioVerifyStarter, MICProdmngResponse mICProdmngResponse, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("60860900", new Object[]{bioVerifyStarter, mICProdmngResponse, str});
        }
        return a(mICProdmngResponse, str);
    }

    public static /* synthetic */ void access$300(BioVerifyStarter bioVerifyStarter, Bundle bundle, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdd03d69", new Object[]{bioVerifyStarter, bundle, str, str2});
        } else {
            bioVerifyStarter.c(bundle, str, str2);
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            MicroModuleContext.getInstance().toast("系统异常", R.drawable.vi_warning, 0);
        }
    }

    public static BioVerifyStarter getInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BioVerifyStarter) ipChange.ipc$dispatch("4caa11c5", new Object[]{context});
        }
        if (f4345a == null) {
            synchronized (BioVerifyStarter.class) {
                try {
                    if (f4345a == null) {
                        f4345a = new BioVerifyStarter(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f4345a;
    }

    public final void c(final Bundle bundle, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6abb7e80", new Object[]{this, bundle, str, str2});
        } else {
            BioOpenHelper.doBioRpcRequest("", str, str2, bundle, new BioOpenHelper.RpcCallBack() { // from class: com.alipay.mobile.verifyidentity.prodmanger.BioVerifyStarter.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.mobile.verifyidentity.prodmanger.biopen.helper.BioOpenHelper.RpcCallBack
                public final void onResult(String str3, String str4, String str5, boolean z, MICProdmngResponse mICProdmngResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c40fbbe1", new Object[]{this, str3, str4, str5, new Boolean(z), mICProdmngResponse});
                    } else {
                        BioVerifyStarter.access$000(BioVerifyStarter.this, mICProdmngResponse, str5, bundle);
                    }
                }
            });
        }
    }

    public void setInitParams(final Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74f75935", new Object[]{this, bundle});
            return;
        }
        String string = bundle.getString("productCode");
        VerifyLogCat.i("BioVerifyStarter", "initParams module: " + string);
        if (TextUtils.isEmpty(string) || (!"BIC".equalsIgnoreCase(string) && !"BIS".equalsIgnoreCase(string) && !ModuleConstants.VI_MODULE_MENU.equalsIgnoreCase(string))) {
            bundle.putString("_rpcSource_", "ALIAPP");
            bundle.putString("uidType", "tbSid");
            BioOpenHelper.doBioRpcRequest("", "TB_MENU", "queryComponent", bundle, new BioOpenHelper.RpcCallBack() { // from class: com.alipay.mobile.verifyidentity.prodmanger.BioVerifyStarter.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.mobile.verifyidentity.prodmanger.biopen.helper.BioOpenHelper.RpcCallBack
                public final void onResult(String str, String str2, String str3, boolean z, MICProdmngResponse mICProdmngResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c40fbbe1", new Object[]{this, str, str2, str3, new Boolean(z), mICProdmngResponse});
                        return;
                    }
                    String access$100 = BioVerifyStarter.access$100(BioVerifyStarter.this, mICProdmngResponse, str3);
                    String access$200 = BioVerifyStarter.access$200(BioVerifyStarter.this, mICProdmngResponse, str3);
                    Bundle bundle2 = bundle;
                    if (!TextUtils.isEmpty(access$200)) {
                        bundle2.putString("sceneId", access$200);
                    }
                    bundle2.putString("productCode", access$100);
                    BioVerifyStarter.access$300(BioVerifyStarter.this, bundle2, "BIC", "QUERY_USERID");
                }
            });
            return;
        }
        c(bundle, "BIC", "QUERY_USERID");
    }

    public static /* synthetic */ void access$000(BioVerifyStarter bioVerifyStarter, MICProdmngResponse mICProdmngResponse, String str, Bundle bundle) {
        BioInfoFull bioInfoFull;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c10e8932", new Object[]{bioVerifyStarter, mICProdmngResponse, str, bundle});
        } else if (mICProdmngResponse == null || "RPC_EXCEPTION".equalsIgnoreCase(str)) {
            MicroModuleContext.getInstance().toast("网络异常", R.drawable.vi_warning, 0);
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("success", String.valueOf(mICProdmngResponse.success));
            hashMap.put(MspFlybirdDefine.FLYBIRD_VIDATA_FINISH_CODE, mICProdmngResponse.finishCode);
            hashMap.put("code", mICProdmngResponse.code);
            VerifyLogger.getInstance().eventBehavior("UC-MobileIC-20180315-1", "", "", "", hashMap);
            if (mICProdmngResponse.success || !"SYSTEM_ERROR".equalsIgnoreCase(mICProdmngResponse.code)) {
                Map<String, String> map = mICProdmngResponse.nextStep;
                if (map == null || map.isEmpty()) {
                    VerifyLogCat.i("BioVerifyStarter", "nextStep为空");
                    b();
                    return;
                }
                Map<String, String> map2 = mICProdmngResponse.data;
                if (map2 != null) {
                    String str2 = map2.get("userId");
                    if (!mICProdmngResponse.success && mICProdmngResponse.finish && "2001".equalsIgnoreCase(mICProdmngResponse.finishCode)) {
                        String str3 = map2.get("pageModel");
                        if (!TextUtils.isEmpty(str3)) {
                            z = str3.contains("intelligentEnable");
                        }
                        try {
                            bioInfoFull = (BioInfoFull) JSON.parseObject(str3, BioInfoFull.class);
                        } catch (Exception unused) {
                            VerifyLogCat.e("BioVerifyStarter", "json fail");
                            bioInfoFull = null;
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("code", mICProdmngResponse.code);
                        if (bioInfoFull != null) {
                            bundle2.putString("pageTitle", bioInfoFull.pageTitle);
                            bundle2.putString(yj4.PARAM_PRODUCT_TYPE, bioInfoFull.productType);
                            Map<String, String> map3 = bioInfoFull.pageInfo;
                            if (map3 != null) {
                                bundle2.putString("pageGuide", map3.get("pageGuide"));
                                bundle2.putString(upx.PAGE_CONTENT, map3.get(upx.PAGE_CONTENT));
                            }
                            Map<String, String> map4 = bioInfoFull.protocol;
                            if (map4 != null) {
                                bundle2.putString("gnUrl", map4.get("generalUrl"));
                                bundle2.putString("gnPrefix", map4.get("GeneralPrefix"));
                                bundle2.putString("gnProl", map4.get("GeneralProtocol"));
                            }
                            if (z) {
                                bundle2.putBoolean("intgeable", bioInfoFull.intelligentEnable);
                            }
                            bundle2.putString("intgetitle", bioInfoFull.intelligentTitle);
                            bundle2.putString("intgedesc", bioInfoFull.intelligentDesc);
                        }
                        Intent intent = new Intent(MicroModuleContext.getInstance().getContext(), BioDetailActivity.class);
                        intent.putExtras(bundle2);
                        MicroModuleContext.getInstance().startProdActivityByContext(intent);
                    } else if (mICProdmngResponse.success && !TextUtils.isEmpty(str2)) {
                        String secData = AuthenticatorManager.getInstance(MicroModuleContext.getInstance().getContext()).getSecData(str2);
                        Bundle bundle3 = bundle == null ? new Bundle() : bundle;
                        String string = bundle3.getString("productCode");
                        if (TextUtils.isEmpty(string)) {
                            string = "BIC";
                        }
                        bundle3.remove("productCode");
                        bundle3.putString("userId", str2);
                        bundle3.putString("secData", secData);
                        bundle3.putString(ModuleConstants.VI_MODULE_BIO_METAINFO, EnvInfoUtil.getBioMetaInfo());
                        VerifyLogCat.d("BioVerifyStarter", bundle3.toString());
                        if (ModuleConstants.VI_MODULE_MENU.equalsIgnoreCase(string)) {
                            ReflectUtils.invokeStaticMethod("com.alipay.mobile.verifyidentity.prodmanger.biopen.helper.BioListHelper", "doBioListRequest", new Class[]{String.class, Bundle.class}, new Object[]{string, bundle3});
                        } else {
                            ProductManagerEngine.getInstance(MicroModuleContext.getInstance().getContext()).startByToken(mICProdmngResponse.token, map.get("module"), map.get("action"), bundle3, new ProdManagerListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.BioVerifyStarter.3
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // com.alipay.mobile.verifyidentity.callback.ProdManagerListener
                                public final void onResult(String str4, ProdManagerResult prodManagerResult) {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("26d0dee4", new Object[]{this, str4, prodManagerResult});
                                    }
                                }
                            });
                        }
                    }
                }
            } else {
                b();
            }
        }
    }
}
