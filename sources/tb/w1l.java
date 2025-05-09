package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.kernel.serviceinterface.KSPowerMsgBizParams;
import com.taobao.kmp.kernel.serviceinterface.KSPowerMsgCountMessage;
import com.taobao.kmp.kernel.serviceinterface.KSPowerMsgJoinMessage;
import com.taobao.kmp.kernel.serviceinterface.KSPowerMsgMessageHeader;
import com.taobao.kmp.kernel.serviceinterface.KSPowerMsgPowerMessage;
import com.taobao.kmp.kernel.serviceinterface.KSPowerMsgTextMessage;
import com.taobao.kmp.nexus.arch.openArch.service.powermsg.OpenArchPMBizCode;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class w1l implements nzf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final w1l INSTANCE = new w1l();

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, f3g> f30394a = new LinkedHashMap();
    public static String b;

    static {
        t2o.a(1004536655);
        t2o.a(1029701651);
    }

    public static final xhv A(KSPowerMsgTextMessage kSPowerMsgTextMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("9a902b2d", new Object[]{kSPowerMsgTextMessage});
        }
        ckf.g(kSPowerMsgTextMessage, "result");
        w1l w1lVar = INSTANCE;
        KSPowerMsgMessageHeader header = kSPowerMsgTextMessage.getHeader();
        f3g t = w1lVar.t(header != null ? header.getTopic() : null);
        if (t != null) {
            t.a0(kSPowerMsgTextMessage);
        }
        return xhv.INSTANCE;
    }

    public static final xhv v(y0g y0gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("3c2776db", new Object[]{y0gVar});
        }
        ckf.g(y0gVar, "result");
        f3g t = INSTANCE.t(y0gVar.c());
        if (t != null) {
            t.Z(y0gVar);
        }
        return xhv.INSTANCE;
    }

    public static final xhv w(b1g b1gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("7b0f3a95", new Object[]{b1gVar});
        }
        ckf.g(b1gVar, "result");
        f3g t = INSTANCE.t(b1gVar.c());
        if (t != null) {
            t.e0(b1gVar);
        }
        return xhv.INSTANCE;
    }

    public static final xhv x(KSPowerMsgPowerMessage kSPowerMsgPowerMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("8dc68ee8", new Object[]{kSPowerMsgPowerMessage});
        }
        ckf.g(kSPowerMsgPowerMessage, "result");
        w1l w1lVar = INSTANCE;
        KSPowerMsgMessageHeader header = kSPowerMsgPowerMessage.getHeader();
        f3g t = w1lVar.t(header != null ? header.getTopic() : null);
        if (t != null) {
            t.X(kSPowerMsgPowerMessage);
        }
        return xhv.INSTANCE;
    }

    public static final xhv y(KSPowerMsgJoinMessage kSPowerMsgJoinMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("226332e8", new Object[]{kSPowerMsgJoinMessage});
        }
        ckf.g(kSPowerMsgJoinMessage, "result");
        w1l w1lVar = INSTANCE;
        KSPowerMsgMessageHeader header = kSPowerMsgJoinMessage.getHeader();
        f3g t = w1lVar.t(header != null ? header.getTopic() : null);
        if (t != null) {
            t.W(kSPowerMsgJoinMessage);
        }
        return xhv.INSTANCE;
    }

    public static final xhv z(KSPowerMsgCountMessage kSPowerMsgCountMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("c8a01f30", new Object[]{kSPowerMsgCountMessage});
        }
        ckf.g(kSPowerMsgCountMessage, "result");
        w1l w1lVar = INSTANCE;
        KSPowerMsgMessageHeader header = kSPowerMsgCountMessage.getHeader();
        f3g t = w1lVar.t(header != null ? header.getTopic() : null);
        if (t != null) {
            t.S(kSPowerMsgCountMessage);
        }
        return xhv.INSTANCE;
    }

    @Override // tb.nzf
    public String getUuid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a2f0b68", new Object[]{this});
        }
        return b;
    }

    public final void r(j3d j3dVar, f3g f3gVar) {
        List<j3d> O;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82703376", new Object[]{this, j3dVar, f3gVar});
        } else if (f3gVar != null && j3dVar != null && (O = f3gVar.O()) != null) {
            O.add(j3dVar);
        }
    }

    public final f3g s(o1l o1lVar) {
        String f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f3g) ipChange.ipc$dispatch("cf921a81", new Object[]{this, o1lVar});
        }
        f3g f3gVar = new f3g(o1lVar);
        f3gVar.x0(INSTANCE.u(o1lVar));
        if (!(o1lVar == null || (f = o1lVar.f()) == null)) {
            f30394a.put(f, f3gVar);
        }
        return f3gVar;
    }

    @Override // tb.nzf
    public void setUuid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c031a20e", new Object[]{this, str});
        } else {
            b = str;
        }
    }

    public final f3g t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f3g) ipChange.ipc$dispatch("9602ded7", new Object[]{this, str});
        }
        return (f3g) ((LinkedHashMap) f30394a).get(str);
    }

    public final xhc u(o1l o1lVar) {
        OpenArchPMBizCode openArchPMBizCode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhc) ipChange.ipc$dispatch("d25815a1", new Object[]{this, o1lVar});
        }
        if (o1lVar == null || (openArchPMBizCode = o1lVar.c()) == null) {
            openArchPMBizCode = OpenArchPMBizCode.DefaultBizCode;
        }
        int value = openArchPMBizCode.getValue();
        KSPowerMsgBizParams kSPowerMsgBizParams = new KSPowerMsgBizParams();
        kSPowerMsgBizParams.setBizCode(Integer.valueOf(value));
        xhc a2 = mhr.f0().a();
        o0g o0gVar = new o0g();
        o0gVar.l(new g1a() { // from class: tb.q1l
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv v;
                v = w1l.v((y0g) obj);
                return v;
            }
        });
        o0gVar.n(new g1a() { // from class: tb.r1l
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv w;
                w = w1l.w((b1g) obj);
                return w;
            }
        });
        o0gVar.k(new g1a() { // from class: tb.s1l
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv x;
                x = w1l.x((KSPowerMsgPowerMessage) obj);
                return x;
            }
        });
        o0gVar.j(new g1a() { // from class: tb.t1l
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv y;
                y = w1l.y((KSPowerMsgJoinMessage) obj);
                return y;
            }
        });
        o0gVar.i(new g1a() { // from class: tb.u1l
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv z;
                z = w1l.z((KSPowerMsgCountMessage) obj);
                return z;
            }
        });
        o0gVar.m(new g1a() { // from class: tb.v1l
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv A;
                A = w1l.A((KSPowerMsgTextMessage) obj);
                return A;
            }
        });
        xhv xhvVar = xhv.INSTANCE;
        a2.t(kSPowerMsgBizParams, o0gVar);
        return a2;
    }
}
