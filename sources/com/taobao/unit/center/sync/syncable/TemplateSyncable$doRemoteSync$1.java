package com.taobao.unit.center.sync.syncable;

import android.util.Log;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.security.realidentity.o;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.threadpool.BaseRunnable;
import com.taobao.message.kit.threadpool.Coordinator;
import com.taobao.message.lab.comfrm.support.Monitor;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.unit.center.sync.constant.SyncConstant;
import kotlin.Metadata;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONObject;
import tb.ckf;
import tb.g1a;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ5\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\n¨\u0006\u0010"}, d2 = {"com/taobao/unit/center/sync/syncable/TemplateSyncable$doRemoteSync$1", "Lcom/taobao/tao/remotebusiness/IRemoteBaseListener;", "", "requestType", "Lmtopsdk/mtop/domain/MtopResponse;", "mtopResponse", "", o.b, "Ltb/xhv;", "onSystemError", "(ILmtopsdk/mtop/domain/MtopResponse;Ljava/lang/Object;)V", "Lmtopsdk/mtop/domain/BaseOutDo;", "baseOutDo", "onSuccess", "(ILmtopsdk/mtop/domain/MtopResponse;Lmtopsdk/mtop/domain/BaseOutDo;Ljava/lang/Object;)V", "onError", "message_sp_framework_debug"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TemplateSyncable$doRemoteSync$1 implements IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Long $allTimeStamp;
    public final /* synthetic */ g1a $remoteSyncSuccessFunc;
    public final /* synthetic */ TemplateSyncable this$0;

    public TemplateSyncable$doRemoteSync$1(TemplateSyncable templateSyncable, g1a g1aVar, Long l) {
        this.this$0 = templateSyncable;
        this.$remoteSyncSuccessFunc = g1aVar;
        this.$allTimeStamp = l;
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, final MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            return;
        }
        TLog.loge(SyncConstant.TAG, "Template onSuccess() called with: requestType = [" + i + "], mtopResponse = [" + mtopResponse + "], baseOutDo = [" + baseOutDo + "], o = [" + obj + ']');
        Coordinator.doBackGroundTask(new BaseRunnable() { // from class: com.taobao.unit.center.sync.syncable.TemplateSyncable$doRemoteSync$1$onSuccess$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(TemplateSyncable$doRemoteSync$1$onSuccess$1 templateSyncable$doRemoteSync$1$onSuccess$1, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/unit/center/sync/syncable/TemplateSyncable$doRemoteSync$1$onSuccess$1");
            }

            @Override // com.taobao.message.kit.threadpool.BaseRunnable
            public void execute() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e48bb97c", new Object[]{this});
                    return;
                }
                try {
                    MtopResponse mtopResponse2 = mtopResponse;
                    JSONObject dataJsonObject = mtopResponse2 != null ? mtopResponse2.getDataJsonObject() : null;
                    if (dataJsonObject != null) {
                        TemplateSyncable$doRemoteSync$1.this.$remoteSyncSuccessFunc.invoke(dataJsonObject);
                        if (TemplateSyncable$doRemoteSync$1.this.$allTimeStamp != null && TemplateSyncable$doRemoteSync$1.this.$allTimeStamp.longValue() > -1) {
                            TemplateSyncable$doRemoteSync$1 templateSyncable$doRemoteSync$1 = TemplateSyncable$doRemoteSync$1.this;
                            templateSyncable$doRemoteSync$1.this$0.updateLocalAllTimeStamp(templateSyncable$doRemoteSync$1.$allTimeStamp.longValue());
                        }
                    }
                    AppMonitor.Alarm.commitSuccess(Monitor.MODULE_COMFRM, "syncTemplateInfo");
                    TemplateSyncable$doRemoteSync$1.this.this$0.isSyncing().compareAndSet(true, false);
                } catch (Throwable th) {
                    TLog.loge(SyncConstant.TAG, Log.getStackTraceString(th));
                    TemplateSyncable$doRemoteSync$1.this.this$0.isSyncing().set(false);
                }
            }
        });
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        ckf.h(mtopResponse, "mtopResponse");
        TLog.loge(SyncConstant.TAG, "Template onError() called with: requestType = [" + i + "], mtopResponse = [" + mtopResponse + "], o = [" + obj + ']');
        this.this$0.isSyncing().set(false);
        AppMonitor.Alarm.commitFail(Monitor.MODULE_COMFRM, "syncTemplateInfo", mtopResponse.getRetCode(), mtopResponse.getRetMsg());
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        TLog.loge(SyncConstant.TAG, "Template onSystemError() called with: requestType = [" + i + "], mtopResponse = [" + mtopResponse + "], o = [" + obj + ']');
        String str = null;
        String retCode = mtopResponse != null ? mtopResponse.getRetCode() : null;
        if (mtopResponse != null) {
            str = mtopResponse.getRetMsg();
        }
        AppMonitor.Alarm.commitFail(Monitor.MODULE_COMFRM, "syncTemplateInfo", retCode, str);
        this.this$0.isSyncing().set(false);
    }
}
