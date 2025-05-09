package com.taobao.tao.flexbox.layoutmanager.module;

import android.app.Activity;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ScreenModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(503317313);
        t2o.a(503316559);
    }

    public static void setAlwaysOn(d.j jVar) {
        boolean booleanValue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c361c7bc", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if ((json instanceof JSONObject) && (booleanValue = ((JSONObject) json).getBooleanValue("on")) && (jVar.c() instanceof Activity)) {
            ((Activity) jVar.c()).findViewById(16908290).setKeepScreenOn(booleanValue);
        }
    }

    public static void setBrightness(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("224d8999", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            float floatValue = ((JSONObject) json).getFloatValue("brightness");
            if (jVar.c() instanceof Activity) {
                Window window = ((Activity) jVar.c()).getWindow();
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.screenBrightness = floatValue;
                window.setAttributes(attributes);
            }
        }
    }

    public static void setOrientation(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccb4bc3e", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            JSONObject jSONObject = new JSONObject();
            String string = ((JSONObject) json).getString("orientation");
            if (!TextUtils.isEmpty(string) && (jVar.c() instanceof Activity)) {
                Activity activity = (Activity) jVar.c();
                if (string.contains("landscape")) {
                    activity.setRequestedOrientation(0);
                } else if ("portrait".equalsIgnoreCase(string)) {
                    activity.setRequestedOrientation(1);
                } else if ("portraitUpsideDown".equalsIgnoreCase(string)) {
                    activity.setRequestedOrientation(9);
                }
                jVar.c.a(jVar, jSONObject);
            }
        }
    }
}
