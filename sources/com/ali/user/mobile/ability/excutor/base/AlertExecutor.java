package com.ali.user.mobile.ability.excutor.base;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import com.ali.user.mobile.ability.excutor.BaseExecutor;
import com.ali.user.mobile.ability.excutor.ExecutorContext;
import com.ali.user.mobile.ability.excutor.ExecutorParams;
import com.ali.user.mobile.ability.excutor.ExecutorResult;
import com.ali.user.mobile.callback.DataCallback;
import com.ali.user.mobile.helper.DialogHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AlertExecutor extends BaseExecutor<AlertExecutorParams> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class AlertExecutorParams extends ExecutorParams {
        public String leftButtonTitle;
        public String message;
        public String rightButtonTitle;
        public String title;

        static {
            t2o.a(69206040);
        }
    }

    static {
        t2o.a(69206037);
    }

    public static /* synthetic */ Object ipc$super(AlertExecutor alertExecutor, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/ability/excutor/base/AlertExecutor");
    }

    @Override // com.ali.user.mobile.ability.excutor.BaseExecutor
    public /* bridge */ /* synthetic */ void asyncExecute(ExecutorContext executorContext, AlertExecutorParams alertExecutorParams, DataCallback dataCallback) {
        asyncExecute2(executorContext, alertExecutorParams, (DataCallback<ExecutorResult>) dataCallback);
    }

    public void buildResult(int i, ExecutorContext executorContext, DataCallback<ExecutorResult> dataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29721df2", new Object[]{this, new Integer(i), executorContext, dataCallback});
        } else if (dataCallback != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("btnClickIndex", Integer.valueOf(i));
            dataCallback.result(ExecutorResult.buildSuccess(executorContext, hashMap));
        }
    }

    /* renamed from: asyncExecute  reason: avoid collision after fix types in other method */
    public void asyncExecute2(final ExecutorContext executorContext, AlertExecutorParams alertExecutorParams, final DataCallback<ExecutorResult> dataCallback) {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc54a69e", new Object[]{this, executorContext, alertExecutorParams, dataCallback});
        } else if (executorContext != null && (context = executorContext.context) != null && (context instanceof Activity) && alertExecutorParams != null) {
            new DialogHelper((Activity) context).alert(alertExecutorParams.title, alertExecutorParams.message, alertExecutorParams.rightButtonTitle, new DialogInterface.OnClickListener() { // from class: com.ali.user.mobile.ability.excutor.base.AlertExecutor.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    } else {
                        AlertExecutor.this.buildResult(1, executorContext, dataCallback);
                    }
                }
            }, alertExecutorParams.leftButtonTitle, new DialogInterface.OnClickListener() { // from class: com.ali.user.mobile.ability.excutor.base.AlertExecutor.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    } else {
                        AlertExecutor.this.buildResult(0, executorContext, dataCallback);
                    }
                }
            });
        } else if (dataCallback != null) {
            dataCallback.result(ExecutorResult.buildError(executorContext, null, 3002, ""));
        }
    }
}
