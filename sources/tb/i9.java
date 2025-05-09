package tb;

import android.animation.ObjectAnimator;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class i9 extends cs<ObjectAnimator, ObjectAnimator> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(336592982);
    }

    public static /* synthetic */ Object ipc$super(i9 i9Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilitykit/ability/pop/animation/impl/AKPopRightInOutAnimation");
    }

    @Override // tb.fab
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e7424843", new Object[]{this});
        }
        return "translationX";
    }

    /* renamed from: q */
    public ObjectAnimator h(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ObjectAnimator) ipChange.ipc$dispatch("85a169f1", new Object[]{this, view});
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        float translationX = view.getTranslationX() + view.getWidth();
        float translationX2 = view.getTranslationX();
        int i = iArr[0];
        this.c = new float[]{i + translationX, i + translationX2};
        return ObjectAnimator.ofFloat(view, "translationX", translationX, translationX2);
    }

    /* renamed from: r */
    public ObjectAnimator i(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ObjectAnimator) ipChange.ipc$dispatch("a3862b62", new Object[]{this, view});
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        float translationX = view.getTranslationX();
        float translationX2 = view.getTranslationX() + view.getWidth();
        int i = iArr[0];
        this.d = new float[]{i + translationX, i + translationX2};
        return ObjectAnimator.ofFloat(view, "translationX", translationX, translationX2);
    }
}
