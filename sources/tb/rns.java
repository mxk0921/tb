package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.performance.PreRenderManager;
import com.taobao.android.detail.ttdetail.widget.ObserverImageView;
import com.taobao.android.detail.ttdetail.widget.scrollerlayout.TTDetailScrollerLayout;
import com.taobao.taobao.R;
import java.util.Arrays;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class rns extends hrj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public final LinearLayout c;
    public boolean d;
    public int e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        static {
            t2o.a(912262565);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(912262564);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rns(Context context, ze7 ze7Var, nb4 nb4Var, DataEntry... dataEntryArr) {
        super(context, ze7Var, nb4Var, (DataEntry[]) Arrays.copyOf(dataEntryArr, dataEntryArr.length));
        LinearLayout linearLayout;
        ckf.h(context, "context");
        ckf.h(dataEntryArr, "initComponentData");
        this.mContext = context;
        PreRenderManager g = PreRenderManager.g(context);
        if (g != null) {
            View j = g.j(this.mContext, R.layout.tt_detail_indication_container, null, true);
            if (j != null) {
                linearLayout = (LinearLayout) j;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout");
            }
        } else {
            View inflate = LayoutInflater.from(this.mContext).inflate(R.layout.tt_detail_indication_container, (ViewGroup) null);
            if (inflate != null) {
                linearLayout = (LinearLayout) inflate;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout");
            }
        }
        this.c = linearLayout;
        B(nb4Var);
    }

    public static final /* synthetic */ void A(rns rnsVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a03e6cc", new Object[]{rnsVar, new Integer(i)});
        } else {
            rnsVar.e = i;
        }
    }

    public static /* synthetic */ Object ipc$super(rns rnsVar, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/indication/TTDetailDescSuffixShrinkComponent");
    }

    public static final /* synthetic */ Context y(rns rnsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("1971fd55", new Object[]{rnsVar});
        }
        return rnsVar.mContext;
    }

    public static final /* synthetic */ int z(rns rnsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6e319196", new Object[]{rnsVar})).intValue();
        }
        return rnsVar.e;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, com.taobao.android.detail.ttdetail.widget.ObserverImageView] */
    /* JADX WARN: Type inference failed for: r2v3, types: [T, com.taobao.android.detail.ttdetail.widget.ObserverImageView] */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.widget.LinearLayout, T] */
    public final void B(nb4 nb4Var) {
        ObserverImageView observerImageView;
        ObserverImageView observerImageView2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63be2b8b", new Object[]{this, nb4Var});
            return;
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = C(R.id.indicator_shrink_img, 0);
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        ref$ObjectRef2.element = C(R.id.indicator_expand_img, 8);
        Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
        View findViewById = this.c.findViewById(R.id.indication_container);
        ckf.c(findViewById, "mContainer.findViewById(R.id.indication_container)");
        ref$ObjectRef3.element = (LinearLayout) findViewById;
        ObserverImageView observerImageView3 = (ObserverImageView) ref$ObjectRef.element;
        if (observerImageView3 != null) {
            observerImageView3.setOnSizeChangedListener(new tns(this, ref$ObjectRef3));
        }
        ObserverImageView observerImageView4 = (ObserverImageView) ref$ObjectRef2.element;
        if (observerImageView4 != null) {
            observerImageView4.setOnSizeChangedListener(new uns(this, ref$ObjectRef3));
        }
        ff7 a2 = ff7.a(nb4Var);
        if (a2 != null) {
            if (!TextUtils.isEmpty(a2.j) && (observerImageView2 = (ObserverImageView) ref$ObjectRef.element) != null) {
                observerImageView2.setImageUrl(a2.j);
            }
            if (!TextUtils.isEmpty(a2.i) && (observerImageView = (ObserverImageView) ref$ObjectRef2.element) != null) {
                observerImageView.setImageUrl(a2.i);
            }
            ObserverImageView observerImageView5 = (ObserverImageView) ref$ObjectRef.element;
            if (observerImageView5 != null) {
                observerImageView5.setOnClickListener(new sns(a2, this, ref$ObjectRef, ref$ObjectRef2));
            }
        }
    }

    public final ObserverImageView C(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ObserverImageView) ipChange.ipc$dispatch("e67e7f36", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        View findViewById = this.c.findViewById(i);
        ckf.c(findViewById, "mContainer.findViewById(resId)");
        ObserverImageView observerImageView = (ObserverImageView) findViewById;
        observerImageView.setVisibility(i2);
        return observerImageView;
    }

    @Override // tb.hrj, tb.ozc
    public void k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2314fd0", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.oa4
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.d = false;
    }

    @Override // tb.oa4
    public void onDidAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("914171dc", new Object[]{this});
        } else if (!this.d) {
            a();
        }
    }

    @Override // tb.oa4
    public View onGetComponentView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f631742", new Object[]{this, view});
        }
        return this.c;
    }

    @Override // tb.hrj, tb.ozc
    public View r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c3161e04", new Object[]{this});
        }
        return this.c;
    }

    @Override // tb.hrj
    public TTDetailScrollerLayout.LayoutParams u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TTDetailScrollerLayout.LayoutParams) ipChange.ipc$dispatch("99746aed", new Object[]{this});
        }
        return new TTDetailScrollerLayout.LayoutParams(-1, -2);
    }

    @Override // tb.hrj
    public String v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("978e443e", new Object[]{this});
        }
        return "";
    }

    @Override // tb.hrj, tb.ozc
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c57fdb6", new Object[]{this});
            return;
        }
        if (!this.d) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("page", (Object) "Page_Detail");
                jSONObject.put("eventId", (Object) 2201);
                jSONObject.put("arg1", (Object) "Page_Detail_Show_DESC_Price");
                jSONObject.put("args", (Object) new JSONObject());
                q84.f(this.mContext, new rc7("userTrack", jSONObject, new RuntimeAbilityParam[0]));
            } catch (Exception e) {
                tgh.c("TTDetailIndicationComponent", "Page_Detail_Show_Navigation error", e);
            }
        }
        this.d = true;
    }
}
