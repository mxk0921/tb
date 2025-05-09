package tb;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class dew extends ContextWrapper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<Context> f17765a;

    static {
        t2o.a(301989906);
    }

    public dew(Context context) {
        super(context.getApplicationContext());
        this.f17765a = new WeakReference<>(context);
    }

    public static /* synthetic */ Object ipc$super(dew dewVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2116008609:
                super.startActivity((Intent) objArr[0], (Bundle) objArr[1]);
                return null;
            case -427921124:
                super.startActivities((Intent[]) objArr[0]);
                return null;
            case 116272469:
                super.startActivity((Intent) objArr[0]);
                return null;
            case 922616583:
                return super.getResources();
            case 1111017016:
                super.startActivities((Intent[]) objArr[0], (Bundle) objArr[1]);
                return null;
            case 1984083782:
                return super.getTheme();
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/buy/asyncview/ViewContext");
        }
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f93b0529", new Object[]{this, context});
        } else {
            this.f17765a = new WeakReference<>(context);
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Resources) ipChange.ipc$dispatch("36fe0307", new Object[]{this});
        }
        WeakReference<Context> weakReference = this.f17765a;
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
        WeakReference<Context> weakReference = this.f17765a;
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
    public void startActivities(Intent[] intentArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e67e711c", new Object[]{this, intentArr});
            return;
        }
        WeakReference<Context> weakReference = this.f17765a;
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
        WeakReference<Context> weakReference = this.f17765a;
        Context context = weakReference != null ? weakReference.get() : null;
        if (context != null) {
            context.startActivity(intent);
        } else {
            super.startActivity(intent);
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void startActivities(Intent[] intentArr, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4238c638", new Object[]{this, intentArr, bundle});
            return;
        }
        WeakReference<Context> weakReference = this.f17765a;
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
        WeakReference<Context> weakReference = this.f17765a;
        Context context = weakReference != null ? weakReference.get() : null;
        if (context != null) {
            context.startActivity(intent, bundle);
        } else {
            super.startActivity(intent, bundle);
        }
    }
}
