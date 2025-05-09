package com.taobao.tao.flexbox.layoutmanager.container;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.container.containerlifecycle.TBFragmentContainer;
import com.taobao.tao.TBBaseFragment;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IDeviceInfo;
import com.taobao.tao.flexbox.layoutmanager.container.a;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import com.taobao.tao.tbmainfragment.SupportActivity;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.akt;
import tb.c2v;
import tb.f21;
import tb.fhb;
import tb.hzc;
import tb.igs;
import tb.kpu;
import tb.lma;
import tb.nwv;
import tb.nxb;
import tb.od0;
import tb.qxq;
import tb.rnl;
import tb.t2o;
import tb.tfs;
import tb.y9a;
import tb.z9u;
import tb.zcr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MainDexContainerFragment extends TBBaseFragment implements fhb.d, o.r, zcr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAB2_INSTANCE_NAME = "tab2";
    public static final Map<String, Map<String, Object>> f = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public a.AbstractC0688a f12165a;
    public ViewGroup c;
    public Map<String, String> d;
    public boolean e;

    static {
        t2o.a(502268248);
        t2o.a(503316579);
        t2o.a(503317152);
        t2o.a(503316966);
    }

    public MainDexContainerFragment() {
        igs.g();
    }

    public static /* synthetic */ Object ipc$super(MainDexContainerFragment mainDexContainerFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2147180915:
                super.onSaveInstanceState((Bundle) objArr[0]);
                return null;
            case -1589549411:
                super.onAttach((Context) objArr[0]);
                return null;
            case -1542694236:
                super.onSupportInvisible();
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
            case -198387616:
                return new Boolean(super.onPanelKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
            case 188604040:
                super.onStop();
                return null;
            case 462397159:
                super.onDestroyView();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1950489833:
                super.onSupportVisible();
                return null;
            case 2127624665:
                super.onDetach();
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/container/MainDexContainerFragment");
        }
    }

    public final void A2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc1f8951", new Object[]{this});
            return;
        }
        a.AbstractC0688a aVar = this.f12165a;
        if (aVar != null) {
            aVar.onStart();
        }
    }

    public final void B2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f45ad21", new Object[]{this});
            return;
        }
        a.AbstractC0688a aVar = this.f12165a;
        if (aVar != null) {
            aVar.onStop();
        }
    }

    public final void C2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("100cadfb", new Object[]{this});
            return;
        }
        try {
            c2v.d orNewUTPageStateObject = c2v.getInstance().getOrNewUTPageStateObject(getActivity());
            if (this.d.get("spm-pre") != null) {
                orNewUTPageStateObject.mSpmPre = nwv.I(this.d.get("spm-pre"), orNewUTPageStateObject.mSpmPre);
                c2v.getInstance().setLastCacheKeySpmUrl(orNewUTPageStateObject.mSpmPre);
            }
            if (this.d.get("spm-url") != null) {
                orNewUTPageStateObject.mSpmUrl = nwv.I(this.d.get("spm-url"), orNewUTPageStateObject.mSpmUrl);
            }
            if (this.d.get(z9u.KEY_UTPARAM_URL) != null) {
                orNewUTPageStateObject.mUtparamUrl = nwv.I(this.d.get(z9u.KEY_UTPARAM_URL), orNewUTPageStateObject.mUtparamUrl);
            }
            if (this.d.get("utparam-pre") != null) {
                orNewUTPageStateObject.mUtparamPre = nwv.I(this.d.get("utparam-pre"), orNewUTPageStateObject.mUtparamPre);
            }
            if (this.d.get("scm") != null) {
                orNewUTPageStateObject.mScmUrl = nwv.I(this.d.get("scm"), orNewUTPageStateObject.mScmUrl);
            }
            if (this.d.get("scm-pre") != null) {
                orNewUTPageStateObject.mScmPre = nwv.I(this.d.get("scm-pre"), orNewUTPageStateObject.mScmPre);
                c2v.getInstance().setLastCacheKeyScmUrl(orNewUTPageStateObject.mScmPre);
            }
        } catch (Throwable th) {
            tfs.e("MaindexContainerFragment", "resetUtParams" + th.getMessage());
        }
    }

    public void D2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bf83ee0", new Object[]{this, new Boolean(z)});
            return;
        }
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putBoolean("disappear_flag", z);
        try {
            setArguments(arguments);
        } catch (IllegalStateException e) {
            tfs.d(e.getMessage());
        }
    }

    public String getUrl() {
        Bundle arguments;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        if (!(getActivity() == null || getActivity().getIntent() == null || getActivity().getIntent().getData() == null)) {
            Uri data = getActivity().getIntent().getData();
            for (String str : data.getQueryParameterNames()) {
                sb.append("&");
                sb.append(str);
                sb.append("=");
                sb.append(Uri.encode(data.getQueryParameter(str)));
            }
        }
        if (!this.e && (arguments = getArguments()) != null && arguments.getLong(y9a.CLICK_STAGE) > 0) {
            sb.append("&clickEnter=true");
        }
        String string = getArguments().getString("url");
        return string + sb.toString();
    }

    @Override // tb.zcr
    public void h1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3aba1dd", new Object[]{this});
        } else if (od0.D().f().z() == 1) {
            A2();
            z2(true);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.o.r
    public boolean isAlive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c89930ce", new Object[]{this})).booleanValue();
        }
        if (isDestroy() || od0.D().f().z() != 1) {
            return false;
        }
        return true;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.o.r
    public boolean isDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35b933fb", new Object[]{this})).booleanValue();
        }
        if (isDetached() || isRemoving() || (getActivity() != null && getActivity().isFinishing())) {
            return true;
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        a.AbstractC0688a aVar = this.f12165a;
        if (aVar != null) {
            aVar.onActivityResult(i, i2, intent);
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
        tfs.e("MainDexContainerFragment", "APMdata onAttach uptimeMillis=" + SystemClock.uptimeMillis());
        p2();
        this.f12165a.onAttach(context);
        kpu.i();
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        if (bundle == null) {
            z = false;
        }
        this.e = z;
        a.AbstractC0688a aVar = this.f12165a;
        if (aVar != null) {
            aVar.c(this);
            this.f12165a.onCreate(bundle);
        }
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        tfs.e("MainDexContainerFragment", "APMdata onCreateView uptimeMillis=" + SystemClock.uptimeMillis());
        lma.g(true);
        igs.a("MaindexFragment onCreateView");
        Bundle arguments = getArguments();
        if (arguments != null && arguments.getLong(y9a.CLICK_STAGE) > 0) {
            if (f21.f18953a == 0) {
                f21.f18953a = System.currentTimeMillis();
            }
            f21.i(f21.TASK_FRAGMENT_CREATE);
            f21.o(f21.TASK_FRAGMENT_CREATE, new JSONObject(od0.D().f().P()));
        }
        if (this.c == null) {
            p2();
            this.c = this.f12165a.getView();
        }
        igs.c();
        nxb h = od0.D().h();
        if (h != null && h.c(getContext())) {
            h.disableForceDark(this.c);
        }
        if (akt.O() && this.c.getParent() != null) {
            ((ViewGroup) this.c.getParent()).removeView(this.c);
        }
        return this.c;
    }

    public void onCurrentTabClicked() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f77f6793", new Object[]{this});
            return;
        }
        a.AbstractC0688a aVar = this.f12165a;
        if (aVar != null) {
            aVar.onCurrentTabClicked();
        }
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        tfs.g("MainDexContainerFragment", "onDestroy");
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
            return;
        }
        super.onDestroyView();
        tfs.g("MainDexContainerFragment", "onDestroyView");
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ed0f9d9", new Object[]{this});
            return;
        }
        super.onDetach();
        tfs.g("MainDexContainerFragment", "onDetach");
        a.AbstractC0688a aVar = this.f12165a;
        if (aVar != null) {
            aVar.onDetach();
        }
    }

    @Override // com.taobao.tao.TBBaseFragment
    public boolean onPanelKeyDown(int i, KeyEvent keyEvent) {
        a.AbstractC0688a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f42cd860", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (i != 4 || (aVar = this.f12165a) == null || !aVar.a(true)) {
            return super.onPanelKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        tfs.g("MainDexContainerFragment", "onPause");
        if (!u2()) {
            v2(false);
        }
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        igs.a("MaindexFragment onResume");
        super.onResume();
        tfs.g("MainDexContainerFragment", "onResume");
        if (!u2()) {
            z2(false);
            igs.c();
            tfs.g("MainDexContainerFragment", "onResume end");
        }
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80049e8d", new Object[]{this, bundle});
            return;
        }
        super.onSaveInstanceState(bundle);
        String r2 = r2();
        HashMap hashMap = (HashMap) f;
        Map map = (Map) hashMap.get(r2);
        if (map == null) {
            map = new HashMap();
            hashMap.put(r2, map);
        }
        a.AbstractC0688a aVar = this.f12165a;
        if (aVar != null) {
            aVar.b(map);
        }
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        tfs.g("MainDexContainerFragment", "onStart");
        super.onStart();
        if (!u2()) {
            A2();
        }
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        tfs.g("MainDexContainerFragment", "onStop");
        if (!u2()) {
            B2();
        }
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, com.taobao.tao.tbmainfragment.ISupportFragment
    public void onSupportInvisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a40c5aa4", new Object[]{this});
        } else {
            super.onSupportInvisible();
        }
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, com.taobao.tao.tbmainfragment.ISupportFragment
    public void onSupportVisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74421ce9", new Object[]{this});
        } else {
            super.onSupportVisible();
        }
    }

    public final void p2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d43e77ad", new Object[]{this});
        } else if (this.f12165a == null) {
            this.f12165a = a.a();
        }
    }

    @Override // tb.zcr
    public boolean pop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e863a65c", new Object[]{this})).booleanValue();
        }
        if (!(getActivity() instanceof SupportActivity) || !(qxq.h(getActivity().getSupportFragmentManager()) instanceof TBFragmentContainer)) {
            return false;
        }
        ((SupportActivity) getActivity()).pop();
        return true;
    }

    public String r2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5010a983", new Object[]{this});
        }
        if (getClass().getSimpleName().equals("GuangGuangTnodeMainFragment")) {
            return "tab2";
        }
        return "";
    }

    public String s2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3ae1a31a", new Object[]{this});
        }
        return "onWeitaoListRefresh";
    }

    public final boolean u2() {
        List<Fragment> fragments;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ec61d601", new Object[]{this})).booleanValue();
        }
        if (!(getActivity() == null || (fragments = getActivity().getSupportFragmentManager().getFragments()) == null)) {
            for (Fragment fragment : fragments) {
                if (!(!(fragment instanceof TBFragmentContainer) || fragment.isDetached() || fragment.isRemoving())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void v2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c6ce8f", new Object[]{this, new Boolean(z)});
            return;
        }
        tfs.g("MainDexContainerFragment", "mainOnPause doPageDisAppear:" + z);
        if (getActivity() != null) {
            this.d = UTAnalytics.getInstance().getDefaultTracker().getPageAllProperties(getActivity());
        }
        a.AbstractC0688a aVar = this.f12165a;
        if (aVar != null) {
            aVar.onPause();
        }
        if (z && getActivity() != null) {
            UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(getActivity());
        }
    }

    public final void z2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd869288", new Object[]{this, new Boolean(z)});
            return;
        }
        tfs.g("MainDexContainerFragment", "mainOnResume doPageAppear:" + z);
        if (z && getActivity() != null) {
            UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(getActivity());
            if (this.d != null) {
                if (akt.n2()) {
                    C2();
                }
                UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(getActivity(), this.d);
            }
        }
        D2(false);
        od0.D().f().D(1, this);
        a.AbstractC0688a aVar = this.f12165a;
        if (aVar != null) {
            aVar.onResume();
        }
    }

    @Override // com.taobao.tao.TBBaseFragment
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
        } else if (intent != null) {
            tfs.g("MainDexContainerFragment", "onNewIntent");
            if (intent.getBooleanExtra(hzc.EXTRA_POP_TO, false)) {
                tfs.g("MainDexContainerFragment", "popTo触发onNewIntent, 不需要刷新");
                return;
            }
            Uri data = intent.getData();
            if (u2() && akt.p2("fixTab2NewIntent", true)) {
                pop();
            }
            String s2 = s2();
            a.AbstractC0688a aVar = this.f12165a;
            if (aVar != null) {
                aVar.d(s2, data);
            }
        }
    }

    @Override // tb.zcr
    public boolean t(String str, List<Pair<View, String>> list, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7614263c", new Object[]{this, str, list, bundle})).booleanValue();
        }
        IDeviceInfo i = od0.D().i();
        if (i != null && i.i()) {
            tfs.h("折叠屏或者pad， 不开启fragment模式");
            return false;
        } else if (u2()) {
            tfs.h("当前已经打开了一个TBFragmentContainer");
            return false;
        } else {
            fhb f2 = od0.D().f();
            if (f2 == null || !f2.H()) {
                tfs.h("当前手淘未打开Fragment模式");
                return false;
            }
            v2(true);
            B2();
            rnl.n(str);
            TBFragmentContainer tBFragmentContainer = new TBFragmentContainer();
            Bundle bundle2 = new Bundle();
            bundle2.putString("url", str);
            bundle2.putBundle("params", bundle);
            tBFragmentContainer.setArguments(bundle2);
            tBFragmentContainer.u2(this.c, list);
            ((SupportActivity) getActivity()).start(tBFragmentContainer, 0, 2);
            return true;
        }
    }
}
