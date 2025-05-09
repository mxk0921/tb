package com.alipay.birdnest.api;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class FBOverView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final byte STATE_CLOSE = 0;
    public static final byte STATE_FINISH = 4;
    public static final byte STATE_LOAD = 3;
    public static final byte STATE_OPEN = 1;
    public static final byte STATE_OVER = 2;
    public byte mState = 0;

    public FBOverView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    public static /* synthetic */ Object ipc$super(FBOverView fBOverView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/birdnest/api/FBOverView");
    }

    public ImageView getLoadingLogo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("2eab8", new Object[]{this});
        }
        return null;
    }

    public View getLoadingShadowView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9473a054", new Object[]{this});
        }
        return null;
    }

    public ImageView getNormalLogo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("76f11ec1", new Object[]{this});
        }
        return null;
    }

    public View getNormalShadowView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("da5a472b", new Object[]{this});
        }
        return null;
    }

    public abstract int getOverViewHeight();

    public byte getState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("830709ce", new Object[]{this})).byteValue();
        }
        return this.mState;
    }

    public abstract void init();

    public abstract void onFinish();

    public abstract void onLoad();

    public abstract void onOpen();

    public abstract void onOver();

    public void onPullto(double d, byte b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce09aa04", new Object[]{this, new Double(d), new Byte(b)});
        }
    }

    public void setState(byte b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfed926", new Object[]{this, new Byte(b)});
        } else {
            this.mState = b;
        }
    }

    public FBOverView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public FBOverView(Context context) {
        super(context);
        init();
    }
}
