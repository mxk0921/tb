package androidx.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ViewGroupOverlayApi18 implements ViewGroupOverlayImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final ViewGroupOverlay mViewGroupOverlay;

    public ViewGroupOverlayApi18(ViewGroup viewGroup) {
        this.mViewGroupOverlay = viewGroup.getOverlay();
    }

    @Override // androidx.transition.ViewOverlayImpl
    public void add(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4437b3cc", new Object[]{this, drawable});
        } else {
            this.mViewGroupOverlay.add(drawable);
        }
    }

    @Override // androidx.transition.ViewOverlayImpl
    public void remove(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76dc54af", new Object[]{this, drawable});
        } else {
            this.mViewGroupOverlay.remove(drawable);
        }
    }

    @Override // androidx.transition.ViewGroupOverlayImpl
    public void add(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df3d232a", new Object[]{this, view});
        } else {
            this.mViewGroupOverlay.add(view);
        }
    }

    @Override // androidx.transition.ViewGroupOverlayImpl
    public void remove(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("101673e7", new Object[]{this, view});
        } else {
            this.mViewGroupOverlay.remove(view);
        }
    }
}
