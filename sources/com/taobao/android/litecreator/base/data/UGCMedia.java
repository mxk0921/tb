package com.taobao.android.litecreator.base.data;

import android.net.Uri;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.data.meta.UGCBase;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import tb.l4n;
import tb.sug;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class UGCMedia extends UGCBase implements IUGCMedia, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String mPublishSessionId;
    private UGCBiz ugcBiz;
    private final ArrayList<UGCImage> images = new ArrayList<>();
    private final ArrayList<UGCVideo> videos = new ArrayList<>();
    private int mediaType = 0;

    static {
        t2o.a(511705126);
        t2o.a(511705112);
    }

    public static /* synthetic */ Object ipc$super(UGCMedia uGCMedia, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/base/data/UGCMedia");
    }

    @Override // com.taobao.android.litecreator.base.data.IUGCMedia
    public void appendImage(UGCImage uGCImage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea17f084", new Object[]{this, uGCImage});
        } else if (uGCImage != null) {
            this.images.add(uGCImage);
        }
    }

    @Override // com.taobao.android.litecreator.base.data.IUGCMedia
    public void appendVideo(UGCVideo uGCVideo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d50dc244", new Object[]{this, uGCVideo});
        } else if (uGCVideo != null) {
            this.videos.add(uGCVideo);
        }
    }

    @Override // com.taobao.android.litecreator.base.data.IUGCMedia
    public UGCBiz getBiz() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UGCBiz) ipChange.ipc$dispatch("d97dd808", new Object[]{this});
        }
        return this.ugcBiz;
    }

    @Override // com.taobao.android.litecreator.base.data.IUGCMedia
    public List<UGCImage> getImages() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("36c826b2", new Object[]{this});
        }
        return this.images;
    }

    @Override // com.taobao.android.litecreator.base.data.IUGCMedia
    public String getPublishSessionId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("648be081", new Object[]{this});
        }
        return this.mPublishSessionId;
    }

    @Override // com.taobao.android.litecreator.base.data.IUGCMedia
    public int getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue();
        }
        int i = this.mediaType;
        if (i != 0) {
            return i;
        }
        List<UGCImage> images = getImages();
        if (images != null && images.size() > 0) {
            return 1;
        }
        List<UGCVideo> videos = getVideos();
        if (videos == null || videos.size() <= 0) {
            return 0;
        }
        return 2;
    }

    @Override // com.taobao.android.litecreator.base.data.IUGCMedia
    public List<UGCVideo> getVideos() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4cb8c1d2", new Object[]{this});
        }
        return this.videos;
    }

    @Override // com.taobao.android.litecreator.base.data.IUGCMedia
    public void initPublishSessionId(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99be97ae", new Object[]{this, uri});
        } else {
            this.mPublishSessionId = l4n.a(uri);
        }
    }

    @Override // com.taobao.android.litecreator.base.data.IUGCMedia
    public void removeImage(UGCImage uGCImage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e70eee", new Object[]{this, uGCImage});
        } else if (uGCImage != null) {
            this.images.remove(uGCImage);
        }
    }

    @Override // com.taobao.android.litecreator.base.data.IUGCMedia
    public void resetMedia() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89b8eddc", new Object[]{this});
            return;
        }
        this.images.clear();
        this.videos.clear();
    }

    @Override // com.taobao.android.litecreator.base.data.IUGCMedia
    public void setBiz(UGCBiz uGCBiz) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8a89e9c", new Object[]{this, uGCBiz});
        } else {
            this.ugcBiz = uGCBiz;
        }
    }

    @Override // com.taobao.android.litecreator.base.data.IUGCMedia
    public void setPublishSessionId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6932be15", new Object[]{this, str});
        } else {
            this.mPublishSessionId = str;
        }
    }

    @Override // com.taobao.android.litecreator.base.data.IUGCMedia
    public void setType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77e09620", new Object[]{this, new Integer(i)});
        } else {
            this.mediaType = i;
        }
    }

    @Override // com.taobao.android.litecreator.base.data.IUGCMedia
    public void swapImage(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab4c4af", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            sug.b(this.images, i, i2);
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "UGCMedia{publishSessionId=" + this.mPublishSessionId + "images=" + this.images + ", videos=" + this.videos + ", meta=" + getMeta() + ", ugcBiz=" + this.ugcBiz + '}';
    }

    @Override // com.taobao.android.litecreator.base.data.IUGCMedia
    public IUGCMedia makeCopy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IUGCMedia) ipChange.ipc$dispatch("69c4014a", new Object[]{this});
        }
        UGCMedia uGCMedia = new UGCMedia();
        uGCMedia.mPublishSessionId = this.mPublishSessionId;
        uGCMedia.images.addAll(this.images);
        uGCMedia.videos.addAll(this.videos);
        uGCMedia.getMeta().putAll(getMeta());
        uGCMedia.ugcBiz = this.ugcBiz;
        return uGCMedia;
    }
}
