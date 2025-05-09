package tb;

import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.util.Collection;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class rgk extends xgk {
    public static final rgk b = new rgk();
    public static final long HASH_TYPE = ls9.a("[String");

    public rgk() {
        super(Long[].class);
    }

    @Override // tb.xgk, tb.jdk
    public Object i(Collection collection) {
        String str;
        String[] strArr = new String[collection.size()];
        int i = 0;
        for (Object obj : collection) {
            if (obj == null) {
                str = null;
            } else if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = obj.toString();
            }
            strArr[i] = str;
            i++;
        }
        return strArr;
    }

    @Override // tb.jdk
    public Object o(JSONReader jSONReader, Type type, Object obj, long j) {
        return jSONReader.R2();
    }

    @Override // tb.jdk
    public Object q(JSONReader jSONReader, Type type, Object obj, long j) {
        return jSONReader.R2();
    }
}
