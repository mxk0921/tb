package tb;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.text.DecimalFormat;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class jjk extends jkk {
    public static final jjk b = new jjk(null);
    public static final byte[] c = yqf.a("[D");
    public static final long d = ls9.a("[D");

    /* renamed from: a  reason: collision with root package name */
    public final DecimalFormat f22031a;

    public jjk(DecimalFormat decimalFormat) {
        this.f22031a = decimalFormat;
    }

    @Override // tb.jkk, tb.iik
    public void e(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (jSONWriter.Q0(obj, type)) {
            jSONWriter.t2(c, d);
        }
        jSONWriter.B1((double[]) obj);
    }

    @Override // tb.iik
    public void y(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        double[] dArr = (double[]) obj;
        DecimalFormat decimalFormat = this.f22031a;
        if (decimalFormat == null) {
            jSONWriter.B1(dArr);
        } else {
            jSONWriter.C1(dArr, decimalFormat);
        }
    }
}
