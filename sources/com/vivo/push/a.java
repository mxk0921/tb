package com.vivo.push;

import com.vivo.push.listener.IPushQueryActionListener;
import com.vivo.push.util.g;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class a {
    public void deleteRegid(IPushActionListener iPushActionListener, String str, String str2) {
        com.vivo.push.restructure.a.a().h().a(iPushActionListener, str, str2);
    }

    public void getRegId(IPushQueryActionListener iPushQueryActionListener) {
        g.a().execute(new b(this, iPushQueryActionListener));
    }

    public void querySubscribeState(IPushActionListener iPushActionListener) {
        g.a().execute(new c(this, iPushActionListener));
    }
}
