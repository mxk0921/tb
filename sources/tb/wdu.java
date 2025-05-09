package tb;

import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.PersistableBundle;
import android.os.TransactionTooLargeException;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.AbsSavedState;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.android.SystemUtils;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.android.tcrash.UncaughtCrashHeader;
import com.taobao.android.tcrash.UncaughtCrashType;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class wdu implements w24 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final g1r f30644a;
    public final loq b;

    public wdu(g1r g1rVar, loq loqVar) {
        this.f30644a = g1rVar;
        this.b = loqVar;
    }

    public static /* synthetic */ Object b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("b66527ff", new Object[]{obj});
        }
        return c(obj);
    }

    public static <T> T c(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("b06b7cd0", new Object[]{obj});
        }
        return obj;
    }

    @Override // tb.w24
    public void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8140e3", new Object[]{this, application});
        } else if (Build.VERSION.SDK_INT == 31) {
            String str = Build.BRAND;
            if ((str.equalsIgnoreCase(SystemUtils.PRODUCT_HUAWEI) || str.equalsIgnoreCase(SystemUtils.PRODUCT_HONOR)) && this.f30644a.a("shouldActivityClientHook", this.b.a())) {
                try {
                    d();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements InvocationHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Object f30645a;

        public a(Object obj) {
            this.f30645a = obj;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            try {
                return method.invoke(this.f30645a, objArr);
            } catch (InvocationTargetException e) {
                Throwable targetException = e.getTargetException();
                if (!(targetException instanceof TransactionTooLargeException) || !"activityStopped".equals(method.getName())) {
                    throw targetException;
                }
                try {
                    IBinder iBinder = (IBinder) wdu.b(objArr[0]);
                    Bundle bundle = (Bundle) wdu.b(objArr[1]);
                    PersistableBundle persistableBundle = (PersistableBundle) wdu.b(objArr[2]);
                    CharSequence charSequence = (CharSequence) wdu.b(objArr[3]);
                    UncaughtCrashHeader crashCaughtHeaderByType = TCrashSDK.instance().getCrashCaughtHeaderByType(UncaughtCrashType.JAVA_ONLY);
                    if (bundle != null) {
                        crashCaughtHeaderByType.addHeaderInfo("activityStopped_icicle", a(bundle));
                    }
                    if (persistableBundle != null) {
                        crashCaughtHeaderByType.addHeaderInfo("activityStopped_persistentState", a(persistableBundle));
                    }
                    if (charSequence == null) {
                        return null;
                    }
                    crashCaughtHeaderByType.addHeaderInfo("activityStopped_description", charSequence.toString());
                    return null;
                } catch (Throwable th) {
                    xhh.c(th);
                    return null;
                }
            }
        }

        public final String a(Object obj) throws Throwable {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("e9f5e53e", new Object[]{this, obj});
            }
            StringBuilder sb = new StringBuilder();
            if (obj instanceof Bundle) {
                sb.append(a((Map) adk.i(obj).b("mMap").h()));
            } else if (obj instanceof Parcel) {
                sb.append("parcel:" + ((Parcel) obj).dataSize());
            } else if (obj instanceof Map) {
                sb.append("{");
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    sb.append(key + "=" + a(value) + ",");
                }
                sb.append("}");
            } else if (obj instanceof AbsSavedState) {
                Field[] b = gun.b(obj.getClass());
                sb.append("{");
                int length = b.length;
                while (i < length) {
                    Field field = b[i];
                    field.setAccessible(true);
                    sb.append(field.getName() + "=" + a(obj));
                    i++;
                }
                sb.append("}");
            } else if (obj instanceof SparseArray) {
                SparseArray sparseArray = (SparseArray) obj;
                int size = sparseArray.size();
                sb.append("[");
                while (i < size) {
                    String a2 = a(sparseArray.get(i));
                    if (!TextUtils.isEmpty(a2)) {
                        sb.append(a2 + ",");
                    }
                    i++;
                }
                sb.append("]");
            } else if (obj != null) {
                if (obj.getClass().isArray()) {
                    sb.append("[");
                    Object[] objArr = (Object[]) obj;
                    int length2 = objArr.length;
                    while (i < length2) {
                        Object obj2 = objArr[i];
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(a(obj2));
                        sb2.append(",");
                        sb.append(sb2.toString());
                        i++;
                    }
                    sb.append("]");
                } else {
                    sb.append(obj);
                }
            }
            return sb.toString();
        }
    }

    public final void d() throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0e7e5d5", new Object[]{this});
            return;
        }
        Object h = adk.i(adk.i(Class.forName("android.app.ActivityClient")).d("getInstance").h()).b("INTERFACE_SINGLETON").h();
        Object h2 = adk.i(h).b("mKnownInstance").h();
        Class<?> cls = Class.forName("android.app.IActivityClientController");
        if (h2 != null) {
            adk.i(h).f("mKnownInstance", Proxy.newProxyInstance(wdu.class.getClassLoader(), new Class[]{cls}, new a(h2)));
            return;
        }
        Class[] clsArr = {cls};
        adk.i(h).f("mInstance", Proxy.newProxyInstance(wdu.class.getClassLoader(), clsArr, new a(adk.i(h).d("get").h())));
    }
}
