package com.taobao.calendar.sdk;

import android.content.Context;
import com.taobao.calendar.sdk.common.Dp2PxUtil;
import com.taobao.calendar.sdk.common.Utils;
import com.taobao.calendar.sdk.db.ScheduleDO;
import com.taobao.calendar.sdk.db.TableSchedule;
import java.util.ArrayList;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TBCalendar extends TBCalendarBase {
    public static int smallIcon;
    public static boolean isInited = false;
    public static String ttid = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a extends TableSchedule.QueryHandler {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TableSchedule.QueryHandler f10273a;

        public a(TableSchedule.QueryHandler queryHandler) {
            this.f10273a = queryHandler;
        }

        @Override // com.taobao.calendar.sdk.db.TableSchedule.QueryHandler
        public void callback(int i, List<ScheduleDO> list) {
            List<ScheduleDO> list2;
            if (list.size() > 0) {
                list2 = list.subList(0, 1);
            } else {
                list2 = new ArrayList<>();
            }
            this.f10273a.callback(i, list2);
        }
    }

    static {
        t2o.a(414187523);
    }

    public static void getAlarms(String[] strArr, String str, TableSchedule.QueryHandler queryHandler) {
        TableSchedule.getSchedule(Utils.join(strArr, ","), str, queryHandler);
    }

    public static void getLatestAlarm(TableSchedule.QueryHandler queryHandler, String str) {
        TableSchedule.getCommingSchedule(new a(queryHandler), str);
    }

    public static void init(Context context) {
        if (!isInited) {
            Dp2PxUtil.init(context);
            Preferences.init(context);
            TableSchedule.init(context);
            TBCalendarConfig.init();
            isInited = true;
        }
    }

    public static void newSchedule(ScheduleDO scheduleDO, TableSchedule.QueryHandler queryHandler, String str) {
        scheduleDO.eventId = scheduleDO.sourceId + scheduleDO.eventId;
        TableSchedule.newSchedule(scheduleDO, queryHandler, str);
    }
}
