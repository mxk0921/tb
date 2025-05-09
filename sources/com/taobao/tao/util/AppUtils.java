package com.taobao.tao.util;

import android.app.NotificationManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.tao.Globals;
import com.taobao.tao.TrackBuried;
import com.ut.mini.UTAnalytics;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import tb.c2v;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AppUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(775946411);
    }

    public static void copyfile(String str, String str2) throws Exception {
        Throwable th;
        FileOutputStream fileOutputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60101f8c", new Object[]{str, str2});
            return;
        }
        File file = new File(str);
        File file2 = new File(str2);
        if (file2.exists()) {
            file2.delete();
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = fileInputStream2.read(bArr);
                        if (read > 0) {
                            fileOutputStream.write(bArr, 0, read);
                        } else {
                            fileInputStream2.close();
                            fileOutputStream.close();
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }

    public static void fromPointTBS(Intent intent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36a90fad", new Object[]{intent, str});
        } else if (!TextUtils.isEmpty(str) && intent != null) {
            try {
                if (intent.getData() == null && TextUtils.isEmpty(intent.getStringExtra(Constants.MYBROWSERURL))) {
                    return;
                }
                Uri data = intent.getData();
                if (data == null) {
                    String stringExtra = intent.getStringExtra(Constants.MYBROWSERURL);
                    if (!TextUtils.isEmpty(stringExtra)) {
                        data = Uri.parse(stringExtra);
                    }
                }
                if (data != null) {
                    String queryParameter = data.getQueryParameter("point");
                    String queryParameter2 = data.getQueryParameter("nav_source_id");
                    new StringBuilder("frompoint:name").append(queryParameter);
                    String queryParameter3 = data.getQueryParameter(DispatchConstants.CARRIER);
                    if (!TextUtils.isEmpty(queryParameter3)) {
                        TrackBuried.carrier = queryParameter3;
                    }
                    if (!TextUtils.isEmpty(queryParameter)) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("_sb", queryParameter);
                        UTAnalytics.getInstance().updateSessionProperties(hashMap);
                        c2v.getInstance().updatePageProperties(hashMap);
                        Map map = (Map) JSON.parseObject(queryParameter, Map.class);
                        if (map != null && map.containsKey("ttid")) {
                            TrackBuried.bdid = (String) map.get("ttid");
                        }
                        if (TextUtils.isEmpty(TrackBuried.bdid)) {
                            TrackBuried.bdid = data.getQueryParameter("ttid");
                        }
                    }
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("nav_source_id", queryParameter2);
                        c2v.getInstance().updatePageProperties(hashMap2);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static String getVersionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f011eacc", new Object[0]);
        }
        try {
            return Globals.getApplication().getPackageManager().getPackageInfo(Globals.getApplication().getPackageName(), 0).versionName;
        } catch (Exception e) {
            e.printStackTrace();
            return "1.0.0";
        }
    }

    public static Boolean isExistsSD() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("32097dfb", new Object[0]);
        }
        if (Environment.getExternalStorageState().equals("mounted")) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public static void removeNotify(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df9028f", new Object[]{new Integer(i)});
        } else {
            ((NotificationManager) Globals.getApplication().getSystemService(RemoteMessageConst.NOTIFICATION)).cancel(i);
        }
    }

    public static void unZipSelectedFiles(String str, String str2, String str3) throws ZipException, IOException {
        FileChannel fileChannel;
        Throwable th;
        FileOutputStream fileOutputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a5d69d9", new Object[]{str, str2, str3});
            return;
        }
        ZipFile zipFile = new ZipFile(str);
        try {
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            while (entries.hasMoreElements()) {
                ZipEntry zipEntry = (ZipEntry) entries.nextElement();
                if (zipEntry.getName().contains("../")) {
                    break;
                } else if (zipEntry.getName().startsWith(str3)) {
                    File file = new File(str2, TextUtils.substring(zipEntry.getName(), zipEntry.getName().lastIndexOf("/") + 1, zipEntry.getName().length()));
                    if (!file.exists()) {
                        file.getParentFile().mkdirs();
                        file.createNewFile();
                    }
                    InputStream inputStream = null;
                    FileChannel fileChannel2 = null;
                    try {
                        InputStream inputStream2 = zipFile.getInputStream(zipEntry);
                        try {
                            fileOutputStream = new FileOutputStream(file);
                            try {
                                fileChannel2 = fileOutputStream.getChannel();
                                byte[] bArr = new byte[1024];
                                while (true) {
                                    int read = inputStream2.read(bArr);
                                    if (read > 0) {
                                        fileChannel2.write(ByteBuffer.wrap(bArr, 0, read));
                                    } else {
                                        try {
                                            break;
                                        } catch (Exception e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }
                                inputStream2.close();
                                if (fileChannel2 != null) {
                                    try {
                                        fileChannel2.close();
                                    } catch (Exception e2) {
                                        e2.printStackTrace();
                                    }
                                }
                                try {
                                    fileOutputStream.close();
                                } catch (Exception e3) {
                                    e3.printStackTrace();
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                fileChannel = fileChannel2;
                                inputStream = inputStream2;
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (Exception e4) {
                                        e4.printStackTrace();
                                    }
                                }
                                if (fileChannel != null) {
                                    try {
                                        fileChannel.close();
                                    } catch (Exception e5) {
                                        e5.printStackTrace();
                                    }
                                }
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (Exception e6) {
                                        e6.printStackTrace();
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            fileChannel = null;
                            fileOutputStream = null;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        fileChannel = null;
                        fileOutputStream = null;
                    }
                }
            }
        } finally {
            zipFile.close();
        }
    }
}
