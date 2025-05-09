package com.alibaba.ariver.app.api.ui.darkmode;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public enum ColorSchemeType {
    DEFAULT,
    LIGHT,
    DARK;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(ColorSchemeType colorSchemeType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ariver/app/api/ui/darkmode/ColorSchemeType");
    }

    public static ColorSchemeType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ColorSchemeType) ipChange.ipc$dispatch("fe6adecb", new Object[]{str});
        }
        return (ColorSchemeType) Enum.valueOf(ColorSchemeType.class, str);
    }
}
