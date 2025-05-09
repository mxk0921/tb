package tb;

import android.util.Base64;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class stl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final zcf f28264a;

    static {
        t2o.a(952107028);
    }

    public stl(zcf zcfVar) {
        this.f28264a = zcfVar;
    }

    public final void a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("794b6cbe", new Object[]{this, file});
            return;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (!file2.delete()) {
                    new StringBuilder("Failed to delete old file ").append(file2.getPath());
                }
            }
        }
    }

    public void decode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43a785ff", new Object[]{this, str});
            return;
        }
        try {
            base64ToFile(this.f28264a.path, str);
        } catch (Exception e) {
            e.printStackTrace();
            this.f28264a.success = false;
        }
    }

    public void base64ToFile(String str, String str2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f88358e1", new Object[]{this, str, str2});
            return;
        }
        byte[] decode = Base64.decode(str2, 0);
        if (decode == null) {
            this.f28264a.success = false;
            return;
        }
        File parentFile = new File(str).getParentFile();
        if (!parentFile.exists()) {
            parentFile.mkdirs();
        } else {
            a(parentFile);
        }
        File createTempFile = File.createTempFile("tmp-patch", null, parentFile);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(createTempFile));
        try {
            try {
                bufferedOutputStream.write(decode, 0, decode.length);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (!createTempFile.setReadOnly()) {
                throw new IOException("Failed to setReadOnly " + createTempFile.getAbsolutePath());
            } else if (!createTempFile.renameTo(new File(str))) {
                throw new IOException("Failed to rename " + createTempFile.getAbsolutePath() + " to " + str);
            }
        } finally {
            bufferedOutputStream.close();
        }
    }
}
