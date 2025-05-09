package tb;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.search.common.uikit.SearchUrlImageView;
import com.taobao.taobao.R;
import tb.arj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class pim extends arj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final ListStyle A;
    public SearchUrlImageView B;
    public SearchUrlImageView C;
    public LinearLayout D;
    public final int E = p1p.a(50.0f);
    public final View z;

    static {
        t2o.a(815793696);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pim(Activity activity, ude udeVar, acx<? extends o02<? extends BaseSearchResult, ?>> acxVar, TemplateBean templateBean, ViewGroup viewGroup, vfw vfwVar, Integer num, Object obj, arj.a aVar, arj.b bVar, View view, ListStyle listStyle) {
        super(activity, udeVar, acxVar, templateBean, viewGroup, vfwVar, num, obj, aVar, bVar);
        ckf.g(activity, "activity");
        ckf.g(udeVar, a.MSG_SOURCE_PARENT);
        ckf.g(acxVar, "model");
        ckf.g(templateBean, "bean");
        ckf.g(bVar, "negativeFeedbackProvider");
        ckf.g(view, "anchorView");
        ckf.g(listStyle, "style");
        this.z = view;
        this.A = listStyle;
    }

    public static final void e(pim pimVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("954ef036", new Object[]{pimVar, view});
            return;
        }
        ckf.g(pimVar, "this$0");
        arj.a s3 = pimVar.s3();
        if (s3 != null) {
            s3.cancel();
        }
    }

    public static /* synthetic */ Object ipc$super(pim pimVar, String str, Object... objArr) {
        if (str.hashCode() == -211767613) {
            super.onComponentDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/widgets/negfeedback/PopupNegativeFeedbackMusModWidget");
    }

    @Override // tb.arj, tb.j4p, tb.m8j
    /* renamed from: G2 */
    public FrameLayout onCreateView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("6075f6f2", new Object[]{this});
        }
        View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.tbsearch_neg_feedback_pop, (ViewGroup) new FrameLayout(getActivity()), false);
        ckf.e(inflate, "null cannot be cast to non-null type android.widget.FrameLayout");
        return (FrameLayout) inflate;
    }

    @Override // tb.m8j
    public void L2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e94211b0", new Object[]{this});
            return;
        }
        arj.a s3 = s3();
        if (s3 != null) {
            s3.cancel();
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
            frameLayout.setOnClickListener(new View.OnClickListener() { // from class: tb.vjz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    pim.e(pim.this, view);
                }
            });
            SearchUrlImageView searchUrlImageView = (SearchUrlImageView) frameLayout.findViewById(R.id.imv_anchor);
            if (searchUrlImageView != null) {
                searchUrlImageView.setImageUrl("https://img.alicdn.com/imgextra/i3/O1CN01O4qFnU22RdqGwFnJq_!!6000000007117-2-tps-64-64.png");
                SearchUrlImageView searchUrlImageView2 = (SearchUrlImageView) frameLayout.findViewById(R.id.imv_arrow_top);
                this.B = searchUrlImageView2;
                if (searchUrlImageView2 != null) {
                    searchUrlImageView2.setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN01BBuWCE1ZZm10OHYG0_!!6000000003209-2-tps-40-20.png");
                    SearchUrlImageView searchUrlImageView3 = (SearchUrlImageView) frameLayout.findViewById(R.id.imv_arrow_bottom);
                    this.C = searchUrlImageView3;
                    if (searchUrlImageView3 != null) {
                        searchUrlImageView3.setImageUrl("https://gw.alicdn.com/imgextra/i1/O1CN01VTmUvQ1OknmSe02Cc_!!6000000001744-2-tps-40-20.png");
                        this.D = (LinearLayout) frameLayout.findViewById(R.id.ll_anchor_group);
                        return;
                    }
                    ckf.y("imvArrowBottom");
                    throw null;
                }
                ckf.y("imvArrowTop");
                throw null;
            }
            ckf.y("imvAnchor");
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View] */
    @Override // tb.j4p, tb.m8j, tb.abx
    public void onComponentDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f360aec3", new Object[]{this});
            return;
        }
        super.onComponentDestroy();
        FrameLayout frameLayout = (FrameLayout) getView();
        if (frameLayout != null) {
            frameLayout.clearAnimation();
        }
        igw.a(getView());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [android.view.View] */
    @Override // tb.arj, tb.j4p, tb.m8j, tb.npc
    public void onRenderSuccess(com.taobao.android.weex_framework.a aVar) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b2aeb48", new Object[]{this, aVar});
        } else if (aVar != null) {
            View decorView = getActivity().getWindow().getDecorView();
            ckf.e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) decorView).addView(getView());
            int[] v3 = v3(this.z);
            LinearLayout linearLayout = this.D;
            if (linearLayout != null) {
                ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                ckf.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.leftMargin = v3[0] - p1p.a(10.0f);
                marginLayoutParams.topMargin = v3[1] - p1p.a(23.0f);
                int[] w3 = w3(v3, aVar, this.z);
                ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-2, -2);
                marginLayoutParams2.leftMargin = w3[0];
                marginLayoutParams2.topMargin = w3[1];
                FrameLayout frameLayout = (FrameLayout) getView();
                if (frameLayout != null) {
                    frameLayout.addView(aVar.getRenderRoot(), marginLayoutParams2);
                }
                if (w3[2] == 0) {
                    SearchUrlImageView searchUrlImageView = this.C;
                    if (searchUrlImageView != null) {
                        searchUrlImageView.setVisibility(4);
                    } else {
                        ckf.y("imvArrowBottom");
                        throw null;
                    }
                } else {
                    SearchUrlImageView searchUrlImageView2 = this.B;
                    if (searchUrlImageView2 != null) {
                        searchUrlImageView2.setVisibility(4);
                    } else {
                        ckf.y("imvArrowTop");
                        throw null;
                    }
                }
                float f = v3[0];
                if (w3[2] != 0) {
                    i = aVar.getRootHeight();
                }
                ScaleAnimation scaleAnimation = new ScaleAnimation(0.3f, 1.0f, 0.3f, 1.0f, 0, f, 0, i);
                scaleAnimation.setDuration(300L);
                scaleAnimation.setFillAfter(true);
                aVar.getRenderRoot().startAnimation(scaleAnimation);
                return;
            }
            ckf.y("llAnchorGroup");
            throw null;
        }
    }

    public final int[] v3(View view) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("c5adb15d", new Object[]{this, view});
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i2 = iArr[0];
        int i3 = iArr[1];
        int width = view.getWidth() + i2;
        ViewParent parent = view.getParent();
        ckf.e(parent, "null cannot be cast to non-null type android.view.View");
        View view2 = (View) parent;
        view2.getLocationInWindow(iArr);
        int i4 = iArr[1];
        int max = Math.max(i3, i4);
        int min = Math.min(view.getHeight() + i3, view2.getHeight() + i4);
        if (this.A == ListStyle.LIST) {
            i = view.getLeft() + p1p.a(76.0f);
        } else {
            i = (i2 + width) / 2;
        }
        iArr[0] = i;
        iArr[1] = (max + min) / 2;
        return iArr;
    }

    public final int[] w3(int[] iArr, com.taobao.android.weex_framework.a aVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("30b50de6", new Object[]{this, iArr, aVar, view});
        }
        int[] iArr2 = new int[3];
        int rootWidth = aVar.getRootWidth();
        int rootHeight = aVar.getRootHeight();
        int e = zuo.e();
        if (rootWidth > e - p1p.a(100.0f)) {
            iArr2[0] = (e - rootWidth) / 2;
        } else if (this.A == ListStyle.WATERFALL) {
            int left = view.getLeft() + ((view.getWidth() - rootWidth) / 2);
            int i = this.E;
            if (left < i) {
                left = i;
            }
            if (left + rootWidth > e - i) {
                left = (e - i) - rootWidth;
            }
            iArr2[0] = left;
        } else {
            iArr2[0] = iArr[0] - p1p.a(33.0f);
        }
        int a2 = p1p.a(23.0f);
        if (iArr[1] + a2 + rootWidth <= zuo.d()) {
            iArr2[1] = iArr[1] + a2;
            iArr2[2] = 0;
        } else {
            iArr2[1] = (iArr[1] - a2) - rootHeight;
            iArr2[2] = 1;
        }
        return iArr2;
    }
}
