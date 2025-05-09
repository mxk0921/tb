package com.alipay.ma.encode.InputParameters;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class Gen1InputParameters extends MaEncodeInputParameters {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public byte[] background_img;
    public int background_img_channel;
    public int background_img_depth;
    public int background_img_height;
    public int background_img_width;
    public String hiddenData;
    public int margin;
    public int qrX;
    public int qrY;

    public Gen1InputParameters() {
        this.type = 1;
    }

    public static /* synthetic */ Object ipc$super(Gen1InputParameters gen1InputParameters, String str, Object... objArr) {
        if (str.hashCode() == -1021172550) {
            return new Boolean(super.isLegal());
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/ma/encode/InputParameters/Gen1InputParameters");
    }

    @Override // com.alipay.ma.encode.InputParameters.MaEncodeInputParameters
    public boolean isLegal() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c32224ba", new Object[]{this})).booleanValue();
        }
        super.isLegal();
        if (this.background_img.length <= 0 || (i = this.background_img_width) <= 0 || i <= 0 || this.background_img_channel <= 0) {
            this.errorMsg += "ERROR: background image' width or height or channel is ilegal\n ";
            return false;
        }
        int i2 = this.margin;
        if (i2 <= 0) {
            i2 = 0;
        }
        int i3 = this.version;
        if (i3 <= 0) {
            i3 = 0;
        }
        if (this.qrSize % (((i3 * 4) + 17) + (i2 * 2)) == 0) {
            return true;
        }
        this.errorMsg += "ERROR: width , version , margin should according to the formula:  width % (17 + _version *4 + 2*margin) == 0 \n";
        return false;
    }
}
