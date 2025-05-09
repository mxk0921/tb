package com.taobao.android.dinamicx.widget;

import android.animation.Animator;
import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.megadesign.anim.lottie.MALottieView;
import com.taobao.taobao.R;
import java.util.HashMap;
import tb.a07;
import tb.ckf;
import tb.h36;
import tb.la6;
import tb.mw5;
import tb.qub;
import tb.ssq;
import tb.wkh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class a0 extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final b Companion = new b(null);
    public static final long DXMALOTTIEVIEW_FONT = 34149272427L;
    public static final long DXMALOTTIEVIEW_ISBOLD = 9423384817756195L;
    public static final long DXMALOTTIEVIEW_JSONSTRING = 9091485043305760827L;
    public static final long DXMALOTTIEVIEW_JSONURL = 4991369220069624564L;
    public static final long DXMALOTTIEVIEW_LOOPCOUNT = 2086518323790794956L;
    public static final long DXMALOTTIEVIEW_MALOTTIEVIEW = -7827222248633552986L;
    public static final long DXMALOTTIEVIEW_ONAREATAPED = -2582590095492756913L;
    public static final long DXMALOTTIEVIEW_ONCANCEL = 5288679758315475755L;
    public static final long DXMALOTTIEVIEW_ONCOMPLETED = 2873651788935849093L;
    public static final long DXMALOTTIEVIEW_ONREPEAT = 5288746714156027718L;
    public static final long DXMALOTTIEVIEW_ONSTART = 5176478572008687858L;
    public static final long DXMALOTTIEVIEW_PLAYCONTROL = 681874255820305570L;
    public static final long DXMALOTTIEVIEW_RENDERMODE = 8819004586453307919L;
    public static final long DXMALOTTIEVIEW_REPLACEMENTIMAGES = -686869780255228937L;
    public static final long DXMALOTTIEVIEW_TAPAREADEBUGGABLE = 6421984658367506097L;
    public static final long DXMALOTTIEVIEW_TAPAREAS = 6746385450873234233L;
    public static final long DXMALOTTIEVIEW_TEXTDELEGATE = -3611250641858826260L;
    public String C0;
    public String E0;
    public String F0;
    public String G0;
    public String H0;
    public String J0;
    public JSONArray K0;
    public String D0 = "1";
    public String I0 = "false";
    public final String L0 = "MALottie";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new a0();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class c implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ View b;

        public c(View view) {
            this.b = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
                return;
            }
            ckf.g(animator, "animation");
            a0.this.postEvent(new DXEvent(5288679758315475755L));
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
                return;
            }
            ckf.g(animator, "animation");
            a0.this.postEvent(new DXEvent(5288746714156027718L));
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
                return;
            }
            ckf.g(animator, "animation");
            a0.this.postEvent(new DXEvent(5176478572008687858L));
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            ckf.g(animator, "animation");
            Object tag = this.b.getTag(R.string.tag_lottie_play_control);
            if (!(tag instanceof JSONArray)) {
                tag = null;
            }
            JSONArray jSONArray = (JSONArray) tag;
            if (jSONArray == null || jSONArray.isEmpty()) {
                a0.this.postEvent(new DXEvent(2873651788935849093L));
                return;
            }
            JSONObject jSONObject = jSONArray.getJSONObject(0);
            if (jSONObject != null) {
                try {
                    String string = jSONObject.getString("start");
                    ckf.f(string, "config.getString(\"start\")");
                    int parseInt = Integer.parseInt(string);
                    String string2 = jSONObject.getString("end");
                    ckf.f(string2, "config.getString(\"end\")");
                    ((MALottieView) this.b).setMinAndMaxFrame(parseInt, Integer.parseInt(string2));
                    MALottieView mALottieView = (MALottieView) this.b;
                    String string3 = jSONObject.getString("loopCount");
                    ckf.f(string3, "config.getString(\"loopCount\")");
                    Integer m = ssq.m(string3);
                    if (m != null) {
                        i = m.intValue();
                    }
                    mALottieView.setRepeatCount(i);
                } catch (NumberFormatException unused) {
                }
                jSONArray.remove(jSONObject);
                ((MALottieView) this.b).playAnimation();
                this.b.setTag(R.string.tag_lottie_play_control, jSONArray);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class d implements MALottieView.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // com.taobao.android.megadesign.anim.lottie.MALottieView.a
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b39bb700", new Object[]{this, new Integer(i)});
                return;
            }
            DXEvent dXEvent = new DXEvent(-2582590095492756913L);
            HashMap hashMap = new HashMap();
            mw5 O = mw5.O(String.valueOf(i));
            ckf.f(O, "DXExprVar.ofString(index.toString())");
            hashMap.put("tapIndex", O);
            dXEvent.setArgs(hashMap);
            a0.this.postEvent(dXEvent);
        }
    }

    public static /* synthetic */ Object ipc$super(a0 a0Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -879570230:
                super.onSetListAttribute(((Number) objArr[0]).longValue(), (JSONArray) objArr[1]);
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 253729832:
                return super.getDefaultValueForStringAttr(((Number) objArr[0]).longValue());
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/DXMALottieViewWidgetNode");
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new a0();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public String getDefaultValueForStringAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1f9c28", new Object[]{this, new Long(j)});
        }
        if (j == 9423384817756195L) {
            return "false";
        }
        if (j == 2086518323790794956L) {
            return "0";
        }
        return super.getDefaultValueForStringAttr(j);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
            return;
        }
        ckf.g(context, "context");
        if (view != null && (view instanceof MALottieView)) {
            if (j == 2873651788935849093L) {
                MALottieView mALottieView = (MALottieView) view;
                mALottieView.removeAllAnimatorListeners();
                mALottieView.addAnimatorListener(new c(view));
            } else if (j == -2582590095492756913L) {
                ((MALottieView) view).setOnAreaClickEventListener(new d());
            }
            super.onBindEvent(context, view, j);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        ckf.g(dXWidgetNode, "widgetNode");
        if (dXWidgetNode instanceof a0) {
            super.onClone(dXWidgetNode, z);
            a0 a0Var = (a0) dXWidgetNode;
            this.H0 = a0Var.H0;
            this.I0 = a0Var.I0;
            this.C0 = a0Var.C0;
            this.D0 = a0Var.D0;
            this.E0 = a0Var.E0;
            this.F0 = a0Var.F0;
            this.G0 = a0Var.G0;
            this.J0 = a0Var.J0;
            this.K0 = a0Var.K0;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        ckf.g(context, "context");
        return new MALottieView(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONArray jSONArray3;
        DXRuntimeContext dXRuntimeContext;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        ckf.g(context, "context");
        ckf.g(view, "animationView");
        super.onRenderView(context, view);
        try {
            String str = null;
            if (!(view instanceof MALottieView)) {
                view = null;
            }
            MALottieView mALottieView = (MALottieView) view;
            if (mALottieView != null) {
                int i2 = R.id.mega_lottie_setup_key;
                Object tag = mALottieView.getTag(i2);
                Boolean bool = Boolean.TRUE;
                if (!ckf.b(tag, bool)) {
                    wkh.a m = wkh.Builder.m(Boolean.parseBoolean(this.I0), this.H0);
                    Integer m2 = ssq.m(this.D0);
                    if (m2 != null) {
                        i = m2.intValue();
                    }
                    wkh.a e = m.d(i).e(this.C0);
                    String str2 = this.E0;
                    if (str2 != null) {
                        jSONArray = JSON.parseArray(str2);
                    } else {
                        jSONArray = null;
                    }
                    wkh.a g = e.f(jSONArray).g(this.F0);
                    String str3 = this.G0;
                    if (str3 != null) {
                        jSONArray2 = JSON.parseArray(str3);
                    } else {
                        jSONArray2 = null;
                    }
                    wkh.a i3 = g.i(jSONArray2);
                    String str4 = this.J0;
                    if (str4 != null) {
                        jSONArray3 = JSON.parseArray(str4);
                    } else {
                        jSONArray3 = null;
                    }
                    wkh.a h = i3.h(jSONArray3);
                    DXWidgetNode sourceWidget = getSourceWidget();
                    if (!(sourceWidget == null || (dXRuntimeContext = sourceWidget.getDXRuntimeContext()) == null)) {
                        str = dXRuntimeContext.c();
                    }
                    mALottieView.setUpWithConfig(h.a(str).j(this.K0).b());
                    mALottieView.setTag(i2, bool);
                }
            }
        } catch (Throwable th) {
            la6.d(h36.TAG, this.L0, "DXMALottieViewWidgetNode render error " + th);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetListAttribute(long j, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb92d2ca", new Object[]{this, new Long(j), jSONArray});
            return;
        }
        ckf.g(jSONArray, "attr");
        if (j == 6746385450873234233L) {
            this.K0 = jSONArray;
        } else {
            super.onSetListAttribute(j, jSONArray);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
            return;
        }
        ckf.g(str, "attr");
        if (j != 9091485043305760827L) {
            if (j == 4991369220069624564L) {
                this.C0 = str;
            } else if (j == 2086518323790794956L) {
                this.D0 = str;
            } else if (j == 681874255820305570L) {
                this.E0 = str;
            } else if (j == 8819004586453307919L) {
                this.F0 = str;
            } else if (j == -686869780255228937L) {
                this.J0 = str;
            } else if (j == -3611250641858826260L) {
                this.G0 = str;
            } else if (j == 34149272427L) {
                this.H0 = str;
            } else if (j != 6421984658367506097L) {
                if (j == 9423384817756195L) {
                    this.I0 = str;
                } else {
                    super.onSetStringAttribute(j, str);
                }
            }
        }
    }
}
