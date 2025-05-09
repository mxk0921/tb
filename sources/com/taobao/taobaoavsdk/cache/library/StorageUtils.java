package com.taobao.taobaoavsdk.cache.library;

import android.content.Context;
import android.os.Environment;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.weex.utils.tools.TimeCalculator;
import java.io.File;
import java.io.Serializable;
import tb.ja1;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class StorageUtils implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String INDIVIDUAL_DIR_NAME = "video-cache";
    private static volatile boolean mDeleting;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f12971a;

        public a(String str) {
            this.f12971a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            StorageUtils.deleteFolder(this.f12971a);
            StorageUtils.access$002(false);
        }
    }

    static {
        t2o.a(774897904);
    }

    public static /* synthetic */ boolean access$002(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1554b7f", new Object[]{new Boolean(z)})).booleanValue();
        }
        mDeleting = z;
        return z;
    }

    public static void clearVideoCache(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23c3fbad", new Object[]{context});
        } else if (!mDeleting) {
            try {
                mDeleting = true;
                Coordinator.execute(new a(getIndividualCacheDirectory(context).getAbsolutePath()));
            } catch (Throwable unused) {
                mDeleting = false;
            }
        }
    }

    public static void deleteFolder(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40e4ebca", new Object[]{str});
            return;
        }
        File[] listFiles = new File(str).listFiles();
        for (int i = 0; i < listFiles.length; i++) {
            try {
                if (listFiles[i].isDirectory()) {
                    deleteFolder(str + "/" + listFiles[i].getName());
                }
                listFiles[i].delete();
            } catch (Exception unused) {
                return;
            }
        }
    }

    private static File getCacheDirectory(Context context, boolean z) {
        String str;
        File file;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("ded39579", new Object[]{context, new Boolean(z)});
        }
        try {
            str = Environment.getExternalStorageState();
        } catch (NullPointerException unused) {
            str = "";
        }
        if (!z || !"mounted".equals(str)) {
            file = null;
        } else {
            file = getExternalCacheDir(context);
        }
        if (file == null) {
            file = context.getCacheDir();
        }
        if (file != null) {
            return file;
        }
        return new File("/data/data/" + context.getPackageName() + "/cache/");
    }

    private static File getExternalCacheDir(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("9b648098", new Object[]{context});
        }
        File file = new File(new File(new File(new File(ja1.F(), TimeCalculator.PLATFORM_ANDROID), "data"), context.getPackageName()), "cache");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    public static File getIndividualCacheDirectory(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("d4d0ee86", new Object[]{context});
        }
        File file = new File(getCacheDirectory(context, true), INDIVIDUAL_DIR_NAME);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }
}
