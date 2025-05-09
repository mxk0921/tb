package com.taobao.trtc.accs;

import android.content.Context;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.status.NetworkStatusHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ACCSClient;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.AccsException;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.artc.internal.ADefines;
import com.taobao.artc.internal.ArtcEngineEventProxy;
import com.taobao.artc.internal.ArtcGlobal;
import com.taobao.trtc.utils.TrtcLog;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.pmu;
import tb.rlu;
import tb.t2o;
import tb.tmu;
import tb.viu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TrtcAccsHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TRTC_ACCS_SERVICE = "artccrc2";
    public static final Map<String, String> f = null;

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f13848a = new AtomicBoolean(false);
    public static String b = "";
    public static int c = 0;
    public static String d = "default";
    public static pmu e = null;
    public static final NetworkStatusHelper.INetworkStatusChangeListener g = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements NetworkStatusHelper.INetworkStatusChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // anet.channel.status.NetworkStatusHelper.INetworkStatusChangeListener
        public void onNetworkStatusChanged(NetworkStatusHelper.NetworkStatus networkStatus) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4275ba3b", new Object[]{this, networkStatus});
                return;
            }
            tmu.f("TrtcAccsHandler", "onNetworkStatusChanged: " + networkStatus.name());
        }
    }

    static {
        t2o.a(395313337);
        new TrtcAccsConnectionBroadcastReceiver();
        new HashMap<String, String>() { // from class: com.taobao.trtc.accs.TrtcAccsHandler.2
            private static final long serialVersionUID = 2527336442338823324L;

            {
                put(TrtcAccsHandler.TRTC_ACCS_SERVICE, "com.taobao.trtc.accs.TrtcAccsService");
            }
        };
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8548c49", new Object[]{str});
            return;
        }
        String name = TrtcAccsService.class.getName();
        try {
            GlobalClientInfo.getInstance(rlu.f27461a).registerService(TRTC_ACCS_SERVICE, name);
            ACCSClient.getAccsClient(d).bindService(str);
        } catch (AccsException e2) {
            tmu.g("TrtcAccsHandler", "Accs bindService exception: " + e2.getMessage());
        }
        tmu.f("TrtcAccsHandler", "Accs bindService, serviceId: artccrc2, service: ".concat(name));
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dc42a39", new Object[]{str});
            return;
        }
        b = str;
        try {
            ACCSClient.getAccsClient(d).bindUser(str, true);
        } catch (AccsException e2) {
            tmu.g("TrtcAccsHandler", "Accs bindUser exception: " + e2.getMessage());
        }
        tmu.f("TrtcAccsHandler", "Accs bindUser, userId: " + str);
    }

    public static void d(String str, int i, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ffa807c", new Object[]{str, new Integer(i), extraInfo});
        } else if (i != 200) {
            f13848a.set(false);
            tmu.g("TrtcAccsHandler", "Accs bind service error, serviceId:" + str + " code:" + i);
        } else {
            f13848a.set(true);
            tmu.f("TrtcAccsHandler", "Accs bind service success, serviceId: " + str);
        }
    }

    public static void e(String str, String str2, String str3, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1909955", new Object[]{str, str2, str3, bArr});
        } else if (e != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("serviceId", str);
            hashMap.put("userId", str2);
            ((viu) e).a(str3, bArr, hashMap);
        }
    }

    public static void f(String str, String str2, int i, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea38b7cf", new Object[]{str, str2, new Integer(i), bArr});
            return;
        }
        if (i != 200) {
            tmu.g("TrtcAccsHandler", "Accs send error | serviceId:" + str + "dataId:" + str2 + " code:" + i);
            if (i == -9) {
                TrtcLog.i("TrtcAccsHandler", "!!! accs send timeout, dataId: " + str2);
            }
        } else {
            TrtcLog.h("TrtcAccsHandler", "Accs send success, dataId: " + str2);
        }
        if (e != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("serviceId", str);
            hashMap.put("dataId", str2);
            ((viu) e).b(str2, i, hashMap);
        }
    }

    public static void g(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d19e3117", new Object[]{str, str2, new Integer(i)});
        } else if (e != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("serviceId", str);
            hashMap.put("dataId", str2);
            ((viu) e).c(str2, i, hashMap);
        }
    }

    public static void h(String str, int i, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("588ddb35", new Object[]{str, new Integer(i), extraInfo});
        } else if (i != 200) {
            tmu.g("TrtcAccsHandler", "Accs unBind service error | serviceId:" + str + " code:" + i);
        } else {
            tmu.f("TrtcAccsHandler", "Accs unbind service success | serviceId: " + str);
        }
    }

    public static void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bcd355", new Object[]{str});
        } else {
            d = str;
        }
    }

    public static void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77945e11", new Object[]{str});
        }
    }

    public static void l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6aea9dab", new Object[]{new Integer(i)});
        } else {
            c = i;
        }
    }

    public static void m(pmu pmuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ea7b62a", new Object[]{pmuVar});
        } else {
            e = pmuVar;
        }
    }

    public static void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c847c202", new Object[0]);
            return;
        }
        e = null;
        o(TRTC_ACCS_SERVICE);
        NetworkStatusHelper.removeStatusChangeListener(g);
        ArtcGlobal.isAccsInit = ADefines.AccsStatus.ARTC_ACCS_UNINIT.ordinal();
    }

    public static void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d0a74d0", new Object[]{str});
            return;
        }
        try {
            ACCSClient.getAccsClient(d).unRegisterSerivce(str);
            ACCSClient.getAccsClient(d).unbindService(str);
        } catch (AccsException e2) {
            tmu.g("TrtcAccsHandler", "Accs unbindService exception: " + e2.getMessage());
        }
        f13848a.set(false);
        tmu.f("TrtcAccsHandler", "Accs unbindService, serviceId: artccrc2");
    }

    public static void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90a87f48", new Object[0]);
            return;
        }
        try {
            ACCSClient.getAccsClient(d).unbindUser();
        } catch (AccsException e2) {
            tmu.g("TrtcAccsHandler", "Accs unbindUser exception: " + e2.getMessage());
        }
        tmu.f("TrtcAccsHandler", "Accs unbindUser, userId: " + b);
    }

    public static void c(Context context, ArtcEngineEventProxy artcEngineEventProxy, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("614faa9e", new Object[]{context, artcEngineEventProxy, new Boolean(z)});
            return;
        }
        e = null;
        tmu.f("TrtcAccsHandler", "need sdk init accs:" + z + ", isAppBackground:" + GlobalAppRuntimeInfo.isAppBackground() + ", accsEnv:" + c);
        NetworkStatusHelper.addStatusChangeListener(g);
        a(TRTC_ACCS_SERVICE);
        ArtcGlobal.isAccsConnectd = true;
        ArtcGlobal.isAccsInit = ADefines.AccsStatus.ARTC_ACCS_INIT.ordinal();
    }

    public static String i(String str, String str2, byte[] bArr) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("488a762c", new Object[]{str, str2, bArr});
        }
        ACCSManager.AccsRequest accsRequest = new ACCSManager.AccsRequest(str, str2, bArr, null);
        accsRequest.setTimeOut(6500);
        try {
            str3 = ACCSClient.getAccsClient(d).sendRequest(accsRequest);
        } catch (AccsException e2) {
            TrtcLog.i("TrtcAccsHandler", "sendData error: " + e2.getMessage());
            str3 = null;
        }
        if (str3 == null) {
            f(str2, null, 0, null);
        } else {
            tmu.f("TrtcAccsHandler", "Accs send data, serviceId: " + str2 + ", dataId: " + str3 + ", len: " + bArr.length);
        }
        TrtcLog.h("TrtcAccsHandler", ">>>>>> sendData, userId: " + str + ", serviceId: " + str2 + ", dataId: " + str3);
        return str3;
    }
}
