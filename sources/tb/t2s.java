package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class t2s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(486539750);
    }

    public static void a(Context context, Bitmap bitmap) {
        File file;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc5b06b0", new Object[]{context, bitmap});
            return;
        }
        String str = "home_t_" + new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date()) + ".jpg";
        File externalFilesDir = context.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            System.out.println("无法获取存储目录");
        } else if (externalFilesDir.exists() || externalFilesDir.mkdirs()) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(externalFilesDir, str));
                if (bitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream)) {
                    fileOutputStream.flush();
                    System.out.println("无极缩放 保存成功: " + file.getAbsolutePath());
                } else {
                    System.out.println("无极缩放 保存失败");
                }
                fileOutputStream.close();
            } catch (IOException e) {
                fve.e("BitmapSaver", "BitmapSaverSaveError:" + Log.getStackTraceString(e));
            }
        } else {
            System.out.println("无法创建目录: " + externalFilesDir.getAbsolutePath());
        }
    }
}
