package tb;

import android.app.Application;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class gi2 implements q41 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final AtomicBoolean b = new AtomicBoolean(false);

    /* renamed from: a  reason: collision with root package name */
    public final r41 f20014a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Application f20015a;
        public final b8l b;

        public b(Application application, b8l b8lVar) {
            this.f20015a = application;
            this.b = b8lVar;
        }

        public q41 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (q41) ipChange.ipc$dispatch("9eeb399d", new Object[]{this});
            }
            return new gi2(this.f20015a, this.b);
        }
    }

    @Override // tb.q41
    public void e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        w35.a("Bootstrap#attachBaseContext");
        whh.a("Bootstrap", "lifeCycle#attachBaseContext");
        this.f20014a.e(context);
        w35.c();
    }

    @Override // tb.q41
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        w35.a("Bootstrap#onCreate");
        whh.a("Bootstrap", "lifeCycle#onCreate");
        this.f20014a.onCreate();
        w35.c();
    }

    public gi2(Application application, b8l b8lVar) {
        w35.a("Bootstrap");
        whh.a("Bootstrap", "lifeCycle#constuctor#" + application);
        if (b.compareAndSet(false, true)) {
            this.f20014a = va7.b(application, b8lVar);
        } else {
            this.f20014a = va7.c();
        }
        this.f20014a.f(application, b8lVar);
        w35.c();
    }
}
