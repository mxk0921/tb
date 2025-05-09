package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.downgrade.a;
import com.taobao.downgrade.rule.DefaultRule;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class xxl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ_FILTER_ID = "biz_filter_id";
    public static final String BIZ_ID = "biz_id";
    public static final String COLD_LAUNCHER_TIME = "cold_launch_time";
    public static final String CPU_ARCH = "cpu_arch";
    public static final String DEVICE_CPU_PERCENT = "device_cpu_percent";
    public static final String DEVICE_MEM_LEFT = "device_mem_left";
    public static final String DEVICE_MEM_PERCENT = "device_mem_percent";
    public static final String DEVICE_RUNTIME_SORE = "device_runtime_sore";
    public static final String DEVICE_TEMPERATURE = "device_temperature";
    public static final String GPU_SCORE = "gpu_score";
    public static final String HARDWARE_SORE = "hardware_sore";
    public static final String OLD_DEVICE_SCORE_ID = "old_device_score_id";
    public static final String PAGE_URL = "page_url";
    public static final String PERCENT = "percent";
    public static final String PERFORMANCE_WEIGHTS_ID = "performance_weights_id";
    public static final String SCORE_LEVEL_VARIABLE_ID = "score_level_variable_id";
    public static final String SCORE_TACTICS_MAPPING_ID = "score_tactics_mapping_id";
    public static final String TACTICS_FUNCTION = "tactics_function";
    public static final String TACTICS_PERFORMANCE = "tactics_performance";
    public static final String UPLOAD_TYPE = "upload_type";

    public static void a(DefaultRule defaultRule) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c991288f", new Object[]{defaultRule});
            return;
        }
        Map<String, Integer> d = a.d(defaultRule);
        int r = t81.r();
        if (d != null) {
            i = t81.k(d, a.c(defaultRule), a.g(defaultRule, d.get(a.RUNTIME_CPU)), a.h(defaultRule), r);
        }
        HashMap hashMap = new HashMap();
        hashMap.put(HARDWARE_SORE, String.valueOf(r));
        hashMap.put(DEVICE_MEM_LEFT, String.valueOf(t81.i()));
        hashMap.put(DEVICE_MEM_PERCENT, String.valueOf(t81.j()));
        hashMap.put(DEVICE_CPU_PERCENT, String.valueOf(t81.g(defaultRule.androidCpuOpen)));
        hashMap.put("cold_launch_time", String.valueOf(t81.b()));
        hashMap.put(DEVICE_TEMPERATURE, String.valueOf(t81.l()));
        hashMap.put("globalId", defaultRule.globalId);
        hashMap.put(GPU_SCORE, String.valueOf(t81.m()));
        hashMap.put(CPU_ARCH, String.valueOf(t81.e()));
        new x4v(x4v.EVENT_PAGE_MASTER, t81.t(), String.valueOf(i), hashMap).a();
    }
}
