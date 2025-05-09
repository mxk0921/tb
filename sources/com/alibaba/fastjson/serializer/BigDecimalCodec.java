package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import java.io.IOException;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class BigDecimalCodec implements ObjectSerializer, ObjectDeserializer {
    public static final BigDecimalCodec instance = new BigDecimalCodec();

    private BigDecimalCodec() {
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.math.BigDecimal, T] */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <T> T deserialze(com.alibaba.fastjson.parser.DefaultJSONParser r5, java.lang.reflect.Type r6, java.lang.Object r7) {
        /*
            r4 = this;
            com.alibaba.fastjson.parser.JSONLexer r7 = r5.lexer
            int r0 = r7.token()
            r1 = 2
            r2 = 16
            java.lang.Class<java.math.BigInteger> r3 = java.math.BigInteger.class
            if (r0 != r1) goto L_0x0026
            if (r6 != r3) goto L_0x001e
            java.lang.String r5 = r7.numberString()
            r7.nextToken(r2)
            java.math.BigInteger r6 = new java.math.BigInteger
            r7 = 10
            r6.<init>(r5, r7)
            return r6
        L_0x001e:
            java.math.BigDecimal r5 = r7.decimalValue()
            r7.nextToken(r2)
            return r5
        L_0x0026:
            r1 = 3
            if (r0 != r1) goto L_0x0037
            java.math.BigDecimal r5 = r7.decimalValue()
            r7.nextToken(r2)
            if (r6 != r3) goto L_0x0036
            java.math.BigInteger r5 = r5.toBigInteger()
        L_0x0036:
            return r5
        L_0x0037:
            java.lang.Object r5 = r5.parse()
            if (r5 != 0) goto L_0x003f
            r5 = 0
            return r5
        L_0x003f:
            if (r6 != r3) goto L_0x0046
            java.math.BigInteger r5 = com.alibaba.fastjson.util.TypeUtils.castToBigInteger(r5)
            return r5
        L_0x0046:
            java.math.BigDecimal r5 = com.alibaba.fastjson.util.TypeUtils.castToBigDecimal(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.serializer.BigDecimalCodec.deserialze(com.alibaba.fastjson.parser.DefaultJSONParser, java.lang.reflect.Type, java.lang.Object):java.lang.Object");
    }

    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public void write(JSONSerializer jSONSerializer, Object obj, Object obj2, Type type) throws IOException {
        SerializeWriter serializeWriter = jSONSerializer.out;
        if (obj == null) {
            if ((serializeWriter.features & SerializerFeature.WriteNullNumberAsZero.mask) != 0) {
                serializeWriter.write(48);
            } else {
                serializeWriter.writeNull();
            }
        } else if (obj instanceof BigInteger) {
            serializeWriter.write(((BigInteger) obj).toString());
        } else {
            BigDecimal bigDecimal = (BigDecimal) obj;
            serializeWriter.write(bigDecimal.toString());
            if ((serializeWriter.features & SerializerFeature.WriteClassName.mask) != 0 && type != BigDecimal.class && bigDecimal.scale() == 0) {
                serializeWriter.write(46);
            }
        }
    }
}
