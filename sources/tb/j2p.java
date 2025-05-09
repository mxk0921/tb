package tb;

import android.app.Activity;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.search.searchdoor.sf.widgets.SearchDoorContext;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class j2p extends phw<i2p, View, SearchDoorContext> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String TAG = "ReviewWidget";

    /* renamed from: a  reason: collision with root package name */
    public final SearchDoorContext f21726a;
    public LinearLayout b;
    public TUrlImageView c;
    public TextView d;
    public i2p e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(815793234);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(815793233);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2p(Activity activity, ude udeVar, SearchDoorContext searchDoorContext, ViewGroup viewGroup, vfw vfwVar) {
        super(activity, udeVar, searchDoorContext, viewGroup, vfwVar);
        ckf.g(activity, "activity");
        ckf.g(udeVar, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        this.f21726a = searchDoorContext;
        subscribeEvent(this);
    }

    public static final void b(i2p i2pVar, j2p j2pVar, View view) {
        String str;
        String l;
        String str2;
        String str3;
        SearchDoorContext model;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7933b92", new Object[]{i2pVar, j2pVar, view});
            return;
        }
        ckf.g(j2pVar, "this$0");
        String a2 = i2pVar.a();
        String str4 = "";
        if (a2 == null) {
            a2 = str4;
        }
        if (a2.length() > 0) {
            SearchDoorContext model2 = j2pVar.getModel();
            if (model2 == null || (str = model2.q("channelSrp")) == null) {
                str = str4;
            }
            if (TextUtils.isEmpty(str) && ((model = j2pVar.getModel()) == null || (str = model.q(xrl.G_CHANNELSRP)) == null)) {
                str = str4;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (i2pVar.f()) {
                SearchDoorContext model3 = j2pVar.getModel();
                if (model3 == null || (str3 = Integer.valueOf(model3.hashCode()).toString()) == null) {
                    str3 = str4;
                }
                linkedHashMap.put("searchSuggestPageId", str3);
            } else {
                SearchDoorContext model4 = j2pVar.getModel();
                if (model4 == null || (str2 = Integer.valueOf(model4.hashCode()).toString()) == null) {
                    str2 = str4;
                }
                linkedHashMap.put("searchDoorPageId", str2);
            }
            linkedHashMap.put("channel", str);
            linkedHashMap.put(r4p.KEY_GRAY_HAIR, String.valueOf(ckf.b("true", j2pVar.getModel().q(r4p.KEY_SEARCH_ELDER_HOME_OPEN))));
            SearchDoorContext searchDoorContext = j2pVar.f21726a;
            if (!(searchDoorContext == null || (l = searchDoorContext.l()) == null)) {
                str4 = l;
            }
            linkedHashMap.put("query", str4);
            String c = f6p.c(a2, linkedHashMap);
            b4p.b("ReviewUrl", c);
            HashMap hashMap = new HashMap();
            hashMap.put("scene", i2pVar.c());
            sen.d("SearchSuggestReviewButton", hashMap);
            Nav.from(j2pVar.getActivity()).toUri(c);
        }
    }

    public static /* synthetic */ Object ipc$super(j2p j2pVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/sf/widgets/review/SearchDoorReviewWidget");
    }

    @Override // tb.abx
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return TAG;
    }

    @Override // tb.phw
    public View onCreateView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ebecba09", new Object[]{this});
        }
        LinearLayout linearLayout = new LinearLayout(getActivity());
        linearLayout.setClickable(true);
        Activity activity = getActivity();
        ckf.f(activity, "getActivity(...)");
        if (xyd.a(activity)) {
            linearLayout.setBackgroundResource(R.drawable.tbsearch_searchdoor_review_bg);
        } else {
            linearLayout.setBackgroundResource(R.drawable.tbsearch_cor_30_solid_fafafa_stoke_1_e1dfe2);
        }
        linearLayout.setOrientation(0);
        linearLayout.setPadding(o1p.b(10), o1p.b(7), o1p.b(10), o1p.b(7));
        TUrlImageView tUrlImageView = new TUrlImageView(getActivity());
        int i = R.drawable.tbsearch_ic_review;
        tUrlImageView.setPlaceHoldImageResId(i);
        tUrlImageView.setErrorImageResId(i);
        this.c = tUrlImageView;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(o1p.b(13), o1p.b(14));
        layoutParams.gravity = 16;
        layoutParams.setMargins(0, 0, o1p.b(5), 0);
        linearLayout.addView(this.c, layoutParams);
        TextView textView = new TextView(getActivity());
        textView.setTextSize(1, 13.0f);
        Activity activity2 = getActivity();
        ckf.f(activity2, "getActivity(...)");
        if (xyd.a(activity2)) {
            textView.setTextColor(Color.parseColor("#50607a"));
        } else {
            textView.setTextColor(Color.parseColor("#666666"));
        }
        this.d = textView;
        linearLayout.addView(textView);
        linearLayout.setVisibility(8);
        this.b = linearLayout;
        return linearLayout;
    }

    public final void onEventMainThread(i0p i0pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a21771b", new Object[]{this, i0pVar});
            return;
        }
        ckf.g(i0pVar, "event");
        if (i0pVar.b()) {
            bindWithData(this.e);
        }
    }

    /* renamed from: q2 */
    public void bindWithData(final i2p i2pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2791ce0f", new Object[]{this, i2pVar});
        } else if (i2pVar == null || ckf.b(i2pVar.d(), Boolean.FALSE)) {
            LinearLayout linearLayout = this.b;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
        } else {
            LinearLayout linearLayout2 = this.b;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(0);
            }
            LinearLayout linearLayout3 = this.b;
            if (linearLayout3 != null) {
                linearLayout3.setOnClickListener(new View.OnClickListener() { // from class: tb.wmz
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        j2p.b(i2p.this, this, view);
                    }
                });
            }
            TUrlImageView tUrlImageView = this.c;
            if (tUrlImageView != null) {
                tUrlImageView.setImageUrl(i2pVar.b());
            }
            String e = i2pVar.e();
            if (e == null || e.length() <= 0) {
                TextView textView = this.d;
                if (textView != null) {
                    textView.setVisibility(8);
                    return;
                }
                return;
            }
            TextView textView2 = this.d;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            TextView textView3 = this.d;
            if (textView3 != null) {
                textView3.setText(i2pVar.e());
            }
        }
    }

    public final void onEventMainThread(wwq wwqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fe5d5af", new Object[]{this, wwqVar});
            return;
        }
        ckf.g(wwqVar, "event");
        ja0 ja0Var = wwqVar.f30975a;
        bindWithData(ja0Var != null ? ja0Var.h : null);
    }

    public final void onEventMainThread(ca0 ca0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbbf0a6c", new Object[]{this, ca0Var});
            return;
        }
        ckf.g(ca0Var, "event");
        ja0 ja0Var = ca0Var.f16933a;
        i2p i2pVar = null;
        this.e = ja0Var != null ? ja0Var.h : null;
        if (ja0Var != null) {
            i2pVar = ja0Var.h;
        }
        bindWithData(i2pVar);
    }
}
