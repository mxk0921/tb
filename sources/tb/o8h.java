package tb;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class o8h implements fsl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(614465594);
        t2o.a(614465599);
    }

    @Override // tb.fsl
    public Object a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("acbcdf66", new Object[]{this, str, obj});
        }
        Context x = DinamicXEngine.x();
        if (x == null) {
            return null;
        }
        if (upx.APDIDTOKEN.equals(str)) {
            try {
                return APSecuritySdk.getInstance(x).getTokenResult().apdidToken;
            } catch (Exception unused) {
                return null;
            }
        } else {
            if ("websiteLanguage".equals(str)) {
                try {
                    return x.getResources().getConfiguration().locale.toString();
                } catch (Exception unused2) {
                }
            }
            return null;
        }
    }
}
