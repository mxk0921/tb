package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Field;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class w99<T> extends g79<T> {
    public w99(String str, Class cls, int i, long j, String str2, Byte b, Field field) {
        super(str, cls, cls, i, j, str2, null, b, null, field);
    }

    @Override // tb.g79
    public Object K(JSONReader jSONReader) {
        return Byte.valueOf((byte) jSONReader.p2());
    }

    @Override // tb.g79
    public void L(JSONReader jSONReader, T t) {
        try {
            this.h.setByte(t, (byte) jSONReader.p2());
        } catch (Exception e) {
            throw new JSONException(jSONReader.a1("set " + this.b + " error"), e);
        }
    }

    @Override // tb.g79
    public void f(T t, int i) {
        try {
            this.h.setByte(t, (byte) i);
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }

    @Override // tb.g79
    public void g(T t, long j) {
        try {
            this.h.setByte(t, (byte) j);
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }

    @Override // tb.g79
    public void h(T t, Object obj) {
        try {
            this.h.setByte(t, TypeUtils.J(obj));
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }
}
