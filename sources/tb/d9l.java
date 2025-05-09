package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class d9l {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PAGENAME_ORANGE = "weitao_switch";

    /* renamed from: a  reason: collision with root package name */
    public static d9l f17668a;

    public static synchronized d9l e() {
        synchronized (d9l.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d9l) ipChange.ipc$dispatch("5ee2f8d1", new Object[0]);
            }
            if (f17668a == null) {
                f17668a = new d9l();
            }
            return f17668a;
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("58e2037a", new Object[]{this})).booleanValue();
        }
        return TextUtils.equals(d("weitao_switch", "startDownloadDxTemplate", "false", 2), "true");
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("409f8f16", new Object[]{this})).booleanValue();
        }
        return TextUtils.equals(d("weitao_switch", "enable_async_init_publish", "true", 2), "true");
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6ba85a1", new Object[]{this})).booleanValue();
        }
        return TextUtils.equals(d("weitao_switch", "enable_async_publish", "true", 2), "true");
    }

    public final String d(String str, String str2, String str3, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3ec761a", new Object[]{this, str, str2, str3, new Integer(i)});
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        if (i == 1) {
            return str3;
        }
        if (i != 2) {
            return null;
        }
        return OrangeConfig.getInstance().getConfig(str, str2, str3);
    }
}
