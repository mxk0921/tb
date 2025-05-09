package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class i0z {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DRESS_UP_DOWNGRADE_BIZ_SETTING = "dress_up_downgrade_biz_setting";
    public static final String DRESS_UP_DOWNGRADE_WHITE_BG_TARGET_HEIGHT = "dress_up_downgrade_white_bg_target_height";
    public static final String DRESS_UP_NAV_BAR_HEIGHT = "dress_up_nav_bar_height";
    public static final String DRESS_UP_V3_IMAGE_FADE_OUT_SPEED = "dress_up_v3_image_fade_out_speed";
    public static final String DRESS_UP_V3_ROOT_FADE_IN_SPEED = "dress_up_v3_root_fade_in_speed";

    static {
        t2o.a(352321996);
    }

    public static float b(aqz aqzVar, String str, float f) {
        JSONObject jSONObject;
        Float f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fa385516", new Object[]{aqzVar, str, new Float(f)})).floatValue();
        }
        if (str == null || aqzVar == null || (jSONObject = aqzVar.o) == null) {
            return f;
        }
        try {
            f2 = jSONObject.getFloat(str);
        } catch (Exception unused) {
            f2 = null;
        }
        if (f2 == null) {
            return f;
        }
        return f2.floatValue();
    }

    public static int c(aqz aqzVar, String str, int i) {
        JSONObject jSONObject;
        Integer num;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("35bc202f", new Object[]{aqzVar, str, new Integer(i)})).intValue();
        }
        if (str == null || aqzVar == null || (jSONObject = aqzVar.o) == null) {
            return i;
        }
        try {
            num = jSONObject.getInteger(str);
        } catch (Exception unused) {
            num = null;
        }
        if (num == null) {
            return i;
        }
        return num.intValue();
    }

    public static boolean a(aqz aqzVar, String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("72ee4e47", new Object[]{aqzVar, str})).booleanValue();
        }
        if (str == null || aqzVar == null || (jSONObject = aqzVar.o) == null) {
            return false;
        }
        return "true".equals(jSONObject.getString(str));
    }
}
