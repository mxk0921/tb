package com.taobao.android.weex_framework.devtool;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.vbm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public enum NetworkResourceType {
    Other("Other"),
    Document("Document"),
    Stylesheet("Stylesheet"),
    Image(vbm.TYPE_IMAGE),
    Media("Media"),
    Font("Font"),
    Script("Script"),
    Fetch("Fetch"),
    WebSocket("WebSocket");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String value;

    NetworkResourceType(String str) {
        this.value = str;
    }

    public static /* synthetic */ Object ipc$super(NetworkResourceType networkResourceType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_framework/devtool/NetworkResourceType");
    }

    public static NetworkResourceType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetworkResourceType) ipChange.ipc$dispatch("a4f0e32", new Object[]{str});
        }
        return (NetworkResourceType) Enum.valueOf(NetworkResourceType.class, str);
    }
}
