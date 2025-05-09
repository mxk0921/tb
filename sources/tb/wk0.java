package tb;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.location.common.TBLocationDTO;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class wk0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809108);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9537ec30", new Object[0]);
        } else {
            AppMonitor.Counter.commit("Page_Home", "LocationRequest", "begin", 1.0d);
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8827362", new Object[0]);
        } else {
            AppMonitor.Counter.commit("Page_Home", "LocationRequest", "end", 1.0d);
        }
    }

    public static void c(TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5c2da9f", new Object[]{tBLocationDTO});
        } else if (tBLocationDTO == null) {
            sfh.d("AlertMonitor", "monitorLocationRequestError.location对象为空");
            AppMonitor.Alarm.commitFail("Page_Home", "HomeLocating", "-1", "location对象为空");
        } else {
            sfh.d("AlertMonitor", "monitorLocationRequestError");
            AppMonitor.Alarm.commitFail("Page_Home", "HomeLocating", String.valueOf(tBLocationDTO.getErrorCode()), "定位失败");
        }
    }

    public static void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("637bc1f0", new Object[]{str});
        } else {
            AppMonitor.Counter.commit("Page_Home", "monitorPath", str, 1.0d);
        }
    }
}
