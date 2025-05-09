package tb;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.text.DecimalFormat;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class mjk extends jkk {
    public static final mjk c = new mjk(null, null);
    public static final byte[] d = yqf.a("[F");
    public static final long e = ls9.a("[F");

    /* renamed from: a  reason: collision with root package name */
    public final DecimalFormat f24085a;
    public final k2a<Object, float[]> b;

    public mjk(DecimalFormat decimalFormat) {
        this.f24085a = decimalFormat;
        this.b = null;
    }

    @Override // tb.jkk, tb.iik
    public void e(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        float[] fArr;
        if (jSONWriter.Q0(obj, type)) {
            jSONWriter.t2(d, e);
        }
        k2a<Object, float[]> k2aVar = this.b;
        if (k2aVar == null || obj == null) {
            fArr = (float[]) obj;
        } else {
            fArr = k2aVar.apply(obj);
        }
        jSONWriter.F1(fArr);
    }

    @Override // tb.iik
    public void y(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        float[] fArr;
        k2a<Object, float[]> k2aVar = this.b;
        if (k2aVar == null || obj == null) {
            fArr = (float[]) obj;
        } else {
            fArr = k2aVar.apply(obj);
        }
        DecimalFormat decimalFormat = this.f24085a;
        if (decimalFormat == null) {
            jSONWriter.F1(fArr);
        } else {
            jSONWriter.G1(fArr, decimalFormat);
        }
    }

    public mjk(k2a<Object, float[]> k2aVar, DecimalFormat decimalFormat) {
        this.b = k2aVar;
        this.f24085a = decimalFormat;
    }
}
