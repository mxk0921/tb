package mtopsdk.mtop.upload.domain;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public enum FileUploadTypeEnum {
    RESUMABLE("resumable"),
    NORMAL("normal");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String uploadType;

    FileUploadTypeEnum(String str) {
        this.uploadType = str;
    }

    public static /* synthetic */ Object ipc$super(FileUploadTypeEnum fileUploadTypeEnum, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in mtopsdk/mtop/upload/domain/FileUploadTypeEnum");
    }

    public static FileUploadTypeEnum valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FileUploadTypeEnum) ipChange.ipc$dispatch("b31b1b2b", new Object[]{str});
        }
        return (FileUploadTypeEnum) Enum.valueOf(FileUploadTypeEnum.class, str);
    }

    public String getUploadType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("35e0aac8", new Object[]{this});
        }
        return this.uploadType;
    }
}
