package com.taobao.android.tbabilitykit.weex.pop.render;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.pop.render.AKFragmentPopRender;
import com.taobao.android.abilitykit.ability.pop.render.IAKPopRender;
import com.taobao.android.abilitykit.ability.pop.render.PopErrorView;
import com.taobao.android.weex.WeexExternalEventType;
import com.taobao.android.weex.WeexInstance;
import com.taobao.weex.common.Constants;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import tb.a8;
import tb.a9;
import tb.abl;
import tb.ckf;
import tb.dde;
import tb.e9;
import tb.g1a;
import tb.h9;
import tb.iab;
import tb.m5x;
import tb.n9;
import tb.q9;
import tb.t2o;
import tb.tsd;
import tb.u1a;
import tb.v4x;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class TAKWeex2Render<P extends a9, CTX extends n9> extends AKFragmentPopRender<P, CTX> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public v4x h;
    public boolean i;
    public final boolean j;
    public boolean k;
    public iab l;
    public CTX m;
    public final m5x n;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.tbabilitykit.weex.pop.render.TAKWeex2Render$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements u1a<Integer, String, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AnonymousClass1() {
            super(2);
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbabilitykit/weex/pop/render/TAKWeex2Render$1");
        }

        @Override // tb.u1a
        public /* bridge */ /* synthetic */ xhv invoke(Integer num, String str) {
            invoke2(num, str);
            return xhv.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Integer num, String str) {
            iab v;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("795a6ae2", new Object[]{this, num, str});
            } else if (TAKWeex2Render.y(TAKWeex2Render.this) != null && TAKWeex2Render.this.B() != null && TAKWeex2Render.z(TAKWeex2Render.this) != null && (v = TAKWeex2Render.v(TAKWeex2Render.this)) != null) {
                v.a(new a8(10000, "weex 2.0 error code:" + num + ", msg:" + str), new PopErrorView(TAKWeex2Render.y(TAKWeex2Render.this), TAKWeex2Render.z(TAKWeex2Render.this)));
            }
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.tbabilitykit.weex.pop.render.TAKWeex2Render$2  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class AnonymousClass2 extends Lambda implements g1a<Boolean, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AnonymousClass2() {
            super(1);
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbabilitykit/weex/pop/render/TAKWeex2Render$2");
        }

        @Override // tb.g1a
        public /* bridge */ /* synthetic */ xhv invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return xhv.INSTANCE;
        }

        public final void invoke(boolean z) {
            ViewGroup x;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("36b985b5", new Object[]{this, new Boolean(z)});
                return;
            }
            TAKWeex2Render.A(TAKWeex2Render.this, z);
            if (TAKWeex2Render.u(TAKWeex2Render.this) && (x = TAKWeex2Render.x(TAKWeex2Render.this)) != null) {
                x.requestDisallowInterceptTouchEvent(TAKWeex2Render.w(TAKWeex2Render.this));
            }
        }
    }

    static {
        t2o.a(786432147);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TAKWeex2Render(m5x m5xVar) {
        super(m5xVar.b());
        ckf.g(m5xVar, "weexFragmentProxy");
        this.n = m5xVar;
        boolean t = abl.t();
        this.j = t;
        m5xVar.g(new AnonymousClass1());
        m5xVar.e(new AnonymousClass2());
        if (t) {
            m5xVar.f(new a());
        }
        this.k = true;
    }

    public static final /* synthetic */ void A(TAKWeex2Render tAKWeex2Render, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98fa998", new Object[]{tAKWeex2Render, new Boolean(z)});
        } else {
            tAKWeex2Render.k = z;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object ipc$super(TAKWeex2Render tAKWeex2Render, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1314487601) {
            super.n((String) objArr[0], (JSONObject) objArr[1]);
            return null;
        } else if (hashCode == -1273288698) {
            super.j((n9) objArr[0], (a9) objArr[1], (View) objArr[2], (iab) objArr[3]);
            return null;
        } else if (hashCode == -883470277) {
            super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/tbabilitykit/weex/pop/render/TAKWeex2Render");
        }
    }

    public static final /* synthetic */ boolean u(TAKWeex2Render tAKWeex2Render) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8135f608", new Object[]{tAKWeex2Render})).booleanValue();
        }
        return tAKWeex2Render.j;
    }

    public static final /* synthetic */ iab v(TAKWeex2Render tAKWeex2Render) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iab) ipChange.ipc$dispatch("962ab4b8", new Object[]{tAKWeex2Render});
        }
        return tAKWeex2Render.l;
    }

    public static final /* synthetic */ boolean w(TAKWeex2Render tAKWeex2Render) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3f46ebb4", new Object[]{tAKWeex2Render})).booleanValue();
        }
        return tAKWeex2Render.k;
    }

    public static final /* synthetic */ ViewGroup x(TAKWeex2Render tAKWeex2Render) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("c7a95a44", new Object[]{tAKWeex2Render});
        }
        return tAKWeex2Render.g();
    }

    public static final /* synthetic */ FragmentActivity y(TAKWeex2Render tAKWeex2Render) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentActivity) ipChange.ipc$dispatch("f4f76cff", new Object[]{tAKWeex2Render});
        }
        return tAKWeex2Render.o();
    }

    public static final /* synthetic */ h9 z(TAKWeex2Render tAKWeex2Render) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h9) ipChange.ipc$dispatch("d3fca224", new Object[]{tAKWeex2Render});
        }
        return tAKWeex2Render.c;
    }

    public final CTX B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CTX) ((n9) ipChange.ipc$dispatch("35a55feb", new Object[]{this}));
        }
        return this.m;
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.AKFragmentPopRender, com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public String i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f8e8363f", new Object[]{this, str});
        }
        return "weex2";
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.AKFragmentPopRender, com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public boolean l(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("21f6b89a", new Object[]{this, view, new Integer(i)})).booleanValue();
        }
        ckf.g(view, "contentView");
        if (i < 0) {
            return false;
        }
        return this.k;
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.AKFragmentPopRender, com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void onSizeChanged(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb57503b", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        v4x v4xVar = this.h;
        if (v4xVar != null) {
            v4xVar.a(new Rect(0, 0, i, i2));
            this.n.d(v4xVar);
        }
        super.onSizeChanged(i, i2);
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.AKFragmentPopRender
    /* renamed from: q */
    public void j(CTX ctx, P p, View view, iab iabVar) {
        Object tag;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b41b2806", new Object[]{this, ctx, p, view, iabVar});
            return;
        }
        ckf.g(ctx, "akCtx");
        ckf.g(p, "params");
        ckf.g(iabVar, "callback");
        this.l = iabVar;
        this.m = ctx;
        this.c = p;
        v4x v4xVar = new v4x();
        this.h = v4xVar;
        this.n.d(v4xVar);
        super.j(ctx, p, view, iabVar);
        q9 e = ctx.e();
        tsd tsdVar = null;
        Object a2 = e != null ? e.a() : null;
        if (!(a2 instanceof HashMap)) {
            a2 = null;
        }
        HashMap hashMap = (HashMap) a2;
        if (hashMap == null) {
            return;
        }
        if (hashMap.get("instance") instanceof com.taobao.android.weex_framework.a) {
            Object obj = hashMap.get("instance");
            if (obj != null) {
                Object tag2 = ((com.taobao.android.weex_framework.a) obj).getTag("std_pop_anim_listener");
                if (tag2 instanceof tsd) {
                    tsdVar = tag2;
                }
                tsd tsdVar2 = tsdVar;
                if (tsdVar2 != null) {
                    b(tsdVar2);
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.weex_framework.MUSInstance");
        }
        Object obj2 = hashMap.get("instance");
        if (obj2 instanceof WeexInstance) {
            tsdVar = obj2;
        }
        WeexInstance weexInstance = tsdVar;
        if (weexInstance != null && (tag = weexInstance.getTag("std_pop_anim_listener")) != null && (tag instanceof tsd)) {
            b((tsd) tag);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a implements dde {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.dde
        public final void a(Map<String, Object> map) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4568a0fc", new Object[]{this, map});
                return;
            }
            Object obj = map.get(Constants.Name.CONTENT_OFFSET);
            if (obj instanceof org.json.JSONObject) {
                TAKWeex2Render tAKWeex2Render = TAKWeex2Render.this;
                if (((org.json.JSONObject) obj).getDouble("y") >= 0) {
                    z = false;
                }
                TAKWeex2Render.A(tAKWeex2Render, z);
                ViewGroup x = TAKWeex2Render.x(TAKWeex2Render.this);
                if (x != null) {
                    x.requestDisallowInterceptTouchEvent(TAKWeex2Render.w(TAKWeex2Render.this));
                }
            }
        }
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.AKFragmentPopRender, tb.zz1, com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void n(String str, JSONObject jSONObject) {
        e9 e9Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a682cf", new Object[]{this, str, jSONObject});
            return;
        }
        ckf.g(str, "type");
        super.n(str, jSONObject);
        if (ckf.b(str, IAKPopRender.LifecycleType.OFFSET_ENABLE) || ckf.b(str, IAKPopRender.LifecycleType.OFFSET_DISABLE)) {
            this.n.h();
        }
        if ((ckf.b(str, IAKPopRender.LifecycleType.IN_ANIMATION_END) || ckf.b(str, IAKPopRender.LifecycleType.CHANGE_SIZE_END)) && !abl.M()) {
            this.n.h();
        }
        h9 h9Var = this.c;
        if (!(h9Var == null || (e9Var = h9Var.f20479a) == null || !e9Var.J())) {
            JSONObject jSONObject2 = null;
            if (ckf.b(str, IAKPopRender.LifecycleType.CHANGE_POSITION) || ckf.b(str, IAKPopRender.LifecycleType.ANIMATION_POSITION_CHANGE)) {
                Object obj = jSONObject != null ? jSONObject.get("data") : null;
                if (!(obj instanceof JSONObject)) {
                    obj = null;
                }
                JSONObject jSONObject3 = (JSONObject) obj;
                if (jSONObject3 != null) {
                    if (!this.i) {
                        this.i = true;
                        this.n.c(jSONObject3, o(), WeexExternalEventType.START);
                    }
                    this.n.c(jSONObject3, o(), WeexExternalEventType.UPDATE);
                }
            }
            if (ckf.b(str, IAKPopRender.LifecycleType.OUT_ANIMATION_END) || ckf.b(str, IAKPopRender.LifecycleType.IN_ANIMATION_END) || ckf.b(str, IAKPopRender.LifecycleType.PAN_ANIMATION_RECOVER_END)) {
                Object obj2 = jSONObject != null ? jSONObject.get("data") : null;
                if (obj2 instanceof JSONObject) {
                    jSONObject2 = obj2;
                }
                JSONObject jSONObject4 = jSONObject2;
                if (jSONObject4 != null) {
                    if (!this.i) {
                        this.n.c(jSONObject4, o(), WeexExternalEventType.START);
                    }
                    this.i = false;
                    this.n.c(jSONObject4, o(), WeexExternalEventType.END);
                }
            }
        }
        if (!ckf.b(IAKPopRender.LifecycleType.ANIMATION_POSITION_CHANGE, str)) {
            this.n.a(str, jSONObject);
        }
    }
}
