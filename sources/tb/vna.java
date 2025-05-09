package tb;

import android.content.Context;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.uikit.extend.component.refresh.TBRefreshHeader;
import java.util.ArrayList;
import mtopsdk.common.util.MtopUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class vna {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public DXRootView f30122a;
    public View b;
    public JSONObject c;

    static {
        t2o.a(729810310);
    }

    public void a(Context context, FrameLayout frameLayout, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53c3c7a3", new Object[]{this, context, frameLayout, jSONObject});
        } else if (jSONObject == null || !jSONObject.containsKey("template")) {
            bqa.d("GuideViewWidgetNode", "secondFloor data has no template info.");
        } else {
            this.c = jSONObject;
            frameLayout.removeAllViews();
            DinamicXEngine d = h5b.e().d();
            DXTemplateItem b = tit.b(jSONObject.getJSONObject("template")).b();
            DXTemplateItem u = d.u(b);
            if (u != null) {
                DXRootView dXRootView = d.z0(context, u).f7291a;
                this.f30122a = dXRootView;
                frameLayout.addView(dXRootView);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(b);
            d.p(arrayList);
            DXRootView dXRootView2 = this.f30122a;
            if (dXRootView2 != null) {
                d.j1(dXRootView2, jSONObject);
            }
            this.b = frameLayout;
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cca79add", new Object[]{this});
            return;
        }
        View view = this.b;
        if (view == null) {
            bqa.d("GuideViewWidgetNode", "mGuideView == null");
            return;
        }
        view.setVisibility(0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(1500L);
        alphaAnimation.setInterpolator(MtopUtils.getContext(), 17563659);
        this.b.setAnimation(alphaAnimation);
    }

    public final void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e629923", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            r5a.m(jSONObject, jSONObject.getJSONObject("item"));
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a221e263", new Object[]{this});
            return;
        }
        View view = this.b;
        if (view == null) {
            bqa.d("GuideViewWidgetNode", "hideTemplate mGuideView == null");
            return;
        }
        view.clearAnimation();
        this.b.setVisibility(4);
    }

    public void e(TBRefreshHeader.RefreshState refreshState, TBRefreshHeader.RefreshState refreshState2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f1ba5ae", new Object[]{this, refreshState, refreshState2});
            return;
        }
        if (refreshState == TBRefreshHeader.RefreshState.RELEASE_TO_REFRESH && refreshState2 == TBRefreshHeader.RefreshState.PREPARE_TO_SECOND_FLOOR) {
            b();
            c(this.c);
            bqa.d("GuideViewWidgetNode", "设置引导条可见");
        }
        if (refreshState == TBRefreshHeader.RefreshState.PREPARE_TO_SECOND_FLOOR) {
            d();
            bqa.d("GuideViewWidgetNode", "新状态是要进入二楼了，设置引导条不可见");
        }
    }
}
