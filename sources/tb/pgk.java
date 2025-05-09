package tb;

import androidx.exifinterface.media.ExifInterface;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class pgk extends xgk {
    public static final pgk b = new pgk();
    public static final long HASH_TYPE = ls9.a(ExifInterface.LATITUDE_SOUTH);

    public pgk() {
        super(Short.class);
    }

    @Override // tb.jdk
    public Object o(JSONReader jSONReader, Type type, Object obj, long j) {
        Integer o2 = jSONReader.o2();
        if (o2 == null) {
            return null;
        }
        return Short.valueOf(o2.shortValue());
    }

    @Override // tb.jdk
    public Object q(JSONReader jSONReader, Type type, Object obj, long j) {
        Integer o2 = jSONReader.o2();
        if (o2 == null) {
            return null;
        }
        return Short.valueOf(o2.shortValue());
    }
}
