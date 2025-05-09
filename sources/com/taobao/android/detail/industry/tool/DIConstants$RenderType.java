package com.taobao.android.detail.industry.tool;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.dm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public enum DIConstants$RenderType {
    WEEX(dm.g),
    WEEX2("weex2"),
    H5(dm.b),
    TRIVER_WIDGET("triverWidget"),
    DX(dm.f17906a),
    NATIVE(dm.c);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String value;

    DIConstants$RenderType(String str) {
        this.value = str;
    }

    public static /* synthetic */ Object ipc$super(DIConstants$RenderType dIConstants$RenderType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/industry/tool/DIConstants$RenderType");
    }

    public static boolean isAsyncRenderType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("328e1c17", new Object[]{str})).booleanValue();
        }
        if (WEEX.getValue().equals(str) || WEEX2.getValue().equals(str) || H5.getValue().equals(str) || TRIVER_WIDGET.getValue().equals(str)) {
            return true;
        }
        return false;
    }

    public static DIConstants$RenderType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DIConstants$RenderType) ipChange.ipc$dispatch("c2a63171", new Object[]{str});
        }
        return (DIConstants$RenderType) Enum.valueOf(DIConstants$RenderType.class, str);
    }

    public String getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5308aa1e", new Object[]{this});
        }
        return this.value;
    }
}
