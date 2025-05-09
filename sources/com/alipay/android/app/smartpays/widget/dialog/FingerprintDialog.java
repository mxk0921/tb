package com.alipay.android.app.smartpays.widget.dialog;

import android.app.Activity;
import android.content.Context;
import com.alipay.android.app.safepaylog.utils.LogUtils;
import com.alipay.android.app.smartpays.res.IResourceLoader;
import com.alipay.android.app.smartpays.widget.dialog.impl.FpDefaultDialog;
import com.alipay.android.app.smartpays.widget.dialog.impl.FpFullViewDialog;
import com.alipay.android.app.smartpays.widget.dialog.impl.VerifyEnum;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.alipay.security.mobile.api.AuthenticatorApi;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;
import org.json.JSONObject;

/* compiled from: Taobao */
@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FingerprintDialog {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ACTION_CANCEL = 0;
    public static final int ACTION_TO_PWD = 2;

    /* renamed from: a  reason: collision with root package name */
    public final IHardwarePayDialog f3503a;

    public FingerprintDialog(Context context, VerifyEnum verifyEnum) {
        if (a(context)) {
            this.f3503a = new FpFullViewDialog(verifyEnum);
        } else {
            this.f3503a = new FpDefaultDialog(verifyEnum);
        }
    }

    public void dismiss(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c566ed7", new Object[]{this, context});
        } else {
            this.f3503a.dismiss(context);
        }
    }

    public boolean isShown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d57d5b12", new Object[]{this})).booleanValue();
        }
        return this.f3503a.isShown();
    }

    public void setAllButtonsGone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede53c68", new Object[]{this});
        } else {
            this.f3503a.setAllButtonsGone();
        }
    }

    public void setResourceLoader(IResourceLoader iResourceLoader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a13b031e", new Object[]{this, iResourceLoader});
        } else {
            this.f3503a.setResourceLoader(iResourceLoader);
        }
    }

    public void showAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c6b160e", new Object[]{this});
        } else {
            this.f3503a.showAnimation();
        }
    }

    public void showDialog(Activity activity, String str, IDialogActionListener iDialogActionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d61f5d8", new Object[]{this, activity, str, iDialogActionListener});
        } else {
            this.f3503a.showDialog(activity, str, iDialogActionListener);
        }
    }

    public void updateMsg(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3228a9", new Object[]{this, str, new Integer(i), new Integer(i2)});
        } else {
            this.f3503a.updateMsg(str, i, i2);
        }
    }

    public void dismiss(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16f3d312", new Object[]{this, new Integer(i)});
        } else {
            this.f3503a.dismiss(i);
        }
    }

    public final boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89e7f79d", new Object[]{this, context})).booleanValue();
        }
        int i = -1;
        try {
            i = new JSONObject(AuthenticatorApi.getFingerprintExtInfo(context)).optInt("type", -1);
        } catch (Throwable th) {
            LogUtils.printExceptionStackTrace(th);
        }
        return i == 0;
    }
}
