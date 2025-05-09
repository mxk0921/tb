package tb;

import androidx.exifinterface.media.ExifInterface;
import com.ali.user.mobile.app.constant.UTConstant;
import com.alibaba.security.realidentity.o;
import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.alipay.mobile.common.transportext.amnet.AmnetConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.loc.at;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class i6a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f21123a = {"a", TplMsg.VALUE_T_NATIVE_RETURN, "c", "d", "e", "f", at.f, "h", bmv.MSGTYPE_INTERVAL, at.j, at.k, "l", "m", "n", o.b, "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", AmnetConstant.VAL_SUPPORT_ZSTD, "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", TLogTracker.LEVEL_DEBUG, "E", UTConstant.Args.UT_SUCCESS_F, "G", "H", TLogTracker.LEVEL_INFO, "J", "K", "L", "M", "N", "O", "P", "Q", "R", ExifInterface.LATITUDE_SOUTH, "T", "U", "V", "W", "X", "Y", "Z"};

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("12fd10b7", new Object[0]);
        }
        StringBuilder sb = new StringBuilder();
        String replace = UUID.randomUUID().toString().replace("-", "");
        for (int i = 0; i < 8; i++) {
            int i2 = i * 4;
            sb.append(f21123a[Integer.parseInt(replace.substring(i2, i2 + 4), 16) % 62]);
        }
        return sb.toString();
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d60bbca2", new Object[0]);
        }
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    static {
        t2o.a(511705604);
        new AtomicLong(0L);
    }
}
