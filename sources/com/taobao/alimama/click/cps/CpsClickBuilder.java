package com.taobao.alimama.click.cps;

import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.utils.Global;
import tb.dw4;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class CpsClickBuilder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1017118747);
    }

    public Uri commitAndAppendClickid(String str, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("3f346704", new Object[]{this, str, uri});
        }
        return new dw4(Global.getApplication()).commitEvent(str, uri);
    }
}
