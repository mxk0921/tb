package androidx.transition;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ViewGroupOverlayApi14 extends ViewOverlayApi14 implements ViewGroupOverlayImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public ViewGroupOverlayApi14(Context context, ViewGroup viewGroup, View view) {
        super(context, viewGroup, view);
    }

    public static ViewGroupOverlayApi14 createFrom(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroupOverlayApi14) ipChange.ipc$dispatch("b689664a", new Object[]{viewGroup});
        }
        return (ViewGroupOverlayApi14) ViewOverlayApi14.createFrom(viewGroup);
    }

    public static /* synthetic */ Object ipc$super(ViewGroupOverlayApi14 viewGroupOverlayApi14, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/transition/ViewGroupOverlayApi14");
    }

    @Override // androidx.transition.ViewGroupOverlayImpl
    public void add(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df3d232a", new Object[]{this, view});
        } else {
            this.mOverlayViewGroup.add(view);
        }
    }

    @Override // androidx.transition.ViewGroupOverlayImpl
    public void remove(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("101673e7", new Object[]{this, view});
        } else {
            this.mOverlayViewGroup.remove(view);
        }
    }
}
