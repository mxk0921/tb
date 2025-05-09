package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.taskcontext.baseparams.TimeContent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import mtopsdk.mtop.global.SDKUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class cms extends als {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PREFIX = "@timeContent";
    public static final int SUB_INDEX = 12;

    /* renamed from: a  reason: collision with root package name */
    public static final String f17156a = "TSTimeContentExpression";
    public static final SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);

    public cms(String str) {
    }

    public static cms c(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cms) ipChange.ipc$dispatch("a8a7b6b5", new Object[]{str, objArr});
        }
        if (!TextUtils.isEmpty(str) && str.startsWith(PREFIX)) {
            return new cms(str);
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(cms cmsVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tschedule/parser/expr/other/TSTimeContentExpression");
    }

    /* renamed from: d */
    public TimeContent b(wp8 wp8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TimeContent) ipChange.ipc$dispatch("b3e9765d", new Object[]{this, wp8Var});
        }
        List<TimeContent> i = wp8Var.i();
        TimeContent timeContent = null;
        if (i != null && !i.isEmpty()) {
            long correctionTimeMillis = SDKUtils.getCorrectionTimeMillis();
            long j = -1;
            for (TimeContent timeContent2 : i) {
                if (!TextUtils.isEmpty(timeContent2.validTime)) {
                    try {
                        Date parse = sDateFormat.parse(timeContent2.validTime);
                        if (parse != null) {
                            long time = parse.getTime();
                            if (correctionTimeMillis > time) {
                                if (j == -1) {
                                    j = correctionTimeMillis - time;
                                    timeContent = timeContent2;
                                } else {
                                    long j2 = correctionTimeMillis - time;
                                    if (j > j2) {
                                        timeContent = timeContent2;
                                        j = j2;
                                    }
                                }
                            }
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }
            String str = f17156a;
            zdh.a(str, "parsed timeContent params = " + timeContent);
            if (timeContent != null) {
                zdh.a(str, "parsed fully timeContent params: " + timeContent.stringify());
            }
        }
        return timeContent;
    }

    static {
        t2o.a(329252939);
    }
}
