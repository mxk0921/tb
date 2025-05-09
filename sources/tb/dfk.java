package tb;

import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class dfk extends xgk {
    public static final dfk b = new dfk();

    public dfk() {
        super(Integer.class);
    }

    @Override // tb.jdk
    public Object o(JSONReader jSONReader, Type type, Object obj, long j) {
        return jSONReader.o2();
    }

    @Override // tb.jdk
    public Object q(JSONReader jSONReader, Type type, Object obj, long j) {
        return jSONReader.o2();
    }
}
