package tb;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.text.DecimalFormat;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ljk extends jkk {
    public static final ljk b = new ljk(null);

    /* renamed from: a  reason: collision with root package name */
    public final DecimalFormat f23368a;

    public ljk(DecimalFormat decimalFormat) {
        this.f23368a = decimalFormat;
    }

    @Override // tb.jkk, tb.iik
    public void e(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.b2();
        } else {
            jSONWriter.writeFloat(((Float) obj).floatValue());
        }
    }

    @Override // tb.iik
    public void y(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.b2();
            return;
        }
        DecimalFormat decimalFormat = this.f23368a;
        if (decimalFormat != null) {
            jSONWriter.f2(decimalFormat.format(obj));
            return;
        }
        jSONWriter.writeFloat(((Float) obj).floatValue());
        if (((jSONWriter.A() | j) & JSONWriter.Feature.WriteClassName.mask) != 0 && type != Float.class && type != Float.TYPE) {
            jSONWriter.e2('F');
        }
    }
}
