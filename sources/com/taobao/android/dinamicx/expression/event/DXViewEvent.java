package com.taobao.android.dinamicx.expression.event;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DXViewEvent extends DXEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int itemIndex;

    static {
        t2o.a(444596821);
    }

    public DXViewEvent(long j) {
        super(j);
    }

    public static /* synthetic */ Object ipc$super(DXViewEvent dXViewEvent, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/expression/event/DXViewEvent");
    }

    public int getItemIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("165a1ac3", new Object[]{this})).intValue();
        }
        return this.itemIndex;
    }

    public void setItemIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ce01a3f", new Object[]{this, new Integer(i)});
        } else {
            this.itemIndex = i;
        }
    }
}
