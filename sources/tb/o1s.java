package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class o1s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static n1s b(File file, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n1s) ipChange.ipc$dispatch("3d3a7c5c", new Object[]{file, str});
        }
        return new n1s(file, str);
    }

    public static n1s a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n1s) ipChange.ipc$dispatch("7b633e92", new Object[]{file});
        }
        String name = file.getName();
        if (name.endsWith("java.log")) {
            return new n1s(file, "java");
        }
        if (name.endsWith("anr.log")) {
            return new n1s(file, "anr");
        }
        if (name.endsWith("native.log")) {
            return new n1s(file, "native");
        }
        if (name.endsWith("jni.log")) {
            return new n1s(file, "native");
        }
        ehh.b("TCrashReportFactory", "not support file", file.getAbsolutePath());
        return null;
    }
}
