package tb;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.SystemClock;
import android.util.SparseIntArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.android.launcher.bootstrap.tao.ability.dispatch.Dispatchers;
import java.lang.reflect.Field;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.ra;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class fhj implements Handler.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ATmHNGNext";
    public static final SparseIntArray e;
    public static final SparseIntArray f;
    public static final AtomicBoolean g = new AtomicBoolean(false);
    public static Handler.Callback h;

    /* renamed from: a  reason: collision with root package name */
    public final Handler.Callback f19297a;
    public final Context b;
    public final igg c;
    public xq7 d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements ra.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f19298a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ igg c;

        public a(boolean z, Context context, igg iggVar) {
            this.f19298a = z;
            this.b = context;
            this.c = iggVar;
        }

        @Override // tb.ra.a
        public Handler.Callback a(Handler.Callback callback) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Handler.Callback) ipChange.ipc$dispatch("847de504", new Object[]{this, callback});
            }
            if (fhj.a().compareAndSet(false, true)) {
                fhj.c(callback);
            }
            if (this.f19298a) {
                callback = fhj.b();
            }
            Dispatchers.a("OriginCallback", String.valueOf(callback));
            return new fhj(callback, this.b, this.c, null);
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        e = sparseIntArray;
        sparseIntArray.put(113, 113);
        sparseIntArray.put(114, 114);
        sparseIntArray.put(115, 115);
        sparseIntArray.put(116, 116);
        sparseIntArray.put(121, 121);
        sparseIntArray.put(122, 122);
        sparseIntArray.put(ra.INSTALL_PROVIDER, ra.INSTALL_PROVIDER);
        sparseIntArray.put(134, 134);
        sparseIntArray.put(137, 137);
        sparseIntArray.put(100001, 100001);
        SparseIntArray clone = sparseIntArray.clone();
        f = clone;
        clone.put(100, 100);
        clone.put(101, 101);
        clone.put(102, 102);
        clone.put(103, 103);
        clone.put(104, 104);
        clone.put(105, 105);
        clone.put(106, 106);
        clone.put(107, 107);
        clone.put(108, 108);
        clone.put(109, 109);
        clone.put(112, 112);
        clone.put(118, 118);
        clone.put(125, 125);
        clone.put(126, 126);
        sparseIntArray.put(159, 159);
    }

    public /* synthetic */ fhj(Handler.Callback callback, Context context, igg iggVar, a aVar) {
        this(callback, context, iggVar);
    }

    public static /* synthetic */ AtomicBoolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("baff37f7", new Object[0]);
        }
        return g;
    }

    public static /* synthetic */ Handler.Callback b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler.Callback) ipChange.ipc$dispatch("64efed5f", new Object[0]);
        }
        return h;
    }

    public static /* synthetic */ Handler.Callback c(Handler.Callback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler.Callback) ipChange.ipc$dispatch("d88ff3e4", new Object[]{callback});
        }
        h = callback;
        return callback;
    }

    public static xhq d(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhq) ipChange.ipc$dispatch("7ab8935b", new Object[]{context, intent});
        }
        String packageName = context.getPackageName();
        return xhq.b(packageName, packageName, true, null, intent, false, null);
    }

    public static boolean l(Context context, igg iggVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("94280fd3", new Object[]{context, iggVar})).booleanValue();
        }
        return m(context, iggVar, false);
    }

    public static boolean m(Context context, igg iggVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0da9ce9", new Object[]{context, iggVar, new Boolean(z)})).booleanValue();
        }
        return ra.a(new a(z, context, iggVar));
    }

    public final boolean e(Message message) {
        Context context = this.b;
        xq7 xq7Var = this.d;
        if (xq7Var != null && xq7Var.handleMessage(message)) {
            return true;
        }
        if (this.c.j()) {
            return false;
        }
        try {
            Field declaredField = Class.forName("android.app.servertransaction.ClientTransaction").getDeclaredField("mActivityCallbacks");
            declaredField.setAccessible(true);
            Field declaredField2 = Class.forName("android.app.servertransaction.LaunchActivityItem").getDeclaredField("mIntent");
            declaredField2.setAccessible(true);
            List list = (List) declaredField.get(message.obj);
            if (list != null && !list.isEmpty()) {
                for (Object obj : list) {
                    if ("android.app.servertransaction.LaunchActivityItem".equals(obj.getClass().getName())) {
                        return n(message, context, (Intent) declaredField2.get(obj));
                    }
                }
                return false;
            }
            return n(message, context, null);
        } catch (Throwable th) {
            whh.b(TAG, "error occurred when dealActivityMessagePOrAbove:", th);
            return n(message, context, null);
        }
    }

    public final boolean f(Message message) {
        Context context = this.b;
        xq7 xq7Var = this.d;
        if (xq7Var != null && xq7Var.handleMessage(message)) {
            return true;
        }
        if (this.c.j()) {
            return false;
        }
        try {
            Field declaredField = message.obj.getClass().getDeclaredField(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
            declaredField.setAccessible(true);
            return n(message, context, (Intent) declaredField.get(message.obj));
        } catch (Throwable th) {
            whh.b(TAG, "error occurred when dealActivityMessageUnderP:", th);
            return n(message, context, null);
        }
    }

    public final void g(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee1c0e8c", new Object[]{this, obj});
        } else if (!this.c.j()) {
            this.c.h(xhq.a(obj.toString()));
            whh.c(TAG, "publishContentProviders: " + obj);
        }
    }

    public final boolean h(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9bd3559", new Object[]{this, message})).booleanValue();
        }
        whh.a(TAG, "deal(what=" + message.what + ", when=" + message.getWhen() + f7l.BRACKET_END_STR);
        int i = message.what;
        if (i == 114 || i == 121 || i == 122) {
            return j(message, 0, i);
        }
        if (i == 115) {
            return j(message, 1, i);
        }
        if (i == 116) {
            return j(message, 2, i);
        }
        if (i == 113) {
            return i(message);
        }
        if (i == 145) {
            g(message.obj);
            return false;
        } else if (i == 100 && Build.VERSION.SDK_INT < 28) {
            return f(message);
        } else {
            if (i == 159 && Build.VERSION.SDK_INT >= 28) {
                return e(message);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                return k(message);
            }
            whh.a(TAG, "deal msg under 28, what=" + message.what);
            return k(message);
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        whh.a(TAG, "handle(what=" + message.what + ", when=" + message.getWhen() + f7l.BRACKET_END_STR);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28 && e.get(message.what) == 0) {
            Handler.Callback callback = this.f19297a;
            if (callback == null || !callback.handleMessage(message)) {
                return false;
            }
            return true;
        } else if (i < 28 && f.get(message.what) == 0) {
            Handler.Callback callback2 = this.f19297a;
            if (callback2 == null || !callback2.handleMessage(message)) {
                return false;
            }
            return true;
        } else if (h(message)) {
            return true;
        } else {
            Handler.Callback callback3 = this.f19297a;
            if (callback3 == null || !callback3.handleMessage(message)) {
                return false;
            }
            return true;
        }
    }

    public final boolean i(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a423916a", new Object[]{this, message})).booleanValue();
        }
        Object obj = message.obj;
        if (i7n.l(message)) {
            q(obj);
            return true;
        }
        q(obj);
        xq7 xq7Var = this.d;
        if (xq7Var != null && xq7Var.handleMessage(message)) {
            return true;
        }
        if (this.c.j()) {
            return false;
        }
        return o(message, Dispatchers.TYPE_RECEIVER, obj.toString());
    }

    public final boolean k(Message message) {
        String str;
        xhq xhqVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78cec147", new Object[]{this, message})).booleanValue();
        }
        xq7 xq7Var = this.d;
        if (xq7Var != null && xq7Var.handleMessage(message)) {
            return true;
        }
        if (this.c.j()) {
            return false;
        }
        if (message.what >= 100000) {
            if (message.obj == null) {
                message.obj = "Customized_" + message.what;
            }
            str = Dispatchers.TYPE_CUSTOMIZED;
        } else {
            str = Dispatchers.TYPE_ACTIVITY;
        }
        if (this.c instanceof yhq) {
            xhqVar = xhq.a(String.valueOf(message.obj));
        } else {
            xhqVar = null;
        }
        xq7 c = Dispatchers.c(message, str, this.c.b());
        this.d = c;
        Dispatchers.b(c);
        this.c.l(xhqVar, this.d);
        return this.d.b();
    }

    public final boolean n(Message message, Context context, Intent intent) {
        xhq xhqVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b0f8ae6", new Object[]{this, message, context, intent})).booleanValue();
        }
        if (this.c instanceof yhq) {
            xhqVar = d(context, intent);
        } else {
            xhqVar = null;
        }
        xq7 d = Dispatchers.d(message, Dispatchers.TYPE_ACTIVITY, this.c.b(), xhqVar);
        this.d = d;
        Dispatchers.b(d);
        this.c.l(xhqVar, this.d);
        return this.d.b();
    }

    public final boolean o(Message message, String str, String str2) {
        xhq xhqVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b44f95", new Object[]{this, message, str, str2})).booleanValue();
        }
        xq7 c = Dispatchers.c(message, str, this.c.b());
        this.d = c;
        Dispatchers.b(c);
        if (this.c instanceof yhq) {
            xhqVar = xhq.a(str2);
        } else {
            xhqVar = null;
        }
        this.c.l(xhqVar, this.d);
        return this.d.b();
    }

    public final void p(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff9152c5", new Object[]{this, obj});
        } else if (obj instanceof BroadcastReceiver.PendingResult) {
            try {
                ra.h((BroadcastReceiver.PendingResult) obj);
            } catch (Throwable th) {
                whh.b(TAG, "error occurred when finishReceiver: " + obj, th);
            }
            whh.a(TAG, "finishReceiver: " + obj);
        }
    }

    public final void q(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c341ba6", new Object[]{this, obj});
        } else if (Build.VERSION.SDK_INT >= 23) {
            p(obj);
        }
    }

    public fhj(Handler.Callback callback, Context context, igg iggVar) {
        this.f19297a = callback;
        this.b = context;
        this.c = iggVar;
    }

    public final int r(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d104c74e", new Object[]{this, obj})).intValue();
        }
        String obj2 = obj.toString();
        int indexOf = obj2.indexOf("startId=");
        if (indexOf == -1) {
            return 0;
        }
        int i = indexOf + 8;
        try {
            return Integer.parseInt(obj2.substring(i, obj2.indexOf(" ", i)));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public final void t(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4768341e", new Object[]{this, obj, new Integer(i), new Integer(i2)});
            return;
        }
        try {
            ra.i(ra.e(), obj, s(obj, i), i, i == 1 ? r(obj) : 0, i2);
            whh.c(TAG, "serviceDoneExecuting: " + obj);
        } catch (Throwable th) {
            whh.b(TAG, "error occurred when serviceDoneExecuting: " + obj, th);
        }
    }

    public final IBinder s(Object obj, int i) throws Throwable {
        if (i == 2) {
            return (IBinder) obj;
        }
        Field declaredField = obj.getClass().getDeclaredField("token");
        declaredField.setAccessible(true);
        return (IBinder) declaredField.get(obj);
    }

    public final boolean j(Message message, int i, int i2) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1ee5fbdc", new Object[]{this, message, new Integer(i), new Integer(i2)})).booleanValue();
        }
        Object obj2 = message.obj;
        if (i7n.l(message)) {
            whh.a(TAG, "current message is sensitive_reply, let's reply to AMS: " + message);
            t(obj2, i, i2);
            i7n.n(message);
            return true;
        }
        t(obj2, i, i2);
        if (i7n.k(message)) {
            long j = i7n.j(message);
            long i3 = i7n.i(message);
            long uptimeMillis = SystemClock.uptimeMillis();
            obj = obj2;
            long when = uptimeMillis - message.getWhen();
            whh.a(TAG, "{ reply=" + j + ",replied=" + i3 + ",now=" + uptimeMillis + ",saved=" + (uptimeMillis - i3) + "ms,duration=" + when + "ms } for msg=" + message);
        } else {
            obj = obj2;
        }
        xq7 xq7Var = this.d;
        if (xq7Var != null && xq7Var.handleMessage(message)) {
            return true;
        }
        if (!this.c.j()) {
            return o(message, Dispatchers.TYPE_SERVICE, obj.toString());
        }
        return false;
    }
}
