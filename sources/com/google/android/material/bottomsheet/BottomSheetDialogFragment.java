package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatDialogFragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class BottomSheetDialogFragment extends AppCompatDialogFragment {

    /* renamed from: a  reason: collision with root package name */
    public boolean f5050a;

    @Override // androidx.fragment.app.DialogFragment
    public void dismiss() {
        if (!u2(false)) {
            super.dismiss();
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismissAllowingStateLoss() {
        if (!u2(true)) {
            super.dismissAllowingStateLoss();
        }
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        return new BottomSheetDialog(getContext(), getTheme());
    }

    public final void r2() {
        if (this.f5050a) {
            super.dismissAllowingStateLoss();
        } else {
            super.dismiss();
        }
    }

    public final void s2(BottomSheetBehavior<?> bottomSheetBehavior, boolean z) {
        this.f5050a = z;
        if (bottomSheetBehavior.getState() == 5) {
            r2();
            return;
        }
        if (getDialog() instanceof BottomSheetDialog) {
            ((BottomSheetDialog) getDialog()).removeDefaultCallback();
        }
        bottomSheetBehavior.addBottomSheetCallback(new b());
        bottomSheetBehavior.setState(5);
    }

    public final boolean u2(boolean z) {
        Dialog dialog = getDialog();
        if (!(dialog instanceof BottomSheetDialog)) {
            return false;
        }
        BottomSheetDialog bottomSheetDialog = (BottomSheetDialog) dialog;
        BottomSheetBehavior<FrameLayout> behavior = bottomSheetDialog.getBehavior();
        if (!behavior.isHideable() || !bottomSheetDialog.getDismissWithAnimation()) {
            return false;
        }
        s2(behavior, z);
        return true;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b extends BottomSheetBehavior.f {
        public b() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void b(View view, int i) {
            if (i == 5) {
                BottomSheetDialogFragment.this.r2();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void a(View view, float f) {
        }
    }
}
