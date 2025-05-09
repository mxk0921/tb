package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TTraceLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class qd0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f26679a;

    static {
        try {
            IpChange ipChange = TTraceLog.$ipChange;
            f26679a = true;
        } catch (ClassNotFoundException unused) {
            f26679a = false;
        }
    }

    public static void a(String str, String str2, String str3, String str4, long j, String str5, String str6, String str7, int i, String str8, String str9) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f859086b", new Object[]{str, str2, str3, str4, new Long(j), str5, str6, str7, new Integer(i), str8, str9});
        } else if (f26679a) {
            TTraceLog.debugEvent(str, str2, str3, str4, j, str5, str6, str7, i, str9);
        }
    }

    public static void b(String str, String str2, String str3, long j, String str4, String str5, String str6, String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cc3d88d", new Object[]{str, str2, str3, new Long(j), str4, str5, str6, str7});
        } else {
            c(str, str2, str3, "", j, str4, str5, str6, 0, "", str7);
        }
    }

    public static void c(String str, String str2, String str3, String str4, long j, String str5, String str6, String str7, int i, String str8, String str9) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd5713fe", new Object[]{str, str2, str3, str4, new Long(j), str5, str6, str7, new Integer(i), str8, str9});
        } else if (f26679a) {
            TTraceLog.event(str, str2, str3, str4, j, str5, str6, str7, i, str8, str9);
        }
    }
}
