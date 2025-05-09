package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ps3 implements nrd<Class<? extends x8c>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(682622979);
        t2o.a(676331666);
    }

    /* renamed from: b */
    public Class<? extends x8c> a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("c0898515", new Object[]{this, context, str});
        }
        try {
            return Class.forName(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
