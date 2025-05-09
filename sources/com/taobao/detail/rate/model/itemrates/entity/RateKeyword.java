package com.taobao.detail.rate.model.itemrates.entity;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class RateKeyword implements Serializable, Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int RATE_TYPE_NEGATIVE = 1;
    public static final int RATE_TYPE_POSITIVE = 0;
    @JSONField(name = "labelId")
    public String attribute;
    public String attributeId;
    public String count;
    public String level;
    public JSONArray subImprList;
    @JSONField(name = "title")
    public String word;
    public int type = 0;
    public int status = 1;
    private int rateType = 100;

    public String getAttribute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("510a9ed3", new Object[]{this});
        }
        return this.attribute;
    }

    public String getAttributeId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("934fa9f8", new Object[]{this});
        }
        return this.attributeId;
    }

    public String getCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("21147940", new Object[]{this});
        }
        return this.count;
    }

    public String getLevel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("33eab9eb", new Object[]{this});
        }
        return this.level;
    }

    public int getRateType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("44754a2a", new Object[]{this})).intValue();
        }
        return this.rateType;
    }

    public int getStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fcf6c362", new Object[]{this})).intValue();
        }
        return this.status;
    }

    public JSONArray getSubImprList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("3ec8d09", new Object[]{this});
        }
        return this.subImprList;
    }

    public int getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue();
        }
        return this.type;
    }

    public String getWord() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d644af79", new Object[]{this});
        }
        return this.word;
    }

    public void setAttribute(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5286f76b", new Object[]{this, str});
        } else {
            this.attribute = str;
        }
    }

    public void setAttributeId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee5cc3e6", new Object[]{this, str});
        } else {
            this.attributeId = str;
        }
    }

    public void setCount(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae53449e", new Object[]{this, str});
        } else {
            this.count = str;
        }
    }

    public void setLevel(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6451953", new Object[]{this, str});
        } else {
            this.level = str;
        }
    }

    public void setRateType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd0ad620", new Object[]{this, new Integer(i)});
        } else {
            this.rateType = i;
        }
    }

    public void setStatus(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("384790e8", new Object[]{this, new Integer(i)});
        } else {
            this.status = i;
        }
    }

    public void setSubImprList(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3728931", new Object[]{this, jSONArray});
        } else {
            this.subImprList = jSONArray;
        }
    }

    public void setType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77e09620", new Object[]{this, new Integer(i)});
        } else {
            this.type = i;
        }
    }

    public void setWord(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86d0801d", new Object[]{this, str});
        } else {
            this.word = str;
        }
    }

    public RateKeyword clone() throws CloneNotSupportedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RateKeyword) ipChange.ipc$dispatch("9aff653f", new Object[]{this});
        }
        try {
            return (RateKeyword) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
