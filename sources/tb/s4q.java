package tb;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class s4q {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String g = s4q.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public long f27793a;
    public final String b;
    public w4q d;
    public r4d e;
    public final Runnable f = new a();
    public final Handler c = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                s4q.this.a();
            }
        }
    }

    static {
        t2o.a(779092068);
    }

    public s4q(String str) {
        this.b = str;
        efs.a(g, "Constructor");
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("598fffc2", new Object[]{this});
            return;
        }
        efs.a(g, "onNotSecClose");
        u6t.f("KEY_WINDOW_SEC_CLOSE_COUNT_SIDE_SLIDE", 0L);
        u6t.f("KEY_WINDOW_SEC_CLOSE_COUNT_KEY_BACK_DOWN", 0L);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("549a5952", new Object[]{this});
            return;
        }
        efs.a(g, "onWindowDestroy");
        this.c.removeCallbacks(this.f);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35aa6da0", new Object[]{this});
            return;
        }
        efs.a(g, "onWindowOpen");
        this.f27793a = System.currentTimeMillis();
        this.c.postDelayed(this.f, 5000L);
    }

    public void e(r4d r4dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9b82bea", new Object[]{this, r4dVar});
        } else {
            this.e = r4dVar;
        }
    }

    public void f(w4q w4qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20735d5d", new Object[]{this, w4qVar});
        } else {
            this.d = w4qVar;
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4acf5a6a", new Object[]{this})).booleanValue();
        }
        String str = g;
        efs.a(str, "onWindowClickClose mTriggerMode = " + this.b);
        if (!u6t.b("KEY_ENABLE_SHOW_AUTO", true)) {
            efs.a(str, "onWindowClickClose switch close");
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f27793a;
        efs.a(str, "onWindowClickClose diff = " + currentTimeMillis);
        long c = u6t.c("KEY_WINDOW_SEC_CLOSE_COUNT_SIDE_SLIDE");
        long c2 = u6t.c("KEY_WINDOW_SEC_CLOSE_COUNT_KEY_BACK_DOWN");
        if (currentTimeMillis < 5000) {
            if ("SideSlip".equals(this.b)) {
                c++;
                u6t.f("KEY_WINDOW_SEC_CLOSE_COUNT_SIDE_SLIDE", c);
                efs.a(str, "onWindowClickClose SideSlip sec close count = " + c);
                w4q w4qVar = this.d;
                if (w4qVar != null) {
                    w4qVar.i(this.e);
                }
            } else if ("KeyBackDown".equals(this.b)) {
                c2++;
                u6t.f("KEY_WINDOW_SEC_CLOSE_COUNT_KEY_BACK_DOWN", c2);
                efs.a(str, "onWindowClickClose KeyBackDown sec close count = " + c2);
                w4q w4qVar2 = this.d;
                if (w4qVar2 != null) {
                    w4qVar2.i(this.e);
                }
            }
        } else if ("SideSlip".equals(this.b) || "KeyBackDown".equals(this.b)) {
            efs.a(str, "onWindowClickClose not sec close");
            u6t.f("KEY_WINDOW_SEC_CLOSE_COUNT_SIDE_SLIDE", 0L);
            u6t.f("KEY_WINDOW_SEC_CLOSE_COUNT_KEY_BACK_DOWN", 0L);
            c = 0;
            c2 = 0;
        }
        efs.a(str, "onWindowClickClose final KeyBackDown sec close count = " + c2);
        efs.a(str, "onWindowClickClose final SideSlip sec close count = " + c);
        if (c <= 2 && c2 <= 2) {
            return false;
        }
        efs.a(str, "onWindowClickClose sec close = 3 close switch ");
        u6t.f("KEY_WINDOW_SEC_CLOSE_COUNT_SIDE_SLIDE", 0L);
        u6t.f("KEY_WINDOW_SEC_CLOSE_COUNT_KEY_BACK_DOWN", 0L);
        u6t.e("KEY_ENABLE_SHOW_AUTO", false);
        return true;
    }
}
