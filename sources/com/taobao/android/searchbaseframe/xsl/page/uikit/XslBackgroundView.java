package com.taobao.android.searchbaseframe.xsl.page.uikit;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class XslBackgroundView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private float mAlpha = 1.0f;
    private boolean mBgAnim = true;
    private TUrlImageView mImageView;

    static {
        t2o.a(993002063);
        t2o.a(993002062);
    }

    public XslBackgroundView(Context context) {
        super(context);
        createImageView(context);
    }

    public static /* synthetic */ Object ipc$super(XslBackgroundView xslBackgroundView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/xsl/page/uikit/XslBackgroundView");
    }

    public void createImageView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2be51e9d", new Object[]{this, context});
            return;
        }
        TUrlImageView tUrlImageView = new TUrlImageView(context);
        this.mImageView = tUrlImageView;
        tUrlImageView.setScaleType(ImageView.ScaleType.FIT_START);
        addView(this.mImageView, -1, -1);
    }

    public void offsetTo(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5be36a8e", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        if (i2 <= i3) {
            this.mAlpha = 1.0f;
        } else {
            this.mAlpha = (i - i3) / (i2 - i3);
        }
        if (this.mBgAnim) {
            this.mImageView.setAlpha(this.mAlpha);
        }
    }

    public void setBgAnimation(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3823ae50", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mBgAnim = z;
        if (z) {
            this.mImageView.setAlpha(this.mAlpha);
        } else {
            this.mImageView.setAlpha(1.0f);
        }
    }

    public void setImageUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cec106a7", new Object[]{this, str});
        } else {
            this.mImageView.setImageUrl(str);
        }
    }

    public void setResource(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f2a5121", new Object[]{this, str});
        } else {
            this.mImageView.setImageResource(Integer.parseInt(str));
        }
    }
}
