package tb;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.JvmUncaughtCrashListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class jb0 implements JvmUncaughtCrashListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static int g;
    public static int h;

    /* renamed from: a  reason: collision with root package name */
    public final x0s f21877a;
    public final List<WeakReference<? extends Activity>> b = new ArrayList();
    public final long c = SystemClock.uptimeMillis();
    public long d = 0;
    public long e = 0;
    public int f = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Application.ActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
                return;
            }
            jb0.g++;
            jb0.h++;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
                return;
            }
            jb0.i(jb0.this).add(new WeakReference(activity));
            jb0.g--;
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
            }
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
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
                return;
            }
            jb0.c(jb0.this);
            if (jb0.b(jb0.this) == 1) {
                jb0.f(jb0.this, SystemClock.uptimeMillis());
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
                return;
            }
            if (jb0.b(jb0.this) > 0) {
                jb0.d(jb0.this);
            }
            if (jb0.b(jb0.this) == 0) {
                jb0 jb0Var = jb0.this;
                jb0.h(jb0Var, jb0.g(jb0Var) + (SystemClock.uptimeMillis() - jb0.e(jb0.this)));
                jb0.f(jb0.this, 0L);
            }
        }
    }

    public jb0(x0s x0sVar) {
        this.f21877a = x0sVar;
        j();
    }

    public static /* synthetic */ int b(jb0 jb0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b08fa486", new Object[]{jb0Var})).intValue();
        }
        return jb0Var.f;
    }

    public static /* synthetic */ int c(jb0 jb0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("17f85d7e", new Object[]{jb0Var})).intValue();
        }
        int i = jb0Var.f;
        jb0Var.f = 1 + i;
        return i;
    }

    public static /* synthetic */ int d(jb0 jb0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c1457147", new Object[]{jb0Var})).intValue();
        }
        int i = jb0Var.f;
        jb0Var.f = i - 1;
        return i;
    }

    public static /* synthetic */ long e(jb0 jb0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b6936fe6", new Object[]{jb0Var})).longValue();
        }
        return jb0Var.e;
    }

    public static /* synthetic */ long f(jb0 jb0Var, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d469e88", new Object[]{jb0Var, new Long(j)})).longValue();
        }
        jb0Var.e = j;
        return j;
    }

    public static /* synthetic */ long g(jb0 jb0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc973b45", new Object[]{jb0Var})).longValue();
        }
        return jb0Var.d;
    }

    public static /* synthetic */ long h(jb0 jb0Var, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f7bc3f09", new Object[]{jb0Var, new Long(j)})).longValue();
        }
        jb0Var.d = j;
        return j;
    }

    public static /* synthetic */ List i(jb0 jb0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("14069597", new Object[]{jb0Var});
        }
        return jb0Var.b;
    }

    public static /* synthetic */ int k(Map.Entry entry, Map.Entry entry2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("357f1ad3", new Object[]{entry, entry2})).intValue();
        }
        return ((Integer) entry2.getValue()).compareTo((Integer) entry.getValue());
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            this.f21877a.g().registerActivityLifecycleCallbacks(new a());
        }
    }

    @Override // com.taobao.android.tcrash.JvmUncaughtCrashListener
    public Map<String, Object> onJvmUncaughtCrash(Thread thread, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d9b5b942", new Object[]{this, thread, th});
        }
        HashMap hashMap = new HashMap();
        Iterator it = ((ArrayList) this.b).iterator();
        while (it.hasNext()) {
            Activity activity = (Activity) ((WeakReference) it.next()).get();
            if (activity != null) {
                String simpleName = activity.getClass().getSimpleName();
                Integer num = (Integer) hashMap.get(simpleName);
                if (num == null) {
                    hashMap.put(simpleName, 1);
                } else {
                    try {
                        hashMap.put(simpleName, Integer.valueOf(num.intValue() + 1));
                    } catch (Exception e) {
                        ehh.d(e);
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList(hashMap.entrySet());
        Collections.sort(arrayList, new Comparator() { // from class: tb.ib0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int k;
                k = jb0.k((Map.Entry) obj, (Map.Entry) obj2);
                return k;
            }
        });
        String obj = arrayList.toString();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("leaked activities", obj);
        hashMap2.put("launch duration", Long.valueOf(SystemClock.uptimeMillis() - this.c));
        if (this.e != 0) {
            hashMap2.put("visible duration", Long.valueOf(this.d + (SystemClock.uptimeMillis() - this.e)));
        } else {
            hashMap2.put("visible duration", Long.valueOf(this.d));
        }
        hashMap2.put("visit activity count", Integer.valueOf(((ArrayList) this.b).size()));
        hashMap2.put("activity stack depth", Integer.valueOf(g));
        return hashMap2;
    }
}
