package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class kj1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f22699a = null;

    static {
        t2o.a(1034944553);
    }

    public static Boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("89e942eb", new Object[]{str});
        }
        if (!b()) {
            return Boolean.FALSE;
        }
        if (str == null) {
            return Boolean.FALSE;
        }
        String[] split = str.split(",");
        if (split.length <= 0) {
            return Boolean.FALSE;
        }
        if (jj1.h().c("Jarvis-workflow-engine", Arrays.asList(split), "dT1KYXJ2aXMtd29ya2Zsb3ctZW5naW5l").size() > 0) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea47c457", new Object[0])).booleanValue();
        }
        if (f22699a == null) {
            try {
                f22699a = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                f22699a = Boolean.FALSE;
            }
        }
        return f22699a.booleanValue();
    }
}
