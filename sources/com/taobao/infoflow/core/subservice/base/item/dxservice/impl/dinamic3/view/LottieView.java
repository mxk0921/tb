package com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import tb.e4g;
import tb.fmh;
import tb.fve;
import tb.iu9;
import tb.kkh;
import tb.nlh;
import tb.plh;
import tb.t2o;
import tb.ulh;
import tb.ylh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class LottieView extends FrameLayout implements ulh, plh<Throwable> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final Map<String, String> FONT_PATH_MAP;
    public static final String TAG = "DXTBIFLottieViewWidgetNode";
    private final HImageView bottomImageView;
    private final LottieAnimationView lottieAnimationView;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a extends fmh<CharSequence> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Map.Entry c;

        public a(LottieView lottieView, Map.Entry entry) {
            this.c = entry;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/base/item/dxservice/impl/dinamic3/view/LottieView$1");
        }

        /* renamed from: d */
        public CharSequence a(nlh<CharSequence> nlhVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CharSequence) ipChange.ipc$dispatch("7c2dca1e", new Object[]{this, nlhVar});
            }
            return (String) this.c.getValue();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b extends iu9 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<Context> f10637a;

        static {
            t2o.a(486539422);
        }

        public b(Context context) {
            this.f10637a = new WeakReference<>(context);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/base/item/dxservice/impl/dinamic3/view/LottieView$FontsDelegate");
        }

        @Override // tb.iu9
        public Typeface a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Typeface) ipChange.ipc$dispatch("c0aebb70", new Object[]{this, str});
            }
            if (this.f10637a == null) {
                return Typeface.SANS_SERIF;
            }
            Map<String, String> map = LottieView.FONT_PATH_MAP;
            if (map.containsKey(str)) {
                return Typeface.createFromAsset(this.f10637a.get().getAssets(), map.get(str));
            }
            return Typeface.createFromAsset(this.f10637a.get().getAssets(), "iconfonts/AlibabaSans102_v1_TaoBao-Bd.ttf");
        }

        @Override // tb.iu9
        public String b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("20f14465", new Object[]{this, str});
            }
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final JSONObject f10638a;
        public final String b;
        public final double c;
        public final String d;
        public final int e;
        public final ImageView.ScaleType f;

        static {
            t2o.a(486539423);
        }

        public c(JSONObject jSONObject, String str, double d, String str2, int i, ImageView.ScaleType scaleType) {
            this.f10638a = jSONObject == null ? new JSONObject() : jSONObject;
            this.b = str;
            this.c = d;
            this.d = str2;
            this.e = i;
            this.f = scaleType;
        }

        public static /* synthetic */ ImageView.ScaleType a(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ImageView.ScaleType) ipChange.ipc$dispatch("708703b8", new Object[]{cVar});
            }
            return cVar.f;
        }

        public static /* synthetic */ String b(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("fe050c7", new Object[]{cVar});
            }
            return cVar.b;
        }

        public static /* synthetic */ double c(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("12f0b328", new Object[]{cVar})).doubleValue();
            }
            return cVar.c;
        }

        public static /* synthetic */ int d(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e1d8516e", new Object[]{cVar})).intValue();
            }
            return cVar.e;
        }

        public static /* synthetic */ String e(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("db97f464", new Object[]{cVar});
            }
            return cVar.d;
        }

        public static /* synthetic */ JSONObject f(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("4ca7051d", new Object[]{cVar});
            }
            return cVar.f10638a;
        }
    }

    static {
        t2o.a(486539420);
        HashMap hashMap = new HashMap();
        FONT_PATH_MAP = hashMap;
        hashMap.put("AlibabaSans-Bold", "iconfonts/AlibabaSans102_v1_TaoBao-Bd.ttf");
    }

    public LottieView(Context context) {
        this(context, null);
    }

    private void hideBottomImage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d053cd5", new Object[]{this});
            return;
        }
        fve.m("DXTBIFLottieViewWidgetNode", "hideBottomImage");
        HImageView hImageView = this.bottomImageView;
        if (hImageView != null) {
            hImageView.setVisibility(8);
        }
    }

    public static /* synthetic */ Object ipc$super(LottieView lottieView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/base/item/dxservice/impl/dinamic3/view/LottieView");
    }

    private void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else if (!this.lottieAnimationView.isAnimating()) {
            fve.m("DXTBIFLottieViewWidgetNode", "start");
            try {
                LottieAnimationView lottieAnimationView = this.lottieAnimationView;
                if (lottieAnimationView != null && !lottieAnimationView.isAnimating()) {
                    this.lottieAnimationView.playAnimation();
                }
            } catch (Throwable th) {
                fve.c("DXTBIFLottieViewWidgetNode", "start exception", th);
            }
        }
    }

    public void onRenderView(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2e9e962", new Object[]{this, cVar});
            return;
        }
        LottieAnimationView lottieAnimationView = this.lottieAnimationView;
        if (lottieAnimationView == null || !lottieAnimationView.isAnimating()) {
            fve.m("DXTBIFLottieViewWidgetNode", "onRenderView");
            try {
                HImageView hImageView = this.bottomImageView;
                if (hImageView != null) {
                    hImageView.setScaleType(c.a(cVar));
                    this.bottomImageView.setImageUrl(c.b(cVar));
                }
                LottieAnimationView lottieAnimationView2 = this.lottieAnimationView;
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.setScaleType(c.a(cVar));
                    this.lottieAnimationView.setProgress((float) c.c(cVar));
                    this.lottieAnimationView.setRepeatCount(c.d(cVar));
                    this.lottieAnimationView.setAnimationFromUrl(c.e(cVar));
                    for (Map.Entry<String, Object> entry : c.f(cVar).entrySet()) {
                        String[] split = entry.getKey().split(",");
                        if (split.length != 0 && (entry.getValue() instanceof String)) {
                            this.lottieAnimationView.addValueCallback(new e4g(split), (e4g) ylh.TEXT, (fmh<e4g>) new a(this, entry));
                        }
                    }
                }
            } catch (Throwable th) {
                fve.c("DXTBIFLottieViewWidgetNode", "onRenderView", th);
            }
        }
    }

    public LottieView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        InfoFlowLottieAnimationView infoFlowLottieAnimationView = new InfoFlowLottieAnimationView(getContext());
        this.lottieAnimationView = infoFlowLottieAnimationView;
        infoFlowLottieAnimationView.setFontAssetDelegate(new b(context));
        infoFlowLottieAnimationView.addLottieOnCompositionLoadedListener(this);
        infoFlowLottieAnimationView.setFailureListener(this);
        HImageView hImageView = new HImageView(getContext());
        this.bottomImageView = hImageView;
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        addView(hImageView, layoutParams);
        addView(infoFlowLottieAnimationView, layoutParams);
    }

    @Override // tb.ulh
    public void onCompositionLoaded(kkh kkhVar) {
        int height;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0909eda", new Object[]{this, kkhVar});
            return;
        }
        fve.m("DXTBIFLottieViewWidgetNode", "onCompositionLoaded");
        if (kkhVar != null) {
            try {
                Rect b2 = kkhVar.b();
                if (b2 != null) {
                    i = b2.width();
                    height = b2.height();
                    if (i > 0 && height > 0) {
                        hideBottomImage();
                        start();
                        return;
                    }
                }
            } catch (Throwable th) {
                fve.c("DXTBIFLottieViewWidgetNode", "onCompositionLoaded exception", th);
                return;
            }
        }
        height = 0;
        if (i > 0) {
        }
    }

    public void onResult(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f750ea72", new Object[]{this, th});
        } else {
            fve.c("DXTBIFLottieViewWidgetNode", "onResult Throwable", th);
        }
    }
}
