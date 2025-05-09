package tb;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.view.feeds.VerticalAbsViewHolder;
import com.taobao.tao.log.TLog;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class txj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG_APM = "new_detail分阶段";
    public static final String TAG_DATA = "new_detail数据请求";
    public static final String TAG_EXCEPTION = "new_detail异常";
    public static final String TAG_FAST_ANIM = "new_detail无极缩放";
    public static final String TAG_GESTURE = "new_detail手势";
    public static final String TAG_HALF_SCREEN = "new_detail非全屏";
    public static final String TAG_IGNORE_ERROR = "new_detail忽略异常";
    public static final String TAG_INSIDE_DETAIL = "new_detail半屏详情";
    public static final String TAG_MAIN_PIC = "new_detail主图";
    public static final String TAG_MEDIA_CONTROLLER = "new_detail媒体控制";
    public static final String TAG_NAV = "NewDetaiInnerlNavProcessor";
    public static final String TAG_PIC_ZOOM = "new_detail主图画幅";
    public static final String TAG_REALTIME = "new_detail实时插卡";
    public static final String TAG_REFRESH_DATA = "new_detail刷新数据";
    public static final String TAG_RENDER = "new_detail渲染";
    public static final String TAG_RIGHT_NAV_RECYCLER_LAYER = "new_detail导航栏";
    public static final String TAG_SCROLL_PAGE_OFF = "new_detail滚动";
    public static final String TAG_SECOND_PAGE = "new_detail水平滑动";
    public static final String TAG_SECTION = "new_detail性能分析";
    public static final String TAG_SET_SCROLL_ENABLE = "new_detail滚动控制";
    public static final String TAG_TIP = "new_detail提示";
    public static final String TAG_UNKNOWN_ERROR = "new_detail未知异常";
    public static final String TAG_UT = "new_detail埋点排查";
    public static final String TAG_VIDEO_ZOOM = "new_detail画幅";
    public static final String TAG_WINDVANE = "new_detail windvane排查";

    static {
        t2o.a(352321704);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8739f0d5", new Object[]{str, str2});
        } else {
            TLog.logd(str, str2);
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f008ba1e", new Object[]{str, str2});
        } else {
            TLog.loge(str, str2);
        }
    }

    public static void c(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6b35897", new Object[]{str, str2, th});
        } else {
            TLog.loge(str, str2, th);
        }
    }

    public static void d(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a4c09f0", new Object[]{context, str, str2});
        } else if (vv6.a()) {
            Log.e(str, str2);
        }
    }

    public static void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86c38ad6", new Object[]{str, str2});
        } else {
            TLog.loge(str, str2);
        }
    }

    public static void f(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fff8aadf", new Object[]{str, str2, th});
        } else if (!TextUtils.isEmpty(str2) || th != null) {
            TLog.loge(str, str2, th);
        }
    }

    public static String g(String str, JSONObject jSONObject, dh7 dh7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b9c63493", new Object[]{str, jSONObject, dh7Var});
        }
        if (str == null) {
            str = "";
        }
        if (jSONObject == null || dh7Var == null) {
            return str;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(VerticalAbsViewHolder.KEY_SCROLL_ENABLE, jSONObject.getString(VerticalAbsViewHolder.KEY_SCROLL_ENABLE));
        x3w B = dh7Var.B();
        if (B != null) {
            hashMap.put("nid", B.h);
        }
        if (B instanceof ue7) {
            hashMap.put("weexUrl", ((ue7) B).F0());
        }
        return str.concat("&commonMessage：").concat(hashMap.toString());
    }
}
