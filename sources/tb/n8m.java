package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class n8m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(824180800);
    }

    public void a(String str, String str2, String str3, long j, StackTraceElement[] stackTraceElementArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e15bd7bf", new Object[]{this, str, str2, str3, new Long(j), stackTraceElementArr});
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef389c47", new Object[]{this, str});
        }
    }

    public void c(Throwable th, StackTraceElement stackTraceElement, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2acf245d", new Object[]{this, th, stackTraceElement, str});
        }
    }

    public void d(String str, int i, StackTraceElement[] stackTraceElementArr, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68749ace", new Object[]{this, str, new Integer(i), stackTraceElementArr, str2});
        }
    }
}
