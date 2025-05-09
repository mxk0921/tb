package tb;

import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import com.alibaba.android.split.core.internal.ObjectInvoker;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.BundleInfoManager;
import com.taobao.tao.TaobaoApplication;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class mdq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile Object[] f23978a;
    public static final Method b;

    static {
        try {
            if (Build.VERSION.SDK_INT > 27) {
                Method declaredMethod = AssetManager.class.getDeclaredMethod("getApkAssets", new Class[0]);
                b = declaredMethod;
                declaredMethod.setAccessible(true);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static boolean a(AssetManager assetManager) {
        try {
            Method method = b;
            if (method != null) {
                Object[] objArr = (Object[]) method.invoke(assetManager, new Object[0]);
                if (f23978a == null) {
                    return true;
                }
                if (f23978a.length == objArr.length) {
                    return false;
                }
                return true;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return false;
    }

    public static void c(AssetManager assetManager) {
        try {
            Method method = b;
            if (method != null) {
                Object[] objArr = (Object[]) method.invoke(assetManager, new Object[0]);
                f23978a = new Object[objArr.length];
                for (int i = 0; i < objArr.length; i++) {
                    f23978a[i] = objArr[i];
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void b(AssetManager assetManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f452e3d", new Object[]{assetManager});
        } else if (TaobaoApplication.isMainProcess() && !BundleInfoManager.instance().isAppBundleEnabled()) {
            try {
                if (Build.VERSION.SDK_INT <= 27 || a(assetManager)) {
                    if (!(mcq.a() == null || mcq.a().a() == null)) {
                        for (String str : (String[]) mcq.a().a().toArray(new String[0])) {
                            String absolutePath = ((cad) bcq.a()).i().i(str).c().getAbsolutePath();
                            if (Build.VERSION.SDK_INT >= 26 || !r8o.i().g(assetManager, absolutePath)) {
                                ((Integer) ObjectInvoker.invoke(assetManager, "addAssetPath", Integer.class, String.class, absolutePath)).intValue();
                            } else {
                                Log.e("SplitResourceInstaller", "featurePathAdded : " + absolutePath);
                                return;
                            }
                        }
                    }
                    if (Build.VERSION.SDK_INT > 27) {
                        c(assetManager);
                        Log.e("SplitResourceInstaller", "sApkAssets changed : " + f23978a.length);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
