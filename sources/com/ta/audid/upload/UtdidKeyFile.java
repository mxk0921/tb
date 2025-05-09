package com.ta.audid.upload;

import android.content.Context;
import android.os.Environment;
import android.provider.Settings;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.audid.Variables;
import com.ta.audid.permission.PermissionUtils;
import com.ta.audid.utils.FileUtils;
import com.ta.audid.utils.UtdidLogger;
import com.ta.utdid2.android.utils.PhoneInfoUtils;
import java.io.File;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class UtdidKeyFile {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String AUDID_FILE_DIR = ".UTSystemConfig" + File.separator + "Global";
    private static final String AUDID_FILE_NAME = "cec06585501c9775";
    private static final String AUDID_NOT_UPLOAD = "3c9b584e65e6c983";
    private static final String UTDID_FILE_APPUTDID = "4635b664f789000d";
    private static final String UTDID_FILE_DIR = ".7934039a7252be16";
    private static final String UTDID_FILE_ECDID_UTDID = "d48d3759078396c6";
    private static final String UTDID_FILE_LOCK = "9983c160aa044115";
    private static final String UTDID_FILE_SYNCUTDIDLOCK = "a325712a39bd320a";
    private static final String UTDID_FILE_UTDID = "7934039a7252be16";

    static {
        t2o.a(966787083);
    }

    public static boolean enableUpload(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("10ee5641", new Object[]{context})).booleanValue();
        }
        try {
            return !context.getFileStreamPath(AUDID_NOT_UPLOAD).exists();
        } catch (Exception unused) {
            return true;
        }
    }

    private static String getAppUtdidFilePath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("69562083", new Object[0]);
        }
        Context context = Variables.getInstance().getContext();
        String str = getUtdidAppRootFileDir(context) + File.separator + UTDID_FILE_APPUTDID;
        UtdidLogger.sd("", str);
        return str;
    }

    private static String getAudidFilePath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("346b13c3", new Object[0]);
        }
        if (!PermissionUtils.checkStoragePermissionGranted(Variables.getInstance().getContext())) {
            return null;
        }
        return getUtdidSdcardRootFileDir() + File.separator + AUDID_FILE_NAME;
    }

    public static String getEcdidUtdidPath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("26e6c69f", new Object[0]);
        }
        Context context = Variables.getInstance().getContext();
        return getUtdidAppRootFileDir(context) + File.separator + UTDID_FILE_ECDID_UTDID;
    }

    public static String getFileLockPath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ccc4e437", new Object[0]);
        }
        Context context = Variables.getInstance().getContext();
        return getUtdidAppRootFileDir(context) + File.separator + UTDID_FILE_LOCK;
    }

    private static String getSdcardUtdidFilePath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c7a6d66f", new Object[0]);
        }
        if (!PermissionUtils.checkStoragePermissionGranted(Variables.getInstance().getContext())) {
            return null;
        }
        return getUtdidSdcardRootFileDir() + File.separator + UTDID_FILE_UTDID;
    }

    public static String getSyncUtdidFileLockPath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79437dbe", new Object[0]);
        }
        Context context = Variables.getInstance().getContext();
        return getUtdidAppRootFileDir(context) + File.separator + UTDID_FILE_SYNCUTDIDLOCK;
    }

    private static String getUtdidAppRootFileDir(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cb8eeb57", new Object[]{context});
        }
        String str = context.getFilesDir().getAbsolutePath() + File.separator + UTDID_FILE_DIR;
        UtdidLogger.sd("", "UtdidAppRoot dir:" + str);
        FileUtils.isDirExist(str);
        return str;
    }

    public static String getUtdidFromSettings(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a8278436", new Object[]{context});
        }
        if (PhoneInfoUtils.isPrivacyMode()) {
            return "";
        }
        try {
            return Settings.System.getString(context.getContentResolver(), UTDID_FILE_UTDID);
        } catch (Exception unused) {
            return null;
        }
    }

    private static String getUtdidSdcardRootFileDir() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1dffc995", new Object[0]);
        }
        String str = Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator + AUDID_FILE_DIR;
        UtdidLogger.sd("", "SdcardRoot dir:" + str);
        FileUtils.isDirExist(str);
        return str;
    }

    public static String readAppUtdidFile() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fc17d8e8", new Object[0]);
        }
        try {
            return FileUtils.readFile(getAppUtdidFilePath());
        } catch (Exception unused) {
            return null;
        }
    }

    public static String readAudidFile() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("967248a8", new Object[0]);
        }
        try {
            String audidFilePath = getAudidFilePath();
            if (!TextUtils.isEmpty(audidFilePath)) {
                String readFile = FileUtils.readFile(audidFilePath);
                if (!TextUtils.isEmpty(readFile) && readFile.length() != 32) {
                    if (readFile.length() != 36) {
                        return null;
                    }
                }
                return readFile;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static String readSdcardUtdidFile() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7d559154", new Object[0]);
        }
        if (PhoneInfoUtils.isSdcardPrivacyMode()) {
            return "";
        }
        try {
            String sdcardUtdidFilePath = getSdcardUtdidFilePath();
            if (!TextUtils.isEmpty(sdcardUtdidFilePath)) {
                return FileUtils.readFile(sdcardUtdidFilePath);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static void writeAppUtdidFile(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f13ffa8b", new Object[]{str});
            return;
        }
        try {
            UtdidLogger.d();
            FileUtils.saveFile(getAppUtdidFilePath(), str);
        } catch (Throwable unused) {
        }
    }

    public static void writeAudidFile(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9accf59", new Object[]{str});
            return;
        }
        try {
            UtdidLogger.sd("", "audid:" + str);
            String audidFilePath = getAudidFilePath();
            if (TextUtils.isEmpty(audidFilePath)) {
                return;
            }
            if (TextUtils.isEmpty(str) || str.length() == 32 || str.length() == 36) {
                FileUtils.saveFile(audidFilePath, str);
            }
        } catch (Exception unused) {
        }
    }

    public static void writeSdcardUtdidFile(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb058eed", new Object[]{str});
        } else if (!PhoneInfoUtils.isSdcardPrivacyMode()) {
            try {
                String sdcardUtdidFilePath = getSdcardUtdidFilePath();
                if (!TextUtils.isEmpty(sdcardUtdidFilePath)) {
                    FileUtils.saveFile(sdcardUtdidFilePath, str);
                }
            } catch (Exception unused) {
            }
        }
    }

    public static void writeUtdidToSettings(Context context, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6408b4c", new Object[]{context, str});
        } else if (!PhoneInfoUtils.isPrivacyMode()) {
            try {
                str2 = Settings.System.getString(context.getContentResolver(), UTDID_FILE_UTDID);
            } catch (Exception unused) {
                str2 = null;
            }
            if (!str.equals(str2)) {
                try {
                    Settings.System.putString(context.getContentResolver(), UTDID_FILE_UTDID, str);
                } catch (Exception unused2) {
                }
            }
        }
    }
}
