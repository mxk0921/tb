package androidx.transition;

import android.os.Build;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ViewUtilsApi23 extends ViewUtilsApi22 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static boolean sTryHiddenSetTransitionVisibility = true;

    public static /* synthetic */ Object ipc$super(ViewUtilsApi23 viewUtilsApi23, String str, Object... objArr) {
        if (str.hashCode() == 457504321) {
            super.setTransitionVisibility((View) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/transition/ViewUtilsApi23");
    }

    @Override // androidx.transition.ViewUtilsBase
    public void setTransitionVisibility(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b44f641", new Object[]{this, view, new Integer(i)});
        } else if (Build.VERSION.SDK_INT == 28) {
            super.setTransitionVisibility(view, i);
        } else if (sTryHiddenSetTransitionVisibility) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                sTryHiddenSetTransitionVisibility = false;
            }
        }
    }
}
