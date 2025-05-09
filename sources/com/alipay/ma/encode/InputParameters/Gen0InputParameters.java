package com.alipay.ma.encode.InputParameters;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class Gen0InputParameters extends MaEncodeInputParameters {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String hiddenData;
    public int margin;

    public Gen0InputParameters(int i, int i2, String str, int i3) {
        this.type = 0;
        this.publicData = str;
        this.qrSize = i;
        this.margin = i2;
        this.version = i3;
    }

    public static /* synthetic */ Object ipc$super(Gen0InputParameters gen0InputParameters, String str, Object... objArr) {
        if (str.hashCode() == -1021172550) {
            return new Boolean(super.isLegal());
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/ma/encode/InputParameters/Gen0InputParameters");
    }

    @Override // com.alipay.ma.encode.InputParameters.MaEncodeInputParameters
    public boolean isLegal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c32224ba", new Object[]{this})).booleanValue();
        }
        super.isLegal();
        return true;
    }

    public Gen0InputParameters(int i, String str) {
        this.type = 0;
        this.publicData = str;
        this.qrSize = i;
        this.margin = 0;
    }

    public Gen0InputParameters(int i, String str, String str2) {
        this.type = 0;
        this.hiddenData = str2;
        this.publicData = str;
        this.qrSize = i;
        this.margin = 0;
    }
}
