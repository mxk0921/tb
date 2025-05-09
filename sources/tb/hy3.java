package tb;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class hy3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final hy3 c = new hy3();
    public static volatile boolean d = false;

    /* renamed from: a  reason: collision with root package name */
    public Context f20958a;
    public jy3 b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements u11 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.u11, com.taobao.application.common.IApmEventListener
        public void onEvent(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
            } else if (i == 50) {
                Log.e(t71.MODULE_NAME, "CodeTrack: APM is notifying for in background stat");
                hy3.a(hy3.this);
            }
        }
    }

    public static /* synthetic */ void a(hy3 hy3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88ff11c1", new Object[]{hy3Var});
        } else {
            hy3Var.e();
        }
    }

    public static hy3 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hy3) ipChange.ipc$dispatch("e00af8e", new Object[0]);
        }
        return c;
    }

    public void c(Context context, jy3 jy3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a82a624d", new Object[]{this, context, jy3Var});
            return;
        }
        this.b = jy3Var;
        d(context);
    }

    public final void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db22054", new Object[]{this, context});
        } else if (d) {
            Log.e(t71.MODULE_NAME, "hasInit==true, already init");
        } else {
            d = true;
            if (context == null) {
                Log.e(t71.MODULE_NAME, "argument context == null, kidding?");
                return;
            }
            this.f20958a = context.getApplicationContext();
            ch4.h();
            boolean d2 = ch4.d();
            Log.e("codetrack", "init switch is " + d2);
            if (d2) {
                f();
                xq2.a(t71.MODULE_NAME, "init finish");
            }
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3157884a", new Object[]{this});
        } else if (this.f20958a == null) {
            Log.e(t71.MODULE_NAME, "skip dump , context == null");
        } else {
            xq2.a(t71.MODULE_NAME, "codeTrackInfo=" + this.b);
            jy3 jy3Var = this.b;
            if (jy3Var == null) {
                xq2.a(t71.MODULE_NAME, "skip dump , codeTrackInfo == null || buildId == empty");
                return;
            }
            try {
                if (!ch4.f()) {
                    xq2.a(t71.MODULE_NAME, "!rateMatched");
                } else {
                    AsyncTask.execute(new p08(this.f20958a, jy3Var));
                }
            } catch (Throwable th) {
                xq2.b(t71.MODULE_NAME, "CodeTrackInfo performDumpAndUpload error:", th);
            }
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad701006", new Object[]{this});
            return;
        }
        jy3 jy3Var = this.b;
        if (jy3Var == null || jy3Var.b()) {
            Log.e(t71.MODULE_NAME, "skip register apm task, cause 'codeTrackInfo == null || codeTrackInfo.isDisableApmCollect()' ");
            return;
        }
        Log.e(t71.MODULE_NAME, "performRegisterApmTask enter");
        c21.c(new a());
    }
}
