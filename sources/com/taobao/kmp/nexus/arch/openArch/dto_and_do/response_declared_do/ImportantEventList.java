package com.taobao.kmp.nexus.arch.openArch.dto_and_do.response_declared_do;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.network.diagnosis.model.NetworkAbility;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import tb.a07;
import tb.a0g;
import tb.dun;
import tb.mzf;
import tb.qjg;
import tb.t2o;
import tb.yh6;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 :2\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001;B\u0007¢\u0006\u0004\b\u0004\u0010\u0005R/\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR/\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u000f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R/\u0010\u001c\u001a\u0004\u0018\u00010\u00162\b\u0010\u0007\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\t\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR/\u0010#\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0007\u001a\u0004\u0018\u00010\u001d8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\t\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R/\u0010%\u001a\u0004\u0018\u00010\u00162\b\u0010\u0007\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010\t\u001a\u0004\b%\u0010\u0019\"\u0004\b&\u0010\u001bR/\u0010*\u001a\u0004\u0018\u00010\u00162\b\u0010\u0007\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010\t\u001a\u0004\b(\u0010\u0019\"\u0004\b)\u0010\u001bR/\u0010.\u001a\u0004\u0018\u00010\u00162\b\u0010\u0007\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010\t\u001a\u0004\b,\u0010\u0019\"\u0004\b-\u0010\u001bR/\u00102\u001a\u0004\u0018\u00010\u00162\b\u0010\u0007\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b/\u0010\t\u001a\u0004\b0\u0010\u0019\"\u0004\b1\u0010\u001bR/\u00109\u001a\u0004\u0018\u0001032\b\u0010\u0007\u001a\u0004\u0018\u0001038F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b4\u0010\t\u001a\u0004\b5\u00106\"\u0004\b7\u00108¨\u0006<"}, d2 = {"Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/ImportantEventList;", "Ltb/mzf;", "Ljava/io/Serializable;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/Serializable;", "<init>", "()V", "Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/ConfigInfo;", "<set-?>", "configInfo$delegate", "Ltb/qjg;", "getConfigInfo", "()Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/ConfigInfo;", "setConfigInfo", "(Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/ConfigInfo;)V", "configInfo", "Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/DataMessage;", "dataMessage$delegate", "getDataMessage", "()Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/DataMessage;", "setDataMessage", "(Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/DataMessage;)V", "dataMessage", "", "disappearTime$delegate", "getDisappearTime", "()Ljava/lang/String;", "setDisappearTime", "(Ljava/lang/String;)V", "disappearTime", "Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/FatigueInfo;", "fatigueInfo$delegate", "getFatigueInfo", "()Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/FatigueInfo;", "setFatigueInfo", "(Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/FatigueInfo;)V", "fatigueInfo", "isHighestPriority$delegate", "isHighestPriority", "setHighestPriority", "priority$delegate", "getPriority", "setPriority", "priority", "templateName$delegate", "getTemplateName", "setTemplateName", yh6.CONFIG_KEY_TEMPLATE_NAME, "type$delegate", NetworkAbility.API_GET_TYPE, "setType", "type", "Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/UtParams;", "utParams$delegate", "getUtParams", "()Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/UtParams;", "setUtParams", "(Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/UtParams;)V", "utParams", "Companion", "a", "nexus_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class ImportantEventList extends mzf implements Serializable {
    public static final /* synthetic */ a0g<Object>[] $$delegatedProperties;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private final qjg configInfo$delegate = new qjg(null, this, ImportantEventList$configInfo$2.INSTANCE);
    private final qjg dataMessage$delegate = new qjg(null, this, ImportantEventList$dataMessage$2.INSTANCE);
    private final qjg disappearTime$delegate = new qjg(null, this, ImportantEventList$disappearTime$2.INSTANCE);
    private final qjg fatigueInfo$delegate = new qjg(null, this, ImportantEventList$fatigueInfo$2.INSTANCE);
    private final qjg isHighestPriority$delegate = new qjg(null, this, ImportantEventList$isHighestPriority$2.INSTANCE);
    private final qjg priority$delegate = new qjg(null, this, ImportantEventList$priority$2.INSTANCE);
    private final qjg templateName$delegate = new qjg(null, this, ImportantEventList$templateName$2.INSTANCE);
    private final qjg type$delegate = new qjg(null, this, ImportantEventList$type$2.INSTANCE);
    private final qjg utParams$delegate = new qjg(null, this, ImportantEventList$utParams$2.INSTANCE);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(1004536107);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    public static /* synthetic */ Object ipc$super(ImportantEventList importantEventList, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/ImportantEventList");
    }

    public final ConfigInfo getConfigInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConfigInfo) ipChange.ipc$dispatch("f4a4f213", new Object[]{this});
        }
        return (ConfigInfo) this.configInfo$delegate.b(this, $$delegatedProperties[0]);
    }

    public final DataMessage getDataMessage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DataMessage) ipChange.ipc$dispatch("8b0cda95", new Object[]{this});
        }
        return (DataMessage) this.dataMessage$delegate.b(this, $$delegatedProperties[1]);
    }

    public final String getDisappearTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5c9941df", new Object[]{this});
        }
        return (String) this.disappearTime$delegate.b(this, $$delegatedProperties[2]);
    }

    public final FatigueInfo getFatigueInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FatigueInfo) ipChange.ipc$dispatch("2b88e065", new Object[]{this});
        }
        return (FatigueInfo) this.fatigueInfo$delegate.b(this, $$delegatedProperties[3]);
    }

    public final String getPriority() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f425cc1f", new Object[]{this});
        }
        return (String) this.priority$delegate.b(this, $$delegatedProperties[5]);
    }

    public final String getTemplateName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8afad3e", new Object[]{this});
        }
        return (String) this.templateName$delegate.b(this, $$delegatedProperties[6]);
    }

    public final String getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        return (String) this.type$delegate.b(this, $$delegatedProperties[7]);
    }

    public final UtParams getUtParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UtParams) ipChange.ipc$dispatch("4b211e33", new Object[]{this});
        }
        return (UtParams) this.utParams$delegate.b(this, $$delegatedProperties[8]);
    }

    public final String isHighestPriority() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5fe149db", new Object[]{this});
        }
        return (String) this.isHighestPriority$delegate.b(this, $$delegatedProperties[4]);
    }

    public final void setConfigInfo(ConfigInfo configInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("571d79d", new Object[]{this, configInfo});
        } else {
            this.configInfo$delegate.a(this, $$delegatedProperties[0], configInfo);
        }
    }

    public final void setDataMessage(DataMessage dataMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96a87b0f", new Object[]{this, dataMessage});
        } else {
            this.dataMessage$delegate.a(this, $$delegatedProperties[1], dataMessage);
        }
    }

    public final void setDisappearTime(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b2edbdf", new Object[]{this, str});
        } else {
            this.disappearTime$delegate.a(this, $$delegatedProperties[2], str);
        }
    }

    public final void setFatigueInfo(FatigueInfo fatigueInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d8e480f", new Object[]{this, fatigueInfo});
        } else {
            this.fatigueInfo$delegate.a(this, $$delegatedProperties[3], fatigueInfo);
        }
    }

    public final void setHighestPriority(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0ca6fb7", new Object[]{this, str});
        } else {
            this.isHighestPriority$delegate.a(this, $$delegatedProperties[4], str);
        }
    }

    public final void setPriority(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b711237", new Object[]{this, str});
        } else {
            this.priority$delegate.a(this, $$delegatedProperties[5], str);
        }
    }

    public final void setTemplateName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dde46ef8", new Object[]{this, str});
        } else {
            this.templateName$delegate.a(this, $$delegatedProperties[6], str);
        }
    }

    public final void setType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd56044d", new Object[]{this, str});
        } else {
            this.type$delegate.a(this, $$delegatedProperties[7], str);
        }
    }

    public final void setUtParams(UtParams utParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47e348f3", new Object[]{this, utParams});
        } else {
            this.utParams$delegate.a(this, $$delegatedProperties[8], utParams);
        }
    }

    static {
        t2o.a(1004536106);
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(ImportantEventList.class, "configInfo", "getConfigInfo()Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/ConfigInfo;", 0);
        dun.f(mutablePropertyReference1Impl);
        MutablePropertyReference1Impl mutablePropertyReference1Impl2 = new MutablePropertyReference1Impl(ImportantEventList.class, "dataMessage", "getDataMessage()Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/DataMessage;", 0);
        dun.f(mutablePropertyReference1Impl2);
        MutablePropertyReference1Impl mutablePropertyReference1Impl3 = new MutablePropertyReference1Impl(ImportantEventList.class, "disappearTime", "getDisappearTime()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl3);
        MutablePropertyReference1Impl mutablePropertyReference1Impl4 = new MutablePropertyReference1Impl(ImportantEventList.class, "fatigueInfo", "getFatigueInfo()Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/FatigueInfo;", 0);
        dun.f(mutablePropertyReference1Impl4);
        MutablePropertyReference1Impl mutablePropertyReference1Impl5 = new MutablePropertyReference1Impl(ImportantEventList.class, "isHighestPriority", "isHighestPriority()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl5);
        MutablePropertyReference1Impl mutablePropertyReference1Impl6 = new MutablePropertyReference1Impl(ImportantEventList.class, "priority", "getPriority()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl6);
        MutablePropertyReference1Impl mutablePropertyReference1Impl7 = new MutablePropertyReference1Impl(ImportantEventList.class, yh6.CONFIG_KEY_TEMPLATE_NAME, "getTemplateName()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl7);
        MutablePropertyReference1Impl mutablePropertyReference1Impl8 = new MutablePropertyReference1Impl(ImportantEventList.class, "type", "getType()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl8);
        MutablePropertyReference1Impl mutablePropertyReference1Impl9 = new MutablePropertyReference1Impl(ImportantEventList.class, "utParams", "getUtParams()Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/UtParams;", 0);
        dun.f(mutablePropertyReference1Impl9);
        $$delegatedProperties = new a0g[]{mutablePropertyReference1Impl, mutablePropertyReference1Impl2, mutablePropertyReference1Impl3, mutablePropertyReference1Impl4, mutablePropertyReference1Impl5, mutablePropertyReference1Impl6, mutablePropertyReference1Impl7, mutablePropertyReference1Impl8, mutablePropertyReference1Impl9};
    }
}
