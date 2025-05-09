package com.taobao.uikit.extend.component.unify.Toast;

import android.app.Activity;
import android.graphics.Point;
import android.os.Build;
import android.view.WindowManager;
import android.widget.Toast;
import androidx.core.app.NotificationManagerCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.utils.DeviceUtils;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TBActivityToast extends TBToast {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private WindowManager.LayoutParams mWindowManagerParams;

    static {
        t2o.a(932184171);
    }

    public TBActivityToast(Activity activity) {
        super(activity);
    }

    public static /* synthetic */ Object ipc$super(TBActivityToast tBActivityToast, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/extend/component/unify/Toast/TBActivityToast");
    }

    public Activity getActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("81223f9c", new Object[]{this});
        }
        return (Activity) this.mContext;
    }

    @Override // com.taobao.uikit.extend.component.unify.Toast.TBToast
    public WindowManager getWindowManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindowManager) ipChange.ipc$dispatch("4c2eee04", new Object[]{this});
        }
        return getActivity().getWindowManager();
    }

    @Override // com.taobao.uikit.extend.component.unify.Toast.TBToast
    public WindowManager.LayoutParams getWindowManagerParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindowManager.LayoutParams) ipChange.ipc$dispatch("4843f764", new Object[]{this});
        }
        return this.mWindowManagerParams;
    }

    @Override // com.taobao.uikit.extend.component.unify.Toast.TBToast
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        try {
            if (!DeviceUtils.isHUWEIDevice() || Build.VERSION.SDK_INT >= 29 || NotificationManagerCompat.from(getActivity()).areNotificationsEnabled()) {
                Toast.makeText(this.mContext, getText(), 0).show();
            } else {
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                this.mWindowManagerParams = layoutParams;
                layoutParams.flags = 8;
                layoutParams.format = -3;
                layoutParams.height = -2;
                layoutParams.width = -2;
                layoutParams.windowAnimations = 16973828;
                layoutParams.gravity = 81;
                layoutParams.x = 0;
                Point point = new Point();
                getWindowManager().getDefaultDisplay().getSize(point);
                this.mWindowManagerParams.y = (int) (point.y * 0.1f);
                getTextView().setMaxLines(20);
                TBToastManager.getInstance().add(this);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
