package com.taobao.uikit.actionbar;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.core.content.ContextCompat;
import androidx.core.view.MenuItemCompat;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.PublicMenuPresenter;
import com.taobao.uikit.actionbar.TBPublicMenuItem;
import com.taobao.uikit.actionbar.model.PageInfoModel;
import com.taobao.uikit.actionbar.util.MenuLog;
import com.taobao.uikit.actionbar.util.MenuMonitor;
import com.taobao.uikit.actionbar.util.MenuSwitch;
import com.taobao.uikit.actionbar.util.Tools;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import tb.fsw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TBPublicMenu implements MenuItem.OnMenuItemClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TBPublicMenu";
    private static InitShareCallBack sInitShareCallBack;
    private static List<TBPublicMenuItem> sNewDefaultPublicMenus = new ArrayList();
    public static ArrayList<TBPublicMenuItem> sPublicMenus = new ArrayList<>();
    private static TBLiteProgramOnOverflowButtonOnClickListener sTbLiteProgramOnOverflowButtonOnClickListener;
    private final WeakReference<Activity> mActivityRef;
    private TBActionView mCustomOverflow;
    private final DefaultItemClickListener mDefaultItemClickListener;
    private TBOnPublicMenuClickListener mDefaultPublicMenuListener;
    public ArrayList<TBPublicMenuItem> mExtensionMenu;
    private final DefaultItemClickListener mExternalItemClickListener;
    private final ArrayList<MenuItemImpl> mFilteredMenus;
    private final ItemClickProcessor mItemClickProcessor;
    private int mMenuIconColor;
    private final ArrayList<MenuItemImpl> mMenuItems;
    public boolean mNeedPublicMenu;
    private TBOnOverflowButtonClickListener mOnOverflowButtonClickListener;
    private TBOnMenuHidedListener mOnTBOnMenuHidedListener;
    private TBOnMenuShowedListener mOnTBOnMenuShowedListener;
    private PublicMenuPresenter mPresenter;
    private TBPublicMenuData mTbPublicMenuData;
    private boolean mUseNewActionViewStyle;
    private OnShareMenuItemExposedListener onShareMenuItemExposed;
    private PageInfoModel pageInfoModel;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface InitShareCallBack {
        void callBack(Activity activity, TBPublicMenu tBPublicMenu, Object obj);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface MenuCallBack {
        boolean onDefaultItemClicked(TBPublicMenuItem tBPublicMenuItem);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface OnShareMenuItemExposedListener {
        void onShareMenuItemExposed(TBPublicMenuItem tBPublicMenuItem, String str);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface TBLiteProgramOnOverflowButtonOnClickListener {
        void onOverflowButtonClicked(TBPublicMenu tBPublicMenu, Activity activity);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface TBOnLiteProgramClickListener {
        void onLiteProgramClicked(Context context, TBPublicMenuItem tBPublicMenuItem);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface TBOnMenuHidedListener {
        void onMenuHided();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface TBOnMenuShowedListener {
        void onMenuShowed();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface TBOnOverflowButtonClickListener {
        void onOverflowButtonClicked();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface TBOnPublicMenuClickListener {
        void onPublicMenuItemClicked(TBPublicMenuItem tBPublicMenuItem);
    }

    static {
        t2o.a(927989814);
        fsw.i(TBPopoverBridge.NAME, TBPopoverBridge.class, false);
    }

    public TBPublicMenu(Activity activity) {
        this(activity, null);
    }

    public static /* synthetic */ OnShareMenuItemExposedListener access$000(TBPublicMenu tBPublicMenu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnShareMenuItemExposedListener) ipChange.ipc$dispatch("18bceb05", new Object[]{tBPublicMenu});
        }
        return tBPublicMenu.onShareMenuItemExposed;
    }

    public static /* synthetic */ void access$100(TBPublicMenu tBPublicMenu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1590a41", new Object[]{tBPublicMenu});
        } else {
            tBPublicMenu.notifyMenuShown();
        }
    }

    public static /* synthetic */ void access$200(TBPublicMenu tBPublicMenu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b23ac20", new Object[]{tBPublicMenu});
        } else {
            tBPublicMenu.notifyMenuHidden();
        }
    }

    public static /* synthetic */ void access$300(TBPublicMenu tBPublicMenu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44ee4dff", new Object[]{tBPublicMenu});
        } else {
            tBPublicMenu.clearReportArguments();
        }
    }

    public static /* synthetic */ void access$400(TBPublicMenu tBPublicMenu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7eb8efde", new Object[]{tBPublicMenu});
        } else {
            tBPublicMenu.resetOnShareMenuItemExposedListener();
        }
    }

    public static /* synthetic */ void access$500(TBPublicMenu tBPublicMenu, TBPublicMenuItem tBPublicMenuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7935ac9", new Object[]{tBPublicMenu, tBPublicMenuItem});
        } else {
            tBPublicMenu.onPublicMenuClicked(tBPublicMenuItem);
        }
    }

    public static /* synthetic */ TBActionView access$600(TBPublicMenu tBPublicMenu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBActionView) ipChange.ipc$dispatch("342e6d2", new Object[]{tBPublicMenu});
        }
        return tBPublicMenu.mCustomOverflow;
    }

    public static /* synthetic */ void access$700(TBPublicMenu tBPublicMenu, TBActionView tBActionView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32a27f6b", new Object[]{tBPublicMenu, tBActionView});
        } else {
            tBPublicMenu.onOverflowClicked(tBActionView);
        }
    }

    private void addCustomExternMenuClickListener(TBOnPublicMenuClickListener tBOnPublicMenuClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec213ea4", new Object[]{this, tBOnPublicMenuClickListener});
        } else {
            this.mPresenter.addOnExternMenuClickListener(tBOnPublicMenuClickListener);
        }
    }

    private void addDefaultMenuClickListener(TBOnPublicMenuClickListener tBOnPublicMenuClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae6a5dd2", new Object[]{this, tBOnPublicMenuClickListener});
        } else {
            this.mPresenter.addOnDefaultMenuClickListener(tBOnPublicMenuClickListener);
        }
    }

    private void addMenuItemAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57ca10f0", new Object[]{this});
        } else {
            this.mPresenter.setOnMenuItemActions(new PublicMenuPresenter.MenuItemActions() { // from class: com.taobao.uikit.actionbar.TBPublicMenu.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.uikit.actionbar.PublicMenuPresenter.MenuItemActions
                public boolean isItemVisible(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("89468e2b", new Object[]{this, new Integer(i)})).booleanValue();
                    }
                    return false;
                }

                @Override // com.taobao.uikit.actionbar.PublicMenuPresenter.MenuItemActions
                public void onItemExposed(TBPublicMenuItem tBPublicMenuItem, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("74339a5b", new Object[]{this, tBPublicMenuItem, str});
                    } else if (TBPublicMenu.access$000(TBPublicMenu.this) != null) {
                        TBPublicMenu.access$000(TBPublicMenu.this).onShareMenuItemExposed(tBPublicMenuItem, str);
                    }
                }

                @Override // com.taobao.uikit.actionbar.PublicMenuPresenter.MenuItemActions
                public void onMenuHidden() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("43e3ebaf", new Object[]{this});
                        return;
                    }
                    TBPublicMenu.access$200(TBPublicMenu.this);
                    TBPublicMenu.access$300(TBPublicMenu.this);
                }

                @Override // com.taobao.uikit.actionbar.PublicMenuPresenter.MenuItemActions
                public void onMenuShown() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7076a2da", new Object[]{this});
                    } else {
                        TBPublicMenu.access$100(TBPublicMenu.this);
                    }
                }

                @Override // com.taobao.uikit.actionbar.PublicMenuPresenter.MenuItemActions
                public void onShareMenuClear() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("791f8455", new Object[]{this});
                    } else {
                        TBPublicMenu.access$400(TBPublicMenu.this);
                    }
                }
            });
        }
    }

    private void clearReportArguments() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d16f1e7c", new Object[]{this});
        } else {
            this.pageInfoModel.clearReportArgs();
        }
    }

    public static InitShareCallBack getInitShareCallBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InitShareCallBack) ipChange.ipc$dispatch("341fde3e", new Object[0]);
        }
        return sInitShareCallBack;
    }

    public static TBPublicMenuItem getPublicMenu(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBPublicMenuItem) ipChange.ipc$dispatch("f37b4d54", new Object[]{new Integer(i)});
        }
        for (int i2 = 0; i2 < sNewDefaultPublicMenus.size(); i2++) {
            TBPublicMenuItem tBPublicMenuItem = sNewDefaultPublicMenus.get(i2);
            if (tBPublicMenuItem != null && tBPublicMenuItem.getId() == i) {
                return tBPublicMenuItem;
            }
        }
        return null;
    }

    private void hideInner() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef4ec4bb", new Object[]{this});
            return;
        }
        PublicMenuPresenter publicMenuPresenter = this.mPresenter;
        if (publicMenuPresenter != null) {
            publicMenuPresenter.close();
        }
    }

    private void initPresenterAndModel(Activity activity, ITBPublicMenu iTBPublicMenu, ShareContentCallBack shareContentCallBack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9c53b0b", new Object[]{this, activity, iTBPublicMenu, shareContentCallBack});
            return;
        }
        if (Localization.o()) {
            MenuLog.log(TAG, "initPresenterAndModel, i18n edition. GlobalizationData");
            this.mTbPublicMenuData = new GlobalizationData();
        } else if (MenuSwitch.isAbTestOn(activity)) {
            MenuLog.log(TAG, "initPresenterAndModel, ab test on. use TBPublicMenuDataV2");
            this.mTbPublicMenuData = new TBPublicMenuDataV2();
        } else {
            MenuLog.log(TAG, "initPresenterAndModel, ab test off. use default TBPublicMenuData");
            this.mTbPublicMenuData = new TBPublicMenuData();
        }
        this.mTbPublicMenuData.init(activity);
        sNewDefaultPublicMenus = this.mTbPublicMenuData.getDefaultPublicMenus();
        PublicMenuV3 publicMenuV3 = new PublicMenuV3(activity);
        if (Localization.o()) {
            this.mPresenter = new GlobalizationPresenter(this.mTbPublicMenuData, publicMenuV3, this, activity, shareContentCallBack);
        } else {
            this.mPresenter = new PublicMenuPresenter(this.mTbPublicMenuData, publicMenuV3, this, activity, shareContentCallBack);
        }
        this.mPresenter.resetExternalCustomiseItems();
        this.pageInfoModel = new PageInfoModel(iTBPublicMenu);
    }

    private void notifyMenuHidden() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e61b399", new Object[]{this});
            return;
        }
        TBOnMenuHidedListener tBOnMenuHidedListener = this.mOnTBOnMenuHidedListener;
        if (tBOnMenuHidedListener != null) {
            tBOnMenuHidedListener.onMenuHided();
        }
    }

    private void notifyMenuShown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a88b35b0", new Object[]{this});
            return;
        }
        TBOnMenuShowedListener tBOnMenuShowedListener = this.mOnTBOnMenuShowedListener;
        if (tBOnMenuShowedListener != null) {
            tBOnMenuShowedListener.onMenuShowed();
        }
    }

    private void onOverflowClicked(TBActionView tBActionView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2270edb9", new Object[]{this, tBActionView});
            return;
        }
        MenuMonitor.countSucceed("overflow_clicked");
        TBOnOverflowButtonClickListener tBOnOverflowButtonClickListener = this.mOnOverflowButtonClickListener;
        if (tBOnOverflowButtonClickListener != null) {
            tBOnOverflowButtonClickListener.onOverflowButtonClicked();
        }
        TBLiteProgramOnOverflowButtonOnClickListener tBLiteProgramOnOverflowButtonOnClickListener = sTbLiteProgramOnOverflowButtonOnClickListener;
        if (tBLiteProgramOnOverflowButtonOnClickListener != null) {
            tBLiteProgramOnOverflowButtonOnClickListener.onOverflowButtonClicked(this, this.mActivityRef.get());
        }
        UTWrapper.overflowClick();
        if (this.mPresenter != null) {
            showInner(tBActionView);
        }
    }

    private void onPublicMenuClicked(TBPublicMenuItem tBPublicMenuItem) {
        Activity activity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21abe8bf", new Object[]{this, tBPublicMenuItem});
        } else if (tBPublicMenuItem != null && (activity = this.mActivityRef.get()) != null) {
            UTWrapper.closeByButton = true;
            if (tBPublicMenuItem.isMenuNeedToBeClosed()) {
                closePopupMenu();
            }
            int id = tBPublicMenuItem.getId();
            if (id == R.id.uik_menu_wangxin || id == R.id.uik_menu_home || id == R.id.uik_menu_service || id == R.id.uik_menu_feedback) {
                this.mDefaultItemClickListener.onPublicMenuItemClicked(tBPublicMenuItem);
                return;
            }
            ArrayList<TBPublicMenuItem> arrayList = this.mExtensionMenu;
            if (arrayList == null || !arrayList.contains(tBPublicMenuItem)) {
                UTWrapper.itemClick(tBPublicMenuItem, this);
                this.mItemClickProcessor.onPublicMenuItemClicked(tBPublicMenuItem);
                return;
            }
            String navUrl = tBPublicMenuItem.getNavUrl();
            if (!TextUtils.isEmpty(navUrl)) {
                Nav.from(activity).toUri(navUrl);
            }
        }
    }

    public static void registerInitShareCallBack(InitShareCallBack initShareCallBack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a466ee71", new Object[]{initShareCallBack});
        } else {
            sInitShareCallBack = initShareCallBack;
        }
    }

    @Deprecated
    public static void removePublicMenu(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("787527d0", new Object[]{new Integer(i)});
        } else {
            removePublicMenu(i, false);
        }
    }

    private void resetOnShareMenuItemExposedListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a795658", new Object[]{this});
        } else {
            this.onShareMenuItemExposed = null;
        }
    }

    public static void setOnPublicMenuClickListener(TBOnPublicMenuClickListener tBOnPublicMenuClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("816c9e9c", new Object[]{tBOnPublicMenuClickListener});
        } else {
            ItemClickProcessor.setOnPublicMenuClickListener(tBOnPublicMenuClickListener);
        }
    }

    public static void setTBLiteProgramOnOverflowButtonOnClickListener(TBLiteProgramOnOverflowButtonOnClickListener tBLiteProgramOnOverflowButtonOnClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4df84fc", new Object[]{tBLiteProgramOnOverflowButtonOnClickListener});
        } else {
            sTbLiteProgramOnOverflowButtonOnClickListener = tBLiteProgramOnOverflowButtonOnClickListener;
        }
    }

    private void showInner(TBActionView tBActionView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6efd3126", new Object[]{this, tBActionView});
            return;
        }
        PublicMenuPresenter publicMenuPresenter = this.mPresenter;
        if (publicMenuPresenter != null) {
            publicMenuPresenter.show(tBActionView);
        }
    }

    private void updateActionView(MenuItemImpl menuItemImpl, Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12c5b188", new Object[]{this, menuItemImpl, activity, str});
            return;
        }
        TBActionView tBActionView = new TBActionView(activity);
        tBActionView.setTitle(str);
        tBActionView.setIconColor(this.mMenuIconColor);
        tBActionView.setContentDescription(Tools.subTitle(str));
        menuItemImpl.setActionView((View) tBActionView);
        TBPublicMenuItem.Builder builder = new TBPublicMenuItem.Builder();
        builder.setId(menuItemImpl.getItemId()).setTitle(str).setIcon(menuItemImpl.getIcon());
        final TBPublicMenuItem build = builder.build();
        tBActionView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.uikit.actionbar.TBPublicMenu.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    TBPublicMenu.access$500(TBPublicMenu.this, build);
                }
            }
        });
    }

    private void updateMenuData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f435e119", new Object[]{this});
            return;
        }
        PublicMenuPresenter publicMenuPresenter = this.mPresenter;
        if (publicMenuPresenter != null) {
            publicMenuPresenter.notifyMenuChanged();
        }
    }

    @Deprecated
    public static void updatePublicMenu(int i, TBPublicMenuItem tBPublicMenuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76268a5b", new Object[]{new Integer(i), tBPublicMenuItem});
        } else {
            updatePublicMenu(tBPublicMenuItem, true);
        }
    }

    @Deprecated
    public void addCustomMenus(ArrayList<TBPublicMenuItem> arrayList, TBOnPublicMenuClickListener tBOnPublicMenuClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0f0d795", new Object[]{this, arrayList, tBOnPublicMenuClickListener});
            return;
        }
        PublicMenuPresenter publicMenuPresenter = this.mPresenter;
        if (publicMenuPresenter != null) {
            publicMenuPresenter.addExternalMenuCustomiseItems(arrayList);
            this.mPresenter.addOnExternMenuClickListener(tBOnPublicMenuClickListener);
            this.mPresenter.addOnDefaultMenuClickListener(tBOnPublicMenuClickListener);
        }
    }

    public void addExternalMenus(ArrayList<TBPublicMenuItem> arrayList, TBOnPublicMenuClickListener tBOnPublicMenuClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8f6053b", new Object[]{this, arrayList, tBOnPublicMenuClickListener});
            return;
        }
        PublicMenuPresenter publicMenuPresenter = this.mPresenter;
        if (publicMenuPresenter != null) {
            publicMenuPresenter.addExternalMenuCustomiseItems(arrayList);
            this.mPresenter.addCustomizeExternalMenuClickListener(tBOnPublicMenuClickListener);
        }
    }

    @Deprecated
    public void addLiteProgram(ArrayList<TBPublicMenuItem> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98cb6a8e", new Object[]{this, arrayList});
        }
    }

    public void addOnShareMenuClickListener(TBOnPublicMenuClickListener tBOnPublicMenuClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdea6411", new Object[]{this, tBOnPublicMenuClickListener});
        } else {
            this.mPresenter.addOnShareMenuClickListener(tBOnPublicMenuClickListener);
        }
    }

    public void addShareMenus(List<TBPublicMenuItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c25a064e", new Object[]{this, list});
        } else {
            this.mPresenter.addShareMenus(list);
        }
    }

    public void cleanShareMenus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34af0b05", new Object[]{this});
        } else {
            this.mPresenter.cleanShareMenus();
        }
    }

    public void clearExternalMenus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("996f9f23", new Object[]{this});
            return;
        }
        PublicMenuPresenter publicMenuPresenter = this.mPresenter;
        if (publicMenuPresenter != null) {
            publicMenuPresenter.clearExternalCustomiseItems();
            this.mPresenter.clearCustomizeExternalMenuClickListeners();
        }
    }

    public void clearShareMenuListeners() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af9bf0b5", new Object[]{this});
        } else {
            this.mPresenter.clearShareMenuListeners();
        }
    }

    public void closePopupMenu() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab8001a", new Object[]{this});
            return;
        }
        MenuMonitor.countSucceed("menu_closePopupMenu_called");
        hideInner();
    }

    public TBPublicMenuItem getCustomMenu(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBPublicMenuItem) ipChange.ipc$dispatch("9fd4094c", new Object[]{this, new Integer(i)});
        }
        PublicMenuPresenter publicMenuPresenter = this.mPresenter;
        if (publicMenuPresenter == null) {
            return null;
        }
        return publicMenuPresenter.getExternalMenuItem(i);
    }

    public TBActionView getCustomOverflow() {
        Activity activity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBActionView) ipChange.ipc$dispatch("aef3b6c6", new Object[]{this});
        }
        if (this.mCustomOverflow == null && (activity = this.mActivityRef.get()) != null) {
            this.mCustomOverflow = new TBActionView(activity);
        }
        return this.mCustomOverflow;
    }

    public TBPublicMenuItem getExternalMenuItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBPublicMenuItem) ipChange.ipc$dispatch("ab6353df", new Object[]{this, new Integer(i)});
        }
        PublicMenuPresenter publicMenuPresenter = this.mPresenter;
        if (publicMenuPresenter != null) {
            return publicMenuPresenter.getExternalMenuItem(i);
        }
        return null;
    }

    @Deprecated
    public TBPublicMenuItem getExtraMenu(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBPublicMenuItem) ipChange.ipc$dispatch("da568f39", new Object[]{this, new Integer(i)});
        }
        return getCustomMenu(i);
    }

    public PublicMenuPresenter getPresenter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PublicMenuPresenter) ipChange.ipc$dispatch("d1c7163e", new Object[]{this});
        }
        return this.mPresenter;
    }

    public void hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            return;
        }
        MenuMonitor.countSucceed("menu_hide_called");
        hideInner();
    }

    public boolean isClickDefaultItem(Context context, TBPublicMenuItem tBPublicMenuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52b25ff", new Object[]{this, context, tBPublicMenuItem})).booleanValue();
        }
        return this.mExternalItemClickListener.isClickDefaultItem(context, tBPublicMenuItem);
    }

    public boolean isNewActionBarOpen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("96f1f17c", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Deprecated
    public void needNewMenu(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66082324", new Object[]{this, new Boolean(z)});
        }
    }

    public void notifyMenuChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("907ec3d3", new Object[]{this});
            return;
        }
        PublicMenuPresenter publicMenuPresenter = this.mPresenter;
        if (publicMenuPresenter != null) {
            publicMenuPresenter.notifyMenuChanged();
        }
    }

    public Menu onCreateOptionsMenu(MenuInflater menuInflater, Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Menu) ipChange.ipc$dispatch("a5581c1c", new Object[]{this, menuInflater, menu});
        }
        Activity activity = this.mActivityRef.get();
        if (activity == null) {
            return menu;
        }
        this.mPresenter.cleanExternMenus();
        this.mPresenter.resetExternalCustomiseItems();
        this.mFilteredMenus.clear();
        this.mMenuItems.clear();
        filterMenus(menu);
        if (this.mNeedPublicMenu) {
            int i = R.id.uik_menu_overflow;
            if (menu.findItem(i) == null) {
                menuInflater.inflate(R.menu.uik_menu_overflow_action, menu);
                final MenuItem findItem = menu.findItem(i);
                if (this.mCustomOverflow == null) {
                    this.mCustomOverflow = new TBActionView(activity);
                }
                String charSequence = findItem.getTitle().toString();
                if (this.mUseNewActionViewStyle) {
                    charSequence = charSequence.replace("ꈝ", "됻");
                }
                this.mCustomOverflow.setTitle(charSequence);
                this.mCustomOverflow.setIconColor(this.mMenuIconColor);
                findItem.setActionView(this.mCustomOverflow);
                this.mCustomOverflow.setId(R.id.uik_action_overflow);
                this.mCustomOverflow.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.uikit.actionbar.TBPublicMenu.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        } else {
                            TBPublicMenu.this.onMenuItemClick(findItem);
                        }
                    }
                });
                findItem.setOnMenuItemClickListener(this);
                this.mCustomOverflow.onMessageUpdate(getPublicMenu(R.id.uik_menu_wangxin));
                this.mMenuItems.add((MenuItemImpl) findItem);
            }
        }
        this.mPresenter.notifyMenuChanged();
        return menu;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(MenuItem menuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2df3d0b", new Object[]{this, menuItem})).booleanValue();
        }
        if (this.mActivityRef.get() == null || menuItem == null) {
            return true;
        }
        if (menuItem.getItemId() == R.id.uik_menu_overflow) {
            View actionView = menuItem.getActionView();
            if (actionView instanceof TBActionView) {
                onOverflowClicked((TBActionView) actionView);
                return true;
            }
        }
        return false;
    }

    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        PublicMenuPresenter publicMenuPresenter = this.mPresenter;
        if (publicMenuPresenter != null) {
            publicMenuPresenter.pause();
        }
    }

    public Menu onPrepareOptionsMenu(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Menu) ipChange.ipc$dispatch("b737a044", new Object[]{this, menu});
        }
        if (this.mCustomOverflow != null) {
            filterMenus(menu);
        }
        return menu;
    }

    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        updateMenuData();
        TBActionView tBActionView = this.mCustomOverflow;
        if (tBActionView != null) {
            tBActionView.onMessageUpdate(getPublicMenu(R.id.uik_menu_wangxin));
        }
    }

    public void registerMenuCallBack(MenuCallBack menuCallBack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a0a40bd", new Object[]{this, menuCallBack});
        } else {
            this.mDefaultItemClickListener.setCallBack(menuCallBack);
        }
    }

    public void removeCustomMenuItemsByType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c15d62e", new Object[]{this, str});
            return;
        }
        TBPublicMenuData tBPublicMenuData = this.mTbPublicMenuData;
        if (tBPublicMenuData != null) {
            tBPublicMenuData.removeExtraMenuItemByType(str);
        }
    }

    @Deprecated
    public void setActionViewIconColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("939fc08f", new Object[]{this, new Integer(i)});
            return;
        }
        this.mMenuIconColor = i;
        for (int i2 = 0; i2 < this.mMenuItems.size(); i2++) {
            MenuItemImpl menuItemImpl = this.mMenuItems.get(i2);
            if (menuItemImpl != null) {
                View actionView = menuItemImpl.getActionView();
                if (actionView instanceof TBActionView) {
                    ((TBActionView) actionView).setIconColor(i);
                } else if (actionView instanceof TextView) {
                    ((TextView) actionView).setTextColor(i);
                }
            }
        }
        TBActionView tBActionView = this.mCustomOverflow;
        if (tBActionView != null) {
            tBActionView.setIconColor(this.mMenuIconColor);
        }
    }

    public void setCustomOverflow(TBActionView tBActionView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f1246a", new Object[]{this, tBActionView});
        } else if (tBActionView != null) {
            this.mCustomOverflow = tBActionView;
            tBActionView.setIconColor(this.mMenuIconColor);
            this.mCustomOverflow.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.uikit.actionbar.TBPublicMenu.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    TBPublicMenu tBPublicMenu = TBPublicMenu.this;
                    TBPublicMenu.access$700(tBPublicMenu, TBPublicMenu.access$600(tBPublicMenu));
                }
            });
            this.mCustomOverflow.onMessageUpdate(getPublicMenu(R.id.uik_menu_wangxin));
        }
    }

    public void setDefaultPageUserInfo(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5701dd26", new Object[]{this, bundle});
        } else {
            this.pageInfoModel.setDefaultPageInfoBundle(bundle);
        }
    }

    public void setDefaultPublicMenuClickListener(TBOnPublicMenuClickListener tBOnPublicMenuClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aa0e03a", new Object[]{this, tBOnPublicMenuClickListener});
        } else {
            this.mDefaultPublicMenuListener = tBOnPublicMenuClickListener;
        }
    }

    @Deprecated
    public void setExtensionMenu(ArrayList<TBPublicMenuItem> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68c54207", new Object[]{this, arrayList});
        } else if (arrayList != null && arrayList.size() > 0) {
            ArrayList<TBPublicMenuItem> arrayList2 = this.mExtensionMenu;
            if (arrayList2 == null) {
                this.mExtensionMenu = new ArrayList<>();
            } else {
                arrayList2.clear();
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.mExtensionMenu.add(arrayList.get(i));
            }
        }
    }

    @Deprecated
    public void setExtensionTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3824eac", new Object[]{this, str});
        }
    }

    @Deprecated
    public void setOnLiteProgramClickListener(TBOnLiteProgramClickListener tBOnLiteProgramClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e295f2e", new Object[]{this, tBOnLiteProgramClickListener});
        }
    }

    public void setOnMenuHidedListener(TBOnMenuHidedListener tBOnMenuHidedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9e30516", new Object[]{this, tBOnMenuHidedListener});
        } else {
            this.mOnTBOnMenuHidedListener = tBOnMenuHidedListener;
        }
    }

    public void setOnMenuShowedListener(TBOnMenuShowedListener tBOnMenuShowedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69df3bce", new Object[]{this, tBOnMenuShowedListener});
        } else {
            this.mOnTBOnMenuShowedListener = tBOnMenuShowedListener;
        }
    }

    public void setOnOverflowButtonClickListener(TBOnOverflowButtonClickListener tBOnOverflowButtonClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11e237f4", new Object[]{this, tBOnOverflowButtonClickListener});
        } else {
            this.mOnOverflowButtonClickListener = tBOnOverflowButtonClickListener;
        }
    }

    public void setOnShareMenuItemExposedListener(OnShareMenuItemExposedListener onShareMenuItemExposedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49db3afc", new Object[]{this, onShareMenuItemExposedListener});
        } else {
            this.onShareMenuItemExposed = onShareMenuItemExposedListener;
        }
    }

    public void setReportArguments(ITBPublicMenu iTBPublicMenu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caa2de29", new Object[]{this, iTBPublicMenu});
        } else {
            this.pageInfoModel.setReportArgs(iTBPublicMenu);
        }
    }

    public void setShareContentCallBack(ShareContentCallBack shareContentCallBack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f68afe8", new Object[]{this, shareContentCallBack});
            return;
        }
        PublicMenuPresenter publicMenuPresenter = this.mPresenter;
        if (publicMenuPresenter != null) {
            publicMenuPresenter.setShareContentCallBack(shareContentCallBack);
        }
    }

    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        MenuMonitor.countSucceed("menu_show_called");
        showInner(null);
    }

    public void showMenuItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f1e758d", new Object[]{this, new Integer(i)});
            return;
        }
        PublicMenuPresenter publicMenuPresenter = this.mPresenter;
        if (publicMenuPresenter != null) {
            publicMenuPresenter.showMenuItem(i);
        }
    }

    public void togglePublicMenu(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80c9aad1", new Object[]{this, new Boolean(z)});
        } else {
            this.mNeedPublicMenu = z;
        }
    }

    public void useNewActionViewStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ecd66a4", new Object[]{this});
        } else {
            this.mUseNewActionViewStyle = true;
        }
    }

    public TBPublicMenu(Activity activity, ITBPublicMenu iTBPublicMenu) {
        this(activity, iTBPublicMenu, null);
    }

    public static void removePublicMenu(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96308504", new Object[]{new Integer(i), new Boolean(z)});
            return;
        }
        for (int i2 = 0; i2 < sPublicMenus.size(); i2++) {
            TBPublicMenuItem tBPublicMenuItem = sPublicMenus.get(i2);
            if (tBPublicMenuItem != null && tBPublicMenuItem.getId() == i) {
                sPublicMenus.remove(i2);
                return;
            }
        }
    }

    public static void updatePublicMenu(TBPublicMenuItem tBPublicMenuItem, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7225946", new Object[]{tBPublicMenuItem, new Boolean(z)});
        } else if (tBPublicMenuItem != null && getPublicMenu(tBPublicMenuItem.getId()) != null && tBPublicMenuItem.checkValidation()) {
            if (sNewDefaultPublicMenus.isEmpty()) {
                sNewDefaultPublicMenus = TBPublicMenuData.sDefaultPublicMenus;
            }
            for (int i = 0; i < sNewDefaultPublicMenus.size(); i++) {
                TBPublicMenuItem tBPublicMenuItem2 = sNewDefaultPublicMenus.get(i);
                if (tBPublicMenuItem2 != null && tBPublicMenuItem2.getId() == tBPublicMenuItem.getId()) {
                    sNewDefaultPublicMenus.remove(tBPublicMenuItem2);
                    sNewDefaultPublicMenus.add(i, tBPublicMenuItem);
                }
            }
        }
    }

    public TBPublicMenu(Activity activity, ITBPublicMenu iTBPublicMenu, ShareContentCallBack shareContentCallBack) {
        ArrayList<MenuItemImpl> arrayList = new ArrayList<>();
        this.mFilteredMenus = arrayList;
        ArrayList<MenuItemImpl> arrayList2 = new ArrayList<>();
        this.mMenuItems = arrayList2;
        this.mUseNewActionViewStyle = false;
        this.mNeedPublicMenu = false;
        initPresenterAndModel(activity, iTBPublicMenu, shareContentCallBack);
        addMenuItemAction();
        this.mActivityRef = new WeakReference<>(activity);
        this.mMenuIconColor = ContextCompat.getColor(activity, R.color.uik_action_icon_normal);
        ItemClickProcessor itemClickProcessor = new ItemClickProcessor(activity, arrayList2, arrayList);
        this.mItemClickProcessor = itemClickProcessor;
        if (MenuSwitch.isUseNewClickListener()) {
            MenuLog.log(TAG, "TBPublicMenu, use new click listener. ItemClickAllInOneListener");
            ItemClickAllInOneListener itemClickAllInOneListener = new ItemClickAllInOneListener(activity, this.pageInfoModel, this.mTbPublicMenuData, this, this.mDefaultPublicMenuListener, itemClickProcessor);
            this.mExternalItemClickListener = itemClickAllInOneListener;
            this.mDefaultItemClickListener = itemClickAllInOneListener;
        } else {
            this.mDefaultItemClickListener = new DefaultItemClickListener(activity, this.pageInfoModel, this.mTbPublicMenuData, this, this.mDefaultPublicMenuListener, itemClickProcessor);
            this.mExternalItemClickListener = new ExternalItemClickListener(activity, this.pageInfoModel, this.mTbPublicMenuData, this, this.mDefaultPublicMenuListener, itemClickProcessor);
        }
        addDefaultMenuClickListener(this.mDefaultItemClickListener);
        addCustomExternMenuClickListener(this.mExternalItemClickListener);
    }

    public void setShareContentCallBack(ShareContentCallBack shareContentCallBack, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdadffec", new Object[]{this, shareContentCallBack, new Boolean(z)});
            return;
        }
        PublicMenuPresenter publicMenuPresenter = this.mPresenter;
        if (publicMenuPresenter != null) {
            publicMenuPresenter.setShareContentCallBack(shareContentCallBack, z);
        }
    }

    public void showMenuItem(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdcf4c80", new Object[]{this, str});
            return;
        }
        PublicMenuPresenter publicMenuPresenter = this.mPresenter;
        if (publicMenuPresenter != null) {
            publicMenuPresenter.showMenuItem(str);
        }
    }

    private Menu filterMenus(Menu menu) {
        CharSequence title;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Menu) ipChange.ipc$dispatch("40901f9d", new Object[]{this, menu});
        }
        Activity activity = this.mActivityRef.get();
        if (activity == null) {
            return menu;
        }
        MenuBuilder menuBuilder = (MenuBuilder) menu;
        int i = 0;
        while (true) {
            if (i >= menuBuilder.size()) {
                break;
            }
            MenuItemImpl menuItemImpl = (MenuItemImpl) menuBuilder.getItem(i);
            if (!(menuItemImpl == null || (title = menuItemImpl.getTitle()) == null)) {
                String charSequence = title.toString();
                if (!menuItemImpl.requiresActionButton()) {
                    TBPublicMenuItem.Builder builder = new TBPublicMenuItem.Builder();
                    builder.setId(menuItemImpl.getItemId()).setTitle(charSequence).setIcon(menuItemImpl.getIcon());
                    String q = Localization.q(R.string.app_share);
                    if (!TextUtils.isEmpty(charSequence) && charSequence.contains(q)) {
                        menuItemImpl.setTitle("ꄪ:" + q);
                        builder.setTitle("ꄪ:" + q);
                    }
                    this.mFilteredMenus.add(menuItemImpl);
                    this.mTbPublicMenuData.addCustomMenu(builder.build());
                } else if (charSequence.length() < 2 || charSequence.indexOf(":") != 1) {
                    if (MenuItemCompat.getActionProvider(menuItemImpl) == null && menuItemImpl.getActionView() == null && menuItemImpl.getIcon() == null && !TextUtils.isEmpty(charSequence)) {
                        updateActionView(menuItemImpl, activity, charSequence);
                    }
                    this.mMenuItems.add(menuItemImpl);
                } else {
                    View actionView = menuItemImpl.getActionView();
                    if (actionView instanceof TBActionView) {
                        ((TBActionView) actionView).setIconColor(this.mMenuIconColor);
                        break;
                    }
                    updateActionView(menuItemImpl, activity, charSequence);
                    this.mMenuItems.add(menuItemImpl);
                }
            }
            i++;
        }
        for (int i2 = 0; i2 < this.mFilteredMenus.size(); i2++) {
            MenuItemImpl menuItemImpl2 = this.mFilteredMenus.get(i2);
            MenuItem findItem = menuItemImpl2 != null ? menuBuilder.findItem(menuItemImpl2.getItemId()) : null;
            if (findItem != null && !menuItemImpl2.requiresActionButton()) {
                menuBuilder.removeItem(findItem.getItemId());
            }
        }
        return menu;
    }
}
