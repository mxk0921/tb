package com.taobao.detail.rate.vivid.dinamicX.eve;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import java.util.HashMap;
import java.util.Map;
import tb.mw5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class DXTagSelectedEvent extends DXEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private JSONObject tag;

    public DXTagSelectedEvent(long j, JSONObject jSONObject) {
        super(j);
        this.tag = jSONObject;
        HashMap hashMap = new HashMap();
        hashMap.put("tag", mw5.N(jSONObject));
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

    public static /* synthetic */ Object ipc$super(DXTagSelectedEvent dXTagSelectedEvent, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/detail/rate/vivid/dinamicX/eve/DXTagSelectedEvent");
    }

    public JSONObject getTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a9a7620b", new Object[]{this});
        }
        return this.tag;
    }

    public void setTag(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a96d9271", new Object[]{this, jSONObject});
            return;
        }
        getNonNullArgs().put("tag", mw5.N(jSONObject));
        this.tag = jSONObject;
    }
}
