package com.taobao.weex.ui.action;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.ui.animation.BackgroundColorProperty;
import com.taobao.weex.ui.animation.HeightProperty;
import com.taobao.weex.ui.animation.WXAnimationBean;
import com.taobao.weex.ui.animation.WXAnimationModule;
import com.taobao.weex.ui.animation.WidthProperty;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.ui.view.border.BorderDrawable;
import com.taobao.weex.utils.SingleFunctionParser;
import com.taobao.weex.utils.WXLogUtils;
import com.taobao.weex.utils.WXResourceUtils;
import com.taobao.weex.utils.WXUtils;
import com.taobao.weex.utils.WXViewInnerUtils;
import java.util.HashMap;
import java.util.List;
import tb.kbe;
import tb.nid;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class GraphicActionAnimation extends BasicGraphicAction implements nid<kbe> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "GraphicActionAnimation";
    private static kbe templateDomImpl;
    private String callback;
    private WXAnimationBean mAnimationBean;
    private boolean styleNeedInit;

    static {
        t2o.a(985661660);
        t2o.a(985661634);
    }

    public GraphicActionAnimation(WXSDKInstance wXSDKInstance, String str, WXAnimationBean wXAnimationBean) {
        super(wXSDKInstance, str);
        this.styleNeedInit = false;
        this.callback = null;
        this.mAnimationBean = wXAnimationBean;
    }

    private ObjectAnimator createAnimator(WXSDKInstance wXSDKInstance, View view, int i) {
        WXAnimationBean.Style style;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ObjectAnimator) ipChange.ipc$dispatch("eef792bf", new Object[]{this, wXSDKInstance, view, new Integer(i)});
        }
        if (view == null || (style = this.mAnimationBean.styles) == null) {
            return null;
        }
        List<PropertyValuesHolder> holders = style.getHolders();
        if (!TextUtils.isEmpty(style.backgroundColor)) {
            BorderDrawable borderDrawable = WXViewInnerUtils.getBorderDrawable(view);
            if (borderDrawable != null) {
                holders.add(PropertyValuesHolder.ofObject(new BackgroundColorProperty(), new ArgbEvaluator(), Integer.valueOf(borderDrawable.getColor()), Integer.valueOf(WXResourceUtils.getColor(style.backgroundColor))));
            } else if (view.getBackground() instanceof ColorDrawable) {
                holders.add(PropertyValuesHolder.ofObject(new BackgroundColorProperty(), new ArgbEvaluator(), Integer.valueOf(((ColorDrawable) view.getBackground()).getColor()), Integer.valueOf(WXResourceUtils.getColor(style.backgroundColor))));
            }
        }
        if (view.getLayoutParams() != null && (!TextUtils.isEmpty(style.width) || !TextUtils.isEmpty(style.height))) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (!TextUtils.isEmpty(style.width)) {
                holders.add(PropertyValuesHolder.ofInt(String.valueOf(new WidthProperty()), layoutParams.width, (int) WXViewInnerUtils.getRealPxByWidth(wXSDKInstance, WXUtils.getFloat(style.width), i)));
            }
            if (!TextUtils.isEmpty(style.height)) {
                holders.add(PropertyValuesHolder.ofInt(String.valueOf(new HeightProperty()), layoutParams.height, (int) WXViewInnerUtils.getRealPxByWidth(wXSDKInstance, WXUtils.getFloat(style.height), i)));
            }
        }
        if (style.getPivot() != null) {
            Pair<Float, Float> pivot = style.getPivot();
            view.setPivotX(((Float) pivot.first).floatValue());
            view.setPivotY(((Float) pivot.second).floatValue());
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, (PropertyValuesHolder[]) holders.toArray(new PropertyValuesHolder[holders.size()]));
        ofPropertyValuesHolder.setStartDelay(this.mAnimationBean.delay);
        return ofPropertyValuesHolder;
    }

    private Animator.AnimatorListener createAnimatorListener(final WXSDKInstance wXSDKInstance, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator.AnimatorListener) ipChange.ipc$dispatch("e9bb707e", new Object[]{this, wXSDKInstance, str});
        }
        if (!TextUtils.isEmpty(str)) {
            return new AnimatorListenerAdapter() { // from class: com.taobao.weex.ui.action.GraphicActionAnimation.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str2, Object... objArr) {
                    str2.hashCode();
                    int hashCode = str2.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/taobao/weex/ui/action/GraphicActionAnimation$1");
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                        return;
                    }
                    WXSDKInstance wXSDKInstance2 = wXSDKInstance;
                    if (wXSDKInstance2 == null || wXSDKInstance2.i0()) {
                        WXLogUtils.e("RenderContextImpl-onAnimationEnd WXSDKInstance == null NPE or instance is destroyed");
                    } else {
                        WXSDKManager.getInstance().callback(wXSDKInstance.N(), str, new HashMap());
                    }
                }
            };
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(GraphicActionAnimation graphicActionAnimation, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/weex/ui/action/GraphicActionAnimation");
    }

    private void startAnimation(WXSDKInstance wXSDKInstance, WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("842346aa", new Object[]{this, wXSDKInstance, wXComponent});
        } else if (wXComponent != null) {
            WXAnimationBean wXAnimationBean = this.mAnimationBean;
            if (wXAnimationBean != null) {
                wXComponent.setNeedLayoutOnAnimation(wXAnimationBean.needLayout);
            }
            if (wXComponent.getHostView() == null) {
                wXComponent.postAnimation(new WXAnimationModule.AnimationHolder(this.mAnimationBean, this.callback));
                return;
            }
            try {
                ObjectAnimator createAnimator = createAnimator(getWXSDKIntance(), wXComponent.getHostView(), wXSDKInstance.P());
                if (createAnimator != null) {
                    Animator.AnimatorListener createAnimatorListener = createAnimatorListener(wXSDKInstance, this.callback);
                    Interpolator createTimeInterpolator = createTimeInterpolator();
                    if (createAnimatorListener != null) {
                        createAnimator.addListener(createAnimatorListener);
                    }
                    if (createTimeInterpolator != null) {
                        createAnimator.setInterpolator(createTimeInterpolator);
                    }
                    wXComponent.getHostView().setCameraDistance(this.mAnimationBean.styles.getCameraDistance());
                    createAnimator.setDuration(this.mAnimationBean.duration);
                    createAnimator.start();
                }
            } catch (RuntimeException e) {
                WXLogUtils.e(TAG, WXLogUtils.getStackTrace(e));
            }
        }
    }

    @Override // com.taobao.weex.ui.action.IExecutable
    public void executeAction() {
        kbe kbeVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d76bd12", new Object[]{this});
        } else if (this.mAnimationBean != null) {
            WXComponent wXComponent = WXSDKManager.getInstance().getWXRenderManager().getWXComponent(getPageId(), getRef());
            if (wXComponent == null && (kbeVar = templateDomImpl) != null) {
                if (kbeVar.isVirtualDomRef(getRef())) {
                    wXComponent = templateDomImpl.findVirtualComponentByVRef(getPageId(), getRef());
                } else {
                    return;
                }
            }
            if (wXComponent != null) {
                wXComponent.setUseAnimation();
                WXSDKInstance wXSDKInstance = WXSDKManager.getInstance().getWXRenderManager().getWXSDKInstance(getPageId());
                if (wXSDKInstance != null && this.mAnimationBean.styles != null) {
                    if (this.styleNeedInit) {
                        String str = (String) wXComponent.getStyles().get("transformOrigin");
                        if (TextUtils.isEmpty(this.mAnimationBean.styles.transformOrigin)) {
                            this.mAnimationBean.styles.transformOrigin = str;
                        }
                        WXAnimationBean.Style style = this.mAnimationBean.styles;
                        style.init(style.transformOrigin, style.transform, (int) wXComponent.getLayoutWidth(), (int) wXComponent.getLayoutHeight(), wXSDKInstance.P(), wXSDKInstance);
                    }
                    startAnimation(wXSDKInstance, wXComponent);
                }
            }
        }
    }

    @Override // tb.nid
    public kbe getImpl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kbe) ipChange.ipc$dispatch("490a46a2", new Object[]{this}) : templateDomImpl;
    }

    public void setImpl(kbe kbeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c2e5b4c", new Object[]{this, kbeVar});
        } else {
            templateDomImpl = kbeVar;
        }
    }

    public GraphicActionAnimation(WXSDKInstance wXSDKInstance, String str, String str2, String str3) {
        super(wXSDKInstance, str);
        this.styleNeedInit = true;
        this.callback = str3;
        if (!TextUtils.isEmpty(str2)) {
            this.mAnimationBean = (WXAnimationBean) JSON.parseObject(str2, WXAnimationBean.class);
        }
    }

    private Interpolator createTimeInterpolator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Interpolator) ipChange.ipc$dispatch("c1ad726c", new Object[]{this});
        }
        String str = this.mAnimationBean.timingFunction;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1965120668:
                if (str.equals("ease-in")) {
                    c = 0;
                    break;
                }
                break;
            case -1102672091:
                if (str.equals("linear")) {
                    c = 1;
                    break;
                }
                break;
            case -789192465:
                if (str.equals("ease-out")) {
                    c = 2;
                    break;
                }
                break;
            case -361990811:
                if (str.equals("ease-in-out")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new AccelerateInterpolator();
            case 1:
                return new LinearInterpolator();
            case 2:
                return new DecelerateInterpolator();
            case 3:
                return new AccelerateDecelerateInterpolator();
            default:
                try {
                    List parse = new SingleFunctionParser(this.mAnimationBean.timingFunction, new SingleFunctionParser.FlatMapper<Float>() { // from class: com.taobao.weex.ui.action.GraphicActionAnimation.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // com.taobao.weex.utils.SingleFunctionParser.FlatMapper
                        public Float map(String str2) {
                            IpChange ipChange2 = $ipChange;
                            return ipChange2 instanceof IpChange ? (Float) ipChange2.ipc$dispatch("6e6ed36", new Object[]{this, str2}) : Float.valueOf(Float.parseFloat(str2));
                        }
                    }).parse("cubic-bezier");
                    if (parse != null && parse.size() == 4) {
                        return PathInterpolatorCompat.create(((Float) parse.get(0)).floatValue(), ((Float) parse.get(1)).floatValue(), ((Float) parse.get(2)).floatValue(), ((Float) parse.get(3)).floatValue());
                    }
                } catch (RuntimeException unused) {
                }
                return null;
        }
    }

    public GraphicActionAnimation(WXSDKInstance wXSDKInstance, String str, WXAnimationBean wXAnimationBean, String str2) {
        super(wXSDKInstance, str);
        this.styleNeedInit = false;
        this.mAnimationBean = wXAnimationBean;
        this.callback = str2;
    }

    public GraphicActionAnimation() {
        super(null, null);
        this.styleNeedInit = false;
    }
}
