package tb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.DropdownMenuEndIconDelegate;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class h08 extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DropdownMenuEndIconDelegate f20340a;

    public h08(DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate) {
        this.f20340a = dropdownMenuEndIconDelegate;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        boolean z;
        ValueAnimator valueAnimator;
        DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate = this.f20340a;
        CheckableImageButton checkableImageButton = dropdownMenuEndIconDelegate.c;
        z = dropdownMenuEndIconDelegate.j;
        checkableImageButton.setChecked(z);
        valueAnimator = dropdownMenuEndIconDelegate.p;
        valueAnimator.start();
    }
}
