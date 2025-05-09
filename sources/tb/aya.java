package tb;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.search.searchdoor.SearchDoorActivity;
import com.taobao.search.searchdoor.searchbar.data.SearchBarHintBean;
import com.taobao.search.searchdoor.sf.widgets.SearchDoorContext;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.HintGuideBean;
import com.taobao.taobao.R;
import kotlin.Pair;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class aya extends abx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final View f16074a;
    public final SearchDoorContext b;
    public PopupWindow c;
    public TextView d;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public HintGuideBean j;
    public final Handler e = new Handler(Looper.getMainLooper());
    public final Runnable k = new Runnable() { // from class: tb.j8z
        @Override // java.lang.Runnable
        public final void run() {
            aya.b(aya.this);
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class b extends xpo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/sf/widgets/activate/HintGuideWidget$showHintGuide$1");
        }

        @Override // tb.xpo
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                return;
            }
            PopupWindow t2 = aya.t2(aya.this);
            if (t2 != null) {
                aya ayaVar = aya.this;
                if (!ayaVar.getActivity().isFinishing()) {
                    t2.setWidth(-2);
                    t2.setHeight(-2);
                    t2.showAsDropDown(aya.u2(ayaVar), 0, -p1p.a(5.0f), 5);
                    aya.s2(ayaVar).postDelayed(aya.q2(ayaVar), 3000L);
                }
            }
            aya.v2(aya.this);
        }
    }

    static {
        t2o.a(815793162);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aya(Activity activity, ude udeVar, View view, SearchDoorContext searchDoorContext) {
        super(activity, udeVar);
        ckf.g(activity, "context");
        ckf.g(udeVar, a.MSG_SOURCE_PARENT);
        ckf.g(view, "searchButton");
        ckf.g(searchDoorContext, "searchDoorContext");
        this.f16074a = view;
        this.b = searchDoorContext;
        subscribeEvent(this);
    }

    public static final void b(aya ayaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3e93d92", new Object[]{ayaVar});
            return;
        }
        ckf.g(ayaVar, "this$0");
        PopupWindow popupWindow = ayaVar.c;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    public static /* synthetic */ Object ipc$super(aya ayaVar, String str, Object... objArr) {
        if (str.hashCode() == 299066517) {
            super.onCtxPause();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/sf/widgets/activate/HintGuideWidget");
    }

    public static final /* synthetic */ Runnable q2(aya ayaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("f14fdcd5", new Object[]{ayaVar});
        }
        return ayaVar.k;
    }

    public static final /* synthetic */ Handler s2(aya ayaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("643162a4", new Object[]{ayaVar});
        }
        return ayaVar.e;
    }

    public static final /* synthetic */ PopupWindow t2(aya ayaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopupWindow) ipChange.ipc$dispatch("35cb49e0", new Object[]{ayaVar});
        }
        return ayaVar.c;
    }

    public static final /* synthetic */ View u2(aya ayaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9a0b0980", new Object[]{ayaVar});
        }
        return ayaVar.f16074a;
    }

    public static final /* synthetic */ void v2(aya ayaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc8a1390", new Object[]{ayaVar});
        } else {
            ayaVar.A2();
        }
    }

    @Override // tb.abx
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return "HintGuideWidget";
    }

    @Override // tb.abx
    public void onCtxPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d36495", new Object[]{this});
            return;
        }
        super.onCtxPause();
        this.e.removeCallbacks(this.k);
        PopupWindow popupWindow = this.c;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    public final void onEventMainThread(ca0 ca0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbbf0a6c", new Object[]{this, ca0Var});
            return;
        }
        ckf.g(ca0Var, "event");
        HintGuideBean hintGuideBean = ca0Var.f16933a.q;
        this.j = hintGuideBean;
        if (!this.f || this.g) {
            this.h = true;
        } else {
            w2(hintGuideBean);
        }
    }

    public final void w2(HintGuideBean hintGuideBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8fec479", new Object[]{this, hintGuideBean});
        } else if (y2(hintGuideBean)) {
            ckf.d(hintGuideBean);
            z2(hintGuideBean);
        }
    }

    public final void x2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de5519c2", new Object[]{this});
        } else if (this.c == null) {
            View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.tbsearch_hint_guide_pop, new FrameLayout(getActivity()));
            this.d = (TextView) inflate.findViewById(R.id.tv_show_text);
            this.c = new PopupWindow(inflate);
        }
    }

    public final void z2(HintGuideBean hintGuideBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bc1d9a8", new Object[]{this, hintGuideBean});
            return;
        }
        x2();
        TextView textView = this.d;
        if (textView != null) {
            textView.setText(hintGuideBean.getShowText());
            this.e.post(new b());
            return;
        }
        ckf.y("guideTextView");
        throw null;
    }

    public final void A2() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77c6c195", new Object[]{this});
            return;
        }
        SearchBarHintBean u = this.b.u("all");
        String str2 = "";
        if (u == null || (str = u.searchText) == null) {
            str = str2;
        }
        this.b.M(System.currentTimeMillis());
        Pair a2 = jpu.a("hintq", str);
        Pair a3 = jpu.a(h1p.KEY_SUGGEST_RN, this.b.y("all"));
        String q = this.b.q("from");
        if (q != null) {
            str2 = q;
        }
        sen.k(SearchDoorActivity.PAGE_NAME, "hintq_guide_exposure", kotlin.collections.a.j(a2, a3, jpu.a("from", str2)));
    }

    public final boolean y2(HintGuideBean hintGuideBean) {
        SharedPreferences b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f31ecbf9", new Object[]{this, hintGuideBean})).booleanValue();
        }
        if (this.i) {
            return false;
        }
        this.i = true;
        if (hintGuideBean == null || !hintGuideBean.isLegal() || (b2 = v4p.b()) == null || b2.getLong(h1p.IMAGE_SEARCH_NEW_USER_GUIDE_TIME, 0L) == 0) {
            return false;
        }
        if (b2.getBoolean(Login.getNick() + "_hintUsed", false)) {
            return false;
        }
        String str = Login.getNick() + '_' + hintGuideBean.getNameSpace() + '_';
        int i = b2.getInt(str + "totalCount", 0);
        if (i > hintGuideBean.getTotalCount()) {
            return false;
        }
        int i2 = b2.getInt(str + "intervalCount", -1);
        if (i2 >= hintGuideBean.getShowInterval() - 1 || i2 < 0) {
            b2.edit().putInt(str + "intervalCount", 0).putInt(str + "totalCount", i + 1).apply();
            return true;
        }
        b2.edit().putInt(str + "intervalCount", i2 + 1).apply();
        return false;
    }

    public final void onEventMainThread(mre mreVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bbfb24a", new Object[]{this, mreVar});
            return;
        }
        ckf.g(mreVar, "event");
        this.f = true;
        if (!TextUtils.isEmpty(mreVar.f24250a) || mreVar.b) {
            this.g = true;
        } else if (this.h) {
            w2(this.j);
        }
    }
}
