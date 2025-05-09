package com.network.diagnosis.model;

import anet.channel.status.NetworkStatusHelper;
import anetwork.channel.monitor.NetworkQualityMonitor;
import com.alibaba.ability.MegaUtils;
import com.alibaba.ability.localization.Localization;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecutingResult;
import com.alibaba.ability.result.FinishResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.cu;
import tb.m09;
import tb.mhj;
import tb.rb;
import tb.vq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class NetworkAbility extends cu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_ADD_QUALITY_EVENT_LISTENER = "addQualityEventListener";
    public static final String API_ADD_TYPE_EVENT_LISTENER = "addTypeEventListener";
    public static final String API_GET_DOWNLINK = "getDownlink";
    public static final String API_GET_NETWORK_STATUS = "getNetStatus";
    public static final String API_GET_PREDICT_DOWNLINK = "getPredictDownlink";
    public static final String API_GET_QUALITY_LEVEL = "getQualityLevel";
    public static final String API_GET_TYPE = "getType";
    public static final String API_REGISTER_NETWORK_LISTENER = "registerNetStatusListener";
    public static final String API_REMOVE_QUALITY_EVENT_LISTENER = "removeQualityEventListener";
    public static final String API_REMOVE_TYPE_EVENT_LISTENER = "removeTypeEventListener";

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f5927a = new AtomicBoolean(false);
    public final List<vq> b = new CopyOnWriteArrayList();
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final List<vq> d = new CopyOnWriteArrayList();
    public final Map<String, List<vq>> e = new HashMap();
    public final Map<String, d> f = new HashMap();
    public f g;
    public e h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ NetworkStatusHelper.NetworkStatus f5928a;

        public a(NetworkStatusHelper.NetworkStatus networkStatus) {
            this.f5928a = networkStatus;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(rb.RESULT_KEY, NetworkAbility.access$000(NetworkAbility.this, this.f5928a));
            for (vq vqVar : NetworkAbility.access$100(NetworkAbility.this)) {
                vqVar.d(new ExecutingResult(hashMap));
                vqVar.d(new ExecutingResult(hashMap, "onChange"));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f5929a;
        public final /* synthetic */ double b;

        public b(int i, double d) {
            this.f5929a = i;
            this.b = d;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(m09.TASK_TYPE_LEVEL, NetworkAbility.access$200(NetworkAbility.this, this.f5929a));
            hashMap.put("downlink", Double.valueOf(this.b));
            for (vq vqVar : NetworkAbility.access$300(NetworkAbility.this)) {
                vqVar.d(new ExecutingResult(hashMap, "onChange"));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f5930a;
        public final /* synthetic */ double b;
        public final /* synthetic */ long c;
        public final /* synthetic */ List d;

        public c(int i, double d, long j, List list) {
            this.f5930a = i;
            this.b = d;
            this.c = j;
            this.d = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(m09.TASK_TYPE_LEVEL, NetworkAbility.access$200(NetworkAbility.this, this.f5930a));
            hashMap.put("downlink", Double.valueOf(this.b));
            hashMap.put("srtt", Long.valueOf(this.c));
            for (vq vqVar : this.d) {
                vqVar.d(new ExecutingResult(hashMap, "onChange"));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class d implements NetworkQualityMonitor.IDomainNetworkQualityListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<NetworkAbility> f5931a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f5932a;
            public final /* synthetic */ int b;
            public final /* synthetic */ double c;
            public final /* synthetic */ long d;

            public a(String str, int i, double d, long j) {
                this.f5932a = str;
                this.b = i;
                this.c = d;
                this.d = j;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                NetworkAbility networkAbility = (NetworkAbility) d.a(d.this).get();
                if (networkAbility != null) {
                    NetworkAbility.access$900(networkAbility, this.f5932a, this.b, this.c, this.d);
                }
            }
        }

        public d(NetworkAbility networkAbility) {
            this.f5931a = new WeakReference<>(networkAbility);
        }

        public static /* synthetic */ WeakReference a(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WeakReference) ipChange.ipc$dispatch("93bb763a", new Object[]{dVar});
            }
            return dVar.f5931a;
        }

        @Override // anetwork.channel.monitor.NetworkQualityMonitor.IDomainNetworkQualityListener
        public void onNetworkQualityChanged(String str, int i, double d, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f9956f4", new Object[]{this, str, new Integer(i), new Double(d), new Long(j)});
            } else {
                mhj.c(new a(str, i, d, j));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class e implements NetworkQualityMonitor.IGlobalNetworkQualityListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<NetworkAbility> f5933a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f5934a;
            public final /* synthetic */ double b;

            public a(int i, double d) {
                this.f5934a = i;
                this.b = d;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                NetworkAbility networkAbility = (NetworkAbility) e.a(e.this).get();
                if (networkAbility != null) {
                    NetworkAbility.access$700(networkAbility, this.f5934a, this.b);
                }
            }
        }

        public e(NetworkAbility networkAbility) {
            this.f5933a = new WeakReference<>(networkAbility);
        }

        public static /* synthetic */ WeakReference a(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WeakReference) ipChange.ipc$dispatch("d90cf558", new Object[]{eVar});
            }
            return eVar.f5933a;
        }

        @Override // anetwork.channel.monitor.NetworkQualityMonitor.IGlobalNetworkQualityListener
        public void onNetworkQualityChanged(int i, double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4d676f46", new Object[]{this, new Integer(i), new Double(d)});
            } else {
                mhj.c(new a(i, d));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class f implements NetworkStatusHelper.INetworkStatusChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<NetworkAbility> f5935a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ NetworkStatusHelper.NetworkStatus f5936a;

            public a(NetworkStatusHelper.NetworkStatus networkStatus) {
                this.f5936a = networkStatus;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                NetworkAbility networkAbility = (NetworkAbility) f.a(f.this).get();
                if (networkAbility != null) {
                    NetworkAbility.access$500(networkAbility, this.f5936a);
                }
            }
        }

        public f(NetworkAbility networkAbility) {
            this.f5935a = new WeakReference<>(networkAbility);
        }

        public static /* synthetic */ WeakReference a(f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WeakReference) ipChange.ipc$dispatch("4fa79379", new Object[]{fVar});
            }
            return fVar.f5935a;
        }

        @Override // anet.channel.status.NetworkStatusHelper.INetworkStatusChangeListener
        public void onNetworkStatusChanged(NetworkStatusHelper.NetworkStatus networkStatus) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4275ba3b", new Object[]{this, networkStatus});
            } else {
                mhj.c(new a(networkStatus));
            }
        }
    }

    public static /* synthetic */ String access$000(NetworkAbility networkAbility, NetworkStatusHelper.NetworkStatus networkStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8fe6d7a2", new Object[]{networkAbility, networkStatus});
        }
        return networkAbility.i(networkStatus);
    }

    public static /* synthetic */ List access$100(NetworkAbility networkAbility) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("44be8a4f", new Object[]{networkAbility});
        }
        return networkAbility.b;
    }

    public static /* synthetic */ String access$200(NetworkAbility networkAbility, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55450276", new Object[]{networkAbility, new Integer(i)});
        }
        return networkAbility.h(i);
    }

    public static /* synthetic */ List access$300(NetworkAbility networkAbility) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("191d9a8d", new Object[]{networkAbility});
        }
        return networkAbility.d;
    }

    public static /* synthetic */ void access$500(NetworkAbility networkAbility, NetworkStatusHelper.NetworkStatus networkStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b76a259", new Object[]{networkAbility, networkStatus});
        } else {
            networkAbility.f(networkStatus);
        }
    }

    public static /* synthetic */ void access$700(NetworkAbility networkAbility, int i, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0435199", new Object[]{networkAbility, new Integer(i), new Double(d2)});
        } else {
            networkAbility.g(i, d2);
        }
    }

    public static /* synthetic */ void access$900(NetworkAbility networkAbility, String str, int i, double d2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2c1f7f", new Object[]{networkAbility, str, new Integer(i), new Double(d2), new Long(j)});
        } else {
            networkAbility.e(str, i, d2, j);
        }
    }

    public static /* synthetic */ Object ipc$super(NetworkAbility networkAbility, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/network/diagnosis/model/NetworkAbility");
    }

    public final FinishResult a(Map<String, ?> map) {
        double d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FinishResult) ipChange.ipc$dispatch("49b5fe41", new Object[]{this, map});
        }
        String w = MegaUtils.w(map, "host", null);
        if (w == null || w.isEmpty()) {
            d2 = NetworkQualityMonitor.getInstance().getGlobalCurrentBandwidth();
        } else {
            d2 = NetworkQualityMonitor.getInstance().getDomainCurrentBandwidth(w);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("result", Double.valueOf(d2));
        return new FinishResult(hashMap);
    }

    public final FinishResult b(Map<String, ?> map) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FinishResult) ipChange.ipc$dispatch("b4a44a4c", new Object[]{this, map});
        }
        String w = MegaUtils.w(map, "host", null);
        if (w == null || w.isEmpty()) {
            i = NetworkQualityMonitor.getGlobalNetworkQuality();
        } else {
            i = NetworkQualityMonitor.getDomainNetworkQuality(w);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("result", h(i));
        return new FinishResult(hashMap);
    }

    public final FinishResult c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FinishResult) ipChange.ipc$dispatch("cebe3c4e", new Object[]{this});
        }
        String i = i(NetworkStatusHelper.getStatus());
        HashMap hashMap = new HashMap();
        hashMap.put("result", i);
        return new FinishResult(hashMap);
    }

    public final FinishResult d(Map<String, ?> map) {
        double d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FinishResult) ipChange.ipc$dispatch("b15056ca", new Object[]{this, map});
        }
        String w = MegaUtils.w(map, "host", null);
        if (w == null || w.isEmpty()) {
            d2 = NetworkQualityMonitor.getInstance().getGlobalPredictBandWidth();
        } else {
            d2 = NetworkQualityMonitor.getInstance().getDomainPredictBandwidth(w);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("result", Double.valueOf(d2));
        return new FinishResult(hashMap);
    }

    public final void e(String str, int i, double d2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f72f440", new Object[]{this, str, new Integer(i), new Double(d2), new Long(j)});
            return;
        }
        List list = (List) ((HashMap) this.e).get(str);
        if (list != null && !list.isEmpty()) {
            MegaUtils.z(new c(i, d2, j, list), -1L);
        }
    }

    public final void f(NetworkStatusHelper.NetworkStatus networkStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("197071e9", new Object[]{this, networkStatus});
        } else if (!((CopyOnWriteArrayList) this.b).isEmpty()) {
            MegaUtils.z(new a(networkStatus), -1L);
        }
    }

    public final void g(int i, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("149d39d6", new Object[]{this, new Integer(i), new Double(d2)});
        } else if (!((CopyOnWriteArrayList) this.d).isEmpty()) {
            MegaUtils.z(new b(i, d2), -1L);
        }
    }

    public final String i(NetworkStatusHelper.NetworkStatus networkStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa6c93f", new Object[]{this, networkStatus});
        }
        if (networkStatus == NetworkStatusHelper.NetworkStatus.NO) {
            return "NoNetwork";
        }
        if (networkStatus.isMobile()) {
            return networkStatus.getType();
        }
        if (networkStatus.isWifi()) {
            return "WiFi";
        }
        return "NETWORK_UNKNOWN";
    }

    public final void j(vq vqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c12eaf45", new Object[]{this, vqVar});
            return;
        }
        if (this.f5927a.compareAndSet(false, true)) {
            f fVar = new f(this);
            this.g = fVar;
            NetworkStatusHelper.addStatusChangeListener(fVar);
        }
        ((CopyOnWriteArrayList) this.b).add(vqVar);
    }

    public final void k(Map<String, ?> map, vq vqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("141a4dda", new Object[]{this, map, vqVar});
            return;
        }
        List list = null;
        String w = MegaUtils.w(map, "host", null);
        if (w == null || w.isEmpty()) {
            if (this.c.compareAndSet(false, true)) {
                this.h = new e(this);
                if (!NetworkQualityMonitor.getInstance().registerGlobalNetworkQualityListener(this.h)) {
                    vqVar.b(new ErrorResult("1001", Localization.q(R.string.taobao_app_1012_1_14027)));
                    return;
                }
            }
            ((CopyOnWriteArrayList) this.d).add(vqVar);
            return;
        }
        if (((HashMap) this.f).get(w) == null) {
            d dVar = new d(this);
            if (!NetworkQualityMonitor.getInstance().registerDomainNetworkQualityListener(w, dVar)) {
                vqVar.b(new ErrorResult("1002", Localization.q(R.string.taobao_app_1012_1_14032)));
                return;
            }
            ((HashMap) this.f).put(w, dVar);
        }
        if (((HashMap) this.e).containsKey(w)) {
            list = (List) ((HashMap) this.e).get(w);
        }
        if (list == null) {
            list = new ArrayList();
            ((HashMap) this.e).put(w, list);
        }
        list.add(vqVar);
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e844870", new Object[]{this});
            return;
        }
        if (this.c.compareAndSet(true, false)) {
            NetworkQualityMonitor.getInstance().unregisterGlobalNetworkQualityListener(this.h);
            ((CopyOnWriteArrayList) this.d).clear();
            this.h = null;
        }
        for (String str : ((HashMap) this.f).keySet()) {
            NetworkQualityMonitor.getInstance().unregisterDomainNetworkQualityListener(str, (d) ((HashMap) this.f).get(str));
        }
        ((HashMap) this.f).clear();
        ((HashMap) this.e).clear();
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b3bb8bf", new Object[]{this});
        } else if (this.f5927a.compareAndSet(true, false)) {
            NetworkStatusHelper.removeStatusChangeListener(this.g);
            ((CopyOnWriteArrayList) this.b).clear();
            this.g = null;
        }
    }

    @Override // tb.cu
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        m();
        l();
    }

    public final String h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e8261e48", new Object[]{this, new Integer(i)});
        }
        if (i == 1) {
            return "poor";
        }
        if (i == 2) {
            return "normal";
        }
        if (i != 3) {
            return "unknow";
        }
        return "excellent";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007f, code lost:
        if (r9.equals(com.network.diagnosis.model.NetworkAbility.API_REGISTER_NETWORK_LISTENER) == false) goto L_0x003a;
     */
    @Override // tb.hdb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.alibaba.ability.result.ExecuteResult execute(java.lang.String r9, tb.kdb r10, java.util.Map<java.lang.String, ?> r11, tb.vq r12) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.network.diagnosis.model.NetworkAbility.execute(java.lang.String, tb.kdb, java.util.Map, tb.vq):com.alibaba.ability.result.ExecuteResult");
    }
}
