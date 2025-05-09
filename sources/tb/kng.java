package tb;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IMainFeedsLoopStartStopService;
import com.taobao.tao.homepage.HomepageFragment;
import com.taobao.tao.topmultitab.service.view.IHomeViewService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class kng extends v20 implements q4d, lgb, uwc, IHomeViewService.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_TYPE = "actionType";
    public static final String RECOMMEND_SCENE = "Page_Home_Recommend";

    /* renamed from: a  reason: collision with root package name */
    public final lem f22779a;
    public boolean b;
    public Uri c;
    public String d;
    public String e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            kng kngVar = kng.this;
            kng.b(kngVar, kng.a(kngVar));
        }
    }

    static {
        t2o.a(729810270);
        t2o.a(729810221);
        t2o.a(729810220);
        t2o.a(729810226);
        t2o.a(729810398);
    }

    public kng(wcc wccVar) {
        String str;
        this.f22779a = new lem(wccVar);
        if (e0p.o()) {
            str = "recommend_recommend";
        } else {
            str = "home";
        }
        this.d = str;
    }

    public static /* synthetic */ String a(kng kngVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("52cb9dfa", new Object[]{kngVar});
        }
        return kngVar.d;
    }

    public static /* synthetic */ void b(kng kngVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb939271", new Object[]{kngVar, str});
        } else {
            kngVar.g(str);
        }
    }

    public static /* synthetic */ Object ipc$super(kng kngVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/topmultitab/service/poplayer/impl/listener/LifeMultiCycleListener");
    }

    public final JSONObject c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e817b98f", new Object[]{this, str});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("actionType", (Object) str);
        return jSONObject;
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e16f8ec8", new Object[]{this});
            return;
        }
        this.e = null;
        this.c = null;
        sfh.d("PopLayer_And_ucp_trigger", "clearOutLinkParams");
    }

    public final String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cc1cb8bd", new Object[]{this, str});
        }
        sfh.d("PopLayer_And_ucp_trigger", "当前的tab类型是：" + str);
        return !e(str) ? str : RECOMMEND_SCENE;
    }

    public final void g(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66ed4a9d", new Object[]{this, str});
            return;
        }
        String f = f(str);
        Uri uri = this.c;
        if (uri == null) {
            str2 = "";
        } else {
            str2 = uri.toString();
        }
        JSONObject c = c("coldStart");
        sfh.d("PopLayer_And_ucp_trigger", "onLazyInit，当前的tab是：" + f + "当前的uri是：" + str2);
        this.f22779a.d(TextUtils.equals(RECOMMEND_SCENE, f) ? HomepageFragment.class.getSimpleName() : f);
        this.f22779a.e(f, str2, c);
        if (e(this.e)) {
            d();
        }
    }

    public final void h(String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abcb9680", new Object[]{this, str, str2});
            return;
        }
        String f = f(str2);
        Uri uri = this.c;
        if (uri == null) {
            str3 = "";
        } else {
            str3 = uri.toString();
        }
        JSONObject c = c(str);
        sfh.d("PopLayer_And_ucp_trigger", "当前的tab是:" + f + " uri:" + str3 + " actionType：" + str);
        this.f22779a.e(f, str3, c);
        lem lemVar = this.f22779a;
        if (TextUtils.equals(RECOMMEND_SCENE, f)) {
            f = lem.POP_LAYER_RECOMMEND_TAB_NAME;
        }
        lemVar.c(f);
        if (e(this.e)) {
            d();
        }
        if (IMainFeedsLoopStartStopService.a.TAB_SWITCH.equals(str)) {
            d();
        }
    }

    @Override // tb.lgb
    public void onAppToBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("938dadf2", new Object[]{this});
        }
    }

    @Override // tb.lgb
    public void onAppToFront() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0c238d3", new Object[]{this});
        } else {
            this.b = true;
        }
    }

    @Override // tb.v20, com.taobao.tao.topmultitab.service.lifecycle.listener.IPageLifeCycle
    public void onLazyInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1fcb0aa", new Object[]{this});
        } else {
            yet.a(new a());
        }
    }

    @Override // tb.q4d
    public void onOutLink(String str, Intent intent, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dd04721", new Object[]{this, str, intent, str2});
            return;
        }
        sfh.d("PopLayer_And_ucp_trigger", "外链触发, intent: " + intent + "当前外链拉起的tab是： " + str);
        this.c = intent.getData();
        this.e = str;
    }

    @Override // com.taobao.tao.topmultitab.service.view.IHomeViewService.b
    public void onPageScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.taobao.tao.topmultitab.service.view.IHomeViewService.b
    public void onPageScrolled(int i, float f, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
        }
    }

    @Override // com.taobao.tao.topmultitab.service.view.IHomeViewService.b
    public void onPageSelected(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db26523d", new Object[]{this, new Integer(i), str});
        } else if (e0p.o()) {
            sfh.d("PopLayer_And_ucp_trigger", "当前是分类tab场景，不响应onPageSelected");
        } else if (TextUtils.equals(str, this.d)) {
            sfh.d("PopLayer_And_ucp_trigger", "最外层tabPageSelect，当前没有变化");
        } else {
            this.d = str;
            h(IMainFeedsLoopStartStopService.a.TAB_SWITCH, str);
        }
    }

    @Override // tb.uwc
    public void selectMultiTab(String str, kkc kkcVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca4828d0", new Object[]{this, str, kkcVar, new Integer(i)});
        } else if (!e0p.o()) {
            sfh.d("PopLayer_And_ucp_trigger", "当前不是分类tab场景，不响应onPageSelected");
        } else if (TextUtils.equals(str, this.d)) {
            sfh.d("PopLayer_And_ucp_trigger", "分类tabPageSelect，当前没有变化");
        } else {
            this.d = str;
            h(IMainFeedsLoopStartStopService.a.TAB_SWITCH, str);
        }
    }

    @Override // tb.v20, com.taobao.tao.topmultitab.service.lifecycle.listener.IPageLifeCycle
    public void onResume(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72eca07d", new Object[]{this, str});
            return;
        }
        sfh.d("PopLayer_And_ucp_trigger", "onResume, type: " + str);
        if (this.b && "backToHome".equals(str)) {
            this.b = false;
            sfh.d("PopLayer_And_ucp_trigger", "从后台回来了，不发送消息");
        } else if ("coldStart".equals(str)) {
            sfh.d("PopLayer_And_ucp_trigger", "冷启的onResume不发送，lazyInit时机发送，和原逻辑保持一致");
        } else if (h8x.a()) {
            sfh.d("PopLayer_And_ucp_trigger", "当前在二楼，不允许出pop");
        } else {
            h(str, this.d);
        }
    }

    public final boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e3105d8", new Object[]{this, str})).booleanValue();
        }
        return TextUtils.equals("home", str) || TextUtils.equals("recommend_recommend", str);
    }
}
