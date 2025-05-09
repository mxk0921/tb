package com.alipay.literpc.jsoncodec.codec;

import com.alipay.literpc.jsoncodec.util.ClassUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import tb.erf;
import tb.xqf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class JSONDeserializer {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static List<ObjectDeserializer> deserializers;

    static {
        ArrayList arrayList = new ArrayList();
        deserializers = arrayList;
        arrayList.add(new SimpleClassCodec());
        deserializers.add(new EnumCodec());
        deserializers.add(new DateCodec());
        deserializers.add(new MapCodec());
        deserializers.add(new SetDeserializer());
        deserializers.add(new CollectionCodec());
        deserializers.add(new ArrayCodec());
        deserializers.add(new JavaBeanCodec());
    }

    public static final Object deserialize(String str, Type type) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("3349dd3", new Object[]{str, type});
        }
        if (str == null || str.length() == 0) {
            return null;
        }
        String trim = str.trim();
        if (trim.startsWith("[") && trim.endsWith("]")) {
            return deserialize0(new xqf(trim), type);
        }
        if (!trim.startsWith("{") || !trim.endsWith("}")) {
            return deserialize0(trim, type);
        }
        return deserialize0(new erf(trim), type);
    }

    public static final <T> T deserialize0(Object obj, Type type) throws Exception {
        T t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("364fc0af", new Object[]{obj, type});
        }
        for (ObjectDeserializer objectDeserializer : deserializers) {
            if (objectDeserializer.match(ClassUtil.getRawClass(type)) && (t = (T) objectDeserializer.deserialize(obj, type)) != null) {
                return t;
            }
        }
        return null;
    }
}
