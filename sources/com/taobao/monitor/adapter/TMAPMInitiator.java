package com.taobao.monitor.adapter;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.nnl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class TMAPMInitiator extends AbsAPMInitiator {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(TMAPMInitiator tMAPMInitiator, String str, Object... objArr) {
        if (str.hashCode() == -572845173) {
            super.init((Application) objArr[0], (HashMap) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/monitor/adapter/TMAPMInitiator");
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
        nnl.b("com.tmall.wireless.splash.TMSplashActivity");
        nnl.b("com.taobao.bootimage.activity.BootImageActivity");
        nnl.b("com.taobao.linkmanager.AlibcEntranceActivity");
        nnl.b("com.taobao.linkmanager.AlibcOpenActivity");
        nnl.b("com.taobao.linkmanager.AlibcTransparentActivity");
        nnl.b("com.taobao.linkmanager.AlibcWindvaneCompatActivity");
        nnl.b("com.taobao.linkmanager.AlibcAuthActivity");
        nnl.g("com.tmall.wireless.homepage.activity.TMHomePageActivity");
        nnl.g("com.tmall.wireless.detail.ui.TMItemDetailsActivity");
        nnl.g("com.tmall.wireless.maintab.module.TMMainTabActivity");
        nnl.g("com.tmall.wireless.mytmall.ui.TMMtmallActivityA");
        nnl.g("com.tmall.wireless.messagebox.activity.TMMsgboxCategoryActivity");
        nnl.g("com.tmall.wireless.shop.TMShopActivity");
        nnl.g("com.tmall.wireless.minidetail.activity.TMMiniDetailActivity");
        nnl.g("com.taobao.message.accounts.activity.AccountActivity");
        nnl.g("com.taobao.android.shop.activity.ShopHomePageActivity");
        nnl.g("com.taobao.weex.WXActivity");
        nnl.g("com.taobao.android.trade.cart.CartActivity");
        nnl.g("com.tmall.wireless.login.TMLoginActivity");
    }
}
