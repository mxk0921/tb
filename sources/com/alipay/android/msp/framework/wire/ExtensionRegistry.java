package com.alipay.android.msp.framework.wire;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ExtensionRegistry {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<? extends ExtendableMessage>, Map<Integer, Extension<?, ?>>> f3687a = new LinkedHashMap();
    public final Map<Class<? extends ExtendableMessage>, Map<String, Extension<?, ?>>> b = new LinkedHashMap();

    public final <T extends ExtendableMessage<?>, E> void add(Extension<T, E> extension) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3527dff7", new Object[]{this, extension});
            return;
        }
        Class<T> extendedType = extension.getExtendedType();
        Map<Integer, Extension<?, ?>> map = (Map) ((LinkedHashMap) this.f3687a).get(extendedType);
        Map<String, Extension<?, ?>> map2 = (Map) ((LinkedHashMap) this.b).get(extendedType);
        if (map == null) {
            map = new LinkedHashMap<>();
            map2 = new LinkedHashMap<>();
            this.f3687a.put(extendedType, map);
            this.b.put(extendedType, map2);
        }
        map.put(Integer.valueOf(extension.getTag()), extension);
        map2.put(extension.getName(), extension);
    }

    public final <T extends ExtendableMessage<?>, E> Extension<T, E> getExtension(Class<T> cls, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Extension) ipChange.ipc$dispatch("f666b685", new Object[]{this, cls, new Integer(i)});
        }
        Map map = (Map) ((LinkedHashMap) this.f3687a).get(cls);
        if (map == null) {
            return null;
        }
        return (Extension) map.get(Integer.valueOf(i));
    }

    public final <T extends ExtendableMessage<?>, E> Extension<T, E> getExtension(Class<T> cls, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Extension) ipChange.ipc$dispatch("ae9867c6", new Object[]{this, cls, str});
        }
        Map map = (Map) ((LinkedHashMap) this.b).get(cls);
        if (map == null) {
            return null;
        }
        return (Extension) map.get(str);
    }
}
