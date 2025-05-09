package tb;

import android.app.Application;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class rx6 implements r41 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public rx6() {
        whh.a("DefaultAppDelegate", "lifeCycle#constuctor");
        whh.b("DefaultAppDelegate", "WARNING, something may went wrong here", new IllegalStateException("The delegate has already been initialized before!!!"));
    }

    @Override // tb.q41
    public void e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
        } else {
            whh.a("DefaultAppDelegate", "lifeCycle#attachBaseContext");
        }
    }

    @Override // tb.r41
    public void f(Application application, b8l b8lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2236238c", new Object[]{this, application, b8lVar});
        } else {
            whh.a("DefaultAppDelegate", "lifeCycle#bindApp");
        }
    }

    @Override // tb.q41
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        } else {
            whh.a("DefaultAppDelegate", "lifeCycle#onCreate");
        }
    }
}
