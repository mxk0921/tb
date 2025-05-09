package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.util.AbstractMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class hgk extends xgk {
    public final Type b;
    public final Type c;
    public volatile jdk d;
    public volatile jdk e;

    public hgk(Type type, Type type2) {
        super(Map.Entry.class);
        this.b = type;
        this.c = type2;
    }

    @Override // tb.jdk
    public Object o(JSONReader jSONReader, Type type, Object obj, long j) {
        Object obj2;
        jSONReader.F1();
        Object T1 = jSONReader.T1();
        jSONReader.z1(f7l.CONDITION_IF_MIDDLE);
        if (this.c == null) {
            obj2 = jSONReader.T1();
        } else {
            if (this.e == null) {
                this.e = jSONReader.R0(this.c);
            }
            obj2 = this.e.o(jSONReader, type, obj, j);
        }
        jSONReader.E1();
        jSONReader.w1();
        return new AbstractMap.SimpleEntry(T1, obj2);
    }

    @Override // tb.jdk
    public Object q(JSONReader jSONReader, Type type, Object obj, long j) {
        Object obj2;
        Object obj3;
        int c3 = jSONReader.c3();
        if (c3 == 2) {
            if (this.b == null) {
                obj2 = jSONReader.T1();
            } else {
                if (this.d == null) {
                    this.d = jSONReader.R0(this.b);
                }
                obj2 = this.d.o(jSONReader, type, obj, j);
            }
            if (this.c == null) {
                obj3 = jSONReader.T1();
            } else {
                if (this.e == null) {
                    this.e = jSONReader.R0(this.c);
                }
                obj3 = this.e.o(jSONReader, type, obj, j);
            }
            return new AbstractMap.SimpleEntry(obj2, obj3);
        }
        throw new JSONException(jSONReader.a1("entryCnt must be 2, but " + c3));
    }
}
