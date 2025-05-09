package com.taobao.tao.infoflow.multitab.viewprovider.viewpager;

import com.alibaba.fastjson.JSONObject;
import com.taobao.uikit.extend.component.refresh.TBRefreshHeader;
import java.util.List;
import tb.ywc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface a extends ywc {
    public static final String KEY = "IMultiSubTabContainerProtocol";

    /* compiled from: Taobao */
    /* renamed from: com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface AbstractC0710a {
        void onPageScrollStateChanged(int i);

        void onPageScrolled(int i, float f, int i2);

        void onPageSelected(int i);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface b {
        void onPullDistance(int i);

        void onRefresh();

        void onRefreshStateChanged(TBRefreshHeader.RefreshState refreshState, TBRefreshHeader.RefreshState refreshState2);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface c {
        void a(int i);
    }

    List<JSONObject> i();

    void j(b bVar);

    void k(boolean z);

    void l(AbstractC0710a aVar);

    void m(int i);

    void n(int i, boolean z);

    void q(c cVar);

    void s(boolean z);

    void setRefreshing(boolean z);
}
