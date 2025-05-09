package tb;

import androidx.core.os.TraceCompat;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class q9u {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f26610a = null;

    static {
        t2o.a(806355055);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5235938d", new Object[]{str});
        } else if (b()) {
            TraceCompat.beginSection(str);
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a684c90d", new Object[0])).booleanValue();
        }
        if (f26610a == null) {
            f26610a = Boolean.valueOf(new File(ey1.SWITCH_FILE_DIR, ".taolive_trace_enable").exists());
        }
        return f26610a.booleanValue();
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fcca111", new Object[0]);
        } else if (b()) {
            TraceCompat.endSection();
        }
    }
}
