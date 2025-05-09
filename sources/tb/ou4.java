package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class ou4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final /* synthetic */ StackTraceElement a(Throwable th, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StackTraceElement) ipChange.ipc$dispatch("774ed60b", new Object[]{th, str});
        }
        return b(th, str);
    }

    public static final StackTraceElement b(Throwable th, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StackTraceElement) ipChange.ipc$dispatch("a896cecb", new Object[]{th, str});
        }
        StackTraceElement stackTraceElement = th.getStackTrace()[0];
        return new StackTraceElement("_COROUTINE." + str, "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }

    public static final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5fdd9ed4", new Object[0]);
        }
        return "_COROUTINE";
    }
}
