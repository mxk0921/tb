package com.ali.user.mobile.register.old;

import android.text.style.URLSpan;
import android.view.View;
import com.ali.user.mobile.utils.NavUtil;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class TaoUrlSpan extends URLSpan {
    static {
        t2o.a(69206192);
    }

    public TaoUrlSpan(String str) {
        super(str);
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public void onClick(View view) {
        if (view != null && view.getContext() != null) {
            NavUtil.startUrl(view.getContext(), getURL());
        }
    }
}
