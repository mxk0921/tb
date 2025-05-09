package com.taobao.tao.powermsg.managers;

import android.os.SystemClock;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.tao.messagekit.base.monitor.model.DataReceiveMonitor;
import com.taobao.tao.messagekit.core.model.BaseMessage;
import com.taobao.tao.messagekit.core.model.ErrorMessage;
import com.taobao.tao.messagekit.core.utils.LRUQueue;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import com.taobao.tao.messagekit.core.utils.MsgMonitor;
import com.taobao.tao.powermsg.common.PowerMessage;
import com.taobao.tao.powermsg.common.StreamFullLinkMonitor;
import com.taobao.tao.powermsg.model.MessageFrame;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.a71;
import tb.b5n;
import tb.cyx;
import tb.dva;
import tb.ikl;
import tb.iyv;
import tb.kbd;
import tb.l5y;
import tb.mlm;
import tb.n8l;
import tb.p70;
import tb.t2o;
import tb.tzx;
import tb.yd2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MsgManager implements cyx<ikl> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static long c = 0;
    public static final MultiSubscribeManager d = new MultiSubscribeManager();
    public static final Map<String, StreamFullLinkMonitor> e = new LinkedHashMap<String, StreamFullLinkMonitor>() { // from class: com.taobao.tao.powermsg.managers.MsgManager.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/powermsg/managers/MsgManager$1");
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<String, StreamFullLinkMonitor> entry) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6471a6cf", new Object[]{this, entry})).booleanValue();
            }
            if (size() > n8l.b()) {
                return true;
            }
            return false;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final LRUQueue<String> f12573a = new LRUQueue<>(10000);
    public final ConcurrentHashMap<String, LRUQueue<ikl<BaseMessage>>> b = new ConcurrentHashMap<>(16);

    static {
        t2o.a(628097263);
        t2o.a(628097525);
    }

    public static StreamFullLinkMonitor e(String str) {
        Object remove;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            remove = ipChange.ipc$dispatch("45391892", new Object[]{str});
        } else if (TextUtils.isEmpty(str)) {
            return null;
        } else {
            remove = ((HashMap) e).remove(str);
        }
        return (StreamFullLinkMonitor) remove;
    }

    public static StreamFullLinkMonitor g(String str) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            obj = ipChange.ipc$dispatch("6f6854ab", new Object[]{str});
        } else if (TextUtils.isEmpty(str)) {
            return null;
        } else {
            obj = ((LinkedHashMap) e).get(str);
        }
        return (StreamFullLinkMonitor) obj;
    }

    public static void i(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0be92bd", new Object[]{str, str2, str3});
        } else if (!TextUtils.isEmpty(str)) {
            StreamFullLinkMonitor streamFullLinkMonitor = new StreamFullLinkMonitor();
            streamFullLinkMonitor.namespace = str2;
            streamFullLinkMonitor.topic = str3;
            streamFullLinkMonitor.setPmUpTime(p70.a());
            ((HashMap) e).put(str, streamFullLinkMonitor);
        }
    }

    public final void a(ikl<BaseMessage> iklVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd847cfd", new Object[]{this, iklVar});
            return;
        }
        BaseMessage baseMessage = iklVar.f21366a;
        if (baseMessage instanceof MessageFrame) {
            try {
                iklVar.j = Long.parseLong(baseMessage.header.n.get(RemoteMessageConst.SEND_TIME));
            } catch (Throwable unused) {
            }
        }
    }

    public boolean b(ikl<BaseMessage> iklVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd6367f4", new Object[]{this, iklVar})).booleanValue();
        }
        if (!this.f12573a.add((LRUQueue<String>) iklVar.f21366a.header.f)) {
            return false;
        }
        MsgMonitor.a("MKT", "cd", 1.0d);
        iklVar.f21366a.header.c = -3406;
        l5y.m(iklVar).a(iyv.e().endStream());
        return true;
    }

    public final int d(ikl<BaseMessage> iklVar) {
        char c2 = 3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("464973c0", new Object[]{this, iklVar})).intValue();
        }
        DataReceiveMonitor dataReceiveMonitor = iklVar.o;
        if (dataReceiveMonitor != null) {
            dataReceiveMonitor.startDispatchTime = SystemClock.elapsedRealtime();
        }
        HashMap<String, WeakReference<kbd>> c3 = yd2.c(iklVar.f21366a.bizCode);
        int i = -1;
        if (c3 != null) {
            for (Map.Entry<String, WeakReference<kbd>> entry : c3.entrySet()) {
                kbd kbdVar = entry.getValue().get();
                if (kbdVar != null) {
                    BaseMessage baseMessage = iklVar.f21366a;
                    BaseMessage baseMessage2 = baseMessage;
                    if (baseMessage2.type == -100) {
                        ErrorMessage errorMessage = (ErrorMessage) baseMessage;
                        kbdVar.a(errorMessage.header.c, errorMessage.content);
                        String key = entry.getKey();
                        Integer valueOf = Integer.valueOf(errorMessage.bizCode);
                        Integer valueOf2 = Integer.valueOf(errorMessage.header.c);
                        Object[] objArr = new Object[5];
                        objArr[0] = "dispatch ALL errorMsg >";
                        objArr[1] = key;
                        objArr[2] = valueOf;
                        objArr[c2] = "code:";
                        objArr[4] = valueOf2;
                        MsgLog.i("MsgManager", objArr);
                    } else {
                        PowerMessage b = iyv.b(baseMessage2);
                        MsgLog.g("MsgManager", "dispatchALL start", Integer.valueOf(b.bizCode), entry.getKey(), "msgid:", b.messageId);
                        kbdVar.b(b);
                        MsgLog.g("MsgManager", "dispatchALL end", Integer.valueOf(b.bizCode), entry.getKey(), "msgid:", b.messageId);
                    }
                    i = 1;
                } else {
                    MsgLog.g("MsgManager", "dispatchALL > lost", Integer.valueOf(iklVar.f21366a.bizCode), entry.getKey(), "msgid:", iklVar.f21366a.header.f);
                }
                c2 = 3;
            }
        } else {
            Integer valueOf3 = Integer.valueOf(iklVar.f21366a.bizCode);
            dva dvaVar = iklVar.f21366a.header;
            MsgLog.g("MsgManager", "dispatch errorMsg > not exist", valueOf3, "msgid:", dvaVar.f, "code:", Integer.valueOf(dvaVar.c));
        }
        return i;
    }

    public List<ikl<BaseMessage>> f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("5a64e12d", new Object[]{this, str, str2});
        }
        ConcurrentHashMap<String, LRUQueue<ikl<BaseMessage>>> concurrentHashMap = this.b;
        LRUQueue<ikl<BaseMessage>> lRUQueue = concurrentHashMap.get(str + str2);
        if (lRUQueue == null) {
            return null;
        }
        lRUQueue.drainTo(new ArrayList(10000));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0152 A[Catch: all -> 0x0127, TRY_ENTER, TryCatch #0 {all -> 0x0127, blocks: (B:29:0x00f4, B:31:0x0107, B:34:0x010f, B:37:0x012a, B:38:0x012e, B:43:0x0137, B:46:0x0152, B:49:0x0166, B:50:0x0188, B:51:0x01bd, B:53:0x01cb, B:54:0x01e1), top: B:57:0x00f4 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01cb A[Catch: all -> 0x0127, TryCatch #0 {all -> 0x0127, blocks: (B:29:0x00f4, B:31:0x0107, B:34:0x010f, B:37:0x012a, B:38:0x012e, B:43:0x0137, B:46:0x0152, B:49:0x0166, B:50:0x0188, B:51:0x01bd, B:53:0x01cb, B:54:0x01e1), top: B:57:0x00f4 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01e1 A[Catch: all -> 0x0127, TRY_LEAVE, TryCatch #0 {all -> 0x0127, blocks: (B:29:0x00f4, B:31:0x0107, B:34:0x010f, B:37:0x012a, B:38:0x012e, B:43:0x0137, B:46:0x0152, B:49:0x0166, B:50:0x0188, B:51:0x01bd, B:53:0x01cb, B:54:0x01e1), top: B:57:0x00f4 }] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onNext(tb.ikl r22) {
        /*
            Method dump skipped, instructions count: 535
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.powermsg.managers.MsgManager.onNext(tb.ikl):void");
    }

    @Override // tb.cyx
    public void onComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
        }
    }

    @Override // tb.cyx
    public void onError(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
            return;
        }
        MsgLog.g("MsgManager", "onMsgManagerError >", th);
        th.printStackTrace();
    }

    @Override // tb.cyx
    public void onSubscribe(tzx tzxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f24cb1", new Object[]{this, tzxVar});
        } else {
            tzxVar.a(Long.MAX_VALUE);
        }
    }

    public final int c(ikl<BaseMessage> iklVar) {
        int i;
        Exception e2;
        PowerMessage b;
        HashMap<String, WeakReference<kbd>> c2;
        int i2 = 5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e5096b3", new Object[]{this, iklVar})).intValue();
        }
        try {
            b = iyv.b(iklVar.f21366a);
            b.sourceType = iklVar.d;
            b.fullLinkFlag = iklVar.q;
            if (iklVar.f21366a instanceof MessageFrame) {
                b.copyStreamFromPackage(iklVar);
            }
            DataReceiveMonitor dataReceiveMonitor = iklVar.o;
            if (dataReceiveMonitor != null) {
                dataReceiveMonitor.startDispatchTime = SystemClock.elapsedRealtime();
            }
            iyv.a("MsgManager", b);
            c2 = yd2.c(b.bizCode);
            try {
            } catch (Exception e3) {
                e2 = e3;
                i = 1;
            }
        } catch (Exception e4) {
            e2 = e4;
            i = 0;
        }
        if (c2 != null) {
            i = 0;
            for (Map.Entry<String, WeakReference<kbd>> entry : c2.entrySet()) {
                try {
                    String c3 = iyv.c(iklVar.f21366a);
                    String key = entry.getKey();
                    if (a.h(b.bizCode, b.topic, c3, key)) {
                        kbd kbdVar = entry.getValue().get();
                        if (kbdVar != null) {
                            Integer valueOf = Integer.valueOf(b.bizCode);
                            String str = b.messageId;
                            Object[] objArr = new Object[i2];
                            objArr[0] = "dispatch start >";
                            objArr[1] = key;
                            objArr[2] = valueOf;
                            objArr[3] = "msgid:";
                            objArr[4] = str;
                            MsgLog.g("MsgManager", objArr);
                            kbdVar.b(b);
                            Integer valueOf2 = Integer.valueOf(b.bizCode);
                            String str2 = b.messageId;
                            Object[] objArr2 = new Object[i2];
                            objArr2[0] = "dispatch end >";
                            objArr2[1] = key;
                            objArr2[2] = valueOf2;
                            objArr2[3] = "msgid:";
                            objArr2[4] = str2;
                            MsgLog.g("MsgManager", objArr2);
                            a71.b("dispatch", b.messageId);
                            i = 1;
                        } else {
                            i = -1;
                            Integer valueOf3 = Integer.valueOf(b.bizCode);
                            String str3 = b.messageId;
                            Object[] objArr3 = new Object[i2];
                            objArr3[0] = "dispatch > lost";
                            objArr3[1] = key;
                            objArr3[2] = valueOf3;
                            objArr3[3] = "msgid:";
                            objArr3[4] = str3;
                            MsgLog.g("MsgManager", objArr3);
                            a71.a("dispatch", key, "1", b.messageId);
                        }
                    } else {
                        if (!"ubee".equals(key)) {
                            a71.a("dispatch", key, "2", b.messageId);
                            MsgLog.g("MsgManager", "dispatch > not bind", Integer.valueOf(b.bizCode), b.topic, c3, "channel:", key, "msgid:", b.messageId);
                        }
                        if (iklVar.d == 2) {
                            BaseMessage baseMessage = iklVar.f21366a;
                            if (a.q(baseMessage.bizCode, baseMessage.header.f18091a, c3, key) < 1) {
                                b5n pullManager = iyv.e().getPullManager();
                                BaseMessage baseMessage2 = iklVar.f21366a;
                                pullManager.f(baseMessage2.bizCode, baseMessage2.header.f18091a, c3, 1, 1);
                            }
                        }
                    }
                    i2 = 5;
                } catch (Exception e5) {
                    e2 = e5;
                    MsgLog.f("MsgManager", e2, "dispatch exception");
                    return i;
                }
            }
            return i;
        }
        kbd d2 = mlm.d(b.bizCode, b.topic);
        if (d2 != null) {
            d2.b(b);
            MsgLog.g("MsgManager", "dispatch stable >", Integer.valueOf(b.bizCode), "msgid:", b.messageId);
            return 1;
        }
        MsgLog.g("MsgManager", "dispatch > not exist", Integer.valueOf(b.bizCode), "msgid:", b.messageId);
        return 0;
    }
}
