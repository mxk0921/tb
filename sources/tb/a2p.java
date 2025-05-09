package tb;

import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.searchdoor.sf.widgets.SearchDoorContext;
import com.taobao.search.searchdoor.sf.widgets.activate.ActivateWidget;
import com.taobao.search.searchdoor.sf.widgets.searchbar.I18nSearchBarWidget;
import com.taobao.search.searchdoor.sf.widgets.searchbar.PopupSearchBarWidget;
import com.taobao.search.searchdoor.sf.widgets.searchbar.SearchBarWidget;
import com.taobao.search.searchdoor.sf.widgets.searchbar.SubscribeSearchBarWidget;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class a2p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final wnd f15512a = new a();
    public static final wnd b = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements wnd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.wnd
        public ActivateWidget a(Activity activity, ude udeVar, SearchDoorContext searchDoorContext, ViewGroup viewGroup, vfw vfwVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ActivateWidget) ipChange.ipc$dispatch("f2364ba2", new Object[]{this, activity, udeVar, searchDoorContext, viewGroup, vfwVar});
            }
            return new ActivateWidget(activity, udeVar, searchDoorContext, viewGroup, vfwVar);
        }

        @Override // tb.wnd
        public SearchBarWidget b(Activity activity, ude udeVar, SearchDoorContext searchDoorContext, ViewGroup viewGroup, vfw vfwVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SearchBarWidget) ipChange.ipc$dispatch("6b094976", new Object[]{this, activity, udeVar, searchDoorContext, viewGroup, vfwVar});
            }
            String q = searchDoorContext.q("g_mainChannel");
            if (TextUtils.isEmpty(q)) {
                q = searchDoorContext.q("mainChannel");
            }
            if (Localization.o()) {
                return new I18nSearchBarWidget(activity, udeVar, searchDoorContext, viewGroup, vfwVar);
            }
            if (TextUtils.equals(q, "dingyue") && y4p.j()) {
                return new SubscribeSearchBarWidget(activity, udeVar, searchDoorContext, viewGroup, vfwVar);
            }
            if (searchDoorContext.F()) {
                return new PopupSearchBarWidget(activity, udeVar, searchDoorContext, viewGroup, vfwVar);
            }
            return new SearchBarWidget(activity, udeVar, searchDoorContext, viewGroup, vfwVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements wnd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.wnd
        public ActivateWidget a(Activity activity, ude udeVar, SearchDoorContext searchDoorContext, ViewGroup viewGroup, vfw vfwVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ActivateWidget) ipChange.ipc$dispatch("f2364ba2", new Object[]{this, activity, udeVar, searchDoorContext, viewGroup, vfwVar});
            }
            return new ji3(activity, udeVar, searchDoorContext, viewGroup, vfwVar);
        }

        @Override // tb.wnd
        public SearchBarWidget b(Activity activity, ude udeVar, SearchDoorContext searchDoorContext, ViewGroup viewGroup, vfw vfwVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SearchBarWidget) ipChange.ipc$dispatch("6b094976", new Object[]{this, activity, udeVar, searchDoorContext, viewGroup, vfwVar});
            }
            if (Localization.o()) {
                return new I18nSearchBarWidget(activity, udeVar, searchDoorContext, viewGroup, vfwVar);
            }
            if (searchDoorContext.F()) {
                return new PopupSearchBarWidget(activity, udeVar, searchDoorContext, viewGroup, vfwVar);
            }
            return new SearchBarWidget(activity, udeVar, searchDoorContext, viewGroup, vfwVar);
        }
    }

    static {
        t2o.a(815793109);
    }

    public static wnd a(SearchDoorContext searchDoorContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wnd) ipChange.ipc$dispatch("35935dff", new Object[]{searchDoorContext});
        }
        if (TextUtils.isEmpty(searchDoorContext.d())) {
            return f15512a;
        }
        return b;
    }
}
