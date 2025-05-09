package com.alipay.android.msp.ui.widget;

import android.app.Activity;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.constants.LoginConstants;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.unify.Toast.TBToast;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class CustomToast {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Toast f3735a;

    public static void cancelToast() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f2249d4", new Object[0]);
            return;
        }
        Toast toast = f3735a;
        if (toast != null) {
            toast.cancel();
        }
    }

    public static void showTextToastCenter(Activity activity, String str) {
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79a6ec55", new Object[]{activity, str});
            return;
        }
        if (!TextUtils.isEmpty(str) && str.length() < 10) {
            i = 0;
        }
        Toast makeText = Toast.makeText(activity.getApplicationContext(), str, i);
        makeText.setGravity(17, 0, 0);
        makeText.show();
    }

    public static void showToast(Activity activity, int i, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdae41a", new Object[]{activity, new Integer(i), str, new Long(j)});
        } else if (activity != null) {
            showToast(activity, i, str, 17, 0, -50, j);
        }
    }

    public static void showToast(Activity activity, int i, String str, int i2, int i3, int i4, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("959fb76b", new Object[]{activity, new Integer(i), str, new Integer(i2), new Integer(i3), new Integer(i4), new Long(j)});
            return;
        }
        LogUtil.d("CustomToast", LoginConstants.SHOW_TOAST, str);
        View inflate = LayoutInflater.from(activity.getApplicationContext()).inflate(R.layout.mini_ui_custom_toast, (ViewGroup) null);
        ((ImageView) inflate.findViewById(R.id.iv_mini_toast)).setImageResource(i);
        ((TextView) inflate.findViewById(R.id.tv_mini_toast)).setText(str);
        final Toast toast = new Toast(activity.getApplicationContext());
        f3735a = toast;
        toast.setGravity(i2, i3, i4);
        toast.setDuration(1);
        if (j < TBToast.Duration.LONG) {
            new CountDownTimer(j, j) { // from class: com.alipay.android.msp.ui.widget.CustomToast.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str2, Object... objArr) {
                    str2.hashCode();
                    int hashCode = str2.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/alipay/android/msp/ui/widget/CustomToast$1");
                }

                @Override // android.os.CountDownTimer
                public void onFinish() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("badeed9", new Object[]{this});
                    } else {
                        toast.cancel();
                    }
                }

                @Override // android.os.CountDownTimer
                public void onTick(long j2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f6c2e881", new Object[]{this, new Long(j2)});
                    }
                }
            }.start();
        }
        toast.setView(inflate);
        toast.show();
    }
}
