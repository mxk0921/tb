package android.taobao.windvane.ha;

import android.os.Message;
import android.util.Pair;
import android.webkit.ValueCallback;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.uc.webview.export.extension.WpkUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import tb.bsw;
import tb.t2o;
import tb.xru;
import tb.yaa;
import tb.yru;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class UCHAManager implements ValueCallback<Pair<Message, Message>> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static UCHAManager INSTANCE = null;
    private static final String TAG = "UCHA";
    public static final int TYPE_BKPG = 0;
    public static final int TYPE_BLACK = 2;
    public static final int TYPE_HARLOG = 1;
    public static final int TYPE_MEM = 3;
    public static final int TYPE_NONE = -1;
    private List<String> mMemoryLogType = Arrays.asList("mapsgrp", "jsobjheap", "jsexalloc", "gltex");

    static {
        t2o.a(989856192);
    }

    public static UCHAManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UCHAManager) ipChange.ipc$dispatch("1314225f", new Object[0]);
        }
        if (INSTANCE == null) {
            synchronized (UCHAManager.class) {
                try {
                    if (INSTANCE == null) {
                        INSTANCE = new UCHAManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return INSTANCE;
    }

    private void initCallBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64a5ff9c", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("log_upload_callback", this);
        WpkUtils.setWpkCallback(hashMap);
    }

    private void setPubOption() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5e4a417", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("bver", yaa.f().b());
        WpkUtils.setWpkCommonCustomFields(hashMap);
        try {
            WpkUtils.setWpkConfigs(new JSONObject(getConfigsFromSomeWhere(yaa.f().c())));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void initApmCallback(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a3cac6e", new Object[]{this, str, str2});
        } else if (bsw.b().a().h()) {
            xru.d().g(str, str2);
        }
    }

    private String getConfigsFromSomeWhere(yru.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4429270f", new Object[]{this, aVar});
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cver", 1);
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("u4_collect_url_query", aVar.f32311a);
            jSONObject3.put("u4_collect_url_ref", aVar.b);
            jSONObject3.put("u4_bkpg_sampling_rate", aVar.c);
            jSONObject3.put("u4_t1t3detail_sampling_rate", aVar.d);
            jSONObject3.put("u4_resloadfail_sampling_rate", aVar.e);
            jSONObject3.put("u4_xhr_sampling_rate", aVar.f);
            jSONObject3.put("u4_jserr_sampling_rate", aVar.g);
            jSONObject3.put("u4_har_sampling_rate", aVar.h);
            jSONObject3.put("u4_interaction_js_error_sampling_rate", aVar.i);
            jSONObject3.put("u4_webgl_error_state_api_sampling_rate", aVar.j);
            jSONObject3.put("u4_maps_groups_sampling_rate", aVar.k);
            jSONObject3.put("u4_maps_groups_tpupload_define", aVar.l);
            jSONObject3.put("u4_maps_groups_max_script_memory", aVar.m);
            jSONObject3.put("u4_maps_groups_max_gl_memory", aVar.n);
            jSONObject3.put("u4_uc_large_alloc_size", aVar.o);
            jSONObject2.put("common", jSONObject3);
            jSONObject.put("config", jSONObject2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    public void initHAParam(yru yruVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a621c03", new Object[]{this, yruVar});
            return;
        }
        try {
            if (bsw.b().a().h() && yruVar != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("context", yaa.n.getApplicationContext());
                hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, yruVar.f32310a);
                hashMap.put("app_secret", yruVar.b);
                hashMap.put("log_upload_mode", Integer.valueOf(yruVar.d));
                hashMap.put("config_update_mode", Integer.valueOf(yruVar.e));
                hashMap.put("debug", Boolean.valueOf(yruVar.c));
                WpkUtils.initWpk(hashMap);
                if (yruVar.d == 1) {
                    initCallBack();
                }
                if (yruVar.e == 1) {
                    setPubOption();
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00de A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onReceiveValue(android.util.Pair<android.os.Message, android.os.Message> r15) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.ha.UCHAManager.onReceiveValue(android.util.Pair):void");
    }
}
