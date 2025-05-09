package com.alipay.android.msp.container;

import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.core.context.MspContainerContext;
import com.alipay.android.msp.drivers.actions.ActionsCreator;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MspContainerClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public MspContainerContext b;
    public boolean c = false;

    /* renamed from: a  reason: collision with root package name */
    public MspContainerResult f3537a = new MspContainerResult();

    public MspContainerClient(MspContainerContext mspContainerContext) {
        this.b = mspContainerContext;
    }

    public void exitContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67ac600a", new Object[]{this});
            return;
        }
        this.c = true;
        synchronized (this) {
            notifyAll();
        }
    }

    public void finishDupContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ad4937c", new Object[]{this});
            return;
        }
        this.f3537a.setErrorCode("400");
        this.b.getStatisticInfo().addError("container", "dupContainer", "dup");
        this.b.exit(0);
    }

    public MspContainerResult getMspContainerResult() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspContainerResult) ipChange.ipc$dispatch("2fc5f5e4", new Object[]{this});
        }
        return this.f3537a;
    }

    public void setMspContainerResult(MspContainerResult mspContainerResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6747d6e6", new Object[]{this, mspContainerResult});
        } else {
            this.f3537a = mspContainerResult;
        }
    }

    public MspContainerResult startContainer(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspContainerResult) ipChange.ipc$dispatch("cce16b3d", new Object[]{this, jSONObject});
        }
        if (this.b.getContext() == null) {
            this.f3537a.setErrorCode("100");
            return this.f3537a;
        }
        this.f3537a.setErrorCode("100");
        StEvent stEvent = new StEvent("initial", "container", this.b.getBizType());
        this.b.getStatisticInfo().addEvent(stEvent);
        if (jSONObject == null) {
            ActionsCreator.get(this.b).createUIFirstAction();
        } else {
            ActionsCreator.get(this.b).createUIShowAction(jSONObject, false, stEvent);
        }
        if (!this.c) {
            synchronized (this) {
                try {
                    wait();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            this.b.getStatisticInfo().updateResult(getMspContainerResult().getErrorCode(), this.b.getCurrentWinTpName());
            this.b = null;
        }
        return getMspContainerResult();
    }
}
