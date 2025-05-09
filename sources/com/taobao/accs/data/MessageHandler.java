package com.taobao.accs.data;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.status.NetworkStatusHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.antibrush.AntiBrush;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.data.Message;
import com.taobao.accs.flowcontrol.FlowControl;
import com.taobao.accs.net.BaseConnection;
import com.taobao.accs.net.InAppConnection;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.accs.ut.monitor.NetPerformanceMonitor;
import com.taobao.accs.ut.monitor.NetPerformanceOverseasMonitor;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.NoTraceTriggerHelper;
import com.taobao.accs.utl.UtilityImpl;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ScheduledFuture;
import mtopsdk.common.util.SymbolExpUtil;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.common.Config;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.brt;
import tb.bxf;
import tb.c71;
import tb.ed1;
import tb.f2d;
import tb.h5d;
import tb.j8l;
import tb.m8l;
import tb.o2j;
import tb.pg1;
import tb.t2o;
import tb.vu3;
import tb.xpd;
import tb.xqi;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class MessageHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MESSAGE_ID_CACHE_SIZE = 50;
    public final Context c;
    public int d;
    public final FlowControl e;
    public final AntiBrush f;
    public final BaseConnection g;
    public final String i;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentMap<Message.Id, Message> f6049a = new ConcurrentHashMap();
    public final ConcurrentMap<String, ScheduledFuture<?>> b = new ConcurrentHashMap();
    public String h = "";
    public final LinkedHashMap<String, String> j = new LinkedHashMap<String, String>() { // from class: com.taobao.accs.data.MessageHandler.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/accs/data/MessageHandler$1");
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<String, String> entry) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6471a6cf", new Object[]{this, entry})).booleanValue();
            }
            if (MessageHandler.a(MessageHandler.this).w()) {
                if (size() > 200) {
                    return true;
                }
                return false;
            } else if (size() > 50) {
                return true;
            } else {
                return false;
            }
        }
    };
    public final Map<String, ed1> k = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                MessageHandler.b(MessageHandler.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                MessageHandler.c(MessageHandler.this);
            }
        }
    }

    static {
        t2o.a(343933088);
    }

    public MessageHandler(Context context, BaseConnection baseConnection) {
        String str = "MsgRecv_";
        this.i = str;
        this.c = context;
        this.g = baseConnection;
        this.e = new FlowControl(context);
        this.f = new AntiBrush(context);
        if (baseConnection != null) {
            str = str + baseConnection.r;
        }
        this.i = str;
        brt.g().execute(new a());
    }

    public static /* synthetic */ BaseConnection a(MessageHandler messageHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseConnection) ipChange.ipc$dispatch("e8344e2e", new Object[]{messageHandler});
        }
        return messageHandler.g;
    }

    public static /* synthetic */ void b(MessageHandler messageHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd9428ab", new Object[]{messageHandler});
        } else {
            messageHandler.E();
        }
    }

    public static /* synthetic */ void c(MessageHandler messageHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c080920a", new Object[]{messageHandler});
        } else {
            messageHandler.F();
        }
    }

    public final void A(Map<Integer, String> map, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1f2d445", new Object[]{this, map, intent});
        } else if (map != null && intent != null) {
            intent.putExtra(TaoBaseService.ExtraInfo.EXT_HEADER, (HashMap) map);
        }
    }

    public final void C(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8013202", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str) && !this.j.containsKey(str)) {
            this.j.put(str, str);
            brt.g().execute(new b());
        }
    }

    public Message D(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Message) ipChange.ipc$dispatch("986e360", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            return (Message) ((ConcurrentHashMap) this.f6049a).remove(new Message.Id(0, str));
        }
        return null;
    }

    public final Intent e(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("4eb75ee9", new Object[]{this, message});
        }
        Intent intent = new Intent(Constants.ACTION_RECEIVE);
        intent.setPackage(message.packageName);
        intent.putExtra("command", message.command);
        intent.putExtra("serviceId", message.serviceId);
        intent.putExtra(Constants.KEY_USER_ID, message.userinfo);
        Integer num = message.command;
        if (num != null && num.intValue() == 100) {
            intent.putExtra("dataId", message.cunstomDataId);
            if (this.g.w()) {
                intent.putExtra(Constants.KEY_FULL_LINK, new TaoBaseService.AccsFullLink(message.getAccsUpTime(), message.getSendTime(), message.getSendEndTime()));
            }
        }
        return intent;
    }

    public Message g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Message) ipChange.ipc$dispatch("a229934e", new Object[]{this, str});
        }
        return (Message) ((ConcurrentHashMap) this.f6049a).get(new Message.Id(0, str));
    }

    public Set<Message.Id> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("32508594", new Object[]{this});
        }
        return ((ConcurrentHashMap) this.f6049a).keySet();
    }

    public Collection<Message> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("3549087", new Object[]{this});
        }
        return ((ConcurrentHashMap) this.f6049a).values();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0132, code lost:
        if (r2 == com.taobao.accs.data.Message.ReqType.RES) goto L_0x0134;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x017b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(java.lang.String r29, boolean r30, java.lang.String r31, java.lang.String r32, long r33, java.lang.String r35, java.util.Map<java.lang.Integer, java.lang.String> r36, java.lang.String r37, byte[] r38, int r39, byte[] r40, long r41, long r43, long r45, java.util.Map<java.lang.String, java.lang.Object> r47) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.data.MessageHandler.k(java.lang.String, boolean, java.lang.String, java.lang.String, long, java.lang.String, java.util.Map, java.lang.String, byte[], int, byte[], long, long, long, java.util.Map):void");
    }

    public final void n(String str, boolean z, int i, String str2, String str3, long j, String str4, Map<Integer, String> map, String str5, byte[] bArr, int i2, boolean z2, byte[] bArr2, long j2, long j3, long j4, Map<String, Object> map2) throws Exception {
        String str6;
        String str7;
        long j5;
        String[] strArr;
        Map<Integer, String> map3;
        String str8;
        DataReceiveMonitor dataReceiveMonitor;
        String str9;
        String str10;
        boolean z3;
        boolean z4;
        double d;
        int i3;
        int i4;
        String str11;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7aa8a5e", new Object[]{this, str, new Boolean(z), new Integer(i), str2, str3, new Long(j), str4, map, str5, bArr, new Integer(i2), new Boolean(z2), bArr2, new Long(j2), new Long(j3), new Long(j4), map2});
        } else if (str == null) {
            ALog.e(this.i, "handleMessage target is null", new Object[0]);
        } else {
            String[] split = str.split(SymbolExpUtil.SYMBOL_VERTICALBAR);
            if (split.length < 2) {
                ALog.e(this.i, "handleMessage target length is invalid", new Object[0]);
            } else if (this.c.getPackageName().equals(split[1]) || UtilityImpl.packageExist(this.c, split[1])) {
                String str12 = null;
                if (split.length >= 3) {
                    str12 = split[2];
                }
                DataReceiveMonitor dataReceiveMonitor2 = new DataReceiveMonitor();
                dataReceiveMonitor2.parseBeforeAckTime = System.currentTimeMillis();
                if (i != 1 || !j8l.z(this.c, 2, str12)) {
                    map3 = map;
                    str9 = str5;
                    str10 = "accs";
                    dataReceiveMonitor = dataReceiveMonitor2;
                    str8 = str12;
                    str6 = "serviceId";
                    str7 = "dataId";
                    strArr = split;
                    j5 = 0;
                    z3 = false;
                } else {
                    str6 = "serviceId";
                    str7 = "dataId";
                    dataReceiveMonitor = dataReceiveMonitor2;
                    strArr = split;
                    str10 = "accs";
                    str8 = str12;
                    map3 = map;
                    str9 = str5;
                    G(str12, str2, str, str3, j, str4, map);
                    j5 = System.currentTimeMillis();
                    z3 = true;
                }
                dataReceiveMonitor.parseAfterAckTime = System.currentTimeMillis();
                if ((!this.g.w() || map3 == null || !"1".equals(map3.get(36))) && p(str9) && !GlobalClientInfo.AGOO_SERVICE_ID.equals(str8)) {
                    ALog.e(this.i, "handleMessage msg duplicate", str7, str2);
                    i4 = i;
                    z4 = z2;
                    i3 = 1;
                    d = vu3.b.GEO_NOT_SUPPORT;
                } else if (!this.g.v() || !m8l.j(str8, 8)) {
                    dataReceiveMonitor.process = h5d.f();
                    dataReceiveMonitor.serviceId = str8;
                    dataReceiveMonitor.dataId = str2;
                    dataReceiveMonitor.receiveTime = j2;
                    dataReceiveMonitor.parseStartTime = j3;
                    dataReceiveMonitor.parseHandleTime = j4;
                    byte[] bArr3 = bArr;
                    if (z) {
                        bArr3 = y(str9, map3, bArr3);
                        if (bArr3 == null) {
                            ALog.e(this.i, "handleMessage completeOriData is null", new Object[0]);
                            return;
                        } else if (i2 == 1) {
                            xqi xqiVar = new xqi(bArr3);
                            bArr3 = f2d.b(xqiVar);
                            if (ALog.isPrintLog(ALog.Level.D)) {
                                ALog.d(this.i, "handleMessage gzip completeOriData", str7, str9, pg1.ATOM_length, Integer.valueOf(bArr3.length));
                            }
                            xqiVar.close();
                        }
                    }
                    C(str9);
                    if (UtilityImpl.isServiceIdPrintLog(str8)) {
                        ALog.e(this.i, "handleMessage try deliverMsg", str7, str2, "target", strArr[1], str6, str8);
                    }
                    Intent intent = new Intent(Constants.ACTION_RECEIVE);
                    intent.setPackage(strArr[1]);
                    intent.putExtra("command", 101);
                    if (strArr.length >= 3) {
                        intent.putExtra(str6, strArr[2]);
                    }
                    if (strArr.length >= 4) {
                        intent.putExtra(Constants.KEY_USER_ID, strArr[3]);
                    }
                    intent.putExtra(Constants.KEY_DOWN_MONITOR, dataReceiveMonitor);
                    intent.putExtra("data", bArr3);
                    intent.putExtra(str7, str2);
                    intent.putExtra("packageName", this.c.getPackageName());
                    intent.putExtra("host", str4);
                    intent.putExtra(Constants.KEY_CONN_TYPE, this.d);
                    z4 = z2;
                    intent.putExtra(Constants.KEY_NEED_BUSINESS_ACK, z4);
                    intent.putExtra("appKey", this.g.i());
                    intent.putExtra(Constants.KEY_CONFIG_TAG, this.g.r);
                    A(map3, intent);
                    if (this.g.w()) {
                        B(map3, map2, intent);
                    }
                    if (z4) {
                        z(intent, str3, str, (short) j);
                    }
                    intent.putExtra(Constants.KEY_INVOKE_MAIN, d(this.c, str8));
                    o2j.f().e(this.c, intent);
                    d = vu3.b.GEO_NOT_SUPPORT;
                    c71.c(str10, BaseMonitor.COUNT_POINT_TO_BUSS, "1commandId=101serviceId=" + str8, vu3.b.GEO_NOT_SUPPORT);
                    i4 = i;
                    i3 = 1;
                } else {
                    ALog.e(this.i, "handleMessage msg block", str6, str8, str7, str2);
                    c71.c(str10, BaseMonitor.COUNT_VERIFY, "v1 block " + str8, vu3.b.GEO_NOT_SUPPORT);
                    return;
                }
                if (i4 == i3) {
                    if (!z3) {
                        str11 = str8;
                        G(str8, str2, str, str3, j, str4, map);
                        if (z4) {
                            c71.c(str10, BaseMonitor.COUNT_ACK, "", d);
                        }
                    } else {
                        str11 = str8;
                    }
                    if (!TextUtils.isEmpty(dataReceiveMonitor.serviceId)) {
                        if (j5 == 0) {
                            j5 = System.currentTimeMillis();
                        }
                        c71.c(str10, BaseMonitor.COUNT_DOWN_ACK, str11, j5 - j2);
                    }
                }
            } else {
                ALog.e(this.i, "handleMessage not exist, unbind it", "package", split[1]);
                c71.c("accs", BaseMonitor.COUNT_WRONG_PACKAGE, split[1], vu3.b.GEO_NOT_SUPPORT);
                BaseConnection baseConnection = this.g;
                baseConnection.J(Message.buildUnbindApp(baseConnection.l(null), split[1]), true);
            }
        }
    }

    public final boolean p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cab257db", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.j.containsKey(str);
    }

    public final boolean q(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d893f3c", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i == -1 || i == -9 || i == -18 || i == -10 || i == -11) {
            return true;
        }
        return false;
    }

    public void t(Message message, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd80fc3d", new Object[]{this, message, new Integer(i)});
        } else {
            u(message, i, null, null, null);
        }
    }

    public void v(Message message, int i, Map<Integer, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10fb3da8", new Object[]{this, message, new Integer(i), map});
        } else {
            u(message, i, null, null, map);
        }
    }

    public void w(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17e687f1", new Object[]{this, message});
        } else if (message.getType() != -1 && message.getType() != 2 && !message.isAck) {
            ((ConcurrentHashMap) this.f6049a).put(message.getMsgId(), message);
        }
    }

    public final void z(Intent intent, String str, String str2, short s) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14ba6216", new Object[]{this, intent, str, str2, new Short(s)});
        } else if (intent != null) {
            if (!TextUtils.isEmpty(str)) {
                intent.putExtra("source", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                intent.putExtra("target", str2);
            }
            intent.putExtra("flags", s);
        }
    }

    public final void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3fe8b1b", new Object[]{this});
            return;
        }
        try {
            File dir = this.c.getDir("accs", 0);
            File file = new File(dir, "message" + this.g.i() + this.g.r);
            if (!file.exists()) {
                ALog.d(this.i, "message file not exist", new Object[0]);
                return;
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    this.j.put(readLine, readLine);
                } else {
                    bufferedReader.close();
                    return;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcf5988c", new Object[]{this});
            return;
        }
        try {
            File dir = this.c.getDir("accs", 0);
            FileWriter fileWriter = new FileWriter(new File(dir, "message" + this.g.i() + this.g.r));
            fileWriter.write("");
            for (String str : this.j.keySet()) {
                fileWriter.append((CharSequence) str).append((CharSequence) "\r\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public final void r(Message message, int i, boolean z) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47bd8f3e", new Object[]{this, message, new Integer(i), new Boolean(z)});
            return;
        }
        try {
            NetPerformanceMonitor netPermanceMonitor = message.getNetPermanceMonitor();
            if (netPermanceMonitor != null) {
                URL url = message.host;
                String url2 = url == null ? null : url.toString();
                if (i != 200) {
                    if (message.retryTimes > 0) {
                        c71.c("accs", BaseMonitor.COUNT_POINT_RESEND, "fail＿" + i, vu3.b.GEO_NOT_SUPPORT);
                        c71.c("accs", BaseMonitor.COUNT_POINT_RESEND, "fail", vu3.b.GEO_NOT_SUPPORT);
                    } else if (i != -13) {
                        String valueOf = String.valueOf(i);
                        c71.a("accs", BaseMonitor.ALARM_POINT_REQUEST, url2, valueOf, this.d + message.serviceId + message.timeout);
                    }
                    netPermanceMonitor.setFailReason(i);
                    z2 = false;
                } else if (message.retryTimes > 0) {
                    c71.c("accs", BaseMonitor.COUNT_POINT_RESEND, "succ", vu3.b.GEO_NOT_SUPPORT);
                    c71.c("accs", BaseMonitor.COUNT_POINT_RESEND, "succ_" + message.retryTimes, vu3.b.GEO_NOT_SUPPORT);
                } else {
                    c71.b("accs", BaseMonitor.ALARM_POINT_REQUEST, url2);
                }
                netPermanceMonitor.setRet(z2);
                if (z) {
                    if (message.isCancel) {
                        netPermanceMonitor.setRet(false);
                        netPermanceMonitor.setFailReason("msg cancel");
                    }
                    AppMonitor.getInstance().commitStat(netPermanceMonitor);
                    if (m8l.s() && !NetworkStatusHelper.isInternalAddr()) {
                        AppMonitor.getInstance().commitStat(new NetPerformanceOverseasMonitor(netPermanceMonitor));
                    }
                }
            }
        } catch (Throwable th) {
            ALog.e(this.i, "monitorPerf", th, new Object[0]);
        }
    }

    public final boolean d(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bf9b7ee3", new Object[]{this, context, str})).booleanValue();
        }
        if (com.taobao.accs.connection.state.a.v().A(context)) {
            return false;
        }
        ALog.e(this.i, "bg msg", "serviceId", str);
        c71.c("accs", BaseMonitor.BACKGROUND_RECV_MSG, str, vu3.b.GEO_NOT_SUPPORT);
        return true;
    }

    public void f(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8073bae", new Object[]{this, message});
        } else if (((ConcurrentHashMap) this.f6049a).keySet().size() > 0) {
            for (Message.Id id : ((ConcurrentHashMap) this.f6049a).keySet()) {
                Message message2 = (Message) ((ConcurrentHashMap) this.f6049a).get(id);
                if (!(message2 == null || message2.command == null || !message2.getPackageName().equals(message.getPackageName()))) {
                    switch (message.command.intValue()) {
                        case 1:
                        case 2:
                            if (message2.command.intValue() == 1 || message2.command.intValue() == 2) {
                                message2.isCancel = true;
                                break;
                            }
                            break;
                        case 3:
                        case 4:
                            if (message2.command.intValue() == 3 || message2.command.intValue() == 4) {
                                message2.isCancel = true;
                                break;
                            }
                            break;
                        case 5:
                        case 6:
                            if (message2.command.intValue() == 5 || message2.command.intValue() == 6) {
                                message2.isCancel = true;
                                break;
                            }
                            break;
                    }
                }
                if (message2 != null && message2.isCancel) {
                    ALog.e(this.i, "cancelControlMessage", "command", message2.command);
                }
            }
        }
    }

    public final void m(String str, byte[] bArr, String str2, byte[] bArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9fdeab4", new Object[]{this, str, bArr, str2, bArr2});
            return;
        }
        Message message = (Message) ((ConcurrentHashMap) this.f6049a).remove(new Message.Id(0, str));
        if (message != null) {
            j(message, bArr, bArr2, str2);
            return;
        }
        ALog.e(this.i, "handleMessage control ACK reqMessage is null", "dataId", str);
        if (ALog.isPrintLog(ALog.Level.D)) {
            ALog.d(this.i, "handleMessage not handled", AgooConstants.MESSAGE_BODY, new String(bArr));
        }
    }

    public final Map<Integer, String> x(xqi xqiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b8bd5bd6", new Object[]{this, xqiVar});
        }
        HashMap hashMap = null;
        if (xqiVar == null) {
            return null;
        }
        try {
            int w = xqiVar.w();
            if (ALog.isPrintLog(ALog.Level.D)) {
                String str = this.i;
                ALog.d(str, "extHeaderLen:" + w, new Object[0]);
            }
            int i = 0;
            while (i < w) {
                int w2 = xqiVar.w();
                int i2 = (64512 & w2) >> 10;
                int i3 = w2 & 1023;
                String A = xqiVar.A(i3);
                i = i + 2 + i3;
                if (hashMap == null) {
                    hashMap = new HashMap();
                }
                hashMap.put(Integer.valueOf(i2), A);
                if (ALog.isPrintLog(ALog.Level.D)) {
                    ALog.d(this.i, "", "extHeaderType", Integer.valueOf(i2), "value", A);
                }
            }
        } catch (Exception e) {
            ALog.e(this.i, "parseExtHeader", e, new Object[0]);
        }
        return hashMap;
    }

    public final void B(Map<Integer, String> map, Map<String, Object> map2, Intent intent) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51b367bc", new Object[]{this, map, map2, intent});
            return;
        }
        long j2 = 0;
        if (map == null) {
            j = 0;
        } else {
            try {
                j = Long.parseLong(map.get(33));
            } catch (Throwable unused) {
                return;
            }
        }
        if (map2 != null) {
            j2 = Long.parseLong(map2.get("frameRecvTime") + "") + this.g.k();
        }
        intent.putExtra(Constants.KEY_FULL_LINK, new TaoBaseService.AccsFullLink(j, j2, Long.parseLong(map2.get(Constants.KEY_DATA_RECEIVED_TIME) + ""), 0L));
    }

    public void s(byte[] bArr, String str, long j, Map<String, Object> map) throws IOException {
        Throwable th;
        int i;
        int i2;
        int g;
        int w;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc7e2341", new Object[]{this, bArr, str, new Long(j), map});
            return;
        }
        if (ALog.isPrintLog(ALog.Level.I)) {
            ALog.i(this.i, xpd.c.EVENT_ON_MESSAGE, "host", str);
        }
        long currentTimeMillis = System.currentTimeMillis();
        xqi xqiVar = new xqi(bArr);
        try {
            int g2 = xqiVar.g();
            i = (g2 & 240) >> 4;
            ALog.Level level = ALog.Level.D;
            if (ALog.isPrintLog(level)) {
                String str2 = this.i;
                ALog.d(str2, "version:" + i, new Object[0]);
            }
            i2 = g2 & 15;
            if (ALog.isPrintLog(level)) {
                String str3 = this.i;
                ALog.d(str3, "compress:" + i2, new Object[0]);
            }
            g = xqiVar.g();
            w = xqiVar.w();
            i3 = 0;
        } catch (Throwable th2) {
            th = th2;
        }
        while (i3 < w) {
            int w2 = xqiVar.w();
            int i4 = i3 + 2;
            if (w2 > 0) {
                byte[] bArr2 = new byte[w2];
                xqiVar.read(bArr2);
                if (ALog.isPrintLog(ALog.Level.D)) {
                    String str4 = this.i;
                    ALog.d(str4, "buf len:" + w2, new Object[0]);
                }
                i3 = i4 + w2;
                xqiVar = xqiVar;
                try {
                    l(i2, bArr2, str, i, g, j, currentTimeMillis, map);
                    i = i;
                    w = w;
                    xqiVar = xqiVar;
                } catch (Throwable th3) {
                    th = th3;
                }
            } else {
                xqiVar = xqiVar;
                throw new IOException("data format error");
            }
            th = th3;
            try {
                c71.a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, "", "1", this.d + th.toString());
                ALog.e(this.i, "onMessage err", th, new Object[0]);
            } finally {
                xqiVar.close();
            }
        }
        xqiVar = xqiVar;
    }

    public final String G(String str, String str2, String str3, String str4, long j, String str5, Map<Integer, String> map) {
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("71ebc139", new Object[]{this, str, str2, str3, str4, new Long(j), str5, map});
        }
        if (map == null) {
            hashMap = new HashMap(2);
        } else {
            hashMap = new HashMap(map);
        }
        hashMap.put(32, String.valueOf(this.g.n()));
        Message buildPushAck = Message.buildPushAck(this.g.l(null), this.g.o(), str3, str4, str2, false, (short) j, str5, hashMap);
        this.g.J(buildPushAck, true);
        if (UtilityImpl.isServiceIdPrintLog(str)) {
            ALog.e(this.i, "handleMessage try sendAck dataId", "dataId", str2);
        }
        return buildPushAck.dataId;
    }

    public final void j(Message message, byte[] bArr, byte[] bArr2, String str) {
        int i;
        Throwable th;
        JSONObject jSONObject;
        JSONArray jSONArray;
        JSONObject jSONObject2;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("607be074", new Object[]{this, message, bArr, bArr2, str});
            return;
        }
        try {
            JSONObject jSONObject3 = new JSONObject(new String(bArr));
            if (ALog.isPrintLog(ALog.Level.D)) {
                ALog.d(this.i, "handleControlMessage parse", "json", jSONObject3.toString());
            }
            int i3 = message.command.intValue() == 100 ? 200 : jSONObject3.getInt("code");
            try {
                if (i3 == 200) {
                    int intValue = message.command.intValue();
                    if (intValue == 1) {
                        UtilityImpl.saveUtdid(Constants.SP_FILE_NAME, this.c);
                        this.g.j().g(this.c.getPackageName());
                        JSONObject jSONObject4 = jSONObject3.getJSONObject("data");
                        bxf.a(jSONObject4, Constants.KEY_ACCS_TOKEN, null);
                        this.h = bxf.a(jSONObject4, "deviceToken", null);
                        String a2 = bxf.a(jSONObject4, "regId", null);
                        if (!TextUtils.isEmpty(this.h)) {
                            Config.setDeviceToken(this.c, this.h);
                        }
                        if (!TextUtils.isEmpty(a2)) {
                            String p = j8l.p(this.c);
                            if (!a2.equals(p)) {
                                this.g.j().a();
                                j8l.c(this.c);
                                ALog.e(this.i, "handleControlMessage clearRegId()", "regId", a2, "currentRegId", p);
                            }
                        }
                        if (jSONObject4 != null) {
                            JSONArray jSONArray2 = jSONObject4.getJSONArray(Constants.KEY_PACKAGE_NAMES);
                            if (jSONArray2 != null) {
                                int i4 = 0;
                                while (i4 < jSONArray2.length()) {
                                    String string = jSONArray2.getString(i4);
                                    if (UtilityImpl.packageExist(this.c, string)) {
                                        this.g.j().g(message.packageName);
                                        i2 = 1;
                                    } else {
                                        i2 = 1;
                                        ALog.d(this.i, "unbind app", "pkg", string);
                                        BaseConnection baseConnection = this.g;
                                        baseConnection.J(Message.buildUnbindApp(baseConnection.l(null), string), true);
                                    }
                                    i4 += i2;
                                }
                            }
                            if (jSONObject4.has(Constants.KEY_EVENT_COLLECT_CONTROL) && (jSONObject2 = jSONObject4.getJSONObject(Constants.KEY_EVENT_COLLECT_CONTROL)) != null) {
                                j8l.F(this.c, "switch", jSONObject2.getBoolean("switch"));
                                j8l.H(this.c, jSONObject2.toString());
                            }
                            if (jSONObject4.has("agooControl") && (jSONObject = jSONObject4.getJSONObject("agooControl")) != null) {
                                boolean z = jSONObject.getBoolean(Constants.KEY_CONTROL);
                                j8l.F(this.c, Constants.KEY_CONTROL, z);
                                if (!(!z || (jSONArray = jSONObject.getJSONArray("strategy")) == null || jSONArray.length() == 0)) {
                                    NoTraceTriggerHelper.h(jSONArray.toString(), this.c, null, 7, -1);
                                }
                            }
                        }
                    } else if (intValue == 2) {
                        this.g.j().h(message.packageName);
                    } else if (intValue == 3) {
                        this.g.j().i(message.packageName, message.userinfo);
                    } else if (intValue == 4) {
                        this.g.j().j(message.packageName, message.userinfo);
                    } else if (intValue == 100 && (this.g instanceof InAppConnection) && "4|sal|accs-iot".equals(message.target)) {
                        ((InAppConnection) this.g).B0(jSONObject3);
                    }
                } else if (message.command.intValue() == 3 && i3 == 300) {
                    this.g.j().h(message.packageName);
                }
                i = i3;
            } catch (Throwable th2) {
                th = th2;
                i = i3;
                ALog.e(this.i, "handleControlMessage", th, new Object[0]);
                c71.a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, "handleControlMessage", "", this.d + th.toString());
                u(message, i, null, bArr, null);
            }
        } catch (Throwable th3) {
            th = th3;
            i = -8;
        }
        u(message, i, null, bArr, null);
    }

    public void u(Message message, int i, Message.ReqType reqType, byte[] bArr, Map<Integer, String> map) {
        Map<Integer, String> map2;
        byte[] bArr2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddcc4132", new Object[]{this, message, new Integer(i), reqType, bArr, map});
            return;
        }
        int i2 = i;
        if (message.command == null || message.getType() < 0 || message.getType() == 2) {
            ALog.d(this.i, "onError, skip ping/ack", new Object[0]);
            return;
        }
        String str = message.cunstomDataId;
        if (str != null) {
            ((ConcurrentHashMap) this.b).remove(str);
        }
        Message.ReqType reqType2 = null;
        if (this.f.checkAntiBrush(message.host, map)) {
            reqType2 = null;
            bArr2 = null;
            map2 = null;
            i2 = 70022;
        } else {
            bArr2 = bArr;
            map2 = map;
            reqType2 = reqType;
        }
        int d = this.e.d(map2, message.serviceId);
        if (d != 0) {
            i2 = d == 2 ? 70021 : d == 3 ? 70023 : 70020;
            bArr2 = null;
            map2 = null;
        }
        if (ALog.isPrintLog(ALog.Level.D)) {
            ALog.d(this.i, "onResult", "command", message.command, "erorcode", Integer.valueOf(i2));
        }
        if (message.command.intValue() != 102) {
            if (message.isCancel) {
                ALog.e(this.i, "onResult message is cancel", "command", message.command);
                r(message, i2, true);
            } else if (!q(i2) || message.command.intValue() == 100 || message.retryTimes > Message.CONTROL_MAX_RETRY_TIMES) {
                r(message, i2, true);
                Intent e = e(message);
                e.putExtra("errorCode", i2);
                Message.ReqType valueOf = Message.ReqType.valueOf((message.flags >> 13) & 3);
                if (reqType2 == Message.ReqType.RES || valueOf == Message.ReqType.REQ) {
                    e.putExtra(Constants.KEY_SEND_TYPE, Constants.SEND_TYPE_RES);
                }
                if (i2 == 200) {
                    e.putExtra("data", bArr2);
                }
                e.putExtra("appKey", this.g.b);
                e.putExtra(Constants.KEY_CONFIG_TAG, this.g.r);
                try {
                    NetPerformanceMonitor netPermanceMonitor = message.getNetPermanceMonitor();
                    if (netPermanceMonitor != null) {
                        long j = netPermanceMonitor.send_to_rcv_time;
                        if (j > 0) {
                            e.putExtra(Constants.KEY_UP_RTT, j);
                            e.putExtra("host", this.g.i.getInappHost());
                        }
                    }
                } catch (Exception e2) {
                    ALog.e(this.i, "netMonitor rtt err", e2, new Object[0]);
                    c71.c("accs", BaseMonitor.COUNT_EXCEPTIONS, "ex_rtt", vu3.b.GEO_NOT_SUPPORT);
                }
                A(map2, e);
                o2j.f().e(this.c, e);
                if (!TextUtils.isEmpty(message.serviceId)) {
                    c71.c("accs", BaseMonitor.COUNT_POINT_TO_BUSS, "1commandId=" + message.command + "serviceId=" + message.serviceId, vu3.b.GEO_NOT_SUPPORT);
                }
            } else {
                message.startSendTime = System.currentTimeMillis();
                int i3 = message.retryTimes + 1;
                message.retryTimes = i3;
                ALog.d(this.i, "onResult", "retryTimes", Integer.valueOf(i3));
                this.g.J(message, true);
                r(message, i2, true);
            }
        }
    }

    public final byte[] y(String str, Map<Integer, String> map, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("3402dd18", new Object[]{this, str, map, bArr});
        }
        if (bArr != null) {
            try {
                if (bArr.length != 0) {
                    int parseInt = Integer.parseInt(map.get(17));
                    int parseInt2 = Integer.parseInt(map.get(16));
                    if (parseInt2 <= 1) {
                        throw new RuntimeException("burstNums <= 1");
                    } else if (parseInt < 0 || parseInt >= parseInt2) {
                        throw new RuntimeException("burstNums:" + parseInt2 + " burstIndex:" + parseInt);
                    } else {
                        String str2 = map.get(18);
                        String str3 = map.get(15);
                        long parseLong = !TextUtils.isEmpty(str3) ? Long.parseLong(str3) : 0L;
                        ed1 ed1Var = (ed1) ((HashMap) this.k).get(str);
                        if (ed1Var == null) {
                            if (ALog.isPrintLog(ALog.Level.I)) {
                                ALog.i(this.i, "putBurstMessage", "dataId", str, "burstLength", Integer.valueOf(parseInt2));
                            }
                            ed1Var = new ed1(str, parseInt2, str2);
                            ed1Var.g(parseLong);
                            ((HashMap) this.k).put(str, ed1Var);
                        }
                        return ed1Var.f(parseInt, parseInt2, bArr);
                    }
                }
            } catch (Throwable th) {
                ALog.w(this.i, "putBurstMessage", th, new Object[0]);
                return null;
            }
        }
        throw new RuntimeException("burstLength == 0");
    }

    public final void l(int i, byte[] bArr, String str, int i2, int i3, long j, long j2, Map<String, Object> map) throws IOException {
        MessageHandler messageHandler;
        byte[] bArr2;
        Map<Integer, String> map2;
        boolean z;
        boolean z2;
        Map<Integer, String> map3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17744397", new Object[]{this, new Integer(i), bArr, str, new Integer(i2), new Integer(i3), new Long(j), new Long(j2), map});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        xqi xqiVar = new xqi(bArr);
        long w = xqiVar.w();
        String A = xqiVar.A(xqiVar.g());
        String A2 = xqiVar.A(xqiVar.g());
        if (!"1|grace-bye|".equals(A2) || i3 != 1) {
            try {
                String A3 = xqiVar.A(xqiVar.g());
                ALog.e(this.i, "parseMessage", "dataId", A3, "target", A, "source", A2, "accsFlag", Integer.valueOf(i3));
                boolean z3 = m8l.z();
                if (A2.contains(Constants.TARGET_FORE) || A2.contains(Constants.TARGET_BACK)) {
                    messageHandler = this;
                } else if (A2.contains(Constants.TARGET_BACK_LIMIT)) {
                    messageHandler = this;
                } else {
                    if (z3) {
                        ((InAppConnection) this.g).p0().reSchedule();
                    }
                    if (A2.contains(Constants.TARGET_SERVICE_ST)) {
                        ALog.e(this.i, "ignore source 4|sal|st message", new Object[0]);
                        ((ConcurrentHashMap) this.f6049a).remove(new Message.Id(0, A3));
                        f2d.a(xqiVar);
                        return;
                    } else if (Constants.TARGET_AServer_PING_CONTROL.contains(A2)) {
                        ALog.e(this.i, "aserver ping control received", new Object[0]);
                        ((ConcurrentHashMap) this.f6049a).remove(new Message.Id(0, A3));
                        f2d.a(xqiVar);
                        return;
                    } else {
                        String str2 = A2 + A3;
                        if (xqiVar.available() > 0) {
                            if (i2 == 2) {
                                map3 = x(xqiVar);
                                if (map3 != null && map3.containsKey(16) && map3.containsKey(17)) {
                                    z2 = true;
                                    if (i != 0 || z2) {
                                        bArr2 = xqiVar.e();
                                    } else if (i == 1) {
                                        bArr2 = f2d.b(xqiVar);
                                    } else {
                                        map2 = map3;
                                        bArr2 = null;
                                        z = z2;
                                    }
                                    map2 = map3;
                                    z = z2;
                                }
                            } else {
                                map3 = null;
                            }
                            z2 = false;
                            if (i != 0) {
                            }
                            bArr2 = xqiVar.e();
                            map2 = map3;
                            z = z2;
                        } else {
                            map2 = null;
                            bArr2 = null;
                            z = false;
                        }
                        xqiVar.close();
                        k(A, z, A3, A2, w, str, map2, str2, bArr2, i, bArr, j, j2, currentTimeMillis, map);
                        return;
                    }
                }
                ALog.e(messageHandler.i, "ignore source 4|sal|sg/fg/bg message dataId:" + A3, new Object[0]);
                ((ConcurrentHashMap) messageHandler.f6049a).remove(new Message.Id(0, A3));
                f2d.a(xqiVar);
                if (z3) {
                    ((InAppConnection) messageHandler.g).p0().x();
                }
            } catch (Exception e) {
                ALog.e(this.i, "dataId read error ", e, new Object[0]);
                f2d.a(xqiVar);
                c71.a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, "", "1", this.d + "data id read error" + e.toString());
            }
        } else {
            ALog.e(this.i, "received reconnect command", "mConnection", Boolean.valueOf(this.g != null));
            BaseConnection baseConnection = this.g;
            if (baseConnection != null) {
                baseConnection.D();
            }
            f2d.a(xqiVar);
        }
    }

    public final void o(Message.ReqType reqType, String str, int i, byte[] bArr, Map<Integer, String> map, long j, long j2, String str2, byte[] bArr2) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("affa058c", new Object[]{this, reqType, str, new Integer(i), bArr, map, new Long(j), new Long(j2), str2, bArr2});
            return;
        }
        Message message = (Message) ((ConcurrentHashMap) this.f6049a).remove(new Message.Id(0, str));
        if (message != null) {
            if (ALog.isPrintLog(ALog.Level.D)) {
                ALog.d(this.i, "handleMessage reqMessage not null", new Object[0]);
            }
            if (i == 1) {
                try {
                    JSONObject jSONObject = new JSONObject(new String(bArr));
                    int i3 = jSONObject.getInt("code");
                    ALog.e(this.i, "handleMessageDataAck error", "json", jSONObject);
                    i2 = i3;
                } catch (Exception unused) {
                    i2 = -3;
                }
            } else {
                i2 = 200;
            }
            if (message.getNetPermanceMonitor() != null) {
                message.getNetPermanceMonitor().onRecUnParse(j);
                message.getNetPermanceMonitor().onStartParse(j2);
                message.getNetPermanceMonitor().onRecAck();
            }
            if (reqType == Message.ReqType.RES) {
                u(message, i2, reqType, bArr, map);
            } else {
                v(message, i2, map);
            }
        } else {
            ALog.e(this.i, "handleMessage data ack/res reqMessage is null", "dataId", str);
        }
    }
}
