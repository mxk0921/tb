package com.taobao.login4android.qrcode.data;

import android.os.SystemClock;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class QrCodeData implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long QR_CODE_QUERY_INTERVAL = 2000;
    public static final long QR_CODE_VALID_PERIOD = 900000;
    public String qrCode;
    public String qrCodeImgUrl;
    public String qrCodeUrl;
    public int cycleSecs = 2000;
    private long mValidPeriod = QR_CODE_VALID_PERIOD;
    private long mCreateTime = SystemClock.elapsedRealtime();

    static {
        t2o.a(70254973);
    }

    public boolean isValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        if (TextUtils.isEmpty(this.qrCode) || TextUtils.isEmpty(this.qrCodeUrl) || SystemClock.elapsedRealtime() - this.mCreateTime > this.mValidPeriod) {
            return false;
        }
        return true;
    }
}
