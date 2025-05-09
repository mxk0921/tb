package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class l89<T> extends fa9<T> {
    public l89(String str, int i, long j, String str2, Double d, Method method) {
        super(str, Double.class, Double.class, i, j, str2, null, d, method, null, null);
    }

    @Override // tb.fa9, tb.g79
    public void L(JSONReader jSONReader, T t) {
        Double e2 = jSONReader.e2();
        if (e2 != null || this.j == null) {
            try {
                this.g.invoke(t, e2);
            } catch (Exception e) {
                throw new JSONException(jSONReader.a1("set " + this.b + " error"), e);
            }
        }
    }

    @Override // tb.fa9, tb.g79
    public void h(T t, Object obj) {
        try {
            this.g.invoke(t, TypeUtils.L(obj));
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }
}
