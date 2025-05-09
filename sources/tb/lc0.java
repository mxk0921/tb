package tb;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import tb.ra;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class lc0 implements Handler.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ATmHPrivacy";
    public static final SparseIntArray d;
    public static final SparseIntArray e;

    /* renamed from: a  reason: collision with root package name */
    public final Handler.Callback f23244a;
    public final Context b;
    public final Set<IBinder> c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements ra.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f23245a;

        public a(Context context) {
            this.f23245a = context;
        }

        @Override // tb.ra.a
        public Handler.Callback a(Handler.Callback callback) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Handler.Callback) ipChange.ipc$dispatch("847de504", new Object[]{this, callback});
            }
            return new lc0(callback, this.f23245a, null);
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        d = sparseIntArray;
        sparseIntArray.put(113, 113);
        sparseIntArray.put(114, 114);
        sparseIntArray.put(115, 115);
        sparseIntArray.put(116, 116);
        sparseIntArray.put(121, 121);
        sparseIntArray.put(122, 122);
        sparseIntArray.put(ra.INSTALL_PROVIDER, ra.INSTALL_PROVIDER);
        SparseIntArray clone = sparseIntArray.clone();
        e = clone;
        clone.put(100, 100);
        sparseIntArray.put(159, 159);
    }

    public /* synthetic */ lc0(Handler.Callback callback, Context context, a aVar) {
        this(callback, context);
    }

    public static boolean d(Context context, b8l b8lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("50d5f6e8", new Object[]{context, b8lVar})).booleanValue();
        }
        if (!TextUtils.equals(b8lVar.f16248a, b8lVar.b)) {
            return false;
        }
        return ra.a(new a(context));
    }

    public final boolean a(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("476aa96", new Object[]{this, message})).booleanValue();
        }
        whh.c(TAG, "checkExistMessage, what=" + message.what);
        int i = message.what;
        if (i == 114 || i == 121 || i == 122) {
            return b(message.obj, 0);
        }
        if (i == 115) {
            return b(message.obj, 1);
        }
        if (i == 116) {
            return b(message.obj, 2);
        }
        return false;
    }

    public final void e(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff9152c5", new Object[]{this, obj});
        } else if (obj instanceof BroadcastReceiver.PendingResult) {
            ((BroadcastReceiver.PendingResult) obj).finish();
            whh.c(TAG, "finishReceiver: " + obj);
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        whh.c(TAG, "handleMessage, what=" + message.what);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28 && d.get(message.what) == 0) {
            Handler.Callback callback = this.f23244a;
            if (callback == null || !callback.handleMessage(message)) {
                return false;
            }
            return true;
        } else if (i < 28 && e.get(message.what) == 0) {
            Handler.Callback callback2 = this.f23244a;
            if (callback2 == null || !callback2.handleMessage(message)) {
                return false;
            }
            return true;
        } else if (b2n.e(this.b) && !a(message)) {
            Handler.Callback callback3 = this.f23244a;
            if (callback3 == null || !callback3.handleMessage(message)) {
                return false;
            }
            return true;
        } else if (c(message)) {
            return true;
        } else {
            Handler.Callback callback4 = this.f23244a;
            if (callback4 == null || !callback4.handleMessage(message)) {
                return false;
            }
            return true;
        }
    }

    public final boolean j(Message message) {
        try {
            Field declaredField = message.obj.getClass().getDeclaredField(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
            declaredField.setAccessible(true);
            boolean i = i(this.b, (Intent) declaredField.get(message.obj));
            whh.c(TAG, "redirectPBelow, result: " + i);
            return i;
        } catch (Throwable th) {
            whh.b(TAG, "error occurred when redirectPBelow:", th);
            return false;
        }
    }

    public final boolean k(Message message) {
        Field declaredField;
        List list;
        try {
            Field declaredField2 = Class.forName("android.app.servertransaction.ClientTransaction").getDeclaredField("mActivityCallbacks");
            declaredField2.setAccessible(true);
            declaredField = Class.forName("android.app.servertransaction.LaunchActivityItem").getDeclaredField("mIntent");
            declaredField.setAccessible(true);
            list = (List) declaredField2.get(message.obj);
        } catch (Throwable th) {
            whh.b(TAG, "error occurred when redirectPAndAbove:", th);
        }
        if (list != null && !list.isEmpty()) {
            for (Object obj : list) {
                if ("android.app.servertransaction.LaunchActivityItem".equals(obj.getClass().getName())) {
                    boolean i = i(this.b, (Intent) declaredField.get(obj));
                    whh.c(TAG, "redirectPAndAbove, result: " + i);
                    return i;
                }
            }
            return false;
        }
        return false;
    }

    public lc0(Handler.Callback callback, Context context) {
        this.c = new HashSet();
        this.f23244a = callback;
        this.b = context;
    }

    public final int f(Object obj) {
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

    public static boolean i(Context context, Intent intent) {
        Intent launchIntentForPackage;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f413c401", new Object[]{context, intent})).booleanValue();
        }
        if (!(intent == null || intent.getComponent() == null)) {
            ComponentName component = intent.getComponent();
            if (!((cw6.b() && component.getClassName().startsWith("android.taobao.mulitenv.")) || (launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName())) == null || launchIntentForPackage.getComponent() == null)) {
                ComponentName component2 = launchIntentForPackage.getComponent();
                if (TextUtils.equals(component.getClassName(), component2.getClassName())) {
                    whh.c(TAG, "class name is equal, discard: " + component.getClassName());
                    return false;
                }
                Bundle bundleExtra = intent.getBundleExtra("params");
                if (bundleExtra == null || !bundleExtra.getBoolean("viewMode")) {
                    intent.setComponent(component2);
                    intent.setFlags(intent.getFlags() | AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
                    whh.c(TAG, "redirect from " + component + " to " + component2);
                    return true;
                }
                whh.c(TAG, "viewMode container, discard it: " + component.getClassName());
                return false;
            }
        }
        return false;
    }

    public final boolean b(Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e456408", new Object[]{this, obj, new Integer(i)})).booleanValue();
        }
        try {
            if (((HashSet) this.c).contains(g(obj, i))) {
                whh.a(TAG, "token dealt before");
                return true;
            }
        } catch (Throwable th) {
            whh.b(TAG, "error occurred when checkServiceExecuted: " + obj, th);
        }
        return false;
    }

    public final void l(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4768341e", new Object[]{this, obj, new Integer(i), new Integer(i2)});
            return;
        }
        try {
            Object e2 = ra.e();
            IBinder g = g(obj, i);
            ra.i(e2, obj, g, i, i == 1 ? f(obj) : 0, i2);
            whh.c(TAG, "serviceDoneExecuting: " + obj);
            boolean add = ((HashSet) this.c).add(g);
            whh.c(TAG, "token: " + g + " added: " + add);
        } catch (Throwable th) {
            whh.b(TAG, "error occurred when serviceDoneExecuting: " + obj, th);
        }
    }

    public final boolean c(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9bd3559", new Object[]{this, message})).booleanValue();
        }
        whh.a(TAG, "dealMessage, what=" + message.what);
        int i = message.what;
        if (i == 114 || i == 121 || i == 122) {
            l(message.obj, 0, i);
            return true;
        } else if (i == 115) {
            l(message.obj, 1, i);
            return true;
        } else if (i == 116) {
            l(message.obj, 2, i);
            return true;
        } else if (i == 113) {
            e(message.obj);
            return true;
        } else if (i == 145) {
            h(message.obj);
            return true;
        } else if (i == 100 && Build.VERSION.SDK_INT < 28) {
            boolean j = j(message);
            whh.a(TAG, "redirected: " + j + ", msg.what=" + message.what);
            return false;
        } else if (i != 159 || Build.VERSION.SDK_INT < 28) {
            whh.a(TAG, "dealMessage, unsupported message, what=" + message.what);
            return false;
        } else {
            boolean k = k(message);
            whh.a(TAG, "redirected: " + k + ", msg.what=" + message.what);
            return false;
        }
    }

    public final IBinder g(Object obj, int i) throws Throwable {
        if (i == 2) {
            return (IBinder) obj;
        }
        Field declaredField = obj.getClass().getDeclaredField("token");
        declaredField.setAccessible(true);
        return (IBinder) declaredField.get(obj);
    }

    public final void h(Object obj) {
        try {
            Object e2 = ra.e();
            Object b = ra.b();
            Method declaredMethod = Class.forName("android.app.IActivityManager").getDeclaredMethod("publishContentProviders", Class.forName(ProcessUtils.ACTIVITY_THREAD), List.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(e2, b, Collections.emptyList());
            whh.c(TAG, "publishContentProviders: " + obj);
        } catch (Throwable th) {
            whh.b(TAG, "error occurred when publishContentProviders: " + obj, th);
        }
    }
}
