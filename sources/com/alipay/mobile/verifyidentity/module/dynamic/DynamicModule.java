package com.alipay.mobile.verifyidentity.module.dynamic;

import android.content.Intent;
import android.os.Bundle;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.verifyidentity.data.DefaultModuleResult;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.module.MicroModule;
import com.alipay.mobile.verifyidentity.module.dynamic.ui.DynamicActivity;
import com.alipay.mobile.verifyidentity.utils.ReportHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DynamicModule extends MicroModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static String KEY_TPLDATA = "tplData";
    public static String KEY_TPLID = "tplId";
    public static String KEY_TPLINFO = "tplInfo";

    public static /* synthetic */ Object ipc$super(DynamicModule dynamicModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/verifyidentity/module/dynamic/DynamicModule");
    }

    @Override // com.alipay.mobile.verifyidentity.module.MicroModule
    public void onCreate(String str, String str2, String str3, Bundle bundle) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3304cdb4", new Object[]{this, str, str2, str3, bundle});
            return;
        }
        try {
            jSONObject = JSON.parseObject(str3);
        } catch (JSONException e) {
            VerifyLogCat.e("DynamicModule", "json fail " + str3, e);
            jSONObject = null;
        }
        if (jSONObject == null) {
            VerifyLogCat.d("DynamicModule", "module data can't be converted to jsonobject: " + str3);
            getMicroModuleContext().notifyAndFinishModule(getVerifyId(), getToken(), getModuleName(), new DefaultModuleResult("2002"));
            return;
        }
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        String str4 = KEY_TPLID;
        bundle2.putString(str4, jSONObject.getString(str4));
        String str5 = KEY_TPLINFO;
        bundle2.putString(str5, jSONObject.getString(str5));
        jSONObject.remove(KEY_TPLID);
        jSONObject.remove(KEY_TPLINFO);
        jSONObject.put("VISwitchConfig", (Object) ReportHelper.getAllSwitchConfig());
        bundle2.putString(KEY_TPLDATA, jSONObject.toJSONString());
        Intent intent = new Intent(getMicroModuleContext().getContext(), DynamicActivity.class);
        intent.putExtras(bundle2);
        getMicroModuleContext().startActivity(this, intent);
    }

    @Override // com.alipay.mobile.verifyidentity.module.MicroModule
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    @Override // com.alipay.mobile.verifyidentity.module.MicroModule
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        }
    }
}
