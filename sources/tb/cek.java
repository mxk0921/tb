package tb;

import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class cek extends xgk {
    public static final cek b = new cek();

    public cek() {
        super(Character.class);
    }

    @Override // tb.jdk
    public Object o(JSONReader jSONReader, Type type, Object obj, long j) {
        String Q2 = jSONReader.Q2();
        if (Q2 == null) {
            return null;
        }
        return Character.valueOf(Q2.charAt(0));
    }

    @Override // tb.jdk
    public Object q(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.C1()) {
            return null;
        }
        return Character.valueOf(jSONReader.c2());
    }
}
