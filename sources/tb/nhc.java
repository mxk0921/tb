package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.util.GetAppKeyFromSecurity;
import kotlin.KotlinNothingValueException;
import kotlin.Result;
import kotlin.b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class nhc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1002438791);
    }

    public static final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("49079005", new Object[0]);
        }
        try {
            return GetAppKeyFromSecurity.getAppKey(0);
        } catch (Throwable th) {
            if (Result.m1111exceptionOrNullimpl(Result.m1108constructorimpl(b.a(th))) != null) {
                return null;
            }
            throw new KotlinNothingValueException();
        }
    }
}
