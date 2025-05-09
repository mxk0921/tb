package tb;

import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class cgk extends xgk {
    public static final cgk b = new cgk();

    public cgk() {
        super(Locale.class);
    }

    @Override // tb.jdk
    public Object o(JSONReader jSONReader, Type type, Object obj, long j) {
        String Q2 = jSONReader.Q2();
        if (Q2 == null || Q2.isEmpty()) {
            return null;
        }
        String[] split = Q2.split("_");
        if (split.length == 1) {
            return new Locale(split[0]);
        }
        if (split.length == 2) {
            return new Locale(split[0], split[1]);
        }
        return new Locale(split[0], split[1], split[2]);
    }

    @Override // tb.jdk
    public Object q(JSONReader jSONReader, Type type, Object obj, long j) {
        String Q2 = jSONReader.Q2();
        if (Q2 == null || Q2.isEmpty()) {
            return null;
        }
        String[] split = Q2.split("_");
        if (split.length == 1) {
            return new Locale(split[0]);
        }
        if (split.length == 2) {
            return new Locale(split[0], split[1]);
        }
        return new Locale(split[0], split[1], split[2]);
    }
}
