package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class y7b<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(760217768);
    }

    public abstract void a(T t, String str);

    public abstract void b(Throwable th);

    public void c(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9a25bdd", new Object[]{this, str, new Integer(i), new Integer(i2)});
        }
    }
}
