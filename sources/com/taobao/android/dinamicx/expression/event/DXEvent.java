package com.taobao.android.dinamicx.expression.event;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;
import tb.mw5;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DXEvent implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Map<String, mw5> args;
    public long eventId;
    public boolean isPrepareBind;

    static {
        t2o.a(444596805);
    }

    public DXEvent(long j) {
        this.eventId = j;
    }

    public Map<String, mw5> getArgs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("46c4490f", new Object[]{this});
        }
        return this.args;
    }

    public long getEventId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce27561a", new Object[]{this})).longValue();
        }
        return this.eventId;
    }

    public boolean isPrepareBind() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79152de5", new Object[]{this})).booleanValue();
        }
        return this.isPrepareBind;
    }

    public void setArgs(Map<String, mw5> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fb6655f", new Object[]{this, map});
        } else {
            this.args = map;
        }
    }

    public void setEventId(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d0ce06a", new Object[]{this, new Long(j)});
        } else {
            this.eventId = j;
        }
    }

    public void setPrepareBind(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b7d804b", new Object[]{this, new Boolean(z)});
        } else {
            this.isPrepareBind = z;
        }
    }
}
