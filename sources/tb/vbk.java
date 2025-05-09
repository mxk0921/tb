package tb;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class vbk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Properties f29909a;

        static {
            t2o.a(310378906);
        }

        public a() throws IOException {
            Properties properties = new Properties();
            this.f29909a = properties;
            FileInputStream fileInputStream = new FileInputStream(new File(Environment.getRootDirectory(), "build.prop"));
            properties.load(fileInputStream);
            fileInputStream.close();
        }

        public static a c() throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d133a09b", new Object[0]);
            }
            return new a();
        }

        public boolean a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a5a3b867", new Object[]{this, obj})).booleanValue();
            }
            return this.f29909a.containsKey(obj);
        }

        public String b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("88202484", new Object[]{this, str});
            }
            return this.f29909a.getProperty(str);
        }
    }

    static {
        t2o.a(310378905);
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3094e0b", new Object[]{context})).booleanValue();
        }
        String c = owg.c(context, "taobao_live_home_isMIUI");
        if (!lrq.a(c)) {
            return "true".equals(c);
        }
        boolean c2 = c("ro.miui.ui.version.code", "ro.miui.ui.version.name", "ro.miui.internal.storage");
        if (c2) {
            owg.e(context, "taobao_live_home_isMIUI", "true");
        } else {
            owg.e(context, "taobao_live_home_isMIUI", "false");
        }
        return c2;
    }

    public static boolean c(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d726d02", new Object[]{strArr})).booleanValue();
        }
        if (!(strArr == null || strArr.length == 0)) {
            try {
                a c = a.c();
                for (String str : strArr) {
                    if (c.b(str) != null) {
                        return true;
                    }
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("95baba84", new Object[]{context})).booleanValue();
        }
        String c = owg.c(context, "taobao_live_home_isFLYME");
        if (!lrq.a(c)) {
            return "true".equals(c);
        }
        if (c("persist.sys.use.flyme.icon", "ro.meizu.setupwizard.flyme", "ro.flyme.published")) {
            owg.e(context, "taobao_live_home_isFLYME", "true");
            return true;
        }
        try {
            a c2 = a.c();
            if (c2.a("ro.build.display.id")) {
                String b = c2.b("ro.build.display.id");
                if (!TextUtils.isEmpty(b) && b.contains("Flyme")) {
                    owg.e(context, "taobao_live_home_isFLYME", "true");
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        owg.e(context, "taobao_live_home_isFLYME", "false");
        return false;
    }
}
