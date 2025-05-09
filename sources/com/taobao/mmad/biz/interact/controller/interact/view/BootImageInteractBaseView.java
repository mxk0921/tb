package com.taobao.mmad.biz.interact.controller.interact.view;

import android.content.Context;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.data.BootImageInfo;
import tb.t2o;
import tb.tm1;
import tb.yh2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class BootImageInteractBaseView extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BOOTIAMGE_INTERACT_COUPON_RECEIVED_IMAGE = "https://gw.alicdn.com/imgextra/i2/O1CN0197arjn292Axjvmcqf_!!6000000008009-2-tps-180-180.png";
    public static final String BOOTIMAGE_INTERACT_COUPON_DEFAULT_IMAGE = "https://gw.alicdn.com/imgextra/i3/O1CN01dpoH4e1itJHwnu6Bk_!!6000000004470-2-tps-180-180.png";
    public static final String BOOTIMAGE_INTERACT_ITEM_DEFAULT_IMAGE = "https://gw.alicdn.com/imgextra/i3/O1CN016e9lgF20HRco2zQib_!!6000000006824-2-tps-180-180.png";
    private static final String TAG = "BootImageInteractBaseView";
    public static final int TYPE_CLICK = 7;
    public static final String TYPE_CUSTOM_INTERACT = "1";
    public static final String TYPE_DEFAULT_INTERACT = "0";
    public static final int TYPE_INTERACT_FAIL = 10;
    public static final int TYPE_INTERACT_SUCCESS = 9;
    public static final int TYPE_POP_INTERACT_FAIL = 15;
    public static final int TYPE_POP_INTERACT_SUCCESS = 14;
    public static final int TYPE_SLIDE_FAIL = 11;
    public static final int TYPE_SLIDE_SUCCESS = 8;
    private yh2 mBootImageContentListener;
    public BootImageInfo mBootImageInfo;
    public Context mContext;
    public boolean mShowed;
    public String showInteractGuideImage = "";
    public String showInteractCardImage = "";

    static {
        t2o.a(573571108);
    }

    public BootImageInteractBaseView(Context context, BootImageInfo bootImageInfo) {
        super(context);
        this.mContext = context;
        this.mBootImageInfo = bootImageInfo;
        setVisibility(8);
    }

    public static /* synthetic */ Object ipc$super(BootImageInteractBaseView bootImageInteractBaseView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mmad/biz/interact/controller/interact/view/BootImageInteractBaseView");
    }

    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
            return;
        }
        tm1.a(TAG, "close");
        this.mShowed = false;
    }

    public yh2 getBootImageContentListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yh2) ipChange.ipc$dispatch("d711ff9b", new Object[]{this});
        }
        return this.mBootImageContentListener;
    }

    public String getShowInteractCardImage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f1f40d7", new Object[]{this});
        }
        return this.showInteractCardImage;
    }

    public String getShowInteractGuideImage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aaf91491", new Object[]{this});
        }
        return this.showInteractGuideImage;
    }

    public void setBootImageContentListener(yh2 yh2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff10aab3", new Object[]{this, yh2Var});
        } else {
            this.mBootImageContentListener = yh2Var;
        }
    }

    public void setShowInteractCardImage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b2407e7", new Object[]{this, str});
        } else {
            this.showInteractCardImage = str;
        }
    }

    public void setShowInteractGuideImage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daa3d305", new Object[]{this, str});
        } else {
            this.showInteractGuideImage = str;
        }
    }

    public boolean showWithAnim(Animation.AnimationListener animationListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8767dccb", new Object[]{this, animationListener})).booleanValue();
        }
        return show();
    }

    public void startInteract() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fcba53f", new Object[]{this});
        } else {
            tm1.a(TAG, "startInteract");
        }
    }

    public void stopInteract() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad8e78df", new Object[]{this});
        } else {
            tm1.a(TAG, "stopInteract");
        }
    }

    public void switchToReceived() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c9f057", new Object[]{this});
        }
    }

    public boolean show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebbb9908", new Object[]{this})).booleanValue();
        }
        if (this.mBootImageInfo == null) {
            tm1.a(TAG, "show fail: bootImageInfo_null");
            this.mShowed = false;
            return false;
        }
        if (this.mShowed) {
            tm1.a(TAG, "already show");
            close();
        }
        tm1.a(TAG, "show success");
        this.mShowed = true;
        return true;
    }
}
