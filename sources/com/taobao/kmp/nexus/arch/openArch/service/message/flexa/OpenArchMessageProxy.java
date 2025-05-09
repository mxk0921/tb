package com.taobao.kmp.nexus.arch.openArch.service.message.flexa;

import com.alibaba.ability.impl.nfc.NfcAbility;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.flexa.powermsg.IOpenArchMessageProxy;
import com.taobao.kmp.nexus.arch.openArch.service.message.model.PMMessageModel;
import java.util.Map;
import kotlin.Metadata;
import tb.ckf;
import tb.f1l;
import tb.pg1;
import tb.t2o;
import tb.tsy;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJc\u0010\u0014\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042J\u0010\u0013\u001aF\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012#\u0012!\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0010¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/taobao/kmp/nexus/arch/openArch/service/message/flexa/OpenArchMessageProxy;", "Lcom/taobao/kmp/live/flexa/powermsg/IOpenArchMessageProxy;", "<init>", "()V", "", "config", "Ltb/xhv;", "subscribe", "(Ljava/lang/Object;)V", NfcAbility.API_UNSUBSCRIBE, "model", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "code", "", "", "data", pg1.ATOM_EXT_block, "sendMessage", "(Ljava/lang/Object;Ltb/u1a;)V", "nexus_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class OpenArchMessageProxy implements IOpenArchMessageProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1004536561);
        t2o.a(1003487266);
    }

    @Override // com.taobao.kmp.live.flexa.powermsg.IOpenArchMessageProxy
    public void sendMessage(Object obj, u1a<? super Integer, ? super Map<String, ? extends Object>, xhv> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0da18e7", new Object[]{this, obj, u1aVar});
            return;
        }
        ckf.g(obj, "model");
        PMMessageModel pMMessageModel = obj instanceof PMMessageModel ? (PMMessageModel) obj : null;
        if (pMMessageModel != null) {
            f1l.INSTANCE.x0(pMMessageModel, u1aVar);
        }
    }

    @Override // com.taobao.kmp.live.flexa.powermsg.IOpenArchMessageProxy
    public void subscribe(Object obj) {
        tsy tsyVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e6c6a6d", new Object[]{this, obj});
            return;
        }
        ckf.g(obj, "config");
        if (obj instanceof tsy) {
            tsyVar = (tsy) obj;
        } else {
            tsyVar = null;
        }
        if (tsyVar != null) {
            f1l.INSTANCE.E0(tsyVar);
        }
    }

    @Override // com.taobao.kmp.live.flexa.powermsg.IOpenArchMessageProxy
    public void unSubscribe(Object obj) {
        tsy tsyVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99a7c094", new Object[]{this, obj});
            return;
        }
        ckf.g(obj, "config");
        if (obj instanceof tsy) {
            tsyVar = (tsy) obj;
        } else {
            tsyVar = null;
        }
        if (tsyVar != null) {
            f1l.INSTANCE.F0(tsyVar);
        }
    }
}
