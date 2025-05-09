package com.taobao.unit.center.sync.syncable;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.unit.center.sync.constant.SyncConstant;
import com.taobao.unit.center.sync.syncable.ISyncable;
import kotlin.Metadata;
import tb.ckf;
import tb.g1a;
import tb.t2o;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JZ\u0010\u000f\u001a\u00020\r\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00072!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\tH\u0007¢\u0006\u0004\b\u000f\u0010\u0010Jo\u0010\u0014\u001a\u00020\r\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000726\u0010\u000e\u001a2\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/taobao/unit/center/sync/syncable/SyncHandler;", "", "<init>", "()V", "Request", "Response", "request", "Lcom/taobao/unit/center/sync/syncable/ISyncable;", "syncable", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "result", "Ltb/xhv;", "successFunc", "doCheckSync", "(Ljava/lang/Object;Lcom/taobao/unit/center/sync/syncable/ISyncable;Ltb/g1a;)V", "Lkotlin/Function2;", "", "templateId", "doRemoteSyncSingle", "(Ljava/lang/Object;Lcom/taobao/unit/center/sync/syncable/ISyncable;Ltb/u1a;)V", "message_sp_framework_debug"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class SyncHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final SyncHandler INSTANCE = new SyncHandler();

    static {
        t2o.a(552599819);
    }

    private SyncHandler() {
    }

    public final <Request, Response> void doCheckSync(Request request, ISyncable<Request, Response> iSyncable, g1a<? super Response, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bf8d0fa", new Object[]{this, request, iSyncable, g1aVar});
            return;
        }
        ckf.h(iSyncable, "syncable");
        ckf.h(g1aVar, "successFunc");
        long remoteAllTimeStamp = iSyncable.getRemoteAllTimeStamp();
        if (iSyncable.getLocalAllTimeStamp() < remoteAllTimeStamp) {
            TLog.loge(SyncConstant.TAG, "local all smaller, " + iSyncable.getLocalAllTimeStamp() + "<" + remoteAllTimeStamp);
            iSyncable.updateLocalIncTimeStamp(0L);
            iSyncable.doRemoteSync(request, g1aVar, Long.valueOf(remoteAllTimeStamp));
        } else if (iSyncable.getLocalIncTimeStamp() < iSyncable.getRemoteIncTimeStamp()) {
            TLog.loge(SyncConstant.TAG, "local inc smaller, " + iSyncable.getLocalIncTimeStamp() + " < " + iSyncable.getRemoteIncTimeStamp());
            ISyncable.DefaultImpls.doRemoteSync$default(iSyncable, request, g1aVar, null, 4, null);
        } else {
            TLog.loge(SyncConstant.TAG, "do nothing: " + iSyncable.getLocalIncTimeStamp() + " >= " + iSyncable.getRemoteIncTimeStamp());
        }
    }

    public final <Request, Response> void doRemoteSyncSingle(Request request, ISyncable<Request, Response> iSyncable, u1a<? super Integer, ? super Response, xhv> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d49d2b35", new Object[]{this, request, iSyncable, u1aVar});
            return;
        }
        ckf.h(iSyncable, "syncable");
        ckf.h(u1aVar, "successFunc");
        ISyncable.DefaultImpls.doRemoteSingleSync$default(iSyncable, request, u1aVar, null, 4, null);
    }
}
