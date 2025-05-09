package com.alipay.ma.encode.InputParameters;

import com.android.alibaba.ip.runtime.IpChange;
import tb.ohh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MaEncodeInputParameters {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int type = 0;
    public String publicData = null;
    public String errorMsg = "";
    public char errorCorrectionLevel = ohh.LEVEL_L;
    public int rotation = 0;
    public int qrSize = 0;
    public int version = 4;

    public boolean isLegal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c32224ba", new Object[]{this})).booleanValue();
        }
        if (this.qrSize <= 0) {
            this.errorMsg += "ERROR: qrSize <=0 ";
            return false;
        } else if (this.publicData != null) {
            return true;
        } else {
            this.errorMsg += "ERROR: publicData cant be null \n";
            return false;
        }
    }
}
