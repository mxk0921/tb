package com.ap.zlz.toyger.zdoc;

import com.alipay.zoloz.toyger.ToygerBiometricInfo;
import com.alipay.zoloz.toyger.algorithm.TGFrame;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;
import tb.u5u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ToygerDocInfo extends ToygerBiometricInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public u5u attr;
    public TGFrame frame;
    public ToygerDocBlobConfig mBlobConfig;

    static {
        t2o.a(245366793);
    }

    public ToygerDocInfo() {
    }

    public static /* synthetic */ Object ipc$super(ToygerDocInfo toygerDocInfo, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ap/zlz/toyger/zdoc/ToygerDocInfo");
    }

    public ToygerDocBlobConfig getBlobConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ToygerDocBlobConfig) ipChange.ipc$dispatch("9a306f59", new Object[]{this});
        }
        return this.mBlobConfig;
    }

    public void setBlobConfig(ToygerDocBlobConfig toygerDocBlobConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aa23907", new Object[]{this, toygerDocBlobConfig});
        } else {
            this.mBlobConfig = toygerDocBlobConfig;
        }
    }

    public ToygerDocInfo(TGFrame tGFrame, u5u u5uVar) {
        this.frame = tGFrame;
        this.attr = u5uVar;
    }
}
