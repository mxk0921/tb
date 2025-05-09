package com.taobao.desktop.widget.manager;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public enum WidgetCreateStrategy$Result {
    ALL_SUCCESS,
    ADD_SUCCESS,
    FAILED;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(WidgetCreateStrategy$Result widgetCreateStrategy$Result, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/desktop/widget/manager/WidgetCreateStrategy$Result");
    }

    public static WidgetCreateStrategy$Result valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetCreateStrategy$Result) ipChange.ipc$dispatch("12eee903", new Object[]{str});
        }
        return (WidgetCreateStrategy$Result) Enum.valueOf(WidgetCreateStrategy$Result.class, str);
    }
}
