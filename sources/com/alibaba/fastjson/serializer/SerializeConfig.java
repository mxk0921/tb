package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONAware;
import com.alibaba.fastjson.JSONStreamAware;
import com.alibaba.fastjson.PropertyNamingStrategy;
import com.alibaba.fastjson.util.IdentityHashMap;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.AbstractSequentialList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SerializeConfig {
    public static final SerializeConfig globalInstance = new SerializeConfig();
    public PropertyNamingStrategy propertyNamingStrategy;
    private final IdentityHashMap<ObjectSerializer> serializers;
    protected String typeKey = JSON.DEFAULT_TYPE_KEY;

    public SerializeConfig() {
        IdentityHashMap<ObjectSerializer> identityHashMap = new IdentityHashMap<>(1024);
        this.serializers = identityHashMap;
        identityHashMap.put(Boolean.class, BooleanCodec.instance);
        MiscCodec miscCodec = MiscCodec.instance;
        identityHashMap.put(Character.class, miscCodec);
        identityHashMap.put(Byte.class, IntegerCodec.instance);
        identityHashMap.put(Short.class, IntegerCodec.instance);
        identityHashMap.put(Integer.class, IntegerCodec.instance);
        identityHashMap.put(Long.class, IntegerCodec.instance);
        NumberCodec numberCodec = NumberCodec.instance;
        identityHashMap.put(Float.class, numberCodec);
        identityHashMap.put(Double.class, numberCodec);
        identityHashMap.put(Number.class, numberCodec);
        BigDecimalCodec bigDecimalCodec = BigDecimalCodec.instance;
        identityHashMap.put(BigDecimal.class, bigDecimalCodec);
        identityHashMap.put(BigInteger.class, bigDecimalCodec);
        identityHashMap.put(String.class, StringCodec.instance);
        identityHashMap.put(Object[].class, ArrayCodec.instance);
        identityHashMap.put(Class.class, miscCodec);
        identityHashMap.put(SimpleDateFormat.class, miscCodec);
        identityHashMap.put(Locale.class, miscCodec);
        identityHashMap.put(Currency.class, miscCodec);
        identityHashMap.put(TimeZone.class, miscCodec);
        identityHashMap.put(UUID.class, miscCodec);
        identityHashMap.put(URI.class, miscCodec);
        identityHashMap.put(URL.class, miscCodec);
        identityHashMap.put(Pattern.class, miscCodec);
        identityHashMap.put(Charset.class, miscCodec);
    }

    public static final SerializeConfig getGlobalInstance() {
        return globalInstance;
    }

    public String getTypeKey() {
        return this.typeKey;
    }

    public boolean put(Type type, ObjectSerializer objectSerializer) {
        return this.serializers.put(type, objectSerializer);
    }

    public ObjectSerializer registerIfNotExists(Class<?> cls) {
        return registerIfNotExists(cls, cls.getModifiers(), false, true, true, true);
    }

    public void setTypeKey(String str) {
        this.typeKey = str;
    }

    public ObjectSerializer get(Class<?> cls) {
        MapSerializer mapSerializer;
        Class<? super Object> superclass;
        MiscCodec miscCodec;
        JavaBeanSerializer javaBeanSerializer;
        boolean z = true;
        ObjectSerializer objectSerializer = this.serializers.get(cls);
        if (objectSerializer != null) {
            return objectSerializer;
        }
        if (Map.class.isAssignableFrom(cls)) {
            IdentityHashMap<ObjectSerializer> identityHashMap = this.serializers;
            MapSerializer mapSerializer2 = new MapSerializer();
            identityHashMap.put(cls, mapSerializer2);
            mapSerializer = mapSerializer2;
        } else if (AbstractSequentialList.class.isAssignableFrom(cls)) {
            IdentityHashMap<ObjectSerializer> identityHashMap2 = this.serializers;
            CollectionCodec collectionCodec = CollectionCodec.instance;
            identityHashMap2.put(cls, collectionCodec);
            mapSerializer = collectionCodec;
        } else if (List.class.isAssignableFrom(cls)) {
            IdentityHashMap<ObjectSerializer> identityHashMap3 = this.serializers;
            ListSerializer listSerializer = new ListSerializer();
            identityHashMap3.put(cls, listSerializer);
            mapSerializer = listSerializer;
        } else if (Collection.class.isAssignableFrom(cls)) {
            IdentityHashMap<ObjectSerializer> identityHashMap4 = this.serializers;
            CollectionCodec collectionCodec2 = CollectionCodec.instance;
            identityHashMap4.put(cls, collectionCodec2);
            mapSerializer = collectionCodec2;
        } else if (Date.class.isAssignableFrom(cls)) {
            IdentityHashMap<ObjectSerializer> identityHashMap5 = this.serializers;
            DateCodec dateCodec = DateCodec.instance;
            identityHashMap5.put(cls, dateCodec);
            mapSerializer = dateCodec;
        } else if (JSONAware.class.isAssignableFrom(cls)) {
            IdentityHashMap<ObjectSerializer> identityHashMap6 = this.serializers;
            MiscCodec miscCodec2 = MiscCodec.instance;
            identityHashMap6.put(cls, miscCodec2);
            mapSerializer = miscCodec2;
        } else if (JSONSerializable.class.isAssignableFrom(cls)) {
            IdentityHashMap<ObjectSerializer> identityHashMap7 = this.serializers;
            MiscCodec miscCodec3 = MiscCodec.instance;
            identityHashMap7.put(cls, miscCodec3);
            mapSerializer = miscCodec3;
        } else if (JSONStreamAware.class.isAssignableFrom(cls)) {
            IdentityHashMap<ObjectSerializer> identityHashMap8 = this.serializers;
            MiscCodec miscCodec4 = MiscCodec.instance;
            identityHashMap8.put(cls, miscCodec4);
            mapSerializer = miscCodec4;
        } else if (cls.isEnum() || !((superclass = cls.getSuperclass()) == null || superclass == Object.class || !superclass.isEnum())) {
            IdentityHashMap<ObjectSerializer> identityHashMap9 = this.serializers;
            EnumSerializer enumSerializer = new EnumSerializer();
            identityHashMap9.put(cls, enumSerializer);
            mapSerializer = enumSerializer;
        } else if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            ObjectSerializer objectSerializer2 = get(componentType);
            IdentityHashMap<ObjectSerializer> identityHashMap10 = this.serializers;
            ArraySerializer arraySerializer = new ArraySerializer(componentType, objectSerializer2);
            identityHashMap10.put(cls, arraySerializer);
            mapSerializer = arraySerializer;
        } else {
            if (Throwable.class.isAssignableFrom(cls)) {
                JavaBeanSerializer javaBeanSerializer2 = new JavaBeanSerializer(cls, this.propertyNamingStrategy);
                javaBeanSerializer2.features |= SerializerFeature.WriteClassName.mask;
                this.serializers.put(cls, javaBeanSerializer2);
                javaBeanSerializer = javaBeanSerializer2;
            } else if (TimeZone.class.isAssignableFrom(cls)) {
                IdentityHashMap<ObjectSerializer> identityHashMap11 = this.serializers;
                MiscCodec miscCodec5 = MiscCodec.instance;
                identityHashMap11.put(cls, miscCodec5);
                mapSerializer = miscCodec5;
            } else if (Charset.class.isAssignableFrom(cls)) {
                IdentityHashMap<ObjectSerializer> identityHashMap12 = this.serializers;
                MiscCodec miscCodec6 = MiscCodec.instance;
                identityHashMap12.put(cls, miscCodec6);
                mapSerializer = miscCodec6;
            } else if (Enumeration.class.isAssignableFrom(cls)) {
                IdentityHashMap<ObjectSerializer> identityHashMap13 = this.serializers;
                MiscCodec miscCodec7 = MiscCodec.instance;
                identityHashMap13.put(cls, miscCodec7);
                mapSerializer = miscCodec7;
            } else if (Calendar.class.isAssignableFrom(cls)) {
                IdentityHashMap<ObjectSerializer> identityHashMap14 = this.serializers;
                DateCodec dateCodec2 = DateCodec.instance;
                identityHashMap14.put(cls, dateCodec2);
                mapSerializer = dateCodec2;
            } else {
                Class<?>[] interfaces = cls.getInterfaces();
                int length = interfaces.length;
                boolean z2 = false;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z = false;
                        break;
                    }
                    Class<?> cls2 = interfaces[i];
                    if (cls2.getName().equals("net.sf.cglib.proxy.Factory") || cls2.getName().equals("org.springframework.cglib.proxy.Factory")) {
                        break;
                    } else if (cls2.getName().equals("javassist.util.proxy.ProxyObject")) {
                        z = false;
                        z2 = true;
                        break;
                    } else {
                        i++;
                    }
                }
                if (z || z2) {
                    ObjectSerializer objectSerializer3 = get(cls.getSuperclass());
                    this.serializers.put(cls, objectSerializer3);
                    return objectSerializer3;
                }
                if (cls.getName().startsWith("android.net.Uri$")) {
                    miscCodec = MiscCodec.instance;
                } else {
                    miscCodec = new JavaBeanSerializer(cls, this.propertyNamingStrategy);
                }
                this.serializers.put(cls, miscCodec);
                javaBeanSerializer = miscCodec;
            }
            mapSerializer = javaBeanSerializer;
        }
        return mapSerializer == null ? this.serializers.get(cls) : mapSerializer;
    }

    public ObjectSerializer registerIfNotExists(Class<?> cls, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        ObjectSerializer objectSerializer = this.serializers.get(cls);
        if (objectSerializer != null) {
            return objectSerializer;
        }
        JavaBeanSerializer javaBeanSerializer = new JavaBeanSerializer(cls, i, null, z, z2, z3, z4, this.propertyNamingStrategy);
        this.serializers.put(cls, javaBeanSerializer);
        return javaBeanSerializer;
    }
}
