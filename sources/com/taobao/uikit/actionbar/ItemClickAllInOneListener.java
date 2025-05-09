package com.taobao.uikit.actionbar;

import android.app.Activity;
import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.uikit.actionbar.model.PageInfoModel;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ItemClickAllInOneListener extends DefaultItemClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(927989772);
    }

    public ItemClickAllInOneListener(Activity activity, PageInfoModel pageInfoModel, TBPublicMenuData tBPublicMenuData, TBPublicMenu tBPublicMenu, TBPublicMenu.TBOnPublicMenuClickListener tBOnPublicMenuClickListener, ItemClickProcessor itemClickProcessor) {
        super(activity, pageInfoModel, tBPublicMenuData, tBPublicMenu, tBOnPublicMenuClickListener, itemClickProcessor);
    }

    public static /* synthetic */ Object ipc$super(ItemClickAllInOneListener itemClickAllInOneListener, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/actionbar/ItemClickAllInOneListener");
    }

    @Override // com.taobao.uikit.actionbar.DefaultItemClickListener
    public boolean isClickDefaultItem(Context context, TBPublicMenuItem tBPublicMenuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52b25ff", new Object[]{this, context, tBPublicMenuItem})).booleanValue();
        }
        if (tBPublicMenuItem.getType() != 8) {
            return false;
        }
        onPublicMenuItemClicked(tBPublicMenuItem);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c3  */
    @Override // com.taobao.uikit.actionbar.DefaultItemClickListener, com.taobao.uikit.actionbar.TBPublicMenu.TBOnPublicMenuClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPublicMenuItemClicked(com.taobao.uikit.actionbar.TBPublicMenuItem r11) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.uikit.actionbar.ItemClickAllInOneListener.onPublicMenuItemClicked(com.taobao.uikit.actionbar.TBPublicMenuItem):void");
    }
}
