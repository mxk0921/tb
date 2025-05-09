package mtopsdk.mtop.upload.domain;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.InputStream;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class FileBaseInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public File file;
    public String fileId;
    @Deprecated
    public InputStream fileInputStream;
    public String fileName;
    public long fileSize;
    public String fileType;

    static {
        t2o.a(595591183);
    }

    public FileBaseInfo(File file) {
        this.file = file;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(64);
        sb.append("FileBaseInfo [file=");
        sb.append(this.file);
        sb.append(", fileInputStream=");
        sb.append(this.fileInputStream);
        sb.append(", fileName=");
        sb.append(this.fileName);
        sb.append(", fileType=");
        sb.append(this.fileType);
        sb.append(", fileId=");
        sb.append(this.fileId);
        sb.append(", fileSize=");
        sb.append(this.fileSize);
        sb.append("]");
        return sb.toString();
    }

    @Deprecated
    public FileBaseInfo(InputStream inputStream) {
        this.fileInputStream = inputStream;
    }
}
