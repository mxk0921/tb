package com.ta.utdid2.device;

import android.content.Context;
import android.os.Environment;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.audid.Variables;
import com.ta.audid.utils.FileUtils;
import com.ta.audid.utils.MutiProcessLock;
import com.ta.audid.utils.RC4;
import com.ta.audid.utils.UtdidLogger;
import com.ta.utdid2.android.utils.Base64;
import com.ta.utdid2.android.utils.IntUtils;
import com.ta.utdid2.android.utils.PhoneInfoUtils;
import com.ta.utdid2.android.utils.StringUtils;
import com.ta.utdid2.core.persistent.PersistentConfiguration;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Random;
import java.util.regex.Pattern;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import tb.c0z;
import tb.t2o;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class UTUtdid {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String S_GLOBAL_DIR = ".UTSystemConfig";
    private static final String S_GLOBAL_PERSISTENT_CONFIG_DIR;
    private static final String S_GLOBAL_PERSISTENT_CONFIG_KEY = "Alvin2";
    private static final String S_UTDID_DIR;
    private static final String TAG = "UTUtdid";
    private static final int TYPE_CREATE = 6;
    private static final int TYPE_DEFAULT = 0;
    private static final int TYPE_DIR = 4;
    private static final int TYPE_ECDID = 5;
    private static final int TYPE_MYSP = 3;
    private static final int TYPE_OLD = 1;
    public static final int TYPE_SERVER_APP = 7;
    public static final int TYPE_SERVER_SDCARD = 9;
    public static final int TYPE_SERVER_SETTINGS = 8;
    private static final int TYPE_SETTINGS = 2;
    private static final String UM_SETTINGS_STORAGE_NEW = "mqBRboGZkQPcAkyk";
    private static final String UM_SETTINGS_STORAGE_OLD = "dxCRMxhQkdGePGnp";
    private static final int U_SIZE = 18;
    private Context mContext;
    private PersistentConfiguration mPersistentConfiguration;
    private static UTUtdid mInstance = null;
    private static Pattern mPattern = Pattern.compile("[^0-9a-zA-Z=/+]+");
    private static final Object CREATE_LOCK = new Object();
    private static int mType = 0;
    private static String mExtendFactor = "";
    private String mUtdid = null;
    private boolean mInvalidUtdidDir = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface a {
        void syncUtdid();
    }

    static {
        t2o.a(966787130);
        StringBuilder sb = new StringBuilder(S_GLOBAL_DIR);
        String str = File.separator;
        sb.append(str);
        sb.append("Global");
        S_GLOBAL_PERSISTENT_CONFIG_DIR = sb.toString();
        S_UTDID_DIR = ".7934039a" + str + ".u";
    }

    private UTUtdid(Context context) {
        this.mPersistentConfiguration = null;
        this.mContext = context;
        Variables.getInstance().initContext(context);
        this.mPersistentConfiguration = new PersistentConfiguration(context, S_GLOBAL_PERSISTENT_CONFIG_DIR, S_GLOBAL_PERSISTENT_CONFIG_KEY);
    }

    public static /* synthetic */ void access$000(UTUtdid uTUtdid, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56af477f", new Object[]{uTUtdid, str});
        } else {
            uTUtdid.saveUtdidToNewSettings(str);
        }
    }

    public static /* synthetic */ PersistentConfiguration access$100(UTUtdid uTUtdid) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PersistentConfiguration) ipChange.ipc$dispatch("fe854c79", new Object[]{uTUtdid});
        }
        return uTUtdid.mPersistentConfiguration;
    }

    public static /* synthetic */ void access$200(UTUtdid uTUtdid, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a957f201", new Object[]{uTUtdid, str});
        } else {
            uTUtdid.writeUtdidDir(str);
        }
    }

    public static /* synthetic */ String access$300(UTUtdid uTUtdid) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9bd4828", new Object[]{uTUtdid});
        }
        return uTUtdid.readUtdidDir();
    }

    private static String calcHmac(byte[] bArr) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("27a60f76", new Object[]{bArr});
        }
        byte[] bArr2 = {69, 114, 116, -33, 125, -54, ExifInterface.MARKER_APP1, 86, -11, 11, -78, -96, -17, -99, 64, 23, -95, c0z.EVENT_EXPRESSION_INDEX, -82, -64, 113, 116, -16, -103, 49, -30, 9, ExifInterface.MARKER_EOI, 33, -80, -68, -78, -117, 53, 30, -122, 64, -104, 74, -49, 106, 85, -38, -93};
        Mac instance = Mac.getInstance("HmacSHA1");
        instance.init(new SecretKeySpec(RC4.rc4(bArr2), instance.getAlgorithm()));
        return Base64.encodeToString(instance.doFinal(bArr), 2);
    }

    public static int getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5378242a", new Object[0])).intValue();
        }
        return mType;
    }

    private String getUtdidFromNewSettings() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1fc0faa", new Object[]{this});
        }
        if (PhoneInfoUtils.isPrivacyMode()) {
            return "";
        }
        try {
            return Settings.System.getString(this.mContext.getContentResolver(), UM_SETTINGS_STORAGE_NEW);
        } catch (Exception unused) {
            return "";
        }
    }

    private String getValueForUpdate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("95c5ede2", new Object[]{this});
        }
        String readUtdid = readUtdid();
        if (isValidUtdidSimple(readUtdid)) {
            if (TextUtils.isEmpty(readUtdid) || !readUtdid.endsWith("\n")) {
                this.mUtdid = readUtdid;
            } else {
                this.mUtdid = readUtdid.substring(0, readUtdid.length() - 1);
            }
            return this.mUtdid;
        }
        try {
            byte[] generateUtdid = generateUtdid();
            if (generateUtdid == null) {
                return null;
            }
            String encodeToString = Base64.encodeToString(generateUtdid, 2);
            this.mUtdid = encodeToString;
            mType = 6;
            writeNewUtdidAsync(encodeToString);
            return this.mUtdid;
        } catch (Exception e) {
            UtdidLogger.e("", e, new Object[0]);
            return null;
        }
    }

    public static UTUtdid instance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UTUtdid) ipChange.ipc$dispatch("4551d1e8", new Object[]{context});
        }
        if (context != null && mInstance == null) {
            synchronized (CREATE_LOCK) {
                try {
                    if (mInstance == null) {
                        mInstance = new UTUtdid(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return mInstance;
    }

    private static boolean isEqualHmac(byte[] bArr, byte[] bArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40544b0a", new Object[]{bArr, bArr2})).booleanValue();
        }
        if (bArr != null && bArr2 != null && bArr.length == bArr2.length && bArr.length == 4 && bArr[0] == bArr2[0] && bArr[1] == bArr2[1] && bArr[2] == bArr2[2] && bArr[3] == bArr2[3]) {
            return true;
        }
        return false;
    }

    private void saveUtdidToNewSettings(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("957db3f6", new Object[]{this, str});
        } else if (!PhoneInfoUtils.isPrivacyMode() && isValidUtdid(str)) {
            try {
                Settings.System.putString(this.mContext.getContentResolver(), UM_SETTINGS_STORAGE_NEW, str);
            } catch (Exception unused) {
            }
        }
    }

    public static void setExtendFactor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78c2e6dc", new Object[]{str});
        } else if (!StringUtils.isEmpty(str)) {
            mExtendFactor = str;
        }
    }

    public static void setType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77e09620", new Object[]{new Integer(i)});
        } else {
            mType = i;
        }
    }

    public static void startSyncThread(final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7663b2ee", new Object[]{aVar});
        } else {
            new Thread("UtdidSyncThread") { // from class: com.ta.utdid2.device.UTUtdid.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass7 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ta/utdid2/device/UTUtdid$7");
                }

                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        UtdidLogger.d("startSyncThread", new Object[0]);
                    } catch (Throwable unused) {
                    }
                    if (!MutiProcessLock.trylockSyncUtdid()) {
                        MutiProcessLock.releaseSyncUtdid();
                        return;
                    }
                    aVar.syncUtdid();
                    MutiProcessLock.releaseSyncUtdid();
                }
            }.start();
        }
    }

    private void writeSpFromSettingsAsync(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("625bdfa4", new Object[]{this, str});
        } else if (isValidUtdid(str)) {
            startSyncThread(new a() { // from class: com.ta.utdid2.device.UTUtdid.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ta.utdid2.device.UTUtdid.a
                public void syncUtdid() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e9f285ac", new Object[]{this});
                    } else if (!str.equals(UTUtdid.access$100(UTUtdid.this).getUtdidFromSp())) {
                        UTUtdid.access$100(UTUtdid.this).updateUtdidToSp(str);
                    }
                }
            });
        }
    }

    public synchronized String getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5308aa1e", new Object[]{this});
        }
        String str = this.mUtdid;
        if (str != null) {
            return str;
        }
        return getValueForUpdate();
    }

    private byte[] generateUtdid() throws Exception {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("b81fe30b", new Object[]{this});
        }
        UtdidLogger.d(TAG, "generateUtdid");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        int nextInt = new Random().nextInt();
        byte[] bytes = IntUtils.getBytes(currentTimeMillis);
        byte[] bytes2 = IntUtils.getBytes(nextInt);
        byteArrayOutputStream.write(bytes, 0, 4);
        byteArrayOutputStream.write(bytes2, 0, 4);
        byteArrayOutputStream.write(3);
        byteArrayOutputStream.write(0);
        try {
            str = mExtendFactor + PhoneInfoUtils.getImei(this.mContext);
        } catch (Exception unused) {
            str = mExtendFactor + new Random().nextInt();
        }
        byteArrayOutputStream.write(IntUtils.getBytes(StringUtils.hashCode(str)), 0, 4);
        byteArrayOutputStream.write(IntUtils.getBytes(StringUtils.hashCode(calcHmac(byteArrayOutputStream.toByteArray()))));
        return byteArrayOutputStream.toByteArray();
    }

    public static boolean isValidUtdidSimple(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa423595", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.endsWith("\n")) {
            str = str.substring(0, str.length() - 1);
        }
        if (24 == str.length()) {
            return !mPattern.matcher(str).find();
        }
        return false;
    }

    private String getUtdidFromOldSettings() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ffb90c83", new Object[]{this});
        }
        if (PhoneInfoUtils.isPrivacyMode()) {
            return "";
        }
        try {
            str = Settings.System.getString(this.mContext.getContentResolver(), UM_SETTINGS_STORAGE_OLD);
        } catch (Exception unused) {
            str = null;
        }
        try {
            if (!StringUtils.isEmpty(str)) {
                UTUtdidHelper2 uTUtdidHelper2 = new UTUtdidHelper2();
                String dePackWithBase64 = uTUtdidHelper2.dePackWithBase64(str);
                if (isValidUtdid(dePackWithBase64)) {
                    UtdidLogger.d(TAG, "OldSettings_1", dePackWithBase64);
                    saveUtdidToNewSettings(dePackWithBase64);
                    return dePackWithBase64;
                }
                String dePack = uTUtdidHelper2.dePack(str);
                if (isValidUtdid(dePack)) {
                    UtdidLogger.d(TAG, "OldSettings_2", dePack);
                    saveUtdidToNewSettings(dePack);
                    return dePack;
                }
                String dePack2 = new UTUtdidHelper().dePack(str);
                if (isValidUtdid(dePack2)) {
                    UtdidLogger.d(TAG, "OldSettings_3", dePack2);
                    saveUtdidToNewSettings(dePack2);
                    return dePack2;
                }
            }
        } catch (Throwable th) {
            UtdidLogger.se(TAG, th, new Object[0]);
        }
        return "";
    }

    private static boolean mkUtdidDir(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52942b00", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        if (!file.exists()) {
            boolean mkdirs = file.mkdirs();
            UtdidLogger.sd(TAG, "mkUtdidDir path", str, "mkdirs success", Boolean.valueOf(mkdirs));
            return mkdirs;
        }
        UtdidLogger.sd(TAG, "path is exits", str);
        return true;
    }

    private String readUtdid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e1cf27af", new Object[]{this});
        }
        String utdidFromNewSettings = getUtdidFromNewSettings();
        if (isValidUtdid(utdidFromNewSettings)) {
            mType = 2;
            UtdidLogger.d(TAG, "utdid type", 2);
            writeSpFromSettingsAsync(utdidFromNewSettings);
            return utdidFromNewSettings;
        }
        String utdidFromOldSettings = getUtdidFromOldSettings();
        if (isValidUtdid(utdidFromOldSettings)) {
            mType = 2;
            UtdidLogger.d(TAG, "utdid type", 2);
            writeSpFromSettingsAsync(utdidFromOldSettings);
            return utdidFromOldSettings;
        }
        final String utdidFromSp = this.mPersistentConfiguration.getUtdidFromSp();
        if (isValidUtdid(utdidFromSp)) {
            int typeFromSp = this.mPersistentConfiguration.getTypeFromSp();
            if (typeFromSp == 0) {
                mType = 1;
            } else {
                mType = typeFromSp;
            }
            UtdidLogger.d(TAG, "get utdid from sp. type", Integer.valueOf(mType));
            startSyncThread(new a() { // from class: com.ta.utdid2.device.UTUtdid.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ta.utdid2.device.UTUtdid.a
                public void syncUtdid() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e9f285ac", new Object[]{this});
                        return;
                    }
                    UTUtdid.access$000(UTUtdid.this, utdidFromSp);
                    String utdidFromMySp = UTUtdid.access$100(UTUtdid.this).getUtdidFromMySp();
                    if (!UTUtdid.isValidUtdid(utdidFromMySp) && UTUtdid.access$100(UTUtdid.this).copySPToMySP()) {
                        utdidFromMySp = utdidFromSp;
                    }
                    String access$300 = UTUtdid.access$300(UTUtdid.this);
                    if (UTUtdid.isValidUtdid(utdidFromMySp) && !utdidFromMySp.equals(access$300)) {
                        UTUtdid.access$200(UTUtdid.this, utdidFromMySp);
                    }
                    if (UTUtdid.isValidUtdid(EcdidUtils.readUtdidFromEcdid())) {
                        EcdidUtils.sendMessage2();
                    } else {
                        EcdidUtils.writeEcdidUtdidFile(utdidFromSp);
                    }
                }
            });
            return utdidFromSp;
        }
        final String utdidFromMySp = this.mPersistentConfiguration.getUtdidFromMySp();
        if (isValidUtdid(utdidFromMySp)) {
            mType = 3;
            UtdidLogger.d(TAG, "utdid type", 3);
            this.mPersistentConfiguration.copyMySPToSP(mType);
            startSyncThread(new a() { // from class: com.ta.utdid2.device.UTUtdid.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ta.utdid2.device.UTUtdid.a
                public void syncUtdid() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e9f285ac", new Object[]{this});
                        return;
                    }
                    UTUtdid.access$000(UTUtdid.this, utdidFromMySp);
                    String access$300 = UTUtdid.access$300(UTUtdid.this);
                    if (UTUtdid.isValidUtdid(utdidFromMySp) && !utdidFromMySp.equals(access$300)) {
                        UTUtdid.access$200(UTUtdid.this, utdidFromMySp);
                    }
                    if (UTUtdid.isValidUtdid(EcdidUtils.readUtdidFromEcdid())) {
                        EcdidUtils.sendMessage2();
                    } else {
                        EcdidUtils.writeEcdidUtdidFile(utdidFromMySp);
                    }
                }
            });
            return utdidFromMySp;
        }
        final String readUtdidDir = readUtdidDir();
        if (isValidUtdid(readUtdidDir)) {
            mType = 4;
            UtdidLogger.d(TAG, "utdid type", 4);
            this.mPersistentConfiguration.writeUtdidToSp(readUtdidDir, mType);
            startSyncThread(new a() { // from class: com.ta.utdid2.device.UTUtdid.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ta.utdid2.device.UTUtdid.a
                public void syncUtdid() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e9f285ac", new Object[]{this});
                        return;
                    }
                    UTUtdid.access$000(UTUtdid.this, readUtdidDir);
                    UTUtdid.access$100(UTUtdid.this).copySPToMySP();
                    if (UTUtdid.isValidUtdid(EcdidUtils.readUtdidFromEcdid())) {
                        EcdidUtils.sendMessage2();
                    } else {
                        EcdidUtils.writeEcdidUtdidFile(readUtdidDir);
                    }
                }
            });
            return readUtdidDir;
        }
        final String readUtdidFromEcdid = EcdidUtils.readUtdidFromEcdid();
        if (isValidUtdid(readUtdidFromEcdid)) {
            mType = 5;
            UtdidLogger.d(TAG, "utdid type", 5);
            this.mPersistentConfiguration.writeUtdidToSp(readUtdidFromEcdid, mType);
            startSyncThread(new a() { // from class: com.ta.utdid2.device.UTUtdid.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ta.utdid2.device.UTUtdid.a
                public void syncUtdid() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e9f285ac", new Object[]{this});
                        return;
                    }
                    UTUtdid.access$000(UTUtdid.this, readUtdidFromEcdid);
                    UTUtdid.access$100(UTUtdid.this).copySPToMySP();
                    UTUtdid.access$200(UTUtdid.this, readUtdidFromEcdid);
                    EcdidUtils.sendMessage2();
                }
            });
            return readUtdidFromEcdid;
        }
        UtdidLogger.d(TAG, "read utdid is null");
        return null;
    }

    private byte readUtdidSubDir(String str) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("df185394", new Object[]{this, str})).byteValue();
        }
        StringBuilder sb = new StringBuilder(str);
        byte b = 0;
        for (int i2 = 0; i2 < 8; i2++) {
            sb.append(File.separator);
            sb.append("1");
            if (FileUtils.checkFileExistOnly(sb.toString())) {
                i = (b << 1) | 1;
            } else {
                int length = sb.length();
                sb.replace(length - 1, length, "0");
                i = b << 1;
            }
            b = (byte) i;
        }
        String sb2 = sb.toString();
        UtdidLogger.sd(TAG, "readUtdidDir", sb2);
        if (FileUtils.checkFileExistOnly(sb2)) {
            UtdidLogger.sd(TAG, "readUtdidDir b", Byte.valueOf(b));
            return b;
        }
        UtdidLogger.sd(TAG, "readUtdidDir false");
        this.mInvalidUtdidDir = true;
        return (byte) 0;
    }

    private void writeNewUtdidAsync(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a310bce", new Object[]{this, str});
        } else if (isValidUtdid(str)) {
            mType = 6;
            UtdidLogger.d(TAG, "utdid type:", 6);
            this.mPersistentConfiguration.writeUtdidToSp(str, mType);
            startSyncThread(new a() { // from class: com.ta.utdid2.device.UTUtdid.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ta.utdid2.device.UTUtdid.a
                public void syncUtdid() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e9f285ac", new Object[]{this});
                        return;
                    }
                    UTUtdid.access$000(UTUtdid.this, str);
                    UTUtdid.access$100(UTUtdid.this).copySPToMySP();
                    UTUtdid.access$200(UTUtdid.this, str);
                    EcdidUtils.writeEcdidUtdidFile(str);
                }
            });
        }
    }

    public static boolean isValidUtdid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42bf3bc3", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.endsWith("\n")) {
            str = str.substring(0, str.length() - 1);
        }
        if (24 == str.length() && mPattern.matcher(str).find()) {
            return false;
        }
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            byte[] decode = Base64.decode(str, 2);
            if (decode.length == 18) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byteArrayOutputStream.write(decode, 0, 14);
                byte[] bytes = IntUtils.getBytes(StringUtils.hashCode(calcHmac(byteArrayOutputStream.toByteArray())));
                byte[] bArr = new byte[4];
                System.arraycopy(decode, 14, bArr, 0, 4);
                boolean isEqualHmac = isEqualHmac(bArr, bytes);
                if (UtdidLogger.isDebug()) {
                    UtdidLogger.d(TAG, "isValidUtdid utdid", str, "bValid", Boolean.valueOf(isEqualHmac), "cost", Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                }
                return isEqualHmac;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    private void writeUtdidDir(String str) {
        byte[] decode;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32d3cd7d", new Object[]{this, str});
        } else if (!PhoneInfoUtils.isSdcardPrivacyMode()) {
            UtdidLogger.d(TAG, "writeUtdidDir", str);
            long currentTimeMillis = System.currentTimeMillis();
            if (isValidUtdid(str) && (decode = Base64.decode(str, 2)) != null && decode.length == 18) {
                String str2 = Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator + S_UTDID_DIR;
                try {
                    UtdidLogger.se(TAG, "delete baseDir", str2);
                    FileUtils.delete(str2);
                    UtdidLogger.se(TAG, "delete baseDir success");
                    try {
                        StringBuilder sb = new StringBuilder();
                        for (int i = 0; i < 18; i++) {
                            sb.delete(0, sb.length());
                            sb.append(str2);
                            sb.append(File.separator);
                            sb.append("u");
                            sb.append(i);
                            byte b = decode[i];
                            for (int i2 = 0; i2 < 8; i2++) {
                                sb.append(File.separator);
                                sb.append((int) ((byte) (((byte) (b >> (7 - i2))) & 1)));
                            }
                            String sb2 = sb.toString();
                            UtdidLogger.sd(TAG, "mk dir", sb2);
                            if (!mkUtdidDir(sb2)) {
                                UtdidLogger.d(TAG, "writeUtdidDir success", Boolean.FALSE);
                                return;
                            }
                            String valueOf = String.valueOf((int) b);
                            UtdidLogger.sd(TAG, "writeUtdidDir content", valueOf);
                            FileUtils.saveFile(sb2 + "/success", valueOf);
                        }
                        z = true;
                    } catch (Exception e) {
                        UtdidLogger.se(TAG, e, new Object[0]);
                        z = false;
                    }
                    UtdidLogger.d(TAG, "writeUtdidDir success", Boolean.valueOf(z), "cost", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                } catch (Throwable th) {
                    UtdidLogger.se(TAG, "delete baseDir fail");
                    UtdidLogger.se(TAG, th, new Object[0]);
                }
            }
        }
    }

    private String readUtdidDir() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9145dc36", new Object[]{this});
        }
        if (PhoneInfoUtils.isSdcardPrivacyMode()) {
            return "";
        }
        UtdidLogger.d(TAG, "readUtdidDir");
        long currentTimeMillis = System.currentTimeMillis();
        byte[] bArr = new byte[18];
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory().getAbsolutePath());
        String str = File.separator;
        sb.append(str);
        sb.append(S_UTDID_DIR);
        sb.append(str);
        sb.append("u");
        String sb2 = sb.toString();
        int i = 0;
        for (int i2 = 18; i < i2; i2 = 18) {
            String str2 = sb2 + i;
            UtdidLogger.sd(TAG, "uDir", str2);
            if (!FileUtils.checkFileExistOnly(str2)) {
                UtdidLogger.sd(TAG, "checkFileExistOnly", Boolean.FALSE);
                return null;
            }
            byte readUtdidSubDir = readUtdidSubDir(str2);
            bArr[i] = readUtdidSubDir;
            UtdidLogger.sd(TAG, "readUtdidDir", Byte.valueOf(readUtdidSubDir), "mInvalidUtdidDir", Boolean.valueOf(this.mInvalidUtdidDir));
            if (this.mInvalidUtdidDir) {
                return null;
            }
            i++;
        }
        String encodeToString = Base64.encodeToString(bArr, 2);
        UtdidLogger.d(TAG, "readUtdidDir", encodeToString, "cost", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        return encodeToString;
    }
}
