package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class vrw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static vrw b;

    /* renamed from: a  reason: collision with root package name */
    public zee f30212a;

    static {
        t2o.a(989856350);
    }

    public static vrw getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vrw) ipChange.ipc$dispatch("1be953b0", new Object[0]);
        }
        if (b == null) {
            synchronized (vrw.class) {
                try {
                    if (b == null) {
                        b = new vrw();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public zee getUpdateFinishCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zee) ipChange.ipc$dispatch("a60d9de", new Object[]{this});
        }
        return this.f30212a;
    }

    public void init(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b35b22e3", new Object[]{this, context, new Boolean(z)});
            return;
        }
        try {
            if (x74.l(context)) {
                fpx.a().b();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void registerUpdateFinishCallback(zee zeeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5549811", new Object[]{this, zeeVar});
        } else {
            this.f30212a = zeeVar;
        }
    }
}
