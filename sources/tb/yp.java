package tb;

import android.util.Log;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.AppMonitorStatTable;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class yp implements xp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final AppMonitorStatTable f32251a;

    public yp() {
        AppMonitorStatTable appMonitorStatTable = new AppMonitorStatTable("AliVfsSDK", "Cache");
        this.f32251a = appMonitorStatTable;
        MeasureSet create = MeasureSet.create();
        create.addMeasure("DiskCost");
        DimensionSet create2 = DimensionSet.create();
        create2.addDimension("Cache");
        create2.addDimension(pg1.ATOM_Module);
        create2.addDimension("Operation");
        create2.addDimension("HitMemory");
        create2.addDimension("MemoryCache");
        appMonitorStatTable.registerRowAndColumn(create2, create, false);
    }

    public static String d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("af6ef699", new Object[]{str, str2});
        }
        return c(str) + e(str2);
    }

    public static String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1d38c1cd", new Object[]{str});
        }
        str.hashCode();
        if (str.equals("read")) {
            return "Read";
        }
        if (str.equals("write")) {
            return "Write";
        }
        throw new IllegalArgumentException("Unknown URL: ".concat(str));
    }

    @Override // tb.xp
    public void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75d3bfbc", new Object[]{this, str, new Boolean(z)});
        } else if (z) {
            AppMonitor.Alarm.commitSuccess("AliVfsSDK", "MemoryCacheHitRate", str);
        } else {
            AppMonitor.Alarm.commitFail("AliVfsSDK", "MemoryCacheHitRate", str, null, null);
        }
    }

    @Override // tb.xp
    public void b(azi aziVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("826d37f7", new Object[]{this, aziVar});
            return;
        }
        try {
            String d = d(aziVar.b, aziVar.e);
            int i = aziVar.d;
            if (i == 0) {
                AppMonitor.Alarm.commitSuccess("AliVfsSDK", d, aziVar.f16090a);
                DimensionValueSet create = DimensionValueSet.create();
                create.setValue("Cache", aziVar.b);
                create.setValue(pg1.ATOM_Module, aziVar.f16090a);
                create.setValue("Operation", aziVar.e);
                create.setValue("HitMemory", String.valueOf(aziVar.g));
                create.setValue("MemoryCache", String.valueOf(aziVar.f));
                MeasureValueSet create2 = MeasureValueSet.create();
                create2.setValue("DiskCost", aziVar.h);
                this.f32251a.update(create, create2);
                AppMonitor.Stat.commit("AliVfsSDK", "Cache", create, create2);
            } else {
                AppMonitor.Alarm.commitFail("AliVfsSDK", d, aziVar.f16090a, String.valueOf(i), aziVar.c);
            }
        } catch (Exception e) {
            Log.e("AVFSSDKAppMonitorImpl", e.getMessage(), e);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
        if (r4.equals(tb.azi.CACHE_SQL) == false) goto L_0x0020;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String c(java.lang.String r4) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = tb.yp.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0015
            java.lang.String r3 = "ec2b0292"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r4
            java.lang.Object r4 = r2.ipc$dispatch(r3, r1)
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L_0x0015:
            r4.hashCode()
            r2 = -1
            int r3 = r4.hashCode()
            switch(r3) {
                case 114126: goto L_0x0039;
                case 3143036: goto L_0x002e;
                case 3355087: goto L_0x0022;
                default: goto L_0x0020;
            }
        L_0x0020:
            r0 = -1
            goto L_0x0043
        L_0x0022:
            java.lang.String r0 = "mmap"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x002c
            goto L_0x0020
        L_0x002c:
            r0 = 2
            goto L_0x0043
        L_0x002e:
            java.lang.String r0 = "file"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0037
            goto L_0x0020
        L_0x0037:
            r0 = 1
            goto L_0x0043
        L_0x0039:
            java.lang.String r1 = "sql"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x0043
            goto L_0x0020
        L_0x0043:
            switch(r0) {
                case 0: goto L_0x0058;
                case 1: goto L_0x0055;
                case 2: goto L_0x0052;
                default: goto L_0x0046;
            }
        L_0x0046:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown URL: "
            java.lang.String r4 = r1.concat(r4)
            r0.<init>(r4)
            throw r0
        L_0x0052:
            java.lang.String r4 = "MmapCache"
            return r4
        L_0x0055:
            java.lang.String r4 = "FileCache"
            return r4
        L_0x0058:
            java.lang.String r4 = "SQLiteCache"
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.yp.c(java.lang.String):java.lang.String");
    }
}
