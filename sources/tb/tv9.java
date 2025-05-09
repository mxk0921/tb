package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.asp.APreferencesManager;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.init.Launcher_InitAccs;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.agoo.TaobaoRegister;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class tv9 implements Application.ActivityLifecycleCallbacks {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_STATE_BACK = "ACTION_STATE_BACK";
    public static final String ACTION_STATE_FORE = "ACTION_STATE_FORE";
    public static final int STATE_BACK = 0;
    public static final int STATE_BACK_LIMIT = 3;
    public static final int STATE_FORE = 1;
    public static volatile tv9 g;
    public static ArrayList<b> h;
    public static ArrayList<c> i;
    public static Application j;
    public boolean b;
    public boolean e;
    public static final String f = tv9.class.getSimpleName();
    public static boolean k = false;

    /* renamed from: a  reason: collision with root package name */
    public int f28981a = 0;
    public int c = 0;
    public volatile Integer d = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f28982a;

        public a(b bVar) {
            this.f28982a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                tv9.e().add(this.f28982a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f28983a;
        private int b;
        private long c = j8l.o(tv9.f());

        static {
            t2o.a(343933234);
        }

        public b(String str, int i) {
            this.f28983a = str;
            this.b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            ALog.e(tv9.g(), "click report", "lastActiveTime", Long.valueOf(this.c), "currentActiveTime", Long.valueOf(currentTimeMillis));
            long j = this.c;
            if (j == 0 || UtilityImpl.isSameDay(j, currentTimeMillis)) {
                this.b |= 8;
            }
            TaobaoRegister.clickMessage(tv9.f(), this.f28983a, null, this.b, this.c);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface c {
        void a(Context context);

        void b(Context context);
    }

    static {
        t2o.a(343933232);
    }

    public tv9() {
        h = new ArrayList<>();
        i = new ArrayList<>();
    }

    public static /* synthetic */ ArrayList e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("ed9189d1", new Object[0]);
        }
        return h;
    }

    public static /* synthetic */ Application f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("57e7de87", new Object[0]);
        }
        return j;
    }

    public static /* synthetic */ String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("682607c7", new Object[0]);
        }
        return f;
    }

    public static tv9 h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tv9) ipChange.ipc$dispatch("3dd5f8d1", new Object[0]);
        }
        if (g == null) {
            synchronized (tv9.class) {
                try {
                    if (g == null) {
                        g = new tv9();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return g;
    }

    public static /* synthetic */ void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7f978d4", new Object[0]);
        } else {
            APreferencesManager.getSharedPreferences(j, Constants.SP_FILE_NAME, 0).edit().putInt(Constants.SP_KEY_MAIN_CREATED_PID, Process.myPid()).commit();
        }
    }

    public static /* synthetic */ void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37000e07", new Object[0]);
            return;
        }
        j8l.I(j, System.currentTimeMillis());
        if (!k) {
            j8l.L(j);
            j8l.M(j);
            k = true;
        }
    }

    public static /* synthetic */ void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7753809c", new Object[0]);
            return;
        }
        Iterator<c> it = i.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next != null) {
                next.b(j);
            }
        }
    }

    public static /* synthetic */ void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e95f7e67", new Object[0]);
            return;
        }
        Iterator<c> it = i.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next != null) {
                next.a(j);
            }
        }
    }

    public int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("830709d5", new Object[]{this})).intValue();
        }
        if (this.d == null) {
            return 0;
        }
        return this.d.intValue();
    }

    public void j(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b98506a8", new Object[]{this, application});
        } else if (j == null) {
            GlobalClientInfo.mContext = application;
            j = application;
            application.getPackageName();
            j.getPackageName();
            application.registerActivityLifecycleCallbacks(this);
        }
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8eaeebe9", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            return;
        }
        if (!this.e) {
            kf.f(new Runnable() { // from class: tb.qv9
                @Override // java.lang.Runnable
                public final void run() {
                    tv9.l();
                }
            });
        }
        this.e = true;
        int i2 = this.f28981a;
        if ((i2 & 1) != 1) {
            this.f28981a = i2 | 3;
        } else if ((i2 & 2) == 2) {
            this.f28981a = i2 & (-3);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            return;
        }
        if (this.b) {
            kf.f(new Runnable() { // from class: tb.rv9
                @Override // java.lang.Runnable
                public final void run() {
                    tv9.m();
                }
            });
        }
        this.b = false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        int i2;
        int i3 = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            return;
        }
        int i4 = this.c;
        this.c = i4 + 1;
        if (i4 == 0) {
            ALog.i(f, "onActivityStarted back to force", new Object[0]);
            this.b = true;
            this.d = 1;
            brt.b(new Runnable() { // from class: tb.sv9
                @Override // java.lang.Runnable
                public final void run() {
                    tv9.n();
                }
            });
        }
        if (this.b) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        if ((this.f28981a & 2) != 2) {
            i3 = 1;
        }
        int i5 = i3 | i2;
        if (activity != null && activity.getIntent() != null) {
            try {
                Intent intent = activity.getIntent();
                String stringExtra = intent.getStringExtra("AliAgooMsgID");
                if (!TextUtils.isEmpty(stringExtra)) {
                    ALog.i(f, "onActivityStarted isFromAgoo", new Object[0]);
                    intent.removeExtra("AliAgooMsgID");
                    b bVar = new b(stringExtra, i5);
                    if (Launcher_InitAccs.mIsInited) {
                        brt.b(bVar);
                    } else {
                        brt.h().execute(new a(bVar));
                    }
                }
            } catch (Exception e) {
                ALog.e(f, "onActivityStarted Error:", e, new Object[0]);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            return;
        }
        int max = Math.max(0, this.c - 1);
        this.c = max;
        if (max == 0) {
            this.d = 0;
            brt.b(new Runnable() { // from class: tb.pv9
                @Override // java.lang.Runnable
                public final void run() {
                    tv9.o();
                }
            });
        }
    }

    public void p(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15ece6ff", new Object[]{this, cVar});
        } else if (cVar != null) {
            i.add(cVar);
        }
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b11a1957", new Object[]{this});
            return;
        }
        ArrayList<b> arrayList = h;
        if (arrayList != null) {
            Iterator<b> it = arrayList.iterator();
            while (it.hasNext()) {
                brt.h().execute(it.next());
            }
            h.clear();
        }
    }
}
