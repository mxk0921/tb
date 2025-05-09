package com.taobao.calendar.sdk;

import android.content.Context;
import com.taobao.calendar.sdk.common.Dp2PxUtil;
import com.taobao.calendar.sdk.db.TableSchedule;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TBCalendarBase {
    static {
        t2o.a(414187525);
    }

    public static void init(Context context) {
        if (context != null) {
            Dp2PxUtil.init(context);
            Preferences.init(context);
            TableSchedule.init(context);
            TBCalendarConfig.init();
        }
    }

    public static void destroy() {
    }
}
