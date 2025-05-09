package org.android.agoo.mezu;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.meizu.cloud.pushsdk.MzPushMessageReceiver;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.platform.message.PushSwitchStatus;
import com.meizu.cloud.pushsdk.platform.message.RegisterStatus;
import com.meizu.cloud.pushsdk.platform.message.SubAliasStatus;
import com.meizu.cloud.pushsdk.platform.message.SubTagsStatus;
import com.meizu.cloud.pushsdk.platform.message.UnRegisterStatus;
import com.taobao.accs.utl.ALog;
import org.android.agoo.control.AgooFactory;
import org.android.agoo.control.NotifManager;
import tb.xpd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class MeizuPushReceiver extends MzPushMessageReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "MeizuPushReceiver";
    private static final String TOKEN = "MZ_TOKEN";
    private AgooFactory agooFactory;

    public static /* synthetic */ Object ipc$super(MeizuPushReceiver meizuPushReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in org/android/agoo/mezu/MeizuPushReceiver");
    }

    private static void reportToken(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fbf10e6", new Object[]{context, str});
        } else if (!TextUtils.isEmpty(str) && context != null) {
            NotifManager notifManager = new NotifManager();
            notifManager.init(context.getApplicationContext());
            notifManager.reportThirdPushToken(str, TOKEN);
        }
    }

    @Override // com.meizu.cloud.pushsdk.MzPushMessageReceiver
    public void onMessage(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee0fb98d", new Object[]{this, context, str, str2});
            return;
        }
        ALog.i(TAG, xpd.c.EVENT_ON_MESSAGE, "msg", str, "platformExtra", str2);
        try {
            ALog.i(TAG, "onPushMsg", "content", str);
            AgooFactory agooFactory = new AgooFactory();
            this.agooFactory = agooFactory;
            agooFactory.init(context, null, null);
            this.agooFactory.msgRecevie(str.getBytes(), "meizu", null);
        } catch (Throwable th) {
            ALog.e(TAG, "onPushMsg", th, new Object[0]);
        }
    }

    @Override // com.meizu.cloud.pushsdk.MzPushMessageReceiver
    public void onPushStatus(Context context, PushSwitchStatus pushSwitchStatus) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b76e1ac1", new Object[]{this, context, pushSwitchStatus});
            return;
        }
        if (pushSwitchStatus == null) {
            str = "";
        } else {
            str = pushSwitchStatus.toString();
        }
        ALog.i(TAG, "onPushStatus", "status", str);
    }

    @Override // com.meizu.cloud.pushsdk.MzPushMessageReceiver
    public void onRegister(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcaadec9", new Object[]{this, context, str});
        } else {
            ALog.i(TAG, "onRegister", PushConstants.KEY_PUSH_ID, str);
        }
    }

    @Override // com.meizu.cloud.pushsdk.MzPushMessageReceiver
    public void onRegisterStatus(Context context, RegisterStatus registerStatus) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99d71175", new Object[]{this, context, registerStatus});
        } else if (registerStatus == null || TextUtils.isEmpty(registerStatus.getPushId())) {
            if (registerStatus == null) {
                str = "";
            } else {
                str = registerStatus.toString();
            }
            ALog.e(TAG, "onRegisterStatus", "status", str);
        } else {
            ALog.i(TAG, "onRegister", "status", registerStatus.toString());
            reportToken(context, registerStatus.getPushId());
        }
    }

    @Override // com.meizu.cloud.pushsdk.MzPushMessageReceiver
    public void onSubAliasStatus(Context context, SubAliasStatus subAliasStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1ea8a95", new Object[]{this, context, subAliasStatus});
        }
    }

    @Override // com.meizu.cloud.pushsdk.MzPushMessageReceiver
    public void onSubTagsStatus(Context context, SubTagsStatus subTagsStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa182a3", new Object[]{this, context, subTagsStatus});
        }
    }

    @Override // com.meizu.cloud.pushsdk.MzPushMessageReceiver
    public void onUnRegister(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e27502e", new Object[]{this, context, new Boolean(z)});
        } else {
            ALog.i(TAG, "onUnRegister", "result", Boolean.valueOf(z));
        }
    }

    @Override // com.meizu.cloud.pushsdk.MzPushMessageReceiver
    public void onUnRegisterStatus(Context context, UnRegisterStatus unRegisterStatus) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6b92395", new Object[]{this, context, unRegisterStatus});
            return;
        }
        if (unRegisterStatus == null) {
            str = "";
        } else {
            str = unRegisterStatus.toString();
        }
        ALog.i(TAG, "onUnRegisterStatus", "status", str);
    }

    @Override // com.meizu.cloud.pushsdk.MzPushMessageReceiver
    public void onMessage(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("853839b6", new Object[]{this, context, intent});
            return;
        }
        ALog.i(TAG, xpd.c.EVENT_ON_MESSAGE, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, intent == null ? "" : intent.toString());
        if (intent != null) {
            try {
                String stringExtra = intent.getStringExtra("content");
                ALog.i(TAG, "onPushMsg", "flyme3.0 content", stringExtra);
                AgooFactory agooFactory = new AgooFactory();
                this.agooFactory = agooFactory;
                agooFactory.init(context, null, null);
                this.agooFactory.msgRecevie(stringExtra.getBytes(), "meizu", null);
            } catch (Throwable th) {
                ALog.e(TAG, "onPushMsg", th, new Object[0]);
            }
        }
    }
}
