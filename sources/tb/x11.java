package tb;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.Random;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class x11 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BATTERY_CANARY_SAMPLE = "battery_canary_sample";
    public static final String CLOSE_SAMPLE_ON_GREY = "close_sample_on_grey";
    public static final String FILTERED_PAGE_TAG_SAMPLE = "filtered_page_tag_sample";
    public static final String IMAGE_PROCESSOR_SAMPLE = "image_processor_sample";
    public static final String LAUNCHER_PROCESSOR_SAMPLE = "launcher_sample";
    public static final String LOOPER_OBSERVER_SAMPLE = "looper_observer_sample";
    public static final String MAIN_THREAD_MONITOR_SAMPLE = "main_thread_monitor_sample";
    public static final String NEED_PAGE_PSS = "need_page_pss";
    public static final String NEED_RUNTIME_INFO = "need_runtime_info";
    public static final String NEED_WX_END_RUNTIME_INFO = "need_wx_runtime_info";
    public static final String NETWORK_PROCESSOR_SAMPLE = "network_processor_sample";
    public static final String NETWORK_SAMPLE = "network_sample";
    public static final String NEXT_LAUNCH_UPLOAD_SAMPLE = "next_launch_upload_sample";
    public static final String ORANGE_NAMESPACE = "applicationmonitor";
    public static final String SPECIAL_PAGE_SAMPLE = "special_page_sample";
    public static final String SUBTASK_SAMPLE = "subtask_sample";
    public static final String WINDVANE_H5_SAMPLE = "windvane_h5_sample";
    public static final String WINDVANE_UC_T2_SAMPLE = "windvane_uc_t2_sample";

    public static void a(Map<String, String> map, float f, SharedPreferences.Editor editor, String str, boolean z) {
        float f2;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eff9cd2", new Object[]{map, new Float(f), editor, str, new Boolean(z)});
            return;
        }
        String str2 = map.get(str);
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.0f;
        }
        if (f >= rrl.c(str2, f2)) {
            z2 = false;
        }
        editor.putBoolean(str, z2);
    }

    public static void b(Map<String, String> map, SharedPreferences.Editor editor, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ece0b782", new Object[]{map, editor, str});
        } else {
            editor.putString(str, map.get(str));
        }
    }

    public static void c(Map<String, String> map, SharedPreferences.Editor editor, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e521e62", new Object[]{map, editor, str, new Boolean(z)});
            return;
        }
        String str2 = map.get(str);
        if (!TextUtils.isEmpty(str2)) {
            z = "true".equals(str2);
        }
        editor.putBoolean(str, z);
    }

    public static void d(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a8424d3", new Object[]{map});
        } else if (map != null && map.size() > 0) {
            try {
                float nextFloat = new Random(System.currentTimeMillis()).nextFloat();
                SharedPreferences.Editor edit = w9a.g().k().edit();
                a(map, nextFloat, edit, NETWORK_SAMPLE, o48.f25136a);
                a(map, nextFloat, edit, NEXT_LAUNCH_UPLOAD_SAMPLE, o48.n);
                a(map, nextFloat, edit, BATTERY_CANARY_SAMPLE, o48.o);
                a(map, nextFloat, edit, FILTERED_PAGE_TAG_SAMPLE, o48.h);
                a(map, nextFloat, edit, WINDVANE_H5_SAMPLE, o48.f);
                a(map, nextFloat, edit, WINDVANE_UC_T2_SAMPLE, o48.g);
                a(map, nextFloat, edit, LOOPER_OBSERVER_SAMPLE, o48.p);
                a(map, nextFloat, edit, LAUNCHER_PROCESSOR_SAMPLE, o48.j);
                a(map, nextFloat, edit, NETWORK_PROCESSOR_SAMPLE, o48.d);
                a(map, nextFloat, edit, IMAGE_PROCESSOR_SAMPLE, o48.c);
                a(map, nextFloat, edit, NEED_RUNTIME_INFO, o48.l);
                c(map, edit, NEED_WX_END_RUNTIME_INFO, o48.m);
                c(map, edit, CLOSE_SAMPLE_ON_GREY, o48.i);
                c(map, edit, NEED_PAGE_PSS, o48.q);
                b(map, edit, SPECIAL_PAGE_SAMPLE);
                b(map, edit, SUBTASK_SAMPLE);
                edit.apply();
            } catch (Throwable th) {
                zq6.a("ApmConfigChaneHelper", th);
            }
        }
    }
}
