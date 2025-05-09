package com.taobao.tbpoplayer.view.nativepop;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import androidx.core.app.NotificationCompat;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.factory.view.base.PopLayerBaseView;
import com.alibaba.poplayer.layermanager.PopRequest;
import com.alibaba.poplayer.track.module.OnePopModule;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbpoplayer.view.nativepop.PopLayerNativeView;
import tb.a9l;
import tb.gsu;
import tb.hst;
import tb.jlj;
import tb.plj;
import tb.rgm;
import tb.t2o;
import tb.wdm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class PopLayerNativeView extends PopLayerBaseView<View, com.alibaba.poplayer.trigger.a> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String VIEW_TYPE = "native";
    private final Handler mHandler = new Handler(Looper.getMainLooper());
    private jlj mNativePopEngine;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements jlj.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.alibaba.poplayer.trigger.a f13427a;

        public a(com.alibaba.poplayer.trigger.a aVar) {
            this.f13427a = aVar;
        }

        public final /* synthetic */ void f(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6222d2b", new Object[]{this, str, str2});
            } else {
                PopLayerNativeView.this.close(OnePopModule.OnePopLoseReasonCode.OnViewJSClose, str, str2, "");
            }
        }

        public final /* synthetic */ void g(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3dee0b3e", new Object[]{this, view});
                return;
            }
            try {
                PopLayerNativeView.this.clearClickableInfo();
                PopLayerNativeView.this.removeAllViews();
                PopLayerNativeView.this.addView(view);
            } catch (Throwable th) {
                wdm.h("PopLayerNativeView.onReRenderSuccess.error.", th);
                PopLayerNativeView.this.close(OnePopModule.OnePopLoseReasonCode.OnViewJSClose, "onReRenderSuccessError", "", "");
            }
        }

        public final /* synthetic */ void h(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8bfa0a85", new Object[]{this, str, str2, str3});
                return;
            }
            try {
                if (plj.c(str, false) && PopLayerNativeView.this.isDisplaying() && !PopLayerNativeView.this.isClosed()) {
                    Toast.makeText(PopLayerNativeView.this.getContext(), str, 0).show();
                }
            } catch (Throwable th) {
                wdm.h("PopLayerNativeView.onRenderFailed.error.", th);
            }
            PopLayerNativeView.this.close(OnePopModule.OnePopLoseReasonCode.OnViewJSClose, str2, str3, "");
        }

        public final /* synthetic */ void i(View view, com.alibaba.poplayer.trigger.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2d81f1c1", new Object[]{this, view, aVar});
                return;
            }
            try {
                PopLayerNativeView.this.clearClickableInfo();
                PopLayerNativeView.access$002(PopLayerNativeView.this, view);
                PopLayerNativeView.this.addInnerView();
                aVar.k().M = String.valueOf(SystemClock.elapsedRealtime() - aVar.k().s0);
            } catch (Throwable th) {
                wdm.h("PopLayerNativeView.onRenderSuccess.error.", th);
                PopLayerNativeView.this.close(OnePopModule.OnePopLoseReasonCode.OnViewJSClose, "onRenderSuccessError", "", "");
            }
        }

        public final /* synthetic */ void j(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e9ac1a9a", new Object[]{this, view});
                return;
            }
            try {
                PopLayerNativeView.this.clearClickableInfo();
                PopLayerNativeView.this.removeAllViews();
                PopLayerNativeView.this.addView(view);
            } catch (Throwable th) {
                wdm.h("PopLayerNativeView.onSwitchState.error.", th);
                PopLayerNativeView.this.close(OnePopModule.OnePopLoseReasonCode.OnViewJSClose, "onSwitchStateError", "", "");
            }
        }

        public void k(Rect rect) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4dd236a5", new Object[]{this, rect});
            } else {
                PopLayerNativeView.this.addClickableArea(rect);
            }
        }

        public void l(final String str, final String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb5d79fc", new Object[]{this, str, str2});
            } else {
                hst.c(new Runnable() { // from class: tb.bem
                    @Override // java.lang.Runnable
                    public final void run() {
                        PopLayerNativeView.a.this.f(str, str2);
                    }
                });
            }
        }

        public void m(final View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("26b0d050", new Object[]{this, view});
            } else {
                hst.c(new Runnable() { // from class: tb.cem
                    @Override // java.lang.Runnable
                    public final void run() {
                        PopLayerNativeView.a.this.g(view);
                    }
                });
            }
        }

        public void n(final String str, final String str2, final String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8e720d97", new Object[]{this, str, str2, str3});
            } else {
                hst.c(new Runnable() { // from class: tb.ydm
                    @Override // java.lang.Runnable
                    public final void run() {
                        PopLayerNativeView.a.this.h(str3, str, str2);
                    }
                });
            }
        }

        public void o(final View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b98d4f3d", new Object[]{this, view});
                return;
            }
            final com.alibaba.poplayer.trigger.a aVar = this.f13427a;
            hst.c(new Runnable() { // from class: tb.aem
                @Override // java.lang.Runnable
                public final void run() {
                    PopLayerNativeView.a.this.i(view, aVar);
                }
            });
        }

        public void p(final View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("746570cd", new Object[]{this, view});
            } else {
                hst.c(new Runnable() { // from class: tb.zdm
                    @Override // java.lang.Runnable
                    public final void run() {
                        PopLayerNativeView.a.this.j(view);
                    }
                });
            }
        }
    }

    static {
        t2o.a(790626551);
    }

    public PopLayerNativeView(Context context) {
        super(context);
    }

    public static /* synthetic */ Object access$002(PopLayerNativeView popLayerNativeView, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("dbc8ab3b", new Object[]{popLayerNativeView, obj});
        }
        popLayerNativeView.mInnerView = obj;
        return obj;
    }

    public static /* synthetic */ Object ipc$super(PopLayerNativeView popLayerNativeView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1896705494:
                super.syncJumpToUrlInfo((String) objArr[0]);
                return null;
            case -1314403364:
                super.onViewUIShow();
                return null;
            case -540202383:
                super.onViewUIDisplay();
                return null;
            case 311919889:
                super.onReceiveEvent((String) objArr[0], (String) objArr[1]);
                return null;
            case 358419887:
                super.onViewUIAdded();
                return null;
            case 406417345:
                super.resetContext((Context) objArr[0]);
                return null;
            case 571929693:
                super.init((Context) objArr[0], (Context) ((PopRequest) objArr[1]));
                return null;
            case 988548963:
                super.onActivityPaused();
                return null;
            case 1545479073:
                super.onViewUIHide();
                return null;
            case 1889590256:
                super.onActivityResumed();
                return null;
            case 1890078406:
                super.destroyView();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tbpoplayer/view/nativepop/PopLayerNativeView");
        }
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public void destroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a84ec6", new Object[]{this});
            return;
        }
        super.destroyView();
        try {
            removeCloseButton();
            rgm.h().r(com.alibaba.poplayer.trigger.a.P(this.mPopRequest));
            this.mNativePopEngine.l0();
        } catch (Throwable th) {
            wdm.h("PopLayerWeexView.destroyView.error.", th);
        }
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public JSONObject getCurBizTrackInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ee79b897", new Object[]{this});
        }
        jlj jljVar = this.mNativePopEngine;
        if (jljVar != null) {
            return jljVar.I();
        }
        return new JSONObject();
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public void onActivityPaused() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3aec0f63", new Object[]{this});
            return;
        }
        try {
            super.onActivityPaused();
            jlj jljVar = this.mNativePopEngine;
            if (jljVar != null) {
                jljVar.j0();
            }
        } catch (Throwable th) {
            wdm.h("PopLayerNativeView.onActivityPaused.error.", th);
        }
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public void onActivityResumed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a0dbf0", new Object[]{this});
            return;
        }
        try {
            super.onActivityResumed();
            jlj jljVar = this.mNativePopEngine;
            if (jljVar != null) {
                jljVar.k0();
            }
        } catch (Throwable th) {
            wdm.h("PopLayerNativeView.onActivityResumed.error.", th);
        }
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public void onReceiveEvent(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12978511", new Object[]{this, str, str2});
            return;
        }
        try {
            super.onReceiveEvent(str, str2);
            jlj jljVar = this.mNativePopEngine;
            if (jljVar != null) {
                jljVar.o0(str, str2);
            }
        } catch (Throwable th) {
            wdm.h("PopLayerNativeView.onReceiveEvent.error.", th);
        }
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public void onViewUIAdded() {
        Request request;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("155d0daf", new Object[]{this});
            return;
        }
        super.onViewUIAdded();
        if (isDisplaying() && (request = this.mPopRequest) != 0 && this.mNativePopEngine != null) {
            if (((com.alibaba.poplayer.trigger.a) request).t()) {
                this.mNativePopEngine.p0("embedAdd");
            } else if (((com.alibaba.poplayer.trigger.a) this.mPopRequest).w() || ((com.alibaba.poplayer.trigger.a) this.mPopRequest).y()) {
                this.mNativePopEngine.p0("appModeAdd");
            }
        }
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public void onViewUIDisplay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfcd2a71", new Object[]{this});
            return;
        }
        super.onViewUIDisplay();
        JSONObject jSONObject = new JSONObject();
        String str = "";
        jSONObject.put("indexId", (Object) (!TextUtils.isEmpty(((com.alibaba.poplayer.trigger.a) this.mPopRequest).O()) ? ((com.alibaba.poplayer.trigger.a) this.mPopRequest).O() : str));
        if (((com.alibaba.poplayer.trigger.a) this.mPopRequest).L() != null) {
            str = ((com.alibaba.poplayer.trigger.a) this.mPopRequest).L().uri;
        }
        jSONObject.put(NotificationCompat.MessagingStyle.Message.KEY_DATA_URI, (Object) str);
        rgm.h().p("PopLayer", "display", jSONObject, new JSONObject());
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public void onViewUIHide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1e23a1", new Object[]{this});
            return;
        }
        super.onViewUIHide();
        JSONObject jSONObject = new JSONObject();
        String str = "";
        jSONObject.put("indexId", (Object) (!TextUtils.isEmpty(((com.alibaba.poplayer.trigger.a) this.mPopRequest).O()) ? ((com.alibaba.poplayer.trigger.a) this.mPopRequest).O() : str));
        if (((com.alibaba.poplayer.trigger.a) this.mPopRequest).L() != null) {
            str = ((com.alibaba.poplayer.trigger.a) this.mPopRequest).L().uri;
        }
        jSONObject.put(NotificationCompat.MessagingStyle.Message.KEY_DATA_URI, (Object) str);
        rgm.h().p("PopLayer", "hide", jSONObject, new JSONObject());
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public void onViewUIShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a7cbdc", new Object[]{this});
            return;
        }
        super.onViewUIShow();
        JSONObject jSONObject = new JSONObject();
        String str = "";
        jSONObject.put("indexId", (Object) (!TextUtils.isEmpty(((com.alibaba.poplayer.trigger.a) this.mPopRequest).O()) ? ((com.alibaba.poplayer.trigger.a) this.mPopRequest).O() : str));
        if (((com.alibaba.poplayer.trigger.a) this.mPopRequest).L() != null) {
            str = ((com.alibaba.poplayer.trigger.a) this.mPopRequest).L().uri;
        }
        jSONObject.put(NotificationCompat.MessagingStyle.Message.KEY_DATA_URI, (Object) str);
        rgm.h().p("PopLayer", "show", jSONObject, new JSONObject());
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public void resetContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18396fc1", new Object[]{this, context});
            return;
        }
        super.resetContext(context);
        if (a9l.w().A()) {
            Context context2 = getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context);
            }
        }
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public void syncJumpToUrlInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ef2922a", new Object[]{this, str});
            return;
        }
        super.syncJumpToUrlInfo(str);
        gsu.a((com.alibaba.poplayer.trigger.a) this.mPopRequest);
    }

    public void init(Context context, com.alibaba.poplayer.trigger.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4406111c", new Object[]{this, context, aVar});
            return;
        }
        super.init(context, (Context) aVar);
        setPopRequest(aVar);
        setVisibility(4);
        if (a9l.w().X()) {
            setUseCacheMark(false);
            setUseTouchPointBitmap(true);
        }
        setPenetrateAlpha((int) (aVar.K().modalThreshold * 255.0d));
        aVar.k().L = "0";
        jlj jljVar = new jlj(aVar, this.mHandler, new a(aVar));
        this.mNativePopEngine = jljVar;
        jljVar.u0();
    }
}
