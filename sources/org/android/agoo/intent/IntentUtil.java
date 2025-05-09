package org.android.agoo.intent;

import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.utl.ALog;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class IntentUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String AGOO_COMMAND = "command";
    private static final String INTENT_FROM_AGOO_COMMAND = ".intent.action.COMMAND";
    private static final String INTENT_FROM_STARTACTIVITY_COMMAND = ".intent.action.startActivity.COMMAND";
    private static final String INTENT_FROM_THIRDPUSH_COMMAND = ".intent.thirdPush.action.COMMAND";
    private static final String TAG = "IntentUtil";

    static {
        t2o.a(343933339);
    }

    public static final Intent createActivityIntent(Context context, String str, Intent intent) {
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("7785cd12", new Object[]{context, str, intent});
        }
        Intent intent2 = null;
        try {
            Intent intent3 = new Intent();
            try {
                intent3.setAction(context.getPackageName() + INTENT_FROM_STARTACTIVITY_COMMAND);
                intent3.setPackage(context.getPackageName());
                intent3.setClassName(context, "com.taobao.agoo.AgooStartActivityService");
                intent3.putExtra("command", str);
                intent3.putExtras(intent.getExtras());
                return intent3;
            } catch (Throwable th2) {
                th = th2;
                intent2 = intent3;
                ALog.w(TAG, "createComandIntent", th, new Object[0]);
                return intent2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static final Intent createComandIntent(Context context, String str) {
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("6be63396", new Object[]{context, str});
        }
        Intent intent = null;
        try {
            Intent intent2 = new Intent();
            try {
                intent2.setAction(context.getPackageName() + INTENT_FROM_AGOO_COMMAND);
                intent2.setPackage(context.getPackageName());
                intent2.putExtra("command", str);
                return intent2;
            } catch (Throwable th2) {
                th = th2;
                intent = intent2;
                ALog.e(TAG, "createComandIntent", th, new Object[0]);
                return intent;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static final Intent createThirdpushComandIntent(Context context, String str) {
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("47bd65bf", new Object[]{context, str});
        }
        Intent intent = null;
        try {
            Intent intent2 = new Intent();
            try {
                intent2.setAction(getThirdPushCommand(context));
                intent2.setPackage(context.getPackageName());
                intent2.putExtra("command", str);
                return intent2;
            } catch (Throwable th2) {
                th = th2;
                intent = intent2;
                ALog.w(TAG, "createComandIntent", th, new Object[0]);
                return intent;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static final String getAgooCommand(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("66c5960e", new Object[]{context});
        }
        if (context == null) {
            return null;
        }
        try {
            return context.getPackageName() + INTENT_FROM_AGOO_COMMAND;
        } catch (Throwable th) {
            ALog.w(TAG, "getAgooCommand", th, new Object[0]);
            return null;
        }
    }

    public static final String getThirdPushCommand(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("960a9fff", new Object[]{context});
        }
        if (context == null) {
            return null;
        }
        try {
            return context.getPackageName() + INTENT_FROM_THIRDPUSH_COMMAND;
        } catch (Throwable th) {
            ALog.w(TAG, "getAgooCommand", th, new Object[0]);
            return null;
        }
    }
}
