package tb;

import android.app.Activity;
import android.text.TextUtils;
import android.view.Choreographer;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.TSchedule;
import com.taobao.android.tschedule.TScheduleInitialize;
import java.util.ArrayList;
import java.util.List;
import tb.pms;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f21392a = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements pms.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: tb.ils$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class RunnableC0946a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0946a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    ils.this.h();
                }
            }
        }

        public a() {
        }

        @Override // tb.pms.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9d856e01", new Object[]{this});
            } else {
                bns.a().d(new RunnableC0946a());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements pms.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.pms.a
        public void a() {
            List<String> f;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9d856e01", new Object[]{this});
                return;
            }
            try {
                f = yms.f();
            } catch (Throwable unused) {
            }
            if (f != null && !f.isEmpty()) {
                for (String str : f) {
                    if (TSchedule.preload("idle", str, new Object[0])) {
                        dms.b("downgrade", str, "1", "TSchedule", "reload_result", null);
                    } else {
                        dms.a("downgrade", str, "1", "TSchedule", "reload_result", null, "TS_RELOAD_EMPTY", "");
                    }
                    yms.e(str);
                }
                ils.a(ils.this, false);
                return;
            }
            ils.a(ils.this, false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                new yls().b();
            }
        }
    }

    static {
        t2o.a(329253007);
    }

    public static /* synthetic */ boolean a(ils ilsVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db407048", new Object[]{ilsVar, new Boolean(z)})).booleanValue();
        }
        ilsVar.f21392a = z;
        return z;
    }

    public final List<String> b(String str) {
        List parseArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("35e2cb11", new Object[]{this, str});
        }
        String e = zms.e(str, "");
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(e) && (parseArray = JSON.parseArray(e, String.class)) != null) {
            arrayList.addAll(parseArray);
        }
        return arrayList;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("98d62a6e", new Object[]{this})).booleanValue();
        }
        if (!cns.g(TScheduleInitialize.b())) {
            return false;
        }
        return zms.i(TScheduleInitialize.b());
    }

    public void d(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            return;
        }
        try {
            if (c()) {
                String simpleName = activity.getClass().getSimpleName();
                if (!TextUtils.equals(simpleName, "TBMainActivity") && !TextUtils.equals(simpleName, "Welcome")) {
                    g(b(wms.CONFIG_KEY_ACTIVITIES), simpleName);
                }
            }
        } catch (Throwable th) {
            zdh.b("TS.IdleTrigger", "onActivityResumed(): resumePredict error", th);
        }
    }

    public void e(FragmentManager fragmentManager, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("953163f4", new Object[]{this, fragmentManager, fragment});
            return;
        }
        try {
            if (c()) {
                g(b(wms.CONFIG_KEY_FRAGMENTS), fragment.getClass().getSimpleName());
            }
        } catch (Throwable th) {
            zdh.b("TS.IdleTrigger", "onActivityResumed(): resumePredict error", th);
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7ee8187", new Object[]{this});
        } else if (!this.f21392a) {
            pms pmsVar = new pms();
            pmsVar.a(new b());
            Choreographer.getInstance().postFrameCallback(pmsVar);
        }
    }

    public void g(List<String> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd1e762e", new Object[]{this, list, str});
        } else if (!TextUtils.isEmpty(str) && list.contains(str)) {
            pms pmsVar = new pms();
            pmsVar.a(new a());
            Choreographer.getInstance().postFrameCallback(pmsVar);
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("616e7360", new Object[]{this});
        } else if (tms.b().c() && c()) {
            zdh.a("TS.IdleTrigger", "已是闲时环境，开始触发闲时任务");
            bns.a().d(new c());
        }
    }
}
