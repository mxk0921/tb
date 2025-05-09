package com.etao.feimagesearch.capture.tool;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.tool.base.CaptureManager;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.Map;
import tb.a07;
import tb.ckf;
import tb.cql;
import tb.n53;
import tb.t2o;
import tb.xfw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class CaptureToolController {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String TAG = "CaptureToolController";

    /* renamed from: a  reason: collision with root package name */
    public final Activity f4678a;
    public CaptureManager b;
    public CaptureToolRootWidget c;
    public int d = 1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        static {
            t2o.a(481296735);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements xfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.xfw
        public ViewGroup a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("24c47c91", new Object[]{this, view});
            }
            ckf.g(view, "widgetView");
            CaptureToolController.a(CaptureToolController.this).setContentView(view);
            return null;
        }

        @Override // tb.xfw
        public ViewGroup b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("ee7ef752", new Object[]{this, view});
            }
            ckf.g(view, "widgetView");
            return null;
        }
    }

    static {
        t2o.a(481296734);
    }

    public CaptureToolController(Activity activity) {
        ckf.g(activity, "activity");
        this.f4678a = activity;
    }

    public static final /* synthetic */ Activity a(CaptureToolController captureToolController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("ce46d7da", new Object[]{captureToolController});
        }
        return captureToolController.f4678a;
    }

    public static final /* synthetic */ int b(CaptureToolController captureToolController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("28ab12c9", new Object[]{captureToolController})).intValue();
        }
        return captureToolController.d;
    }

    public static final /* synthetic */ void c(CaptureToolController captureToolController, CaptureToolRootWidget captureToolRootWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e26cd71", new Object[]{captureToolController, captureToolRootWidget});
        } else {
            captureToolController.c = captureToolRootWidget;
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.d = 5;
        TLogTracker.o();
        CaptureToolRootWidget captureToolRootWidget = this.c;
        if (captureToolRootWidget != null) {
            captureToolRootWidget.K();
        }
        CaptureToolRootWidget captureToolRootWidget2 = this.c;
        if (captureToolRootWidget2 != null) {
            captureToolRootWidget2.D();
        }
        this.d = 5;
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        this.d = 3;
        TLogTracker.q();
        CaptureToolRootWidget captureToolRootWidget = this.c;
        if (captureToolRootWidget != null) {
            captureToolRootWidget.L();
        }
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        this.d = 2;
        TLogTracker.p();
        CaptureToolRootWidget captureToolRootWidget = this.c;
        if (captureToolRootWidget != null) {
            captureToolRootWidget.M();
        }
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        this.d = 4;
        CaptureToolRootWidget captureToolRootWidget = this.c;
        if (captureToolRootWidget != null) {
            captureToolRootWidget.O();
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        Map<String, String> b2 = cql.b(this.f4678a.getIntent());
        ckf.f(b2, "pageParams");
        this.b = new CaptureManager(new n53(b2, this.f4678a.getIntent().getDataString()), true);
        Activity activity = this.f4678a;
        CaptureManager captureManager = this.b;
        if (captureManager != null) {
            new CaptureToolRootWidget(activity, this, captureManager, new b(), new CaptureToolController$onCreate$2(this));
        } else {
            ckf.y("captureManager");
            throw null;
        }
    }
}
