package com.taobao.android.interactive;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import tb.fhb;
import tb.h6r;
import tb.od0;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class GuangguangShareNavIntercept implements h6r.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(731906050);
        t2o.a(793772045);
    }

    @Override // tb.h6r.b
    public boolean intercept(Context context, String str) {
        fhb f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27456bad", new Object[]{this, context, str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && str.contains("backToGuangguang=true") && (f = od0.D().f()) != null && f.a() != null && f.z() == 0) {
            Nav.from(context).toUri("https://h5.m.taobao.com/guangguang/index.htm?tabid=home");
        }
        return false;
    }
}
