package tb;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.preference.PreferenceManager;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class xc4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(775946274);
    }

    public static void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4308dbc7", new Object[]{context});
            return;
        }
        String packageName = context.getPackageName();
        b(context, packageName, "com.taobao.alivfssdk.monitor.AVFSMonitorService");
        b(context, packageName, "com.taobao.taobao.TaobaoIntentService");
        b(context, packageName, xd0.channelService);
        b(context, packageName, "com.taobao.accs.EventReceiver");
        b(context, packageName, xd0.msgService);
        b(context, packageName, "org.android.agoo.accs.AgooService");
        b(context, packageName, "com.taobao.agoo.AgooCommondReceiver");
        b(context, packageName, "com.taobao.accs.internal.AccsJobService");
        b(context, packageName, "com.taobao.wireless.bcportserver.PortServerReceiver");
        b(context, packageName, "com.taobao.wireless.bcportserver.PortsService");
        b(context, packageName, "com.taobao.accs.ServiceReceiver");
        b(context, packageName, "com.alibaba.analytics.AnalyticsService");
        b(context, packageName, "mtopsdk.xstate.XStateService");
        b(context, packageName, "com.taobao.orange.service.OrangeApiService");
        b(context, packageName, "com.taobao.acds.compact.ACDSBusinessService");
        b(context, packageName, "com.taobao.passivelocation.aidl.PassiveLocationServiceImpl");
        b(context, packageName, "anetwork.channel.aidl.NetworkService");
        b(context, packageName, "org.chromium.content.app.SandboxedProcessService0");
        b(context, packageName, "com.taobao.activelocation.report.service.ActiveReportService");
        b(context, packageName, "com.taobao.passivelocation.report.service.LocationReportService");
        b(context, packageName, "com.taobao.passivelocation.gathering.service.LocationGatheringService");
        b(context, packageName, "com.amap.api.location.APSService");
        b(context, packageName, "com.taobao.acds.compact.AccsACDSService");
        b(context, packageName, "com.taobao.passivelocation.gathering.receiver.LocationChangedReceiver");
        b(context, packageName, "com.taobao.favorites.service.FavGoodService");
        b(context, packageName, "com.laiwang.protocol.android.LwpAccsService");
        b(context, packageName, "com.laiwang.protocol.android.LWPService");
    }

    public static void e(Context context, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e00e297", new Object[]{context, hashMap});
        } else {
            c(context);
        }
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb783f9", new Object[]{context})).booleanValue();
        }
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("is_yuzhuang_state_recovered", false);
    }

    public static boolean d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("defbec91", new Object[]{context})).booleanValue();
        }
        return PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("is_yuzhuang_state_recovered", true).commit();
    }

    public static void b(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43ec109d", new Object[]{context, str, str2});
            return;
        }
        try {
            PackageManager packageManager = context.getApplicationContext().getPackageManager();
            ComponentName componentName = new ComponentName(str, str2);
            if (packageManager.getComponentEnabledSetting(componentName) == 2) {
                packageManager.setComponentEnabledSetting(componentName, 1, 1);
            }
        } catch (Exception e) {
            Log.e("ComponentStateInner", "try to change component state failed, component:" + str2, e);
        }
    }
}
