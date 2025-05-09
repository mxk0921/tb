package com.zoloz.android.phone.zdoc.ui;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public enum UIState {
    CAPTURE,
    USER_CONFIRM,
    UPLOADING,
    UPLOAD_END_SUCCESS,
    UPLOAD_END_FAIL,
    ALERT,
    SCANNING,
    SCANNING_NO_DOC,
    SCANNING_NO_CENTER,
    SCANNING_NO_ANGLE,
    SCAN_TASK_ANGLE,
    SCAN_TASK_OK;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(UIState uIState, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/zoloz/android/phone/zdoc/ui/UIState");
    }

    public static UIState valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UIState) ipChange.ipc$dispatch("21a3a2d3", new Object[]{str});
        }
        return (UIState) Enum.valueOf(UIState.class, str);
    }
}
