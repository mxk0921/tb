package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import kotlin.jvm.JvmStatic;
import tb.zk9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class wyn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final wyn INSTANCE = new wyn();
    public static final String TAG = "RemotePltWidgetCreator";

    /* renamed from: a  reason: collision with root package name */
    public static volatile Class<?> f31016a;
    public static Boolean b;
    public static boolean c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements zk9.i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.zk9.i
        public void onClassLoaded(Class<?> cls) {
            ckf.g(cls, "aClass");
            try {
                Method declaredMethod = cls.getDeclaredMethod("isWidgetEnable", new Class[0]);
                declaredMethod.setAccessible(true);
                IpChange ipChange = wyn.$ipChange;
                Object invoke = declaredMethod.invoke(null, new Object[0]);
                if (invoke != null) {
                    wyn.b((Boolean) invoke);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
            } catch (Exception e) {
                c4p.o("RemoteWidgetCreator", "调用 isWidgetEnable 方法失败", e);
                IpChange ipChange2 = wyn.$ipChange;
                wyn.b(Boolean.FALSE);
            }
        }

        @Override // tb.zk9.i
        public void onClassNotFound() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad9dd2ef", new Object[]{this});
            } else {
                c4p.n("RemoteWidgetCreator", "拍立淘AI组件类未获取到");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements zk9.i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g1a<Boolean, xhv> f31017a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(g1a<? super Boolean, xhv> g1aVar) {
            this.f31017a = g1aVar;
        }

        @Override // tb.zk9.i
        public void onClassLoaded(Class<?> cls) {
            Object invoke;
            ckf.g(cls, "aClass");
            boolean z = false;
            try {
                Method declaredMethod = cls.getDeclaredMethod("isWidgetEnable", new Class[0]);
                declaredMethod.setAccessible(true);
                invoke = declaredMethod.invoke(null, new Object[0]);
            } catch (Exception e) {
                c4p.o("RemoteWidgetCreator", "调用 isWidgetEnable 方法失败", e);
            }
            if (invoke != null) {
                z = ((Boolean) invoke).booleanValue();
                IpChange ipChange = wyn.$ipChange;
                wyn.b(Boolean.valueOf(z));
                this.f31017a.invoke(Boolean.valueOf(z));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
        }

        @Override // tb.zk9.i
        public void onClassNotFound() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad9dd2ef", new Object[]{this});
            } else {
                c4p.n("RemoteWidgetCreator", "拍立淘AI组件类未获取到");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c implements zk9.i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.zk9.i
        public void onClassLoaded(Class<?> cls) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ad6f018", new Object[]{this, cls});
                return;
            }
            ckf.g(cls, "aClass");
            wyn.a(cls);
            l53.Companion.l(true);
        }

        @Override // tb.zk9.i
        public void onClassNotFound() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad9dd2ef", new Object[]{this});
            } else {
                c4p.n("RemoteWidgetCreator", "新镜头页类未获取到");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class d implements zk9.i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.zk9.i
        public void onClassNotFound() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad9dd2ef", new Object[]{this});
            } else {
                c4p.n(wyn.TAG, "视频搜索结果页加载失败");
            }
        }

        @Override // tb.zk9.i
        public void onClassLoaded(Class<?> cls) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ad6f018", new Object[]{this, cls});
                return;
            }
            ckf.g(cls, "aClass");
            wyn.f(true);
            c4p.n(wyn.TAG, "视频搜索结果页加载成功");
        }
    }

    static {
        t2o.a(481297645);
    }

    public static final /* synthetic */ void a(Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8893337e", new Object[]{cls});
        } else {
            f31016a = cls;
        }
    }

    public static final /* synthetic */ void b(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78494979", new Object[]{bool});
        } else {
            b = bool;
        }
    }

    @JvmStatic
    public static final Boolean c(g1a<? super Boolean, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("d7e4ac93", new Object[]{g1aVar});
        }
        ckf.g(g1aVar, "onLoadEnd");
        if (!lg4.o()) {
            return Boolean.TRUE;
        }
        Boolean bool = b;
        if (bool != null) {
            return bool;
        }
        try {
            zk9.b("com.taobao.taowise.plt.PltAIWidgetSwitch", new b(g1aVar));
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @JvmStatic
    public static final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2ecc6d4", new Object[0])).booleanValue();
        }
        if (!lg4.o()) {
            return true;
        }
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            zk9.b("com.taobao.taowise.plt.PltAIWidgetSwitch", new a());
        } catch (Throwable unused) {
        }
        return false;
    }

    public static final /* synthetic */ void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("566a5b09", new Object[]{new Boolean(z)});
        } else {
            c = z;
        }
    }

    public final boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78cc90fb", new Object[]{this})).booleanValue();
        }
        if (c) {
            return true;
        }
        try {
            zk9.b("com.etao.feimagesearch.capture.v3.CaptureV3Controller", new d());
        } catch (Throwable unused) {
        }
        return false;
    }

    public final boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da86cb17", new Object[]{this})).booleanValue();
        }
        return c;
    }

    @JvmStatic
    public static final xr1 e(Activity activity) {
        ckf.g(activity, "activity");
        Class<?> cls = f31016a;
        if (cls == null) {
            try {
                zk9.b("com.etao.feimagesearch.capture.v3.CaptureV3Controller", new c());
            } catch (Throwable unused) {
            }
            return null;
        }
        try {
            Object newInstance = cls.getDeclaredConstructor(Activity.class, Boolean.TYPE).newInstance(activity, Boolean.TRUE);
            if (newInstance != null) {
                return (xr1) newInstance;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.etao.feimagesearch.capture.dynamic.controller.BaseCaptureController");
        } catch (Throwable unused2) {
            return null;
        }
    }
}
