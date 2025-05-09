package com.taobao.android.dinamicx.expression.event.tab;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import java.util.HashMap;
import tb.mw5;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TabEvent extends DXEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public JSONObject data;
    public int fromIndex;
    public int index;
    public int indexChangeType;
    public boolean isFirstSelected;
    private boolean isTapEvent;

    static {
        t2o.a(444596826);
    }

    public TabEvent(long j, int i, int i2, JSONObject jSONObject, boolean z, boolean z2, int i3) {
        super(j);
        this.index = i;
        this.data = jSONObject;
        this.isFirstSelected = z;
        this.isTapEvent = z2;
        this.indexChangeType = i3;
        HashMap hashMap = new HashMap();
        hashMap.put("index", mw5.K(i));
        hashMap.put("fromIndex", mw5.K(i2));
        hashMap.put("data", mw5.N(jSONObject));
        hashMap.put("isFirstSelected", mw5.G(z));
        hashMap.put("isTapEvent", mw5.G(z2));
        hashMap.put("indexChangeType", mw5.K(i3));
        setArgs(hashMap);
    }

    public static /* synthetic */ Object ipc$super(TabEvent tabEvent, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/expression/event/tab/TabEvent");
    }

    public JSONObject getData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b8351bc7", new Object[]{this});
        }
        return this.data;
    }

    public int getFromIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c5cb80c", new Object[]{this})).intValue();
        }
        return this.fromIndex;
    }

    public int getIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cf396596", new Object[]{this})).intValue();
        }
        return this.index;
    }

    public int getIndexChangeType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("37d3e3c9", new Object[]{this, new Integer(i)})).intValue();
        }
        return i;
    }

    public boolean isFirstSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a8d3c6c", new Object[]{this})).booleanValue();
        }
        return this.isFirstSelected;
    }

    public boolean isTapEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1326540c", new Object[]{this})).booleanValue();
        }
        return this.isTapEvent;
    }

    public void setData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d09acf9d", new Object[]{this, jSONObject});
        } else {
            this.data = jSONObject;
        }
    }

    public void setFirstSelected(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bef454a4", new Object[]{this, new Boolean(z)});
        } else {
            this.isFirstSelected = z;
        }
    }

    public void setFromIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47312616", new Object[]{this, new Integer(i)});
        } else {
            this.fromIndex = i;
        }
    }

    public void setIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46180fcc", new Object[]{this, new Integer(i)});
        } else {
            this.index = i;
        }
    }

    public void setIndexChangeType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b22712e2", new Object[]{this, new Integer(i)});
        } else {
            this.indexChangeType = i;
        }
    }

    public void setTapEvent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("209bab94", new Object[]{this, new Boolean(z)});
        } else {
            this.isTapEvent = z;
        }
    }
}
