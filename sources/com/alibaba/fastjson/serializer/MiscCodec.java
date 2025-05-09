package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONAware;
import com.alibaba.fastjson.JSONStreamAware;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.alibaba.fastjson.util.TypeUtils;
import com.taobao.media.MediaConstant;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Currency;
import java.util.Enumeration;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class MiscCodec implements ObjectSerializer, ObjectDeserializer {
    public static final MiscCodec instance = new MiscCodec();

    private MiscCodec() {
    }

    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public void write(JSONSerializer jSONSerializer, Object obj, Object obj2, Type type) throws IOException {
        SerializeWriter serializeWriter = jSONSerializer.out;
        if (obj == null) {
            if (type == Character.TYPE || type == Character.class) {
                jSONSerializer.write("");
            } else if ((serializeWriter.features & SerializerFeature.WriteNullListAsEmpty.mask) == 0 || !Enumeration.class.isAssignableFrom(TypeUtils.getClass(type))) {
                serializeWriter.writeNull();
            } else {
                serializeWriter.write(MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264);
            }
        } else if (obj instanceof Pattern) {
            jSONSerializer.write(((Pattern) obj).pattern());
        } else if (obj instanceof TimeZone) {
            jSONSerializer.write(((TimeZone) obj).getID());
        } else if (obj instanceof Currency) {
            jSONSerializer.write(((Currency) obj).getCurrencyCode());
        } else if (obj instanceof Class) {
            jSONSerializer.write(((Class) obj).getName());
        } else if (obj instanceof Character) {
            Character ch = (Character) obj;
            if (ch.charValue() == 0) {
                jSONSerializer.write("\u0000");
            } else {
                jSONSerializer.write(ch.toString());
            }
        } else {
            int i = 0;
            if (obj instanceof SimpleDateFormat) {
                String pattern = ((SimpleDateFormat) obj).toPattern();
                if ((serializeWriter.features & SerializerFeature.WriteClassName.mask) == 0 || obj.getClass() == type) {
                    serializeWriter.writeString(pattern);
                    return;
                }
                serializeWriter.write(123);
                serializeWriter.writeFieldName(JSON.DEFAULT_TYPE_KEY, false);
                jSONSerializer.write(obj.getClass().getName());
                serializeWriter.write(44);
                serializeWriter.writeFieldName("val", false);
                serializeWriter.writeString(pattern);
                serializeWriter.write(125);
            } else if (obj instanceof JSONStreamAware) {
                ((JSONStreamAware) obj).writeJSONString(serializeWriter);
            } else if (obj instanceof JSONAware) {
                serializeWriter.write(((JSONAware) obj).toJSONString());
            } else if (obj instanceof JSONSerializable) {
                ((JSONSerializable) obj).write(jSONSerializer, obj2, type);
            } else if (obj instanceof Enumeration) {
                Type type2 = ((serializeWriter.features & SerializerFeature.WriteClassName.mask) == 0 || !(type instanceof ParameterizedType)) ? null : ((ParameterizedType) type).getActualTypeArguments()[0];
                Enumeration enumeration = (Enumeration) obj;
                SerialContext serialContext = jSONSerializer.context;
                jSONSerializer.setContext(serialContext, obj, obj2, 0);
                try {
                    serializeWriter.write(91);
                    while (enumeration.hasMoreElements()) {
                        Object nextElement = enumeration.nextElement();
                        i++;
                        if (i != 0) {
                            serializeWriter.write(44);
                        }
                        if (nextElement == null) {
                            serializeWriter.writeNull();
                        } else {
                            jSONSerializer.config.get(nextElement.getClass()).write(jSONSerializer, nextElement, Integer.valueOf(i), type2);
                        }
                    }
                    serializeWriter.write(93);
                    jSONSerializer.context = serialContext;
                } catch (Throwable th) {
                    jSONSerializer.context = serialContext;
                    throw th;
                }
            } else {
                jSONSerializer.write(obj.toString());
            }
        }
    }

    /* JADX WARN: Type inference failed for: r8v8, types: [T, java.text.SimpleDateFormat, java.text.DateFormat] */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <T> T deserialze(com.alibaba.fastjson.parser.DefaultJSONParser r7, java.lang.reflect.Type r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.serializer.MiscCodec.deserialze(com.alibaba.fastjson.parser.DefaultJSONParser, java.lang.reflect.Type, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0160, code lost:
        return (T) new java.lang.StackTraceElement(r5, r7, r8, r9);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <T> T parseStackTraceElement(com.alibaba.fastjson.parser.DefaultJSONParser r17) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.serializer.MiscCodec.parseStackTraceElement(com.alibaba.fastjson.parser.DefaultJSONParser):java.lang.Object");
    }
}
