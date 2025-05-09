package com.alipay.literpc.jsoncodec.codec;

import com.alipay.literpc.jsoncodec.util.ClassUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import tb.erf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MapCodec implements ObjectDeserializer, ObjectSerializer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public Map<Object, Object> createMap(Type type) {
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
        if (type instanceof ParameterizedType) {
            return createMap(((ParameterizedType) type).getRawType());
        }
        Class cls = (Class) type;
        if (!cls.isInterface()) {
            try {
                return (Map) cls.newInstance();
            } catch (Exception e) {
                throw new IllegalArgumentException("unsupport type " + type, e);
            }
        } else {
            throw new IllegalArgumentException("unsupport type " + type);
        }
    }

    @Override // com.alipay.literpc.jsoncodec.codec.ObjectDeserializer
    public Object deserialize(Object obj, Type type) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("82aa5401", new Object[]{this, obj, type});
        }
        if (!obj.getClass().equals(erf.class)) {
            return null;
        }
        erf erfVar = (erf) obj;
        Map<Object, Object> createMap = createMap(type);
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type type2 = parameterizedType.getActualTypeArguments()[0];
            Type type3 = parameterizedType.getActualTypeArguments()[1];
            if (String.class == type2) {
                Iterator c = erfVar.c();
                while (c.hasNext()) {
                    String str = (String) c.next();
                    if (ClassUtil.isSimpleType((Class) type3)) {
                        createMap.put(str, erfVar.a(str));
                    } else {
                        createMap.put(str, JSONDeserializer.deserialize0(erfVar.a(str), type3));
                    }
                }
                return createMap;
            }
            throw new IllegalArgumentException("Deserialize Map Key must be String.class");
        }
        throw new IllegalArgumentException("Deserialize Map must be Generics!");
    }

    @Override // com.alipay.literpc.jsoncodec.codec.ObjectDeserializer, com.alipay.literpc.jsoncodec.codec.ObjectSerializer
    public boolean match(Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("905af4f5", new Object[]{this, cls})).booleanValue();
        }
        return Map.class.isAssignableFrom(cls);
    }

    @Override // com.alipay.literpc.jsoncodec.codec.ObjectSerializer
    public Object serialize(Object obj) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("e67aae0f", new Object[]{this, obj});
        }
        TreeMap treeMap = new TreeMap();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            if (entry.getKey() instanceof String) {
                treeMap.put((String) entry.getKey(), JSONSerializer.serializeToSimpleObject(entry.getValue()));
            } else {
                throw new IllegalArgumentException("Map key must be String!");
            }
        }
        return treeMap;
    }
}
