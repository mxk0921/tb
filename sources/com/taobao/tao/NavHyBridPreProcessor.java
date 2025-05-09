package com.taobao.tao;

import android.content.Intent;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import tb.itw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class NavHyBridPreProcessor implements Nav.g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(775946321);
        t2o.a(578814041);
    }

    public boolean beforeNavTo(Intent intent) {
        String queryParameter;
        String uri;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66a5c187", new Object[]{this, intent})).booleanValue();
        }
        Uri data = intent.getData();
        if (!(data == null || (uri = data.toString()) == null || !uri.startsWith(itw.URL_SEPARATOR))) {
            data = Uri.parse("http:".concat(uri));
        }
        if (data != null && data.isHierarchical() && (("http".equals(data.getScheme()) || "https".equals(data.getScheme())) && (queryParameter = data.getQueryParameter("hybrid")) != null && "true".equals(queryParameter))) {
            intent.addCategory("com.taobao.intent.category.HYBRID_UI");
        }
        return true;
    }
}
