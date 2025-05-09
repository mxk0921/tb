package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.VirtualThread;
import com.taobao.android.virtual_thread.stub.StubExecutors;
import java.util.concurrent.ThreadFactory;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class sqt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(974127129);
    }

    public static /* synthetic */ void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb970e", new Object[0]);
        }
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ba82c1f1", new Object[0]);
        }
        return e(StubExecutors.defaultThreadFactory());
    }

    public static String e(ThreadFactory threadFactory) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7439fc14", new Object[]{threadFactory});
        }
        Thread newThread = threadFactory.newThread(new Runnable() { // from class: tb.rqt
            @Override // java.lang.Runnable
            public final void run() {
                sqt.c();
            }
        });
        if (!(newThread instanceof VirtualThread)) {
            ghh.c(new IllegalStateException("Must use VirtualThread insteadof Thread"));
        }
        return b(newThread.getName());
    }

    public static String b(String str) {
        char[] charArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e13d4a05", new Object[]{str});
        }
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        for (char c : str.toCharArray()) {
            if (c < '0' || c > '9') {
                sb.append(c);
                z = false;
            } else {
                if (!z) {
                    sb.append("x");
                }
                z = true;
            }
        }
        return sb.toString();
    }
}
