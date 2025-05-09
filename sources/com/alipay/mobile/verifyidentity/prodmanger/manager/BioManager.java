package com.alipay.mobile.verifyidentity.prodmanger.manager;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.mobile.verifyidentity.common.Constants;
import com.alipay.mobile.verifyidentity.data.ProdManagerResult;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.log.behavior.VerifyLogger;
import com.alipay.mobile.verifyidentity.prod.manager.module.BaseProdManager;
import com.alipay.mobile.verifyidentity.prodmanger.biopen.data.BioInfoFull;
import com.alipay.mobile.verifyidentity.prodmanger.biopen.data.PageSliderFull;
import com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity;
import com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioOpenActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.upx;
import tb.vaj;
import tb.yj4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class BioManager extends BaseProdManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String b;
    public String c;
    public String d;

    public static void b(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b668f6c", new Object[]{bundle});
            return;
        }
        Intent intent = new Intent(MicroModuleContext.getInstance().getContext(), BioOpenActivity.class);
        intent.putExtras(bundle);
        MicroModuleContext.getInstance().startProdActivityByContext(intent);
    }

    public static void c(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54b86a6e", new Object[]{str, str2, str3, str4, str5, str6, str7});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("success", str4);
        hashMap.put(MspFlybirdDefine.FLYBIRD_VIDATA_FINISH_CODE, str3);
        hashMap.put("code", str5);
        hashMap.put("productStatus", str2);
        hashMap.put("sceneId", str6);
        hashMap.put(upx.PRODUCT_ID, str7);
        VerifyLogger.getInstance().eventBehavior(str, "", "", "", hashMap);
    }

    public static /* synthetic */ Object ipc$super(BioManager bioManager, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/verifyidentity/prodmanger/manager/BioManager");
    }

    public final Bundle a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("b734c076", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Bundle bundle = new Bundle();
        try {
            JSONObject jSONObject = JSON.parseObject(str).getJSONObject("pageModel");
            if (jSONObject != null) {
                String string = jSONObject.getString(yj4.PARAM_PRODUCT_TYPE);
                String string2 = jSONObject.getString("registerCommand");
                String string3 = jSONObject.getString("downloadurl");
                String string4 = jSONObject.getString("alertText");
                bundle.putString(yj4.PARAM_PRODUCT_TYPE, string);
                bundle.putString("registerCommand", string2);
                bundle.putString("downloadurl", string3);
                bundle.putString("alertText", string4);
                return bundle;
            }
        } catch (Exception unused) {
            VerifyLogCat.e("BioManager", "json fail");
            callback(new ProdManagerResult("1005"), null);
        }
        return null;
    }

    @Override // com.alipay.mobile.verifyidentity.prod.manager.module.BaseProdManager
    public void onCreate(String str, String str2, String str3, String str4, String str5, Bundle bundle) {
        String str6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a80d4820", new Object[]{this, str, str2, str3, str4, str5, bundle});
            return;
        }
        if (bundle != null) {
            this.c = bundle.getString("sceneId");
            if ("true".equalsIgnoreCase(bundle.getString("forbidUI"))) {
                VerifyLogCat.i("BioManager", "不需要引导开通，直接进入开通流程");
                Bundle a2 = a(str4);
                this.b = bundle.getString(upx.PRODUCT_ID);
                if ("not_exist_bic_feature".equalsIgnoreCase(str3)) {
                    str6 = "token";
                    c("UC-MobileIC-20180315-3", "", "", "false", str3, this.c, this.b);
                } else {
                    str6 = "token";
                    c("UC-MobileIC-20180315-3", "", "", "true", "", this.c, this.b);
                }
                if (a2 == null) {
                    a2 = new Bundle();
                }
                a2.putString(str6, str);
                a2.putString("action", str2);
                a2.putString("module", this.mName);
                a2.putString("code", str3);
                a2.putString(Constants.VI_ENGINE_FAST_MODULENAME, str5);
                a2.putBundle("extParams", bundle);
                b(a2);
                return;
            }
        }
        VerifyLogCat.i("BioManager", "解析渲染页面数据:" + str3);
        Bundle d = d(str4);
        String str7 = this.d;
        String str8 = this.c;
        String str9 = this.b;
        HashMap hashMap = new HashMap();
        hashMap.put("success", "true");
        hashMap.put(MspFlybirdDefine.FLYBIRD_VIDATA_FINISH_CODE, "1000");
        hashMap.put("productStatus", str7);
        hashMap.put("sceneId", str8);
        hashMap.put(upx.PRODUCT_ID, str9);
        VerifyLogger.getInstance().eventBehavior("UC-MobileIC-20180315-2", "", "", "", hashMap);
        d.putBundle("InitParams", bundle);
        d.putString("action", str2);
        d.putString("module", this.mName);
        d.putString("token", str);
        d.putString("code", str3);
        Intent intent = new Intent(MicroModuleContext.getInstance().getContext(), BioDetailActivity.class);
        intent.putExtras(d);
        MicroModuleContext.getInstance().startProdActivityByContext(intent);
    }

    @Override // com.alipay.mobile.verifyidentity.prod.manager.module.BaseProdManager
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    @Override // com.alipay.mobile.verifyidentity.prod.manager.module.BaseProdManager
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        }
    }

    public final Bundle d(String str) {
        String str2;
        String str3;
        Object obj;
        JSONObject jSONObject;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("43d4eb77", new Object[]{this, str});
        }
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject parseObject = JSON.parseObject(str);
                if (parseObject != null) {
                    obj = "pageSlider";
                    this.b = parseObject.getString(upx.PRODUCT_ID);
                    JSONObject jSONObject2 = parseObject.getJSONObject("pageModel");
                    str3 = parseObject.getString("introduceText");
                    str2 = parseObject.getString("introduceUrl");
                    jSONObject = jSONObject2;
                } else {
                    obj = "pageSlider";
                    jSONObject = null;
                    str3 = null;
                    str2 = null;
                }
                bundle.putString(upx.PRODUCT_ID, this.b);
                if (jSONObject != null) {
                    String jSONString = jSONObject.toJSONString();
                    boolean contains = !TextUtils.isEmpty(jSONString) ? jSONString.contains("intelligentEnable") : false;
                    BioInfoFull bioInfoFull = (BioInfoFull) JSON.parseObject(jSONString, BioInfoFull.class);
                    this.d = bioInfoFull.productStatus;
                    Map<String, String> map = bioInfoFull.pageInfo;
                    Map<String, String> map2 = bioInfoFull.protocol;
                    if (map != null) {
                        z = contains;
                        bundle.putString("pageGuide", map.get("pageGuide"));
                        bundle.putString(upx.PAGE_CONTENT, map.get(upx.PAGE_CONTENT));
                        bundle.putString(vaj.KEY_BG_IMG, map.get(vaj.KEY_BG_IMG));
                        bundle.putString("returnType", map.get("returnType"));
                        bundle.putString("bottomContent", map.get("bottomContent"));
                        bundle.putString("protocol_url", map.get("protocol_url"));
                        bundle.putString("protocol_prefix", map.get("protocol_prefix"));
                        bundle.putString("protocol_context", map.get("protocol_context"));
                        bundle.putString("btnNormalColor", map.get("btnNormalColor"));
                        bundle.putString("btnPressedColor", map.get("btnPressedColor"));
                        bundle.putString("btnText", map.get("btnText"));
                        TextUtils.isEmpty(map.get(obj));
                        PageSliderFull pageSliderFull = (PageSliderFull) JSON.parseObject(map.get(obj), PageSliderFull.class);
                        if (pageSliderFull != null) {
                            bundle.putBoolean("sliderVisible", true);
                            bundle.putString("icon", pageSliderFull.icon);
                            bundle.putString("text", pageSliderFull.text);
                            bundle.putString("highlight", pageSliderFull.highlight);
                            bundle.putString("status", pageSliderFull.status);
                            bundle.putString("url", pageSliderFull.url);
                        } else {
                            bundle.putBoolean("sliderVisible", false);
                        }
                    } else {
                        z = contains;
                    }
                    if (map2 != null) {
                        bundle.putString("gnUrl", map2.get("generalUrl"));
                        bundle.putString("gnPrefix", map2.get("generalPrefix"));
                        bundle.putString("gnProl", map2.get("generalProtocol"));
                    }
                    bundle.putString("biolink", str3);
                    bundle.putString("biolinkurl", str2);
                    bundle.putString("productName", bioInfoFull.productName);
                    bundle.putString("productStatus", bioInfoFull.productStatus);
                    bundle.putString(yj4.PARAM_PRODUCT_TYPE, bioInfoFull.productType);
                    bundle.putString("errorCode", bioInfoFull.errorCode);
                    bundle.putBoolean("isViewable", bioInfoFull.isViewable);
                    bundle.putString("pageTitle", bioInfoFull.pageTitle);
                    bundle.putString("pageType", bioInfoFull.pageType);
                    bundle.putString("tplId", bioInfoFull.tplId);
                    bundle.putString("downloadurl", bioInfoFull.downloadurl);
                    bundle.putString("alertText", bioInfoFull.alertText);
                    if (z) {
                        bundle.putBoolean("intgeable", bioInfoFull.intelligentEnable);
                    }
                    bundle.putString("intgetitle", bioInfoFull.intelligentTitle);
                    bundle.putString("intgedesc", bioInfoFull.intelligentDesc);
                    return bundle;
                }
            } catch (Exception unused) {
                VerifyLogCat.e("BioManager", "json fail");
                callback(new ProdManagerResult("1005"), null);
                return null;
            }
        }
        return null;
    }

    @Override // com.alipay.mobile.verifyidentity.prod.manager.module.BaseProdManager
    public void onCreate(String str, String str2, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed47363e", new Object[]{this, str, str2, bundle});
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("token", str);
        bundle2.putString(Constants.VI_ENGINE_FAST_MODULENAME, str2);
        bundle2.putBundle("extParams", bundle);
        b(bundle2);
    }
}
