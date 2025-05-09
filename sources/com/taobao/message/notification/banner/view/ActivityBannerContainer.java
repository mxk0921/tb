package com.taobao.message.notification.banner.view;

import android.app.Activity;
import android.os.Message;
import android.view.View;
import android.widget.PopupWindow;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.notification.banner.view.BaseBannerContainer;
import com.taobao.message.notification.util.EnvUtil;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ActivityBannerContainer extends BaseBannerContainer {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BANNER_HEIGHT = 136;
    public static final String NOTIFYDISMISS = "notifydismiss";
    private static final String TAG = "ActivityBannerContainer";
    private WeakReference<Activity> mActivityRef;
    private PopupWindow mPopupWindow = null;

    static {
        t2o.a(610271267);
    }

    public ActivityBannerContainer(Activity activity) {
        super(activity);
        this.mActivityRef = new WeakReference<>(activity);
    }

    public static /* synthetic */ PopupWindow access$000(ActivityBannerContainer activityBannerContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopupWindow) ipChange.ipc$dispatch("f23a4300", new Object[]{activityBannerContainer});
        }
        return activityBannerContainer.mPopupWindow;
    }

    public static /* synthetic */ Object ipc$super(ActivityBannerContainer activityBannerContainer, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/notification/banner/view/ActivityBannerContainer");
    }

    @Override // com.taobao.message.notification.banner.view.BaseBannerContainer
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.message.notification.banner.view.BaseBannerContainer, com.taobao.message.notification.banner.view.INotificationBanner
    public void initBanner(View view, View.OnClickListener onClickListener, PopupWindow.OnDismissListener onDismissListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16b46cd", new Object[]{this, view, onClickListener, onDismissListener});
        } else {
            init(view, onClickListener, onDismissListener);
        }
    }

    @Override // com.taobao.message.notification.banner.view.BaseBannerContainer
    public void removeBanner() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("228d57", new Object[]{this});
            return;
        }
        TLog.loge(NOTIFYDISMISS, "removeBanner called");
        if (isShowing()) {
            try {
                this.mPopupWindow.dismiss();
                TLog.loge(NOTIFYDISMISS, "dismiss called");
            } catch (IllegalArgumentException unused) {
                TLog.loge(NOTIFYDISMISS, "dismiss exception");
            }
        }
    }

    @Override // com.taobao.message.notification.banner.view.INotificationBanner
    public boolean isShowing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3c33646", new Object[]{this})).booleanValue();
        }
        if (this.mPopupWindow == null) {
            TLog.loge(NOTIFYDISMISS, "isShowing return false >> null == mPopupWindow ");
        }
        PopupWindow popupWindow = this.mPopupWindow;
        if (popupWindow != null && !popupWindow.isShowing()) {
            TLog.loge(NOTIFYDISMISS, "isShowing return false >> !mPopupWindow.isShowing() ");
        }
        PopupWindow popupWindow2 = this.mPopupWindow;
        return popupWindow2 != null && popupWindow2.isShowing();
    }

    @Override // com.taobao.message.notification.banner.view.INotificationBanner
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        WeakReference<Activity> weakReference = this.mActivityRef;
        if ((weakReference != null ? weakReference.get() : null) == null) {
            TLog.loge(TAG, "show: activity is null, discard!");
            return;
        }
        if (isShowing()) {
            this.mPopupWindow.dismiss();
        }
        PopupWindow popupWindow = new PopupWindow(this.mBannerView, -1, -2, false);
        this.mPopupWindow = popupWindow;
        popupWindow.setTouchable(true);
        this.mPopupWindow.setOutsideTouchable(true);
        this.mPopupWindow.setAnimationStyle(R.style.contacts_anim_guidebanner);
        this.mPopupWindow.setSoftInputMode(16);
        this.mHandler.postDelayed(new Runnable() { // from class: com.taobao.message.notification.banner.view.ActivityBannerContainer.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                Activity topActivity = EnvUtil.getTopActivity();
                if (topActivity != null && !topActivity.isFinishing()) {
                    try {
                        ActivityBannerContainer.access$000(ActivityBannerContainer.this).showAtLocation(topActivity.getWindow().getDecorView(), 48, 0, 0);
                    } catch (Exception unused) {
                    }
                }
            }
        }, 100L);
        this.mHandler.sendEmptyMessageDelayed(BaseBannerContainer.Messages.REMOVE_BANNER_ACTIVIE, BaseBannerContainer.mDuration);
    }
}
