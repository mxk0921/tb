package com.taobao.unit.center.sync.syncable;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.g1a;
import tb.t2o;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H&¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004H&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004H&¢\u0006\u0004\b\u000e\u0010\rJF\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00028\u00002!\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u000b0\u00102\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0016\u0010\u0017J[\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00028\u000026\u0010\u001b\u001a2\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u000b0\u00182\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/taobao/unit/center/sync/syncable/ISyncable;", "Request", "Response", "", "", "getLocalAllTimeStamp", "()J", "getRemoteAllTimeStamp", "getLocalIncTimeStamp", "getRemoteIncTimeStamp", "timestamp", "Ltb/xhv;", "updateLocalAllTimeStamp", "(J)V", "updateLocalIncTimeStamp", "req", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "response", "remoteSyncSuccessFunc", "allTimeStamp", "doRemoteSync", "(Ljava/lang/Object;Ltb/g1a;Ljava/lang/Long;)V", "Lkotlin/Function2;", "", "templateId", "remoteSingleSyncFunc", "doRemoteSingleSync", "(Ljava/lang/Object;Ltb/u1a;Ljava/lang/Long;)V", "message_sp_framework_debug"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface ISyncable<Request, Response> {

    /* compiled from: Taobao */
    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class DefaultImpls {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(552599814);
        }

        public static /* synthetic */ void doRemoteSingleSync$default(ISyncable iSyncable, Object obj, u1a u1aVar, Long l, int i, Object obj2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e263e92e", new Object[]{iSyncable, obj, u1aVar, l, new Integer(i), obj2});
            } else if (obj2 == null) {
                if ((i & 4) != 0) {
                    l = -1L;
                }
                iSyncable.doRemoteSingleSync(obj, u1aVar, l);
            } else {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: doRemoteSingleSync");
            }
        }

        public static /* synthetic */ void doRemoteSync$default(ISyncable iSyncable, Object obj, g1a g1aVar, Long l, int i, Object obj2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee1f0095", new Object[]{iSyncable, obj, g1aVar, l, new Integer(i), obj2});
            } else if (obj2 == null) {
                if ((i & 4) != 0) {
                    l = -1L;
                }
                iSyncable.doRemoteSync(obj, g1aVar, l);
            } else {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: doRemoteSync");
            }
        }
    }

    void doRemoteSingleSync(Request request, u1a<? super Integer, ? super Response, xhv> u1aVar, Long l);

    void doRemoteSync(Request request, g1a<? super Response, xhv> g1aVar, Long l);

    long getLocalAllTimeStamp();

    long getLocalIncTimeStamp();

    long getRemoteAllTimeStamp();

    long getRemoteIncTimeStamp();

    void updateLocalAllTimeStamp(long j);

    void updateLocalIncTimeStamp(long j);
}
