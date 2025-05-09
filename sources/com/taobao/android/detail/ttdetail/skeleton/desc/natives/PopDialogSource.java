package com.taobao.android.detail.ttdetail.skeleton.desc.natives;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public enum PopDialogSource {
    MIN_VIDEO,
    DESC;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(PopDialogSource popDialogSource, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/PopDialogSource");
    }

    public static PopDialogSource valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopDialogSource) ipChange.ipc$dispatch("b792375a", new Object[]{str});
        }
        return (PopDialogSource) Enum.valueOf(PopDialogSource.class, str);
    }
}
