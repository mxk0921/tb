package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.message.JoinNotifyMessage;
import java.text.DecimalFormat;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class uak {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final DecimalFormat f29262a = new DecimalFormat("#.#");
    public static final DecimalFormat b = new DecimalFormat("#.##");

    static {
        t2o.a(806355859);
        new DecimalFormat("0.0");
        new DecimalFormat("#.#");
        new DecimalFormat("#.##");
    }

    public static String a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1cec3a94", new Object[]{new Long(j)});
        }
        if (j < 10000) {
            return String.valueOf(j);
        }
        if (j < 100000000) {
            return f29262a.format((j * 1.0d) / 10000.0d) + "万";
        }
        return b.format((j * 1.0d) / 1.0E8d) + "亿";
    }

    public static String b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("88795816", new Object[]{new Long(j)});
        }
        if (j < 100000) {
            return String.valueOf(j);
        }
        if (j < 100000000) {
            return f29262a.format((j * 1.0d) / 10000.0d) + "万";
        }
        return b.format((j * 1.0d) / 1.0E8d) + "亿";
    }

    public static String c(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("63260ed0", new Object[]{new Long(j)});
        }
        if (j < 100000) {
            return String.valueOf(j);
        }
        if (j >= 10000000) {
            return "1000万+";
        }
        return f29262a.format((j * 1.0d) / 10000.0d) + "万";
    }

    public static String d(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7889ea16", new Object[]{new Long(j)});
        }
        return c(j);
    }

    public static long e(JoinNotifyMessage joinNotifyMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a0a0f834", new Object[]{joinNotifyMessage})).longValue();
        }
        if (joinNotifyMessage == null) {
            return 0L;
        }
        return joinNotifyMessage.pageViewCount;
    }

    public static long f(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c0a72783", new Object[]{videoInfo})).longValue();
        }
        if (videoInfo == null) {
            return 0L;
        }
        if (h(videoInfo)) {
            return videoInfo.taolivePv;
        }
        return videoInfo.viewCount;
    }

    public static String g(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("61f4b3c9", new Object[]{videoInfo});
        }
        if (videoInfo == null) {
            return null;
        }
        if (h(videoInfo)) {
            return videoInfo.taolivePvFormat;
        }
        return videoInfo.viewCountFormat;
    }

    public static boolean h(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("764b7912", new Object[]{videoInfo})).booleanValue();
        }
        if (videoInfo == null || (videoInfo.newRoomType & 256) != 256) {
            return false;
        }
        return true;
    }
}
