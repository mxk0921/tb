package tb;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;
import tb.ck;
import tb.u8r;
import tb.vm0;
import tb.w7r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class r58 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f27117a = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements InvocationHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f27118a;

        public a(e eVar) {
            this.f27118a = eVar;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("8a05e524", new Object[]{this, obj, method, objArr});
            }
            return Boolean.valueOf(((u8r) this.f27118a).O0((View) objArr[0], (String) objArr[1]));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface d {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface e {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface f {
    }

    static {
        t2o.a(708837609);
    }

    public static boolean a(Object obj, Object obj2) {
        try {
            Object invoke = obj.getClass().getSuperclass().getMethod("bindData", Object.class).invoke(obj, obj2);
            if (invoke instanceof Boolean) {
                return ((Boolean) invoke).booleanValue();
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            b("bindData", Log.getStackTraceString(th));
            return false;
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbdb524d", new Object[]{str, str2});
            return;
        }
        vm0.d(vm0.a.a("nativeRenderMonitor").tag(str).message(str2).sampling(1.0f));
        rbb g = ck.g();
        g.e(str + " ：" + str2, ck.b.b().i("AURA/nativeRender").a());
    }

    public static Object e(Object obj, String str, String str2) {
        try {
            return obj.getClass().getMethod("getViewHolder", String.class, String.class).invoke(obj, str, str2);
        } catch (Throwable th) {
            th.printStackTrace();
            b("getViewHolder", Log.getStackTraceString(th));
            return null;
        }
    }

    public static View d(Object obj) {
        try {
            Object invoke = obj.getClass().getMethod("makeView", new Class[0]).invoke(obj, new Object[0]);
            if (invoke instanceof View) {
                return (View) invoke;
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            b("getView", Log.getStackTraceString(th));
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c implements InvocationHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f27120a;

        public c(f fVar) {
            this.f27120a = fVar;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("8a05e524", new Object[]{this, obj, method, objArr});
            }
            if (!method.getName().equals("onLog")) {
                return null;
            }
            ((w7r.a) this.f27120a).a((String) objArr[0], (String) objArr[1], (String) objArr[2]);
            return null;
        }
    }

    public static void i(Object obj, d dVar) {
        try {
            Class<?> cls = Class.forName("com.taobao.android.trade.uikit.core.holder.base.OnEventListener");
            obj.getClass().getMethod("setOnClickListener", cls).invoke(obj, Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new b(dVar)));
        } catch (Throwable th) {
            th.printStackTrace();
            b("setEventListener", Log.getStackTraceString(th));
        }
    }

    public static void j(Object obj, e eVar) {
        try {
            Class<?> cls = Class.forName("com.taobao.android.trade.uikit.provider.TradeImageView$ImageViewRenderListener");
            obj.getClass().getMethod("setImageViewRenderListener", cls).invoke(obj, Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(eVar)));
        } catch (Throwable th) {
            th.printStackTrace();
            b("setEventListener", Log.getStackTraceString(th));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements InvocationHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f27119a;

        public b(d dVar) {
            this.f27119a = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String[] strArr;
            Map map;
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("8a05e524", new Object[]{this, obj, method, objArr});
            }
            String str2 = (String) objArr[0];
            if ("onReceiveEvent".equals(method.getName())) {
                Object obj2 = objArr[1];
                str = obj2 != null ? (String) obj2 : null;
                Object obj3 = objArr[2];
                strArr = obj3 != null ? (String[]) obj3 : null;
                map = null;
            } else if ("onCustomEvent".equals(method.getName())) {
                Object obj4 = objArr[1];
                map = obj4 != null ? (Map) obj4 : null;
                Object obj5 = objArr[2];
                str = obj5 != null ? (String) obj5 : null;
                Object obj6 = objArr[3];
                strArr = obj6 != null ? (String[]) obj6 : null;
            } else {
                map = null;
                strArr = null;
                str = null;
            }
            ((u8r.a) this.f27119a).a(str2, map, str, strArr);
            return null;
        }
    }

    public static Object c(Context context) {
        try {
            return Class.forName("com.taobao.android.trade.uikit.TradeRenderEngine").getConstructor(Context.class, String.class).newInstance(context, "purchase");
        } catch (Throwable th) {
            th.printStackTrace();
            b("getTradeRenderEngine", Log.getStackTraceString(th));
            return null;
        }
    }

    public static Object f(JSONObject jSONObject, JSONObject jSONObject2, String str, String str2) {
        try {
            Class<?> cls = Class.forName("com.taobao.android.trade.uikit.core.model.BuyViewModel");
            Object newInstance = cls.getConstructor(JSONObject.class, JSONObject.class).newInstance(jSONObject, jSONObject2);
            if (!TextUtils.isEmpty(str)) {
                cls.getMethod("setComponentKey", String.class).invoke(newInstance, str);
            }
            if (!TextUtils.isEmpty(str2)) {
                cls.getMethod("setDxType", String.class).invoke(newInstance, str2);
            }
            return newInstance;
        } catch (Throwable th) {
            th.printStackTrace();
            b("getViewModel", Log.getStackTraceString(th));
            return null;
        }
    }

    public static void g(Context context) {
        if (!f27117a) {
            try {
                Object newInstance = Class.forName("com.taobao.android.trade.uikit.purchase.AsyncRenderWorkTask").getConstructor(Context.class, String.class).newInstance(context, "purchase");
                if (newInstance instanceof Runnable) {
                    dn.h((Runnable) newInstance);
                    f27117a = true;
                }
            } catch (Throwable th) {
                th.printStackTrace();
                b("preloadViewHolder", Log.getStackTraceString(th));
            }
        }
    }

    public static void h(Context context) {
        try {
            Class<?> cls = Class.forName("com.taobao.android.trade.uikit.TradeRenderEngine");
            cls.getMethod("release", new Class[0]).invoke(cls.getConstructor(Context.class, String.class).newInstance(context, "purchase"), new Object[0]);
            f27117a = false;
        } catch (Throwable th) {
            th.printStackTrace();
            b("releaseViewHolder", Log.getStackTraceString(th));
        }
    }

    public static void k(f fVar, boolean z) {
        try {
            Class<?> cls = Class.forName("com.taobao.android.trade.uikit.utils.TradeUnifyLog");
            Class<?> cls2 = Class.forName("com.taobao.android.trade.uikit.utils.TradeUnifyLog$LogCallback");
            cls.getDeclaredMethod("addLogCallback", String.class, cls2).invoke(null, "purchase", Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new c(fVar)));
            Field declaredField = cls.getDeclaredField("sUseAndroidLogForTest");
            declaredField.setAccessible(true);
            declaredField.set(null, Boolean.valueOf(z));
        } catch (Throwable th) {
            th.printStackTrace();
            b("preloadViewHolder", Log.getStackTraceString(th));
        }
    }
}
