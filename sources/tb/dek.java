package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Type;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class dek extends xgk {
    public static final dek b = new dek();
    public static final long c = ls9.a("java.lang.Class");

    public dek() {
        super(Class.class);
    }

    @Override // tb.jdk
    public Object o(JSONReader jSONReader, Type type, Object obj, long j) {
        long V2 = jSONReader.V2();
        JSONReader.c cVar = jSONReader.f2453a;
        JSONReader.a d = cVar.d();
        if (d != null) {
            Class<?> c2 = d.c(V2, Class.class, j);
            if (c2 == null) {
                c2 = d.b(jSONReader.U0(), Class.class, j);
            }
            if (c2 != null) {
                return c2;
            }
        }
        String U0 = jSONReader.U0();
        if (((j | cVar.c) & JSONReader.Feature.SupportClassForName.mask) != 0) {
            Class l = TypeUtils.l(U0);
            if (l != null) {
                return l;
            }
            Class<?> t = cVar.i.t(U0, null, JSONReader.Feature.SupportAutoType.mask);
            if (t != null) {
                return t;
            }
            throw new JSONException(jSONReader.a1("class not found " + U0));
        }
        throw new JSONException(jSONReader.a1("not support ClassForName : " + U0 + ", you can config 'JSONReader.Feature.SupportClassForName'"));
    }

    @Override // tb.jdk
    public Object q(JSONReader jSONReader, Type type, Object obj, long j) {
        if (!jSONReader.y1((byte) -110) || jSONReader.T2() == c) {
            return o(jSONReader, type, obj, j);
        }
        throw new JSONException(jSONReader.a1("not support autoType : " + jSONReader.U0()));
    }
}
