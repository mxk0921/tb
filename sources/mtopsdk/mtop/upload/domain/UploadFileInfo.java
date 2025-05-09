package mtopsdk.mtop.upload.domain;

import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.common.util.StringUtils;
import mtopsdk.mtop.upload.DefaultFileUploadListener;
import mtopsdk.mtop.upload.FileUploadBaseListener;
import mtopsdk.mtop.upload.FileUploadListener;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class UploadFileInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String bizCode;
    public String filePath;
    @Deprecated
    public FileStreamInfo fileStreamInfo;
    public FileUploadBaseListener listener;
    @Deprecated
    public String ownerNick;
    @Deprecated
    public String privateData;
    @Deprecated
    public FileUploadTypeEnum type = FileUploadTypeEnum.RESUMABLE;
    public boolean useHttps = false;

    static {
        t2o.a(595591187);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UploadFileInfo uploadFileInfo = (UploadFileInfo) obj;
        String str = this.bizCode;
        if (str == null) {
            if (uploadFileInfo.bizCode != null) {
                return false;
            }
        } else if (!str.equals(uploadFileInfo.bizCode)) {
            return false;
        }
        String str2 = this.filePath;
        if (str2 == null) {
            if (uploadFileInfo.filePath != null) {
                return false;
            }
        } else if (!str2.equals(uploadFileInfo.filePath)) {
            return false;
        }
        FileStreamInfo fileStreamInfo = this.fileStreamInfo;
        if (fileStreamInfo == null) {
            if (uploadFileInfo.fileStreamInfo != null) {
                return false;
            }
        } else if (!fileStreamInfo.equals(uploadFileInfo.fileStreamInfo)) {
            return false;
        }
        FileUploadBaseListener fileUploadBaseListener = this.listener;
        if (fileUploadBaseListener == null) {
            if (uploadFileInfo.listener != null) {
                return false;
            }
        } else if (!fileUploadBaseListener.equals(uploadFileInfo.listener)) {
            return false;
        }
        String str3 = this.ownerNick;
        if (str3 == null) {
            if (uploadFileInfo.ownerNick != null) {
                return false;
            }
        } else if (!str3.equals(uploadFileInfo.ownerNick)) {
            return false;
        }
        String str4 = this.privateData;
        if (str4 == null) {
            if (uploadFileInfo.privateData != null) {
                return false;
            }
        } else if (!str4.equals(uploadFileInfo.privateData)) {
            return false;
        }
        if (this.type == uploadFileInfo.type) {
            return true;
        }
        return false;
    }

    @Deprecated
    public String getBizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("826ffbcf", new Object[]{this});
        }
        return this.bizCode;
    }

    @Deprecated
    public String getFilePath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1bcb7a22", new Object[]{this});
        }
        return this.filePath;
    }

    @Deprecated
    public FileStreamInfo getFileStreamInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FileStreamInfo) ipChange.ipc$dispatch("dd9896c7", new Object[]{this});
        }
        return this.fileStreamInfo;
    }

    @Deprecated
    public FileUploadBaseListener getListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FileUploadBaseListener) ipChange.ipc$dispatch("4613636e", new Object[]{this});
        }
        return this.listener;
    }

    @Deprecated
    public String getOwnerNick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6f0a10f9", new Object[]{this});
        }
        return this.ownerNick;
    }

    @Deprecated
    public String getPrivateData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f6aacc2", new Object[]{this});
        }
        return this.privateData;
    }

    @Deprecated
    public FileUploadTypeEnum getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FileUploadTypeEnum) ipChange.ipc$dispatch("28822329", new Object[]{this});
        }
        return this.type;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        String str = this.bizCode;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i8 = (i + 31) * 31;
        String str2 = this.filePath;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i9 = (i8 + i2) * 31;
        FileStreamInfo fileStreamInfo = this.fileStreamInfo;
        if (fileStreamInfo == null) {
            i3 = 0;
        } else {
            i3 = fileStreamInfo.hashCode();
        }
        int i10 = (i9 + i3) * 31;
        FileUploadBaseListener fileUploadBaseListener = this.listener;
        if (fileUploadBaseListener == null) {
            i4 = 0;
        } else {
            i4 = fileUploadBaseListener.hashCode();
        }
        int i11 = (i10 + i4) * 31;
        String str3 = this.ownerNick;
        if (str3 == null) {
            i5 = 0;
        } else {
            i5 = str3.hashCode();
        }
        int i12 = (i11 + i5) * 31;
        String str4 = this.privateData;
        if (str4 == null) {
            i6 = 0;
        } else {
            i6 = str4.hashCode();
        }
        int i13 = (i12 + i6) * 31;
        FileUploadTypeEnum fileUploadTypeEnum = this.type;
        if (fileUploadTypeEnum != null) {
            i7 = fileUploadTypeEnum.hashCode();
        }
        return i13 + i7;
    }

    @Deprecated
    public boolean isUseHttps() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1da8b479", new Object[]{this})).booleanValue();
        }
        return this.useHttps;
    }

    public boolean isValid() {
        FileStreamInfo fileStreamInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        if (StringUtils.isBlank(this.bizCode)) {
            return false;
        }
        if (!StringUtils.isBlank(this.filePath) || ((fileStreamInfo = this.fileStreamInfo) != null && fileStreamInfo.isValid())) {
            return true;
        }
        return false;
    }

    @Deprecated
    public void setBizCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29306ef", new Object[]{this, str});
        } else if (str != null) {
            this.bizCode = str;
        }
    }

    @Deprecated
    public void setFilePath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8812494", new Object[]{this, str});
        } else if (str != null) {
            this.filePath = str;
        }
    }

    @Deprecated
    public void setFileStreamInfo(FileStreamInfo fileStreamInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a85d42dd", new Object[]{this, fileStreamInfo});
        } else {
            this.fileStreamInfo = fileStreamInfo;
        }
    }

    @Deprecated
    public void setListener(FileUploadListener fileUploadListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33c14337", new Object[]{this, fileUploadListener});
        } else if (fileUploadListener != null) {
            if (fileUploadListener instanceof FileUploadBaseListener) {
                this.listener = (FileUploadBaseListener) fileUploadListener;
            } else {
                this.listener = new DefaultFileUploadListener(fileUploadListener);
            }
        }
    }

    @Deprecated
    public void setOwnerNick(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f475ca05", new Object[]{this, str});
        } else {
            this.ownerNick = str;
        }
    }

    @Deprecated
    public void setPrivateData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75a21a5c", new Object[]{this, str});
        } else {
            this.privateData = str;
        }
    }

    @Deprecated
    public void setType(FileUploadTypeEnum fileUploadTypeEnum) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fe4b19f", new Object[]{this, fileUploadTypeEnum});
        } else if (fileUploadTypeEnum != null) {
            this.type = fileUploadTypeEnum;
        }
    }

    @Deprecated
    public void setUseHttps(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("666558c7", new Object[]{this, new Boolean(z)});
        } else {
            this.useHttps = z;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(64);
        sb.append("UploadFileInfo [filePath=");
        sb.append(this.filePath);
        sb.append(", fileStreamInfo=");
        sb.append(this.fileStreamInfo);
        sb.append(", bizCode=");
        sb.append(this.bizCode);
        sb.append(", ownerNick=");
        sb.append(this.ownerNick);
        sb.append(", privateData=");
        sb.append(this.type);
        sb.append(", listener=");
        sb.append(this.listener);
        sb.append("]");
        return sb.toString();
    }

    @Deprecated
    public void setListener(FileUploadBaseListener fileUploadBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9cd9e26", new Object[]{this, fileUploadBaseListener});
        } else {
            this.listener = fileUploadBaseListener;
        }
    }
}
