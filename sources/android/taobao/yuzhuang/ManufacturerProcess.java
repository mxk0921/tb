package android.taobao.yuzhuang;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.alipay.mobile.common.logging.api.DeviceProperty;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import mtopsdk.common.util.SymbolExpUtil;
import tb.a7m;
import tb.jcq;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ManufacturerProcess implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String EMUI_PROPERTY = "ro.build.version.emui";
    private static final String HARMONYOS_PROPERTY = "hw_sc.build.platform.version";
    private static final String MANUFACTURER_PROPERTY = "ro.product.manufacturer";
    private static final String TAG = "config_file";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public enum Config {
        OPPO("oppo", "", "/data/etc/appchannel/sjtbconfig.xml"),
        ONEPLUS(DeviceProperty.ALIAS_ONEPLUS, "", "/data/etc/appchannel/sjtbconfig.xml"),
        REALME("realme", "", "/data/etc/appchannel/sjtbconfig.xml"),
        ZTE(DeviceProperty.ALIAS_ZTE, "/system", "/system/etc/sjtbconfig.xml"),
        VIVO("vivo", "/system/vivo-apps", "/system/etc/sjtbconfig.xml"),
        SMARTISAN("smartisan", "/system/media/app", "/system/etc/sjtbconfig.xml"),
        XIAOMI("xiaomi", "", ""),
        BLEPHONE("blephone", "", "/system/etc/sjtbconfig.ini"),
        HUAWEI("huawei", "", ""),
        HONOR("honor", "", ""),
        SUGAR("sugar", "", "/system/etc/sjtbconfig.channel.ini");
        
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final String HONOR_CHANNEL_KEY = "ro.channelId.taobao";
        private static final String HUAWEI_CHANNEL_KEY = "ro.channelId.taobao";
        private static final String OPPO_CHANNEL_KEY = "persist.preinstall.taobao";
        private static final String OPPO_CHANNEL_KEY_2 = "ro.preinstall.path";
        private String apkConfig;
        private String channelConfig;
        private String manufacturer;

        Config(String str, String str2, String str3) {
            this.manufacturer = str;
            this.apkConfig = str2;
            this.channelConfig = str3;
        }

        public static String[] getConfig(String str) {
            String[] strArr;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String[]) ipChange.ipc$dispatch("8993fa58", new Object[]{str});
            }
            Config[] values = values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    strArr = null;
                    break;
                }
                Config config = values[i];
                if (config.manufacturer.equals(str.toLowerCase())) {
                    strArr = new String[]{config.apkConfig, config.channelConfig};
                    break;
                }
                i++;
            }
            if (strArr != null || !ManufacturerProcess.isHuaweiPhone()) {
                return strArr;
            }
            Config config2 = HUAWEI;
            return new String[]{config2.apkConfig, config2.channelConfig};
        }

        public static /* synthetic */ Object ipc$super(Config config, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/yuzhuang/ManufacturerProcess$Config");
        }

        public static String transformSpecificChannelConfig(String str, Context context, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("52db34a6", new Object[]{str, context, str2});
            }
            if (XIAOMI.isManufacturerMatched(str)) {
                return ManufacturerProcess.access$000(context.getPackageName());
            }
            if (ManufacturerProcess.isHuaweiPhone()) {
                return ManufacturerProcess.access$100("ro.channelId.taobao");
            }
            if (HONOR.isManufacturerMatched(str)) {
                return ManufacturerProcess.access$100("ro.channelId.taobao");
            }
            if ((OPPO.isManufacturerMatched(str) || ONEPLUS.isManufacturerMatched(str) || REALME.isManufacturerMatched(str)) && Build.VERSION.SDK_INT >= 30) {
                String access$100 = ManufacturerProcess.access$100(OPPO_CHANNEL_KEY_2);
                if (!TextUtils.isEmpty(access$100)) {
                    return new File(access$100, "sjtbconfig.xml").getAbsolutePath();
                }
            }
            return str2;
        }

        public static Config valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Config) ipChange.ipc$dispatch("4ead39c5", new Object[]{str});
            }
            return (Config) Enum.valueOf(Config.class, str);
        }

        public boolean isManufacturerMatched(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("df52c45e", new Object[]{this, str})).booleanValue();
            }
            if (str == null || str.length() == 0) {
                return false;
            }
            return str.equalsIgnoreCase(this.manufacturer);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Cipher f1829a = null;

        static {
            t2o.a(775946277);
        }

        public a(String str) throws Exception {
            d(str);
            e(str);
        }

        public static final byte[] f(InputStream inputStream) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("78a8d0a1", new Object[]{inputStream});
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr, 0, 1024);
                if (read <= 0) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        }

        public String a(String str) throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("72c54002", new Object[]{this, str});
            }
            StringBuilder sb = new StringBuilder();
            FileInputStream fileInputStream = null;
            try {
                FileInputStream fileInputStream2 = new FileInputStream(str);
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(b(f(fileInputStream2)))));
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb.append(readLine);
                    }
                    fileInputStream2.close();
                } catch (Throwable unused) {
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    return sb.toString();
                }
            } catch (Throwable unused2) {
            }
            return sb.toString();
        }

        public byte[] b(byte[] bArr) throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("cd4fbce2", new Object[]{this, bArr});
            }
            return this.f1829a.doFinal(bArr);
        }

        public final SecretKeySpec c(byte[] bArr) throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SecretKeySpec) ipChange.ipc$dispatch("5e52993d", new Object[]{this, bArr});
            }
            byte[] bArr2 = new byte[8];
            for (int i = 0; i < bArr.length && i < 8; i++) {
                bArr2[i] = bArr[i];
            }
            return new SecretKeySpec(bArr2, "DES");
        }

        public final void d(String str) throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("269858c9", new Object[]{this, str});
                return;
            }
            SecretKeySpec c = c(str.getBytes());
            Cipher instance = Cipher.getInstance("DES");
            this.f1829a = instance;
            instance.init(2, c);
        }

        public final void e(String str) throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a61e1b9a", new Object[]{this, str});
            } else {
                Cipher.getInstance("DES").init(1, c(str.getBytes()));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int FROM_APK = 2;
        public static final int FROM_CONFIG = 1;
        public static String d = "";
        public static volatile b e = null;

        /* renamed from: a  reason: collision with root package name */
        public final Context f1830a;
        public final SharedPreferences b;
        public final SharedPreferences.Editor c;

        static {
            t2o.a(775946278);
        }

        public b(Context context) {
            this.b = null;
            d = Build.MANUFACTURER;
            SharedPreferences sharedPreferences = context.getSharedPreferences("manufacture_config", 0);
            this.b = sharedPreferences;
            this.c = sharedPreferences.edit();
            this.f1830a = context;
        }

        public static b e(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("c21daac1", new Object[]{context});
            }
            if (e == null) {
                synchronized (b.class) {
                    try {
                        if (e == null) {
                            e = new b(context);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return e;
        }

        public final void h(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f083cb5d", new Object[]{this, str});
            } else if (!TextUtils.isEmpty(str)) {
                File d2 = d(str);
                Objects.toString(d2);
                if (d2 != null && d2.exists()) {
                    try {
                        d2.toString();
                        b(d2);
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
            } else {
                Log.e(ManufacturerProcess.TAG, d + " in-apk config is empty ");
            }
        }

        public final void i(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("44f5e6c4", new Object[]{this, str});
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(d);
            sb.append(" channel romChannelConfig = ");
            sb.append(str);
            if (!TextUtils.isEmpty(str)) {
                File file = new File(str);
                File file2 = new File(str.replace("xml", "ini"));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(d);
                sb2.append(" configFile.abs_path = ");
                sb2.append(file.getAbsolutePath());
                StringBuilder sb3 = new StringBuilder();
                sb3.append(d);
                sb3.append(" configFile1.abs_path = ");
                sb3.append(file2.getAbsolutePath());
                if (file.exists()) {
                    c(file);
                    Log.e(ManufacturerProcess.TAG, "file is exist , path : ");
                } else if (file2.exists()) {
                    c(file2);
                    Log.e(ManufacturerProcess.TAG, "file is exist , path1 : ");
                } else {
                    Log.e(ManufacturerProcess.TAG, "config file is not exist");
                }
            } else {
                Log.e(ManufacturerProcess.TAG, "TextUtils.isEmpty(romChannelConfig)");
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
        public class a implements FilenameFilter {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a(b bVar) {
            }

            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("6696dd14", new Object[]{this, file, str})).booleanValue();
                }
                return str.toLowerCase().contains("taobao") && str.endsWith(jcq.APK_EXTENSION);
            }
        }

        /* compiled from: Taobao */
        /* renamed from: android.taobao.yuzhuang.ManufacturerProcess$b$b  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
        public class C0013b implements FilenameFilter {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C0013b(b bVar) {
            }

            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("6696dd14", new Object[]{this, file, str})).booleanValue();
                }
                return str.endsWith(jcq.APK_EXTENSION) && str.toLowerCase().contains("taobao");
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
        public static class c {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* compiled from: Taobao */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
            public class a implements FilenameFilter {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public a(c cVar) {
                }

                @Override // java.io.FilenameFilter
                public boolean accept(File file, String str) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return ((Boolean) ipChange.ipc$dispatch("6696dd14", new Object[]{this, file, str})).booleanValue();
                    }
                    return str.toLowerCase().contains("taobao");
                }
            }

            static {
                t2o.a(775946282);
                t2o.a(775946281);
            }

            public File b(File file, FilenameFilter filenameFilter) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (File) ipChange.ipc$dispatch("b2bf0b54", new Object[]{this, file, filenameFilter});
                }
                if (filenameFilter.accept(file, file.getName())) {
                    return file;
                }
                return null;
            }

            public File a(File file) {
                File[] listFiles;
                File file2;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (File) ipChange.ipc$dispatch("d956d48d", new Object[]{this, file});
                }
                if (!file.exists() || !file.isDirectory() || (listFiles = file.listFiles()) == null) {
                    return null;
                }
                for (File file3 : listFiles) {
                    if (file3.isDirectory()) {
                        file2 = a(file3);
                    } else {
                        file2 = b(file3, new a(this));
                    }
                    if (file2 != null) {
                        return file2;
                    }
                }
                return null;
            }
        }

        public final File d(String str) {
            File[] listFiles;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (File) ipChange.ipc$dispatch("8f3d4d5a", new Object[]{this, str});
            }
            File[] listFiles2 = new File(str).listFiles(new a(this));
            if (listFiles2 != null && listFiles2.length > 0) {
                return listFiles2[0];
            }
            if (d.equalsIgnoreCase("vivo") && Build.VERSION.SDK_INT >= 23 && (listFiles = new File("/apps").listFiles(new C0013b(this))) != null && listFiles.length > 0) {
                return listFiles[0];
            }
            if (!d.equalsIgnoreCase(DeviceProperty.ALIAS_ZTE)) {
                return null;
            }
            File file = new File(str);
            if (file.isDirectory()) {
                return new c().a(file);
            }
            return null;
        }

        public final void b(File file) throws IOException {
            ZipEntry zipEntry;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7a5fd4e4", new Object[]{this, file});
            } else if (!this.b.getBoolean(a7m.PRE_LOAD, false) || TextUtils.isEmpty(this.b.getString("preLoad_Channel1", ""))) {
                ZipFile zipFile = new ZipFile(file);
                if (!(zipFile.getEntry("assets/aconfig.xml") == null && zipFile.getEntry("assets/aconfig.ini") == null)) {
                    StringBuilder sb = new StringBuilder();
                    if (zipFile.getEntry("assets/aconfig.xml") == null) {
                        zipEntry = zipFile.getEntry("assets/aconfig.ini");
                    } else {
                        zipEntry = zipFile.getEntry("assets/aconfig.xml");
                    }
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(zipFile.getInputStream(zipEntry)));
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb.append(readLine);
                    }
                    a(sb.toString().split(SymbolExpUtil.SYMBOL_VERTICALBAR), 2);
                    bufferedReader.close();
                }
                zipFile.close();
            } else {
                Log.e(ManufacturerProcess.TAG, "skipped");
            }
        }

        public final void c(File file) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("94c9c2d2", new Object[]{this, file});
            } else if (!this.b.getBoolean(a7m.PRE_LOAD, false) || TextUtils.isEmpty(this.b.getString("preLoad_Channel2", ""))) {
                try {
                    a(new a("channel").a(file.getAbsolutePath()).split(SymbolExpUtil.SYMBOL_VERTICALBAR), 1);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            } else {
                Log.e(ManufacturerProcess.TAG, "skipped");
            }
        }

        public final boolean f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8f3b4fd", new Object[]{this})).booleanValue();
            }
            boolean z = this.b.getBoolean(a7m.PRE_LOAD, false);
            boolean z2 = !TextUtils.isEmpty(this.b.getString("preLoad_Channel1", "")) || !TextUtils.isEmpty(this.b.getString("preLoad_Channel2", ""));
            Log.e(ManufacturerProcess.TAG, "preLoadCommitted = " + z + " ,  anyChannelNotEmpty = " + z2);
            return z && z2;
        }

        public void g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bffd376", new Object[]{this});
                return;
            }
            Log.e(ManufacturerProcess.TAG, "manufacturer: " + d);
            if (f()) {
                Log.e(ManufacturerProcess.TAG, "skip process, isCommited == true");
                return;
            }
            String[] config = Config.getConfig(d);
            if (config == null) {
                Log.e(ManufacturerProcess.TAG, "Config.getConfig(manufacturer) == null ");
                return;
            }
            Arrays.toString(config);
            h(config[0]);
            i(Config.transformSpecificChannelConfig(d, this.f1830a, config[1]));
        }

        public final void a(String[] strArr, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("21438102", new Object[]{this, strArr, new Integer(i)});
                return;
            }
            StringBuilder sb = new StringBuilder("into commit : ");
            sb.append(strArr);
            sb.append(";from : ");
            sb.append(i);
            if (strArr.length == 3 && strArr[2].equals(this.f1830a.getPackageName())) {
                Log.e(ManufacturerProcess.TAG, "results.length == 3");
                Log.e(ManufacturerProcess.TAG, "results[0]:" + strArr[0]);
                Log.e(ManufacturerProcess.TAG, "results[1]:" + strArr[1]);
                this.c.putBoolean(a7m.PRE_LOAD, true);
                this.c.putString("preLoad_VersionName", strArr[1]);
                if (i == 1) {
                    this.c.putString("preLoad_Channel2", strArr[0]);
                } else if (i == 2) {
                    this.c.putString("preLoad_Channel1", strArr[0]);
                }
                this.c.commit();
            } else if (strArr.length == 2 && strArr[1].equals(this.f1830a.getPackageName())) {
                Log.e(ManufacturerProcess.TAG, "results.length == 2");
                Log.e(ManufacturerProcess.TAG, "results[0]:" + strArr[0]);
                Log.e(ManufacturerProcess.TAG, "results[1]:" + strArr[1]);
                this.c.putBoolean(a7m.PRE_LOAD, true);
                if (i == 1) {
                    this.c.putString("preLoad_Channel2", strArr[0]);
                } else if (i == 2) {
                    this.c.putString("preLoad_Channel1", strArr[0]);
                }
                this.c.commit();
            }
        }
    }

    static {
        t2o.a(775946275);
    }

    public static /* synthetic */ String access$000(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("28c0253f", new Object[]{str});
        }
        return getMiuiChannelPath(str);
    }

    public static /* synthetic */ String access$100(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("30255a5e", new Object[]{str});
        }
        return getSystemProperties(str);
    }

    public static boolean isHuaweiPhone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e37e48", new Object[0])).booleanValue();
        }
        return !TextUtils.isEmpty(getProp("ro.build.version.emui")) || !TextUtils.isEmpty(getProp(HARMONYOS_PROPERTY));
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
        } else {
            b.e(application).g();
        }
    }

    private static String getMiuiChannelPath(String str) {
        try {
            return (String) Class.forName("miui.os.MiuiInit").getMethod("getMiuiChannelPath", String.class).invoke(null, str);
        } catch (Exception unused) {
            return "";
        }
    }

    private static String getProp(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, str);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
            return "";
        }
    }

    private static String getSystemProperties(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, null);
        } catch (Throwable unused) {
            return null;
        }
    }
}
