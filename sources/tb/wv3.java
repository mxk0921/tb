package tb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.search.sf.BaseResultActivity;
import com.taobao.search.sf.datasource.CommonBaseDatasource;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class wv3 extends phw<Void, FrameLayout, acx<CommonBaseDatasource>> implements zo6, View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public FrameLayout f30950a;
    public TUrlImageView b;
    public ImageView c;
    public TUrlImageView d;
    public TextView e;
    public LinearLayout f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/widgets/searchbar/CloseBarWidget$1");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else {
                wv3.q2(wv3.this).setVisibility(8);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/widgets/searchbar/CloseBarWidget$2");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            wv3.q2(wv3.this).setVisibility(8);
            CommonBaseDatasource e = wv3.this.getModel().e();
            x3p.b(e.getKeyword(), e.getTab(), e.k(), wv3.this.getActivity(), "srp", false);
        }
    }

    static {
        t2o.a(815793761);
        t2o.a(993002134);
    }

    public wv3(Activity activity, ude udeVar, acx<CommonBaseDatasource> acxVar, ViewGroup viewGroup, vfw vfwVar) {
        super(activity, udeVar, acxVar, viewGroup, vfwVar);
    }

    public static /* synthetic */ Object ipc$super(wv3 wv3Var, String str, Object... objArr) {
        if (str.hashCode() == -506257491) {
            super.findAllViews();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/widgets/searchbar/CloseBarWidget");
    }

    public static /* synthetic */ TUrlImageView q2(wv3 wv3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("9ab035d", new Object[]{wv3Var});
        }
        return wv3Var.d;
    }

    @Override // tb.phw, tb.khq
    public void findAllViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1d31fad", new Object[]{this});
            return;
        }
        super.findAllViews();
        ((ViewGroup.MarginLayoutParams) ((LinearLayout) this.f30950a.findViewById(R.id.ll_close_bar_container)).getLayoutParams()).topMargin = SystemBarDecorator.getStatusBarHeight(getActivity()) - rim.Companion.b();
        this.b = (TUrlImageView) this.f30950a.findViewById(R.id.imv_close_popup);
        this.c = (ImageView) this.f30950a.findViewById(R.id.btn_go_back);
        this.d = (TUrlImageView) this.f30950a.findViewById(R.id.imv_expand);
        this.e = (TextView) this.f30950a.findViewById(R.id.searchEdit);
        this.f = (LinearLayout) this.f30950a.findViewById(R.id.searchbar_inner);
        this.b.setImageUrl("https://img.alicdn.com/imgextra/i4/O1CN014MKXkw1bH6wJIYVF2_!!6000000003439-2-tps-72-72.png");
        this.b.setOnClickListener(this);
        this.d.setImageUrl("https://img.alicdn.com/imgextra/i4/O1CN01063fWf1fYkeusYyzX_!!6000000004019-2-tps-72-72.png");
        this.d.setOnClickListener(this);
        this.c.setOnClickListener(this);
        this.f.setOnClickListener(this);
        this.e.setOnClickListener(this);
        this.e.setText(getModel().e().getKeyword());
        if (qrl.d(getModel().f().getParam(r4p.KEY_POP_UP_HEIGHT), 0.0f) >= 1.0f) {
            this.d.setVisibility(8);
        }
    }

    @Override // tb.abx
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return "SearchCloseWidget";
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view == this.d) {
            ((BaseResultActivity) getActivity()).v3(new a());
        } else if (view == this.b) {
            rim.h();
        } else if (view == this.c) {
            getActivity().finish();
        } else if (view == this.f || view == this.e) {
            ((BaseResultActivity) getActivity()).v3(new b());
        } else if (view == null) {
            String paramValueIncludingGlobal = getModel().e().getParamValueIncludingGlobal("channelSrp");
            if (!TextUtils.isEmpty(paramValueIncludingGlobal)) {
                str = "ssk-" + paramValueIncludingGlobal;
            } else {
                str = "ssk";
            }
            Nav.from(getActivity()).toUri("http://h5.m.taobao.com/tusou/index.html?pssource=" + str);
            sen.h("PhotoSearch_Enter", "a2141.7631709.1999021211.4922322");
        }
    }

    @Override // tb.zo6
    public void onHitDarkMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f95f2594", new Object[]{this});
        }
    }

    /* renamed from: s2 */
    public FrameLayout onCreateView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("6075f6f2", new Object[]{this});
        }
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(getActivity()).inflate(R.layout.tbsearch_popup_srp_searchbar_with_close, (ViewGroup) new FrameLayout(getActivity()), false);
        this.f30950a = frameLayout;
        return frameLayout;
    }
}
