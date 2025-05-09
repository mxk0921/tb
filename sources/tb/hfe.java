package tb;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.BaseResultActivity;
import com.taobao.search.sf.datasource.CommonBaseDatasource;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class hfe extends phw<Void, FrameLayout, acx<CommonBaseDatasource>> implements zo6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public FrameLayout f20599a;
    public TUrlImageView b;
    public TUrlImageView c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                hfe.this.getActivity().finish();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            CommonBaseDatasource e = hfe.this.getModel().e();
            x3p.b("", e.getTab(), e.k(), hfe.this.getActivity(), "srp", false);
        }
    }

    static {
        t2o.a(815793766);
        t2o.a(993002134);
    }

    public hfe(Activity activity, ude udeVar, acx<CommonBaseDatasource> acxVar, ViewGroup viewGroup, vfw vfwVar) {
        super(activity, udeVar, acxVar, viewGroup, vfwVar);
    }

    public static /* synthetic */ Object ipc$super(hfe hfeVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/widgets/searchbar/IconBarWidget");
    }

    @Override // tb.abx
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return "SearchIconWidget";
    }

    @Override // tb.zo6
    public void onHitDarkMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f95f2594", new Object[]{this});
            return;
        }
        this.c.setImageUrl("https://img.alicdn.com/imgextra/i1/O1CN01n2T7JF1hduLXXzJY6_!!6000000004301-2-tps-72-72.png");
        this.b.setImageUrl("https://img.alicdn.com/imgextra/i4/O1CN01mutH501M3AeAWbOhg_!!6000000001378-2-tps-72-72.png");
    }

    public final boolean q2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ded1a48e", new Object[]{this})).booleanValue();
        }
        if (getActivity() instanceof oxb) {
            return ((oxb) getActivity()).E1();
        }
        return false;
    }

    /* renamed from: s2 */
    public FrameLayout onCreateView() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("6075f6f2", new Object[]{this});
        }
        if (((BaseResultActivity) getActivity()).isImmersiveStatus()) {
            i = SystemBarDecorator.getStatusBarHeight(getActivity());
        }
        this.f20599a = new FrameLayout(getActivity());
        this.f20599a.setLayoutParams(new ViewGroup.LayoutParams(-1, (o1p.b(36) + i) - rim.Companion.b()));
        this.b = new TUrlImageView(getActivity());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(o1p.a(24.0f), o1p.a(24.0f));
        layoutParams.gravity = 80;
        layoutParams.leftMargin = o1p.a(12.0f);
        this.f20599a.addView(this.b, layoutParams);
        this.b.setImageUrl("https://img.alicdn.com/imgextra/i4/O1CN01DrE0sX26A0tCXcVvv_!!6000000007620-2-tps-72-72.png");
        this.b.setOnClickListener(new a());
        this.c = new TUrlImageView(getActivity());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(o1p.a(24.0f), o1p.a(24.0f));
        layoutParams2.gravity = 85;
        layoutParams2.rightMargin = o1p.a(12.0f);
        this.c.setImageUrl("https://img.alicdn.com/imgextra/i2/O1CN01mlKaOJ1Pq7pVhV4zd_!!6000000001891-2-tps-72-72.png");
        this.c.setOnClickListener(new b());
        this.f20599a.addView(this.c, layoutParams2);
        if (q2()) {
            onHitDarkMode();
        }
        if (getActivity() instanceof oxb) {
            ((oxb) getActivity()).P(this);
        }
        return this.f20599a;
    }
}
