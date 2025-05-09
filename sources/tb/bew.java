package tb;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class bew extends ContextWrapper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ViewContext";

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<Context> f16348a;

    static {
        t2o.a(444596635);
    }

    public bew(Context context) {
        super(context.getApplicationContext());
        this.f16348a = new WeakReference<>(context);
    }

    public static Activity a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("819516c", new Object[]{context});
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof bew)) {
            return null;
        }
        Context b = ((bew) context).b();
        if (b instanceof Activity) {
            return (Activity) b;
        }
        return null;
    }

    public static Context c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("ca7802fe", new Object[]{context});
        }
        if (context instanceof bew) {
            Context b = ((bew) context).b();
            if (b != null) {
                return b;
            }
            h36.b("ViewContext", "getRealContext but currContext is null");
        }
        return context;
    }

    public static /* synthetic */ Object ipc$super(bew bewVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2116008609:
                super.startActivity((Intent) objArr[0], (Bundle) objArr[1]);
                return null;
            case -1076054347:
                super.unregisterReceiver((BroadcastReceiver) objArr[0]);
                return null;
            case -427921124:
                super.startActivities((Intent[]) objArr[0]);
                return null;
            case 116272469:
                super.startActivity((Intent) objArr[0]);
                return null;
            case 922616583:
                return super.getResources();
            case 1070661222:
                return super.registerReceiver((BroadcastReceiver) objArr[0], (IntentFilter) objArr[1], (String) objArr[2], (Handler) objArr[3]);
            case 1106102624:
                return super.registerReceiver((BroadcastReceiver) objArr[0], (IntentFilter) objArr[1]);
            case 1111017016:
                super.startActivities((Intent[]) objArr[0], (Bundle) objArr[1]);
                return null;
            case 1984083782:
                return super.getTheme();
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/asyncrender/ViewContext");
        }
    }

    public Context b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("51c1976b", new Object[]{this});
        }
        WeakReference<Context> weakReference = this.f16348a;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f93b0529", new Object[]{this, context});
        } else {
            this.f16348a = new WeakReference<>(context);
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Resources) ipChange.ipc$dispatch("36fe0307", new Object[]{this});
        }
        WeakReference<Context> weakReference = this.f16348a;
        if (weakReference != null) {
            context = weakReference.get();
        } else {
            context = null;
        }
        if (context != null) {
            return context.getResources();
        }
        return super.getResources();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Resources.Theme) ipChange.ipc$dispatch("7642b746", new Object[]{this});
        }
        WeakReference<Context> weakReference = this.f16348a;
        if (weakReference != null) {
            context = weakReference.get();
        } else {
            context = null;
        }
        if (context != null) {
            return context.getTheme();
        }
        return super.getTheme();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("41edc960", new Object[]{this, broadcastReceiver, intentFilter});
        }
        try {
            Context b = b();
            if (b != null) {
                return b.registerReceiver(broadcastReceiver, intentFilter);
            }
            return super.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void startActivities(Intent[] intentArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e67e711c", new Object[]{this, intentArr});
            return;
        }
        WeakReference<Context> weakReference = this.f16348a;
        Context context = weakReference != null ? weakReference.get() : null;
        if (context != null) {
            context.startActivities(intentArr);
        } else {
            super.startActivities(intentArr);
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee2d55", new Object[]{this, intent});
            return;
        }
        WeakReference<Context> weakReference = this.f16348a;
        Context context = weakReference != null ? weakReference.get() : null;
        if (context != null) {
            context.startActivity(intent);
        } else {
            super.startActivity(intent);
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfdcb6b5", new Object[]{this, broadcastReceiver});
            return;
        }
        try {
            Context b = b();
            if (b != null) {
                b.unregisterReceiver(broadcastReceiver);
                return;
            }
        } catch (Throwable unused) {
        }
        try {
            super.unregisterReceiver(broadcastReceiver);
        } catch (Throwable unused2) {
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("3fd0fe66", new Object[]{this, broadcastReceiver, intentFilter, str, handler});
        }
        try {
            Context b = b();
            if (b != null) {
                return b.registerReceiver(broadcastReceiver, intentFilter, str, handler);
            }
            return super.registerReceiver(broadcastReceiver, intentFilter, str, handler);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void startActivities(Intent[] intentArr, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4238c638", new Object[]{this, intentArr, bundle});
            return;
        }
        WeakReference<Context> weakReference = this.f16348a;
        Context context = weakReference != null ? weakReference.get() : null;
        if (context != null) {
            context.startActivities(intentArr, bundle);
        } else {
            super.startActivities(intentArr, bundle);
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81e0455f", new Object[]{this, intent, bundle});
            return;
        }
        WeakReference<Context> weakReference = this.f16348a;
        Context context = weakReference != null ? weakReference.get() : null;
        if (context != null) {
            context.startActivity(intent, bundle);
        } else {
            super.startActivity(intent, bundle);
        }
    }
}
