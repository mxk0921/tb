package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taopai.business.image.external.AspectRatio;
import com.taobao.taopai.business.image.external.BitmapSize;
import com.taobao.taopai.business.image.external.Config;
import mtopsdk.mtop.upload.domain.UploadConstants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ag4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(623902801);
    }

    public static Config a() {
        AspectRatio aspectRatio;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (Config) ipChange.ipc$dispatch("6e980d40", new Object[0]);
        }
        com.taobao.android.pissarro.external.Config a2 = q3m.c().a();
        Config.b bVar = new Config.b();
        bVar.H(a2.getBizCode());
        bVar.L(a2.isEnableClip());
        bVar.O(a2.isEnableFilter());
        bVar.X(a2.isMultiple());
        if (a2.isMultiple() && mq9.a()) {
            z = true;
        }
        bVar.N(z);
        bVar.Q(a2.isEnableMosaic());
        bVar.P(a2.isEnableGraffiti());
        bVar.S(a2.isEnableSticker());
        bVar.R(a2.isEnablePosture());
        bVar.Y(a2.getStickerIds());
        bVar.Z(a2.isSupportGif());
        bVar.V(a2.getMaxStickerCount());
        bVar.U(a2.getMaxSelectCount());
        bVar.K(a2.getDefinitionMode());
        bVar.a0(a2.getWindowMode());
        bVar.T(a2.getFacing());
        BitmapSize bitmapSize = null;
        if (a2.getAspectRatio() != null) {
            aspectRatio = new AspectRatio(a2.getAspectRatio().getAspectRatioX(), a2.getAspectRatio().getAspectRatioY());
        } else {
            aspectRatio = null;
        }
        bVar.F(aspectRatio);
        if (a2.getBitmapSize() != null) {
            bitmapSize = new BitmapSize(a2.getBitmapSize().getWidth(), a2.getBitmapSize().getHeight());
        }
        bVar.G(bitmapSize);
        return bVar.E();
    }

    public static String b() {
        String str;
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2089b826", new Object[0]);
        }
        com.taobao.android.pissarro.external.Config a2 = q3m.c().a();
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("http").authority("h5.m.taobao.com").path("/taopai/image_gallery.html").appendQueryParameter("requestCode", "2");
        if (a2.isUseNewUi()) {
            str = "selectGallery";
        } else {
            str = "selectGalleryImage";
        }
        String str4 = "1";
        String str5 = "0";
        Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("scene", str).appendQueryParameter("sync_upload", a2.isAutoUpload() ? str4 : str5).appendQueryParameter("use_message_ui", a2.isUseNewUi() ? str4 : str5).appendQueryParameter(UploadConstants.BIZ_CODE, a2.getVideoBizCode()).appendQueryParameter("finish_button_text", a2.getFinishButtonText()).appendQueryParameter("image_edit_enable", (a2.isEnableClip() || a2.isEnableGraffiti() || a2.isEnableMosaic() || a2.isEnableSticker()) ? str4 : str5).appendQueryParameter("image_sticker_enable", a2.isEnableSticker() ? str4 : str5).appendQueryParameter("image_cut_enable", a2.isEnableClip() ? str4 : str5).appendQueryParameter("image_mosaic_enable", a2.isEnableMosaic() ? str4 : str5).appendQueryParameter("image_graffiti_enable", a2.isEnableGraffiti() ? str4 : str5).appendQueryParameter("photo_max", String.valueOf(a2.getMaxSelectCount())).appendQueryParameter("img_bizcode", a2.getBizCode());
        Uri.Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter("max_import_video_size", a2.getMaxVideoSize() + "");
        Uri.Builder appendQueryParameter4 = appendQueryParameter3.appendQueryParameter("max_import_video_duration", a2.getMaxVideoDuration() + "");
        if (TextUtils.isEmpty(a2.getMediaType())) {
            str2 = "all";
        } else {
            str2 = a2.getMediaType();
        }
        Uri.Builder appendQueryParameter5 = appendQueryParameter4.appendQueryParameter(dov.KEY_MEDIA_TYPE, str2);
        Uri.Builder appendQueryParameter6 = appendQueryParameter5.appendQueryParameter("image_max_size", a2.getMaxImageSize() + "").appendQueryParameter(dov.KEY_BIZ_LINE, a2.getBizLine());
        if (TextUtils.isEmpty(a2.getBizScene())) {
            str3 = "pissarro";
        } else {
            str3 = a2.getBizScene();
        }
        Uri.Builder appendQueryParameter7 = appendQueryParameter6.appendQueryParameter("biz_scene", str3).appendQueryParameter("compress_quality", a2.getPublishConfig() != null ? String.valueOf(a2.getPublishConfig().getCompressQuality()) : str5).appendQueryParameter("compress_image_min_side", a2.getPublishConfig() != null ? String.valueOf(a2.getPublishConfig().getCompressImageMinSide()) : str5);
        if (a2.getPublishConfig() != null) {
            str5 = String.valueOf(a2.getPublishConfig().getRequestImageMinSide());
        }
        Uri.Builder appendQueryParameter8 = appendQueryParameter7.appendQueryParameter("request_image_min_side", str5);
        if (a2.getPublishConfig() != null) {
            str4 = String.valueOf(a2.getPublishConfig().getOriginImageEnable());
        }
        return appendQueryParameter8.appendQueryParameter("origin_image_enable", str4).build().toString();
    }

    public static String c() {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f9168351", new Object[0]);
        }
        com.taobao.android.pissarro.external.Config a2 = q3m.c().a();
        String str3 = "0";
        String str4 = "1";
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("http").authority("h5.m.taobao.com").path("/taopai/record.html").appendQueryParameter("scene", "defaultpublish").appendQueryParameter("requestCode", "2").appendQueryParameter("record_music_off", str3).appendQueryParameter("pic_ratio_off", str3).appendQueryParameter("record_decals_off", str3).appendQueryParameter("back_camera", a2.getFacing() != 1 ? str4 : str3).appendQueryParameter("sync_upload", a2.isAutoUpload() ? str4 : str3).appendQueryParameter("use_message_ui", a2.isUseNewUi() ? str4 : str3).appendQueryParameter(UploadConstants.BIZ_CODE, a2.getVideoBizCode()).appendQueryParameter("finish_button_text", a2.getFinishButtonText()).appendQueryParameter("image_edit_enable", (a2.isEnableClip() || a2.isEnableGraffiti() || a2.isEnableMosaic() || a2.isEnableSticker()) ? str4 : str3).appendQueryParameter("image_sticker_enable", a2.isEnableSticker() ? str4 : str3).appendQueryParameter("image_cut_enable", a2.isEnableClip() ? str4 : str3).appendQueryParameter("image_mosaic_enable", a2.isEnableMosaic() ? str4 : str3).appendQueryParameter("image_graffiti_enable", a2.isEnableGraffiti() ? str4 : str3).appendQueryParameter("photo_max", String.valueOf(a2.getMaxSelectCount())).appendQueryParameter("img_bizcode", a2.getBizCode());
        Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("max_import_video_size", a2.getMaxVideoSize() + "");
        Uri.Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter("max_import_video_duration", a2.getMaxVideoDuration() + "");
        if (TextUtils.isEmpty(a2.getMediaType())) {
            str = "photo";
        } else {
            str = a2.getMediaType();
        }
        Uri.Builder appendQueryParameter4 = appendQueryParameter3.appendQueryParameter(dov.KEY_MEDIA_TYPE, str);
        Uri.Builder appendQueryParameter5 = appendQueryParameter4.appendQueryParameter("image_max_size", a2.getMaxImageSize() + "").appendQueryParameter(dov.KEY_BIZ_LINE, a2.getBizLine());
        if (TextUtils.isEmpty(a2.getBizScene())) {
            str2 = "pissarro";
        } else {
            str2 = a2.getBizScene();
        }
        Uri.Builder appendQueryParameter6 = appendQueryParameter5.appendQueryParameter("biz_scene", str2).appendQueryParameter("compress_quality", a2.getPublishConfig() != null ? String.valueOf(a2.getPublishConfig().getCompressQuality()) : str3).appendQueryParameter("compress_image_min_side", a2.getPublishConfig() != null ? String.valueOf(a2.getPublishConfig().getCompressImageMinSide()) : str3);
        if (a2.getPublishConfig() != null) {
            str3 = String.valueOf(a2.getPublishConfig().getRequestImageMinSide());
        }
        Uri.Builder appendQueryParameter7 = appendQueryParameter6.appendQueryParameter("request_image_min_side", str3);
        if (a2.getPublishConfig() != null) {
            str4 = String.valueOf(a2.getPublishConfig().getOriginImageEnable());
        }
        return appendQueryParameter7.appendQueryParameter("origin_image_enable", str4).build().toString();
    }
}
