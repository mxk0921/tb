package tb;

import com.alibaba.analytics.core.db.annotation.Column;
import com.alibaba.analytics.core.db.annotation.Ingore;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class zht extends rf8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    @Ingore
    public static final String TAG_ACCESS = "access";
    @Ingore
    public static final String TAG_ACCESSSUBTYPE = "sub_access";
    @Ingore
    public static final String TAG_COMMITTIME = "commit_time";
    @Ingore
    public static final String TAG_MODULE = "module";
    @Ingore
    public static final String TAG_MONITOR_POINT = "monitor_point";
    @Column(TAG_ACCESS)
    public String access;
    @Column(TAG_ACCESSSUBTYPE)
    public String accessSubType;
    @Column(TAG_COMMITTIME)
    public long commitTime;
    @Column("module")
    public String module;
    @Column(TAG_MONITOR_POINT)
    public String monitorPoint;

    static {
        t2o.a(962593050);
    }

    public zht() {
    }

    public static /* synthetic */ Object ipc$super(zht zhtVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/appmonitor/offline/TempEvent");
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "TempEvent{}";
    }

    public zht(String str, String str2, String str3, String str4) {
        this.module = str;
        this.monitorPoint = str2;
        this.commitTime = System.currentTimeMillis() / 1000;
        this.access = str3;
        this.accessSubType = str4;
    }
}
