package com.taobao.weex.adapter;

import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TBWXNavPreProcessor implements Nav.g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(773849110);
        t2o.a(578814041);
    }

    public boolean beforeNavTo(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66a5c187", new Object[]{this, intent})).booleanValue();
        }
        return true;
    }
}
