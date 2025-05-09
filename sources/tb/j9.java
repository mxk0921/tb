package tb;

import android.animation.ObjectAnimator;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class j9 extends cs<ObjectAnimator, ObjectAnimator> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(336592983);
    }

    public static /* synthetic */ Object ipc$super(j9 j9Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilitykit/ability/pop/animation/impl/AKPopTopInOutAnimation");
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
        float translationY = view.getTranslationY() - view.getHeight();
        float translationY2 = view.getTranslationY();
        int i = iArr[1];
        this.c = new float[]{i + translationY, i + translationY2};
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
        this.d = new float[]{iArr[1] + view.getTranslationY(), (iArr[1] + view.getTranslationY()) - view.getHeight()};
        return ObjectAnimator.ofFloat(view, "translationY", view.getTranslationY(), view.getTranslationY() - view.getHeight());
    }
}
