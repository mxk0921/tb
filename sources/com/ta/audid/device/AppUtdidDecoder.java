package com.ta.audid.device;

import com.android.alibaba.ip.runtime.IpChange;
import com.ta.audid.utils.ByteUtils;
import com.ta.utdid2.android.utils.Base64;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class AppUtdidDecoder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(966787076);
    }

    public static UtdidObj decode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UtdidObj) ipChange.ipc$dispatch("faf501ee", new Object[]{str});
        }
        UtdidObj utdidObj = new UtdidObj();
        if (str == null || str.length() != 24) {
            utdidObj.setValid(false);
        } else {
            try {
                byte[] decode = Base64.decode(str, 2);
                if (decode.length == 18) {
                    byte[] bArr = new byte[4];
                    System.arraycopy(decode, 0, bArr, 0, 4);
                    byte b = decode[8];
                    try {
                        utdidObj.setValid(true);
                        utdidObj.setTimestamp(ByteUtils.getLongByByte4(bArr));
                        utdidObj.setVersion(b);
                        return utdidObj;
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception unused2) {
                utdidObj.setValid(false);
                return utdidObj;
            }
        }
        return utdidObj;
    }
}
