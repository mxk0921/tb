package com.alipay.mobile.common.logging.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class LoggingSPCache {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CACHE_FILE_NAME = "LoggingCache";
    public static final String KEY_CUR_UPLOAD_DAY = "curUploadDay";
    public static final String KEY_CUR_UPLOAD_TRAFIC = "curUploadTrafic";
    public static final String LOGGING_CACHE_KEY_INDEX = "behavorLoggingIndex";
    public static final String LOGGING_CACHE_KEY_LOG_DUMP_TAG = "LogDumpTag";
    public static final String STORAGE_BIRDNESTVERSION = "birdNestVersion";
    public static final String STORAGE_BUNDLEVERSION = "bundleVersion";
    public static final String STORAGE_CHANNELID = "channelId";
    public static final String STORAGE_CLIENTID = "clientID";
    public static final String STORAGE_CLIENTIMEI = "clientIMEI";
    public static final String STORAGE_DEVICEID = "utdid";
    public static final String STORAGE_HOTPATCHBUNDLEVERSION = "hotpatchBundleVersion";
    public static final String STORAGE_HOTPATCHDESC = "hotpatchDesc";
    public static final String STORAGE_HOTPATCHVERSION = "hotpatchVersion";
    public static final String STORAGE_LANGUAGE = "language";
    public static final String STORAGE_LOGHOST = "logHost";
    public static final String STORAGE_PACKAGEID = "packageId";
    public static final String STORAGE_PRODUCTID = "productID";
    public static final String STORAGE_PRODUCTVERSION = "productVersion";
    public static final String STORAGE_RELEASECODE = "releaseCode";
    public static final String STORAGE_RELEASETYPE = "releaseType";
    public static final String STORAGE_USERID = "userID";
    public static final String STORAGE_USERSESSIONID = "userSessionId";
    public static LoggingSPCache c;

    /* renamed from: a  reason: collision with root package name */
    public final Context f3991a;
    public SharedPreferences b;

    public LoggingSPCache(Context context) {
        this.f3991a = context;
    }

    public static synchronized LoggingSPCache createInstance(Context context) {
        synchronized (LoggingSPCache.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LoggingSPCache) ipChange.ipc$dispatch("c8f4a7e0", new Object[]{context});
            }
            if (c == null) {
                c = new LoggingSPCache(context);
            }
            return c;
        }
    }

    public static LoggingSPCache getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LoggingSPCache) ipChange.ipc$dispatch("7535951e", new Object[0]);
        }
        LoggingSPCache loggingSPCache = c;
        if (loggingSPCache != null) {
            String processTag = LoggerFactory.getProcessInfo().getProcessTag();
            Context context = loggingSPCache.f3991a;
            loggingSPCache.b = context.getSharedPreferences(processTag + ".LoggingCache", 0);
            return c;
        }
        throw new IllegalStateException("need createInstance befor use");
    }

    public boolean getBoolean(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3915235", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        return this.b.getBoolean(str, z);
    }

    public SharedPreferences.Editor getEditor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences.Editor) ipChange.ipc$dispatch("4fdc14c7", new Object[]{this});
        }
        return this.b.edit();
    }

    public SharedPreferences getEntity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("25456fb4", new Object[]{this});
        }
        return this.b;
    }

    public int getInt(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("235381ac", new Object[]{this, str, new Integer(i)})).intValue();
        }
        return this.b.getInt(str, i);
    }

    public long getLong(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b7efaf15", new Object[]{this, str, new Long(j)})).longValue();
        }
        return this.b.getLong(str, j);
    }

    public String getString(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e264abe", new Object[]{this, str, str2});
        }
        return this.b.getString(str, str2);
    }

    public void putBooleanApply(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74eb41ee", new Object[]{this, str, new Boolean(z)});
        } else {
            this.b.edit().putBoolean(str, z).apply();
        }
    }

    public void putBooleanCommit(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("456213b3", new Object[]{this, str, new Boolean(z)});
        } else {
            this.b.edit().putBoolean(str, z).commit();
        }
    }

    public void putIntApply(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6a2de4", new Object[]{this, str, new Integer(i)});
        } else {
            this.b.edit().putInt(str, i).apply();
        }
    }

    public void putIntCommit(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecc820fb", new Object[]{this, str, new Integer(i)});
        } else {
            this.b.edit().putInt(str, i).commit();
        }
    }

    public void putLongApply(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49fa52f0", new Object[]{this, str, new Long(j)});
        } else {
            this.b.edit().putLong(str, j).apply();
        }
    }

    public void putLongCommit(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("123c2cd1", new Object[]{this, str, new Long(j)});
        } else {
            this.b.edit().putLong(str, j).commit();
        }
    }

    public void putStringApply(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbc1b769", new Object[]{this, str, str2});
            return;
        }
        String string = this.b.getString(str, null);
        if (!this.b.contains(str) || !TextUtils.equals(string, str2)) {
            this.b.edit().putString(str, str2).apply();
        }
    }

    public void putStringCommit(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83a62c72", new Object[]{this, str, str2});
            return;
        }
        String string = this.b.getString(str, null);
        if (!this.b.contains(str) || !TextUtils.equals(string, str2)) {
            this.b.edit().putString(str, str2).commit();
        }
    }

    public void removeApply(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f22145b", new Object[]{this, str});
        } else {
            this.b.edit().remove(str).apply();
        }
    }

    public void removeCommit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cc56f2c", new Object[]{this, str});
        } else {
            this.b.edit().remove(str).commit();
        }
    }
}
