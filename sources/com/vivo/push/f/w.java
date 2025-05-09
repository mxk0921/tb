package com.vivo.push.f;

import android.text.TextUtils;
import com.alibaba.idst.nls.nlsclientsdk.requests.Constant;
import com.vivo.push.f.u;
import com.vivo.push.m;
import com.vivo.push.restructure.a;
import com.vivo.push.util.f;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
final class w implements u.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ v f14605a;

    public w(v vVar) {
        this.f14605a = vVar;
    }

    @Override // com.vivo.push.f.u.a
    public final void a() {
        long k = m.a().k();
        if (k >= 1400 || k == 1340) {
            HashMap hashMap = new HashMap();
            hashMap.put("srt", "1");
            hashMap.put(Constant.PROP_MESSAGE_ID, String.valueOf(this.f14605a.b.f()));
            String a2 = a.a().e().a();
            if (!TextUtils.isEmpty(a2)) {
                hashMap.put("app_id", a2);
            }
            hashMap.put("type", "1");
            hashMap.put("dtp", "1");
            f.a(6L, hashMap);
            return;
        }
        com.vivo.push.util.u.b("OnNotificationArrivedTask", "引擎版本太低，不支持正向展示功能，pushEngineSDKVersion：".concat(String.valueOf(k)));
    }

    @Override // com.vivo.push.f.u.a
    public final void b() {
        HashMap hashMap = new HashMap();
        hashMap.put("messageID", String.valueOf(this.f14605a.b.f()));
        String a2 = a.a().e().a();
        if (!TextUtils.isEmpty(a2)) {
            hashMap.put("remoteAppId", a2);
        }
        f.a(2122L, hashMap);
    }
}
