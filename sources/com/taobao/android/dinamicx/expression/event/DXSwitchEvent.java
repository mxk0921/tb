package com.taobao.android.dinamicx.expression.event;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXSwitchEvent extends DXEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean isOn;

    static {
        t2o.a(444596817);
    }

    public DXSwitchEvent(long j) {
        super(j);
    }

    public static /* synthetic */ Object ipc$super(DXSwitchEvent dXSwitchEvent, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/expression/event/DXSwitchEvent");
    }

    public boolean isOn() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebba7cb4", new Object[]{this})).booleanValue();
        }
        return this.isOn;
    }

    public void setOn(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f630dec", new Object[]{this, new Boolean(z)});
        } else {
            this.isOn = z;
        }
    }
}
