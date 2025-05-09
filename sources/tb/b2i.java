package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class b2i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static b2i f16139a;

    static {
        t2o.a(619708502);
    }

    public static b2i b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b2i) ipChange.ipc$dispatch("9eeea568", new Object[0]);
        }
        if (f16139a == null) {
            synchronized (b2i.class) {
                try {
                    if (f16139a == null) {
                        f16139a = new b2i();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f16139a;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a02127e2", new Object[]{this});
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a37a973", new Object[]{this, str});
        }
    }
}
