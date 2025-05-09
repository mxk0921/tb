package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.view.WindowManager;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.purchase.preload.TBBuyPreloadScene;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class spa implements w24 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile boolean c;

    /* renamed from: a  reason: collision with root package name */
    public final g1r f28196a;
    public final loq b;

    public spa(g1r g1rVar, loq loqVar) {
        this.f28196a = g1rVar;
        this.b = loqVar;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements Handler.Callback {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int g;
        public static final int h;
        public static final int i;

        /* renamed from: a  reason: collision with root package name */
        public final Context f28197a;
        public final Object b;
        public final Handler.Callback c;
        public final Handler d;
        public final g1r e;
        public final loq f;

        static {
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread$H");
                Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredField", String.class);
                declaredMethod.setAccessible(true);
                Field field = (Field) declaredMethod.invoke(cls, "EXECUTE_TRANSACTION");
                field.setAccessible(true);
                g = ((Integer) field.get(null)).intValue();
                Field field2 = (Field) declaredMethod.invoke(cls, "SCHEDULE_CRASH");
                field2.setAccessible(true);
                i = ((Integer) field2.get(null)).intValue();
                Field field3 = (Field) declaredMethod.invoke(cls, "SLEEPING");
                field3.setAccessible(true);
                h = ((Integer) field3.get(null)).intValue();
            } catch (Exception e) {
                xhh.c(e);
            }
        }

        public a(Context context, Object obj, Handler handler, Handler.Callback callback, g1r g1rVar, loq loqVar) {
            this.f28197a = context;
            this.b = obj;
            this.d = handler;
            this.c = callback;
            this.e = g1rVar;
            this.f = loqVar;
        }

        public final boolean a(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("deab9c19", new Object[]{this, message})).booleanValue();
            }
            try {
                if (d(message)) {
                    e();
                    return true;
                }
            } catch (Exception e) {
                xhh.c(e);
            }
            return false;
        }

        public final boolean b(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b43899e1", new Object[]{this, message})).booleanValue();
            }
            try {
                f(message);
            } catch (WindowManager.BadTokenException e) {
                xhh.a("badTokenMsg", message);
                xhh.c(e);
                if (!a(message)) {
                    xhh.a("clearActivityThenGotoHome", "clear failed");
                    throw e;
                }
            } catch (IllegalArgumentException e2) {
                xhh.c(e2);
            } catch (IllegalStateException e3) {
                xhh.c(e3);
                if (!this.e.a("ignoreIllegalStateException", false)) {
                    throw e3;
                }
            } catch (Throwable th) {
                xhh.c(th);
                if (this.e.a("exceptionThenGoHome", false)) {
                    e();
                } else {
                    throw th;
                }
            }
            return true;
        }

        public final boolean c(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a997ded9", new Object[]{this, message})).booleanValue();
            }
            int i2 = g;
            int i3 = message.what;
            if (i2 == i3 || (100 == i3 && this.e.a("fixAndroid8BadToken", this.f.a()))) {
                try {
                    f(message);
                } catch (WindowManager.BadTokenException e) {
                    xhh.c(e);
                    if (!a(message)) {
                        xhh.a("clearActivityThenGotoHome", "clear failed");
                        throw e;
                    }
                } catch (IllegalArgumentException e2) {
                    xhh.c(e2);
                }
                return true;
            }
            int i4 = i;
            int i5 = message.what;
            if (i4 != i5 && h != i5) {
                return false;
            }
            try {
                f(message);
            } catch (Exception e3) {
                xhh.c(e3);
            }
            return true;
        }

        public final void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8963c469", new Object[]{this});
                return;
            }
            xhh.a("HCallbackCommand", "goto http://m.taobao.com/index.htm");
            Nav.from(this.f28197a).toUri("http://m.taobao.com/index.htm", new C1057a(this));
        }

        public final void f(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e98b0d1b", new Object[]{this, message});
            } else {
                this.d.handleMessage(message);
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
            }
            Handler.Callback callback = this.c;
            if (callback != null && callback.handleMessage(message)) {
                if (message.what == g) {
                    try {
                        xhh.a("bad_EXECUTE_TRANSACTION", this.c);
                    } catch (Throwable th) {
                        xhh.c(th);
                    }
                }
                return true;
            } else if (this.e.a("doAllPartAction", this.f.a())) {
                return b(message);
            } else {
                return c(message);
            }
        }

        /* compiled from: Taobao */
        /* renamed from: tb.spa$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class C1057a implements Nav.b {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C1057a(a aVar) {
            }

            @Override // com.taobao.android.nav.Nav.b
            public void onResult(boolean z, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("98556e8e", new Object[]{this, new Boolean(z), intent});
                } else {
                    xhh.a("HCallbackCommand", TBBuyPreloadScene.NAV, Boolean.valueOf(z));
                }
            }
        }

        public final boolean d(Message message) throws Exception {
            Activity activity;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a94d6057", new Object[]{this, message})).booleanValue();
            }
            xhh.a("HCallbackCommand", "ensureClearCurrentActivity");
            adk i2 = adk.i(message.obj);
            if (Build.VERSION.SDK_INT >= 28) {
                IBinder iBinder = (IBinder) i2.b("mActivityToken").h();
                if (iBinder == null) {
                    xhh.a("token == null", new Object[0]);
                    return false;
                }
                Object obj = ((Map) adk.i(this.b).b("mActivities").h()).get(iBinder);
                if (obj == null) {
                    xhh.a("HCallbackCommand", "activityClientRecord == null");
                    return false;
                }
                activity = (Activity) adk.i(obj).b("activity").h();
            } else {
                activity = (Activity) i2.b("activity").h();
            }
            if (activity == null) {
                xhh.a("HCallbackCommand", "activity == null");
                return false;
            }
            xhh.a("HCallbackCommand", activity.getClass().getSimpleName());
            activity.finish();
            return true;
        }
    }

    @Override // tb.w24
    public void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8140e3", new Object[]{this, application});
            return;
        }
        if (c() && !c) {
            if (this.f28196a.a("shouldInterruptHCallback", this.b.a())) {
                b(application);
            } else {
                xhh.a("shouldInterruptHCallback", "no hook");
            }
        }
        c = true;
    }

    public final void b(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7e472ce", new Object[]{this, application});
            return;
        }
        try {
            adk d = adk.i(Class.forName(ProcessUtils.ACTIVITY_THREAD)).d(ProcessUtils.CURRENT_ACTIVITY_THREAD);
            adk b = d.b("mH");
            b.f("mCallback", new a(application, d.h(), (Handler) b.h(), (Handler.Callback) b.b("mCallback").h(), this.f28196a, this.b));
            xhh.a("HCallbackCommand", "init succ");
        } catch (Exception e) {
            xhh.c(e);
        }
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("408315a6", new Object[]{this})).booleanValue();
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 24 && i <= 31) {
            return true;
        }
        if (i == 33) {
            String str = Build.BRAND;
            if (str.equalsIgnoreCase("Redmi") || str.equalsIgnoreCase("meizu") || str.equalsIgnoreCase("Xiaomi")) {
                return true;
            }
        }
        return false;
    }
}
