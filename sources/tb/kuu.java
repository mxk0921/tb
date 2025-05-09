package tb;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.data.ImageBean;
import com.taobao.android.litecreator.base.data.UGCImage;
import com.taobao.android.litecreator.base.data.UGCVideo;
import com.taobao.android.litecreator.base.data.VideoBean;
import com.taobao.android.litecreator.sdk.editor.data.EditorInfo;
import com.taobao.android.litecreator.sdk.editor.data.ImageEditInfo;
import com.taobao.android.litecreator.sdk.editor.data.MultiVideoClips;
import com.taobao.android.litecreator.sdk.editor.data.Resource;
import com.taobao.android.litecreator.sdk.editor.data.TemplateInfo;
import com.taobao.android.litecreator.util.MediaUtils;
import com.taobao.android.mediapick.media.VideoMedia;
import com.taobao.login4android.qrcode.data.QrCodeData;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class kuu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_MEDIA_ID = "mediaId";
    public static final String KEY_MEDIA_MIME_TYPE = "mediaMimeType";
    public static final String KEY_MEDIA_URI = "mediaUri";
    public static final String MEDIA_RESOURCE_EXTRA_VIDEO_MIME_TYPE = "video_media_type";
    public static final String MEDIA_RESOURCE_EXTRA_VIDEO_URI = "video_uri";

    /* renamed from: a  reason: collision with root package name */
    public static final String f22939a = "VideoClipBegin";
    public static final String b = "VideoClipEnd";
    public static final String c = "mediaType";

    public static void a(UGCImage uGCImage) {
        TemplateInfo templateInfo;
        ImageEditInfo imageEditInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8da8ab0b", new Object[]{uGCImage});
        } else if (uGCImage != null) {
            EditorInfo editorInfo = new EditorInfo();
            editorInfo.resource = new Resource();
            if (uGCImage.origin != null) {
                MultiVideoClips multiVideoClips = new MultiVideoClips();
                ImageBean imageBean = uGCImage.origin;
                multiVideoClips.data.add(new MultiVideoClips.MediaResource(imageBean.path, 3000L, imageBean.getDisplayWidth(), uGCImage.origin.getDisplayHeight(), 30.0f));
                editorInfo.resource.originData = multiVideoClips;
            }
            if (uGCImage.compress != null) {
                MultiVideoClips multiVideoClips2 = new MultiVideoClips();
                ImageBean imageBean2 = uGCImage.compress;
                multiVideoClips2.data.add(new MultiVideoClips.MediaResource(imageBean2.path, 3000L, imageBean2.getDisplayWidth(), uGCImage.compress.getDisplayHeight(), 30.0f));
                editorInfo.resource.compressData = multiVideoClips2;
            }
            Object meta = uGCImage.getMeta("imageEditDraft");
            if (!(meta instanceof String) || (imageEditInfo = (ImageEditInfo) JSON.parseObject((String) meta, ImageEditInfo.class)) == null || (templateInfo = imageEditInfo.templateInfo) == null) {
                templateInfo = null;
            } else {
                editorInfo.resource.type = templateInfo.resourceType;
            }
            uGCImage.editorInfo = editorInfo;
            uGCImage.templateInfo = templateInfo;
        }
    }

    public static void b(UGCVideo uGCVideo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("789e7ccb", new Object[]{uGCVideo});
        } else if (uGCVideo != null) {
            EditorInfo editorInfo = new EditorInfo();
            editorInfo.resource = new Resource();
            if (uGCVideo.raw != null) {
                MultiVideoClips multiVideoClips = new MultiVideoClips();
                VideoBean videoBean = uGCVideo.raw;
                multiVideoClips.data.add(new MultiVideoClips.MediaResource(videoBean.path, videoBean.duration, videoBean.getDisplayWidth(), uGCVideo.raw.getDisplayHeight(), uGCVideo.raw.framerate));
                editorInfo.resource.rawData = multiVideoClips;
            }
            if (uGCVideo.origin != null) {
                MultiVideoClips multiVideoClips2 = new MultiVideoClips();
                VideoBean videoBean2 = uGCVideo.origin;
                multiVideoClips2.data.add(new MultiVideoClips.MediaResource(videoBean2.path, videoBean2.duration, videoBean2.getDisplayWidth(), uGCVideo.origin.getDisplayHeight(), uGCVideo.origin.framerate));
                editorInfo.resource.originData = multiVideoClips2;
            }
            if (uGCVideo.compress != null) {
                MultiVideoClips multiVideoClips3 = new MultiVideoClips();
                VideoBean videoBean3 = uGCVideo.compress;
                multiVideoClips3.data.add(new MultiVideoClips.MediaResource(videoBean3.path, videoBean3.duration, videoBean3.getDisplayWidth(), uGCVideo.compress.getDisplayHeight(), uGCVideo.compress.framerate));
                editorInfo.resource.compressData = multiVideoClips3;
            }
            uGCVideo.editorInfo = editorInfo;
        }
    }

    public static void c(UGCVideo uGCVideo, List<UGCVideo> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("533b1698", new Object[]{uGCVideo, list, new Boolean(z)});
        } else if (uGCVideo != null && list != null && list.size() > 0) {
            EditorInfo editorInfo = new EditorInfo();
            editorInfo.resource = new Resource();
            MultiVideoClips multiVideoClips = new MultiVideoClips();
            MultiVideoClips multiVideoClips2 = new MultiVideoClips();
            MultiVideoClips multiVideoClips3 = new MultiVideoClips();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                UGCVideo uGCVideo2 = list.get(i);
                if (uGCVideo2 != null) {
                    if (uGCVideo2.raw != null) {
                        multiVideoClips.data.add(f(uGCVideo2));
                        editorInfo.resource.rawData = multiVideoClips;
                    }
                    if (uGCVideo2.origin != null) {
                        multiVideoClips2.data.add(e(uGCVideo2));
                        editorInfo.resource.originData = multiVideoClips2;
                    }
                    if (uGCVideo2.compress != null) {
                        multiVideoClips3.data.add(d(uGCVideo2));
                        editorInfo.resource.compressData = multiVideoClips3;
                    }
                    if (uGCVideo2.compress == null && z) {
                        multiVideoClips3.data.add(f(uGCVideo2));
                        editorInfo.resource.compressData = multiVideoClips3;
                    }
                }
            }
            if (size == 1 && list.get(0) != null) {
                uGCVideo.raw = list.get(0).raw;
                uGCVideo.origin = list.get(0).origin;
                uGCVideo.compress = list.get(0).compress;
            }
            uGCVideo.editorInfo = editorInfo;
        }
    }

    public static MultiVideoClips.MediaResource d(UGCVideo uGCVideo) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MultiVideoClips.MediaResource) ipChange.ipc$dispatch("8c7d640f", new Object[]{uGCVideo});
        }
        VideoBean videoBean = uGCVideo.compress;
        MultiVideoClips.MediaResource mediaResource = new MultiVideoClips.MediaResource(videoBean.path, videoBean.duration, videoBean.getDisplayWidth(), uGCVideo.compress.getDisplayHeight(), uGCVideo.compress.framerate);
        HashMap<String, Serializable> hashMap = uGCVideo.compress.attach;
        String str2 = f22939a;
        if (hashMap.containsKey(str2)) {
            HashMap<String, Serializable> hashMap2 = uGCVideo.compress.attach;
            String str3 = b;
            if (hashMap2.containsKey(str3)) {
                mediaResource.startTimeMs = ((Long) uGCVideo.compress.attach.get(str2)).longValue();
                long longValue = ((Long) uGCVideo.compress.attach.get(str3)).longValue();
                mediaResource.endTimeMs = longValue;
                mediaResource.clipDurationMs = longValue - mediaResource.startTimeMs;
            }
        }
        String str4 = c;
        if (TextUtils.isEmpty((CharSequence) uGCVideo.getMeta(str4))) {
            str = "video";
        } else {
            str = (String) uGCVideo.getMeta(str4);
        }
        mediaResource.mediaType = str;
        if (uGCVideo.getMeta().containsKey("mediaId")) {
            mediaResource.mediaId = ((Integer) uGCVideo.getMeta("mediaId")).intValue();
        }
        return mediaResource;
    }

    public static MultiVideoClips.MediaResource e(UGCVideo uGCVideo) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MultiVideoClips.MediaResource) ipChange.ipc$dispatch("b3a054b", new Object[]{uGCVideo});
        }
        VideoBean videoBean = uGCVideo.origin;
        MultiVideoClips.MediaResource mediaResource = new MultiVideoClips.MediaResource(videoBean.path, videoBean.duration, videoBean.getDisplayWidth(), uGCVideo.origin.getDisplayHeight(), uGCVideo.origin.framerate);
        HashMap<String, Serializable> hashMap = uGCVideo.origin.attach;
        String str2 = f22939a;
        if (hashMap.containsKey(str2)) {
            HashMap<String, Serializable> hashMap2 = uGCVideo.origin.attach;
            String str3 = b;
            if (hashMap2.containsKey(str3)) {
                mediaResource.startTimeMs = ((Long) uGCVideo.origin.attach.get(str2)).longValue();
                long longValue = ((Long) uGCVideo.origin.attach.get(str3)).longValue();
                mediaResource.endTimeMs = longValue;
                mediaResource.clipDurationMs = longValue - mediaResource.startTimeMs;
            }
        }
        String str4 = c;
        if (TextUtils.isEmpty((CharSequence) uGCVideo.getMeta(str4))) {
            str = "video";
        } else {
            str = (String) uGCVideo.getMeta(str4);
        }
        mediaResource.mediaType = str;
        if (uGCVideo.getMeta().containsKey("mediaId")) {
            mediaResource.mediaId = ((Integer) uGCVideo.getMeta("mediaId")).intValue();
        }
        return mediaResource;
    }

    public static MultiVideoClips.MediaResource f(UGCVideo uGCVideo) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MultiVideoClips.MediaResource) ipChange.ipc$dispatch("12430265", new Object[]{uGCVideo});
        }
        VideoBean videoBean = uGCVideo.raw;
        MultiVideoClips.MediaResource mediaResource = new MultiVideoClips.MediaResource(videoBean.path, videoBean.duration, videoBean.getDisplayWidth(), uGCVideo.raw.getDisplayHeight(), uGCVideo.raw.framerate);
        HashMap<String, Serializable> hashMap = uGCVideo.raw.attach;
        String str2 = f22939a;
        if (hashMap.containsKey(str2)) {
            HashMap<String, Serializable> hashMap2 = uGCVideo.raw.attach;
            String str3 = b;
            if (hashMap2.containsKey(str3)) {
                mediaResource.startTimeMs = ((Long) uGCVideo.raw.attach.get(str2)).longValue();
                long longValue = ((Long) uGCVideo.raw.attach.get(str3)).longValue();
                mediaResource.endTimeMs = longValue;
                mediaResource.clipDurationMs = longValue - mediaResource.startTimeMs;
            }
        }
        String str4 = c;
        if (TextUtils.isEmpty((CharSequence) uGCVideo.getMeta(str4))) {
            str = "video";
        } else {
            str = (String) uGCVideo.getMeta(str4);
        }
        mediaResource.mediaType = str;
        if (TextUtils.equals(str, "video")) {
            mediaResource.originDurationMs = uGCVideo.raw.duration;
        }
        if (uGCVideo.getMeta().containsKey("mediaId")) {
            mediaResource.mediaId = ((Integer) uGCVideo.getMeta("mediaId")).intValue();
        }
        if (uGCVideo.getMeta().containsKey(KEY_MEDIA_MIME_TYPE)) {
            mediaResource.extra.put(MEDIA_RESOURCE_EXTRA_VIDEO_MIME_TYPE, uGCVideo.getMeta(KEY_MEDIA_MIME_TYPE));
        }
        if (uGCVideo.getMeta().containsKey(KEY_MEDIA_URI)) {
            mediaResource.extra.put(MEDIA_RESOURCE_EXTRA_VIDEO_URI, uGCVideo.getMeta(KEY_MEDIA_URI));
        }
        return mediaResource;
    }

    public static ImageBean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageBean) ipChange.ipc$dispatch("92ff28a0", new Object[0]);
        }
        return new ImageBean();
    }

    public static VideoBean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoBean) ipChange.ipc$dispatch("a934d260", new Object[0]);
        }
        return new VideoBean();
    }

    public static void i(VideoBean videoBean, MediaMetadataRetriever mediaMetadataRetriever) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf49a45f", new Object[]{videoBean, mediaMetadataRetriever});
            return;
        }
        videoBean.duration = q(mediaMetadataRetriever.extractMetadata(9), 0);
        videoBean.width = q(mediaMetadataRetriever.extractMetadata(18), 0);
        videoBean.height = q(mediaMetadataRetriever.extractMetadata(19), 0);
        videoBean.rotate = q(mediaMetadataRetriever.extractMetadata(24), 0);
        videoBean.framerate = p(mediaMetadataRetriever.extractMetadata(25), 0.0f);
        videoBean.bitRate = q(mediaMetadataRetriever.extractMetadata(20), 0);
    }

    public static List<UGCVideo> j(List<UGCVideo> list, long j) {
        VideoBean videoBean;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c7cd231b", new Object[]{list, new Long(j)});
        }
        if (j <= 0) {
            j = QrCodeData.QR_CODE_VALID_PERIOD;
        }
        if (list != null && list.size() > 0) {
            long j2 = 0;
            for (UGCVideo uGCVideo : list) {
                j2 += uGCVideo.origin.duration;
                if (j2 >= j) {
                    break;
                }
            }
            if (j2 <= j) {
                return list;
            }
            long j3 = 0;
            long j4 = 0;
            for (UGCVideo uGCVideo2 : list) {
                long j5 = uGCVideo2.origin.duration;
                if (j5 <= 60000) {
                    j3 += j5;
                } else {
                    j4 += j5;
                }
            }
            long j6 = j - j3;
            if (j6 <= 0) {
                return list;
            }
            double d = (j6 * 1.0d) / j4;
            for (UGCVideo uGCVideo3 : list) {
                VideoBean videoBean2 = uGCVideo3.origin;
                if (videoBean2.duration > 60000) {
                    videoBean2.attach.put(f22939a, 0L);
                    uGCVideo3.origin.attach.put(b, Long.valueOf(new Double(videoBean.duration * d).longValue()));
                }
            }
        }
        return list;
    }

    public static ImageBean k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageBean) ipChange.ipc$dispatch("5cca369", new Object[]{str});
        }
        if (!cg9.l(str)) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        ImageBean imageBean = new ImageBean();
        imageBean.path = str;
        imageBean.width = options.outWidth;
        imageBean.height = options.outHeight;
        imageBean.rotate = cg9.r(str);
        return imageBean;
    }

    public static VideoBean m(VideoMedia videoMedia) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoBean) ipChange.ipc$dispatch("28e30667", new Object[]{videoMedia});
        }
        VideoBean videoBean = new VideoBean();
        videoBean.path = videoMedia.path;
        videoBean.fileSize = videoMedia.fileSize;
        videoBean.width = videoMedia.width;
        videoBean.height = videoMedia.height;
        videoBean.rotate = videoMedia.orientation;
        videoBean.duration = videoMedia.duration;
        videoBean.ratioType = 128;
        return videoBean;
    }

    public static VideoBean n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoBean) ipChange.ipc$dispatch("5e0fd529", new Object[]{str});
        }
        return o(str, true);
    }

    public static float p(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("246ce28c", new Object[]{str, new Float(f)})).floatValue();
        }
        try {
            return Float.parseFloat(str);
        } catch (Exception unused) {
            return f;
        }
    }

    public static int q(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b468191f", new Object[]{str, new Integer(i)})).intValue();
        }
        try {
            return Integer.parseInt(str);
        } catch (Throwable unused) {
            return i;
        }
    }

    public static VideoBean l(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoBean) ipChange.ipc$dispatch("7b6ee854", new Object[]{context, uri});
        }
        if (uri == null || !knv.h(context, uri)) {
            return null;
        }
        VideoBean videoBean = new VideoBean();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(context, uri);
                i(videoBean, mediaMetadataRetriever);
                videoBean.ratioType = 128;
            } catch (Exception e) {
                odg.c("UGCMediaGenerator", "setDataSource error:" + e.getMessage() + " , uri:" + uri);
            }
            return videoBean;
        } finally {
            mediaMetadataRetriever.release();
        }
    }

    public static VideoBean o(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoBean) ipChange.ipc$dispatch("7fe9ac0d", new Object[]{str, new Boolean(z)});
        }
        long k = cg9.k(str);
        if (k == 0) {
            return null;
        }
        VideoBean videoBean = new VideoBean();
        videoBean.path = str;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(str);
                i(videoBean, mediaMetadataRetriever);
                videoBean.fileSize = k;
                if (z) {
                    videoBean.ratioType = 128;
                } else {
                    videoBean.ratioType = MediaUtils.c(videoBean.width, videoBean.height, videoBean.rotate);
                }
            } catch (Exception e) {
                odg.c("UGCMediaGenerator", "setDataSource error:" + e.getMessage() + " , videoPath:" + str);
            }
            mediaMetadataRetriever.release();
            return videoBean;
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    static {
        t2o.a(511705127);
    }
}
