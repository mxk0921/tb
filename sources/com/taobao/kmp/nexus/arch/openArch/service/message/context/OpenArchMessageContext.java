package com.taobao.kmp.nexus.arch.openArch.service.message.context;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.nexus.arch.openArch.service.message.model.PMMessageResponse;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import tb.a07;
import tb.g1a;
import tb.h3d;
import tb.iky;
import tb.nzf;
import tb.o1l;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 L2\u00020\u00012\u00060\u0002j\u0002`\u00032\u00020\u0004:\u0001MBm\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u00020\u00172\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u00172\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\u0019R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u0019R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R*\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R$\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b8\u0010\u001d\"\u0004\b9\u0010\u0019R$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010?\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b?\u0010\u001b\u001a\u0004\b@\u0010\u001d\"\u0004\bA\u0010\u0019R>\u0010F\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020D\u0018\u00010C\u0012\u0004\u0012\u00020\u0013\u0018\u00010Bj\u0004\u0018\u0001`E8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010K¨\u0006N"}, d2 = {"Lcom/taobao/kmp/nexus/arch/openArch/service/message/context/OpenArchMessageContext;", "", "Ljava/io/Serializable;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/Serializable;", "Ltb/nzf;", "", "topic", "Ltb/o1l;", "pmContext", "Lcom/taobao/kmp/nexus/arch/openArch/service/message/context/a;", "cdnContext", "", "Lcom/taobao/kmp/nexus/arch/openArch/service/message/context/b;", "compensationContexts", "Lcom/taobao/kmp/nexus/arch/openArch/service/message/context/OpenArchHeartBeatContext;", "heartBeatContext", "Ltb/h3d;", "messageListener", "entityIdentifier", "", "disableMessageDispatch", "<init>", "(Ljava/lang/String;Ltb/o1l;Lcom/taobao/kmp/nexus/arch/openArch/service/message/context/a;Ljava/util/List;Lcom/taobao/kmp/nexus/arch/openArch/service/message/context/OpenArchHeartBeatContext;Ltb/h3d;Ljava/lang/String;Ljava/lang/Boolean;)V", "Ltb/xhv;", "updateContextTopic", "(Ljava/lang/String;)V", "updateEntityIdentifier", "Ljava/lang/String;", "getTopic", "()Ljava/lang/String;", "setTopic", "Ltb/o1l;", "getPmContext", "()Ltb/o1l;", "setPmContext", "(Ltb/o1l;)V", "Lcom/taobao/kmp/nexus/arch/openArch/service/message/context/a;", "getCdnContext", "()Lcom/taobao/kmp/nexus/arch/openArch/service/message/context/a;", "setCdnContext", "(Lcom/taobao/kmp/nexus/arch/openArch/service/message/context/a;)V", "Ljava/util/List;", "getCompensationContexts$nexus_release", "()Ljava/util/List;", "setCompensationContexts$nexus_release", "(Ljava/util/List;)V", "Lcom/taobao/kmp/nexus/arch/openArch/service/message/context/OpenArchHeartBeatContext;", "getHeartBeatContext", "()Lcom/taobao/kmp/nexus/arch/openArch/service/message/context/OpenArchHeartBeatContext;", "setHeartBeatContext", "(Lcom/taobao/kmp/nexus/arch/openArch/service/message/context/OpenArchHeartBeatContext;)V", "Ltb/h3d;", "getMessageListener", "()Ltb/h3d;", "setMessageListener", "(Ltb/h3d;)V", "getEntityIdentifier", "setEntityIdentifier", "Ljava/lang/Boolean;", "getDisableMessageDispatch$nexus_release", "()Ljava/lang/Boolean;", "setDisableMessageDispatch$nexus_release", "(Ljava/lang/Boolean;)V", "uuid", "getUuid", "setUuid", "Lkotlin/Function1;", "Ltb/iky;", "Lcom/taobao/kmp/nexus/arch/openArch/service/message/model/PMMessageResponse;", "Lcom/taobao/kmp/nexus/arch/openArch/service/message/context/CustomMessageValidCheckAction;", "customMessageValidCheckAction", "Ltb/g1a;", "getCustomMessageValidCheckAction$nexus_release", "()Ltb/g1a;", "setCustomMessageValidCheckAction$nexus_release", "(Ltb/g1a;)V", "Companion", "a", "nexus_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class OpenArchMessageContext implements Serializable, nzf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private com.taobao.kmp.nexus.arch.openArch.service.message.context.a cdnContext;
    private List<b> compensationContexts;
    private g1a<? super iky<PMMessageResponse>, Boolean> customMessageValidCheckAction;
    private Boolean disableMessageDispatch;
    private String entityIdentifier;
    private OpenArchHeartBeatContext heartBeatContext;
    private h3d messageListener;
    private o1l pmContext;
    private String topic;
    private String uuid;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1004536559);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(1004536558);
        t2o.a(1004536553);
        t2o.a(1029701651);
    }

    public OpenArchMessageContext() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public final com.taobao.kmp.nexus.arch.openArch.service.message.context.a getCdnContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.kmp.nexus.arch.openArch.service.message.context.a) ipChange.ipc$dispatch("316e041d", new Object[]{this});
        }
        return this.cdnContext;
    }

    public final List<b> getCompensationContexts$nexus_release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e76006c9", new Object[]{this});
        }
        return this.compensationContexts;
    }

    public final g1a<iky<PMMessageResponse>, Boolean> getCustomMessageValidCheckAction$nexus_release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("ba24c4b0", new Object[]{this});
        }
        return this.customMessageValidCheckAction;
    }

    public final Boolean getDisableMessageDispatch$nexus_release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("401fd936", new Object[]{this});
        }
        return this.disableMessageDispatch;
    }

    public final String getEntityIdentifier() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6b658bd7", new Object[]{this});
        }
        return this.entityIdentifier;
    }

    public final OpenArchHeartBeatContext getHeartBeatContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OpenArchHeartBeatContext) ipChange.ipc$dispatch("f6c2ebb2", new Object[]{this});
        }
        return this.heartBeatContext;
    }

    public final h3d getMessageListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h3d) ipChange.ipc$dispatch("16dc9888", new Object[]{this});
        }
        return this.messageListener;
    }

    public final o1l getPmContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o1l) ipChange.ipc$dispatch("9c5eaa01", new Object[]{this});
        }
        return this.pmContext;
    }

    public final String getTopic() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f2a1d120", new Object[]{this});
        }
        return this.topic;
    }

    @Override // tb.nzf
    public String getUuid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a2f0b68", new Object[]{this});
        }
        return this.uuid;
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

    public final void setCdnContext(com.taobao.kmp.nexus.arch.openArch.service.message.context.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0177683", new Object[]{this, aVar});
        } else {
            this.cdnContext = aVar;
        }
    }

    public final void setCompensationContexts$nexus_release(List<b> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a24b54bb", new Object[]{this, list});
        } else {
            this.compensationContexts = list;
        }
    }

    public final void setCustomMessageValidCheckAction$nexus_release(g1a<? super iky<PMMessageResponse>, Boolean> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("702e6b66", new Object[]{this, g1aVar});
        } else {
            this.customMessageValidCheckAction = g1aVar;
        }
    }

    public final void setDisableMessageDispatch$nexus_release(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d5f3a28", new Object[]{this, bool});
        } else {
            this.disableMessageDispatch = bool;
        }
    }

    public final void setEntityIdentifier(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d8e7d7f", new Object[]{this, str});
        } else {
            this.entityIdentifier = str;
        }
    }

    public final void setHeartBeatContext(OpenArchHeartBeatContext openArchHeartBeatContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dd5dd16", new Object[]{this, openArchHeartBeatContext});
        } else {
            this.heartBeatContext = openArchHeartBeatContext;
        }
    }

    public final void setMessageListener(h3d h3dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b98a997e", new Object[]{this, h3dVar});
        } else {
            this.messageListener = h3dVar;
        }
    }

    public final void setPmContext(o1l o1lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb10ca77", new Object[]{this, o1lVar});
        } else {
            this.pmContext = o1lVar;
        }
    }

    public final void setTopic(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e70e8be", new Object[]{this, str});
        } else {
            this.topic = str;
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

    public void updateContextTopic(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c1f49fa", new Object[]{this, str});
            return;
        }
        this.topic = str;
        o1l o1lVar = this.pmContext;
        if (o1lVar != null) {
            o1lVar.r(str);
        }
        com.taobao.kmp.nexus.arch.openArch.service.message.context.a aVar = this.cdnContext;
        if (aVar != null) {
            aVar.f(str);
        }
        List<b> list = this.compensationContexts;
        if (list != null) {
            for (b bVar : list) {
                bVar.f(str);
            }
        }
    }

    public void updateEntityIdentifier(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f43374a6", new Object[]{this, str});
            return;
        }
        this.entityIdentifier = str;
        o1l o1lVar = this.pmContext;
        if (o1lVar != null) {
            o1lVar.a(str);
        }
        com.taobao.kmp.nexus.arch.openArch.service.message.context.a aVar = this.cdnContext;
        if (aVar != null) {
            aVar.g(str);
        }
        List<b> list = this.compensationContexts;
        if (list != null) {
            for (b bVar : list) {
                bVar.g(str);
            }
        }
    }

    public OpenArchMessageContext(String str, o1l o1lVar, com.taobao.kmp.nexus.arch.openArch.service.message.context.a aVar, List<b> list, OpenArchHeartBeatContext openArchHeartBeatContext, h3d h3dVar, String str2, Boolean bool) {
        this.topic = str;
        this.pmContext = o1lVar;
        this.cdnContext = aVar;
        this.compensationContexts = list;
        this.heartBeatContext = openArchHeartBeatContext;
        this.messageListener = h3dVar;
        this.entityIdentifier = str2;
        this.disableMessageDispatch = bool;
        if (o1lVar != null && o1lVar.f() == null) {
            o1lVar.p(this.topic);
        }
        com.taobao.kmp.nexus.arch.openArch.service.message.context.a aVar2 = this.cdnContext;
        if (aVar2 != null && aVar2.d() == null) {
            aVar2.e(this.topic);
        }
        List<b> list2 = this.compensationContexts;
        if (list2 != null) {
            for (b bVar : list2) {
                if (bVar.d() == null) {
                    bVar.e(this.topic);
                }
            }
        }
    }

    public /* synthetic */ OpenArchMessageContext(String str, o1l o1lVar, com.taobao.kmp.nexus.arch.openArch.service.message.context.a aVar, List list, OpenArchHeartBeatContext openArchHeartBeatContext, h3d h3dVar, String str2, Boolean bool, int i, a07 a07Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : o1lVar, (i & 4) != 0 ? null : aVar, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : openArchHeartBeatContext, (i & 32) != 0 ? null : h3dVar, (i & 64) == 0 ? str2 : null, (i & 128) != 0 ? Boolean.FALSE : bool);
    }
}
