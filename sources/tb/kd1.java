package tb;

import android.app.Application;
import android.content.res.AssetManager;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.InputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class kd1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(Application application, String str, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed4fac4e", new Object[]{application, str, file})).booleanValue();
        }
        if (application == null || trq.c(str) || file == null) {
            rbn.e("index_assets", " app=" + application + " fileName=" + str + " targetFile=" + file);
            return false;
        }
        AssetManager assets = application.getAssets();
        if (assets == null) {
            rbn.e("index_assets", "AssetsUtils -> copyAssetsToFile assets == null, wtf");
            return false;
        }
        uos.e(file);
        try {
            InputStream open = assets.open(str);
            jg9.c(open, file);
            if (open != null) {
                open.close();
            }
            return true;
        } catch (Throwable th) {
            rbn.g("AssetsUtils -> copyAssetsToFile ", th);
            uos.e(file);
            return false;
        }
    }

    public static byte[] b(Application application, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("57e1b18f", new Object[]{application, str});
        }
        if (application == null || trq.c(str)) {
            rbn.e("index_assets", "readStringFromAssets illegal args , app=" + application + ",  fileName=" + str);
            return null;
        }
        AssetManager assets = application.getAssets();
        if (assets == null) {
            rbn.e("index_assets", "readStringFromAssets assets == null, wtf");
            return null;
        }
        try {
            InputStream open = assets.open(str);
            byte[] e = y1d.e(open);
            if (open != null) {
                open.close();
            }
            return e;
        } catch (Throwable th) {
            rbn.g("AssetsUtils -> readStringFromAssets", th);
            return null;
        }
    }
}
