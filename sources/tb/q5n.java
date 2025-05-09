package tb;

import android.app.Activity;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.collection.ArrayMap;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.datasource.impl.bean.ResultMainInfoBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.search.sf.datasource.CommonBaseDatasource;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.tao.util.DensityUtil;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.net.URLEncoder;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class q5n extends phw<o5n, LinearLayout, b64> implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final int HINT_DURATION = 300;

    /* renamed from: a  reason: collision with root package name */
    public TUrlImageView f26522a;
    public TUrlImageView b;
    public View c;
    public TextView d;
    public FrameLayout e;
    public TUrlImageView f;
    public o5n g;
    public ogo h = new ogo();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(815793590);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class e implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
                return;
            }
            ckf.g(animation, "animation");
            TUrlImageView z2 = q5n.z2(q5n.this);
            if (z2 != null) {
                z2.setVisibility(8);
                View v2 = q5n.v2(q5n.this);
                if (v2 != null) {
                    v2.setVisibility(8);
                } else {
                    ckf.y("mHighlightDot");
                    throw null;
                }
            } else {
                ckf.y("mNormalFloatButton");
                throw null;
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f2883e7", new Object[]{this, animation});
            } else {
                ckf.g(animation, "animation");
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2d146c4", new Object[]{this, animation});
            } else {
                ckf.g(animation, "animation");
            }
        }
    }

    static {
        t2o.a(815793589);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5n(Activity activity, ude udeVar, b64 b64Var, ViewGroup viewGroup, vfw vfwVar) {
        super(activity, udeVar, b64Var, viewGroup, vfwVar);
        ckf.g(activity, "activity");
        ckf.g(udeVar, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        ckf.g(b64Var, "model");
        b64Var.e().subscribe(this);
    }

    public static final void h(final q5n q5nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8568937", new Object[]{q5nVar});
            return;
        }
        ckf.g(q5nVar, "this$0");
        FrameLayout frameLayout = q5nVar.e;
        if (frameLayout == null) {
            ckf.y("mHintParent");
            throw null;
        } else if (frameLayout.getVisibility() != 8) {
            AnimationSet B2 = q5nVar.B2();
            B2.setAnimationListener(new Animation.AnimationListener() { // from class: tb.q5n$c$a$a
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                        return;
                    }
                    ckf.g(animation, "animation");
                    FrameLayout w2 = q5n.w2(q5n.this);
                    if (w2 != null) {
                        w2.setVisibility(8);
                        TUrlImageView x2 = q5n.x2(q5n.this);
                        if (x2 != null) {
                            x2.setVisibility(8);
                        } else {
                            ckf.y("mHintPic");
                            throw null;
                        }
                    } else {
                        ckf.y("mHintParent");
                        throw null;
                    }
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                    } else {
                        ckf.g(animation, "animation");
                    }
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                    } else {
                        ckf.g(animation, "animation");
                    }
                }
            });
            FrameLayout frameLayout2 = q5nVar.e;
            if (frameLayout2 != null) {
                frameLayout2.startAnimation(B2);
            } else {
                ckf.y("mHintParent");
                throw null;
            }
        }
    }

    public static /* synthetic */ Object ipc$super(q5n q5nVar, String str, Object... objArr) {
        if (str.hashCode() == -1303831088) {
            super.bindWithData(objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/widgets/list/floatbar/PushButtonWidget");
    }

    public static final /* synthetic */ TUrlImageView u2(q5n q5nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("915d3beb", new Object[]{q5nVar});
        }
        return q5nVar.b;
    }

    public static final /* synthetic */ View v2(q5n q5nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("dcef9aa5", new Object[]{q5nVar});
        }
        return q5nVar.c;
    }

    public static final /* synthetic */ FrameLayout w2(q5n q5nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("9eef4b2", new Object[]{q5nVar});
        }
        return q5nVar.e;
    }

    public static final /* synthetic */ TUrlImageView x2(q5n q5nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("860c23f9", new Object[]{q5nVar});
        }
        return q5nVar.f;
    }

    public static final /* synthetic */ TUrlImageView z2(q5n q5nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("fbd7ad7d", new Object[]{q5nVar});
        }
        return q5nVar.f26522a;
    }

    /* renamed from: A2 */
    public void bindWithData(o5n o5nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f64773", new Object[]{this, o5nVar});
            return;
        }
        super.bindWithData(o5nVar);
        ckf.d(o5nVar);
        L2(o5nVar);
        N2(getModel().e().getCurrentPage(), D2());
    }

    public final AnimationSet B2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AnimationSet) ipChange.ipc$dispatch("176e85c2", new Object[]{this});
        }
        AnimationSet animationSet = new AnimationSet(true);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 1.0f, 1, 1.0f, 1, 1.0f);
        animationSet.setDuration(300L);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(new AlphaAnimation(1.0f, 0.0f));
        return animationSet;
    }

    public final AnimationSet C2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AnimationSet) ipChange.ipc$dispatch("a29d70f7", new Object[]{this});
        }
        AnimationSet animationSet = new AnimationSet(false);
        animationSet.setDuration(300L);
        animationSet.addAnimation(new ScaleAnimation(0.0f, 1.0f, 1.0f, 1.0f, 1, 1.0f, 1, 1.0f));
        animationSet.addAnimation(new AlphaAnimation(0.0f, 1.0f));
        return animationSet;
    }

    public final o5n D2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o5n) ipChange.ipc$dispatch("73726efb", new Object[]{this});
        }
        o5n o5nVar = this.g;
        if (o5nVar != null) {
            return o5nVar;
        }
        ckf.y("mPushButtonBean");
        throw null;
    }

    public final ArrayMap<String, String> E2() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayMap) ipChange.ipc$dispatch("cc50fd3e", new Object[]{this});
        }
        CommonBaseDatasource e2 = getModel().e();
        ckf.f(e2, "getScopeDatasource(...)");
        CommonBaseDatasource commonBaseDatasource = e2;
        String keyword = commonBaseDatasource.getKeyword();
        RESULT totalSearchResult = commonBaseDatasource.getTotalSearchResult();
        ckf.d(totalSearchResult);
        CommonSearchResult commonSearchResult = (CommonSearchResult) totalSearchResult;
        ArrayMap<String, String> arrayMap = new ArrayMap<>();
        arrayMap.put("q", keyword);
        arrayMap.put("highlighted", String.valueOf(D2().t));
        String paramValueIncludingGlobal = commonBaseDatasource.getParamValueIncludingGlobal("channelSrp");
        String str2 = "";
        if (paramValueIncludingGlobal == null) {
            paramValueIncludingGlobal = str2;
        }
        arrayMap.put("channelSrp", paramValueIncludingGlobal);
        arrayMap.put(yj4.PARAM_SEARCH_KEYWORD_RN, commonSearchResult.getMainInfo().rn);
        Map<String, String> map = commonSearchResult.getMainInfo().pageTraceArgs;
        if (!(map == null || (str = map.get("utparam-cnt")) == null)) {
            str2 = str;
        }
        arrayMap.put("utparam-cnt", URLEncoder.encode(str2, "UTF-8"));
        return arrayMap;
    }

    /* renamed from: F2 */
    public LinearLayout onCreateView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("887bc65e", new Object[]{this});
        }
        View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.tbsearch_push_button, getContainer(), false);
        ckf.e(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
        return (LinearLayout) inflate;
    }

    public final void G2() {
        khq khqVar;
        ViewGroup viewGroup;
        TemplateBean template;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e188e2d", new Object[]{this});
            return;
        }
        nde findComponentOfScope = findComponentOfScope("childPageWidget");
        MuiseBean muiseBean = null;
        if (findComponentOfScope instanceof khq) {
            khqVar = (khq) findComponentOfScope;
        } else {
            khqVar = null;
        }
        if (khqVar != null) {
            View view = khqVar.getView();
            if (view instanceof ViewGroup) {
                viewGroup = (ViewGroup) view;
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                CommonBaseDatasource e2 = getModel().e();
                ckf.f(e2, "getScopeDatasource(...)");
                CommonBaseDatasource commonBaseDatasource = e2;
                CommonSearchResult commonSearchResult = (CommonSearchResult) commonBaseDatasource.getTotalSearchResult();
                if (commonSearchResult != null) {
                    BaseTypedBean baseTypedBean = commonSearchResult.pkModuleBean;
                    if (baseTypedBean instanceof MuiseBean) {
                        muiseBean = (MuiseBean) baseTypedBean;
                    }
                    if (muiseBean != null && (template = commonBaseDatasource.getTemplate(muiseBean.type)) != null) {
                        Activity activity = getActivity();
                        ckf.f(activity, "getActivity(...)");
                        b64 model = getModel();
                        ckf.f(model, "getModel(...)");
                        icj icjVar = new icj(activity, khqVar, model, template, viewGroup, new ye0(viewGroup));
                        icjVar.bindWithData(muiseBean);
                        icjVar.attachToContainer();
                    }
                }
            }
        }
    }

    public final void H2() {
        String str;
        ResultMainInfoBean mainInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccd6aeab", new Object[]{this});
        } else if (!TextUtils.isEmpty(D2().o)) {
            CommonSearchResult commonSearchResult = (CommonSearchResult) getModel().e().getLastSearchResult();
            ArrayMap arrayMap = new ArrayMap();
            if (commonSearchResult == null || (mainInfo = commonSearchResult.getMainInfo()) == null || (str = mainInfo.rn) == null) {
                str = "";
            }
            arrayMap.put(yj4.PARAM_SEARCH_KEYWORD_RN, str);
            arrayMap.put("srpKey", String.valueOf(getModel().e().hashCode()));
            Nav.from(this.mActivity).toUri(f6p.a(D2().o, arrayMap));
        }
    }

    public final void I2(o5n o5nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3503749e", new Object[]{this, o5nVar});
            return;
        }
        TUrlImageView tUrlImageView = this.b;
        if (tUrlImageView != null) {
            tUrlImageView.setImageUrl(o5nVar.c);
            TUrlImageView tUrlImageView2 = this.b;
            if (tUrlImageView2 != null) {
                tUrlImageView2.setVisibility(0);
                AnimationSet animationSet = new AnimationSet(false);
                ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
                scaleAnimation.setInterpolator(new OvershootInterpolator(3.0f));
                animationSet.addAnimation(scaleAnimation);
                animationSet.addAnimation(new AlphaAnimation(0.0f, 1.0f));
                animationSet.setDuration(300L);
                TUrlImageView tUrlImageView3 = this.b;
                if (tUrlImageView3 != null) {
                    tUrlImageView3.startAnimation(animationSet);
                    TUrlImageView tUrlImageView4 = this.b;
                    if (tUrlImageView4 != null) {
                        tUrlImageView4.postDelayed(new Runnable() { // from class: tb.pkz
                            @Override // java.lang.Runnable
                            public final void run() {
                                q5n.f(q5n.this);
                            }
                        }, (o5nVar.g * 1000) + 300);
                    } else {
                        ckf.y("mHighLightImage");
                        throw null;
                    }
                } else {
                    ckf.y("mHighLightImage");
                    throw null;
                }
            } else {
                ckf.y("mHighLightImage");
                throw null;
            }
        } else {
            ckf.y("mHighLightImage");
            throw null;
        }
    }

    public final void J2(final o5n o5nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dc1fe4b", new Object[]{this, o5nVar});
            return;
        }
        FrameLayout frameLayout = this.e;
        if (frameLayout != null) {
            frameLayout.postDelayed(new Runnable() { // from class: tb.qkz
                @Override // java.lang.Runnable
                public final void run() {
                    q5n.g(q5n.this, o5nVar);
                }
            }, 300L);
        } else {
            ckf.y("mHintParent");
            throw null;
        }
    }

    public final void K2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a28db71", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.f26522a;
        if (tUrlImageView != null) {
            tUrlImageView.setVisibility(0);
            AnimationSet animationSet = new AnimationSet(false);
            ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
            scaleAnimation.setInterpolator(new OvershootInterpolator(3.0f));
            animationSet.addAnimation(scaleAnimation);
            animationSet.addAnimation(new AlphaAnimation(0.0f, 1.0f));
            animationSet.setDuration(300L);
            TUrlImageView tUrlImageView2 = this.f26522a;
            if (tUrlImageView2 != null) {
                tUrlImageView2.startAnimation(animationSet);
            } else {
                ckf.y("mNormalFloatButton");
                throw null;
            }
        } else {
            ckf.y("mNormalFloatButton");
            throw null;
        }
    }

    public final void L2(o5n o5nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c91593cd", new Object[]{this, o5nVar});
            return;
        }
        ckf.g(o5nVar, "<set-?>");
        this.g = o5nVar;
    }

    @Override // tb.phw, tb.khq
    public void findAllViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1d31fad", new Object[]{this});
            return;
        }
        ROOT_VIEW view = getView();
        ckf.d(view);
        LinearLayout linearLayout = (LinearLayout) view;
        TUrlImageView tUrlImageView = (TUrlImageView) linearLayout.findViewById(R.id.highlight_float_button);
        this.b = tUrlImageView;
        if (tUrlImageView != null) {
            tUrlImageView.setVisibility(8);
            TUrlImageView tUrlImageView2 = this.b;
            if (tUrlImageView2 != null) {
                tUrlImageView2.setOnClickListener(this);
                this.c = linearLayout.findViewById(R.id.highlight_red_dot);
                TUrlImageView tUrlImageView3 = (TUrlImageView) linearLayout.findViewById(R.id.normal_float_button);
                this.f26522a = tUrlImageView3;
                if (tUrlImageView3 != null) {
                    tUrlImageView3.setVisibility(8);
                    TUrlImageView tUrlImageView4 = this.f26522a;
                    if (tUrlImageView4 != null) {
                        tUrlImageView4.setOnClickListener(this);
                        FrameLayout frameLayout = (FrameLayout) linearLayout.findViewById(R.id.hint_parent);
                        this.e = frameLayout;
                        if (frameLayout != null) {
                            frameLayout.setOnClickListener(this);
                            FrameLayout frameLayout2 = this.e;
                            if (frameLayout2 != null) {
                                frameLayout2.setVisibility(8);
                                TextView textView = (TextView) linearLayout.findViewById(R.id.hintText);
                                this.d = textView;
                                if (textView != null) {
                                    textView.setLayerType(1, null);
                                    ogo ogoVar = new ogo();
                                    this.h = ogoVar;
                                    TextView textView2 = this.d;
                                    if (textView2 != null) {
                                        textView2.setBackgroundDrawable(ogoVar);
                                        TUrlImageView tUrlImageView5 = (TUrlImageView) linearLayout.findViewById(R.id.hintPic);
                                        this.f = tUrlImageView5;
                                        if (tUrlImageView5 != null) {
                                            tUrlImageView5.setVisibility(8);
                                        } else {
                                            ckf.y("mHintPic");
                                            throw null;
                                        }
                                    } else {
                                        ckf.y("mHintText");
                                        throw null;
                                    }
                                } else {
                                    ckf.y("mHintText");
                                    throw null;
                                }
                            } else {
                                ckf.y("mHintParent");
                                throw null;
                            }
                        } else {
                            ckf.y("mHintParent");
                            throw null;
                        }
                    } else {
                        ckf.y("mNormalFloatButton");
                        throw null;
                    }
                } else {
                    ckf.y("mNormalFloatButton");
                    throw null;
                }
            } else {
                ckf.y("mHighLightImage");
                throw null;
            }
        } else {
            ckf.y("mHighLightImage");
            throw null;
        }
    }

    @Override // tb.abx
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return "PushButtonWidget";
    }

    public final void onEventMainThread(t2p t2pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15b8d6ed", new Object[]{this, t2pVar});
            return;
        }
        ckf.g(t2pVar, "after");
        N2(getModel().e().getCurrentPage(), D2());
    }

    public static final void g(final q5n q5nVar, o5n o5nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9da70f85", new Object[]{q5nVar, o5nVar});
            return;
        }
        ckf.g(q5nVar, "this$0");
        ckf.g(o5nVar, "$bean");
        TUrlImageView tUrlImageView = q5nVar.f26522a;
        if (tUrlImageView == null) {
            ckf.y("mNormalFloatButton");
            throw null;
        } else if (tUrlImageView.getVisibility() != 8) {
            FrameLayout frameLayout = q5nVar.e;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
                int i = ckf.b("promotion", o5nVar.l) ? 20 : 10;
                if (!TextUtils.isEmpty(o5nVar.e)) {
                    TUrlImageView tUrlImageView2 = q5nVar.f;
                    if (tUrlImageView2 != null) {
                        tUrlImageView2.setVisibility(0);
                        TUrlImageView tUrlImageView3 = q5nVar.f;
                        if (tUrlImageView3 != null) {
                            tUrlImageView3.setImageUrl(o5nVar.e);
                            TextView textView = q5nVar.d;
                            if (textView != null) {
                                textView.setPadding(DensityUtil.dip2px(q5nVar.mActivity, i), 0, DensityUtil.dip2px(q5nVar.mActivity, 41.0f), 0);
                            } else {
                                ckf.y("mHintText");
                                throw null;
                            }
                        } else {
                            ckf.y("mHintPic");
                            throw null;
                        }
                    } else {
                        ckf.y("mHintPic");
                        throw null;
                    }
                } else {
                    TUrlImageView tUrlImageView4 = q5nVar.f;
                    if (tUrlImageView4 != null) {
                        tUrlImageView4.setVisibility(8);
                        TextView textView2 = q5nVar.d;
                        if (textView2 != null) {
                            textView2.setPadding(DensityUtil.dip2px(q5nVar.mActivity, i), 0, DensityUtil.dip2px(q5nVar.mActivity, 15.0f), 0);
                        } else {
                            ckf.y("mHintText");
                            throw null;
                        }
                    } else {
                        ckf.y("mHintPic");
                        throw null;
                    }
                }
                TextView textView3 = q5nVar.d;
                if (textView3 != null) {
                    textView3.setText(o5nVar.d);
                    TextView textView4 = q5nVar.d;
                    if (textView4 != null) {
                        textView4.setContentDescription(o5nVar.d);
                        AnimationSet C2 = q5nVar.C2();
                        FrameLayout frameLayout2 = q5nVar.e;
                        if (frameLayout2 != null) {
                            frameLayout2.startAnimation(C2);
                            FrameLayout frameLayout3 = q5nVar.e;
                            if (frameLayout3 != null) {
                                frameLayout3.postDelayed(new Runnable() { // from class: tb.rkz
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        q5n.h(q5n.this);
                                    }
                                }, o5nVar.g * 1000);
                            } else {
                                ckf.y("mHintParent");
                                throw null;
                            }
                        } else {
                            ckf.y("mHintParent");
                            throw null;
                        }
                    } else {
                        ckf.y("mHintText");
                        throw null;
                    }
                } else {
                    ckf.y("mHintText");
                    throw null;
                }
            } else {
                ckf.y("mHintParent");
                throw null;
            }
        }
    }

    public static final void i(o5n o5nVar, q5n q5nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97992121", new Object[]{o5nVar, q5nVar});
            return;
        }
        ckf.g(o5nVar, "$bean");
        ckf.g(q5nVar, "this$0");
        if (!o5nVar.s) {
            TUrlImageView tUrlImageView = q5nVar.f26522a;
            if (tUrlImageView == null) {
                ckf.y("mNormalFloatButton");
                throw null;
            } else if (tUrlImageView.getVisibility() != 8) {
                View view = q5nVar.c;
                if (view != null) {
                    view.setVisibility(0);
                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 1.0f, 1, 1.0f);
                    scaleAnimation.setDuration(150L);
                    View view2 = q5nVar.c;
                    if (view2 != null) {
                        view2.startAnimation(scaleAnimation);
                    } else {
                        ckf.y("mHighlightDot");
                        throw null;
                    }
                } else {
                    ckf.y("mHighlightDot");
                    throw null;
                }
            }
        }
    }

    public final void N2(int i, o5n o5nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9be0296", new Object[]{this, new Integer(i), o5nVar});
            return;
        }
        ckf.g(o5nVar, "bean");
        if (tsq.x(o5n.MODE_BY_PAGE_WITHOUT_CLICK, o5nVar.k, true)) {
            int i2 = o5nVar.m;
            if (1 > i2 || i2 > i || i >= o5nVar.n) {
                TUrlImageView tUrlImageView = this.f26522a;
                if (tUrlImageView == null) {
                    ckf.y("mNormalFloatButton");
                    throw null;
                } else if (tUrlImageView.getVisibility() == 0) {
                    if (!o5nVar.s) {
                        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                        alphaAnimation.setDuration(300L);
                        alphaAnimation.setAnimationListener(new e());
                        TUrlImageView tUrlImageView2 = this.f26522a;
                        if (tUrlImageView2 != null) {
                            tUrlImageView2.startAnimation(alphaAnimation);
                        } else {
                            ckf.y("mNormalFloatButton");
                            throw null;
                        }
                    }
                    TUrlImageView tUrlImageView3 = this.b;
                    if (tUrlImageView3 != null) {
                        tUrlImageView3.setVisibility(8);
                        FrameLayout frameLayout = this.e;
                        if (frameLayout != null) {
                            frameLayout.setVisibility(8);
                            View view = this.c;
                            if (view != null) {
                                view.setVisibility(8);
                            } else {
                                ckf.y("mHighlightDot");
                                throw null;
                            }
                        } else {
                            ckf.y("mHintParent");
                            throw null;
                        }
                    } else {
                        ckf.y("mHighLightImage");
                        throw null;
                    }
                }
            } else {
                boolean M2 = M2(o5nVar, i);
                TUrlImageView tUrlImageView4 = this.f26522a;
                if (tUrlImageView4 == null) {
                    ckf.y("mNormalFloatButton");
                    throw null;
                } else if (tUrlImageView4.getVisibility() == 8) {
                    boolean b = ckf.b("promotion", o5nVar.l);
                    if (b) {
                        FrameLayout frameLayout2 = this.e;
                        if (frameLayout2 != null) {
                            frameLayout2.getLayoutParams().height = DensityUtil.dip2px(this.mActivity, 39.0f);
                            TextView textView = this.d;
                            if (textView != null) {
                                textView.setTextSize(1, 14.0f);
                                FrameLayout frameLayout3 = this.e;
                                if (frameLayout3 != null) {
                                    ViewGroup.LayoutParams layoutParams = frameLayout3.getLayoutParams();
                                    ckf.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                    ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = DensityUtil.dip2px(this.mActivity, 10.0f);
                                } else {
                                    ckf.y("mHintParent");
                                    throw null;
                                }
                            } else {
                                ckf.y("mHintText");
                                throw null;
                            }
                        } else {
                            ckf.y("mHintParent");
                            throw null;
                        }
                    }
                    this.h.d(o5nVar.i);
                    this.h.b(o5nVar.j);
                    this.h.c(b);
                    this.h.a();
                    TextView textView2 = this.d;
                    if (textView2 != null) {
                        textView2.setTextColor(o5nVar.h);
                        TUrlImageView tUrlImageView5 = this.f26522a;
                        if (tUrlImageView5 != null) {
                            tUrlImageView5.setContentDescription(o5nVar.f25151a);
                            TUrlImageView tUrlImageView6 = this.f26522a;
                            if (tUrlImageView6 != null) {
                                tUrlImageView6.setImageUrl(o5nVar.b);
                                if (!M2 || TextUtils.isEmpty(o5nVar.c)) {
                                    K2();
                                }
                                sen.f("PushButton" + o5nVar.p + "Display", E2());
                                return;
                            }
                            ckf.y("mNormalFloatButton");
                            throw null;
                        }
                        ckf.y("mNormalFloatButton");
                        throw null;
                    }
                    ckf.y("mHintText");
                    throw null;
                }
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        if (TextUtils.equals(D2().q, "openPk")) {
            G2();
        } else {
            H2();
        }
        D2().s = true;
        sen.f("PushButton" + D2().p + "Click", E2());
        View view2 = this.c;
        if (view2 != null) {
            view2.clearAnimation();
            View view3 = this.c;
            if (view3 != null) {
                view3.setVisibility(8);
            } else {
                ckf.y("mHighlightDot");
                throw null;
            }
        } else {
            ckf.y("mHighlightDot");
            throw null;
        }
    }

    public final boolean M2(final o5n o5nVar, int i) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb0ed2a4", new Object[]{this, o5nVar, new Integer(i)})).booleanValue();
        }
        if (o5nVar.u || o5nVar.f != i) {
            return false;
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.mActivity);
        if (System.currentTimeMillis() - defaultSharedPreferences.getLong(c3p.KEY_LAST_TIME_PREFIX + o5nVar.p, 0L) < o5nVar.r) {
            o5nVar.u = true;
            return false;
        }
        if (!TextUtils.isEmpty(o5nVar.d) || !TextUtils.isEmpty(o5nVar.e)) {
            J2(o5nVar);
            z = true;
        }
        if (!TextUtils.isEmpty(o5nVar.c)) {
            I2(o5nVar);
            z = true;
        } else {
            TUrlImageView tUrlImageView = this.b;
            if (tUrlImageView != null) {
                tUrlImageView.setVisibility(8);
            } else {
                ckf.y("mHighLightImage");
                throw null;
            }
        }
        if (z) {
            SharedPreferences.Editor edit = defaultSharedPreferences.edit();
            edit.putLong(c3p.KEY_LAST_TIME_PREFIX + o5nVar.p, System.currentTimeMillis()).apply();
            View view = this.c;
            if (view != null) {
                view.postDelayed(new Runnable() { // from class: tb.okz
                    @Override // java.lang.Runnable
                    public final void run() {
                        q5n.i(o5n.this, this);
                    }
                }, (o5nVar.g * 1000) + 600);
                o5nVar.t = true;
            } else {
                ckf.y("mHighlightDot");
                throw null;
            }
        }
        o5nVar.u = true;
        return z;
    }

    public static final void f(final q5n q5nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2d564f8", new Object[]{q5nVar});
            return;
        }
        ckf.g(q5nVar, "this$0");
        TUrlImageView tUrlImageView = q5nVar.b;
        if (tUrlImageView == null) {
            ckf.y("mHighLightImage");
            throw null;
        } else if (tUrlImageView.getVisibility() != 8) {
            AnimationSet animationSet = new AnimationSet(true);
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f);
            animationSet.setDuration(300L);
            animationSet.addAnimation(scaleAnimation);
            animationSet.addAnimation(new AlphaAnimation(1.0f, 0.0f));
            animationSet.setAnimationListener(new Animation.AnimationListener() { // from class: tb.q5n$b$a
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                        return;
                    }
                    ckf.g(animation, "animation");
                    TUrlImageView u2 = q5n.u2(q5n.this);
                    if (u2 != null) {
                        u2.setVisibility(8);
                    } else {
                        ckf.y("mHighLightImage");
                        throw null;
                    }
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                    } else {
                        ckf.g(animation, "animation");
                    }
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                    } else {
                        ckf.g(animation, "animation");
                    }
                }
            });
            TUrlImageView tUrlImageView2 = q5nVar.b;
            if (tUrlImageView2 != null) {
                tUrlImageView2.startAnimation(animationSet);
                TUrlImageView tUrlImageView3 = q5nVar.f26522a;
                if (tUrlImageView3 != null) {
                    tUrlImageView3.setVisibility(0);
                    AnimationSet animationSet2 = new AnimationSet(false);
                    ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
                    scaleAnimation2.setInterpolator(new OvershootInterpolator(3.0f));
                    animationSet2.addAnimation(scaleAnimation2);
                    animationSet2.addAnimation(new AlphaAnimation(0.0f, 1.0f));
                    animationSet2.setDuration(300L);
                    animationSet2.setStartOffset(150L);
                    TUrlImageView tUrlImageView4 = q5nVar.f26522a;
                    if (tUrlImageView4 != null) {
                        tUrlImageView4.startAnimation(animationSet2);
                    } else {
                        ckf.y("mNormalFloatButton");
                        throw null;
                    }
                } else {
                    ckf.y("mNormalFloatButton");
                    throw null;
                }
            } else {
                ckf.y("mHighLightImage");
                throw null;
            }
        }
    }
}
