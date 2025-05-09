package com.ali.user.mobile.base.ui;

import android.app.Activity;
import androidx.fragment.app.DialogFragment;
import com.ali.user.mobile.utils.LanguageUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.utils.LoginSwitch;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class BaseDialogFragment extends DialogFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(69206087);
    }

    public static /* synthetic */ Object ipc$super(BaseDialogFragment baseDialogFragment, String str, Object... objArr) {
        if (str.hashCode() == 1330549917) {
            super.onAttach((Activity) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/base/ui/BaseDialogFragment");
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f4e949d", new Object[]{this, activity});
            return;
        }
        super.onAttach(activity);
        if (LoginSwitch.getSwitch("dialog_update_language_config", "true")) {
            LanguageUtil.onLanguageSwitchNotify(activity);
        }
    }
}
