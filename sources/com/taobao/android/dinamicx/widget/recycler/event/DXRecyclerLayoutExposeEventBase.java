package com.taobao.android.dinamicx.widget.recycler.event;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import java.util.HashMap;
import tb.mw5;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXRecyclerLayoutExposeEventBase extends DXEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Object data;
    public long duration;
    public int index;

    static {
        t2o.a(444597541);
    }

    public DXRecyclerLayoutExposeEventBase(long j, int i, Object obj, long j2) {
        super(j);
        this.index = i;
        this.data = obj;
        this.duration = j2;
        HashMap hashMap = new HashMap();
        hashMap.put("index", mw5.K(i));
        if (obj instanceof JSONObject) {
            hashMap.put("data", mw5.N((JSONObject) obj));
        } else if (obj instanceof Object) {
            hashMap.put("data", mw5.L(obj));
        }
        hashMap.put("duration", mw5.K(j2));
        setArgs(hashMap);
    }

    public static /* synthetic */ Object ipc$super(DXRecyclerLayoutExposeEventBase dXRecyclerLayoutExposeEventBase, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/recycler/event/DXRecyclerLayoutExposeEventBase");
    }

    public Object getData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("4ca84d6b", new Object[]{this});
        }
        return this.data;
    }

    public long getDuration() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed837a85", new Object[]{this})).longValue();
        }
        return this.duration;
    }

    public int getIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cf396596", new Object[]{this})).intValue();
        }
        return this.index;
    }

    public String toStr() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("193e1b03", new Object[]{this});
        }
        return "DXRecyclerLayoutExposeEventBase{index=" + this.index + ", duration=" + this.duration + '}';
    }
}
