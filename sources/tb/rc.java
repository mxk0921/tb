package tb;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.os.SystemClock;
import android.view.View;
import com.alibaba.analytics.AnalyticsMgr;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class rc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f27272a = rc.class.getSimpleName();
    public static boolean b = true;
    public static final Set<Integer> c = new HashSet();
    public static boolean d = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                sj9.D(rc.a() + "_refreshUTIfNeeded");
                g3v.getInstance().saveCacheDataToLocal();
                Thread.sleep(500L);
                g3v.getInstance().dispatchLocalHits();
            } catch (Throwable th) {
                sj9.D(rc.a() + "_refreshUTIfNeeded " + th.getMessage());
            }
        }
    }

    static {
        t2o.a(779093332);
    }

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7022ea09", new Object[0]);
        }
        return f27272a;
    }

    public static void b(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5597f2d5", new Object[]{activity, str});
        } else {
            vxm.b.a(activity).a(str, Long.valueOf(SystemClock.uptimeMillis()));
        }
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e3450eb", new Object[]{str});
            return;
        }
        sj9.D(f27272a + "_notifyWaitLockedAnalyticsMgr");
        AnalyticsMgr.R();
    }

    public static void e(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d114fed3", new Object[]{view});
        } else if (view != null) {
            view.setTag(dgw.APM_VIEW_TOKEN, dgw.APM_VIEW_INVALID);
            ((HashSet) c).add(Integer.valueOf(view.getId()));
        }
    }

    public static void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8eed8b43", new Object[]{context});
        } else if (pvs.i() && !d && (context instanceof Activity)) {
            Activity activity = (Activity) context;
            if (activity.getLocalClassName().contains("TaoLiveVideoActivity")) {
                snl.f28161a.f(activity).d().onStage("videoFirstFrameTime", SystemClock.uptimeMillis());
                d = true;
                wng.d(context);
            }
        }
    }

    public static void f(Context context, ux9 ux9Var) {
        View findViewById;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcfec0c", new Object[]{context, ux9Var});
            return;
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            View findViewById2 = activity.findViewById(R.id.taolive_root_view);
            if (findViewById2 != null) {
                findViewById2.setTag(dgw.APM_VIEW_TOKEN, dgw.APM_VIEW_VALID);
            }
            Iterator it = ((HashSet) c).iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                if (!(num == null || num.intValue() == 0 || (findViewById = activity.findViewById(num.intValue())) == null)) {
                    findViewById.setTag(dgw.APM_VIEW_TOKEN, dgw.APM_VIEW_VALID);
                }
            }
            ((HashSet) c).clear();
        }
        if (sj9.v()) {
            if (ux9Var != null) {
                vxm.b.e().a("liveToken", ux9Var.p());
            }
            vxm vxmVar = vxm.b;
            vxmVar.e().a("taolive_firstframe_time", Long.valueOf(SystemClock.uptimeMillis()));
            vxmVar.e().a("taolive_firstframe_isAfcColdContext", Boolean.valueOf(sj9.s()));
        }
        sj9.A(context, false);
        if (b) {
            b = false;
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new a());
        }
    }
}
