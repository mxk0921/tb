package com.alibaba.ariver.app.api;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public enum EmbedType {
    NO(0),
    FULL(1),
    MINI(2);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int mType;

    EmbedType(int i) {
        this.mType = i;
    }

    public static /* synthetic */ Object ipc$super(EmbedType embedType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ariver/app/api/EmbedType");
    }

    public static EmbedType parse(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EmbedType) ipChange.ipc$dispatch("f3d28cef", new Object[]{new Integer(i)});
        }
        if (i == 1) {
            return FULL;
        }
        if (i == 2) {
            return MINI;
        }
        return NO;
    }

    public static EmbedType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EmbedType) ipChange.ipc$dispatch("9489f7bf", new Object[]{str});
        }
        return (EmbedType) Enum.valueOf(EmbedType.class, str);
    }

    public int getTypeValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4279c39b", new Object[]{this})).intValue();
        }
        return this.mType;
    }

    public boolean isEmbedPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63d82889", new Object[]{this})).booleanValue();
        }
        if (this.mType != NO.getTypeValue()) {
            return true;
        }
        return false;
    }
}
