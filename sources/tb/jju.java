package tb;

import android.os.Looper;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.api.TrtcException;
import com.taobao.trtc.utils.TrtcLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class jju {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(395313638);
    }

    public static void a(String str, boolean z) throws TrtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df9298de", new Object[]{str, new Boolean(z)});
        } else if (!z) {
            TrtcLog.i("trtc", str);
            throw new TrtcException(str);
        }
    }

    public static void c(String str) throws TrtcException {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66bb749b", new Object[]{str});
            return;
        }
        String str2 = str + " should run on main thread";
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z = true;
        }
        a(str2, z);
    }

    public static void b(String str, Object... objArr) throws TrtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b56546e", new Object[]{str, objArr});
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = "references is null";
        }
        for (Object obj : objArr) {
            if (obj == null) {
                throw new TrtcException(str);
            } else if ((obj instanceof String) && TextUtils.isEmpty((String) obj)) {
                throw new TrtcException(str);
            }
        }
    }
}
