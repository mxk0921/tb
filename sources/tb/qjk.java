package tb;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class qjk extends jkk {

    /* renamed from: a  reason: collision with root package name */
    public static final qjk f26787a = new qjk();
    public static final byte[] b = yqf.a("[Integer");
    public static final long c = ls9.a("[Integer");

    @Override // tb.jkk, tb.iik
    public void e(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.b2();
            return;
        }
        if (jSONWriter.Q0(obj, type)) {
            jSONWriter.t2(b, c);
        }
        Integer[] numArr = (Integer[]) obj;
        jSONWriter.d1(numArr.length);
        for (Integer num : numArr) {
            if (num == null) {
                jSONWriter.b2();
            } else {
                jSONWriter.L1(num.intValue());
            }
        }
    }

    @Override // tb.iik
    public void y(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj != null) {
            Integer[] numArr = (Integer[]) obj;
            jSONWriter.c1();
            for (int i = 0; i < numArr.length; i++) {
                if (i != 0) {
                    jSONWriter.t1();
                }
                Integer num = numArr[i];
                if (num == null) {
                    jSONWriter.b2();
                } else {
                    jSONWriter.L1(num.intValue());
                }
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
