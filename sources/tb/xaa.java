package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.IProcessName;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.data.Message;
import com.taobao.accs.utl.ALog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class xaa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f31247a = false;
    public static final boolean b = true;

    static {
        t2o.a(343933041);
    }

    public static void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("499133c6", new Object[]{new Integer(i)});
        } else {
            Message.CONTROL_MAX_RETRY_TIMES = i;
        }
    }

    public static void c(IProcessName iProcessName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ad69741", new Object[]{iProcessName});
        } else {
            rd0.e = iProcessName;
        }
    }

    public static void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("874d06b0", new Object[]{str});
        } else {
            IpChange ipChange2 = rd0.$ipChange;
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dacee6a", new Object[]{str});
            return;
        }
        rd0.d = str;
        try {
            GlobalClientInfo.getContext().getSharedPreferences(Constants.SP_FILE_NAME, 4).edit().putBoolean(Constants.SP_KEY_ASP_ENABLE, false).apply();
        } catch (Exception e) {
            ALog.e("GlobalConfig", "setChannelProcessName err", e, new Object[0]);
        }
    }
}
