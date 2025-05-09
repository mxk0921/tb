package com.taobao.message.notification.banner.view;

import android.content.Context;
import android.os.Build;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.notification.banner.view.BaseBannerContainer;
import com.taobao.message.notification.util.BrandUtil;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import tb.pg1;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ApplicationBannerContainer extends BaseBannerContainer {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BANNER_HEIGHT = 136;
    private static final String TAG = "ApplicationBannerContainer";
    private boolean mIsShow = false;
    private FrameLayout mParentLayout = new FrameLayout(this.mContext);
    private WindowManager mWindowManager = (WindowManager) this.mContext.getSystemService(pg1.ATOM_EXT_window);
    private WindowManager.LayoutParams mWindowManagerParams;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class Messages_App {
        private static final int DISPLAY_BANNER = 3363668;

        static {
            t2o.a(610271271);
        }
    }

    static {
        t2o.a(610271269);
    }

    public ApplicationBannerContainer(Context context) {
        super(context);
    }

    public static /* synthetic */ FrameLayout access$000(ApplicationBannerContainer applicationBannerContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("25c779e8", new Object[]{applicationBannerContainer});
        }
        return applicationBannerContainer.mParentLayout;
    }

    public static /* synthetic */ WindowManager access$100(ApplicationBannerContainer applicationBannerContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindowManager) ipChange.ipc$dispatch("9328f3e0", new Object[]{applicationBannerContainer});
        }
        return applicationBannerContainer.mWindowManager;
    }

    public static /* synthetic */ boolean access$202(ApplicationBannerContainer applicationBannerContainer, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("770147a3", new Object[]{applicationBannerContainer, new Boolean(z)})).booleanValue();
        }
        applicationBannerContainer.mIsShow = z;
        return z;
    }

    private void displayBanner() {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58b7f815", new Object[]{this});
            return;
        }
        TLog.logd(TAG, "displayBanner isShow=" + isShowing());
        if (!isShowing()) {
            if (!(this.mWindowManager == null || (view = this.mBannerView) == null)) {
                this.mParentLayout.addView(view);
                try {
                    this.mWindowManager.addView(this.mParentLayout, this.mWindowManagerParams);
                    this.mIsShow = true;
                    Animation loadAnimation = AnimationUtils.loadAnimation(this.mContext, R.anim.banner_slide_in_top);
                    loadAnimation.setDuration(300L);
                    this.mBannerView.startAnimation(loadAnimation);
                } catch (Exception e) {
                    TLog.loge(TAG, Log.getStackTraceString(e));
                }
            }
            this.mHandler.sendEmptyMessageDelayed(BaseBannerContainer.Messages.REMOVE_BANNER_ACTIVIE, BaseBannerContainer.mDuration);
        }
    }

    public static /* synthetic */ Object ipc$super(ApplicationBannerContainer applicationBannerContainer, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/notification/banner/view/ApplicationBannerContainer");
    }

    @Override // com.taobao.message.notification.banner.view.BaseBannerContainer
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        if (3363668 != message.what) {
            return false;
        }
        displayBanner();
        return true;
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

    @Override // com.taobao.message.notification.banner.view.INotificationBanner
    public boolean isShowing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3c33646", new Object[]{this})).booleanValue();
        }
        return this.mIsShow;
    }

    @Override // com.taobao.message.notification.banner.view.INotificationBanner
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        if (isShowing()) {
            dismiss();
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.mWindowManagerParams = layoutParams;
        layoutParams.height = -2;
        layoutParams.width = -1;
        layoutParams.format = -3;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            layoutParams.type = 2038;
        } else if (i > 24) {
            layoutParams.type = 2002;
        } else if (BrandUtil.isXiaoMi()) {
            this.mWindowManagerParams.type = 2002;
        } else {
            this.mWindowManagerParams.type = 2005;
        }
        WindowManager.LayoutParams layoutParams2 = this.mWindowManagerParams;
        layoutParams2.gravity = 48;
        layoutParams2.x = 0;
        layoutParams2.y = 0;
        layoutParams2.flags = 8;
        this.mHandler.sendEmptyMessage(3363668);
    }

    @Override // com.taobao.message.notification.banner.view.BaseBannerContainer
    public void removeBanner() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("228d57", new Object[]{this});
            return;
        }
        TLog.logd(TAG, "removeBanner, mDuration=" + BaseBannerContainer.mDuration);
        if (this.mWindowManager != null && this.mBannerView != null && isShowing()) {
            try {
                Animation loadAnimation = AnimationUtils.loadAnimation(this.mContext, R.anim.banner_slide_out_top);
                loadAnimation.setDuration(300L);
                this.mBannerView.startAnimation(loadAnimation);
                loadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.taobao.message.notification.banner.view.ApplicationBannerContainer.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                            return;
                        }
                        try {
                            ApplicationBannerContainer.access$100(ApplicationBannerContainer.this).removeView(ApplicationBannerContainer.access$000(ApplicationBannerContainer.this));
                            ApplicationBannerContainer.access$202(ApplicationBannerContainer.this, false);
                        } catch (IllegalArgumentException e) {
                            e.printStackTrace();
                        }
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                        }
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                        }
                    }
                });
            } catch (Exception e) {
                TLog.loge(TAG, Log.getStackTraceString(e));
                try {
                    this.mWindowManager.removeView(this.mParentLayout);
                    this.mIsShow = false;
                } catch (IllegalArgumentException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }
}
