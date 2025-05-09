package androidx.fragment.app;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Deprecated;
import kotlin.Metadata;
import org.android.agoo.common.AgooConstants;
import tb.g1a;
import tb.pg1;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a7\u0010\b\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\b¢\u0006\u0004\b\b\u0010\t\u001a7\u0010\n\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\b¢\u0006\u0004\b\n\u0010\t\u001aA\u0010\f\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\b¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/fragment/app/FragmentManager;", "", "allowStateLoss", "Lkotlin/Function1;", "Landroidx/fragment/app/FragmentTransaction;", "Ltb/xhv;", "Lkotlin/ExtensionFunctionType;", AgooConstants.MESSAGE_BODY, "commit", "(Landroidx/fragment/app/FragmentManager;ZLtb/g1a;)V", "commitNow", pg1.ATOM_EXT_now, "transaction", "(Landroidx/fragment/app/FragmentManager;ZZLtb/g1a;)V", "fragment-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class FragmentManagerKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final void commit(FragmentManager fragmentManager, boolean z, g1a<? super FragmentTransaction, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6603f24d", new Object[]{fragmentManager, new Boolean(z), g1aVar});
            return;
        }
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        g1aVar.invoke(beginTransaction);
        if (z) {
            beginTransaction.commitAllowingStateLoss();
        } else {
            beginTransaction.commit();
        }
    }

    public static /* synthetic */ void commit$default(FragmentManager fragmentManager, boolean z, g1a g1aVar, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("214be675", new Object[]{fragmentManager, new Boolean(z), g1aVar, new Integer(i), obj});
            return;
        }
        if ((i & 1) != 0) {
            z = false;
        }
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        g1aVar.invoke(beginTransaction);
        if (z) {
            beginTransaction.commitAllowingStateLoss();
        } else {
            beginTransaction.commit();
        }
    }

    public static final void commitNow(FragmentManager fragmentManager, boolean z, g1a<? super FragmentTransaction, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a25d735", new Object[]{fragmentManager, new Boolean(z), g1aVar});
            return;
        }
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        g1aVar.invoke(beginTransaction);
        if (z) {
            beginTransaction.commitNowAllowingStateLoss();
        } else {
            beginTransaction.commitNow();
        }
    }

    public static /* synthetic */ void commitNow$default(FragmentManager fragmentManager, boolean z, g1a g1aVar, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f88a308d", new Object[]{fragmentManager, new Boolean(z), g1aVar, new Integer(i), obj});
            return;
        }
        if ((i & 1) != 0) {
            z = false;
        }
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        g1aVar.invoke(beginTransaction);
        if (z) {
            beginTransaction.commitNowAllowingStateLoss();
        } else {
            beginTransaction.commitNow();
        }
    }

    @Deprecated(message = "Use commit { .. } or commitNow { .. } extensions")
    public static final void transaction(FragmentManager fragmentManager, boolean z, boolean z2, g1a<? super FragmentTransaction, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e29d2ac", new Object[]{fragmentManager, new Boolean(z), new Boolean(z2), g1aVar});
            return;
        }
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        g1aVar.invoke(beginTransaction);
        if (z) {
            if (z2) {
                beginTransaction.commitNowAllowingStateLoss();
            } else {
                beginTransaction.commitNow();
            }
        } else if (z2) {
            beginTransaction.commitAllowingStateLoss();
        } else {
            beginTransaction.commit();
        }
    }

    public static /* synthetic */ void transaction$default(FragmentManager fragmentManager, boolean z, boolean z2, g1a g1aVar, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19650990", new Object[]{fragmentManager, new Boolean(z), new Boolean(z2), g1aVar, new Integer(i), obj});
            return;
        }
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        g1aVar.invoke(beginTransaction);
        if (z) {
            if (z2) {
                beginTransaction.commitNowAllowingStateLoss();
            } else {
                beginTransaction.commitNow();
            }
        } else if (z2) {
            beginTransaction.commitAllowingStateLoss();
        } else {
            beginTransaction.commit();
        }
    }
}
