package com.alipay.mobile.verifyidentity.module.dynamic.helper;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.render.api.ext.BirdNestRender;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.module.dynamic.ui.DynamicActivity;
import com.alipay.mobile.verifyidentity.module.dynamic.ui.ViWebViewActivity;
import com.alipay.mobile.verifyidentity.utils.ReflectUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ExtEventHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final DynamicActivity f4311a;

    public ExtEventHandler(DynamicActivity dynamicActivity) {
        this.f4311a = dynamicActivity;
    }

    public void handle(JSONObject jSONObject, DynamicActivity.EventLog eventLog, BirdNestRender birdNestRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a59c21e7", new Object[]{this, jSONObject, eventLog, birdNestRender});
        } else if (jSONObject != null) {
            String string = jSONObject.getString("action_name");
            VerifyLogCat.d("ExtEventHandler", "do action: " + string);
            if ("encrypt_sha256".equalsIgnoreCase(string)) {
                handleEncryptSha256(jSONObject, eventLog, birdNestRender);
            } else if ("openUrl".equalsIgnoreCase(string)) {
                openUri(jSONObject, eventLog, birdNestRender);
            }
            eventLog.flush();
        }
    }

    public void handleEncryptSha256(JSONObject jSONObject, DynamicActivity.EventLog eventLog, BirdNestRender birdNestRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd287f63", new Object[]{this, jSONObject, eventLog, birdNestRender});
            return;
        }
        eventLog.params = "";
        String bytes2Hex = CipherHelper.bytes2Hex(CipherHelper.encrypt_SHA(jSONObject.getString("raw_data"), null));
        VerifyLogCat.d("ExtEventHandler", "[encrypt_data]: " + bytes2Hex);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("encrypt_data", (Object) bytes2Hex);
        String jSONString = jSONObject2.toJSONString();
        birdNestRender.callRender(jSONString);
        eventLog.result = jSONString;
    }

    public void openUri(JSONObject jSONObject, DynamicActivity.EventLog eventLog, BirdNestRender birdNestRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb18fc81", new Object[]{this, jSONObject, eventLog, birdNestRender});
            return;
        }
        String string = jSONObject.getString("url");
        VerifyLogCat.d("ExtEventHandler", "[url]: " + string);
        if (TextUtils.equals("Y", jSONObject.getString("useViWebView"))) {
            Intent intent = new Intent(this.f4311a, ViWebViewActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString("loadUrl", string);
            intent.putExtras(bundle);
            MicroModuleContext.getInstance().startProdActivityByContext(intent);
            return;
        }
        ReflectUtils.invokeStaticMethod("com.alipay.mobile.verifyidentity.alipay.util.H5Utils", "startH5", new Class[]{String.class}, new Object[]{string});
    }
}
