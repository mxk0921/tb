package tb;

import anet.channel.appmonitor.AppMonitor;
import anet.channel.statist.AlarmObject;
import anet.channel.statist.CountObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class c71 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(343933228);
    }

    public static void a(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82c38151", new Object[]{str, str2, str3, str4, str5});
            return;
        }
        AlarmObject alarmObject = new AlarmObject();
        alarmObject.module = str;
        alarmObject.modulePoint = str2;
        alarmObject.arg = str3;
        alarmObject.errorCode = str4;
        alarmObject.errorMsg = str5;
        alarmObject.isSuccess = false;
        AppMonitor.getInstance().commitAlarm(alarmObject);
    }

    public static void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("711b912e", new Object[]{str, str2, str3});
            return;
        }
        AlarmObject alarmObject = new AlarmObject();
        alarmObject.module = str;
        alarmObject.modulePoint = str2;
        alarmObject.arg = str3;
        alarmObject.isSuccess = true;
        AppMonitor.getInstance().commitAlarm(alarmObject);
    }

    public static void c(String str, String str2, String str3, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5653f8a1", new Object[]{str, str2, str3, new Double(d)});
            return;
        }
        CountObject countObject = new CountObject();
        countObject.module = str;
        countObject.modulePoint = str2;
        countObject.arg = str3;
        countObject.value = d;
        AppMonitor.getInstance().commitCount(countObject);
    }
}
