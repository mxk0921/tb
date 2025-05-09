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
import tb.q0j;
import tb.qjg;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001b\b\u0001\u0018\u0000 \u001f2\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001 B\u0007¢\u0006\u0004\b\u0004\u0010\u0005R/\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR/\u0010\u0012\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR/\u0010\u0016\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR/\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\t\u001a\u0004\b\u0018\u0010\u000b\"\u0004\b\u0019\u0010\rR/\u0010\u001e\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\t\u001a\u0004\b\u001c\u0010\u000b\"\u0004\b\u001d\u0010\r¨\u0006!"}, d2 = {"Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/ItemBenefitLabel;", "Ltb/mzf;", "Ljava/io/Serializable;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/Serializable;", "<init>", "()V", "", "<set-?>", "cardType$delegate", "Ltb/qjg;", "getCardType", "()Ljava/lang/String;", "setCardType", "(Ljava/lang/String;)V", q0j.BIZ_CONTEXT_KEY_CARD_TYPE, "labelText$delegate", "getLabelText", "setLabelText", "labelText", "onlyForItemList$delegate", "getOnlyForItemList", "setOnlyForItemList", "onlyForItemList", "showCountDown$delegate", "getShowCountDown", "setShowCountDown", "showCountDown", "type$delegate", NetworkAbility.API_GET_TYPE, "setType", "type", "Companion", "a", "nexus_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class ItemBenefitLabel extends mzf implements Serializable {
    public static final /* synthetic */ a0g<Object>[] $$delegatedProperties;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private final qjg cardType$delegate = new qjg(null, this, ItemBenefitLabel$cardType$2.INSTANCE);
    private final qjg labelText$delegate = new qjg(null, this, ItemBenefitLabel$labelText$2.INSTANCE);
    private final qjg onlyForItemList$delegate = new qjg(null, this, ItemBenefitLabel$onlyForItemList$2.INSTANCE);
    private final qjg showCountDown$delegate = new qjg(null, this, ItemBenefitLabel$showCountDown$2.INSTANCE);
    private final qjg type$delegate = new qjg(null, this, ItemBenefitLabel$type$2.INSTANCE);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(1004536133);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    public static /* synthetic */ Object ipc$super(ItemBenefitLabel itemBenefitLabel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/ItemBenefitLabel");
    }

    public final String getCardType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("63efa719", new Object[]{this});
        }
        return (String) this.cardType$delegate.b(this, $$delegatedProperties[0]);
    }

    public final String getLabelText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8522d44e", new Object[]{this});
        }
        return (String) this.labelText$delegate.b(this, $$delegatedProperties[1]);
    }

    public final String getOnlyForItemList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("538c541", new Object[]{this});
        }
        return (String) this.onlyForItemList$delegate.b(this, $$delegatedProperties[2]);
    }

    public final String getShowCountDown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16bd359b", new Object[]{this});
        }
        return (String) this.showCountDown$delegate.b(this, $$delegatedProperties[3]);
    }

    public final String getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        return (String) this.type$delegate.b(this, $$delegatedProperties[4]);
    }

    public final void setCardType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4e2967d", new Object[]{this, str});
        } else {
            this.cardType$delegate.a(this, $$delegatedProperties[0], str);
        }
    }

    public final void setLabelText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1757150", new Object[]{this, str});
        } else {
            this.labelText$delegate.a(this, $$delegatedProperties[1], str);
        }
    }

    public final void setOnlyForItemList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c07b7bd", new Object[]{this, str});
        } else {
            this.onlyForItemList$delegate.a(this, $$delegatedProperties[2], str);
        }
    }

    public final void setShowCountDown(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5895fa3", new Object[]{this, str});
        } else {
            this.showCountDown$delegate.a(this, $$delegatedProperties[3], str);
        }
    }

    public final void setType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd56044d", new Object[]{this, str});
        } else {
            this.type$delegate.a(this, $$delegatedProperties[4], str);
        }
    }

    static {
        t2o.a(1004536132);
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(ItemBenefitLabel.class, q0j.BIZ_CONTEXT_KEY_CARD_TYPE, "getCardType()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl);
        MutablePropertyReference1Impl mutablePropertyReference1Impl2 = new MutablePropertyReference1Impl(ItemBenefitLabel.class, "labelText", "getLabelText()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl2);
        MutablePropertyReference1Impl mutablePropertyReference1Impl3 = new MutablePropertyReference1Impl(ItemBenefitLabel.class, "onlyForItemList", "getOnlyForItemList()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl3);
        MutablePropertyReference1Impl mutablePropertyReference1Impl4 = new MutablePropertyReference1Impl(ItemBenefitLabel.class, "showCountDown", "getShowCountDown()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl4);
        MutablePropertyReference1Impl mutablePropertyReference1Impl5 = new MutablePropertyReference1Impl(ItemBenefitLabel.class, "type", "getType()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl5);
        $$delegatedProperties = new a0g[]{mutablePropertyReference1Impl, mutablePropertyReference1Impl2, mutablePropertyReference1Impl3, mutablePropertyReference1Impl4, mutablePropertyReference1Impl5};
    }
}
