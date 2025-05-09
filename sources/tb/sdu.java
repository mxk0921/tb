package tb;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.tao.tbmainfragment.ISupportFragment;
import com.taobao.tao.tbmainfragment.ResultRecord;
import com.taobao.tao.tbmainfragment.SupportSecondaryBaseFragment;
import com.taobao.tao.util.TBMainLog;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class sdu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_POPTO_ANIM = Integer.MAX_VALUE;
    public static final String FRAGMENTATION_ARG_CONTAINER = "fragmentation_arg_container";
    public static final String FRAGMENTATION_ARG_CUSTOM_ENTER_ANIM = "fragmentation_arg_custom_enter_anim";
    public static final String FRAGMENTATION_ARG_CUSTOM_EXIT_ANIM = "fragmentation_arg_custom_exit_anim";
    public static final String FRAGMENTATION_ARG_CUSTOM_POP_EXIT_ANIM = "fragmentation_arg_custom_pop_exit_anim";
    public static final String FRAGMENTATION_ARG_IS_SHARED_ELEMENT = "fragmentation_arg_is_shared_element";
    public static final String FRAGMENTATION_ARG_RESULT_RECORD = "fragment_arg_result_record";
    public static final String FRAGMENTATION_ARG_ROOT_STATUS = "fragmentation_arg_root_status";
    public static final String FRAGMENTATION_STATE_SAVE_ANIMATOR = "fragmentation_state_save_animator";
    public static final String FRAGMENTATION_STATE_SAVE_IS_HIDDEN = "fragmentation_state_save_status";

    /* renamed from: a  reason: collision with root package name */
    public final wtd f27982a;
    public final FragmentActivity b;
    public final Handler c = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ISupportFragment f27983a;
        public final /* synthetic */ ISupportFragment b;
        public final /* synthetic */ FragmentManager c;
        public final /* synthetic */ ArrayList d;

        public a(ISupportFragment iSupportFragment, ISupportFragment iSupportFragment2, FragmentManager fragmentManager, ArrayList arrayList) {
            this.f27983a = iSupportFragment;
            this.b = iSupportFragment2;
            this.c = fragmentManager;
            this.d = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                sdu.a(sdu.this, this.f27983a, this.b, this.c, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ISupportFragment f27984a;
        public final /* synthetic */ ISupportFragment b;

        public b(ISupportFragment iSupportFragment, ISupportFragment iSupportFragment2) {
            this.f27984a = iSupportFragment;
            this.b = iSupportFragment2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                sdu.b(sdu.this, this.f27984a, this.b);
            }
        }
    }

    static {
        t2o.a(775946392);
    }

    public sdu(wtd wtdVar) {
        this.f27982a = wtdVar;
        this.b = (FragmentActivity) wtdVar;
    }

    public static /* synthetic */ void a(sdu sduVar, ISupportFragment iSupportFragment, ISupportFragment iSupportFragment2, FragmentManager fragmentManager, ArrayList arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45e3afe0", new Object[]{sduVar, iSupportFragment, iSupportFragment2, fragmentManager, arrayList});
        } else {
            sduVar.f(iSupportFragment, iSupportFragment2, fragmentManager, arrayList);
        }
    }

    public static /* synthetic */ void b(sdu sduVar, ISupportFragment iSupportFragment, ISupportFragment iSupportFragment2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("748a1be0", new Object[]{sduVar, iSupportFragment, iSupportFragment2});
        } else {
            sduVar.k(iSupportFragment, iSupportFragment2);
        }
    }

    public final void c(int i, ISupportFragment iSupportFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b642d0de", new Object[]{this, new Integer(i), iSupportFragment});
        } else {
            h(iSupportFragment.asFragment()).putInt(FRAGMENTATION_ARG_CONTAINER, i);
        }
    }

    public void d(FragmentManager fragmentManager, ISupportFragment iSupportFragment, ISupportFragment iSupportFragment2, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f4a53", new Object[]{this, fragmentManager, iSupportFragment, iSupportFragment2, new Integer(i), new Integer(i2), new Integer(i3)});
        } else {
            e(fragmentManager, iSupportFragment, iSupportFragment2, i, i2, i3);
        }
    }

    public final void e(FragmentManager fragmentManager, ISupportFragment iSupportFragment, ISupportFragment iSupportFragment2, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e2752be", new Object[]{this, fragmentManager, iSupportFragment, iSupportFragment2, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        if ((i3 == 1 || i3 == 3) && iSupportFragment != null) {
            Fragment fragment = (Fragment) iSupportFragment;
            if (!fragment.isAdded()) {
                fragment.getClass().getSimpleName().concat(" has not been attached yet! startForResult() converted to start()");
            } else {
                p(fragmentManager, fragment, (Fragment) iSupportFragment2, i);
            }
        }
        ISupportFragment i4 = i(iSupportFragment, fragmentManager);
        int i5 = h(iSupportFragment2.asFragment()).getInt(FRAGMENTATION_ARG_CONTAINER, 0);
        if (i4 == null && i5 == 0) {
            TLog.loge("Fragmentation", "There is no Fragment in the FragmentManager, maybe you need to call loadRootFragment()!");
            return;
        }
        if (i4 != null && i5 == 0) {
            c(i4.getSupportDelegate().f, iSupportFragment2);
        }
        String t = t(iSupportFragment2.getClass().getName());
        iSupportFragment2.getSupportDelegate().getClass();
        if (!j(fragmentManager, i4, iSupportFragment2, t, i2)) {
            r(fragmentManager, i4, iSupportFragment2, t, false, null, false, i3, false);
        }
    }

    public final void f(ISupportFragment iSupportFragment, ISupportFragment iSupportFragment2, FragmentManager fragmentManager, ArrayList<Fragment> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6bba5ae", new Object[]{this, iSupportFragment, iSupportFragment2, fragmentManager, arrayList});
            return;
        }
        String t = t(((Fragment) iSupportFragment2).getTag());
        if (iSupportFragment instanceof SupportSecondaryBaseFragment) {
            m(t, fragmentManager, arrayList, ((SupportSecondaryBaseFragment) iSupportFragment).isExitAnimNeeded(), true);
        } else {
            m(t, fragmentManager, arrayList, true, true);
        }
        q(iSupportFragment2);
        xw9.c(iSupportFragment2.asFragment(), this.b);
    }

    public final void g(String str, boolean z, FragmentManager fragmentManager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3f3a0da", new Object[]{this, str, new Boolean(z), fragmentManager, new Integer(i)});
            return;
        }
        String t = t(str);
        if (fragmentManager.findFragmentByTag(t) == null) {
            TLog.loge("Fragmentation", "Pop failure! Can't find FragmentTag:" + t + " in the FragmentManager's Stack.");
            return;
        }
        List<Fragment> j = qxq.j(fragmentManager, t, z);
        if (!j.isEmpty()) {
            m(t, fragmentManager, j, true, false);
        }
    }

    public final Bundle h(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("74562323", new Object[]{this, fragment});
        }
        Bundle arguments = fragment.getArguments();
        if (arguments != null) {
            return arguments;
        }
        Bundle bundle = new Bundle();
        fragment.setArguments(bundle);
        return bundle;
    }

    public final ISupportFragment i(ISupportFragment iSupportFragment, FragmentManager fragmentManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ISupportFragment) ipChange.ipc$dispatch("d747429c", new Object[]{this, iSupportFragment, fragmentManager});
        }
        if (iSupportFragment == null) {
            return qxq.h(fragmentManager);
        }
        return qxq.i(fragmentManager, iSupportFragment.getSupportDelegate().f);
    }

    public final boolean j(FragmentManager fragmentManager, ISupportFragment iSupportFragment, ISupportFragment iSupportFragment2, String str, int i) {
        ISupportFragment a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("421b4eb5", new Object[]{this, fragmentManager, iSupportFragment, iSupportFragment2, str, new Integer(i)})).booleanValue();
        }
        if (iSupportFragment == null || (a2 = qxq.a(iSupportFragment2.getClass(), str, fragmentManager)) == null) {
            return false;
        }
        if (i == 1) {
            if (iSupportFragment2 == iSupportFragment || iSupportFragment2.getClass().getName().equals(iSupportFragment.getClass().getName())) {
                k(iSupportFragment2, a2);
                return true;
            }
        } else if (i == 2) {
            g(t(str), false, fragmentManager, Integer.MAX_VALUE);
            this.c.post(new b(iSupportFragment2, a2));
            return true;
        }
        return false;
    }

    public final void k(ISupportFragment iSupportFragment, ISupportFragment iSupportFragment2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be7bacc3", new Object[]{this, iSupportFragment, iSupportFragment2});
            return;
        }
        Bundle bundle = iSupportFragment.getSupportDelegate().h;
        Bundle h = h((Fragment) iSupportFragment);
        if (h.containsKey(FRAGMENTATION_ARG_CONTAINER)) {
            h.remove(FRAGMENTATION_ARG_CONTAINER);
        }
        if (bundle != null) {
            h.putAll(bundle);
        }
        iSupportFragment2.onNewBundle(h);
    }

    public void l(FragmentManager fragmentManager, int i, ISupportFragment iSupportFragment, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65e93bf6", new Object[]{this, fragmentManager, new Integer(i), iSupportFragment, new Boolean(z), new Boolean(z2)});
            return;
        }
        c(i, iSupportFragment);
        String t = t(iSupportFragment.getClass().getName());
        iSupportFragment.getSupportDelegate().getClass();
        r(fragmentManager, null, iSupportFragment, t, !z, null, z2, 10, true);
    }

    public final void m(String str, FragmentManager fragmentManager, List<Fragment> list, boolean z, boolean z2) {
        Fragment findFragmentByTag;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a23d769", new Object[]{this, str, fragmentManager, list, new Boolean(z), new Boolean(z2)});
            return;
        }
        try {
            findFragmentByTag = fragmentManager.findFragmentByTag(str);
        } catch (Throwable th) {
            try {
                TBMainLog.tlog("Fragmentation", "mockPopToMainFragmentWithAnim error: " + th);
                har.a("mockPopToMainFragmentWithAnim", th.toString());
            } finally {
                this.f27982a.getSupportDelegate().c = false;
            }
        }
        if (findFragmentByTag == null) {
            TBMainLog.tlog("Fragmentation", "mockPopToMainFragmentWithAnim error: fragment is null");
            return;
        }
        this.f27982a.getSupportDelegate().c = true;
        FragmentTransaction transition = fragmentManager.beginTransaction().setTransition(8194);
        for (Fragment fragment : list) {
            fragmentManager.popBackStack();
            transition.remove(fragment);
        }
        transition.show(findFragmentByTag);
        if (z) {
            transition.setCustomAnimations(R.anim.h_fragment_enter, R.anim.h_fragment_exit);
        } else {
            int i = R.anim.no_anim;
            transition.setCustomAnimations(i, i);
        }
        if (z2) {
            transition.commitNowAllowingStateLoss();
        } else {
            transition.commitAllowingStateLoss();
        }
    }

    public void n(FragmentManager fragmentManager, FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7918efc", new Object[]{this, fragmentManager, fragmentActivity});
            return;
        }
        ISupportFragment h = qxq.h(fragmentManager);
        if (h instanceof Fragment) {
            Fragment fragment = (Fragment) h;
            ISupportFragment g = qxq.g(fragment);
            if (g instanceof Fragment) {
                ArrayList<Fragment> arrayList = new ArrayList<>();
                arrayList.add(fragment);
                if (!nx9.v() || nx9.u()) {
                    f(h, g, fragmentManager, arrayList);
                } else {
                    this.c.post(new a(h, g, fragmentManager, arrayList));
                }
            }
        }
    }

    public void o(String str, boolean z, FragmentManager fragmentManager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7b035af", new Object[]{this, str, new Boolean(z), fragmentManager, new Integer(i)});
        } else {
            g(t(str), z, fragmentManager, i);
        }
    }

    public final void p(FragmentManager fragmentManager, Fragment fragment, Fragment fragment2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d58a2ee", new Object[]{this, fragmentManager, fragment, fragment2, new Integer(i)});
            return;
        }
        Bundle h = h(fragment2);
        ResultRecord resultRecord = new ResultRecord();
        resultRecord.requestCode = i;
        h.putParcelable(FRAGMENTATION_ARG_RESULT_RECORD, resultRecord);
        fragmentManager.putFragment(h, "fragmentation_state_save_result", fragment);
    }

    public final void q(ISupportFragment iSupportFragment) {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2e889f7", new Object[]{this, iSupportFragment});
            return;
        }
        Bundle arguments = iSupportFragment.asFragment().getArguments();
        if (arguments != null) {
            try {
                Uri uri = (Uri) arguments.getParcelable(hx9.KEY_FRAGMENT_URL);
                if (uri != null && (intent = this.b.getIntent()) != null) {
                    TLog.loge("Fragmentation", "into setData" + uri);
                    intent.setData(uri);
                }
            } catch (Throwable th) {
                Log.e("Fragmentation", "ee: " + th);
            }
        }
    }

    public final void r(FragmentManager fragmentManager, ISupportFragment iSupportFragment, ISupportFragment iSupportFragment2, String str, boolean z, List<vdu> list, boolean z2, int i, boolean z3) {
        boolean z4;
        Fragment fragment;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("387bce0e", new Object[]{this, fragmentManager, iSupportFragment, iSupportFragment2, str, new Boolean(z), list, new Boolean(z2), new Integer(i), new Boolean(z3)});
            return;
        }
        String t = t(str);
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        if (i == 0 || i == 1 || i == 2 || i == 3) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (iSupportFragment == null) {
            fragment = null;
        } else {
            fragment = iSupportFragment.asFragment();
        }
        Fragment asFragment = iSupportFragment2.asFragment();
        Bundle h = h(asFragment);
        if (list != null) {
            h.putBoolean(FRAGMENTATION_ARG_IS_SHARED_ELEMENT, true);
            for (vdu vduVar : list) {
                vduVar.getClass();
                beginTransaction.addSharedElement(null, null);
            }
        } else if (z4) {
            iSupportFragment2.getSupportDelegate().getClass();
            if (i == 2) {
                beginTransaction.setTransition(0);
            } else {
                beginTransaction.setTransition(4097);
            }
        } else {
            h.putInt(FRAGMENTATION_ARG_ROOT_STATUS, 1);
        }
        if (iSupportFragment == null) {
            beginTransaction.replace(h.getInt(FRAGMENTATION_ARG_CONTAINER), asFragment, t);
            if (!z4) {
                beginTransaction.setTransition(4097);
                if (z2) {
                    i2 = 2;
                } else {
                    i2 = 1;
                }
                h.putInt(FRAGMENTATION_ARG_ROOT_STATUS, i2);
            }
        } else if (z4) {
            beginTransaction.add(iSupportFragment.getSupportDelegate().f, asFragment, t);
            if (!(i == 2 || i == 3)) {
                beginTransaction.hide(fragment);
            }
        } else {
            beginTransaction.replace(iSupportFragment.getSupportDelegate().f, asFragment, t);
        }
        if (!z && i != 11) {
            beginTransaction.addToBackStack(t);
        }
        if (!z3) {
            xw9.b(fragment, asFragment, this.b);
        }
        s(fragmentManager, beginTransaction, z3);
    }

    public final void s(FragmentManager fragmentManager, FragmentTransaction fragmentTransaction, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c687e16e", new Object[]{this, fragmentManager, fragmentTransaction, new Boolean(z)});
        } else if (z) {
            fragmentTransaction.commitNowAllowingStateLoss();
        } else {
            fragmentTransaction.commitAllowingStateLoss();
        }
    }

    public final String t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a04b240", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        if (str.contains("@")) {
            return str;
        }
        return str + "@" + str.hashCode();
    }
}
