package tb;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.text.DecimalFormat;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class yik extends jkk {
    public static final yik c = new yik(null, null);

    /* renamed from: a  reason: collision with root package name */
    public final DecimalFormat f32116a;
    public final k2a<Object, BigDecimal> b;

    public yik(DecimalFormat decimalFormat, k2a<Object, BigDecimal> k2aVar) {
        this.f32116a = decimalFormat;
        this.b = k2aVar;
    }

    @Override // tb.jkk
    public k2a a() {
        return this.b;
    }

    @Override // tb.jkk, tb.iik
    public void e(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        BigDecimal bigDecimal;
        k2a<Object, BigDecimal> k2aVar = this.b;
        if (k2aVar == null || obj == null) {
            bigDecimal = (BigDecimal) obj;
        } else {
            bigDecimal = k2aVar.apply(obj);
        }
        jSONWriter.z1(bigDecimal, j, this.f32116a);
    }

    @Override // tb.iik
    public void y(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        BigDecimal bigDecimal;
        k2a<Object, BigDecimal> k2aVar = this.b;
        if (k2aVar == null || obj == null) {
            bigDecimal = (BigDecimal) obj;
        } else {
            bigDecimal = k2aVar.apply(obj);
        }
        jSONWriter.z1(bigDecimal, j, this.f32116a);
    }
}
