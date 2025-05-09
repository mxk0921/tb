package tb;

import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class zdk extends xgk<Byte> {
    public static final zdk b = new zdk();
    public static final long HASH_TYPE = ls9.a("B");

    public zdk() {
        super(Byte.class);
    }

    /* renamed from: c */
    public Byte q(JSONReader jSONReader, Type type, Object obj, long j) {
        Integer o2 = jSONReader.o2();
        if (o2 == null) {
            return null;
        }
        return Byte.valueOf(o2.byteValue());
    }

    /* renamed from: e */
    public Byte o(JSONReader jSONReader, Type type, Object obj, long j) {
        Integer o2 = jSONReader.o2();
        if (o2 == null) {
            return null;
        }
        return Byte.valueOf(o2.byteValue());
    }
}
