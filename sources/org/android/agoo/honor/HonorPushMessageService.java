package org.android.agoo.honor;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.hihonor.push.sdk.HonorMessageService;
import com.taobao.accs.utl.ALog;
import org.android.agoo.control.AgooFactory;
import org.android.agoo.control.NotifManager;
import tb.r5b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class HonorPushMessageService extends HonorMessageService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "HonorPushMessageService";
    private AgooFactory agooFactory;

    public static /* synthetic */ Object ipc$super(HonorPushMessageService honorPushMessageService, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in org/android/agoo/honor/HonorPushMessageService");
    }

    @Override // com.hihonor.push.sdk.HonorMessageService
    public void onMessageReceived(r5b r5bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e152d68", new Object[]{this, r5bVar});
            return;
        }
        try {
            String a2 = r5bVar.a();
            ALog.i(TAG, "onMessageReceived", "content", a2);
            if (this.agooFactory == null) {
                AgooFactory agooFactory = new AgooFactory();
                this.agooFactory = agooFactory;
                agooFactory.init(this, null, null);
            }
            this.agooFactory.msgRecevie(a2.getBytes(), "honor", null);
        } catch (Throwable th) {
            ALog.e(TAG, "onMessageReceived err", th, new Object[0]);
        }
    }

    @Override // com.hihonor.push.sdk.HonorMessageService
    public void onNewToken(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c0ac7c9", new Object[]{this, str});
            return;
        }
        try {
            ALog.e(TAG, "honor.onNewToken", "token", str);
            if (!TextUtils.isEmpty(str)) {
                NotifManager notifManager = new NotifManager();
                notifManager.init(getApplicationContext());
                notifManager.reportThirdPushToken(str, HonorRegister.HONOR_TOKEN);
            }
        } catch (Throwable th) {
            ALog.e(TAG, "onToken", th, new Object[0]);
        }
    }
}
