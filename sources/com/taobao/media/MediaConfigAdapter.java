package com.taobao.media;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import tb.gf4;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MediaConfigAdapter implements gf4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(774897679);
        t2o.a(774897666);
    }

    @Override // tb.gf4
    public String getConfig(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("611c4ee3", new Object[]{this, str, str2, str3});
        }
        if (TextUtils.isEmpty(str)) {
            return OrangeConfig.getInstance().getConfig("DWInteractive", str2, str3);
        }
        return OrangeConfig.getInstance().getConfig(str, str2, str3);
    }
}
