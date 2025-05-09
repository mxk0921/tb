package androidx.activity.result;

import androidx.activity.result.contract.ActivityResultContracts;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.recommend.CartRecommendRefreshScene;
import kotlin.Metadata;
import tb.ckf;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u0007\b\u0000¢\u0006\u0002\u0010\u0002R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Landroidx/activity/result/PickVisualMediaRequest;", "", "()V", "<set-?>", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "mediaType", "getMediaType", "()Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "setMediaType$activity_release", "(Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;)V", "Builder", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class PickVisualMediaRequest {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ActivityResultContracts.PickVisualMedia.VisualMediaType mediaType = ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Landroidx/activity/result/PickVisualMediaRequest$Builder;", "", "()V", "mediaType", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", CartRecommendRefreshScene.build, "Landroidx/activity/result/PickVisualMediaRequest;", "setMediaType", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class Builder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private ActivityResultContracts.PickVisualMedia.VisualMediaType mediaType = ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE;

        public final PickVisualMediaRequest build() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PickVisualMediaRequest) ipChange.ipc$dispatch("223be302", new Object[]{this});
            }
            PickVisualMediaRequest pickVisualMediaRequest = new PickVisualMediaRequest();
            pickVisualMediaRequest.setMediaType$activity_release(this.mediaType);
            return pickVisualMediaRequest;
        }

        public final Builder setMediaType(ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("7df553ab", new Object[]{this, visualMediaType});
            }
            ckf.g(visualMediaType, "mediaType");
            this.mediaType = visualMediaType;
            return this;
        }
    }

    public final ActivityResultContracts.PickVisualMedia.VisualMediaType getMediaType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActivityResultContracts.PickVisualMedia.VisualMediaType) ipChange.ipc$dispatch("725b7537", new Object[]{this});
        }
        return this.mediaType;
    }

    public final void setMediaType$activity_release(ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da3082b2", new Object[]{this, visualMediaType});
            return;
        }
        ckf.g(visualMediaType, "<set-?>");
        this.mediaType = visualMediaType;
    }
}
