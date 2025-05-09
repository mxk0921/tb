package com.taobao.edlp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.edlp.tabbar.IEdlpTabBarActionButtonProvider;
import com.taobao.login4android.api.Login;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.Globals;
import com.taobao.tao.TBBaseFragment;
import com.taobao.tao.log.TLog;
import com.taobao.tao.navigation.a;
import tb.a68;
import tb.a9f;
import tb.aba;
import tb.drm;
import tb.drs;
import tb.gqs;
import tb.t2o;
import tb.uaq;
import tb.uyw;
import tb.v4v;
import tb.ypj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class LowPriceFragment extends TBBaseFragment implements ypj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public FrameLayout f10398a;
    public final uyw c;
    public final gqs d;
    public final uaq e;
    public boolean g = false;
    public boolean h = true;
    public final IEdlpTabBarActionButtonProvider f = (IEdlpTabBarActionButtonProvider) aba.g().d(IEdlpTabBarActionButtonProvider.class);

    static {
        t2o.a(1032847362);
    }

    public LowPriceFragment() {
        TLog.loge("tab3edlp", " init LowPriceFragment " + Login.getUserId());
        uaq uaqVar = new uaq();
        this.e = uaqVar;
        uaqVar.c = System.currentTimeMillis();
        a9f.a(Globals.getApplication());
        a.Y(a68.TAG, this);
        this.c = new uyw(uaqVar);
        gqs g = gqs.g(Login.getUserId());
        this.d = g;
        g.k(uaqVar);
        uaqVar.d = System.currentTimeMillis();
        setUTPageName("Page_EDLP");
    }

    public static /* synthetic */ Object ipc$super(LowPriceFragment lowPriceFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
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
            case 188604040:
                super.onStop();
                return null;
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
                return null;
            case 1950489833:
                super.onSupportVisible();
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/edlp/LowPriceFragment");
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
        this.e.e = System.currentTimeMillis();
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        this.e.f = System.currentTimeMillis();
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        p2(getActivity());
        this.e.g = System.currentTimeMillis();
        return this.f10398a;
    }

    @Override // tb.ypj
    public void onCurrentTabClicked() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f77f6793", new Object[]{this});
        } else {
            TLog.loge("tab3edlp", "onCurrentTabClicked");
        }
    }

    @Override // tb.ypj
    public void onCurrentTabDoubleTap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c22ad2be", new Object[]{this});
        } else {
            this.c.g();
        }
    }

    @Override // tb.ypj
    public void onCurrentTabLongClicked() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79eae8f7", new Object[]{this});
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
        this.c.d();
        this.d.f();
    }

    @Override // tb.ypj
    public void onNavigationTabMessageChanged(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fd5f3e0", new Object[]{this, str});
        }
    }

    @Override // com.taobao.tao.TBBaseFragment
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        super.onNewIntent(intent);
        Uri data = intent.getData();
        if (data != null) {
            this.c.f(data.toString());
            TLog.loge("tab3edlp", "onNewIntent url is " + data);
        }
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        this.e.h = System.currentTimeMillis();
        super.onResume();
        if (this.f != null) {
            v4v.a(getActivity(), this.f.b());
        }
        this.c.c();
        this.e.i = System.currentTimeMillis();
        if (!this.g) {
            this.g = true;
        } else {
            OrangeConfig.getInstance().getConfig("edlp_business_switch", "alienVersion", "0");
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
        this.c.h();
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        this.c.i();
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, com.taobao.tao.tbmainfragment.ISupportFragment
    public void onSupportInvisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a40c5aa4", new Object[]{this});
            return;
        }
        super.onSupportInvisible();
        this.c.k();
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, com.taobao.tao.tbmainfragment.ISupportFragment
    public void onSupportVisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74421ce9", new Object[]{this});
            return;
        }
        super.onSupportVisible();
        this.c.j();
    }

    public void setTabClickTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a425b27b", new Object[]{this, new Long(j)});
        } else {
            this.c.m(j);
        }
    }

    public void p2(Activity activity) {
        String str;
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37b3bf02", new Object[]{this, activity});
        } else if (this.h) {
            if (this.f10398a == null) {
                this.f10398a = new FrameLayout(activity);
            }
            this.c.l(this.f10398a);
            IEdlpTabBarActionButtonProvider iEdlpTabBarActionButtonProvider = this.f;
            drs d = iEdlpTabBarActionButtonProvider != null ? iEdlpTabBarActionButtonProvider.d() : null;
            drm.a(d);
            this.h = false;
            if (activity.getIntent() == null || (data = activity.getIntent().getData()) == null || !data.toString().contains("taobao://edlp/root")) {
                str = "";
            } else {
                str = data.getQueryParameter("ext");
            }
            this.d.i(str, d);
            this.c.e(str, d, activity);
            TLog.loge("tab3edlp", "initEmbed|ext=" + str);
        }
    }
}
