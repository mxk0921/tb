package android.taobao.safemode;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kpo;
import tb.lpo;
import tb.qpo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SafeModeReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class a implements lpo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(SafeModeReceiver safeModeReceiver) {
        }

        @Override // tb.lpo
        public void onFinish() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("badeed9", new Object[]{this});
            } else {
                System.exit(0);
            }
        }
    }

    public static /* synthetic */ Object ipc$super(SafeModeReceiver safeModeReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/safemode/SafeModeReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        Context applicationContext = context.getApplicationContext();
        qpo.a(applicationContext, "EnterSafeModeService");
        if (intent == null) {
            System.exit(0);
            return;
        }
        IpChange ipChange2 = SafeModeActivity.$ipChange;
        new kpo(applicationContext, intent.getStringExtra(HeaderConstant.HEADER_KEY_VERSION), intent.getBooleanExtra("Launch", true), new a(this)).b();
    }
}
