package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.fresco.cache.disk.DefaultDiskStorage;
import java.io.File;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class de9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(374341739);
    }

    public static boolean a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea1b3067", new Object[]{file})).booleanValue();
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return true;
        }
        boolean z = true;
        for (File file2 : listFiles) {
            z &= b(file2);
        }
        return z;
    }

    public static boolean b(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1ff73f56", new Object[]{file})).booleanValue();
        }
        if (file.isDirectory()) {
            a(file);
        }
        return file.delete();
    }

    public static void c(File file, ee9 ee9Var) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b5ee237", new Object[]{file, ee9Var});
        } else {
            d(file, ee9Var, 0);
        }
    }

    public static void d(File file, ee9 ee9Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f07dd7ac", new Object[]{file, ee9Var, new Integer(i)});
        } else if (i <= 10) {
            DefaultDiskStorage.b bVar = (DefaultDiskStorage.b) ee9Var;
            bVar.c(file);
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        d(file2, bVar, i + 1);
                    } else {
                        bVar.d(file2);
                    }
                }
            }
            bVar.b(file);
        }
    }
}
