package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.cache.AVFSCacheManager;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class nwg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f24990a = nwg.class.getSimpleName();

    static {
        t2o.a(806355492);
    }

    public static Object b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ba514261", new Object[]{str});
        }
        if (zqq.a(str)) {
            return null;
        }
        try {
            np cacheForModule = AVFSCacheManager.getInstance().cacheForModule("taobao_live_home");
            if (cacheForModule != null) {
                return cacheForModule.Z(cacheForModule.e()).L(new op()).w().d0(str);
            }
            return null;
        } catch (Exception e) {
            String str2 = f24990a;
            r0h.c(str2, "read data [" + str + "] exp", e);
            return null;
        }
    }

    public static String a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9fa1880e", new Object[]{context, str});
        }
        if (context == null) {
            return null;
        }
        try {
            InputStream proxy_open = AssetsDelegate.proxy_open(context.getAssets(), str);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = proxy_open.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                String byteArrayOutputStream2 = byteArrayOutputStream.toString("UTF-8");
                try {
                    byteArrayOutputStream.close();
                    proxy_open.close();
                } catch (Exception e) {
                    r0h.c(f24990a, "read assets close stream exp.", e);
                }
                return byteArrayOutputStream2;
            } catch (Exception e2) {
                r0h.c(f24990a, "read assets write buffer exp.", e2);
                try {
                    byteArrayOutputStream.close();
                    proxy_open.close();
                    return null;
                } catch (Exception e3) {
                    r0h.c(f24990a, "read assets close stream exp.", e3);
                    return null;
                }
            }
        } catch (Exception e4) {
            r0h.c(f24990a, "read assets open assets exp.", e4);
            return null;
        }
    }

    public static String c(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13c082d7", new Object[]{context, str});
        }
        if (context != null && !zqq.a(str)) {
            try {
                return context.getSharedPreferences("taobao_live_home", 0).getString(str, "");
            } catch (Exception e) {
                String str2 = f24990a;
                r0h.c(str2, "read preferences [" + str + "] exp", e);
            }
        }
        return null;
    }

    public static boolean d(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a0e9f5a", new Object[]{str, obj})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            np cacheForModule = AVFSCacheManager.getInstance().cacheForModule("taobao_live_home");
            if (cacheForModule != null) {
                return cacheForModule.Z(cacheForModule.e()).L(new op()).w().N(str, obj);
            }
            return false;
        } catch (Exception e) {
            String str2 = f24990a;
            r0h.c(str2, "write data [" + str + "] exp", e);
            return false;
        }
    }

    public static boolean e(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a027340", new Object[]{context, str, str2})).booleanValue();
        }
        if (context != null && !zqq.a(str)) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences("taobao_live_home", 0).edit();
                edit.putString(str, str2);
                edit.apply();
                return true;
            } catch (Exception e) {
                String str3 = f24990a;
                r0h.c(str3, "write preferences [" + str + "] exp", e);
            }
        }
        return false;
    }
}
