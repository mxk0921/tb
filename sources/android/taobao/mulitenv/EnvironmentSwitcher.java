package android.taobao.mulitenv;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class EnvironmentSwitcher {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String HTTP_VALIDATION = "http_validation";
    public static final String SPKEY_ENV = "env_taobao";
    public static final String SPKEY_PROJECT_ID = "projectid";
    public static final String SPKEY_SPDYSSLS = "spdyssls";
    public static final String SPKEY_SS = "ss";
    public static final String TLOG_LEVEL = "tlog_level";
    public static final String TLOG_TAG = "tlog_tag";
    public static final String TLOG_VERSION = "tlog_version";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public enum EnvType {
        OnLINE(0),
        PRE(1),
        TEST(2),
        TEST_2(3);
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final int value;

        EnvType(int i) {
            this.value = i;
        }

        public static /* synthetic */ int access$000(EnvType envType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a55f8516", new Object[]{envType})).intValue();
            }
            return envType.value;
        }

        public static /* synthetic */ Object ipc$super(EnvType envType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/mulitenv/EnvironmentSwitcher$EnvType");
        }

        public static EnvType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (EnvType) ipChange.ipc$dispatch("c5bf7fa3", new Object[]{str});
            }
            return (EnvType) Enum.valueOf(EnvType.class, str);
        }

        public int getValue() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d1b766b5", new Object[]{this})).intValue();
            }
            return this.value;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public enum HttpsValidationStrategy {
        ENABLE_DEGRADE,
        DISABLE_DEGRADE;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(HttpsValidationStrategy httpsValidationStrategy, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/mulitenv/EnvironmentSwitcher$HttpsValidationStrategy");
        }

        public static HttpsValidationStrategy valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HttpsValidationStrategy) ipChange.ipc$dispatch("6f683a13", new Object[]{str});
            }
            return (HttpsValidationStrategy) Enum.valueOf(HttpsValidationStrategy.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public enum SpdySSLStrategy {
        ENABLE_DEGRADE,
        DISABLE_DEGRADE;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(SpdySSLStrategy spdySSLStrategy, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/mulitenv/EnvironmentSwitcher$SpdySSLStrategy");
        }

        public static SpdySSLStrategy valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SpdySSLStrategy) ipChange.ipc$dispatch("e80a649d", new Object[]{str});
            }
            return (SpdySSLStrategy) Enum.valueOf(SpdySSLStrategy.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public enum SpdyStrategy {
        ENABLE_DEGRADE,
        DISABLE_DEGRADE;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(SpdyStrategy spdyStrategy, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/mulitenv/EnvironmentSwitcher$SpdyStrategy");
        }

        public static SpdyStrategy valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SpdyStrategy) ipChange.ipc$dispatch("4ccbc0a7", new Object[]{str});
            }
            return (SpdyStrategy) Enum.valueOf(SpdyStrategy.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public enum TlogStrategy {
        ENABLE_DEGRADE,
        DISABLE_DEGRADE;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(TlogStrategy tlogStrategy, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/mulitenv/EnvironmentSwitcher$TlogStrategy");
        }

        public static TlogStrategy valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TlogStrategy) ipChange.ipc$dispatch("5531ebc9", new Object[]{str});
            }
            return (TlogStrategy) Enum.valueOf(TlogStrategy.class, str);
        }
    }

    static {
        t2o.a(775946243);
    }

    public static int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("98d4c6c2", new Object[0])).intValue();
        }
        return PreferenceManager.getDefaultSharedPreferences(Globals.getApplication()).getInt(SPKEY_ENV, 0);
    }

    public static HttpsValidationStrategy b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpsValidationStrategy) ipChange.ipc$dispatch("da5dbe02", new Object[0]);
        }
        return HttpsValidationStrategy.values()[PreferenceManager.getDefaultSharedPreferences(Globals.getApplication()).getInt(HTTP_VALIDATION, HttpsValidationStrategy.DISABLE_DEGRADE.ordinal())];
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dda325b", new Object[0]);
        }
        return PreferenceManager.getDefaultSharedPreferences(Globals.getApplication()).getString(SPKEY_PROJECT_ID, "");
    }

    public static SpdySSLStrategy d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpdySSLStrategy) ipChange.ipc$dispatch("99bdce2", new Object[0]);
        }
        return SpdySSLStrategy.values()[PreferenceManager.getDefaultSharedPreferences(Globals.getApplication()).getInt(SPKEY_SPDYSSLS, SpdySSLStrategy.DISABLE_DEGRADE.ordinal())];
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efcd2fc4", new Object[0]);
            return;
        }
        i = PreferenceManager.getDefaultSharedPreferences(Globals.getApplication()).getInt(SPKEY_ENV, -1);
        if (i == -1) {
            int parseInt = Integer.parseInt(Globals.getApplication().getString(R.string.env_default));
            if (parseInt >= 0 && parseInt < 4) {
                i = parseInt;
            }
        }
        f(EnvType.values()[i]);
    }

    public static void f(EnvType envType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ce18f47", new Object[]{envType});
            return;
        }
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(Globals.getApplication()).edit();
        edit.putInt(SPKEY_ENV, EnvType.access$000(envType));
        edit.commit();
    }
}
