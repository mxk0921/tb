package com.taobao.login4android;

import com.ali.user.mobile.common.api.LoginApprearanceExtensions;
import com.taobao.login4android.membercenter.account.MultiLogoutListFragment;
import com.taobao.login4android.ui.TaobaoQrScanFragment;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class TaoBaoLoginAppearanceExtensions extends LoginApprearanceExtensions {
    static {
        t2o.a(517996551);
    }

    public TaoBaoLoginAppearanceExtensions() {
        setUccHelper(UccH5Impl.class);
        setFullyCustomizedScanFragment(TaobaoQrScanFragment.class);
        setFullyCustomizeGuideFragment(MultiLogoutListFragment.class);
        setNavHelper(NavHelper.class);
        setABHelper(ABHelper.class);
        setDialogHelper(TaoBaoDialogHelper.class);
    }
}
