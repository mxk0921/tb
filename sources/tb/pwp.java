package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.stat.IUploadStats;
import mtopsdk.mtop.upload.domain.UploadConstants;
import org.android.agoo.common.AgooConstants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class pwp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile IUploadStats f26363a = null;
    public static volatile AtomicBoolean b = new AtomicBoolean(false);

    static {
        t2o.a(589300081);
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58d72ecd", new Object[]{str, str2, str3});
        } else if (f26363a != null) {
            if (b.compareAndSet(false, true)) {
                b();
            }
            HashMap hashMap = new HashMap();
            hashMap.put("type", str);
            hashMap.put("errorcode", str2);
            hashMap.put(AgooConstants.MESSAGE_FLAG, str3);
            if (f26363a != null) {
                f26363a.onCommit(UploadConstants.UPLOAD_MODULE, "signException", hashMap, null);
            }
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d98b9a43", new Object[0]);
            return;
        }
        HashSet hashSet = new HashSet();
        hashSet.add("type");
        hashSet.add("errorcode");
        hashSet.add(AgooConstants.MESSAGE_FLAG);
        if (f26363a != null) {
            f26363a.onRegister(UploadConstants.UPLOAD_MODULE, "signException", hashSet, null, false);
        }
    }

    public static void c(IUploadStats iUploadStats) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85e0e6c7", new Object[]{iUploadStats});
            return;
        }
        f26363a = iUploadStats;
        TBSdkLog.i("mtopsdk.SignStatistics", "set IUploadStats =" + iUploadStats);
    }
}
