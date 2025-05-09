package com.ali.user.open.mtop;

import com.android.alibaba.ip.runtime.IpChange;
import tb.rid;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class UccRemoteLogin {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static rid getUccLoginImplWithSite(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rid) ipChange.ipc$dispatch("6e2fde34", new Object[]{str});
        }
        return new UccMtopLoginImpl(str);
    }
}
