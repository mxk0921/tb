package tb;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.math.BigDecimal;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class rik extends jkk {

    /* renamed from: a  reason: collision with root package name */
    public static final rik f27404a = new rik();
    public static final byte[] b = yqf.a("[BigDecimal");

    @Override // tb.jkk, tb.iik
    public void e(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.b2();
            return;
        }
        if (jSONWriter.Q0(obj, type)) {
            jSONWriter.t2(b, -2138534155605614069L);
        }
        BigDecimal[] bigDecimalArr = (BigDecimal[]) obj;
        jSONWriter.d1(bigDecimalArr.length);
        for (BigDecimal bigDecimal : bigDecimalArr) {
            jSONWriter.z1(bigDecimal, 0L, null);
        }
    }

    @Override // tb.iik
    public void y(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj != null) {
            BigDecimal[] bigDecimalArr = (BigDecimal[]) obj;
            jSONWriter.c1();
            for (int i = 0; i < bigDecimalArr.length; i++) {
                if (i != 0) {
                    jSONWriter.t1();
                }
                jSONWriter.z1(bigDecimalArr[i], 0L, null);
            }
            jSONWriter.e();
        } else if (jSONWriter.i0(JSONWriter.Feature.NullAsDefaultValue.mask | JSONWriter.Feature.WriteNullListAsEmpty.mask)) {
            jSONWriter.c1();
            jSONWriter.e();
        } else {
            jSONWriter.b2();
        }
    }
}
