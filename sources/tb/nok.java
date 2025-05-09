package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class nok {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "OldDBTransferMgr";

    /* renamed from: a  reason: collision with root package name */
    public static final String f24863a = "usertrack.db";

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7022ea09", new Object[0]);
        }
        return f24863a;
    }

    static {
        t2o.a(962592860);
    }
}
