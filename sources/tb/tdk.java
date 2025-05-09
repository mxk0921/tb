package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.BeanUtils;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class tdk<T> extends kdk<T> {
    public static final long E = ls9.a(JSON.DEFAULT_TYPE_KEY);
    public static final long F = ls9.a("message");
    public static final long G = ls9.a("detailMessage");
    public static final long H = ls9.a("localizedMessage");
    public static final long I = ls9.a("cause");
    public static final long J = ls9.a("stackTrace");
    public static final long K = ls9.a("suppressedExceptions");
    public final Constructor A;
    public final Constructor B;
    public final Constructor C;
    public final List<String[]> D;
    public final g79 x;
    public final List<Constructor> y;
    public final Constructor z;

    public static /* synthetic */ int E(Constructor constructor, Constructor constructor2) {
        int length = constructor.getParameterTypes().length;
        int length2 = constructor2.getParameterTypes().length;
        if (length < length2) {
            return 1;
        }
        if (length > length2) {
            return -1;
        }
        return 0;
    }

    public final Throwable C(String str, Throwable th) {
        try {
            Constructor constructor = this.B;
            if (constructor != null && th != null && str != null) {
                return (Throwable) constructor.newInstance(str, th);
            }
            Constructor constructor2 = this.A;
            if (constructor2 != null && str != null) {
                return (Throwable) constructor2.newInstance(str);
            }
            Constructor constructor3 = this.C;
            if (constructor3 != null && th != null) {
                return (Throwable) constructor3.newInstance(th);
            }
            if (constructor != null && (th != null || str != null)) {
                return (Throwable) constructor.newInstance(str, th);
            }
            Constructor constructor4 = this.z;
            if (constructor4 != null) {
                return (Throwable) constructor4.newInstance(new Object[0]);
            }
            if (constructor != null) {
                return (Throwable) constructor.newInstance(str, th);
            }
            if (constructor2 != null) {
                return (Throwable) constructor2.newInstance(str);
            }
            if (constructor3 != null) {
                return (Throwable) constructor3.newInstance(th);
            }
            return null;
        } catch (Throwable th2) {
            throw new JSONException("create Exception error, class " + this.f23271a.getName() + ", " + th2.getMessage(), th2);
        }
    }

    @Override // tb.kdk, tb.ldk, tb.jdk
    public T q(JSONReader jSONReader, Type type, Object obj, long j) {
        jdk jdkVar;
        if (jSONReader.W0() == -110) {
            boolean m1 = jSONReader.m1(j);
            JSONReader.c cVar = jSONReader.f2453a;
            if (m1 || cVar.d() != null) {
                jSONReader.t1();
                jdk h = cVar.h(jSONReader.T2());
                if (h == null) {
                    String U0 = jSONReader.U0();
                    jdk i = cVar.i(U0, null);
                    if (i != null) {
                        jdkVar = i;
                    } else {
                        throw new JSONException("auoType not support : " + U0 + ", offset " + jSONReader.T0());
                    }
                } else {
                    jdkVar = h;
                }
                return (T) jdkVar.q(jSONReader, type, obj, 0L);
            }
        }
        return o(jSONReader, type, obj, j);
    }

    public tdk(Class<T> cls, List<Constructor> list, g79... g79VarArr) {
        super(cls, null, cls.getName(), 0L, null, null, g79VarArr);
        int i;
        String[] strArr;
        this.y = list;
        Iterator<Constructor> it = list.iterator();
        Constructor constructor = null;
        Constructor constructor2 = null;
        Constructor constructor3 = null;
        Constructor constructor4 = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Constructor next = it.next();
            if (next != null && constructor3 == null) {
                int length = next.getParameterTypes().length;
                if (length == 0) {
                    constructor = next;
                } else {
                    Class<?>[] parameterTypes = next.getParameterTypes();
                    Class<?> cls2 = parameterTypes[0];
                    if (length == 1) {
                        if (cls2 == String.class) {
                            constructor2 = next;
                        } else if (Throwable.class.isAssignableFrom(cls2)) {
                            constructor4 = next;
                        }
                    }
                    if (length == 2 && cls2 == String.class && Throwable.class.isAssignableFrom(parameterTypes[1])) {
                        constructor3 = next;
                    }
                }
            }
        }
        this.z = constructor;
        this.A = constructor2;
        this.B = constructor3;
        this.C = constructor4;
        Collections.sort(list, new Comparator() { // from class: tb.sdk
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int E2;
                E2 = tdk.E((Constructor) obj, (Constructor) obj2);
                return E2;
            }
        });
        this.D = new ArrayList(list.size());
        for (Constructor constructor5 : list) {
            Class<?>[] parameterTypes2 = constructor5.getParameterTypes();
            if (parameterTypes2.length > 0) {
                strArr = BeanUtils.Y(constructor5);
                f79 f79Var = new f79();
                Annotation[][] parameterAnnotations = constructor5.getParameterAnnotations();
                for (int i2 = 0; i2 < parameterTypes2.length && i2 < strArr.length; i2++) {
                    f79Var.b();
                    JSONFactory.defaultObjectReaderProvider.B(f79Var, cls, constructor5, i2, parameterAnnotations);
                    String str = f79Var.f19065a;
                    if (str != null) {
                        strArr[i2] = str;
                    }
                }
            } else {
                strArr = null;
            }
            ((ArrayList) this.D).add(strArr);
        }
        g79 g79Var = null;
        for (g79 g79Var2 : g79VarArr) {
            if ("stackTrace".equals(g79Var2.b) && g79Var2.c == StackTraceElement[].class) {
                g79Var = g79Var2;
            }
        }
        this.x = g79Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x015d  */
    @Override // tb.ldk, tb.jdk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public T o(com.alibaba.fastjson2.JSONReader r20, java.lang.reflect.Type r21, java.lang.Object r22, long r23) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.tdk.o(com.alibaba.fastjson2.JSONReader, java.lang.reflect.Type, java.lang.Object, long):java.lang.Object");
    }
}
