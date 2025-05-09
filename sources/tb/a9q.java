package tb;

import android.app.Activity;
import android.content.Context;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class a9q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static a f15617a;
    public static WeakReference<Activity> b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a extends Pair<WeakReference<Activity>, Integer> {
        static {
            t2o.a(817889359);
        }

        public a(WeakReference<Activity> weakReference, Integer num) {
            super(weakReference, num);
        }
    }

    static {
        t2o.a(817889358);
    }

    public static synchronized void a() {
        Object obj;
        synchronized (a9q.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("45e2fd9b", new Object[0]);
                return;
            }
            a aVar = f15617a;
            if (aVar != null && (obj = ((Pair) aVar).first) != null && ((WeakReference) obj).get() != null) {
                try {
                    ((Activity) ((WeakReference) ((Pair) f15617a).first).get()).getWindow().setSoftInputMode(((Integer) ((Pair) f15617a).second).intValue());
                    f15617a = null;
                } catch (Exception e) {
                    e.printStackTrace();
                    f15617a = null;
                }
            }
        }
    }

    public static synchronized void b(Context context) {
        synchronized (a9q.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("942977de", new Object[]{context});
                return;
            }
            Activity a2 = dwv.a(context);
            if (a2 != null) {
                b = new WeakReference<>(a2);
            }
        }
    }

    public static synchronized void c() {
        Activity activity;
        int i;
        synchronized (a9q.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9611383", new Object[0]);
                return;
            }
            WeakReference<Activity> weakReference = b;
            if (weakReference != null && weakReference.get() != null) {
                try {
                    activity = b.get();
                    i = activity.getWindow().getAttributes().softInputMode;
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (i != 48) {
                    f15617a = new a(b, Integer.valueOf(i));
                    activity.getWindow().setSoftInputMode(48);
                }
            }
        }
    }
}
