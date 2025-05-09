package tb;

import android.os.Trace;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class qoj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PREFIX_NAV = "nav_";
    public static final String SWITCH_PATH = "/data/local/tmp/.nav_trace_open";

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f26854a = new File(SWITCH_PATH).exists();

    static {
        t2o.a(578814088);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1296a8b1", new Object[0]);
        } else if (f26854a) {
            Trace.endSection();
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5943054", new Object[]{str});
        } else if (f26854a) {
            if (str == null) {
                str = "";
            }
            if (str.length() >= 100) {
                str = str.substring(0, 99);
            }
            Trace.beginSection(PREFIX_NAV + str);
        }
    }
}
