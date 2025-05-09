package com.taobao.search.searchdoor.sf.widgets.searchbar;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.search.searchdoor.sf.widgets.SearchDoorContext;
import com.taobao.search.sf.uikit.SearchInsetFrameLayout;
import com.taobao.taobao.R;
import tb.o1p;
import tb.t2o;
import tb.ude;
import tb.vfw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class SubscribeSearchBarWidget extends SearchBarWidget {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private PopupWindow changeStatusPop;
    private TextView popTextView;
    private boolean searchSubscribe = true;

    static {
        t2o.a(815793253);
    }

    public SubscribeSearchBarWidget(Activity activity, ude udeVar, SearchDoorContext searchDoorContext, ViewGroup viewGroup, vfw vfwVar) {
        super(activity, udeVar, searchDoorContext, viewGroup, vfwVar);
        searchDoorContext.S("g_newSubscribe", "true");
    }

    private void initPopup() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37cd2c03", new Object[]{this});
        } else if (this.popTextView == null) {
            View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.tbsearch_layout_change_subscribe, (ViewGroup) new FrameLayout(getActivity()), false);
            if (isDarkMode()) {
                inflate.findViewById(R.id.ll_pop).setBackgroundResource(R.drawable.tbsearch_bottom_radius_dp18_night);
            }
            TextView textView = (TextView) inflate.findViewById(R.id.tv_change_subscribe);
            this.popTextView = textView;
            textView.setOnClickListener(this);
            PopupWindow popupWindow = new PopupWindow(inflate);
            this.changeStatusPop = popupWindow;
            popupWindow.setWidth(o1p.b(80));
            this.changeStatusPop.setHeight(o1p.b(50));
            this.changeStatusPop.setFocusable(true);
            this.changeStatusPop.setOutsideTouchable(true);
            this.changeStatusPop.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.taobao.search.searchdoor.sf.widgets.searchbar.SubscribeSearchBarWidget.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.widget.PopupWindow.OnDismissListener
                public void onDismiss() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cab76ab2", new Object[]{this});
                    } else {
                        SubscribeSearchBarWidget.this.mSearchBarLeftContainer.setBackgroundDrawable(null);
                    }
                }
            });
        }
    }

    public static /* synthetic */ Object ipc$super(SubscribeSearchBarWidget subscribeSearchBarWidget, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1912803358) {
            super.onClick((View) objArr[0]);
            return null;
        } else if (hashCode == 492098584) {
            super.bindListener();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/searchdoor/sf/widgets/searchbar/SubscribeSearchBarWidget");
        }
    }

    @Override // com.taobao.search.searchdoor.sf.widgets.searchbar.SearchBarWidget
    public void bindListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d54d418", new Object[]{this});
            return;
        }
        super.bindListener();
        ViewProxy.setOnClickListener(this.mSearchBarLeftContainer, this);
    }

    @Override // com.taobao.search.searchdoor.sf.widgets.searchbar.SearchBarWidget, tb.phw
    public View onCreateView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ebecba09", new Object[]{this});
        }
        SearchInsetFrameLayout searchInsetFrameLayout = new SearchInsetFrameLayout(this.mActivity);
        searchInsetFrameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, o1p.b(48)));
        searchInsetFrameLayout.addView(LayoutInflater.from(this.mActivity).inflate(R.layout.tbsearchdoor_subscribe_searchbar, this.mContainer, false));
        return searchInsetFrameLayout;
    }

    private void showOrHidePopup() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c68ba31", new Object[]{this});
            return;
        }
        initPopup();
        if (this.changeStatusPop.isShowing()) {
            this.changeStatusPop.dismiss();
            return;
        }
        if (isDarkMode()) {
            this.mSearchBarLeftContainer.setBackgroundResource(R.drawable.tbsearch_bottom_top_left_radius_dp18_night);
        } else {
            this.mSearchBarLeftContainer.setBackgroundResource(R.drawable.tbsearch_bottom_top_left_radius_dp18);
        }
        TextView textView = this.popTextView;
        if (this.searchSubscribe) {
            str = "全站";
        } else {
            str = Localization.q(R.string.app_follow_action);
        }
        textView.setText(str);
        this.changeStatusPop.showAsDropDown(this.mSearchBarLeftContainer, -o1p.b(7), 0);
    }

    @Override // com.taobao.search.searchdoor.sf.widgets.searchbar.SearchBarWidget, android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        super.onClick(view);
        if (view == this.mSearchBarLeftContainer) {
            showOrHidePopup();
        } else if (view == this.popTextView) {
            this.searchSubscribe = !this.searchSubscribe;
            setSearchBarLeftTxt();
            this.changeStatusPop.dismiss();
            if (this.searchSubscribe) {
                getModel().S("g_mainChannel", "dingyue");
            } else {
                getModel().K("g_mainChannel");
            }
            getModel().K("tab");
        }
    }

    @Override // com.taobao.search.searchdoor.sf.widgets.searchbar.SearchBarWidget
    public void setSearchBarLeftTxt() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e65ca27", new Object[]{this});
            return;
        }
        this.mSearchBarLeftContainer.setVisibility(0);
        TextView textView = this.mSearchBarLeftTxtTv;
        if (this.searchSubscribe) {
            str = Localization.q(R.string.app_follow_action);
        } else {
            str = "全站";
        }
        textView.setText(str);
    }
}
