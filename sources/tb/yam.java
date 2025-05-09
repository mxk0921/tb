package tb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.track.module.ActionLineModule;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.tbpoplayer.nativerender.dsl.AnimationModel;
import com.taobao.tbpoplayer.nativerender.dsl.ComponentBaseModel;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.yam;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class yam {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TRIGGER_NAME_CLICK = "click";
    public static final String TRIGGER_NAME_CLOSE = "close";
    public static final String TRIGGER_NAME_EXPOSE = "expose";
    public static final String TRIGGER_NAME_SCROLL_STATUS = "scrollStatus";

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Integer> f31940a = new ConcurrentHashMap();
    public final Map<String, Integer> b = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f31941a;
        public final /* synthetic */ me8 b;
        public final /* synthetic */ ActionLineModule c;

        public a(yam yamVar, f fVar, me8 me8Var, ActionLineModule actionLineModule) {
            this.f31941a = fVar;
            this.b = me8Var;
            this.c = actionLineModule;
        }

        @Override // tb.yam.f
        public void onAnimationEnd() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c281bbd", new Object[]{this});
                return;
            }
            f fVar = this.f31941a;
            if (fVar != null) {
                fVar.onAnimationEnd();
            }
            qtv.m(this.b.w(), this.c);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements View.OnAttachStateChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AnimatorSet f31943a;

        public c(yam yamVar, AnimatorSet animatorSet) {
            this.f31943a = animatorSet;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d337638", new Object[]{this, view});
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f64d55b", new Object[]{this, view});
                return;
            }
            wdm.d("PopAnimateExecutor.onViewDetachedFromWindow.stopAnim", new Object[0]);
            this.f31943a.cancel();
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final List<AnimationModel> f31944a;
        public final View b;
        public final ComponentBaseModel c;
        public final f d;
        public ActionLineModule e;

        static {
            t2o.a(790626416);
        }

        public d(String str, List<AnimationModel> list, View view, ComponentBaseModel componentBaseModel, f fVar) {
            this.f31944a = list;
            this.b = view;
            this.c = componentBaseModel;
            this.d = fVar;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface e {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface f {
        void onAnimationEnd();
    }

    static {
        t2o.a(790626412);
    }

    public void f(oe8 oe8Var, String str, List<AnimationModel> list, View view, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9b52ed1", new Object[]{this, oe8Var, str, list, view, fVar});
        } else {
            e(oe8Var, str, list, view, null, fVar);
        }
    }

    public final float j(oe8 oe8Var, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("556070f8", new Object[]{this, oe8Var, str, new Integer(i)})).floatValue();
        }
        if (!str.contains(f7l.MOD)) {
            return oe8Var.g().c(oe8Var.j().e(), Float.parseFloat(str));
        }
        float f2 = 0.0f;
        try {
            float floatValue = NumberFormat.getPercentInstance().parse(str).floatValue();
            if (floatValue > 1.0f) {
                f2 = 1.0f;
            } else if (floatValue >= 0.0f) {
                f2 = floatValue;
            }
            return f2 * i;
        } catch (ParseException e2) {
            e2.printStackTrace();
            return 0.0f;
        }
    }

    public final /* synthetic */ void l(oe8 oe8Var, AnimationModel animationModel, View view, d dVar, ActionLineModule.ActionItem actionItem, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d671ccdd", new Object[]{this, oe8Var, animationModel, view, dVar, actionItem, fVar});
        } else {
            d(oe8Var, animationModel, view, new wam(this, view, oe8Var, dVar, actionItem, fVar));
        }
    }

    public final /* synthetic */ void m(View view, oe8 oe8Var, d dVar, ActionLineModule.ActionItem actionItem, f fVar, AnimationModel animationModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ad5aa41", new Object[]{this, view, oe8Var, dVar, actionItem, fVar, animationModel});
            return;
        }
        if (animationModel != null) {
            try {
                String str = animationModel.endBehavior;
                if ("gone".equals(str)) {
                    view.setVisibility(8);
                } else if ("hide".equals(str)) {
                    view.setVisibility(4);
                }
            } catch (Throwable th) {
                wdm.h("PopAnimateExecutor.executeAnimationItem.error", th);
                actionItem.exception = "executeError";
                if (fVar != null) {
                    fVar.onAnimationEnd();
                    return;
                }
                return;
            }
        }
        g(oe8Var, dVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0074, code lost:
        if (r8.equals("translateY") == false) goto L_0x0029;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String o(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = "scaleY"
            java.lang.String r1 = "scaleX"
            r2 = 1
            r3 = 0
            r4 = 2
            com.android.alibaba.ip.runtime.IpChange r5 = tb.yam.$ipChange
            boolean r6 = r5 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r6 == 0) goto L_0x001e
            java.lang.String r0 = "cf921012"
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r3] = r7
            r1[r2] = r8
            java.lang.Object r8 = r5.ipc$dispatch(r0, r1)
            java.lang.String r8 = (java.lang.String) r8
            return r8
        L_0x001e:
            r8.hashCode()
            r5 = -1
            int r6 = r8.hashCode()
            switch(r6) {
                case -1721943862: goto L_0x0077;
                case -1721943861: goto L_0x006d;
                case -1267206133: goto L_0x0061;
                case -925180581: goto L_0x0055;
                case -908189618: goto L_0x004c;
                case -908189617: goto L_0x0043;
                case 1384173149: goto L_0x0037;
                case 1384173150: goto L_0x002b;
                default: goto L_0x0029;
            }
        L_0x0029:
            r2 = -1
            goto L_0x0082
        L_0x002b:
            java.lang.String r2 = "rotateY"
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto L_0x0035
            goto L_0x0029
        L_0x0035:
            r2 = 7
            goto L_0x0082
        L_0x0037:
            java.lang.String r2 = "rotateX"
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto L_0x0041
            goto L_0x0029
        L_0x0041:
            r2 = 6
            goto L_0x0082
        L_0x0043:
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x004a
            goto L_0x0029
        L_0x004a:
            r2 = 5
            goto L_0x0082
        L_0x004c:
            boolean r8 = r8.equals(r1)
            if (r8 != 0) goto L_0x0053
            goto L_0x0029
        L_0x0053:
            r2 = 4
            goto L_0x0082
        L_0x0055:
            java.lang.String r2 = "rotate"
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto L_0x005f
            goto L_0x0029
        L_0x005f:
            r2 = 3
            goto L_0x0082
        L_0x0061:
            java.lang.String r2 = "opacity"
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto L_0x006b
            goto L_0x0029
        L_0x006b:
            r2 = 2
            goto L_0x0082
        L_0x006d:
            java.lang.String r3 = "translateY"
            boolean r8 = r8.equals(r3)
            if (r8 != 0) goto L_0x0082
            goto L_0x0029
        L_0x0077:
            java.lang.String r2 = "translateX"
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto L_0x0081
            goto L_0x0029
        L_0x0081:
            r2 = 0
        L_0x0082:
            switch(r2) {
                case 0: goto L_0x009d;
                case 1: goto L_0x0099;
                case 2: goto L_0x0096;
                case 3: goto L_0x0092;
                case 4: goto L_0x0091;
                case 5: goto L_0x0090;
                case 6: goto L_0x008c;
                case 7: goto L_0x0088;
                default: goto L_0x0085;
            }
        L_0x0085:
            java.lang.String r8 = ""
            return r8
        L_0x0088:
            java.lang.String r8 = "rotationY"
            return r8
        L_0x008c:
            java.lang.String r8 = "rotationX"
            return r8
        L_0x0090:
            return r0
        L_0x0091:
            return r1
        L_0x0092:
            java.lang.String r8 = "rotation"
            return r8
        L_0x0096:
            java.lang.String r8 = "alpha"
            return r8
        L_0x0099:
            java.lang.String r8 = "translationY"
            return r8
        L_0x009d:
            java.lang.String r8 = "translationX"
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.yam.o(java.lang.String):java.lang.String");
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f31942a = false;
        public final /* synthetic */ me8 b;
        public final /* synthetic */ String c;
        public final /* synthetic */ AnimationModel d;
        public final /* synthetic */ oe8 e;
        public final /* synthetic */ AnimatorSet f;
        public final /* synthetic */ e g;

        public b(yam yamVar, me8 me8Var, String str, AnimationModel animationModel, oe8 oe8Var, AnimatorSet animatorSet, e eVar) {
            this.b = me8Var;
            this.c = str;
            this.d = animationModel;
            this.e = oe8Var;
            this.f = animatorSet;
            this.g = eVar;
        }

        public static /* synthetic */ void b(AnimatorSet animatorSet) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1ffc4c36", new Object[]{animatorSet});
                return;
            }
            try {
                animatorSet.start();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == -1868320925) {
                super.onAnimationCancel((Animator) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tbpoplayer/nativerender/PopAnimateExecutor$2");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
                return;
            }
            super.onAnimationCancel(animator);
            this.f31942a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            long j;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            wdm.d("onAnimationEnd.", new Object[0]);
            if (this.b.B() || !this.b.i().equals(this.c) || this.f31942a) {
                wdm.d("onAnimationEnd.cancel=%s", Boolean.valueOf(this.f31942a));
                return;
            }
            try {
                AnimationModel animationModel = this.d;
                Long l = animationModel.loopTimes;
                if (l != null) {
                    j = l.longValue();
                } else {
                    Boolean bool = animationModel.loop;
                    j = 1;
                    if (bool != null && bool.booleanValue()) {
                        j = 0;
                    }
                }
                if (j > 0) {
                    AnimationModel animationModel2 = this.d;
                    int i = animationModel2.curLoopTimes + 1;
                    animationModel2.curLoopTimes = i;
                    if (j <= i) {
                        e eVar = this.g;
                        if (eVar != null) {
                            ((wam) eVar).a(animationModel2);
                            return;
                        }
                        return;
                    }
                }
                oe8 oe8Var = this.e;
                final AnimatorSet animatorSet = this.f;
                oe8Var.x(new Runnable() { // from class: tb.zam
                    @Override // java.lang.Runnable
                    public final void run() {
                        yam.b.b(animatorSet);
                    }
                });
            } catch (Throwable th) {
                wdm.h("onAnimationEnd.loop.error.", th);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dcb3fd3", new Object[]{this, animator, new Boolean(z)});
            } else {
                wdm.d("onAnimationStart.duration=%s", Long.valueOf(animator.getDuration()));
            }
        }
    }

    public void e(oe8 oe8Var, String str, List<AnimationModel> list, View view, ComponentBaseModel componentBaseModel, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41aaba95", new Object[]{this, oe8Var, str, list, view, componentBaseModel, fVar});
        } else if (!TextUtils.isEmpty(str) && list != null && !list.isEmpty() && view != null) {
            try {
                ArrayList arrayList = new ArrayList();
                for (AnimationModel animationModel : list) {
                    if (animationModel.isValid() && str.equals(animationModel.trigger.get("name"))) {
                        arrayList.add(animationModel);
                    }
                }
                if (!arrayList.isEmpty()) {
                    me8 j = oe8Var.j();
                    ActionLineModule actionLineModule = new ActionLineModule(j.i(), j.m(), j.j());
                    actionLineModule.triggerType = str;
                    actionLineModule.countTire = false;
                    actionLineModule.animations = new ArrayList();
                    d dVar = new d(str, arrayList, view, componentBaseModel, new a(this, fVar, j, actionLineModule));
                    dVar.e = actionLineModule;
                    g(oe8Var, dVar);
                } else if (fVar != null) {
                    fVar.onAnimationEnd();
                }
            } catch (Throwable th) {
                wdm.h("PopAnimateExecutor.executeAnimate.error", th);
                if (fVar != null) {
                    fVar.onAnimationEnd();
                }
            }
        } else if (fVar != null) {
            fVar.onAnimationEnd();
        }
    }

    public final void g(final oe8 oe8Var, final d dVar) {
        String str;
        List<ActionLineModule.ActionItem> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6088e83a", new Object[]{this, oe8Var, dVar});
        } else if (dVar != null) {
            final f fVar = dVar.d;
            List<AnimationModel> list2 = dVar.f31944a;
            if (list2 != null && !list2.isEmpty()) {
                final AnimationModel remove = dVar.f31944a.remove(0);
                final ActionLineModule.ActionItem actionItem = new ActionLineModule.ActionItem();
                actionItem.id = remove.id;
                ComponentBaseModel componentBaseModel = dVar.c;
                if (componentBaseModel != null) {
                    str = componentBaseModel.id;
                } else {
                    str = "";
                }
                actionItem.componentId = str;
                ActionLineModule actionLineModule = dVar.e;
                if (!(actionLineModule == null || (list = actionLineModule.animations) == null)) {
                    list.add(actionItem);
                }
                if (!af4.a(remove.preCondition, oe8Var, false)) {
                    actionItem.exception = "preConditionRestrict";
                    if (fVar != null) {
                        fVar.onAnimationEnd();
                        return;
                    }
                    return;
                }
                final View view = dVar.b;
                view.post(new Runnable() { // from class: tb.vam
                    @Override // java.lang.Runnable
                    public final void run() {
                        yam.this.l(oe8Var, remove, view, dVar, actionItem, fVar);
                    }
                });
            } else if (fVar != null) {
                fVar.onAnimationEnd();
            }
        }
    }

    public static /* synthetic */ void k(View view, AnimatorSet animatorSet, me8 me8Var) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7056abec", new Object[]{view, animatorSet, me8Var});
            return;
        }
        try {
            int i = R.id.poplayer_native_animator_view_id;
            Object tag = view.getTag(i);
            if (tag instanceof AnimatorSet) {
                ((AnimatorSet) tag).cancel();
            }
            view.setTag(i, animatorSet);
            if (((Integer) view.getTag(R.id.poplayer_native_animator_state_index)).intValue() == me8Var.j()) {
                z = false;
            }
            if (!me8Var.B() && !z) {
                animatorSet.start();
            }
        } catch (Throwable th) {
            wdm.h("onAnimationEnd.loop.error.", th);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007b, code lost:
        if (r6.equals(com.taobao.uikit.feature.features.BounceScrollFeature.BOUNCE_TAG) == false) goto L_0x002f;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.TimeInterpolator i(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = tb.yam.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0018
            java.lang.String r4 = "9573d478"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r5
            r2[r0] = r6
            java.lang.Object r6 = r3.ipc$dispatch(r4, r2)
            android.animation.TimeInterpolator r6 = (android.animation.TimeInterpolator) r6
            return r6
        L_0x0018:
            boolean r3 = android.text.TextUtils.isEmpty(r6)
            if (r3 == 0) goto L_0x0024
            android.view.animation.LinearInterpolator r6 = new android.view.animation.LinearInterpolator
            r6.<init>()
            return r6
        L_0x0024:
            r6.hashCode()
            r3 = -1
            int r4 = r6.hashCode()
            switch(r4) {
                case -1700042016: goto L_0x007e;
                case -1383205240: goto L_0x0075;
                case -1197605014: goto L_0x006a;
                case -1102672091: goto L_0x005e;
                case -749065269: goto L_0x0052;
                case 98580269: goto L_0x0047;
                case 1088816001: goto L_0x003c;
                case 1396267464: goto L_0x0031;
                default: goto L_0x002f;
            }
        L_0x002f:
            r0 = -1
            goto L_0x0088
        L_0x0031:
            java.lang.String r0 = "easeInOutSine"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x003a
            goto L_0x002f
        L_0x003a:
            r0 = 7
            goto L_0x0088
        L_0x003c:
            java.lang.String r0 = "anticipateOvershoot"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0045
            goto L_0x002f
        L_0x0045:
            r0 = 6
            goto L_0x0088
        L_0x0047:
            java.lang.String r0 = "easeOutSine"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0050
            goto L_0x002f
        L_0x0050:
            r0 = 5
            goto L_0x0088
        L_0x0052:
            java.lang.String r0 = "overshoot"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x005c
            goto L_0x002f
        L_0x005c:
            r0 = 4
            goto L_0x0088
        L_0x005e:
            java.lang.String r0 = "linear"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0068
            goto L_0x002f
        L_0x0068:
            r0 = 3
            goto L_0x0088
        L_0x006a:
            java.lang.String r0 = "anticipate"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0073
            goto L_0x002f
        L_0x0073:
            r0 = 2
            goto L_0x0088
        L_0x0075:
            java.lang.String r1 = "bounce"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x0088
            goto L_0x002f
        L_0x007e:
            java.lang.String r0 = "easeInSine"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0087
            goto L_0x002f
        L_0x0087:
            r0 = 0
        L_0x0088:
            switch(r0) {
                case 0: goto L_0x00bb;
                case 1: goto L_0x00b5;
                case 2: goto L_0x00af;
                case 3: goto L_0x00a9;
                case 4: goto L_0x00a3;
                case 5: goto L_0x009d;
                case 6: goto L_0x0097;
                case 7: goto L_0x0091;
                default: goto L_0x008b;
            }
        L_0x008b:
            android.view.animation.LinearInterpolator r6 = new android.view.animation.LinearInterpolator
            r6.<init>()
            return r6
        L_0x0091:
            android.view.animation.AccelerateDecelerateInterpolator r6 = new android.view.animation.AccelerateDecelerateInterpolator
            r6.<init>()
            return r6
        L_0x0097:
            android.view.animation.AnticipateOvershootInterpolator r6 = new android.view.animation.AnticipateOvershootInterpolator
            r6.<init>()
            return r6
        L_0x009d:
            android.view.animation.DecelerateInterpolator r6 = new android.view.animation.DecelerateInterpolator
            r6.<init>()
            return r6
        L_0x00a3:
            android.view.animation.OvershootInterpolator r6 = new android.view.animation.OvershootInterpolator
            r6.<init>()
            return r6
        L_0x00a9:
            android.view.animation.LinearInterpolator r6 = new android.view.animation.LinearInterpolator
            r6.<init>()
            return r6
        L_0x00af:
            android.view.animation.AnticipateInterpolator r6 = new android.view.animation.AnticipateInterpolator
            r6.<init>()
            return r6
        L_0x00b5:
            android.view.animation.BounceInterpolator r6 = new android.view.animation.BounceInterpolator
            r6.<init>()
            return r6
        L_0x00bb:
            android.view.animation.AccelerateInterpolator r6 = new android.view.animation.AccelerateInterpolator
            r6.<init>()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.yam.i(java.lang.String):android.animation.TimeInterpolator");
    }

    public void n(JSONObject jSONObject) {
        Integer num;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac3fa4c0", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            String string = jSONObject.getString("sourceName");
            String string2 = jSONObject.getString("event");
            JSONObject jSONObject2 = jSONObject.getJSONObject("content");
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2) && jSONObject2 != null) {
                if (rgm.PAGE_EVENT_SCROLL_STATE_CHANGED.equals(string2)) {
                    if (jSONObject2.containsKey("state")) {
                        int intValue = jSONObject2.getIntValue("state");
                        ((ConcurrentHashMap) this.b).put(string, Integer.valueOf(intValue));
                        wdm.d("executePageEventAnimate.syncScrollState.saveScrollState.sourceName=%s.event=%s.state=%s", string, string2, Integer.valueOf(intValue));
                    } else {
                        return;
                    }
                }
                if (rgm.PAGE_EVENT_SCROLLED.equals(string2) && (num = (Integer) ((ConcurrentHashMap) this.f31940a).get(string)) != null) {
                    int intValue2 = num.intValue() + jSONObject2.getIntValue("dy");
                    ((ConcurrentHashMap) this.f31940a).put(string, Integer.valueOf(intValue2));
                    wdm.d("executePageEventAnimate.syncScrollState.saveScrollInstances.sourceName=%s.event=%s.lastInstance=%s.scrollYDistance=%s", string, string2, num, Integer.valueOf(intValue2));
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x01e0 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01e0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x020d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(tb.oe8 r20, com.taobao.tbpoplayer.nativerender.dsl.AnimationModel r21, final android.view.View r22, tb.yam.e r23) {
        /*
            Method dump skipped, instructions count: 772
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.yam.d(tb.oe8, com.taobao.tbpoplayer.nativerender.dsl.AnimationModel, android.view.View, tb.yam$e):void");
    }

    public void h(oe8 oe8Var, JSONObject jSONObject, ComponentBaseModel componentBaseModel, View view) {
        List<AnimationModel> list;
        ArrayList arrayList;
        AnimationModel animationModel;
        Integer num;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85524188", new Object[]{this, oe8Var, jSONObject, componentBaseModel, view});
        } else if (jSONObject != null && componentBaseModel != null && (list = componentBaseModel.animation) != null && !list.isEmpty() && view != null) {
            String str = "sourceName";
            String string = jSONObject.getString(str);
            String string2 = jSONObject.getString("event");
            JSONObject jSONObject2 = jSONObject.getJSONObject("content");
            if (!(TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || jSONObject2 == null)) {
                wdm.d("executePageEventAnimate.sourceName=%s.event=%s.scrollInstances=%s.", string, string2, this.f31940a);
                if (rgm.PAGE_EVENT_SCROLL_STATE_CHANGED.equals(string2)) {
                    if (jSONObject2.containsKey("state")) {
                        wdm.d("executePageEventAnimate.scrollStateChanged.sourceName=%s.event=%s.mScrollState=%s.", string, string2, this.b);
                        Integer num2 = (Integer) ((ConcurrentHashMap) this.b).get(string);
                        int intValue = jSONObject2.getIntValue("state");
                        if (num2 != null && num2.intValue() == intValue) {
                            wdm.d("executePageEventAnimate.scrollStateChanged.sameState.pass.state=%s", Integer.valueOf(intValue));
                            return;
                        }
                    } else {
                        return;
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (AnimationModel animationModel2 : componentBaseModel.animation) {
                    if (animationModel2.isValid()) {
                        JSONObject jSONObject3 = animationModel2.trigger;
                        if (TRIGGER_NAME_SCROLL_STATUS.equals(jSONObject3.getString("name"))) {
                            String string3 = jSONObject3.getString(str);
                            if (!TextUtils.isEmpty(string3) && string3.equals(string)) {
                                if ("vertical".equals(jSONObject3.getString("direction"))) {
                                    long longValue = jSONObject3.getLongValue("listenTimes");
                                    if (longValue <= 0) {
                                        longValue = animationModel2.listenTimes;
                                    }
                                    if (longValue > 0) {
                                        animationModel = animationModel2;
                                        arrayList = arrayList2;
                                        if (animationModel2.costTimes >= longValue) {
                                            wdm.d("executePageEventAnimate.costTimes>=listenTimes.return.triggerSourceName=%s", string3);
                                            arrayList2 = arrayList;
                                        }
                                    } else {
                                        animationModel = animationModel2;
                                        arrayList = arrayList2;
                                    }
                                    int intValue2 = jSONObject3.getIntValue("safeDistance");
                                    String string4 = jSONObject3.getString("listenDirection");
                                    if (!rgm.PAGE_EVENT_SCROLL_STATE_CHANGED.equals(string2)) {
                                        arrayList2 = arrayList;
                                        if (rgm.PAGE_EVENT_SCROLLED.equals(string2) && (num = (Integer) ((ConcurrentHashMap) this.f31940a).get(string)) != null) {
                                            int intValue3 = num.intValue() + jSONObject2.getIntValue("dy");
                                            jSONObject2 = jSONObject2;
                                            boolean z = Math.abs(num.intValue()) <= Math.abs(intValue2) && Math.abs(intValue3) > Math.abs(intValue2);
                                            str = str;
                                            wdm.d("executePageEventAnimate.sourceName=%s.event=%s.canStart=%s...lastInstance=%s.safeDistance=%s.scrollYDistance=%s ", string, string2, Boolean.valueOf(z), num, Integer.valueOf(intValue2), Integer.valueOf(intValue3));
                                            if (z && (("ScrollingUp".equals(string4) && intValue3 < 0) || ("ScrollingDown".equals(string4) && intValue3 > 0))) {
                                                arrayList2.add(animationModel);
                                            }
                                        }
                                    } else if ("0".equals(jSONObject2.getString("state"))) {
                                        ((ConcurrentHashMap) this.f31940a).remove(string);
                                        arrayList2 = arrayList;
                                        if ("Idle".equals(string4)) {
                                            arrayList2.add(animationModel);
                                        }
                                    } else {
                                        arrayList2 = arrayList;
                                        if ("1".equals(jSONObject2.getString("state"))) {
                                            ((ConcurrentHashMap) this.f31940a).put(string, 0);
                                            if ("Scrolling".equals(string4)) {
                                                arrayList2.add(animationModel);
                                            }
                                        }
                                    }
                                    jSONObject2 = jSONObject2;
                                }
                            }
                        } else {
                            jSONObject2 = jSONObject2;
                            arrayList2 = arrayList2;
                        }
                        str = str;
                    }
                }
                if (!arrayList2.isEmpty()) {
                    g(oe8Var, new d(TRIGGER_NAME_SCROLL_STATUS, arrayList2, view, componentBaseModel, null));
                }
            }
        }
    }
}
