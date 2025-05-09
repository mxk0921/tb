package tb;

import android.app.Application;
import android.taobao.mulitenv.EnvironmentSwitcher;
import android.util.Log;
import anetwork.channel.config.NetworkConfigCenter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import java.lang.reflect.Method;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class kze extends mss {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public kze(String str) {
        super(str);
    }

    public static /* synthetic */ Object ipc$super(kze kzeVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/biz/launcher/InitEnv");
    }

    private static void q(boolean z) {
        try {
            Method declaredMethod = Class.forName("anet.channel.debug.NetworkDebugTool").getDeclaredMethod("setHttpsValidationEnabled", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(Boolean.valueOf(z), new Object[0]);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // tb.mss
    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c246ea2", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.mss
    public void p(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74ea6706", new Object[]{this, application, hashMap});
        } else if (Globals.getApplication().getString(R.string.env_switch).equals("1")) {
            EnvironmentSwitcher.e();
            EnvironmentSwitcher.SpdySSLStrategy d = EnvironmentSwitcher.d();
            if (d == EnvironmentSwitcher.SpdySSLStrategy.DISABLE_DEGRADE) {
                NetworkConfigCenter.setSSLEnabled(true);
                NetworkConfigCenter.setSpdyEnabled(true);
                Log.e("TaoApplication", "http降级关闭");
            } else if (d == EnvironmentSwitcher.SpdySSLStrategy.ENABLE_DEGRADE) {
                NetworkConfigCenter.setSSLEnabled(false);
                NetworkConfigCenter.setSpdyEnabled(false);
                Log.e("TaoApplication", "http降级开启");
            }
            EnvironmentSwitcher.HttpsValidationStrategy b = EnvironmentSwitcher.b();
            if (b == EnvironmentSwitcher.HttpsValidationStrategy.DISABLE_DEGRADE) {
                q(true);
                NetworkConfigCenter.setSpdyEnabled(true);
                Log.e("TaoApplication", "https降级关闭");
            } else if (b == EnvironmentSwitcher.HttpsValidationStrategy.ENABLE_DEGRADE) {
                q(false);
                NetworkConfigCenter.setSpdyEnabled(false);
                Log.e("TaoApplication", "https降级开启");
            }
        }
    }
}
