package com.alipay.android.msp.ui.views;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.SparseArray;
import android.view.MotionEvent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.ui.base.OnResultReceived;
import com.alipay.android.msp.ui.contracts.MspBaseContract;
import com.alipay.android.msp.ui.contracts.MspBaseContract.IPresenter;
import com.alipay.android.msp.ui.widget.MspDialogButton;
import com.alipay.android.msp.ui.widget.dialog.FlybirdDialogEventDesc;
import com.alipay.android.msp.ui.widget.dialog.FlybirdDialogImpl;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class MspBaseActivity<T extends MspBaseContract.IPresenter<? extends MspBaseContract.IView>> extends AbsActivity implements MspBaseContract.IView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_ID = "CallingPid";
    public int mBizId;
    public OnResultReceived mOnOutJumpResume;
    public OnResultReceived mOnResultReceived;
    public T mPresenter;
    private SparseArray<ResultCallback> nc = new SparseArray<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface ResultCallback {
        void onResult(Bundle bundle);
    }

    public static /* synthetic */ Object ipc$super(MspBaseActivity mspBaseActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 782036510:
                return new Boolean(super.shouldShowRequestPermissionRationale((String) objArr[0]));
            case 797441118:
                super.onPause();
                return null;
            case 885118356:
                super.finishAndRemoveTask();
                return null;
            case 1150324634:
                super.finish();
                return null;
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
                return null;
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/ui/views/MspBaseActivity");
        }
    }

    public abstract T createPresenter();

    public void dismissDefaultLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d86216ec", new Object[]{this});
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        try {
            if ((2 & motionEvent.getFlags()) != 0) {
                z = true;
            }
            MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(this.mBizId);
            if (z && mspContextByBizId != null) {
                LogUtil.i(getClass().getSimpleName(), "dispatchTouchEvent", "ObscuredTouch true");
                mspContextByBizId.setObscuredTouch(true);
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        super.finish();
        LogUtil.i(getClass().getSimpleName(), "finish", toString());
    }

    @Override // android.app.Activity
    public void finishAndRemoveTask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34c1d594", new Object[]{this});
            return;
        }
        super.finishAndRemoveTask();
        LogUtil.i(getClass().getSimpleName(), "finishAndRemoveTask", toString());
    }

    public T getPresenter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((MspBaseContract.IPresenter) ipChange.ipc$dispatch("f11e74c9", new Object[]{this}));
        }
        return this.mPresenter;
    }

    public boolean hasSelfPermission(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cfb6904a", new Object[]{this, str})).booleanValue();
        }
        if (checkPermission(str, Process.myPid(), Process.myUid()) == 0) {
            return true;
        }
        return false;
    }

    @Override // com.alipay.android.msp.ui.views.AbsActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        LogUtil.i(getClass().getSimpleName(), "onCreate", toString());
        T createPresenter = createPresenter();
        this.mPresenter = createPresenter;
        if (createPresenter != null) {
            createPresenter.attachIView(this);
        }
        Intent intent = new Intent(MspGlobalDefine.EVENT_MSP_ACTIVITY_STARTED);
        intent.putExtra("bizId", this.mBizId);
        LocalBroadcastManager.getInstance(getApplicationContext()).sendBroadcast(intent);
    }

    @Override // com.alipay.android.msp.ui.views.AbsActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        LogUtil.i(getClass().getSimpleName(), "onDestroy", toString());
        T t = this.mPresenter;
        if (t != null) {
            t.detachIView();
            this.mPresenter = null;
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        super.onNewIntent(intent);
        LogUtil.i(getClass().getSimpleName(), "onNewIntent", toString());
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        LogUtil.i(getClass().getSimpleName(), "onPause", toString());
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        int i2;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e85742", new Object[]{this, new Integer(i), strArr, iArr});
            return;
        }
        ResultCallback resultCallback = this.nc.get(i);
        this.nc.delete(i);
        if (strArr.length > iArr.length) {
            i2 = iArr.length;
        } else {
            i2 = strArr.length;
        }
        Bundle bundle = new Bundle();
        for (int i3 = 0; i3 < i2; i3++) {
            String str = strArr[i3];
            if (iArr[i3] == 0) {
                z = true;
            } else {
                z = false;
            }
            bundle.putBoolean(str, z);
        }
        if (resultCallback != null) {
            resultCallback.onResult(bundle);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        LogUtil.i(getClass().getSimpleName(), "onResume", toString());
        OnResultReceived onResultReceived = this.mOnResultReceived;
        if (onResultReceived != null) {
            onResultReceived.onReceiveResult("");
            this.mOnResultReceived = null;
        }
        OnResultReceived onResultReceived2 = this.mOnOutJumpResume;
        if (onResultReceived2 != null) {
            onResultReceived2.onReceiveResult("");
            this.mOnOutJumpResume = null;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        LogUtil.i(getClass().getSimpleName(), "onStop", toString());
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IView
    public void openActivity(final Intent intent, OnResultReceived onResultReceived) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67402bc8", new Object[]{this, intent, onResultReceived});
            return;
        }
        try {
            String simpleName = getClass().getSimpleName();
            StringBuilder sb = new StringBuilder();
            sb.append(toString());
            sb.append(" data=");
            if (intent == null) {
                str = "null";
            } else {
                str = intent.getDataString();
            }
            sb.append(str);
            LogUtil.i(simpleName, "openActivity", sb.toString());
            if (onResultReceived != null) {
                this.mOnResultReceived = onResultReceived;
                TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.ui.views.MspBaseActivity.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            MspBaseActivity.this.startActivityForResult(intent, 0);
                        }
                    }
                });
                return;
            }
            TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.ui.views.MspBaseActivity.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        MspBaseActivity.this.startActivity(intent);
                    }
                }
            });
        } catch (Throwable th) {
            MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(this.mBizId);
            if (mspContextByBizId != null) {
                mspContextByBizId.getStatisticInfo().addError(ErrorType.DEFAULT, th.getClass().getName(), th);
            }
            LogUtil.printExceptionStackTrace(th);
        }
    }

    public void requestPermissions(final String[] strArr, final ResultCallback resultCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93628316", new Object[]{this, strArr, resultCallback});
        } else if (Build.VERSION.SDK_INT >= 23) {
            int identityHashCode = System.identityHashCode(resultCallback);
            this.nc.put(identityHashCode, resultCallback);
            requestPermissions(strArr, identityHashCode);
        } else {
            TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.ui.views.MspBaseActivity.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    String[] strArr2;
                    boolean z;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Bundle bundle = new Bundle();
                    for (String str : strArr) {
                        if (MspBaseActivity.this.checkPermission(str, Process.myPid(), Process.myUid()) == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        bundle.putBoolean(str, z);
                    }
                    ResultCallback resultCallback2 = resultCallback;
                    if (resultCallback2 != null) {
                        resultCallback2.onResult(bundle);
                    }
                }
            });
        }
    }

    public void setOnOutJumpResume(OnResultReceived onResultReceived) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72284d36", new Object[]{this, onResultReceived});
        } else {
            this.mOnOutJumpResume = onResultReceived;
        }
    }

    @Override // android.app.Activity
    public boolean shouldShowRequestPermissionRationale(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e9cee1e", new Object[]{this, str})).booleanValue();
        }
        if (Build.VERSION.SDK_INT < 23 || !super.shouldShowRequestPermissionRationale(str)) {
            return false;
        }
        return true;
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IView
    public void showCustomOptDialog(String str, String str2, List<FlybirdDialogEventDesc> list) {
        Activity activity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b81c9ab9", new Object[]{this, str, str2, list});
        } else if (!isFinishing()) {
            stopLoadingView();
            removeMaskView();
            if (PhoneCashierMspEngine.getMspViSec().getVidTopActivity() != null) {
                activity = PhoneCashierMspEngine.getMspViSec().getVidTopActivity();
            } else {
                activity = this;
            }
            FlybirdDialogImpl.showDialog(activity, str, str2, list);
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IView
    public void showDialogView(String str, String str2, List<MspDialogButton> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("243919f6", new Object[]{this, str, str2, list});
            return;
        }
        String simpleName = getClass().getSimpleName();
        LogUtil.d(simpleName, "showDialogView", toString() + " " + str2);
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IView
    public void showLoadingView(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("272661f4", new Object[]{this, strArr});
        } else {
            LogUtil.d(getClass().getSimpleName(), "showLoadingView", toString());
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IView
    public void showToastView(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("772525fa", new Object[]{this, str, str2, new Long(j)});
            return;
        }
        String simpleName = getClass().getSimpleName();
        LogUtil.d(simpleName, "showToastView", toString() + " " + str);
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IView
    public void stopLoadingView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186899a6", new Object[]{this});
        } else {
            LogUtil.d(getClass().getSimpleName(), "stopLoadingView", toString());
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IView
    public boolean openUrl(String str, OnResultReceived onResultReceived) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a04f493", new Object[]{this, str, onResultReceived})).booleanValue();
        }
        this.mOnResultReceived = onResultReceived;
        String simpleName = getClass().getSimpleName();
        LogUtil.i(simpleName, "openUrl", toString() + " url=" + str);
        try {
            return PhoneCashierMspEngine.getMspJump().processUrl(this, str);
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
            MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(this.mBizId);
            if (mspContextByBizId == null) {
                return false;
            }
            mspContextByBizId.getStatisticInfo().addError(ErrorType.DEFAULT, "openUrlFail", e);
            return false;
        }
    }
}
