package tb;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSAppMonitor;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class zq2 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int PATCH_ERROR_DOWNLOAD = 1;
    public static final int PATCH_ERROR_INSTALL_EMPTY = 2;
    public static final int PATCH_ERROR_NO = 0;
    public static final int PATCH_ERROR_OTHER = 4;
    public static final int PATCH_ERROR_UNINSTALL = 3;
    public static zq2 b;

    /* renamed from: a  reason: collision with root package name */
    public final List<a> f32942a = new CopyOnWriteArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
        void onPatchFailure(String str, boolean z);

        void onPatchSuccess(String str, boolean z);
    }

    public static void a(boolean z, String str, long j, int i, String str2, long j2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("159f6c18", new Object[]{new Boolean(z), str, new Long(j), new Integer(i), str2, new Long(j2)});
            return;
        }
        DimensionValueSet value = DimensionValueSet.create().setValue("toVersion", String.valueOf(j2)).setValue(v4s.PARAM_UPLOAD_STAGE, str).setValue("cost", String.valueOf(j));
        if (z) {
            str3 = "true";
        } else {
            str3 = "false";
        }
        AppMonitor.Stat.commit("update_cppinlinepatch", "cppinlinepatch", value.setValue("success", str3).setValue("error_code", String.valueOf(i)).setValue(MUSAppMonitor.ERROR_MSG, str2), MeasureValueSet.create());
    }

    public static void onPatchStageFailure(String str, long j, int i, String str2, long j2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b89a005f", new Object[]{str, new Long(j), new Integer(i), str2, new Long(j2), new Boolean(z)});
        } else {
            a(false, str, j, i, str2, j2);
        }
    }

    public static void onPatchStageSuccess(String str, long j, int i, String str2, long j2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d931fd58", new Object[]{str, new Long(j), new Integer(i), str2, new Long(j2), new Boolean(z)});
        } else {
            a(true, str, j, i, str2, j2);
        }
    }

    public static void onPatchSuccess(long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a74ef9f1", new Object[]{new Long(j), new Boolean(z)});
            return;
        }
        List<a> list = sharedInstance().f32942a;
        if (list != null) {
            Iterator it = ((CopyOnWriteArrayList) list).iterator();
            while (it.hasNext()) {
                ((a) it.next()).onPatchSuccess(String.valueOf(j), z);
            }
        }
    }

    public static zq2 sharedInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zq2) ipChange.ipc$dispatch("9a186306", new Object[0]);
        }
        if (b == null) {
            synchronized (zq2.class) {
                try {
                    if (b == null) {
                        b = new zq2();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public void registerCPPInlinePatchListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69159ab1", new Object[]{this, aVar});
        } else {
            ((CopyOnWriteArrayList) this.f32942a).add(aVar);
        }
    }

    static {
        t2o.a(948961286);
        AppMonitor.register("update_cppinlinepatch", "cppinlinepatch", MeasureSet.create(), DimensionSet.create().addDimension("toVersion").addDimension(v4s.PARAM_UPLOAD_STAGE).addDimension("cost").addDimension("success").addDimension("error_code").addDimension(MUSAppMonitor.ERROR_MSG));
    }
}
