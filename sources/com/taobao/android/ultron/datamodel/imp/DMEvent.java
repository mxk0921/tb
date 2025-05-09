package com.taobao.android.ultron.datamodel.imp;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultronx.protocol.UltronEvent;
import java.io.Serializable;
import java.util.List;
import tb.gsb;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class DMEvent implements gsb, Cloneable, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<IDMComponent> mComponents;
    private JSONObject mFields;
    private int mOption;
    private JSONObject mStashFields;
    private String mType;

    static {
        t2o.a(83886156);
        t2o.a(83886098);
    }

    public DMEvent(String str, JSONObject jSONObject, List<IDMComponent> list) {
        this.mType = str;
        this.mFields = jSONObject;
        this.mComponents = list;
    }

    @Override // tb.gsb
    public List<IDMComponent> getComponents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d86cc054", new Object[]{this});
        }
        return this.mComponents;
    }

    @Override // tb.gsb
    public JSONObject getFields() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b4e209d6", new Object[]{this});
        }
        return this.mFields;
    }

    public int getOption() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("400d8265", new Object[]{this})).intValue();
        }
        return this.mOption;
    }

    @Override // tb.gsb
    public String getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        return this.mType;
    }

    @Override // tb.gsb
    public void record() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bbb6058", new Object[]{this});
            return;
        }
        JSONObject jSONObject = this.mFields;
        if (jSONObject != null) {
            this.mStashFields = JSON.parseObject(jSONObject.toJSONString());
        }
    }

    @Override // tb.gsb
    public void rollBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a52d58b", new Object[]{this});
            return;
        }
        JSONObject jSONObject = this.mStashFields;
        if (jSONObject != null) {
            this.mFields = jSONObject;
            this.mStashFields = null;
        }
    }

    public void setComponents(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6023090", new Object[]{this, list});
        } else {
            this.mComponents = list;
        }
    }

    public void setOption(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5808b245", new Object[]{this, new Integer(i)});
        } else {
            this.mOption = i;
        }
    }

    @Override // tb.gsb
    public void writeFields(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fac4fa5", new Object[]{this, str, obj});
        } else if (this.mFields != null && !TextUtils.isEmpty(str) && obj != null) {
            this.mFields.put(str, obj);
        }
    }

    public DMEvent(String str, JSONObject jSONObject, List<IDMComponent> list, int i) {
        this.mType = str;
        this.mFields = jSONObject;
        this.mOption = i;
        this.mComponents = list;
    }

    public DMEvent(UltronEvent ultronEvent) {
        if (ultronEvent != null) {
            this.mType = ultronEvent.getType();
            this.mFields = ultronEvent.getFields();
        }
    }
}
