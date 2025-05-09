package tb;

import android.content.Context;
import android.content.Intent;
import com.heytap.mcssdk.constant.MessageConstant$CommandId;
import com.heytap.msp.push.mode.MessageStat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class uiq {
    static {
        t2o.a(612368430);
    }

    public static boolean a(Context context) {
        String u = b6n.s().u(context);
        if (!yyv.f(context, u) || yyv.c(context, u) < 1017) {
            return false;
        }
        return true;
    }

    public static void b(Context context, MessageStat messageStat) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(messageStat);
        c(context, linkedList);
    }

    public static boolean c(Context context, List<MessageStat> list) {
        LinkedList linkedList = new LinkedList();
        linkedList.addAll(list);
        dgh.a("isSupportStatisticByMcs:" + a(context) + ",list size:" + linkedList.size());
        if (linkedList.size() <= 0 || !a(context)) {
            return false;
        }
        return d(context, linkedList);
    }

    public static boolean d(Context context, List<MessageStat> list) {
        try {
            Intent intent = new Intent();
            intent.setAction(b6n.s().F(context));
            intent.setPackage(b6n.s().u(context));
            intent.putExtra("appPackage", context.getPackageName());
            intent.putExtra("type", MessageConstant$CommandId.COMMAND_STATISTIC);
            intent.putExtra("count", list.size());
            ArrayList<String> arrayList = new ArrayList<>();
            for (MessageStat messageStat : list) {
                arrayList.add(messageStat.toJsonObject());
            }
            intent.putStringArrayListExtra("list", arrayList);
            context.startService(intent);
            return true;
        } catch (Exception e) {
            dgh.b("statisticMessage--Exception" + e.getMessage());
            return false;
        }
    }
}
