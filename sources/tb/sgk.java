package tb;

import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.util.UUID;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class sgk extends xgk {
    public static final sgk b = new sgk();

    public sgk() {
        super(UUID.class);
    }

    @Override // tb.jdk
    public Object o(JSONReader jSONReader, Type type, Object obj, long j) {
        return jSONReader.U2();
    }

    @Override // tb.jdk
    public Object q(JSONReader jSONReader, Type type, Object obj, long j) {
        return jSONReader.U2();
    }
}
