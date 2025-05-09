package android.taobao.windvane.util;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.util.Constants;
import tb.ryp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public enum MimeTypeEnum {
    JS("js", "application/x-javascript"),
    CSS("css", "text/css"),
    JPG(ryp.FILE_TYPE_IMAGE_JPG, "image/jpeg"),
    JPEG("jpep", "image/jpeg"),
    SVG("svg", "image/svg+xml"),
    PNG("png", Constants.SHARETYPE_WITH_QRCODE),
    WEBP("webp", "image/webp"),
    GIF("gif", "image/gif"),
    HTM("htm", "text/html"),
    HTML("html", "text/html"),
    HEIC("heic", "image/heic");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String mimeType;
    private String suffix;

    MimeTypeEnum(String str, String str2) {
        this.suffix = str;
        this.mimeType = str2;
    }

    public static /* synthetic */ Object ipc$super(MimeTypeEnum mimeTypeEnum, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/util/MimeTypeEnum");
    }

    public static MimeTypeEnum valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MimeTypeEnum) ipChange.ipc$dispatch("d9cc12b2", new Object[]{str});
        }
        return (MimeTypeEnum) Enum.valueOf(MimeTypeEnum.class, str);
    }

    public String getMimeType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6adace75", new Object[]{this});
        }
        return this.mimeType;
    }

    public String getSuffix() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("66811712", new Object[]{this});
        }
        return this.suffix;
    }

    public void setMimeType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b5c5aa1", new Object[]{this, str});
        } else {
            this.mimeType = str;
        }
    }

    public void setSuffix(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94bb8a4", new Object[]{this, str});
        } else {
            this.suffix = str;
        }
    }
}
