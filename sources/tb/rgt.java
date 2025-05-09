package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class rgt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static File f27371a;

    public rgt(Context context, String str) {
        if (f27371a == null) {
            File file = new File(context.getDir("tombstone", 0), str);
            f27371a = file;
            kg9.b(file);
        }
    }

    public static /* synthetic */ int d(File file, File file2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8e9ccb9c", new Object[]{file, file2})).intValue();
        }
        int i = ((file.lastModified() - file2.lastModified()) > 0L ? 1 : ((file.lastModified() - file2.lastModified()) == 0L ? 0 : -1));
        if (i > 0) {
            return -1;
        }
        if (i == 0) {
            return 0;
        }
        return 1;
    }

    public boolean c(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c40aa955", new Object[]{this, file})).booleanValue();
        }
        return f27371a.equals(file.getParentFile());
    }

    public File e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("533353ae", new Object[]{this});
        }
        return f27371a;
    }

    public int b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fcbbf704", new Object[]{this, new Integer(i)})).intValue();
        }
        File[] listFiles = f27371a.listFiles();
        if (listFiles == null || listFiles.length < i) {
            return 0;
        }
        Arrays.sort(listFiles, new Comparator() { // from class: tb.qgt
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int d;
                d = rgt.d((File) obj, (File) obj2);
                return d;
            }
        });
        for (int i2 = i; i2 < listFiles.length; i2++) {
            String absolutePath = listFiles[i2].getAbsolutePath();
            if (absolutePath.endsWith("anr.log")) {
                l1s.c().a("STAGE_ANR_FILE_LAUNCH_DELETED", "TCrash", "anr");
            } else if (absolutePath.endsWith("java.log")) {
                l1s.c().a("STAGE_ANR_FILE_LAUNCH_DELETED", "TCrash", "java");
            } else if (absolutePath.endsWith("jni.log") || absolutePath.endsWith("native.log")) {
                l1s.c().a("STAGE_ANR_FILE_LAUNCH_DELETED", "TCrash", "native");
            }
            kg9.f(listFiles[i2]);
        }
        return listFiles.length - i;
    }
}
