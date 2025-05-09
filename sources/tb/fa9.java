package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class fa9<T> extends g79<T> {
    protected jdk v;
    protected final z92 w;

    public fa9(String str, Type type, Class cls, int i, long j, String str2, Locale locale, Object obj, Method method, Field field, z92 z92Var) {
        super(str, type, cls, i, j, str2, locale, obj, method, field);
        this.w = z92Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tb.g79
    public void J(JSONReader jSONReader, Object obj) {
        if (this.v == null) {
            this.v = z(jSONReader);
        }
        if ((this.v instanceof ldk) && this.h != null) {
            g79 j = this.v.j(jSONReader.L0());
            if (j != null) {
                try {
                    Object obj2 = this.h.get(obj);
                    if (obj2 == null) {
                        obj2 = this.v.D(this.e);
                        h(obj, obj2);
                    }
                    j.L(jSONReader, obj2);
                    return;
                } catch (Exception e) {
                    throw new JSONException("read unwrapped field error", e);
                }
            }
        }
        jSONReader.b3();
    }

    @Override // tb.g79
    public Object K(JSONReader jSONReader) {
        Object obj;
        if (this.v == null) {
            this.v = z(jSONReader);
        }
        if (jSONReader.w) {
            obj = this.v.q(jSONReader, this.d, this.b, this.e);
        } else {
            obj = this.v.o(jSONReader, this.d, this.b, this.e);
        }
        k2a d = this.v.d();
        if (d != null) {
            return d.apply(obj);
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e8  */
    @Override // tb.g79
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void L(com.alibaba.fastjson2.JSONReader r9, T r10) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.fa9.L(com.alibaba.fastjson2.JSONReader, java.lang.Object):void");
    }

    @Override // tb.g79
    public void M(JSONReader jSONReader, T t) {
        JSONReader.c cVar = jSONReader.f2453a;
        long j = cVar.c;
        if (!this.l && jSONReader.W0() != -110) {
            if ((JSONReader.Feature.IgnoreNoneSerializable.mask & j) != 0) {
                jSONReader.b3();
                return;
            } else if ((JSONReader.Feature.ErrorOnNoneSerializable.mask & j) != 0) {
                throw new JSONException("not support none-Serializable");
            }
        }
        if (this.v == null) {
            this.v = cVar.i.J(this.d, (j & JSONReader.Feature.FieldBased.mask) != 0);
        }
        if (jSONReader.k1()) {
            String P2 = jSONReader.P2();
            if ("..".equals(P2)) {
                h(t, t);
            } else {
                n(jSONReader, t, P2);
            }
        } else {
            h(t, this.v.q(jSONReader, this.d, this.b, this.e));
        }
    }

    @Override // tb.g79
    public void a(T t, byte b) {
        h(t, Byte.valueOf(b));
    }

    @Override // tb.g79
    public void b(T t, char c) {
        h(t, Character.valueOf(c));
    }

    @Override // tb.g79
    public void d(T t, double d) {
        h(t, Double.valueOf(d));
    }

    @Override // tb.g79
    public void e(T t, float f) {
        h(t, Float.valueOf(f));
    }

    @Override // tb.g79
    public void f(T t, int i) {
        h(t, Integer.valueOf(i));
    }

    @Override // tb.g79
    public void g(T t, long j) {
        h(t, Long.valueOf(j));
    }

    @Override // tb.g79
    public void i(T t, short s) {
        h(t, Short.valueOf(s));
    }

    @Override // tb.g79
    public void j(T t, boolean z) {
        h(t, Boolean.valueOf(z));
    }

    @Override // tb.g79
    public jdk s() {
        return this.v;
    }

    @Override // tb.g79
    public jdk y(JSONReader.c cVar) {
        boolean z;
        if (this.o != null) {
            return this.o;
        }
        jdk r = g79.r(this.d, this.c, this.f, this.k);
        if (r != null) {
            this.o = r;
            return r;
        } else if (Map.class.isAssignableFrom(this.c)) {
            jdk c = ggk.c(this.d, this.c, this.e);
            this.o = c;
            return c;
        } else if (Collection.class.isAssignableFrom(this.c)) {
            jdk S = xfk.S(this.d, this.c, this.e);
            this.o = S;
            return S;
        } else {
            if ((cVar.c & JSONReader.Feature.FieldBased.mask) != 0) {
                z = true;
            } else {
                z = false;
            }
            jdk J = cVar.i.J(this.d, z);
            this.o = J;
            return J;
        }
    }

    @Override // tb.g79
    public jdk z(JSONReader jSONReader) {
        boolean z;
        jdk jdkVar = this.v;
        if (jdkVar != null) {
            return jdkVar;
        }
        if (this.o != null) {
            return this.o;
        }
        jdk r = g79.r(this.d, this.c, this.f, this.k);
        if (r != null) {
            this.o = r;
            return r;
        }
        Class cls = this.c;
        if (cls == null || !Map.class.isAssignableFrom(cls)) {
            Class cls2 = this.c;
            if (cls2 == null || !Collection.class.isAssignableFrom(cls2)) {
                JSONReader.c cVar = jSONReader.f2453a;
                if ((cVar.c & JSONReader.Feature.FieldBased.mask) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                jdk J = cVar.i.J(this.d, z);
                this.o = J;
                return J;
            }
            jdk S = xfk.S(this.d, this.c, this.e);
            this.o = S;
            return S;
        }
        jdk c = ggk.c(this.d, this.c, this.e);
        this.o = c;
        return c;
    }

    @Override // tb.g79
    public void h(T t, Object obj) {
        String str;
        if (obj != null || (this.e & JSONReader.Feature.IgnoreSetNullValue.mask) == 0) {
            if (this.c == Character.TYPE && (obj instanceof String)) {
                String str2 = (String) obj;
                if (str2.length() > 0) {
                    obj = Character.valueOf(str2.charAt(0));
                } else {
                    obj = (char) 0;
                }
            }
            if (obj != null && !this.c.isInstance(obj)) {
                obj = TypeUtils.b(obj, this.d);
            }
            try {
                z92 z92Var = this.w;
                if (z92Var != null) {
                    ((pdk) z92Var).a(t, obj);
                    return;
                }
                Method method = this.g;
                if (method != null) {
                    method.invoke(t, obj);
                } else {
                    this.h.set(t, obj);
                }
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("set ");
                if (this.w != null) {
                    str = super.toString();
                } else {
                    str = this.b;
                }
                sb.append(str);
                sb.append(" error");
                throw new JSONException(sb.toString(), e);
            }
        }
    }
}
