package tb;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.adapter.RecycleViewHolder;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseTemplateModel;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class s0a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f27712a;
    public final float b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RecycleViewHolder f27713a;

        public a(RecycleViewHolder recycleViewHolder) {
            this.f27713a = recycleViewHolder;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f27713a.itemView.setTag(R.id.tag_info_flow_card_height, Integer.valueOf(this.f27713a.itemView.getHeight()));
            }
        }
    }

    static {
        t2o.a(486539671);
    }

    public s0a() {
        this.f27712a = true;
        this.b = 0.6666667f;
        this.f27712a = mve.a("columnTypeFallbackEnable", true);
        this.b = mve.b("oneColumnTypeWidthRatioThreshold", 0.6666667f);
    }

    public void a(BaseSectionModel baseSectionModel, RecycleViewHolder recycleViewHolder) {
        ViewGroup.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("364459db", new Object[]{this, baseSectionModel, recycleViewHolder});
            return;
        }
        StaggeredGridLayoutManager.LayoutParams layoutParams2 = (StaggeredGridLayoutManager.LayoutParams) recycleViewHolder.itemView.getLayoutParams();
        if (recycleViewHolder.b0() == null) {
            layoutParams = layoutParams2;
        } else {
            layoutParams = recycleViewHolder.b0().getLayoutParams();
        }
        boolean f = f(baseSectionModel, layoutParams, recycleViewHolder.itemView);
        if (!(layoutParams2 == null || layoutParams2.isFullSpan() == f)) {
            layoutParams2.setFullSpan(f);
        }
        b(recycleViewHolder.itemView, baseSectionModel, f);
        recycleViewHolder.itemView.post(new a(recycleViewHolder));
    }

    public final void b(View view, BaseSectionModel baseSectionModel, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac104d3", new Object[]{this, view, baseSectionModel, new Boolean(z)});
        } else if (view instanceof FrameLayout) {
            if (z) {
                view.setPadding(0, 0, 0, 0);
            } else if (baseSectionModel.getExt() != null) {
                try {
                    ((FrameLayout) view).setClipChildren(false);
                    ((FrameLayout) view).setClipToPadding(false);
                    ((ViewGroup) ((FrameLayout) view).getChildAt(0)).setClipChildren(false);
                    ((ViewGroup) ((FrameLayout) view).getChildAt(0)).setClipToPadding(false);
                } catch (Throwable th) {
                    fve.e("FullSpanHelper", "decorateView error t :" + th.getMessage());
                }
            }
        }
    }

    public final int c(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("692007b1", new Object[]{this, view, new Integer(i), new Integer(i2)})).intValue();
        }
        try {
            if (view.getTag(i) == null) {
                return i2;
            }
            return ((Integer) view.getTag(i)).intValue();
        } catch (Throwable th) {
            fve.e("FullSpanHelper", "getTagValue error : " + th.getMessage());
            return i2;
        }
    }

    public final boolean d(BaseTemplateModel baseTemplateModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("72983218", new Object[]{this, baseTemplateModel})).booleanValue();
        }
        if (baseTemplateModel == null) {
            return false;
        }
        return TextUtils.equals("one", baseTemplateModel.getColumnType());
    }

    public final boolean f(BaseSectionModel baseSectionModel, ViewGroup.LayoutParams layoutParams, View view) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c7bd422b", new Object[]{this, baseSectionModel, layoutParams, view})).booleanValue();
        }
        if (baseSectionModel == null || layoutParams == null || view == null) {
            return false;
        }
        if (e(baseSectionModel)) {
            return true;
        }
        boolean d = d(baseSectionModel.getTemplate());
        int s = pb6.s(view.getContext());
        boolean z2 = this.f27712a && ((float) c(view, R.id.tag_info_flow_decoration_width, layoutParams.width)) > ((float) s) * this.b;
        if (!d && !z2) {
            z = false;
        }
        if (z) {
            fve.f("FullSpanHelper", "isFullByData : " + d + ", isFullByWidth : " + z2 + "screenWidth: " + s + ", card : " + baseSectionModel.getSectionBizCode());
        }
        return z;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
        if (r6.equals("loading") == false) goto L_0x002b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel r6) {
        /*
            r5 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = tb.s0a.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001c
            java.lang.String r4 = "c3e06f83"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r2] = r5
            r0[r1] = r6
            java.lang.Object r6 = r3.ipc$dispatch(r4, r0)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L_0x001c:
            java.lang.String r6 = r6.getSectionBizCode()
            if (r6 != 0) goto L_0x0023
            return r2
        L_0x0023:
            r3 = -1
            int r4 = r6.hashCode()
            switch(r4) {
                case -1868198634: goto L_0x0042;
                case 96784904: goto L_0x0037;
                case 336650556: goto L_0x002d;
                default: goto L_0x002b;
            }
        L_0x002b:
            r0 = -1
            goto L_0x004d
        L_0x002d:
            java.lang.String r4 = "loading"
            boolean r6 = r6.equals(r4)
            if (r6 != 0) goto L_0x004d
            goto L_0x002b
        L_0x0037:
            java.lang.String r0 = "error"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0040
            goto L_0x002b
        L_0x0040:
            r0 = 1
            goto L_0x004d
        L_0x0042:
            java.lang.String r0 = "sub_tab"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x004c
            goto L_0x002b
        L_0x004c:
            r0 = 0
        L_0x004d:
            switch(r0) {
                case 0: goto L_0x0051;
                case 1: goto L_0x0051;
                case 2: goto L_0x0051;
                default: goto L_0x0050;
            }
        L_0x0050:
            return r2
        L_0x0051:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.s0a.e(com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel):boolean");
    }
}
