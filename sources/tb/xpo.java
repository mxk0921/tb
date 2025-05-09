package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class xpo implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String b = "RunnableEx";

    /* renamed from: a  reason: collision with root package name */
    private volatile String f31519a;

    static {
        t2o.a(993001973);
    }

    public xpo() {
        this.f31519a = "RUNNABLE";
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("54a5a515", new Object[]{this});
        }
        return this.f31519a;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11bc4f70", new Object[]{this});
        }
    }

    public abstract void c();

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e9be069", new Object[]{this, str});
        } else {
            this.f31519a = str;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            c();
        } catch (Throwable th) {
            c4p.o(b, "Runnable Exception: " + this.f31519a, th);
            b();
        }
    }

    public xpo(String str) {
        this.f31519a = "RUNNABLE";
        this.f31519a = str;
    }
}
