package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ugh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final udh f29358a = new udh();

    static {
        t2o.a(487587973);
    }

    public static jnc a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jnc) ipChange.ipc$dispatch("75b856cc", new Object[0]);
        }
        return f29358a;
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bebe7bb", new Object[]{str, str2});
            return;
        }
        jnc a2 = a();
        if (a2 != null) {
            a2.logd("InfoFlowDataSource", "[" + str + "] " + str2);
        }
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a88c12bc", new Object[]{str, str2});
            return;
        }
        jnc a2 = a();
        if (a2 != null) {
            a2.loge("InfoFlowDataSource", "[" + str + "] " + str2);
        }
    }

    public static void d(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc02eb9", new Object[]{str, str2, th});
            return;
        }
        jnc a2 = a();
        if (a2 != null) {
            a2.loge("InfoFlowDataSource", "[" + str + "] " + str2, th);
        }
    }

    public static void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bcf18ce", new Object[]{str, str2});
            return;
        }
        jnc a2 = a();
        if (a2 != null) {
            a2.logw("InfoFlowDataSource", "[" + str + "] " + str2);
        }
    }
}
