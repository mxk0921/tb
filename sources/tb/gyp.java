package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSProps;
import com.taobao.android.weex_framework.bridge.MUSThreadStrategy;
import com.taobao.android.weex_framework.ui.INode;
import com.taobao.android.weex_framework.ui.MUSMethod;
import com.taobao.android.weex_framework.ui.MUSNodeProp;
import com.taobao.media.MediaConstant;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class gyp<T extends INode> implements jpc<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public volatile Map<String, cwh<INode>> f20315a;
    public volatile Map<String, cwh<INode>> b;
    public volatile Map<String, cwh<INode>> c;
    public volatile boolean d;
    public final cvu<T> e;
    public final Class<? extends INode> f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b<T extends INode> implements cvu<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Constructor<? extends INode> f20316a;
        public final Class<? extends INode> b;

        static {
            t2o.a(982516237);
            t2o.a(982516239);
        }

        public final void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fcf499bb", new Object[]{this});
                return;
            }
            Class<? extends INode> cls = this.b;
            try {
                this.f20316a = cls.getConstructor(Integer.TYPE);
            } catch (NoSuchMethodException unused) {
                throw new RuntimeException(cls.getSimpleName().concat(" must have a default constructor"));
            }
        }

        @Override // tb.cvu
        public T d(MUSDKInstance mUSDKInstance, int i, MUSProps mUSProps, MUSProps mUSProps2) {
            if (this.f20316a == null) {
                c();
            }
            Constructor<? extends INode> constructor = this.f20316a;
            if (constructor == null) {
                return null;
            }
            try {
                return (T) ((INode) constructor.newInstance(Integer.valueOf(i)));
            } catch (Exception e) {
                dwh.i(e);
                return null;
            }
        }

        public b(Class<? extends INode> cls) {
            if (cls != null) {
                this.b = cls;
                return;
            }
            throw new IllegalArgumentException("node class can't be null");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c<F, S, T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final F f20317a;
        public final S b;
        public final T c;

        static {
            t2o.a(982516238);
        }

        public c(F f, S s, T t) {
            this.f20317a = f;
            this.b = s;
            this.c = t;
        }

        public static /* synthetic */ Object a(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("62ae29ac", new Object[]{cVar});
            }
            return cVar.f20317a;
        }

        public static /* synthetic */ Object b(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("1a9a972d", new Object[]{cVar});
            }
            return cVar.b;
        }

        public static /* synthetic */ Object c(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("d28704ae", new Object[]{cVar});
            }
            return cVar.c;
        }
    }

    static {
        t2o.a(982516235);
        t2o.a(982516220);
    }

    public gyp(Class<T> cls) {
        this(new b(cls), cls);
    }

    public static c<Map<String, cwh<INode>>, Map<String, cwh<INode>>, Map<String, cwh<INode>>> e(Class cls) {
        Method[] methods;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("8234c8", new Object[]{cls});
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        try {
            for (Method method : cls.getMethods()) {
                try {
                    g(method, method.getDeclaredAnnotations(), hashMap2, hashMap, hashMap3);
                } catch (ArrayIndexOutOfBoundsException | IncompatibleClassChangeError unused) {
                }
            }
        } catch (IndexOutOfBoundsException unused2) {
        } catch (Exception e) {
            dwh.i(e);
        }
        return new c<>(hashMap, hashMap2, hashMap3);
    }

    public static void g(Method method, Annotation[] annotationArr, Map<String, cwh<INode>> map, Map<String, cwh<INode>> map2, Map<String, cwh<INode>> map3) {
        MUSThreadStrategy mUSThreadStrategy;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dd6a587", new Object[]{method, annotationArr, map, map2, map3});
        } else if (annotationArr != null) {
            for (Annotation annotation : annotationArr) {
                if (annotation != null) {
                    if (annotation instanceof MUSNodeProp) {
                        MUSNodeProp mUSNodeProp = (MUSNodeProp) annotation;
                        String name = mUSNodeProp.name();
                        if (!mUSNodeProp.refresh()) {
                            map2.put(name, new fwh(method, MUSThreadStrategy.CURRENT, mUSNodeProp));
                            return;
                        } else {
                            map3.put(name, new fwh(method, MUSThreadStrategy.CURRENT, mUSNodeProp));
                            return;
                        }
                    } else if (annotation instanceof MUSMethod) {
                        MUSMethod mUSMethod = (MUSMethod) annotation;
                        String alias = mUSMethod.alias();
                        if (TextUtils.equals(mUSMethod.alias(), "_")) {
                            alias = method.getName();
                        }
                        if (mUSMethod.uiThread()) {
                            mUSThreadStrategy = MUSThreadStrategy.UI;
                        } else {
                            mUSThreadStrategy = MUSThreadStrategy.JS;
                        }
                        map.put(alias, new fwh(method, mUSThreadStrategy));
                        return;
                    }
                }
            }
        }
    }

    @Override // tb.jpc
    public cwh<T> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cwh) ipChange.ipc$dispatch("96ffd7cf", new Object[]{this, str});
        }
        f();
        return (cwh<T>) this.f20315a.get(str);
    }

    @Override // tb.jpc
    public cwh<T> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cwh) ipChange.ipc$dispatch("832a6d1", new Object[]{this, str});
        }
        f();
        return (cwh<T>) this.b.get(str);
    }

    @Override // tb.cvu
    public T d(MUSDKInstance mUSDKInstance, int i, MUSProps mUSProps, MUSProps mUSProps2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((INode) ipChange.ipc$dispatch("d10b47ed", new Object[]{this, mUSDKInstance, new Integer(i), mUSProps, mUSProps2}));
        }
        T d = this.e.d(mUSDKInstance, i, mUSProps, mUSProps2);
        d.bindNodeHolder(this);
        d.setInstance(mUSDKInstance);
        if (mUSProps != null) {
            d.updateStyles(mUSProps);
        }
        if (mUSProps2 != null) {
            d.updateAttrs(mUSProps2);
        }
        return d;
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("facb35f0", new Object[]{this});
        } else if (!this.d) {
            synchronized (this) {
                try {
                    if (!this.d) {
                        c<Map<String, cwh<INode>>, Map<String, cwh<INode>>, Map<String, cwh<INode>>> e = e(this.f);
                        this.f20315a = (Map) c.a(e);
                        this.c = (Map) c.b(e);
                        this.b = (Map) c.c(e);
                        this.d = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // tb.vtf
    public cwh<T> getMethodInvoker(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cwh) ipChange.ipc$dispatch("e339d05f", new Object[]{this, str});
        }
        f();
        return (cwh<T>) this.c.get(str);
    }

    @Override // tb.vtf
    public String getMethods() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("615a6cfd", new Object[]{this});
        }
        f();
        Set<String> keySet = this.c.keySet();
        try {
            JSONArray jSONArray = new JSONArray();
            jSONArray.addAll(keySet);
            return jSONArray.toJSONString();
        } catch (Exception e) {
            dwh.i(e);
            return MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264;
        }
    }

    public gyp(cvu<T> cvuVar, Class<T> cls) {
        this.e = cvuVar;
        this.f = cls;
    }
}
