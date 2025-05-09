package tb;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ekk extends jkk {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f18644a = yqf.a("[String");
    public static final long b = ls9.a("[String");
    public static final ekk c = new ekk();

    @Override // tb.jkk, tb.iik
    public void e(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.k1();
            return;
        }
        if (jSONWriter.R0(obj, type, j)) {
            jSONWriter.t2(f18644a, b);
        }
        String[] strArr = (String[]) obj;
        jSONWriter.d1(strArr.length);
        for (String str : strArr) {
            if (str != null) {
                jSONWriter.k2(str);
            } else if (jSONWriter.i0(JSONWriter.Feature.NullAsDefaultValue.mask | JSONWriter.Feature.WriteNullStringAsEmpty.mask)) {
                jSONWriter.k2("");
            } else {
                jSONWriter.b2();
            }
        }
    }

    @Override // tb.iik
    public void y(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.k1();
        } else {
            jSONWriter.o2((String[]) obj);
        }
    }
}
