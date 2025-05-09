package tb;

import android.app.Application;
import android.os.Build;
import android.os.IBinder;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.android.SystemUtils;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class i9b implements w24 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final g1r f21167a;
    public final loq b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements InvocationHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final IBinder f21168a;

        public a(IBinder iBinder) {
            this.f21168a = iBinder;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            try {
                if (method.getName().equals("linkToDeath")) {
                    return null;
                }
                return method.invoke(this.f21168a, objArr);
            } catch (InvocationTargetException e) {
                throw e.getTargetException();
            }
        }
    }

    public i9b(g1r g1rVar, loq loqVar) {
        this.f21167a = g1rVar;
        this.b = loqVar;
    }

    public static boolean c(g1r g1rVar, loq loqVar) {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90df3deb", new Object[]{g1rVar, loqVar})).booleanValue();
        }
        if (g1rVar.a("fixAllVersion", loqVar.a())) {
            String str = Build.BRAND;
            if (str.equalsIgnoreCase(SystemUtils.PRODUCT_HUAWEI) || str.equalsIgnoreCase(SystemUtils.PRODUCT_HONOR) || str.equalsIgnoreCase("HINOVA")) {
                z = true;
            } else {
                z = false;
            }
            int i = Build.VERSION.SDK_INT;
            if (i < 29 || i > 31) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z || !z2) {
                return false;
            }
            return true;
        }
        if (Build.VERSION.SDK_INT == 31) {
            String str2 = Build.BRAND;
            if (str2.equalsIgnoreCase(SystemUtils.PRODUCT_HUAWEI) || str2.equalsIgnoreCase(SystemUtils.PRODUCT_HONOR)) {
                return true;
            }
        }
        return false;
    }

    @Override // tb.w24
    public void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8140e3", new Object[]{this, application});
        } else if (c(this.f21167a, this.b) && this.f21167a.a("shouldDelITouchService", this.b.a())) {
            try {
                b(application);
                xhh.a("HwLeakedCommand", "succ");
            } catch (Throwable th) {
                xhh.c(th);
            }
        }
    }

    public final void b(Application application) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fa796aa", new Object[]{this, application});
            return;
        }
        adk i = adk.i(Class.forName("android.os.ServiceManager"));
        Map map = (Map) i.b("sCache").h();
        map.put("ITouchservice", (IBinder) Proxy.newProxyInstance(i9b.class.getClassLoader(), new Class[]{IBinder.class}, new a((IBinder) i.e("getService", new Class[]{String.class}, new Object[]{"ITouchservice"}).h())));
    }
}
