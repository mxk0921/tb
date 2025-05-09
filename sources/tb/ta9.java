package tb;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.writer.FieldWriter;
import java.lang.reflect.Method;
import java.text.DecimalFormat;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class ta9<T> extends FieldWriter<T> {
    final k2a<T, Float> z;

    public ta9(String str, int i, long j, String str2, String str3, Method method, k2a<T, Float> k2aVar) {
        super(str, i, j, str2, str3, Float.class, Float.class, null, method);
        this.z = k2aVar;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void R(JSONWriter jSONWriter, T t) {
        Float apply = this.z.apply(t);
        if (apply == null) {
            jSONWriter.c2();
            return;
        }
        float floatValue = apply.floatValue();
        DecimalFormat decimalFormat = this.g;
        if (decimalFormat != null) {
            jSONWriter.E1(floatValue, decimalFormat);
        } else {
            jSONWriter.writeFloat(floatValue);
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object a(T t) {
        return this.z.apply(t);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean o(JSONWriter jSONWriter, T t) {
        try {
            Float apply = this.z.apply(t);
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
            float floatValue = apply.floatValue();
            DecimalFormat decimalFormat = this.g;
            if (decimalFormat != null) {
                jSONWriter.E1(floatValue, decimalFormat);
            } else {
                jSONWriter.writeFloat(floatValue);
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
