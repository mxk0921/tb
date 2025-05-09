package tb;

import android.content.Context;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.device.UTDevice;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class kd0 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "AdapterAppMonitor";

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f22577a;

    static {
        t2o.a(395313304);
        f22577a = false;
        try {
            IpChange ipChange = AppMonitor.$ipChange;
            f22577a = true;
        } catch (ClassNotFoundException unused) {
            f22577a = false;
        }
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeeeb8e7", new Object[]{str, str2});
        } else if (f22577a) {
            AppMonitor.Alarm.commitSuccess("TBVideoCore_VCSimpleSession", str, str2);
        }
    }

    public static String b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aab690c5", new Object[]{context});
        }
        if (f22577a) {
            return UTDevice.getUtdid(context);
        }
        return "";
    }
}
