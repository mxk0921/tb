package com.taobao.android.detail.ttdetail.widget.desc.image;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.egr;
import tb.hme;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class DetailImageView extends ImageView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private hme option;
    private String url;

    static {
        t2o.a(912262967);
    }

    public DetailImageView(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(DetailImageView detailImageView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1142475969) {
            return super.getDrawable();
        }
        if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/detail/ttdetail/widget/desc/image/DetailImageView");
        }
    }

    private void recoverImage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fff3cb5e", new Object[]{this});
            return;
        }
        Drawable drawable = getDrawable();
        if (!TextUtils.isEmpty(this.url) && this.option != null) {
            if (drawable != null) {
                if (drawable instanceof BitmapDrawable) {
                    BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                    if (bitmapDrawable.getBitmap() == null || !bitmapDrawable.getBitmap().isRecycled()) {
                        return;
                    }
                } else {
                    return;
                }
            }
            egr d = egr.d();
            if (d != null) {
                d.a(this.url, this, this.option, null);
            }
        }
    }

    private void releaseImage() {
        Drawable drawable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bad6181b", new Object[]{this});
        } else if (!TextUtils.isEmpty(this.url) && this.option != null && (drawable = super.getDrawable()) != null) {
            if ((drawable instanceof BitmapDrawable) && ((BitmapDrawable) drawable).getBitmap() != null) {
                setImageDrawable(null);
            }
            setImageDrawable(null);
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
        recoverImage();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        releaseImage();
    }

    public void setImageDrawable(String str, BitmapDrawable bitmapDrawable, hme hmeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d84694c9", new Object[]{this, str, bitmapDrawable, hmeVar});
        } else if (bitmapDrawable != null && bitmapDrawable.getBitmap() != null && !bitmapDrawable.getBitmap().isRecycled()) {
            setImageDrawable(bitmapDrawable);
            if (!(hmeVar == null || hmeVar.f() == null)) {
                setScaleType(hmeVar.f());
            }
            this.url = str;
            this.option = hmeVar;
        } else if (hmeVar != null && hmeVar.e() != null) {
            setScaleType(hmeVar.e());
        }
    }

    public DetailImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DetailImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
