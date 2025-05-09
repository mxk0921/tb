package mtopsdk.mtop.upload.domain;

import java.io.InputStream;
import mtopsdk.common.util.StringUtils;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class FileStreamInfo implements IMTOPDataObject {
    public long fileLength;
    private String fileName;
    private InputStream fileStream;

    static {
        t2o.a(595591184);
        t2o.a(589299906);
    }

    public FileStreamInfo(InputStream inputStream, String str) {
        this.fileStream = inputStream;
        this.fileName = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FileStreamInfo fileStreamInfo = (FileStreamInfo) obj;
        String str = this.fileName;
        if (str == null) {
            if (fileStreamInfo.fileName != null) {
                return false;
            }
        } else if (!str.equals(fileStreamInfo.fileName)) {
            return false;
        }
        InputStream inputStream = this.fileStream;
        if (inputStream == null) {
            if (fileStreamInfo.fileStream != null) {
                return false;
            }
        } else if (!inputStream.equals(fileStreamInfo.fileStream)) {
            return false;
        }
        return true;
    }

    public String getFileName() {
        return this.fileName;
    }

    public InputStream getFileStream() {
        return this.fileStream;
    }

    public int hashCode() {
        int i;
        String str = this.fileName;
        int i2 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i3 = (i + 31) * 31;
        InputStream inputStream = this.fileStream;
        if (inputStream != null) {
            i2 = inputStream.hashCode();
        }
        return i3 + i2;
    }

    public boolean isValid() {
        if (StringUtils.isBlank(this.fileName) || this.fileStream == null) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append("FileStreamInfo [fileStream=");
        sb.append(this.fileStream);
        sb.append(", fileName=");
        sb.append(this.fileName);
        sb.append("]");
        return sb.toString();
    }
}
