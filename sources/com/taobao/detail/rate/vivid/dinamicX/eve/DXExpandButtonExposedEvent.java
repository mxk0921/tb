package com.taobao.detail.rate.vivid.dinamicX.eve;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import java.util.HashMap;
import java.util.Map;
import tb.mw5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class DXExpandButtonExposedEvent extends DXEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean isExpanded;

    public DXExpandButtonExposedEvent(long j, boolean z) {
        super(j);
        this.isExpanded = z;
        HashMap hashMap = new HashMap();
        hashMap.put("isExpanded", mw5.G(z));
        setArgs(hashMap);
    }

    private Map<String, mw5> getNonNullArgs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9f6b6d77", new Object[]{this});
        }
        if (getArgs() == null) {
            setArgs(new HashMap());
        }
        return getArgs();
    }

    public static /* synthetic */ Object ipc$super(DXExpandButtonExposedEvent dXExpandButtonExposedEvent, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/detail/rate/vivid/dinamicX/eve/DXExpandButtonExposedEvent");
    }

    public boolean getIsExpanded() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a230ec04", new Object[]{this})).booleanValue();
        }
        return this.isExpanded;
    }

    public void setIsExpanded(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dac3e048", new Object[]{this, new Boolean(z)});
            return;
        }
        getNonNullArgs().put("isExpanded", mw5.G(z));
        this.isExpanded = z;
    }
}
