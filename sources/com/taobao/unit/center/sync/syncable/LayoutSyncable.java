package com.taobao.unit.center.sync.syncable;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.util.ConfigUtil;
import com.taobao.message.kit.util.SharedPreferencesUtil;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.tao.log.TLog;
import com.taobao.unit.center.sync.constant.SyncConstant;
import com.taobao.unit.center.sync.model.LayoutRequest;
import com.taobao.unit.center.sync.model.LayoutResponse;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.t2o;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 ;2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001;B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\bJ5\u0010\u0011\u001a\u00020\u00102&\u0010\u000f\u001a\"\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00060\fj\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u0006`\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\bJ\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\bJ\u0017\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0017JD\u0010 \u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00022!\u0010\u001e\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u00100\u001a2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b \u0010!JY\u0010&\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u000226\u0010%\u001a2\u0012\u0013\u0012\u00110#¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b($\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u00100\"2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b&\u0010'R\"\u0010)\u001a\u00020(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010*\u001a\u0004\b\u000b\u0010,\"\u0004\b0\u0010.R\"\u00101\u001a\u00020(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010*\u001a\u0004\b\u0013\u0010,\"\u0004\b2\u0010.R\u0017\u00104\u001a\u0002038\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b4\u00106R\u001a\u00107\u001a\u00020#8\u0006X\u0086D¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:¨\u0006<"}, d2 = {"Lcom/taobao/unit/center/sync/syncable/LayoutSyncable;", "Lcom/taobao/unit/center/sync/syncable/ISyncable;", "Lcom/taobao/unit/center/sync/model/LayoutRequest;", "Lcom/taobao/unit/center/sync/model/LayoutResponse;", "<init>", "()V", "", "getLocalAllTimeStamp", "()J", "getRemoteAllTimeStamp", "getLocalIncTimeStamp", "getBaseTimeStamp", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "timestamps", "Ltb/xhv;", "updateTimeStamp", "(Ljava/util/HashMap;)V", "getDefaultTimeStamp", "getRemoteIncTimeStamp", "timestamp", "updateLocalAllTimeStamp", "(J)V", "updateLocalIncTimeStamp", "req", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "response", "remoteSyncSuccessFunc", "allTimeStamp", "doRemoteSync", "(Lcom/taobao/unit/center/sync/model/LayoutRequest;Ltb/g1a;Ljava/lang/Long;)V", "Lkotlin/Function2;", "", "templateId", "remoteSingleSyncFunc", "doRemoteSingleSync", "(Lcom/taobao/unit/center/sync/model/LayoutRequest;Ltb/u1a;Ljava/lang/Long;)V", "Ljava/util/concurrent/atomic/AtomicLong;", "curLocalAllTimeStamp", "Ljava/util/concurrent/atomic/AtomicLong;", "getCurLocalAllTimeStamp", "()Ljava/util/concurrent/atomic/AtomicLong;", "setCurLocalAllTimeStamp", "(Ljava/util/concurrent/atomic/AtomicLong;)V", "baseTimeStamp", "setBaseTimeStamp", "defaultTimeStamp", "setDefaultTimeStamp", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isSyncing", "Ljava/util/concurrent/atomic/AtomicBoolean;", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "pageSize", TLogTracker.LEVEL_INFO, "getPageSize", "()I", "Companion", "message_sp_framework_debug"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class LayoutSyncable implements ISyncable<LayoutRequest, LayoutResponse> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Companion Companion = new Companion(null);
    private static LayoutSyncable instance;
    private AtomicLong curLocalAllTimeStamp = new AtomicLong(-1);
    private AtomicLong baseTimeStamp = new AtomicLong(-1);
    private AtomicLong defaultTimeStamp = new AtomicLong(-1);
    private final AtomicBoolean isSyncing = new AtomicBoolean(false);
    private final int pageSize = 100;

    /* compiled from: Taobao */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/taobao/unit/center/sync/syncable/LayoutSyncable$Companion;", "", "()V", "instance", "Lcom/taobao/unit/center/sync/syncable/LayoutSyncable;", "getInstance", "message_sp_framework_debug"}, k = 1, mv = {1, 1, 15})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class Companion {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(552599816);
        }

        private Companion() {
        }

        public final LayoutSyncable getInstance() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LayoutSyncable) ipChange.ipc$dispatch("bc867b3c", new Object[]{this});
            }
            if (LayoutSyncable.access$getInstance$cp() == null) {
                synchronized (LayoutSyncable.class) {
                    try {
                        if (LayoutSyncable.access$getInstance$cp() == null) {
                            LayoutSyncable.access$setInstance$cp(new LayoutSyncable());
                        }
                        xhv xhvVar = xhv.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            LayoutSyncable access$getInstance$cp = LayoutSyncable.access$getInstance$cp();
            if (access$getInstance$cp != null) {
                return access$getInstance$cp;
            }
            ckf.s();
            throw null;
        }

        public /* synthetic */ Companion(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(552599815);
        t2o.a(552599813);
    }

    public static final /* synthetic */ LayoutSyncable access$getInstance$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LayoutSyncable) ipChange.ipc$dispatch("5182517", new Object[0]);
        }
        return instance;
    }

    public static final /* synthetic */ void access$setInstance$cp(LayoutSyncable layoutSyncable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63ada3b9", new Object[]{layoutSyncable});
        } else {
            instance = layoutSyncable;
        }
    }

    public void doRemoteSingleSync(LayoutRequest layoutRequest, u1a<? super Integer, ? super LayoutResponse, xhv> u1aVar, Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de942e9d", new Object[]{this, layoutRequest, u1aVar, l});
            return;
        }
        ckf.h(layoutRequest, "req");
        ckf.h(u1aVar, "remoteSingleSyncFunc");
    }

    /* renamed from: getBaseTimeStamp  reason: collision with other method in class */
    public final AtomicLong m337getBaseTimeStamp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicLong) ipChange.ipc$dispatch("922cccfc", new Object[]{this}) : this.baseTimeStamp;
    }

    public final AtomicLong getCurLocalAllTimeStamp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicLong) ipChange.ipc$dispatch("5c780695", new Object[]{this});
        }
        return this.curLocalAllTimeStamp;
    }

    /* renamed from: getDefaultTimeStamp  reason: collision with other method in class */
    public final AtomicLong m338getDefaultTimeStamp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicLong) ipChange.ipc$dispatch("1a5355c0", new Object[]{this}) : this.defaultTimeStamp;
    }

    @Override // com.taobao.unit.center.sync.syncable.ISyncable
    public long getLocalAllTimeStamp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("70483625", new Object[]{this})).longValue();
        }
        if (this.curLocalAllTimeStamp.get() == -1) {
            this.curLocalAllTimeStamp = new AtomicLong(SharedPreferencesUtil.getLongSharedPreference(SyncConstant.KEY_LAYOUT_ALL_TIMESTAMP, 0L));
        }
        TLog.loge(SyncConstant.TAG, "localLayoutAllTs is " + this.curLocalAllTimeStamp);
        return this.curLocalAllTimeStamp.get();
    }

    @Override // com.taobao.unit.center.sync.syncable.ISyncable
    public long getLocalIncTimeStamp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3fc1e308", new Object[]{this})).longValue();
        }
        long baseTimeStamp = getBaseTimeStamp();
        long defaultTimeStamp = getDefaultTimeStamp();
        if (baseTimeStamp < defaultTimeStamp) {
            TLog.loge(SyncConstant.TAG, "localLayoutIncTs is " + baseTimeStamp);
            return baseTimeStamp;
        }
        TLog.loge(SyncConstant.TAG, "localLayoutIncTs is " + defaultTimeStamp);
        return defaultTimeStamp;
    }

    public final int getPageSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2822d620", new Object[]{this})).intValue();
        }
        return this.pageSize;
    }

    @Override // com.taobao.unit.center.sync.syncable.ISyncable
    public long getRemoteAllTimeStamp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("94b0ddac", new Object[]{this})).longValue();
        }
        String value = ConfigUtil.getValue(SyncConstant.SYNC_TIMESTAMP_NAMESPACE, SyncConstant.REMOTE_KEY_LAYOUT_ALL_TIMESTAMP, "0");
        TLog.loge(SyncConstant.TAG, "remoteLayoutAllTs is " + value);
        ckf.c(value, "timeStamp");
        return Long.parseLong(value);
    }

    @Override // com.taobao.unit.center.sync.syncable.ISyncable
    public long getRemoteIncTimeStamp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("642a8a8f", new Object[]{this})).longValue();
        }
        String value = ConfigUtil.getValue(SyncConstant.SYNC_TIMESTAMP_NAMESPACE, SyncConstant.REMOTE_KEY_LAYOUT_INC_TIMESTAMP, "1");
        TLog.loge(SyncConstant.TAG, "remoteLayoutIncTs is " + value);
        ckf.c(value, "timeStamp");
        return Long.parseLong(value);
    }

    public final AtomicBoolean isSyncing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("4d0be124", new Object[]{this});
        }
        return this.isSyncing;
    }

    public final void setBaseTimeStamp(AtomicLong atomicLong) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2634206", new Object[]{this, atomicLong});
            return;
        }
        ckf.h(atomicLong, "<set-?>");
        this.baseTimeStamp = atomicLong;
    }

    public final void setCurLocalAllTimeStamp(AtomicLong atomicLong) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76638025", new Object[]{this, atomicLong});
            return;
        }
        ckf.h(atomicLong, "<set-?>");
        this.curLocalAllTimeStamp = atomicLong;
    }

    public final void setDefaultTimeStamp(AtomicLong atomicLong) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("919a7c5a", new Object[]{this, atomicLong});
            return;
        }
        ckf.h(atomicLong, "<set-?>");
        this.defaultTimeStamp = atomicLong;
    }

    @Override // com.taobao.unit.center.sync.syncable.ISyncable
    public void updateLocalAllTimeStamp(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6b0c7e6", new Object[]{this, new Long(j)});
            return;
        }
        TLog.loge(SyncConstant.TAG, "updateLocalLayoutAllTs is " + j);
        this.curLocalAllTimeStamp.set(j);
        SharedPreferencesUtil.addLongSharedPreference(SyncConstant.KEY_LAYOUT_ALL_TIMESTAMP, j);
    }

    @Override // com.taobao.unit.center.sync.syncable.ISyncable
    public void updateLocalIncTimeStamp(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66cb763", new Object[]{this, new Long(j)});
            return;
        }
        TLog.loge(SyncConstant.TAG, "updateLocalLayoutIncTs is " + j);
        if (j == 0) {
            SharedPreferencesUtil.addLongSharedPreference("base_updateTimeV2", 0L);
            this.baseTimeStamp.set(0L);
            SharedPreferencesUtil.addLongSharedPreference("default_updateTimeV2", 0L);
            this.defaultTimeStamp.set(0L);
        }
    }

    public final void updateTimeStamp(HashMap<String, Long> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8c984ff", new Object[]{this, hashMap});
            return;
        }
        ckf.h(hashMap, "timestamps");
        Long l = hashMap.get("base");
        if (l != null) {
            SharedPreferencesUtil.addLongSharedPreference("base_updateTimeV2", l.longValue());
            TLog.loge(SyncConstant.TAG, "update baseTimeStamp is " + l);
            this.baseTimeStamp.set(l.longValue());
        }
        Long l2 = hashMap.get("default");
        if (l2 != null) {
            SharedPreferencesUtil.addLongSharedPreference("default_updateTimeV2", l2.longValue());
            this.defaultTimeStamp.set(l2.longValue());
            TLog.loge(SyncConstant.TAG, "update defaultTimeStamp is " + l2);
        }
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [T, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r6v11, types: [T, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r6v12, types: [T, java.util.HashMap] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void doRemoteSync(com.taobao.unit.center.sync.model.LayoutRequest r6, tb.g1a<? super com.taobao.unit.center.sync.model.LayoutResponse, tb.xhv> r7, java.lang.Long r8) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.unit.center.sync.syncable.LayoutSyncable.doRemoteSync(com.taobao.unit.center.sync.model.LayoutRequest, tb.g1a, java.lang.Long):void");
    }

    public final long getBaseTimeStamp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("477b5e6a", new Object[]{this})).longValue();
        }
        if (this.baseTimeStamp.get() == -1) {
            this.baseTimeStamp = new AtomicLong(SharedPreferencesUtil.getLongSharedPreference("base_updateTimeV2", 0L));
        }
        TLog.loge(SyncConstant.TAG, "baseTimeStamp is " + this.baseTimeStamp);
        return this.baseTimeStamp.get();
    }

    public final long getDefaultTimeStamp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a95d5a26", new Object[]{this})).longValue();
        }
        if (this.defaultTimeStamp.get() == -1) {
            this.defaultTimeStamp = new AtomicLong(SharedPreferencesUtil.getLongSharedPreference("default_updateTimeV2", 0L));
        }
        TLog.loge(SyncConstant.TAG, "defaultTimeStamp is " + this.defaultTimeStamp);
        return this.defaultTimeStamp.get();
    }
}
