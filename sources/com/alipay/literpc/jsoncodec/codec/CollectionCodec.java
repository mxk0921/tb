package com.alipay.literpc.jsoncodec.codec;

import com.alipay.literpc.jsoncodec.util.ClassUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import tb.xqf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class CollectionCodec implements ObjectDeserializer, ObjectSerializer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static Collection<Object> a(Class<?> cls, Type type) {
        Type type2;
        if (cls == AbstractCollection.class) {
            return new ArrayList();
        }
        if (cls.isAssignableFrom(HashSet.class)) {
            return new HashSet();
        }
        if (cls.isAssignableFrom(LinkedHashSet.class)) {
            return new LinkedHashSet();
        }
        if (cls.isAssignableFrom(TreeSet.class)) {
            return new TreeSet();
        }
        if (cls.isAssignableFrom(ArrayList.class)) {
            return new ArrayList();
        }
        if (cls.isAssignableFrom(EnumSet.class)) {
            if (type instanceof ParameterizedType) {
                type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            } else {
                type2 = Object.class;
            }
            return EnumSet.noneOf(type2);
        }
        try {
            return (Collection) cls.newInstance();
        } catch (Exception unused) {
            throw new IllegalArgumentException("create instane error, class ".concat(cls.getName()));
        }
    }

    @Override // com.alipay.literpc.jsoncodec.codec.ObjectDeserializer
    public Object deserialize(Object obj, Type type) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("82aa5401", new Object[]{this, obj, type});
        }
        if (!obj.getClass().equals(xqf.class)) {
            return null;
        }
        xqf xqfVar = (xqf) obj;
        Collection<Object> a2 = a(ClassUtil.getRawClass(type), type);
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            for (int i = 0; i < xqfVar.c(); i++) {
                a2.add(JSONDeserializer.deserialize0(xqfVar.a(i), type2));
            }
            return a2;
        }
        throw new IllegalArgumentException("Does not support the implement for generics.");
    }

    @Override // com.alipay.literpc.jsoncodec.codec.ObjectDeserializer, com.alipay.literpc.jsoncodec.codec.ObjectSerializer
    public boolean match(Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("905af4f5", new Object[]{this, cls})).booleanValue();
        }
        return Collection.class.isAssignableFrom(cls);
    }

    @Override // com.alipay.literpc.jsoncodec.codec.ObjectSerializer
    public Object serialize(Object obj) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("e67aae0f", new Object[]{this, obj});
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Iterable) obj) {
            arrayList.add(JSONSerializer.serializeToSimpleObject(obj2));
        }
        return arrayList;
    }
}
