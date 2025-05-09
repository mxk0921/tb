package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class w2v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f30423a = true;
    public static final List<a> b = Collections.synchronizedList(new ArrayList());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface a {
        void onBackground();

        void onForeground();
    }

    static {
        t2o.a(962593011);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83d13a74", new Object[0]);
        } else {
            c(false);
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7f3c09", new Object[0]);
        } else {
            c(true);
        }
    }

    public static void d(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f5e136d", new Object[]{aVar});
            return;
        }
        List<a> list = b;
        if (!list.contains(aVar)) {
            list.add(aVar);
        }
    }

    public static void c(boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("413e225a", new Object[]{new Boolean(z)});
            return;
        }
        nhh.f("UTServerAppStatusTrigger", "postAppStatus mIsAppOnForeground", Boolean.valueOf(f30423a), "isAppOnForeground", Boolean.valueOf(z));
        f30423a = z;
        while (true) {
            List<a> list = b;
            if (i < list.size()) {
                if (z) {
                    list.get(i).onForeground();
                } else {
                    list.get(i).onBackground();
                }
                i++;
            } else {
                return;
            }
        }
    }
}
