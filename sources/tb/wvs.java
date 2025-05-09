package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import com.taobao.taolive.sdk.core.interfaces.ISmallWindowStrategy;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class wvs implements jyd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final jyd f30959a;

    static {
        t2o.a(779092876);
        t2o.a(779092845);
    }

    public wvs(Activity activity, String str, y3s y3sVar) {
        this.f30959a = xvs.b(activity, str, y3sVar);
    }

    @Override // tb.jyd
    public Map<String, String> D(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d5cb7969", new Object[]{this, str});
        }
        return this.f30959a.D(str);
    }

    @Override // tb.jyd
    public String E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4b7fe04c", new Object[]{this});
        }
        return this.f30959a.E();
    }

    @Override // tb.jyd
    public void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af4a6e0d", new Object[]{this});
        } else {
            this.f30959a.H();
        }
    }

    @Override // tb.jyd
    public void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e05a9ba0", new Object[]{this});
        } else {
            this.f30959a.J();
        }
    }

    @Override // tb.jyd
    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd937839", new Object[]{this})).booleanValue();
        }
        return this.f30959a.d();
    }

    @Override // tb.jyd
    public void e(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a8722e3", new Object[]{this, onClickListener});
        } else {
            this.f30959a.e(onClickListener);
        }
    }

    @Override // tb.jyd
    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47de00e4", new Object[]{this})).booleanValue();
        }
        return this.f30959a.g();
    }

    @Override // tb.jyd
    public cba getGlobalContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cba) ipChange.ipc$dispatch("7f95b5cc", new Object[]{this});
        }
        return this.f30959a.getGlobalContext();
    }

    @Override // tb.jyd
    public RecyclerView getRecyclerView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("23bc5268", new Object[]{this});
        }
        return this.f30959a.getRecyclerView();
    }

    @Override // tb.jyd
    public ViewGroup getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("cbb4b1b3", new Object[]{this});
        }
        return this.f30959a.getView();
    }

    @Override // tb.jyd
    public void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf4667d7", new Object[]{this, new Boolean(z)});
        } else {
            this.f30959a.h(z);
        }
    }

    @Override // tb.jyd
    public void i(utk utkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4834220", new Object[]{this, utkVar});
        } else {
            this.f30959a.i(utkVar);
        }
    }

    @Override // tb.jyd
    public boolean isDestroyed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d65bd1a", new Object[]{this})).booleanValue();
        }
        return this.f30959a.isDestroyed();
    }

    @Override // tb.jyd
    public void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc4a3165", new Object[]{this, new Boolean(z)});
        } else {
            this.f30959a.j(z);
        }
    }

    @Override // tb.jyd
    public void k(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b3e51b4", new Object[]{this, new Boolean(z)});
        } else {
            this.f30959a.k(z);
        }
    }

    @Override // tb.jyd
    public void o(u0v u0vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5323171f", new Object[]{this, u0vVar});
        } else {
            this.f30959a.o(u0vVar);
        }
    }

    @Override // tb.jyd
    public void onConfigurationChanged(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
        } else {
            this.f30959a.onConfigurationChanged(configuration);
        }
    }

    @Override // tb.jyd
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        } else {
            this.f30959a.onCreate();
        }
    }

    @Override // tb.jyd
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            this.f30959a.onDestroy();
        }
    }

    @Override // tb.jyd
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        return this.f30959a.onKeyDown(i, keyEvent);
    }

    @Override // tb.jyd
    public void onLowMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
        } else {
            this.f30959a.onLowMemory();
        }
    }

    @Override // tb.jyd
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            this.f30959a.onPause();
        }
    }

    @Override // tb.jyd
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else {
            this.f30959a.onResume();
        }
    }

    @Override // tb.jyd
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        } else {
            this.f30959a.onStart();
        }
    }

    @Override // tb.jyd
    public void onStop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c7ea54c", new Object[]{this, new Boolean(z)});
        } else {
            this.f30959a.onStop(z);
        }
    }

    @Override // tb.jyd
    public void onTrimMemory(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c69db59a", new Object[]{this, new Integer(i)});
        } else {
            this.f30959a.onTrimMemory(i);
        }
    }

    @Override // tb.jyd
    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93ece154", new Object[]{this});
        } else {
            this.f30959a.r();
        }
    }

    @Override // tb.jyd
    public View s(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("2d69c511", new Object[]{this, new Boolean(z)});
        }
        return this.f30959a.s(z);
    }

    @Override // tb.jyd
    public void setSmallWindowClickListener(ISmallWindowStrategy iSmallWindowStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707f1784", new Object[]{this, iSmallWindowStrategy});
        } else {
            this.f30959a.setSmallWindowClickListener(iSmallWindowStrategy);
        }
    }

    @Override // tb.jyd
    public void t(Uri uri, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e67628e5", new Object[]{this, uri, new Boolean(z), new Boolean(z2)});
        } else {
            this.f30959a.t(uri, z, z2);
        }
    }

    @Override // tb.jyd
    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49b923d2", new Object[]{this});
        } else {
            this.f30959a.u();
        }
    }

    @Override // tb.jyd
    public void v(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5ec3811", new Object[]{this, onClickListener});
        } else {
            this.f30959a.v(onClickListener);
        }
    }

    @Override // tb.jyd
    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69e6b4d6", new Object[]{this});
        } else {
            this.f30959a.x();
        }
    }

    @Override // tb.jyd
    public void y(Intent intent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91d7315", new Object[]{this, intent, new Boolean(z)});
        } else {
            this.f30959a.y(intent, z);
        }
    }

    @Override // tb.jyd
    public void z(muk mukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d85e17f", new Object[]{this, mukVar});
        } else {
            this.f30959a.z(mukVar);
        }
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("586c4111", new Object[]{context});
            return;
        }
        FlexaLiveX.o().z(FlexaLiveX.ATYPE, false, context);
        FlexaLiveX.o().z(FlexaLiveX.BTYPE, false, context);
        d9m.n().setActionAdapter(new xfj());
        d9m.n().setNavAdapter(new agj());
        d9m.n().setTrackAdapter(new mgj());
        d9m.n().setH5TabFrameAdapter(d9m.p().createGoodsH5TabFrameAdapter());
        d9m.n().setGoodFrameAdapter(new xda());
    }

    @Override // tb.jyd
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        } else {
            this.f30959a.onStop();
        }
    }

    public wvs(Activity activity, Intent intent) {
        this.f30959a = xvs.a(activity, intent);
    }
}
