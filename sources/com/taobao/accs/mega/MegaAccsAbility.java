package com.taobao.accs.mega;

import android.text.TextUtils;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ACCSClient;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.base.AccsAbstractDataListener;
import com.taobao.accs.base.AccsConnectStateListener;
import com.taobao.accs.base.AccsConnectStateListener2;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.utl.ALog;
import com.taobao.android.abilityidl.ability.AbsAccsAbility;
import com.taobao.android.abilityidl.ability.AccsBindResult;
import com.taobao.android.abilityidl.ability.AccsConnectCommonResult;
import com.taobao.android.abilityidl.ability.AccsConnectFailResult;
import com.taobao.android.abilityidl.ability.AccsConnectionResult;
import com.taobao.android.abilityidl.ability.AccsListenerKeyResult;
import com.taobao.android.abilityidl.ability.AccsReceivedResult;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.brt;
import tb.e70;
import tb.i70;
import tb.j70;
import tb.k70;
import tb.kdb;
import tb.t2o;
import tb.tao;
import tb.udb;
import tb.vdb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class MegaAccsAbility extends AbsAccsAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<String, String> f6068a = new ConcurrentHashMap<>(4);
    public final ConcurrentHashMap<String, i> b = new ConcurrentHashMap<>(4);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f6069a;
        public final /* synthetic */ udb b;
        public final /* synthetic */ String c;

        public a(String str, udb udbVar, String str2) {
            this.f6069a = str;
            this.b = udbVar;
            this.c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                ACCSClient accsClient = ACCSClient.getAccsClient(this.f6069a);
                h hVar = new h(null);
                hVar.d(this.b);
                accsClient.registerDataListener(this.c, hVar);
                MegaAccsAbility.access$100(MegaAccsAbility.this).put(this.c, this.f6069a);
                AccsBindResult accsBindResult = new AccsBindResult();
                accsBindResult.statusCode = 200;
                accsBindResult.message = "bindService succeed";
                this.b.A(accsBindResult);
            } catch (Throwable th) {
                udb udbVar = this.b;
                udbVar.O(new ErrorResult("INNER_ERR", "bindService inner err:" + th));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ACCSClient f6070a;
        public final /* synthetic */ String b;

        public b(ACCSClient aCCSClient, String str) {
            this.f6070a = aCCSClient;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            this.f6070a.unRegisterDataListener(this.b);
            MegaAccsAbility.access$100(MegaAccsAbility.this).remove(this.b);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f6071a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;

        public c(String str, String str2, String str3, String str4) {
            this.f6071a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                ACCSClient.getAccsClient(this.f6071a).sendData(new ACCSManager.AccsRequest(this.b, this.c, this.d.getBytes(), ""));
            } catch (Throwable th) {
                ALog.e("MegaAccsAbility", "exception occur in send:", th, new Object[0]);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f6072a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;

        public d(Map map, String str, String str2, String str3, String str4) {
            this.f6072a = map;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                String access$200 = MegaAccsAbility.access$200(MegaAccsAbility.this, this.f6072a, "dataId", "");
                String access$2002 = MegaAccsAbility.access$200(MegaAccsAbility.this, this.f6072a, "host", "");
                boolean parseBoolean = Boolean.parseBoolean(MegaAccsAbility.access$200(MegaAccsAbility.this, this.f6072a, "isUnit", "false"));
                int parseInt = Integer.parseInt(MegaAccsAbility.access$200(MegaAccsAbility.this, this.f6072a, "timeout", "0"));
                ACCSManager.AccsRequest accsRequest = new ACCSManager.AccsRequest(this.b, this.c, this.d.getBytes(), access$200, MegaAccsAbility.access$200(MegaAccsAbility.this, this.f6072a, "target", ""), new URL(access$2002), MegaAccsAbility.access$200(MegaAccsAbility.this, this.f6072a, "businessId", ""));
                accsRequest.setTag(this.e);
                accsRequest.setIsUnitBusiness(parseBoolean);
                accsRequest.setTimeOut(parseInt);
                ACCSClient.getAccsClient(this.e).sendData(accsRequest);
            } catch (Throwable th) {
                ALog.e("MegaAccsAbility", "exception occur in setData", th, new Object[0]);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ACCSClient f6073a;
        public final /* synthetic */ i b;
        public final /* synthetic */ String c;
        public final /* synthetic */ vdb d;

        public e(ACCSClient aCCSClient, i iVar, String str, vdb vdbVar) {
            this.f6073a = aCCSClient;
            this.b = iVar;
            this.c = str;
            this.d = vdbVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            this.f6073a.registerConnectStateListener(this.b);
            MegaAccsAbility.access$300(MegaAccsAbility.this).put(this.c, this.b);
            AccsListenerKeyResult accsListenerKeyResult = new AccsListenerKeyResult();
            accsListenerKeyResult.listenerKey = this.c;
            this.d.C0(accsListenerKeyResult);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ACCSClient f6074a;
        public final /* synthetic */ i b;

        public f(ACCSClient aCCSClient, i iVar) {
            this.f6074a = aCCSClient;
            this.b = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f6074a.unRegisterConnectStateListener(this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            for (Map.Entry entry : MegaAccsAbility.access$300(MegaAccsAbility.this).entrySet()) {
                try {
                    ACCSClient.getAccsClient(i.a((i) entry.getValue())).unRegisterConnectStateListener((AccsConnectStateListener) entry.getValue());
                } catch (Throwable unused) {
                }
            }
            MegaAccsAbility.access$300(MegaAccsAbility.this).clear();
            for (Map.Entry entry2 : MegaAccsAbility.access$100(MegaAccsAbility.this).entrySet()) {
                try {
                    ACCSClient.getAccsClient((String) entry2.getValue()).unRegisterDataListener((String) entry2.getKey());
                } catch (Throwable unused2) {
                }
            }
            MegaAccsAbility.access$100(MegaAccsAbility.this).clear();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class h extends AccsAbstractDataListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public udb f6076a;

        static {
            t2o.a(343933148);
        }

        public h() {
        }

        public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/accs/mega/MegaAccsAbility$MegaIdlAccsDataListener");
        }

        public void d(udb udbVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8a399b9c", new Object[]{this, udbVar});
            } else {
                this.f6076a = udbVar;
            }
        }

        @Override // com.taobao.accs.base.AccsDataListener
        public void onBind(String str, int i, TaoBaseService.ExtraInfo extraInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3fa398db", new Object[]{this, str, new Integer(i), extraInfo});
            }
        }

        @Override // com.taobao.accs.base.AccsDataListener
        public void onData(String str, String str2, String str3, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("694255fc", new Object[]{this, str, str2, str3, bArr, extraInfo});
            } else if (this.f6076a != null) {
                AccsReceivedResult accsReceivedResult = new AccsReceivedResult();
                accsReceivedResult.serviceID = str;
                accsReceivedResult.dataID = str3;
                try {
                    accsReceivedResult.data = JSON.parseObject(new String(bArr));
                    this.f6076a.e1(accsReceivedResult);
                } catch (Throwable th) {
                    udb udbVar = this.f6076a;
                    udbVar.O(new ErrorResult("INNER_ERR", "onData inner err:" + th));
                }
            }
        }

        @Override // com.taobao.accs.base.AccsDataListener
        public void onResponse(String str, String str2, int i, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d5239c42", new Object[]{this, str, str2, new Integer(i), bArr, extraInfo});
            }
        }

        @Override // com.taobao.accs.base.AccsDataListener
        public void onSendData(String str, String str2, int i, TaoBaseService.ExtraInfo extraInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f29e89fa", new Object[]{this, str, str2, new Integer(i), extraInfo});
            }
        }

        @Override // com.taobao.accs.base.AccsDataListener
        public void onUnbind(String str, int i, TaoBaseService.ExtraInfo extraInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7b4e074", new Object[]{this, str, new Integer(i), extraInfo});
            }
        }

        public /* synthetic */ h(a aVar) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class i implements AccsConnectStateListener2 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public vdb f6077a;
        public final String b;

        static {
            t2o.a(343933149);
            t2o.a(343933001);
        }

        public i(String str) {
            this.b = str;
        }

        public static /* synthetic */ String a(i iVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("81e9004a", new Object[]{iVar});
            }
            return iVar.b;
        }

        public void b(vdb vdbVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("31c4ed8d", new Object[]{this, vdbVar});
            } else {
                this.f6077a = vdbVar;
            }
        }

        @Override // com.taobao.accs.base.AccsConnectStateListener2
        public void onConnectFail(TaoBaseService.ConnectInfo connectInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4bfd2647", new Object[]{this, connectInfo});
            } else if (this.f6077a != null) {
                AccsConnectFailResult accsConnectFailResult = new AccsConnectFailResult();
                accsConnectFailResult.connected = Boolean.FALSE;
                accsConnectFailResult.errorCode = Integer.valueOf(connectInfo.errorCode);
                accsConnectFailResult.errordetail = connectInfo.errordetail;
                this.f6077a.y(accsConnectFailResult);
            }
        }

        @Override // com.taobao.accs.base.AccsConnectStateListener2, com.taobao.accs.base.AccsConnectStateListener
        public void onConnected(TaoBaseService.ConnectInfo connectInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df10c6", new Object[]{this, connectInfo});
            } else if (this.f6077a != null) {
                AccsConnectCommonResult accsConnectCommonResult = new AccsConnectCommonResult();
                accsConnectCommonResult.connected = Boolean.TRUE;
                this.f6077a.f0(accsConnectCommonResult);
            }
        }

        @Override // com.taobao.accs.base.AccsConnectStateListener2, com.taobao.accs.base.AccsConnectStateListener
        public void onDisconnected(TaoBaseService.ConnectInfo connectInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e46188f6", new Object[]{this, connectInfo});
            } else if (this.f6077a != null) {
                AccsConnectCommonResult accsConnectCommonResult = new AccsConnectCommonResult();
                accsConnectCommonResult.connected = Boolean.FALSE;
                this.f6077a.R(accsConnectCommonResult);
            }
        }
    }

    static {
        t2o.a(343933140);
    }

    public static /* synthetic */ ConcurrentHashMap access$100(MegaAccsAbility megaAccsAbility) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("b174c852", new Object[]{megaAccsAbility});
        }
        return megaAccsAbility.f6068a;
    }

    public static /* synthetic */ String access$200(MegaAccsAbility megaAccsAbility, Map map, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("546078bc", new Object[]{megaAccsAbility, map, str, str2});
        }
        return megaAccsAbility.a(map, str, str2);
    }

    public static /* synthetic */ ConcurrentHashMap access$300(MegaAccsAbility megaAccsAbility) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("41738510", new Object[]{megaAccsAbility});
        }
        return megaAccsAbility.b;
    }

    public static /* synthetic */ Object ipc$super(MegaAccsAbility megaAccsAbility, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/accs/mega/MegaAccsAbility");
    }

    public final String a(Map<String, ?> map, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b1dba1f9", new Object[]{this, map, str, str2});
        }
        if (map.containsKey(str)) {
            return String.valueOf(map.get(str));
        }
        return str2;
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAccsAbility
    public void addConnectionListener(kdb kdbVar, e70 e70Var, vdb vdbVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("129460a8", new Object[]{this, kdbVar, e70Var, vdbVar});
            return;
        }
        try {
            if (TextUtils.isEmpty(e70Var.f18335a)) {
                str = "default";
            } else {
                str = e70Var.f18335a;
            }
            i iVar = new i(str);
            iVar.b(vdbVar);
            brt.d().execute(new e(ACCSClient.getAccsClient(str), iVar, String.valueOf(System.currentTimeMillis()), vdbVar));
        } catch (Throwable th) {
            vdbVar.O(new ErrorResult("INNER_ERR", "addConnectionListener inner err:" + th));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAccsAbility
    public void bindService(kdb kdbVar, k70 k70Var, udb udbVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("437e8414", new Object[]{this, kdbVar, k70Var, udbVar});
            return;
        }
        String str2 = k70Var.f22442a;
        if (TextUtils.isEmpty(str2)) {
            udbVar.O(new ErrorResult("SERVICEID_EMPTY_ERR", "bindService: serviceId empty"));
            return;
        }
        if (TextUtils.isEmpty(k70Var.b)) {
            str = "default";
        } else {
            str = k70Var.b;
        }
        brt.d().execute(new a(str, udbVar, str2));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAccsAbility
    public tao<AccsConnectionResult, ErrorResult> connection(kdb kdbVar, e70 e70Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("f587950", new Object[]{this, kdbVar, e70Var});
        }
        String str = e70Var.f18335a;
        AccsConnectionResult accsConnectionResult = new AccsConnectionResult();
        try {
            accsConnectionResult.isConnected = Boolean.valueOf(ACCSClient.getAccsClient(str).isAccsConnected());
            accsConnectionResult.unitInfo = ACCSClient.getAccsClient(str).getConnectionUnitInfo();
            return new tao<>(accsConnectionResult);
        } catch (Throwable th) {
            return new tao<>(null, new ErrorResult("INNER_ERR", "connection inner err:" + th));
        }
    }

    @Override // tb.st, tb.odb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        brt.d().execute(new g());
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAccsAbility
    public tao<Object, ErrorResult> removeConnectionListener(kdb kdbVar, i70 i70Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("e7a00a53", new Object[]{this, kdbVar, i70Var});
        }
        try {
            String str = i70Var.b;
            if (TextUtils.isEmpty(str)) {
                return new tao<>(null, new ErrorResult("LISTENERKEY_EMPTY_ERR", "removeConnectionListener listenerKey empty err"));
            }
            i remove = this.b.remove(str);
            if (remove == null) {
                return new tao<>();
            }
            brt.d().execute(new f(ACCSClient.getAccsClient(i70Var.f21133a), remove));
            return new tao<>();
        } catch (Throwable th) {
            return new tao<>(null, new ErrorResult("INNER_ERR", "removeConnectionListener inner err:" + th));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAccsAbility
    public tao<Object, ErrorResult> send(kdb kdbVar, j70 j70Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("8aca1569", new Object[]{this, kdbVar, j70Var});
        }
        String str = j70Var.f21806a;
        if (TextUtils.isEmpty(str)) {
            return new tao<>(null, new ErrorResult("SERVICEID_EMPTY_ERR", "send: serviceId empty err"));
        }
        Map<String, ? extends Object> map = j70Var.b;
        if (map == null || map.isEmpty()) {
            return new tao<>(null, new ErrorResult("DATA_EMPTY_ERR", "send: data empty err"));
        }
        String jSONString = JSON.toJSONString(map);
        String str2 = j70Var.c;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = j70Var.d;
        Map<String, ? extends Object> map2 = j70Var.e;
        if (map2 == null || map2.isEmpty()) {
            brt.d().execute(new c(str3, str2, str, jSONString));
            return new tao<>();
        }
        brt.d().execute(new d(map2, str2, str, jSONString, str3));
        return new tao<>();
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAccsAbility
    public tao<Object, ErrorResult> unBindService(kdb kdbVar, k70 k70Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("61526985", new Object[]{this, kdbVar, k70Var});
        }
        try {
            String str = k70Var.f22442a;
            if (TextUtils.isEmpty(str)) {
                return new tao<>(null, new ErrorResult("SERVICEID_EMPTY_ERR", "unBindService serviceId empty err"));
            }
            brt.d().execute(new b(ACCSClient.getAccsClient(k70Var.b), str));
            return new tao<>();
        } catch (Throwable th) {
            return new tao<>(null, new ErrorResult("INNER_ERR", "unBindService inner err:" + th));
        }
    }
}
