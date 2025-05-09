package tb;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.res.ResourcesCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.search.searchdoor.searchbar.data.SearchBarHintBean;
import com.taobao.search.searchdoor.sf.widgets.SearchDoorContext;
import com.taobao.taobao.R;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class paj extends phw<SearchBarHintBean, View, SearchDoorContext> implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static final int b = Color.parseColor("#1c1c1c");

    /* renamed from: a  reason: collision with root package name */
    public SearchBarHintBean f25976a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(815793106);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(815793105);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public paj(Activity activity, ude udeVar, SearchDoorContext searchDoorContext, ViewGroup viewGroup, vfw vfwVar) {
        super(activity, udeVar, searchDoorContext, viewGroup, vfwVar);
        ckf.g(activity, "activity");
        ckf.g(udeVar, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
    }

    public static /* synthetic */ Object ipc$super(paj pajVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/sf/widgets/MultiSearchHintWidget");
    }

    @Override // tb.abx
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return "MultiSearchHintWidget";
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void hide() {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.paj.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0012
            java.lang.String r1 = "9631f0c9"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r0.ipc$dispatch(r1, r2)
            return
        L_0x0012:
            android.view.View r0 = r4.getView()
            if (r0 == 0) goto L_0x001d
            r1 = 8
            r0.setVisibility(r1)
        L_0x001d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.paj.hide():void");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        ckf.g(view, "v");
        Object tag = view.getTag();
        String str = tag instanceof String ? (String) tag : null;
        if (str != null) {
            ROOT_VIEW view2 = getView();
            ckf.e(view2, "null cannot be cast to non-null type android.view.ViewGroup");
            int indexOfChild = ((ViewGroup) view2).indexOfChild(view);
            HashMap hashMap = new HashMap();
            SearchBarHintBean searchBarHintBean = this.f25976a;
            ckf.d(searchBarHintBean);
            String[] strArr = searchBarHintBean.multiDisplayText;
            if (indexOfChild >= 0 && indexOfChild < strArr.length) {
                hashMap.put("display_text", strArr[indexOfChild]);
            }
            String[] strArr2 = searchBarHintBean.multiSearchText;
            if (indexOfChild >= 0 && indexOfChild < strArr2.length) {
                hashMap.put("search_text", strArr2[indexOfChild]);
            }
            hashMap.put(h1p.KEY_SUGGEST_RN, searchBarHintBean.suggestRn);
            hashMap.put("channel_srp", getModel().d());
            hashMap.put(yj4.PARAM_SEARCH_KEYWORD_POS, String.valueOf(indexOfChild));
            hashMap.put("item_id", getModel().q("targetItemId"));
            sen.d("hintq_under_door_click", hashMap);
            postEvent(new c9j(str));
        }
    }

    @Override // tb.phw
    public View onCreateView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ebecba09", new Object[]{this});
        }
        LinearLayout linearLayout = new LinearLayout(getActivity());
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        Activity activity = getActivity();
        ckf.f(activity, "getActivity(...)");
        if (xyd.a(activity)) {
            marginLayoutParams.leftMargin = o1p.b(16);
        } else {
            marginLayoutParams.leftMargin = o1p.b(56);
            marginLayoutParams.bottomMargin = o1p.b(9);
        }
        marginLayoutParams.topMargin = o1p.a(3.5f);
        linearLayout.setLayoutParams(marginLayoutParams);
        linearLayout.setOrientation(0);
        return linearLayout;
    }

    /* renamed from: q2 */
    public void bindWithData(SearchBarHintBean searchBarHintBean) {
        String[] strArr;
        String[] strArr2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf16f887", new Object[]{this, searchBarHintBean});
            return;
        }
        this.f25976a = searchBarHintBean;
        if (searchBarHintBean != null) {
            strArr = searchBarHintBean.multiSearchText;
        } else {
            strArr = null;
        }
        if (!(strArr == null || (strArr2 = searchBarHintBean.multiDisplayText) == null || searchBarHintBean.multiSearchText.length != strArr2.length)) {
            Activity activity = getActivity();
            ckf.f(activity, "getActivity(...)");
            boolean a2 = xyd.a(activity);
            boolean v2 = v2();
            boolean u2 = u2();
            ROOT_VIEW view = getView();
            ckf.e(view, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) view;
            int length = searchBarHintBean.multiSearchText.length;
            for (int i = 0; i < length; i++) {
                String str = searchBarHintBean.multiSearchText[i];
                String str2 = searchBarHintBean.multiDisplayText[i];
                ckf.d(str);
                ckf.d(str2);
                viewGroup.addView(s2(str, str2, v2, u2, a2));
            }
            w2(searchBarHintBean);
        }
    }

    public final View s2(String str, String str2, boolean z, boolean z2, boolean z3) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a88c2e73", new Object[]{this, str, str2, new Boolean(z), new Boolean(z2), new Boolean(z3)});
        }
        Drawable t2 = t2(z3, z, z2);
        TextView textView = new TextView(getActivity());
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        if (z3) {
            textView.setTextColor(ResourcesCompat.getColor(getActivity().getResources(), R.color.tbsearch_2024_common_text_color, null));
        } else if (z) {
            textView.setTextColor(Color.parseColor("#AAAAAA"));
        } else if (z2) {
            textView.setTextColor(-1);
        } else {
            textView.setTextColor(Color.parseColor("#666666"));
        }
        textView.setText(str2);
        FrameLayout frameLayout = new FrameLayout(getActivity());
        frameLayout.setBackground(t2);
        int b2 = o1p.b(12);
        frameLayout.setPadding(b2, 0, b2, 0);
        if (z3) {
            i = 27;
        } else {
            i = 30;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, o1p.b(i));
        if (z3) {
            marginLayoutParams.rightMargin = o1p.b(8);
        } else {
            marginLayoutParams.rightMargin = o1p.b(6);
        }
        frameLayout.setLayoutParams(marginLayoutParams);
        frameLayout.addView(textView);
        frameLayout.setTag(str);
        frameLayout.setOnClickListener(this);
        return frameLayout;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void show() {
        /*
            r4 = this;
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = tb.paj.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0012
            java.lang.String r2 = "ebbb9904"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r4
            r1.ipc$dispatch(r2, r3)
            return
        L_0x0012:
            android.view.View r1 = r4.getView()
            if (r1 == 0) goto L_0x001b
            r1.setVisibility(r0)
        L_0x001b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.paj.show():void");
    }

    public final Drawable t2(boolean z, boolean z2, boolean z3) {
        GradientDrawable gradientDrawable;
        GradientDrawable gradientDrawable2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("22942d28", new Object[]{this, new Boolean(z), new Boolean(z2), new Boolean(z3)});
        }
        if (z) {
            Drawable drawable = getActivity().getResources().getDrawable(R.drawable.tbsearch_history_tag_background_new_style_new);
            if (drawable instanceof GradientDrawable) {
                gradientDrawable2 = (GradientDrawable) drawable;
            } else {
                gradientDrawable2 = null;
            }
            if (gradientDrawable2 != null && z2) {
                gradientDrawable2.setColor(b);
            }
            ckf.f(drawable, "also(...)");
            gradientDrawable = drawable;
        } else {
            GradientDrawable gradientDrawable3 = new GradientDrawable();
            gradientDrawable3.setShape(0);
            gradientDrawable3.setCornerRadius(o1p.b(15));
            if (z2) {
                gradientDrawable3.setColor(b);
                gradientDrawable = gradientDrawable3;
            } else if (z3) {
                gradientDrawable3.setColor(-1);
                gradientDrawable3.setAlpha(63);
                gradientDrawable = gradientDrawable3;
            } else {
                gradientDrawable3.setColor(-1);
                gradientDrawable = gradientDrawable3;
            }
        }
        return gradientDrawable;
    }

    public final boolean u2() {
        int b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ffcffc5e", new Object[]{this})).booleanValue();
        }
        if (!FestivalMgr.i().v("global")) {
            return false;
        }
        String f = FestivalMgr.i().f("global", FestivalMgr.KEY_GLOBAL_ACTIONBAR_BG);
        if (!TextUtils.isEmpty(f) && (b2 = qrl.b(f, 0)) != 0 && (Color.red(b2) * 0.299d) + (Color.green(b2) * 0.587d) + (Color.blue(b2) * 0.114d) < 192.0d) {
            return true;
        }
        return false;
    }

    public final boolean v2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ded1a48e", new Object[]{this})).booleanValue();
        }
        if (!(getActivity() instanceof oxb)) {
            return false;
        }
        Activity activity = getActivity();
        ckf.e(activity, "null cannot be cast to non-null type com.taobao.android.xsearchplugin.muise.IDarkModeHolder");
        if (((oxb) activity).E1()) {
            return true;
        }
        return false;
    }

    public final void w2(SearchBarHintBean searchBarHintBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4429a145", new Object[]{this, searchBarHintBean});
            return;
        }
        HashMap hashMap = new HashMap();
        yuf yufVar = yuf.INSTANCE;
        String[] strArr = searchBarHintBean.multiSearchText;
        ckf.f(strArr, "multiSearchText");
        hashMap.put("display_text", yufVar.a(ic1.i0(strArr), ";"));
        String[] strArr2 = searchBarHintBean.multiDisplayText;
        ckf.f(strArr2, "multiDisplayText");
        hashMap.put("search_text", yufVar.a(ic1.i0(strArr2), ";"));
        hashMap.put(h1p.KEY_SUGGEST_RN, searchBarHintBean.suggestRn);
        hashMap.put("channel_srp", getModel().d());
        hashMap.put("item_id", getModel().q("targetItemId"));
        sen.l("search_hintq_under_door", hashMap);
    }
}
