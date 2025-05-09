package com.taobao.android.linkback;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.wpg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class LinkBackUrlExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final List<String> S_ROUTE_EXCLUSION = new ArrayList<String>() { // from class: com.taobao.android.linkback.LinkBackUrlExecutor.1
        {
            add("com.taobao.android.shop.activity.ShopUrlRouterActivity");
            add("com.taobao.browser.router.FromH5RouterActivity");
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public String f8239a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final LinkBackUrlExecutor f8240a = new LinkBackUrlExecutor();

        public static /* synthetic */ LinkBackUrlExecutor a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LinkBackUrlExecutor) ipChange.ipc$dispatch("a6aecc2", new Object[0]);
            }
            return f8240a;
        }
    }

    public static LinkBackUrlExecutor c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkBackUrlExecutor) ipChange.ipc$dispatch("6053ede7", new Object[0]);
        }
        return a.a();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e061b7e", new Object[]{this});
        } else {
            this.f8239a = "";
        }
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("74b5cab9", new Object[]{this});
        }
        return this.f8239a;
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98ed13dd", new Object[]{this, str});
            return;
        }
        if (!TextUtils.equals(str, this.f8239a)) {
            wpg.e(str);
        }
        this.f8239a = str;
    }

    public LinkBackUrlExecutor() {
    }
}
