package com.taobao.detail.rate.vivid.dinamicX.eve;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import java.util.HashMap;
import java.util.Map;
import tb.mw5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class DXTagFlowStateChangedEvent extends DXEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String expandType;
    private boolean isExpanded;
    private int showLines;
    private int totalLines;

    public DXTagFlowStateChangedEvent(long j, boolean z, int i, int i2, String str) {
        super(j);
        this.isExpanded = z;
        this.showLines = i;
        this.totalLines = i2;
        this.expandType = str;
        HashMap hashMap = new HashMap();
        hashMap.put("isExpanded", mw5.G(z));
        hashMap.put("showLines", mw5.K(i));
        hashMap.put("totalLines", mw5.K(i2));
        hashMap.put("expandType", mw5.O(str));
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

    public static /* synthetic */ Object ipc$super(DXTagFlowStateChangedEvent dXTagFlowStateChangedEvent, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/detail/rate/vivid/dinamicX/eve/DXTagFlowStateChangedEvent");
    }

    public String getExpandType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4fa8884f", new Object[]{this});
        }
        return this.expandType;
    }

    public boolean getIsExpanded() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a230ec04", new Object[]{this})).booleanValue();
        }
        return this.isExpanded;
    }

    public int getShowLines() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2d1149c6", new Object[]{this})).intValue();
        }
        return this.showLines;
    }

    public int getTotalLines() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b566ba0b", new Object[]{this})).intValue();
        }
        return this.totalLines;
    }

    public void setExpandType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c520907", new Object[]{this, str});
            return;
        }
        getNonNullArgs().put("expandType", mw5.O(str));
        this.expandType = str;
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

    public void setShowLines(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d0ecb9c", new Object[]{this, new Integer(i)});
            return;
        }
        getNonNullArgs().put("showLines", mw5.K(i));
        this.showLines = i;
    }

    public void setTotalLines(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e47955f", new Object[]{this, new Integer(i)});
            return;
        }
        getNonNullArgs().put("totalLines", mw5.K(i));
        this.totalLines = i;
    }
}
