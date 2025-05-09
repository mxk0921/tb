package tb;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.popupcenter.strategy.PopStrategy;
import com.taobao.tao.homepage.HomepageFragment;
import com.taobao.tao.infoflow.commonsubservice.dataservice.HomeInfoFlowDataService;
import com.taobao.tao.topmultitab.service.pageprovider.IHomePageProviderService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class lem {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String POP_LAYER_RECOMMEND_TAB_NAME = HomepageFragment.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public final wcc f23297a;
    public final mll b = new mll();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f23298a;
        public final /* synthetic */ String b;

        public a(Activity activity, String str) {
            this.f23298a = activity;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            sfh.d("PopLayer_And_ucp_trigger", "LazyInit.start.notifyPop.");
            hal.f(PopStrategy.IDENTIFIER_POPLAYER, true);
            kem.d(this.f23298a, this.b);
        }
    }

    static {
        t2o.a(729810268);
    }

    public lem(wcc wccVar) {
        this.f23297a = wccVar;
    }

    public final Runnable a(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("f1acd693", new Object[]{this, activity, str});
        }
        return new a(activity, str);
    }

    public final Activity b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("81223f9c", new Object[]{this});
        }
        IHomePageProviderService iHomePageProviderService = (IHomePageProviderService) this.f23297a.a(IHomePageProviderService.class);
        if (iHomePageProviderService == null) {
            sfh.d("PopLayer_And_ucp_trigger", "pageProvider == null");
            return null;
        }
        z6d pageProvider = iHomePageProviderService.getPageProvider();
        if (pageProvider == null) {
            return null;
        }
        return pageProvider.k1();
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa2bacfd", new Object[]{this, str});
            return;
        }
        Activity b = b();
        if (b == null) {
            sfh.d("PopLayer_And_ucp_trigger", "notifyPopLayerPageSwitch activity == null");
        } else if (this.b.b() || !b9b.e()) {
            kem.d(b, str);
        } else {
            sfh.d("PopLayer_And_ucp_trigger", "notifyPopLayerPageSwitch 不在首页");
        }
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba2e83e2", new Object[]{this, str});
            return;
        }
        Activity b = b();
        if (b == null) {
            sfh.d("PopLayer_And_ucp_trigger", "activity == null");
        } else if (this.b.b() || !b9b.e()) {
            Runnable a2 = a(b, str);
            sfh.d("PopLayer_And_ucp_trigger", "delayAfterHomeLoadedForPopRunnable");
            a2.run();
        } else {
            sfh.d("PopLayer_And_ucp_trigger", "postPopRunnableOnLazyInit 不在首页");
        }
    }

    public void e(String str, String str2, JSONObject jSONObject) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3245ec72", new Object[]{this, str, str2, jSONObject});
            return;
        }
        Activity b = b();
        if (b == null) {
            sfh.d("PopLayer_And_ucp_trigger", "sendBizCustomSceneChangedToUcp activity == null");
        } else if (this.b.b() || !b9b.e()) {
            Intent intent = b.getIntent();
            if (!(intent == null || intent.getData() == null || jSONObject == null)) {
                jSONObject.put("currentPageUrl", (Object) intent.getData().toString());
            }
            HomeInfoFlowDataService a2 = rue.a(yyj.e().k());
            if (!(a2 == null || jSONObject == null || intent == null || (str3 = new wll(intent).b) == null || !a2.isAnimeConfigValidate(str3))) {
                jSONObject.put("fromMiniAppAnimation", "true");
            }
            if (!(a2 == null || TextUtils.isEmpty(a2.getScrollPosition()) || jSONObject == null)) {
                jSONObject.put("scrollPosition", (Object) a2.getScrollPosition());
            }
            kem.e(str, str2, jSONObject);
        } else {
            sfh.d("PopLayer_And_ucp_trigger", "sendBizCustomSceneChangedToUcp 不在首页");
        }
    }
}
