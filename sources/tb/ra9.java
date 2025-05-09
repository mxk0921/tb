package tb;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.writer.FieldWriter;
import java.lang.reflect.Method;
import java.text.DecimalFormat;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class ra9<T> extends FieldWriter<T> {
    final k2a<T, Double> z;

    public ra9(String str, int i, long j, String str2, String str3, Method method, k2a<T, Double> k2aVar) {
        super(str, i, j, str2, str3, Double.class, Double.class, null, method);
        this.z = k2aVar;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void R(JSONWriter jSONWriter, T t) {
        Double apply = this.z.apply(t);
        if (apply == null) {
            jSONWriter.c2();
            return;
        }
        double doubleValue = apply.doubleValue();
        DecimalFormat decimalFormat = this.g;
        if (decimalFormat != null) {
            jSONWriter.A1(doubleValue, decimalFormat);
        } else {
            jSONWriter.writeDouble(doubleValue);
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object a(T t) {
        return this.z.apply(t);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean o(JSONWriter jSONWriter, T t) {
        try {
            Double apply = this.z.apply(t);
            if (apply == null) {
                long C = jSONWriter.C(this.d);
                if ((JSONWriter.Feature.WriteNulls.mask & C) == 0 || (C & JSONWriter.Feature.NotWriteDefaultValue.mask) != 0) {
                    return false;
                }
                A(jSONWriter);
                jSONWriter.c2();
                return true;
            }
            A(jSONWriter);
            double doubleValue = apply.doubleValue();
            DecimalFormat decimalFormat = this.g;
            if (decimalFormat != null) {
                jSONWriter.A1(doubleValue, decimalFormat);
            } else {
                jSONWriter.writeDouble(doubleValue);
            }
            return true;
        } catch (RuntimeException e) {
            if (jSONWriter.u0()) {
                return false;
            }
            throw e;
        }
    }
}
