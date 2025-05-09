package com.taobao.uikit.actionbar;

import android.app.Activity;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.TBS;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.MenuContract;
import com.taobao.uikit.actionbar.PublicMenuAdapterV2;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.uikit.actionbar.TBPublicMenuItem;
import com.taobao.uikit.actionbar.util.MenuMonitor;
import com.taobao.uikit.actionbar.util.Tools;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders$UTCustomHitBuilder;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.c2v;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class PublicMenuPresenter implements MenuContract.ActionBarBasePresenter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TITLE_REG = "[^一-龥]";
    private final PublicMenuAdapterV2 defaultAdapter;
    private final PublicMenuAdapterV2 externAdapter;
    private final WeakReference<Activity> mActivity;
    private final TBPublicMenu mMenu;
    public ShareContentCallBack mShareContentCallBack;
    public final TBPublicMenuData mTbPublicMenuData;
    private final UTManager mUtManager = new UTManager();
    private final MenuContract.ActionBarBaseView mView;
    private MenuItemActions onMenuItemActions;
    private final PublicMenuAdapterV2 shareAdapter;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface MenuItemActions {
        boolean isItemVisible(int i);

        void onItemExposed(TBPublicMenuItem tBPublicMenuItem, String str);

        void onMenuHidden();

        void onMenuShown();

        void onShareMenuClear();
    }

    static {
        t2o.a(927989786);
        t2o.a(927989775);
    }

    public PublicMenuPresenter(TBPublicMenuData tBPublicMenuData, MenuContract.ActionBarBaseView actionBarBaseView, TBPublicMenu tBPublicMenu, Activity activity, ShareContentCallBack shareContentCallBack) {
        this.mTbPublicMenuData = tBPublicMenuData;
        this.mView = actionBarBaseView;
        this.mMenu = tBPublicMenu;
        this.mActivity = new WeakReference<>(activity);
        PublicMenuAdapterV2 publicMenuAdapterV2 = new PublicMenuAdapterV2();
        this.defaultAdapter = publicMenuAdapterV2;
        TBPublicMenu.TBOnPublicMenuClickListener tBOnPublicMenuClickListener = new TBPublicMenu.TBOnPublicMenuClickListener() { // from class: com.taobao.uikit.actionbar.PublicMenuPresenter.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.uikit.actionbar.TBPublicMenu.TBOnPublicMenuClickListener
            public void onPublicMenuItemClicked(TBPublicMenuItem tBPublicMenuItem) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("478e7772", new Object[]{this, tBPublicMenuItem});
                } else if (tBPublicMenuItem != null && tBPublicMenuItem.isMenuNeedToBeClosed()) {
                    PublicMenuPresenter.this.close();
                    MenuMonitor.countSucceed("item_nav");
                }
            }
        };
        TBPublicMenu.TBOnPublicMenuClickListener tBOnPublicMenuClickListener2 = new TBPublicMenu.TBOnPublicMenuClickListener() { // from class: com.taobao.uikit.actionbar.PublicMenuPresenter.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.uikit.actionbar.TBPublicMenu.TBOnPublicMenuClickListener
            public void onPublicMenuItemClicked(TBPublicMenuItem tBPublicMenuItem) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("478e7772", new Object[]{this, tBPublicMenuItem});
                } else if (tBPublicMenuItem != null) {
                    MenuMonitor.countSucceed(Tools.subTitle(tBPublicMenuItem.getTitle()) + "_item_clicked");
                }
            }
        };
        publicMenuAdapterV2.addOnItemCLickListener(tBOnPublicMenuClickListener);
        publicMenuAdapterV2.addOnItemCLickListener(tBOnPublicMenuClickListener2);
        PublicMenuAdapterV2 publicMenuAdapterV22 = new PublicMenuAdapterV2();
        this.shareAdapter = publicMenuAdapterV22;
        publicMenuAdapterV22.addOnItemCLickListener(tBOnPublicMenuClickListener);
        publicMenuAdapterV22.addOnItemCLickListener(new TBPublicMenu.TBOnPublicMenuClickListener() { // from class: com.taobao.uikit.actionbar.PublicMenuPresenter.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.uikit.actionbar.TBPublicMenu.TBOnPublicMenuClickListener
            public void onPublicMenuItemClicked(TBPublicMenuItem tBPublicMenuItem) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("478e7772", new Object[]{this, tBPublicMenuItem});
                } else {
                    PublicMenuPresenter.access$000(PublicMenuPresenter.this).onItemClick(tBPublicMenuItem, PublicMenuPresenter.this.mTbPublicMenuData);
                }
            }
        });
        PublicMenuAdapterV2 publicMenuAdapterV23 = new PublicMenuAdapterV2();
        this.externAdapter = publicMenuAdapterV23;
        addOnExternMenuClickListener(tBOnPublicMenuClickListener);
        publicMenuAdapterV23.addOnItemCLickListener(tBOnPublicMenuClickListener2);
        actionBarBaseView.addMenuAdapter(1, publicMenuAdapterV2);
        actionBarBaseView.addMenuAdapter(0, publicMenuAdapterV22);
        actionBarBaseView.addMenuAdapter(2, publicMenuAdapterV23);
        this.mShareContentCallBack = shareContentCallBack;
        publicMenuAdapterV22.setItemAction(new PublicMenuAdapterV2.ItemAction() { // from class: com.taobao.uikit.actionbar.PublicMenuPresenter.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.uikit.actionbar.PublicMenuAdapterV2.ItemAction
            public void onItemExposure(TBPublicMenuItem tBPublicMenuItem) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("6a42d0a6", new Object[]{this, tBPublicMenuItem});
                    return;
                }
                PublicMenuPresenter.access$000(PublicMenuPresenter.this).onItemExposure(tBPublicMenuItem);
                if (PublicMenuPresenter.access$100(PublicMenuPresenter.this) != null) {
                    PublicMenuPresenter.access$100(PublicMenuPresenter.this).onItemExposed(tBPublicMenuItem, PublicMenuPresenter.this.mTbPublicMenuData.getMenuIdentifies());
                }
            }
        });
    }

    public static /* synthetic */ UTManager access$000(PublicMenuPresenter publicMenuPresenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UTManager) ipChange.ipc$dispatch("6c08f391", new Object[]{publicMenuPresenter});
        }
        return publicMenuPresenter.mUtManager;
    }

    public static /* synthetic */ MenuItemActions access$100(PublicMenuPresenter publicMenuPresenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MenuItemActions) ipChange.ipc$dispatch("8753d197", new Object[]{publicMenuPresenter});
        }
        return publicMenuPresenter.onMenuItemActions;
    }

    public static /* synthetic */ void access$200(PublicMenuPresenter publicMenuPresenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f346cd7a", new Object[]{publicMenuPresenter});
        } else {
            publicMenuPresenter.notifyMenuHidden();
        }
    }

    public static /* synthetic */ void access$300(PublicMenuPresenter publicMenuPresenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c9b22bb", new Object[]{publicMenuPresenter});
        } else {
            publicMenuPresenter.clearExternalObserver();
        }
    }

    private void clearExternalObserver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b4f9db5", new Object[]{this});
        } else {
            this.externAdapter.removeAllExternalObservers();
        }
    }

    private void dealWithMenuData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b952e22", new Object[]{this});
            return;
        }
        this.mTbPublicMenuData.resetDefaultMenusUrl();
        List<TBPublicMenuItem> defaultPublicMenus = this.mTbPublicMenuData.getDefaultPublicMenus();
        deleteShareIconIfNeed();
        ArrayList arrayList = new ArrayList(this.mTbPublicMenuData.getCustomMenus());
        dealWithReportAndShareItem(defaultPublicMenus, arrayList);
        if (!defaultPublicMenus.isEmpty()) {
            this.defaultAdapter.setDataSet(defaultPublicMenus);
        }
        this.externAdapter.setDataSet(arrayList, true);
        this.shareAdapter.setDataSet(this.mTbPublicMenuData.getShareMenus());
    }

    private void messageTrack(List<TBPublicMenuItem> list) {
        String currentPageName;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("227226fc", new Object[]{this, list});
            return;
        }
        for (TBPublicMenuItem tBPublicMenuItem : list) {
            if (tBPublicMenuItem.getId() == R.id.uik_menu_wangxin) {
                String message = tBPublicMenuItem.getMessage();
                if (!(message == null || (currentPageName = c2v.getInstance().getCurrentPageName()) == null)) {
                    TBS.Ext.commitEvent(currentPageName, 2201, "Page_Access_window_messagenumber", null, null, "message=".concat(message));
                    return;
                }
                return;
            }
        }
    }

    private void notifyMenuHidden() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e61b399", new Object[]{this});
            return;
        }
        MenuItemActions menuItemActions = this.onMenuItemActions;
        if (menuItemActions != null) {
            menuItemActions.onMenuHidden();
        }
    }

    private void notifyMenuShown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a88b35b0", new Object[]{this});
            return;
        }
        MenuItemActions menuItemActions = this.onMenuItemActions;
        if (menuItemActions != null) {
            menuItemActions.onMenuShown();
        }
    }

    public void addCustomizeExternalMenuClickListener(TBPublicMenu.TBOnPublicMenuClickListener tBOnPublicMenuClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("559797bf", new Object[]{this, tBOnPublicMenuClickListener});
        } else {
            this.externAdapter.addCustomizeCLickListener(tBOnPublicMenuClickListener);
        }
    }

    public void addExternalMenuCustomiseItems(List<TBPublicMenuItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f0f3759", new Object[]{this, list});
        } else {
            this.mTbPublicMenuData.addCustomMenus(list);
        }
    }

    public void addOnDefaultMenuClickListener(TBPublicMenu.TBOnPublicMenuClickListener tBOnPublicMenuClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceb863f3", new Object[]{this, tBOnPublicMenuClickListener});
        } else {
            this.defaultAdapter.addOnItemCLickListener(tBOnPublicMenuClickListener);
        }
    }

    public void addOnExternMenuClickListener(TBPublicMenu.TBOnPublicMenuClickListener tBOnPublicMenuClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3db34192", new Object[]{this, tBOnPublicMenuClickListener});
        } else {
            this.externAdapter.addOnItemCLickListener(tBOnPublicMenuClickListener);
        }
    }

    public void addOnShareMenuClickListener(TBPublicMenu.TBOnPublicMenuClickListener tBOnPublicMenuClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdea6411", new Object[]{this, tBOnPublicMenuClickListener});
        } else {
            this.shareAdapter.addCustomizeCLickListener(tBOnPublicMenuClickListener);
        }
    }

    public void addShareMenus(List<TBPublicMenuItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c25a064e", new Object[]{this, list});
        } else {
            this.mTbPublicMenuData.addShareMenus(list);
        }
    }

    public void cleanExternMenus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f96ffc32", new Object[]{this});
        } else {
            this.mTbPublicMenuData.cleanExternMenus();
        }
    }

    public void cleanShareMenus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34af0b05", new Object[]{this});
        } else {
            this.mTbPublicMenuData.cleanShareMenus();
        }
    }

    public void clearAllExternMenuClickListeners() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cb20c51", new Object[]{this});
            return;
        }
        this.externAdapter.clearOnItemClickListeners();
        this.externAdapter.clearCustomizeClickListeners();
    }

    public void clearCustomizeExternalMenuClickListeners() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32198a1e", new Object[]{this});
        } else {
            this.externAdapter.clearCustomizeClickListeners();
        }
    }

    public void clearExternalCustomiseItems() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73be1755", new Object[]{this});
        } else {
            this.mTbPublicMenuData.clearExternalCustomiseItems();
        }
    }

    public void clearShareMenuListeners() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af9bf0b5", new Object[]{this});
            return;
        }
        this.shareAdapter.clearCustomizeClickListeners();
        MenuItemActions menuItemActions = this.onMenuItemActions;
        if (menuItemActions != null) {
            menuItemActions.onShareMenuClear();
        }
    }

    @Override // com.taobao.uikit.actionbar.MenuContract.ActionBarBasePresenter
    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else {
            this.mView.close();
        }
    }

    public void deleteShareIconIfNeed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("708429c7", new Object[]{this});
            return;
        }
        List<TBPublicMenuItem> defaultPublicMenus = this.mTbPublicMenuData.getDefaultPublicMenus();
        if (defaultPublicMenus != null) {
            Iterator<TBPublicMenuItem> it = defaultPublicMenus.iterator();
            while (it.hasNext()) {
                String title = it.next().getTitle();
                if (!TextUtils.isEmpty(title) && title.contains(Localization.q(R.string.app_share))) {
                    it.remove();
                }
            }
        }
    }

    public TBPublicMenuItem getExternalMenuItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBPublicMenuItem) ipChange.ipc$dispatch("ab6353df", new Object[]{this, new Integer(i)});
        }
        return this.mTbPublicMenuData.getExtraAndCustomizeMenuById(i);
    }

    public TBPublicMenuData getMenuData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBPublicMenuData) ipChange.ipc$dispatch("9512e905", new Object[]{this});
        }
        return this.mTbPublicMenuData;
    }

    public boolean hasShareMenu() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2cd45eef", new Object[]{this})).booleanValue();
        }
        if ((this.mActivity.get() instanceof ShareContentCallBack) || this.mShareContentCallBack != null) {
            return true;
        }
        return false;
    }

    public void initShare() {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe3b39b6", new Object[]{this});
            return;
        }
        ShareContentCallBack shareContentCallBack = this.mShareContentCallBack;
        if (shareContentCallBack != null) {
            obj = shareContentCallBack.getQueryShareParameters();
        } else if (this.mActivity.get() instanceof ShareContentCallBack) {
            obj = ((ShareContentCallBack) this.mActivity.get()).getQueryShareParameters();
        } else {
            obj = null;
        }
        TBPublicMenu.InitShareCallBack initShareCallBack = TBPublicMenu.getInitShareCallBack();
        if (initShareCallBack != null) {
            initShareCallBack.callBack(this.mActivity.get(), this.mMenu, obj);
        }
    }

    public boolean isShareItem(TBPublicMenuItem tBPublicMenuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63114fbb", new Object[]{this, tBPublicMenuItem})).booleanValue();
        }
        String title = tBPublicMenuItem.getTitle();
        if (TextUtils.isEmpty(title) || !title.contains(Localization.q(R.string.app_share))) {
            return false;
        }
        return true;
    }

    @Override // com.taobao.uikit.actionbar.MenuContract.ActionBarBasePresenter
    public void notifyMenuChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("907ec3d3", new Object[]{this});
            return;
        }
        dealWithMenuData();
        this.mView.notifyMenuChanged();
    }

    @Override // com.taobao.uikit.actionbar.MenuContract.ActionBarBasePresenter
    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
        } else {
            this.mView.onPause();
        }
    }

    public void resetExternalCustomiseItems() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20eddfd7", new Object[]{this});
        } else {
            this.mTbPublicMenuData.resetCustomMenus();
        }
    }

    public void setOnMenuItemActions(MenuItemActions menuItemActions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("100b5a4b", new Object[]{this, menuItemActions});
        } else {
            this.onMenuItemActions = menuItemActions;
        }
    }

    public void setShareContentCallBack(ShareContentCallBack shareContentCallBack, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdadffec", new Object[]{this, shareContentCallBack, new Boolean(z)});
        }
    }

    @Override // com.taobao.uikit.actionbar.MenuContract.ActionBarBasePresenter
    public void show(TBActionView tBActionView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fde08a02", new Object[]{this, tBActionView});
            return;
        }
        MenuMonitor.countSucceed("presenter_show_menu");
        initShare();
        dealWithMenuData();
        messageTrack(this.mTbPublicMenuData.getDefaultPublicMenus());
        this.defaultAdapter.setOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.taobao.uikit.actionbar.PublicMenuPresenter.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass5 r2, String str, Object... objArr) {
                if (str.hashCode() == 1361287682) {
                    super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                    return null;
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/actionbar/PublicMenuPresenter$5");
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
                    return;
                }
                super.onScrollStateChanged(recyclerView, i);
                if (i == 0) {
                    String currentPageName = c2v.getInstance().getCurrentPageName();
                    if (!TextUtils.isEmpty(currentPageName)) {
                        UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder = new UTHitBuilders$UTCustomHitBuilder("Page_Access_toolslide");
                        uTHitBuilders$UTCustomHitBuilder.setEventPage(currentPageName);
                        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder.build());
                    }
                }
            }
        });
        this.shareAdapter.setOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.taobao.uikit.actionbar.PublicMenuPresenter.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass6 r2, String str, Object... objArr) {
                if (str.hashCode() == 1361287682) {
                    super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                    return null;
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/actionbar/PublicMenuPresenter$6");
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
                    return;
                }
                super.onScrollStateChanged(recyclerView, i);
                if (i == 0) {
                    String currentPageName = c2v.getInstance().getCurrentPageName();
                    if (!TextUtils.isEmpty(currentPageName)) {
                        UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder = new UTHitBuilders$UTCustomHitBuilder("Page_Access_shareslide");
                        uTHitBuilders$UTCustomHitBuilder.setEventPage(currentPageName);
                        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder.build());
                    }
                }
            }
        });
        this.mView.registerOnDismissListener(new MenuContract.OnDismissListener() { // from class: com.taobao.uikit.actionbar.PublicMenuPresenter.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.uikit.actionbar.MenuContract.OnDismissListener
            public void onDismiss(MenuContract.ActionBarBaseView actionBarBaseView) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3d0f549d", new Object[]{this, actionBarBaseView});
                    return;
                }
                PublicMenuPresenter.access$000(PublicMenuPresenter.this).onMenuDismiss(PublicMenuPresenter.this.mTbPublicMenuData);
                PublicMenuPresenter.this.deleteShareIconIfNeed();
                PublicMenuPresenter.access$200(PublicMenuPresenter.this);
                PublicMenuPresenter.access$300(PublicMenuPresenter.this);
            }
        });
        this.mView.show(tBActionView);
        UTWrapper.newMenuExposure(this.mTbPublicMenuData);
        notifyMenuShown();
        this.mTbPublicMenuData.setMenuIdentifies();
    }

    public void showMenuItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f1e758d", new Object[]{this, new Integer(i)});
        }
    }

    public void setShareContentCallBack(ShareContentCallBack shareContentCallBack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f68afe8", new Object[]{this, shareContentCallBack});
        } else {
            this.mShareContentCallBack = shareContentCallBack;
        }
    }

    public void showMenuItem(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdcf4c80", new Object[]{this, str});
        }
    }

    private void dealWithReportAndShareItem(List<TBPublicMenuItem> list, List<TBPublicMenuItem> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1be485aa", new Object[]{this, list, list2});
            return;
        }
        Iterator<TBPublicMenuItem> it = list2.iterator();
        while (it.hasNext()) {
            TBPublicMenuItem next = it.next();
            if (!next.isAddByUikit()) {
                String title = next.getTitle();
                if (isShareItem(next)) {
                    if (!hasShareMenu()) {
                        next.setTitle("ꄪ:" + Localization.q(R.string.app_share));
                        next.setMessageMode(TBPublicMenuItem.MessageMode.NONE);
                        next.setIconUrl(null);
                        next.setOrder(3);
                        next.setIconDrawable(null);
                        list.add(2, next);
                        it.remove();
                        this.defaultAdapter.notifyDataSetChanged();
                    } else {
                        it.remove();
                    }
                }
                String replaceAll = title.replaceAll(TITLE_REG, "");
                if (!TextUtils.isEmpty(replaceAll) && replaceAll.equals(Localization.q(R.string.taobao_app_1012_1_16460))) {
                    it.remove();
                }
            }
        }
    }
}
