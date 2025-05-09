package com.taobao.tao;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.android.virtual_thread.CarrierCachedPoolImpl;
import com.taobao.tao.util.AppUtils;
import com.taobao.tao.util.BuiltConfig;
import com.taobao.tao.util.TBMainLog;
import com.taobao.tao.util.TTIDChangeTrend;
import com.taobao.taobao.R;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import tb.jqx;
import tb.t2o;
import tb.y7t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TaoPackageInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CURRENT_TTID = "ttid";
    public static final String DEFAULT_PACKAGE_TAG = "0-0-0";
    public static final String PRELOAD_TTID = "preload_ttid";
    public static final String TAG = "TaoPackageInfo";
    public static String sTTID = null;
    public static Date sPackageDate = null;
    public static String mttid = null;
    public static String mTTIDType = null;
    public static String mPackageTag = null;
    public static boolean isInit = false;
    public static int mpatchversion = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a extends Coordinator.TaggedRunnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(String str) {
            super(str);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/TaoPackageInfo$1");
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TaoPackageInfo.access$000();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b extends Coordinator.TaggedRunnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f11876a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2) {
            super(str);
            this.f11876a = str2;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/TaoPackageInfo$2");
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TaoPackageInfo.access$100("ttid", this.f11876a);
            }
        }
    }

    static {
        t2o.a(775946332);
    }

    public static /* synthetic */ void access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd60777", new Object[0]);
        } else {
            asyncInit();
        }
    }

    public static /* synthetic */ void access$100(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79467bcc", new Object[]{str, str2});
        } else {
            saveTTID(str, str2);
        }
    }

    private static void asyncInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96590c33", new Object[0]);
            return;
        }
        String tTIDPreference = getTTIDPreference();
        String str = "600000";
        if (isTTIDInvalid(tTIDPreference)) {
            tTIDPreference = getTTIDExternal();
            if (isTTIDInvalid(tTIDPreference)) {
                tTIDPreference = getTTIDPackage();
                mTTIDType = "ttid";
                if (isTTIDInvalid(tTIDPreference)) {
                    y7t.a(TAG, "can not get ttid from apk");
                    tTIDPreference = str;
                }
                saveTTID(mTTIDType, tTIDPreference);
            } else {
                mttid = tTIDPreference;
                saveTTIDPreference(mTTIDType, tTIDPreference);
            }
        }
        if (TextUtils.isEmpty(tTIDPreference)) {
            TBMainLog.tlog(TAG, "ttid is null. set to 600000");
        } else {
            str = tTIDPreference;
        }
        mttid = str;
        new StringBuilder("orgin ttid2 is ").append(mttid);
        String str2 = mttid.split("@")[0];
        sTTID = str2;
        TTIDChangeTrend.setCurrentUseTTID(str2);
        isInit = true;
    }

    public static Date getPackageDate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Date) ipChange.ipc$dispatch("7c592d32", new Object[0]);
        }
        Date date = sPackageDate;
        if (date != null) {
            return date;
        }
        try {
            sPackageDate = new SimpleDateFormat("yyyyMMdd.HHmmss").parse(BuiltConfig.getString(R.string.packageTime));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return sPackageDate;
    }

    public static String getPackageTTID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3bd25c2e", new Object[0]);
        }
        return getTTIDPackage() + "@taobao_android_" + getVersion();
    }

    public static String getPackageTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a0ce77cf", new Object[0]);
        }
        if (mPackageTag == null) {
            try {
                mPackageTag = Globals.getApplication().getString(R.string.packageTag);
            } catch (Exception unused) {
                mPackageTag = DEFAULT_PACKAGE_TAG;
            }
        }
        return mPackageTag;
    }

    public static int getPatchVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a58ce760", new Object[0])).intValue();
        }
        return mpatchversion;
    }

    public static String getTTID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e0d7a8", new Object[0]);
        }
        return sTTID + "@taobao_android_" + getVersion();
    }

    private static String getTTIDExternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9ce1a19d", new Object[0]);
        }
        return null;
    }

    private static String getTTIDFromSystem() {
        String[] list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("355e67ef", new Object[0]);
        }
        File file = new File("system/app");
        if (!file.isDirectory()) {
            return null;
        }
        for (String str : file.list()) {
            if (str.toLowerCase().indexOf("taobao") >= 0) {
                String[] split = str.split("_");
                if (split.length < 3) {
                    continue;
                } else {
                    String str2 = split[2];
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(", find taobao, ttid=");
                    sb.append(str2);
                    try {
                        if (Integer.valueOf(str2).intValue() >= 600000) {
                            if (checkOKWithUpZip(file.getAbsolutePath() + "/" + str, str2)) {
                                return str2;
                            }
                        } else {
                            continue;
                        }
                    } catch (Exception unused) {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    public static final String getTTIDNum() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8c591c44", new Object[0]);
        }
        return getTTIDPackage();
    }

    public static String getTTIDPackage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4c099b04", new Object[0]);
        }
        String a2 = jqx.ZIP_COMMENT_TTID_TYPE.equals(BuiltConfig.getString(R.string.ttidStore)) ? jqx.a(Globals.getApplication()) : null;
        if (TextUtils.isEmpty(a2)) {
            try {
                a2 = BuiltConfig.getString(R.string.ttid);
            } catch (Resources.NotFoundException unused) {
            }
        }
        return a2 == null ? "600000" : a2;
    }

    private static String getTTIDPreference() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e3236acd", new Object[0]);
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(Globals.getApplication());
        if (defaultSharedPreferences == null) {
            return null;
        }
        String string = defaultSharedPreferences.getString(PRELOAD_TTID, null);
        if (string == null) {
            String string2 = defaultSharedPreferences.getString("ttid", null);
            if (string2 == null) {
                return string2;
            }
            String tTIDPackage = getTTIDPackage();
            if (string2.equals(tTIDPackage)) {
                return string2;
            }
            TTIDChangeTrend.setAndSaveOldUseTTID(string2);
            CarrierCachedPoolImpl.instance().execute(new b("saveTTID", tTIDPackage));
            return tTIDPackage;
        }
        TTIDChangeTrend.setOldUseTTID(getTTIDPackage());
        return string;
    }

    private static String getTTIDSaveFileName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9914cc4", new Object[0]);
        }
        File externalCacheDir = Globals.getApplication().getExternalCacheDir();
        if (externalCacheDir == null) {
            return null;
        }
        return externalCacheDir.getAbsolutePath() + "/.deviceidInfo/ttid.dat";
    }

    public static String getVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a8fef97", new Object[0]);
        }
        return AppUtils.getVersionName();
    }

    public static void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
        } else if (!isInit) {
            String tTIDPackage = getTTIDPackage();
            mttid = tTIDPackage;
            mTTIDType = "ttid";
            if (isTTIDInvalid(tTIDPackage)) {
                y7t.a(TAG, "can not get ttid from apk");
                mttid = "600000";
            }
            sTTID = mttid.split("@")[0];
            CarrierCachedPoolImpl.instance().execute(new a("ttidAsyncInit"));
            new StringBuilder("orgin ttid1 is ").append(mttid);
        }
    }

    private static boolean isTTIDInvalid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1697cf87", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        return false;
    }

    private static void saveTTID(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dd0f8b3", new Object[]{str, str2});
            return;
        }
        saveTTIDPreference(str, str2);
        saveTTIDExternal(str, str2);
    }

    private static void saveTTIDExternal(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a525219e", new Object[]{str, str2});
        }
    }

    private static void saveTTIDPreference(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99d05cae", new Object[]{str, str2});
            return;
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(Globals.getApplication());
        if (defaultSharedPreferences == null) {
            y7t.a(TAG, "getSharedPreferences error");
            return;
        }
        SharedPreferences.Editor edit = defaultSharedPreferences.edit();
        if (edit == null) {
            y7t.a(TAG, "getSharedPreferences error");
            return;
        }
        edit.putString(str, str2);
        edit.commit();
    }

    private static boolean checkOKWithUpZip(String str, String str2) {
        Throwable th;
        ZipFile zipFile;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71b1bafb", new Object[]{str, str2})).booleanValue();
        }
        ZipFile zipFile2 = null;
        try {
            try {
                zipFile = new ZipFile(str);
            } catch (Exception unused) {
                return false;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            while (entries.hasMoreElements()) {
                ZipEntry zipEntry = (ZipEntry) entries.nextElement();
                if (zipEntry.getName().contains("../")) {
                    break;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("entry.getName()=");
                sb.append(zipEntry.getName());
                if (zipEntry.getName().contains("assets/aconfig.xml")) {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(zipFile.getInputStream(zipEntry)));
                    String readLine = bufferedReader.readLine();
                    bufferedReader.close();
                    if (readLine != null && readLine.contains("com.taobao.taobao")) {
                        if (readLine.contains(str2)) {
                            try {
                                zipFile.close();
                            } catch (Exception unused3) {
                            }
                            return true;
                        }
                    }
                    try {
                        zipFile.close();
                    } catch (Exception unused4) {
                    }
                    return false;
                }
            }
            zipFile.close();
        } catch (Exception unused5) {
            zipFile2 = zipFile;
            if (zipFile2 != null) {
                zipFile2.close();
            }
            return false;
        } catch (Throwable th3) {
            th = th3;
            zipFile2 = zipFile;
            if (zipFile2 != null) {
                try {
                    zipFile2.close();
                } catch (Exception unused6) {
                }
            }
            throw th;
        }
    }
}
