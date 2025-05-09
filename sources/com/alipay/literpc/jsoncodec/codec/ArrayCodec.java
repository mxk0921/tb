package com.alipay.literpc.jsoncodec.codec;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import tb.xqf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ArrayCodec implements ObjectDeserializer, ObjectSerializer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

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
        if (!(type instanceof GenericArrayType)) {
            Class<?> componentType = ((Class) type).getComponentType();
            int c = xqfVar.c();
            Object newInstance = Array.newInstance(componentType, c);
            for (int i = 0; i < c; i++) {
                Array.set(newInstance, i, JSONDeserializer.deserialize0(xqfVar.a(i), componentType));
            }
            return newInstance;
        }
        throw new IllegalArgumentException("Does not support generic array!");
    }

    @Override // com.alipay.literpc.jsoncodec.codec.ObjectDeserializer, com.alipay.literpc.jsoncodec.codec.ObjectSerializer
    public boolean match(Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("905af4f5", new Object[]{this, cls})).booleanValue();
        }
        return cls.isArray();
    }

    @Override // com.alipay.literpc.jsoncodec.codec.ObjectSerializer
    public Object serialize(Object obj) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("e67aae0f", new Object[]{this, obj});
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Object[]) obj) {
            arrayList.add(JSONSerializer.serializeToSimpleObject(obj2));
        }
        return arrayList;
    }
}
