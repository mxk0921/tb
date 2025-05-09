package com.alilive.adapter.uikit;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.bec;
import tb.dlg;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AliUrlImageView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public a mAliUrlImageView;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface a {
        void asyncSetImageUrl(String str);

        Drawable getDrawable();

        String getLoadingUrl();

        void initAttr(Context context, AttributeSet attributeSet);

        void pause();

        void resume();

        void setAutoRelease(boolean z);

        void setBlur(Context context, int i, int i2);

        void setCircleView();

        void setCropCircleView(float f, int i);

        void setImageDrawable(Drawable drawable);

        void setImageUrl(String str);

        void setLoadListener(bec becVar);

        void setMaxLoopCount(int i);

        void setPlaceHolder(int i);

        void setPriorityModuleName(String str);

        void setRoundeCornerView(int i, int i2, int i3, int i4, int i5);

        void setScaleType(ImageView.ScaleType scaleType);

        void setSkipAutoSize(boolean z);

        void setStrategyConfig(Object obj);

        void setVisibility(int i);
    }

    static {
        t2o.a(806354970);
    }

    public AliUrlImageView(Context context) {
        this(context, null);
    }

    public static /* synthetic */ Object ipc$super(AliUrlImageView aliUrlImageView, String str, Object... objArr) {
        if (str.hashCode() == -1705336120) {
            super.setVisibility(((Number) objArr[0]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alilive/adapter/uikit/AliUrlImageView");
    }

    public void asyncSetImageUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ec7c38b", new Object[]{this, str});
            return;
        }
        a aVar = this.mAliUrlImageView;
        if (aVar != null) {
            aVar.asyncSetImageUrl(str);
        }
    }

    public Drawable getDrawable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("bbe7333f", new Object[]{this});
        }
        a aVar = this.mAliUrlImageView;
        if (aVar != null) {
            return aVar.getDrawable();
        }
        return null;
    }

    public String getLoadingUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d8098410", new Object[]{this});
        }
        a aVar = this.mAliUrlImageView;
        if (aVar != null) {
            return aVar.getLoadingUrl();
        }
        return null;
    }

    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        a aVar = this.mAliUrlImageView;
        if (aVar != null) {
            aVar.pause();
        }
    }

    public void resume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            return;
        }
        a aVar = this.mAliUrlImageView;
        if (aVar != null) {
            aVar.resume();
        }
    }

    public void setAutoRelease(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a81a357", new Object[]{this, new Boolean(z)});
            return;
        }
        a aVar = this.mAliUrlImageView;
        if (aVar != null) {
            aVar.setAutoRelease(z);
        }
    }

    public void setBlur(Context context, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e71dc38", new Object[]{this, context, new Integer(i), new Integer(i2)});
            return;
        }
        a aVar = this.mAliUrlImageView;
        if (aVar != null) {
            aVar.setBlur(context, i, i2);
        }
    }

    public void setCircleView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bda86a9e", new Object[]{this});
            return;
        }
        a aVar = this.mAliUrlImageView;
        if (aVar != null) {
            aVar.setCircleView();
        }
    }

    public void setCropCircleView(float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e5b0c11", new Object[]{this, new Float(f), new Integer(i)});
            return;
        }
        a aVar = this.mAliUrlImageView;
        if (aVar != null) {
            aVar.setCropCircleView(f, i);
        }
    }

    public void setImageDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb707302", new Object[]{this, drawable});
            return;
        }
        a aVar = this.mAliUrlImageView;
        if (aVar != null) {
            aVar.setImageDrawable(drawable);
        }
    }

    public AliUrlImageView setImageLoadListener(bec becVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliUrlImageView) ipChange.ipc$dispatch("91fffd3f", new Object[]{this, becVar});
        }
        a aVar = this.mAliUrlImageView;
        if (aVar != null) {
            aVar.setLoadListener(becVar);
        }
        return this;
    }

    public void setImageUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cec106a7", new Object[]{this, str});
            return;
        }
        a aVar = this.mAliUrlImageView;
        if (aVar != null) {
            aVar.setImageUrl(str);
        }
    }

    public void setMaxLoopCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4742ebb3", new Object[]{this, new Integer(i)});
            return;
        }
        a aVar = this.mAliUrlImageView;
        if (aVar != null) {
            aVar.setMaxLoopCount(i);
        }
    }

    public void setPlaceHolder(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ffa0e2b", new Object[]{this, new Integer(i)});
            return;
        }
        a aVar = this.mAliUrlImageView;
        if (aVar != null) {
            aVar.setPlaceHolder(i);
        }
    }

    public void setPriorityModuleName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5def42ae", new Object[]{this, str});
            return;
        }
        a aVar = this.mAliUrlImageView;
        if (aVar != null) {
            aVar.setPriorityModuleName(str);
        }
    }

    public void setRoundeCornerView(int i, int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bd52869", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
            return;
        }
        a aVar = this.mAliUrlImageView;
        if (aVar != null) {
            aVar.setRoundeCornerView(i, i2, i3, i4, i5);
        }
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("732a5c3", new Object[]{this, scaleType});
            return;
        }
        a aVar = this.mAliUrlImageView;
        if (aVar != null) {
            aVar.setScaleType(scaleType);
        }
    }

    public void setSkipAutoSize(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("683ef35c", new Object[]{this, new Boolean(z)});
            return;
        }
        a aVar = this.mAliUrlImageView;
        if (aVar != null) {
            aVar.setSkipAutoSize(z);
        }
    }

    public void setStrategyConfig(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a40a4afa", new Object[]{this, obj});
            return;
        }
        a aVar = this.mAliUrlImageView;
        if (aVar != null) {
            aVar.setStrategyConfig(obj);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a5aa2c8", new Object[]{this, new Integer(i)});
            return;
        }
        super.setVisibility(i);
        a aVar = this.mAliUrlImageView;
        if (aVar != null) {
            aVar.setVisibility(i);
        }
    }

    public AliUrlImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AliUrlImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b b = dlg.b();
        if (b != null) {
            this.mAliUrlImageView = b.a(context, attributeSet, i);
        }
        this.mAliUrlImageView.initAttr(context, attributeSet);
        addView((View) this.mAliUrlImageView, new FrameLayout.LayoutParams(-1, -1));
    }
}
