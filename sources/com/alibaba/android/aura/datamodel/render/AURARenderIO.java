package com.alibaba.android.aura.datamodel.render;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AURARenderIO implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final AURARenderComponent mRenderTree;

    static {
        t2o.a(80740407);
    }

    public AURARenderIO(AURARenderComponent aURARenderComponent) {
        this.mRenderTree = aURARenderComponent;
    }

    public AURARenderComponent getRenderTree() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponent) ipChange.ipc$dispatch("5786897c", new Object[]{this});
        }
        return this.mRenderTree;
    }
}
