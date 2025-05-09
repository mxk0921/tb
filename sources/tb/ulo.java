package tb;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.schedule.ViewProxy;
import com.taobao.search.mmd.datasource.bean.PromotionFilterBean;
import com.taobao.search.sf.datasource.CommonBaseDatasource;
import com.taobao.search.sf.widgets.list.promotionfilter.SFPromotionFilterBean;
import com.taobao.tao.util.DensityUtil;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import tb.h3p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ulo extends phw<SFPromotionFilterBean, LinearLayout, b64> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public PromotionFilterBean f29471a;
    public final LayoutInflater b;
    public final boolean c = getModel().f().getBooleanParam(r4p.KEY_SEARCH_ELDER_HOME_OPEN);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f29472a;

        public a(int i) {
            this.f29472a = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                ulo.q2(ulo.this, this.f29472a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f29473a;
        public final /* synthetic */ TUrlImageView b;

        public b(ulo uloVar, View view, TUrlImageView tUrlImageView) {
            this.f29473a = view;
            this.b = tUrlImageView;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            View view = this.f29473a;
            if (view != null) {
                view.setVisibility(8);
            }
            this.b.setTag(Boolean.TRUE);
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TUrlImageView f29474a;

        public c(ulo uloVar, TUrlImageView tUrlImageView) {
            this.f29474a = tUrlImageView;
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            this.f29474a.setVisibility(8);
            this.f29474a.setTag(Boolean.FALSE);
            return true;
        }
    }

    static {
        t2o.a(815793678);
    }

    public ulo(Activity activity, ude udeVar, b64 b64Var, ViewGroup viewGroup, vfw vfwVar) {
        super(activity, udeVar, b64Var, viewGroup, vfwVar);
        this.b = LayoutInflater.from(activity);
    }

    public static /* synthetic */ Object ipc$super(ulo uloVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/widgets/list/promotionfilter/SFPromotionFilterWidget");
    }

    public static /* synthetic */ void q2(ulo uloVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86de4828", new Object[]{uloVar, new Integer(i)});
        } else {
            uloVar.w2(i);
        }
    }

    public final void A2(GradientDrawable gradientDrawable, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c1df6ba", new Object[]{this, gradientDrawable, new Integer(i), new Integer(i2)});
            return;
        }
        gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        gradientDrawable.setColors(new int[]{i, i2});
    }

    public final void B2(int i, TUrlImageView tUrlImageView, PromotionFilterBean.b bVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e687ecb5", new Object[]{this, new Integer(i), tUrlImageView, bVar, view});
        } else if (!TextUtils.isEmpty(bVar.c) && bVar.k != 0 && bVar.j != 0) {
            ViewGroup.LayoutParams layoutParams = tUrlImageView.getLayoutParams();
            layoutParams.height = i;
            layoutParams.width = (int) ((i * bVar.j) / bVar.k);
            tUrlImageView.setVisibility(0);
            tUrlImageView.succListener(new b(this, view, tUrlImageView));
            tUrlImageView.failListener(new c(this, tUrlImageView));
            String imageUrl = tUrlImageView.getImageUrl();
            if (!TextUtils.isEmpty(imageUrl) && TextUtils.equals(imageUrl, bVar.c) && tUrlImageView.getTag() != null && ((Boolean) tUrlImageView.getTag()).booleanValue() && view != null) {
                view.setVisibility(8);
            }
            tUrlImageView.setImageUrl(bVar.c);
            if (view != null) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                layoutParams2.height = layoutParams.height;
                layoutParams2.width = layoutParams.width;
            }
        }
    }

    public final void C2(PromotionFilterBean.a aVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("203331ea", new Object[]{this, aVar});
        } else if (aVar != null) {
            StringBuilder sb = new StringBuilder("SrpPromotionFilter");
            if (aVar.f11548a) {
                str = "Select";
            } else {
                str = "Unselect";
            }
            sb.append(str);
            sb.append("-");
            sb.append(aVar.c);
            sen.e(sb.toString());
        }
    }

    public final void D2(PromotionFilterBean.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6959cdce", new Object[]{this, aVar});
        } else if (aVar != null) {
            String currentPageName = c2v.getInstance().getCurrentPageName();
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(currentPageName, 2201, currentPageName + "-SrpPromotionFilter-" + aVar.c, "", "", null).build());
        }
    }

    @Override // tb.abx
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return "SFPromotionFilterWidget";
    }

    public final void s2(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5312ac89", new Object[]{this, view, new Integer(i)});
        } else {
            ViewProxy.setOnClickListener(view, new a(i));
        }
    }

    public final void t2(PromotionFilterBean promotionFilterBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c8f0c16", new Object[]{this, promotionFilterBean});
            return;
        }
        LinearLayout linearLayout = (LinearLayout) getView();
        if (linearLayout == null) {
            logError("root view not created");
        } else if (promotionFilterBean == null) {
            linearLayout.setVisibility(8);
        } else {
            this.f29471a = promotionFilterBean;
            z2(promotionFilterBean, linearLayout);
        }
    }

    /* renamed from: u2 */
    public void bindWithData(SFPromotionFilterBean sFPromotionFilterBean) {
        PromotionFilterBean promotionFilterBean;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f3a5c32", new Object[]{this, sFPromotionFilterBean});
            return;
        }
        fy3.a(c2v.getInstance().getCurrentPageName(), ulo.class.getSimpleName());
        if (sFPromotionFilterBean != null && (promotionFilterBean = sFPromotionFilterBean.oldPromotionFilterBean) != null) {
            t2(promotionFilterBean);
        }
    }

    public final void v2(PromotionFilterBean.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df8d15a8", new Object[]{this, aVar});
        } else if (o4p.J0() && aVar.f11548a && !TextUtils.isEmpty(aVar.b) && !TextUtils.isEmpty(aVar.c)) {
            getModel().e().setParam(aVar.b, aVar.c);
        }
    }

    /* renamed from: x2 */
    public LinearLayout onCreateView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("887bc65e", new Object[]{this});
        }
        Activity activity = getActivity();
        LinearLayout linearLayout = new LinearLayout(activity);
        if (!getModel().e().C()) {
            linearLayout.setBackgroundResource(R.color.tbsearch_main_card_bg);
        }
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        linearLayout.setOrientation(0);
        linearLayout.setPadding(0, 0, DensityUtil.dip2px(activity, 10.0f), 0);
        return linearLayout;
    }

    public final void w2(int i) {
        PromotionFilterBean.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ef8cfa5", new Object[]{this, new Integer(i)});
            return;
        }
        PromotionFilterBean promotionFilterBean = this.f29471a;
        if (promotionFilterBean != null && i < promotionFilterBean.buttons.size() && i >= 0 && (aVar = this.f29471a.buttons.get(i)) != null) {
            CommonBaseDatasource e = getModel().e();
            boolean z = aVar.f11548a;
            for (int i2 = 0; i2 < this.f29471a.buttons.size(); i2++) {
                PromotionFilterBean.a aVar2 = this.f29471a.buttons.get(i2);
                if (aVar2 != null) {
                    aVar2.f11548a = false;
                    e.O(aVar2.b, aVar2.c);
                }
            }
            if (z) {
                e.O(aVar.b, aVar.c);
            } else {
                e.setParam(aVar.b, aVar.c);
            }
            aVar.f11548a = !z;
            C2(aVar);
            if (TextUtils.equals(aVar.f, "research")) {
                HashMap hashMap = new HashMap();
                hashMap.put(aVar.b, aVar.c);
                hashMap.put("q", e.getKeyword());
                x3p.d(hashMap, this.mActivity, e);
                return;
            }
            e.doNewSearch();
        }
    }

    public final View y2(PromotionFilterBean.a aVar, ViewGroup viewGroup, View view, int i) {
        int i2;
        GradientDrawable gradientDrawable;
        PromotionFilterBean.b bVar;
        String str;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("3e383fa7", new Object[]{this, aVar, viewGroup, view, new Integer(i)});
        }
        Activity activity = getActivity();
        if (view == null) {
            view = this.b.inflate(R.layout.mmd_tbsearch_promotion_filter_button, viewGroup, false);
        }
        View findViewById = view.findViewById(R.id.button);
        TextView textView = (TextView) view.findViewById(R.id.preText);
        TextView textView2 = (TextView) view.findViewById(R.id.replaceText);
        TextView textView3 = (TextView) view.findViewById(R.id.postText);
        TUrlImageView tUrlImageView = (TUrlImageView) view.findViewById(R.id.img);
        s2(findViewById, i);
        if (this.c) {
            IpChange ipChange2 = h3p.$ipChange;
            i2 = h3p.b(h3p.a.INSTANCE.e(), true);
        } else {
            i2 = p1p.c((float) zuo.e()) <= 360 ? 12 : 13;
        }
        float f = i2;
        textView.setTextSize(1, f);
        textView2.setTextSize(1, f);
        textView3.setTextSize(1, f);
        int dip2px = DensityUtil.dip2px(activity, 13.0f);
        textView.setVisibility(0);
        textView2.setVisibility(0);
        textView3.setVisibility(0);
        int i4 = 8;
        tUrlImageView.setVisibility(8);
        ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -2;
            layoutParams.height = -2;
        }
        Drawable background = findViewById.getBackground();
        if (background instanceof GradientDrawable) {
            gradientDrawable = (GradientDrawable) background;
        } else {
            gradientDrawable = new GradientDrawable();
        }
        gradientDrawable.setCornerRadius(DensityUtil.dip2px(activity, 22.0f));
        if (aVar.f11548a) {
            bVar = aVar.e;
        } else {
            bVar = aVar.d;
        }
        gradientDrawable.setStroke(DensityUtil.dip2px(activity, 1.0f), bVar.e);
        gradientDrawable.mutate();
        gradientDrawable.setGradientType(0);
        int i5 = bVar.h;
        if (i5 == 0 || (i3 = bVar.i) == 0) {
            int i6 = bVar.d;
            A2(gradientDrawable, i6, i6);
        } else {
            A2(gradientDrawable, i5, i3);
        }
        findViewById.setBackground(gradientDrawable);
        textView.setTextColor(bVar.f);
        textView3.setTextColor(bVar.f);
        textView2.setTextColor(bVar.g);
        if (TextUtils.isEmpty(bVar.f11549a)) {
            textView.setVisibility(8);
            textView2.setVisibility(8);
            textView3.setVisibility(8);
            B2(dip2px, tUrlImageView, bVar, null);
            return view;
        }
        boolean isEmpty = TextUtils.isEmpty(bVar.b);
        boolean z = true ^ isEmpty;
        int indexOf = !isEmpty ? bVar.f11549a.indexOf(bVar.b) : -1;
        if (indexOf == -1) {
            z = false;
        }
        if (z) {
            i4 = 0;
        }
        textView2.setVisibility(i4);
        textView3.setVisibility(i4);
        if (z) {
            String substring = bVar.f11549a.substring(0, indexOf);
            String substring2 = bVar.f11549a.substring(indexOf + bVar.b.length(), bVar.f11549a.length());
            textView.setText(substring);
            textView3.setText(substring2);
            textView2.setText(bVar.b);
            B2(dip2px, tUrlImageView, bVar, textView2);
        } else {
            textView.setText(bVar.f11549a);
        }
        if (!TextUtils.isEmpty(bVar.f11549a)) {
            StringBuilder sb = new StringBuilder();
            sb.append(bVar.f11549a);
            if (aVar.f11548a) {
                str = "，已选中";
            } else {
                str = Localization.q(R.string.taobao_app_1005_1_16660);
            }
            sb.append(str);
            findViewById.setContentDescription(sb.toString());
        }
        D2(aVar);
        v2(aVar);
        return view;
    }

    public void z2(PromotionFilterBean promotionFilterBean, LinearLayout linearLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cabee870", new Object[]{this, promotionFilterBean, linearLayout});
        } else if (!PromotionFilterBean.SINGLE.equals(promotionFilterBean.type)) {
            logError("not single mode");
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setVisibility(0);
            for (int i = 0; i < promotionFilterBean.buttons.size() && i < 3; i++) {
                View childAt = linearLayout.getChildAt(i);
                View y2 = y2(promotionFilterBean.buttons.get(i), linearLayout, childAt, i);
                if (childAt == null) {
                    linearLayout.addView(y2);
                }
            }
            for (int size = promotionFilterBean.buttons.size(); size < linearLayout.getChildCount(); size++) {
                linearLayout.removeViewAt(size);
            }
        }
    }
}
