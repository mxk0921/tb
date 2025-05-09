package tb;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.themis.container.app.page.TMSBaseFragment;
import com.taobao.themis.container.app.page.TMSFragment;
import com.taobao.themis.kernel.page.ITMSPage;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class kas extends y8s {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String TAG = "TMSFragmentManager";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(835715107);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(835715106);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ kas(androidx.fragment.app.FragmentActivity r1, int r2, androidx.fragment.app.FragmentManager r3, int r4, tb.a07 r5) {
        /*
            r0 = this;
            r5 = r4 & 2
            if (r5 == 0) goto L_0x0006
            int r2 = com.taobao.taobao.R.id.tms_fragment_container
        L_0x0006:
            r4 = r4 & 4
            if (r4 == 0) goto L_0x0013
            androidx.fragment.app.FragmentManager r3 = r1.getSupportFragmentManager()
            java.lang.String r4 = "<init>"
            tb.ckf.f(r3, r4)
        L_0x0013:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.kas.<init>(androidx.fragment.app.FragmentActivity, int, androidx.fragment.app.FragmentManager, int, tb.a07):void");
    }

    public static /* synthetic */ Object ipc$super(kas kasVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/container/app/page/TMSFragmentManager");
    }

    @Override // tb.y8s
    public TMSBaseFragment a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSBaseFragment) ipChange.ipc$dispatch("f1d77625", new Object[]{this});
        }
        return new TMSFragment();
    }

    public void k(ITMSPage iTMSPage, TMSBaseFragment tMSBaseFragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37981f57", new Object[]{this, iTMSPage, tMSBaseFragment, new Boolean(z)});
            return;
        }
        ckf.g(iTMSPage, "page");
        ckf.g(tMSBaseFragment, "fragment");
        if (!e().contains(tMSBaseFragment) && !c().isFinishing()) {
            iTMSPage.getPageParams().b().put((JSONObject) ccs.KEY_IS_PUSH_PAGE, (String) Boolean.TRUE);
            FragmentTransaction beginTransaction = d().beginTransaction();
            ckf.f(beginTransaction, "mFragmentManager.beginTransaction()");
            f().put(iTMSPage, tMSBaseFragment);
            TMSBaseFragment peek = e().peek();
            e().push(tMSBaseFragment);
            if (z) {
                beginTransaction.setCustomAnimations(R.anim.tms_fragment_translate_in_left, R.anim.tms_fragment_translate_out_left);
            }
            if (tMSBaseFragment.isAdded() || tMSBaseFragment.v2()) {
                beginTransaction.show(tMSBaseFragment);
            } else {
                beginTransaction.add(b(), tMSBaseFragment);
            }
            if (peek != null && !peek.isHidden()) {
                beginTransaction.detach(peek);
            }
            beginTransaction.commitAllowingStateLoss();
        }
    }

    public boolean j(ITMSPage iTMSPage, boolean z) {
        TMSBaseFragment remove;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4a85239", new Object[]{this, iTMSPage, new Boolean(z)})).booleanValue();
        }
        ckf.g(iTMSPage, "page");
        if (d().isDestroyed() || c().isFinishing() || (remove = f().remove(iTMSPage)) == null) {
            return false;
        }
        if (remove.getActivity() != null && remove.getActivity().isFinishing()) {
            return true;
        }
        e().remove(remove);
        FragmentTransaction beginTransaction = d().beginTransaction();
        if (z) {
            beginTransaction.setCustomAnimations(0, R.anim.tms_fragment_translate_out_right);
        }
        beginTransaction.remove(remove);
        if (e().size() > 0) {
            beginTransaction.attach(e().peek());
        }
        beginTransaction.commitAllowingStateLoss();
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kas(FragmentActivity fragmentActivity, int i, FragmentManager fragmentManager) {
        super(fragmentActivity, i, fragmentManager);
        ckf.g(fragmentActivity, "mActivity");
        ckf.g(fragmentManager, "mFragmentManager");
    }
}
