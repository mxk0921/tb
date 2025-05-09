package com.taobao.search.searchdoor.sf.widgets.searchbar;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.searchdoor.sf.widgets.SearchDoorContext;
import com.taobao.search.searchdoor.sf.widgets.searchbar.PopupSearchBarWidget;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.ckf;
import tb.rim;
import tb.t2o;
import tb.ude;
import tb.vfw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class PopupSearchBarWidget extends SearchBarWidget {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TUrlImageView imvClose;

    static {
        t2o.a(815793237);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopupSearchBarWidget(Activity activity, ude udeVar, SearchDoorContext searchDoorContext, ViewGroup viewGroup, vfw vfwVar) {
        super(activity, udeVar, searchDoorContext, viewGroup, vfwVar);
        ckf.g(activity, "activity");
        ckf.g(udeVar, a.MSG_SOURCE_PARENT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void findAllViews$lambda$0(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d6a0a7a", new Object[]{view});
        } else {
            rim.Companion.a();
        }
    }

    public static /* synthetic */ Object ipc$super(PopupSearchBarWidget popupSearchBarWidget, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -506257491) {
            super.findAllViews();
            return null;
        } else if (hashCode == -111204972) {
            super.onHitDarkMode();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/searchdoor/sf/widgets/searchbar/PopupSearchBarWidget");
        }
    }

    @Override // com.taobao.search.searchdoor.sf.widgets.searchbar.SearchBarWidget, tb.phw, tb.khq
    public void findAllViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1d31fad", new Object[]{this});
            return;
        }
        super.findAllViews();
        View findView = findView(R.id.imv_close_popup);
        ckf.e(findView, "null cannot be cast to non-null type com.taobao.uikit.extend.feature.view.TUrlImageView");
        TUrlImageView tUrlImageView = (TUrlImageView) findView;
        this.imvClose = tUrlImageView;
        tUrlImageView.setImageUrl("https://img.alicdn.com/imgextra/i4/O1CN014MKXkw1bH6wJIYVF2_!!6000000003439-2-tps-72-72.png");
        TUrlImageView tUrlImageView2 = this.imvClose;
        if (tUrlImageView2 != null) {
            tUrlImageView2.setOnClickListener(new View.OnClickListener() { // from class: tb.wjz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PopupSearchBarWidget.findAllViews$lambda$0(view);
                }
            });
            if (isDarkMode()) {
                onHitDarkMode();
                return;
            }
            return;
        }
        ckf.y("imvClose");
        throw null;
    }

    @Override // com.taobao.search.searchdoor.sf.widgets.searchbar.SearchBarWidget, tb.phw
    public View onCreateView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ebecba09", new Object[]{this});
        }
        View inflate = LayoutInflater.from(this.mActivity).inflate(R.layout.tbsearchdoor_searchbar_popup, this.mContainer, false);
        ckf.f(inflate, "inflate(...)");
        return inflate;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.View, java.lang.Object] */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // com.taobao.search.searchdoor.sf.widgets.searchbar.SearchBarWidget, tb.zo6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onHitDarkMode() {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.search.searchdoor.sf.widgets.searchbar.PopupSearchBarWidget.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0012
            java.lang.String r1 = "f95f2594"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r0.ipc$dispatch(r1, r2)
            return
        L_0x0012:
            super.onHitDarkMode()
            com.taobao.uikit.extend.feature.view.TUrlImageView r0 = r4.imvClose
            if (r0 == 0) goto L_0x002a
            r1 = -1
            r0.setColorFilter(r1)
            android.view.View r0 = r4.getView()
            tb.ckf.d(r0)
            int r1 = com.taobao.taobao.R.drawable.tbsearch_mini_search_bar_background_night
            r0.setBackgroundResource(r1)
            return
        L_0x002a:
            java.lang.String r0 = "imvClose"
            tb.ckf.y(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.search.searchdoor.sf.widgets.searchbar.PopupSearchBarWidget.onHitDarkMode():void");
    }
}
