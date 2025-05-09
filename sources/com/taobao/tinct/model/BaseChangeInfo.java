package com.taobao.tinct.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class BaseChangeInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "biz")
    public String bizName;
    @JSONField(name = "changeType")
    public ChangeType changeType;
    @JSONField(name = "time")
    public long updateTime;

    public BaseChangeInfo() {
        this(ChangeType.UNKNOWN);
    }

    public String getBizName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("42bddf1", new Object[]{this});
        }
        return this.bizName;
    }

    public ChangeType getChangeType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ChangeType) ipChange.ipc$dispatch("dc839d10", new Object[]{this});
        }
        return this.changeType;
    }

    public abstract String getTinctTag();

    public long getUpdateTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a69139a7", new Object[]{this})).longValue();
        }
        return this.updateTime;
    }

    public void setUpdateTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("626d0ce5", new Object[]{this, new Long(j)});
        } else {
            this.updateTime = j;
        }
    }

    public BaseChangeInfo(ChangeType changeType) {
        this.changeType = changeType;
        this.bizName = null;
        this.updateTime = System.currentTimeMillis();
    }
}
