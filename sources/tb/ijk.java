package tb;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.text.DecimalFormat;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ijk extends jkk {
    public static final ijk b = new ijk(null);

    /* renamed from: a  reason: collision with root package name */
    public final DecimalFormat f21350a;

    public ijk(DecimalFormat decimalFormat) {
        this.f21350a = decimalFormat;
    }

    @Override // tb.jkk, tb.iik
    public void e(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.b2();
        } else {
            jSONWriter.writeDouble(((Double) obj).doubleValue());
        }
    }

    @Override // tb.iik
    public void y(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.b2();
            return;
        }
        DecimalFormat decimalFormat = this.f21350a;
        if (decimalFormat != null) {
            jSONWriter.f2(decimalFormat.format(obj));
            return;
        }
        jSONWriter.writeDouble(((Double) obj).doubleValue());
        if (((jSONWriter.A() | j) & JSONWriter.Feature.WriteClassName.mask) != 0 && type != Double.class && type != Double.TYPE) {
            jSONWriter.e2(ohh.LEVEL_D);
        }
    }
}
