package tb;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.TSchedule;
import com.taobao.android.tschedule.task.RenderScheduleTask;
import com.taobao.android.tschedule.task.ScheduleTask;
import com.taobao.android.tscheduleprotocol.RenderScheduleProtocol;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class sls {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(329253016);
    }

    public final void a(String str) {
        List<ScheduleTask> e;
        RenderScheduleProtocol e2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d7a5c50", new Object[]{this, str});
            return;
        }
        String n = yms.n(str);
        if (!(n == null || (e = nms.e(n)) == null || e.isEmpty())) {
            for (ScheduleTask scheduleTask : e) {
                if (!(!(scheduleTask instanceof RenderScheduleTask) || scheduleTask.taskContext == 0 || (e2 = vms.c().e(scheduleTask.taskContext.bizCode)) == null)) {
                    e2.removePreloadedInstance(str);
                    Log.e("TS.navHook", "remove rennder cache because hit switch close, url=" + str);
                }
            }
        }
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("913c1a85", new Object[]{str})).booleanValue();
        }
        return str == null || str.contains("ariver_appid=") || str.contains("uniapp_id=") || str.contains(ges.SOURCE_URL);
    }

    public final boolean d(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3625261f", new Object[]{this, intent})).booleanValue();
        }
        Uri data = intent.getData();
        if (data == null) {
            return true;
        }
        String uri = data.toString();
        if (TextUtils.isEmpty(uri) || b(uri) || !zms.b(wms.SWITCH_KEY_ENABLE_NAV, false)) {
            return true;
        }
        String stringExtra = intent.getStringExtra("referrer");
        boolean booleanExtra = intent.getBooleanExtra("from_browser", false);
        zdh.a("TS.navHook", "navBefore.url = " + uri + "; referrerUrl = " + stringExtra + "; fromBrowser = " + booleanExtra);
        if (booleanExtra || TextUtils.equals(cns.c(uri), cns.c(stringExtra))) {
            zdh.a("TS.navHook", "navBefore。browser url, discard");
            return true;
        }
        zdh.a("TS.navHook", "start nav before trigger, url=" + uri);
        ums.c("TScheduleNavHookerTrigger.hook");
        TSchedule.preload("navBefore", uri, intent);
        if (yms.k(uri)) {
            dms.b(fdv.F_PAGE_RENDER, cns.c(uri), "", "TSchedule", "NavBefore", null);
        }
        ums.b("TScheduleNavHookerTrigger.hook", new String[0]);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(android.content.Intent r18) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.sls.c(android.content.Intent):boolean");
    }
}
