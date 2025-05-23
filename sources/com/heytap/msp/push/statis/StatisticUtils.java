package com.heytap.msp.push.statis;

import android.content.Context;
import com.heytap.msp.push.mode.DataMessage;
import com.heytap.msp.push.mode.MessageStat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.t2o;
import tb.uiq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class StatisticUtils {
    static {
        t2o.a(612368460);
    }

    public static boolean statisticEvent(Context context, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new MessageStat(context.getPackageName(), str));
        return uiq.c(context, arrayList);
    }

    public static boolean statisticEvent(Context context, String str, DataMessage dataMessage) {
        MessageStat messageStat;
        ArrayList arrayList = new ArrayList();
        String packageName = context.getPackageName();
        if (dataMessage == null) {
            messageStat = new MessageStat(packageName, str);
        } else {
            messageStat = new MessageStat(dataMessage.getMessageType(), packageName, dataMessage.getGlobalId(), dataMessage.getTaskID(), str, null, dataMessage.getStatisticsExtra(), dataMessage.getDataExtra());
        }
        arrayList.add(messageStat);
        return uiq.c(context, arrayList);
    }

    public static boolean statisticEvent(Context context, List<String> list) {
        ArrayList arrayList = new ArrayList();
        String packageName = context.getPackageName();
        if (!(list == null || list.size() == 0)) {
            for (String str : list) {
                arrayList.add(new MessageStat(packageName, str));
            }
        }
        return uiq.c(context, arrayList);
    }

    public static boolean statisticEvent(Context context, Map<String, List<DataMessage>> map) {
        if (map == null) {
            return false;
        }
        String packageName = context.getPackageName();
        ArrayList arrayList = new ArrayList();
        for (String str : map.keySet()) {
            List<DataMessage> list = map.get(str);
            if (list != null) {
                for (DataMessage dataMessage : list) {
                    arrayList.add(new MessageStat(dataMessage.getMessageType(), packageName, dataMessage.getGlobalId(), dataMessage.getTaskID(), str, null, dataMessage.getStatisticsExtra(), dataMessage.getDataExtra()));
                }
            } else {
                arrayList.add(new MessageStat(packageName, str));
            }
        }
        return uiq.c(context, arrayList);
    }
}
