package com.alibaba.android.aura.datamodel.linkage;

import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.umf.node.service.parse.state.tree.MultiTreeNode;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class UMFLinkageTrigger implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String mAction;
    private final String mEventKey;
    private MultiTreeNode mMultiTreeNode;
    private String mNeedAdjustOptimize;
    private AURARenderComponent mRenderComponent;
    private final String mTriggerComponentKey;

    static {
        t2o.a(80740380);
    }

    public UMFLinkageTrigger(String str, String str2, String str3) {
        this.mTriggerComponentKey = str;
        this.mEventKey = str2;
        this.mAction = str3;
    }

    public String getAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e81f414d", new Object[]{this});
        }
        return this.mAction;
    }

    public String getEventKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("312762fe", new Object[]{this});
        }
        return this.mEventKey;
    }

    public String getNeedAdjustOptimize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("66c6ca41", new Object[]{this});
        }
        return this.mNeedAdjustOptimize;
    }

    public AURARenderComponent getRenderComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponent) ipChange.ipc$dispatch("659b1b43", new Object[]{this});
        }
        return this.mRenderComponent;
    }

    public MultiTreeNode getStateTree() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MultiTreeNode) ipChange.ipc$dispatch("ac3a992a", new Object[]{this});
        }
        return this.mMultiTreeNode;
    }

    public String getTriggerComponentKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a4dd92b5", new Object[]{this});
        }
        return this.mTriggerComponentKey;
    }

    public void setNeedAdjustOptimize(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5e43955", new Object[]{this, str});
        } else {
            this.mNeedAdjustOptimize = str;
        }
    }

    public void setRenderComponent(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83195a6f", new Object[]{this, aURARenderComponent});
        } else {
            this.mRenderComponent = aURARenderComponent;
        }
    }

    public void setStateTree(MultiTreeNode multiTreeNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ad03cc6", new Object[]{this, multiTreeNode});
        } else {
            this.mMultiTreeNode = multiTreeNode;
        }
    }
}
