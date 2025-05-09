package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class m02 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f23683a;

    static {
        t2o.a(404750654);
    }

    public m02(String str) {
        this.f23683a = str;
    }

    public void c(Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd91d31e", new Object[]{this, exc});
            return;
        }
        String str = this.f23683a;
        if (str == null) {
            str = "BaseSafeRunnable";
        }
        q82.f(str, null, null, exc);
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("534b14a", new Object[]{this});
        }
        return this.f23683a;
    }

    public abstract void e();

    @Override // java.lang.Runnable
    public final void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            if (!TextUtils.isEmpty(d())) {
                gwv.f(Thread.currentThread().getName(), d());
            }
            e();
        } catch (Exception e) {
            c(e);
        } catch (Throwable th) {
            if (!rja.b()) {
                String str = this.f23683a;
                if (str == null) {
                    str = "BaseSafeRunnable";
                }
                q82.f(str, "Throwable", null, th);
            } else {
                throw th;
            }
        }
        gwv.z(Thread.currentThread().getName());
    }

    public m02() {
    }
}
