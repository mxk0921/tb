package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.tao.log.TLog;
import java.lang.reflect.Method;
import tb.zk9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class uru {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static final uru c = new uru();

    /* renamed from: a  reason: collision with root package name */
    public final dwl f29576a = new dwl();
    public boolean b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(502268331);
        }

        public a() {
        }

        public final uru a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (uru) ipChange.ipc$dispatch("1ca288e7", new Object[]{this});
            }
            return uru.b();
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements zk9.i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.zk9.i
        public void onClassLoaded(Class<?> cls) {
            Class<?>[] declaredClasses;
            uru uruVar = uru.this;
            ckf.g(cls, "userContextCls");
            try {
                Method method = null;
                for (Class<?> cls2 : cls.getDeclaredClasses()) {
                    ckf.f(cls2, "cls");
                    Method[] declaredMethods = cls2.getDeclaredMethods();
                    ckf.f(declaredMethods, "cls.declaredMethods");
                    int length = declaredMethods.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            method = null;
                            break;
                        }
                        Method method2 = declaredMethods[i];
                        ckf.f(method2, AdvanceSetting.NETWORK_TYPE);
                        if (ckf.b(method2.getName(), "getInstance")) {
                            method = method2;
                            break;
                        }
                        i++;
                    }
                    if (method != null) {
                        break;
                    }
                }
                if (method != null) {
                    Object invoke = method.invoke(cls.getDeclaredField("Companion").get(null), new Object[0]);
                    cls.getDeclaredMethod("init", new Class[0]).invoke(invoke, new Object[0]);
                    Method declaredMethod = cls.getDeclaredMethod("getEventSender", new Class[0]);
                    dwl a2 = uru.a(uruVar);
                    Object invoke2 = declaredMethod.invoke(invoke, new Object[0]);
                    if (invoke2 != null) {
                        a2.b((x3c) invoke2);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.taobao.user.context.event.IEventSender");
                }
                uru.c(uruVar, "UserContext init failed. instanceMethod not found!");
            } catch (Exception e) {
                uru.c(uruVar, "UserContext int failed. " + e);
            }
        }

        @Override // tb.zk9.i
        public void onClassNotFound() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad9dd2ef", new Object[]{this});
            } else {
                uru.c(uru.this, "UserContext class not found");
            }
        }
    }

    static {
        t2o.a(502268330);
    }

    public static final /* synthetic */ dwl a(uru uruVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dwl) ipChange.ipc$dispatch("652f7358", new Object[]{uruVar});
        }
        return uruVar.f29576a;
    }

    public static final /* synthetic */ uru b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uru) ipChange.ipc$dispatch("ccfa9476", new Object[0]);
        }
        return c;
    }

    public static final /* synthetic */ void c(uru uruVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eff6138", new Object[]{uruVar, str});
        } else {
            uruVar.f(str);
        }
    }

    public final x3c d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3c) ipChange.ipc$dispatch("a2cd5879", new Object[]{this});
        }
        return this.f29576a;
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else if (!this.b) {
            this.b = true;
            zk9.b("com.taobao.user.context.UCCollectEntry", new b());
        }
    }

    public final void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dd52d5", new Object[]{this, str});
        } else {
            TLog.loge("UserContext", "UserContext", str);
        }
    }
}
