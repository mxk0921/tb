package com.taobao.uikit.actionbar.model;

import android.app.Activity;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.actionbar.ITBPublicMenu;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class PageInfoModel {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String EXTRA_BUNDLE_KEY = "H5Data";
    private Bundle defaultPageInfoBundle;
    private final ITBPublicMenu pageInfo;
    private ITBPublicMenu reportArgs;

    static {
        t2o.a(927989839);
    }

    public PageInfoModel(ITBPublicMenu iTBPublicMenu) {
        this.pageInfo = iTBPublicMenu;
    }

    private Bundle getExtraBundle(ITBPublicMenu iTBPublicMenu) {
        Bundle bundle;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("7b48e469", new Object[]{this, iTBPublicMenu});
        }
        Bundle bundle2 = new Bundle();
        if (iTBPublicMenu == null) {
            return bundle2;
        }
        Bundle pageUserInfo = iTBPublicMenu.pageUserInfo();
        if (pageUserInfo == null && (bundle = this.defaultPageInfoBundle) != null) {
            pageUserInfo = bundle;
        }
        Bundle bundle3 = new Bundle();
        bundle3.putBundle("H5Data", pageUserInfo);
        return bundle3;
    }

    private ITBPublicMenu getPageInfoCallback(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITBPublicMenu) ipChange.ipc$dispatch("af5b1e47", new Object[]{this, activity});
        }
        ITBPublicMenu iTBPublicMenu = this.reportArgs;
        if (iTBPublicMenu != null) {
            return iTBPublicMenu;
        }
        ITBPublicMenu iTBPublicMenu2 = this.pageInfo;
        if (iTBPublicMenu2 != null) {
            return iTBPublicMenu2;
        }
        if (activity instanceof ITBPublicMenu) {
            return (ITBPublicMenu) activity;
        }
        return null;
    }

    public void clearReportArgs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1a2dbe5", new Object[]{this});
        } else {
            this.reportArgs = null;
        }
    }

    public String getExtraBundleKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cda1ad96", new Object[]{this});
        }
        return "H5Data";
    }

    public Bundle getPageInfoBundle(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("d845c552", new Object[]{this, activity});
        }
        return getExtraBundle(getPageInfoCallback(activity));
    }

    public void setDefaultPageInfoBundle(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3b32b0f", new Object[]{this, bundle});
        } else {
            this.defaultPageInfoBundle = bundle;
        }
    }

    public void setReportArgs(ITBPublicMenu iTBPublicMenu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e286a95c", new Object[]{this, iTBPublicMenu});
        } else {
            this.reportArgs = iTBPublicMenu;
        }
    }
}
