package com.ta.utdid2.device;

import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.android.utils.AESUtils;
import com.ta.utdid2.android.utils.Base64;
import com.ta.utdid2.android.utils.StringUtils;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class UTUtdidHelper2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(966787140);
    }

    public String dePack(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("92eca6b5", new Object[]{this, str});
        }
        return AESUtils.decrypt(str);
    }

    public String dePackWithBase64(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("378597c0", new Object[]{this, str});
        }
        String decrypt = AESUtils.decrypt(str);
        if (!StringUtils.isEmpty(decrypt)) {
            try {
                return new String(Base64.decode(decrypt, 0));
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }
}
