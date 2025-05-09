package com.taobao.android.tab2liveroom.liveroom.immersive;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.YogaMeasureOutput;
import com.facebook.yoga.YogaNode;
import com.taobao.android.layoutmanager.module.NavigationTabModule;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenLiveRoom;
import com.taobao.taolive.room.openarchitecture.listener.PlatformListenerEnum;
import tb.akt;
import tb.alc;
import tb.kxd;
import tb.o3s;
import tb.od0;
import tb.p3h;
import tb.rjb;
import tb.s6o;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ImmersiveManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final alc f9510a;
    public final Context b;
    public boolean c = false;
    public NavigationTabModule.d d;
    public Object e;
    public boolean f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements rjb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.vpj
        public void M() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2918e2c9", new Object[]{this});
            }
        }

        @Override // tb.hvd
        public void onTabChanged(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91f35fc8", new Object[]{this, new Integer(i), str});
            }
        }

        @Override // com.taobao.tao.navigation.a.g
        public void reset() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("788e6256", new Object[]{this});
            }
        }

        @Override // tb.ujb
        public void r(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8cacfd02", new Object[]{this, new Boolean(z)});
                return;
            }
            o3s.b("ImmersiveManager", "沉浸式监听到底部TabBar显隐状态的改变，isVisible：" + z);
            ImmersiveManager.this.n(z ^ true);
            ImmersiveManager.this.i();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements NavigationTabModule.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.android.layoutmanager.module.NavigationTabModule.d
        public void F(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("78a4f1fd", new Object[]{this, new Boolean(z)});
                return;
            }
            o3s.b("ImmersiveManager", "沉浸式监听到底部TabBar显隐状态的改变，isHideStatus：" + z);
            ImmersiveManager.this.n(z);
            ImmersiveManager.this.i();
        }
    }

    static {
        t2o.a(779092134);
    }

    public ImmersiveManager(alc alcVar, Context context) {
        this.f9510a = alcVar;
        this.b = context;
    }

    public static /* synthetic */ Context a(ImmersiveManager immersiveManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("fd3f8a6c", new Object[]{immersiveManager});
        }
        return immersiveManager.b;
    }

    public JSONObject b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a0d32437", new Object[]{this, new Integer(i)});
        }
        return c(0, 0, 0, i);
    }

    public final JSONObject c(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5b132781", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("leftOffset", (Object) Integer.valueOf(i));
        jSONObject.put("topOffset", (Object) Integer.valueOf(i2));
        jSONObject.put("rightOffset", (Object) Integer.valueOf(i3));
        jSONObject.put("bottomOffset", (Object) Integer.valueOf(i4));
        return jSONObject;
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70c6308e", new Object[]{this})).booleanValue();
        }
        if (h() != null) {
            return akt.Q0(h().O(), h().M());
        }
        return false;
    }

    public int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a6a4f762", new Object[]{this})).intValue();
        }
        if (!d() || j()) {
            return 0;
        }
        return s6o.c(this.b, 48);
    }

    public YogaMeasureFunction f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (YogaMeasureFunction) ipChange.ipc$dispatch("cfc533e7", new Object[]{this});
        }
        if (d()) {
            return new YogaMeasureFunction() { // from class: com.taobao.android.tab2liveroom.liveroom.immersive.ImmersiveManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.facebook.yoga.YogaMeasureFunction
                public long measure(YogaNode yogaNode, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Number) ipChange2.ipc$dispatch("15b3ebfa", new Object[]{this, yogaNode, new Float(f), yogaMeasureMode, new Float(f2), yogaMeasureMode2})).longValue();
                    }
                    int h = s6o.h(ImmersiveManager.a(ImmersiveManager.this));
                    o3s.b("ImmersiveManager", "tab2直播测量组件宽高结果，availableHeight：" + h);
                    return YogaMeasureOutput.make(f, h);
                }
            };
        }
        return null;
    }

    public final TaoliveOpenLiveRoom g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoliveOpenLiveRoom) ipChange.ipc$dispatch("ced4d3dc", new Object[]{this});
        }
        alc alcVar = this.f9510a;
        if (alcVar != null) {
            return alcVar.getTaoliveOpenLiveRoom();
        }
        return null;
    }

    public final p3h h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p3h) ipChange.ipc$dispatch("f57fd05c", new Object[]{this});
        }
        alc alcVar = this.f9510a;
        if (alcVar == null || alcVar.getViewParams() == null) {
            return null;
        }
        return this.f9510a.getViewParams();
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c788447f", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public void k(kxd kxdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae23aef1", new Object[]{this, kxdVar});
        } else if (!this.f) {
            this.e = new a();
            n(!od0.D().f().C());
            if (kxdVar != null) {
                Object obj = this.e;
                if (obj instanceof rjb) {
                    kxdVar.B((rjb) obj);
                }
            }
            this.f = true;
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cad6d22d", new Object[]{this});
        } else if (!this.f) {
            this.d = new b();
            n(!od0.D().f().C());
            NavigationTabModule.registerNavigationShowHideStatusListener(this.d);
            this.f = true;
        }
    }

    public void m(boolean z) {
        alc alcVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc53b5ef", new Object[]{this, new Boolean(z)});
        } else if ((h() == null || akt.K1(h().O(), h().M())) && (alcVar = this.f9510a) != null && alcVar.getNode() != null && this.f9510a.getNode().M() != null) {
            if (z) {
                this.f9510a.getNode().M().resetForceLayout();
                return;
            }
            int h = s6o.h(this.b);
            int v = s6o.v(this.b);
            o3s.d("ImmersiveManager", "沉浸式，rootViewHeightChange: width:" + v + ",height:" + h + ",needRecover" + z);
            this.f9510a.getNode().M().forceLayout(v, h, 10);
        }
    }

    public void n(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15a4ef1", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public void o(kxd kxdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71d48c38", new Object[]{this, kxdVar});
            return;
        }
        if (kxdVar != null) {
            Object obj = this.e;
            if (obj instanceof rjb) {
                kxdVar.L((rjb) obj);
            }
        }
        this.f = false;
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98ea93c6", new Object[]{this});
            return;
        }
        NavigationTabModule.unregisterNavigationShowHideStatusListener(this.d);
        this.f = false;
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8765727", new Object[]{this});
        } else if (g() != null) {
            JSONObject b2 = b(e());
            o3s.b("ImmersiveManager", "沉浸式直播间容器偏移处理，handleLiveContainerOffset，offset " + b2);
            g().callPlatform(PlatformListenerEnum.setContainerOffset, b2);
        }
    }
}
