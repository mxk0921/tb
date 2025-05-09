package tb;

import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobao.R;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class eag {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME_SPACE = "XGuangCreatorSDK";

    static {
        t2o.a(511705615);
    }

    public static String A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("68af0a6", new Object[0]);
        }
        return B("permission_deny_default_action_text", Localization.q(R.string.gg_pub_enable_permission));
    }

    public static String B(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e264abe", new Object[]{str, str2});
        }
        try {
            String config = OrangeConfig.getInstance().getConfig(NAME_SPACE, str, "");
            if (TextUtils.isEmpty(config)) {
                return str2;
            }
            return config;
        } catch (Throwable unused) {
            return str2;
        }
    }

    public static boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d83ffdc", new Object[0])).booleanValue();
        }
        return i("enable_33_copy_file_opt", true);
    }

    public static boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6ff80b8", new Object[0])).booleanValue();
        }
        return i("enable_cpu_checker", true);
    }

    public static boolean E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3f8815a", new Object[0])).booleanValue();
        }
        return i("enable_enter_publish_need_copy", true);
    }

    public static boolean F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e9ecfd6b", new Object[0])).booleanValue();
        }
        return i("enable_image_exporter_recycle", true);
    }

    public static boolean G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef9a9403", new Object[0])).booleanValue();
        }
        return i("enable_permission_judge_optimize", true);
    }

    public static boolean H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c075d6f", new Object[0])).booleanValue();
        }
        return i("enable_sandbox_copy_opt", true);
    }

    public static boolean I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1484f001", new Object[0])).booleanValue();
        }
        return i("enable_stat_save_to_album", true);
    }

    public static String J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6b9068f", new Object[0]);
        }
        return B("copy_sand_box_android_opt_sdk_level", "29,30,31,32");
    }

    public static boolean K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("67608a0d", new Object[0])).booleanValue();
        }
        return i("enable_use_biz_scene_permission", false);
    }

    public static boolean L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77ca7d12", new Object[0])).booleanValue();
        }
        return i("enable_video_editor_new_cut", true);
    }

    public static boolean M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac700251", new Object[0])).booleanValue();
        }
        return i("enable_lc_mnn", true);
    }

    public static boolean N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8ffdb35", new Object[0])).booleanValue();
        }
        return i("enable_video_editor_blur_mode", true);
    }

    public static boolean O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d2485c6", new Object[0])).booleanValue();
        }
        return i("enable_thread_pool_optimize", true);
    }

    public static boolean P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e92c434", new Object[0])).booleanValue();
        }
        return i("use_loop_in_sub_project", true);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("242a18f", new Object[0]);
        }
        return B("contains_no_supported_key_tip", Localization.q(R.string.gg_pub_suggest_update));
    }

    public static float b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("24b67859", new Object[0])).floatValue();
        }
        return m("default_text_position_y", -0.1f);
    }

    public static float c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aaa88153", new Object[0])).floatValue();
        }
        return m("default_text_scale", 0.8f);
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("14084418", new Object[0])).booleanValue();
        }
        return i("enable_14_gallery_part_choose", true);
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d74e647f", new Object[0])).booleanValue();
        }
        return i("enable_change_layer_by_track_index", true);
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("839e8190", new Object[0])).booleanValue();
        }
        return i("enable_quick_publish", false);
    }

    public static String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c416f402", new Object[0]);
        }
        return B("biz_permission_deny_scene_action_text", Localization.q(R.string.gg_pub_open_scene_album_permission));
    }

    public static String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d32adba1", new Object[0]);
        }
        return B("biz_permission_deny_sys_action_text", Localization.q(R.string.gg_pub_authorize_taobao_permission));
    }

    public static boolean i(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3915235", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        try {
            String config = OrangeConfig.getInstance().getConfig(NAME_SPACE, str, "");
            if (TextUtils.isEmpty(config)) {
                return z;
            }
            return Boolean.parseBoolean(config);
        } catch (Throwable unused) {
            return z;
        }
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5925d70b", new Object[0])).booleanValue();
        }
        return i("double_check_support_using_URI", true);
    }

    public static int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8462dad9", new Object[0])).intValue();
        }
        return q("cpu_abi_not_support_value", 7);
    }

    public static int l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("be72c968", new Object[0])).intValue();
        }
        return q("fast_click_interval_time", -1);
    }

    public static float m(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("86205bd9", new Object[]{str, new Float(f)})).floatValue();
        }
        try {
            String config = OrangeConfig.getInstance().getConfig(NAME_SPACE, str, "");
            if (TextUtils.isEmpty(config)) {
                return f;
            }
            return Float.parseFloat(config);
        } catch (Throwable unused) {
            return f;
        }
    }

    public static float n(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bebc8ab0", new Object[]{new Float(f)})).floatValue();
        }
        return m("frame_dup_image_default_threshold", f);
    }

    public static int o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f47ecad", new Object[0])).intValue();
        }
        return q("fullscreen_size_hq_width", 800);
    }

    public static int p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5901e9fe", new Object[0])).intValue();
        }
        return q("image_editor_sticker_top_tracker_index", 500);
    }

    public static int q(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("235381ac", new Object[]{str, new Integer(i)})).intValue();
        }
        try {
            String config = OrangeConfig.getInstance().getConfig(NAME_SPACE, str, "");
            if (TextUtils.isEmpty(config)) {
                return i;
            }
            return Integer.parseInt(config);
        } catch (Throwable unused) {
            return i;
        }
    }

    public static long r(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b7efaf15", new Object[]{str, new Long(j)})).longValue();
        }
        try {
            String config = OrangeConfig.getInstance().getConfig(NAME_SPACE, str, "");
            if (TextUtils.isEmpty(config)) {
                return j;
            }
            return Long.parseLong(config);
        } catch (Throwable unused) {
            return j;
        }
    }

    public static long s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("826f1bc5", new Object[0])).longValue();
        }
        return r("mnn_algo_prepare_timeout_tims_ms", 10L);
    }

    public static int t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e33d5157", new Object[0])).intValue();
        }
        return q("mnn_bitmap_format", 0);
    }

    public static String u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d3abb8ee", new Object[0]);
        }
        return B("marvel_default_text_font_fake_path", "/fonts/fake_path");
    }

    public static int v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76530f19", new Object[0])).intValue();
        }
        return q("marvel_sdk_tlog_level", 3);
    }

    public static String w(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("49de54f8", new Object[]{str, str2, str3});
        }
        try {
            String optString = new JSONObject(str3).optString(str);
            if (!TextUtils.isEmpty(optString)) {
                return String.format(optString, str2);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return String.format(Localization.q(R.string.gg_pub_load_failed_retry), str2);
    }

    public static String x(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("94cc03ed", new Object[]{str, str2});
        }
        return w(str, str2, B("materialError", Localization.q(R.string.gg_pub_device_support_error_0)));
    }

    public static int y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("59a754a8", new Object[0])).intValue();
        }
        return q("material_task_max_channel_count", 3);
    }

    public static long z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a96edec0", new Object[0])).longValue();
        }
        return r("material_task_max_timeout_ms", 30000L);
    }
}
