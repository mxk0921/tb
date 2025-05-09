package com.taobao.android.litecreator.sdk.editor.data;

import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.AbsEditInfo;
import com.taobao.android.litecreator.sdk.editor.data.base.Beauty;
import com.taobao.taobao.R;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import tb.odg;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class VideoEditInfo extends AbsEditInfo implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String SOURCE_TITLE = Localization.q(R.string.gg_pub_original);
    public static final String TAG = "VideoEditInfo";
    public AiQuality aiQuality;
    public Beauty beauty;
    public Cut cut;
    public Filter filter;
    public boolean isInputMusic;
    public List<RichLabel> labels;
    public MediaClips mediaClips;
    public List<? extends Media> medias;
    public Music music;
    public List<Paster> pasters;
    public Sticker sticker;
    public Template template;
    public transient Video video;
    public long videoOriginDurationUs;
    public Volume volume;

    static {
        t2o.a(511705451);
    }

    public static /* synthetic */ Object ipc$super(VideoEditInfo videoEditInfo, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/sdk/editor/data/VideoEditInfo");
    }

    private boolean isAiQualityChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aba8b9c8", new Object[]{this})).booleanValue();
        }
        AiQuality aiQuality = this.aiQuality;
        if (aiQuality == null || !aiQuality.enable) {
            return false;
        }
        return true;
    }

    private boolean isBeautyChange() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2807f21", new Object[]{this})).booleanValue();
        }
        if (this.beauty != null) {
            z = true;
        } else {
            z = false;
        }
        odg.d(TAG, "isFilterChange: " + z + " " + this.filter);
        return z;
    }

    private boolean isCutCanvasChange() {
        boolean z;
        Cut cut;
        Canvas canvas;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47678c8b", new Object[]{this})).booleanValue();
        }
        if (this.video == null || (cut = this.cut) == null || (canvas = cut.canvas) == null || (SOURCE_TITLE.equalsIgnoreCase(canvas.aspectRatioTitle) && !this.cut.canvas.customizeBg)) {
            z = false;
        } else {
            z = true;
        }
        odg.d(TAG, "isCutCanvasChange: " + z);
        return z;
    }

    private boolean isFilterChange() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1090af1d", new Object[]{this})).booleanValue();
        }
        if (this.filter != null) {
            z = true;
        } else {
            z = false;
        }
        odg.d(TAG, "isFilterChange: " + z + " " + this.filter);
        return z;
    }

    private boolean isMediaClipChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b57a3f25", new Object[]{this})).booleanValue();
        }
        MediaClips mediaClips = this.mediaClips;
        if (mediaClips == null || !mediaClips.isChange) {
            return false;
        }
        return true;
    }

    private boolean isMusicChange() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8465d1b6", new Object[]{this})).booleanValue();
        }
        if (this.music != null || this.isInputMusic) {
            z = true;
        } else {
            z = false;
        }
        odg.d(TAG, "isMusicChange: " + z + " " + this.music);
        return z;
    }

    private boolean isPasterChange() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e788b24", new Object[]{this})).booleanValue();
        }
        List<Paster> list = this.pasters;
        if (list == null || list.size() <= 0) {
            z = false;
        } else {
            z = true;
        }
        odg.d(TAG, "isPasterChange: " + z + " " + this.pasters);
        return z;
    }

    private boolean isPasterEquals(VideoEditInfo videoEditInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9157c8b", new Object[]{this, videoEditInfo})).booleanValue();
        }
        List<Paster> list = videoEditInfo.pasters;
        if (list == null && this.pasters == null) {
            return true;
        }
        if (list == null || this.pasters == null || list.size() != this.pasters.size()) {
            return false;
        }
        int size = this.pasters.size();
        for (int i = 0; i < size; i++) {
            if (!this.pasters.get(i).isSameAs(videoEditInfo.pasters.get(i))) {
                return false;
            }
        }
        return true;
    }

    private boolean isSetMusic() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("458efc38", new Object[]{this})).booleanValue();
        }
        if (this.music != null) {
            z = true;
        } else {
            z = false;
        }
        odg.d(TAG, "isMusicChange: " + z + " " + this.music);
        return z;
    }

    private boolean isStickerChange() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("38b8694e", new Object[]{this})).booleanValue();
        }
        if (this.sticker != null) {
            z = true;
        } else {
            z = false;
        }
        odg.d(TAG, "isStickerChange: " + z + " " + this.sticker);
        return z;
    }

    private boolean isTemplateChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee84ab1f", new Object[]{this})).booleanValue();
        }
        Template template = this.template;
        if (template == null || TextUtils.isEmpty(template.tid)) {
            return false;
        }
        return true;
    }

    private boolean isVolumeChange() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e146283f", new Object[]{this})).booleanValue();
        }
        Volume volume = this.volume;
        if (volume != null) {
            float f = volume.originVolume;
            float f2 = Volume.DEFAULT_VOLUME_VALUE;
            if (!(f == f2 && volume.musicVolume == f2)) {
                z = true;
                odg.d(TAG, "isVolumeChange: " + z + "" + this.volume);
                return z;
            }
        }
        z = false;
        odg.d(TAG, "isVolumeChange: " + z + "" + this.volume);
        return z;
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
        VideoEditInfo videoEditInfo = (VideoEditInfo) obj;
        if (!Objects.equals(this.cut, videoEditInfo.cut) || !Objects.equals(this.filter, videoEditInfo.filter) || !Objects.equals(this.music, videoEditInfo.music) || !Objects.equals(this.volume, videoEditInfo.volume) || !Objects.equals(this.sticker, videoEditInfo.sticker) || !Objects.equals(this.labels, videoEditInfo.labels) || !Objects.equals(this.mediaClips, videoEditInfo.mediaClips) || !Objects.equals(this.template, videoEditInfo.template) || !Objects.equals(this.medias, videoEditInfo.medias) || !Objects.equals(this.aiQuality, videoEditInfo.aiQuality) || !isPasterEquals(videoEditInfo)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return Objects.hash(this.cut, this.filter, this.music, this.volume, this.sticker, this.labels, this.aiQuality);
    }

    public boolean isCutTimeChange() {
        boolean z;
        Cut cut;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("810531c0", new Object[]{this})).booleanValue();
        }
        if (this.video == null || (cut = this.cut) == null || cut.getDuration() >= this.videoOriginDurationUs) {
            z = false;
        } else {
            z = true;
        }
        odg.d(TAG, "isCutTimeChange: " + z);
        return z;
    }

    public boolean isEdited() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12be64fe", new Object[]{this})).booleanValue();
        }
        if (isFilterChange() || isCutTimeChange() || isCutCanvasChange() || isMusicChange() || isStickerChange() || isVolumeChange() || isMediaClipChange() || isPasterChange() || isTemplateChange() || isMediasChange() || isAiQualityChange() || isBeautyChange()) {
            return true;
        }
        return false;
    }

    public boolean isEditedForCanExitDirectly() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("792f4339", new Object[]{this})).booleanValue();
        }
        if (isFilterChange() || isCutTimeChange() || isCutCanvasChange() || isMusicChange() || isStickerChange() || isVolumeChange() || isMediaClipChange() || isPasterChange() || isTemplateChange() || isMediasChange()) {
            return true;
        }
        return false;
    }

    public boolean isEditedWithoutTemplateChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3a8888a", new Object[]{this})).booleanValue();
        }
        if (isFilterChange() || isCutTimeChange() || isCutCanvasChange() || isSetMusic() || isStickerChange() || isVolumeChange() || isMediaClipChange() || isPasterChange() || isAiQualityChange() || isBeautyChange()) {
            return true;
        }
        return false;
    }

    public boolean isMediasChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fbae9ff4", new Object[]{this})).booleanValue();
        }
        List<? extends Media> list = this.medias;
        if (list == null || list.size() <= 1) {
            return false;
        }
        return true;
    }

    public boolean isOnlyTimeRangeChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ea6af5", new Object[]{this})).booleanValue();
        }
        if (!isCutTimeChange() || isCutCanvasChange() || isMusicChange() || isStickerChange() || isFilterChange() || isVolumeChange() || isPasterChange() || isMediasChange() || isAiQualityChange() || isBeautyChange()) {
            return false;
        }
        return true;
    }

    public void setMedias(List<Media> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0e95509", new Object[]{this, list});
        } else {
            this.medias = list;
        }
    }

    @Override // com.taobao.android.litecreator.sdk.editor.AbsEditInfo
    public String toJSONString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d39b47a5", new Object[]{this});
        }
        return JSON.toJSONString(this);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "VideoEditInfo{cut=" + this.cut + ", filter=" + this.filter + ", music=" + this.music + ", volume=" + this.volume + ", sticker=" + this.sticker + ", isInputMusic=" + this.isInputMusic + ", videoDurationUs=" + this.videoOriginDurationUs + ", video=" + this.video + ", labels=" + this.labels + ", pasters=" + this.pasters + ", mediaClips=" + this.mediaClips + ", template=" + this.template + ", aiquality=" + this.aiQuality + '}';
    }
}
