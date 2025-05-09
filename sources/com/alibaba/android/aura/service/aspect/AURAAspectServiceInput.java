package com.alibaba.android.aura.service.aspect;

import com.alibaba.android.aura.AURAInputData;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.cg;
import tb.mi;
import tb.t2o;
import tb.yk;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class AURAAspectServiceInput implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private cg mAspectInfo;
    private mi mError;
    private AURAInputData mInputData;
    private boolean mIsAspectError;
    private boolean mIsError;
    private yk mOutputData;
    private int mType;

    static {
        t2o.a(79691946);
    }

    private AURAAspectServiceInput() {
    }

    public static AURAAspectServiceInput afterFlowExecute(String str, yk ykVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURAAspectServiceInput) ipChange.ipc$dispatch("669e394b", new Object[]{str, ykVar, new Boolean(z)});
        }
        AURAAspectServiceInput aURAAspectServiceInput = new AURAAspectServiceInput();
        aURAAspectServiceInput.mType = 1;
        aURAAspectServiceInput.mOutputData = ykVar;
        aURAAspectServiceInput.mIsError = z;
        aURAAspectServiceInput.mAspectInfo = new cg(str, "");
        return aURAAspectServiceInput;
    }

    public static AURAAspectServiceInput afterServiceExecute(String str, String str2, yk ykVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURAAspectServiceInput) ipChange.ipc$dispatch("df2e2e90", new Object[]{str, str2, ykVar, new Boolean(z)});
        }
        AURAAspectServiceInput aURAAspectServiceInput = new AURAAspectServiceInput();
        aURAAspectServiceInput.mType = 3;
        aURAAspectServiceInput.mOutputData = ykVar;
        aURAAspectServiceInput.mIsError = z;
        aURAAspectServiceInput.mAspectInfo = new cg(str, str2);
        return aURAAspectServiceInput;
    }

    public static AURAAspectServiceInput beforeFlowExecute(String str, AURAInputData aURAInputData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURAAspectServiceInput) ipChange.ipc$dispatch("128a2b01", new Object[]{str, aURAInputData});
        }
        AURAAspectServiceInput aURAAspectServiceInput = new AURAAspectServiceInput();
        aURAAspectServiceInput.mType = 0;
        aURAAspectServiceInput.mInputData = aURAInputData;
        aURAAspectServiceInput.mAspectInfo = new cg(str, "");
        return aURAAspectServiceInput;
    }

    public static AURAAspectServiceInput beforeServiceExecute(String str, String str2, AURAInputData aURAInputData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURAAspectServiceInput) ipChange.ipc$dispatch("2ae84660", new Object[]{str, str2, aURAInputData});
        }
        AURAAspectServiceInput aURAAspectServiceInput = new AURAAspectServiceInput();
        aURAAspectServiceInput.mType = 2;
        aURAAspectServiceInput.mInputData = aURAInputData;
        aURAAspectServiceInput.mAspectInfo = new cg(str, str2);
        return aURAAspectServiceInput;
    }

    public static AURAAspectServiceInput error(mi miVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURAAspectServiceInput) ipChange.ipc$dispatch("7326f3d3", new Object[]{miVar, new Boolean(z)});
        }
        AURAAspectServiceInput aURAAspectServiceInput = new AURAAspectServiceInput();
        aURAAspectServiceInput.mType = 4;
        aURAAspectServiceInput.mError = miVar;
        aURAAspectServiceInput.mIsAspectError = z;
        return aURAAspectServiceInput;
    }

    public cg getAspectInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cg) ipChange.ipc$dispatch("35e22bd0", new Object[]{this});
        }
        return this.mAspectInfo;
    }

    public mi getError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mi) ipChange.ipc$dispatch("c7be692", new Object[]{this});
        }
        return this.mError;
    }

    public AURAInputData getInputData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURAInputData) ipChange.ipc$dispatch("76763cfa", new Object[]{this});
        }
        return this.mInputData;
    }

    public yk getOutputData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yk) ipChange.ipc$dispatch("7888a2b0", new Object[]{this});
        }
        return this.mOutputData;
    }

    public int getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue();
        }
        return this.mType;
    }

    public boolean isAspectError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e4aff291", new Object[]{this})).booleanValue();
        }
        return this.mIsAspectError;
    }

    public boolean isError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59cf5489", new Object[]{this})).booleanValue();
        }
        return this.mIsError;
    }
}
