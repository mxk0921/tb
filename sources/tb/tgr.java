package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.nexus.arch.openArch.service.message.model.PMMessageModel;
import com.taobao.taolive.sdk.model.message.TLiveMsg;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class tgr implements bwd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements u1a<Integer, Map<String, ? extends Object>, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ zvd f28712a;

        public a(tgr tgrVar, zvd zvdVar) {
            this.f28712a = zvdVar;
        }

        /* renamed from: a */
        public xhv invoke(Integer num, Map<String, ?> map) {
            HashMap hashMap;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xhv) ipChange.ipc$dispatch("d3e9b56c", new Object[]{this, num, map});
            }
            if (map != null) {
                hashMap = new HashMap(map);
            } else {
                hashMap = null;
            }
            this.f28712a.a(num.intValue(), hashMap, new Object[0]);
            return null;
        }
    }

    static {
        t2o.a(806356174);
        t2o.a(806355924);
    }

    public static PMMessageModel b(TLiveMsg tLiveMsg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PMMessageModel) ipChange.ipc$dispatch("1964bff6", new Object[]{tLiveMsg});
        }
        PMMessageModel pMMessageModel = new PMMessageModel();
        pMMessageModel.setTopic(tLiveMsg.topic);
        byte[] bArr = tLiveMsg.data;
        if (bArr != null && bArr.length > 0) {
            pMMessageModel.setMsg(new String(bArr));
        }
        pMMessageModel.setTopic(tLiveMsg.topic);
        pMMessageModel.setFrom(tLiveMsg.from);
        pMMessageModel.setMessageID(tLiveMsg.messageId);
        pMMessageModel.setQosLevel(Integer.valueOf(tLiveMsg.qosLevel));
        pMMessageModel.setPriority(Integer.valueOf(tLiveMsg.priority));
        pMMessageModel.setType(Integer.valueOf(tLiveMsg.type));
        pMMessageModel.setUserID(tLiveMsg.userId);
        pMMessageModel.setNeedACK(Boolean.valueOf(tLiveMsg.needAck));
        pMMessageModel.setTo(tLiveMsg.to);
        pMMessageModel.setTimestamp(String.valueOf(tLiveMsg.timestamp));
        pMMessageModel.setSendFullTags(Boolean.valueOf(tLiveMsg.sendFullTags));
        if (tLiveMsg.tags != null) {
            pMMessageModel.setTags(new ArrayList(Arrays.asList(tLiveMsg.tags)));
        }
        return pMMessageModel;
    }

    @Override // tb.bwd
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d6cdf1d", new Object[]{this});
        } else {
            r("Not yet implemented");
        }
    }

    @Override // tb.bwd
    public void c(int i, String str, String str2, String str3, zvd zvdVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b155bd57", new Object[]{this, new Integer(i), str, str2, str3, zvdVar, objArr});
        } else {
            r("Not yet implemented");
        }
    }

    @Override // tb.bwd
    public void d(int i, String str, int i2, int i3, int i4, zvd zvdVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8230123c", new Object[]{this, new Integer(i), str, new Integer(i2), new Integer(i3), new Integer(i4), zvdVar, objArr});
        } else {
            r("Not yet implemented");
        }
    }

    @Override // tb.bwd
    public void e(boolean z, boolean z2, ncc nccVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5b23fd7", new Object[]{this, new Boolean(z), new Boolean(z2), nccVar});
        } else {
            r("Not yet implemented");
        }
    }

    @Override // tb.bwd
    public void f(int i, String str, Map<String, Double> map, boolean z, zvd zvdVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba32fa4d", new Object[]{this, new Integer(i), str, map, new Boolean(z), zvdVar, objArr});
        } else {
            r("Not yet implemented");
        }
    }

    @Override // tb.bwd
    public void g(int i, String str, String str2, String str3, String str4, zvd zvdVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16cabc0d", new Object[]{this, new Integer(i), str, str2, str3, str4, zvdVar, objArr});
        } else {
            r("Not yet implemented");
        }
    }

    @Override // tb.bwd
    public void h(int i, TLiveMsg tLiveMsg, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d009702", new Object[]{this, new Integer(i), tLiveMsg, new Integer(i2)});
        } else {
            r("Not yet implemented");
        }
    }

    @Override // tb.bwd
    public void i(int i, TLiveMsg tLiveMsg, zvd zvdVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c02d9a54", new Object[]{this, new Integer(i), tLiveMsg, zvdVar, objArr});
        } else {
            d9m.O().sendMessage(b(tLiveMsg), new a(this, zvdVar));
        }
    }

    @Override // tb.bwd
    public void j(int i, String str, String str2, String str3, zvd zvdVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669116f0", new Object[]{this, new Integer(i), str, str2, str3, zvdVar, objArr});
        } else {
            r("Not yet implemented");
        }
    }

    @Override // tb.bwd
    public void k(int i, String str, String str2, String str3, String str4, String str5, zvd zvdVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb5db943", new Object[]{this, new Integer(i), str, str2, str3, str4, str5, zvdVar, objArr});
        } else {
            r("Not yet implemented");
        }
    }

    @Override // tb.bwd
    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d990194", new Object[]{this});
        } else {
            r("Not yet implemented");
        }
    }

    @Override // tb.bwd
    public void m(TLiveMsg tLiveMsg, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b68fd7bf", new Object[]{this, tLiveMsg, new Integer(i), new Boolean(z)});
        } else {
            r("Not yet implemented");
        }
    }

    @Override // tb.bwd
    public void n(int i, TLiveMsg tLiveMsg, zvd zvdVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2123e39e", new Object[]{this, new Integer(i), tLiveMsg, zvdVar, objArr});
        } else {
            r("Not yet implemented");
        }
    }

    @Override // tb.bwd
    public int o(int i, String str, awd awdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2e6aebfe", new Object[]{this, new Integer(i), str, awdVar})).intValue();
        }
        return 0;
    }

    @Override // tb.bwd
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            r("Not yet implemented");
        }
    }

    @Override // tb.bwd
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else {
            r("Not yet implemented");
        }
    }

    @Override // tb.bwd
    public void p(int i, String str, String str2, String str3, String str4, zvd zvdVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a164166", new Object[]{this, new Integer(i), str, str2, str3, str4, zvdVar, objArr});
        } else {
            r("Not yet implemented");
        }
    }

    @Override // tb.bwd
    public void q(int i, String str, String str2, String str3, String str4, String str5, zvd zvdVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6edfa5c", new Object[]{this, new Integer(i), str, str2, str3, str4, str5, zvdVar, objArr});
        } else {
            r("Not yet implemented");
        }
    }

    public final void r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dd52d5", new Object[]{this, str});
            return;
        }
        eir.a("TBKMPLiveMsgService", "TBKMPLiveMsgService-" + str);
    }

    @Override // tb.bwd
    public void setMsgFetchMode(int i, String str, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13d9421b", new Object[]{this, new Integer(i), str, new Integer(i2)});
        } else {
            r("Not yet implemented");
        }
    }
}
