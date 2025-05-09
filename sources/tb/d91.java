package tb;

import android.app.usage.StorageStats;
import android.app.usage.StorageStatsManager;
import android.content.Context;
import android.os.Process;
import android.os.UserHandle;
import android.os.storage.StorageManager;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.module.builtin.WXStorageModule;
import com.taobao.tao.log.TLog;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import tb.dym;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class d91 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f17658a = {"/oat/arm/base.odex", "/oat/arm/base.vdex", "/oat/arm64/base.odex", "/oat/arm64/base.vdex"};

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements dym.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f17659a;
        public final /* synthetic */ List b;
        public final /* synthetic */ Map c;

        public a(String str, List list, Map map) {
            this.f17659a = str;
            this.b = list;
            this.c = map;
        }

        public void a(dym.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("569e6148", new Object[]{this, bVar});
                return;
            }
            String str = bVar.d;
            if (!str.startsWith(this.f17659a + "/oat") || !this.b.contains(bVar.d)) {
                return;
            }
            if (!this.c.containsKey(bVar.d) || ((dym.b) this.c.get(bVar.d)).c <= bVar.c) {
                this.c.put(bVar.d, bVar);
            }
        }
    }

    static {
        t2o.a(737149028);
    }

    public static long a(Context context, String str) {
        List<Object> storageVolumes;
        String uuid;
        UUID uuid2;
        StorageStats queryStatsForPackage;
        long appBytes;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c4bf981f", new Object[]{context, str})).longValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        StorageStatsManager a2 = v81.a(context.getSystemService("storagestats"));
        StorageManager storageManager = (StorageManager) context.getSystemService(WXStorageModule.NAME);
        long j = 0;
        if (storageManager == null || a2 == null) {
            TLog.loge(yr2.MODULE, "OatDirCalculator", "apkInstallSize: query storage error, storageManager " + storageManager + ", storageStatsManager " + a2);
            s71.i("StorageMgrNoPermission", "");
            return 0L;
        }
        storageVolumes = storageManager.getStorageVolumes();
        UserHandle myUserHandle = Process.myUserHandle();
        try {
            for (Object obj : storageVolumes) {
                uuid = x81.a(obj).getUuid();
                if (uuid == null) {
                    try {
                        uuid2 = StorageManager.UUID_DEFAULT;
                    } catch (Exception unused) {
                        uuid2 = StorageManager.UUID_DEFAULT;
                    }
                } else {
                    uuid2 = UUID.fromString(uuid);
                }
                queryStatsForPackage = a2.queryStatsForPackage(uuid2, str, myUserHandle);
                appBytes = queryStatsForPackage.getAppBytes();
                j += appBytes;
            }
        } catch (Exception e) {
            TLog.loge(yr2.MODULE, "OatDirCalculator", "apkInstallSize: with exception " + e);
        }
        TLog.loge(yr2.MODULE, "OatDirCalculator", "apkInstallSize: consume time " + (System.currentTimeMillis() - currentTimeMillis));
        return j;
    }

    public static long b(Context context, String str) {
        List<Object> storageVolumes;
        String uuid;
        UUID uuid2;
        StorageStats queryStatsForPackage;
        long dataBytes;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("affe6b13", new Object[]{context, str})).longValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        StorageStatsManager a2 = v81.a(context.getSystemService("storagestats"));
        StorageManager storageManager = (StorageManager) context.getSystemService(WXStorageModule.NAME);
        long j = 0;
        if (storageManager == null || a2 == null) {
            TLog.loge(yr2.MODULE, "OatDirCalculator", "appDataSize: query storage error, storageManager " + storageManager + ", storageStatsManager " + a2);
            s71.i("StorageMgrNoPermission", "");
            return 0L;
        }
        storageVolumes = storageManager.getStorageVolumes();
        UserHandle myUserHandle = Process.myUserHandle();
        try {
            for (Object obj : storageVolumes) {
                uuid = x81.a(obj).getUuid();
                if (uuid == null) {
                    try {
                        uuid2 = StorageManager.UUID_DEFAULT;
                    } catch (Exception unused) {
                        uuid2 = StorageManager.UUID_DEFAULT;
                    }
                } else {
                    uuid2 = UUID.fromString(uuid);
                }
                queryStatsForPackage = a2.queryStatsForPackage(uuid2, str, myUserHandle);
                dataBytes = queryStatsForPackage.getDataBytes();
                j += dataBytes;
            }
        } catch (Exception e) {
            TLog.loge(yr2.MODULE, "OatDirCalculator", "appDataSize: with exception " + e);
        }
        TLog.loge(yr2.MODULE, "OatDirCalculator", "apkInstallSize: consume time " + (System.currentTimeMillis() - currentTimeMillis));
        return j;
    }

    public static long c(Context context) {
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("463d7d11", new Object[]{context})).longValue();
        }
        String absolutePath = new File(context.getPackageResourcePath()).getParentFile().getAbsolutePath();
        long j = 0;
        if (TextUtils.isEmpty(absolutePath)) {
            TLog.loge(yr2.MODULE, "OatDirCalculator", "calculateSize: query apk install path wrong, path " + absolutePath);
            return 0L;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : f17658a) {
            arrayList.add(absolutePath + str);
        }
        HashMap hashMap = new HashMap();
        dym.c(new a(absolutePath, arrayList, hashMap));
        for (Map.Entry entry : hashMap.entrySet()) {
            dym.b bVar = (dym.b) entry.getValue();
            j += (bVar.b - bVar.f18157a) + bVar.c;
        }
        return j;
    }
}
