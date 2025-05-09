package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.base.MsgRouter;
import com.taobao.tao.messagekit.core.model.Ack;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import com.taobao.tao.messagekit.core.utils.MsgMonitor;
import com.taobao.taolive.sdk.model.message.PowerMsgType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class x9o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, HashMap<String, a>> f31237a = new HashMap<>();

    static {
        t2o.a(628097064);
    }

    public synchronized ArrayList<a> a(String str) {
        ArrayList<a> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("93222fc1", new Object[]{this, str});
        }
        HashMap<String, a> hashMap = this.f31237a.get(str);
        if (hashMap != null) {
            arrayList = new ArrayList<>(hashMap.values());
        } else {
            arrayList = new ArrayList<>(0);
        }
        return arrayList;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements r9y<ikl> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final ikl f31238a;
        public sxx b;

        static {
            t2o.a(628097065);
            t2o.a(628097533);
        }

        public a(ikl iklVar) {
            this.f31238a = iklVar;
        }

        public final void a(ikl iklVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("602fcc1c", new Object[]{this, iklVar});
                return;
            }
            sxx sxxVar = this.b;
            if (sxxVar != null) {
                sxxVar.b_();
            }
            l5y.m(iklVar).a(MsgRouter.e().c());
            long currentTimeMillis = System.currentTimeMillis();
            ikl iklVar2 = this.f31238a;
            iklVar2.g = currentTimeMillis - iklVar2.g;
            iklVar2.h = currentTimeMillis - iklVar2.f21366a.createTime();
            MsgMonitor.d(this.f31238a);
        }

        @Override // tb.r9y
        public void onComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
            }
        }

        @Override // tb.r9y
        public void onSubscribe(sxx sxxVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("feb4c498", new Object[]{this, sxxVar});
            } else {
                this.b = sxxVar;
            }
        }

        /* renamed from: b */
        public void onNext(ikl iklVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f74929b8", new Object[]{this, iklVar});
            } else if (iklVar != null) {
                Ack ack = (Ack) iklVar.f21366a;
                int statusCode = ack.statusCode();
                if (statusCode == -30000) {
                    if (!ack.needACK()) {
                        ack.setStatus(1000);
                    }
                    MsgLog.e("ResponseManager", "dataId:", iklVar.c, "msgId:", ack.getID(), "status:", Integer.valueOf(ack.statusCode()), "topic:", ack.topic());
                } else if (statusCode == 1000) {
                    this.f31238a.f += iklVar.f;
                    l5y.m(iklVar).a(MsgRouter.e().c());
                    a(iklVar);
                    MsgLog.e("ResponseManager", "dataId:", iklVar.c, "msgId:", ack.getID(), "status:", Integer.valueOf(ack.statusCode()), "topic:", ack.topic());
                }
                MsgRouter.e().h().b(iklVar.c, iklVar.f21366a.getID());
                a(iklVar);
                MsgLog.e("ResponseManager", "dataId:", iklVar.c, "msgId:", ack.getID(), "status:", Integer.valueOf(ack.statusCode()), "topic:", ack.topic());
            }
        }

        @Override // tb.r9y
        public void onError(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
                return;
            }
            x9o h = MsgRouter.e().h();
            ikl iklVar = this.f31238a;
            if (h.b(iklVar.c, iklVar.f21366a.getID()) != null) {
                ikl iklVar2 = new ikl(this.f31238a);
                Ack ack = new Ack(this.f31238a.f21366a);
                ack.setStatus(PowerMsgType.TIMEOUT);
                iklVar2.f21366a = ack;
                l5y.m(iklVar2).a(MsgRouter.e().c());
                MsgLog.e("ResponseManager", "timeout:", Integer.valueOf(ack.statusCode()), "topic:", ack.topic());
            }
        }
    }

    public synchronized a b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("642c14f0", new Object[]{this, str, str2});
        }
        MsgLog.e("ResponseManager", "pop:", str, "msgId:", str2);
        if (TextUtils.isEmpty(str)) {
            for (HashMap<String, a> hashMap : this.f31237a.values()) {
                a remove = hashMap.remove(str2);
                if (remove != null) {
                    return remove;
                }
            }
        } else {
            HashMap<String, a> hashMap2 = this.f31237a.get(str);
            if (hashMap2 != null) {
                return hashMap2.remove(str2);
            }
        }
        return null;
    }

    public synchronized void c(String str, ikl iklVar) {
        sxx sxxVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5ffad21", new Object[]{this, str, iklVar});
            return;
        }
        String id = iklVar.f21366a.getID();
        HashMap<String, a> hashMap = this.f31237a.get(str);
        if (hashMap == null) {
            HashMap<String, HashMap<String, a>> hashMap2 = this.f31237a;
            HashMap<String, a> hashMap3 = new HashMap<>();
            hashMap2.put(str, hashMap3);
            hashMap = hashMap3;
        }
        a aVar = new a(iklVar);
        l5y.n(new Exception()).L(iklVar.l, TimeUnit.SECONDS).a(aVar);
        a put = hashMap.put(id, aVar);
        if (!(put == null || (sxxVar = put.b) == null)) {
            sxxVar.b_();
        }
        MsgLog.e("ResponseManager", "record:", str, "msgId:", iklVar.f21366a.getID(), "topic:", iklVar.f21366a.topic());
    }
}
