package com.taobao.weex.dom.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.collection.ArrayMap;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.common.Constants;
import com.taobao.weex.dom.CSSShorthand;
import com.taobao.weex.ui.animation.BackgroundColorProperty;
import com.taobao.weex.ui.animation.TransformParser;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.utils.SingleFunctionParser;
import com.taobao.weex.utils.WXLogUtils;
import com.taobao.weex.utils.WXResourceUtils;
import com.taobao.weex.utils.WXUtils;
import com.taobao.weex.utils.WXViewInnerUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class WXTransition {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final Set<String> LAYOUT_PROPERTIES;
    public static final Pattern PROPERTY_SPLIT_PATTERN = Pattern.compile("\\||,");
    private static final Set<String> TRANSFORM_PROPERTIES;
    public static final String TRANSITION_DELAY = "transitionDelay";
    public static final String TRANSITION_DURATION = "transitionDuration";
    public static final String TRANSITION_PROPERTY = "transitionProperty";
    public static final String TRANSITION_TIMING_FUNCTION = "transitionTimingFunction";
    private Runnable animationRunnable;
    private long delay;
    private long duration;
    private Interpolator interpolator;
    private ValueAnimator layoutValueAnimator;
    private WXComponent mWXComponent;
    private Runnable transformAnimationRunnable;
    private ObjectAnimator transformAnimator;
    private Runnable transitionEndEvent;
    private volatile AtomicInteger lockToken = new AtomicInteger(0);
    private List<String> properties = new ArrayList(4);
    private Handler handler = new Handler();
    private Map<String, Object> layoutPendingUpdates = new ArrayMap();
    private Map<String, Object> transformPendingUpdates = new ArrayMap();
    private Map<String, Object> targetStyles = new ArrayMap();

    public static /* synthetic */ AtomicInteger access$000(WXTransition wXTransition) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicInteger) ipChange.ipc$dispatch("2ab13aac", new Object[]{wXTransition});
        }
        return wXTransition.lockToken;
    }

    public static /* synthetic */ void access$100(WXTransition wXTransition, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2594282", new Object[]{wXTransition, new Integer(i)});
        } else {
            wXTransition.doTransitionAnimation(i);
        }
    }

    public static /* synthetic */ Runnable access$202(WXTransition wXTransition, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("48c94958", new Object[]{wXTransition, runnable});
        }
        wXTransition.animationRunnable = runnable;
        return runnable;
    }

    public static /* synthetic */ Runnable access$302(WXTransition wXTransition, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("ef3d219", new Object[]{wXTransition, runnable});
        }
        wXTransition.transitionEndEvent = runnable;
        return runnable;
    }

    public static /* synthetic */ long access$400(WXTransition wXTransition) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fb2993b2", new Object[]{wXTransition})).longValue();
        }
        return wXTransition.duration;
    }

    public static /* synthetic */ WXComponent access$500(WXTransition wXTransition) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXComponent) ipChange.ipc$dispatch("579077fe", new Object[]{wXTransition});
        }
        return wXTransition.mWXComponent;
    }

    public static /* synthetic */ void access$600(WXTransition wXTransition, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("847eba07", new Object[]{wXTransition, new Integer(i)});
        } else {
            wXTransition.doPendingTransformAnimation(i);
        }
    }

    public static /* synthetic */ void access$700(WXTransition wXTransition) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84b362db", new Object[]{wXTransition});
        } else {
            wXTransition.onTransitionAnimationEnd();
        }
    }

    public static void asynchronouslyUpdateLayout(WXComponent wXComponent, final String str, final float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90276642", new Object[]{wXComponent, str, new Float(f)});
        } else if (wXComponent != null) {
            final String ref = wXComponent.getRef();
            final String instanceId = wXComponent.getInstanceId();
            if (!TextUtils.isEmpty(ref) && !TextUtils.isEmpty(instanceId)) {
                WXSDKManager.getInstance().getWXBridgeManager().post(new Runnable() { // from class: com.taobao.weex.dom.transition.WXTransition.7
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Code restructure failed: missing block: B:51:0x00dc, code lost:
                        if (r3.equals("paddingLeft") == false) goto L_0x0029;
                     */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public void run() {
                        /*
                            Method dump skipped, instructions count: 488
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.taobao.weex.dom.transition.WXTransition.AnonymousClass7.run():void");
                    }
                });
            }
        }
    }

    private void doLayoutPropertyValuesHolderAnimation(PropertyValuesHolder[] propertyValuesHolderArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e546cc3", new Object[]{this, propertyValuesHolderArr});
            return;
        }
        ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(propertyValuesHolderArr);
        this.layoutValueAnimator = ofPropertyValuesHolder;
        ofPropertyValuesHolder.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.weex.dom.transition.WXTransition.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                for (PropertyValuesHolder propertyValuesHolder : valueAnimator.getValues()) {
                    String propertyName = propertyValuesHolder.getPropertyName();
                    WXTransition.asynchronouslyUpdateLayout(WXTransition.access$500(WXTransition.this), propertyName, ((Float) valueAnimator.getAnimatedValue(propertyName)).floatValue());
                }
            }
        });
        this.layoutValueAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.taobao.weex.dom.transition.WXTransition.6
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public boolean hasCancel = false;

            public static /* synthetic */ Object ipc$super(AnonymousClass6 r4, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == -2145066406) {
                    super.onAnimationEnd((Animator) objArr[0]);
                    return null;
                } else if (hashCode == -1868320925) {
                    super.onAnimationCancel((Animator) objArr[0]);
                    return null;
                } else {
                    int hashCode2 = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/weex/dom/transition/WXTransition$6");
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                    return;
                }
                super.onAnimationCancel(animator);
                this.hasCancel = true;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                } else if (!this.hasCancel) {
                    super.onAnimationEnd(animator);
                    WXTransition.access$700(WXTransition.this);
                }
            }
        });
        Interpolator interpolator = this.interpolator;
        if (interpolator != null) {
            this.layoutValueAnimator.setInterpolator(interpolator);
        }
        this.layoutValueAnimator.setStartDelay(this.delay);
        this.layoutValueAnimator.setDuration(this.duration);
        this.layoutValueAnimator.start();
    }

    private void doTransitionAnimation(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ce6b6b8", new Object[]{this, new Integer(i)});
            return;
        }
        View targetView = getTargetView();
        if (targetView != null) {
            if (this.targetStyles.size() > 0) {
                for (String str : this.properties) {
                    if (LAYOUT_PROPERTIES.contains(str) || TRANSFORM_PROPERTIES.contains(str)) {
                        if (!this.layoutPendingUpdates.containsKey(str) && !this.transformPendingUpdates.containsKey(str)) {
                            synchronized (this.targetStyles) {
                                try {
                                    if (this.targetStyles.containsKey(str)) {
                                        this.mWXComponent.getStyles().put(str, this.targetStyles.remove(str));
                                    }
                                } finally {
                                }
                            }
                        }
                    }
                }
            }
            Runnable runnable = this.transitionEndEvent;
            if (runnable != null) {
                targetView.removeCallbacks(runnable);
            }
            if (this.transitionEndEvent == null && ((float) this.duration) > Float.MIN_NORMAL) {
                this.transitionEndEvent = new Runnable() { // from class: com.taobao.weex.dom.transition.WXTransition.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        WXTransition.access$302(WXTransition.this, null);
                        if (((float) WXTransition.access$400(WXTransition.this)) >= Float.MIN_NORMAL && WXTransition.access$500(WXTransition.this) != null && WXTransition.access$500(WXTransition.this).getEvents().contains(Constants.Event.ON_TRANSITION_END)) {
                            WXTransition.access$500(WXTransition.this).fireEvent(Constants.Event.ON_TRANSITION_END);
                        }
                    }
                };
            }
            Runnable runnable2 = this.transformAnimationRunnable;
            if (runnable2 != null) {
                targetView.removeCallbacks(runnable2);
            }
            Runnable runnable3 = new Runnable() { // from class: com.taobao.weex.dom.transition.WXTransition.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    synchronized (WXTransition.access$000(WXTransition.this)) {
                        try {
                            if (i == WXTransition.access$000(WXTransition.this).get()) {
                                WXTransition.access$600(WXTransition.this, i);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            };
            this.transformAnimationRunnable = runnable3;
            targetView.post(runnable3);
            doPendingLayoutAnimation();
        }
    }

    public static WXTransition fromMap(Map<String, Object> map, WXComponent wXComponent) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXTransition) ipChange.ipc$dispatch("3763553a", new Object[]{map, wXComponent});
        }
        if (map.get("transitionProperty") == null || (string = WXUtils.getString(map.get("transitionProperty"), null)) == null) {
            return null;
        }
        WXTransition wXTransition = new WXTransition();
        updateTransitionProperties(wXTransition, string);
        if (wXTransition.properties.isEmpty()) {
            return null;
        }
        wXTransition.duration = parseTimeMillis(map, "transitionDuration", 0L);
        wXTransition.delay = parseTimeMillis(map, "transitionDelay", 0L);
        wXTransition.interpolator = createTimeInterpolator(WXUtils.getString(map.get("transitionTimingFunction"), null));
        wXTransition.mWXComponent = wXComponent;
        return wXTransition;
    }

    private View getTargetView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c4d62fd5", new Object[]{this});
        }
        WXComponent wXComponent = this.mWXComponent;
        if (wXComponent != null) {
            return wXComponent.getHostView();
        }
        return null;
    }

    private synchronized void onTransitionAnimationEnd() {
        Runnable runnable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("475ed072", new Object[]{this});
            return;
        }
        if (this.duration > 0 && this.transitionEndEvent != null) {
            View targetView = getTargetView();
            if (!(targetView == null || (runnable = this.transitionEndEvent) == null)) {
                targetView.post(runnable);
            }
            this.transitionEndEvent = null;
        }
        synchronized (this.targetStyles) {
            if (this.targetStyles.size() > 0) {
                for (String str : this.properties) {
                    if (this.targetStyles.containsKey(str)) {
                        this.mWXComponent.getStyles().put(str, this.targetStyles.remove(str));
                    }
                }
                this.targetStyles.clear();
            }
        }
    }

    private static long parseTimeMillis(Map<String, Object> map, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d373f756", new Object[]{map, str, new Long(j)})).longValue();
        }
        String string = WXUtils.getString(map.get(str), null);
        if (string != null) {
            string = string.replaceAll("ms", "");
        }
        if (string != null) {
            if (WXEnvironment.isApkDebugable() && string.contains("px")) {
                WXLogUtils.w("Transition Duration Unit Only Support ms, " + string + " is not ms Unit");
            }
            string = string.replaceAll("px", "");
        }
        if (TextUtils.isEmpty(string)) {
            return j;
        }
        try {
            return Float.parseFloat(string);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    private static void updateTransitionProperties(WXTransition wXTransition, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e540b", new Object[]{wXTransition, str});
        } else if (str != null) {
            wXTransition.properties.clear();
            for (String str2 : PROPERTY_SPLIT_PATTERN.split(str)) {
                String trim = str2.trim();
                if (!TextUtils.isEmpty(trim)) {
                    if (LAYOUT_PROPERTIES.contains(trim) || TRANSFORM_PROPERTIES.contains(trim)) {
                        wXTransition.properties.add(trim);
                    } else if (WXEnvironment.isApkDebugable()) {
                        WXLogUtils.e("WXTransition Property Not Supported" + trim + " in " + str);
                    }
                }
            }
        }
    }

    public void doPendingLayoutAnimation() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e4b38d5", new Object[]{this});
            return;
        }
        ValueAnimator valueAnimator = this.layoutValueAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.layoutValueAnimator = null;
        }
        if (this.layoutPendingUpdates.size() != 0) {
            PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[this.layoutPendingUpdates.size()];
            for (String str : this.properties) {
                if (LAYOUT_PROPERTIES.contains(str) && this.layoutPendingUpdates.containsKey(str)) {
                    Object remove = this.layoutPendingUpdates.remove(str);
                    synchronized (this.targetStyles) {
                        this.targetStyles.put(str, remove);
                    }
                    propertyValuesHolderArr[i] = createLayoutPropertyValueHolder(str, remove);
                    i++;
                }
            }
            this.layoutPendingUpdates.clear();
            doLayoutPropertyValuesHolderAnimation(propertyValuesHolderArr);
        }
    }

    public List<String> getProperties() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f808bf17", new Object[]{this});
        }
        return this.properties;
    }

    public boolean hasTransitionProperty(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("81b17b1e", new Object[]{this, map})).booleanValue();
        }
        for (String str : this.properties) {
            if (map.containsKey(str)) {
                return true;
            }
        }
        return false;
    }

    public void startTransition(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f105767", new Object[]{this, map});
            return;
        }
        synchronized (this.lockToken) {
            try {
                if (getTargetView() != null) {
                    final int incrementAndGet = this.lockToken.incrementAndGet();
                    for (String str : this.properties) {
                        if (map.containsKey(str)) {
                            Object remove = map.remove(str);
                            if (LAYOUT_PROPERTIES.contains(str)) {
                                this.layoutPendingUpdates.put(str, remove);
                            } else if (TRANSFORM_PROPERTIES.contains(str)) {
                                this.transformPendingUpdates.put(str, remove);
                            }
                        }
                    }
                    int numberInt = WXUtils.getNumberInt(this.mWXComponent.getAttrs().get("actionDelay"), 16);
                    long j = this.duration;
                    if (numberInt > j) {
                        numberInt = (int) j;
                    }
                    Runnable runnable = this.animationRunnable;
                    if (runnable != null) {
                        this.handler.removeCallbacks(runnable);
                    }
                    Runnable runnable2 = new Runnable() { // from class: com.taobao.weex.dom.transition.WXTransition.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            if (incrementAndGet == WXTransition.access$000(WXTransition.this).get()) {
                                WXTransition.access$100(WXTransition.this, incrementAndGet);
                            }
                            WXTransition.access$202(WXTransition.this, null);
                        }
                    };
                    this.animationRunnable = runnable2;
                    if (numberInt > 0) {
                        this.handler.postDelayed(runnable2, numberInt);
                    } else {
                        runnable2.run();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void updateTranstionParams(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("672a9125", new Object[]{this, map});
            return;
        }
        if (map.containsKey("transitionDelay")) {
            this.mWXComponent.getStyles().put("transitionDelay", map.remove("transitionDelay"));
            this.delay = parseTimeMillis(this.mWXComponent.getStyles(), "transitionDelay", 0L);
        }
        if (map.containsKey("transitionTimingFunction") && map.get("transitionTimingFunction") != null) {
            this.mWXComponent.getStyles().put("transitionTimingFunction", map.remove("transitionTimingFunction"));
            this.interpolator = createTimeInterpolator(this.mWXComponent.getStyles().get("transitionTimingFunction").toString());
        }
        if (map.containsKey("transitionDuration")) {
            this.mWXComponent.getStyles().put("transitionDuration", map.remove("transitionDuration"));
            this.duration = parseTimeMillis(this.mWXComponent.getStyles(), "transitionDuration", 0L);
        }
        if (map.containsKey("transitionProperty")) {
            this.mWXComponent.getStyles().put("transitionProperty", map.remove("transitionProperty"));
            updateTransitionProperties(this, WXUtils.getString(this.mWXComponent.getStyles().get("transitionProperty"), null));
        }
    }

    static {
        t2o.a(985661604);
        HashSet hashSet = new HashSet();
        LAYOUT_PROPERTIES = hashSet;
        hashSet.add("width");
        hashSet.add("height");
        hashSet.add("marginTop");
        hashSet.add("marginBottom");
        hashSet.add("marginLeft");
        hashSet.add("marginRight");
        hashSet.add("left");
        hashSet.add("right");
        hashSet.add("top");
        hashSet.add("bottom");
        hashSet.add("paddingLeft");
        hashSet.add("paddingRight");
        hashSet.add("paddingTop");
        hashSet.add("paddingBottom");
        HashSet hashSet2 = new HashSet();
        TRANSFORM_PROPERTIES = hashSet2;
        hashSet2.add("opacity");
        hashSet2.add("backgroundColor");
        hashSet2.add("transform");
    }

    private void doPendingTransformAnimation(int i) {
        View targetView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47788b8", new Object[]{this, new Integer(i)});
            return;
        }
        ObjectAnimator objectAnimator = this.transformAnimator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.transformAnimator = null;
        }
        if (!(this.transformPendingUpdates.size() == 0 || (targetView = getTargetView()) == null)) {
            ArrayList arrayList = new ArrayList(8);
            String string = WXUtils.getString(this.transformPendingUpdates.remove("transform"), null);
            if (!TextUtils.isEmpty(string)) {
                for (PropertyValuesHolder propertyValuesHolder : TransformParser.toHolders(TransformParser.parseTransForm(this.mWXComponent.getInstance(), string, (int) this.mWXComponent.getLayoutWidth(), (int) this.mWXComponent.getLayoutHeight(), this.mWXComponent.getViewPortWidth()))) {
                    arrayList.add(propertyValuesHolder);
                }
                synchronized (this.targetStyles) {
                    this.targetStyles.put("transform", string);
                }
            }
            for (String str : this.properties) {
                if (TRANSFORM_PROPERTIES.contains(str) && this.transformPendingUpdates.containsKey(str)) {
                    Object remove = this.transformPendingUpdates.remove(str);
                    synchronized (this.targetStyles) {
                        this.targetStyles.put(str, remove);
                    }
                    str.hashCode();
                    if (str.equals("opacity")) {
                        arrayList.add(PropertyValuesHolder.ofFloat(View.ALPHA, targetView.getAlpha(), WXUtils.getFloat(remove, Float.valueOf(1.0f)).floatValue()));
                        targetView.setLayerType(1, null);
                    } else if (str.equals("backgroundColor")) {
                        int color = WXResourceUtils.getColor(WXUtils.getString(this.mWXComponent.getStyles().getBackgroundColor(), null), 0);
                        int color2 = WXResourceUtils.getColor(WXUtils.getString(remove, null), 0);
                        if (WXViewInnerUtils.getBorderDrawable(targetView) != null) {
                            color = WXViewInnerUtils.getBorderDrawable(targetView).getColor();
                        } else if (targetView.getBackground() instanceof ColorDrawable) {
                            color = ((ColorDrawable) targetView.getBackground()).getColor();
                        }
                        arrayList.add(PropertyValuesHolder.ofObject(new BackgroundColorProperty(), new ArgbEvaluator(), Integer.valueOf(color), Integer.valueOf(color2)));
                    }
                }
            }
            if (i == this.lockToken.get()) {
                this.transformPendingUpdates.clear();
            }
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(targetView, (PropertyValuesHolder[]) arrayList.toArray(new PropertyValuesHolder[arrayList.size()]));
            this.transformAnimator = ofPropertyValuesHolder;
            ofPropertyValuesHolder.setDuration(this.duration);
            long j = this.delay;
            if (j > 0) {
                this.transformAnimator.setStartDelay(j);
            }
            Interpolator interpolator = this.interpolator;
            if (interpolator != null) {
                this.transformAnimator.setInterpolator(interpolator);
            }
            this.transformAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.taobao.weex.dom.transition.WXTransition.4
                public static volatile transient /* synthetic */ IpChange $ipChange;
                public boolean hasCancel = false;

                public static /* synthetic */ Object ipc$super(AnonymousClass4 r4, String str2, Object... objArr) {
                    int hashCode = str2.hashCode();
                    if (hashCode == -2145066406) {
                        super.onAnimationEnd((Animator) objArr[0]);
                        return null;
                    } else if (hashCode == -1868320925) {
                        super.onAnimationCancel((Animator) objArr[0]);
                        return null;
                    } else {
                        int hashCode2 = str2.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode2 + " in com/taobao/weex/dom/transition/WXTransition$4");
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                        return;
                    }
                    super.onAnimationCancel(animator);
                    this.hasCancel = true;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    } else if (!this.hasCancel) {
                        super.onAnimationEnd(animator);
                        WXTransition.access$700(WXTransition.this);
                    }
                }
            });
            this.transformAnimator.start();
        }
    }

    private static Interpolator createTimeInterpolator(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Interpolator) ipChange.ipc$dispatch("bafeb776", new Object[]{str});
        }
        if (!TextUtils.isEmpty(str)) {
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
                case 3105774:
                    if (str.equals(Constants.TimeFunction.EASE)) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    return PathInterpolatorCompat.create(0.42f, 0.0f, 1.0f, 1.0f);
                case 1:
                    return PathInterpolatorCompat.create(0.0f, 0.0f, 1.0f, 1.0f);
                case 2:
                    return PathInterpolatorCompat.create(0.0f, 0.0f, 0.58f, 1.0f);
                case 3:
                    return PathInterpolatorCompat.create(0.42f, 0.0f, 0.58f, 1.0f);
                case 4:
                    return PathInterpolatorCompat.create(0.25f, 0.1f, 0.25f, 1.0f);
                default:
                    try {
                        List parse = new SingleFunctionParser(str, new SingleFunctionParser.FlatMapper<Float>() { // from class: com.taobao.weex.dom.transition.WXTransition.8
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
                    } catch (RuntimeException e) {
                        if (WXEnvironment.isApkDebugable()) {
                            WXLogUtils.e("WXTransition", e);
                            break;
                        }
                    }
                    break;
            }
        }
        return PathInterpolatorCompat.create(0.25f, 0.1f, 0.25f, 1.0f);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private PropertyValuesHolder createLayoutPropertyValueHolder(String str, Object obj) {
        String str2;
        String str3;
        int i;
        PropertyValuesHolder propertyValuesHolder;
        String str4 = "bottom";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PropertyValuesHolder) ipChange.ipc$dispatch("2b0fdea8", new Object[]{this, str, obj});
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1501175880:
                str2 = "paddingLeft";
                str3 = "height";
                if (str.equals(str2)) {
                    c = 0;
                    break;
                }
                break;
            case -1383228885:
                str3 = "height";
                if (str.equals(str4)) {
                    str4 = str4;
                    str2 = "paddingLeft";
                    c = 1;
                    break;
                } else {
                    str4 = str4;
                    str2 = "paddingLeft";
                    break;
                }
            case -1221029593:
                str3 = "height";
                str2 = "paddingLeft";
                if (str.equals(str3)) {
                    c = 2;
                    break;
                }
                break;
            case -1044792121:
                if (str.equals("marginTop")) {
                    str2 = "paddingLeft";
                    str3 = "height";
                    c = 3;
                    break;
                }
                str2 = "paddingLeft";
                str3 = "height";
                break;
            case -289173127:
                if (str.equals("marginBottom")) {
                    str2 = "paddingLeft";
                    str3 = "height";
                    c = 4;
                    break;
                }
                str2 = "paddingLeft";
                str3 = "height";
                break;
            case 115029:
                if (str.equals("top")) {
                    str2 = "paddingLeft";
                    str3 = "height";
                    c = 5;
                    break;
                }
                str2 = "paddingLeft";
                str3 = "height";
                break;
            case 3317767:
                if (str.equals("left")) {
                    str2 = "paddingLeft";
                    str3 = "height";
                    c = 6;
                    break;
                }
                str2 = "paddingLeft";
                str3 = "height";
                break;
            case 90130308:
                if (str.equals("paddingTop")) {
                    str2 = "paddingLeft";
                    str3 = "height";
                    c = 7;
                    break;
                }
                str2 = "paddingLeft";
                str3 = "height";
                break;
            case 108511772:
                if (str.equals("right")) {
                    str2 = "paddingLeft";
                    str3 = "height";
                    c = '\b';
                    break;
                }
                str2 = "paddingLeft";
                str3 = "height";
                break;
            case 113126854:
                if (str.equals("width")) {
                    str2 = "paddingLeft";
                    str3 = "height";
                    c = '\t';
                    break;
                }
                str2 = "paddingLeft";
                str3 = "height";
                break;
            case 202355100:
                if (str.equals("paddingBottom")) {
                    str2 = "paddingLeft";
                    str3 = "height";
                    c = '\n';
                    break;
                }
                str2 = "paddingLeft";
                str3 = "height";
                break;
            case 713848971:
                if (str.equals("paddingRight")) {
                    str2 = "paddingLeft";
                    str3 = "height";
                    c = 11;
                    break;
                }
                str2 = "paddingLeft";
                str3 = "height";
                break;
            case 975087886:
                if (str.equals("marginRight")) {
                    str2 = "paddingLeft";
                    str3 = "height";
                    c = '\f';
                    break;
                }
                str2 = "paddingLeft";
                str3 = "height";
                break;
            case 1970934485:
                if (str.equals("marginLeft")) {
                    str2 = "paddingLeft";
                    str3 = "height";
                    c = '\r';
                    break;
                }
                str2 = "paddingLeft";
                str3 = "height";
                break;
            default:
                str2 = "paddingLeft";
                str3 = "height";
                break;
        }
        switch (c) {
            case 0:
                i = 2;
                propertyValuesHolder = PropertyValuesHolder.ofFloat(str2, this.mWXComponent.getPadding().get(CSSShorthand.EDGE.LEFT), WXViewInnerUtils.getRealPxByWidth(this.mWXComponent.getInstance(), WXUtils.getFloatByViewport(this.mWXComponent.getInstance(), obj, this.mWXComponent.getViewPortWidth()), this.mWXComponent.getViewPortWidth()));
                break;
            case 1:
                propertyValuesHolder = PropertyValuesHolder.ofFloat(str4, this.mWXComponent.getLayoutPosition().getBottom(), WXViewInnerUtils.getRealPxByWidth(this.mWXComponent.getInstance(), WXUtils.getFloatByViewport(this.mWXComponent.getInstance(), obj, this.mWXComponent.getViewPortWidth()), this.mWXComponent.getViewPortWidth()));
                i = 2;
                break;
            case 2:
                propertyValuesHolder = PropertyValuesHolder.ofFloat(str3, this.mWXComponent.getLayoutHeight(), WXViewInnerUtils.getRealPxByWidth(this.mWXComponent.getInstance(), WXUtils.getFloat(obj, Float.valueOf(0.0f)).floatValue(), this.mWXComponent.getViewPortWidth()));
                i = 2;
                break;
            case 3:
                propertyValuesHolder = PropertyValuesHolder.ofFloat("marginTop", this.mWXComponent.getMargin().get(CSSShorthand.EDGE.TOP), WXViewInnerUtils.getRealPxByWidth(this.mWXComponent.getInstance(), WXUtils.getFloatByViewport(this.mWXComponent.getInstance(), obj, this.mWXComponent.getViewPortWidth()), this.mWXComponent.getViewPortWidth()));
                i = 2;
                break;
            case 4:
                propertyValuesHolder = PropertyValuesHolder.ofFloat("marginBottom", this.mWXComponent.getMargin().get(CSSShorthand.EDGE.BOTTOM), WXViewInnerUtils.getRealPxByWidth(this.mWXComponent.getInstance(), WXUtils.getFloatByViewport(this.mWXComponent.getInstance(), obj, this.mWXComponent.getViewPortWidth()), this.mWXComponent.getViewPortWidth()));
                i = 2;
                break;
            case 5:
                propertyValuesHolder = PropertyValuesHolder.ofFloat("top", this.mWXComponent.getLayoutPosition().getTop(), WXViewInnerUtils.getRealPxByWidth(this.mWXComponent.getInstance(), WXUtils.getFloatByViewport(this.mWXComponent.getInstance(), obj, this.mWXComponent.getViewPortWidth()), this.mWXComponent.getViewPortWidth()));
                i = 2;
                break;
            case 6:
                propertyValuesHolder = PropertyValuesHolder.ofFloat("left", this.mWXComponent.getLayoutPosition().getLeft(), WXViewInnerUtils.getRealPxByWidth(this.mWXComponent.getInstance(), WXUtils.getFloatByViewport(this.mWXComponent.getInstance(), obj, this.mWXComponent.getViewPortWidth()), this.mWXComponent.getViewPortWidth()));
                i = 2;
                break;
            case 7:
                propertyValuesHolder = PropertyValuesHolder.ofFloat("paddingTop", this.mWXComponent.getPadding().get(CSSShorthand.EDGE.TOP), WXViewInnerUtils.getRealPxByWidth(this.mWXComponent.getInstance(), WXUtils.getFloatByViewport(this.mWXComponent.getInstance(), obj, this.mWXComponent.getViewPortWidth()), this.mWXComponent.getViewPortWidth()));
                i = 2;
                break;
            case '\b':
                propertyValuesHolder = PropertyValuesHolder.ofFloat("right", this.mWXComponent.getLayoutPosition().getRight(), WXViewInnerUtils.getRealPxByWidth(this.mWXComponent.getInstance(), WXUtils.getFloatByViewport(this.mWXComponent.getInstance(), obj, this.mWXComponent.getViewPortWidth()), this.mWXComponent.getViewPortWidth()));
                i = 2;
                break;
            case '\t':
                propertyValuesHolder = PropertyValuesHolder.ofFloat("width", this.mWXComponent.getLayoutWidth(), WXViewInnerUtils.getRealPxByWidth(this.mWXComponent.getInstance(), WXUtils.getFloat(obj, Float.valueOf(0.0f)).floatValue(), this.mWXComponent.getViewPortWidth()));
                i = 2;
                break;
            case '\n':
                propertyValuesHolder = PropertyValuesHolder.ofFloat("paddingBottom", this.mWXComponent.getPadding().get(CSSShorthand.EDGE.BOTTOM), WXViewInnerUtils.getRealPxByWidth(this.mWXComponent.getInstance(), WXUtils.getFloatByViewport(this.mWXComponent.getInstance(), obj, this.mWXComponent.getViewPortWidth()), this.mWXComponent.getViewPortWidth()));
                i = 2;
                break;
            case 11:
                propertyValuesHolder = PropertyValuesHolder.ofFloat("paddingRight", this.mWXComponent.getPadding().get(CSSShorthand.EDGE.RIGHT), WXViewInnerUtils.getRealPxByWidth(this.mWXComponent.getInstance(), WXUtils.getFloatByViewport(this.mWXComponent.getInstance(), obj, this.mWXComponent.getViewPortWidth()), this.mWXComponent.getViewPortWidth()));
                i = 2;
                break;
            case '\f':
                propertyValuesHolder = PropertyValuesHolder.ofFloat("marginRight", this.mWXComponent.getMargin().get(CSSShorthand.EDGE.RIGHT), WXViewInnerUtils.getRealPxByWidth(this.mWXComponent.getInstance(), WXUtils.getFloatByViewport(this.mWXComponent.getInstance(), obj, this.mWXComponent.getViewPortWidth()), this.mWXComponent.getViewPortWidth()));
                i = 2;
                break;
            case '\r':
                propertyValuesHolder = PropertyValuesHolder.ofFloat("marginLeft", this.mWXComponent.getMargin().get(CSSShorthand.EDGE.LEFT), WXViewInnerUtils.getRealPxByWidth(this.mWXComponent.getInstance(), WXUtils.getFloatByViewport(this.mWXComponent.getInstance(), obj, this.mWXComponent.getViewPortWidth()), this.mWXComponent.getViewPortWidth()));
                i = 2;
                break;
            default:
                propertyValuesHolder = null;
                i = 2;
                break;
        }
        if (propertyValuesHolder != null) {
            return propertyValuesHolder;
        }
        float[] fArr = new float[i];
        // fill-array-data instruction
        fArr[0] = 1.0f;
        fArr[1] = 1.0f;
        return PropertyValuesHolder.ofFloat(str, fArr);
    }
}
