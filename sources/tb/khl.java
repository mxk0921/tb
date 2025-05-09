package tb;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.list.IFeedsListService;
import com.taobao.android.fluid.framework.list.view.LockableRecycerView;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class khl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(468714072);
    }

    public static void c(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c5c13cd", new Object[]{view});
        } else if (view != null) {
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            view.setAlpha(1.0f);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ atb f22672a;
        public final /* synthetic */ ViewGroup b;
        public final /* synthetic */ String c;

        public a(atb atbVar, ViewGroup viewGroup, String str) {
            this.f22672a = atbVar;
            this.b = viewGroup;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                ViewGroup view = this.f22672a.getView();
                if (view != null && view.getParent() != null && !view.isAttachedToWindow() && !nwv.o(view.getTag(R.id.fluid_sdk_id_p2ff_resumed), false)) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    viewGroup.removeView(view);
                    view.setTag(R.id.fluid_sdk_id_p2ff_origin_parent, viewGroup);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(1, 1);
                    view.setVisibility(0);
                    view.setAlpha(0.0f);
                    this.b.addView(view, layoutParams);
                    view.setTag(R.id.fluid_sdk_id_p2ff_host_parent, this.b);
                    view.setTag(R.id.fluid_sdk_id_p2ff_origin_layoutParams, view.getLayoutParams());
                    ir9.b("P2ffAddViewHelper", "p2ffAddView success:" + this.c);
                }
            } catch (Throwable th) {
                ir9.b("P2ffAddViewHelper", "p2ffAddView fail:" + th.getMessage() + this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f22673a;
        public final /* synthetic */ FrameLayout.LayoutParams b;
        public final /* synthetic */ String c;

        public b(View view, FrameLayout.LayoutParams layoutParams, String str) {
            this.f22673a = view;
            this.b = layoutParams;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            boolean z2 = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                this.f22673a.setTag(R.id.fluid_sdk_id_p2ff_resumed, Boolean.TRUE);
                ViewGroup viewGroup = (ViewGroup) this.f22673a.getParent();
                ViewGroup viewGroup2 = (ViewGroup) this.f22673a.getTag(R.id.fluid_sdk_id_p2ff_origin_parent);
                ViewGroup viewGroup3 = (ViewGroup) this.f22673a.getTag(R.id.fluid_sdk_id_p2ff_host_parent);
                if (viewGroup3 == null || viewGroup != viewGroup3) {
                    z = false;
                } else {
                    khl.c(this.f22673a);
                    viewGroup = null;
                    z = true;
                }
                FrameLayout.LayoutParams layoutParams = this.b;
                if (!(viewGroup2 == null || viewGroup == viewGroup2)) {
                    View view = this.f22673a;
                    int i = R.id.fluid_sdk_content_key;
                    String I = nwv.I(view.getTag(i), "");
                    String I2 = nwv.I(viewGroup2.getTag(i), "");
                    if (TextUtils.isEmpty(I) || TextUtils.isEmpty(I2) || TextUtils.equals(I, I2)) {
                        if (viewGroup != null) {
                            viewGroup.removeView(this.f22673a);
                        }
                        if (layoutParams == null) {
                            layoutParams = (FrameLayout.LayoutParams) this.f22673a.getTag(R.id.fluid_sdk_id_p2ff_origin_layoutParams);
                        }
                        viewGroup2.addView(this.f22673a, 0, layoutParams);
                        z2 = true;
                    }
                }
                ir9.b("P2ffAddViewHelper", "resumeP2ffView success:" + z + "," + z2 + this.c);
            } catch (Throwable th) {
                ir9.b("P2ffAddViewHelper", "resumeP2ffView fail:" + th.getMessage() + this.c);
            }
        }
    }

    public static boolean b(FluidContext fluidContext, View view, FrameLayout.LayoutParams layoutParams, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2b55a31", new Object[]{fluidContext, view, layoutParams, str, str2})).booleanValue();
        }
        ir9.b("P2ffAddViewHelper", "resumeP2ffView from " + str + str2);
        if (view != null) {
            LockableRecycerView recyclerView = ((IFeedsListService) fluidContext.getService(IFeedsListService.class)).getRecyclerView();
            b bVar = new b(view, layoutParams, str2);
            ((IFeedsListService) fluidContext.getService(IFeedsListService.class)).runOnLayoutSafe(recyclerView, bVar, "resumeFromP2ff:" + str2);
        }
        return false;
    }

    public static boolean a(FluidContext fluidContext, atb atbVar, ViewGroup viewGroup, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57085a93", new Object[]{fluidContext, atbVar, viewGroup, str})).booleanValue();
        }
        if (!eps.g() || fluidContext == null || atbVar == null || atbVar.getView() == null || viewGroup == null || atbVar.getView().isAttachedToWindow()) {
            return false;
        }
        a aVar = new a(atbVar, viewGroup, str);
        LockableRecycerView recyclerView = ((IFeedsListService) fluidContext.getService(IFeedsListService.class)).getRecyclerView();
        ((IFeedsListService) fluidContext.getService(IFeedsListService.class)).runOnLayoutSafe(recyclerView, aVar, "p2ffAddView:" + str);
        return true;
    }
}
