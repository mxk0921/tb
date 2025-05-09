package tb;

import android.os.Handler;
import android.taobao.windvane.startup.UCInitializerInfo;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class brw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f16583a = new AtomicBoolean(false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                brw.access$000();
            } catch (Exception unused) {
            }
        }
    }

    static {
        t2o.a(989856326);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e5079b", new Object[0]);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        b(jSONObject, "beforeInit", UCInitializerInfo.a().b(13));
        b(jSONObject, "initStart", UCInitializerInfo.a().b(0));
        b(jSONObject, "initSuccess", UCInitializerInfo.a().b(7));
        b(jSONObject, "extractStart", UCInitializerInfo.a().b(3));
        b(jSONObject, "extractFinish", UCInitializerInfo.a().b(4));
        b(jSONObject, "dexReady", UCInitializerInfo.a().b(5));
        b(jSONObject, "nativeReady", UCInitializerInfo.a().b(6));
        b(jSONObject, "initFail", UCInitializerInfo.a().b(8));
        b(jSONObject, "renderProcessReady", UCInitializerInfo.a().b(9));
        b(jSONObject, "gpuProcessReady", UCInitializerInfo.a().b(10));
        b(jSONObject, "firstPreCreateWebViewStart", UCInitializerInfo.a().b(11));
        b(jSONObject, "firstPreCreateWebViewEnd", UCInitializerInfo.a().b(12));
        b(jSONObject, "initUcParamStart", UCInitializerInfo.a().b(14));
        b(jSONObject, "initUcParamEnd", UCInitializerInfo.a().b(15));
        b(jSONObject, "preCreateTaskScheduled", UCInitializerInfo.a().b(16));
        JSONObject jSONObject2 = new JSONObject();
        Map<String, String> a2 = oba.a();
        for (String str : a2.keySet()) {
            jSONObject2.put(str, (Object) a2.get(str));
        }
        jSONObject.put("experiments", (Object) jSONObject2);
        y71.commitSuccess("wv_uc_init_v1", jSONObject);
        v7t.d("WVInitializationMonitor", "commit success");
    }

    public static /* synthetic */ void access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd60777", new Object[0]);
        } else {
            a();
        }
    }

    public static void b(JSONObject jSONObject, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c4db23a", new Object[]{jSONObject, str, new Long(j)});
        } else if (j > 0) {
            jSONObject.put(str, (Object) Long.valueOf(j));
        }
    }

    public static void commit() {
        Handler a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c9f3a3e", new Object[0]);
        } else if (f16583a.compareAndSet(false, true) && (a2 = rsa.b().a()) != null) {
            a2.postDelayed(new a(), 5000L);
        }
    }
}
