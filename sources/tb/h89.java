package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Date;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class h89<T> extends i89<T> {
    final z92<T, Date> y;

    public h89(String str, Type type, Class cls, int i, long j, String str2, Locale locale, Object obj, Field field, Method method, z92<T, Date> z92Var) {
        super(str, type, cls, i, j, str2, locale, obj, method, field, fek.J(str2, locale));
        this.y = z92Var;
    }

    @Override // tb.g79
    public void L(JSONReader jSONReader, T t) {
        O(t, (Date) this.v.o(jSONReader, this.d, this.b, this.e));
    }

    @Override // tb.i89
    public void O(T t, Date date) {
        z92<T, Date> z92Var = this.y;
        if (z92Var != null) {
            ((pdk) z92Var).a(t, date);
        } else if (t != null) {
            Method method = this.g;
            if (method != null) {
                try {
                    method.invoke(t, date);
                } catch (Exception e) {
                    throw new JSONException("set " + this.b + " error", e);
                }
            } else {
                long j = this.i;
                if (j != -1) {
                    opf.UNSAFE.putObject(t, j, date);
                    return;
                }
                try {
                    this.h.set(t, date);
                } catch (Exception e2) {
                    throw new JSONException("set " + this.b + " error", e2);
                }
            }
        } else {
            throw new JSONException("set " + this.b + " error, object is null");
        }
    }

    @Override // tb.i89
    public void P(T t) {
        O(t, null);
    }

    @Override // tb.i89
    public Object Q(long j) {
        return new Date(j);
    }

    @Override // tb.g79
    public void g(T t, long j) {
        O(t, new Date(j));
    }

    @Override // tb.i89
    public Object R(Date date) {
        return date;
    }
}
