package tb;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.communication.ThreadMode;
import com.taobao.android.detail.ttdetail.component.ComponentViewMeta;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import com.taobao.android.detail.ttdetail.component.module.DinamicXComponent;
import com.taobao.android.detail.ttdetail.handler.AbilityCenter;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.UpdateItemImplementor;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.widget.scrollerlayout.TTDetailScrollerLayout;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class mwy extends oa4<nb4> implements ntc<ux1<JSONObject>>, TTDetailScrollerLayout.c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE_CLOSE = "closeRedPacket";
    public static final String EVENT_TYPE_COUNT_DOWN_END = "redPacketCountdownEnd";
    public static final int GONE = 0;
    public static final int MAYBE_VISIBLE = 1;
    public static final int VISIBLE = 2;
    public String A;
    public int B;
    public int C = 75;
    public int D = 127;
    public int E = 12;
    public JSONObject F;
    public FrameLayout G;
    public DinamicXComponent y;
    public ObjectAnimator z;
    public static final b Companion = new b(null);
    public static final HashMap<String, Boolean> H = new HashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public final class a implements zre {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(912261787);
            t2o.a(912261826);
        }

        public a() {
        }

        @Override // tb.zre
        public boolean a(ir irVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5228eae5", new Object[]{this, irVar, runtimeAbilityParamArr})).booleanValue();
            }
            ckf.h(runtimeAbilityParamArr, "runtimeParams");
            View e = mwy.this.e();
            if (e != null) {
                e.setVisibility(8);
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(912261788);
        }

        public b() {
        }

        public final HashMap<String, Boolean> a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HashMap) ipChange.ipc$dispatch("2ca5407e", new Object[]{this});
            }
            return mwy.c();
        }

        public /* synthetic */ b(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public final class c implements zre {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(912261789);
            t2o.a(912261826);
        }

        public c() {
        }

        @Override // tb.zre
        public boolean a(ir irVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5228eae5", new Object[]{this, irVar, runtimeAbilityParamArr})).booleanValue();
            }
            ckf.h(runtimeAbilityParamArr, "runtimeParams");
            View e = mwy.this.e();
            if (e != null) {
                e.setVisibility(8);
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            String b = mwy.b(mwy.this);
            if (b != null) {
                b bVar = mwy.Companion;
                if (ckf.b(bVar.a().get(b), Boolean.FALSE)) {
                    mwy.a(mwy.this);
                    bVar.a().put(b, Boolean.TRUE);
                }
            }
        }
    }

    static {
        t2o.a(912261786);
        t2o.a(912261362);
        t2o.a(912263095);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mwy(Context context, ze7 ze7Var, nb4 nb4Var, DataEntry... dataEntryArr) {
        super(context, ze7Var, nb4Var, (DataEntry[]) Arrays.copyOf(dataEntryArr, dataEntryArr.length));
        ckf.h(context, "context");
        ckf.h(dataEntryArr, "initComponentData");
        u(nb4Var);
    }

    public static final /* synthetic */ void a(mwy mwyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da515ab9", new Object[]{mwyVar});
        } else {
            mwyVar.d();
        }
    }

    public static final /* synthetic */ String b(mwy mwyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eaddca81", new Object[]{mwyVar});
        }
        return mwyVar.A;
    }

    public static final /* synthetic */ HashMap c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("3977ece7", new Object[0]);
        }
        return H;
    }

    public static /* synthetic */ Object ipc$super(mwy mwyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/floatview/TTDetailPacketComponent");
    }

    @Override // tb.ntc
    public ThreadMode W2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadMode) ipChange.ipc$dispatch("e1b5ec98", new Object[]{this});
        }
        return ThreadMode.MainThread;
    }

    public final void c0(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("712fdbbd", new Object[]{this, context});
        } else if (context != null) {
            q84.i(context, wuy.class, this);
        }
    }

    public final void d0(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("268769c9", new Object[]{this, frameLayout});
            return;
        }
        ckf.h(frameLayout, "mRedPacketContainer");
        this.G = frameLayout;
    }

    public final View e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("5ea2fce5", new Object[]{this});
        }
        FrameLayout frameLayout = this.G;
        if (frameLayout != null) {
            return frameLayout.findViewWithTag("TTDetailPacketComponent");
        }
        return null;
    }

    public final JSONObject h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5e91cd34", new Object[]{this});
        }
        return this.F;
    }

    public final void h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cea4712", new Object[]{this});
            return;
        }
        Context context = this.mContext;
        if (context != null) {
            q84.l(context, wuy.class);
        }
    }

    public final int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e185e044", new Object[]{this})).intValue();
        }
        return this.D;
    }

    public final int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b7b59e45", new Object[]{this})).intValue();
        }
        return this.E;
    }

    public final int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8da7d8bd", new Object[]{this})).intValue();
        }
        return this.C;
    }

    @Override // com.taobao.android.detail.ttdetail.widget.scrollerlayout.TTDetailScrollerLayout.c
    public void m(View view, int i, int i2, int i3) {
        View e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f709b34", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        String str = this.A;
        if (str != null && (e = e()) != null && e.getVisibility() == 0 && Math.abs(i - i2) > 2) {
            HashMap<String, Boolean> hashMap = H;
            if (ckf.b(hashMap.get(str), Boolean.TRUE)) {
                a0();
                hashMap.put(str, Boolean.FALSE);
            }
        }
    }

    @Override // tb.oa4
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        h0();
        DinamicXComponent dinamicXComponent = this.y;
        if (dinamicXComponent != null) {
            dinamicXComponent.destroy();
        }
        ObjectAnimator objectAnimator = this.z;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        String str = this.A;
        if (str != null) {
            H.remove(str);
        }
    }

    @Override // tb.oa4
    public void onDidAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("914171dc", new Object[]{this});
            return;
        }
        DinamicXComponent dinamicXComponent = this.y;
        if (dinamicXComponent != null) {
            dinamicXComponent.willAppear();
            dinamicXComponent.didAppear();
        }
    }

    @Override // tb.oa4
    public void onDisAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aa7eb2b", new Object[]{this});
            return;
        }
        DinamicXComponent dinamicXComponent = this.y;
        if (dinamicXComponent != null) {
            dinamicXComponent.willDisAppear();
            dinamicXComponent.disAppear();
        }
    }

    @Override // tb.oa4
    public View onGetComponentView(View view) {
        View view2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f631742", new Object[]{this, view});
        }
        FrameLayout frameLayout = this.G;
        if (frameLayout != null) {
            frameLayout.setOnClickListener(new d());
        }
        DinamicXComponent dinamicXComponent = this.y;
        View view3 = null;
        if (dinamicXComponent != null) {
            dinamicXComponent.create();
            FrameLayout frameLayout2 = this.G;
            if (frameLayout2 != null) {
                view2 = frameLayout2.findViewWithTag("TTDetailPacketComponent");
            } else {
                view2 = null;
            }
            if (view2 != null) {
                ygw.a(view2);
            }
            View componentView = dinamicXComponent.getComponentView(view2);
            if (componentView != null) {
                componentView.setTag("TTDetailPacketComponent");
                view3 = componentView;
            }
            dinamicXComponent.willAppear();
            dinamicXComponent.didAppear();
        }
        return view3;
    }

    public final int t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8b0ee014", new Object[]{this})).intValue();
        }
        return this.B;
    }

    public final void u(nb4 nb4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63be2b8b", new Object[]{this, nb4Var});
            return;
        }
        try {
            ze7 ze7Var = this.mDetailContext;
            ckf.c(ze7Var, "mDetailContext");
            c0(ze7Var.c());
            ze7 ze7Var2 = this.mDetailContext;
            ckf.c(ze7Var2, "mDetailContext");
            ze7Var2.b().i(EVENT_TYPE_CLOSE, new a());
            ze7 ze7Var3 = this.mDetailContext;
            ckf.c(ze7Var3, "mDetailContext");
            ze7Var3.b().i(EVENT_TYPE_COUNT_DOWN_END, new c());
            if (!(nb4Var == null || nb4Var.f() == null)) {
                if (nb4Var.f().getJSONObject("layout") != null) {
                    tgh.b("TTDetailPacketComponent", "layout is null");
                    this.C = nb4Var.f().getJSONObject("layout").getIntValue("width");
                    this.D = nb4Var.f().getJSONObject("layout").getIntValue("height");
                    this.E = nb4Var.f().getJSONObject("layout").getIntValue("marginRight");
                }
                JSONObject jSONObject = nb4Var.f().getJSONObject("template");
                if (jSONObject == null) {
                    tgh.b("TTDetailPacketComponent", "template is null");
                    return;
                }
                String str = "dinamicx$" + jSONObject.getString("name") + "$" + jSONObject.getString("version");
                jSONObject.put("type", "dinamicx");
                ComponentViewMeta componentViewMeta = new ComponentViewMeta(jSONObject);
                ze7 ze7Var4 = this.mDetailContext;
                ckf.c(ze7Var4, "mDetailContext");
                ze7Var4.d().h(str, componentViewMeta);
                JSONObject jSONObject2 = nb4Var.f().getJSONObject("packetData");
                this.F = jSONObject2;
                JSONObject jSONObject3 = null;
                if (jSONObject2 == null) {
                    viq i = this.mDetailContext.i();
                    String str2 = i != null ? (String) i.c("requestItemId") : null;
                    HashMap hashMap = new HashMap();
                    if (str2 == null) {
                        str2 = "";
                    }
                    hashMap.put("itemId", str2);
                    bw7.b(hashMap, -100044, "packetData is null");
                }
                if (jSONObject2 != null) {
                    String string = jSONObject2.getString("status");
                    this.B = string != null ? Integer.parseInt(string) : 0;
                }
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("type", (Object) str);
                jSONObject4.put("fields", (Object) jSONObject2);
                JSONObject d2 = nb4Var.d();
                if (d2 != null) {
                    jSONObject3 = d2.getJSONObject("events");
                }
                jSONObject4.put("events", (Object) jSONObject3);
                ze7 ze7Var5 = this.mDetailContext;
                ckf.c(ze7Var5, "mDetailContext");
                oc4 d3 = ze7Var5.d();
                ze7 ze7Var6 = this.mDetailContext;
                ckf.c(ze7Var6, "mDetailContext");
                this.y = (DinamicXComponent) d3.b(new nb4(jSONObject4, ze7Var6.b().d()), new DataEntry[0]);
                viq i2 = this.mDetailContext.i();
                ckf.c(i2, "mDetailContext.getStateCenter()");
                String b2 = i2.b();
                this.A = b2;
                if (b2 != null) {
                    HashMap<String, Boolean> hashMap2 = H;
                    if (hashMap2.get(b2) == null) {
                        hashMap2.put(b2, Boolean.TRUE);
                        return;
                    }
                    return;
                }
                return;
            }
            tgh.b("TTDetailPacketComponent", "componentData or componentData.fields is null");
        } catch (Exception e) {
            tgh.c("TTDetailPacketComponent", "initData error", e);
        }
    }

    public final void a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7421bb6", new Object[]{this});
            return;
        }
        View e = e();
        if (e != null && e.getVisibility() == 0) {
            FrameLayout frameLayout = this.G;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.G, "translationX", 0.0f, ((frameLayout != null ? frameLayout.getWidth() : 0) * 2.0f) / 3.0f);
            ofFloat.setDuration(300L);
            ofFloat.start();
            this.z = ofFloat;
        }
    }

    /* renamed from: b0 */
    public boolean y1(ux1<JSONObject> ux1Var) {
        nb4 componentData;
        JSONObject f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b5282b4", new Object[]{this, ux1Var})).booleanValue();
        }
        if (ux1Var != null) {
            try {
                if (this.mDetailContext != null && (ux1Var instanceof wuy)) {
                    String e = ((wuy) ux1Var).e();
                    String g = ((wuy) ux1Var).g();
                    JSONObject f2 = ((wuy) ux1Var).f();
                    viq i = this.mDetailContext.i();
                    String str = null;
                    String str2 = i != null ? (String) i.c("requestItemId") : null;
                    viq i2 = this.mDetailContext.i();
                    if (i2 != null) {
                        str = i2.b();
                    }
                    if (ckf.b(e, str2) && ckf.b(g, str)) {
                        DinamicXComponent dinamicXComponent = this.y;
                        if (!(dinamicXComponent == null || (componentData = dinamicXComponent.getComponentData()) == null || (f = componentData.f()) == null)) {
                            f.putAll(f2);
                            f.put("enableAnimation", (Object) "true");
                        }
                        DinamicXComponent dinamicXComponent2 = this.y;
                        if (dinamicXComponent2 != null) {
                            dinamicXComponent2.updateComponent();
                        }
                        FrameLayout frameLayout = this.G;
                        if (frameLayout != null) {
                            frameLayout.setVisibility(0);
                        }
                        DinamicXComponent dinamicXComponent3 = this.y;
                        if (dinamicXComponent3 != null) {
                            dinamicXComponent3.willAppear();
                        }
                        DinamicXComponent dinamicXComponent4 = this.y;
                        if (dinamicXComponent4 != null) {
                            dinamicXComponent4.didAppear();
                        }
                    }
                    AbilityCenter b2 = this.mDetailContext.b();
                    if (b2 != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("type", (Object) UpdateItemImplementor.EVENT_TYPE);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("itemId", (Object) str2);
                        jSONObject.put("fields", (Object) jSONObject2);
                        b2.h(new ir(jSONObject), new RuntimeAbilityParam[0]);
                    }
                    return true;
                }
            } catch (Exception e2) {
                tgh.c("TTDetailPacketComponent", "receiveMessage error", e2);
            }
        }
        return false;
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e85408d", new Object[]{this});
            return;
        }
        View e = e();
        if (e != null && e.getVisibility() == 0) {
            FrameLayout frameLayout = this.G;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.G, "translationX", ((frameLayout != null ? frameLayout.getWidth() : 0) * 2.0f) / 3.0f, 0.0f);
            ofFloat.setDuration(300L);
            ofFloat.start();
            this.z = ofFloat;
        }
    }
}
