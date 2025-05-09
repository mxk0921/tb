package tb;

import android.content.Context;
import android.util.Log;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.platform.JSGetter;
import com.taobao.android.weex_framework.platform.JSMethod;
import com.taobao.android.weex_framework.platform.JSSetter;
import com.taobao.android.weex_framework.platform.WXComponentProp;
import com.taobao.media.MediaConstant;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class exp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Class<?> f18875a;
    public final Map<String, ati> b;
    public final Map<String, ati> c;
    public final Map<String, ati> d;
    public final Map<String, ati> e;
    public final kb4 f;
    public boolean g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements kb4 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Class<?> f18876a;
        public Constructor<?> b;

        static {
            t2o.a(982516206);
            t2o.a(982516200);
        }

        public a(Class<?> cls) {
            this.f18876a = cls;
        }

        public Object a(Context context, int i) {
            if (this.b == null) {
                b();
            }
            try {
                return this.b.newInstance(context, Integer.valueOf(i));
            } catch (IllegalAccessException e) {
                Log.e("SimpleComponentHolder", "create", e);
                return null;
            } catch (InstantiationException e2) {
                Log.e("SimpleComponentHolder", "create", e2);
                return null;
            } catch (InvocationTargetException e3) {
                Log.e("SimpleComponentHolder", "create", e3);
                return null;
            }
        }

        public final void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fcf499bb", new Object[]{this});
                return;
            }
            try {
                this.b = this.f18876a.getConstructor(Context.class, Integer.TYPE);
            } catch (NoSuchMethodException unused) {
                throw new RuntimeException("Can't find constructor of component");
            }
        }
    }

    static {
        t2o.a(982516205);
    }

    public exp(Class<?> cls) {
        this(cls, new a(cls));
    }

    public synchronized Object a(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("b44ecf9f", new Object[]{this, context, new Integer(i)});
        }
        return ((a) this.f).a(context, i);
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1f4682b3", new Object[]{this});
        }
        if (!this.g) {
            h();
        }
        return i(((HashMap) this.c).keySet());
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ce048b28", new Object[]{this});
        }
        if (!this.g) {
            h();
        }
        return i(((HashMap) this.e).keySet());
    }

    public ati d(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ati) ipChange.ipc$dispatch("45e4e865", new Object[]{this, str, new Boolean(z)});
        }
        if (!this.g) {
            h();
        }
        if (((HashMap) this.c).containsKey(str)) {
            return (ati) ((HashMap) this.c).get(str);
        }
        if (z) {
            return (ati) ((HashMap) this.d).get(str);
        }
        return (ati) ((HashMap) this.e).get(str);
    }

    public ati e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ati) ipChange.ipc$dispatch("229eb2cc", new Object[]{this, str});
        }
        if (!this.g) {
            h();
        }
        return (ati) ((HashMap) this.b).get(str);
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ab81bc9c", new Object[]{this});
        }
        if (!this.g) {
            h();
        }
        return i(((HashMap) this.d).keySet());
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c16a340", new Object[]{this})).booleanValue();
        }
        if (!this.g) {
            h();
        }
        return ((HashMap) this.b).isEmpty();
    }

    public final String i(Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2775b6be", new Object[]{this, set});
        }
        try {
            JSONArray jSONArray = new JSONArray();
            jSONArray.addAll(set);
            return jSONArray.toJSONString();
        } catch (Exception unused) {
            return MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264;
        }
    }

    public exp(Class<?> cls, kb4 kb4Var) {
        this.g = false;
        this.f18875a = cls;
        this.f = kb4Var;
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = new HashMap();
    }

    public final void h() {
        Method[] methods;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11b22f3c", new Object[]{this});
        } else if (!this.g) {
            try {
                for (Method method : this.f18875a.getMethods()) {
                    try {
                        Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                        int length = declaredAnnotations.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                break;
                            }
                            Annotation annotation = declaredAnnotations[i];
                            if (annotation != null) {
                                if (annotation instanceof JSMethod) {
                                    JSMethod jSMethod = (JSMethod) annotation;
                                    String alias = jSMethod.alias();
                                    if ("_".equals(alias)) {
                                        alias = method.getName();
                                    }
                                    ((HashMap) this.c).put(alias, new ati(method, jSMethod.uiThread()));
                                } else if (annotation instanceof WXComponentProp) {
                                    ((HashMap) this.b).put(((WXComponentProp) annotation).name(), new ati(method, true));
                                    break;
                                } else if (annotation instanceof JSSetter) {
                                    ((HashMap) this.d).put(((JSSetter) annotation).name(), new ati(method, true));
                                    break;
                                } else if (annotation instanceof JSGetter) {
                                    ((HashMap) this.e).put(((JSGetter) annotation).name(), new ati(method, true));
                                    break;
                                }
                            }
                            i++;
                        }
                    } catch (ArrayIndexOutOfBoundsException | IncompatibleClassChangeError unused) {
                    }
                }
            } catch (Exception e) {
                Log.e("SimpleComponentHolder", "retrievalMethod", e);
            }
            this.g = true;
        }
    }
}
