package tb;

import android.content.Intent;
import android.os.BatteryManager;
import android.os.Debug;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class yi7 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "DeviceRuntimeInfo";

    /* renamed from: a  reason: collision with root package name */
    public static BatteryManager f32110a;
    public static int b;

    public static JSONObject a(boolean z, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f76a6b5f", new Object[]{new Boolean(z), new Long(j)});
        }
        JSONObject jSONObject = new JSONObject();
        try {
            Runtime runtime = Runtime.getRuntime();
            long freeMemory = runtime.freeMemory() >> 20;
            jSONObject.put("java", (runtime.totalMemory() >> 20) - freeMemory);
            jSONObject.put("dalvikFree", freeMemory);
            jSONObject.put("nativeHeapSize", Debug.getNativeHeapSize() >> 20);
            jSONObject.put("nativeHeapAllocatedSize", Debug.getNativeHeapAllocatedSize() >> 20);
            if (f32110a == null) {
                f32110a = (BatteryManager) w9a.g().a().getSystemService("batterymanager");
            }
            jSONObject.put("chargeCounter", f32110a.getLongProperty(1));
            if (o48.q) {
                jSONObject.put("pss", Debug.getPss() >> 10);
            }
            jSONObject.put("time", j);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (z) {
            try {
                Intent a2 = l52.a(w9a.g().a());
                if (a2 != null) {
                    jSONObject.put("batteryTemp", a2.getIntExtra("temperature", -1) / 10.0f);
                    int intExtra = a2.getIntExtra(m09.TASK_TYPE_LEVEL, 0);
                    int intExtra2 = a2.getIntExtra("scale", 100);
                    if (intExtra2 > 0) {
                        jSONObject.put("batteryPct", (intExtra * 100) / intExtra2);
                    }
                    b = a2.getIntExtra("plugged", 0);
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
        return jSONObject;
    }
}
