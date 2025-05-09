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
public class c64 extends j4p implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static boolean y;
    public PopupWindow v;
    public FrameLayout w;
    public int x;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(815793563);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(815793562);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c64(Activity activity, ude udeVar, acx<? extends o02<? extends BaseSearchResult, ?>> acxVar, TemplateBean templateBean, ViewGroup viewGroup, vfw vfwVar) {
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

    public static /* synthetic */ Object ipc$super(c64 c64Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -211767613) {
            super.onComponentDestroy();
            return null;
        } else if (hashCode == 724233032) {
            super.onRenderSuccess((com.taobao.android.weex_framework.a) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/sf/widgets/droplayer/CommonMuiseDropLayerWidget");
        }
    }

    @Override // tb.j4p, tb.m8j
    /* renamed from: G2 */
    public FrameLayout onCreateView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("6075f6f2", new Object[]{this});
        }
        View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.tbsearch_lbs_drop_layer, (ViewGroup) new FrameLayout(getActivity()), false);
        ckf.e(inflate, "null cannot be cast to non-null type android.widget.FrameLayout");
        return (FrameLayout) inflate;
    }

    @Override // tb.j4p, tb.m8j
    public void K2(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d5d87ab", new Object[]{this, map});
        } else if (map != null) {
            map.put("containerHeight", String.valueOf(this.x));
        }
    }

    @Override // tb.m8j
    public void R2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e7de514", new Object[]{this});
        }
    }

    @Override // tb.j4p
    public void a3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fc35c11", new Object[]{this});
        } else {
            r3();
        }
    }

    @Override // tb.j4p, tb.phw, tb.khq
    public void findAllViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1d31fad", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = (FrameLayout) getView();
        if (frameLayout != null) {
            FrameLayout frameLayout2 = (FrameLayout) frameLayout.findViewById(R.id.black_cover);
            this.w = frameLayout2;
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
            this.x = zuo.f(i, container2.getHeight(), getActivity());
            frameLayout.getLayoutParams().height = this.x;
        }
    }

    @Override // tb.m8j, tb.abx
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
        } else if (ckf.b(view, this.w)) {
            r3();
        }
    }

    @Override // tb.j4p, tb.m8j, tb.abx
    public void onComponentDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f360aec3", new Object[]{this});
            return;
        }
        super.onComponentDestroy();
        unsubscribeScopeEvent(this, "childPageWidget");
        getModel().e().unsubscribe(this);
        PopupWindow popupWindow = this.v;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        y = false;
    }

    public final void onEventMainThread(fml fmlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7dbb382", new Object[]{this, fmlVar});
            return;
        }
        ckf.g(fmlVar, "activityResult");
        this.c.x().onActivityResult(fmlVar.f19408a, fmlVar.b, fmlVar.c);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View] */
    @Override // tb.j4p, tb.m8j, tb.npc
    public void onRenderSuccess(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b2aeb48", new Object[]{this, aVar});
            return;
        }
        super.onRenderSuccess(aVar);
        PopupWindow popupWindow = new PopupWindow((View) getView());
        this.v = popupWindow;
        popupWindow.setAnimationStyle(0);
        popupWindow.setWidth(zuo.e());
        popupWindow.setHeight(this.x);
        PopupWindow popupWindow2 = this.v;
        ckf.d(popupWindow2);
        popupWindow2.showAsDropDown(getContainer());
        y = true;
    }

    public void r3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("676d8b5a", new Object[]{this});
        } else {
            destroyAndRemoveFromParent();
        }
    }

    public final void onEventMainThread(a08 a08Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9316833", new Object[]{this, a08Var});
            return;
        }
        ckf.g(a08Var, "event");
        r3();
    }

    public final void onEventMainThread(hml hmlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15aeb8ea", new Object[]{this, hmlVar});
            return;
        }
        ckf.g(hmlVar, "event");
        r3();
    }
}
