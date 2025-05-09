package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.utl.ALog;
import tb.bxf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class z1r extends at1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(343933295);
    }

    public static /* synthetic */ Object ipc$super(z1r z1rVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/agoo/control/data/SyncDO");
    }

    public static byte[] a(String str, String str2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("307d3154", new Object[]{str, str2, new Integer(i), new Integer(i2)});
        }
        try {
            return new bxf.a().d("targetService", str).d("streamId", str2).b("fromStreamSeqNum", Integer.valueOf(i)).b("toStreamSeqNum", Integer.valueOf(i2)).a().toString().getBytes("utf-8");
        } catch (Throwable th) {
            ALog.e("SyncDO", "buildData err", th, new Object[0]);
            return null;
        }
    }
}
