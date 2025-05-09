package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class jm2 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String WINDVANE_CONFIG = "WindVane";
    public static volatile jm2 d = null;

    /* renamed from: a  reason: collision with root package name */
    public boolean f22066a = true;
    public String b = "";
    public String c = "";

    static {
        t2o.a(619708646);
    }

    public static jm2 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jm2) ipChange.ipc$dispatch("1f9f22c2", new Object[0]);
        }
        if (d == null) {
            synchronized (jm2.class) {
                try {
                    if (d == null) {
                        d = new jm2();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("96c62133", new Object[]{this})).booleanValue();
        }
        return this.f22066a;
    }

    public boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("92d4a2d1", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(this.b)) {
            return false;
        }
        try {
            Pattern compile = Pattern.compile(this.b, 2);
            if (!TextUtils.isEmpty(str)) {
                return compile.matcher(str).matches();
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ffc0ee7", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(this.c)) {
            return false;
        }
        try {
            Pattern compile = Pattern.compile(this.c, 2);
            if (!TextUtils.isEmpty(str)) {
                return compile.matcher(str).matches();
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e6e531a", new Object[]{this});
            return;
        }
        String config = OrangeConfig.getInstance().getConfig("WindVane", m7r.TB_ALLOW_OPEN_CLIENT, "1");
        this.b = OrangeConfig.getInstance().getConfig("WindVane", "openClientBlackList", "");
        this.c = OrangeConfig.getInstance().getConfig("WindVane", "openClientWriteList", "");
        if ("0".equals(config)) {
            this.f22066a = false;
        } else {
            this.f22066a = true;
        }
    }
}
