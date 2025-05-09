package tb;

import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.detail.rate.vivid.utils.WeexUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class xgn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String AB_COMPONENT = "rate_list_performance_component";
    public static final String AB_COMPONENT_DETAIL_PRE_REQUEST = "rate_list_data_pre_quest_component";
    public static final String AB_MODULE = "rate_list_performance_module";
    public static final String AB_MODULE_DETAIL_PRE_REQUEST = "rate_list_data_pre_quest_module";
    public static final xgn INSTANCE = new xgn();

    public final int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d19509e2", new Object[]{this})).intValue();
        }
        return e(AB_COMPONENT_DETAIL_PRE_REQUEST, AB_MODULE_DETAIL_PRE_REQUEST, "rate_list_pre_request_max_device_score", 99);
    }

    public final int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed8c1767", new Object[]{this})).intValue();
        }
        return e(AB_COMPONENT_DETAIL_PRE_REQUEST, AB_MODULE_DETAIL_PRE_REQUEST, "rate_list_pre_request_min_count", 2);
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e3aeb09", new Object[]{this})).booleanValue();
        }
        return f("rate_list_cpu_enhance");
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a85532de", new Object[]{this})).booleanValue();
        }
        return WeexUtils.INSTANCE.e();
    }

    public final int e(String str, String str2, String str3, int i) {
        Variation variation;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e0f98ff6", new Object[]{this, str, str2, str3, new Integer(i)})).intValue();
        }
        if (!n9l.INSTANCE.g()) {
            return i;
        }
        VariationSet activate = UTABTest.activate(str, str2);
        if (activate != null) {
            variation = activate.getVariation(str3);
        } else {
            variation = null;
        }
        if (variation != null) {
            return variation.getValueAsInt(i);
        }
        return i;
    }

    public final boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9143f55", new Object[]{this})).booleanValue();
        }
        return f("rate_list_divide_frame");
    }

    public final boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c52e8f8", new Object[]{this})).booleanValue();
        }
        return f("rate_list_hitch_rate_image_post");
    }

    public final boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c89fbfa", new Object[]{this})).booleanValue();
        }
        return f("rate_list_pre_render_enable");
    }

    public final boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d08c1e1", new Object[]{this})).booleanValue();
        }
        return f("rate_list_pre_request");
    }

    public final boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6bc9e9e5", new Object[]{this})).booleanValue();
        }
        return f("rate_list_cache");
    }

    public final boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b75b19d5", new Object[]{this})).booleanValue();
        }
        return f("rate_list_use_detail_rate_head");
    }

    public final boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("634c790e", new Object[]{this})).booleanValue();
        }
        return f("rate_list_pre_load_image");
    }

    public final boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e9b71257", new Object[]{this})).booleanValue();
        }
        return n9l.INSTANCE.Z();
    }

    public final boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eccb1583", new Object[]{this})).booleanValue();
        }
        return f("rate_list_video_control_append_logic");
    }

    public final boolean f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae8a1a6", new Object[]{this, str})).booleanValue();
        }
        VariationSet activate = UTABTest.activate(AB_COMPONENT, AB_MODULE);
        Boolean bool = null;
        Variation variation = activate != null ? activate.getVariation(str) : null;
        if (variation != null) {
            bool = Boolean.valueOf(variation.getValueAsBoolean(false));
        }
        return n9l.INSTANCE.g() && ckf.b(bool, Boolean.TRUE);
    }
}
