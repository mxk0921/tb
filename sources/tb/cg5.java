package tb;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view.HMultiSelectView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class cg5 implements ValueAnimator.AnimatorUpdateListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DXRootView f17044a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ eg5 d;

    public cg5(eg5 eg5Var, DXRootView dXRootView, int i, String str) {
        this.d = eg5Var;
        this.f17044a = dXRootView;
        this.b = i;
        this.c = str;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
            return;
        }
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ViewGroup.LayoutParams layoutParams = this.f17044a.getLayoutParams();
        layoutParams.height = intValue;
        this.f17044a.setLayoutParams(layoutParams);
        if (intValue == this.b && TextUtils.equals("true", this.c)) {
            ja6.b(HMultiSelectView.FEEDBACK_ROOT_USER_ID, this.f17044a);
        }
    }
}
