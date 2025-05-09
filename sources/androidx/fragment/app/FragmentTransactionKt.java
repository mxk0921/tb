package androidx.fragment.app;

import android.os.Bundle;
import com.ali.user.mobile.app.constant.UTConstant;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.ckf;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a;\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0086\b\u001a-\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0086\b\u001a;\u0010\n\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0086\b¨\u0006\u000b"}, d2 = {"add", "Landroidx/fragment/app/FragmentTransaction;", UTConstant.Args.UT_SUCCESS_F, "Landroidx/fragment/app/Fragment;", "containerViewId", "", "tag", "", "args", "Landroid/os/Bundle;", "replace", "fragment-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class FragmentTransactionKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final /* synthetic */ <F extends Fragment> FragmentTransaction add(FragmentTransaction fragmentTransaction, int i, String str, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentTransaction) ipChange.ipc$dispatch("96839be3", new Object[]{fragmentTransaction, new Integer(i), str, bundle});
        }
        ckf.m(4, UTConstant.Args.UT_SUCCESS_F);
        throw null;
    }

    public static /* synthetic */ FragmentTransaction add$default(FragmentTransaction fragmentTransaction, int i, String str, Bundle bundle, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentTransaction) ipChange.ipc$dispatch("3558c74d", new Object[]{fragmentTransaction, new Integer(i), str, bundle, new Integer(i2), obj});
        }
        ckf.m(4, UTConstant.Args.UT_SUCCESS_F);
        throw null;
    }

    public static final /* synthetic */ <F extends Fragment> FragmentTransaction replace(FragmentTransaction fragmentTransaction, int i, String str, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentTransaction) ipChange.ipc$dispatch("5a798370", new Object[]{fragmentTransaction, new Integer(i), str, bundle});
        }
        ckf.m(4, UTConstant.Args.UT_SUCCESS_F);
        throw null;
    }

    public static /* synthetic */ FragmentTransaction replace$default(FragmentTransaction fragmentTransaction, int i, String str, Bundle bundle, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentTransaction) ipChange.ipc$dispatch("e10b8fa0", new Object[]{fragmentTransaction, new Integer(i), str, bundle, new Integer(i2), obj});
        }
        ckf.m(4, UTConstant.Args.UT_SUCCESS_F);
        throw null;
    }

    public static final /* synthetic */ <F extends Fragment> FragmentTransaction add(FragmentTransaction fragmentTransaction, String str, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentTransaction) ipChange.ipc$dispatch("c4856c22", new Object[]{fragmentTransaction, str, bundle});
        }
        ckf.m(4, UTConstant.Args.UT_SUCCESS_F);
        throw null;
    }

    public static /* synthetic */ FragmentTransaction add$default(FragmentTransaction fragmentTransaction, String str, Bundle bundle, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentTransaction) ipChange.ipc$dispatch("30cdaa54", new Object[]{fragmentTransaction, str, bundle, new Integer(i), obj});
        }
        ckf.m(4, UTConstant.Args.UT_SUCCESS_F);
        throw null;
    }
}
