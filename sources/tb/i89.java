package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.DateUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Date;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
abstract class i89<T> extends g79<T> {
    final jdk v;
    final boolean w;
    final boolean x;

    public i89(String str, Type type, Class cls, int i, long j, String str2, Locale locale, Object obj, Method method, Field field, jdk jdkVar) {
        super(str, type, cls, i, j, str2, locale, obj, method, field);
        boolean z;
        this.v = jdkVar;
        boolean z2 = false;
        if (str2 != null) {
            z = true;
            if (!str2.equals("millis")) {
                if (str2.equals("unixtime")) {
                    z2 = true;
                }
            }
            this.w = z2;
            this.x = z;
        }
        z = false;
        this.w = z2;
        this.x = z;
    }

    @Override // tb.g79
    public final Object K(JSONReader jSONReader) {
        return this.v.o(jSONReader, this.d, this.b, this.e);
    }

    @Override // tb.g79
    public boolean N(Class cls) {
        if (cls == Date.class || cls == String.class) {
            return true;
        }
        return false;
    }

    public abstract void O(T t, Date date);

    public abstract void P(T t);

    public abstract Object Q(long j);

    public abstract Object R(Date date);

    @Override // tb.g79
    public final jdk y(JSONReader.c cVar) {
        return this.v;
    }

    @Override // tb.g79
    public final jdk z(JSONReader jSONReader) {
        return this.v;
    }

    @Override // tb.g79
    public void h(T t, Object obj) {
        if (obj == null) {
            P(t);
            return;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.isEmpty() || "null".equals(str)) {
                P(t);
                return;
            } else if ((this.f == null || this.w || this.x) && b2d.h(str)) {
                long parseLong = Long.parseLong(str);
                if (this.w) {
                    parseLong *= 1000;
                }
                g(t, parseLong);
                return;
            } else {
                obj = DateUtils.u(str, this.f, wqx.d);
            }
        }
        if (obj instanceof Date) {
            O(t, (Date) obj);
        } else if (obj instanceof Long) {
            g(t, ((Long) obj).longValue());
        } else {
            throw new JSONException("not support value " + obj.getClass());
        }
    }
}
