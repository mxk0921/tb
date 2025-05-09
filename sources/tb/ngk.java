package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ngk extends xgk {
    public static final ngk b = new ngk();

    public ngk() {
        super(Number[].class);
    }

    @Override // tb.xgk, tb.jdk
    public Object i(Collection collection) {
        Number[] numberArr = new Number[collection.size()];
        int i = 0;
        for (Object obj : collection) {
            if (obj != null && !(obj instanceof Number)) {
                k2a M = JSONFactory.defaultObjectReaderProvider.M(obj.getClass(), Number.class);
                if (M != null) {
                    obj = M.apply(obj);
                } else {
                    throw new JSONException("can not cast to Number " + obj.getClass());
                }
            }
            numberArr[i] = (Number) obj;
            i++;
        }
        return numberArr;
    }

    @Override // tb.jdk
    public Object o(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.n2()) {
            return null;
        }
        if (jSONReader.v1()) {
            Number[] numberArr = new Number[16];
            int i = 0;
            while (!jSONReader.u1()) {
                int i2 = i + 1;
                if (i2 - numberArr.length > 0) {
                    int length = numberArr.length;
                    int i3 = length + (length >> 1);
                    if (i3 - i2 < 0) {
                        i3 = i2;
                    }
                    numberArr = (Number[]) Arrays.copyOf(numberArr, i3);
                }
                numberArr[i] = jSONReader.K2();
                i = i2;
            }
            jSONReader.w1();
            return Arrays.copyOf(numberArr, i);
        }
        throw new JSONException(jSONReader.a1("TODO"));
    }

    @Override // tb.jdk
    public Object q(JSONReader jSONReader, Type type, Object obj, long j) {
        int c3 = jSONReader.c3();
        if (c3 == -1) {
            return null;
        }
        Number[] numberArr = new Number[c3];
        for (int i = 0; i < c3; i++) {
            numberArr[i] = jSONReader.K2();
        }
        return numberArr;
    }
}
