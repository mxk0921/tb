package com.taobao.search.searchdoor.sf.widgets.searchbar;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.search.searchdoor.sf.widgets.SearchDoorContext;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.s0p;
import tb.t2o;
import tb.ude;
import tb.vfw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class I18nSearchBarWidget extends SearchBarWidget {
    public static volatile transient /* synthetic */ IpChange $ipChange;

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
                I18nSearchBarWidget.this.onSearchBtnClicked();
            }
        }
    }

    static {
        t2o.a(815793235);
    }

    public I18nSearchBarWidget(Activity activity, ude udeVar, SearchDoorContext searchDoorContext, ViewGroup viewGroup, vfw vfwVar) {
        super(activity, udeVar, searchDoorContext, viewGroup, vfwVar);
    }

    public static /* synthetic */ Object ipc$super(I18nSearchBarWidget i18nSearchBarWidget, String str, Object... objArr) {
        if (str.hashCode() == -506257491) {
            super.findAllViews();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/sf/widgets/searchbar/I18nSearchBarWidget");
    }

    @Override // com.taobao.search.searchdoor.sf.widgets.searchbar.SearchBarWidget, tb.phw, tb.khq
    public void findAllViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1d31fad", new Object[]{this});
            return;
        }
        super.findAllViews();
        TUrlImageView tUrlImageView = (TUrlImageView) findView(R.id.imv_i18n_search_icon);
        if (tUrlImageView != null) {
            tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i3/O1CN016LoLIZ1ckiFOWu84i_!!6000000003639-2-tps-24-24.png");
        }
        View findView = findView(R.id.i18n_search_btn);
        if (findView != null) {
            ViewProxy.setOnClickListener(findView, new a());
        }
        this.mPhotoSearchButtonFont.setImageUrl(s0p.PHOTO_SEARCH_ICON_I18N);
    }

    @Override // com.taobao.search.searchdoor.sf.widgets.searchbar.SearchBarWidget, tb.phw
    public View onCreateView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ebecba09", new Object[]{this});
        }
        return LayoutInflater.from(this.mActivity).inflate(R.layout.tbsearchdoor_searchbar_i18n, this.mContainer, false);
    }

    @Override // com.taobao.search.searchdoor.sf.widgets.searchbar.SearchBarWidget
    public void setSearchBarBg(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56775e77", new Object[]{this, view, new Boolean(z)});
        } else {
            view.setBackgroundResource(R.drawable.tbsearch_searchdoor_bar_bg_i18n);
        }
    }
}
