package com.taobao.android.icart;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.BaseICartFragmentProxy;
import com.taobao.android.icart.web.WebFragmentProxyImpl;
import com.taobao.android.icart.weex.impl.WeexFragmentProxyImpl;
import com.taobao.android.icart.weex.utils.OrangeUtil;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.tao.Globals;
import com.taobao.tao.TBBaseFragment;
import tb.anj;
import tb.c9x;
import tb.cw6;
import tb.g2o;
import tb.hav;
import tb.t2o;
import tb.ykl;
import tb.z4v;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class BaseICartFragment extends TBBaseFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public long R0;
    public boolean S0;

    /* renamed from: a  reason: collision with root package name */
    public BaseICartFragmentProxy f7941a;
    public View c;
    public Bundle d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$android$icart$BaseICartFragmentProxy$FragmentProxyType;

        static {
            int[] iArr = new int[BaseICartFragmentProxy.FragmentProxyType.values().length];
            $SwitchMap$com$taobao$android$icart$BaseICartFragmentProxy$FragmentProxyType = iArr;
            try {
                iArr[BaseICartFragmentProxy.FragmentProxyType.WEEX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$android$icart$BaseICartFragmentProxy$FragmentProxyType[BaseICartFragmentProxy.FragmentProxyType.NATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$android$icart$BaseICartFragmentProxy$FragmentProxyType[BaseICartFragmentProxy.FragmentProxyType.WEB.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(478150659);
        }

        public static BaseICartFragmentProxy a(BaseICartFragment baseICartFragment) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BaseICartFragmentProxy) ipChange.ipc$dispatch("a252f26c", new Object[]{baseICartFragment});
            }
            return new com.taobao.android.icart.a(baseICartFragment);
        }

        public static BaseICartFragmentProxy b(BaseICartFragment baseICartFragment, Intent intent, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BaseICartFragmentProxy) ipChange.ipc$dispatch("d798f570", new Object[]{baseICartFragment, intent, new Boolean(z)});
            }
            boolean b = anj.b();
            boolean a2 = anj.a();
            boolean a3 = ykl.a();
            if (b || a2 || a3) {
                hav.d(c9x.TAG, "createProxy i18n=" + b + ",elder=" + a2 + ",pad=" + a3);
                return a(baseICartFragment);
            } else if (OrangeUtil.isWeexCart()) {
                return d(baseICartFragment, intent, z);
            } else {
                return a(baseICartFragment);
            }
        }

        public static BaseICartFragmentProxy c(BaseICartFragment baseICartFragment) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BaseICartFragmentProxy) ipChange.ipc$dispatch("d7406f1", new Object[]{baseICartFragment});
            }
            return new WebFragmentProxyImpl(baseICartFragment);
        }

        public static BaseICartFragmentProxy d(BaseICartFragment baseICartFragment, Intent intent, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BaseICartFragmentProxy) ipChange.ipc$dispatch("fb023385", new Object[]{baseICartFragment, intent, new Boolean(z)});
            }
            if (intent == null) {
                intent = new Intent();
            }
            return new WeexFragmentProxyImpl(baseICartFragment, intent, z);
        }
    }

    static {
        t2o.a(478150657);
    }

    public BaseICartFragment() {
        if (s2()) {
            this.f7941a = p2(null);
        }
    }

    public static /* synthetic */ Object ipc$super(BaseICartFragment baseICartFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2147180915:
                super.onSaveInstanceState((Bundle) objArr[0]);
                return null;
            case -1711976255:
                super.onSupportPreInVisible();
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
            case 188604040:
                super.onStop();
                return null;
            case 462397159:
                super.onDestroyView();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1011911513:
                super.setArguments((Bundle) objArr[0]);
                return null;
            case 1270686685:
                super.onLowMemory();
                return null;
            case 1950489833:
                super.onSupportVisible();
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/BaseICartFragment");
        }
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3f6edf1", new Object[]{this})).booleanValue();
        }
        return this.S0;
    }

    @Override // com.taobao.tao.TBBaseFragment
    public String getUTPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("34b6390a", new Object[]{this});
        }
        BaseICartFragmentProxy baseICartFragmentProxy = this.f7941a;
        if (baseICartFragmentProxy == null) {
            return "";
        }
        return baseICartFragmentProxy.j();
    }

    @Override // com.taobao.tao.TBBaseFragment
    public void handleLoginAction(LoginAction loginAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e52feba", new Object[]{this, loginAction});
            return;
        }
        BaseICartFragmentProxy baseICartFragmentProxy = this.f7941a;
        if (baseICartFragmentProxy != null) {
            baseICartFragmentProxy.k(loginAction);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        } else {
            this.f7941a.l(i, i2, intent);
        }
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        this.d = bundle;
        v2();
        this.f7941a.m(bundle);
        g2o.a(getActivity(), bundle, this.f7941a.h());
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        View n = this.f7941a.n(layoutInflater, viewGroup, bundle);
        if (n != null && (n.getParent() instanceof ViewGroup)) {
            ((ViewGroup) n.getParent()).removeView(n);
        }
        this.c = n;
        return n;
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.f7941a.o();
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
            return;
        }
        super.onDestroyView();
        this.f7941a.p();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
            return;
        }
        super.onLowMemory();
        this.f7941a.q();
    }

    @Override // com.taobao.tao.TBBaseFragment
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
        } else {
            this.f7941a.r(intent);
        }
    }

    @Override // com.taobao.tao.TBBaseFragment
    public boolean onPanelKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f42cd860", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        BaseICartFragmentProxy baseICartFragmentProxy = this.f7941a;
        if (baseICartFragmentProxy == null || !baseICartFragmentProxy.s(i, keyEvent)) {
            return false;
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
        this.f7941a.t();
        this.R0 = System.currentTimeMillis();
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        this.f7941a.u(false);
        this.S0 = true;
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80049e8d", new Object[]{this, bundle});
            return;
        }
        super.onSaveInstanceState(bundle);
        this.f7941a.v(bundle);
        if (bundle != null) {
            bundle.putLong("fragmentPauseTime", this.R0);
            if (s2() && com.taobao.tao.navigation.a.o() != null) {
                bundle.putString("curTab", com.taobao.tao.navigation.a.o().getCurrentTabTag());
            }
        }
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        this.f7941a.w();
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        this.f7941a.x();
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, com.taobao.tao.tbmainfragment.ISupportFragment
    public void onSupportInvisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a40c5aa4", new Object[]{this});
            return;
        }
        super.onSupportInvisible();
        this.f7941a.y();
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment
    public void onSupportPreInVisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99f550c1", new Object[]{this});
            return;
        }
        super.onSupportPreInVisible();
        this.f7941a.z();
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, com.taobao.tao.tbmainfragment.ISupportFragment
    public void onSupportVisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74421ce9", new Object[]{this});
            return;
        }
        super.onSupportVisible();
        this.f7941a.A();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
        } else {
            this.f7941a.B(view, bundle);
        }
    }

    public abstract BaseICartFragmentProxy p2(Bundle bundle);

    public BaseICartFragmentProxy r2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseICartFragmentProxy) ipChange.ipc$dispatch("2ce98581", new Object[]{this});
        }
        return this.f7941a;
    }

    public abstract boolean s2();

    @Override // androidx.fragment.app.Fragment
    public void setArguments(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c508b59", new Object[]{this, bundle});
            return;
        }
        super.setArguments(bundle);
        if (!s2() && this.f7941a == null) {
            this.f7941a = p2(bundle);
        }
    }

    public final void v2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d7fce78", new Object[]{this});
        } else if (cw6.b()) {
            int i = a.$SwitchMap$com$taobao$android$icart$BaseICartFragmentProxy$FragmentProxyType[this.f7941a.h().ordinal()];
            if (i == 1) {
                z4v.a(Globals.getApplication(), "进入Weex购物车！");
            } else if (i == 2) {
                z4v.a(Globals.getApplication(), "进入Native购物车！");
            } else if (i == 3) {
                z4v.a(Globals.getApplication(), "进入Web购物车！");
            }
        }
    }

    public boolean u2(BaseICartFragmentProxy baseICartFragmentProxy) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d430f615", new Object[]{this, baseICartFragmentProxy})).booleanValue();
        }
        if (this.f7941a == baseICartFragmentProxy) {
            hav.d(c9x.TAG, "replaceFragmentProxy proxy是同一个");
            return false;
        }
        StringBuilder sb = new StringBuilder("降级fragmentIsResume=");
        sb.append(isResumed());
        sb.append(",saveInstance是否为空：");
        sb.append(this.d == null);
        sb.append(",mRootView是否为空：");
        if (this.c == null) {
            z = true;
        }
        sb.append(z);
        sb.append(",current=");
        sb.append(this.f7941a.h());
        sb.append(",changeTo=");
        sb.append(baseICartFragmentProxy.h());
        hav.d(c9x.TAG, sb.toString());
        this.f7941a.t();
        this.f7941a.x();
        this.f7941a.p();
        this.f7941a.o();
        View view = this.c;
        if (view == null) {
            this.f7941a = baseICartFragmentProxy;
            baseICartFragmentProxy.m(this.d);
            return true;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        viewGroup.removeAllViews();
        this.f7941a = baseICartFragmentProxy;
        baseICartFragmentProxy.m(this.d);
        viewGroup.addView(this.f7941a.n(LayoutInflater.from(Globals.getApplication()), null, null), new ViewGroup.LayoutParams(-1, -1));
        this.f7941a.B(this.mRootView, null);
        if (isResumed()) {
            this.f7941a.w();
            this.f7941a.u(true);
        }
        return true;
    }
}
