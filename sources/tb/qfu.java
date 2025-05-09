package tb;

import android.content.Context;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.ScheduleComposer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class qfu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25217196", new Object[]{str});
        } else {
            AppMonitor.Counter.commit(erj.MODULE, "ColdStartNavigation", str, 1.0d);
        }
    }

    public static void b(Context context, ScheduleComposer scheduleComposer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66dd014", new Object[]{context, scheduleComposer});
            return;
        }
        v8n.b();
        sy3.b(scheduleComposer);
        mps.b(context, scheduleComposer);
    }
}
