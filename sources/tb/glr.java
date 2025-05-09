package tb;

import android.os.Message;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.message.TLiveMsg;
import java.util.HashMap;
import java.util.Map;
import tb.bpr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class glr extends bpr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String UT_PAGE_NAME = "Page_TBMiniLive";
    public static final HashMap<String, String> u = new HashMap<>();
    public final String n;
    public final String o;
    public final boolean r;
    public int p = 0;
    public int q = 0;
    public final String s = "TBLiveMSG";
    public final awd t = new c();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements zvd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.zvd
        public void a(int i, Map<String, Object> map, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c437f98c", new Object[]{this, new Integer(i), map, objArr});
                return;
            }
            glr.y(glr.this);
            glr glrVar = glr.this;
            if (glrVar.h == null) {
                glrVar.h = new jyw(glr.this);
            }
            Message obtainMessage = glr.this.h.obtainMessage(1001);
            obtainMessage.arg1 = i;
            obtainMessage.sendToTarget();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements zvd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.zvd
        public void a(int i, Map<String, Object> map, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c437f98c", new Object[]{this, new Integer(i), map, objArr});
                return;
            }
            glr glrVar = glr.this;
            if (glrVar.h == null) {
                glrVar.h = new jyw(glr.this);
            }
            Message obtainMessage = glr.this.h.obtainMessage(1002);
            obtainMessage.arg1 = i;
            obtainMessage.sendToTarget();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements awd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.awd
        public void a(int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2ce5e2af", new Object[]{this, new Integer(i), obj});
                return;
            }
            glr.y(glr.this);
            if (i == -3006) {
                glr glrVar = glr.this;
                if (glrVar.h == null) {
                    glrVar.h = new jyw(glr.this);
                }
                glr.this.h.obtainMessage(1003).sendToTarget();
            }
        }

        @Override // tb.awd
        public void b(TLiveMsg tLiveMsg) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8d56b849", new Object[]{this, tLiveMsg});
                return;
            }
            glr glrVar = glr.this;
            if (!glrVar.l) {
                glrVar.h(tLiveMsg);
            }
            if (v2s.o().E() != null && qvs.S0() && tLiveMsg != null && glr.x(glr.this, tLiveMsg)) {
                HashMap hashMap = new HashMap();
                hashMap.put("topic", tLiveMsg.topic);
                hashMap.put("messageId", tLiveMsg.messageId);
                hashMap.put("msgType", String.valueOf(tLiveMsg.type));
                hashMap.put("liveId", glr.this.m);
                hashMap.put("timestamp", String.valueOf(tLiveMsg.timestamp));
                if (v2s.o().u() != null) {
                    str = v2s.o().u().getUserId();
                } else {
                    str = "";
                }
                hashMap.put("userId", str);
                v2s.o().E().track4Click(glr.UT_PAGE_NAME, "PM_onDispatch", hashMap);
                if (10101 == tLiveMsg.type) {
                    glr.y(glr.this);
                }
            }
        }
    }

    static {
        t2o.a(779091993);
        t2o.a(806356160);
        t2o.a(806356162);
    }

    public glr(int i, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, bpr.c cVar) {
        super(i, str, z, z2, cVar);
        this.n = str;
        this.o = str2;
        this.r = z3;
    }

    public static /* synthetic */ Object ipc$super(glr glrVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2130491415:
                super.u();
                return null;
            case -1645671784:
                super.m((TLiveMsg) objArr[0]);
                return null;
            case 44570194:
                super.i();
                return null;
            case 225283992:
                super.j();
                return null;
            case 673877017:
                super.handleMessage((Message) objArr[0]);
                return null;
            case 1713617801:
                super.v();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/miniLive/pm/TBLiveMessageProvider");
        }
    }

    public static /* synthetic */ boolean x(glr glrVar, TLiveMsg tLiveMsg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("979a9f0c", new Object[]{glrVar, tLiveMsg})).booleanValue();
        }
        return glrVar.B(tLiveMsg);
    }

    public static /* synthetic */ String y(glr glrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("959d9dbe", new Object[]{glrVar});
        }
        return glrVar.s;
    }

    public final void A(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44e57470", new Object[]{this, new Integer(i)});
        } else if (i == 1000) {
            F();
        } else {
            E(i);
        }
    }

    public final boolean B(TLiveMsg tLiveMsg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e35af7a", new Object[]{this, tLiveMsg})).booleanValue();
        }
        int i = tLiveMsg.type;
        if (i == 10086 || i == 10101 || i == 10102) {
            return true;
        }
        return false;
    }

    public void C(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f665ec5", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = this.p;
        if (i2 < 3) {
            this.p = i2 + 1;
            i();
            return;
        }
        bpr.c cVar = this.g;
        if (cVar != null) {
            cVar.onMessageReceived(100000, 0);
        }
        this.p = 0;
    }

    public void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43e22911", new Object[]{this});
            return;
        }
        bpr.c cVar = this.g;
        if (cVar != null) {
            cVar.onMessageReceived(1005, 0);
        }
    }

    public void E(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d32181c6", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = this.q;
        if (i2 < 3) {
            this.q = i2 + 1;
            j();
            return;
        }
        this.q = 0;
    }

    public void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5608fd2", new Object[]{this});
        }
    }

    @Override // tb.bpr, tb.ccc
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            return;
        }
        switch (message.what) {
            case 1001:
                z(message.arg1);
                break;
            case 1002:
                A(message.arg1);
                break;
            case 1003:
                bpr.c cVar = this.g;
                if (cVar != null) {
                    cVar.onMessageReceived(1027, null);
                    break;
                }
                break;
            case 1004:
                bpr.c cVar2 = this.g;
                if (cVar2 != null) {
                    cVar2.onMessageReceived(1029, message.obj);
                    break;
                }
                break;
        }
        super.handleMessage(message);
    }

    @Override // tb.bpr
    public void m(TLiveMsg tLiveMsg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9de90a98", new Object[]{this, tLiveMsg});
        } else if (!TextUtils.isEmpty(tLiveMsg.topic) && TextUtils.equals(tLiveMsg.topic, this.n)) {
            if (tLiveMsg.type == 10181) {
                tLiveMsg.type = 10101;
            }
            super.m(tLiveMsg);
        } else if (!TextUtils.equals(tLiveMsg.topic, this.n)) {
            v2s.o().r().h(1, tLiveMsg, 502);
        }
    }

    @Override // tb.bpr
    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        super.u();
        if (!qvs.P0()) {
            return;
        }
        if (!TextUtils.isEmpty(this.o)) {
            v2s.o().r().o(1, this.o, this.t);
        } else {
            v2s.o().r().o(1, null, this.t);
        }
    }

    @Override // tb.bpr
    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        super.v();
        if (!qvs.P0()) {
            return;
        }
        if (!TextUtils.isEmpty(this.o)) {
            if (qvs.T0()) {
                v2s.o().r().o(1, this.o, null);
            }
        } else if (qvs.T0()) {
            v2s.o().r().o(1, null, null);
        }
    }

    public final void z(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93670daf", new Object[]{this, new Integer(i)});
        } else if (i == 1000) {
            D();
        } else {
            C(i);
        }
    }

    @Override // tb.bpr
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6d8f98", new Object[]{this});
            return;
        }
        super.j();
        HashMap<String, String> hashMap = u;
        if (toString().equals(hashMap.get(this.n))) {
            hashMap.remove(this.n);
            if (qvs.P0()) {
                joc u2 = v2s.o().u();
                String str = "";
                String nick = u2 != null ? u2.getNick() : str;
                b bVar = new b();
                if (!TextUtils.isEmpty(this.o)) {
                    v2s.o().r().g(1, this.n, this.o, nick, "tb", bVar, new Object[0]);
                } else {
                    v2s.o().r().c(1, this.n, nick, "tb", bVar, new Object[0]);
                }
                if (v2s.o().E() != null) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("topic", this.n);
                    hashMap2.put("liveId", this.m);
                    if (v2s.o().u() != null) {
                        str = v2s.o().u().getUserId();
                    }
                    hashMap2.put("userId", str);
                    v2s.o().E().track4Click(UT_PAGE_NAME, "PM_unsubscribe", hashMap2);
                }
            }
        }
    }

    @Override // tb.bpr
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a81652", new Object[]{this});
            return;
        }
        super.i();
        joc u2 = v2s.o().u();
        String str = "";
        String nick = u2 != null ? u2.getNick() : str;
        if (qvs.P0()) {
            v2s.o().r().setMsgFetchMode(1, this.n, this.r ? 4 : 3);
            a aVar = new a();
            if (!TextUtils.isEmpty(this.o)) {
                v2s.o().r().p(1, this.n, this.o, nick, "tb", aVar, new Object[0]);
            } else {
                v2s.o().r().j(1, this.n, nick, "tb", aVar, new Object[0]);
            }
            if (v2s.o().E() != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("topic", this.n);
                hashMap.put("liveId", this.m);
                hashMap.put("status", "1");
                if (v2s.o().u() != null) {
                    str = v2s.o().u().getUserId();
                }
                hashMap.put("userId", str);
                v2s.o().E().track4Click(UT_PAGE_NAME, "PM_subscribe", hashMap);
            }
            u.put(this.n, toString());
        }
    }
}
