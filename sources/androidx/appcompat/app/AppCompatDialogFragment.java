package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AppCompatDialogFragment extends DialogFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public AppCompatDialogFragment() {
    }

    public static /* synthetic */ Object ipc$super(AppCompatDialogFragment appCompatDialogFragment, String str, Object... objArr) {
        if (str.hashCode() == -1840095042) {
            super.setupDialog((Dialog) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/appcompat/app/AppCompatDialogFragment");
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("cc7a75a5", new Object[]{this, bundle});
        }
        return new AppCompatDialog(getContext(), getTheme());
    }

    @Override // androidx.fragment.app.DialogFragment
    public void setupDialog(Dialog dialog, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("925260be", new Object[]{this, dialog, new Integer(i)});
        } else if (dialog instanceof AppCompatDialog) {
            AppCompatDialog appCompatDialog = (AppCompatDialog) dialog;
            if (!(i == 1 || i == 2)) {
                if (i == 3) {
                    dialog.getWindow().addFlags(24);
                } else {
                    return;
                }
            }
            appCompatDialog.supportRequestWindowFeature(1);
        } else {
            super.setupDialog(dialog, i);
        }
    }

    public AppCompatDialogFragment(int i) {
        super(i);
    }
}
