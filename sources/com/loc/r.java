package com.loc;

import android.net.Uri;
import android.text.TextUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class r extends bt {
    @Override // com.loc.bt
    public String c() {
        Uri.Builder buildUpon;
        String str;
        if (TextUtils.isEmpty(b())) {
            return b();
        }
        String b = b();
        Uri parse = Uri.parse(b);
        if (parse.getAuthority().startsWith("dualstack-")) {
            return b;
        }
        if (parse.getAuthority().startsWith("restsdk.amap.com")) {
            buildUpon = parse.buildUpon();
            str = "dualstack-arestapi.amap.com";
        } else {
            buildUpon = parse.buildUpon();
            str = "dualstack-" + parse.getAuthority();
        }
        return buildUpon.authority(str).build().toString();
    }
}
