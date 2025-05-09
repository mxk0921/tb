package com.taobao.kmp.live.flexa.powermsg;

import com.alibaba.ability.impl.nfc.NfcAbility;
import com.taobao.kmp.live.flexa.IKTProxy;
import java.util.Map;
import kotlin.Metadata;
import tb.pg1;
import tb.t2o;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006Je\u0010\u0012\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00022L\b\u0002\u0010\u0011\u001aF\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012#\u0012!\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u000e¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0004\u0018\u00010\tH&¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/taobao/kmp/live/flexa/powermsg/IOpenArchMessageProxy;", "Lcom/taobao/kmp/live/flexa/IKTProxy;", "", "config", "Ltb/xhv;", "subscribe", "(Ljava/lang/Object;)V", NfcAbility.API_UNSUBSCRIBE, "model", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "code", "", "", "data", pg1.ATOM_EXT_block, "sendMessage", "(Ljava/lang/Object;Ltb/u1a;)V", "Companion", "a", "taoliveroombizsdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface IOpenArchMessageProxy extends IKTProxy {
    public static final a Companion = a.$$INSTANCE;
    public static final String KEY = "IOpenArchMessageProxy";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static final /* synthetic */ a $$INSTANCE = new a();
        public static final String KEY = "IOpenArchMessageProxy";

        static {
            t2o.a(1003487267);
        }
    }

    void sendMessage(Object obj, u1a<? super Integer, ? super Map<String, ? extends Object>, xhv> u1aVar);

    void subscribe(Object obj);

    void unSubscribe(Object obj);
}
