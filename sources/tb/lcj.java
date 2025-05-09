package tb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.schedule.ViewProxy;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import java.util.Map;
import tb.f64;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class lcj extends j4p implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public FrameLayout v;
    public View w;
    public f64.a x;
    public f64.a y;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/widgets/sidemod/MusSideModWidget$closeSideMod$1");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else {
                lcj.this.destroyAndRemoveFromParent();
            }
        }
    }

    static {
        t2o.a(815793791);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lcj(Activity activity, ude udeVar, acx<? extends o02<? extends BaseSearchResult, ?>> acxVar, TemplateBean templateBean, ViewGroup viewGroup, vfw vfwVar) {
        super(activity, udeVar, acxVar, templateBean, viewGroup, vfwVar);
        ckf.g(activity, "activity");
        ckf.g(udeVar, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        ckf.g(acxVar, "model");
        ckf.g(templateBean, "bean");
    }

    public static /* synthetic */ Object ipc$super(lcj lcjVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 523666796) {
            return new Boolean(super.K((String) objArr[0], (JSONObject) objArr[1], (f64.a) objArr[2], (f64.a) objArr[3]));
        }
        if (hashCode == 724233032) {
            super.onRenderSuccess((com.taobao.android.weex_framework.a) objArr[0]);
            return null;
        } else if (hashCode == 761104299) {
            super.K2((Map) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/sf/widgets/sidemod/MusSideModWidget");
        }
    }

    @Override // tb.j4p, tb.m8j
    /* renamed from: G2 */
    public FrameLayout onCreateView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("6075f6f2", new Object[]{this});
        }
        View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.tbsearch_side_mod_layout, getContainer(), false);
        View findViewById = inflate.findViewById(R.id.v_side_mod_bg);
        this.w = findViewById;
        if (findViewById != null) {
            ViewProxy.setOnClickListener(findViewById, this);
            FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.fl_side_mod_container);
            this.v = frameLayout;
            if (frameLayout != null) {
                frameLayout.getLayoutParams().width = o1p.h(600);
                return (FrameLayout) inflate;
            }
            ckf.y("mSideModContainer");
            throw null;
        }
        ckf.y("mSideModBg");
        throw null;
    }

    @Override // tb.m8j
    public void R2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e7de514", new Object[]{this});
        }
    }

    @Override // tb.m8j, tb.abx
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return "MusSideModWidget";
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else {
            r3();
        }
    }

    public final void onEventMainThread(t2p t2pVar) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15b8d6ed", new Object[]{this, t2pVar});
            return;
        }
        ckf.g(t2pVar, "event");
        getModel().e().unsubscribe(this);
        BaseSearchResult baseSearchResult = (BaseSearchResult) getModel().e().getLastSearchResult();
        if (baseSearchResult != null) {
            z = baseSearchResult.isSuccess();
        }
        if (z) {
            f64.a aVar = this.x;
            if (aVar != null) {
                aVar.invoke(new JSONObject());
            }
        } else {
            f64.a aVar2 = this.y;
            if (aVar2 != null) {
                aVar2.invoke(new JSONObject());
            }
        }
        this.x = null;
        this.y = null;
    }

    @Override // tb.j4p, tb.m8j, tb.npc
    public void onRenderSuccess(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b2aeb48", new Object[]{this, aVar});
            return;
        }
        super.onRenderSuccess(aVar);
        fw fwVar = this.c;
        FrameLayout frameLayout = this.v;
        if (frameLayout != null) {
            fwVar.q(frameLayout, aVar, false);
            s3();
            return;
        }
        ckf.y("mSideModContainer");
        throw null;
    }

    public final void s3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a49c488", new Object[]{this});
            return;
        }
        postEvent(new a08());
        attachToContainer();
        View view = this.w;
        if (view != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
            ofFloat.setDuration(400L);
            ofFloat.start();
            return;
        }
        ckf.y("mSideModBg");
        throw null;
    }

    public final void t3(JSONObject jSONObject, f64.a aVar, f64.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad40fac1", new Object[]{this, jSONObject, aVar, aVar2});
        } else if (jSONObject != null) {
            o02 e = getModel().e();
            ckf.f(e, "getScopeDatasource(...)");
            JSONObject d = h19.d(jSONObject, "params");
            if (d != null) {
                for (String str : d.keySet()) {
                    String string = d.getString(str);
                    if (string == null) {
                        string = "";
                    }
                    e.setParam(str, string);
                }
                getModel().e().subscribe(this);
                this.x = aVar;
                this.y = aVar2;
                e.doNewSearch();
            }
        }
    }

    @Override // tb.j4p, tb.m8j, tb.cnx
    public boolean K(String str, JSONObject jSONObject, f64.a aVar, f64.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f36856c", new Object[]{this, str, jSONObject, aVar, aVar2})).booleanValue();
        }
        boolean K = super.K(str, jSONObject, aVar, aVar2);
        if (ckf.b(str, "closeFilter")) {
            r3();
            return true;
        } else if (!ckf.b(str, "searchOptionWithCallback")) {
            return K;
        } else {
            t3(jSONObject, aVar, aVar2);
            return true;
        }
    }

    @Override // tb.j4p, tb.m8j
    public void K2(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d5d87ab", new Object[]{this, map});
            return;
        }
        super.K2(map);
        if (map != null) {
            Activity activity = getActivity();
            mec mecVar = activity instanceof mec ? (mec) activity : null;
            int statusBarHeight = mecVar != null ? mecVar.o2() : false ? SystemBarDecorator.getStatusBarHeight(getActivity()) : 0;
            map.put("containerHeight", String.valueOf(o1p.f(zuo.b(getActivity(), 0))));
            map.put("statusBarHeight", String.valueOf(o1p.f(statusBarHeight)));
        }
    }

    public final void r3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c2e141a", new Object[]{this});
            return;
        }
        View view = this.w;
        if (view != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
            ofFloat.setDuration(150L);
            ofFloat.addListener(new a());
            ofFloat.start();
            FrameLayout frameLayout = this.v;
            if (frameLayout != null) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(frameLayout, "translationX", 0.0f, frameLayout.getMeasuredWidth());
                ofFloat2.setDuration(150L);
                ofFloat2.start();
                return;
            }
            ckf.y("mSideModContainer");
            throw null;
        }
        ckf.y("mSideModBg");
        throw null;
    }
}
