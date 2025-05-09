package tb;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class tjk extends jkk {

    /* renamed from: a  reason: collision with root package name */
    public static final tjk f28750a = new tjk();
    public static final byte[] b = yqf.a("[Long");
    public static final long c = ls9.a("[Long");

    @Override // tb.jkk, tb.iik
    public void e(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.b2();
            return;
        }
        if (jSONWriter.Q0(obj, type)) {
            jSONWriter.t2(b, c);
        }
        Long[] lArr = (Long[]) obj;
        jSONWriter.d1(lArr.length);
        for (Long l : lArr) {
            if (l == null) {
                jSONWriter.b2();
            } else {
                jSONWriter.O1(l.longValue());
            }
        }
    }

    @Override // tb.iik
    public void y(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj != null) {
            Long[] lArr = (Long[]) obj;
            jSONWriter.c1();
            for (int i = 0; i < lArr.length; i++) {
                if (i != 0) {
                    jSONWriter.t1();
                }
                Long l = lArr[i];
                if (l == null) {
                    jSONWriter.b2();
                } else {
                    jSONWriter.O1(l.longValue());
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
