package com.alipay.literpc.jsoncodec.codec;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Set;
import tb.xqf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class SetDeserializer implements ObjectDeserializer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.literpc.jsoncodec.codec.ObjectDeserializer
    public Object deserialize(Object obj, Type type) throws Exception {
        Type type2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("82aa5401", new Object[]{this, obj, type});
        }
        if (!obj.getClass().equals(xqf.class)) {
            return null;
        }
        xqf xqfVar = (xqf) obj;
        HashSet hashSet = new HashSet();
        if (type instanceof ParameterizedType) {
            type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        } else {
            type2 = Object.class;
        }
        for (int i = 0; i < xqfVar.c(); i++) {
            hashSet.add(JSONDeserializer.deserialize0(xqfVar.a(i), type2));
        }
        return hashSet;
    }

    @Override // com.alipay.literpc.jsoncodec.codec.ObjectDeserializer, com.alipay.literpc.jsoncodec.codec.ObjectSerializer
    public boolean match(Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("905af4f5", new Object[]{this, cls})).booleanValue();
        }
        return Set.class.isAssignableFrom(cls);
    }
}
