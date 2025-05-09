package tb;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenBizCodeEnum;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenLiveRoom;
import com.taobao.taolive.room.openarchitecture.listener.WatchPlatformListenerEnum;
import com.taobao.taolive.sdk.core.interfaces.ISmallWindowStrategy;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class i6t implements jyd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PUBLIC_SUB_LIVE_ROOM_TYPE = "publicSubLiveRoomType";

    /* renamed from: a  reason: collision with root package name */
    public ViewGroup f21131a;
    public TaoliveOpenLiveRoom b;
    public jbt c;

    static {
        t2o.a(779092930);
        t2o.a(779092845);
    }

    public i6t(Activity activity, String str, y3s y3sVar) {
        b(activity, str, y3sVar);
    }

    @Override // tb.jyd
    public String E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4b7fe04c", new Object[]{this});
        }
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.b;
        if (taoliveOpenLiveRoom != null) {
            return (String) taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.getCurRoomIndex, new Object[0]);
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
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.b;
        if (taoliveOpenLiveRoom != null) {
            taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.procResumeForH5Embed, new Object[0]);
        }
    }

    @Override // tb.jyd
    public void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e05a9ba0", new Object[]{this});
            return;
        }
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.b;
        if (taoliveOpenLiveRoom != null) {
            taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.processGoToDetailAction, new Object[0]);
        }
    }

    public void a(Activity activity, Intent intent) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3700777d", new Object[]{this, activity, intent});
            return;
        }
        HashMap hashMap = new HashMap();
        if (!(intent == null || (data = intent.getData()) == null || data.getQueryParameter(PUBLIC_SUB_LIVE_ROOM_TYPE) == null)) {
            hashMap.put("OpenWatchType", data.getQueryParameter(PUBLIC_SUB_LIVE_ROOM_TYPE));
        }
        this.c = qbt.h().b(activity, TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_StandardOpenWatch.toString(), null, null, hashMap);
        qbt.h().g(this.c);
        this.b = qbt.h().c(this.c);
        this.f21131a = qbt.h().e(this.c, this.b, activity, intent);
    }

    public void b(Activity activity, String str, y3s y3sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d87d6ec", new Object[]{this, activity, str, y3sVar});
            return;
        }
        this.c = qbt.h().b(activity, TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_StandardOpenWatch.toString(), null, null, new HashMap());
        qbt.h().g(this.c);
        this.b = qbt.h().c(this.c);
        this.f21131a = qbt.h().f(this.c, this.b, activity, str, y3sVar);
    }

    @Override // tb.jyd
    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd937839", new Object[]{this})).booleanValue();
        }
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.b;
        if (taoliveOpenLiveRoom != null) {
            return ((Boolean) taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.isFloatViewShowing, new Object[0])).booleanValue();
        }
        return false;
    }

    @Override // tb.jyd
    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47de00e4", new Object[]{this})).booleanValue();
        }
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.b;
        if (taoliveOpenLiveRoom != null) {
            return ((Boolean) taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.isForceDestroy, new Object[0])).booleanValue();
        }
        return false;
    }

    @Override // tb.jyd
    public cba getGlobalContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cba) ipChange.ipc$dispatch("7f95b5cc", new Object[]{this});
        }
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.b;
        if (taoliveOpenLiveRoom == null) {
            return null;
        }
        Object callWatchPlatform = taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.getGlobalContext, new Object[0]);
        if (callWatchPlatform instanceof cba) {
            return (cba) callWatchPlatform;
        }
        return null;
    }

    @Override // tb.jyd
    public RecyclerView getRecyclerView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("23bc5268", new Object[]{this});
        }
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.b;
        if (taoliveOpenLiveRoom != null) {
            return (RecyclerView) taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.getRecyclerView, new Object[0]);
        }
        return null;
    }

    @Override // tb.jyd
    public ViewGroup getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("cbb4b1b3", new Object[]{this});
        }
        return this.f21131a;
    }

    @Override // tb.jyd
    public void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf4667d7", new Object[]{this, new Boolean(z)});
        } else if (this.b != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("enableAutoShowZoomWindowAbility", Boolean.valueOf(z));
            this.b.callWatchPlatform(WatchPlatformListenerEnum.setEnableAutoShowZoomWindowAbility, hashMap);
        }
    }

    @Override // tb.jyd
    public boolean isDestroyed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d65bd1a", new Object[]{this})).booleanValue();
        }
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.b;
        if (taoliveOpenLiveRoom != null) {
            return ((Boolean) taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.isDestroyed, new Object[0])).booleanValue();
        }
        return false;
    }

    @Override // tb.jyd
    public void o(u0v u0vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5323171f", new Object[]{this, u0vVar});
        } else if (this.b != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("callback", u0vVar);
            this.b.callWatchPlatform(WatchPlatformListenerEnum.setUTDelegateCallback, hashMap);
        }
    }

    @Override // tb.jyd
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.b;
        if (taoliveOpenLiveRoom != null) {
            taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.openContainer_onCreate, new Object[0]);
        }
    }

    @Override // tb.jyd
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.b;
        if (taoliveOpenLiveRoom != null) {
            taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.openContainer_onDestroy, new Object[0]);
        }
    }

    @Override // tb.jyd
    public void onLowMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
            return;
        }
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.b;
        if (taoliveOpenLiveRoom != null) {
            taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.onLowMemory, new Object[0]);
        }
    }

    @Override // tb.jyd
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.b;
        if (taoliveOpenLiveRoom != null) {
            taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.openContainer_onPause, new Object[0]);
        }
    }

    @Override // tb.jyd
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.b;
        if (taoliveOpenLiveRoom != null) {
            taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.openContainer_onResume, new Object[0]);
        }
    }

    @Override // tb.jyd
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.b;
        if (taoliveOpenLiveRoom != null) {
            taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.openContainer_onStart, new Object[0]);
        }
    }

    @Override // tb.jyd
    public void onStop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c7ea54c", new Object[]{this, new Boolean(z)});
        } else if (this.b != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("showSmallWindow", String.valueOf(z));
            this.b.callWatchPlatform(WatchPlatformListenerEnum.openContainer_onStop, hashMap);
        }
    }

    @Override // tb.jyd
    public void onTrimMemory(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c69db59a", new Object[]{this, new Integer(i)});
            return;
        }
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.b;
        if (taoliveOpenLiveRoom != null) {
            taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.onTrimMemory, new Object[0]);
        }
    }

    @Override // tb.jyd
    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93ece154", new Object[]{this});
            return;
        }
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.b;
        if (taoliveOpenLiveRoom != null) {
            taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.onClickCloseBtn, new Object[0]);
        }
    }

    @Override // tb.jyd
    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49b923d2", new Object[]{this});
            return;
        }
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.b;
        if (taoliveOpenLiveRoom != null) {
            taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.processGoToBulkDetailAction, new Object[0]);
        }
    }

    @Override // tb.jyd
    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69e6b4d6", new Object[]{this});
            return;
        }
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.b;
        if (taoliveOpenLiveRoom != null) {
            taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.sendBroadcasterForRecEngine, new Object[0]);
        }
    }

    @Override // tb.jyd
    public void y(Intent intent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91d7315", new Object[]{this, intent, new Boolean(z)});
        } else if (this.b != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, intent);
            hashMap.put("forceRefresh", Boolean.valueOf(z));
            this.b.callWatchPlatform(WatchPlatformListenerEnum.refreshByIntent, hashMap);
        }
    }

    public i6t(Activity activity, Intent intent) {
        a(activity, intent);
    }

    @Override // tb.jyd
    public Map<String, String> D(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d5cb7969", new Object[]{this, str});
        }
        if (this.b == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("url", str);
        Object callWatchPlatform = this.b.callWatchPlatform(WatchPlatformListenerEnum.updateUri, hashMap);
        if (callWatchPlatform instanceof Map) {
            return (Map) callWatchPlatform;
        }
        return null;
    }

    @Override // tb.jyd
    public void e(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a8722e3", new Object[]{this, onClickListener});
        } else if (this.b != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(DataReceiveMonitor.CB_LISTENER, onClickListener);
            this.b.callWatchPlatform(WatchPlatformListenerEnum.setClickMoreListener, hashMap);
        }
    }

    @Override // tb.jyd
    public void i(utk utkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4834220", new Object[]{this, utkVar});
        } else if (this.b != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(DataReceiveMonitor.CB_LISTENER, utkVar);
            this.b.callWatchPlatform(WatchPlatformListenerEnum.setRoomFinishListener, hashMap);
        }
    }

    @Override // tb.jyd
    public void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc4a3165", new Object[]{this, new Boolean(z)});
        } else if (this.b != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("success", Boolean.valueOf(z));
            this.b.callWatchPlatform(WatchPlatformListenerEnum.processAddCartAction, hashMap);
        }
    }

    @Override // tb.jyd
    public void k(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b3e51b4", new Object[]{this, new Boolean(z)});
        } else if (this.b != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("isClean", Boolean.valueOf(z));
            this.b.callWatchPlatform(WatchPlatformListenerEnum.clearScreen, hashMap);
        }
    }

    @Override // tb.jyd
    public void onConfigurationChanged(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
        } else if (this.b != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("newConfig", configuration);
            this.b.callWatchPlatform(WatchPlatformListenerEnum.onConfigurationChanged, hashMap);
        }
    }

    @Override // tb.jyd
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (this.b == null) {
            return false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("keyCode", Integer.valueOf(i));
        hashMap.put("keyEvent", keyEvent);
        return ((Boolean) this.b.callWatchPlatform(WatchPlatformListenerEnum.onKeyDown, hashMap)).booleanValue();
    }

    @Override // tb.jyd
    public View s(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("2d69c511", new Object[]{this, new Boolean(z)});
        }
        if (this.b == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("top", Boolean.valueOf(z));
        return (View) this.b.callWatchPlatform(WatchPlatformListenerEnum.getUbeeContainer, hashMap);
    }

    @Override // tb.jyd
    public void setSmallWindowClickListener(ISmallWindowStrategy iSmallWindowStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707f1784", new Object[]{this, iSmallWindowStrategy});
        } else if (this.b != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(DataReceiveMonitor.CB_LISTENER, iSmallWindowStrategy);
            this.b.callWatchPlatform(WatchPlatformListenerEnum.setSmallWindowClickListener, hashMap);
        }
    }

    @Override // tb.jyd
    public void t(Uri uri, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e67628e5", new Object[]{this, uri, new Boolean(z), new Boolean(z2)});
        } else if (this.b != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(NotificationCompat.MessagingStyle.Message.KEY_DATA_URI, uri);
            hashMap.put("forceRefresh", Boolean.valueOf(z));
            hashMap.put("needUT", Boolean.valueOf(z2));
            this.b.callWatchPlatform(WatchPlatformListenerEnum.refreshByUi, hashMap);
        }
    }

    @Override // tb.jyd
    public void v(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5ec3811", new Object[]{this, onClickListener});
        } else if (this.b != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("onCloseClickListener", onClickListener);
            this.b.callWatchPlatform(WatchPlatformListenerEnum.setClickCloseRoomListener, hashMap);
        }
    }

    @Override // tb.jyd
    public void z(muk mukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d85e17f", new Object[]{this, mukVar});
        } else if (this.b != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("onScrollListener", mukVar);
            this.b.callWatchPlatform(WatchPlatformListenerEnum.setOnScrollListener, hashMap);
        }
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
}
