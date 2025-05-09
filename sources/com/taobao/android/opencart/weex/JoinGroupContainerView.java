package com.taobao.android.opencart.weex;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import kotlin.Metadata;
import tb.a3l;
import tb.ckf;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/taobao/android/opencart/weex/JoinGroupContainerView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/view/MotionEvent;", "ev", "", "getTextureViewBitmapAlphaByXY", "(Landroid/view/MotionEvent;)I", "Lcom/taobao/android/opencart/weex/JoinGroupContainerView$a;", "alphaTouchEventListener", "Ltb/xhv;", "setAlphaTouchEventListener", "(Lcom/taobao/android/opencart/weex/JoinGroupContainerView$a;)V", "", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "onDetachedFromWindow", "()V", "mAlphaTouchEventListener", "Lcom/taobao/android/opencart/weex/JoinGroupContainerView$a;", "Landroid/view/TextureView;", "mTextureView", "Landroid/view/TextureView;", "", "mSnapshotScale", TLogTracker.LEVEL_DEBUG, "a", "OpenCart_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class JoinGroupContainerView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a mAlphaTouchEventListener;
    private double mSnapshotScale = 0.25d;
    private TextureView mTextureView;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface a {
        void a();

        View b();

        void onDetachedFromWindow();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JoinGroupContainerView(Context context) {
        super(context);
        ckf.g(context, "context");
    }

    private final int getTextureViewBitmapAlphaByXY(MotionEvent motionEvent) {
        Bitmap bitmap;
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ac48342c", new Object[]{this, motionEvent})).intValue();
        }
        try {
            if (this.mTextureView == null) {
                a aVar = this.mAlphaTouchEventListener;
                View view2 = null;
                if (aVar != null) {
                    view = aVar.b();
                } else {
                    view = null;
                }
                if (view instanceof TextureView) {
                    view2 = view;
                }
                this.mTextureView = (TextureView) view2;
            }
            TextureView textureView = this.mTextureView;
            if (!(textureView == null || (bitmap = textureView.getBitmap((int) (getWidth() * this.mSnapshotScale), (int) (getHeight() * this.mSnapshotScale))) == null)) {
                int x = (int) (motionEvent.getX() * this.mSnapshotScale);
                int y = (int) (motionEvent.getY() * this.mSnapshotScale);
                if (!bitmap.isRecycled() && x >= 0 && y >= 0 && x < bitmap.getWidth() && y < bitmap.getHeight()) {
                    return Color.alpha(bitmap.getPixel(x, y));
                }
            }
            return 0;
        } catch (Exception e) {
            a3l.b("getTextureViewBitmapAlphaByXYError", String.valueOf(e.getMessage()));
            return 0;
        }
    }

    public static /* synthetic */ Object ipc$super(JoinGroupContainerView joinGroupContainerView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/opencart/weex/JoinGroupContainerView");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        if (motionEvent == null || motionEvent.getAction() != 0 || getTextureViewBitmapAlphaByXY(motionEvent) != 0) {
            return super.dispatchTouchEvent(motionEvent);
        }
        a aVar = this.mAlphaTouchEventListener;
        if (aVar != null) {
            aVar.a();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        a aVar = this.mAlphaTouchEventListener;
        if (aVar != null) {
            aVar.onDetachedFromWindow();
        }
    }

    public final void setAlphaTouchEventListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("411d8519", new Object[]{this, aVar});
            return;
        }
        ckf.g(aVar, "alphaTouchEventListener");
        this.mAlphaTouchEventListener = aVar;
    }
}
