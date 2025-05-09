package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import java.lang.reflect.Method;
import tb.zk9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class z8t {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Class f32606a;
    public static boolean b = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements zk9.i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ yko f32607a;

        public a(yko ykoVar) {
            this.f32607a = ykoVar;
        }

        @Override // tb.zk9.i
        public void onClassLoaded(Class<?> cls) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ad6f018", new Object[]{this, cls});
                return;
            }
            z8t.a(cls);
            z8t.b(this.f32607a);
        }

        @Override // tb.zk9.i
        public void onClassNotFound() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad9dd2ef", new Object[]{this});
            } else {
                z8t.c();
            }
        }
    }

    static {
        t2o.a(815792140);
    }

    public static /* synthetic */ Class a(Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("95470a91", new Object[]{cls});
        }
        f32606a = cls;
        return cls;
    }

    public static /* synthetic */ void b(yko ykoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2f75fc3", new Object[]{ykoVar});
        } else {
            e(ykoVar);
        }
    }

    public static /* synthetic */ void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26a27df9", new Object[0]);
        } else {
            f();
        }
    }

    public static void d(yko ykoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da42f7e2", new Object[]{ykoVar});
        } else if (f32606a == null) {
            try {
                zk9.b("com.taobao.taowise.extension.TaoWiseInit", new a(ykoVar));
            } catch (Throwable unused) {
            }
        }
    }

    public static void e(yko ykoVar) {
        try {
            Class cls = f32606a;
            if (cls != null) {
                Method method = cls.getMethod("init", yko.class);
                method.setAccessible(true);
                method.invoke(null, ykoVar);
            }
        } catch (Throwable unused) {
        }
    }

    public static void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4ce152f", new Object[0]);
        } else if (!b) {
            vcq.a(Globals.getApplication()).c(xcq.c().l("taowise_android_aar").n());
            b = true;
        }
    }
}
