package com.taobao.cameralink.miniapp.skincamera;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.content.ContextCompat;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.ariver.integration.embedview.BaseEmbedView;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONObject;
import com.alipay.security.mobile.alipayauthenticatorservice.message.Result;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.WXModule;
import java.util.ArrayList;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class AbsCLBaseEmbedView extends BaseEmbedView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Runnable runnable;

    static {
        t2o.a(394264605);
    }

    public static /* synthetic */ Runnable access$000(AbsCLBaseEmbedView absCLBaseEmbedView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("f479b067", new Object[]{absCLBaseEmbedView});
        }
        return absCLBaseEmbedView.runnable;
    }

    public static /* synthetic */ Runnable access$002(AbsCLBaseEmbedView absCLBaseEmbedView, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("6c1ea7ab", new Object[]{absCLBaseEmbedView, runnable});
        }
        absCLBaseEmbedView.runnable = runnable;
        return runnable;
    }

    public static /* synthetic */ Object ipc$super(AbsCLBaseEmbedView absCLBaseEmbedView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/cameralink/miniapp/skincamera/AbsCLBaseEmbedView");
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class LocalPermissionReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(394264606);
        }

        public LocalPermissionReceiver(Context context) {
        }

        public static /* synthetic */ Object ipc$super(LocalPermissionReceiver localPermissionReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/cameralink/miniapp/skincamera/AbsCLBaseEmbedView$LocalPermissionReceiver");
        }

        public final void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("514cfef7", new Object[]{this});
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("result", (Object) "no_permission");
                AbsCLBaseEmbedView.this.sendEvent("error", jSONObject, null);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            try {
                try {
                    int intExtra = intent.getIntExtra("requestCode", 0);
                    int[] intArrayExtra = intent.getIntArrayExtra(WXModule.GRANT_RESULTS);
                    if (intExtra == 275) {
                        if (intArrayExtra.length <= 0 || intArrayExtra[0] != 0) {
                            a();
                        } else {
                            for (int i : intArrayExtra) {
                                if (i != 0) {
                                    RVLogger.e("LocalPermissionReceiver", "No permission");
                                    a();
                                    return;
                                }
                            }
                            if (AbsCLBaseEmbedView.access$000(AbsCLBaseEmbedView.this) != null) {
                                AbsCLBaseEmbedView.access$000(AbsCLBaseEmbedView.this).run();
                            }
                        }
                    }
                } catch (Exception e) {
                    RVLogger.e("LocalPermissionReceiver", "onReceive e:", e);
                }
            } finally {
                AbsCLBaseEmbedView.access$002(AbsCLBaseEmbedView.this, null);
                LocalBroadcastManager.getInstance(context).unregisterReceiver(this);
            }
        }
    }

    public void requestPermission(Activity activity, Runnable runnable, String... strArr) {
        try {
            this.runnable = runnable;
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                if (ContextCompat.checkSelfPermission(activity, str) != 0) {
                    arrayList.add(str);
                }
            }
            if (arrayList.size() != 0) {
                activity.getClass().getMethod("requestPermissions", String[].class, Integer.TYPE).invoke(activity, (String[]) arrayList.toArray(new String[arrayList.size()]), Integer.valueOf((int) Result.ALIPAY_RSAKEY_MALLOC_FAILED));
                LocalBroadcastManager.getInstance(activity).registerReceiver(new LocalPermissionReceiver(activity), new IntentFilter(WXModule.ACTION_REQUEST_PERMISSIONS_RESULT));
            } else if (runnable != null) {
                runnable.run();
                this.runnable = null;
            }
        } catch (Throwable th) {
            th.printStackTrace();
            this.runnable = null;
        }
    }
}
