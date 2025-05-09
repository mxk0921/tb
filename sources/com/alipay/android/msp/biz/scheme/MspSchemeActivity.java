package com.alipay.android.msp.biz.scheme;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import com.alipay.android.msp.debug.UpdateTplDebugUtil;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.pay.GlobalConstant;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import tb.acq;
import tb.l2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MspSchemeActivity extends FragmentActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, MspSchemeHandler> f3527a = Collections.synchronizedMap(new LinkedHashMap());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface MspSchemeHandler {
        String getName();

        void handle(Intent intent);

        boolean shouldHandle(Intent intent);
    }

    public static /* synthetic */ Object ipc$super(MspSchemeActivity mspSchemeActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alipay/android/msp/biz/scheme/MspSchemeActivity");
        }
    }

    public static void processHandler(final Intent intent, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c77c609", new Object[]{intent, context});
            return;
        }
        if (GlobalConstant.DEBUG) {
            final Context applicationContext = context.getApplicationContext();
            TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.biz.scheme.MspSchemeActivity.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    Object obj;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Context context2 = applicationContext;
                    StringBuilder sb = new StringBuilder("alipay recv url ");
                    Intent intent2 = intent;
                    if (intent2 != null) {
                        obj = intent2.getData();
                    } else {
                        obj = "null";
                    }
                    sb.append(obj);
                    Toast.makeText(context2, sb.toString(), 0).show();
                }
            });
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, MspSchemeHandler> entry : f3527a.entrySet()) {
            arrayList.add(entry.getValue());
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            MspSchemeHandler mspSchemeHandler = (MspSchemeHandler) it.next();
            try {
                if (mspSchemeHandler.shouldHandle(intent)) {
                    mspSchemeHandler.handle(intent);
                }
            } catch (Throwable th) {
                LogUtil.record(8, "MspSchemeActivity", "error while iter ".concat(String.valueOf(mspSchemeHandler)));
                LogUtil.printExceptionStackTrace(th);
            }
        }
    }

    public static void registerDebugHandler() {
        LogUtil.record(8, "MspSchemeActivity", "registerDebugHandler isDebug:" + GlobalConstant.DEBUG);
        if (GlobalConstant.DEBUG) {
            try {
                IpChange ipChange = UpdateTplDebugUtil.$ipChange;
                UpdateTplDebugUtil.class.getMethod("registerDebugHandler", new Class[0]).invoke(UpdateTplDebugUtil.class, new Object[0]);
            } catch (Throwable th) {
                LogUtil.record(8, "MspSchemeActivity", "registerDebugHandler error");
                LogUtil.printExceptionStackTrace(th);
            }
        }
    }

    public static void registerHandler(MspSchemeHandler mspSchemeHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53fe310a", new Object[]{mspSchemeHandler});
            return;
        }
        String name = mspSchemeHandler.getName();
        if (!TextUtils.isEmpty(name)) {
            f3527a.put(name, mspSchemeHandler);
        }
    }

    public static void unregisterHandler(MspSchemeHandler mspSchemeHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eeecd891", new Object[]{mspSchemeHandler});
            return;
        }
        String name = mspSchemeHandler.getName();
        if (!TextUtils.isEmpty(name)) {
            f3527a.remove(name);
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            GlobalConstant.loadProperties(this);
            registerDebugHandler();
            LogUtil.record(8, "MspSchemeActivity", "registerActiveHandler");
            ActiveSchemeImpl.class.newInstance();
            final Intent intent = getIntent();
            if (intent != null) {
                intent.putExtra(l2o.COL_TASK, getTaskId());
                LogUtil.record(1, "MspSchemeActivity", "got intent " + intent.toUri(1));
                TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.biz.scheme.MspSchemeActivity.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            MspSchemeActivity.processHandler(intent, MspSchemeActivity.this);
                        } catch (Throwable th) {
                            LogUtil.record(8, "MspSchemeActivity", "error while process " + intent);
                            LogUtil.printExceptionStackTrace(th);
                        }
                    }
                });
            }
            finish();
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
            finish();
        }
    }
}
