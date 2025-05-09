package tb;

import android.content.Context;
import com.alibaba.wireless.aliprivacyext.track.model.TrackLog;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.utils.tools.TimeCalculator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ssx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else {
            gwx.o().c(context);
        }
    }

    public static void b(TrackLog trackLog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d966404e", new Object[]{trackLog});
            return;
        }
        if (trackLog != null) {
            trackLog.addTag9("0.11.1");
            trackLog.addTag10(TimeCalculator.PLATFORM_ANDROID);
        }
        gwx.o().d(trackLog);
    }

    public static void c(tsx tsxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e92705c", new Object[]{tsxVar});
        } else {
            gwx.o().e(tsxVar);
        }
    }
}
