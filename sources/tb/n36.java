package tb;

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
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.megadesign.anim.lottie.MALottieView;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import java.util.HashMap;
import tb.wkh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class n36 extends DXWidgetNode {
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

    /* renamed from: a  reason: collision with root package name */
    public String f24482a;
    public String c;
    public String d;
    public String e;
    public String f;
    public String h;
    public JSONArray i;
    public String j;
    public String b = "1";
    public String g = "false";
    public final String k = "MALottie";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
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
            n36.this.postEvent(new DXEvent(5288679758315475755L));
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
                return;
            }
            ckf.g(animator, "animation");
            n36.this.postEvent(new DXEvent(5288746714156027718L));
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
                return;
            }
            ckf.g(animator, "animation");
            n36.this.postEvent(new DXEvent(5176478572008687858L));
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
                n36.this.postEvent(new DXEvent(2873651788935849093L));
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
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
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
            n36.this.postEvent(dXEvent);
        }
    }

    public static /* synthetic */ Object ipc$super(n36 n36Var, String str, Object... objArr) {
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/megadesign/dx/view/DXMALottieViewWidgetNode");
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new n36();
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
        if (dXWidgetNode instanceof n36) {
            super.onClone(dXWidgetNode, z);
            n36 n36Var = (n36) dXWidgetNode;
            this.f = n36Var.f;
            this.g = n36Var.g;
            this.f24482a = n36Var.f24482a;
            this.b = n36Var.b;
            this.c = n36Var.c;
            this.d = n36Var.d;
            this.e = n36Var.e;
            this.h = n36Var.h;
            this.j = n36Var.j;
            this.i = n36Var.i;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        int i;
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONArray jSONArray3;
        DXRuntimeContext dXRuntimeContext;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        ckf.g(context, "context");
        mxv.INSTANCE.b("DXMALottieViewWidgetNode", v3i.f(jpu.a("ctxName", context.getClass().getName())));
        MALottieView mALottieView = new MALottieView(context);
        try {
            wkh.a c2 = wkh.Builder.c(this.f);
            Integer m = ssq.m(this.b);
            if (m != null) {
                i = m.intValue();
            } else {
                i = 0;
            }
            wkh.a e = c2.d(i).e(this.f24482a);
            String str = this.c;
            String str2 = null;
            if (str != null) {
                jSONArray = JSON.parseArray(str);
            } else {
                jSONArray = null;
            }
            wkh.a g = e.f(jSONArray).g(this.d);
            String str3 = this.e;
            if (str3 != null) {
                jSONArray2 = JSON.parseArray(str3);
            } else {
                jSONArray2 = null;
            }
            wkh.a l = g.i(jSONArray2).l(Boolean.parseBoolean(this.g));
            String str4 = this.h;
            if (str4 != null) {
                jSONArray3 = JSON.parseArray(str4);
            } else {
                jSONArray3 = null;
            }
            wkh.a h = l.h(jSONArray3);
            DXWidgetNode sourceWidget = getSourceWidget();
            if (!(sourceWidget == null || (dXRuntimeContext = sourceWidget.getDXRuntimeContext()) == null)) {
                str2 = dXRuntimeContext.c();
            }
            wkh.a j = h.a(str2).j(this.i);
            String str5 = this.j;
            if (str5 == null || !Boolean.parseBoolean(str5)) {
                z = false;
            }
            mALottieView.setUpWithConfig(j.k(z).b());
        } catch (Throwable th) {
            TLog.loge("MegaDesign", this.k, "DXMALottieViewWidgetNode render error " + th);
        }
        return mALottieView;
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
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        ckf.g(context, "context");
        ckf.g(view, "animationView");
        super.onRenderView(context, view);
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
            this.i = jSONArray;
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
                this.f24482a = str;
            } else if (j == 2086518323790794956L) {
                this.b = str;
            } else if (j == 681874255820305570L) {
                this.c = str;
            } else if (j == 8819004586453307919L) {
                this.d = str;
            } else if (j == -686869780255228937L) {
                this.h = str;
            } else if (j == -3611250641858826260L) {
                this.e = str;
            } else if (j == 34149272427L) {
                this.f = str;
            } else if (j == 6421984658367506097L) {
                this.j = str;
            } else if (j == 9423384817756195L) {
                this.g = str;
            } else {
                super.onSetStringAttribute(j, str);
            }
        }
    }
}
