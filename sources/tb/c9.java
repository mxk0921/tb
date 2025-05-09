package tb;

import android.animation.ObjectAnimator;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class c9 extends cs<ObjectAnimator, ObjectAnimator> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(336592979);
    }

    public static /* synthetic */ Object ipc$super(c9 c9Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilitykit/ability/pop/animation/impl/AKPopBottomInOutAnimation");
    }

    @Override // tb.fab
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e7424843", new Object[]{this});
        }
        return "translationY";
    }

    /* renamed from: q */
    public ObjectAnimator h(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ObjectAnimator) ipChange.ipc$dispatch("85a169f1", new Object[]{this, view});
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        float translationY = view.getTranslationY() + view.getHeight();
        float translationY2 = view.getTranslationY();
        this.c = new float[]{ywo.d(view.getContext(), iArr[1] + translationY), ywo.d(view.getContext(), iArr[1] + translationY2)};
        return ObjectAnimator.ofFloat(view, "translationY", translationY, translationY2);
    }

    /* renamed from: r */
    public ObjectAnimator i(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ObjectAnimator) ipChange.ipc$dispatch("a3862b62", new Object[]{this, view});
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        float translationY = view.getTranslationY();
        float translationY2 = view.getTranslationY() + view.getHeight();
        this.d = new float[]{ywo.d(view.getContext(), iArr[1] + translationY), ywo.d(view.getContext(), iArr[1] + translationY2)};
        return ObjectAnimator.ofFloat(view, "translationY", translationY, translationY2);
    }
}
