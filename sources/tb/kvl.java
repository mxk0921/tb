package tb;

import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class kvl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final kvl INSTANCE = new kvl();

    /* renamed from: a  reason: collision with root package name */
    public static final LruCache<String, Pattern> f22949a = new LruCache<>(20);

    static {
        t2o.a(839909956);
    }

    public final Pattern a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pattern) ipChange.ipc$dispatch("371f84d", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        LruCache<String, Pattern> lruCache = f22949a;
        Pattern pattern = lruCache.get(str);
        if (pattern != null) {
            return pattern;
        }
        try {
            Pattern compile = Pattern.compile(str);
            lruCache.put(str, compile);
            return compile;
        } catch (PatternSyntaxException e) {
            TMSLogger.c("PatternUtils", "pattern " + ((Object) str) + " compile error!", e);
            return null;
        }
    }
}
