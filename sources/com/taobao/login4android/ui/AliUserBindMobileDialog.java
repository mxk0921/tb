package com.taobao.login4android.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.ali.user.mobile.utils.ImageUtil;
import com.ali.user.mobile.utils.LanguageUtil;
import com.ali.user.mobile.utils.NetworkUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class AliUserBindMobileDialog extends TaobaoRegProtocolDialogFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(70254989);
    }

    public static /* synthetic */ Object ipc$super(AliUserBindMobileDialog aliUserBindMobileDialog, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/login4android/ui/AliUserBindMobileDialog");
    }

    @Override // com.taobao.login4android.ui.TaobaoRegProtocolDialogFragment
    public int getLayoutContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5894a33", new Object[]{this})).intValue();
        }
        if (LanguageUtil.isChineseLanguage()) {
            return R.layout.aliuser_bind_mobile_dialog_new;
        }
        return R.layout.aliuser_bind_mobile_dialog_oversea;
    }

    @Override // com.taobao.login4android.ui.TaobaoRegProtocolDialogFragment
    public void initViews(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99e0bed", new Object[]{this, view});
            return;
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.aliuser_dialog_logo);
        if (imageView == null) {
            return;
        }
        if (!NetworkUtil.isNetworkConnected()) {
            imageView.setVisibility(8);
        } else if (!TextUtils.isEmpty(this.mLogoUrl)) {
            ImageUtil.updateImage(imageView, this.mLogoUrl);
        } else {
            ImageUtil.updateImage(imageView, "https://gw.alicdn.com/imgextra/i4/O1CN012c7Vcs1Xr3OZMZ4la_!!6000000002976-2-tps-885-435.png");
        }
    }
}
