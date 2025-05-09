package tb;

import android.animation.ObjectAnimator;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class f9 extends cs<ObjectAnimator, ObjectAnimator> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(336592980);
    }

    public static /* synthetic */ Object ipc$super(f9 f9Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilitykit/ability/pop/animation/impl/AKPopFadeInOutAnimation");
    }

    @Override // tb.fab
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e7424843", new Object[]{this});
        }
        return "alpha";
    }

    /* renamed from: q */
    public ObjectAnimator h(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ObjectAnimator) ipChange.ipc$dispatch("85a169f1", new Object[]{this, view});
        }
        float[] fArr = {0.0f, 1.0f};
        this.c = fArr;
        return ObjectAnimator.ofFloat(view, "alpha", fArr);
    }

    /* renamed from: r */
    public ObjectAnimator i(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ObjectAnimator) ipChange.ipc$dispatch("a3862b62", new Object[]{this, view});
        }
        float[] fArr = {1.0f, 0.0f};
        this.d = fArr;
        return ObjectAnimator.ofFloat(view, "alpha", fArr);
    }
}
