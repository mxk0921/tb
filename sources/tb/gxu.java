package tb;

import com.alibaba.android.umbrella.link.UMLinkLogInterface;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class gxu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final UMLinkLogInterface f20302a = hdv.a();

    static {
        t2o.a(80740774);
    }

    public static void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4348b8d3", new Object[]{str, str2, str3, str4});
            return;
        }
        try {
            UMLinkLogInterface uMLinkLogInterface = f20302a;
            uMLinkLogInterface.logError("ultron_container", str, "exception", null, str3, str4, null, null);
            uMLinkLogInterface.commitFailure("exception", str2, "1.0", "ultron_container", str, null, str3, str4);
        } catch (Throwable unused) {
        }
    }
}
