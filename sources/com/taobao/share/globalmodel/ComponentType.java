package com.taobao.share.globalmodel;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.taopai.charge.api.FunIdDef;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public enum ComponentType {
    UNKNOW(0, "UNKNOW"),
    TOOL(1, FunIdDef.TOOL),
    CONTACT(2, "contact"),
    WEEX(3, "weex container"),
    CHANNEL(4, "channel"),
    CHANNEL_ITEM(5, "channelItem"),
    CONTACT_ITEM(6, "contactItem"),
    BUSINESS_VIEW(7, "businessView");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String desc;
    public int index;
    private static Map<String, ComponentType> m = new HashMap();
    private static Map<Integer, ComponentType> i = new HashMap();

    static {
        ComponentType[] values;
        for (ComponentType componentType : values()) {
            m.put(componentType.desc, componentType);
            i.put(Integer.valueOf(componentType.index), componentType);
        }
    }

    ComponentType(int i2, String str) {
        this.index = i2;
        this.desc = str;
    }

    public static ComponentType getTypeByDesc(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ComponentType) ipChange.ipc$dispatch("fe8eae51", new Object[]{str});
        }
        ComponentType componentType = m.get(str);
        if (componentType != null) {
            return componentType;
        }
        return UNKNOW;
    }

    public static ComponentType getTypeByIndex(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ComponentType) ipChange.ipc$dispatch("73576be9", new Object[]{new Integer(i2)});
        }
        ComponentType componentType = i.get(Integer.valueOf(i2));
        if (componentType != null) {
            return componentType;
        }
        return UNKNOW;
    }

    public static /* synthetic */ Object ipc$super(ComponentType componentType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/share/globalmodel/ComponentType");
    }

    public static ComponentType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ComponentType) ipChange.ipc$dispatch("ef1f0081", new Object[]{str});
        }
        return (ComponentType) Enum.valueOf(ComponentType.class, str);
    }
}
