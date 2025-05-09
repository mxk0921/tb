package com.taobao.monitor.adapter;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import com.taobao.message.kit.util.BundleSplitUtil;
import java.util.HashMap;
import tb.lll;
import tb.nnl;
import tb.obq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TBAPMInitiator extends AbsAPMInitiator {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(TBAPMInitiator tBAPMInitiator, String str, Object... objArr) {
        if (str.hashCode() == -572845173) {
            super.init((Application) objArr[0], (HashMap) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/monitor/adapter/TBAPMInitiator");
    }

    @Override // com.taobao.monitor.adapter.AbsAPMInitiator
    public /* bridge */ /* synthetic */ void init(Application application, HashMap hashMap) {
        super.init(application, hashMap);
    }

    @Override // com.taobao.monitor.adapter.AbsAPMInitiator
    public void initPage(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b41f20d9", new Object[]{this, application});
            return;
        }
        nnl.b("com.taobao.tao.welcome.Welcome");
        nnl.b("com.taobao.bootimage.activity.BootImageActivity");
        nnl.b("com.taobao.linkmanager.afc.TbFlowInActivity");
        nnl.b("com.taobao.tao.detail.activity.DetailActivity");
        nnl.b("com.taobao.tao.ocean.dispatcher.DispatcherManager");
        nnl.b("com.taobao.android.shop.activity.ShopUrlRouterActivity");
        nnl.b("com.taobao.tao.msgcenter.activity.MsgCenterThirdPushActivity");
        nnl.b("com.taobao.message.notification.NotifyJumpActivity");
        nnl.b("com.taobao.android.remoteso.component.RemoActivity");
        nnl.b("com.taobao.appbundle.remote.activity.RemoteLoadingActivity");
        nnl.b("com.taobao.tao.tbmainfragment.TBMainFragment");
        nnl.g("com.taobao.tao.homepage.MainActivity3");
        nnl.g(obq.BIZ_NAME);
        nnl.g("com.taobao.search.sf.MainSearchResultActivity");
        nnl.g("com.taobao.browser.BrowserActivity");
        nnl.g("com.taobao.android.detail.wrapper.activity.DetailActivity");
        nnl.g("com.taobao.order.detail.ui.OrderDetailActivity");
        nnl.g("com.taobao.message.accounts.activity.AccountActivity");
        nnl.g("com.alibaba.triver.triver_shop.newShop.NativeShopActivity");
        nnl.g("com.alibaba.triver.container.TriverMainActivity");
        nnl.g("com.taobao.android.shop.activity.ShopHomePageActivity");
        nnl.g("com.taobao.weex.WXActivity");
        nnl.g("com.taobao.android.trade.cart.CartActivity");
        nnl.g(FlexaLiveX.TAO_LIVE_VIDEO_ACTIVITY);
        nnl.g("com.taobao.android.layoutmanager.container.CommonContainerActivity");
        nnl.g("com.taobao.android.layoutmanager.container.MultiPageContainerActivity");
        nnl.g(FlexaLiveX.TAO_LIVE_HOME_ACTIVITY);
        nnl.g("com.taobao.themis.container.app.TMSActivity");
        nnl.f("com.taobao.android.purchase.TBPurchaseActivity");
        nnl.f("com.taobao.order.detail.ui.OrderDetailActivity");
        nnl.e("com.taobao.android.searchbaseframe.business.srp.viewpager.fragment.SearchNativeFragment", true);
        nnl.e("com.taobao.search.sf.MainSearchResultActivity", true);
        nnl.e("com.taobao.order.list.OrderListActivity", true);
        nnl.e("com.taobao.message.category.MsgCenterCategoryFragment", true);
        nnl.e("com.taobao.message.conversation.MessageTabFragment", true);
        nnl.e("com.taobao.android.trade.cart.TabCartFragment", true);
        nnl.e("com.taobao.android.trade.cart.CartActivity", true);
        nnl.e("com.taobao.mytaobao.homepage.MyTaobaoFragment", true);
        nnl.e("TNodeDefaultPageName", true);
        nnl.e("com.taobao.weex.WXActivity", true);
        nnl.e("com.alibaba.aliweex.bundle.WeexPageFragment", true);
        nnl.e("com.taobao.android.detail2.core.framework.NewDetailActivity", true);
        nnl.e("Page_DingYueIndexAll", false);
        nnl.e("com.taobao.search.searchdoor.SearchDoorActivity", true);
        nnl.e("com.etao.feimagesearch.IrpActivity", true);
        nnl.e(FlexaLiveX.TAO_LIVE_VIDEO_ACTIVITY, true);
        nnl.e("com.taobao.android.layoutmanager.container.CommonContainerActivity", true);
        nnl.e("com.taobao.android.layoutmanager.container.MultiPageContainerActivity", true);
        lll.d("com.taobao.android.purchase.TBPurchaseActivity", 0.28f);
        lll.d("com.taobao.order.detail.ui.OrderDetailActivity", 0.35f);
        lll.d("com.taobao.mytaobao.newsetting.dx.DxSettingCommonActivity", 0.6f);
        lll.d("com.taobao.mytaobao.aura.AuraFragment", 0.6f);
        nnl.c("com.taobao.tao.tbmainfragment.TBMainFragment");
        nnl.d("com.taobao.tao.welcome.Welcome");
        nnl.d(obq.BIZ_NAME);
        nnl.d("com.taobao.browser.BrowserActivity");
        nnl.d(BundleSplitUtil.ACTIVITY_NAME);
        nnl.d("com.taobao.android.detail.wrapper.activity.DetailActivity");
        nnl.d("com.alibaba.triver.container.TriverMainActivity");
        nnl.d("com.taobao.android.order.bundle.TBOrderListActivity");
        nnl.d("com.taobao.android.order.bundle.TBOrderDetailActivity");
        nnl.d("com.taobao.android.layoutmanager.container.MultiPageTransparentContainerActivity");
        nnl.d("com.alibaba.triver.triver_shop.newShop.NativeShopActivity");
        nnl.d(FlexaLiveX.TAO_LIVE_HOME_ACTIVITY);
        nnl.d("com.taobao.themis.container.app.TMSActivity");
        nnl.d("com.taobao.android.auth.AuthEntranceActivity");
        nnl.d("com.alibaba.triver.triver_shop.newShop.ShopActivity");
        nnl.a("Page_DingYueIndexAll");
        nnl.a("com.taobao.tao.homepage.HomepageFragment");
        nnl.a("com.taobao.android.icart.UltronICartFragment");
        nnl.a("com.taobao.mytaobao.homepage.MyTaobaoFragment");
        nnl.a("com.taobao.message.conversation.MessageTabFragment");
    }
}
