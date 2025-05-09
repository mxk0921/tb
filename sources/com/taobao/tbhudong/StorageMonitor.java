package com.taobao.tbhudong;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.asp.d;
import com.taobao.login4android.api.Login;
import com.ut.device.UTDevice;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders$UTCustomHitBuilder;
import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import tb.aal;
import tb.aqa;
import tb.c21;
import tb.djn;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class StorageMonitor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class StorageData implements Serializable {
        @JSONField(name = "isDirectory")
        public boolean isDirectory;
        @JSONField(name = "name")
        public String name;
        @JSONField(name = "totalSize")
        public long totalSize;

        private StorageData() {
        }
    }

    public static long a(File file) {
        long a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9b297981", new Object[]{file})).longValue();
        }
        File[] listFiles = file.listFiles();
        long j = 0;
        if (listFiles == null) {
            return 0L;
        }
        for (File file2 : listFiles) {
            if (file2.isFile()) {
                a2 = file2.length();
            } else {
                a2 = a(file2);
            }
            j += a2;
        }
        return j;
    }

    public static String b(File file, File file2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("755df73e", new Object[]{file, file2, str});
        }
        String str2 = "";
        if (file == null || !file.exists()) {
            return str2;
        }
        String absolutePath = file.getAbsolutePath();
        if (file2 != null && file2.exists()) {
            str2 = file2.getAbsolutePath();
        }
        if (TextUtils.isEmpty(absolutePath) || TextUtils.isEmpty(str2) || !absolutePath.startsWith(str2)) {
            return absolutePath;
        }
        return str + absolutePath.substring(str2.length());
    }

    public static long c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b1efeda9", new Object[0])).longValue();
        }
        return djn.a(aal.STORAGE_MONITOR_MIN_SIZE_KEY, d.c.ALARM_SIZE);
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7726199", new Object[0])).booleanValue();
        }
        return "mounted".equals(Environment.getExternalStorageState());
    }

    public static Map<String, String> f(Context context, File file, String str, String str2) {
        int i;
        HashMap hashMap;
        int i2;
        File[] fileArr;
        boolean z;
        long j;
        String str3;
        int i3;
        HashMap hashMap2;
        int i4;
        File[] fileArr2;
        int i5;
        String str4;
        boolean z2;
        long j2;
        long length;
        int i6;
        String str5;
        String str6 = str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f7f487a7", new Object[]{context, file, str, str6});
        }
        if (context == null || file == null) {
            return null;
        }
        try {
            HashMap hashMap3 = new HashMap(2);
            JSONObject jSONObject = new JSONObject();
            long c = c();
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return null;
            }
            int length2 = listFiles.length;
            int i7 = 0;
            int i8 = 0;
            while (i7 < length2) {
                File file2 = listFiles[i7];
                boolean isDirectory = file2.isDirectory();
                if (isDirectory) {
                    File[] listFiles2 = file2.listFiles();
                    if (listFiles2 == null) {
                        str3 = str6;
                        hashMap = hashMap3;
                        fileArr = listFiles;
                        i2 = length2;
                        i = i7;
                        i7 = i + 1;
                        str6 = str3;
                        listFiles = fileArr;
                        length2 = i2;
                        hashMap3 = hashMap;
                    } else {
                        int length3 = listFiles2.length;
                        long j3 = 0;
                        int i9 = 0;
                        z = false;
                        while (i9 < length3) {
                            File file3 = listFiles2[i9];
                            boolean isDirectory2 = file3.isDirectory();
                            if (isDirectory2) {
                                fileArr2 = listFiles;
                                File[] listFiles3 = file3.listFiles();
                                if (listFiles3 == null) {
                                    str4 = str6;
                                    hashMap2 = hashMap3;
                                    i4 = length2;
                                    i3 = i7;
                                    i5 = 1;
                                    i9 += i5;
                                    length3 = length3;
                                    str6 = str4;
                                    listFiles2 = listFiles2;
                                    listFiles = fileArr2;
                                    length2 = i4;
                                    hashMap3 = hashMap2;
                                    i7 = i3;
                                } else {
                                    i4 = length2;
                                    int length4 = listFiles3.length;
                                    hashMap2 = hashMap3;
                                    long j4 = 0;
                                    int i10 = 0;
                                    z2 = false;
                                    while (i10 < length4) {
                                        File file4 = listFiles3[i10];
                                        StorageData storageData = new StorageData();
                                        if (file4.isDirectory()) {
                                            storageData.isDirectory = true;
                                            length = a(file4) / 1024;
                                        } else {
                                            storageData.isDirectory = false;
                                            length = file4.length() / 1024;
                                        }
                                        j4 += length;
                                        storageData.name = file4.getName();
                                        storageData.totalSize = length;
                                        if (length > c) {
                                            str5 = str2;
                                            jSONObject.put(b(file4, file, str5), (Object) JSON.toJSONString(storageData));
                                            i6 = 1;
                                            z2 = true;
                                        } else {
                                            str5 = str2;
                                            i6 = 1;
                                        }
                                        i10 += i6;
                                        str6 = str5;
                                        length4 = length4;
                                        listFiles3 = listFiles3;
                                        i7 = i7;
                                    }
                                    str4 = str6;
                                    i3 = i7;
                                    j2 = j4;
                                }
                            } else {
                                str4 = str6;
                                hashMap2 = hashMap3;
                                fileArr2 = listFiles;
                                i4 = length2;
                                i3 = i7;
                                j2 = file3.length() / 1024;
                                z2 = false;
                            }
                            j3 += j2;
                            if (j2 > c) {
                                if (!z2) {
                                    StorageData storageData2 = new StorageData();
                                    storageData2.name = file3.getName();
                                    storageData2.totalSize = j2;
                                    storageData2.isDirectory = isDirectory2;
                                    jSONObject.put(b(file3, file, str4), (Object) JSON.toJSONString(storageData2));
                                }
                                i5 = 1;
                                z = true;
                                i9 += i5;
                                length3 = length3;
                                str6 = str4;
                                listFiles2 = listFiles2;
                                listFiles = fileArr2;
                                length2 = i4;
                                hashMap3 = hashMap2;
                                i7 = i3;
                            }
                            i5 = 1;
                            i9 += i5;
                            length3 = length3;
                            str6 = str4;
                            listFiles2 = listFiles2;
                            listFiles = fileArr2;
                            length2 = i4;
                            hashMap3 = hashMap2;
                            i7 = i3;
                        }
                        str3 = str6;
                        hashMap = hashMap3;
                        fileArr = listFiles;
                        i2 = length2;
                        i = i7;
                        j = j3;
                    }
                } else {
                    str3 = str6;
                    hashMap = hashMap3;
                    fileArr = listFiles;
                    i2 = length2;
                    i = i7;
                    j = file2.length() / 1024;
                    z = false;
                }
                if (j > c && !z) {
                    StorageData storageData3 = new StorageData();
                    storageData3.name = file2.getName();
                    storageData3.totalSize = j;
                    storageData3.isDirectory = isDirectory;
                    jSONObject.put(b(file2, file, str3), (Object) JSON.toJSONString(storageData3));
                }
                i8 = (int) (i8 + j);
                i7 = i + 1;
                str6 = str3;
                listFiles = fileArr;
                length2 = i2;
                hashMap3 = hashMap;
            }
            hashMap3.put(str + "Storage", jSONObject.toJSONString());
            hashMap3.put(str + "TotalUsedSize", String.valueOf(i8));
            return hashMap3;
        } catch (Throwable th) {
            aqa.c("StorageMonitor.trackStorageInPath.error.", th);
            return null;
        }
    }

    public static void e(Context context) {
        StatFs statFs;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ad2c71", new Object[]{context});
        } else if (context != null) {
            try {
                if (c21.g().getBoolean("isFullNewInstall", false)) {
                    aqa.b("StorageMonitor.trackJson.isFullNewInstall.return.", new Object[0]);
                    return;
                }
                File parentFile = context.getCacheDir().getParentFile();
                Map<String, String> f = f(context, parentFile, "inner", "/InnerStorage");
                if (f != null) {
                    String str = f.get("innerTotalUsedSize");
                    long j = 0;
                    long parseLong = !TextUtils.isEmpty(str) ? Long.parseLong(str) : 0L;
                    aqa.b("StorageMonitor.trackJson.innerTrackMap === %s", f.toString());
                    HashMap hashMap = new HashMap(f);
                    if (d()) {
                        Map<String, String> f2 = f(context, context.getExternalCacheDir(), "externalCache", "/ExternalCacheDir");
                        if (f2 != null) {
                            String str2 = f2.get("externalCacheTotalUsedSize");
                            long parseLong2 = parseLong + (!TextUtils.isEmpty(str2) ? Long.parseLong(str2) : 0L);
                            aqa.b("StorageMonitor.trackJson.externalCacheTrackMap === %s", f2.toString());
                            hashMap.putAll(f2);
                            Map<String, String> f3 = f(context, context.getExternalFilesDir(null), "externalFiles", "/ExternalFilesDir");
                            if (f3 != null) {
                                String str3 = f3.get("externalFilesTotalUsedSize");
                                if (!TextUtils.isEmpty(str3)) {
                                    j = Long.parseLong(str3);
                                }
                                parseLong = parseLong2 + j;
                                aqa.b("StorageMonitor.trackJson.externalFilesTrackMap === %s", f3.toString());
                                hashMap.putAll(f3);
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    hashMap.put("totalUsedSize", String.valueOf(parseLong));
                    long blockSize = new StatFs(parentFile.getAbsolutePath()).getBlockSize();
                    hashMap.put("storageTotalSpace", String.valueOf((statFs.getBlockCount() * blockSize) / 1024));
                    hashMap.put("storageFreeSpace", String.valueOf((statFs.getAvailableBlocks() * blockSize) / 1024));
                    hashMap.put("userId", Login.getUserId());
                    hashMap.put("utdid", UTDevice.getUtdid(context));
                    UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder = new UTHitBuilders$UTCustomHitBuilder("storage_monitor");
                    uTHitBuilders$UTCustomHitBuilder.setEventPage("storage_monitor");
                    uTHitBuilders$UTCustomHitBuilder.setProperties(hashMap);
                    UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder.build());
                }
            } catch (Throwable th) {
                aqa.c("StorageMonitor.trackStorage.error.", th);
            }
        }
    }
}
