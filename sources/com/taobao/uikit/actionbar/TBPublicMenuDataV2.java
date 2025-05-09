package com.taobao.uikit.actionbar;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.model.PublicMenuItemProvider;
import java.util.List;
import tb.c2v;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TBPublicMenuDataV2 extends TBPublicMenuData {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String BLOCK_PAGE_NAME_SHOP = "Page_Shop";

    static {
        t2o.a(927989831);
    }

    public static /* synthetic */ Object ipc$super(TBPublicMenuDataV2 tBPublicMenuDataV2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/actionbar/TBPublicMenuDataV2");
    }

    @Override // com.taobao.uikit.actionbar.TBPublicMenuData
    public void resetCustomMenus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0edd7bb", new Object[]{this});
            return;
        }
        this.mCustomMenus.addAll(TBPublicMenuData.sDefaultExtraMenus);
        List<TBPublicMenuItem> list = TBPublicMenuData.sDefaultPublicMenus;
        int i = R.id.uik_menu_footpoint;
        TBPublicMenuItem itemFromListById = getItemFromListById(list, i);
        if (itemFromListById == null) {
            itemFromListById = PublicMenuItemProvider.provide(i);
        }
        if (itemFromListById != null) {
            itemFromListById.mType = 8;
            this.mCustomMenus.add(0, itemFromListById);
        }
        String currentPageName = c2v.getInstance().getCurrentPageName();
        if (TextUtils.isEmpty(currentPageName) || !currentPageName.contains("Page_Shop")) {
            this.mCustomMenus.add(1, PublicMenuItemProvider.provide(R.id.uik_menu_favor));
        }
    }

    @Override // com.taobao.uikit.actionbar.TBPublicMenuData
    public void resetDefaultMenus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cb927a9", new Object[]{this});
            return;
        }
        this.mDefaultPublicMenus.clear();
        List<TBPublicMenuItem> list = TBPublicMenuData.sDefaultPublicMenus;
        TBPublicMenuItem itemFromListById = getItemFromListById(list, R.id.uik_menu_footpoint);
        if (itemFromListById != null) {
            itemFromListById.mType = 8;
        }
        for (TBPublicMenuItem tBPublicMenuItem : list) {
            if (tBPublicMenuItem.getType() == 4) {
                this.mDefaultPublicMenus.add(tBPublicMenuItem);
            }
        }
    }
}
