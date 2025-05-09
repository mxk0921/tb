package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import java.io.IOException;
import java.lang.reflect.Type;
import java.text.DecimalFormat;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class NumberCodec implements ObjectSerializer, ObjectDeserializer {
    public static final NumberCodec instance = new NumberCodec();
    private DecimalFormat decimalFormat;

    private NumberCodec() {
        this.decimalFormat = null;
    }

    /* JADX WARN: Type inference failed for: r8v16, types: [java.math.BigDecimal, T, java.lang.Number] */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <T> T deserialze(com.alibaba.fastjson.parser.DefaultJSONParser r8, java.lang.reflect.Type r9, java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.serializer.NumberCodec.deserialze(com.alibaba.fastjson.parser.DefaultJSONParser, java.lang.reflect.Type, java.lang.Object):java.lang.Object");
    }

    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public void write(JSONSerializer jSONSerializer, Object obj, Object obj2, Type type) throws IOException {
        String str;
        SerializeWriter serializeWriter = jSONSerializer.out;
        if (obj == null) {
            if ((serializeWriter.features & SerializerFeature.WriteNullNumberAsZero.mask) != 0) {
                serializeWriter.write(48);
            } else {
                serializeWriter.writeNull();
            }
        } else if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (Float.isNaN(floatValue)) {
                serializeWriter.writeNull();
            } else if (Float.isInfinite(floatValue)) {
                serializeWriter.writeNull();
            } else {
                String f = Float.toString(floatValue);
                if (f.endsWith(".0")) {
                    f = f.substring(0, f.length() - 2);
                }
                serializeWriter.write(f);
                if ((serializeWriter.features & SerializerFeature.WriteClassName.mask) != 0) {
                    serializeWriter.write(70);
                }
            }
        } else {
            double doubleValue = ((Double) obj).doubleValue();
            if (Double.isNaN(doubleValue)) {
                serializeWriter.writeNull();
            } else if (Double.isInfinite(doubleValue)) {
                serializeWriter.writeNull();
            } else {
                DecimalFormat decimalFormat = this.decimalFormat;
                if (decimalFormat == null) {
                    str = Double.toString(doubleValue);
                    if (str.endsWith(".0")) {
                        str = str.substring(0, str.length() - 2);
                    }
                } else {
                    str = decimalFormat.format(doubleValue);
                }
                serializeWriter.append((CharSequence) str);
                if ((serializeWriter.features & SerializerFeature.WriteClassName.mask) != 0) {
                    serializeWriter.write(68);
                }
            }
        }
    }

    public NumberCodec(DecimalFormat decimalFormat) {
        this.decimalFormat = decimalFormat;
    }

    public NumberCodec(String str) {
        this(new DecimalFormat(str));
    }
}
