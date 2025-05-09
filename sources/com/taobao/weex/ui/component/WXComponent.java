package com.taobao.weex.ui.component;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.widget.FrameLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.alibaba.android.ultron.trade.event.OpenSimplePopupSubscriber;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.adapter.IWXAccessibilityRoleAdapter;
import com.taobao.weex.adapter.IWXConfigAdapter;
import com.taobao.weex.bridge.EventResult;
import com.taobao.weex.bridge.Invoker;
import com.taobao.weex.common.Constants;
import com.taobao.weex.common.IWXObject;
import com.taobao.weex.common.WXErrorCode;
import com.taobao.weex.common.WXRuntimeException;
import com.taobao.weex.dom.CSSShorthand;
import com.taobao.weex.dom.WXAttr;
import com.taobao.weex.dom.WXEvent;
import com.taobao.weex.dom.WXStyle;
import com.taobao.weex.dom.binding.ELUtils;
import com.taobao.weex.dom.transition.WXTransition;
import com.taobao.weex.layout.ContentBoxMeasurement;
import com.taobao.weex.remote.IWXBridgeManager;
import com.taobao.weex.ui.IFComponentHolder;
import com.taobao.weex.ui.WXRenderManager;
import com.taobao.weex.ui.action.BasicComponentData;
import com.taobao.weex.ui.action.GraphicActionAnimation;
import com.taobao.weex.ui.action.GraphicActionUpdateStyle;
import com.taobao.weex.ui.action.GraphicPosition;
import com.taobao.weex.ui.action.GraphicSize;
import com.taobao.weex.ui.animation.WXAnimationBean;
import com.taobao.weex.ui.animation.WXAnimationModule;
import com.taobao.weex.ui.component.basic.WXBasicComponent;
import com.taobao.weex.ui.component.list.template.jni.NativeRenderObjectUtils;
import com.taobao.weex.ui.component.pesudo.OnActivePseudoListner;
import com.taobao.weex.ui.component.pesudo.PesudoStatus;
import com.taobao.weex.ui.component.pesudo.TouchActivePseudoListener;
import com.taobao.weex.ui.flat.FlatComponent;
import com.taobao.weex.ui.flat.FlatGUIContext;
import com.taobao.weex.ui.flat.widget.AndroidViewWidget;
import com.taobao.weex.ui.flat.widget.Widget;
import com.taobao.weex.ui.view.border.BorderDrawable;
import com.taobao.weex.ui.view.gesture.WXGesture;
import com.taobao.weex.ui.view.gesture.WXGestureObservable;
import com.taobao.weex.ui.view.gesture.WXGestureType;
import com.taobao.weex.utils.BoxShadowUtil;
import com.taobao.weex.utils.WXDataStructureUtil;
import com.taobao.weex.utils.WXExceptionUtils;
import com.taobao.weex.utils.WXLogUtils;
import com.taobao.weex.utils.WXReflectionUtils;
import com.taobao.weex.utils.WXResourceUtils;
import com.taobao.weex.utils.WXUtils;
import com.taobao.weex.utils.WXViewInnerUtils;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import tb.rc4;
import tb.t2o;
import tb.yae;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class WXComponent<T extends View> extends WXBasicComponent implements IWXObject, yae, OnActivePseudoListner {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PROP_FIXED_SIZE = "fixedSize";
    public static final String PROP_FS_MATCH_PARENT = "m";
    public static final String PROP_FS_WRAP_CONTENT = "w";
    public static final String ROOT = "_root";
    public static final int STATE_ALL_FINISH = 2;
    public static final int STATE_DOM_FINISH = 0;
    public static final int STATE_UI_FINISH = 1;
    public static final String TYPE = "type";
    public static final int TYPE_COMMON = 0;
    public static final int TYPE_VIRTUAL = 1;
    private ConcurrentLinkedQueue<Pair<String, Map<String, Object>>> animations;
    public ContentBoxMeasurement contentBoxMeasurement;
    private volatile boolean hasRendered;
    public int interactionAbsoluteX;
    public int interactionAbsoluteY;
    public boolean isIgnoreInteraction;
    private boolean isLastLayoutDirectionRTL;
    private boolean isUsing;
    private int mAbsoluteX;
    private int mAbsoluteY;
    private WXAnimationModule.AnimationHolder mAnimationHolder;
    private Set<String> mAppendEvents;
    private BorderDrawable mBackgroundDrawable;
    public int mChildrensWidth;
    private WXComponent<T>.OnClickListenerImp mClickEventListener;
    private Context mContext;
    public int mDeepInComponentTree;
    private int mFixedProp;
    private List<OnFocusChangeListener> mFocusChangeListeners;
    public WXGesture mGesture;
    private Set<String> mGestureType;
    private boolean mHasAddFocusListener;
    private IFComponentHolder mHolder;
    public T mHost;
    private List<OnClickListener> mHostClickListeners;
    private WXSDKInstance mInstance;
    public boolean mIsAddElementToTree;
    private boolean mIsDestroyed;
    private boolean mIsDisabled;
    private String mLastBoxShadowId;
    private boolean mLazy;
    private boolean mNeedLayoutOnAnimation;
    private volatile WXVContainer mParent;
    private PesudoStatus mPesudoStatus;
    private int mPreRealHeight;
    private int mPreRealLeft;
    private int mPreRealRight;
    private int mPreRealTop;
    private int mPreRealWidth;
    private GraphicSize mPseudoResetGraphicSize;
    private Drawable mRippleBackground;
    private int mStickyOffset;
    private WXTransition mTransition;
    private int mType;
    private String mViewTreeKey;
    public boolean useAnimations;
    private boolean waste;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class MeasureOutput {
        public int height;
        public int width;

        static {
            t2o.a(985661694);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface OnClickListener {
        void onHostViewClick();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface OnFocusChangeListener {
        void onFocusChange(boolean z);
    }

    /* compiled from: Taobao */
    @Target({ElementType.PARAMETER})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public @interface RenderState {
    }

    static {
        t2o.a(985661687);
        t2o.a(985661562);
        t2o.a(985661442);
        t2o.a(985661718);
    }

    @Deprecated
    public WXComponent(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, String str, boolean z, BasicComponentData basicComponentData) {
        this(wXSDKInstance, wXVContainer, z, basicComponentData);
    }

    public static /* synthetic */ WXSDKInstance access$100(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXSDKInstance) ipChange.ipc$dispatch("6111ddbb", new Object[]{wXComponent});
        }
        return wXComponent.mInstance;
    }

    public static /* synthetic */ List access$200(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1ef3a6e9", new Object[]{wXComponent});
        }
        return wXComponent.mFocusChangeListeners;
    }

    public static /* synthetic */ List access$300(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9d54aac8", new Object[]{wXComponent});
        }
        return wXComponent.mHostClickListeners;
    }

    public static /* synthetic */ BorderDrawable access$400(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BorderDrawable) ipChange.ipc$dispatch("e158280e", new Object[]{wXComponent});
        }
        return wXComponent.mBackgroundDrawable;
    }

    private void applyBorder(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59c7b466", new Object[]{this, wXComponent});
            return;
        }
        CSSShorthand border = wXComponent.getBorder();
        float f = border.get(CSSShorthand.EDGE.LEFT);
        float f2 = border.get(CSSShorthand.EDGE.TOP);
        float f3 = border.get(CSSShorthand.EDGE.RIGHT);
        float f4 = border.get(CSSShorthand.EDGE.BOTTOM);
        if (this.mHost != null) {
            setBorderWidth("borderLeftWidth", f);
            setBorderWidth("borderTopWidth", f2);
            setBorderWidth("borderRightWidth", f3);
            setBorderWidth("borderBottomWidth", f4);
        }
    }

    private void applyEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87ff9f2e", new Object[]{this});
        } else if (getEvents() != null && !getEvents().isEmpty()) {
            WXEvent events = getEvents();
            int size = events.size();
            for (int i = 0; i < size && i < events.size(); i++) {
                addEvent(events.get(i));
            }
            setActiveTouchListener();
        }
    }

    private WXAnimationBean createAnimationBean(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXAnimationBean) ipChange.ipc$dispatch("a4edf941", new Object[]{this, str, map});
        }
        if (map != null) {
            try {
                Object obj = map.get("transform");
                if ((obj instanceof String) && !TextUtils.isEmpty((String) obj)) {
                    String str2 = (String) map.get("transformOrigin");
                    WXAnimationBean wXAnimationBean = new WXAnimationBean();
                    int layoutWidth = (int) getLayoutWidth();
                    int layoutHeight = (int) getLayoutHeight();
                    WXAnimationBean.Style style = new WXAnimationBean.Style();
                    wXAnimationBean.styles = style;
                    style.init(str2, (String) obj, layoutWidth, layoutHeight, WXSDKManager.getInstanceViewPortWidth(getInstanceId()), getInstance());
                    return wXAnimationBean;
                }
            } catch (RuntimeException e) {
                WXLogUtils.e("", e);
            }
        }
        return null;
    }

    public static void initLazyComponent(WXComponent wXComponent, WXVContainer wXVContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c71be7e", new Object[]{wXComponent, wXVContainer});
        } else if (wXComponent.isLazy() || wXComponent.getHostView() == null) {
            wXComponent.lazy(false);
            if (wXVContainer != null) {
                wXVContainer.createChildViewAt(wXVContainer.indexOf(wXComponent));
            } else {
                wXComponent.createView();
            }
            wXComponent.applyLayoutAndEvent(wXComponent);
            wXComponent.bindData(wXComponent);
        }
    }

    public static /* synthetic */ Object ipc$super(WXComponent wXComponent, String str, Object... objArr) {
        if (str.hashCode() == 993594860) {
            super.bindComponent((WXComponent) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/weex/ui/component/WXComponent");
    }

    private boolean needGestureDetector(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b517aa8e", new Object[]{this, str})).booleanValue();
        }
        if (this.mHost != null) {
            for (WXGestureType.LowLevelGesture lowLevelGesture : WXGestureType.LowLevelGesture.values()) {
                if (str.equals(lowLevelGesture.toString())) {
                    return true;
                }
            }
            for (WXGestureType.HighLevelGesture highLevelGesture : WXGestureType.HighLevelGesture.values()) {
                if (str.equals(highLevelGesture.toString())) {
                    return true;
                }
            }
        }
        if (WXGesture.isStopPropagation(str)) {
            return true;
        }
        return false;
    }

    private void parseAnimation() {
        WXAnimationBean createAnimationBean;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25d48e18", new Object[]{this});
            return;
        }
        ConcurrentLinkedQueue<Pair<String, Map<String, Object>>> concurrentLinkedQueue = this.animations;
        if (concurrentLinkedQueue != null) {
            Iterator<Pair<String, Map<String, Object>>> it = concurrentLinkedQueue.iterator();
            while (it.hasNext()) {
                Pair<String, Map<String, Object>> next = it.next();
                if (!TextUtils.isEmpty((CharSequence) next.first) && (createAnimationBean = createAnimationBean((String) next.first, (Map) next.second)) != null) {
                    new GraphicActionAnimation(getInstance(), getRef(), createAnimationBean).executeAction();
                }
            }
            this.animations.clear();
        }
    }

    private Drawable prepareBackgroundRipple() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("422a700e", new Object[]{this});
        }
        try {
            if (!(getStyles() == null || getStyles().getPesudoResetStyles() == null)) {
                Map<String, Object> pesudoResetStyles = getStyles().getPesudoResetStyles();
                Object obj = pesudoResetStyles.get("backgroundColor");
                if (obj != null) {
                    i = WXResourceUtils.getColor(obj.toString(), 0);
                    if (i == 0) {
                        return null;
                    }
                } else {
                    i = 0;
                }
                Object obj2 = pesudoResetStyles.get("backgroundColor:active");
                if (obj2 == null) {
                    return null;
                }
                return new RippleDrawable(new ColorStateList(new int[][]{new int[0]}, new int[]{WXResourceUtils.getColor(obj2.toString(), i)}), new ColorDrawable(i), null) { // from class: com.taobao.weex.ui.component.WXComponent.6
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass6 r2, String str, Object... objArr) {
                        if (str.hashCode() == -1665133574) {
                            super.draw((Canvas) objArr[0]);
                            return null;
                        }
                        int hashCode = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/weex/ui/component/WXComponent$6");
                    }

                    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
                    public void draw(Canvas canvas) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
                            return;
                        }
                        if (WXComponent.access$400(WXComponent.this) != null) {
                            canvas.clipPath(WXComponent.access$400(WXComponent.this).getContentPath(new RectF(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight())));
                        }
                        super.draw(canvas);
                    }
                };
            }
        } catch (Throwable th) {
            WXLogUtils.w("Exception on create ripple: ", th);
        }
        return null;
    }

    private boolean recycleWithAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6dfe9496", new Object[]{this})).booleanValue();
        }
        if (!checkUseAnimation() || !useAnimation()) {
            return true;
        }
        return false;
    }

    private void setActiveTouchListener() {
        View realView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ec156f2", new Object[]{this});
        } else if (getStyles().getPesudoStyles().containsKey(Constants.PSEUDO.ACTIVE) && (realView = getRealView()) != null) {
            ViewProxy.setOnTouchListener(realView, new TouchActivePseudoListener(this, true ^ isConsumeTouch()));
        }
    }

    private void setComponentLayoutParams(int i, int i2, int i3, int i4, int i5, int i6, Point point) {
        Widget androidViewWidget;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8dfedf5", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), point});
        } else if (getInstance() != null && !getInstance().i0()) {
            FlatGUIContext J = getInstance().J();
            if (J != null && J.getFlatComponentAncestor(this) != null) {
                if (this instanceof FlatComponent) {
                    FlatComponent flatComponent = (FlatComponent) this;
                    if (!flatComponent.promoteToView(true)) {
                        androidViewWidget = flatComponent.getOrCreateFlatWidget();
                        setWidgetParams(androidViewWidget, J, point, i, i2, i3, i5, i4, i6);
                    }
                }
                androidViewWidget = J.getAndroidViewWidget(this);
                setWidgetParams(androidViewWidget, J, point, i, i2, i3, i5, i4, i6);
            } else if (this.mHost != null) {
                clearBoxShadow();
                if (isFixed()) {
                    setFixedHostLayoutParams(this.mHost, i, i2, i3, i5, i4, i6);
                } else {
                    setHostLayoutParams(this.mHost, i, i2, i3, i5, i4, i6);
                }
                recordInteraction(i, i2);
                this.mPreRealWidth = i;
                this.mPreRealHeight = i2;
                this.mPreRealLeft = i3;
                this.mPreRealRight = i5;
                this.mPreRealTop = i4;
                onFinishLayout();
                updateBoxShadow();
            }
        }
    }

    private void setFixedHostLayoutParams(T t, int i, int i2, int i3, int i4, int i5, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afbc3ea1", new Object[]{this, t, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.width = i;
        layoutParams.height = i2;
        setMarginsSupportRTL(layoutParams, i3, i5, i4, i6);
        t.setLayoutParams(layoutParams);
        this.mInstance.moveFixedView(t);
        if (WXEnvironment.isApkDebugable()) {
            WXLogUtils.d("Weex_Fixed_Style", "WXComponent:setLayout :" + i3 + " " + i5 + " " + i + " " + i2);
            StringBuilder sb = new StringBuilder("WXComponent:setLayout Left:");
            sb.append(getStyles().getLeft());
            sb.append(" ");
            sb.append((int) getStyles().getTop());
            WXLogUtils.d("Weex_Fixed_Style", sb.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void setWidgetParams(com.taobao.weex.ui.flat.widget.Widget r18, com.taobao.weex.ui.flat.FlatGUIContext r19, android.graphics.Point r20, int r21, int r22, int r23, int r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.weex.ui.component.WXComponent.setWidgetParams(com.taobao.weex.ui.flat.widget.Widget, com.taobao.weex.ui.flat.FlatGUIContext, android.graphics.Point, int, int, int, int, int, int):void");
    }

    private void updateElevation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6387821b", new Object[]{this});
            return;
        }
        float elevation = getAttrs().getElevation(getInstance(), getInstance().P());
        if (!Float.isNaN(elevation)) {
            ViewCompat.setElevation(getHostView(), elevation);
        }
    }

    private void updateStyleByPesudo(Map<String, Object> map) {
        IWXBridgeManager wXBridgeManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("530192dd", new Object[]{this, map});
            return;
        }
        new GraphicActionUpdateStyle(getInstance(), getRef(), map, getPadding(), getMargin(), getBorder(), true).executeActionOnRender();
        if ((getLayoutWidth() != 0.0f || getLayoutWidth() != 0.0f) && (wXBridgeManager = WXSDKManager.getInstance().getWXBridgeManager()) != null) {
            wXBridgeManager.setStyleWidth(getInstanceId(), getRef(), getLayoutWidth());
            wXBridgeManager.setStyleHeight(getInstanceId(), getRef(), getLayoutHeight());
        }
    }

    public void addAnimationForElement(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66cb6628", new Object[]{this, map});
        } else if (map != null && !map.isEmpty()) {
            if (this.animations == null) {
                this.animations = new ConcurrentLinkedQueue<>();
            }
            this.animations.add(new Pair<>(getRef(), map));
        }
    }

    public final void addClickListener(OnClickListener onClickListener) {
        View realView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a37d6a0e", new Object[]{this, onClickListener});
        } else if (onClickListener != null && (realView = getRealView()) != null) {
            if (this.mHostClickListeners == null) {
                this.mHostClickListeners = new ArrayList();
                ViewProxy.setOnClickListener(realView, new View.OnClickListener() { // from class: com.taobao.weex.ui.component.WXComponent.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            return;
                        }
                        WXGesture wXGesture = WXComponent.this.mGesture;
                        if (wXGesture == null || !wXGesture.isTouchEventConsumedByAdvancedGesture()) {
                            for (OnClickListener onClickListener2 : WXComponent.access$300(WXComponent.this)) {
                                if (onClickListener2 != null) {
                                    onClickListener2.onHostViewClick();
                                }
                            }
                        }
                    }
                });
            }
            this.mHostClickListeners.add(onClickListener);
        }
    }

    public final void addFocusChangeListener(OnFocusChangeListener onFocusChangeListener) {
        View realView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5220214e", new Object[]{this, onFocusChangeListener});
        } else if (onFocusChangeListener != null && (realView = getRealView()) != null) {
            if (this.mFocusChangeListeners == null) {
                this.mFocusChangeListeners = new ArrayList();
                realView.setFocusable(true);
                realView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.taobao.weex.ui.component.WXComponent.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnFocusChangeListener
                    public void onFocusChange(View view, boolean z) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("1621df92", new Object[]{this, view, new Boolean(z)});
                            return;
                        }
                        for (OnFocusChangeListener onFocusChangeListener2 : WXComponent.access$200(WXComponent.this)) {
                            if (onFocusChangeListener2 != null) {
                                onFocusChangeListener2.onFocusChange(z);
                            }
                        }
                    }
                });
            }
            this.mFocusChangeListeners.add(onFocusChangeListener);
        }
    }

    public void addLayerOverFlowListener(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c05be57", new Object[]{this, str});
        } else if (getInstance() != null) {
            getInstance().n(str);
        }
    }

    public void appendEventToDOM(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75351058", new Object[]{this, str});
        }
    }

    public void applyComponentEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("455d53af", new Object[]{this});
        } else {
            applyEvents();
        }
    }

    public void applyLayoutAndEvent(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1decc7", new Object[]{this, wXComponent});
        } else if (!isLazy()) {
            if (wXComponent == null) {
                wXComponent = this;
            }
            bindComponent(wXComponent);
            setSafeLayout(wXComponent);
            setPadding(wXComponent.getPadding(), wXComponent.getBorder());
            applyEvents();
        }
    }

    public void applyLayoutOnly() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6973a8b", new Object[]{this});
        } else if (!isLazy()) {
            setSafeLayout(this);
            setPadding(getPadding(), getBorder());
        }
    }

    @Override // com.taobao.weex.ui.component.basic.WXBasicComponent
    public final void bindComponent(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b390dec", new Object[]{this, wXComponent});
            return;
        }
        super.bindComponent(wXComponent);
        if (getInstance() != null) {
            setViewPortWidth(getInstance().P());
        }
        this.mParent = wXComponent.getParent();
        this.mType = wXComponent.getType();
    }

    public void bindData(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc333df3", new Object[]{this, wXComponent});
        } else if (!isLazy()) {
            if (wXComponent == null) {
                wXComponent = this;
            }
            bindComponent(wXComponent);
            updateStyles(wXComponent);
            updateAttrs(wXComponent);
            updateExtra(wXComponent.getExtra());
        }
    }

    public void bindHolder(IFComponentHolder iFComponentHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9308c53", new Object[]{this, iFComponentHolder});
        } else {
            this.mHolder = iFComponentHolder;
        }
    }

    public boolean canRecycled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c236802c", new Object[]{this})).booleanValue();
        }
        if ((!isFixed() || !isSticky()) && getAttrs().canRecycled() && recycleWithAnimation()) {
            return true;
        }
        return false;
    }

    public void clearBoxShadow() {
        ViewOverlay overlay;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84742485", new Object[]{this});
        } else if (BoxShadowUtil.isBoxShadowEnabled()) {
            if (getStyles() == null || getStyles().get("boxShadow") != null) {
                View view = this.mHost;
                if (this instanceof WXVContainer) {
                    view = ((WXVContainer) this).getBoxShadowHost(true);
                }
                if (!(view == null || (overlay = view.getOverlay()) == null)) {
                    overlay.clear();
                }
                this.mLastBoxShadowId = null;
            }
        }
    }

    public void clearPreLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaec9867", new Object[]{this});
            return;
        }
        this.mPreRealLeft = 0;
        this.mPreRealRight = 0;
        this.mPreRealWidth = 0;
        this.mPreRealHeight = 0;
        this.mPreRealTop = 0;
    }

    public void computeVisiblePointInViewCoordinate(PointF pointF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a3b0f49", new Object[]{this, pointF});
            return;
        }
        View realView = getRealView();
        pointF.set(realView.getScrollX(), realView.getScrollY());
    }

    public boolean containsEvent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("627cf410", new Object[]{this, str})).booleanValue();
        }
        if (getEvents().contains(str)) {
            return true;
        }
        Set<String> set = this.mAppendEvents;
        if (set == null || !set.contains(str)) {
            return false;
        }
        return true;
    }

    public boolean containsGesture(WXGestureType wXGestureType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71113862", new Object[]{this, wXGestureType})).booleanValue();
        }
        Set<String> set = this.mGestureType;
        if (set == null || !set.contains(wXGestureType.toString())) {
            return false;
        }
        return true;
    }

    public final void createView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e322dc8", new Object[]{this});
        } else if (!isLazy()) {
            createViewImpl();
        }
    }

    public void createViewImpl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b975b88", new Object[]{this});
            return;
        }
        Context context = this.mContext;
        if (context != null) {
            T initComponentHostView = initComponentHostView(context);
            this.mHost = initComponentHostView;
            if (initComponentHostView == null && !isVirtualComponent()) {
                initView();
            }
            T t = this.mHost;
            if (t != null) {
                if (t.getId() == -1) {
                    this.mHost.setId(WXViewInnerUtils.generateViewId());
                }
                if (TextUtils.isEmpty(this.mHost.getContentDescription())) {
                    WXEnvironment.isApkDebugable();
                }
                rc4 F = getInstance().F();
                if (F != null) {
                    F.onViewCreated(this, this.mHost);
                }
            }
            onHostViewInitialized(this.mHost);
            return;
        }
        WXLogUtils.e("createViewImpl", "Context is null");
    }

    public void destroy() {
        T hostView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        rc4 F = getInstance().F();
        if (F != null) {
            F.onPreDestory(this);
        }
        if (!WXEnvironment.isApkDebugable() || WXUtils.isUiThread()) {
            T t = this.mHost;
            if (t != null && t.getLayerType() == 2 && isLayerTypeEnabled()) {
                this.mHost.setLayerType(0, null);
            }
            removeAllEvent();
            removeStickyStyle();
            if (isFixed() && (hostView = getHostView()) != null) {
                getInstance().removeFixedView(hostView);
            }
            ContentBoxMeasurement contentBoxMeasurement = this.contentBoxMeasurement;
            if (contentBoxMeasurement != null) {
                contentBoxMeasurement.destroy();
                this.contentBoxMeasurement = null;
            }
            this.mIsDestroyed = true;
            ConcurrentLinkedQueue<Pair<String, Map<String, Object>>> concurrentLinkedQueue = this.animations;
            if (concurrentLinkedQueue != null) {
                concurrentLinkedQueue.clear();
                return;
            }
            return;
        }
        throw new WXRuntimeException("[WXComponent] destroy can only be called in main thread");
    }

    public View detachViewAndClearPreInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f8f5fb2c", new Object[]{this});
        }
        T t = this.mHost;
        this.mPreRealLeft = 0;
        this.mPreRealRight = 0;
        this.mPreRealWidth = 0;
        this.mPreRealHeight = 0;
        this.mPreRealTop = 0;
        return t;
    }

    public final WXComponent findComponent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXComponent) ipChange.ipc$dispatch("45957e46", new Object[]{this, str});
        }
        if (this.mInstance == null || str == null) {
            return null;
        }
        return WXSDKManager.getInstance().getWXRenderManager().getWXComponent(this.mInstance.N(), str);
    }

    public Object findTypeParent(WXComponent wXComponent, Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("66f7345e", new Object[]{this, wXComponent, cls});
        }
        if (wXComponent.getClass() == cls) {
            return wXComponent;
        }
        if (wXComponent.getParent() == null) {
            return null;
        }
        findTypeParent(wXComponent.getParent(), cls);
        return null;
    }

    public final void fireEvent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35b21d95", new Object[]{this, str});
        } else {
            fireEvent(str, null);
        }
    }

    public final EventResult fireEventWait(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EventResult) ipChange.ipc$dispatch("2e54425e", new Object[]{this, str, map});
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        EventResult eventResult = new EventResult() { // from class: com.taobao.weex.ui.component.WXComponent.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str2, Object... objArr) {
                if (str2.hashCode() == 1878571239) {
                    super.onCallback(objArr[0]);
                    return null;
                }
                int hashCode = str2.hashCode();
                throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/taobao/weex/ui/component/WXComponent$2");
            }

            @Override // com.taobao.weex.bridge.EventResult
            public void onCallback(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6ff8b8e7", new Object[]{this, obj});
                    return;
                }
                super.onCallback(obj);
                countDownLatch.countDown();
            }
        };
        try {
            fireEvent(str, map, null, eventResult);
            countDownLatch.await(50L, TimeUnit.MILLISECONDS);
            return eventResult;
        } catch (Exception e) {
            if (WXEnvironment.isApkDebugable()) {
                WXLogUtils.e("fireEventWait", e);
            }
            return eventResult;
        }
    }

    public int getAbsoluteX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8dfd1a05", new Object[]{this})).intValue();
        }
        return this.mAbsoluteX;
    }

    public int getAbsoluteY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8e0b3186", new Object[]{this})).intValue();
        }
        return this.mAbsoluteY;
    }

    public String getAttrByKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("944a76ae", new Object[]{this, str});
        }
        return "default";
    }

    public String getComponentId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5df1a77", new Object[]{this});
        }
        WXAttr attrs = getAttrs();
        if (attrs.get(ELUtils.IS_COMPONENT_ROOT) != null && WXUtils.getBoolean(attrs.get(ELUtils.IS_COMPONENT_ROOT), Boolean.FALSE).booleanValue() && attrs.get(ELUtils.COMPONENT_PROPS) != null && (attrs.get(ELUtils.COMPONENT_PROPS) instanceof JSONObject)) {
            Object obj = attrs.get("@virtualComponentId");
            if (obj == null) {
                return null;
            }
            return obj.toString();
        } else if (getParent() != null) {
            return getParent().getComponentId();
        } else {
            return null;
        }
    }

    public Rect getComponentSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("387a3b78", new Object[]{this});
        }
        Rect rect = new Rect();
        T t = this.mHost;
        if (t != null) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            t.getLocationOnScreen(iArr);
            this.mInstance.getContainerView().getLocationOnScreen(iArr2);
            int i = iArr[0] - iArr2[0];
            int i2 = (iArr[1] - this.mStickyOffset) - iArr2[1];
            rect.set(i, i2, ((int) getLayoutWidth()) + i, ((int) getLayoutHeight()) + i2);
        }
        return rect;
    }

    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.mContext;
    }

    public Scrollable getFirstScroller() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Scrollable) ipChange.ipc$dispatch("d2dc61d3", new Object[]{this});
        }
        if (this instanceof Scrollable) {
            return (Scrollable) this;
        }
        return null;
    }

    public T getHostView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((View) ipChange.ipc$dispatch("d4389aac", new Object[]{this}));
        }
        return this.mHost;
    }

    public WXSDKInstance getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXSDKInstance) ipChange.ipc$dispatch("19215a70", new Object[]{this});
        }
        return this.mInstance;
    }

    public String getInstanceId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5c00da33", new Object[]{this});
        }
        return this.mInstance.N();
    }

    public int getLayoutTopOffsetForSibling() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5812efdb", new Object[]{this})).intValue();
        }
        return 0;
    }

    public BorderDrawable getOrCreateBorder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BorderDrawable) ipChange.ipc$dispatch("552ff536", new Object[]{this});
        }
        if (this.mBackgroundDrawable == null) {
            this.mBackgroundDrawable = new BorderDrawable();
            T t = this.mHost;
            if (t != null) {
                WXViewInnerUtils.setBackGround(t, null, this);
                if (this.mRippleBackground == null) {
                    WXViewInnerUtils.setBackGround(this.mHost, this.mBackgroundDrawable, this);
                } else {
                    WXViewInnerUtils.setBackGround(this.mHost, new LayerDrawable(new Drawable[]{this.mRippleBackground, this.mBackgroundDrawable}), this);
                }
            }
        }
        return this.mBackgroundDrawable;
    }

    public WXVContainer getParent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXVContainer) ipChange.ipc$dispatch("84cdb95a", new Object[]{this});
        }
        return this.mParent;
    }

    public Scrollable getParentScroller() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Scrollable) ipChange.ipc$dispatch("5b2c2d79", new Object[]{this});
        }
        WXComponent<T> wXComponent = this;
        do {
            wXComponent = wXComponent.getParent();
            if (wXComponent == null) {
                return null;
            }
            if (wXComponent instanceof Scrollable) {
                return (Scrollable) wXComponent;
            }
        } while (!wXComponent.getRef().equals(ROOT));
        return null;
    }

    public View getRealView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("849d5722", new Object[]{this});
        }
        return this.mHost;
    }

    public long getRenderObjectPtr() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9ac63efe", new Object[]{this})).longValue();
        }
        if (getBasicComponentData().isRenderPtrEmpty()) {
            getBasicComponentData().setRenderObjectPr(NativeRenderObjectUtils.nativeGetRenderObject(getInstanceId(), getRef()));
        }
        return getBasicComponentData().getRenderObjectPr();
    }

    public int getStickyOffset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7bab4dcc", new Object[]{this})).intValue();
        }
        return this.mStickyOffset;
    }

    public WXTransition getTransition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXTransition) ipChange.ipc$dispatch("4272d89b", new Object[]{this});
        }
        return this.mTransition;
    }

    public int getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue();
        }
        return this.mType;
    }

    @Deprecated
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.mHost;
    }

    public String getViewTreeKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("23740073", new Object[]{this});
        }
        if (this.mViewTreeKey == null) {
            if (getParent() == null) {
                this.mViewTreeKey = hashCode() + "_" + getRef();
            } else {
                this.mViewTreeKey = hashCode() + "_" + getRef() + "_" + getParent().indexOf(this);
            }
        }
        return this.mViewTreeKey;
    }

    public String getVisibility() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5490c8f1", new Object[]{this});
        }
        try {
            return (String) getStyles().get("visibility");
        } catch (Exception unused) {
            return "visible";
        }
    }

    public T initComponentHostView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((View) ipChange.ipc$dispatch("1d4db689", new Object[]{this, context}));
        }
        return null;
    }

    @Deprecated
    public void initView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        Context context = this.mContext;
        if (context != null) {
            this.mHost = initComponentHostView(context);
        }
    }

    public final void invoke(String str, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be01ca31", new Object[]{this, str, jSONArray});
            return;
        }
        Invoker methodInvoker = this.mHolder.getMethodInvoker(str);
        if (methodInvoker != null) {
            try {
                getInstance().getNativeInvokeHelper().invoke(this, methodInvoker, jSONArray);
            } catch (Exception e) {
                WXLogUtils.e("[WXComponent] updateProperties :class:" + getClass() + "method:" + methodInvoker.toString() + " function " + WXLogUtils.getStackTrace(e));
            }
        } else {
            onInvokeUnknownMethod(str, jSONArray);
        }
    }

    public boolean isConsumeTouch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e53648f8", new Object[]{this})).booleanValue();
        }
        List<OnClickListener> list = this.mHostClickListeners;
        if ((list == null || list.size() <= 0) && this.mGesture == null) {
            return false;
        }
        return true;
    }

    public boolean isDestoryed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("883bf6b4", new Object[]{this})).booleanValue();
        }
        return this.mIsDestroyed;
    }

    public boolean isDisabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("98011351", new Object[]{this})).booleanValue();
        }
        return this.mIsDisabled;
    }

    public boolean isFixed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("72b8d3f5", new Object[]{this})).booleanValue();
        }
        return getStyles().isFixed();
    }

    public boolean isFlatUIEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6981935", new Object[]{this})).booleanValue();
        }
        if (this.mParent == null || !this.mParent.isFlatUIEnabled()) {
            return false;
        }
        return true;
    }

    public boolean isLayerTypeEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64b9366b", new Object[]{this})).booleanValue();
        }
        return getInstance().n0();
    }

    public boolean isLazy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("85e0e549", new Object[]{this})).booleanValue();
        }
        if (this.mLazy) {
            return true;
        }
        if (this.mParent == null || !this.mParent.isLazy()) {
            return false;
        }
        return true;
    }

    public boolean isSticky() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b2496be", new Object[]{this})).booleanValue();
        }
        return getStyles().isSticky();
    }

    public boolean isUsing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("278f8105", new Object[]{this})).booleanValue();
        }
        return this.isUsing;
    }

    public boolean isVirtualComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1960fe07", new Object[]{this})).booleanValue();
        }
        if (this.mType == 1) {
            return true;
        }
        return false;
    }

    public boolean isWaste() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d626c9b", new Object[]{this})).booleanValue();
        }
        return this.waste;
    }

    public void layoutDirectionDidChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afa2a2e3", new Object[]{this, new Boolean(z)});
        }
    }

    public void lazy(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efff3439", new Object[]{this, new Boolean(z)});
        } else {
            this.mLazy = z;
        }
    }

    public MeasureOutput measure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MeasureOutput) ipChange.ipc$dispatch("49fa9afb", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        MeasureOutput measureOutput = new MeasureOutput();
        int i3 = this.mFixedProp;
        if (i3 != 0) {
            measureOutput.width = i3;
            measureOutput.height = i3;
        } else {
            measureOutput.width = i;
            measureOutput.height = i2;
        }
        return measureOutput;
    }

    public void nativeUpdateAttrs(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23a7481c", new Object[]{this, map});
            return;
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                updateNativeAttr(entry.getKey(), entry.getValue());
            }
        }
    }

    public void notifyAppearStateChange(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbd959e", new Object[]{this, str, str2});
        } else if (containsEvent("appear") || containsEvent("disappear")) {
            HashMap hashMap = new HashMap();
            hashMap.put("direction", str2);
            fireEvent(str, hashMap);
        }
    }

    public void notifyNativeSizeChanged(int i, int i2) {
        IWXBridgeManager wXBridgeManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a27e37a", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.mNeedLayoutOnAnimation && (wXBridgeManager = WXSDKManager.getInstance().getWXBridgeManager()) != null) {
            wXBridgeManager.setStyleWidth(getInstanceId(), getRef(), i);
            wXBridgeManager.setStyleHeight(getInstanceId(), getRef(), i2);
        }
    }

    public boolean onActivityBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fbe14a20", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.yae
    public void onActivityCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f208031", new Object[]{this});
        }
    }

    public void onActivityDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef57493", new Object[]{this});
        }
    }

    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        }
    }

    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
        }
    }

    @Override // tb.yae
    public void onActivityStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b48c417b", new Object[]{this});
        }
    }

    public void onActivityStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ac47b7", new Object[]{this});
        }
    }

    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e84f753", new Object[]{this, menu})).booleanValue();
        }
        return false;
    }

    public void onHostViewInitialized(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28e90023", new Object[]{this, t});
            return;
        }
        WXAnimationModule.AnimationHolder animationHolder = this.mAnimationHolder;
        if (animationHolder != null) {
            animationHolder.execute(this.mInstance, this);
        }
        setActiveTouchListener();
    }

    public void onInvokeUnknownMethod(String str, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b876b88d", new Object[]{this, str, jSONArray});
        }
    }

    public void onRenderFinish(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87284f14", new Object[]{this, new Integer(i)});
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e85742", new Object[]{this, new Integer(i), strArr, iArr});
        }
    }

    public void postAnimation(WXAnimationModule.AnimationHolder animationHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67f5748a", new Object[]{this, animationHolder});
        } else {
            this.mAnimationHolder = animationHolder;
        }
    }

    public void readyToRender() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c045293b", new Object[]{this});
        } else if (this.mParent != null) {
            this.mParent.readyToRender();
        }
    }

    public void recycled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e73ae438", new Object[]{this});
        } else if (!isFixed()) {
            clearBoxShadow();
        }
    }

    public void refreshData(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da5c8911", new Object[]{this, wXComponent});
        }
    }

    @Deprecated
    public void registerActivityStateListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8b261ba", new Object[]{this});
        }
    }

    public void removeAllEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dff7ac24", new Object[]{this});
        } else if (getEvents().size() >= 1) {
            WXEvent events = getEvents();
            int size = events.size();
            for (int i = 0; i < size && i < events.size(); i++) {
                String str = events.get(i);
                if (str != null) {
                    removeEventFromView(str);
                }
            }
            Set<String> set = this.mAppendEvents;
            if (set != null) {
                set.clear();
            }
            Set<String> set2 = this.mGestureType;
            if (set2 != null) {
                set2.clear();
            }
            this.mGesture = null;
            if (getRealView() != null && (getRealView() instanceof WXGestureObservable)) {
                ((WXGestureObservable) getRealView()).registerGestureListener(null);
            }
            T t = this.mHost;
            if (t != null) {
                t.setOnFocusChangeListener(null);
                List<OnClickListener> list = this.mHostClickListeners;
                if (list != null && list.size() > 0) {
                    this.mHostClickListeners.clear();
                    ViewProxy.setOnClickListener(this.mHost, null);
                }
            }
        }
    }

    public final void removeClickListener(OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5a3c64b", new Object[]{this, onClickListener});
        } else {
            this.mHostClickListeners.remove(onClickListener);
        }
    }

    public void removeEvent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36761a87", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            if (str.equals(Constants.Event.LAYEROVERFLOW)) {
                removeLayerOverFlowListener(getRef());
            }
            if (getEvents() != null) {
                getEvents().remove(str);
            }
            Set<String> set = this.mAppendEvents;
            if (set != null) {
                set.remove(str);
            }
            Set<String> set2 = this.mGestureType;
            if (set2 != null) {
                set2.remove(str);
            }
            removeEventFromView(str);
        }
    }

    public void removeEventFromView(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a57e4d6", new Object[]{this, str});
            return;
        }
        if (!(!str.equals("click") || getRealView() == null || this.mHostClickListeners == null)) {
            if (this.mClickEventListener == null) {
                this.mClickEventListener = new OnClickListenerImp();
            }
            this.mHostClickListeners.remove(this.mClickEventListener);
        }
        Scrollable parentScroller = getParentScroller();
        if (str.equals("appear") && parentScroller != null) {
            parentScroller.unbindAppearEvent(this);
        }
        if (str.equals("disappear") && parentScroller != null) {
            parentScroller.unbindDisappearEvent(this);
        }
    }

    public void removeLayerOverFlowListener(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0044e94", new Object[]{this, str});
        } else if (getInstance() != null) {
            getInstance().R0(str);
        }
    }

    public final void removeStickyStyle() {
        Scrollable parentScroller;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5f78cab", new Object[]{this});
        } else if (isSticky() && (parentScroller = getParentScroller()) != null) {
            parentScroller.unbindStickStyle(this);
        }
    }

    public void removeVirtualComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afceb85d", new Object[]{this});
        }
    }

    public void setAccessible(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9e8c6ae", new Object[]{this, bool});
        } else if (getHostView() == null) {
        } else {
            if (bool.booleanValue()) {
                getHostView().setImportantForAccessibility(1);
            } else {
                getHostView().setImportantForAccessibility(2);
            }
        }
    }

    public void setAriaHidden(boolean z) {
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8758e38", new Object[]{this, new Boolean(z)});
            return;
        }
        T hostView = getHostView();
        if (hostView != null) {
            if (z) {
                i = 4;
            }
            hostView.setImportantForAccessibility(i);
        }
    }

    public void setAriaLabel(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("808332fa", new Object[]{this, str});
            return;
        }
        T hostView = getHostView();
        if (hostView != null) {
            hostView.setContentDescription(str);
        }
    }

    public void setBackgroundColor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29247c64", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            int color = WXResourceUtils.getColor(str);
            if (isRippleEnabled()) {
                Drawable prepareBackgroundRipple = prepareBackgroundRipple();
                this.mRippleBackground = prepareBackgroundRipple;
                if (prepareBackgroundRipple != null) {
                    if (this.mBackgroundDrawable == null) {
                        WXViewInnerUtils.setBackGround(this.mHost, prepareBackgroundRipple, this);
                        return;
                    } else {
                        WXViewInnerUtils.setBackGround(this.mHost, new LayerDrawable(new Drawable[]{this.mRippleBackground, this.mBackgroundDrawable}), this);
                        return;
                    }
                }
            }
            if (color != 0 || this.mBackgroundDrawable != null) {
                getOrCreateBorder().setColor(color);
            }
        }
    }

    public void setBackgroundImage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ab3ac5c", new Object[]{this, str});
        } else if ("".equals(str.trim())) {
            getOrCreateBorder().setImage(null);
        } else {
            getOrCreateBorder().setImage(WXResourceUtils.getShader(str, getLayoutSize().getWidth(), getLayoutSize().getHeight()));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
        if (r7.equals("borderBottomColor") == false) goto L_0x0031;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setBorderColor(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            r3 = 3
            com.android.alibaba.ip.runtime.IpChange r4 = com.taobao.weex.ui.component.WXComponent.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x0018
            java.lang.String r5 = "d2dc49f0"
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r6
            r3[r1] = r7
            r3[r0] = r8
            r4.ipc$dispatch(r5, r3)
            return
        L_0x0018:
            boolean r4 = android.text.TextUtils.isEmpty(r8)
            if (r4 != 0) goto L_0x009c
            int r8 = com.taobao.weex.utils.WXResourceUtils.getColor(r8)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r8 == r4) goto L_0x009c
            r7.hashCode()
            r4 = -1
            int r5 = r7.hashCode()
            switch(r5) {
                case -1989576717: goto L_0x005d;
                case -1470826662: goto L_0x0052;
                case -1308858324: goto L_0x0049;
                case -242276144: goto L_0x003e;
                case 722830999: goto L_0x0033;
                default: goto L_0x0031;
            }
        L_0x0031:
            r0 = -1
            goto L_0x0067
        L_0x0033:
            java.lang.String r0 = "borderColor"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x003c
            goto L_0x0031
        L_0x003c:
            r0 = 4
            goto L_0x0067
        L_0x003e:
            java.lang.String r0 = "borderLeftColor"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0047
            goto L_0x0031
        L_0x0047:
            r0 = 3
            goto L_0x0067
        L_0x0049:
            java.lang.String r1 = "borderBottomColor"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L_0x0067
            goto L_0x0031
        L_0x0052:
            java.lang.String r0 = "borderTopColor"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x005b
            goto L_0x0031
        L_0x005b:
            r0 = 1
            goto L_0x0067
        L_0x005d:
            java.lang.String r0 = "borderRightColor"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0066
            goto L_0x0031
        L_0x0066:
            r0 = 0
        L_0x0067:
            switch(r0) {
                case 0: goto L_0x0093;
                case 1: goto L_0x0089;
                case 2: goto L_0x007f;
                case 3: goto L_0x0075;
                case 4: goto L_0x006b;
                default: goto L_0x006a;
            }
        L_0x006a:
            goto L_0x009c
        L_0x006b:
            com.taobao.weex.ui.view.border.BorderDrawable r7 = r6.getOrCreateBorder()
            com.taobao.weex.dom.CSSShorthand$EDGE r0 = com.taobao.weex.dom.CSSShorthand.EDGE.ALL
            r7.setBorderColor(r0, r8)
            goto L_0x009c
        L_0x0075:
            com.taobao.weex.ui.view.border.BorderDrawable r7 = r6.getOrCreateBorder()
            com.taobao.weex.dom.CSSShorthand$EDGE r0 = com.taobao.weex.dom.CSSShorthand.EDGE.LEFT
            r7.setBorderColor(r0, r8)
            goto L_0x009c
        L_0x007f:
            com.taobao.weex.ui.view.border.BorderDrawable r7 = r6.getOrCreateBorder()
            com.taobao.weex.dom.CSSShorthand$EDGE r0 = com.taobao.weex.dom.CSSShorthand.EDGE.BOTTOM
            r7.setBorderColor(r0, r8)
            goto L_0x009c
        L_0x0089:
            com.taobao.weex.ui.view.border.BorderDrawable r7 = r6.getOrCreateBorder()
            com.taobao.weex.dom.CSSShorthand$EDGE r0 = com.taobao.weex.dom.CSSShorthand.EDGE.TOP
            r7.setBorderColor(r0, r8)
            goto L_0x009c
        L_0x0093:
            com.taobao.weex.ui.view.border.BorderDrawable r7 = r6.getOrCreateBorder()
            com.taobao.weex.dom.CSSShorthand$EDGE r0 = com.taobao.weex.dom.CSSShorthand.EDGE.RIGHT
            r7.setBorderColor(r0, r8)
        L_0x009c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.weex.ui.component.WXComponent.setBorderColor(java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
        if (r7.equals("borderBottomLeftRadius") == false) goto L_0x002d;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setBorderRadius(java.lang.String r7, float r8) {
        /*
            r6 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            r3 = 3
            com.android.alibaba.ip.runtime.IpChange r4 = com.taobao.weex.ui.component.WXComponent.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x001d
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r8)
            java.lang.Object[] r8 = new java.lang.Object[r3]
            r8[r2] = r6
            r8[r1] = r7
            r8[r0] = r5
            java.lang.String r7 = "383169ef"
            r4.ipc$dispatch(r7, r8)
            return
        L_0x001d:
            r4 = 0
            int r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r4 < 0) goto L_0x00ca
            r7.hashCode()
            r4 = -1
            int r5 = r7.hashCode()
            switch(r5) {
                case -1228066334: goto L_0x0059;
                case 333432965: goto L_0x004e;
                case 581268560: goto L_0x0045;
                case 588239831: goto L_0x003a;
                case 1349188574: goto L_0x002f;
                default: goto L_0x002d;
            }
        L_0x002d:
            r0 = -1
            goto L_0x0063
        L_0x002f:
            java.lang.String r0 = "borderRadius"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0038
            goto L_0x002d
        L_0x0038:
            r0 = 4
            goto L_0x0063
        L_0x003a:
            java.lang.String r0 = "borderBottomRightRadius"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0043
            goto L_0x002d
        L_0x0043:
            r0 = 3
            goto L_0x0063
        L_0x0045:
            java.lang.String r1 = "borderBottomLeftRadius"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L_0x0063
            goto L_0x002d
        L_0x004e:
            java.lang.String r0 = "borderTopRightRadius"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0057
            goto L_0x002d
        L_0x0057:
            r0 = 1
            goto L_0x0063
        L_0x0059:
            java.lang.String r0 = "borderTopLeftRadius"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0062
            goto L_0x002d
        L_0x0062:
            r0 = 0
        L_0x0063:
            switch(r0) {
                case 0: goto L_0x00b7;
                case 1: goto L_0x00a3;
                case 2: goto L_0x008f;
                case 3: goto L_0x007b;
                case 4: goto L_0x0067;
                default: goto L_0x0066;
            }
        L_0x0066:
            goto L_0x00ca
        L_0x0067:
            com.taobao.weex.ui.view.border.BorderDrawable r7 = r6.getOrCreateBorder()
            com.taobao.weex.dom.CSSShorthand$CORNER r0 = com.taobao.weex.dom.CSSShorthand.CORNER.ALL
            com.taobao.weex.WXSDKInstance r1 = r6.mInstance
            int r2 = r1.P()
            float r8 = com.taobao.weex.utils.WXViewInnerUtils.getRealSubPxByWidth(r1, r8, r2)
            r7.setBorderRadius(r0, r8)
            goto L_0x00ca
        L_0x007b:
            com.taobao.weex.ui.view.border.BorderDrawable r7 = r6.getOrCreateBorder()
            com.taobao.weex.dom.CSSShorthand$CORNER r0 = com.taobao.weex.dom.CSSShorthand.CORNER.BORDER_BOTTOM_RIGHT
            com.taobao.weex.WXSDKInstance r1 = r6.mInstance
            int r2 = r1.P()
            float r8 = com.taobao.weex.utils.WXViewInnerUtils.getRealSubPxByWidth(r1, r8, r2)
            r7.setBorderRadius(r0, r8)
            goto L_0x00ca
        L_0x008f:
            com.taobao.weex.ui.view.border.BorderDrawable r7 = r6.getOrCreateBorder()
            com.taobao.weex.dom.CSSShorthand$CORNER r0 = com.taobao.weex.dom.CSSShorthand.CORNER.BORDER_BOTTOM_LEFT
            com.taobao.weex.WXSDKInstance r1 = r6.mInstance
            int r2 = r1.P()
            float r8 = com.taobao.weex.utils.WXViewInnerUtils.getRealSubPxByWidth(r1, r8, r2)
            r7.setBorderRadius(r0, r8)
            goto L_0x00ca
        L_0x00a3:
            com.taobao.weex.ui.view.border.BorderDrawable r7 = r6.getOrCreateBorder()
            com.taobao.weex.dom.CSSShorthand$CORNER r0 = com.taobao.weex.dom.CSSShorthand.CORNER.BORDER_TOP_RIGHT
            com.taobao.weex.WXSDKInstance r1 = r6.mInstance
            int r2 = r1.P()
            float r8 = com.taobao.weex.utils.WXViewInnerUtils.getRealSubPxByWidth(r1, r8, r2)
            r7.setBorderRadius(r0, r8)
            goto L_0x00ca
        L_0x00b7:
            com.taobao.weex.ui.view.border.BorderDrawable r7 = r6.getOrCreateBorder()
            com.taobao.weex.dom.CSSShorthand$CORNER r0 = com.taobao.weex.dom.CSSShorthand.CORNER.BORDER_TOP_LEFT
            com.taobao.weex.WXSDKInstance r1 = r6.mInstance
            int r2 = r1.P()
            float r8 = com.taobao.weex.utils.WXViewInnerUtils.getRealSubPxByWidth(r1, r8, r2)
            r7.setBorderRadius(r0, r8)
        L_0x00ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.weex.ui.component.WXComponent.setBorderRadius(java.lang.String, float):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
        if (r7.equals("borderBottomStyle") == false) goto L_0x0029;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setBorderStyle(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            r3 = 3
            com.android.alibaba.ip.runtime.IpChange r4 = com.taobao.weex.ui.component.WXComponent.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x0018
            java.lang.String r5 = "b587523e"
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r6
            r3[r1] = r7
            r3[r0] = r8
            r4.ipc$dispatch(r5, r3)
            return
        L_0x0018:
            boolean r4 = android.text.TextUtils.isEmpty(r8)
            if (r4 != 0) goto L_0x0094
            r7.hashCode()
            r4 = -1
            int r5 = r7.hashCode()
            switch(r5) {
                case -1974639039: goto L_0x0055;
                case -1455888984: goto L_0x004a;
                case -1293920646: goto L_0x0041;
                case -227338466: goto L_0x0036;
                case 737768677: goto L_0x002b;
                default: goto L_0x0029;
            }
        L_0x0029:
            r0 = -1
            goto L_0x005f
        L_0x002b:
            java.lang.String r0 = "borderStyle"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0034
            goto L_0x0029
        L_0x0034:
            r0 = 4
            goto L_0x005f
        L_0x0036:
            java.lang.String r0 = "borderLeftStyle"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x003f
            goto L_0x0029
        L_0x003f:
            r0 = 3
            goto L_0x005f
        L_0x0041:
            java.lang.String r1 = "borderBottomStyle"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L_0x005f
            goto L_0x0029
        L_0x004a:
            java.lang.String r0 = "borderTopStyle"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0053
            goto L_0x0029
        L_0x0053:
            r0 = 1
            goto L_0x005f
        L_0x0055:
            java.lang.String r0 = "borderRightStyle"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x005e
            goto L_0x0029
        L_0x005e:
            r0 = 0
        L_0x005f:
            switch(r0) {
                case 0: goto L_0x008b;
                case 1: goto L_0x0081;
                case 2: goto L_0x0077;
                case 3: goto L_0x006d;
                case 4: goto L_0x0063;
                default: goto L_0x0062;
            }
        L_0x0062:
            goto L_0x0094
        L_0x0063:
            com.taobao.weex.ui.view.border.BorderDrawable r7 = r6.getOrCreateBorder()
            com.taobao.weex.dom.CSSShorthand$EDGE r0 = com.taobao.weex.dom.CSSShorthand.EDGE.ALL
            r7.setBorderStyle(r0, r8)
            goto L_0x0094
        L_0x006d:
            com.taobao.weex.ui.view.border.BorderDrawable r7 = r6.getOrCreateBorder()
            com.taobao.weex.dom.CSSShorthand$EDGE r0 = com.taobao.weex.dom.CSSShorthand.EDGE.LEFT
            r7.setBorderStyle(r0, r8)
            goto L_0x0094
        L_0x0077:
            com.taobao.weex.ui.view.border.BorderDrawable r7 = r6.getOrCreateBorder()
            com.taobao.weex.dom.CSSShorthand$EDGE r0 = com.taobao.weex.dom.CSSShorthand.EDGE.BOTTOM
            r7.setBorderStyle(r0, r8)
            goto L_0x0094
        L_0x0081:
            com.taobao.weex.ui.view.border.BorderDrawable r7 = r6.getOrCreateBorder()
            com.taobao.weex.dom.CSSShorthand$EDGE r0 = com.taobao.weex.dom.CSSShorthand.EDGE.TOP
            r7.setBorderStyle(r0, r8)
            goto L_0x0094
        L_0x008b:
            com.taobao.weex.ui.view.border.BorderDrawable r7 = r6.getOrCreateBorder()
            com.taobao.weex.dom.CSSShorthand$EDGE r0 = com.taobao.weex.dom.CSSShorthand.EDGE.RIGHT
            r7.setBorderStyle(r0, r8)
        L_0x0094:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.weex.ui.component.WXComponent.setBorderStyle(java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
        if (r7.equals("borderBottomWidth") == false) goto L_0x002d;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setBorderWidth(java.lang.String r7, float r8) {
        /*
            r6 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            r3 = 3
            com.android.alibaba.ip.runtime.IpChange r4 = com.taobao.weex.ui.component.WXComponent.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x001d
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r8)
            java.lang.Object[] r8 = new java.lang.Object[r3]
            r8[r2] = r6
            r8[r1] = r7
            r8[r0] = r5
            java.lang.String r7 = "75a4a117"
            r4.ipc$dispatch(r7, r8)
            return
        L_0x001d:
            r4 = 0
            int r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r4 < 0) goto L_0x0098
            r7.hashCode()
            r4 = -1
            int r5 = r7.hashCode()
            switch(r5) {
                case -1971292586: goto L_0x0059;
                case -1452542531: goto L_0x004e;
                case -1290574193: goto L_0x0045;
                case -223992013: goto L_0x003a;
                case 741115130: goto L_0x002f;
                default: goto L_0x002d;
            }
        L_0x002d:
            r0 = -1
            goto L_0x0063
        L_0x002f:
            java.lang.String r0 = "borderWidth"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0038
            goto L_0x002d
        L_0x0038:
            r0 = 4
            goto L_0x0063
        L_0x003a:
            java.lang.String r0 = "borderLeftWidth"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0043
            goto L_0x002d
        L_0x0043:
            r0 = 3
            goto L_0x0063
        L_0x0045:
            java.lang.String r1 = "borderBottomWidth"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L_0x0063
            goto L_0x002d
        L_0x004e:
            java.lang.String r0 = "borderTopWidth"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0057
            goto L_0x002d
        L_0x0057:
            r0 = 1
            goto L_0x0063
        L_0x0059:
            java.lang.String r0 = "borderRightWidth"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0062
            goto L_0x002d
        L_0x0062:
            r0 = 0
        L_0x0063:
            switch(r0) {
                case 0: goto L_0x008f;
                case 1: goto L_0x0085;
                case 2: goto L_0x007b;
                case 3: goto L_0x0071;
                case 4: goto L_0x0067;
                default: goto L_0x0066;
            }
        L_0x0066:
            goto L_0x0098
        L_0x0067:
            com.taobao.weex.ui.view.border.BorderDrawable r7 = r6.getOrCreateBorder()
            com.taobao.weex.dom.CSSShorthand$EDGE r0 = com.taobao.weex.dom.CSSShorthand.EDGE.ALL
            r7.setBorderWidth(r0, r8)
            goto L_0x0098
        L_0x0071:
            com.taobao.weex.ui.view.border.BorderDrawable r7 = r6.getOrCreateBorder()
            com.taobao.weex.dom.CSSShorthand$EDGE r0 = com.taobao.weex.dom.CSSShorthand.EDGE.LEFT
            r7.setBorderWidth(r0, r8)
            goto L_0x0098
        L_0x007b:
            com.taobao.weex.ui.view.border.BorderDrawable r7 = r6.getOrCreateBorder()
            com.taobao.weex.dom.CSSShorthand$EDGE r0 = com.taobao.weex.dom.CSSShorthand.EDGE.BOTTOM
            r7.setBorderWidth(r0, r8)
            goto L_0x0098
        L_0x0085:
            com.taobao.weex.ui.view.border.BorderDrawable r7 = r6.getOrCreateBorder()
            com.taobao.weex.dom.CSSShorthand$EDGE r0 = com.taobao.weex.dom.CSSShorthand.EDGE.TOP
            r7.setBorderWidth(r0, r8)
            goto L_0x0098
        L_0x008f:
            com.taobao.weex.ui.view.border.BorderDrawable r7 = r6.getOrCreateBorder()
            com.taobao.weex.dom.CSSShorthand$EDGE r0 = com.taobao.weex.dom.CSSShorthand.EDGE.RIGHT
            r7.setBorderWidth(r0, r8)
        L_0x0098:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.weex.ui.component.WXComponent.setBorderWidth(java.lang.String, float):void");
    }

    public final void setContentBoxMeasurement(ContentBoxMeasurement contentBoxMeasurement) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86cf3b3e", new Object[]{this, contentBoxMeasurement});
            return;
        }
        this.contentBoxMeasurement = contentBoxMeasurement;
        this.mInstance.j(getRenderObjectPtr(), contentBoxMeasurement);
        if (WXSDKManager.getInstance().getWXBridgeManager() != null) {
            WXSDKManager.getInstance().getWXBridgeManager().bindMeasurementToRenderObject(getRenderObjectPtr());
        }
    }

    public void setDemission(GraphicSize graphicSize, GraphicPosition graphicPosition) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92666be8", new Object[]{this, graphicSize, graphicPosition});
            return;
        }
        setLayoutPosition(graphicPosition);
        setLayoutSize(graphicSize);
    }

    public void setDisabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3718d4ef", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mIsDisabled = z;
        T t = this.mHost;
        if (t != null) {
            t.setEnabled(!z);
        }
    }

    public void setHostLayoutParams(T t, int i, int i2, int i3, int i4, int i5, int i6) {
        FrameLayout.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f903871", new Object[]{this, t, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
            return;
        }
        if (this.mParent == null) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i, i2);
            setMarginsSupportRTL(layoutParams2, i3, i5, i4, i6);
            layoutParams = layoutParams2;
        } else {
            layoutParams = this.mParent.getChildLayoutParams(this, t, i, i2, i3, i4, i5, i6);
        }
        if (layoutParams != null) {
            t.setLayoutParams(layoutParams);
        }
    }

    public void setLayout(WXComponent wXComponent) {
        boolean z;
        CSSShorthand cSSShorthand;
        CSSShorthand cSSShorthand2;
        int i;
        int i2;
        float f;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf0915d8", new Object[]{this, wXComponent});
            return;
        }
        setLayoutSize(wXComponent.getLayoutSize());
        setLayoutPosition(wXComponent.getLayoutPosition());
        setPaddings(wXComponent.getPadding());
        setMargins(wXComponent.getMargin());
        setBorders(wXComponent.getBorder());
        boolean isLayoutRTL = wXComponent.isLayoutRTL();
        setIsLayoutRTL(isLayoutRTL);
        if (isLayoutRTL != wXComponent.isLastLayoutDirectionRTL) {
            wXComponent.isLastLayoutDirectionRTL = isLayoutRTL;
            layoutDirectionDidChanged(isLayoutRTL);
        }
        parseAnimation();
        if (this.mParent == null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            i3 = this.mParent.getChildrenLayoutTopOffset();
        }
        if (z) {
            cSSShorthand = new CSSShorthand();
        } else {
            cSSShorthand = this.mParent.getPadding();
        }
        if (z) {
            cSSShorthand2 = new CSSShorthand();
        } else {
            cSSShorthand2 = this.mParent.getBorder();
        }
        int width = (int) getLayoutSize().getWidth();
        int height = (int) getLayoutSize().getHeight();
        if (isFixed()) {
            i2 = (int) (getLayoutPosition().getLeft() - getInstance().getRenderContainerPaddingLeft());
            i = ((int) (getLayoutPosition().getTop() - getInstance().getRenderContainerPaddingTop())) + i3;
        } else {
            float left = getLayoutPosition().getLeft();
            CSSShorthand.EDGE edge = CSSShorthand.EDGE.LEFT;
            float top = getLayoutPosition().getTop();
            CSSShorthand.EDGE edge2 = CSSShorthand.EDGE.TOP;
            i = ((int) ((top - cSSShorthand.get(edge2)) - cSSShorthand2.get(edge2))) + i3;
            i2 = (int) ((left - cSSShorthand.get(edge)) - cSSShorthand2.get(edge));
        }
        int i4 = (int) getMargin().get(CSSShorthand.EDGE.RIGHT);
        int i5 = (int) getMargin().get(CSSShorthand.EDGE.BOTTOM);
        Point point = new Point((int) getLayoutPosition().getLeft(), (int) getLayoutPosition().getTop());
        if (this.mPreRealWidth != width || this.mPreRealHeight != height || this.mPreRealLeft != i2 || this.mPreRealRight != i4 || this.mPreRealTop != i) {
            float f2 = 0.0f;
            if (z) {
                f = 0.0f;
            } else {
                f = this.mParent.getAbsoluteY() + getCSSLayoutTop();
            }
            this.mAbsoluteY = (int) f;
            if (!z) {
                f2 = getCSSLayoutLeft() + this.mParent.getAbsoluteX();
            }
            this.mAbsoluteX = (int) f2;
            T t = this.mHost;
            if (t != null) {
                if (!(t instanceof ViewGroup) && this.mAbsoluteY + height > this.mInstance.getWeexHeight() + 1) {
                    WXSDKInstance wXSDKInstance = this.mInstance;
                    if (!wXSDKInstance.i) {
                        wXSDKInstance.z0();
                    }
                    WXSDKInstance wXSDKInstance2 = this.mInstance;
                    if (!wXSDKInstance2.v) {
                        wXSDKInstance2.v = true;
                        wXSDKInstance2.E().j();
                    }
                }
                MeasureOutput measure = measure(width, height);
                setComponentLayoutParams(measure.width, measure.height, i2, i, i4, i5, point);
            }
        }
    }

    public void setMarginsSupportRTL(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc69622a", new Object[]{this, marginLayoutParams, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        marginLayoutParams.setMargins(i, i2, i3, i4);
        if (marginLayoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) marginLayoutParams).gravity = 51;
        }
    }

    public void setNeedLayoutOnAnimation(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e814b6a", new Object[]{this, new Boolean(z)});
        } else {
            this.mNeedLayoutOnAnimation = z;
        }
    }

    public void setOpacity(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c5f5870", new Object[]{this, new Float(f)});
        } else if (f >= 0.0f && f <= 1.0f && this.mHost.getAlpha() != f) {
            int openGLRenderLimitValue = WXRenderManager.getOpenGLRenderLimitValue();
            if (isLayerTypeEnabled()) {
                this.mHost.setLayerType(2, null);
            }
            if (isLayerTypeEnabled() && shouldCancelHardwareAccelerate() && openGLRenderLimitValue > 0) {
                float f2 = openGLRenderLimitValue;
                if (getLayoutHeight() > f2 || getLayoutWidth() > f2) {
                    this.mHost.setLayerType(0, null);
                }
            }
            this.mHost.setAlpha(f);
        }
    }

    public void setPadding(CSSShorthand cSSShorthand, CSSShorthand cSSShorthand2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b15f5d94", new Object[]{this, cSSShorthand, cSSShorthand2});
            return;
        }
        CSSShorthand.EDGE edge = CSSShorthand.EDGE.LEFT;
        int i = (int) (cSSShorthand.get(edge) + cSSShorthand2.get(edge));
        CSSShorthand.EDGE edge2 = CSSShorthand.EDGE.TOP;
        int i2 = (int) (cSSShorthand.get(edge2) + cSSShorthand2.get(edge2));
        CSSShorthand.EDGE edge3 = CSSShorthand.EDGE.RIGHT;
        int i3 = (int) (cSSShorthand.get(edge3) + cSSShorthand2.get(edge3));
        CSSShorthand.EDGE edge4 = CSSShorthand.EDGE.BOTTOM;
        int i4 = (int) (cSSShorthand.get(edge4) + cSSShorthand2.get(edge4));
        if (this instanceof FlatComponent) {
            FlatComponent flatComponent = (FlatComponent) this;
            if (!flatComponent.promoteToView(true)) {
                flatComponent.getOrCreateFlatWidget().setContentBox(i, i2, i3, i4);
                return;
            }
        }
        T t = this.mHost;
        if (t != null) {
            t.setPadding(i, i2, i3, i4);
        }
    }

    public void setPseudoClassStatus(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e8aa879", new Object[]{this, str, new Boolean(z)});
            return;
        }
        WXStyle styles = getStyles();
        Map<String, Map<String, Object>> pesudoStyles = styles.getPesudoStyles();
        if (pesudoStyles != null && pesudoStyles.size() != 0) {
            if (this.mPesudoStatus == null) {
                this.mPesudoStatus = new PesudoStatus();
            }
            Map<String, Object> updateStatusAndGetUpdateStyles = this.mPesudoStatus.updateStatusAndGetUpdateStyles(str, z, pesudoStyles, styles.getPesudoResetStyles());
            if (updateStatusAndGetUpdateStyles != null) {
                if (z) {
                    this.mPseudoResetGraphicSize = new GraphicSize(getLayoutSize().getWidth(), getLayoutSize().getHeight());
                    if (updateStatusAndGetUpdateStyles.keySet().contains("width")) {
                        getLayoutSize().setWidth(WXViewInnerUtils.getRealPxByWidth(getInstance(), WXUtils.parseFloat(styles.getPesudoResetStyles().get("width:active")), getViewPortWidth()));
                    } else if (updateStatusAndGetUpdateStyles.keySet().contains("height")) {
                        getLayoutSize().setHeight(WXViewInnerUtils.getRealPxByWidth(getInstance(), WXUtils.parseFloat(styles.getPesudoResetStyles().get("height:active")), getViewPortWidth()));
                    }
                } else {
                    GraphicSize graphicSize = this.mPseudoResetGraphicSize;
                    if (graphicSize != null) {
                        setLayoutSize(graphicSize);
                    }
                }
            }
            updateStyleByPesudo(updateStatusAndGetUpdateStyles);
        }
    }

    public void setRole(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfba2089", new Object[]{this, str});
            return;
        }
        T hostView = getHostView();
        if (hostView != null && !TextUtils.isEmpty(str)) {
            IWXAccessibilityRoleAdapter accessibilityRoleAdapter = WXSDKManager.getInstance().getAccessibilityRoleAdapter();
            if (accessibilityRoleAdapter != null) {
                str = accessibilityRoleAdapter.getRole(str);
            }
            ViewCompat.setAccessibilityDelegate(hostView, new AccessibilityDelegateCompat() { // from class: com.taobao.weex.ui.component.WXComponent.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass5 r2, String str2, Object... objArr) {
                    if (str2.hashCode() == -672710132) {
                        super.onInitializeAccessibilityNodeInfo((View) objArr[0], (AccessibilityNodeInfoCompat) objArr[1]);
                        return null;
                    }
                    int hashCode = str2.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/taobao/weex/ui/component/WXComponent$5");
                }

                @Override // androidx.core.view.AccessibilityDelegateCompat
                public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d7e7420c", new Object[]{this, view, accessibilityNodeInfoCompat});
                        return;
                    }
                    try {
                        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                        accessibilityNodeInfoCompat.setRoleDescription(str);
                    } catch (Throwable unused) {
                        WXLogUtils.e("SetRole failed!");
                    }
                }
            });
        }
    }

    public void setSafeLayout(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41ac3c05", new Object[]{this, wXComponent});
        } else if (!TextUtils.isEmpty(wXComponent.getComponentType()) && !TextUtils.isEmpty(wXComponent.getRef()) && wXComponent.getLayoutPosition() != null && wXComponent.getLayoutSize() != null) {
            setLayout(wXComponent);
        }
    }

    public void setSticky(String str) {
        Scrollable parentScroller;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b2a713c", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str) && str.equals("sticky") && (parentScroller = getParentScroller()) != null) {
            parentScroller.bindStickStyle(this);
        }
    }

    public void setStickyOffset(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d554ecbe", new Object[]{this, new Integer(i)});
        } else {
            this.mStickyOffset = i;
        }
    }

    public void setTransition(WXTransition wXTransition) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c72f08bb", new Object[]{this, wXTransition});
        } else {
            this.mTransition = wXTransition;
        }
    }

    public void setUseAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("862f1846", new Object[]{this});
        } else {
            this.useAnimations = true;
        }
    }

    public void setUsing(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("655b5b2b", new Object[]{this, new Boolean(z)});
        } else {
            this.isUsing = z;
        }
    }

    @Override // com.taobao.weex.ui.component.pesudo.OnActivePseudoListner
    public void updateActivePseudo(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4be5f80", new Object[]{this, new Boolean(z)});
        } else {
            setPseudoClassStatus(Constants.PSEUDO.ACTIVE, z);
        }
    }

    public void updateAttrs(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da5f8e45", new Object[]{this, wXComponent});
        } else if (wXComponent != null) {
            updateProperties(wXComponent.getAttrs());
        }
    }

    public void updateDemission(float f, float f2, float f3, float f4, float f5, float f6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2501f3e9", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4), new Float(f5), new Float(f6)});
            return;
        }
        getLayoutPosition().update(f, f2, f3, f4);
        getLayoutSize().update(f6, f5);
    }

    public void updateNativeAttr(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2e5cb7e", new Object[]{this, str, obj});
        } else if (str != null) {
            if (obj == null) {
                obj = "";
            }
            getBasicComponentData().getAttrs().put(str, obj);
            NativeRenderObjectUtils.nativeUpdateRenderObjectAttr(getRenderObjectPtr(), str, obj.toString());
        }
    }

    public void updateNativeStyle(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77853e7e", new Object[]{this, str, obj});
        } else if (str != null) {
            if (obj == null) {
                obj = "";
            }
            getBasicComponentData().getStyles().put(str, obj);
            NativeRenderObjectUtils.nativeUpdateRenderObjectStyle(getRenderObjectPtr(), str, obj.toString());
        }
    }

    public void updateNativeStyles(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac75ed9c", new Object[]{this, map});
            return;
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                updateNativeStyle(entry.getKey(), entry.getValue());
            }
        }
    }

    public void updateStyles(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae1d5877", new Object[]{this, wXComponent});
        } else if (wXComponent != null) {
            updateProperties(wXComponent.getStyles());
            applyBorder(wXComponent);
        }
    }

    public boolean useAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a5a1bc8", new Object[]{this})).booleanValue();
        }
        return this.useAnimations;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class OnClickListenerImp implements OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(985661696);
            t2o.a(985661695);
        }

        private OnClickListenerImp() {
        }

        @Override // com.taobao.weex.ui.component.WXComponent.OnClickListener
        public void onHostViewClick() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6e23cc03", new Object[]{this});
                return;
            }
            HashMap newHashMapWithExpectedSize = WXDataStructureUtil.newHashMapWithExpectedSize(1);
            HashMap newHashMapWithExpectedSize2 = WXDataStructureUtil.newHashMapWithExpectedSize(4);
            int[] iArr = new int[2];
            WXComponent.this.mHost.getLocationOnScreen(iArr);
            newHashMapWithExpectedSize2.put("x", Float.valueOf(WXViewInnerUtils.getWebPxByWidth(WXComponent.access$100(WXComponent.this), iArr[0], WXComponent.access$100(WXComponent.this).P())));
            newHashMapWithExpectedSize2.put("y", Float.valueOf(WXViewInnerUtils.getWebPxByWidth(WXComponent.access$100(WXComponent.this), iArr[1], WXComponent.access$100(WXComponent.this).P())));
            newHashMapWithExpectedSize2.put("width", Float.valueOf(WXViewInnerUtils.getWebPxByWidth(WXComponent.access$100(WXComponent.this), WXComponent.this.getLayoutWidth(), WXComponent.access$100(WXComponent.this).P())));
            newHashMapWithExpectedSize2.put("height", Float.valueOf(WXViewInnerUtils.getWebPxByWidth(WXComponent.access$100(WXComponent.this), WXComponent.this.getLayoutHeight(), WXComponent.access$100(WXComponent.this).P())));
            newHashMapWithExpectedSize.put("position", newHashMapWithExpectedSize2);
            WXComponent.this.fireEvent("click", newHashMapWithExpectedSize);
        }
    }

    @Deprecated
    public WXComponent(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, boolean z, BasicComponentData basicComponentData) {
        this(wXSDKInstance, wXVContainer, basicComponentData);
    }

    private boolean checkUseAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0a734f0", new Object[]{this})).booleanValue();
        }
        IWXConfigAdapter wxConfigAdapter = WXSDKManager.getInstance().getWxConfigAdapter();
        if (wxConfigAdapter != null) {
            return true ^ "false".equals(wxConfigAdapter.getConfig("android_weex_common_config", "checkAnimationWhenRecycle", "true"));
        }
        return true;
    }

    private void recordInteraction(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7e93768", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.mIsAddElementToTree) {
            this.mIsAddElementToTree = false;
            if (this.mParent == null) {
                this.interactionAbsoluteX = 0;
                this.interactionAbsoluteY = 0;
            } else {
                float cSSLayoutTop = getCSSLayoutTop();
                float cSSLayoutLeft = getCSSLayoutLeft();
                this.interactionAbsoluteX = (int) (isFixed() ? cSSLayoutLeft : this.mParent.interactionAbsoluteX + this.mParent.mChildrensWidth + cSSLayoutLeft);
                if (!isFixed()) {
                    cSSLayoutTop += this.mParent.interactionAbsoluteY;
                }
                this.interactionAbsoluteY = (int) cSSLayoutTop;
                if ((WXBasicComponentType.SLIDER.equalsIgnoreCase(this.mParent.getComponentType()) || WXBasicComponentType.CYCLE_SLIDER.equalsIgnoreCase(this.mParent.getComponentType())) && !WXBasicComponentType.INDICATOR.equalsIgnoreCase(getComponentType())) {
                    this.mParent.mChildrensWidth += (int) (i + cSSLayoutLeft);
                }
            }
            if (getInstance().E().l == null) {
                getInstance().E().l = new Rect();
            }
            Rect rect = getInstance().E().l;
            rect.set(0, 0, this.mInstance.getWeexWidth(), this.mInstance.getWeexHeight());
            if (!rect.contains(this.interactionAbsoluteX, this.interactionAbsoluteY) && !rect.contains(this.interactionAbsoluteX + i, this.interactionAbsoluteY) && !rect.contains(this.interactionAbsoluteX, this.interactionAbsoluteY + i2)) {
                rect.contains(this.interactionAbsoluteX + i, this.interactionAbsoluteY + i2);
            }
        }
    }

    private void setFixedSize(String str) {
        ViewGroup.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99be3da4", new Object[]{this, str});
            return;
        }
        if ("m".equals(str)) {
            this.mFixedProp = -1;
        } else if ("w".equals(str)) {
            this.mFixedProp = -2;
        } else {
            this.mFixedProp = 0;
            return;
        }
        T t = this.mHost;
        if (t != null && (layoutParams = t.getLayoutParams()) != null) {
            int i = this.mFixedProp;
            layoutParams.height = i;
            layoutParams.width = i;
            this.mHost.setLayoutParams(layoutParams);
        }
    }

    private boolean shouldCancelHardwareAccelerate() {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e22e575d", new Object[]{this})).booleanValue();
        }
        IWXConfigAdapter wxConfigAdapter = WXSDKManager.getInstance().getWxConfigAdapter();
        if (wxConfigAdapter != null) {
            try {
                z = Boolean.parseBoolean(wxConfigAdapter.getConfig("android_weex_test_gpu", "cancel_hardware_accelerate", "true"));
            } catch (Exception e) {
                WXLogUtils.e(WXLogUtils.getStackTrace(e));
            }
            WXLogUtils.i("cancel_hardware_accelerate : " + z);
        }
        return z;
    }

    public void addEvent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a85d704a", new Object[]{this, str});
            return;
        }
        if (this.mAppendEvents == null) {
            this.mAppendEvents = new HashSet();
        }
        if (!TextUtils.isEmpty(str) && !this.mAppendEvents.contains(str)) {
            View realView = getRealView();
            if (str.equals(Constants.Event.LAYEROVERFLOW)) {
                addLayerOverFlowListener(getRef());
            }
            if (str.equals("click")) {
                if (realView != null) {
                    if (this.mClickEventListener == null) {
                        this.mClickEventListener = new OnClickListenerImp();
                    }
                    addClickListener(this.mClickEventListener);
                } else {
                    return;
                }
            } else if (str.equals(Constants.Event.FOCUS) || str.equals(Constants.Event.BLUR)) {
                if (!this.mHasAddFocusListener) {
                    this.mHasAddFocusListener = true;
                    addFocusChangeListener(new OnFocusChangeListener() { // from class: com.taobao.weex.ui.component.WXComponent.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.weex.ui.component.WXComponent.OnFocusChangeListener
                        public void onFocusChange(boolean z) {
                            String str2;
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("55af8984", new Object[]{this, new Boolean(z)});
                                return;
                            }
                            HashMap hashMap = new HashMap();
                            hashMap.put("timeStamp", Long.valueOf(System.currentTimeMillis()));
                            WXComponent wXComponent = WXComponent.this;
                            if (z) {
                                str2 = Constants.Event.FOCUS;
                            } else {
                                str2 = Constants.Event.BLUR;
                            }
                            wXComponent.fireEvent(str2, hashMap);
                        }
                    });
                }
            } else if (!needGestureDetector(str)) {
                Scrollable parentScroller = getParentScroller();
                if (parentScroller != null) {
                    if (str.equals("appear")) {
                        parentScroller.bindAppearEvent(this);
                    } else if (str.equals("disappear")) {
                        parentScroller.bindDisappearEvent(this);
                    }
                } else {
                    return;
                }
            } else if (realView != null) {
                if (realView instanceof WXGestureObservable) {
                    if (this.mGesture == null) {
                        this.mGesture = new WXGesture(this, this.mContext);
                        this.mGesture.setPreventMoveEvent(WXUtils.getBoolean(getAttrs().get(Constants.Name.PREVENT_MOVE_EVENT), Boolean.FALSE).booleanValue());
                    }
                    if (this.mGestureType == null) {
                        this.mGestureType = new HashSet();
                    }
                    this.mGestureType.add(str);
                    ((WXGestureObservable) realView).registerGestureListener(this.mGesture);
                } else {
                    WXLogUtils.e(realView.getClass().getSimpleName().concat(" don't implement WXGestureObservable, so no gesture is supported."));
                }
            } else {
                return;
            }
            this.mAppendEvents.add(str);
        }
    }

    public final void fireEvent(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78684150", new Object[]{this, str, map});
        } else if (WXUtils.getBoolean(getAttrs().get("fireEventSyn"), Boolean.FALSE).booleanValue()) {
            fireEventWait(str, map);
        } else {
            fireEvent(str, map, null, null);
        }
    }

    public boolean isRippleEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db70a6f2", new Object[]{this})).booleanValue();
        }
        try {
            return WXUtils.getBoolean(getAttrs().get(Constants.Name.RIPPLE_ENABLED), Boolean.FALSE).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public void onFinishLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cafc9ba3", new Object[]{this});
            return;
        }
        Object obj = getStyles() != null ? getStyles().get("backgroundImage") : null;
        if (obj != null) {
            setBackgroundImage(obj.toString());
        }
        if (getEvents().contains(Constants.Event.RENDERED) && !this.hasRendered) {
            HashMap hashMap = new HashMap();
            hashMap.put("renderTimestamp", Long.valueOf(System.currentTimeMillis()));
            fireEvent(Constants.Event.RENDERED, hashMap);
        }
        this.hasRendered = true;
    }

    public void setVisibility(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b471dca5", new Object[]{this, str});
            return;
        }
        View realView = getRealView();
        if (realView == null) {
            return;
        }
        if (TextUtils.equals(str, "visible")) {
            realView.setVisibility(0);
        } else if (TextUtils.equals(str, "hidden")) {
            realView.setVisibility(8);
        }
    }

    public void updateAttrs(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7fc6e25", new Object[]{this, map});
        } else if (map != null) {
            updateProperties(map);
        }
    }

    public WXComponent(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, BasicComponentData basicComponentData) {
        this(wXSDKInstance, wXVContainer, 0, basicComponentData);
    }

    public void setWaste(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29e5e255", new Object[]{this, new Boolean(z)});
        } else if (this.waste != z) {
            this.waste = z;
            if (!WXBasicComponentType.RECYCLE_LIST.equals(getParent().getComponentType())) {
                NativeRenderObjectUtils.nativeRenderObjectChildWaste(getRenderObjectPtr(), z);
            }
            if (z) {
                getStyles().put("visibility", (Object) "hidden");
                if (getHostView() != null) {
                    getHostView().setVisibility(8);
                } else if (!this.mLazy) {
                    lazy(true);
                }
            } else {
                getStyles().put("visibility", (Object) "visible");
                if (getHostView() != null) {
                    getHostView().setVisibility(0);
                } else if (!this.mLazy) {
                } else {
                    if (this.mParent == null || !this.mParent.isLazy()) {
                        initLazyComponent(this, this.mParent);
                    } else {
                        lazy(false);
                    }
                }
            }
        }
    }

    @Deprecated
    public void updateProperties(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d573d7c2", new Object[]{this, map});
        } else if (map != null) {
            if (this.mHost != null || isVirtualComponent()) {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    String key = entry.getKey();
                    String string = WXUtils.getString(key, null);
                    if (string != null && !(key instanceof String)) {
                        HashMap hashMap = new HashMap();
                        hashMap.put(OpenSimplePopupSubscriber.KEY_COMPONENT_TYPE, getComponentType());
                        hashMap.put("actual key", string);
                        String instanceId = getInstanceId();
                        WXErrorCode wXErrorCode = WXErrorCode.WX_RENDER_ERR_COMPONENT_ATTR_KEY;
                        WXExceptionUtils.commitCriticalExceptionRT(instanceId, wXErrorCode, "WXComponent.updateProperties", wXErrorCode.getErrorMsg(), hashMap);
                    }
                    Object value = entry.getValue();
                    String string2 = WXUtils.getString(value, null);
                    if (string == null) {
                        String instanceId2 = getInstanceId();
                        WXErrorCode wXErrorCode2 = WXErrorCode.WX_RENDER_ERR_NULL_KEY;
                        WXExceptionUtils.commitCriticalExceptionRT(instanceId2, wXErrorCode2, "updateProperties", wXErrorCode2.getErrorMsg(), null);
                    } else {
                        if (TextUtils.isEmpty(string2)) {
                            value = convertEmptyProperty(string, string2);
                        }
                        if (setProperty(string, value)) {
                            continue;
                        } else {
                            IFComponentHolder iFComponentHolder = this.mHolder;
                            if (iFComponentHolder != null) {
                                Invoker propertyInvoker = iFComponentHolder.getPropertyInvoker(string);
                                if (propertyInvoker != null) {
                                    try {
                                        Type[] parameterTypes = propertyInvoker.getParameterTypes();
                                        if (parameterTypes.length != 1) {
                                            WXLogUtils.e("[WXComponent] setX method only one parameter：" + propertyInvoker);
                                            return;
                                        }
                                        propertyInvoker.invoke(this, WXReflectionUtils.parseArgument(parameterTypes[0], value));
                                    } catch (Exception e) {
                                        WXLogUtils.e("[WXComponent] updateProperties :class:" + getClass() + "method:" + propertyInvoker.toString() + " function " + WXLogUtils.getStackTrace(e));
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                return;
                            }
                        }
                    }
                }
                readyToRender();
                if ((this instanceof FlatComponent) && this.mBackgroundDrawable != null) {
                    FlatComponent flatComponent = (FlatComponent) this;
                    if (!(flatComponent.promoteToView(true) || (flatComponent.getOrCreateFlatWidget() instanceof AndroidViewWidget))) {
                        flatComponent.getOrCreateFlatWidget().setBackgroundAndBorder(this.mBackgroundDrawable);
                    }
                }
            }
        }
    }

    public void updateStyles(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a06eb33", new Object[]{this, map});
        } else if (map != null) {
            updateProperties(map);
            applyBorder(this);
        }
    }

    public WXComponent(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, int i, BasicComponentData basicComponentData) {
        super(basicComponentData);
        this.mFixedProp = 0;
        this.mAbsoluteY = 0;
        this.mAbsoluteX = 0;
        this.isLastLayoutDirectionRTL = false;
        this.mPreRealWidth = 0;
        this.mPreRealHeight = 0;
        this.mPreRealLeft = 0;
        this.mPreRealRight = 0;
        this.mPreRealTop = 0;
        this.mStickyOffset = 0;
        this.isUsing = false;
        this.mIsDestroyed = false;
        this.mIsDisabled = false;
        this.mType = 0;
        this.mNeedLayoutOnAnimation = false;
        this.mDeepInComponentTree = 0;
        this.mIsAddElementToTree = false;
        this.interactionAbsoluteX = 0;
        this.interactionAbsoluteY = 0;
        this.mChildrensWidth = 0;
        this.mHasAddFocusListener = false;
        this.waste = false;
        this.isIgnoreInteraction = false;
        this.hasRendered = false;
        this.useAnimations = false;
        this.mLazy = false;
        this.mInstance = wXSDKInstance;
        this.mContext = wXSDKInstance.getContext();
        this.mParent = wXVContainer;
        this.mType = i;
        setViewPortWidth(wXSDKInstance.P());
        onCreate();
        rc4 F = getInstance().F();
        if (F != null) {
            F.onCreate(this);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ce, code lost:
        if (r7.equals("borderTopColor") == false) goto L_0x0024;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object convertEmptyProperty(java.lang.String r7, java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.weex.ui.component.WXComponent.convertEmptyProperty(java.lang.String, java.lang.Object):java.lang.Object");
    }

    public final void fireEvent(String str, Map<String, Object> map, Map<String, Object> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69d4d035", new Object[]{this, str, map, map2});
        } else {
            fireEvent(str, map, map2, null);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0358, code lost:
        if (r9.equals("borderRightWidth") == false) goto L_0x002d;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean setProperty(java.lang.String r9, java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 1456
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.weex.ui.component.WXComponent.setProperty(java.lang.String, java.lang.Object):boolean");
    }

    public void updateBoxShadow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a62a8b89", new Object[]{this});
        } else if (BoxShadowUtil.isBoxShadowEnabled()) {
            if (getStyles() != null) {
                Object obj = getStyles().get("boxShadow");
                Object obj2 = getAttrs().get(Constants.Name.SHADOW_QUALITY);
                if (obj != null) {
                    View view = this.mHost;
                    if (this instanceof WXVContainer) {
                        view = ((WXVContainer) this).getBoxShadowHost(false);
                    }
                    if (view != null) {
                        float floatValue = WXUtils.getFloat(obj2, Float.valueOf(0.5f)).floatValue();
                        int P = getInstance().P();
                        String str = obj.toString() + " / [" + view.getMeasuredWidth() + "," + view.getMeasuredHeight() + "] / " + floatValue;
                        String str2 = this.mLastBoxShadowId;
                        if (str2 == null || !str2.equals(str)) {
                            float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
                            WXStyle styles = getStyles();
                            if (styles != null) {
                                float floatValue2 = WXUtils.getFloat(styles.get("borderTopLeftRadius"), Float.valueOf(0.0f)).floatValue();
                                fArr[0] = floatValue2;
                                fArr[1] = floatValue2;
                                float floatValue3 = WXUtils.getFloat(styles.get("borderTopRightRadius"), Float.valueOf(0.0f)).floatValue();
                                fArr[2] = floatValue3;
                                fArr[3] = floatValue3;
                                float floatValue4 = WXUtils.getFloat(styles.get("borderBottomRightRadius"), Float.valueOf(0.0f)).floatValue();
                                fArr[4] = floatValue4;
                                fArr[5] = floatValue4;
                                float floatValue5 = WXUtils.getFloat(styles.get("borderBottomLeftRadius"), Float.valueOf(0.0f)).floatValue();
                                fArr[6] = floatValue5;
                                fArr[7] = floatValue5;
                                if (styles.containsKey("borderRadius")) {
                                    float floatValue6 = WXUtils.getFloat(styles.get("borderRadius"), Float.valueOf(0.0f)).floatValue();
                                    for (int i = 0; i < 8; i++) {
                                        fArr[i] = floatValue6;
                                    }
                                }
                            }
                            BoxShadowUtil.setBoxShadow(getInstance(), view, obj.toString(), fArr, P, floatValue);
                            this.mLastBoxShadowId = str;
                            return;
                        }
                        WXLogUtils.d("BoxShadow", "box-shadow style was not modified. " + str);
                        return;
                    }
                    return;
                }
                return;
            }
            WXLogUtils.w("Can not resolve styles");
        }
    }

    private final void fireEvent(String str, Map<String, Object> map, Map<String, Object> map2, EventResult eventResult) {
        String componentId;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49966678", new Object[]{this, str, map, map2, eventResult});
        } else if (this.mInstance != null) {
            List<Object> list = (getEvents() == null || getEvents().getEventBindingArgsValues() == null) ? null : getEvents().getEventBindingArgsValues().get(str);
            if (!(map == null || (componentId = getComponentId()) == null)) {
                map.put("componentId", componentId);
            }
            this.mInstance.fireEvent(getRef(), str, map, map2, list, eventResult);
        }
    }
}
