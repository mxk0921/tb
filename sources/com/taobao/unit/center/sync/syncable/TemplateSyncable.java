package com.taobao.unit.center.sync.syncable;

import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.util.ConfigUtil;
import com.taobao.message.kit.util.SharedPreferencesUtil;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.unit.center.mtop.sync.MtopTaobaoAlimpBentleyTemplateSyncRequest;
import com.taobao.unit.center.mtop.sync.MtopTaobaoAlimpBentleyTemplateSyncResponse;
import com.taobao.unit.center.sync.constant.SyncConstant;
import com.taobao.unit.center.sync.model.TemplateRequest;
import com.taobao.unit.center.sync.mtop.MtopTaobaoAlimpBentleyTemplateSingleRequest;
import com.taobao.unit.center.sync.mtop.MtopTaobaoAlimpBentleyTemplateSingleResponse;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import org.json.JSONObject;
import tb.a07;
import tb.ckf;
import tb.g1a;
import tb.t2o;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 62\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00016B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u000fJD\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00022!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\r0\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0019JY\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u000226\u0010\u001d\u001a2\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\r0\u001a2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010!\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&R\u0017\u0010+\u001a\u00020*8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-R\u001c\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\"\u00104\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010/\u0012\u0004\u0012\u000203028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00067"}, d2 = {"Lcom/taobao/unit/center/sync/syncable/TemplateSyncable;", "Lcom/taobao/unit/center/sync/syncable/ISyncable;", "Lcom/taobao/unit/center/sync/model/TemplateRequest;", "Lorg/json/JSONObject;", "<init>", "()V", "", "getLocalAllTimeStamp", "()J", "getRemoteAllTimeStamp", "getLocalIncTimeStamp", "getRemoteIncTimeStamp", "timestamp", "Ltb/xhv;", "updateLocalAllTimeStamp", "(J)V", "updateLocalIncTimeStamp", "req", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "response", "remoteSyncSuccessFunc", "allTimeStamp", "doRemoteSync", "(Lcom/taobao/unit/center/sync/model/TemplateRequest;Ltb/g1a;Ljava/lang/Long;)V", "Lkotlin/Function2;", "", "templateId", "remoteSingleSyncFunc", "doRemoteSingleSync", "(Lcom/taobao/unit/center/sync/model/TemplateRequest;Ltb/u1a;Ljava/lang/Long;)V", "Ljava/util/concurrent/atomic/AtomicLong;", "curLocalAllTimeStamp", "Ljava/util/concurrent/atomic/AtomicLong;", "getCurLocalAllTimeStamp", "()Ljava/util/concurrent/atomic/AtomicLong;", "setCurLocalAllTimeStamp", "(Ljava/util/concurrent/atomic/AtomicLong;)V", "curLocalIncTimeStamp", "getCurLocalIncTimeStamp", "setCurLocalIncTimeStamp", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isSyncing", "Ljava/util/concurrent/atomic/AtomicBoolean;", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/HashSet;", "", "taskSet", "Ljava/util/HashSet;", "Ljava/util/HashMap;", "Ljava/lang/Integer;", "taskExcuteCount", "Ljava/util/HashMap;", "Companion", "message_sp_framework_debug"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TemplateSyncable implements ISyncable<TemplateRequest, JSONObject> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Companion Companion = new Companion(null);
    private static TemplateSyncable instance;
    private AtomicLong curLocalAllTimeStamp = new AtomicLong(-1);
    private AtomicLong curLocalIncTimeStamp = new AtomicLong(-1);
    private final AtomicBoolean isSyncing = new AtomicBoolean(false);
    private final HashSet<String> taskSet = new HashSet<>();
    private final HashMap<String, Integer> taskExcuteCount = new HashMap<>();

    /* compiled from: Taobao */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/taobao/unit/center/sync/syncable/TemplateSyncable$Companion;", "", "()V", "instance", "Lcom/taobao/unit/center/sync/syncable/TemplateSyncable;", "getInstance", "message_sp_framework_debug"}, k = 1, mv = {1, 1, 15})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class Companion {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(552599821);
        }

        private Companion() {
        }

        public final TemplateSyncable getInstance() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TemplateSyncable) ipChange.ipc$dispatch("8ddfebec", new Object[]{this});
            }
            if (TemplateSyncable.access$getInstance$cp() == null) {
                synchronized (TemplateSyncable.class) {
                    try {
                        if (TemplateSyncable.access$getInstance$cp() == null) {
                            TemplateSyncable.access$setInstance$cp(new TemplateSyncable());
                        }
                        xhv xhvVar = xhv.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            TemplateSyncable access$getInstance$cp = TemplateSyncable.access$getInstance$cp();
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
        t2o.a(552599820);
        t2o.a(552599813);
    }

    public static final /* synthetic */ TemplateSyncable access$getInstance$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateSyncable) ipChange.ipc$dispatch("f8ae8b07", new Object[0]);
        }
        return instance;
    }

    public static final /* synthetic */ HashSet access$getTaskSet$p(TemplateSyncable templateSyncable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashSet) ipChange.ipc$dispatch("f891918d", new Object[]{templateSyncable});
        }
        return templateSyncable.taskSet;
    }

    public static final /* synthetic */ void access$setInstance$cp(TemplateSyncable templateSyncable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f235dc69", new Object[]{templateSyncable});
        } else {
            instance = templateSyncable;
        }
    }

    public final AtomicLong getCurLocalAllTimeStamp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicLong) ipChange.ipc$dispatch("5c780695", new Object[]{this});
        }
        return this.curLocalAllTimeStamp;
    }

    public final AtomicLong getCurLocalIncTimeStamp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicLong) ipChange.ipc$dispatch("e4417052", new Object[]{this});
        }
        return this.curLocalIncTimeStamp;
    }

    @Override // com.taobao.unit.center.sync.syncable.ISyncable
    public long getLocalAllTimeStamp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("70483625", new Object[]{this})).longValue();
        }
        if (this.curLocalAllTimeStamp.get() == -1) {
            this.curLocalAllTimeStamp = new AtomicLong(SharedPreferencesUtil.getLongSharedPreference(SyncConstant.KEY_TEMPLATE_ALL_TIMESTAMP, 0L));
        }
        TLog.loge(SyncConstant.TAG, "localTemplateAllTs is " + this.curLocalAllTimeStamp);
        return this.curLocalAllTimeStamp.get();
    }

    @Override // com.taobao.unit.center.sync.syncable.ISyncable
    public long getLocalIncTimeStamp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3fc1e308", new Object[]{this})).longValue();
        }
        if (this.curLocalIncTimeStamp.get() == -1) {
            this.curLocalIncTimeStamp = new AtomicLong(SharedPreferencesUtil.getLongSharedPreference(SyncConstant.KEY_TEMPLATE_INC_TIMESTAMP, 0L));
        }
        TLog.loge(SyncConstant.TAG, "localTemplateIncTs is " + this.curLocalIncTimeStamp);
        return this.curLocalIncTimeStamp.get();
    }

    @Override // com.taobao.unit.center.sync.syncable.ISyncable
    public long getRemoteAllTimeStamp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("94b0ddac", new Object[]{this})).longValue();
        }
        String value = ConfigUtil.getValue(SyncConstant.SYNC_TIMESTAMP_NAMESPACE, SyncConstant.REMOTE_KEY_TEMPLATE_ALL_TIMESTAMP, "0");
        TLog.loge(SyncConstant.TAG, "remoteTemplateAllTs is " + value);
        ckf.c(value, "timeStamp");
        return Long.parseLong(value);
    }

    @Override // com.taobao.unit.center.sync.syncable.ISyncable
    public long getRemoteIncTimeStamp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("642a8a8f", new Object[]{this})).longValue();
        }
        String value = ConfigUtil.getValue(SyncConstant.SYNC_TIMESTAMP_NAMESPACE, SyncConstant.REMOTE_KEY_TEMPLATE_INC_TIMESTAMP, "1");
        TLog.loge(SyncConstant.TAG, "remoteTemplateIncTs is " + value);
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

    public final void setCurLocalAllTimeStamp(AtomicLong atomicLong) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76638025", new Object[]{this, atomicLong});
            return;
        }
        ckf.h(atomicLong, "<set-?>");
        this.curLocalAllTimeStamp = atomicLong;
    }

    public final void setCurLocalIncTimeStamp(AtomicLong atomicLong) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7c74e08", new Object[]{this, atomicLong});
            return;
        }
        ckf.h(atomicLong, "<set-?>");
        this.curLocalIncTimeStamp = atomicLong;
    }

    @Override // com.taobao.unit.center.sync.syncable.ISyncable
    public void updateLocalAllTimeStamp(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6b0c7e6", new Object[]{this, new Long(j)});
            return;
        }
        TLog.loge(SyncConstant.TAG, "updateLocalTemplateAllTs is " + j);
        this.curLocalAllTimeStamp.set(j);
        SharedPreferencesUtil.addLongSharedPreference(SyncConstant.KEY_TEMPLATE_ALL_TIMESTAMP, j);
    }

    @Override // com.taobao.unit.center.sync.syncable.ISyncable
    public void updateLocalIncTimeStamp(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66cb763", new Object[]{this, new Long(j)});
            return;
        }
        TLog.loge(SyncConstant.TAG, "updateLocalTemplateIncTs is " + j + ", called stack is " + Log.getStackTraceString(new Throwable()));
        this.curLocalIncTimeStamp.set(j);
        SharedPreferencesUtil.addLongSharedPreference(SyncConstant.KEY_TEMPLATE_INC_TIMESTAMP, j);
    }

    public void doRemoteSingleSync(TemplateRequest templateRequest, u1a<? super Integer, ? super JSONObject, xhv> u1aVar, Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e9e2e6d", new Object[]{this, templateRequest, u1aVar, l});
            return;
        }
        ckf.h(templateRequest, "req");
        ckf.h(u1aVar, "remoteSingleSyncFunc");
        String valueOf = String.valueOf(templateRequest.getTemplateId());
        if (TextUtils.isEmpty(valueOf)) {
            TLog.loge(SyncConstant.TAG, "requestSingleTemplate 空templateId");
            return;
        }
        synchronized (this.taskSet) {
            if (this.taskSet.contains(valueOf)) {
                TLog.loge(SyncConstant.TAG, "requestSingleTemplate 重复请求 templateId=".concat(valueOf));
                return;
            }
            this.taskSet.add(valueOf);
            if (!this.taskExcuteCount.containsKey(valueOf)) {
                this.taskExcuteCount.put(valueOf, new Integer(1));
            } else if (ckf.b(this.taskExcuteCount.get(valueOf), new Integer(1))) {
                this.taskExcuteCount.put(valueOf, new Integer(2));
            } else {
                this.taskSet.remove(valueOf);
                TLog.loge(SyncConstant.TAG, "补偿次数已到达2，不再请求补偿 templateId=".concat(valueOf));
                return;
            }
            xhv xhvVar = xhv.INSTANCE;
            TLog.loge(SyncConstant.TAG, "requestSingleTemplate called with: templateId = [" + valueOf + ']');
            MtopTaobaoAlimpBentleyTemplateSingleRequest mtopTaobaoAlimpBentleyTemplateSingleRequest = new MtopTaobaoAlimpBentleyTemplateSingleRequest();
            mtopTaobaoAlimpBentleyTemplateSingleRequest.setTemplateIds(valueOf);
            RemoteBusiness build = RemoteBusiness.build(ApplicationUtil.getApplication(), mtopTaobaoAlimpBentleyTemplateSingleRequest, ApplicationUtil.getTTID());
            build.registerListener((IRemoteListener) new TemplateSyncable$doRemoteSingleSync$2(this, valueOf, templateRequest, u1aVar));
            build.startRequest(MtopTaobaoAlimpBentleyTemplateSingleResponse.class);
        }
    }

    public void doRemoteSync(TemplateRequest templateRequest, g1a<? super JSONObject, xhv> g1aVar, Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32ffb8b6", new Object[]{this, templateRequest, g1aVar, l});
            return;
        }
        ckf.h(templateRequest, "req");
        ckf.h(g1aVar, "remoteSyncSuccessFunc");
        if (this.isSyncing.get()) {
            TLog.loge(SyncConstant.TAG, "Template syncing");
            return;
        }
        this.isSyncing.set(true);
        MtopTaobaoAlimpBentleyTemplateSyncRequest mtopTaobaoAlimpBentleyTemplateSyncRequest = new MtopTaobaoAlimpBentleyTemplateSyncRequest();
        mtopTaobaoAlimpBentleyTemplateSyncRequest.setCount(templateRequest.getPageSize());
        mtopTaobaoAlimpBentleyTemplateSyncRequest.setTimestamp(getLocalIncTimeStamp());
        mtopTaobaoAlimpBentleyTemplateSyncRequest.setUseNewSyncLogic("true");
        RemoteBusiness.build(ApplicationUtil.getApplication(), mtopTaobaoAlimpBentleyTemplateSyncRequest, ApplicationUtil.getTTID()).registerListener((IRemoteListener) new TemplateSyncable$doRemoteSync$1(this, g1aVar, l)).setBizId(72).startRequest(MtopTaobaoAlimpBentleyTemplateSyncResponse.class);
    }
}
