package com.taobao.themis.canvas.canvas;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.android.material.badge.BadgeDrawable;
import com.taobao.themis.kernel.adapter.IConfigAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.CommonExtKt;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import tb.d9s;
import tb.eas;
import tb.eyl;
import tb.fnd;
import tb.gjd;
import tb.gld;
import tb.i9s;
import tb.ies;
import tb.jxl;
import tb.jy6;
import tb.l9s;
import tb.o4a;
import tb.o9s;
import tb.ocs;
import tb.olb;
import tb.p7o;
import tb.p8s;
import tb.q9s;
import tb.s8c;
import tb.t2o;
import tb.t8c;
import tb.v51;
import tb.xcs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TMSCanvasRender extends d9s implements olb, fnd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ONLINE_HOST_ONLY_FILENAME = "https://hybrid.miniapp.taobao.com/";
    public static final AtomicInteger k = new AtomicInteger(100);
    public s8c f;
    public gjd g;
    public final InnerFrameLayout h;
    public f i;
    public final AtomicBoolean j = new AtomicBoolean(false);
    public final String e = t1();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class InnerFrameLayout extends FrameLayout {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private g mSizeChangedListener;
        private h mVisibilityChangedListener;

        static {
            t2o.a(834666522);
        }

        public InnerFrameLayout(Context context) {
            super(context);
        }

        public static /* synthetic */ Object ipc$super(InnerFrameLayout innerFrameLayout, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == 348684699) {
                super.onVisibilityChanged((View) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            } else if (hashCode == 1389530587) {
                super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/themis/canvas/canvas/TMSCanvasRender$InnerFrameLayout");
            }
        }

        @Override // android.view.View
        public void onSizeChanged(int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                return;
            }
            super.onSizeChanged(i, i2, i3, i4);
            g gVar = this.mSizeChangedListener;
            if (gVar != null) {
                ((c) gVar).a(i, i2, i3, i4);
            }
        }

        @Override // android.view.View
        public void onVisibilityChanged(View view, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14c8819b", new Object[]{this, view, new Integer(i)});
                return;
            }
            super.onVisibilityChanged(view, i);
            h hVar = this.mVisibilityChangedListener;
            if (hVar != null) {
                ((b) hVar).a(i);
            }
        }

        public InnerFrameLayout whenSizeChanged(g gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InnerFrameLayout) ipChange.ipc$dispatch("43876527", new Object[]{this, gVar});
            }
            this.mSizeChangedListener = gVar;
            return this;
        }

        public InnerFrameLayout whenVisibilityChanged(h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InnerFrameLayout) ipChange.ipc$dispatch("944e9b85", new Object[]{this, hVar});
            }
            this.mVisibilityChangedListener = hVar;
            return this;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ fnd.b f13468a;

        public a(fnd.b bVar) {
            this.f13468a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f13468a.a(TMSCanvasRender.this.l());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(TMSCanvasRender tMSCanvasRender) {
        }

        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7606d219", new Object[]{this, new Integer(i)});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        public void a(int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            } else if (TMSCanvasRender.q1(TMSCanvasRender.this) != null) {
                TMSCanvasRender.q1(TMSCanvasRender.this).a(i, i2, i3, i4);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class d implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ s8c f13470a;

        public d(TMSCanvasRender tMSCanvasRender, s8c s8cVar) {
            this.f13470a = s8cVar;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
            }
            return this.f13470a.dispatchTouchEvent(motionEvent);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class e implements gjd.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<ITMSPage> f13471a;
        public ocs b;

        static {
            t2o.a(834666520);
        }

        public e(ITMSPage iTMSPage, ocs ocsVar) {
            this.f13471a = new WeakReference<>(iTMSPage);
            this.b = ocsVar;
        }

        @Override // tb.gjd.a
        public void onFirstFrame() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("99e6aa63", new Object[]{this});
                return;
            }
            WeakReference<ITMSPage> weakReference = this.f13471a;
            if (weakReference != null && weakReference.get() != null && this.f13471a.get().getInstance() != null) {
                t8c t8cVar = (t8c) this.f13471a.get().getInstance().getExtension(t8c.class);
                if (t8cVar != null) {
                    t8cVar.hideLoading();
                }
                ocs ocsVar = this.b;
                if (ocsVar != null) {
                    ocsVar.a();
                    this.b = null;
                }
                this.f13471a.get().getInstance().S().b("Canvas_FirstFrameTime");
                gld m = CommonExtKt.m(this.f13471a.get().getInstance());
                if (m != null) {
                    m.C("Canvas_FirstFrameTime");
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class f implements jxl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<gjd> f13472a;

        static {
            t2o.a(834666521);
        }

        public f(gjd gjdVar, String str) {
            this.f13472a = new WeakReference<>(gjdVar);
        }

        @Override // tb.jxl
        public int a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("cb1881df", new Object[]{this})).intValue();
            }
            return 1;
        }

        @Override // tb.jxl
        public int b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("fb96a19b", new Object[]{this})).intValue();
            }
            return 101;
        }

        @Override // tb.jxl
        public boolean c(eyl eylVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f29d0f9", new Object[]{this, eylVar})).booleanValue();
            }
            WeakReference<gjd> weakReference = this.f13472a;
            if (!(weakReference == null || weakReference.get() == null)) {
                this.f13472a.get().b(true);
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface g {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface h {
    }

    static {
        t2o.a(834666515);
        t2o.a(843055244);
        t2o.a(839909644);
    }

    public TMSCanvasRender(ITMSPage iTMSPage, ocs ocsVar) {
        super(iTMSPage, ocsVar);
        InnerFrameLayout r1 = r1(this.d.I());
        this.h = r1;
        r1.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        iTMSPage.x(this);
    }

    public static /* synthetic */ Object ipc$super(TMSCanvasRender tMSCanvasRender, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1983604863:
                super.destroy();
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case 392282426:
                super.X0((String) objArr[0], (JSON) objArr[1]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1192889117:
                super.s();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/canvas/canvas/TMSCanvasRender");
        }
    }

    public static /* synthetic */ gjd q1(TMSCanvasRender tMSCanvasRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gjd) ipChange.ipc$dispatch("72efcdef", new Object[]{tMSCanvasRender});
        }
        return tMSCanvasRender.g;
    }

    @Override // tb.fnd
    public void E(fnd.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa76c511", new Object[]{this, bVar});
        } else {
            CommonExtKt.b().post(new a(bVar));
        }
    }

    @Override // tb.z5d
    public void G(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fea6c5d4", new Object[]{this, iTMSPage});
        }
    }

    @Override // tb.qcs
    public void P(String str, JSON json) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb823f9b", new Object[]{this, str, json});
            return;
        }
        s8c s8cVar = this.f;
        if (s8cVar != null && this.j.get()) {
            if (json == null) {
                try {
                    json = new JSONObject();
                } catch (Throwable th) {
                    TMSLogger.c("TMSCanvasRender", th.getMessage(), th);
                    return;
                }
            }
            s8cVar.p(str, (JSONObject) json, true);
        }
    }

    @Override // tb.d9s, tb.qcs
    public void X0(String str, JSON json) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1761c13a", new Object[]{this, str, json});
        } else {
            super.X0(str, json);
        }
    }

    @Override // tb.z5d
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896696a2", new Object[]{this});
        }
    }

    @Override // tb.d9s, tb.qcs
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.destroy();
        f fVar = this.i;
        if (fVar != null) {
            p7o.d(fVar);
            this.i = null;
        }
        gjd gjdVar = this.g;
        if (gjdVar != null) {
            ((jy6) gjdVar).f();
            this.g = null;
        }
        s8c s8cVar = this.f;
        if (s8cVar != null) {
            s8cVar.destroy();
        }
    }

    @Override // tb.qcs
    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e88638d3", new Object[]{this});
        }
        return "FANVAS";
    }

    @Override // tb.qcs
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.h;
    }

    @Override // tb.qcs
    public Bitmap l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("ea6f4fbb", new Object[]{this});
        }
        return this.g.c();
    }

    @Override // tb.qcs
    public void n(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("245d3ac6", new Object[]{this, str, str2});
            return;
        }
        s8c s8cVar = this.f;
        if (s8cVar != null) {
            s8cVar.d0(str, ONLINE_HOST_ONLY_FILENAME + str2);
        }
    }

    @Override // tb.d9s, tb.qcs
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        } else {
            super.onActivityResult(i, i2, intent);
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
        gjd gjdVar = this.g;
        if (gjdVar != null) {
            ((jy6) gjdVar).pause();
        }
        v1();
    }

    @Override // tb.d9s, tb.qcs
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        gjd gjdVar = this.g;
        if (gjdVar != null) {
            gjdVar.resume();
        }
        w1();
    }

    @Override // tb.qcs
    public void r(byte[] bArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15684483", new Object[]{this, bArr, str});
            return;
        }
        s8c s8cVar = this.f;
        if (s8cVar == null) {
            return;
        }
        if (!q9s.c2() || TextUtils.isEmpty(str) || !str.endsWith("gm.v20.wlm") || this.d.U() == null) {
            s8cVar.p0(bArr, ONLINE_HOST_ONLY_FILENAME + str, null);
            return;
        }
        s8cVar.p0(bArr, ONLINE_HOST_ONLY_FILENAME.concat(str), v51.a(this.d.U().c(), str.replace("gm.v20.wlm", "gm.js.map")));
    }

    public final InnerFrameLayout r1(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InnerFrameLayout) ipChange.ipc$dispatch("61ff201e", new Object[]{this, context});
        }
        return new InnerFrameLayout(context).whenSizeChanged(new c()).whenVisibilityChanged(new b(this));
    }

    @Override // tb.olb
    public void requestLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fa502a0", new Object[]{this});
            return;
        }
        InnerFrameLayout innerFrameLayout = this.h;
        if (innerFrameLayout != null) {
            innerFrameLayout.requestLayout();
        }
    }

    @Override // tb.d9s, tb.qcs
    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("471a0b1d", new Object[]{this});
            return;
        }
        super.s();
        s8c s8cVar = (s8c) this.f17670a.getExtension(s8c.class);
        if (s8cVar == null) {
            this.d.x0(eas.h);
            return;
        }
        TMSLogger.b("TMSCanvasRender", "runtime: ".concat(s8cVar.getClass().getName()));
        this.f = s8cVar;
        s8cVar.f0(this.e);
        gld m = CommonExtKt.m(this.d);
        if (m != null) {
            m.C("engineInitEnd");
        }
        this.h.setOnTouchListener(new d(this, s8cVar));
        if (!this.c && this.d != null && this.f != null) {
            u1(this.b);
            if (o9s.h(this.f17670a.getInstance().I())) {
                TextView textView = new TextView(this.f17670a.getInstance().I());
                if (this.f instanceof o4a) {
                    textView.setText("Runtime: V8");
                } else {
                    textView.setText("Runtime: Qking");
                }
                textView.setTextSize(xcs.a(this.f17670a.getInstance().I(), 8.0f));
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = BadgeDrawable.TOP_START;
                layoutParams.leftMargin = xcs.a(this.f17670a.getInstance().I(), 10.0f);
                textView.setTextColor(-65536);
                this.h.addView(textView, layoutParams);
            }
            this.f.I0();
            s1(this.f, this.b);
        }
    }

    public final void s1(s8c s8cVar, ocs ocsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2105b29", new Object[]{this, s8cVar, ocsVar});
            return;
        }
        gld m = CommonExtKt.m(this.d);
        if (m != null) {
            m.C("engineLoadBundleStart");
        }
        s8cVar.j0();
        if (m != null) {
            m.C("engineLoadBundleEnd");
        }
        this.j.set(true);
        w1();
        this.d.S().b("Canvas_finishLoad");
        TMSMetaInfoWrapper P = this.d.P();
        if (P != null) {
            this.d.S().a("frameworkVersion", P.l());
        }
        if (ocsVar != null) {
            ocsVar.onRenderReady();
        }
    }

    public final String t1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b2a15034", new Object[]{this});
        }
        return String.valueOf(k.incrementAndGet());
    }

    public final void v1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf57f2b8", new Object[]{this});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", (Object) "onHide");
            P("gm_global_event", jSONObject);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // tb.z5d
    public void w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc5065a", new Object[]{this});
        }
    }

    public final void w1() {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a45375d", new Object[]{this});
            return;
        }
        try {
            String c2 = ies.c(this.d.e0(), "query");
            if (TextUtils.isEmpty(c2)) {
                obj = new HashMap();
            } else {
                obj = ies.e("https://huodong.com/index.html?" + URLDecoder.decode(c2));
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", (Object) "onShow");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("query", obj);
            jSONObject.put("data", (Object) jSONObject2);
            P("gm_global_event", jSONObject);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void x1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bac3993d", new Object[]{this});
        } else if (this.d.c0().isMiniAppDebug()) {
            boolean equals = TextUtils.equals("true", ies.c(this.d.e0(), "enable_profile_memory"));
            boolean equals2 = TextUtils.equals("true", ies.c(this.d.e0(), "enableProfileFrame"));
            gjd gjdVar = this.g;
            if (gjdVar != null && (gjdVar instanceof jy6)) {
                ((jy6) gjdVar).h(equals, equals2);
            }
        }
    }

    public final void u1(ocs ocsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b3ffd07", new Object[]{this, ocsVar});
            return;
        }
        DisplayMetrics displayMetrics = this.d.I().getResources().getDisplayMetrics();
        this.g = new jy6(this.e, this.d.I(), i9s.a());
        if (l9s.b()) {
            f fVar = new f(this.g, this.d.e0());
            this.i = fVar;
            p7o.a(fVar);
        }
        gjd.b bVar = new gjd.b();
        bVar.f20041a = 1;
        bVar.b = 1;
        bVar.c = displayMetrics.density;
        bVar.e = new e(this.f17670a, ocsVar);
        try {
            bVar.g = l9s.a(this.d.L());
            Map<String, String> configs = ((IConfigAdapter) p8s.g(IConfigAdapter.class)).getConfigs("themis_graphics_android");
            if (configs == null || configs.isEmpty()) {
                bVar.f = "";
            } else {
                bVar.f = JSON.toJSONString(configs);
            }
        } catch (Throwable th) {
            TMSLogger.b("TMSCanvasRender", "unexpected error because of " + th.getMessage());
        }
        ((jy6) this.g).e(bVar);
        this.h.addView(((jy6) this.g).g());
        try {
            x1();
        } catch (Throwable th2) {
            TMSLogger.b("TMSCanvasRender", "unexpected error when call setProfileEnabled because of " + th2.getMessage());
        }
    }
}
