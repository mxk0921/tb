package tb;

import android.content.Context;
import com.heytap.msp.push.mode.DataMessage;
import com.heytap.msp.push.mode.MessageStat;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class xai {
    static {
        t2o.a(612368421);
    }

    public static boolean a(Context context, String str, DataMessage dataMessage) {
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
}
