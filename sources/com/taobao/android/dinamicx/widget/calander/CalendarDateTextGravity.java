package com.taobao.android.dinamicx.widget.calander;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public enum CalendarDateTextGravity {
    Center(0),
    Top(1);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int code;

    CalendarDateTextGravity(int i) {
        this.code = i;
    }

    public static /* synthetic */ Object ipc$super(CalendarDateTextGravity calendarDateTextGravity, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/calander/CalendarDateTextGravity");
    }

    public static CalendarDateTextGravity valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CalendarDateTextGravity) ipChange.ipc$dispatch("bb566076", new Object[]{str});
        }
        return (CalendarDateTextGravity) Enum.valueOf(CalendarDateTextGravity.class, str);
    }

    public int getCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("480bb15d", new Object[]{this})).intValue();
        }
        return this.code;
    }
}
