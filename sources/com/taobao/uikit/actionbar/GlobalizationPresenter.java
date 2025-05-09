package com.taobao.uikit.actionbar;

import android.app.Activity;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.MenuContract;
import com.taobao.uikit.actionbar.TBPublicMenuItem;
import com.taobao.uikit.actionbar.util.MenuLog;
import java.util.Iterator;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class GlobalizationPresenter extends PublicMenuPresenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean showShareInI18n;

    static {
        t2o.a(927989770);
    }

    public GlobalizationPresenter(TBPublicMenuData tBPublicMenuData, MenuContract.ActionBarBaseView actionBarBaseView, TBPublicMenu tBPublicMenu, Activity activity, ShareContentCallBack shareContentCallBack) {
        super(tBPublicMenuData, actionBarBaseView, tBPublicMenu, activity, shareContentCallBack);
    }

    public static /* synthetic */ Object ipc$super(GlobalizationPresenter globalizationPresenter, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -29673034) {
            super.initShare();
            return null;
        } else if (hashCode == 1863268185) {
            super.addExternalMenuCustomiseItems((List) objArr[0]);
            return null;
        } else if (hashCode == 1887709639) {
            super.deleteShareIconIfNeed();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/uikit/actionbar/GlobalizationPresenter");
        }
    }

    @Override // com.taobao.uikit.actionbar.PublicMenuPresenter
    public void addExternalMenuCustomiseItems(List<TBPublicMenuItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f0f3759", new Object[]{this, list});
            return;
        }
        Iterator<TBPublicMenuItem> it = list.iterator();
        while (it.hasNext()) {
            TBPublicMenuItem next = it.next();
            if (!next.getIsI18nSupported()) {
                it.remove();
            }
            if (isShareItem(next) && !hasShareMenu()) {
                next.setTitle("ꄪ:" + Localization.q(R.string.app_share));
                next.setMessageMode(TBPublicMenuItem.MessageMode.NONE);
                next.setIconUrl(null);
                next.setOrder(3);
                next.setIconDrawable(null);
                this.mTbPublicMenuData.setShareItem(next);
                it.remove();
            }
        }
        super.addExternalMenuCustomiseItems(list);
    }

    @Override // com.taobao.uikit.actionbar.PublicMenuPresenter
    public void deleteShareIconIfNeed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("708429c7", new Object[]{this});
            return;
        }
        this.mTbPublicMenuData.setShareItem(null);
        super.deleteShareIconIfNeed();
    }

    @Override // com.taobao.uikit.actionbar.PublicMenuPresenter
    public void initShare() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe3b39b6", new Object[]{this});
        } else if (this.mShareContentCallBack == null || this.showShareInI18n) {
            super.initShare();
        }
    }

    @Override // com.taobao.uikit.actionbar.PublicMenuPresenter
    public void setShareContentCallBack(ShareContentCallBack shareContentCallBack, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdadffec", new Object[]{this, shareContentCallBack, new Boolean(z)});
            return;
        }
        this.mShareContentCallBack = shareContentCallBack;
        this.showShareInI18n = z;
    }

    @Override // com.taobao.uikit.actionbar.PublicMenuPresenter
    public void showMenuItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f1e758d", new Object[]{this, new Integer(i)});
        } else {
            this.mTbPublicMenuData.addShowItem(i);
        }
    }

    @Override // com.taobao.uikit.actionbar.PublicMenuPresenter
    public void showMenuItem(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdcf4c80", new Object[]{this, str});
            return;
        }
        TBPublicMenuItem extraMenuByType = this.mTbPublicMenuData.getExtraMenuByType(str);
        if (extraMenuByType == null) {
            MenuLog.log("TBPublicMenu", "showMenuItem", "item is null. type is: ", str);
        } else if (!extraMenuByType.isAddByUikit()) {
            MenuLog.log("TBPublicMenu", "showMenuItem", "item is not add by uikit. type is: ", str);
        } else {
            this.mTbPublicMenuData.addShowItem(extraMenuByType.getId());
        }
    }
}
