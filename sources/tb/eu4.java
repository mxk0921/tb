package tb;

import com.alibaba.wireless.aliprivacyext.track.model.TrackLog;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class eu4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final mrb f18815a;

    static {
        try {
            f18815a = (mrb) TrackLog.class.newInstance();
        } catch (Throwable unused) {
        }
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf01b06e", new Object[]{str, str2, str3});
            return;
        }
        mrb mrbVar = f18815a;
        if (mrbVar != null) {
            mrbVar.trackGetScenePermissionLog(str, str2, str3);
        }
    }

    public static void b(String str, String str2, int i, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4950d04f", new Object[]{str, str2, new Integer(i), str3});
            return;
        }
        mrb mrbVar = f18815a;
        if (mrbVar != null) {
            mrbVar.trackRemoteAuthGrantedLog(str, str2, i, str3);
        }
    }

    public static void c(String str, String str2, int i, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("570eb6f5", new Object[]{str, str2, new Integer(i), str3});
            return;
        }
        mrb mrbVar = f18815a;
        if (mrbVar != null) {
            mrbVar.trackSetScenePermissionLog(str, str2, i, str3);
        }
    }
}
