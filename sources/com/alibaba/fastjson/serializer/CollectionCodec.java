package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.alibaba.fastjson.util.TypeUtils;
import com.taobao.media.MediaConstant;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;
import tb.pg1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class CollectionCodec implements ObjectSerializer, ObjectDeserializer {
    public static final CollectionCodec instance = new CollectionCodec();

    private CollectionCodec() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.alibaba.fastjson.parser.DefaultJSONParser] */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.alibaba.fastjson.JSONArray, T, java.util.Collection] */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <T> T deserialze(com.alibaba.fastjson.parser.DefaultJSONParser r3, java.lang.reflect.Type r4, java.lang.Object r5) {
        /*
            r2 = this;
            com.alibaba.fastjson.parser.JSONLexer r0 = r3.lexer
            int r0 = r0.token()
            r1 = 8
            if (r0 != r1) goto L_0x0013
            com.alibaba.fastjson.parser.JSONLexer r3 = r3.lexer
            r4 = 16
            r3.nextToken(r4)
            r3 = 0
            return r3
        L_0x0013:
            java.lang.Class<com.alibaba.fastjson.JSONArray> r0 = com.alibaba.fastjson.JSONArray.class
            if (r4 != r0) goto L_0x0020
            com.alibaba.fastjson.JSONArray r4 = new com.alibaba.fastjson.JSONArray
            r4.<init>()
            r3.parseArray(r4)
            return r4
        L_0x0020:
            r0 = r4
        L_0x0021:
            boolean r1 = r0 instanceof java.lang.Class
            if (r1 == 0) goto L_0x00af
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.Class<java.util.AbstractCollection> r1 = java.util.AbstractCollection.class
            if (r0 == r1) goto L_0x00a2
            java.lang.Class<java.util.Collection> r1 = java.util.Collection.class
            if (r0 != r1) goto L_0x0031
            goto L_0x00a2
        L_0x0031:
            java.lang.Class<java.util.HashSet> r1 = java.util.HashSet.class
            boolean r1 = r0.isAssignableFrom(r1)
            if (r1 == 0) goto L_0x003f
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            goto L_0x00a7
        L_0x003f:
            java.lang.Class<java.util.LinkedHashSet> r1 = java.util.LinkedHashSet.class
            boolean r1 = r0.isAssignableFrom(r1)
            if (r1 == 0) goto L_0x004d
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            goto L_0x00a7
        L_0x004d:
            java.lang.Class<java.util.TreeSet> r1 = java.util.TreeSet.class
            boolean r1 = r0.isAssignableFrom(r1)
            if (r1 == 0) goto L_0x005b
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>()
            goto L_0x00a7
        L_0x005b:
            java.lang.Class<java.util.ArrayList> r1 = java.util.ArrayList.class
            boolean r1 = r0.isAssignableFrom(r1)
            if (r1 == 0) goto L_0x0069
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            goto L_0x00a7
        L_0x0069:
            java.lang.Class<java.util.EnumSet> r1 = java.util.EnumSet.class
            boolean r1 = r0.isAssignableFrom(r1)
            if (r1 == 0) goto L_0x0089
            boolean r0 = r4 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L_0x0080
            r0 = r4
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.lang.reflect.Type[] r0 = r0.getActualTypeArguments()
            r1 = 0
            r0 = r0[r1]
            goto L_0x0082
        L_0x0080:
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
        L_0x0082:
            java.lang.Class r0 = (java.lang.Class) r0
            java.util.EnumSet r0 = java.util.EnumSet.noneOf(r0)
            goto L_0x00a7
        L_0x0089:
            java.lang.Object r1 = r0.newInstance()     // Catch: Exception -> 0x0091
            java.util.Collection r1 = (java.util.Collection) r1     // Catch: Exception -> 0x0091
            r0 = r1
            goto L_0x00a7
        L_0x0091:
            com.alibaba.fastjson.JSONException r3 = new com.alibaba.fastjson.JSONException
            java.lang.String r4 = r0.getName()
            java.lang.String r5 = "create instane error, class "
            java.lang.String r4 = r5.concat(r4)
            r3.<init>(r4)
            throw r3
        L_0x00a2:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x00a7:
            java.lang.reflect.Type r4 = com.alibaba.fastjson.util.TypeUtils.getCollectionItemType(r4)
            r3.parseArray(r4, r0, r5)
            return r0
        L_0x00af:
            boolean r1 = r0 instanceof java.lang.reflect.ParameterizedType
            if (r1 == 0) goto L_0x00bb
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.lang.reflect.Type r0 = r0.getRawType()
            goto L_0x0021
        L_0x00bb:
            com.alibaba.fastjson.JSONException r3 = new com.alibaba.fastjson.JSONException
            java.lang.String r4 = "TODO"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.serializer.CollectionCodec.deserialze(com.alibaba.fastjson.parser.DefaultJSONParser, java.lang.reflect.Type, java.lang.Object):java.lang.Object");
    }

    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public void write(JSONSerializer jSONSerializer, Object obj, Object obj2, Type type) throws IOException {
        Type type2;
        SerializeWriter serializeWriter = jSONSerializer.out;
        if (obj != null) {
            int i = serializeWriter.features;
            SerializerFeature serializerFeature = SerializerFeature.WriteClassName;
            if ((i & serializerFeature.mask) != 0) {
                type2 = TypeUtils.getCollectionItemType(type);
            } else {
                type2 = null;
            }
            Collection collection = (Collection) obj;
            SerialContext serialContext = jSONSerializer.context;
            int i2 = 0;
            jSONSerializer.setContext(serialContext, obj, obj2, 0);
            if ((serializeWriter.features & serializerFeature.mask) != 0) {
                if (HashSet.class == collection.getClass()) {
                    serializeWriter.append((CharSequence) pg1.ATOM_Set);
                } else if (TreeSet.class == collection.getClass()) {
                    serializeWriter.append((CharSequence) "TreeSet");
                }
            }
            try {
                serializeWriter.write(91);
                for (Object obj3 : collection) {
                    int i3 = i2 + 1;
                    if (i2 != 0) {
                        serializeWriter.write(44);
                    }
                    if (obj3 == null) {
                        serializeWriter.writeNull();
                    } else {
                        Class<?> cls = obj3.getClass();
                        if (cls == Integer.class) {
                            serializeWriter.writeInt(((Integer) obj3).intValue());
                        } else if (cls == Long.class) {
                            serializeWriter.writeLong(((Long) obj3).longValue());
                            if ((serializeWriter.features & SerializerFeature.WriteClassName.mask) != 0) {
                                serializeWriter.write(76);
                            }
                        } else {
                            jSONSerializer.config.get(cls).write(jSONSerializer, obj3, Integer.valueOf(i2), type2);
                        }
                    }
                    i2 = i3;
                }
                serializeWriter.write(93);
                jSONSerializer.context = serialContext;
            } catch (Throwable th) {
                jSONSerializer.context = serialContext;
                throw th;
            }
        } else if ((serializeWriter.features & SerializerFeature.WriteNullListAsEmpty.mask) != 0) {
            serializeWriter.write(MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264);
        } else {
            serializeWriter.writeNull();
        }
    }
}
