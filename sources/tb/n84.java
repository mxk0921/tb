package tb;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.taobao.R;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class n84 extends m6p implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static boolean p;
    public PopupWindow m;
    public FrameLayout n;
    public int o;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(815793565);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(815793564);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n84(Activity activity, ude udeVar, acx<? extends o02<? extends BaseSearchResult, ?>> acxVar, TemplateBean templateBean, ViewGroup viewGroup, vfw vfwVar) {
        super(activity, udeVar, acxVar, templateBean, viewGroup, vfwVar);
        ckf.g(activity, "activity");
        ckf.g(udeVar, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        ckf.g(acxVar, "model");
        ckf.g(templateBean, "bean");
        postEvent(new a08());
        subscribeEvent(this);
        subscribeScopeEvent(this, "childPageWidget");
        acxVar.e().subscribe(this);
    }

    public static /* synthetic */ Object ipc$super(n84 n84Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -211767613) {
            super.onComponentDestroy();
            return null;
        } else if (hashCode == 1373327421) {
            super.K1((cbk) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/sf/widgets/droplayer/CommonWeexDropLayerWidget");
        }
    }

    @Override // tb.b7x
    public void D2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e7de514", new Object[]{this});
        }
    }

    @Override // tb.m6p
    public void I2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fc35c11", new Object[]{this});
        } else {
            P2();
        }
    }

    @Override // tb.b7x, tb.uz.d
    public void K1(cbk cbkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51db503d", new Object[]{this, cbkVar});
            return;
        }
        super.K1(cbkVar);
        Q2();
    }

    public void P2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("676d8b5a", new Object[]{this});
        } else {
            destroyAndRemoveFromParent();
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View] */
    public final void Q2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4fa10b6", new Object[]{this});
            return;
        }
        PopupWindow popupWindow = new PopupWindow((View) getView());
        this.m = popupWindow;
        popupWindow.setAnimationStyle(0);
        popupWindow.setWidth(zuo.e());
        popupWindow.setHeight(this.o);
        PopupWindow popupWindow2 = this.m;
        ckf.d(popupWindow2);
        popupWindow2.showAsDropDown(getContainer());
        p = true;
    }

    @Override // tb.m6p, tb.phw, tb.khq
    public void findAllViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1d31fad", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = (FrameLayout) getView();
        if (frameLayout != null) {
            FrameLayout frameLayout2 = (FrameLayout) frameLayout.findViewById(R.id.black_cover);
            this.n = frameLayout2;
            if (frameLayout2 != null) {
                frameLayout2.setOnClickListener(this);
            }
            int[] iArr = new int[2];
            ViewGroup container = getContainer();
            ckf.d(container);
            container.getLocationOnScreen(iArr);
            int i = iArr[1];
            ViewGroup container2 = getContainer();
            ckf.d(container2);
            this.o = zuo.f(i, container2.getHeight(), getActivity());
            frameLayout.getLayoutParams().height = this.o;
        }
    }

    @Override // tb.b7x, tb.abx
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return "CommonWeexDropLayerWidget";
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (ckf.b(view, this.n)) {
            P2();
        }
    }

    @Override // tb.b7x, tb.abx
    public void onComponentDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f360aec3", new Object[]{this});
            return;
        }
        super.onComponentDestroy();
        unsubscribeScopeEvent(this, "childPageWidget");
        getModel().e().unsubscribe(this);
        PopupWindow popupWindow = this.m;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        p = false;
    }

    public final void onEventMainThread(hml hmlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15aeb8ea", new Object[]{this, hmlVar});
        } else {
            ckf.g(hmlVar, "event");
        }
    }

    @Override // tb.b7x
    public uz s2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uz) ipChange.ipc$dispatch("835f0cb2", new Object[]{this});
        }
        Activity activity = getActivity();
        yko core = getCore();
        TemplateBean w2 = w2();
        acx<? extends o02<? extends BaseSearchResult, ?>> model = getModel();
        ckf.f(model, "getModel(...)");
        return new p54(activity, core, this, this, w2, model);
    }

    @Override // tb.m6p, tb.b7x
    /* renamed from: y2 */
    public FrameLayout onCreateView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("6075f6f2", new Object[]{this});
        }
        View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.tbsearch_lbs_drop_layer, (ViewGroup) new FrameLayout(getActivity()), false);
        ckf.e(inflate, "null cannot be cast to non-null type android.widget.FrameLayout");
        return (FrameLayout) inflate;
    }

    @Override // tb.m6p, tb.b7x
    public void z2(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d5d87ab", new Object[]{this, map});
        } else if (map != null) {
            map.put("containerHeight", String.valueOf(this.o));
        }
    }

    public final void onEventMainThread(fml fmlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7dbb382", new Object[]{this, fmlVar});
            return;
        }
        ckf.g(fmlVar, "activityResult");
        this.b.r().onActivityResult(fmlVar.f19408a, fmlVar.b, fmlVar.c);
    }

    public final void onEventMainThread(a08 a08Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9316833", new Object[]{this, a08Var});
            return;
        }
        ckf.g(a08Var, "event");
        P2();
    }
}
