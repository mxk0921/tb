package com.meizu.cloud.pushsdk.notification.g;

import android.content.Context;
import com.meizu.cloud.pushsdk.util.MzSystemUtils;
import tb.j5m;
import tb.k75;
import tb.zk4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class c {
    public static int a(Context context) {
        return d.a(context).a(context, "push_big_bigtext_defaultView", "id");
    }

    public static int b(Context context) {
        return d.a(context).a(context, "push_big_bigview_defaultView", "id");
    }

    public static int c(Context context) {
        return d.a(context).a(context, "push_big_notification_content", "id");
    }

    public static int d(Context context) {
        return d.a(context).a(context, "push_big_notification_date", "id");
    }

    public static int e(Context context) {
        return d.a(context).a(context, "push_big_notification_icon", "id");
    }

    public static int f(Context context) {
        return d.a(context).a(context, "push_big_notification_title", "id");
    }

    public static int g(Context context) {
        return d.a(context).a(context, "push_expandable_big_image_notification", "layout");
    }

    public static int h(Context context) {
        return d.a(context).a(context, "push_expandable_big_text_notification", "layout");
    }

    public static int i(Context context) {
        return d.a(context).a(context, "push_pure_bigview_banner", "id");
    }

    public static int j(Context context) {
        return d.a(context).a(context, "push_pure_bigview_expanded", "id");
    }

    public static int k(Context context) {
        return d.a(context).a(context, "push_pure_close", "id");
    }

    public static int l(Context context) {
        String str;
        d a2 = d.a(context);
        int flymeVersion = MzSystemUtils.getFlymeVersion();
        if (flymeVersion > 0 && flymeVersion <= 6) {
            str = "push_pure_pic_notification_f6";
        } else if (flymeVersion == 7) {
            str = "push_pure_pic_notification_f7";
        } else if (flymeVersion == 8) {
            str = "push_pure_pic_notification_f8";
        } else {
            String valueOf = String.valueOf(context.getResources().getDisplayMetrics().density);
            if (valueOf.length() > 3) {
                valueOf = valueOf.substring(0, 3);
            }
            if ("2.0".equals(valueOf) || k75.VIDEOCONFIG_API_VERSION_3.equals(valueOf) || "4.0".equals(valueOf) || j5m.API_VERSION.equals(valueOf)) {
                str = "push_pure_pic_notification_f9";
            } else if ("3.3".equals(valueOf) || "2.2".equals(valueOf)) {
                str = "push_pure_pic_notification_f9_337";
            } else {
                str = "push_pure_pic_notification_f9_275";
            }
        }
        return a2.a(context, str, "layout");
    }

    public static int m(Context context) {
        return d.a(context).a(context, "stat_sys_third_app_notify", zk4.CONTACTS_INFO_NOT_EMPTY_STATUS);
    }
}
