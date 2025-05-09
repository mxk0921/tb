package tb;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.controller2.TaoLiveRealController;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenLiveRoom;
import com.taobao.taolive.sdk.core.interfaces.ISmallWindowStrategy;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.utils.VideoStatus;
import java.util.Map;
import tb.jzk;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class obt extends df implements jyd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final jyd g;
    public final String f = "TaoliveOpenMixPlatformImpl";
    public final g1a<n2g<Object>, xhv> h = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements g1a<n2g<Object>, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        /* renamed from: a */
        public xhv invoke(n2g<Object> n2gVar) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xhv) ipChange.ipc$dispatch("cd729a02", new Object[]{this, n2gVar});
            }
            String d = n2gVar.b().d();
            jzk.a aVar = jzk.Companion;
            if (aVar.u().b().equals(d)) {
                x5t.f(obt.c0(obt.this), "OpenArch Lifecycle👉🏻 onCreate");
                obt.this.onCreate();
                return null;
            } else if (aVar.B().b().equals(d)) {
                x5t.f(obt.c0(obt.this), "OpenArch Lifecycle👉🏻 onStart");
                obt.this.onStart();
                return null;
            } else if (aVar.w().b().equals(d)) {
                x5t.f(obt.c0(obt.this), "OpenArch Lifecycle👉🏻 onResume");
                obt.this.onResume();
                return null;
            } else if (aVar.C().b().equals(d)) {
                x5t.f(obt.c0(obt.this), "OpenArch Lifecycle👉🏻 onPause");
                obt.this.onPause();
                return null;
            } else if (aVar.x().b().equals(d)) {
                x5t.f(obt.c0(obt.this), "OpenArch Lifecycle👉🏻 onStop");
                if (n2gVar.a() == null || !(n2gVar.a() instanceof kzk)) {
                    obt.this.onStop(true);
                    return null;
                }
                Object obj = ((kzk) n2gVar.a()).a().b().get("showSmallWindow");
                obt obtVar = obt.this;
                if (obj instanceof Boolean) {
                    z = ((Boolean) obj).booleanValue();
                }
                obtVar.onStop(z);
                return null;
            } else if (!aVar.v().b().equals(d)) {
                return null;
            } else {
                x5t.f(obt.c0(obt.this), "OpenArch Lifecycle👉🏻 Destroy");
                obt.this.onDestroy();
                return null;
            }
        }
    }

    static {
        t2o.a(779093040);
        t2o.a(779092845);
    }

    public obt(Activity activity, String str, y3s y3sVar, TaoliveOpenLiveRoom taoliveOpenLiveRoom) {
        Z(this);
        this.g = new TaoLiveRealController(activity, str, y3sVar, taoliveOpenLiveRoom);
        if (taoliveOpenLiveRoom != null) {
            S(taoliveOpenLiveRoom.kmpIdentifier);
        }
    }

    public static /* synthetic */ String c0(obt obtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9e327bbb", new Object[]{obtVar});
        }
        return obtVar.f;
    }

    public static /* synthetic */ Object ipc$super(obt obtVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/openarchitecture/mix/impl/TaoliveOpenMixPlatformImpl");
    }

    @Override // tb.jyd
    public Map<String, String> D(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d5cb7969", new Object[]{this, str});
        }
        jyd jydVar = this.g;
        if (jydVar != null) {
            return ((TaoLiveRealController) jydVar).D(str);
        }
        return null;
    }

    @Override // tb.jyd
    public String E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4b7fe04c", new Object[]{this});
        }
        jyd jydVar = this.g;
        if (jydVar != null) {
            return jydVar.E();
        }
        return null;
    }

    @Override // tb.jyd
    public void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af4a6e0d", new Object[]{this});
            return;
        }
        jyd jydVar = this.g;
        if (jydVar != null) {
            ((TaoLiveRealController) jydVar).H();
        }
    }

    @Override // tb.jyd
    public void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e05a9ba0", new Object[]{this});
            return;
        }
        jyd jydVar = this.g;
        if (jydVar != null) {
            ((TaoLiveRealController) jydVar).J();
        }
    }

    @Override // tb.df
    public void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76627729", new Object[]{this});
            return;
        }
        jyd jydVar = this.g;
        if (jydVar instanceof TaoLiveRealController) {
            ((TaoLiveRealController) jydVar).v0();
        }
    }

    @Override // tb.df
    public Object L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8263caf0", new Object[]{this});
        }
        jyd jydVar = this.g;
        if (!(jydVar == null || jydVar.getGlobalContext() == null)) {
            this.g.getGlobalContext().getClass();
        }
        return null;
    }

    @Override // tb.df
    public boolean M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b8f9e31", new Object[]{this})).booleanValue();
        }
        jyd jydVar = this.g;
        if (jydVar instanceof TaoLiveRealController) {
            return ((TaoLiveRealController) jydVar).J0();
        }
        return true;
    }

    @Override // tb.df
    public void S(String str) {
        m2g fetchEntity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f297880f", new Object[]{this, str});
        } else if (str != null && (fetchEntity = d9m.P().fetchEntity(str)) != null && fetchEntity.j() != null) {
            fetchEntity.j().g(q2g.Companion.b(), toy.Companion.b(), this.h);
            x5t.d("KMPOpenArch", "openArchEntity register LifeCycleEvent");
        }
    }

    @Override // tb.df
    public void V(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9df4207f", new Object[]{this, obj});
            return;
        }
        jyd jydVar = this.g;
        if (jydVar instanceof TaoLiveRealController) {
            ((TaoLiveRealController) jydVar).r1(obj);
        }
    }

    @Override // tb.df
    public void W(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f3e9f2d", new Object[]{this, obj});
            return;
        }
        x5t.d("onTabUnselected", "TaoliveOpenMixPlatformImpl调用");
        jyd jydVar = this.g;
        if (jydVar instanceof TaoLiveRealController) {
            ((TaoLiveRealController) jydVar).s1(obj);
        }
    }

    @Override // tb.jyd
    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd937839", new Object[]{this})).booleanValue();
        }
        jyd jydVar = this.g;
        if (jydVar != null) {
            return jydVar.d();
        }
        return false;
    }

    @Override // tb.jyd
    public void e(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a8722e3", new Object[]{this, onClickListener});
            return;
        }
        jyd jydVar = this.g;
        if (jydVar != null) {
            jydVar.e(onClickListener);
        }
    }

    @Override // tb.jyd
    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47de00e4", new Object[]{this})).booleanValue();
        }
        jyd jydVar = this.g;
        if (jydVar != null) {
            return jydVar.g();
        }
        return false;
    }

    @Override // tb.jyd
    public cba getGlobalContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cba) ipChange.ipc$dispatch("7f95b5cc", new Object[]{this});
        }
        jyd jydVar = this.g;
        if (jydVar != null) {
            return jydVar.getGlobalContext();
        }
        return null;
    }

    @Override // tb.jyd
    public RecyclerView getRecyclerView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("23bc5268", new Object[]{this});
        }
        jyd jydVar = this.g;
        if (jydVar != null) {
            return jydVar.getRecyclerView();
        }
        return null;
    }

    @Override // tb.jyd
    public ViewGroup getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("cbb4b1b3", new Object[]{this});
        }
        jyd jydVar = this.g;
        if (jydVar != null) {
            return jydVar.getView();
        }
        return null;
    }

    @Override // tb.jyd
    public void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf4667d7", new Object[]{this, new Boolean(z)});
            return;
        }
        jyd jydVar = this.g;
        if (jydVar != null) {
            jydVar.h(z);
        }
    }

    @Override // tb.jyd
    public void i(utk utkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4834220", new Object[]{this, utkVar});
            return;
        }
        jyd jydVar = this.g;
        if (jydVar != null) {
            jydVar.i(utkVar);
        }
    }

    @Override // tb.jyd
    public boolean isDestroyed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d65bd1a", new Object[]{this})).booleanValue();
        }
        jyd jydVar = this.g;
        if (jydVar != null) {
            return jydVar.isDestroyed();
        }
        return false;
    }

    @Override // tb.jyd
    public void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc4a3165", new Object[]{this, new Boolean(z)});
            return;
        }
        jyd jydVar = this.g;
        if (jydVar != null) {
            jydVar.j(z);
        }
    }

    @Override // tb.jyd
    public void k(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b3e51b4", new Object[]{this, new Boolean(z)});
            return;
        }
        jyd jydVar = this.g;
        if (jydVar != null) {
            jydVar.k(z);
        }
    }

    @Override // tb.jyd
    public void o(u0v u0vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5323171f", new Object[]{this, u0vVar});
            return;
        }
        jyd jydVar = this.g;
        if (jydVar != null) {
            jydVar.o(u0vVar);
        }
    }

    @Override // tb.jyd
    public void onConfigurationChanged(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
            return;
        }
        jyd jydVar = this.g;
        if (jydVar != null) {
            jydVar.onConfigurationChanged(configuration);
        }
    }

    @Override // tb.jyd
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        jyd jydVar = this.g;
        if (jydVar != null) {
            jydVar.onCreate();
        }
    }

    @Override // tb.jyd
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        jyd jydVar = this.g;
        if (jydVar != null) {
            ((TaoLiveRealController) jydVar).onDestroy();
        }
    }

    @Override // tb.jyd
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        jyd jydVar = this.g;
        if (jydVar != null) {
            return ((TaoLiveRealController) jydVar).onKeyDown(i, keyEvent);
        }
        return false;
    }

    @Override // tb.jyd
    public void onLowMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
            return;
        }
        jyd jydVar = this.g;
        if (jydVar != null) {
            jydVar.onLowMemory();
        }
    }

    @Override // tb.jyd
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        jyd jydVar = this.g;
        if (jydVar != null) {
            ((TaoLiveRealController) jydVar).onPause();
        }
    }

    @Override // tb.jyd
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        jyd jydVar = this.g;
        if (jydVar != null) {
            ((TaoLiveRealController) jydVar).onResume();
        }
    }

    @Override // tb.jyd
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        jyd jydVar = this.g;
        if (jydVar != null) {
            jydVar.onStart();
        }
    }

    @Override // tb.jyd
    public void onStop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c7ea54c", new Object[]{this, new Boolean(z)});
            return;
        }
        jyd jydVar = this.g;
        if (jydVar != null) {
            jydVar.onStop(z);
        }
    }

    @Override // tb.jyd
    public void onTrimMemory(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c69db59a", new Object[]{this, new Integer(i)});
            return;
        }
        jyd jydVar = this.g;
        if (jydVar != null) {
            jydVar.onTrimMemory(i);
        }
    }

    @Override // tb.jyd
    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93ece154", new Object[]{this});
            return;
        }
        jyd jydVar = this.g;
        if (jydVar != null) {
            ((TaoLiveRealController) jydVar).r();
        }
    }

    @Override // tb.jyd
    public View s(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("2d69c511", new Object[]{this, new Boolean(z)});
        }
        jyd jydVar = this.g;
        if (jydVar != null) {
            return jydVar.s(z);
        }
        return null;
    }

    @Override // tb.jyd
    public void setSmallWindowClickListener(ISmallWindowStrategy iSmallWindowStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707f1784", new Object[]{this, iSmallWindowStrategy});
            return;
        }
        jyd jydVar = this.g;
        if (jydVar != null) {
            jydVar.setSmallWindowClickListener(iSmallWindowStrategy);
        }
    }

    @Override // tb.jyd
    public void t(Uri uri, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e67628e5", new Object[]{this, uri, new Boolean(z), new Boolean(z2)});
            return;
        }
        jyd jydVar = this.g;
        if (jydVar != null) {
            ((TaoLiveRealController) jydVar).t(uri, z, z2);
        }
    }

    @Override // tb.jyd
    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49b923d2", new Object[]{this});
            return;
        }
        jyd jydVar = this.g;
        if (jydVar != null) {
            ((TaoLiveRealController) jydVar).u();
        }
    }

    @Override // tb.jyd
    public void v(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5ec3811", new Object[]{this, onClickListener});
            return;
        }
        jyd jydVar = this.g;
        if (jydVar != null) {
            jydVar.v(onClickListener);
        }
    }

    @Override // tb.jyd
    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69e6b4d6", new Object[]{this});
            return;
        }
        jyd jydVar = this.g;
        if (jydVar != null) {
            jydVar.x();
        }
    }

    @Override // tb.jyd
    public void y(Intent intent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91d7315", new Object[]{this, intent, new Boolean(z)});
            return;
        }
        jyd jydVar = this.g;
        if (jydVar != null) {
            ((TaoLiveRealController) jydVar).y(intent, z);
        }
    }

    @Override // tb.jyd
    public void z(muk mukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d85e17f", new Object[]{this, mukVar});
            return;
        }
        jyd jydVar = this.g;
        if (jydVar != null) {
            jydVar.z(mukVar);
        }
    }

    @Override // tb.df
    public boolean T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97890f26", new Object[]{this})).booleanValue();
        }
        x5t.d("isInSmallMode", "TaoliveOpenMixPlatformImpl调用");
        jyd jydVar = this.g;
        if (jydVar instanceof TaoLiveRealController) {
            return ((TaoLiveRealController) jydVar).j1();
        }
        return false;
    }

    @Override // tb.df
    public boolean U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73e036b7", new Object[]{this})).booleanValue();
        }
        if (pvs.I0()) {
            return ((TaoLiveRealController) this.g).onKeyDown(4, new KeyEvent(0, 4));
        }
        if (up6.d0(vx9.d()) != VideoStatus.VIDEO_TIMESHIFT_STATUS) {
            return false;
        }
        VideoInfo c0 = up6.c0(vx9.d());
        dxa b = dxa.b(vx9.d());
        if (c0 != null && c0.status == 0 && up6.Y(vx9.d()) == 0) {
            jyd jydVar = this.g;
            String str = "timemoveReturn";
            if (jydVar != null && ((TaoLiveRealController) jydVar).getGlobalContext() != null && uwa.p() && !TextUtils.isEmpty(((TaoLiveRealController) this.g).getGlobalContext().F)) {
                str = "timemoveReturn." + ((TaoLiveRealController) this.g).getGlobalContext().F;
            }
            if (b.f() != null) {
                b.f().j(vx9.d(), str);
            }
        } else if (b.f() != null) {
            b.f().d(vx9.d(), null);
        }
        return true;
    }

    @Override // tb.jyd
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        } else {
            onStop(true);
        }
    }

    public obt(Activity activity, Intent intent, TaoliveOpenLiveRoom taoliveOpenLiveRoom) {
        Z(this);
        this.g = new TaoLiveRealController(activity, intent, taoliveOpenLiveRoom);
        if (taoliveOpenLiveRoom != null) {
            S(taoliveOpenLiveRoom.kmpIdentifier);
        }
    }
}
