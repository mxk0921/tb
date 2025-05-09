package com.taobao.android.alinnkit.core;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public enum AliNNYuvFormat {
    YUV420SP_NV12(0),
    YUV420SP_NV21(1);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int type;

    AliNNYuvFormat(int i) {
        this.type = i;
    }

    public static /* synthetic */ Object ipc$super(AliNNYuvFormat aliNNYuvFormat, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/alinnkit/core/AliNNYuvFormat");
    }

    public static AliNNYuvFormat valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliNNYuvFormat) ipChange.ipc$dispatch("d2deb00b", new Object[]{str});
        }
        return (AliNNYuvFormat) Enum.valueOf(AliNNYuvFormat.class, str);
    }
}
