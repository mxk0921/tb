package com.taobao.android.sku.pad;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.utils.SkuLogUtils;
import com.taobao.android.sku.widget.SkuDialogFragment;
import java.lang.reflect.Field;
import kotlin.Metadata;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/taobao/android/sku/pad/PadSkuFragment;", "Lcom/taobao/android/sku/widget/SkuDialogFragment;", "<init>", "()V", "detail-sku_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class PadSkuFragment extends SkuDialogFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(442499215);
    }

    public static /* synthetic */ Object ipc$super(PadSkuFragment padSkuFragment, String str, Object... objArr) {
        if (str.hashCode() == -596517775) {
            super.show((FragmentManager) objArr[0], (String) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/sku/pad/PadSkuFragment");
    }

    @Override // com.taobao.android.sku.widget.SkuDialogFragment, androidx.fragment.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        if (!isVisible()) {
            try {
                Field declaredField = DialogFragment.class.getDeclaredField("mDismissed");
                ckf.f(declaredField, "dismissedField");
                declaredField.setAccessible(true);
                declaredField.set(this, Boolean.FALSE);
                Field declaredField2 = DialogFragment.class.getDeclaredField("mShownByMe");
                ckf.f(declaredField2, "showByMeField");
                declaredField2.setAccessible(true);
                declaredField2.set(this, Boolean.TRUE);
                ckf.d(fragmentManager);
                FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
                beginTransaction.add(this, str);
                beginTransaction.commitAllowingStateLoss();
            } catch (Throwable th) {
                super.show(fragmentManager, str);
                SkuLogUtils.i("fragment show error : " + th.getMessage());
            }
        }
    }

    @Override // com.taobao.android.sku.widget.SkuDialogFragment
    public boolean v2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3c33646", new Object[]{this})).booleanValue();
        }
        return isVisible();
    }
}
