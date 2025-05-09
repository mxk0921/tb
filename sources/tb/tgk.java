package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class tgk<I, T> implements jdk<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Type f28708a;
    public final long b;
    public final Constructor<T> c;
    public final Method d;
    public final k2a<I, T> e;
    public final Object f;
    public jdk g;

    public tgk(Class<T> cls, Type type, Class<I> cls2, long j, String str, Object obj, Constructor<T> constructor, Method method, k2a<I, T> k2aVar) {
        this.f28708a = type;
        this.b = j;
        this.c = constructor;
        this.d = method;
        this.e = k2aVar;
        if (method != null) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 2) {
                this.f = Array.newInstance(parameterTypes[1].getComponentType(), 0);
                return;
            }
        }
        this.f = null;
    }

    public static <I, T> tgk<I, T> c(Class<T> cls, Class<I> cls2, k2a<I, T> k2aVar) {
        return new tgk<>(cls, cls2, cls2, 0L, null, null, null, null, k2aVar);
    }

    @Override // tb.jdk
    public /* synthetic */ Object D(long j) {
        cdk.d(this, j);
        throw null;
    }

    @Override // tb.jdk
    public /* synthetic */ Object F(JSONReader jSONReader) {
        return cdk.l(this, jSONReader);
    }

    @Override // tb.jdk
    public /* synthetic */ String G() {
        return JSON.DEFAULT_TYPE_KEY;
    }

    @Override // tb.jdk
    public /* synthetic */ Object a() {
        return cdk.c(this);
    }

    @Override // tb.jdk
    public /* synthetic */ Class b() {
        return null;
    }

    @Override // tb.jdk
    public /* synthetic */ k2a d() {
        return null;
    }

    @Override // tb.jdk
    public /* synthetic */ g79 h(long j) {
        return null;
    }

    @Override // tb.jdk
    public /* synthetic */ Object i(Collection collection) {
        cdk.e(this, collection);
        throw null;
    }

    @Override // tb.jdk
    public /* synthetic */ g79 j(String str) {
        return cdk.h(this, str);
    }

    @Override // tb.jdk
    public /* synthetic */ long m() {
        return jdk.HASH_TYPE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tb.jdk
    public T o(JSONReader jSONReader, Type type, Object obj, long j) {
        if (this.g == null) {
            this.g = jSONReader.R0(this.f28708a);
        }
        Object o = this.g.o(jSONReader, type, obj, j | this.b);
        if (o == null) {
            return null;
        }
        k2a<I, T> k2aVar = this.e;
        if (k2aVar != 0) {
            try {
                return (T) k2aVar.apply(o);
            } catch (Exception e) {
                throw new JSONException(jSONReader.a1("create object error"), e);
            }
        } else {
            Constructor<T> constructor = this.c;
            if (constructor != null) {
                try {
                    return constructor.newInstance(o);
                } catch (Exception e2) {
                    throw new JSONException(jSONReader.a1("create object error"), e2);
                }
            } else {
                Method method = this.d;
                if (method != null) {
                    try {
                        Object obj2 = this.f;
                        if (obj2 != null) {
                            jSONReader = (T) method.invoke(null, o, obj2);
                        } else {
                            jSONReader = (T) method.invoke(null, o);
                        }
                        return (T) jSONReader;
                    } catch (Exception e3) {
                        throw new JSONException(jSONReader.a1("create object error"), e3);
                    }
                } else {
                    throw new JSONException(jSONReader.a1("create object error"));
                }
            }
        }
    }

    @Override // tb.jdk
    public T q(JSONReader jSONReader, Type type, Object obj, long j) {
        return o(jSONReader, type, obj, j);
    }

    @Override // tb.jdk
    public /* synthetic */ Object r(JSONReader jSONReader, Type type, Object obj, long j) {
        cdk.i(this, jSONReader, type, obj, j);
        throw null;
    }

    @Override // tb.jdk
    public /* synthetic */ Object t(Map map, JSONReader.Feature... featureArr) {
        return cdk.g(this, map, featureArr);
    }

    @Override // tb.jdk
    public /* synthetic */ g79 u(long j) {
        return null;
    }

    @Override // tb.jdk
    public /* synthetic */ long v() {
        return 0L;
    }

    @Override // tb.jdk
    public /* synthetic */ jdk w(ObjectReaderProvider objectReaderProvider, long j) {
        return cdk.b(this, objectReaderProvider, j);
    }

    @Override // tb.jdk
    public /* synthetic */ Object x(Map map, long j) {
        return cdk.f(this, map, j);
    }

    @Override // tb.jdk
    public /* synthetic */ jdk z(JSONReader.c cVar, long j) {
        return cdk.a(this, cVar, j);
    }

    @Override // tb.jdk
    public /* synthetic */ void s(Object obj, String str, Object obj2, long j) {
    }
}
