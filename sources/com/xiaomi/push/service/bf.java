package com.xiaomi.push.service;

import android.content.Context;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import com.taobao.taolive.sdk.model.message.PowerMsgType;
import com.xiaomi.push.service.XMPushService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import mtopsdk.mtop.intf.Mtop;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class bf {

    /* renamed from: a  reason: collision with root package name */
    private static bf f15066a;

    /* renamed from: a  reason: collision with other field name */
    private ConcurrentHashMap<String, HashMap<String, b>> f1578a = new ConcurrentHashMap<>();

    /* renamed from: a  reason: collision with other field name */
    private List<a> f1577a = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public interface a {
        void a();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class b {

        /* renamed from: a  reason: collision with other field name */
        public Context f1579a;

        /* renamed from: a  reason: collision with other field name */
        Messenger f1581a;

        /* renamed from: a  reason: collision with other field name */
        private XMPushService f1583a;

        /* renamed from: a  reason: collision with other field name */
        public k f1586a;

        /* renamed from: a  reason: collision with other field name */
        public String f1587a;

        /* renamed from: a  reason: collision with other field name */
        public boolean f1589a;

        /* renamed from: b  reason: collision with other field name */
        public String f1590b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public String i;

        /* renamed from: a  reason: collision with other field name */
        c f1585a = c.unbind;

        /* renamed from: a  reason: collision with root package name */
        private int f15067a = 0;

        /* renamed from: a  reason: collision with other field name */
        private final CopyOnWriteArrayList<a> f1588a = new CopyOnWriteArrayList<>();
        c b = null;

        /* renamed from: b  reason: collision with other field name */
        private boolean f1591b = false;

        /* renamed from: a  reason: collision with other field name */
        private XMPushService.c f1582a = new XMPushService.c(this);

        /* renamed from: a  reason: collision with other field name */
        IBinder.DeathRecipient f1580a = null;

        /* renamed from: a  reason: collision with other field name */
        final C0855b f1584a = new C0855b();

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
        public interface a {
            void a(c cVar, c cVar2, int i);
        }

        /* compiled from: Taobao */
        /* renamed from: com.xiaomi.push.service.bf$b$b  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
        public class C0855b extends XMPushService.j {

            /* renamed from: a  reason: collision with other field name */
            String f1592a;
            int b;

            /* renamed from: b  reason: collision with other field name */
            String f1593b;
            int c;

            public C0855b() {
                super(0);
            }

            public XMPushService.j a(int i, int i2, String str, String str2) {
                this.b = i;
                this.c = i2;
                this.f1593b = str2;
                this.f1592a = str;
                return this;
            }

            @Override // com.xiaomi.push.service.XMPushService.j
            /* renamed from: a */
            public String mo1104a() {
                return "notify job";
            }

            @Override // com.xiaomi.push.service.XMPushService.j
            /* renamed from: a  reason: collision with other method in class */
            public void mo1104a() {
                if (b.this.a(this.b, this.c, this.f1593b)) {
                    b.this.a(this.b, this.c, this.f1592a, this.f1593b);
                    return;
                }
                com.xiaomi.channel.commonutils.logger.b.b(" ignore notify client :" + b.this.g);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
        public class c implements IBinder.DeathRecipient {

            /* renamed from: a  reason: collision with root package name */
            final Messenger f15069a;

            /* renamed from: a  reason: collision with other field name */
            final b f1594a;

            public c(b bVar, Messenger messenger) {
                this.f1594a = bVar;
                this.f15069a = messenger;
            }

            @Override // android.os.IBinder.DeathRecipient
            public void binderDied() {
                com.xiaomi.channel.commonutils.logger.b.b("peer died, chid = " + this.f1594a.g);
                b.this.f1583a.a(new bh(this, 0), 0L);
                if ("9".equals(this.f1594a.g) && "com.xiaomi.xmsf".equals(b.this.f1583a.getPackageName())) {
                    b.this.f1583a.a(new bi(this, 0), 60000L);
                }
            }
        }

        public b() {
        }

        public long a() {
            return (((long) ((Math.random() * 20.0d) - 10.0d)) + ((this.f15067a + 1) * 15)) * 1000;
        }

        public void b(a aVar) {
            this.f1588a.remove(aVar);
        }

        public b(XMPushService xMPushService) {
            this.f1583a = xMPushService;
            a(new bg(this));
        }

        private boolean b(int i, int i2, String str) {
            if (i == 1) {
                return this.f1585a != c.binded && this.f1583a.m988c() && i2 != 21 && (i2 != 7 || !"wait".equals(str));
            }
            if (i == 2) {
                return this.f1583a.m988c();
            }
            if (i != 3) {
                return false;
            }
            return !"wait".equals(str);
        }

        public String a(int i) {
            return i != 1 ? i != 2 ? i != 3 ? "unknown" : "KICK" : "CLOSE" : Mtop.Id.OPEN;
        }

        public static String a(String str) {
            int lastIndexOf;
            return (!TextUtils.isEmpty(str) && (lastIndexOf = str.lastIndexOf("/")) != -1) ? str.substring(lastIndexOf + 1) : "";
        }

        /* renamed from: a  reason: collision with other method in class */
        public void m1051a() {
            try {
                Messenger messenger = this.f1581a;
                if (!(messenger == null || this.f1580a == null)) {
                    messenger.getBinder().unlinkToDeath(this.f1580a, 0);
                }
            } catch (Exception unused) {
            }
            this.b = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(int i, int i2, String str, String str2) {
            c cVar = this.f1585a;
            this.b = cVar;
            if (i == 2) {
                this.f1586a.a(this.f1579a, this, i2);
            } else if (i == 3) {
                this.f1586a.a(this.f1579a, this, str2, str);
            } else if (i == 1) {
                boolean z = cVar == c.binded;
                if (!z && "wait".equals(str2)) {
                    this.f15067a++;
                } else if (z) {
                    this.f15067a = 0;
                    if (this.f1581a != null) {
                        try {
                            this.f1581a.send(Message.obtain(null, 16, this.f1583a.f1501a));
                        } catch (RemoteException unused) {
                        }
                    }
                }
                this.f1586a.a(this.f1583a, this, z, i2, str);
            }
        }

        public void a(Messenger messenger) {
            m1051a();
            try {
                if (messenger != null) {
                    this.f1581a = messenger;
                    this.f1591b = true;
                    this.f1580a = new c(this, messenger);
                    messenger.getBinder().linkToDeath(this.f1580a, 0);
                } else {
                    com.xiaomi.channel.commonutils.logger.b.b("peer linked with old sdk chid = " + this.g);
                }
            } catch (Exception e) {
                com.xiaomi.channel.commonutils.logger.b.b("peer linkToDeath err: " + e.getMessage());
                this.f1581a = null;
                this.f1591b = false;
            }
        }

        public void a(a aVar) {
            this.f1588a.add(aVar);
        }

        public void a(c cVar, int i, int i2, String str, String str2) {
            boolean z;
            int i3 = 0;
            Iterator<a> it = this.f1588a.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next != null) {
                    next.a(this.f1585a, cVar, i2);
                }
            }
            c cVar2 = this.f1585a;
            if (cVar2 != cVar) {
                com.xiaomi.channel.commonutils.logger.b.m410a(String.format("update the client %7$s status. %1$s->%2$s %3$s %4$s %5$s %6$s", cVar2, cVar, a(i), bj.a(i2), str, str2, this.g));
                this.f1585a = cVar;
            }
            if (this.f1586a == null) {
                com.xiaomi.channel.commonutils.logger.b.d("status changed while the client dispatcher is missing");
            } else if (cVar != c.binding) {
                if (this.b != null && (z = this.f1591b)) {
                    i3 = (this.f1581a == null || !z) ? PowerMsgType.NewEndEditItemMsg : 1000;
                }
                this.f1583a.b(this.f1584a);
                if (b(i, i2, str2)) {
                    a(i, i2, str, str2);
                } else {
                    this.f1583a.a(this.f1584a.a(i, i2, str, str2), i3);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean a(int i, int i2, String str) {
            boolean z;
            StringBuilder sb;
            c cVar = this.b;
            if (cVar == null || !(z = this.f1591b)) {
                return true;
            }
            if (cVar == this.f1585a) {
                sb = new StringBuilder(" status recovered, don't notify client:");
            } else if (this.f1581a == null || !z) {
                sb = new StringBuilder("peer died, ignore notify ");
            } else {
                com.xiaomi.channel.commonutils.logger.b.b("Peer alive notify status to client:" + this.g);
                return true;
            }
            sb.append(this.g);
            com.xiaomi.channel.commonutils.logger.b.b(sb.toString());
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public enum c {
        unbind,
        binding,
        binded
    }

    private bf() {
    }

    /* renamed from: a  reason: collision with other method in class */
    public synchronized int m1044a() {
        return this.f1578a.size();
    }

    public synchronized void b() {
        this.f1577a.clear();
    }

    public synchronized b a(String str, String str2) {
        HashMap<String, b> hashMap = this.f1578a.get(str);
        if (hashMap == null) {
            return null;
        }
        return hashMap.get(a(str2));
    }

    public static synchronized bf a() {
        bf bfVar;
        synchronized (bf.class) {
            try {
                if (f15066a == null) {
                    f15066a = new bf();
                }
                bfVar = f15066a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bfVar;
    }

    private String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int indexOf = str.indexOf("@");
        return indexOf > 0 ? str.substring(0, indexOf) : str;
    }

    /* renamed from: a  reason: collision with other method in class */
    public synchronized ArrayList<b> m1045a() {
        ArrayList<b> arrayList;
        arrayList = new ArrayList<>();
        for (HashMap<String, b> hashMap : this.f1578a.values()) {
            arrayList.addAll(hashMap.values());
        }
        return arrayList;
    }

    /* renamed from: a  reason: collision with other method in class */
    public synchronized Collection<b> m1046a(String str) {
        if (!this.f1578a.containsKey(str)) {
            return new ArrayList();
        }
        return ((HashMap) this.f1578a.get(str).clone()).values();
    }

    /* renamed from: a  reason: collision with other method in class */
    public synchronized List<String> m1047a(String str) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (HashMap<String, b> hashMap : this.f1578a.values()) {
            for (b bVar : hashMap.values()) {
                if (str.equals(bVar.f1587a)) {
                    arrayList.add(bVar.g);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a  reason: collision with other method in class */
    public synchronized void m1048a() {
        try {
            Iterator<b> it = m1045a().iterator();
            while (it.hasNext()) {
                it.next().m1051a();
            }
            this.f1578a.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void a(Context context) {
        for (HashMap<String, b> hashMap : this.f1578a.values()) {
            for (b bVar : hashMap.values()) {
                bVar.a(c.unbind, 1, 3, (String) null, (String) null);
            }
        }
    }

    public synchronized void a(Context context, int i) {
        for (HashMap<String, b> hashMap : this.f1578a.values()) {
            for (b bVar : hashMap.values()) {
                bVar.a(c.unbind, 2, i, (String) null, (String) null);
            }
        }
    }

    public synchronized void a(a aVar) {
        this.f1577a.add(aVar);
    }

    public synchronized void a(b bVar) {
        try {
            HashMap<String, b> hashMap = this.f1578a.get(bVar.g);
            if (hashMap == null) {
                hashMap = new HashMap<>();
                this.f1578a.put(bVar.g, hashMap);
            }
            hashMap.put(a(bVar.f1590b), bVar);
            com.xiaomi.channel.commonutils.logger.b.m410a("add active client. " + bVar.f1587a);
            for (a aVar : this.f1577a) {
                aVar.a();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public synchronized void m1049a(String str) {
        try {
            HashMap<String, b> hashMap = this.f1578a.get(str);
            if (hashMap != null) {
                for (b bVar : hashMap.values()) {
                    bVar.m1051a();
                }
                hashMap.clear();
                this.f1578a.remove(str);
            }
            for (a aVar : this.f1577a) {
                aVar.a();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public synchronized void m1050a(String str, String str2) {
        try {
            HashMap<String, b> hashMap = this.f1578a.get(str);
            if (hashMap != null) {
                b bVar = hashMap.get(a(str2));
                if (bVar != null) {
                    bVar.m1051a();
                }
                hashMap.remove(a(str2));
                if (hashMap.isEmpty()) {
                    this.f1578a.remove(str);
                }
            }
            for (a aVar : this.f1577a) {
                aVar.a();
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
