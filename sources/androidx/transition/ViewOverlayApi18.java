package androidx.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ViewOverlayApi18 implements ViewOverlayImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final ViewOverlay mViewOverlay;

    public ViewOverlayApi18(View view) {
        this.mViewOverlay = view.getOverlay();
    }

    @Override // androidx.transition.ViewOverlayImpl
    public void add(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4437b3cc", new Object[]{this, drawable});
        } else {
            this.mViewOverlay.add(drawable);
        }
    }

    @Override // androidx.transition.ViewOverlayImpl
    public void remove(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76dc54af", new Object[]{this, drawable});
        } else {
            this.mViewOverlay.remove(drawable);
        }
    }
}
