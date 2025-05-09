package com.taobao.android.tbabilitykit.windvane.pop.render;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.taobao.windvane.extra.uc.WVUCWebChromeClient;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.pop.render.ActivityLifeCycleCbRender;
import com.taobao.android.abilitykit.ability.pop.render.IAKPopRender;
import com.taobao.android.abilitykit.ability.pop.render.PopErrorView;
import com.taobao.browser.BrowserHybridWebView;
import com.taobao.taobao.R;
import tb.a8;
import tb.abl;
import tb.fc0;
import tb.gc0;
import tb.h9;
import tb.iab;
import tb.n9;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TAKWindvaneRender<PARAMS extends h9, CONTEXT extends n9> extends ActivityLifeCycleCbRender<PARAMS, CONTEXT> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public CONTEXT f;
    public WVUCWebView g;
    public boolean h = false;
    public gc0 i = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements gc0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.gc0
        public void onActivityResult(int i, int i2, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            } else {
                TAKWindvaneRender.this.g.onActivityResult(i, i2, intent);
            }
        }
    }

    static {
        t2o.a(786432163);
    }

    public static /* synthetic */ Object ipc$super(TAKWindvaneRender tAKWindvaneRender, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1314487601) {
            super.n((String) objArr[0], (JSONObject) objArr[1]);
            return null;
        } else if (hashCode == 1885737845) {
            super.k((View) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/tbabilitykit/windvane/pop/render/TAKWindvaneRender");
        }
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.ActivityLifeCycleCbRender
    public void c(CONTEXT context, PARAMS params, View view, iab iabVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0561e42", new Object[]{this, context, params, view, iabVar});
            return;
        }
        this.f = context;
        h9 h9Var = this.c;
        if (h9Var == null || TextUtils.isEmpty(h9Var.e)) {
            iabVar.a(new a8(10015, "WindVane url is empty"), null);
            return;
        }
        Context d = this.f.d();
        if (d == null) {
            iabVar.a(new a8(90001, "WV render context is null"), null);
            return;
        }
        BrowserHybridWebView browserHybridWebView = new BrowserHybridWebView(d) { // from class: com.taobao.android.tbabilitykit.windvane.pop.render.TAKWindvaneRender.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r10, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == -1253202540) {
                    return new Boolean(super.coreDispatchTouchEvent((MotionEvent) objArr[0]));
                }
                if (hashCode == 143825882) {
                    return new Boolean(super.coreOverScrollBy(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue(), ((Number) objArr[5]).intValue(), ((Number) objArr[6]).intValue(), ((Number) objArr[7]).intValue(), ((Boolean) objArr[8]).booleanValue()));
                }
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/tbabilitykit/windvane/pop/render/TAKWindvaneRender$1");
            }

            @Override // android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView, com.uc.webview.internal.interfaces.IWebViewOverride
            public boolean coreDispatchTouchEvent(MotionEvent motionEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("b54da594", new Object[]{this, motionEvent})).booleanValue();
                }
                if (motionEvent.getActionMasked() == 0 || motionEvent.getPointerCount() > 1) {
                    TAKWindvaneRender.this.h = true;
                }
                return super.coreDispatchTouchEvent(motionEvent);
            }

            @Override // android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView, com.uc.webview.internal.interfaces.IWebViewOverride
            public boolean coreOverScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
                boolean z2 = true;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("8929bda", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8), new Boolean(z)})).booleanValue();
                }
                TAKWindvaneRender tAKWindvaneRender = TAKWindvaneRender.this;
                if (i6 <= 0 || i4 <= 0) {
                    z2 = false;
                }
                tAKWindvaneRender.h = z2;
                requestDisallowInterceptTouchEvent(z2);
                return super.coreOverScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
            }
        };
        this.g = browserHybridWebView;
        browserHybridWebView.getView().setTag(R.id.tak_pop_ability_engine_tag, context.a());
        this.g.getWvUIModel().setLoadingView(View.inflate(context.d(), R.layout.ability_kit_loading, null));
        this.g.setWebChromeClient(new WVUCWebChromeClient());
        this.g.setWebViewClient(new WVUCWebViewClient(d));
        this.g.loadUrl(this.c.e);
        iabVar.onRenderSuccess(this.g);
        this.g.getWvUIModel().setErrorView(new PopErrorView(d, params));
        if (d instanceof fc0) {
            a aVar = new a();
            this.i = aVar;
            ((fc0) d).M(aVar);
        }
        if (!params.f20479a.g0()) {
            this.g.getView().setBackgroundColor(0);
        }
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.ActivityLifeCycleCbRender
    public void e(String str, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59cc3545", new Object[]{this, str, bundle});
        } else if (this.g != null && abl.B()) {
            str.hashCode();
            if (str.equals("onPaused")) {
                this.g.onPause();
            } else if (str.equals("onResume")) {
                this.g.onResume();
            }
        }
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public String i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f8e8363f", new Object[]{this, str});
        }
        return "h5";
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.ActivityLifeCycleCbRender, com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void k(View view) {
        CONTEXT context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70661375", new Object[]{this, view});
            return;
        }
        super.k(view);
        WVUCWebView wVUCWebView = this.g;
        if (wVUCWebView != null) {
            wVUCWebView.destroy();
        }
        if (this.i != null && (context = this.f) != null) {
            Context d = context.d();
            if (d instanceof fc0) {
                ((fc0) d).M1(this.i);
            }
        }
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public boolean l(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("21f6b89a", new Object[]{this, view, new Integer(i)})).booleanValue();
        }
        return this.h;
    }

    @Override // tb.zz1, com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void n(String str, JSONObject jSONObject) {
        WVUCWebView wVUCWebView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a682cf", new Object[]{this, str, jSONObject});
            return;
        }
        super.n(str, jSONObject);
        if (!IAKPopRender.LifecycleType.ANIMATION_POSITION_CHANGE.equals(str) && (wVUCWebView = this.g) != null) {
            wVUCWebView.fireEvent(str, jSONObject != null ? jSONObject.toJSONString() : null);
        }
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void onSizeChanged(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb57503b", new Object[]{this, new Integer(i), new Integer(i2)});
        }
    }
}
