package com.zoloz.android.phone.zdoc.module;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class DocModule implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private AlgorithmModule algorithm;
    private CollModule coll = new CollModule();

    static {
        t2o.a(245366958);
    }

    public AlgorithmModule getAlgorithm() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AlgorithmModule) ipChange.ipc$dispatch("cf5eb304", new Object[]{this});
        }
        return this.algorithm;
    }

    public CollModule getColl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CollModule) ipChange.ipc$dispatch("939aecd6", new Object[]{this});
        }
        return this.coll;
    }

    public void setAlgorithm(AlgorithmModule algorithmModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f730d0e0", new Object[]{this, algorithmModule});
        } else {
            this.algorithm = algorithmModule;
        }
    }

    public void setColl(CollModule collModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0d5117e", new Object[]{this, collModule});
        } else {
            this.coll = collModule;
        }
    }
}
