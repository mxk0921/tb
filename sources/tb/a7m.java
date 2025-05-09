package tb;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taobaoavsdk.cache.library.StorageUtils;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.t7b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class a7m {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ALI_DROP_0_REF_VF = "ali_drop_0_ref_vf";
    public static final String ALI_DROP_SKIP_REF_VF = "ali_drop_skip_ref_vf";
    public static final String ALI_FLV_RETAIN = "ali_flv_retain";
    public static final String BIZ_CODE = "bizCode";
    public static final String CDN_IP = "cdnIp";
    public static final String CONNECT_TIMEOUT = "connTimeout";
    public static final String LIVE_BACKUP_IP = "tb_live_backup_ip";
    public static final String ONLY_VIDEO = "onlyvideo";
    public static final String PLAY_TOKEN_ID = "playTokenId";
    public static final String PRELOAD_NET_CUT_SIZE = "preloadNetCutSize";
    public static final String PRE_LOAD = "preLoad";
    public static final String READ_TIMEOUT = "readTimeout";
    public static final String RETRY_TIME = "RetryTime";
    public static final String TOP_ANCHOR = "top_anchor";
    public static final String USE_TBNET_PROXY = "useTBNetProxy";
    public static final String VIDEO_CACHE_ID = "videoCacheId";
    public static final String VIDEO_DEFINE = "videoDefine";
    public static final String VIDEO_ID = "videoId";
    public static final String VIDEO_LENGTH = "videoLength";
    public static final String VIDEO_PLAY_SCENES = "videoPlayScenes";

    /* renamed from: a  reason: collision with root package name */
    public static t7b f15584a;
    public static volatile AtomicBoolean b = new AtomicBoolean(false);
    public static volatile AtomicBoolean c = new AtomicBoolean(false);
    public static final feh d = new feh("PlayerEnvironment", "");
    public static String e;

    static {
        t2o.a(774897867);
    }

    public static String a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dca679ea", new Object[]{context, str});
        }
        try {
            if (!TextUtils.isEmpty(str) && context != null) {
                if (TextUtils.isEmpty(e)) {
                    e = StorageUtils.getIndividualCacheDirectory(context).getAbsolutePath();
                }
                File file = new File(e, str);
                if (file.exists() && file.canRead() && file.length() > 1024) {
                    return file.getAbsolutePath();
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static String b(Context context, String str) {
        String h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("46081c2d", new Object[]{context, str});
        }
        try {
            if (TextUtils.isEmpty(e)) {
                e = StorageUtils.getIndividualCacheDirectory(context).getAbsolutePath();
            }
            try {
                String queryParameter = Uri.parse(str).getQueryParameter(PLAY_TOKEN_ID);
                if (!TextUtils.isEmpty(queryParameter)) {
                    d.c(queryParameter);
                }
            } catch (Exception e2) {
                feh fehVar = d;
                AVSDKLog.e(fehVar, "get playToken From url error" + e2.getMessage());
            }
            h = e2n.h(str);
        } catch (Throwable unused) {
        }
        if (TextUtils.isEmpty(h)) {
            return null;
        }
        File file = new File(e, h);
        if (file.exists() && file.canRead() && file.length() > 1024) {
            return file.getAbsolutePath();
        }
        return null;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dfbe0e3e", new Object[0])).booleanValue();
        }
        return c.get();
    }

    public static t7b d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t7b) ipChange.ipc$dispatch("990ac68f", new Object[]{context});
        }
        if (!b.compareAndSet(false, true)) {
            return f15584a;
        }
        t7b e2 = e(context);
        f15584a = e2;
        return e2;
    }

    public static t7b e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t7b) ipChange.ipc$dispatch("63f89dd9", new Object[]{context});
        }
        AVSDKLog.e(d, "HttpProxyCacheServer start init, newProxy");
        return new t7b.d(context.getApplicationContext()).b();
    }

    public static void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("201c774e", new Object[]{new Boolean(z)});
        } else {
            c.set(z);
        }
    }
}
