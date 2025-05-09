package com.taobao.android.dinamicx.widget.calander;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import java.util.HashMap;
import java.util.Map;
import tb.mw5;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXOnCalendarMonthUIRangeChangeEvent extends DXEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444597484);
    }

    public DXOnCalendarMonthUIRangeChangeEvent(long j) {
        super(j);
    }

    public static /* synthetic */ Object ipc$super(DXOnCalendarMonthUIRangeChangeEvent dXOnCalendarMonthUIRangeChangeEvent, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/calander/DXOnCalendarMonthUIRangeChangeEvent");
    }

    public void setData(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da8cc547", new Object[]{this, str, str2});
            return;
        }
        Map<String, mw5> args = getArgs();
        if (args == null) {
            args = new HashMap<>();
            setArgs(args);
        }
        args.put(str, mw5.O(str2));
    }
}
