package org.android.agoo.mezu;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.PushManager;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.agoo.BaseNotifyClickActivity;
import org.android.agoo.common.AgooConstants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class MeizuRegister {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "MeizuPush";
    private static Context mContext;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class MeizuMsgParseImpl implements BaseNotifyClickActivity.INotifyListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.agoo.BaseNotifyClickActivity.INotifyListener
        public String getMsgSource() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("fdc22e73", new Object[]{this});
            }
            return "meizu";
        }

        @Override // com.taobao.agoo.BaseNotifyClickActivity.INotifyListener
        public String parseMsgFromIntent(Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("1fcbdd08", new Object[]{this, intent});
            }
            String str = null;
            if (intent == null) {
                ALog.e(MeizuRegister.TAG, "parseMsgFromIntent null", new Object[0]);
                return null;
            }
            try {
                str = intent.getStringExtra(AgooConstants.MESSAGE_MEIZU_PAYLOAD);
                ALog.i(MeizuRegister.TAG, "parseMsgFromIntent", "msg", str);
                return str;
            } catch (Throwable th) {
                ALog.e(MeizuRegister.TAG, "parseMsgFromIntent", th, new Object[0]);
                return str;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
        return android.os.SystemProperties.get("ro.product.other.brand").equalsIgnoreCase("Unisoc");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean checkDevice(android.content.Context r4) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = org.android.agoo.mezu.MeizuRegister.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0019
            java.lang.String r3 = "f20f6c67"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r4
            java.lang.Object r4 = r2.ipc$dispatch(r3, r1)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
        L_0x0019:
            java.lang.String r2 = "ro.meizu.product.model"
            java.lang.String r2 = android.os.SystemProperties.get(r2)     // Catch: all -> 0x003a
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: all -> 0x003a
            if (r2 == 0) goto L_0x003c
            java.lang.String r2 = "meizu"
            java.lang.String r3 = android.os.Build.BRAND     // Catch: all -> 0x003a
            boolean r2 = r2.equalsIgnoreCase(r3)     // Catch: all -> 0x003a
            if (r2 != 0) goto L_0x003c
            java.lang.String r2 = "22c4185e"
            boolean r2 = r2.equalsIgnoreCase(r3)     // Catch: all -> 0x003a
            if (r2 == 0) goto L_0x0038
            goto L_0x003c
        L_0x0038:
            r1 = 0
            goto L_0x003c
        L_0x003a:
            r1 = move-exception
            goto L_0x004b
        L_0x003c:
            if (r1 != 0) goto L_0x004a
            java.lang.String r1 = "ro.product.other.brand"
            java.lang.String r1 = android.os.SystemProperties.get(r1)     // Catch: all -> 0x003a
            java.lang.String r2 = "Unisoc"
            boolean r1 = r1.equalsIgnoreCase(r2)     // Catch: all -> 0x003a
        L_0x004a:
            return r1
        L_0x004b:
            java.lang.String r2 = "checkDevice"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r3 = "MeizuPush"
            com.taobao.accs.utl.ALog.e(r3, r2, r1, r0)
            boolean r4 = com.meizu.cloud.pushsdk.util.MzSystemUtils.isBrandMeizu(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.android.agoo.mezu.MeizuRegister.checkDevice(android.content.Context):boolean");
    }

    public static void register(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0e89372", new Object[]{context, str, str2});
        } else if (context != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                if (!checkDevice(context)) {
                    ALog.i(TAG, "not meizu return", new Object[0]);
                    return;
                }
                Context applicationContext = context.getApplicationContext();
                mContext = applicationContext;
                if (!UtilityImpl.isMainProcess(applicationContext)) {
                    ALog.i(TAG, "not in main process, return", new Object[0]);
                    return;
                }
                BaseNotifyClickActivity.addNotifyListener(new MeizuMsgParseImpl());
                PushManager.register(mContext, str, str2);
            } catch (Throwable th) {
                ALog.e(TAG, "register", th, new Object[0]);
            }
        }
    }
}
