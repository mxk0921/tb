package com.alibaba.security.wukong.model;

import com.alibaba.security.ccrc.common.log.Logging;
import com.alibaba.security.ccrc.service.build.Kb;
import com.alibaba.security.wukong.model.meta.ByteImage;
import com.alibaba.security.wukong.model.meta.Data;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.alinnkit.core.MNNCVImageFormat;
import com.taobao.android.mnncv.MNNCVImage;
import java.util.Map;
import tb.f4w;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ByteImageSample extends ImageRiskSample {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String c = "ByteImageSample";
    public final ByteImage image;

    public ByteImageSample(String str, ByteImage byteImage) {
        super(str);
        this.image = byteImage;
        getExtras().putAll(byteImage.getExtras());
    }

    public static /* synthetic */ Object ipc$super(ByteImageSample byteImageSample, String str, Object... objArr) {
        if (str.hashCode() == 67041405) {
            return new Boolean(super.isValid());
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/wukong/model/ByteImageSample");
    }

    public byte[] getData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("e6eec916", new Object[]{this});
        }
        return this.image.getData();
    }

    public int getFormat() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("17b60e7", new Object[]{this})).intValue();
        }
        return this.image.getFormat();
    }

    @Override // com.alibaba.security.wukong.model.ImageRiskSample
    public int getHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
        }
        return this.image.getHeight();
    }

    @Override // com.alibaba.security.wukong.model.ImageRiskSample
    public int getMNNCVImageFormat() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4aec84e2", new Object[]{this})).intValue();
        }
        if (getFormat() == 2) {
            return MNNCVImageFormat.YUV_NV21.format;
        }
        if (getFormat() == 1) {
            return MNNCVImageFormat.RGBA.format;
        }
        if (getFormat() == 3) {
            return MNNCVImageFormat.RGB.format;
        }
        if (getFormat() == 4) {
            return MNNCVImageFormat.BGR.format;
        }
        if (getFormat() == 5) {
            return MNNCVImageFormat.BGRA.format;
        }
        Logging.e(c, "image format is not support");
        throw new IllegalArgumentException("image format is not support");
    }

    @Override // com.alibaba.security.wukong.model.ImageRiskSample, com.alibaba.security.wukong.model.CCRCRiskSample
    public Data getRawData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Data) ipChange.ipc$dispatch("b1c4156c", new Object[]{this});
        }
        return this.image;
    }

    @Override // com.alibaba.security.wukong.model.CCRCRiskSample
    public long getTs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("31735e70", new Object[]{this})).longValue();
        }
        return this.image.getTs();
    }

    @Override // com.alibaba.security.wukong.model.ImageRiskSample
    public int getWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
        }
        return this.image.getWidth();
    }

    @Override // com.alibaba.security.wukong.model.CCRCRiskSample
    public boolean isValid() {
        String str;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        if (super.isValid() && getData() != null && getWidth() > 0 && getHeight() > 0) {
            z = true;
        }
        if (!z) {
            String str2 = c;
            StringBuilder a2 = Kb.a("ByteImageSample:");
            if (getData() == null) {
                str = f4w.LOAD_DATA_NULL;
            } else {
                str = "data is not null";
            }
            a2.append(str);
            Logging.e(str2, a2.toString());
        }
        return z;
    }

    public void setData(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252501ba", new Object[]{this, bArr});
        } else {
            this.image.setData(bArr);
        }
    }

    public void setFormat(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c456a403", new Object[]{this, new Integer(i)});
        } else {
            this.image.setFormat(i);
        }
    }

    public void setHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fde48d3", new Object[]{this, new Integer(i)});
        } else {
            this.image.setHeight(i);
        }
    }

    public void setWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baf60358", new Object[]{this, new Integer(i)});
        } else {
            this.image.setWidth(i);
        }
    }

    @Override // com.alibaba.security.wukong.model.ImageRiskSample
    public MNNCVImage toMNNCVImage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MNNCVImage) ipChange.ipc$dispatch("9b73a671", new Object[]{this});
        }
        return new MNNCVImage(getData(), getWidth(), getHeight(), getMNNCVImageFormat());
    }

    public ByteImageSample(String str, Map<String, Object> map, ByteImage byteImage) {
        super(str, map);
        this.image = byteImage;
        getExtras().putAll(byteImage.getExtras());
    }

    public ByteImageSample(String str, byte[] bArr, int i, int i2, int i3) {
        super(str);
        this.image = new ByteImage(bArr, i, i2, i3);
    }
}
