package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface s3m {
    public static final String URL_BASE_CAMERA;
    public static final String URL_CAMERA_BACK_FACING;
    public static final String URL_CAMERA_FRONT_FACING;
    public static final String COMMON_KEY = "?biz_scene=pissarro";
    public static final String URL_IMAGE_EDIT = uol.b.concat(COMMON_KEY);

    static {
        String concat = uol.a.concat("?biz_scene=pissarro&scene=cameraPhoto&media_type=photo&record_music_off=1&gallery_mul_select_enable=0&record_decals_off=1&pic_ratio_off=1");
        URL_BASE_CAMERA = concat;
        URL_CAMERA_FRONT_FACING = concat;
        URL_CAMERA_BACK_FACING = concat + "&back_camera=1";
    }
}
