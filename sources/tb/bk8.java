package tb;

import android.content.Context;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.device.UTDevice;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.utl.ALog;
import tb.bxf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class bk8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f16442a = bk8.class.getSimpleName();

    static {
        t2o.a(343933292);
    }

    public static byte[] a(Context context, int i, long j) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("daaf7ab1", new Object[]{context, new Integer(i), new Long(j)});
        }
        try {
            bxf.a d = new bxf.a().b("id", Integer.valueOf(i)).d("utdid", UTDevice.getUtdid(context)).d("appKey", ACCSManager.mDefaultAppkey);
            if (j8l.y(context)) {
                str = j8l.p(context);
            } else {
                str = "";
            }
            return d.d("regId", str).c("happenTime", Long.valueOf(j)).d("type", MspDBHelper.BizEntry.COLUMN_NAME_DEVICE).a().toString().getBytes("utf-8");
        } catch (Throwable th) {
            ALog.e(f16442a, "buildEventData", th, new Object[0]);
            return null;
        }
    }
}
