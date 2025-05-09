package com.taobao.uikit.actionbar;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class GlobalizationData extends TBPublicMenuData {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Set<Integer> showItemIdList = new HashSet();
    private List<TBPublicMenuItem> finalShowItems = new ArrayList();
    private TBPublicMenuItem shareItem = null;

    static {
        t2o.a(927989769);
    }

    public static /* synthetic */ Object ipc$super(GlobalizationData globalizationData, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1843643723:
                return super.getShareMenus();
            case -1040781344:
                return super.getDefaultPublicMenus();
            case 1542964644:
                return super.getExtraMenuUikitItemById(((Number) objArr[0]).intValue());
            case 1857132787:
                return super.getCustomMenus();
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/actionbar/GlobalizationData");
        }
    }

    @Override // com.taobao.uikit.actionbar.TBPublicMenuData
    public void addShowItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("538dce8b", new Object[]{this, new Integer(i)});
        } else {
            this.showItemIdList.add(Integer.valueOf(i));
        }
    }

    @Override // com.taobao.uikit.actionbar.TBPublicMenuData
    public List<TBPublicMenuItem> getCustomMenus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6eb198f3", new Object[]{this});
        }
        return new ArrayList();
    }

    @Override // com.taobao.uikit.actionbar.TBPublicMenuData
    public List<TBPublicMenuItem> getDefaultPublicMenus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c1f6efe0", new Object[]{this});
        }
        this.finalShowItems = new ArrayList(super.getDefaultPublicMenus());
        ArrayList arrayList = new ArrayList();
        for (Integer num : this.showItemIdList) {
            TBPublicMenuItem extraMenuUikitItemById = super.getExtraMenuUikitItemById(num.intValue());
            if (extraMenuUikitItemById != null) {
                arrayList.add(extraMenuUikitItemById);
            }
        }
        this.finalShowItems.addAll(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (TBPublicMenuItem tBPublicMenuItem : super.getCustomMenus()) {
            if (tBPublicMenuItem.isI18nSupported) {
                arrayList2.add(tBPublicMenuItem);
            }
        }
        this.finalShowItems.addAll(arrayList2);
        if (this.shareItem != null) {
            int size = this.finalShowItems.size();
            List<TBPublicMenuItem> list = this.finalShowItems;
            int i = 2;
            if (size <= 2) {
                i = size - 1;
            }
            list.add(i, this.shareItem);
        }
        return this.finalShowItems;
    }

    @Override // com.taobao.uikit.actionbar.TBPublicMenuData
    public TBPublicMenuItem getExtraAndCustomizeMenuById(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBPublicMenuItem) ipChange.ipc$dispatch("1a8b3a3b", new Object[]{this, new Integer(i)});
        }
        return getPublicMenu(i);
    }

    @Override // com.taobao.uikit.actionbar.TBPublicMenuData
    public TBPublicMenuItem getPublicMenu(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBPublicMenuItem) ipChange.ipc$dispatch("f37b4d54", new Object[]{this, new Integer(i)});
        }
        return getItemFromListById(this.finalShowItems, i);
    }

    @Override // com.taobao.uikit.actionbar.TBPublicMenuData
    public List<TBPublicMenuItem> getShareMenus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("921c3ab5", new Object[]{this});
        }
        return super.getShareMenus();
    }

    @Override // com.taobao.uikit.actionbar.TBPublicMenuData
    public void setShareItem(TBPublicMenuItem tBPublicMenuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e8f08ef", new Object[]{this, tBPublicMenuItem});
        } else {
            this.shareItem = tBPublicMenuItem;
        }
    }
}
