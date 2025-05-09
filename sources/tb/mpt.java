package tb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.pop.render.ActivityLifeCycleCbRender;
import com.taobao.android.abilitykit.ability.pop.render.IAKPopRender;
import com.taobao.android.abilitykit.ability.pop.render.PopErrorView;
import com.taobao.falco.s;
import com.taobao.themis.external.embed.SinglePageStartParams;
import com.taobao.themis.external.embed.TMSEmbed;
import com.taobao.themis.kernel.extension.page.rum.TMSRumTarget;
import com.taobao.weex.common.Constants;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import tb.h9;
import tb.jzw;
import tb.n9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class mpt<P extends h9, CTX extends n9> extends ActivityLifeCycleCbRender<P, CTX> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean f = true;
    public TMSEmbed g;
    public boolean h;
    public gc0 i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a extends TMSEmbed.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ iab b;
        public final /* synthetic */ n9 c;

        public a(SinglePageStartParams singlePageStartParams, Ref$LongRef ref$LongRef, h9 h9Var, iab iabVar, n9 n9Var) {
            this.b = iabVar;
            this.c = n9Var;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbabilitykit/themis/render/ThemisRender$doCreateView$$inlined$let$lambda$1");
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void l(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e972d0d", new Object[]{this, str, str2});
                return;
            }
            ckf.g(str, "errorCode");
            ckf.g(str2, "errorMsg");
            iab iabVar = this.b;
            iabVar.a(new a8(10000, "weex 2.0 error code:" + str + ", msg:" + str2), new PopErrorView(this.c.d(), mpt.o(mpt.this)));
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void n() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("edfb8375", new Object[]{this});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b implements oce {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f24220a;
        public final /* synthetic */ mpt b;
        public final /* synthetic */ iab c;

        public b(View view, mpt mptVar, SinglePageStartParams singlePageStartParams, Ref$LongRef ref$LongRef, h9 h9Var, iab iabVar, n9 n9Var) {
            this.f24220a = view;
            this.b = mptVar;
            this.c = iabVar;
        }

        @Override // tb.oce
        public void a(Map<String, ? extends Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("267b7fce", new Object[]{this, map});
                return;
            }
            ViewGroup viewGroup = null;
            mpt.p(this.b, ckf.b(map != null ? map.get("state") : null, Boolean.TRUE));
            View view = this.f24220a;
            if (view instanceof ViewGroup) {
                viewGroup = view;
            }
            ViewGroup viewGroup2 = viewGroup;
            if (viewGroup2 != null) {
                viewGroup2.requestDisallowInterceptTouchEvent(mpt.f(this.b));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class d implements jzw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f24222a;
        public final /* synthetic */ mpt b;
        public final /* synthetic */ iab c;

        public d(View view, mpt mptVar, SinglePageStartParams singlePageStartParams, Ref$LongRef ref$LongRef, h9 h9Var, iab iabVar, n9 n9Var) {
            this.f24222a = view;
            this.b = mptVar;
            this.c = iabVar;
        }

        @Override // tb.jzw
        public void a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
            boolean z2 = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e93d6ab5", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8), new Boolean(z)});
                return;
            }
            mpt mptVar = this.b;
            if (i4 <= 0 || i6 <= 0) {
                z2 = false;
            }
            mpt.p(mptVar, z2);
            View view = this.f24222a;
            if (!(view instanceof ViewGroup)) {
                view = null;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup != null) {
                viewGroup.requestDisallowInterceptTouchEvent(mpt.f(this.b));
            }
            jzw.a.b(this, i, i2, i3, i4, i5, i6, i7, i8, z);
        }

        @Override // tb.jzw
        public void dispatchTouchEvent(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7bb68bd1", new Object[]{this, motionEvent});
                return;
            }
            ckf.d(motionEvent);
            if (motionEvent.getActionMasked() == 0 || motionEvent.getPointerCount() > 1) {
                mpt.p(this.b, true);
            }
            jzw.a.a(this, motionEvent);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class e implements s.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f24223a;

        public e(Ref$ObjectRef ref$ObjectRef) {
            this.f24223a = ref$ObjectRef;
        }

        @Override // com.taobao.falco.s.b
        public final void onTouchActionSpan(s sVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b740c373", new Object[]{this, sVar});
            } else if (sVar != null) {
                try {
                    i2c i2cVar = (i2c) this.f24223a.element;
                    if (i2cVar != null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("fromPageName", sVar.getPageName());
                        hashMap.put("fromPageURL", sVar.c());
                        xhv xhvVar = xhv.INSTANCE;
                        i2cVar.S(hashMap, TMSRumTarget.STANDARD);
                    }
                } catch (Throwable th) {
                    iih iihVar = iih.INSTANCE;
                    iihVar.a("stdPopTag", "[themisSpan]parse url error: " + pr.d(th));
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class f implements gc0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // tb.gc0
        public void onActivityResult(int i, int i2, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
                return;
            }
            TMSEmbed g = mpt.g(mpt.this);
            if (g != null) {
                g.l(i, i2, intent);
            }
        }
    }

    static {
        t2o.a(786432130);
    }

    public static final /* synthetic */ boolean f(mpt mptVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bfe55f7e", new Object[]{mptVar})).booleanValue();
        }
        return mptVar.f;
    }

    public static final /* synthetic */ TMSEmbed g(mpt mptVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSEmbed) ipChange.ipc$dispatch("b7bb9ace", new Object[]{mptVar});
        }
        return mptVar.g;
    }

    public static /* synthetic */ Object ipc$super(mpt mptVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1314487601:
                super.n((String) objArr[0], (JSONObject) objArr[1]);
                return null;
            case 462397159:
                super.onDestroyView();
                return null;
            case 1003079939:
                super.m((View) objArr[0]);
                return null;
            case 1885737845:
                super.k((View) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbabilitykit/themis/render/ThemisRender");
        }
    }

    public static final /* synthetic */ h9 o(mpt mptVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h9) ipChange.ipc$dispatch("9b16de6e", new Object[]{mptVar});
        }
        return mptVar.c;
    }

    public static final /* synthetic */ void p(mpt mptVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a430090e", new Object[]{mptVar, new Boolean(z)});
        } else {
            mptVar.f = z;
        }
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.ActivityLifeCycleCbRender
    public void e(String str, Bundle bundle) {
        TMSEmbed tMSEmbed;
        TMSEmbed tMSEmbed2;
        TMSEmbed tMSEmbed3;
        TMSEmbed tMSEmbed4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59cc3545", new Object[]{this, str, bundle});
            return;
        }
        ckf.g(str, "eventType");
        switch (str.hashCode()) {
            case -560905822:
                if (str.equals("onStarted") && (tMSEmbed = this.g) != null) {
                    tMSEmbed.n();
                    return;
                }
                return;
            case -548039954:
                if (str.equals("onStopped") && (tMSEmbed2 = this.g) != null) {
                    tMSEmbed2.o();
                    return;
                }
                return;
            case 1403088877:
                if (str.equals("onPaused") && (tMSEmbed3 = this.g) != null) {
                    tMSEmbed3.k();
                    return;
                }
                return;
            case 1463983852:
                if (str.equals("onResume") && (tMSEmbed4 = this.g) != null) {
                    tMSEmbed4.m();
                    return;
                }
                return;
            case 1955975930:
                if (str.equals("onDestroyed")) {
                    q();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public String i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f8e8363f", new Object[]{this, str});
        }
        if (str == null) {
            return "h5";
        }
        boolean b2 = com.taobao.android.weex.b.d().b(str);
        this.h = b2;
        if (b2) {
            return "weex2";
        }
        return "h5";
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.ActivityLifeCycleCbRender, com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void k(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70661375", new Object[]{this, view});
            return;
        }
        super.k(view);
        TMSEmbed tMSEmbed = this.g;
        if (tMSEmbed != null) {
            tMSEmbed.q();
        }
        gc0 gc0Var = this.i;
        if (gc0Var != null && (d() instanceof fc0)) {
            Activity d2 = d();
            if (d2 != null) {
                ((fc0) d2).M1(gc0Var);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.tbabilitykit.pop.ActivityResultDispatcher");
        }
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public boolean l(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("21f6b89a", new Object[]{this, view, new Integer(i)})).booleanValue();
        }
        ckf.g(view, "contentView");
        if (i < 0) {
            return false;
        }
        return this.f;
    }

    @Override // tb.zz1, com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void m(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bc9c903", new Object[]{this, view});
            return;
        }
        super.m(view);
        TMSEmbed tMSEmbed = this.g;
        if (tMSEmbed != null) {
            tMSEmbed.p();
        }
    }

    @Override // tb.zz1, com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void n(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a682cf", new Object[]{this, str, jSONObject});
            return;
        }
        ckf.g(str, "type");
        super.n(str, jSONObject);
        if (!ckf.b(IAKPopRender.LifecycleType.ANIMATION_POSITION_CHANGE, str)) {
            if (this.h) {
                TMSEmbed tMSEmbed = this.g;
                if (tMSEmbed != null) {
                    tMSEmbed.e(str, jSONObject, "document");
                    return;
                }
                return;
            }
            TMSEmbed tMSEmbed2 = this.g;
            if (tMSEmbed2 != null) {
                TMSEmbed.f(tMSEmbed2, str, jSONObject, null, 4, null);
            }
        }
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.ActivityLifeCycleCbRender, tb.zz1, com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void onDestroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
            return;
        }
        super.onDestroyView();
        q();
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void onSizeChanged(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb57503b", new Object[]{this, new Integer(i), new Integer(i2)});
        }
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        try {
            TMSEmbed tMSEmbed = this.g;
            if (tMSEmbed != null) {
                tMSEmbed.d();
            }
        } catch (Throwable th) {
            iih iihVar = iih.INSTANCE;
            iihVar.a("stdPopTag", "themis destroy error: " + pr.d(th));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class c implements cde {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f24221a;
        public final /* synthetic */ mpt b;
        public final /* synthetic */ iab c;

        public c(View view, mpt mptVar, SinglePageStartParams singlePageStartParams, Ref$LongRef ref$LongRef, h9 h9Var, iab iabVar, n9 n9Var) {
            this.f24221a = view;
            this.b = mptVar;
            this.c = iabVar;
        }

        @Override // tb.cde
        public void a(Map<String, ? extends Object> map) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4568a0fc", new Object[]{this, map});
                return;
            }
            ViewGroup viewGroup = null;
            Object obj = map != null ? map.get(Constants.Name.CONTENT_OFFSET) : null;
            if (obj instanceof org.json.JSONObject) {
                mpt mptVar = this.b;
                if (((org.json.JSONObject) obj).getDouble("y") >= 0) {
                    z = false;
                }
                mpt.p(mptVar, z);
                View view = this.f24221a;
                if (view instanceof ViewGroup) {
                    viewGroup = view;
                }
                ViewGroup viewGroup2 = viewGroup;
                if (viewGroup2 != null) {
                    viewGroup2.requestDisallowInterceptTouchEvent(mpt.f(this.b));
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, tb.i2c] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // com.taobao.android.abilitykit.ability.pop.render.ActivityLifeCycleCbRender
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(CTX r17, P r18, android.view.View r19, tb.iab r20) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.mpt.c(tb.n9, tb.h9, android.view.View, tb.iab):void");
    }
}
