package com.ta.utdid2.device;

import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.android.utils.AESUtils;
import com.ta.utdid2.android.utils.Base64;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class UTUtdidHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(966787139);
    }

    public String dePack(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("92eca6b5", new Object[]{this, str});
        }
        return AESUtils.decrypt(str);
    }

    public String pack(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8912099", new Object[]{this, bArr});
        }
        return AESUtils.encrypt(Base64.encodeToString(bArr, 2));
    }

    public String packUtdidStr(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fc6e8925", new Object[]{this, str});
        }
        return AESUtils.encrypt(str);
    }
}
