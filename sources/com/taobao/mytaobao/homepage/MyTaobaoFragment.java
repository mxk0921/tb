package com.taobao.mytaobao.homepage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.mytaobao.base.MtbGlobalEnv;
import com.taobao.mytaobao.pagev2.MtbBizProxyV2;
import com.taobao.mytaobao.ultron.MtbBizProxy;
import com.taobao.tao.MytaobaoApplication;
import com.taobao.tao.TBBaseFragment;
import com.taobao.tao.log.TLog;
import tb.ew;
import tb.q3j;
import tb.sc;
import tb.snl;
import tb.t2o;
import tb.uv6;
import tb.vib;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MyTaobaoFragment extends TBBaseFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ew f11213a = null;
    public boolean c = false;
    public ViewGroup d;
    public FrameLayout e;
    public vib f;

    static {
        t2o.a(745537714);
    }

    public MyTaobaoFragment() {
        q3j.t();
    }

    public static /* synthetic */ Object ipc$super(MyTaobaoFragment myTaobaoFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1589549411:
                super.onAttach((Context) objArr[0]);
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 462397159:
                super.onDestroyView();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/homepage/MyTaobaoFragment");
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b90bdf11", new Object[]{this});
            return;
        }
        ew ewVar = this.f11213a;
        if (!(ewVar instanceof MtbBizProxy)) {
            TLog.loge("mtbMainLink", "标记切新VC，当前不是老vc，直接return");
            return;
        }
        ewVar.s();
        this.f11213a = null;
        TLog.loge("mtbMainLink", "标记切新VC，清除proxy状态");
    }

    @Override // com.taobao.tao.TBBaseFragment
    public void handleLoginAction(LoginAction loginAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e52feba", new Object[]{this, loginAction});
        } else {
            r2().o(loginAction);
        }
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a141669d", new Object[]{this, context});
            return;
        }
        super.onAttach(context);
        r2().p(context);
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        MytaobaoApplication.isPageCreated = true;
        sc.a(snl.f28161a.i(this).b());
        r2().q(bundle);
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        this.d = viewGroup;
        View r = r2().r(layoutInflater, viewGroup, bundle);
        if (this.e == null) {
            this.e = new FrameLayout(layoutInflater.getContext());
            this.e.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.e.addView(r, -1, -1);
            uv6.e(getActivity());
        }
        return this.e;
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        r2().s();
        q3j.y();
        super.onDestroy();
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
            return;
        }
        r2().t();
        super.onDestroyView();
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        r2().u();
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        r2().v();
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        r2().w();
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        r2().x();
    }

    public final void p2(ew ewVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74fed1e4", new Object[]{this, ewVar});
            return;
        }
        Lifecycle.State currentState = getLifecycle().getCurrentState();
        TLog.loge("mtbMainLink", "当前proxy生命周期:" + currentState);
        if (currentState != Lifecycle.State.INITIALIZED && currentState.isAtLeast(Lifecycle.State.CREATED)) {
            TLog.loge("mtbMainLink", "补偿proxy onCreate");
            ewVar.q(null);
            if (this.e != null && this.d != null) {
                TLog.loge("mtbMainLink", "补偿proxy onCreateView");
                this.e.removeAllViews();
                this.e.addView(ewVar.r(LayoutInflater.from(requireContext()), this.d, null), -1, -1);
            }
        }
    }

    public ew r2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ew) ipChange.ipc$dispatch("b6ae2d50", new Object[]{this});
        }
        if (this.f11213a == null) {
            if (!MtbGlobalEnv.y() || MtbGlobalEnv.x()) {
                TLog.loge("mtbMainLink", "创建老VC");
                MtbBizProxy mtbBizProxy = new MtbBizProxy(this);
                this.f11213a = mtbBizProxy;
                p2(mtbBizProxy);
            } else {
                TLog.loge("mtbMainLink", "创建新VC");
                MtbBizProxyV2 mtbBizProxyV2 = new MtbBizProxyV2(this);
                this.f11213a = mtbBizProxyV2;
                p2(mtbBizProxyV2);
            }
        }
        return this.f11213a;
    }

    public void s2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b18b026a", new Object[]{this});
            return;
        }
        ew ewVar = this.f11213a;
        if (!(ewVar instanceof MtbBizProxyV2)) {
            TLog.loge("mtbMainLink", "标记切老VC，当前不是新vc，直接return");
            return;
        }
        ewVar.s();
        this.f11213a = null;
        TLog.loge("mtbMainLink", "标记切老VC，清除proxy状态");
    }

    public void u2(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4e6a2eb", new Object[]{this, activity});
            return;
        }
        uv6.d("preloadMtb");
        if (!this.c) {
            uv6.j("======preloadMtb");
            this.c = true;
            r2().y(activity, getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED));
            uv6.g("preloadMtb");
        }
    }
}
