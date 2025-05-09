package com.alipay.android.msp.drivers.stores.store.events;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.core.callback.ImageUploadCallback;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.actions.InvokeActionPlugin;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.ui.views.MspBaseActivity;
import com.alipay.android.msp.ui.widget.MspDialogButton;
import com.alipay.android.msp.ui.widget.dialog.FlybirdDialogEventDesc;
import com.alipay.android.msp.utils.BitmapUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.Utils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBDocument;
import com.taobao.taobao.R;
import com.taobao.umipublish.draft.DraftManager;
import java.util.ArrayList;
import tb.vqx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class SnapShotStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public MspBaseActivity b;

    /* renamed from: a  reason: collision with root package name */
    public final String[] f3577a = {"android.permission.WRITE_EXTERNAL_STORAGE"};
    public boolean c = true;
    public boolean d = false;
    public String e = "";

    public SnapShotStore(int i) {
        super(i);
    }

    public static /* synthetic */ String[] access$000(SnapShotStore snapShotStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("345c5063", new Object[]{snapShotStore});
        }
        return snapShotStore.f3577a;
    }

    public static /* synthetic */ void access$100(SnapShotStore snapShotStore, boolean z, EventAction eventAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b949470", new Object[]{snapShotStore, new Boolean(z), eventAction});
        } else {
            snapShotStore.d(z, eventAction);
        }
    }

    public static /* synthetic */ void access$200(SnapShotStore snapShotStore, EventAction eventAction, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50d00e0d", new Object[]{snapShotStore, eventAction, new Boolean(z)});
            return;
        }
        g(eventAction, false);
        if (z) {
            TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.drivers.stores.store.events.SnapShotStore.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        ArrayList arrayList = new ArrayList(1);
                        arrayList.add(new MspDialogButton(SnapShotStore.access$300(SnapShotStore.this).getString(R.string.msp_btn_ok), new EventAction("dismiss")));
                        SnapShotStore.access$300(SnapShotStore.this).showDialogView(null, SnapShotStore.access$300(SnapShotStore.this).getString(R.string.msp_snapshot_no_permission), arrayList);
                    } catch (Throwable th) {
                        LogUtil.printExceptionStackTrace(th);
                    }
                }
            });
        }
    }

    public static /* synthetic */ MspBaseActivity access$300(SnapShotStore snapShotStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspBaseActivity) ipChange.ipc$dispatch("74ced3be", new Object[]{snapShotStore});
        }
        return snapShotStore.b;
    }

    public static /* synthetic */ String access$400(SnapShotStore snapShotStore, Bitmap bitmap) {
        MspContext mspContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5a4d13ca", new Object[]{snapShotStore, bitmap});
        }
        String saveBitmap = BitmapUtil.saveBitmap(snapShotStore.mContext, bitmap, "snapshot_".concat(String.valueOf((System.currentTimeMillis() / 1000) + ".jpg")));
        if (saveBitmap == null && (mspContext = snapShotStore.mMspContext) != null) {
            mspContext.getStatisticInfo().addError(ErrorType.DEFAULT, "save_image_failed", "saveSnapshotBitmap");
        }
        return saveBitmap;
    }

    public static /* synthetic */ void access$500(SnapShotStore snapShotStore, EventAction eventAction, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a65f4ea", new Object[]{snapShotStore, eventAction, new Boolean(z)});
        } else {
            snapShotStore.f(eventAction, z);
        }
    }

    public static /* synthetic */ void access$600(SnapShotStore snapShotStore, EventAction eventAction, final String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4f2d8bf", new Object[]{snapShotStore, eventAction, str, new Boolean(z)});
            return;
        }
        g(eventAction, true);
        if (z) {
            TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.drivers.stores.store.events.SnapShotStore.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        ArrayList arrayList = new ArrayList(1);
                        arrayList.add(new MspDialogButton(SnapShotStore.access$300(SnapShotStore.this).getString(R.string.msp_btn_ok), new EventAction("dismiss")));
                        SnapShotStore.access$300(SnapShotStore.this).showDialogView(null, String.format(SnapShotStore.access$300(SnapShotStore.this).getString(R.string.msp_snapshot_success), str), arrayList);
                    } catch (Throwable th) {
                        LogUtil.printExceptionStackTrace(th);
                    }
                }
            });
        }
    }

    public static void g(EventAction eventAction, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c6236b9", new Object[]{eventAction, new Boolean(z)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (z) {
            str = "1";
        } else {
            str = "0";
        }
        jSONObject.put("result", (Object) str);
        Utils.sendToDocument(eventAction, jSONObject.toJSONString());
    }

    public static /* synthetic */ Object ipc$super(SnapShotStore snapShotStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/events/SnapShotStore");
    }

    public final void b(final EventAction eventAction, final Bitmap bitmap, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9a9629f", new Object[]{this, eventAction, bitmap, new Boolean(z)});
        } else {
            TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.drivers.stores.store.events.SnapShotStore.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    String access$400 = SnapShotStore.access$400(SnapShotStore.this, bitmap);
                    if (TextUtils.isEmpty(access$400)) {
                        SnapShotStore.access$500(SnapShotStore.this, eventAction, z);
                    } else {
                        SnapShotStore.access$600(SnapShotStore.this, eventAction, access$400, z);
                    }
                }
            });
        }
    }

    public final void c(EventAction eventAction, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6288087b", new Object[]{this, eventAction, new Boolean(z)});
            return;
        }
        try {
            View decorView = this.b.getWindow().getDecorView();
            Rect rect = new Rect();
            decorView.getWindowVisibleDisplayFrame(rect);
            Bitmap createBitmap = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(0.0f, -rect.top);
            decorView.draw(canvas);
            if (createBitmap == null) {
                f(eventAction, z);
            } else {
                b(eventAction, createBitmap, z);
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    public final void d(boolean z, final EventAction eventAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("107e867d", new Object[]{this, new Boolean(z), eventAction});
        } else if (this.b.isFinishing()) {
        } else {
            if (TextUtils.isEmpty(this.e)) {
                c(eventAction, z);
            } else {
                e(z, eventAction, new ImageUploadCallback() { // from class: com.alipay.android.msp.drivers.stores.store.events.SnapShotStore.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alipay.android.msp.core.callback.ImageUploadCallback
                    public void onError(Exception exc) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("b14ba516", new Object[]{this, exc});
                        }
                    }

                    @Override // com.alipay.android.msp.core.callback.ImageUploadCallback
                    public void onSuccess(String str) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("37d948b5", new Object[]{this, str});
                            return;
                        }
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("cloudId", (Object) str);
                        Utils.sendToDocument(eventAction, jSONObject.toJSONString());
                    }
                });
            }
        }
    }

    public final void e(boolean z, EventAction eventAction, ImageUploadCallback imageUploadCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd3ef141", new Object[]{this, new Boolean(z), eventAction, imageUploadCallback});
            return;
        }
        FBDocument invokeDoc = eventAction.getInvokeDoc();
        if (invokeDoc != null) {
            try {
                Bitmap viewBitmap = Utils.getViewBitmap(invokeDoc.queryView(this.e));
                if (viewBitmap != null) {
                    if (this.c) {
                        b(eventAction, viewBitmap, z);
                    }
                    if (this.d) {
                        PhoneCashierMspEngine.getMspWallet().uploadBitmap(viewBitmap, "portal_xvk2np", imageUploadCallback);
                    }
                }
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        }
    }

    public final void f(EventAction eventAction, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef751f9a", new Object[]{this, eventAction, new Boolean(z)});
            return;
        }
        g(eventAction, false);
        if (z) {
            TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.drivers.stores.store.events.SnapShotStore.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        ArrayList arrayList = new ArrayList(1);
                        arrayList.add(new MspDialogButton(SnapShotStore.access$300(SnapShotStore.this).getString(R.string.msp_btn_ok), new EventAction("dismiss")));
                        SnapShotStore.access$300(SnapShotStore.this).showDialogView(null, SnapShotStore.access$300(SnapShotStore.this).getString(R.string.msp_snapshot_failed), arrayList);
                    } catch (Throwable th) {
                        LogUtil.printExceptionStackTrace(th);
                    }
                }
            });
        }
    }

    /* JADX WARN: Finally extract failed */
    public final Bitmap a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("99351448", new Object[]{this, view});
        }
        boolean isDrawingCacheEnabled = view.isDrawingCacheEnabled();
        int drawingCacheQuality = view.getDrawingCacheQuality();
        try {
            view.setDrawingCacheEnabled(true);
            view.setDrawingCacheQuality(1048576);
            Bitmap drawingCache = view.getDrawingCache();
            view.setDrawingCacheEnabled(isDrawingCacheEnabled);
            view.setDrawingCacheQuality(drawingCacheQuality);
            return drawingCache;
        } catch (Throwable th) {
            try {
                LogUtil.printExceptionStackTrace(th);
                MspContext mspContext = this.mMspContext;
                if (mspContext != null) {
                    mspContext.getStatisticInfo().addError(ErrorType.DEFAULT, "snapshot_err", th);
                }
                view.setDrawingCacheEnabled(isDrawingCacheEnabled);
                view.setDrawingCacheQuality(drawingCacheQuality);
                return null;
            } catch (Throwable th2) {
                view.setDrawingCacheEnabled(isDrawingCacheEnabled);
                view.setDrawingCacheQuality(drawingCacheQuality);
                throw th2;
            }
        }
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(final EventAction eventAction, EventAction.MspEvent mspEvent) {
        MspBasePresenter mspBasePresenter;
        final boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        MspContext mspContext = this.mMspContext;
        if (mspContext == null || (mspBasePresenter = mspContext.getMspBasePresenter()) == null || mspBasePresenter.getIView() == null) {
            return null;
        }
        try {
            this.b = (MspBaseActivity) mspBasePresenter.getIView();
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        if (this.b == null) {
            return null;
        }
        JSONObject actionParamsJson = mspEvent.getActionParamsJson();
        this.e = "";
        this.d = false;
        this.c = true;
        if (actionParamsJson != null) {
            try {
                z = true ^ TextUtils.equals(actionParamsJson.getString(vqx.HUMMER_FOUNDATION_SHOW_ALERT), "false");
            } catch (Throwable th2) {
                LogUtil.printExceptionStackTrace(th2);
                MspContext mspContext2 = this.mMspContext;
                if (!(mspContext2 == null || actionParamsJson == null)) {
                    mspContext2.getStatisticInfo().addError(ErrorType.DEFAULT, "json_error", "params: ".concat(String.valueOf(actionParamsJson)));
                }
                return "";
            }
        }
        if (actionParamsJson != null && actionParamsJson.containsKey(DraftManager.ACTION_TYPE_SAVE)) {
            this.c = actionParamsJson.getBooleanValue(DraftManager.ACTION_TYPE_SAVE);
        }
        if (actionParamsJson != null && actionParamsJson.containsKey("upload")) {
            this.d = actionParamsJson.getBoolean("upload").booleanValue();
        }
        if (actionParamsJson != null && actionParamsJson.containsKey("selector")) {
            this.e = actionParamsJson.getString("selector");
        }
        if (this.b.shouldShowRequestPermissionRationale(this.f3577a[0]) && this.c) {
            TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.drivers.stores.store.events.SnapShotStore.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        ArrayList arrayList = new ArrayList(1);
                        arrayList.add(new FlybirdDialogEventDesc(SnapShotStore.access$300(SnapShotStore.this).getString(R.string.msp_btn_ok), null));
                        SnapShotStore.access$300(SnapShotStore.this).showCustomOptDialog(null, SnapShotStore.access$300(SnapShotStore.this).getString(R.string.msp_snapshot_permission_deny), arrayList);
                    } catch (Throwable th3) {
                        LogUtil.printExceptionStackTrace(th3);
                    }
                }
            });
            return "";
        } else if (this.b.hasSelfPermission(this.f3577a[0]) || !this.c || Build.VERSION.SDK_INT >= 29) {
            d(z, eventAction);
            return InvokeActionPlugin.AYSNC_CALLBACK;
        } else {
            this.b.requestPermissions(this.f3577a, new MspBaseActivity.ResultCallback() { // from class: com.alipay.android.msp.drivers.stores.store.events.SnapShotStore.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.android.msp.ui.views.MspBaseActivity.ResultCallback
                public void onResult(Bundle bundle) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f4d1d691", new Object[]{this, bundle});
                    } else if (bundle.getBoolean(SnapShotStore.access$000(SnapShotStore.this)[0], false)) {
                        SnapShotStore.access$100(SnapShotStore.this, z, eventAction);
                    } else {
                        SnapShotStore.access$200(SnapShotStore.this, eventAction, z);
                    }
                }
            });
            return InvokeActionPlugin.AYSNC_CALLBACK;
        }
    }
}
