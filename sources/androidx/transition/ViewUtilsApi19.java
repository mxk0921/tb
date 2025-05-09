package androidx.transition;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ViewUtilsApi19 extends ViewUtilsBase {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static boolean sTryHiddenTransitionAlpha = true;

    public static /* synthetic */ Object ipc$super(ViewUtilsApi19 viewUtilsApi19, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/transition/ViewUtilsApi19");
    }

    @Override // androidx.transition.ViewUtilsBase
    public void clearNonTransitionAlpha(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1977f22", new Object[]{this, view});
        }
    }

    @Override // androidx.transition.ViewUtilsBase
    public float getTransitionAlpha(View view) {
        float transitionAlpha;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c6e610a8", new Object[]{this, view})).floatValue();
        }
        if (sTryHiddenTransitionAlpha) {
            try {
                transitionAlpha = view.getTransitionAlpha();
                return transitionAlpha;
            } catch (NoSuchMethodError unused) {
                sTryHiddenTransitionAlpha = false;
            }
        }
        return view.getAlpha();
    }

    @Override // androidx.transition.ViewUtilsBase
    public void saveNonTransitionAlpha(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a549c9f2", new Object[]{this, view});
        }
    }

    @Override // androidx.transition.ViewUtilsBase
    public void setTransitionAlpha(View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e9aeb7c", new Object[]{this, view, new Float(f)});
            return;
        }
        if (sTryHiddenTransitionAlpha) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                sTryHiddenTransitionAlpha = false;
            }
        }
        view.setAlpha(f);
    }
}
