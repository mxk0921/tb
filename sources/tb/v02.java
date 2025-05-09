package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class v02 implements u02 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f29708a;

    static {
        t2o.a(681574402);
        t2o.a(681574401);
    }

    public v02(Context context) {
        this.f29708a = context;
    }

    public File a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("57159ad1", new Object[]{this, str, str2});
        }
        try {
            return new jcq(this.f29708a, true, str2).E(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
