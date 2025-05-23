package com.alibaba.fastjson.parser;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import tb.f7l;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class MapDeserializer implements ObjectDeserializer {
    public static MapDeserializer instance = new MapDeserializer();

    /* JADX WARN: Code restructure failed: missing block: B:67:0x012b, code lost:
        return r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Map parseMap(com.alibaba.fastjson.parser.DefaultJSONParser r9, java.util.Map<java.lang.String, java.lang.Object> r10, java.lang.reflect.Type r11, java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.MapDeserializer.parseMap(com.alibaba.fastjson.parser.DefaultJSONParser, java.util.Map, java.lang.reflect.Type, java.lang.Object):java.util.Map");
    }

    public Map<?, ?> createMap(Type type) {
        if (type == Properties.class) {
            return new Properties();
        }
        if (type == Hashtable.class) {
            return new Hashtable();
        }
        if (type == IdentityHashMap.class) {
            return new IdentityHashMap();
        }
        if (type == SortedMap.class || type == TreeMap.class) {
            return new TreeMap();
        }
        if (type == ConcurrentMap.class || type == ConcurrentHashMap.class) {
            return new ConcurrentHashMap();
        }
        if (type == Map.class || type == HashMap.class) {
            return new HashMap();
        }
        if (type == LinkedHashMap.class) {
            return new LinkedHashMap();
        }
        if (type == JSONObject.class) {
            return new JSONObject();
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type rawType = parameterizedType.getRawType();
            if (EnumMap.class.equals(rawType)) {
                return new EnumMap((Class) parameterizedType.getActualTypeArguments()[0]);
            }
            return createMap(rawType);
        }
        Class cls = (Class) type;
        if (!cls.isInterface()) {
            try {
                return (Map) cls.newInstance();
            } catch (Exception e) {
                throw new JSONException("unsupport type " + type, e);
            }
        } else {
            throw new JSONException("unsupport type " + type);
        }
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(DefaultJSONParser defaultJSONParser, Type type, Object obj) {
        if (type == JSONObject.class && defaultJSONParser.fieldTypeResolver == null) {
            return (T) defaultJSONParser.parseObject();
        }
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        if (jSONLexer.token == 8) {
            jSONLexer.nextToken(16);
            return null;
        }
        Map<?, ?> createMap = createMap(type);
        ParseContext parseContext = defaultJSONParser.contex;
        try {
            defaultJSONParser.setContext(parseContext, createMap, obj);
            if (!(type instanceof ParameterizedType)) {
                return (T) defaultJSONParser.parseObject(createMap, obj);
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type type2 = parameterizedType.getActualTypeArguments()[0];
            Type type3 = parameterizedType.getActualTypeArguments()[1];
            if (String.class == type2) {
                return (T) parseMap(defaultJSONParser, createMap, type3, obj);
            }
            return (T) parseMap(defaultJSONParser, createMap, type2, type3, obj);
        } finally {
            defaultJSONParser.setContext(parseContext);
        }
    }

    public static Object parseMap(DefaultJSONParser defaultJSONParser, Map<Object, Object> map, Type type, Type type2, Object obj) {
        Object obj2;
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        int i = jSONLexer.token;
        int i2 = 16;
        if (i == 12 || i == 16) {
            ObjectDeserializer deserializer = defaultJSONParser.config.getDeserializer(type);
            ObjectDeserializer deserializer2 = defaultJSONParser.config.getDeserializer(type2);
            jSONLexer.nextToken();
            ParseContext parseContext = defaultJSONParser.contex;
            while (true) {
                try {
                    int i3 = jSONLexer.token;
                    if (i3 == 13) {
                        jSONLexer.nextToken(i2);
                        return map;
                    } else if (i3 != 4 || jSONLexer.sp != 4 || !jSONLexer.text.startsWith("$ref", jSONLexer.np + 1) || jSONLexer.isEnabled(Feature.DisableSpecialKeyDetect)) {
                        if (map.size() == 0 && i3 == 4 && JSON.DEFAULT_TYPE_KEY.equals(jSONLexer.stringVal()) && !jSONLexer.isEnabled(Feature.DisableSpecialKeyDetect)) {
                            jSONLexer.nextTokenWithChar(f7l.CONDITION_IF_MIDDLE);
                            jSONLexer.nextToken(16);
                            if (jSONLexer.token == 13) {
                                jSONLexer.nextToken();
                                return map;
                            }
                            jSONLexer.nextToken();
                        }
                        Object deserialze = deserializer.deserialze(defaultJSONParser, type, null);
                        if (jSONLexer.token == 17) {
                            jSONLexer.nextToken();
                            Object deserialze2 = deserializer2.deserialze(defaultJSONParser, type2, deserialze);
                            if (defaultJSONParser.resolveStatus == 1) {
                                defaultJSONParser.checkMapResolve(map, deserialze);
                            }
                            map.put(deserialze, deserialze2);
                            if (jSONLexer.token == 16) {
                                jSONLexer.nextToken();
                            }
                            i2 = 16;
                        } else {
                            throw new JSONException("syntax error, expect :, actual " + jSONLexer.token);
                        }
                    } else {
                        jSONLexer.nextTokenWithChar(f7l.CONDITION_IF_MIDDLE);
                        if (jSONLexer.token == 4) {
                            String stringVal = jSONLexer.stringVal();
                            if ("..".equals(stringVal)) {
                                obj2 = parseContext.parent.object;
                            } else if ("$".equals(stringVal)) {
                                ParseContext parseContext2 = parseContext;
                                while (true) {
                                    ParseContext parseContext3 = parseContext2.parent;
                                    if (parseContext3 == null) {
                                        break;
                                    }
                                    parseContext2 = parseContext3;
                                }
                                obj2 = parseContext2.object;
                            } else {
                                defaultJSONParser.addResolveTask(new DefaultJSONParser.ResolveTask(parseContext, stringVal));
                                defaultJSONParser.resolveStatus = 1;
                                obj2 = null;
                            }
                            jSONLexer.nextToken(13);
                            if (jSONLexer.token == 13) {
                                jSONLexer.nextToken(16);
                                return obj2;
                            }
                            throw new JSONException("illegal ref");
                        }
                        throw new JSONException("illegal ref, " + JSONToken.name(i3));
                    }
                } finally {
                    defaultJSONParser.setContext(parseContext);
                }
            }
        } else {
            throw new JSONException("syntax error, expect {, actual " + JSONToken.name(i));
        }
    }
}
