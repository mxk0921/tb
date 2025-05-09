package tb;

import android.view.KeyEvent;
import android.view.Window;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class u3g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final b Companion = new b(null);
    public static final Map<Integer, WeakReference<c>> d = new LinkedHashMap();

    /* renamed from: a  reason: collision with root package name */
    public boolean f29110a;
    public final Window b;
    public final d c;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bb\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltb/u3g$a;", "Landroid/view/Window$Callback;", "megaUtils_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface a extends Window.Callback {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static abstract class c implements InvocationHandler {
        public static final /* synthetic */ a0g[] $$delegatedProperties;
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final mjn f29111a = ua7.INSTANCE.a();
        public final ArrayList<d> b = new ArrayList<>(1);

        static {
            MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(c.class, "windowHash", "getWindowHash()I", 0);
            dun.f(mutablePropertyReference1Impl);
            $$delegatedProperties = new a0g[]{mutablePropertyReference1Impl};
        }

        public final ArrayList<d> a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArrayList) ipChange.ipc$dispatch("2289576a", new Object[]{this});
            }
            return this.b;
        }

        public final int b() {
            Object b;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                b = ipChange.ipc$dispatch("1c5e2b8e", new Object[]{this});
            } else {
                b = ((a8k) this.f29111a).b(this, $$delegatedProperties[0]);
            }
            return ((Number) b).intValue();
        }

        public final void c(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a63e543c", new Object[]{this, new Integer(i)});
            } else {
                ((a8k) this.f29111a).a(this, $$delegatedProperties[0], Integer.valueOf(i));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface d {
        boolean dispatchKeyEvent(KeyEvent keyEvent);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class e extends c {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Window.Callback c;

        public e(Window.Callback callback) {
            this.c = callback;
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/megautils/KeyHooker$startListening$1");
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            return super.equals(obj);
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            ckf.g(obj, pg1.ATOM_proxy);
            ckf.g(method, "method");
            if (ckf.b(method.getName(), "dispatchKeyEvent")) {
                KeyEvent keyEvent = null;
                KeyEvent keyEvent2 = objArr != null ? objArr[0] : null;
                if (keyEvent2 instanceof KeyEvent) {
                    keyEvent = keyEvent2;
                }
                KeyEvent keyEvent3 = keyEvent;
                if (keyEvent3 != null) {
                    for (d dVar : i04.q0(a())) {
                        if (dVar.dispatchKeyEvent(keyEvent3)) {
                            return Boolean.TRUE;
                        }
                    }
                }
            } else if (ckf.b(method.getName(), "onDetachedFromWindow")) {
                u3g.a().remove(Integer.valueOf(b()));
            }
            Window.Callback callback = this.c;
            if (objArr != null) {
                return method.invoke(callback, Arrays.copyOf(objArr, objArr.length));
            }
            return method.invoke(callback, new Object[0]);
        }
    }

    public u3g(Window window, d dVar) {
        ckf.g(window, pg1.ATOM_EXT_window);
        ckf.g(dVar, DataReceiveMonitor.CB_LISTENER);
        this.b = window;
        this.c = dVar;
    }

    public static final /* synthetic */ Map a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d853a6d7", new Object[0]);
        }
        return d;
    }

    public final void b() {
        c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf66aa80", new Object[]{this});
        } else if (!this.f29110a) {
            Window.Callback callback = this.b.getCallback();
            Map<Integer, WeakReference<c>> map = d;
            WeakReference weakReference = (WeakReference) ((LinkedHashMap) map).get(Integer.valueOf(this.b.hashCode()));
            if (weakReference != null) {
                cVar = (c) weakReference.get();
            } else {
                cVar = null;
            }
            if (cVar == null) {
                cVar = new e(callback);
                cVar.c(this.b.hashCode());
            }
            cVar.a().add(this.c);
            if (!(callback instanceof a)) {
                Object newProxyInstance = Proxy.newProxyInstance(u3g.class.getClassLoader(), new Class[]{a.class}, cVar);
                Window window = this.b;
                if (newProxyInstance != null) {
                    window.setCallback((Window.Callback) newProxyInstance);
                    map.put(Integer.valueOf(cVar.b()), new WeakReference<>(cVar));
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.Window.Callback");
                }
            }
            this.f29110a = true;
        }
    }

    public final void c() {
        WeakReference weakReference;
        c cVar;
        ArrayList<d> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
        } else if (this.f29110a && (weakReference = (WeakReference) ((LinkedHashMap) d).get(Integer.valueOf(this.b.hashCode()))) != null && (cVar = (c) weakReference.get()) != null && (a2 = cVar.a()) != null) {
            a2.remove(this.c);
        }
    }
}
