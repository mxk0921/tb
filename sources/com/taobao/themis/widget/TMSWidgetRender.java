package com.taobao.themis.widget;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.widget.kernal.TMSWidgetEngine;
import com.taobao.weex.ui.flat.widget.Widget;
import tb.bbs;
import tb.ckf;
import tb.d9s;
import tb.ocs;
import tb.q9s;
import tb.rde;
import tb.t2o;
import tb.wde;
import tb.wsq;
import tb.xes;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSWidgetRender extends d9s implements wde {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final ITMSPage e;
    public final WidgetRootView f;
    public TMSWidgetEngine.WidgetRenderInstance g;
    public TMSWidgetEngine h;

    static {
        t2o.a(852492296);
        t2o.a(852492348);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TMSWidgetRender(ITMSPage iTMSPage, ocs ocsVar) {
        super(iTMSPage, ocsVar);
        ckf.g(iTMSPage, "page");
        ckf.g(ocsVar, "renderListener");
        this.e = iTMSPage;
        Activity I = this.d.I();
        ckf.f(I, "mInstance.activity");
        this.f = new WidgetRootView(I, this.d);
        iTMSPage.x(this);
    }

    public static /* synthetic */ Object ipc$super(TMSWidgetRender tMSWidgetRender, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2088493082:
                super.onViewDisappear();
                return null;
            case -1983604863:
                super.destroy();
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1073542112:
                super.onViewAppear();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/widget/TMSWidgetRender");
        }
    }

    public static final /* synthetic */ bbs q1(TMSWidgetRender tMSWidgetRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs) ipChange.ipc$dispatch("7e56fd63", new Object[]{tMSWidgetRender});
        }
        return tMSWidgetRender.d;
    }

    @Override // tb.z5d
    public void G(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fea6c5d4", new Object[]{this, iTMSPage});
        } else {
            wde.a.b(this, iTMSPage);
        }
    }

    @Override // tb.qcs
    public void P(String str, JSON json) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb823f9b", new Object[]{this, str, json});
            return;
        }
        ckf.g(str, "event");
        TMSWidgetEngine.WidgetRenderInstance widgetRenderInstance = this.g;
        if (widgetRenderInstance != null) {
            widgetRenderInstance.D(str, json);
        }
    }

    @Override // tb.rde
    public void T0(rde.a aVar) {
        TMSWidgetEngine.WidgetRenderInstance widgetRenderInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7491661c", new Object[]{this, aVar});
            return;
        }
        ckf.g(aVar, "callback");
        if (q9s.N2() && (widgetRenderInstance = this.g) != null) {
            widgetRenderInstance.O(new TMSWidgetRender$getMonitorData$1(aVar, this));
        }
    }

    @Override // tb.d9s, tb.qcs
    public void X0(String str, JSON json) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1761c13a", new Object[]{this, str, json});
            return;
        }
        ckf.g(str, "event");
        TMSWidgetEngine.WidgetRenderInstance widgetRenderInstance = this.g;
        if (widgetRenderInstance != null) {
            widgetRenderInstance.D(str, json);
        }
    }

    @Override // tb.wde
    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("313409ce", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, "errorCode");
        ckf.g(str2, "errorMsg");
        this.b.b(str, str2);
    }

    @Override // tb.z5d
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896696a2", new Object[]{this});
        } else {
            wde.a.c(this);
        }
    }

    @Override // tb.d9s, tb.qcs
    public void destroy() {
        TMSWidgetEngine tMSWidgetEngine;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        TMSWidgetEngine.WidgetRenderInstance widgetRenderInstance = this.g;
        if (!(widgetRenderInstance == null || (tMSWidgetEngine = this.h) == null)) {
            tMSWidgetEngine.H(widgetRenderInstance);
        }
        xes.INSTANCE.f();
        super.destroy();
    }

    @Override // tb.qcs
    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e88638d3", new Object[]{this});
        }
        return Widget.TAG;
    }

    @Override // tb.qcs
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.f;
    }

    @Override // tb.qcs
    public Bitmap l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("ea6f4fbb", new Object[]{this});
        }
        return null;
    }

    @Override // tb.qcs
    public void n(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("245d3ac6", new Object[]{this, str, str2});
        } else {
            ckf.g(str, "script");
        }
    }

    @Override // tb.d9s, tb.qcs
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        TMSWidgetEngine.WidgetRenderInstance widgetRenderInstance = this.g;
        if (widgetRenderInstance != null) {
            widgetRenderInstance.I();
        }
    }

    @Override // tb.d9s, tb.qcs
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        TMSWidgetEngine.WidgetRenderInstance widgetRenderInstance = this.g;
        if (widgetRenderInstance != null) {
            widgetRenderInstance.J();
        }
    }

    @Override // tb.d9s, tb.qcs
    public void onViewAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ffcf3e0", new Object[]{this});
            return;
        }
        super.onViewAppear();
        TMSWidgetEngine.WidgetRenderInstance widgetRenderInstance = this.g;
        if (widgetRenderInstance != null) {
            widgetRenderInstance.K();
        }
    }

    @Override // tb.d9s, tb.qcs
    public void onViewDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83841fe6", new Object[]{this});
            return;
        }
        super.onViewDisappear();
        TMSWidgetEngine.WidgetRenderInstance widgetRenderInstance = this.g;
        if (widgetRenderInstance != null) {
            widgetRenderInstance.L(true);
        }
    }

    @Override // tb.qcs
    public void r(byte[] bArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15684483", new Object[]{this, bArr, str});
        } else {
            ckf.g(bArr, "script");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
        if (r2.w() != false) goto L_0x0032;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean r1() {
        /*
            r4 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.themis.widget.TMSWidgetRender.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0019
            java.lang.String r3 = "22f8023a"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r4
            java.lang.Object r0 = r2.ipc$dispatch(r3, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x0019:
            com.taobao.themis.widget.kernal.TMSWidgetEngine r2 = r4.h
            if (r2 != 0) goto L_0x001f
        L_0x001d:
            r0 = 1
            goto L_0x0046
        L_0x001f:
            tb.bbs r2 = r4.d
            boolean r2 = com.taobao.themis.kernel.utils.TMSInstanceExtKt.s(r2)
            if (r2 == 0) goto L_0x0032
            com.taobao.themis.widget.kernal.TMSWidgetEngine r2 = r4.h
            tb.ckf.d(r2)
            boolean r2 = r2.w()
            if (r2 == 0) goto L_0x001d
        L_0x0032:
            tb.bbs r2 = r4.d
            boolean r2 = com.taobao.themis.kernel.utils.TMSInstanceExtKt.t(r2)
            if (r2 == 0) goto L_0x0046
            com.taobao.themis.widget.kernal.TMSWidgetEngine r2 = r4.h
            tb.ckf.d(r2)
            boolean r2 = r2.x()
            if (r2 != 0) goto L_0x0046
            goto L_0x001d
        L_0x0046:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.widget.TMSWidgetRender.r1():boolean");
    }

    @Override // tb.d9s, tb.qcs
    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("471a0b1d", new Object[]{this});
            return;
        }
        this.h = xes.INSTANCE.d();
        Uri parse = Uri.parse(this.d.c0().getStartUrl());
        String queryParameter = parse.getQueryParameter("debugServerUrl");
        String queryParameter2 = parse.getQueryParameter("jsfm");
        String queryParameter3 = parse.getQueryParameter("apifm");
        String queryParameter4 = parse.getQueryParameter("apifmext");
        if ((queryParameter != null && !wsq.a0(queryParameter)) || ((queryParameter2 != null && !wsq.a0(queryParameter2)) || ((queryParameter3 != null && !wsq.a0(queryParameter3)) || ((queryParameter4 != null && !wsq.a0(queryParameter4)) || r1())))) {
            TMSWidgetEngine tMSWidgetEngine = this.h;
            ckf.d(tMSWidgetEngine);
            tMSWidgetEngine.G(queryParameter2, queryParameter3, queryParameter4, queryParameter);
        }
        TMSWidgetEngine tMSWidgetEngine2 = this.h;
        ckf.d(tMSWidgetEngine2);
        Activity I = this.d.I();
        ckf.f(I, "mInstance.activity");
        TMSWidgetEngine.WidgetRenderInstance o = tMSWidgetEngine2.o(I, this.d, this.e, this.b);
        this.g = o;
        ckf.d(o);
        o.M(this.f);
    }

    @Override // tb.z5d
    public void w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc5065a", new Object[]{this});
        } else {
            wde.a.a(this);
        }
    }
}
