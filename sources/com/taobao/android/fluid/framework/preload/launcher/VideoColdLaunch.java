package com.taobao.android.fluid.framework.preload.launcher;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import java.util.HashMap;
import tb.akt;
import tb.c21;
import tb.cr9;
import tb.ir9;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class VideoColdLaunch {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String PLACE_HOLDER = "__GUANG_CONTENT_ID__,__ITEMID__";
    private static final String TAG = "ColdLaunch";

    static {
        t2o.a(468714684);
    }

    public static void init(Context context, Uri uri, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b0247a0", new Object[]{context, uri, str});
        } else if (!isInValidExtParams(str)) {
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("startIntent", uri.toString());
                hashMap.put("prefetchTimeOut", 10000);
                cr9.b(context, hashMap);
                ir9.b("ColdLaunch", "FluidInitializeReflect init 初始化成功");
            } catch (Throwable th) {
                ir9.b("ColdLaunch", "FluidInitializeReflect init fail :" + th.getMessage());
            }
        }
    }

    public static void initLinkBack(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9640e5b7", new Object[]{context, uri});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("url", (Object) uri.toString());
        jSONObject.put("type", (Object) 10);
        jSONObject.put("duration", (Object) Integer.valueOf(akt.x2()));
        cr9.d(context);
        ir9.b("ColdLaunch", "新架构 initTBVideoSDK 初始化成功");
        FluidSDK.doPreload(c21.i(), jSONObject);
    }

    private static boolean isInValidExtParams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de48834f", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        for (String str2 : PLACE_HOLDER.split(",")) {
            if (str.contains(str2)) {
                return true;
            }
        }
        return false;
    }
}
