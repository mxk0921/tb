package tb;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.motion.widget.Key;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.searchbaseframe.uikit.screentype.ScreenType;
import com.taobao.search.searchdoor.SearchDoorActivity;
import com.taobao.search.searchdoor.activate.guess.ActivateGuessBean;
import com.taobao.search.searchdoor.activate.guess.GuessDiscoveryCellBean;
import com.taobao.search.searchdoor.activate.guess.GuessDiscoveryVO;
import com.taobao.search.searchdoor.activate.guess.impl.GuessLayout;
import com.taobao.search.searchdoor.activate.hotspot.impl.HotSpotsViewHolder;
import com.taobao.search.searchdoor.sf.SearchDoorViewPool;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MethodEnum;
import tb.i5p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class sma extends phw<GuessDiscoveryCellBean, View, c2p> implements View.OnClickListener, nbc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static final int l = o1p.a(12.0f);
    public static final int m = o1p.a(16.0f);
    public static final int n = Color.parseColor("#11192D");
    public static final int o = Color.parseColor("#111111");
    public static final int p = Color.parseColor("#D8D8D8");
    public static final int q = Color.parseColor("#CCCCCC");

    /* renamed from: a  reason: collision with root package name */
    public TUrlImageView f28144a;
    public TUrlImageView b;
    public View c;
    public GuessLayout d;
    public TextView e;
    public boolean f;
    public ValueAnimator g;
    public GuessDiscoveryCellBean h;
    public boolean i;
    public boolean j;
    public View k;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815792981);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class c implements hk4<pma> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        /* renamed from: a */
        public void accept(pma pmaVar) throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("95a33673", new Object[]{this, pmaVar});
            } else if (pmaVar != null) {
                sma.s2(sma.this, pmaVar);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class d extends u0p {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
            super("activity");
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            if (str.hashCode() == 1569381830) {
                super.accept((Throwable) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/activate/guess/impl/GuessDiscoveryViewHolder$updateGuessDiscovery$2");
        }

        @Override // tb.u0p
        /* renamed from: a */
        public void accept(Throwable th) throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5d8addc6", new Object[]{this, th});
                return;
            }
            ckf.g(th, "throwable");
            super.accept(th);
        }
    }

    static {
        t2o.a(815792980);
        t2o.a(815792990);
        o1p.b(12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sma(Activity activity, ude udeVar, c2p c2pVar, ViewGroup viewGroup, vfw vfwVar) {
        super(activity, udeVar, c2pVar, viewGroup, vfwVar);
        ckf.g(activity, "activity");
        ckf.g(udeVar, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        this.f = true;
        SearchDoorViewPool d2 = ((xnd) activity).d();
        if (d2 != null) {
            this.f = !d2.h();
        }
    }

    public static final void d(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f67ad57", new Object[]{view});
        }
    }

    public static final void e(sma smaVar, ActivateGuessBean activateGuessBean, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76b87381", new Object[]{smaVar, activateGuessBean, new Integer(i)});
            return;
        }
        ckf.g(smaVar, "this$0");
        ckf.g(activateGuessBean, "$tagBean");
        HashMap<String, String> u2 = smaVar.u2(activateGuessBean, i);
        u2.put("channelSrp", smaVar.getModel().a().d());
        sen.k(SearchDoorActivity.PAGE_NAME, "Page_SearchDoor_Button-Exposure", u2);
    }

    public static /* synthetic */ Object ipc$super(sma smaVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 217607196) {
            super.onCtxResume();
            return null;
        } else if (hashCode == 299066517) {
            super.onCtxPause();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/searchdoor/activate/guess/impl/GuessDiscoveryViewHolder");
        }
    }

    public static final /* synthetic */ void s2(sma smaVar, pma pmaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f493036", new Object[]{smaVar, pmaVar});
        } else {
            smaVar.z2(pmaVar);
        }
    }

    public final boolean A2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("303f89a0", new Object[]{this})).booleanValue();
        }
        GuessDiscoveryCellBean guessDiscoveryCellBean = this.h;
        ckf.d(guessDiscoveryCellBean);
        return guessDiscoveryCellBean.discoveryVO.simplyStyle;
    }

    public final void B2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6ce5f97", new Object[]{this});
            return;
        }
        GuessDiscoveryCellBean guessDiscoveryCellBean = this.h;
        ckf.d(guessDiscoveryCellBean);
        if (!guessDiscoveryCellBean.preload) {
            sen.m(SearchDoorActivity.PAGE_NAME, "Page_SearchDoor_Button-Change-Active", 2101, null);
        }
    }

    public final void C2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21692dc3", new Object[]{this});
            return;
        }
        GuessDiscoveryCellBean guessDiscoveryCellBean = this.h;
        ckf.d(guessDiscoveryCellBean);
        if (!guessDiscoveryCellBean.preload) {
            GuessDiscoveryCellBean guessDiscoveryCellBean2 = this.h;
            ckf.d(guessDiscoveryCellBean2);
            if (!guessDiscoveryCellBean2.exposed) {
                GuessDiscoveryCellBean guessDiscoveryCellBean3 = this.h;
                ckf.d(guessDiscoveryCellBean3);
                guessDiscoveryCellBean3.exposed = true;
                sen.m(SearchDoorActivity.PAGE_NAME, "Page_SearchDoor_Button-Change-Active", 2201, null);
            }
        }
    }

    @Override // tb.nbc
    public void E0(ActivateGuessBean activateGuessBean, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63af14ab", new Object[]{this, activateGuessBean, new Integer(i)});
            return;
        }
        ckf.g(activateGuessBean, "tagBean");
        D2(activateGuessBean, i);
    }

    public final void E2(final ActivateGuessBean activateGuessBean, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("199b1d52", new Object[]{this, activateGuessBean, new Integer(i)});
        } else {
            le1.a().execute(new Runnable() { // from class: tb.x7z
                @Override // java.lang.Runnable
                public final void run() {
                    sma.e(sma.this, activateGuessBean, i);
                }
            });
        }
    }

    public final void F2(TextView textView) {
        Typeface typeface;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd370449", new Object[]{this, textView});
            return;
        }
        Typeface create = Typeface.create("PingFangSC-Medium", 1);
        if (create != null) {
            typeface = Typeface.create(create, 1);
        } else {
            typeface = Typeface.defaultFromStyle(1);
        }
        textView.setTypeface(typeface);
    }

    public final void G2(GuessDiscoveryCellBean guessDiscoveryCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("766aa212", new Object[]{this, guessDiscoveryCellBean});
            return;
        }
        GuessLayout guessLayout = this.d;
        if (guessLayout != null) {
            guessLayout.bind(guessDiscoveryCellBean, this);
        } else {
            ckf.y("queryContainer");
            throw null;
        }
    }

    public final void H2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97bb9dab", new Object[]{this, new Boolean(z)});
        } else {
            new i5p.c().c(new rma("mtop.relationrecommend.WirelessRecommend.recommend", "2.0", false, false, false, "suggest", MethodEnum.POST, "29963", y2(z))).b(new qma()).d(new v5p("Default")).a().e().j().n(new c(), new d());
        }
    }

    @Override // tb.nbc
    public void R1(GuessDiscoveryCellBean guessDiscoveryCellBean, ActivateGuessBean activateGuessBean, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a39a4df2", new Object[]{this, guessDiscoveryCellBean, activateGuessBean, new Integer(i)});
            return;
        }
        ckf.g(guessDiscoveryCellBean, "bean");
        ckf.g(activateGuessBean, "tagBean");
        if (!guessDiscoveryCellBean.preload) {
            E2(activateGuessBean, i);
        }
    }

    @Override // tb.abx
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return "guess_discovery";
    }

    @Override // tb.abx
    public void onCtxPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d36495", new Object[]{this});
            return;
        }
        super.onCtxPause();
        v2();
        this.i = true;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.view.View, java.lang.Object] */
    /* JADX WARN: Unknown variable types count: 2 */
    @Override // tb.abx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCtxResume() {
        /*
            r4 = this;
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = tb.sma.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0012
            java.lang.String r2 = "cf86c1c"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r4
            r1.ipc$dispatch(r2, r3)
            return
        L_0x0012:
            super.onCtxResume()
            android.view.View r1 = r4.getView()
            if (r1 == 0) goto L_0x0020
            android.view.ViewParent r1 = r1.getParent()
            goto L_0x0021
        L_0x0020:
            r1 = 0
        L_0x0021:
            if (r1 == 0) goto L_0x0054
            android.view.View r1 = r4.getView()
            tb.ckf.d(r1)
            android.view.ViewParent r1 = r1.getParent()
            java.lang.String r2 = "null cannot be cast to non-null type android.view.View"
            tb.ckf.e(r1, r2)
            android.view.View r1 = (android.view.View) r1
            boolean r1 = androidx.core.view.ViewCompat.isAttachedToWindow(r1)
            if (r1 == 0) goto L_0x0054
            boolean r1 = r4.i
            if (r1 == 0) goto L_0x0054
            com.taobao.search.searchdoor.activate.guess.GuessDiscoveryCellBean r1 = r4.h
            if (r1 == 0) goto L_0x0054
            tb.ckf.d(r1)
            com.taobao.search.searchdoor.activate.guess.GuessDiscoveryVO r1 = r1.discoveryVO
            boolean r1 = r1.changeOnReturn
            if (r1 == 0) goto L_0x0054
            boolean r1 = r4.f
            if (r1 == 0) goto L_0x0054
            r4.H2(r0)
        L_0x0054:
            r4.i = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.sma.onCtxResume():void");
    }

    /* renamed from: t2 */
    public void bindWithData(GuessDiscoveryCellBean guessDiscoveryCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d1f7e09", new Object[]{this, guessDiscoveryCellBean});
        } else if (guessDiscoveryCellBean != null && this.h != guessDiscoveryCellBean) {
            this.h = guessDiscoveryCellBean;
            I2();
            J2();
        }
    }

    public final HashMap<String, String> u2(ActivateGuessBean activateGuessBean, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("e1fe415c", new Object[]{this, activateGuessBean, new Integer(i)});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("q", activateGuessBean.searchtext);
        StringBuilder sb = new StringBuilder();
        GuessDiscoveryCellBean guessDiscoveryCellBean = this.h;
        ckf.d(guessDiscoveryCellBean);
        sb.append(guessDiscoveryCellBean.traceBizType);
        sb.append('-');
        GuessDiscoveryCellBean guessDiscoveryCellBean2 = this.h;
        ckf.d(guessDiscoveryCellBean2);
        sb.append(guessDiscoveryCellBean2.traceTmplType);
        hashMap.put("from", sb.toString());
        GuessDiscoveryCellBean guessDiscoveryCellBean3 = this.h;
        ckf.d(guessDiscoveryCellBean3);
        hashMap.put(h1p.KEY_SUGGEST_RN, guessDiscoveryCellBean3.suggestRn);
        hashMap.put("index", String.valueOf(i));
        hashMap.put("subtype", activateGuessBean.subtype);
        if (TextUtils.isEmpty(activateGuessBean.displaytype)) {
            hashMap.put("displaytype", "normal");
        } else {
            hashMap.put("displaytype", activateGuessBean.displaytype);
        }
        if (activateGuessBean.justWatchInfo != null) {
            hashMap.put("icontype", "seen");
        }
        return hashMap;
    }

    public final void v2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a60409f", new Object[]{this});
        } else if (this.f28144a != null) {
            ValueAnimator valueAnimator = this.g;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                ValueAnimator valueAnimator2 = this.g;
                ckf.d(valueAnimator2);
                valueAnimator2.cancel();
            }
            TUrlImageView tUrlImageView = this.f28144a;
            ckf.d(tUrlImageView);
            tUrlImageView.setRotation(0.0f);
        }
    }

    public final String x2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b7f390a8", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        GuessDiscoveryCellBean guessDiscoveryCellBean = this.h;
        ckf.d(guessDiscoveryCellBean);
        for (ActivateGuessBean activateGuessBean : guessDiscoveryCellBean.discoveryVO.result.text) {
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(activateGuessBean.searchtext);
        }
        return sb.toString();
    }

    public final String y2(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("be642c8f", new Object[]{this, new Boolean(z)});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "channelSrp", getModel().a().d());
        jSONObject.put((JSONObject) "changeQuerys", x2());
        jSONObject.put((JSONObject) "searchFindFrom", "hyh");
        GuessDiscoveryCellBean guessDiscoveryCellBean = this.h;
        ckf.d(guessDiscoveryCellBean);
        jSONObject.put((JSONObject) "sfStratage", guessDiscoveryCellBean.discoveryVO.sfStratage);
        jSONObject.put((JSONObject) "area", "jhy_query_rec");
        GuessDiscoveryCellBean guessDiscoveryCellBean2 = this.h;
        ckf.d(guessDiscoveryCellBean2);
        jSONObject.put((JSONObject) h1p.KEY_SUGGEST_RN, guessDiscoveryCellBean2.suggestRn);
        if (z) {
            str = "Y";
        } else {
            str = "N";
        }
        jSONObject.put((JSONObject) "is_user_click_hyh", str);
        if (ScreenType.IS_PAD || ScreenType.IS_FOLDABLE) {
            jSONObject.put((JSONObject) "itemBangNewJumpUrl", "false");
        } else {
            jSONObject.put((JSONObject) "itemBangNewJumpUrl", "true");
        }
        String json = jSONObject.toString();
        ckf.f(json, "toString(...)");
        return json;
    }

    public final void I2() {
        String str;
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5f373d8", new Object[]{this});
        } else if (!this.f) {
            TUrlImageView tUrlImageView = this.b;
            if (tUrlImageView != null) {
                if (this.j) {
                    str3 = "https://gw.alicdn.com/imgextra/i4/O1CN01CCaaDz25jS2bmtYBJ_!!6000000007562-2-tps-80-80.png";
                } else if (A2()) {
                    str3 = "https://gw.alicdn.com/imgextra/i3/O1CN01mOakqr1CQr1PCHYhL_!!6000000000076-2-tps-32-32.png";
                } else {
                    str3 = "https://gw.alicdn.com/imgextra/i4/O1CN01KDugBT1CI9LHsCi37_!!6000000000057-2-tps-32-32.png";
                }
                tUrlImageView.setImageUrl(str3);
                TUrlImageView tUrlImageView2 = this.b;
                if (tUrlImageView2 != null) {
                    tUrlImageView2.setContentDescription("显示");
                    View view = this.c;
                    if (view != null) {
                        view.setVisibility(8);
                        TUrlImageView tUrlImageView3 = this.f28144a;
                        if (tUrlImageView3 != null) {
                            tUrlImageView3.setVisibility(8);
                        }
                        TextView textView = this.e;
                        if (textView != null) {
                            textView.setVisibility(0);
                        } else {
                            ckf.y("hideTextView");
                            throw null;
                        }
                    } else {
                        ckf.y("dividerView");
                        throw null;
                    }
                } else {
                    ckf.y("hideBtn");
                    throw null;
                }
            } else {
                ckf.y("hideBtn");
                throw null;
            }
        } else {
            TUrlImageView tUrlImageView4 = this.f28144a;
            if (tUrlImageView4 != null) {
                if (this.j) {
                    str2 = "https://gw.alicdn.com/imgextra/i4/O1CN01s2Bp8f1Yie1T8eQXd_!!6000000003093-2-tps-56-56.png";
                } else if (A2()) {
                    str2 = "https://gw.alicdn.com/imgextra/i1/O1CN01zOlWWZ1zWjHAnNiV5_!!6000000006722-2-tps-48-48.png";
                } else {
                    str2 = "https://img.alicdn.com/imgextra/i2/O1CN01BYevlg1SRnXPsfzlS_!!6000000002244-2-tps-48-48.png";
                }
                tUrlImageView4.setImageUrl(str2);
            }
            TUrlImageView tUrlImageView5 = this.b;
            if (tUrlImageView5 != null) {
                if (this.j) {
                    str = HotSpotsViewHolder.openEyeUrl2024;
                } else if (A2()) {
                    str = "https://gw.alicdn.com/imgextra/i1/O1CN01k5nUq427Tzq0wA8xC_!!6000000007799-2-tps-48-48.png";
                } else {
                    str = "https://img.alicdn.com/imgextra/i4/O1CN01eFCJ7A1zFmSt1yqwo_!!6000000006685-2-tps-48-48.png";
                }
                tUrlImageView5.setImageUrl(str);
                TextView textView2 = this.e;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    View view2 = this.c;
                    if (view2 != null) {
                        view2.setVisibility(0);
                        TUrlImageView tUrlImageView6 = this.f28144a;
                        if (tUrlImageView6 != null) {
                            tUrlImageView6.setVisibility(0);
                        }
                        TUrlImageView tUrlImageView7 = this.b;
                        if (tUrlImageView7 != null) {
                            tUrlImageView7.setContentDescription("隐藏");
                            C2();
                            return;
                        }
                        ckf.y("hideBtn");
                        throw null;
                    }
                    ckf.y("dividerView");
                    throw null;
                }
                ckf.y("hideTextView");
                throw null;
            }
            ckf.y("hideBtn");
            throw null;
        }
    }

    public final void J2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c934457e", new Object[]{this});
            return;
        }
        GuessDiscoveryCellBean guessDiscoveryCellBean = this.h;
        if (guessDiscoveryCellBean != null) {
            if (this.f) {
                GuessLayout guessLayout = this.d;
                if (guessLayout != null) {
                    guessLayout.setVisibility(0);
                    G2(guessDiscoveryCellBean);
                    return;
                }
                ckf.y("queryContainer");
                throw null;
            }
            GuessLayout guessLayout2 = this.d;
            if (guessLayout2 != null) {
                guessLayout2.setVisibility(8);
            } else {
                ckf.y("queryContainer");
                throw null;
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
        ckf.g(view, "v");
        if (view.getId() == R.id.hideBtn) {
            this.f = !this.f;
            Activity activity = getActivity();
            ckf.e(activity, "null cannot be cast to non-null type com.taobao.search.searchdoor.sf.ISearchDoorOptProvider");
            SearchDoorViewPool d2 = ((xnd) activity).d();
            if (d2 != null) {
                d2.k(true ^ this.f);
            }
            I2();
            J2();
        } else if (view.getId() == R.id.changeBtn) {
            ValueAnimator valueAnimator = this.g;
            ckf.d(valueAnimator);
            if (!valueAnimator.isRunning()) {
                ValueAnimator valueAnimator2 = this.g;
                ckf.d(valueAnimator2);
                valueAnimator2.start();
            }
            H2(true);
            B2();
        }
    }

    @Override // tb.phw
    public View onCreateView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ebecba09", new Object[]{this});
        }
        View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.tbsearch_sf_guess_discovery, getContainer(), false);
        ckf.d(inflate);
        this.k = inflate;
        inflate.setTag(dgw.APM_VIEW_TOKEN, dgw.APM_VIEW_VALID);
        w2();
        View view = this.k;
        if (view != null) {
            return view;
        }
        ckf.y("itemView");
        throw null;
    }

    public final void w2() {
        int i;
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1af423c", new Object[]{this});
            return;
        }
        Activity activity = getActivity();
        ckf.f(activity, "getActivity(...)");
        this.j = xyd.a(activity);
        View view = this.k;
        if (view != null) {
            this.f28144a = (TUrlImageView) view.findViewById(R.id.changeBtn);
            View view2 = this.k;
            if (view2 != null) {
                this.b = (TUrlImageView) view2.findViewById(R.id.hideBtn);
                View view3 = this.k;
                if (view3 != null) {
                    View findViewById = view3.findViewById(R.id.dividerView);
                    this.c = findViewById;
                    if (findViewById != null) {
                        if (this.j) {
                            i = p;
                        } else {
                            i = q;
                        }
                        findViewById.setBackgroundColor(i);
                        View view4 = this.k;
                        if (view4 != null) {
                            this.d = (GuessLayout) view4.findViewById(R.id.rv_query_container);
                            View view5 = this.k;
                            if (view5 != null) {
                                TextView textView = (TextView) view5.findViewById(R.id.hideTextView);
                                this.e = textView;
                                if (textView != null) {
                                    xho.a(textView);
                                    TUrlImageView tUrlImageView = this.f28144a;
                                    ckf.d(tUrlImageView);
                                    tUrlImageView.setOnClickListener(this);
                                    TUrlImageView tUrlImageView2 = this.b;
                                    if (tUrlImageView2 != null) {
                                        tUrlImageView2.setOnClickListener(this);
                                        TUrlImageView tUrlImageView3 = this.f28144a;
                                        ckf.d(tUrlImageView3);
                                        TUrlImageView tUrlImageView4 = this.f28144a;
                                        ckf.d(tUrlImageView4);
                                        tUrlImageView3.setPivotX(tUrlImageView4.getLayoutParams().width / 2.0f);
                                        TUrlImageView tUrlImageView5 = this.f28144a;
                                        ckf.d(tUrlImageView5);
                                        TUrlImageView tUrlImageView6 = this.f28144a;
                                        ckf.d(tUrlImageView6);
                                        tUrlImageView5.setPivotY(tUrlImageView6.getLayoutParams().height / 2.0f);
                                        TUrlImageView tUrlImageView7 = this.f28144a;
                                        ckf.d(tUrlImageView7);
                                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(tUrlImageView7, Key.ROTATION, 0.0f, 360.0f);
                                        this.g = ofFloat;
                                        ckf.d(ofFloat);
                                        ofFloat.setDuration(500L);
                                        ValueAnimator valueAnimator = this.g;
                                        ckf.d(valueAnimator);
                                        valueAnimator.setRepeatCount(-1);
                                        ValueAnimator valueAnimator2 = this.g;
                                        ckf.d(valueAnimator2);
                                        valueAnimator2.setRepeatMode(1);
                                        View view6 = this.k;
                                        if (view6 != null) {
                                            TextView textView2 = (TextView) view6.findViewById(R.id.tv_title);
                                            textView2.setTextSize(1, this.j ? 15.0f : 13.5f);
                                            if (this.j) {
                                                i2 = n;
                                            } else {
                                                i2 = o;
                                            }
                                            textView2.setTextColor(i2);
                                            F2(textView2);
                                            xho.a(textView2);
                                            textView2.setContentDescription(Globals.getApplication().getString(R.string.tbsearch_guess_discovery_title));
                                            textView2.setOnClickListener(new View.OnClickListener() { // from class: tb.w7z
                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view7) {
                                                    sma.d(view7);
                                                }
                                            });
                                            if (this.j) {
                                                i3 = m;
                                            } else {
                                                i3 = l;
                                            }
                                            View view7 = this.k;
                                            if (view7 != null) {
                                                int paddingTop = view7.getPaddingTop();
                                                View view8 = this.k;
                                                if (view8 != null) {
                                                    view7.setPadding(i3, paddingTop, i3, view8.getPaddingBottom());
                                                } else {
                                                    ckf.y("itemView");
                                                    throw null;
                                                }
                                            } else {
                                                ckf.y("itemView");
                                                throw null;
                                            }
                                        } else {
                                            ckf.y("itemView");
                                            throw null;
                                        }
                                    } else {
                                        ckf.y("hideBtn");
                                        throw null;
                                    }
                                } else {
                                    ckf.y("hideTextView");
                                    throw null;
                                }
                            } else {
                                ckf.y("itemView");
                                throw null;
                            }
                        } else {
                            ckf.y("itemView");
                            throw null;
                        }
                    } else {
                        ckf.y("dividerView");
                        throw null;
                    }
                } else {
                    ckf.y("itemView");
                    throw null;
                }
            } else {
                ckf.y("itemView");
                throw null;
            }
        } else {
            ckf.y("itemView");
            throw null;
        }
    }

    public final void z2(pma pmaVar) {
        GuessDiscoveryVO.a aVar;
        List<ActivateGuessBean> list;
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c6175c9", new Object[]{this, pmaVar});
            return;
        }
        if (!(pmaVar == null || (aVar = pmaVar.d) == null || (list = aVar.text) == null || !(!list.isEmpty()))) {
            GuessDiscoveryCellBean guessDiscoveryCellBean = this.h;
            ckf.d(guessDiscoveryCellBean);
            guessDiscoveryCellBean.discoveryVO.result.text = pmaVar.d.text;
            GuessDiscoveryCellBean guessDiscoveryCellBean2 = this.h;
            ckf.d(guessDiscoveryCellBean2);
            guessDiscoveryCellBean2.suggestRn = pmaVar.e;
            GuessDiscoveryCellBean guessDiscoveryCellBean3 = this.h;
            ckf.d(guessDiscoveryCellBean3);
            if (TextUtils.isEmpty(pmaVar.f)) {
                GuessDiscoveryCellBean guessDiscoveryCellBean4 = this.h;
                ckf.d(guessDiscoveryCellBean4);
                str = guessDiscoveryCellBean4.traceBizType;
            } else {
                str = pmaVar.f;
            }
            guessDiscoveryCellBean3.traceBizType = str;
            GuessDiscoveryCellBean guessDiscoveryCellBean5 = this.h;
            ckf.d(guessDiscoveryCellBean5);
            if (TextUtils.isEmpty(pmaVar.g)) {
                GuessDiscoveryCellBean guessDiscoveryCellBean6 = this.h;
                ckf.d(guessDiscoveryCellBean6);
                str2 = guessDiscoveryCellBean6.traceTmplType;
            } else {
                str2 = pmaVar.g;
            }
            guessDiscoveryCellBean5.traceTmplType = str2;
            GuessLayout guessLayout = this.d;
            if (guessLayout != null) {
                guessLayout.reset();
                GuessDiscoveryCellBean guessDiscoveryCellBean7 = this.h;
                ckf.d(guessDiscoveryCellBean7);
                G2(guessDiscoveryCellBean7);
            } else {
                ckf.y("queryContainer");
                throw null;
            }
        }
        v2();
    }

    public final void D2(ActivateGuessBean activateGuessBean, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e8e096", new Object[]{this, activateGuessBean, new Integer(i)});
            return;
        }
        HashMap<String, String> u2 = u2(activateGuessBean, i);
        HashMap hashMap = new HashMap(u2);
        hashMap.put("channelSrp", getModel().a().d());
        GuessDiscoveryCellBean guessDiscoveryCellBean = this.h;
        ckf.d(guessDiscoveryCellBean);
        hashMap.put("tab", guessDiscoveryCellBean.tab);
        if (!TextUtils.isEmpty(activateGuessBean.searchparams)) {
            try {
                JSONArray parseArray = JSON.parseArray(activateGuessBean.searchparams);
                int size = parseArray.size();
                for (int i2 = 0; i2 < size; i2++) {
                    JSONObject jSONObject = parseArray.getJSONObject(i2);
                    u2.put(jSONObject.getString("key"), jSONObject.getString("value"));
                }
            } catch (Exception unused) {
            }
        }
        sen.c(SearchDoorActivity.PAGE_NAME, "Activate", hashMap);
        if (!TextUtils.isEmpty(activateGuessBean.clickUrl)) {
            Uri.Builder buildUpon = Uri.parse(activateGuessBean.clickUrl).buildUpon();
            for (Map.Entry<String, String> entry : u2.entrySet()) {
                buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
            }
            Nav.from(this.mActivity).toUri(buildUpon.build());
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.putAll(u2);
        postEvent(f64.a("goToSrp", new JSONObject(jSONObject2), null, null));
    }
}
