package com.taobao.mmad.render.dx.event;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class DXSwipeInteractEvent extends DXEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean isTriggerInteractSuccess;

    static {
        t2o.a(573571192);
    }

    public DXSwipeInteractEvent(long j, boolean z) {
        super(j);
        this.isTriggerInteractSuccess = z;
    }

    public static /* synthetic */ Object ipc$super(DXSwipeInteractEvent dXSwipeInteractEvent, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mmad/render/dx/event/DXSwipeInteractEvent");
    }

    public boolean isTriggerInteractSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("843aceea", new Object[]{this})).booleanValue();
        }
        return this.isTriggerInteractSuccess;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "DXSwipeInteractEvent{isTriggerInteractSuccess=" + this.isTriggerInteractSuccess + '}';
    }
}
