package com.taobao.android.dressup.common.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import kotlin.Metadata;
import tb.a7m;
import tb.afi;
import tb.ckf;
import tb.t2o;
import tb.xmo;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001a\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u000e\u001a\u0004\b\u001b\u0010\u0010\"\u0004\b\u001c\u0010\u0012R$\u0010\u001d\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u000e\u001a\u0004\b\u001e\u0010\u0010\"\u0004\b\u001f\u0010\u0012RB\u0010\"\u001a\"\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010 j\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u0001`!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010(\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u000e\u001a\u0004\b)\u0010\u0010\"\u0004\b*\u0010\u0012R\"\u0010+\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b+\u0010\u000e\u001a\u0004\b,\u0010\u0010\"\u0004\b-\u0010\u0012R\"\u0010.\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b.\u0010\u000e\u001a\u0004\b/\u0010\u0010\"\u0004\b0\u0010\u0012R\"\u00101\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b1\u0010\u000e\u001a\u0004\b2\u0010\u0010\"\u0004\b3\u0010\u0012¨\u00064"}, d2 = {"Lcom/taobao/android/dressup/common/model/VideoModel;", "Ltb/afi;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", xmo.SP_KEY_MAIN_PIC_URL, "Ljava/lang/String;", "getMainPicUrl", "()Ljava/lang/String;", "setMainPicUrl", "(Ljava/lang/String;)V", "", "duration", "J", "getDuration", "()J", "setDuration", "(J)V", "videoUrl", "getVideoUrl", "setVideoUrl", "videoId", "getVideoId", "setVideoId", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "utParams", "Ljava/util/HashMap;", "getUtParams", "()Ljava/util/HashMap;", "setUtParams", "(Ljava/util/HashMap;)V", "contentId", "getContentId", "setContentId", a7m.VIDEO_PLAY_SCENES, "getVideoPlayScenes", "setVideoPlayScenes", "bizCode", "getBizCode", "setBizCode", "videoSource", "getVideoSource", "setVideoSource", "turboflow_dressup_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class VideoModel extends afi {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String contentId;
    private long duration;
    private String mainPicUrl;
    private HashMap<String, String> utParams;
    private String videoId;
    private String videoUrl;
    @JSONField(deserialize = false, serialize = false)
    private String videoPlayScenes = "guangguangsolo";
    @JSONField(deserialize = false, serialize = false)
    private String bizCode = "guangguang";
    @JSONField(deserialize = false, serialize = false)
    private String videoSource = "TBVideo";

    static {
        t2o.a(918552677);
    }

    public VideoModel() {
        super("video");
    }

    public static /* synthetic */ Object ipc$super(VideoModel videoModel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dressup/common/model/VideoModel");
    }

    public final String getBizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("826ffbcf", new Object[]{this});
        }
        return this.bizCode;
    }

    public final String getContentId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8392bcfb", new Object[]{this});
        }
        return this.contentId;
    }

    public final long getDuration() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed837a85", new Object[]{this})).longValue();
        }
        return this.duration;
    }

    public final String getMainPicUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e33fe0e5", new Object[]{this});
        }
        return this.mainPicUrl;
    }

    public final HashMap<String, String> getUtParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("ec99e665", new Object[]{this});
        }
        return this.utParams;
    }

    public final String getVideoId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ec0c039", new Object[]{this});
        }
        return this.videoId;
    }

    public final String getVideoPlayScenes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6f420c99", new Object[]{this});
        }
        return this.videoPlayScenes;
    }

    public final String getVideoSource() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("534d0fb9", new Object[]{this});
        }
        return this.videoSource;
    }

    public final String getVideoUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9dbb94cf", new Object[]{this});
        }
        return this.videoUrl;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        String str = this.videoUrl;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str2 = this.videoId;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    public final void setBizCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29306ef", new Object[]{this, str});
            return;
        }
        ckf.g(str, "<set-?>");
        this.bizCode = str;
    }

    public final void setContentId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71029e43", new Object[]{this, str});
        } else {
            this.contentId = str;
        }
    }

    public final void setDuration(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55c2b4c7", new Object[]{this, new Long(j)});
        } else {
            this.duration = j;
        }
    }

    public final void setMainPicUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fba5c331", new Object[]{this, str});
        } else {
            this.mainPicUrl = str;
        }
    }

    public final void setUtParams(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d87d3265", new Object[]{this, hashMap});
        } else {
            this.utParams = hashMap;
        }
    }

    public final void setVideoId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("805acfc5", new Object[]{this, str});
        } else {
            this.videoId = str;
        }
    }

    public final void setVideoPlayScenes(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33275b65", new Object[]{this, str});
            return;
        }
        ckf.g(str, "<set-?>");
        this.videoPlayScenes = str;
    }

    public final void setVideoSource(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e0c1645", new Object[]{this, str});
            return;
        }
        ckf.g(str, "<set-?>");
        this.videoSource = str;
    }

    public final void setVideoUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4945f87", new Object[]{this, str});
        } else {
            this.videoUrl = str;
        }
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!ckf.b(VideoModel.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            VideoModel videoModel = (VideoModel) obj;
            return ckf.b(this.videoUrl, videoModel.videoUrl) && ckf.b(this.videoId, videoModel.videoId);
        }
        throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.dressup.common.model.VideoModel");
    }
}
