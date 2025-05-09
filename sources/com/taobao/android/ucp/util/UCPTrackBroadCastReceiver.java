package com.taobao.android.ucp.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.util.TypeUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.LinkedMapWithMaxSize;
import com.taobao.android.behavir.util.Utils;
import com.taobao.android.behavir.util.a;
import com.taobao.android.behavix.utils.Debuggable;
import com.taobao.android.ucp.bridge.NativeBroadcast;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import tb.o71;
import tb.om8;
import tb.t2o;
import tb.v82;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class UCPTrackBroadCastReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EXPOSE = "Expose";
    public static final String EXPOSE_STATE = "ExposeState";
    public static final String UCP_TRACKER = "UCPTracker";

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Long> f9829a = Collections.synchronizedMap(new LinkedMapWithMaxSize(10));

    static {
        t2o.a(404750760);
    }

    public static /* synthetic */ Object ipc$super(UCPTrackBroadCastReceiver uCPTrackBroadCastReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ucp/util/UCPTrackBroadCastReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        try {
            Utils.b bVar = (Utils.b) Utils.j((JSONObject) intent.getSerializableExtra("trackInfo")).get("nonSerializableData");
            if (bVar != null && bVar.a().getBooleanValue("fromNative")) {
                a(intent, (NativeBroadcast.Callback) bVar.a().get("nativeCallback"));
            }
        } catch (Exception e) {
            om8.c("UCPTracker", e.toString(), e.getMessage());
            if (Debuggable.isDebug()) {
                throw new RuntimeException("ucp 数据回流异常" + e.getMessage());
            }
        }
    }

    public static void a(Intent intent, NativeBroadcast.Callback callback) {
        boolean z;
        List list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99a4058f", new Object[]{intent, callback});
            return;
        }
        String stringExtra = intent.getStringExtra("key");
        String stringExtra2 = intent.getStringExtra("group");
        String stringExtra3 = intent.getStringExtra("type");
        String stringExtra4 = intent.getStringExtra("errorMessage");
        JSONObject j = Utils.j((JSONObject) intent.getSerializableExtra("trackInfo"));
        JSONObject j2 = Utils.j((JSONObject) intent.getSerializableExtra("bizTrackInfo"));
        if (!j2.getBooleanValue("displayed")) {
            String l = v82.l("compensateErrorCodes", "");
            if (TextUtils.isEmpty(l)) {
                list = Arrays.asList("OnViewJSClose", o71.POINT_CONFIG_FAIL, "OnViewErrorClose", "Error");
            } else {
                list = a.k(JSON.parseArray(l), String.class);
            }
            if (list.contains(stringExtra)) {
                z = true;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("key", (Object) stringExtra);
                jSONObject.put("group", (Object) stringExtra2);
                jSONObject.put("type", (Object) stringExtra3);
                jSONObject.put("bizTrackInfo", (Object) j2);
                jSONObject.put("error", (Object) Boolean.valueOf(z));
                jSONObject.put("errorCode", (Object) TypeUtils.castToInt(intent.getExtras().get("errorCode")));
                jSONObject.put("trackInfo", (Object) j);
                jSONObject.put("errorMessage", (Object) stringExtra4);
                callback.callback(jSONObject, null);
                if ("track".equals(stringExtra3) && !Arrays.asList("PopReceiver", "PopViewLoaded", "PopDSLFetched", "PopPreRequested").contains(stringExtra)) {
                    callback.close();
                    return;
                }
            }
        }
        z = false;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("key", (Object) stringExtra);
        jSONObject2.put("group", (Object) stringExtra2);
        jSONObject2.put("type", (Object) stringExtra3);
        jSONObject2.put("bizTrackInfo", (Object) j2);
        jSONObject2.put("error", (Object) Boolean.valueOf(z));
        jSONObject2.put("errorCode", (Object) TypeUtils.castToInt(intent.getExtras().get("errorCode")));
        jSONObject2.put("trackInfo", (Object) j);
        jSONObject2.put("errorMessage", (Object) stringExtra4);
        callback.callback(jSONObject2, null);
        if ("track".equals(stringExtra3)) {
        }
    }
}
