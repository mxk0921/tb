package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class e1r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f18217a;
    public static Boolean b;
    public static Boolean c;
    public static Boolean d;
    public static Boolean e;

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16c89300", new Object[0])).booleanValue();
        }
        Boolean bool = d;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean exists = new File("/data/local/tmp/.trace_falco").exists();
        d = new Boolean(exists);
        return exists;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8cd3f79a", new Object[0])).booleanValue();
        }
        Boolean bool = f18217a;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean exists = new File("/data/local/tmp/.falco_full_trace").exists();
        f18217a = new Boolean(exists);
        return exists;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ba69a7a", new Object[0])).booleanValue();
        }
        Boolean bool = e;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean exists = new File("/data/local/tmp/.falco_env_enable").exists();
        e = new Boolean(exists);
        return exists;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44c41020", new Object[0])).booleanValue();
        }
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean exists = new File("/data/local/tmp/.falco_full_trace_v3").exists();
        b = new Boolean(exists);
        return exists;
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("218ad4a0", new Object[0])).booleanValue();
        }
        Boolean bool = c;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean exists = new File("/data/local/tmp/.falco_local_debug_enable").exists();
        c = new Boolean(exists);
        return exists;
    }
}
