package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.log.RSoLog;
import com.uc.webview.base.ErrorCode;
import com.uc.webview.base.zip.MultiThreadSevenZip;
import com.uc.webview.export.extension.U4Engine;
import java.io.File;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class lt8 implements hgd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public synchronized boolean b(Context context, String str, String str2, boolean z) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("60634b2f", new Object[]{this, context, str, str2, new Boolean(z)})).booleanValue();
        }
        File file = new File(str);
        File file2 = new File(str2);
        if (file.isFile()) {
            jg9.f(file2);
            jg9.h(file2);
            int deccompress = new MultiThreadSevenZip().deccompress(context, file.getAbsolutePath(), file2.getAbsolutePath());
            if (deccompress != 0) {
                RSoLog.d("IRSoExtractCore, 7z decode failed:" + deccompress + ", length:" + (file.length() / 1024) + "KB, freeSize:" + file2.getFreeSpace() + ", zipFile:" + file.getAbsolutePath() + ", outDir:" + file2.getAbsolutePath());
                if (28 == deccompress) {
                    ErrorCode.DECOMPRESS_SEVENZIP_ERROR_NOSPC.report();
                }
                ErrorCode.DECOMPRESS_SEVENZIP_ERROR.report("7zError=" + deccompress);
            }
            return true;
        }
        throw RSoException.error(7100, "path=" + file.getPath() + ", length=" + file.length());
    }

    public boolean a(Context context, String str, String str2, boolean z) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c6b4c04", new Object[]{this, context, str, str2, new Boolean(z)})).booleanValue();
        }
        File file = new File(str);
        File file2 = new File(str2);
        if (file.isFile()) {
            String name = file.getName();
            jg9.f(file2);
            jg9.h(file2);
            RSoLog.d("IRSoExtractCore,extract, " + name + ", force recreate extractedDir success, dir=" + file2.getPath());
            U4Engine.extractFile(context, file, file2, z);
            RSoLog.d("IRSoExtractCore,extract, " + name + ", extract success, children=" + jg9.k(file2, false));
            return true;
        }
        throw RSoException.error(7100, "path=" + file.getPath() + ", length=" + file.length());
    }
}
