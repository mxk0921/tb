package com.taobao.tao.messagekit.base.network;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.base.MsgRouter;
import com.taobao.tao.messagekit.core.model.AccsConnInfo;
import com.taobao.tao.messagekit.core.model.BaseMessage;
import com.taobao.tao.messagekit.core.model.Command;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import com.taobao.taolive.sdk.model.message.PowerMsgType;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.dva;
import tb.ikl;
import tb.l5y;
import tb.mvl;
import tb.n8l;
import tb.p2j;
import tb.t2o;
import tb.ts1;
import tb.vxx;
import tb.x4u;
import tb.zjl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class AccsConnection extends ts1<DataPackage, byte[]> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DATA_PACKAGE_MAX = 10240;
    public static final String TAG = "AccsConnection";
    public final tao.reactivex.h.a<ikl> e;
    public final vxx<List<ikl>> f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class DataPackage {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f12534a;
        public final String b;
        public final int c;
        public final String e;
        public final String f;
        public int g;
        public String i;
        public byte[] j;
        public String d = "";
        public boolean h = false;
        public final List<ikl> k = new ArrayList();
        public final ByteArrayOutputStream l = new ByteArrayOutputStream();

        static {
            t2o.a(628097127);
        }

        public DataPackage(String str, int i, String str2) {
            this.f12534a = "";
            this.b = "";
            this.e = "";
            this.f = "";
            this.f12534a = str;
            this.c = i;
            this.b = str2;
            String str3 = p2j.i.get(Integer.valueOf(i));
            if (str3 != null) {
                this.e = str3;
            } else if (p2j.g()) {
                throw new Error("serviceId " + i + " not set");
            }
            this.f = p2j.m.c();
        }

        public void a(ikl iklVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b7955327", new Object[]{this, iklVar});
                return;
            }
            if (((ArrayList) this.k).size() < 1) {
                this.d = iklVar.f21366a.getID();
            }
            ((ArrayList) this.k).add(iklVar);
        }

        public int b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("842ad8e4", new Object[]{this})).intValue();
            }
            return this.g;
        }

        public byte[] c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("3e6c8fa1", new Object[]{this});
            }
            byte[] bArr = this.j;
            if (bArr != null) {
                return bArr;
            }
            return this.l.toByteArray();
        }

        public List<ikl> d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("a180e39d", new Object[]{this});
            }
            return this.k;
        }

        public ByteArrayOutputStream e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ByteArrayOutputStream) ipChange.ipc$dispatch("f679cbf8", new Object[]{this});
            }
            return this.l;
        }

        public String f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("663f84d2", new Object[]{this});
            }
            String str = "";
            if (getRouteInfo() != null) {
                return str;
            }
            if (!TextUtils.isEmpty(this.f12534a)) {
                str = str + this.f12534a;
            }
            if (TextUtils.isEmpty(this.b) || n8l.c()) {
                return str;
            }
            return str + ":T_" + this.b;
        }

        public boolean g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ce6c5c68", new Object[]{this})).booleanValue();
            }
            return this.h;
        }

        public String getRouteInfo() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("4fc0e5b8", new Object[]{this});
            }
            if (!TextUtils.isEmpty(this.i)) {
                return this.i + "||";
            }
            x4u f = com.taobao.tao.powermsg.managers.a.f(this.g, this.b);
            if (f == null) {
                return null;
            }
            return f.c() + "|" + f.d() + "|" + f.e();
        }

        public DataPackage h(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DataPackage) ipChange.ipc$dispatch("432deac8", new Object[]{this, new Integer(i)});
            }
            this.g = i;
            return this;
        }

        public void i(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a10c2228", new Object[]{this, new Boolean(z)});
            } else {
                this.h = z;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ikl f12535a;

        public a(ikl iklVar) {
            this.f12535a = iklVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0064 A[Catch: all -> 0x0045, TryCatch #0 {all -> 0x0045, blocks: (B:6:0x0012, B:8:0x003c, B:13:0x0047, B:14:0x004a, B:16:0x0064, B:17:0x006a), top: B:20:0x0012 }] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r7 = this;
                r0 = 0
                r1 = 1
                com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.tao.messagekit.base.network.AccsConnection.a.$ipChange
                boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r3 == 0) goto L_0x0012
                java.lang.String r3 = "5c510192"
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r0] = r7
                r2.ipc$dispatch(r3, r1)
                return
            L_0x0012:
                tb.ikl r2 = r7.f12535a     // Catch: all -> 0x0045
                com.taobao.tao.messagekit.base.network.AccsConnection$DataPackage r3 = new com.taobao.tao.messagekit.base.network.AccsConnection$DataPackage     // Catch: all -> 0x0045
                M extends com.taobao.tao.messagekit.core.model.IProtocol r4 = r2.f21366a     // Catch: all -> 0x0045
                r5 = r4
                com.taobao.tao.messagekit.core.model.BaseMessage r5 = (com.taobao.tao.messagekit.core.model.BaseMessage) r5     // Catch: all -> 0x0045
                java.lang.String r5 = r5.routerId     // Catch: all -> 0x0045
                int r6 = r2.b     // Catch: all -> 0x0045
                com.taobao.tao.messagekit.core.model.BaseMessage r4 = (com.taobao.tao.messagekit.core.model.BaseMessage) r4     // Catch: all -> 0x0045
                tb.dva r4 = r4.header     // Catch: all -> 0x0045
                java.lang.String r4 = r4.f18091a     // Catch: all -> 0x0045
                r3.<init>(r5, r6, r4)     // Catch: all -> 0x0045
                M extends com.taobao.tao.messagekit.core.model.IProtocol r4 = r2.f21366a     // Catch: all -> 0x0045
                com.taobao.tao.messagekit.core.model.BaseMessage r4 = (com.taobao.tao.messagekit.core.model.BaseMessage) r4     // Catch: all -> 0x0045
                int r4 = r4.bizCode     // Catch: all -> 0x0045
                r3.h(r4)     // Catch: all -> 0x0045
                M extends com.taobao.tao.messagekit.core.model.IProtocol r4 = r2.f21366a     // Catch: all -> 0x0045
                r5 = r4
                com.taobao.tao.messagekit.core.model.BaseMessage r5 = (com.taobao.tao.messagekit.core.model.BaseMessage) r5     // Catch: all -> 0x0045
                int r5 = r5.msgType     // Catch: all -> 0x0045
                r6 = 8
                if (r5 == r6) goto L_0x0047
                com.taobao.tao.messagekit.core.model.BaseMessage r4 = (com.taobao.tao.messagekit.core.model.BaseMessage) r4     // Catch: all -> 0x0045
                int r4 = r4.msgType     // Catch: all -> 0x0045
                r5 = 10
                if (r4 != r5) goto L_0x004a
                goto L_0x0047
            L_0x0045:
                r2 = move-exception
                goto L_0x0083
            L_0x0047:
                r3.i(r1)     // Catch: all -> 0x0045
            L_0x004a:
                M extends com.taobao.tao.messagekit.core.model.IProtocol r4 = r2.f21366a     // Catch: all -> 0x0045
                com.taobao.tao.messagekit.core.model.BaseMessage r4 = (com.taobao.tao.messagekit.core.model.BaseMessage) r4     // Catch: all -> 0x0045
                byte[] r4 = r4.toProtocol()     // Catch: all -> 0x0045
                r3.j = r4     // Catch: all -> 0x0045
                M extends com.taobao.tao.messagekit.core.model.IProtocol r4 = r2.f21366a     // Catch: all -> 0x0045
                com.taobao.tao.messagekit.core.model.BaseMessage r4 = (com.taobao.tao.messagekit.core.model.BaseMessage) r4     // Catch: all -> 0x0045
                java.lang.String r4 = r4.getID()     // Catch: all -> 0x0045
                r3.d = r4     // Catch: all -> 0x0045
                M extends com.taobao.tao.messagekit.core.model.IProtocol r4 = r2.f21366a     // Catch: all -> 0x0045
                boolean r5 = r4 instanceof com.taobao.tao.powermsg.model.SubscribeMessage     // Catch: all -> 0x0045
                if (r5 == 0) goto L_0x006a
                com.taobao.tao.powermsg.model.SubscribeMessage r4 = (com.taobao.tao.powermsg.model.SubscribeMessage) r4     // Catch: all -> 0x0045
                java.lang.String r4 = r4.routeGroup     // Catch: all -> 0x0045
                r3.i = r4     // Catch: all -> 0x0045
            L_0x006a:
                com.taobao.tao.messagekit.base.MsgRouter r4 = com.taobao.tao.messagekit.base.MsgRouter.e()     // Catch: all -> 0x0045
                tb.x9o r4 = r4.h()     // Catch: all -> 0x0045
                M extends com.taobao.tao.messagekit.core.model.IProtocol r5 = r2.f21366a     // Catch: all -> 0x0045
                com.taobao.tao.messagekit.core.model.BaseMessage r5 = (com.taobao.tao.messagekit.core.model.BaseMessage) r5     // Catch: all -> 0x0045
                java.lang.String r5 = r5.getID()     // Catch: all -> 0x0045
                r4.c(r5, r2)     // Catch: all -> 0x0045
                com.taobao.tao.messagekit.base.network.AccsConnection r2 = com.taobao.tao.messagekit.base.network.AccsConnection.this     // Catch: all -> 0x0045
                r2.n(r3)     // Catch: all -> 0x0045
                goto L_0x008e
            L_0x0083:
                java.lang.Object[] r1 = new java.lang.Object[r1]
                java.lang.String r3 = "accs send err"
                r1[r0] = r3
                java.lang.String r0 = "AccsConnection"
                com.taobao.tao.messagekit.core.utils.MsgLog.f(r0, r2, r1)
            L_0x008e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.messagekit.base.network.AccsConnection.a.run():void");
        }
    }

    static {
        t2o.a(628097123);
    }

    public AccsConnection() {
        tao.reactivex.h.a<ikl> P = tao.reactivex.h.a.P();
        this.e = P;
        mvl mvlVar = new mvl();
        b bVar = new b();
        this.f28920a = 0;
        mvlVar.f(P).e(100L).g(bVar);
    }

    public static /* synthetic */ Object ipc$super(AccsConnection accsConnection, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/messagekit/base/network/AccsConnection");
    }

    @Override // tb.ts1
    public void h(ikl iklVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7150024e", new Object[]{this, iklVar});
        } else if (iklVar == null || !iklVar.m || !(iklVar.f21366a instanceof BaseMessage)) {
            this.e.onNext(iklVar);
        } else {
            zjl.b().execute(new a(iklVar));
        }
    }

    @Override // tb.ts1
    public int k(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b6758dc4", new Object[]{this, new Integer(i), str})).intValue();
        }
        if (i == -13 || i == -11) {
            return -3004;
        }
        if (i == -9) {
            return PowerMsgType.TIMEOUT;
        }
        if (i != 200) {
            return 2000;
        }
        return -30000;
    }

    public void m(int i, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7a9b852", new Object[]{this, new Integer(i), map});
            return;
        }
        Command create = Command.create(1);
        dva dvaVar = create.header;
        dvaVar.c = i;
        dvaVar.g = 306;
        create.body.e = new HashMap();
        if (map != null) {
            create.body.e.putAll(map);
        }
        Map<String, String> map2 = create.body.e;
        map2.put(ts1.CONNECTION_TYPE, "" + this.f28920a);
        MsgLog.g(TAG, Integer.valueOf(this.f28920a), Integer.valueOf(i), "code:", create.body.e.get(ts1.CONNECTION_CODE));
        l5y.m(new ikl(create)).a(MsgRouter.e().c());
        if (1000 == i) {
            l5y.m(new ikl(new AccsConnInfo(true))).a(MsgRouter.e().c());
        }
    }

    public abstract void n(DataPackage dataPackage);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements vxx<List<ikl>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        /* renamed from: a */
        public void accept(List<ikl> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1d130480", new Object[]{this, list});
            } else if (list != null && list.size() > 0 && AccsConnection.this.b() != null) {
                l5y.m(list).z(AccsConnection.this.b()).K(new a());
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements vxx<DataPackage> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            /* renamed from: a */
            public void accept(DataPackage dataPackage) {
                IOException e;
                int i = 1;
                String str = AccsConnection.TAG;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("58cd3fab", new Object[]{this, dataPackage});
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                ArrayList arrayList = new ArrayList(2);
                String str2 = "";
                String str3 = str2;
                int i2 = 0;
                int i3 = 0;
                while (i2 < dataPackage.d().size()) {
                    ikl iklVar = dataPackage.d().get(i2);
                    iklVar.f = System.currentTimeMillis();
                    byte[] protocol = iklVar.f21366a.toProtocol();
                    try {
                        str2 = iklVar.f21366a.getID();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    if (arrayList.size() <= i3 || ((DataPackage) arrayList.get(i3)).e().size() + protocol.length >= 10240) {
                        DataPackage dataPackage2 = new DataPackage(dataPackage.f12534a, dataPackage.c, dataPackage.b);
                        dataPackage2.h(dataPackage.b());
                        dataPackage2.i(dataPackage.g());
                        arrayList.add(dataPackage2);
                        i3 = arrayList.size() - 1;
                        ((DataPackage) arrayList.get(i3)).a(iklVar);
                        str3 = str2;
                    }
                    try {
                        ((DataPackage) arrayList.get(i3)).e().write(protocol);
                        Boolean valueOf = Boolean.valueOf(((DataPackage) arrayList.get(i3)).g());
                        Object[] objArr = new Object[6];
                        objArr[0] = "combine msg >";
                        objArr[i] = str2;
                        try {
                            objArr[2] = "to";
                            objArr[3] = str3;
                            objArr[4] = "sendReq:";
                            objArr[5] = valueOf;
                            MsgLog.g(str, objArr);
                        } catch (IOException e3) {
                            e = e3;
                            Object[] objArr2 = new Object[i];
                            objArr2[0] = "protocol packet error";
                            MsgLog.f(str, e, objArr2);
                            MsgRouter.e().a().b(iklVar.f21366a.getID(), -3005, null);
                            e.printStackTrace();
                            iklVar.c = ((DataPackage) arrayList.get(i3)).d;
                            MsgRouter.e().h().c(iklVar.c, iklVar);
                            iklVar.f = System.currentTimeMillis() - iklVar.f;
                            iklVar.g = currentTimeMillis;
                            i2++;
                            str = str;
                            i = 1;
                        }
                    } catch (IOException e4) {
                        e = e4;
                    }
                    iklVar.c = ((DataPackage) arrayList.get(i3)).d;
                    MsgRouter.e().h().c(iklVar.c, iklVar);
                    iklVar.f = System.currentTimeMillis() - iklVar.f;
                    iklVar.g = currentTimeMillis;
                    i2++;
                    str = str;
                    i = 1;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AccsConnection.this.n((DataPackage) it.next());
                }
            }
        }
    }
}
