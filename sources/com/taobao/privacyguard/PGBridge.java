package com.taobao.privacyguard;

import com.alibaba.wireless.security.aopsdk.AopBridge;
import com.alibaba.wireless.security.aopsdk.Invocation;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.rhl;
import tb.t2o;
import tb.xhl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class PGBridge extends AopBridge {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "PGBridge";
    public final xhl mPGReportManager = new xhl();

    static {
        t2o.a(757071874);
    }

    public static /* synthetic */ Object ipc$super(PGBridge pGBridge, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1820922206:
                super.resultBridgeV((Invocation) objArr[0]);
                return null;
            case -1168893114:
                return super.resultBridge((Invocation) objArr[0]);
            case 325535248:
                return new Boolean(super.callBeforeBridge((Invocation) objArr[0]));
            case 1067314891:
                super.callAfterBridge((Invocation) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/privacyguard/PGBridge");
        }
    }

    @Override // com.alibaba.wireless.security.aopsdk.AopBridge
    public void callAfterBridge(Invocation invocation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f9deecb", new Object[]{this, invocation});
        } else {
            super.callAfterBridge(invocation);
        }
    }

    @Override // com.alibaba.wireless.security.aopsdk.AopBridge
    public boolean callBeforeBridge(Invocation invocation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("13674610", new Object[]{this, invocation})).booleanValue();
        }
        if (rhl.d().g()) {
            return super.callBeforeBridge(invocation);
        }
        return false;
    }

    @Override // com.alibaba.wireless.security.aopsdk.AopBridge
    public void report(Invocation invocation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4675afe", new Object[]{this, invocation});
        }
    }

    @Override // com.alibaba.wireless.security.aopsdk.AopBridge
    public void reportTimeCost(Invocation invocation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c842a6e4", new Object[]{this, invocation});
        } else if (rhl.d().g() && invocation.shouldReport) {
            this.mPGReportManager.c(invocation);
        }
    }

    @Override // com.alibaba.wireless.security.aopsdk.AopBridge
    public Object resultBridge(Invocation invocation) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ba541b46", new Object[]{this, invocation});
        }
        return super.resultBridge(invocation);
    }

    @Override // com.alibaba.wireless.security.aopsdk.AopBridge
    public void resultBridgeV(Invocation invocation) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9376eea2", new Object[]{this, invocation});
        } else {
            super.resultBridgeV(invocation);
        }
    }

    @Override // com.alibaba.wireless.security.aopsdk.AopBridge
    public boolean shouldSampleDefault(Invocation invocation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3635ff2", new Object[]{this, invocation})).booleanValue();
        }
        return true;
    }
}
