package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import java.io.IOException;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class DateCodec implements ObjectSerializer, ObjectDeserializer {
    public static final DateCodec instance = new DateCodec();

    private DateCodec() {
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(DefaultJSONParser defaultJSONParser, Type type, Object obj) {
        return (T) deserialze(defaultJSONParser, type, obj, null);
    }

    /* JADX WARN: Type inference failed for: r13v4, types: [java.util.Calendar, T] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.util.Calendar, T] */
    /* JADX WARN: Unknown variable types count: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <T> T deserialze(com.alibaba.fastjson.parser.DefaultJSONParser r12, java.lang.reflect.Type r13, java.lang.Object r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.serializer.DateCodec.deserialze(com.alibaba.fastjson.parser.DefaultJSONParser, java.lang.reflect.Type, java.lang.Object, java.lang.String):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.Calendar, T] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <T> T cast(com.alibaba.fastjson.parser.DefaultJSONParser r3, java.lang.reflect.Type r4, java.lang.Object r5, java.lang.Object r6, java.lang.String r7) {
        /*
            r2 = this;
            r5 = 0
            if (r6 != 0) goto L_0x0004
            return r5
        L_0x0004:
            boolean r0 = r6 instanceof java.util.Date
            if (r0 == 0) goto L_0x0009
            return r6
        L_0x0009:
            boolean r0 = r6 instanceof java.lang.Number
            if (r0 == 0) goto L_0x0019
            java.util.Date r3 = new java.util.Date
            java.lang.Number r6 = (java.lang.Number) r6
            long r4 = r6.longValue()
            r3.<init>(r4)
            return r3
        L_0x0019:
            boolean r0 = r6 instanceof java.lang.String
            if (r0 == 0) goto L_0x0081
            java.lang.String r6 = (java.lang.String) r6
            int r0 = r6.length()
            if (r0 != 0) goto L_0x0026
            return r5
        L_0x0026:
            com.alibaba.fastjson.parser.JSONLexer r0 = new com.alibaba.fastjson.parser.JSONLexer
            r0.<init>(r6)
            r1 = 0
            boolean r1 = r0.scanISO8601DateIfMatch(r1)     // Catch: all -> 0x0044
            if (r1 == 0) goto L_0x0046
            java.util.Calendar r3 = r0.calendar     // Catch: all -> 0x0044
            java.lang.Class<java.util.Calendar> r5 = java.util.Calendar.class
            if (r4 != r5) goto L_0x003c
            r0.close()
            return r3
        L_0x003c:
            java.util.Date r3 = r3.getTime()     // Catch: all -> 0x0044
            r0.close()
            return r3
        L_0x0044:
            r3 = move-exception
            goto L_0x007d
        L_0x0046:
            r0.close()
            java.lang.String r4 = "0000-00-00"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x007c
            java.lang.String r4 = "0000-00-00T00:00:00"
            boolean r4 = r4.equalsIgnoreCase(r6)
            if (r4 != 0) goto L_0x007c
            java.lang.String r4 = "0001-01-01T00:00:00+08:00"
            boolean r4 = r4.equalsIgnoreCase(r6)
            if (r4 == 0) goto L_0x0062
            goto L_0x007c
        L_0x0062:
            if (r7 == 0) goto L_0x006a
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat
            r3.<init>(r7)
            goto L_0x006e
        L_0x006a:
            java.text.DateFormat r3 = r3.getDateFormat()
        L_0x006e:
            java.util.Date r3 = r3.parse(r6)     // Catch: ParseException -> 0x0073
            return r3
        L_0x0073:
            long r3 = java.lang.Long.parseLong(r6)
            java.util.Date r5 = new java.util.Date
            r5.<init>(r3)
        L_0x007c:
            return r5
        L_0x007d:
            r0.close()
            throw r3
        L_0x0081:
            com.alibaba.fastjson.JSONException r3 = new com.alibaba.fastjson.JSONException
            java.lang.String r4 = "parse error"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.serializer.DateCodec.cast(com.alibaba.fastjson.parser.DefaultJSONParser, java.lang.reflect.Type, java.lang.Object, java.lang.Object, java.lang.String):java.lang.Object");
    }

    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public void write(JSONSerializer jSONSerializer, Object obj, Object obj2, Type type) throws IOException {
        Date date;
        char[] cArr;
        SerializeWriter serializeWriter = jSONSerializer.out;
        if (obj == null) {
            serializeWriter.writeNull();
        } else if ((serializeWriter.features & SerializerFeature.WriteClassName.mask) == 0 || obj.getClass() == type) {
            if (obj instanceof Calendar) {
                date = ((Calendar) obj).getTime();
            } else {
                date = (Date) obj;
            }
            if ((serializeWriter.features & SerializerFeature.WriteDateUseDateFormat.mask) != 0) {
                DateFormat dateFormat = jSONSerializer.getDateFormat();
                if (dateFormat == null) {
                    dateFormat = new SimpleDateFormat(JSON.DEFFAULT_DATE_FORMAT, jSONSerializer.locale);
                    dateFormat.setTimeZone(jSONSerializer.timeZone);
                }
                serializeWriter.writeString(dateFormat.format(date));
                return;
            }
            long time = date.getTime();
            int i = serializeWriter.features;
            if ((SerializerFeature.UseISO8601DateFormat.mask & i) != 0) {
                SerializerFeature serializerFeature = SerializerFeature.UseSingleQuotes;
                if ((i & serializerFeature.mask) != 0) {
                    serializeWriter.write(39);
                } else {
                    serializeWriter.write(34);
                }
                Calendar instance2 = Calendar.getInstance(jSONSerializer.timeZone, jSONSerializer.locale);
                instance2.setTimeInMillis(time);
                int i2 = instance2.get(1);
                int i3 = instance2.get(2) + 1;
                int i4 = instance2.get(5);
                int i5 = instance2.get(11);
                int i6 = instance2.get(12);
                int i7 = instance2.get(13);
                int i8 = instance2.get(14);
                if (i8 != 0) {
                    cArr = "0000-00-00T00:00:00.000".toCharArray();
                    SerializeWriter.getChars(i8, 23, cArr);
                    SerializeWriter.getChars(i7, 19, cArr);
                    SerializeWriter.getChars(i6, 16, cArr);
                    SerializeWriter.getChars(i5, 13, cArr);
                    SerializeWriter.getChars(i4, 10, cArr);
                    SerializeWriter.getChars(i3, 7, cArr);
                    SerializeWriter.getChars(i2, 4, cArr);
                } else if (i7 == 0 && i6 == 0 && i5 == 0) {
                    cArr = "0000-00-00".toCharArray();
                    SerializeWriter.getChars(i4, 10, cArr);
                    SerializeWriter.getChars(i3, 7, cArr);
                    SerializeWriter.getChars(i2, 4, cArr);
                } else {
                    cArr = "0000-00-00T00:00:00".toCharArray();
                    SerializeWriter.getChars(i7, 19, cArr);
                    SerializeWriter.getChars(i6, 16, cArr);
                    SerializeWriter.getChars(i5, 13, cArr);
                    SerializeWriter.getChars(i4, 10, cArr);
                    SerializeWriter.getChars(i3, 7, cArr);
                    SerializeWriter.getChars(i2, 4, cArr);
                }
                serializeWriter.write(cArr);
                if ((serializeWriter.features & serializerFeature.mask) != 0) {
                    serializeWriter.write(39);
                } else {
                    serializeWriter.write(34);
                }
            } else {
                serializeWriter.writeLong(time);
            }
        } else if (obj.getClass() == Date.class) {
            serializeWriter.write("new Date(");
            serializeWriter.writeLong(((Date) obj).getTime());
            serializeWriter.write(41);
        } else {
            serializeWriter.write(123);
            serializeWriter.writeFieldName(JSON.DEFAULT_TYPE_KEY, false);
            jSONSerializer.write(obj.getClass().getName());
            serializeWriter.write(44);
            serializeWriter.writeFieldName("val", false);
            serializeWriter.writeLong(((Date) obj).getTime());
            serializeWriter.write(125);
        }
    }
}
