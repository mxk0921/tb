package com.taobao.kmp.nexus.arch.openArch.service.message.model;

import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.kernel.serviceinterface.KSPowerMsgTopicUser;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import tb.a07;
import tb.nzf;
import tb.pg1;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0018\u0018\u0000 92\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001:B\u0007¢\u0006\u0004\b\u0004\u0010\u0005R2\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R2\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR$\u0010\u0018\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R*\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010$\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010*\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010%\u001a\u0004\b+\u0010'\"\u0004\b,\u0010)R$\u0010-\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010%\u001a\u0004\b.\u0010'\"\u0004\b/\u0010)R$\u00100\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010%\u001a\u0004\b1\u0010'\"\u0004\b2\u0010)R$\u00103\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010%\u001a\u0004\b4\u0010'\"\u0004\b5\u0010)R$\u00106\u001a\u0004\u0018\u00010\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b6\u0010\u0010\u001a\u0004\b7\u0010\u0012\"\u0004\b8\u0010\u0014¨\u0006;"}, d2 = {"Lcom/taobao/kmp/nexus/arch/openArch/service/message/model/PMMessageRawResponse;", "Ltb/nzf;", "Ljava/io/Serializable;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/Serializable;", "<init>", "()V", "", "", "", "result", "Ljava/util/Map;", "getResult", "()Ljava/util/Map;", MspEventTypes.ACTION_STRING_SETRESULT, "(Ljava/util/Map;)V", "text", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", pg1.ATOM_values, "getValues", "setValues", "data", "getData", "setData", "", "Lcom/taobao/kmp/kernel/serviceinterface/KSPowerMsgTopicUser;", "users", "Ljava/util/List;", "getUsers", "()Ljava/util/List;", "setUsers", "(Ljava/util/List;)V", "", "visitNUM", "Ljava/lang/Integer;", "getVisitNUM", "()Ljava/lang/Integer;", "setVisitNUM", "(Ljava/lang/Integer;)V", "onlineNUM", "getOnlineNUM", "setOnlineNUM", "totalNUM", "getTotalNUM", "setTotalNUM", "msgNUM", "getMsgNUM", "setMsgNUM", "digNUM", "getDigNUM", "setDigNUM", "uuid", "getUuid", "setUuid", "Companion", "a", "nexus_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class PMMessageRawResponse implements nzf, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private String data;
    private Integer digNUM;
    private Integer msgNUM;
    private Integer onlineNUM;
    private Map<String, ? extends Object> result;
    private String text;
    private Integer totalNUM;
    private List<KSPowerMsgTopicUser> users;
    private String uuid;
    private Map<String, ? extends Object> values;
    private Integer visitNUM;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(1004536589);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(1004536588);
        t2o.a(1029701651);
    }

    public final String getData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f6b2ad9", new Object[]{this});
        }
        return this.data;
    }

    public final Integer getDigNUM() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("cb70c708", new Object[]{this});
        }
        return this.digNUM;
    }

    public final Integer getMsgNUM() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("7ff4b0e9", new Object[]{this});
        }
        return this.msgNUM;
    }

    public final Integer getOnlineNUM() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("6e0ba9ab", new Object[]{this});
        }
        return this.onlineNUM;
    }

    public final Map<String, Object> getResult() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7a4b0acf", new Object[]{this});
        }
        return this.result;
    }

    public final String getText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97297536", new Object[]{this});
        }
        return this.text;
    }

    public final Integer getTotalNUM() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("c3f96906", new Object[]{this});
        }
        return this.totalNUM;
    }

    public final List<KSPowerMsgTopicUser> getUsers() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("bc1c54e", new Object[]{this});
        }
        return this.users;
    }

    @Override // tb.nzf
    public String getUuid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a2f0b68", new Object[]{this});
        }
        return this.uuid;
    }

    public final Map<String, Object> getValues() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("70cb8894", new Object[]{this});
        }
        return this.values;
    }

    public final Integer getVisitNUM() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("b5f57cdf", new Object[]{this});
        }
        return this.visitNUM;
    }

    public nzf keepObj() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nzf) ipChange.ipc$dispatch("f9044030", new Object[]{this});
        }
        return nzf.a.a(this);
    }

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        } else {
            nzf.a.b(this);
        }
    }

    public final void setData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("427970bd", new Object[]{this, str});
        } else {
            this.data = str;
        }
    }

    public final void setDigNUM(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb546d2a", new Object[]{this, num});
        } else {
            this.digNUM = num;
        }
    }

    public final void setMsgNUM(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("974dbf69", new Object[]{this, num});
        } else {
            this.msgNUM = num;
        }
    }

    public final void setOnlineNUM(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbfbdd7f", new Object[]{this, num});
        } else {
            this.onlineNUM = num;
        }
    }

    public final void setResult(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10a44e9f", new Object[]{this, map});
        } else {
            this.result = map;
        }
    }

    public final void setText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2847200", new Object[]{this, str});
        } else {
            this.text = str;
        }
    }

    public final void setTotalNUM(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f1a3dec", new Object[]{this, num});
        } else {
            this.totalNUM = num;
        }
    }

    public final void setUsers(List<KSPowerMsgTopicUser> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90fd533e", new Object[]{this, list});
        } else {
            this.users = list;
        }
    }

    @Override // tb.nzf
    public void setUuid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c031a20e", new Object[]{this, str});
        } else {
            this.uuid = str;
        }
    }

    public final void setValues(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea33897a", new Object[]{this, map});
        } else {
            this.values = map;
        }
    }

    public final void setVisitNUM(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ca0a533", new Object[]{this, num});
        } else {
            this.visitNUM = num;
        }
    }
}
