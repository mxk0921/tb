package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class MapSerializer implements ObjectSerializer {
    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public void write(JSONSerializer jSONSerializer, Object obj, Object obj2, Type type) throws IOException {
        boolean z;
        boolean z2;
        Object processKey;
        Object processValue;
        SerializeWriter serializeWriter = jSONSerializer.out;
        if (obj == null) {
            serializeWriter.writeNull();
            return;
        }
        Map<String, Object> map = (Map) obj;
        Class<?> cls = map.getClass();
        if ((cls == JSONObject.class || cls == HashMap.class || cls == LinkedHashMap.class) && map.containsKey(JSON.DEFAULT_TYPE_KEY)) {
            z = true;
        } else {
            z = false;
        }
        if ((serializeWriter.features & SerializerFeature.SortField.mask) != 0) {
            if (map instanceof JSONObject) {
                map = ((JSONObject) map).getInnerMap();
            }
            if (!(map instanceof SortedMap) && !(map instanceof LinkedHashMap)) {
                try {
                    map = new TreeMap(map);
                } catch (Exception unused) {
                }
            }
        }
        IdentityHashMap<Object, SerialContext> identityHashMap = jSONSerializer.references;
        if (identityHashMap == null || !identityHashMap.containsKey(obj)) {
            SerialContext serialContext = jSONSerializer.context;
            jSONSerializer.setContext(serialContext, obj, obj2, 0);
            try {
                serializeWriter.write(123);
                jSONSerializer.incrementIndent();
                if ((serializeWriter.features & SerializerFeature.WriteClassName.mask) == 0 || z) {
                    z2 = true;
                } else {
                    serializeWriter.writeFieldName(jSONSerializer.config.typeKey, false);
                    serializeWriter.writeString(obj.getClass().getName());
                    z2 = false;
                }
                Class<?> cls2 = null;
                ObjectSerializer objectSerializer = null;
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    Object value = entry.getValue();
                    String key = entry.getKey();
                    if (jSONSerializer.applyName(obj, key) && jSONSerializer.apply(obj, key, value) && !((processValue = JSONSerializer.processValue(jSONSerializer, obj, (processKey = jSONSerializer.processKey(obj, key, value)), value)) == null && (serializeWriter.features & SerializerFeature.WriteMapNullValue.mask) == 0)) {
                        if (processKey instanceof String) {
                            String str = (String) processKey;
                            if (!z2) {
                                serializeWriter.write(44);
                            }
                            if ((serializeWriter.features & SerializerFeature.PrettyFormat.mask) != 0) {
                                jSONSerializer.println();
                            }
                            serializeWriter.writeFieldName(str, true);
                        } else {
                            if (!z2) {
                                serializeWriter.write(44);
                            }
                            if ((serializeWriter.features & SerializerFeature.WriteNonStringKeyAsString.mask) == 0 || (processKey instanceof Enum)) {
                                jSONSerializer.write(processKey);
                            } else {
                                jSONSerializer.write(JSON.toJSONString(processKey));
                            }
                            serializeWriter.write(58);
                        }
                        if (processValue == null) {
                            serializeWriter.writeNull();
                        } else {
                            Class<?> cls3 = processValue.getClass();
                            if (cls3 == cls2) {
                                objectSerializer.write(jSONSerializer, processValue, processKey, null);
                            } else {
                                ObjectSerializer objectSerializer2 = jSONSerializer.config.get(cls3);
                                objectSerializer2.write(jSONSerializer, processValue, processKey, null);
                                objectSerializer = objectSerializer2;
                                cls2 = cls3;
                            }
                        }
                        z2 = false;
                    }
                }
                jSONSerializer.context = serialContext;
                jSONSerializer.decrementIdent();
                if ((serializeWriter.features & SerializerFeature.PrettyFormat.mask) != 0 && map.size() > 0) {
                    jSONSerializer.println();
                }
                serializeWriter.write(125);
            } catch (Throwable th) {
                jSONSerializer.context = serialContext;
                throw th;
            }
        } else {
            jSONSerializer.writeReference(obj);
        }
    }
}
