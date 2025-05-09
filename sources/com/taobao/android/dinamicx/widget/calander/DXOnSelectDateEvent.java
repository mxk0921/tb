package com.taobao.android.dinamicx.widget.calander;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import java.util.HashMap;
import java.util.Map;
import tb.mw5;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXOnSelectDateEvent extends DXEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Map<String, String> data = null;

    static {
        t2o.a(444597485);
    }

    public DXOnSelectDateEvent(long j) {
        super(j);
    }

    public static /* synthetic */ Object ipc$super(DXOnSelectDateEvent dXOnSelectDateEvent, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/calander/DXOnSelectDateEvent");
    }

    public void addData(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34725f06", new Object[]{this, str, str2});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (this.data == null) {
                this.data = new HashMap();
            }
            this.data.put(str, str2);
            Map<String, mw5> args = getArgs();
            if (args == null) {
                args = new HashMap<>();
                setArgs(args);
            }
            args.put(str, mw5.O(str2));
        }
    }

    public Map<String, String> getData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("516a2e9c", new Object[]{this});
        }
        return this.data;
    }
}
