package androidx.core.util;

import android.util.Half;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.mra;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\u0010\n\n\u0002\u0010\u000e\n\u0000\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0003H\u0087\b\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0004H\u0087\b\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0005H\u0087\b¨\u0006\u0006"}, d2 = {"toHalf", "Landroid/util/Half;", "", "", "", "", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class HalfKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final Half toHalf(short s) {
        Half valueOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return mra.a(ipChange.ipc$dispatch("2d861269", new Object[]{new Short(s)}));
        }
        valueOf = Half.valueOf(s);
        return valueOf;
    }

    public static final Half toHalf(float f) {
        Half valueOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return mra.a(ipChange.ipc$dispatch("89c19adc", new Object[]{new Float(f)}));
        }
        valueOf = Half.valueOf(f);
        return valueOf;
    }

    public static final Half toHalf(String str) {
        Half valueOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return mra.a(ipChange.ipc$dispatch("666bffb0", new Object[]{str}));
        }
        valueOf = Half.valueOf(str);
        return valueOf;
    }

    public static final Half toHalf(double d) {
        Half valueOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return mra.a(ipChange.ipc$dispatch("708fafda", new Object[]{new Double(d)}));
        }
        valueOf = Half.valueOf((float) d);
        return valueOf;
    }
}
