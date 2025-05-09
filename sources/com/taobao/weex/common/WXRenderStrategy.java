package com.taobao.weex.common;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public enum WXRenderStrategy {
    APPEND_ASYNC("APPEND_ASYNC"),
    APPEND_ONCE("APPEND_ONCE"),
    DATA_RENDER("DATA_RENDER"),
    DATA_RENDER_BINARY("DATA_RENDER_BINARY"),
    JSON_RENDER("JSON_RENDER");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String flag;

    WXRenderStrategy(String str) {
        this.flag = str;
    }

    public static /* synthetic */ Object ipc$super(WXRenderStrategy wXRenderStrategy, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/weex/common/WXRenderStrategy");
    }

    public static WXRenderStrategy valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXRenderStrategy) ipChange.ipc$dispatch("e5297397", new Object[]{str});
        }
        return (WXRenderStrategy) Enum.valueOf(WXRenderStrategy.class, str);
    }

    public String getFlag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c150e857", new Object[]{this});
        }
        return this.flag;
    }
}
