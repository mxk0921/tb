package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.h1p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class ua8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ua8 INSTANCE = new ua8();

    static {
        t2o.a(815793480);
    }

    public final boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52fd98ee", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        String[] r = o4p.r();
        ckf.d(r);
        if (r.length == 0) {
            return false;
        }
        if (ic1.B(r, "allow_all_channel")) {
            return true;
        }
        return ic1.B(r, str);
    }

    public final boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("17e29955", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        String[] q = o4p.q();
        ckf.d(q);
        if (q.length == 0) {
            return false;
        }
        if (ic1.B(q, "allow_all_channel")) {
            return true;
        }
        return ic1.B(q, str);
    }

    public final boolean c(Boolean bool, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ccdbe49", new Object[]{this, bool, str})).booleanValue();
        }
        if (bool == null || ckf.b(bool, Boolean.FALSE) || TextUtils.isEmpty(str)) {
            return true;
        }
        return h1p.b.a(str);
    }
}
