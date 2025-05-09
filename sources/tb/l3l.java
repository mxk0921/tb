package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.tab2liveroom.liveroom.LiveRoomEventHandler;
import com.taobao.taolive.room.openarchitecture.listener.impl.access.ITab2MoreLiveGuideClickListener;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class l3l extends yrk {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final alc b;
    public ITab2MoreLiveGuideClickListener c;
    public final azb d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements ITab2MoreLiveGuideClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.taolive.room.openarchitecture.listener.impl.access.ITab2MoreLiveGuideClickListener
        public void onClick() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88f782f0", new Object[]{this});
                return;
            }
            l3l.F(l3l.this).sendLiveRoomMessage("onMoreLiveClick", null);
            tfs.g(com.taobao.android.tab2liveroom.liveroom.a.TAG, "更多直播点击");
        }
    }

    static {
        t2o.a(779092140);
    }

    public l3l(alc alcVar, azb azbVar) {
        this.b = alcVar;
        this.d = azbVar;
        E(new c4l(alcVar));
    }

    public static /* synthetic */ alc F(l3l l3lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (alc) ipChange.ipc$dispatch("f19a5628", new Object[]{l3lVar});
        }
        return l3lVar.b;
    }

    public static /* synthetic */ Object ipc$super(l3l l3lVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tab2liveroom/liveroom/open/OpenEventImpl");
    }

    @Override // tb.yrk
    public void A(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd296e8", new Object[]{this, obj});
        } else {
            v3h.c(this.b, obj);
        }
    }

    @Override // tb.yrk
    public void B(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57134d5f", new Object[]{this, obj});
        } else {
            v3h.d(this.b, obj);
        }
    }

    @Override // tb.yrk
    public void C(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcdab4f9", new Object[]{this, obj});
            return;
        }
        tfs.g(com.taobao.android.tab2liveroom.liveroom.a.TAG, "onLiveDetailChanged, onReceiveDetailResponse");
        azb azbVar = this.d;
        if (azbVar != null) {
            ((LiveRoomEventHandler) azbVar).B(obj);
        }
    }

    public final Map G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("dc91c881", new Object[]{this});
        }
        return this.b.getCustomerPageUTExtParams();
    }

    public final Object H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("b9400e66", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        if (this.c == null) {
            this.c = new a();
        }
        hashMap.put(DataReceiveMonitor.CB_LISTENER, this.c);
        return hashMap;
    }

    @Override // tb.yrk
    public boolean a() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("49acd09", new Object[]{this})).booleanValue();
        }
        if (this.b.getOpenConfig() != null && this.b.getOpenConfig().b()) {
            z = true;
        }
        tfs.g(com.taobao.android.tab2liveroom.liveroom.a.TAG, "enableMoreLive:" + z);
        return z;
    }

    @Override // tb.yrk
    public Object m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("76fb3fe0", new Object[]{this});
        }
        if (a()) {
            return H();
        }
        return null;
    }

    @Override // tb.yrk
    public Map<String, String> u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c6dbcc2d", new Object[]{this});
        }
        return this.b.buildCustomerKLifecycleParam();
    }

    @Override // tb.yrk
    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5df15b26", new Object[]{this});
        } else {
            I();
        }
    }

    @Override // tb.yrk
    public Map w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5aee9800", new Object[]{this});
        }
        return G();
    }

    @Override // tb.yrk
    public void y(Map map, Map map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c98c4925", new Object[]{this, map, map2});
        } else {
            this.b.onInteractiveMsg(map, map2);
        }
    }

    public final void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a21c637c", new Object[]{this});
            return;
        }
        tfs.g(com.taobao.android.tab2liveroom.liveroom.a.TAG, "onFloatViewShow");
        HashMap hashMap = new HashMap();
        hashMap.put("isShow", String.valueOf(true));
        this.b.sendLiveRoomMessage("onFloatViewShow", hashMap);
    }
}
