package com.taobao.android.weex;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public enum WeexRenderType {
    UNICORN(2),
    UIKIT(1),
    NONE(0);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int cppIndex;

    WeexRenderType(int i) {
        this.cppIndex = i;
    }

    public static /* synthetic */ Object ipc$super(WeexRenderType weexRenderType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/WeexRenderType");
    }

    public static WeexRenderType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexRenderType) ipChange.ipc$dispatch("dd6d0c20", new Object[]{str});
        }
        return (WeexRenderType) Enum.valueOf(WeexRenderType.class, str);
    }

    public int getCppIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a6134c5f", new Object[]{this})).intValue();
        }
        return this.cppIndex;
    }
}
