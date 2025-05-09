package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class k6s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f22436a;

    public static void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b0ad8ce", new Object[]{str, obj});
        } else if (f22436a && v2s.o().A() != null) {
            cwd A = v2s.o().A();
            A.c("TaoLiveMessage[" + str + "]", obj);
        }
    }

    public static void b(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d8b84d2", new Object[]{str, obj});
        } else if (f22436a && v2s.o().A() != null) {
            cwd A = v2s.o().A();
            A.a("TaoLiveMessage[" + str + "]", obj);
        }
    }
}
