package com.alibaba.security.wukong.model.multi.stream;

import com.alibaba.security.ccrc.service.CcrcService;
import com.alibaba.security.wukong.model.BitmapImageSample;
import com.alibaba.security.wukong.model.ByteImageSample;
import com.alibaba.security.wukong.model.CCRCRiskSample;
import com.alibaba.security.wukong.model.meta.BitmapImage;
import com.alibaba.security.wukong.model.meta.ByteImage;
import com.alibaba.security.wukong.model.meta.Image;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.UUID;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ImageStreamRiskSample extends StreamRiskSample<Image> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public ImageStreamRiskSample(String str) {
        super(str);
    }

    public static /* synthetic */ Object ipc$super(ImageStreamRiskSample imageStreamRiskSample, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/wukong/model/multi/stream/ImageStreamRiskSample");
    }

    @Override // com.alibaba.security.wukong.model.multi.MultiModelRiskSample
    public String type() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("426047ff", new Object[]{this});
        }
        return "imageStream";
    }

    public void detect(CcrcService ccrcService, Image image, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec7da865", new Object[]{this, ccrcService, image, new Boolean(z)});
        } else if (image != null) {
            String uuid = UUID.randomUUID().toString();
            CCRCRiskSample byteImageSample = image instanceof ByteImage ? new ByteImageSample(uuid, (ByteImage) image) : null;
            if (image instanceof BitmapImage) {
                byteImageSample = new BitmapImageSample(uuid, (BitmapImage) image);
            }
            if (byteImageSample != null) {
                a(byteImageSample);
                ccrcService.detect(byteImageSample, z);
            }
        }
    }
}
