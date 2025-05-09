package com.taobao.tbpoplayer.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.TextureView;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.config.model.style.StyleModel;
import com.alibaba.poplayer.factory.view.base.PopLayerBaseView;
import com.alibaba.poplayer.layermanager.PopRequest;
import com.alibaba.poplayer.track.module.OnePopModule;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.android.weex_framework.MUSInstanceConfig;
import com.taobao.android.weex_framework.b;
import com.taobao.android.weex_framework.common.MUSEventTarget;
import com.taobao.edlp.windvane.TBEdlpWVPlugin;
import com.taobao.tbpoplayer.view.PopLayerWeex2View;
import com.taobao.tbpoplayer.view.jsbridge.PopLayerWeex2Module;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONTokener;
import tb.a9l;
import tb.dcm;
import tb.gfm;
import tb.gsu;
import tb.hst;
import tb.kpc;
import tb.lyv;
import tb.npc;
import tb.pg1;
import tb.rgm;
import tb.swo;
import tb.t2o;
import tb.wdm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class PopLayerWeex2View extends PopLayerBaseView<View, com.alibaba.poplayer.trigger.a> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String VIEW_TYPE = "weex2";
    public static final String WEEX_TAG_KEY = "PopLayerView";
    private com.taobao.android.weex_framework.a mInstance;
    private swo mScreenTypeListener;
    private float mSnapshotScale;
    private TextureView mTextureView;
    private long mRenderStartTimeStamp = 0;
    private boolean mIsRenderDone = false;
    private final List<Pair<String, String>> mLostReceivedEvent = new ArrayList();

    static {
        t2o.a(790626524);
    }

    public PopLayerWeex2View(Context context) {
        super(context);
    }

    public static /* synthetic */ boolean access$000(PopLayerWeex2View popLayerWeex2View) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27dda230", new Object[]{popLayerWeex2View})).booleanValue();
        }
        return popLayerWeex2View.mIsRenderDone;
    }

    public static /* synthetic */ boolean access$002(PopLayerWeex2View popLayerWeex2View, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f888aea", new Object[]{popLayerWeex2View, new Boolean(z)})).booleanValue();
        }
        popLayerWeex2View.mIsRenderDone = z;
        return z;
    }

    public static /* synthetic */ List access$100(PopLayerWeex2View popLayerWeex2View) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("72f00efa", new Object[]{popLayerWeex2View});
        }
        return popLayerWeex2View.mLostReceivedEvent;
    }

    public static /* synthetic */ PopRequest access$200(PopLayerWeex2View popLayerWeex2View) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopRequest) ipChange.ipc$dispatch("a597b674", new Object[]{popLayerWeex2View});
        }
        return popLayerWeex2View.mPopRequest;
    }

    public static /* synthetic */ long access$300(PopLayerWeex2View popLayerWeex2View) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cf8db6a3", new Object[]{popLayerWeex2View})).longValue();
        }
        return popLayerWeex2View.mRenderStartTimeStamp;
    }

    public static /* synthetic */ com.taobao.android.weex_framework.a access$400(PopLayerWeex2View popLayerWeex2View) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_framework.a) ipChange.ipc$dispatch("34fb803d", new Object[]{popLayerWeex2View});
        }
        return popLayerWeex2View.mInstance;
    }

    public static /* synthetic */ void access$500(PopLayerWeex2View popLayerWeex2View, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af970a45", new Object[]{popLayerWeex2View, str, str2});
        } else {
            popLayerWeex2View.closeOnException(str, str2);
        }
    }

    private void closeOnException(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35293633", new Object[]{this, str, str2});
            return;
        }
        try {
            Runnable efmVar = new Runnable() { // from class: tb.efm
                @Override // java.lang.Runnable
                public final void run() {
                    PopLayerWeex2View.this.lambda$closeOnException$137(str, str2);
                }
            };
            if (Looper.myLooper() != Looper.getMainLooper()) {
                post(efmVar);
            } else {
                efmVar.run();
            }
        } catch (Throwable th) {
            wdm.h("PopLayerWeexView.closeOnException error.", th);
        }
    }

    private JSONObject getInitData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("312669f7", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        if (((com.alibaba.poplayer.trigger.a) this.mPopRequest).u()) {
            StyleModel styleModel = ((com.alibaba.poplayer.trigger.a) this.mPopRequest).K().styleConfigs;
            int parseInt = Integer.parseInt(styleModel.width);
            int parseInt2 = Integer.parseInt(styleModel.height);
            jSONObject.put("widthPx", (Object) Integer.valueOf((int) lyv.d(getContext(), Float.parseFloat(styleModel.width))));
            jSONObject.put("heightPx", (Object) Integer.valueOf((int) lyv.d(getContext(), Float.parseFloat(styleModel.height))));
            jSONObject.put(TBEdlpWVPlugin.KEY_WIDTH_RPX, (Object) Integer.valueOf(parseInt));
            jSONObject.put(TBEdlpWVPlugin.KEY_HEIGHT_RPX, (Object) Integer.valueOf(parseInt2));
        }
        return jSONObject;
    }

    public static /* synthetic */ void h(PopLayerWeex2View popLayerWeex2View, Context context, com.alibaba.poplayer.trigger.a aVar) {
        popLayerWeex2View.lambda$init$135(context, aVar);
    }

    public static /* synthetic */ Object ipc$super(PopLayerWeex2View popLayerWeex2View, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1896705494:
                super.syncJumpToUrlInfo((String) objArr[0]);
                return null;
            case -1265876613:
                super.onActivityStart();
                return null;
            case -475248713:
                super.onActivityStop();
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
            case 1889590256:
                super.onActivityResumed();
                return null;
            case 1890078406:
                super.destroyView();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tbpoplayer/view/PopLayerWeex2View");
        }
    }

    public /* synthetic */ void lambda$closeOnException$137(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c4824a1", new Object[]{this, str, str2});
        } else {
            close(OnePopModule.OnePopLoseReasonCode.OnViewErrorClose, String.valueOf(str), String.valueOf(str2), null);
        }
    }

    public /* synthetic */ void lambda$destroyView$138() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8619d99b", new Object[]{this});
            return;
        }
        try {
            com.taobao.android.weex_framework.a aVar = this.mInstance;
            if (aVar != null) {
                aVar.destroy();
            }
        } catch (Throwable th) {
            wdm.h("PopLayerWeexView.destroy.error.", th);
        }
    }

    public /* synthetic */ void lambda$init$135(final Context context, final com.alibaba.poplayer.trigger.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7c8db08", new Object[]{this, context, aVar});
        } else {
            post(new Runnable() { // from class: tb.mfm
                @Override // java.lang.Runnable
                public final void run() {
                    PopLayerWeex2View.this.lambda$null$134(context, aVar);
                }
            });
        }
    }

    public /* synthetic */ void lambda$null$134(Context context, com.alibaba.poplayer.trigger.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ba3b6fe", new Object[]{this, context, aVar});
        } else {
            doInit(context, aVar);
        }
    }

    public /* synthetic */ void lambda$onActivityPaused$142() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2463fdeb", new Object[]{this});
            return;
        }
        try {
            com.taobao.android.weex_framework.a aVar = this.mInstance;
            if (aVar != null) {
                aVar.dispatchEvent(MUSEventTarget.MUS_WINDOW_TARGET, "WV.Event.APP.Background", new JSONObject());
                wdm.d("PopLayerWeex2View.onActivityPaused.send event:WV.Event.APP.Background", new Object[0]);
                this.mInstance.onActivityPause();
            }
        } catch (Throwable th) {
            wdm.h("PopLayerWeex2View onActivityPaused error", th);
        }
    }

    public /* synthetic */ void lambda$onActivityResumed$141() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0a66f9d", new Object[]{this});
            return;
        }
        try {
            com.taobao.android.weex_framework.a aVar = this.mInstance;
            if (aVar != null) {
                aVar.dispatchEvent(MUSEventTarget.MUS_WINDOW_TARGET, "WV.Event.APP.Active", new JSONObject());
                wdm.d("PopLayerWeex2View.onActivityResumed.send event:WV.Event.APP.Active", new Object[0]);
                this.mInstance.onActivityResume();
            }
        } catch (Throwable th) {
            wdm.h("PopLayerWeex2View onActivityResumed error", th);
        }
    }

    public /* synthetic */ void lambda$onActivityStart$140() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0e8fce7", new Object[]{this});
            return;
        }
        try {
            if (this.mInstance != null) {
                wdm.d("PopLayerWeex2View.onActivityStart", new Object[0]);
                this.mInstance.onActivityStart();
            }
        } catch (Throwable th) {
            wdm.h("PopLayerWeex2View onActivityStart error", th);
        }
    }

    public /* synthetic */ void lambda$onActivityStop$143() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("568a6f00", new Object[]{this});
            return;
        }
        try {
            if (this.mInstance != null) {
                wdm.d("PopLayerWeex2View.onActivityStop", new Object[0]);
                this.mInstance.onActivityStop();
            }
        } catch (Throwable th) {
            wdm.h("PopLayerWeex2View onActivityStop error", th);
        }
    }

    public /* synthetic */ void lambda$onReceiveEvent$144(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("308c53db", new Object[]{this, str, str2});
            return;
        }
        try {
            com.taobao.android.weex_framework.a aVar = this.mInstance;
            if (aVar != null) {
                aVar.dispatchEvent(MUSEventTarget.MUS_WINDOW_TARGET, str, JSON.parseObject(str2));
            }
        } catch (Throwable th) {
            wdm.h("PopLayerWeex2View onReceiveEvent error", th);
        }
    }

    public /* synthetic */ void lambda$onViewUIAdded$139() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8abb6c5", new Object[]{this});
        } else if (this.mInstance != null) {
            wdm.d("PopLayerWeex2View.onViewUIAdded", new Object[0]);
            this.mInstance.onViewAppear();
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
            hst.c(new Runnable() { // from class: tb.dfm
                @Override // java.lang.Runnable
                public final void run() {
                    PopLayerWeex2View.this.lambda$destroyView$138();
                }
            });
            this.mInnerView = null;
            removeCloseButton();
            rgm.h().r(((com.alibaba.poplayer.trigger.a) this.mPopRequest).O());
            swo swoVar = this.mScreenTypeListener;
            if (swoVar != null) {
                swoVar.d();
            }
        } catch (Throwable th) {
            wdm.h("PopLayerWeexView.destroyView.error.", th);
        }
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public String getNativeNotifyInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58e6e2f5", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (getPopRequest() != null) {
                BaseConfigItem K = getPopRequest().K();
                jSONObject.put("PopTimes", (Object) (dcm.f().c(K.uuid, -1) + ""));
                jSONObject.put(pg1.ATOM_EXT_Event, (Object) getPopRequest().L().toString());
            }
        } catch (Throwable th) {
            wdm.h("getNativeNotifyInfo.error.", th);
        }
        return jSONObject.toJSONString();
    }

    @Override // com.alibaba.poplayer.factory.view.base.PenetrateFrame
    public Pair<Bitmap, Float> getScaleSnapshotBitMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("280b7c78", new Object[]{this});
        }
        if (this.mTextureView == null) {
            View renderView = this.mInstance.getRenderView();
            if (renderView instanceof TextureView) {
                this.mTextureView = (TextureView) renderView;
            }
        }
        return new Pair<>(this.mTextureView.getBitmap((int) (getWidth() * this.mSnapshotScale), (int) (getHeight() * this.mSnapshotScale)), Float.valueOf(this.mSnapshotScale));
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
            hst.c(new Runnable() { // from class: tb.jfm
                @Override // java.lang.Runnable
                public final void run() {
                    PopLayerWeex2View.this.lambda$onActivityPaused$142();
                }
            });
        } catch (Throwable th) {
            wdm.h("Weex onActivityPaused error", th);
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
            hst.c(new Runnable() { // from class: tb.ifm
                @Override // java.lang.Runnable
                public final void run() {
                    PopLayerWeex2View.this.lambda$onActivityResumed$141();
                }
            });
        } catch (Throwable th) {
            wdm.h("Weex onActivityResumed error", th);
        }
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public void onActivityStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b48c417b", new Object[]{this});
            return;
        }
        super.onActivityStart();
        hst.c(new Runnable() { // from class: tb.cfm
            @Override // java.lang.Runnable
            public final void run() {
                PopLayerWeex2View.this.lambda$onActivityStart$140();
            }
        });
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public void onActivityStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ac47b7", new Object[]{this});
            return;
        }
        try {
            super.onActivityStop();
            hst.c(new Runnable() { // from class: tb.hfm
                @Override // java.lang.Runnable
                public final void run() {
                    PopLayerWeex2View.this.lambda$onActivityStop$143();
                }
            });
        } catch (Throwable th) {
            wdm.h("Weex onActivityStop error", th);
        }
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public void onReceiveEvent(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12978511", new Object[]{this, str, str2});
            return;
        }
        try {
            wdm.d("PopLayerWeex2View.onReceiveEvent{%s,%s}.mIsRenderDone=%s", str, str2, Boolean.valueOf(this.mIsRenderDone));
            if (!this.mIsRenderDone) {
                this.mLostReceivedEvent.add(new Pair<>(str, str2));
            } else {
                hst.c(new Runnable() { // from class: tb.lfm
                    @Override // java.lang.Runnable
                    public final void run() {
                        PopLayerWeex2View.this.lambda$onReceiveEvent$144(str, str2);
                    }
                });
            }
        } catch (Throwable th) {
            wdm.h("PopLayerWeex2View.onReceiveEvent error.", th);
        }
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public void onViewUIAdded() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("155d0daf", new Object[]{this});
            return;
        }
        try {
            super.onViewUIAdded();
            hst.c(new Runnable() { // from class: tb.ffm
                @Override // java.lang.Runnable
                public final void run() {
                    PopLayerWeex2View.this.lambda$onViewUIAdded$139();
                }
            });
        } catch (Throwable th) {
            wdm.h("Weex onViewUIAdded error", th);
        }
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public void resetContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18396fc1", new Object[]{this, context});
            return;
        }
        super.resetContext(context);
        this.mInstance.resetContext(context);
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
        MUSEngine.initApplicationAsync(PopLayer.getReference().getApp(), new gfm(this, context, aVar));
    }

    private void doInit(Context context, com.alibaba.poplayer.trigger.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("178313c7", new Object[]{this, context, aVar});
            return;
        }
        try {
            MUSEngine.registerModule("poplayer", PopLayerWeex2Module.class);
            wdm.d("PopLayerWeex2View.init", new Object[0]);
            setVisibility(4);
            setUseTouchPointBitmap(false);
            if (a9l.w().Y()) {
                setUseCacheMark(false);
            }
            long u = a9l.w().u();
            if (u < 0) {
                u = 0;
            }
            if (u > 100) {
                u = 100;
            }
            this.mSnapshotScale = ((float) u) / 100.0f;
            String str = aVar.K().params;
            org.json.JSONObject jSONObject = !TextUtils.isEmpty(str) ? (org.json.JSONObject) new JSONTokener(str).nextValue() : null;
            if (jSONObject == null) {
                closeOnException("PARAMS_PARSE_ERROR", "params=" + aVar.K().params);
                return;
            }
            setPenetrateAlpha((int) (aVar.K().modalThreshold * 255.0d));
            setPopRequest(aVar);
            String optString = jSONObject.optString("url");
            wdm.d("PopLayerWeex2View.loadUrl=%s", optString);
            if (TextUtils.isEmpty(optString)) {
                closeOnException("URL_EMPTY", "");
                return;
            }
            swo swoVar = new swo(context);
            this.mScreenTypeListener = swoVar;
            swoVar.b(this);
            MUSInstanceConfig mUSInstanceConfig = new MUSInstanceConfig();
            mUSInstanceConfig.p(optString);
            mUSInstanceConfig.y(MUSInstanceConfig.RenderMode.texture);
            mUSInstanceConfig.v(false);
            mUSInstanceConfig.B(true);
            mUSInstanceConfig.t(MUSInstanceConfig.MUSRenderType.MUSRenderTypeUnicorn);
            mUSInstanceConfig.u(new kpc() { // from class: tb.kfm
                @Override // tb.kpc
                public final void a(View view) {
                    PopLayerWeex2View.this.lambda$doInit$136(view);
                }
            });
            com.taobao.android.weex_framework.a c = b.f().c(context, mUSInstanceConfig);
            this.mInstance = c;
            c.setTag(WEEX_TAG_KEY, this);
            this.mInstance.registerRenderListener(new a(aVar));
            this.mInstance.initWithURL(Uri.parse(optString));
            this.mInstance.render(getInitData(), null);
            aVar.k().L = String.valueOf(SystemClock.elapsedRealtime() - aVar.k().s0);
            this.mRenderStartTimeStamp = SystemClock.elapsedRealtime();
        } catch (Throwable th) {
            wdm.h("PopLayerWeex2View.preRenderWeex.error.", th);
            closeOnException("RENDER_VIEW_CREATED_RENDER_START_FAIL", "");
        }
    }

    public /* synthetic */ void lambda$doInit$136(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6052c083", new Object[]{this, view});
            return;
        }
        try {
            wdm.d("PopLayerWeex2View.onCreateView.", new Object[0]);
            if (view == 0) {
                closeOnException("RENDER_VIEW_CREATED_NULL", "weex2RenderOnViewCreatedViewIsNull");
                return;
            }
            InnerView innerview = this.mInnerView;
            if (innerview != 0) {
                removeView((View) innerview);
                wdm.d("PopLayerWeexView.onViewCreated.mInnerView already been added.remove it.", new Object[0]);
            }
            removeCloseButton();
            this.mInnerView = view;
            view.setClickable(true);
            wdm.d("PopLayerWeex2View.onViewCreated.done.", new Object[0]);
        } catch (Throwable th) {
            wdm.h("PopLayerWeexView.onViewCreated.error.", th);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements npc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public final /* synthetic */ com.alibaba.poplayer.trigger.a f13417a;

        public a(com.alibaba.poplayer.trigger.a aVar) {
            PopLayerWeex2View.this = r1;
            this.f13417a = aVar;
        }

        @Override // tb.npc
        public void onDestroyed(MUSDKInstance mUSDKInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
            } else {
                wdm.d("PopLayerWeex2View.onDestroyed.", new Object[0]);
            }
        }

        @Override // tb.npc
        public void onJSException(com.taobao.android.weex_framework.a aVar, int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8c41b6de", new Object[]{this, aVar, new Integer(i), str});
            } else {
                wdm.d("PopLayerWeex2View.onJSException.type=%s.errorMsg=%s", Integer.valueOf(i), str);
            }
        }

        @Override // tb.npc
        public void onPrepareSuccess(com.taobao.android.weex_framework.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("27a2635b", new Object[]{this, aVar});
            } else {
                wdm.d("PopLayerWeex2View.onPrepareSuccess.", new Object[0]);
            }
        }

        @Override // tb.npc
        public void onRefreshFailed(com.taobao.android.weex_framework.a aVar, int i, String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc0861e4", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
            } else {
                wdm.d("PopLayerWeex2View.onRefreshFailed.type=%s.errorMsg=%s.isFatal=%s", Integer.valueOf(i), str, Boolean.valueOf(z));
            }
        }

        @Override // tb.npc
        public void onRefreshSuccess(com.taobao.android.weex_framework.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("963c382f", new Object[]{this, aVar});
            } else {
                wdm.d("PopLayerWeex2View.onRefreshSuccess.", new Object[0]);
            }
        }

        @Override // tb.npc
        public void onRenderSuccess(com.taobao.android.weex_framework.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2b2aeb48", new Object[]{this, aVar});
                return;
            }
            try {
                wdm.d("PopLayerWeex2View.onRenderSuccess.", new Object[0]);
                if (!PopLayerWeex2View.access$000(PopLayerWeex2View.this)) {
                    PopLayerWeex2View.access$002(PopLayerWeex2View.this, true);
                    PopLayerWeex2View.this.addInnerView();
                    PopLayerWeex2View.this.showCloseButton(this.f13417a.K().showCloseBtn);
                    if (!PopLayerWeex2View.access$100(PopLayerWeex2View.this).isEmpty()) {
                        for (Pair pair : PopLayerWeex2View.access$100(PopLayerWeex2View.this)) {
                            PopLayerWeex2View.this.onReceiveEvent((String) pair.first, (String) pair.second);
                        }
                    }
                    ((com.alibaba.poplayer.trigger.a) PopLayerWeex2View.access$200(PopLayerWeex2View.this)).k().M = String.valueOf(SystemClock.elapsedRealtime() - PopLayerWeex2View.access$300(PopLayerWeex2View.this));
                    View renderRoot = PopLayerWeex2View.access$400(PopLayerWeex2View.this).getRenderRoot();
                    if (renderRoot != null) {
                        renderRoot.setImportantForAccessibility(2);
                    }
                }
            } catch (Throwable th) {
                wdm.h("PopLayerWeexView.onRenderSuccess.error.", th);
            }
        }

        @Override // tb.npc
        public void onRenderFailed(com.taobao.android.weex_framework.a aVar, int i, String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc0cbe2b", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
                return;
            }
            wdm.d("PopLayerWeex2View.onRenderFailed.type=%s.errorMsg=%s.isFatal=%s", Integer.valueOf(i), str, Boolean.valueOf(z));
            PopLayerWeex2View popLayerWeex2View = PopLayerWeex2View.this;
            PopLayerWeex2View.access$500(popLayerWeex2View, "WEEX2_RENDER_FAIL", "type=" + i + ".errorMsg=" + str + ".isFatal=" + z);
        }
    }
}
