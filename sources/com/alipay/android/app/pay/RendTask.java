package com.alipay.android.app.pay;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.alipay.android.msp.container.MspContainerResult;
import com.alipay.android.msp.core.MspEngine;
import com.alipay.android.msp.framework.taskscheduler.MspAsyncTask;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.sdk.api.AlipaySDKJSBridge;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class RendTask extends MspAsyncTask<Object, Void, MspContainerResult> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Activity f3480a;
    public OnContainerFinishListener b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface OnContainerFinishListener {
        void onContainerFinish(Context context, String str, String str2);
    }

    public RendTask(Activity activity, OnContainerFinishListener onContainerFinishListener) {
        this.f3480a = activity;
        this.b = onContainerFinishListener;
        LogUtil.record(2, AlipaySDKJSBridge.LOG_TAG, "RendTask.RendTask", "RendTask init");
    }

    public static /* synthetic */ Object ipc$super(RendTask rendTask, String str, Object... objArr) {
        if (str.hashCode() == -1325021319) {
            super.onPostExecute((RendTask) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/app/pay/RendTask");
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        this.f3480a = null;
        this.b = null;
    }

    public void rend(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecac8044", new Object[]{this, str, str2});
        } else {
            execute(str, str2);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.alipay.android.msp.framework.taskscheduler.MspAsyncTask
    public MspContainerResult doInBackground(Object... objArr) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspContainerResult) ipChange.ipc$dispatch("378bc2ff", new Object[]{this, objArr});
        }
        MspContainerResult mspContainerResult = new MspContainerResult();
        if (objArr == null || objArr.length <= 0) {
            mspContainerResult.setErrorCode("101");
            return mspContainerResult;
        }
        Object obj2 = objArr[0];
        String str = "";
        String obj3 = obj2 != null ? obj2.toString() : str;
        if (objArr.length >= 2 && (obj = objArr[1]) != null) {
            str = obj.toString();
        }
        if (TextUtils.isEmpty(obj3)) {
            mspContainerResult.setErrorCode("101");
            return mspContainerResult;
        }
        MspContainerResult mspContainerResult2 = new MspContainerResult();
        Activity activity = this.f3480a;
        return activity == null ? mspContainerResult2 : MspEngine.startContainer(obj3, str, false, activity);
    }

    public void onPostExecute(MspContainerResult mspContainerResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ee79ea6", new Object[]{this, mspContainerResult});
            return;
        }
        super.onPostExecute((RendTask) mspContainerResult);
        if (this.b != null && mspContainerResult != null && !TextUtils.equals("400", mspContainerResult.getErrorCode())) {
            this.b.onContainerFinish(this.f3480a, mspContainerResult.getErrorCode(), mspContainerResult.getBizResult());
        }
    }
}
