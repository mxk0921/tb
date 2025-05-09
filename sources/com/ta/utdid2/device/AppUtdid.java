package com.ta.utdid2.device;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.audid.Constants;
import com.ta.audid.Variables;
import com.ta.audid.device.AppUtdidDecoder;
import com.ta.audid.device.UtdidObj;
import com.ta.audid.upload.UtdidKeyFile;
import com.ta.audid.upload.UtdidUploadTask;
import com.ta.audid.utils.AppInfoUtils;
import com.ta.audid.utils.MutiProcessLock;
import com.ta.audid.utils.TaskExecutor;
import com.ta.audid.utils.UtdidLogger;
import com.ta.utdid2.device.UTUtdid;
import tb.t2o;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AppUtdid {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "AppUtdid";
    private String mUtdid = "";
    private static final AppUtdid mInstance = new AppUtdid();
    private static long mCollectDelayTime = 30000;

    static {
        t2o.a(966787120);
    }

    private AppUtdid() {
    }

    public static AppUtdid getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppUtdid) ipChange.ipc$dispatch("eaf2ec14", new Object[0]);
        }
        return mInstance;
    }

    public static void setCollectDelayTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("510eb2b5", new Object[]{new Long(j)});
        } else if (j >= 0) {
            mCollectDelayTime = j;
        }
    }

    private void uploadAppUtdid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8a0a587", new Object[]{this});
            return;
        }
        UtdidLogger.d();
        if (!TextUtils.isEmpty(this.mUtdid)) {
            try {
                final Context context = Variables.getInstance().getContext();
                if (AppInfoUtils.isMainProcess(context)) {
                    TaskExecutor.getInstance().schedule(null, new Runnable() { // from class: com.ta.utdid2.device.AppUtdid.4
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else if (!UtdidKeyFile.enableUpload(context)) {
                                UtdidLogger.d("", "unable upload!");
                            } else {
                                new UtdidUploadTask(context).run();
                            }
                        }
                    }, mCollectDelayTime);
                }
            } catch (Throwable th) {
                UtdidLogger.d("", th);
            }
        }
    }

    public synchronized String getCurrentAppUtdid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("73e161f7", new Object[]{this});
        }
        return this.mUtdid;
    }

    public synchronized String getUtdidCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("74e25c21", new Object[]{this});
        } else if (TextUtils.isEmpty(this.mUtdid)) {
            return Constants.UTDID_INVALID;
        } else {
            return this.mUtdid;
        }
    }

    public synchronized String getUtdid(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f7eefe9", new Object[]{this, context});
        } else if (!TextUtils.isEmpty(this.mUtdid)) {
            return this.mUtdid;
        } else {
            MutiProcessLock.lockUtdidFile();
            String v5Utdid = getV5Utdid();
            if (TextUtils.isEmpty(v5Utdid)) {
                v5Utdid = UTUtdid.instance(context).getValue();
            }
            if (!TextUtils.isEmpty(v5Utdid)) {
                this.mUtdid = v5Utdid;
                uploadAppUtdid();
                String str = this.mUtdid;
                MutiProcessLock.releaseUtdidFile();
                return str;
            }
            MutiProcessLock.releaseUtdidFile();
            return Constants.UTDID_INVALID;
        }
    }

    private String getV5Utdid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cf8401ce", new Object[]{this});
        }
        final Context context = Variables.getInstance().getContext();
        if (context == null) {
            return "";
        }
        final String readAppUtdidFile = UtdidKeyFile.readAppUtdidFile();
        if (UTUtdid.isValidUtdid(readAppUtdidFile)) {
            UtdidLogger.d(TAG, "read utdid from V5AppFile");
            UTUtdid.setType(7);
            UTUtdid.startSyncThread(new UTUtdid.a() { // from class: com.ta.utdid2.device.AppUtdid.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ta.utdid2.device.UTUtdid.a
                public void syncUtdid() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e9f285ac", new Object[]{this});
                        return;
                    }
                    UtdidObj decode = AppUtdidDecoder.decode(readAppUtdidFile);
                    String utdidFromSettings = UtdidKeyFile.getUtdidFromSettings(context);
                    if (!TextUtils.isEmpty(utdidFromSettings)) {
                        UtdidObj decode2 = AppUtdidDecoder.decode(utdidFromSettings);
                        if (!decode2.isValid() || decode2.getTimestamp() < decode.getTimestamp()) {
                            UtdidKeyFile.writeUtdidToSettings(context, readAppUtdidFile);
                        }
                    } else {
                        UtdidKeyFile.writeUtdidToSettings(context, readAppUtdidFile);
                    }
                    String readSdcardUtdidFile = UtdidKeyFile.readSdcardUtdidFile();
                    if (!TextUtils.isEmpty(readSdcardUtdidFile)) {
                        UtdidObj decode3 = AppUtdidDecoder.decode(readSdcardUtdidFile);
                        if (!decode3.isValid() || decode3.getTimestamp() < decode.getTimestamp()) {
                            UtdidKeyFile.writeSdcardUtdidFile(readAppUtdidFile);
                            return;
                        }
                        return;
                    }
                    UtdidKeyFile.writeSdcardUtdidFile(readAppUtdidFile);
                }
            });
            return readAppUtdidFile;
        }
        final String utdidFromSettings = UtdidKeyFile.getUtdidFromSettings(context);
        if (UTUtdid.isValidUtdid(utdidFromSettings)) {
            UtdidLogger.d(TAG, "read utdid from V5Settings");
            UTUtdid.setType(8);
            UTUtdid.startSyncThread(new UTUtdid.a() { // from class: com.ta.utdid2.device.AppUtdid.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ta.utdid2.device.UTUtdid.a
                public void syncUtdid() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e9f285ac", new Object[]{this});
                        return;
                    }
                    UtdidKeyFile.writeAppUtdidFile(utdidFromSettings);
                    String readSdcardUtdidFile = UtdidKeyFile.readSdcardUtdidFile();
                    if (!TextUtils.isEmpty(readSdcardUtdidFile)) {
                        UtdidObj decode = AppUtdidDecoder.decode(utdidFromSettings);
                        UtdidObj decode2 = AppUtdidDecoder.decode(readSdcardUtdidFile);
                        if (!decode2.isValid() || decode2.getTimestamp() < decode.getTimestamp()) {
                            UtdidKeyFile.writeSdcardUtdidFile(utdidFromSettings);
                            return;
                        }
                        return;
                    }
                    UtdidKeyFile.writeSdcardUtdidFile(utdidFromSettings);
                }
            });
            return utdidFromSettings;
        }
        final String readSdcardUtdidFile = UtdidKeyFile.readSdcardUtdidFile();
        if (!UTUtdid.isValidUtdid(readSdcardUtdidFile)) {
            return null;
        }
        UtdidLogger.d(TAG, "read utdid from V5Sdcard");
        UTUtdid.setType(9);
        UTUtdid.startSyncThread(new UTUtdid.a() { // from class: com.ta.utdid2.device.AppUtdid.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ta.utdid2.device.UTUtdid.a
            public void syncUtdid() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e9f285ac", new Object[]{this});
                    return;
                }
                UtdidKeyFile.writeAppUtdidFile(readSdcardUtdidFile);
                UtdidKeyFile.writeUtdidToSettings(context, readSdcardUtdidFile);
            }
        });
        return readSdcardUtdidFile;
    }
}
