package com.taobao.android.fluid.business.videocollection.dramacollection.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.motion.widget.Key;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class LoadingView extends AppCompatImageView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ObjectAnimator mLoadingAnimator;

    static {
        t2o.a(468713714);
    }

    public LoadingView(Context context) {
        super(context);
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            setImageDrawable(getResources().getDrawable(R.drawable.fluid_sdk_collection_loading));
        }
    }

    public static /* synthetic */ Object ipc$super(LoadingView loadingView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/fluid/business/videocollection/dramacollection/view/LoadingView");
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        ObjectAnimator objectAnimator = this.mLoadingAnimator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        if (this.mLoadingAnimator == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, Key.ROTATION, 0.0f, 360.0f);
            this.mLoadingAnimator = ofFloat;
            ofFloat.setDuration(1000L);
            this.mLoadingAnimator.setRepeatCount(-1);
            this.mLoadingAnimator.setRepeatMode(1);
        }
        this.mLoadingAnimator.start();
    }

    public LoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public LoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
