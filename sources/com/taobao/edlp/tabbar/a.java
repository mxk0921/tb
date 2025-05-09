package com.taobao.edlp.tabbar;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.edlp.tabbar.IEdlpTabBarActionButtonProvider;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.b98;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class a implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ EdlpTabBarActionButtonProvider f10423a;

    public a(EdlpTabBarActionButtonProvider edlpTabBarActionButtonProvider) {
        this.f10423a = edlpTabBarActionButtonProvider;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else if ("picNoScroll".equals(EdlpTabBarActionButtonProvider.z(this.f10423a).b)) {
            if (EdlpTabBarActionButtonProvider.B(this.f10423a) != null) {
                ((TUrlImageView) EdlpTabBarActionButtonProvider.B(this.f10423a).findViewById(R.id.iv_btn_tab_select)).setVisibility(4);
                ((TUrlImageView) EdlpTabBarActionButtonProvider.B(this.f10423a).findViewById(R.id.iv_btn_tab)).setVisibility(0);
                return;
            }
            TLog.loge("EdlpTabBarActionButtonProvider", "processClickTab3 mCustomView为空");
        } else if (!"gifAndScroll".equals(EdlpTabBarActionButtonProvider.z(this.f10423a).b)) {
            TLog.loge("EdlpTabBarActionButtonProvider", "initViews alien logo mode is not PICNOSCROLL & GIFANDSCROLL");
            EdlpTabBarActionButtonProvider.j(this.f10423a, b98.a(), IEdlpTabBarActionButtonProvider.OperTypeEnum.DELETEINCON, "4");
        } else if (!EdlpTabBarActionButtonProvider.e(this.f10423a)) {
            ((TabBarScrollerView) EdlpTabBarActionButtonProvider.h(this.f10423a).findViewById(R.id.iv_scroller_tab)).foregroundToBackground();
        }
    }
}
