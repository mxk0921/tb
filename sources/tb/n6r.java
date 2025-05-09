package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.android.layoutmanager.module.NavigationTabModule;
import com.taobao.tao.TBMainHost;
import com.taobao.tao.flexbox.layoutmanager.container.MainDexContainerFragment;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import com.taobao.tao.navigation.NavigationTabIconSourceType;
import com.taobao.tao.navigation.TBFragmentTabHost;
import com.taobao.tao.tbmainfragment.TBMainFragment;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.fhb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class n6r implements fhb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f24543a = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements hvd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.hvd
        public void onTabChanged(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91f35fc8", new Object[]{this, new Integer(i), str});
            } else {
                n6r.b(n6r.this, i);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements ypj {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ fhb.d f24545a;

        public b(n6r n6rVar, fhb.d dVar) {
            this.f24545a = dVar;
        }

        @Override // tb.ypj
        public void onCurrentTabClicked() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f77f6793", new Object[]{this});
                return;
            }
            fhb.d dVar = this.f24545a;
            if (dVar != null) {
                ((MainDexContainerFragment) dVar).onCurrentTabClicked();
            }
        }

        @Override // tb.ypj
        public void onCurrentTabDoubleTap() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c22ad2be", new Object[]{this});
            }
        }

        @Override // tb.ypj
        public void onCurrentTabLongClicked() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("79eae8f7", new Object[]{this});
            }
        }

        @Override // tb.ypj
        public void onNavigationTabMessageChanged(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3fd5f3e0", new Object[]{this, str});
            }
        }
    }

    static {
        t2o.a(502267934);
        t2o.a(503316575);
    }

    public n6r() {
        com.taobao.tao.navigation.a.h(new a());
    }

    public static /* synthetic */ int b(n6r n6rVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9a59ef00", new Object[]{n6rVar, new Integer(i)})).intValue();
        }
        n6rVar.f24543a = i;
        return i;
    }

    public static boolean d(Context context) {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b7b1864e", new Object[]{context})).booleanValue();
        }
        if (context instanceof aaj) {
            intent = ((aaj) context).getOriginIntent();
        } else if (context instanceof Activity) {
            intent = ((Activity) context).getIntent();
        } else {
            intent = null;
        }
        if (intent != null) {
            return bqg.b(intent);
        }
        return false;
    }

    @Override // tb.fhb
    public void A(fhb.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0d9c266", new Object[]{this, cVar});
        } else {
            com.taobao.tao.navigation.a.h(cVar);
        }
    }

    @Override // tb.fhb
    public void B(fhb.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4d6c5a1", new Object[]{this, aVar});
        } else {
            com.taobao.tao.navigation.a.H(aVar);
        }
    }

    @Override // tb.fhb
    public boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad3320b5", new Object[]{this})).booleanValue();
        }
        return com.taobao.tao.navigation.a.y();
    }

    @Override // tb.fhb
    public void D(int i, fhb.d dVar) {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef97f8ec", new Object[]{this, new Integer(i), dVar});
            return;
        }
        if (dVar == null) {
            bVar = null;
        } else {
            bVar = new b(this, dVar);
        }
        com.taobao.tao.navigation.a.T(i, bVar);
    }

    @Override // tb.fhb
    public boolean E(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f8ca9aad", new Object[]{this, str, context})).booleanValue();
        }
        boolean d = d(context);
        return (d || str == null) ? d : TextUtils.equals(Uri.parse(str).getQueryParameter(bps.CONFIG_LAUNCH), "0");
    }

    @Override // tb.fhb
    public boolean F(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("33e7adfa", new Object[]{this, new Integer(i)})).booleanValue();
        }
        TBFragmentTabHost o = com.taobao.tao.navigation.a.o();
        if (o != null) {
            if (o.getCurrentTab() == i) {
                return true;
            }
            return false;
        } else if (this.f24543a == i) {
            return true;
        } else {
            return false;
        }
    }

    @Override // tb.fhb
    public void G(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7307c2f1", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        if (z2) {
            com.taobao.tao.navigation.a.w(z);
        } else {
            com.taobao.tao.navigation.a.v(z);
        }
        NavigationTabModule.notifyNavigationShowHideStatus(z);
    }

    @Override // tb.fhb
    public boolean H() {
        List<Fragment> fragments;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7f6c35", new Object[]{this})).booleanValue();
        }
        Activity a2 = a();
        if ((a2 instanceof FragmentActivity) && (fragments = ((FragmentActivity) a2).getSupportFragmentManager().getFragments()) != null) {
            for (Fragment fragment : fragments) {
                if (fragment instanceof TBMainFragment) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // tb.fhb
    public boolean J(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f081c33", new Object[]{this, context})).booleanValue();
        }
        if (TBMainHost.a(context) != null) {
            return true;
        }
        return false;
    }

    @Override // tb.fhb
    public void K(fhb.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3b028c5", new Object[]{this, bVar});
        } else {
            com.taobao.tao.navigation.a.V(bVar);
        }
    }

    @Override // tb.fhb
    public boolean L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("163384f", new Object[]{this})).booleanValue();
        }
        if (c() == 0) {
            return true;
        }
        return false;
    }

    @Override // tb.fhb
    public void M(int i, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("957df62b", new Object[]{this, new Integer(i), str, str2, str3});
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        boolean isEmpty3 = TextUtils.isEmpty(str3);
        if (!isEmpty || !isEmpty2 || !isEmpty3) {
            com.taobao.tao.navigation.b m = com.taobao.tao.navigation.a.m(i);
            if (!isEmpty && !isEmpty2) {
                int q = s6o.q(o.J(), str);
                int q2 = s6o.q(o.J(), str2);
                m.L(NavigationTabIconSourceType.DRAWABLE);
                m.J(new Pair(Integer.valueOf(q2), Integer.valueOf(q)));
            }
            if (!isEmpty3) {
                m.Y(str3);
            }
            com.taobao.tao.navigation.a.k0(i, m);
        }
    }

    @Override // tb.fhb
    public void N(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dffe2e4", new Object[]{this, new Integer(i)});
        } else {
            com.taobao.tao.navigation.a.M(i);
        }
    }

    @Override // tb.fhb
    public int O(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("627a1f49", new Object[]{this, context, new Integer(i)})).intValue();
        }
        if (TBMainHost.a(context) != null) {
            try {
                TBFragmentTabHost o = com.taobao.tao.navigation.a.o();
                int height = o.getHeight();
                View findViewById = o.findViewById(R.id.uik_navigation_tab_background);
                if (findViewById != null && findViewById.getHeight() > 0) {
                    height = findViewById.getHeight();
                }
                return height + i;
            } catch (Exception unused) {
            }
        }
        return i;
    }

    @Override // tb.fhb
    public Map<String, Object> P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("af5cacb2", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        chb g = c21.g();
        if (g != null) {
            long j = g.getLong("launchInteractiveTime", -1L);
            long j2 = g.getLong("startProcessSystemTime", -1L);
            long currentTimeMillis = System.currentTimeMillis();
            if (j != -1) {
                j = currentTimeMillis - (SystemClock.uptimeMillis() - j);
            }
            if (j2 != -1) {
                hashMap.put(fhb.APM_TIME_FROM_LAUNCH, Long.valueOf(currentTimeMillis - j2));
            }
            hashMap.put(fhb.APM_HOME_LAUNCH_TIME, Long.valueOf(j));
            hashMap.put(fhb.APM_IS_EXTERNAL_LINK, Boolean.valueOf(e0o.d()));
        }
        return hashMap;
    }

    @Override // tb.fhb
    public ViewGroup Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("170a3faf", new Object[]{this});
        }
        return com.taobao.tao.navigation.a.o();
    }

    @Override // tb.fhb
    public boolean R(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c73b8fd", new Object[]{this, str})).booleanValue();
        }
        if (str != null) {
            try {
                return bps.v(Uri.parse(str));
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    @Override // tb.fhb
    public Activity a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("51a25fe3", new Object[]{this});
        }
        TBFragmentTabHost o = com.taobao.tao.navigation.a.o();
        if (o == null || !(o.getContext() instanceof Activity)) {
            return null;
        }
        return (Activity) o.getContext();
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a5efd87d", new Object[]{this})).intValue();
        }
        return LauncherRuntime.k;
    }

    @Override // tb.fhb
    public int z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3327aecc", new Object[]{this})).intValue();
        }
        TBFragmentTabHost o = com.taobao.tao.navigation.a.o();
        if (o != null) {
            return o.getCurrentTab();
        }
        return 0;
    }

    @Override // tb.fhb
    public void I(Object obj, Object obj2, boolean z, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a389dd7", new Object[]{this, obj, obj2, new Boolean(z), num});
            return;
        }
        TBFragmentTabHost o = com.taobao.tao.navigation.a.o();
        if (o != null) {
            FragmentActivity activity = o.getCurrentFragment() != null ? o.getCurrentFragment().getActivity() : null;
            if (z) {
                o.setUnSeletedNavigationTabsColorFilter(-1, null, null);
                if (num != null) {
                    s6o.L(activity, num.intValue());
                }
                if (akt.p2("setStatusBarInTab", false)) {
                    s6o.M(activity, 0, true);
                    return;
                }
                return;
            }
            o.setUnSeletedNavigationTabsColorFilter(1, Integer.valueOf(ir2.j(obj)), Integer.valueOf(ir2.j(obj2)));
            s6o.L(activity, ir2.j(obj2));
            if (akt.p2("setStatusBarInTab", false)) {
                s6o.M(activity, 0, false);
            }
        }
    }
}
