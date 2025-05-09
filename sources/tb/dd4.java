package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.SparseArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class dd4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Object f17739a = new Object();
    public static final Map<Context, SparseArray<l1j>> b = new HashMap(4);
    public static final WeakHashMap<Context, Boolean> c = new WeakHashMap<>();
    public static b d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ l1j d;
        public final /* synthetic */ Context e;
        public final /* synthetic */ hvu f;

        public a(l1j l1jVar, Context context, hvu hvuVar) {
            this.d = l1jVar;
            this.e = context;
            this.f = hvuVar;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/pool/mount/ComponentsPools$1");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                this.d.b(this.e, this.f);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements Application.ActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(986710029);
        }

        public b() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            } else {
                dd4.f(activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            } else {
                dd4.g(activity);
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
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            }
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    static {
        t2o.a(986710027);
    }

    public static Object a(Context context, hvu hvuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("2be8f2c9", new Object[]{context, hvuVar});
        }
        l1j c2 = c(context, hvuVar);
        if (c2 == null) {
            return hvuVar.createMountContent(context);
        }
        return c2.a(context, hvuVar);
    }

    public static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db0c56e0", new Object[]{context});
        } else if (d == null) {
            d = new b(null);
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(d);
        }
    }

    public static l1j c(Context context, hvu hvuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l1j) ipChange.ipc$dispatch("81cec451", new Object[]{context, hvuVar});
        }
        if (hvuVar.poolSize() == 0) {
            return null;
        }
        synchronized (f17739a) {
            try {
                Map<Context, SparseArray<l1j>> map = b;
                SparseArray sparseArray = (SparseArray) ((HashMap) map).get(context);
                if (sparseArray == null) {
                    if (c.containsKey(vq4.a(context))) {
                        return null;
                    }
                    b(context);
                    sparseArray = new SparseArray();
                    ((HashMap) map).put(context, sparseArray);
                }
                l1j l1jVar = (l1j) sparseArray.get(hvuVar.getTypeId());
                if (l1jVar == null) {
                    l1jVar = hvuVar.onCreateMountContentPool();
                    sparseArray.put(hvuVar.getTypeId(), l1jVar);
                }
                return l1jVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean d(Context context, Context context2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b9ab2f9", new Object[]{context, context2})).booleanValue();
        }
        while (context instanceof ContextWrapper) {
            context = ((ContextWrapper) context).getBaseContext();
            if (context == context2) {
                return true;
            }
        }
        return false;
    }

    public static void e(Context context, hvu hvuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f31fc23e", new Object[]{context, hvuVar});
            return;
        }
        l1j c2 = c(context, hvuVar);
        if (c2 != null) {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new a(c2, context, hvuVar));
        }
    }

    public static void f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58052a29", new Object[]{context});
            return;
        }
        synchronized (f17739a) {
            try {
                if (((HashMap) b).containsKey(context)) {
                    throw new IllegalStateException("The MountContentPools has a reference to an activity that has just been created");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54cb5098", new Object[]{context});
            return;
        }
        synchronized (f17739a) {
            try {
                Map<Context, SparseArray<l1j>> map = b;
                SparseArray sparseArray = (SparseArray) ((HashMap) map).remove(context);
                if (sparseArray != null) {
                    sparseArray.clear();
                }
                Iterator it = ((HashMap) map).entrySet().iterator();
                while (it.hasNext()) {
                    if (d((Context) ((Map.Entry) it.next()).getKey(), context)) {
                        it.remove();
                    }
                }
                c.put(vq4.a(context), Boolean.TRUE);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void h(Context context, hvu hvuVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79ecbf54", new Object[]{context, hvuVar, obj});
            return;
        }
        l1j c2 = c(context, hvuVar);
        if (c2 != null) {
            c2.release(obj);
        }
    }
}
