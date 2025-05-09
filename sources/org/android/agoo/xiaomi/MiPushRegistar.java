package org.android.agoo.xiaomi;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.agoo.BaseNotifyClickActivity;
import com.xiaomi.mipush.sdk.MiPushClient;
import com.xiaomi.mipush.sdk.MiPushMessage;
import com.xiaomi.mipush.sdk.PushMessageHelper;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class MiPushRegistar {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String BLACKSHARK = "blackshark";
    private static final String REDMI = "redmi";
    private static final String TAG = "MiPushRegistar";
    private static final String XIAOMI = "xiaomi";
    private static final String brand;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class XiaoMiNotifyListener implements BaseNotifyClickActivity.INotifyListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private XiaoMiNotifyListener() {
        }

        @Override // com.taobao.agoo.BaseNotifyClickActivity.INotifyListener
        public String getMsgSource() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("fdc22e73", new Object[]{this});
            }
            return "xiaomi";
        }

        @Override // com.taobao.agoo.BaseNotifyClickActivity.INotifyListener
        public String parseMsgFromIntent(Intent intent) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("1fcbdd08", new Object[]{this, intent});
            }
            try {
                str = ((MiPushMessage) intent.getSerializableExtra(PushMessageHelper.KEY_MESSAGE)).getContent();
            } catch (Exception unused) {
                str = null;
            }
            ALog.i(MiPushRegistar.TAG, "parseMsgFromIntent", "msg", str);
            return str;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "INotifyListener: " + getMsgSource();
        }
    }

    static {
        String str;
        String str2 = Build.BRAND;
        if (TextUtils.isEmpty(str2)) {
            str2 = Build.MANUFACTURER;
        }
        if (str2 == null) {
            str = "";
        } else {
            str = str2.toLowerCase();
        }
        brand = str;
    }

    public static boolean checkDevice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("763e9f09", new Object[0])).booleanValue();
        }
        String str = brand;
        if ("xiaomi".equals(str) || "redmi".equals(str) || BLACKSHARK.equals(str)) {
            return true;
        }
        return false;
    }

    public static void register(Context context, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c2a8da2", new Object[]{context, str, str2, new Boolean(z)});
            return;
        }
        try {
            if (!UtilityImpl.isMainProcess(context)) {
                ALog.e(TAG, "register not in main process, return", new Object[0]);
            } else if (checkDevice() || z) {
                ALog.i(TAG, "register begin", new Object[0]);
                BaseNotifyClickActivity.addNotifyListener(new XiaoMiNotifyListener());
                MiPushClient.registerPush(context, str, str2);
            }
        } catch (Throwable th) {
            ALog.e(TAG, "register", th, new Object[0]);
        }
    }

    public static void unregister(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e70c8265", new Object[]{context});
            return;
        }
        try {
            MiPushClient.unregisterPush(context);
        } catch (Throwable th) {
            ALog.e(TAG, MiPushClient.COMMAND_UNREGISTER, th, new Object[0]);
        }
    }

    public static void register(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0e89372", new Object[]{context, str, str2});
        } else {
            register(context, str, str2, false);
        }
    }
}
