package tb;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class sjk extends jkk {

    /* renamed from: a  reason: collision with root package name */
    public static final sjk f28090a = new sjk(null);

    public sjk(Class cls) {
    }

    @Override // tb.jkk, tb.iik
    public void e(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.c2();
        } else {
            jSONWriter.O1(((Long) obj).longValue());
        }
    }

    @Override // tb.iik
    public void y(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.c2();
            return;
        }
        long longValue = ((Number) obj).longValue();
        jSONWriter.O1(longValue);
        if (longValue >= -2147483648L && longValue <= 2147483647L) {
            JSONWriter.Feature feature = JSONWriter.Feature.WriteClassName;
            if ((feature.mask & j) != 0) {
                long A = jSONWriter.A();
                if ((feature.mask & A) == 0 && (A & (JSONWriter.Feature.WriteNonStringValueAsString.mask | JSONWriter.Feature.WriteLongAsString.mask)) == 0) {
                    jSONWriter.e2(ohh.LEVEL_L);
                }
            }
        }
    }
}
