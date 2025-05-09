package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class u9h {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final u9h INSTANCE = new u9h();

    static {
        t2o.a(839909955);
    }

    @JvmStatic
    public static final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("188675cf", new Object[0]);
        }
        if (!c() || !new File(ckf.p("/data/local/tmp/.themis_local_switch/", ".fragment_path")).exists()) {
            return null;
        }
        return nh9.c(new File(ckf.p("/data/local/tmp/.themis_local_switch/", ".fragment_path")), null, 1, null);
    }

    @JvmStatic
    public static final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1018317", new Object[0])).booleanValue();
        }
        return new File(ckf.p("/data/local/tmp/.themis_local_switch/", ".ThemisDebugMode")).exists();
    }

    @JvmStatic
    public static final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c2689c2f", new Object[0])).booleanValue();
        }
        return new File(ckf.p("/data/local/tmp/.themis_local_switch/", ".ThemisFragment")).exists();
    }

    @JvmStatic
    public static final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8a673f", new Object[0])).booleanValue();
        }
        return new File(ckf.p("/data/local/tmp/.themis_local_switch/", ".keepLive")).exists();
    }
}
