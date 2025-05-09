package tb;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.trtc.accs.TrtcAccsHandler;
import com.taobao.trtc.api.ITrtcObserver;
import com.taobao.trtc.api.TrtcConfig;
import com.taobao.trtc.api.TrtcConstants;
import com.taobao.trtc.api.TrtcDefines;
import com.taobao.trtc.impl.TrtcEngineImpl;
import com.taobao.trtc.signal.TrtcSignalChannel;
import com.taobao.trtc.utils.TrtcLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class omu {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static Map<String, Map<String, TrtcDefines.d>> h;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f25494a;
    public c b;
    public final Runnable c = new a();
    public static Map<String, c> d = new HashMap();
    public static final ReentrantLock e = new ReentrantLock();
    public static boolean f = false;
    public static volatile boolean g = true;
    public static final ReentrantLock i = new ReentrantLock();
    public static ArrayList<String> j = null;
    public static Context k = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                omu.a().lock();
                if (omu.b() != null && !omu.b().isEmpty()) {
                    for (String str : omu.b().keySet()) {
                        TrtcLog.j("TrtcServiceManager", "process cached channel notify msg for service: " + str + ", count: " + ((Map) omu.b().get(str)).size());
                        if (((c) omu.c().get(str)) != null) {
                            for (String str2 : ((Map) omu.b().get(str)).keySet()) {
                                omu.d(str, (TrtcDefines.d) ((Map) omu.b().get(str)).get(str2));
                            }
                            omu.b().clear();
                        }
                    }
                }
                TrtcLog.j("TrtcServiceManager", "All cached msg processed done");
                for (c cVar : omu.c().values()) {
                    cVar.c = true;
                }
                omu.a().unlock();
            } catch (Throwable th) {
                for (c cVar2 : omu.c().values()) {
                    cVar2.c = true;
                }
                omu.a().unlock();
                throw th;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b extends TypeReference<Map<String, String>> {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public TrtcConfig f25496a;
        public AtomicBoolean b;
        public boolean c = false;
        public boolean d = false;

        static {
            t2o.a(395313582);
        }
    }

    static {
        t2o.a(395313579);
    }

    public omu(Handler handler) {
        this.f25494a = handler;
    }

    public static /* synthetic */ ReentrantLock a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ReentrantLock) ipChange.ipc$dispatch("957c3515", new Object[0]);
        }
        return i;
    }

    public static /* synthetic */ Map b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d58732ed", new Object[0]);
        }
        return h;
    }

    public static /* synthetic */ Map c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e220286e", new Object[0]);
        }
        return d;
    }

    public static /* synthetic */ void d(String str, TrtcDefines.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("438ab08d", new Object[]{str, dVar});
        } else {
            o(str, dVar);
        }
    }

    public static void f(Context context, boolean z, String str, String str2, int i2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("571bc826", new Object[]{context, new Boolean(z), str, str2, new Integer(i2), str3});
            return;
        }
        try {
            ReentrantLock reentrantLock = e;
            reentrantLock.lock();
            if (!f) {
                TrtcLog.j("TrtcServiceManager", "checkNeedInitAccs: true");
                TrtcEngineImpl.A0(context, z, str, str2, i2, str3);
                f = true;
            } else {
                TrtcLog.j("TrtcServiceManager", "checkNeedInitAccs: false | update user id:" + str);
                TrtcSignalChannel.f(str);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            e.unlock();
            throw th;
        }
    }

    public static void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35efc760", new Object[0]);
            return;
        }
        try {
            ReentrantLock reentrantLock = e;
            reentrantLock.lock();
            if (!f || !((HashMap) d).isEmpty()) {
                TrtcLog.j("TrtcServiceManager", "no need unInitAccs with running service");
            } else {
                TrtcLog.j("TrtcServiceManager", "unInitAccs | no running service");
                TrtcEngineImpl.w1();
                f = false;
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            e.unlock();
            throw th;
        }
    }

    public static boolean h(TrtcEngineImpl trtcEngineImpl, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b833332", new Object[]{trtcEngineImpl, str})).booleanValue();
        }
        if (!(trtcEngineImpl == null || TextUtils.isEmpty(str) || trtcEngineImpl.r0() == null)) {
            TrtcConfig trtcConfig = trtcEngineImpl.r0().config;
            if (!i(str) && trtcConfig != null) {
                if (trtcConfig.getEngineObserver() != null) {
                    ITrtcObserver.e engineObserver = trtcConfig.getEngineObserver();
                    TrtcDefines.TrtcErrorEvent trtcErrorEvent = TrtcDefines.TrtcErrorEvent.E_ERROR_EVENT_INITIALIZE;
                    engineObserver.H(trtcErrorEvent, 2005, "inactive by service:" + str);
                }
                if (trtcConfig.getEventHandler() != null) {
                    com.taobao.trtc.api.a eventHandler = trtcConfig.getEventHandler();
                    TrtcDefines.TrtcErrorEvent trtcErrorEvent2 = TrtcDefines.TrtcErrorEvent.E_ERROR_EVENT_INITIALIZE;
                    eventHandler.g(trtcErrorEvent2, 2005, "inactive by service:" + str);
                }
                tmu.f("TrtcServiceManager", "inactive service: " + trtcEngineImpl.r0().config.getServerName() + " by " + str);
                return true;
            }
        }
        return false;
    }

    public static boolean l(String str) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b6fdca9", new Object[]{str})).booleanValue();
        }
        try {
            ReentrantLock reentrantLock = e;
            reentrantLock.lock();
            c cVar = (c) ((HashMap) d).get(str);
            if (cVar != null) {
                z = cVar.b.get();
            }
            reentrantLock.unlock();
            return z;
        } catch (Throwable th) {
            e.unlock();
            throw th;
        }
    }

    public static void o(String str, TrtcDefines.d dVar) {
        c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44c3c490", new Object[]{str, dVar});
        } else if (dVar != null && (cVar = (c) ((HashMap) d).get(str)) != null) {
            tmu.f("TrtcServiceManager", "onRemoteNotifyChannel | action: " + dVar.f13878a + " channel:" + dVar.c + " remoteUserId: " + dVar.b + " extension:" + dVar.f);
            ITrtcObserver.c channelEventObserver = cVar.f25496a.getChannelEventObserver();
            if (channelEventObserver != null) {
                channelEventObserver.E(dVar.f13878a, dVar.b, dVar.c, dVar.f);
            }
            com.taobao.trtc.api.a eventHandler = cVar.f25496a.getEventHandler();
            if (eventHandler != null) {
                TrtcLog.j("TrtcServiceManager", "remote notify channel event");
                eventHandler.s(dVar.f13878a, dVar.b, dVar.c, dVar.f);
                eventHandler.t(dVar);
            }
        }
    }

    public static void q(Context context, ArrayList<String> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f753fbe4", new Object[]{context, arrayList});
        } else if (!arrayList.isEmpty()) {
            k = context;
            j = arrayList;
        }
    }

    public void e(Runnable runnable, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fdff14", new Object[]{this, runnable, new Boolean(z)});
        } else if (z) {
            this.f25494a.postDelayed(runnable, 3000L);
        } else {
            this.f25494a.removeCallbacks(runnable);
        }
    }

    public synchronized void r(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("724e5e97", new Object[]{this, str, new Boolean(z)});
        } else if (str != null && !str.isEmpty()) {
            ReentrantLock reentrantLock = e;
            reentrantLock.lock();
            c cVar = (c) ((HashMap) d).get(str);
            if (cVar != null) {
                cVar.b.set(z);
                tmu.f("TrtcServiceManager", "set service " + str + " is running: " + z);
            }
            reentrantLock.unlock();
        }
    }

    public synchronized void u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2abb9aa4", new Object[]{this, str});
        } else if (d != null && !str.isEmpty()) {
            ReentrantLock reentrantLock = e;
            reentrantLock.lock();
            if (d.get(str) != null) {
                tmu.f("TrtcServiceManager", "stop service: ".concat(str));
                d.remove(str);
            }
            reentrantLock.unlock();
            g();
        }
    }

    public static void p(Map<String, String> map) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94663d8a", new Object[]{map});
            return;
        }
        String str = map.get("data");
        TrtcLog.h("TrtcServiceManager", "<<<<<< " + str);
        JSONObject parseObject = JSON.parseObject(str);
        String str2 = "grtn";
        if (!(parseObject == null || (string = parseObject.getString("sdkType")) == null || !string.equals(str2))) {
            g = true;
        }
        if (!g) {
            str2 = "artc";
        }
        tmu.f("TrtcServiceManager", "get sdk type: ".concat(str2));
        TrtcSignalChannel.d(g);
    }

    public synchronized void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd9e58e1", new Object[]{this});
            return;
        }
        c cVar = this.b;
        if (cVar != null) {
            String serverName = cVar.f25496a.getServerName();
            TrtcLog.j("TrtcServiceManager", "try stop main service: " + serverName);
            e(this.c, false);
            this.b = null;
            u(serverName);
        }
    }

    public static boolean i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5d2079d1", new Object[]{str})).booleanValue();
        }
        try {
            e.lock();
            for (c cVar : ((HashMap) d).values()) {
                if (cVar.b.get() && !cVar.f25496a.getServerName().equals(str)) {
                    TrtcLog.i("TrtcServiceManager", "service : " + cVar.f25496a.getServerName() + ", is running, can not run new service: " + str);
                    return false;
                }
            }
            return true;
        } finally {
            e.unlock();
        }
    }

    public static boolean j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c2559001", new Object[]{new Boolean(z)})).booleanValue();
        }
        try {
            e.lock();
            for (c cVar : ((HashMap) d).values()) {
                if (z == cVar.d && cVar.b.get()) {
                    TrtcLog.i("TrtcServiceManager", "service : " + cVar.f25496a.getServerName() + ", is running");
                    return true;
                }
            }
            return false;
        } finally {
            e.unlock();
        }
    }

    public static boolean m(Map<String, String> map, String str, String str2, byte[] bArr) {
        TrtcDefines.TrtcChannelAction trtcChannelAction;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8bcc8056", new Object[]{map, str, str2, bArr})).booleanValue();
        }
        if (!str2.equals("deliverChannelNotify")) {
            return false;
        }
        if (h == null) {
            h = new HashMap();
        }
        if (h.get(str) == null) {
            h.put(str, new HashMap());
        }
        TrtcDefines.d dVar = new TrtcDefines.d();
        JSONObject parseObject = JSON.parseObject(map.get("data"));
        if (parseObject == null || parseObject.getString("channelInfo") == null || parseObject.getString("notifyType") == null) {
            TrtcLog.i("TrtcServiceManager", "no need cached message for:no data info");
            return false;
        }
        String string = parseObject.getString("notifyType");
        if (TextUtils.isEmpty(string)) {
            TrtcLog.i("TrtcServiceManager", "no need cached message for:notify type is empty");
            return false;
        }
        if (string.equals("notify")) {
            trtcChannelAction = TrtcDefines.TrtcChannelAction.E_CHANNEL_NOTIFY_INVITE;
        } else {
            trtcChannelAction = TrtcDefines.TrtcChannelAction.E_CHANNEL_NOTIFY_CANCELED;
        }
        dVar.f13878a = trtcChannelAction;
        JSONObject parseObject2 = JSON.parseObject(parseObject.getString("channelInfo"));
        if (parseObject2 == null) {
            TrtcLog.i("TrtcServiceManager", "no need cached message for:no channel info");
            return false;
        }
        String string2 = parseObject2.getString("channelId");
        dVar.c = string2;
        if (TextUtils.isEmpty(string2)) {
            TrtcLog.i("TrtcServiceManager", "no need cached message for:no channel id");
            return false;
        }
        JSONObject parseObject3 = JSON.parseObject(parseObject.getString("srcUserInfo"));
        if (parseObject3 == null) {
            TrtcLog.i("TrtcServiceManager", "maybeNeedCachedMessage var6");
            return false;
        }
        String string3 = parseObject3.getString("userId");
        dVar.b = string3;
        if (TextUtils.isEmpty(string3)) {
            TrtcLog.i("TrtcServiceManager", "no need cached message for:no remote user id");
            return false;
        }
        String string4 = parseObject.getString("extInfo");
        dVar.f = string4;
        if (string4 == null) {
            dVar.f = "";
        }
        dVar.d = "1".equals(parseObject.getString("audioEnable"));
        dVar.e = "1".equals(parseObject.getString(TrtcConstants.TRTC_PARAMS_VIDEO_ENABLE));
        c cVar = (c) ((HashMap) d).get(str);
        if (cVar == null || !cVar.c) {
            TrtcDefines.d dVar2 = h.get(str).get(dVar.c);
            if (dVar2 != null) {
                if (dVar2.f13878a == TrtcDefines.TrtcChannelAction.E_CHANNEL_NOTIFY_INVITE) {
                    TrtcDefines.TrtcChannelAction trtcChannelAction2 = dVar.f13878a;
                    TrtcDefines.TrtcChannelAction trtcChannelAction3 = TrtcDefines.TrtcChannelAction.E_CHANNEL_NOTIFY_CANCELED;
                    if (trtcChannelAction2 == trtcChannelAction3) {
                        dVar2.f13878a = trtcChannelAction3;
                        dVar2.b = dVar.b;
                        dVar2.f = dVar.f;
                        dVar2.d = dVar.d;
                        dVar2.e = dVar.e;
                        h.get(str).put(dVar.c, dVar2);
                        TrtcLog.j("TrtcServiceManager", "Cached channel notify cancel, channel: " + dVar.c);
                    }
                }
                TrtcLog.j("TrtcServiceManager", "drop msg: ".concat(str2));
            } else {
                h.get(str).put(dVar.c, dVar);
                TrtcLog.j("TrtcServiceManager", "new cached msg: " + str2 + " channel : " + dVar.c + " remoteUserId:" + dVar.b + "action:" + dVar.f13878a);
            }
            return true;
        }
        TrtcLog.j("TrtcServiceManager", "<<<<<<< ".concat(new String(bArr)));
        o(str, dVar);
        return true;
    }

    public static boolean n(byte[] bArr, String str) {
        Map map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("93b91593", new Object[]{bArr, str})).booleanValue();
        }
        if (!(bArr == null || bArr.length <= 0 || (map = (Map) JSON.parseObject(new String(bArr), new b(), new Feature[0])) == null || map.isEmpty() || map.get("api") == null)) {
            String str2 = (String) map.get("api");
            if (TextUtils.isEmpty(str2)) {
                return false;
            }
            if (k != null && !j.isEmpty() && j.contains(str2)) {
                TrtcLog.j("TrtcServiceManager", "accsObserveList: " + j + " ,api: " + str2);
                try {
                    String str3 = new String(bArr);
                    Intent intent = new Intent("com.taobao.action.artc_accs_receive");
                    intent.putExtra("content", str3);
                    LocalBroadcastManager.getInstance(k).sendBroadcast(intent);
                    TrtcLog.j("TrtcServiceManager", "accsObserveList LocalBroadcastManager.");
                } catch (Exception e2) {
                    TrtcLog.i("TrtcServiceManager", "accsObserveList LocalBroadcastManager Exception: " + e2);
                }
            }
            String str4 = (String) map.get(FluidException.SERVICE_NAME);
            if (str4 == null || str4.isEmpty()) {
                TrtcLog.i("TrtcServiceManager", "Receive signal data, can not process for:no service name");
            } else if (str2.equals("getSdkConfigRsp")) {
                p(map);
                return true;
            } else if (l(str4) || !g) {
                return false;
            } else {
                if (j(false)) {
                    tmu.f("TrtcServiceManager", "Drop msg: " + str2 + " for have other running service");
                    return true;
                }
                try {
                    ReentrantLock reentrantLock = i;
                    reentrantLock.lock();
                    boolean m = m(map, str4, str2, bArr);
                    reentrantLock.unlock();
                    return m;
                } catch (Throwable th) {
                    i.unlock();
                    throw th;
                }
            }
        }
        return false;
    }

    public boolean k(String str) {
        c cVar;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("867eac47", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || (cVar = this.b) == null || !cVar.f25496a.getServerName().equals(str)) {
            z = false;
        }
        TrtcLog.j("TrtcServiceManager", "isMainService, service name: " + str + " ret: " + z);
        return z;
    }

    public synchronized boolean s(TrtcConfig trtcConfig, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7260ee2", new Object[]{this, trtcConfig, new Boolean(z)})).booleanValue();
        } else if (trtcConfig == null || TextUtils.isEmpty(trtcConfig.getServerName())) {
            TrtcLog.i("TrtcServiceManager", "trtc config invalid");
            return false;
        } else {
            ReentrantLock reentrantLock = e;
            reentrantLock.lock();
            if (d == null) {
                d = new HashMap();
            }
            if (((HashMap) d).get(trtcConfig.getServerName()) == null) {
                c cVar = new c();
                cVar.f25496a = trtcConfig;
                cVar.b = new AtomicBoolean(false);
                if (z) {
                    cVar.d = true;
                    this.b = cVar;
                    e(this.c, true);
                }
                ((HashMap) d).put(trtcConfig.getServerName(), cVar);
                tmu.f("TrtcServiceManager", "start service | name: " + trtcConfig.getServerName() + " isMainService: " + z);
            } else {
                TrtcLog.j("TrtcServiceManager", "service already started | " + trtcConfig.getServerName());
            }
            TrtcAccsHandler.b(trtcConfig.getUserId());
            reentrantLock.unlock();
            f(rlu.f27461a, trtcConfig.isInitAccs(), trtcConfig.getUserId(), trtcConfig.getAppKey(), trtcConfig.getEnvironment(), trtcConfig.getAccsCfgTag());
            return false;
        }
    }
}
