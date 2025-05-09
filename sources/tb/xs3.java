package tb;

import android.content.Context;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.alibaba.ip.server.InstantPatcher;
import java.io.File;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class xs3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<String> f31578a;
    public final Context b;

    public xs3(Context context) {
        ArrayList<String> arrayList = new ArrayList<>();
        this.f31578a = arrayList;
        this.b = context;
        String absolutePath = context.getFilesDir().getParentFile().getAbsolutePath();
        arrayList.add(absolutePath + "/lib");
        arrayList.add(absolutePath + "/shared_prefs/deviceId_store.xml");
        arrayList.add(absolutePath + "/shared_prefs/userinfo.xml");
        arrayList.add(absolutePath + "/shared_prefs/userinfo_backup.xml");
        arrayList.add(absolutePath + "/shared_prefs/com.taobao.tao.welcome.Welcome.xml");
        arrayList.add(absolutePath + "/app_tombstone");
        arrayList.add(absolutePath + "/shared_prefs/instant_patch.xml");
        arrayList.add(absolutePath + "/shared_prefs/safemode_sp.xml");
        arrayList.add(absolutePath + "/shared_prefs/SafeModeOrange.xml");
        try {
            File externalCacheDir = context.getExternalCacheDir();
            if (externalCacheDir != null) {
                arrayList.add(new File(externalCacheDir, gjv.HOTPATCH).getAbsolutePath());
            }
            File filesDir = context.getFilesDir();
            if (filesDir != null) {
                arrayList.add(new File(filesDir, "instant-patch").getAbsolutePath());
                arrayList.add(new File(filesDir, "swallows").getAbsolutePath());
                arrayList.add(new File(filesDir, "splitcompat").getAbsolutePath());
            }
        } catch (Exception unused) {
        }
    }

    public static void e(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14ac805f", new Object[]{file});
            return;
        }
        File file2 = new File(file.getAbsolutePath() + "tmp");
        file.renameTo(file2);
        file2.delete();
        Log.e("Clear", "delete2:" + file.getAbsolutePath());
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        b(this.b.getFilesDir().getParentFile());
        try {
            File externalCacheDir = this.b.getExternalCacheDir();
            if (externalCacheDir != null && externalCacheDir.getParentFile() != null) {
                File parentFile = externalCacheDir.getParentFile();
                b(parentFile);
                parentFile.delete();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f425823", new Object[]{this});
            return;
        }
        try {
            InstantPatcher.create(this.b).purge();
            e(new File(new File(this.b.getFilesDir().getParentFile(), "shared_prefs"), "instant_patch.xml"));
            File file = new File(this.b.getExternalCacheDir(), gjv.HOTPATCH);
            if (file.exists()) {
                f(file);
            }
            File file2 = new File(this.b.getFilesDir(), "instant-patch");
            if (file2.exists()) {
                f(file2);
            }
        } catch (Exception unused) {
        }
    }

    public final boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f24869", new Object[]{this, str})).booleanValue();
        }
        return this.f31578a.contains(str);
    }

    public final void b(File file) {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("794b6cbe", new Object[]{this, file});
        } else if (file != null && file.exists() && !file.isFile() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (file2.isFile()) {
                    if (d(file2.getAbsolutePath())) {
                        Log.e("Clear", "keep:" + file2.getAbsolutePath());
                    } else {
                        e(file2);
                        new StringBuilder("delete1:").append(file2.toString());
                    }
                } else if (d(file2.getAbsolutePath())) {
                    Log.e("Clear", "keep:" + file2.getAbsolutePath());
                } else {
                    b(file2);
                    file2.delete();
                    new StringBuilder("delete2:").append(file2.toString());
                }
            }
        }
    }

    public final void f(File file) {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fe180fc", new Object[]{this, file});
        } else if (file != null && file.exists() && !file.isFile() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (file2.isFile()) {
                    e(file2);
                    new StringBuilder("delete1:").append(file2.toString());
                } else {
                    f(file2);
                    file2.delete();
                    new StringBuilder("delete2:").append(file2.toString());
                }
            }
        }
    }
}
