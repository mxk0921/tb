package com.alibaba.security.wukong.model;

import android.graphics.Bitmap;
import com.alibaba.security.wukong.model.meta.BitmapImage;
import com.alibaba.security.wukong.model.meta.Data;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.alinnkit.core.MNNCVImageFormat;
import com.taobao.android.mnncv.MNNCVImage;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class BitmapImageSample extends ImageRiskSample {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final BitmapImage image;

    public BitmapImageSample(String str, Bitmap bitmap) {
        super(str);
        this.image = new BitmapImage(bitmap);
    }

    public static /* synthetic */ Object ipc$super(BitmapImageSample bitmapImageSample, String str, Object... objArr) {
        if (str.hashCode() == 67041405) {
            return new Boolean(super.isValid());
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/wukong/model/BitmapImageSample");
    }

    public Bitmap getBitmap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("c5e4890a", new Object[]{this});
        }
        return this.image.getBitmap();
    }

    @Override // com.alibaba.security.wukong.model.ImageRiskSample
    public int getHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
        }
        BitmapImage bitmapImage = this.image;
        if (bitmapImage != null) {
            return bitmapImage.getHeight();
        }
        return 0;
    }

    @Override // com.alibaba.security.wukong.model.ImageRiskSample
    public int getMNNCVImageFormat() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4aec84e2", new Object[]{this})).intValue();
        }
        return MNNCVImageFormat.BGRA.format;
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
        BitmapImage bitmapImage = this.image;
        if (bitmapImage != null) {
            return bitmapImage.getWidth();
        }
        return 0;
    }

    @Override // com.alibaba.security.wukong.model.CCRCRiskSample
    public boolean isValid() {
        BitmapImage bitmapImage;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        if (!super.isValid() || (bitmapImage = this.image) == null || bitmapImage.getBitmap() == null) {
            return false;
        }
        return true;
    }

    public void setBitmap(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61407cf6", new Object[]{this, bitmap});
        } else {
            this.image.setBitmap(bitmap);
        }
    }

    @Override // com.alibaba.security.wukong.model.ImageRiskSample
    public MNNCVImage toMNNCVImage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MNNCVImage) ipChange.ipc$dispatch("9b73a671", new Object[]{this});
        }
        return new MNNCVImage(this.image.getBitmap());
    }

    public BitmapImageSample(String str, BitmapImage bitmapImage) {
        super(str);
        this.image = bitmapImage;
        getExtras().putAll(bitmapImage.getExtras());
    }

    public BitmapImageSample(String str, Map<String, Object> map, BitmapImage bitmapImage) {
        super(str, map);
        this.image = bitmapImage;
        getExtras().putAll(bitmapImage.getExtras());
    }
}
