package com.taobao.avplayer.player;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.TextureView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaSystemUtils;
import com.taobao.taobaoavsdk.AVSDKLog;
import tb.feh;
import tb.qbi;
import tb.t2o;
import tb.tfb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class DWTextureView extends TextureView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a mCallback;
    private feh mLogContext;
    private qbi mMeasureHelper;
    private String mPlayToken;
    private String mTag;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface a {
    }

    static {
        t2o.a(452985129);
    }

    public DWTextureView(Context context, qbi qbiVar, a aVar, String str) {
        super(context);
        this.mTag = "DWTextureView";
        this.mPlayToken = str;
        init(qbiVar, aVar);
    }

    public static /* synthetic */ Object ipc$super(DWTextureView dWTextureView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -461309207:
                super.onWindowVisibilityChanged(((Number) objArr[0]).intValue());
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            case 1889417753:
                super.setBackgroundDrawable((Drawable) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/player/DWTextureView");
        }
    }

    public void init(qbi qbiVar, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("658d7114", new Object[]{this, qbiVar, aVar});
            return;
        }
        this.mMeasureHelper = qbiVar;
        this.mCallback = aVar;
        this.mLogContext = new feh(toString(), this.mPlayToken);
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        a aVar = this.mCallback;
        if (aVar != null) {
            ((com.taobao.avplayer.player.a) aVar).onAttachedToWindow();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        a aVar = this.mCallback;
        if (aVar != null) {
            ((com.taobao.avplayer.player.a) aVar).onDetachedFromWindow();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, " onMeasure " + i + ", " + i2);
        qbi qbiVar = this.mMeasureHelper;
        if (qbiVar != null) {
            qbiVar.a(i, i2);
            feh fehVar2 = this.mLogContext;
            AVSDKLog.e(fehVar2, " onMeasure set " + this.mMeasureHelper.e() + ", " + this.mMeasureHelper.d());
            setMeasuredDimension(this.mMeasureHelper.e(), this.mMeasureHelper.d());
        }
        if (MediaSystemUtils.isApkDebuggable()) {
            AVSDKLog.d(tfb.MODULE_SDK_PAGE, "onMeasure >>> mMeasureHelper.getMeasuredWidth() : " + this.mMeasureHelper.e() + ", mMeasureHelper.getMeasuredHeight(): " + this.mMeasureHelper.d());
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e480fae9", new Object[]{this, new Integer(i)});
            return;
        }
        super.onWindowVisibilityChanged(i);
        a aVar = this.mCallback;
        if (aVar != null) {
            ((com.taobao.avplayer.player.a) aVar).onWindowVisibilityChanged(i);
        }
    }

    @Override // android.view.TextureView, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("709e3a19", new Object[]{this, drawable});
        } else if (Build.VERSION.SDK_INT < 24 && drawable != null) {
            super.setBackgroundDrawable(drawable);
        }
    }

    public DWTextureView(Context context, AttributeSet attributeSet, qbi qbiVar, a aVar) {
        super(context, attributeSet);
        this.mTag = "DWTextureView";
        this.mPlayToken = "";
        init(qbiVar, aVar);
    }

    public DWTextureView(Context context, AttributeSet attributeSet, int i, qbi qbiVar, a aVar) {
        super(context, attributeSet, i);
        this.mTag = "DWTextureView";
        this.mPlayToken = "";
        init(qbiVar, aVar);
    }
}
