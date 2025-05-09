package com.taobao.infoflow.eleme;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import kotlin.Metadata;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopBuilder;
import mtopsdk.mtop.intf.MtopPrefetch;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\u0000H\u0016J,\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000b2\u0010\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u001a\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0012\u0010\u0010\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015H\u0016¨\u0006\u0016"}, d2 = {"Lcom/taobao/infoflow/eleme/ELeMePrefetchMtopBusiness;", "Lmtopsdk/mtop/intf/MtopBuilder;", "mtopInstance", "Lmtopsdk/mtop/intf/Mtop;", "request", "Lmtopsdk/mtop/domain/MtopRequest;", "ttid", "", "(Lmtopsdk/mtop/intf/Mtop;Lmtopsdk/mtop/domain/MtopRequest;Ljava/lang/String;)V", "prefetch", "expireTime", "", "whiteListParams", "", "callback", "Lmtopsdk/mtop/intf/MtopPrefetch$IPrefetchCallback;", "prefetchComparator", "comparator", "Lmtopsdk/mtop/intf/MtopPrefetch$IPrefetchComparator;", "prefetchMode", "mode", "", "information_flow_tb_campaign_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class ELeMePrefetchMtopBusiness extends MtopBuilder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(490733578);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ELeMePrefetchMtopBusiness(Mtop mtop, MtopRequest mtopRequest, String str) {
        super(mtop, mtopRequest, str);
        ckf.g(mtop, "mtopInstance");
        ckf.g(mtopRequest, "request");
        ckf.g(str, "ttid");
    }

    public static /* synthetic */ Object ipc$super(ELeMePrefetchMtopBusiness eLeMePrefetchMtopBusiness, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2023524146:
                return super.prefetchMode(((Number) objArr[0]).intValue());
            case -256725936:
                return super.prefetchComparator((MtopPrefetch.IPrefetchComparator) objArr[0]);
            case 1847160467:
                return super.prefetch(((Number) objArr[0]).longValue(), (MtopPrefetch.IPrefetchCallback) objArr[1]);
            case 2030445956:
                return super.prefetch(((Number) objArr[0]).longValue(), (List) objArr[1], (MtopPrefetch.IPrefetchCallback) objArr[2]);
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/eleme/ELeMePrefetchMtopBusiness");
        }
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    public ELeMePrefetchMtopBusiness prefetchComparator(MtopPrefetch.IPrefetchComparator iPrefetchComparator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ELeMePrefetchMtopBusiness) ipChange.ipc$dispatch("56afadf9", new Object[]{this, iPrefetchComparator});
        }
        MtopBuilder prefetchComparator = super.prefetchComparator(iPrefetchComparator);
        if (prefetchComparator != null) {
            return (ELeMePrefetchMtopBusiness) prefetchComparator;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.taobao.infoflow.eleme.ELeMePrefetchMtopBusiness");
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    public ELeMePrefetchMtopBusiness prefetchMode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ELeMePrefetchMtopBusiness) ipChange.ipc$dispatch("d3e8e7f7", new Object[]{this, new Integer(i)});
        }
        MtopBuilder prefetchMode = super.prefetchMode(i);
        if (prefetchMode != null) {
            return (ELeMePrefetchMtopBusiness) prefetchMode;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.taobao.infoflow.eleme.ELeMePrefetchMtopBusiness");
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    public ELeMePrefetchMtopBusiness prefetch(long j, List<String> list, MtopPrefetch.IPrefetchCallback iPrefetchCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ELeMePrefetchMtopBusiness) ipChange.ipc$dispatch("1245882d", new Object[]{this, new Long(j), list, iPrefetchCallback});
        }
        MtopBuilder prefetch = super.prefetch(j, list, iPrefetchCallback);
        if (prefetch != null) {
            return (ELeMePrefetchMtopBusiness) prefetch;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.taobao.infoflow.eleme.ELeMePrefetchMtopBusiness");
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    public ELeMePrefetchMtopBusiness prefetch(long j, MtopPrefetch.IPrefetchCallback iPrefetchCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ELeMePrefetchMtopBusiness) ipChange.ipc$dispatch("24b40bfc", new Object[]{this, new Long(j), iPrefetchCallback});
        }
        MtopBuilder prefetch = super.prefetch(j, iPrefetchCallback);
        if (prefetch != null) {
            return (ELeMePrefetchMtopBusiness) prefetch;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.taobao.infoflow.eleme.ELeMePrefetchMtopBusiness");
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    public ELeMePrefetchMtopBusiness prefetch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ELeMePrefetchMtopBusiness) ipChange.ipc$dispatch("99630d93", new Object[]{this});
        }
        MtopBuilder prefetch = super.prefetch(0L, (MtopPrefetch.IPrefetchCallback) null);
        if (prefetch != null) {
            return (ELeMePrefetchMtopBusiness) prefetch;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.taobao.infoflow.eleme.ELeMePrefetchMtopBusiness");
    }
}
