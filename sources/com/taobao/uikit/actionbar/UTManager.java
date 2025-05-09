package com.taobao.uikit.actionbar;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.actionbar.util.Tools;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import tb.sqj;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class UTManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final List<String> mShareShouldExposureItemNameList;
    private final Set<TBPublicMenuItem> mShareShownItems = new HashSet();

    private String getShareItemTitle(TBPublicMenuItem tBPublicMenuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("537ebe1d", new Object[]{this, tBPublicMenuItem});
        }
        String subTitle = Tools.subTitle(tBPublicMenuItem.getTitle());
        return !mShareShouldExposureItemNameList.contains(subTitle) ? "其他" : subTitle;
    }

    public void onItemClick(TBPublicMenuItem tBPublicMenuItem, TBPublicMenuData tBPublicMenuData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2a3b026", new Object[]{this, tBPublicMenuItem, tBPublicMenuData});
            return;
        }
        List<TBPublicMenuItem> shareMenus = tBPublicMenuData.getShareMenus();
        if (shareMenus != null && !shareMenus.isEmpty()) {
            UTWrapper.itemClick(getShareItemTitle(tBPublicMenuItem), shareMenus.indexOf(tBPublicMenuItem), 0);
        }
    }

    public void onItemExposure(TBPublicMenuItem tBPublicMenuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a42d0a6", new Object[]{this, tBPublicMenuItem});
        } else {
            this.mShareShownItems.add(tBPublicMenuItem);
        }
    }

    public void onMenuDismiss(TBPublicMenuData tBPublicMenuData) {
        TBPublicMenuItem tBPublicMenuItem;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9a634fc", new Object[]{this, tBPublicMenuData});
        } else if (!this.mShareShownItems.isEmpty()) {
            List<TBPublicMenuItem> shareMenus = tBPublicMenuData.getShareMenus();
            ArrayList arrayList = new ArrayList();
            for (TBPublicMenuItem tBPublicMenuItem2 : this.mShareShownItems) {
                try {
                    tBPublicMenuItem = (TBPublicMenuItem) tBPublicMenuItem2.clone();
                } catch (CloneNotSupportedException unused) {
                    tBPublicMenuItem = new TBPublicMenuItem();
                    tBPublicMenuItem.setTitle(tBPublicMenuItem2.getTitle());
                }
                if (!mShareShouldExposureItemNameList.contains(getShareItemTitle(tBPublicMenuItem2))) {
                    tBPublicMenuItem.setTitle("其他");
                }
                tBPublicMenuItem.setOrder(shareMenus.indexOf(tBPublicMenuItem2));
                arrayList.add(tBPublicMenuItem);
            }
            UTWrapper.shareItemExposure(arrayList);
            this.mShareShownItems.clear();
        }
    }

    static {
        t2o.a(927989836);
        ArrayList arrayList = new ArrayList();
        mShareShouldExposureItemNameList = arrayList;
        arrayList.add("复制链接");
        arrayList.add("保存画报");
        arrayList.add("画报分享");
        arrayList.add("微信");
        arrayList.add("qq");
        arrayList.add("淘友圈");
        arrayList.add(sqj.MORE_BUTTON);
    }
}
