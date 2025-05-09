package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class zio implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String b = "RunnableEx";

    /* renamed from: a  reason: collision with root package name */
    private volatile String f32795a;

    static {
        t2o.a(481297651);
    }

    public zio() {
        this.f32795a = "RUNNABLE";
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("54a5a515", new Object[]{this});
        }
        return this.f32795a;
    }

    public void b(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
        }
    }

    public abstract void c();

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e9be069", new Object[]{this, str});
        } else {
            this.f32795a = str;
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
            agh.d(b, "Runnable Exception: " + this.f32795a, th);
            b(th);
        }
    }

    public zio(String str) {
        this.f32795a = "RUNNABLE";
        this.f32795a = str;
    }
}
