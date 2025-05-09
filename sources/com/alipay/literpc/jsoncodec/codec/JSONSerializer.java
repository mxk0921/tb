package com.alipay.literpc.jsoncodec.codec;

import com.alipay.literpc.jsoncodec.util.ClassUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.erf;
import tb.xqf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class JSONSerializer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final List<ObjectSerializer> f3857a;

    static {
        ArrayList arrayList = new ArrayList();
        f3857a = arrayList;
        arrayList.add(new SimpleClassCodec());
        arrayList.add(new EnumCodec());
        arrayList.add(new DateCodec());
        arrayList.add(new MapCodec());
        arrayList.add(new CollectionCodec());
        arrayList.add(new ArrayCodec());
        arrayList.add(new JavaBeanCodec());
    }

    public static String serialize(Object obj) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d93d8b7d", new Object[]{obj});
        }
        if (obj == null) {
            return null;
        }
        Object serializeToSimpleObject = serializeToSimpleObject(obj);
        if (ClassUtil.isSimpleType(serializeToSimpleObject.getClass())) {
            return erf.g(serializeToSimpleObject.toString());
        }
        if (Collection.class.isAssignableFrom(serializeToSimpleObject.getClass())) {
            return new xqf((Collection) ((List) serializeToSimpleObject)).toString();
        }
        if (Map.class.isAssignableFrom(serializeToSimpleObject.getClass())) {
            return new erf((Map) serializeToSimpleObject).toString();
        }
        throw new IllegalArgumentException("Unsupported Class : " + serializeToSimpleObject.getClass());
    }

    public static Object serializeToSimpleObject(Object obj) throws Exception {
        Object serialize;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1d0286c3", new Object[]{obj});
        }
        if (obj == null) {
            return null;
        }
        Iterator it = ((ArrayList) f3857a).iterator();
        while (it.hasNext()) {
            ObjectSerializer objectSerializer = (ObjectSerializer) it.next();
            if (objectSerializer.match(obj.getClass()) && (serialize = objectSerializer.serialize(obj)) != null) {
                return serialize;
            }
        }
        throw new IllegalArgumentException("Unsupported Class : " + obj.getClass());
    }
}
