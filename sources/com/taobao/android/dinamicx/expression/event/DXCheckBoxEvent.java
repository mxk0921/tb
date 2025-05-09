package com.taobao.android.dinamicx.expression.event;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXCheckBoxEvent extends DXEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean isChecked;

    static {
        t2o.a(444596804);
    }

    public DXCheckBoxEvent(long j) {
        super(j);
    }

    public static /* synthetic */ Object ipc$super(DXCheckBoxEvent dXCheckBoxEvent, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/expression/event/DXCheckBoxEvent");
    }

    public boolean isChecked() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f77ac528", new Object[]{this})).booleanValue();
        }
        return this.isChecked;
    }

    public void setChecked(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc7b2d68", new Object[]{this, new Boolean(z)});
        } else {
            this.isChecked = z;
        }
    }
}
