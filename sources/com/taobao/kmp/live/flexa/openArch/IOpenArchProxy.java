package com.taobao.kmp.live.flexa.openArch;

import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.taobao.kmp.live.flexa.IKTProxy;
import kotlin.Metadata;
import tb.d2g;
import tb.fic;
import tb.g3g;
import tb.gic;
import tb.h2g;
import tb.i3g;
import tb.jky;
import tb.k2g;
import tb.lky;
import tb.m2g;
import tb.mky;
import tb.p2g;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 '2\u00020\u0001:\u0001(JË\u0001\u0010\u0015\u001a4\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0018\u00010\u0014\"\b\b\u0000\u0010\u0003*\u00020\u0002\"\u000e\b\u0001\u0010\u0005*\b\u0012\u0004\u0012\u00028\u00060\u0004\"\u0014\b\u0002\u0010\u0007*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00060\u0006\"\u0014\b\u0003\u0010\t*\u000e\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00070\b\"\u000e\b\u0004\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00060\n\"\u000e\b\u0005\u0010\r*\b\u0012\u0004\u0012\u00028\u00060\f\"\u000e\b\u0006\u0010\u000f*\b\u0012\u0004\u0012\u00028\u00060\u000e\"\b\b\u0007\u0010\u0011*\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H&¢\u0006\u0004\b\u0015\u0010\u0016JÇ\u0001\u0010\u0019\u001a\u00020\u0018\"\b\b\u0000\u0010\u0003*\u00020\u0002\"\u000e\b\u0001\u0010\u0005*\b\u0012\u0004\u0012\u00028\u00060\u0004\"\u0014\b\u0002\u0010\u0007*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00060\u0006\"\u0014\b\u0003\u0010\t*\u000e\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00070\b\"\u000e\b\u0004\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00060\n\"\u000e\b\u0005\u0010\r*\b\u0012\u0004\u0012\u00028\u00060\f\"\u000e\b\u0006\u0010\u000f*\b\u0012\u0004\u0012\u00028\u00060\u000e\"\b\b\u0007\u0010\u0011*\u00020\u001026\u0010\u0017\u001a2\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00070\u0014H&¢\u0006\u0004\b\u0019\u0010\u001aJÏ\u0001\u0010\u001c\u001a4\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0018\u00010\u0014\"\b\b\u0000\u0010\u0003*\u00020\u0002\"\u000e\b\u0001\u0010\u0005*\b\u0012\u0004\u0012\u00028\u00060\u0004\"\u0014\b\u0002\u0010\u0007*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00060\u0006\"\u0014\b\u0003\u0010\t*\u000e\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00070\b\"\u000e\b\u0004\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00060\n\"\u000e\b\u0005\u0010\r*\b\u0012\u0004\u0012\u00028\u00060\f\"\u000e\b\u0006\u0010\u000f*\b\u0012\u0004\u0012\u00028\u00060\u000e\"\b\b\u0007\u0010\u0011*\u00020\u00102\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00060\u000eH&¢\u0006\u0004\b\u001c\u0010\u001dJÉ\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u001e\"\b\b\u0000\u0010\u0003*\u00020\u0002\"\u000e\b\u0001\u0010\u0005*\b\u0012\u0004\u0012\u00028\u00060\u0004\"\u0014\b\u0002\u0010\u0007*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00060\u0006\"\u0014\b\u0003\u0010\t*\u000e\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00070\b\"\u000e\b\u0004\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00060\n\"\u000e\b\u0005\u0010\r*\b\u0012\u0004\u0012\u00028\u00060\f\"\u000e\b\u0006\u0010\u000f*\b\u0012\u0004\u0012\u00028\u00060\u000e\"\b\b\u0007\u0010\u0011*\u00020\u001026\u0010\u0017\u001a2\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00070\u0014H&¢\u0006\u0004\b\u001f\u0010 JÉ\u0001\u0010\"\u001a\u0004\u0018\u00010!\"\b\b\u0000\u0010\u0003*\u00020\u0002\"\u000e\b\u0001\u0010\u0005*\b\u0012\u0004\u0012\u00028\u00060\u0004\"\u0014\b\u0002\u0010\u0007*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00060\u0006\"\u0014\b\u0003\u0010\t*\u000e\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00070\b\"\u000e\b\u0004\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00060\n\"\u000e\b\u0005\u0010\r*\b\u0012\u0004\u0012\u00028\u00060\f\"\u000e\b\u0006\u0010\u000f*\b\u0012\u0004\u0012\u00028\u00060\u000e\"\b\b\u0007\u0010\u0011*\u00020\u001026\u0010\u0017\u001a2\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00070\u0014H&¢\u0006\u0004\b\"\u0010#JÉ\u0001\u0010%\u001a\u0004\u0018\u00010$\"\b\b\u0000\u0010\u0003*\u00020\u0002\"\u000e\b\u0001\u0010\u0005*\b\u0012\u0004\u0012\u00028\u00060\u0004\"\u0014\b\u0002\u0010\u0007*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00060\u0006\"\u0014\b\u0003\u0010\t*\u000e\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00070\b\"\u000e\b\u0004\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00060\n\"\u000e\b\u0005\u0010\r*\b\u0012\u0004\u0012\u00028\u00060\f\"\u000e\b\u0006\u0010\u000f*\b\u0012\u0004\u0012\u00028\u00060\u000e\"\b\b\u0007\u0010\u0011*\u00020\u001026\u0010\u0017\u001a2\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00070\u0014H&¢\u0006\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lcom/taobao/kmp/live/flexa/openArch/IOpenArchProxy;", "Lcom/taobao/kmp/live/flexa/IKTProxy;", "Ltb/fic;", "BT", "Ltb/p2g;", "ECT", "Ltb/d2g;", "BCT", "Ltb/i3g;", "TCT", "Ltb/k2g;", "DCT", "Ltb/g3g;", "PCT", "Ltb/h2g;", "CT", "Ltb/gic;", RPCDataItems.DT, "", "multiInstanceIdentifier", "Ltb/m2g;", "fetchEntity", "(Ljava/lang/String;)Ltb/m2g;", "entity", "Ltb/xhv;", "releaseEntity", "(Ltb/m2g;)V", "context", "createEntity", "(Ltb/h2g;)Ltb/m2g;", "Ltb/lky;", "getChannelComponent", "(Ltb/m2g;)Ltb/lky;", "Ltb/mky;", "getOpenArchDataComponent", "(Ltb/m2g;)Ltb/mky;", "Ltb/jky;", "getAnalysisComponent", "(Ltb/m2g;)Ltb/jky;", "Companion", "a", "taoliveroombizsdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface IOpenArchProxy extends IKTProxy {
    public static final a Companion = a.$$INSTANCE;
    public static final String KEY = "IOpenArchProxy";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static final /* synthetic */ a $$INSTANCE = new a();
        public static final String KEY = "IOpenArchProxy";

        static {
            t2o.a(1003487265);
        }
    }

    <BT extends fic, ECT extends p2g<CT>, BCT extends d2g<BT, CT>, TCT extends i3g<CT, DT>, DCT extends k2g<CT>, PCT extends g3g<CT>, CT extends h2g<CT>, DT extends gic> m2g<BT, ECT, BCT, TCT, DCT, PCT, CT, DT> createEntity(h2g<CT> h2gVar);

    <BT extends fic, ECT extends p2g<CT>, BCT extends d2g<BT, CT>, TCT extends i3g<CT, DT>, DCT extends k2g<CT>, PCT extends g3g<CT>, CT extends h2g<CT>, DT extends gic> m2g<BT, ECT, BCT, TCT, DCT, PCT, CT, DT> fetchEntity(String str);

    <BT extends fic, ECT extends p2g<CT>, BCT extends d2g<BT, CT>, TCT extends i3g<CT, DT>, DCT extends k2g<CT>, PCT extends g3g<CT>, CT extends h2g<CT>, DT extends gic> jky getAnalysisComponent(m2g<BT, ECT, BCT, TCT, DCT, PCT, CT, DT> m2gVar);

    <BT extends fic, ECT extends p2g<CT>, BCT extends d2g<BT, CT>, TCT extends i3g<CT, DT>, DCT extends k2g<CT>, PCT extends g3g<CT>, CT extends h2g<CT>, DT extends gic> lky getChannelComponent(m2g<BT, ECT, BCT, TCT, DCT, PCT, CT, DT> m2gVar);

    <BT extends fic, ECT extends p2g<CT>, BCT extends d2g<BT, CT>, TCT extends i3g<CT, DT>, DCT extends k2g<CT>, PCT extends g3g<CT>, CT extends h2g<CT>, DT extends gic> mky getOpenArchDataComponent(m2g<BT, ECT, BCT, TCT, DCT, PCT, CT, DT> m2gVar);

    <BT extends fic, ECT extends p2g<CT>, BCT extends d2g<BT, CT>, TCT extends i3g<CT, DT>, DCT extends k2g<CT>, PCT extends g3g<CT>, CT extends h2g<CT>, DT extends gic> void releaseEntity(m2g<BT, ECT, BCT, TCT, DCT, PCT, CT, DT> m2gVar);
}
