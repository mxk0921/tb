package tb;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class l91 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public static String f23188a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(919601400);
        }

        public a() {
        }

        public final String a(Context context) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("904e852c", new Object[]{this, context});
            }
            ckf.g(context, "context");
            if (l91.a() == null) {
                try {
                    str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                    ckf.f(str, "context.packageManager.g…ckageName, 0).versionName");
                } catch (PackageManager.NameNotFoundException | Exception unused) {
                    str = "";
                }
                l91.b(str);
            }
            return l91.a();
        }

        public final boolean c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3a59fb54", new Object[]{this})).booleanValue();
            }
            Context d = spu.Companion.d();
            if (d == null || (d.getApplicationInfo().flags & 2) == 0) {
                return false;
            }
            return true;
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final boolean b(Context context) {
            ComponentName componentName;
            ComponentName componentName2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("77f4ae6", new Object[]{this, context})).booleanValue();
            }
            if (context != null) {
                try {
                    Object systemService = context.getSystemService("activity");
                    if (systemService != null) {
                        List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) systemService).getRunningTasks(1);
                        if (!(runningTasks == null || runningTasks.get(0) == null)) {
                            ActivityManager.RunningTaskInfo runningTaskInfo = runningTasks.get(0);
                            ckf.d(runningTaskInfo);
                            componentName = runningTaskInfo.topActivity;
                            if (componentName != null) {
                                ActivityManager.RunningTaskInfo runningTaskInfo2 = runningTasks.get(0);
                                ckf.d(runningTaskInfo2);
                                componentName2 = runningTaskInfo2.topActivity;
                                ckf.d(componentName2);
                                return TextUtils.equals(componentName2.getPackageName(), context.getPackageName());
                            }
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
                    }
                } catch (Exception unused) {
                }
            }
            return false;
        }
    }

    static {
        t2o.a(919601399);
    }

    public static final /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f02a0695", new Object[0]);
        }
        return f23188a;
    }

    public static final /* synthetic */ void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25e2ed81", new Object[]{str});
        } else {
            f23188a = str;
        }
    }
}
