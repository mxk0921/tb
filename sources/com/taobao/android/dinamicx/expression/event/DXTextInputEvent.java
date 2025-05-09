package com.taobao.android.dinamicx.expression.event;

import android.text.Editable;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXTextInputEvent extends DXEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Editable text;

    static {
        t2o.a(444596818);
    }

    public DXTextInputEvent(long j) {
        super(j);
    }

    public static /* synthetic */ Object ipc$super(DXTextInputEvent dXTextInputEvent, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/expression/event/DXTextInputEvent");
    }

    public Editable getText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Editable) ipChange.ipc$dispatch("5d546415", new Object[]{this});
        }
        return this.text;
    }

    public void setText(Editable editable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ae5e145", new Object[]{this, editable});
        } else {
            this.text = editable;
        }
    }
}
