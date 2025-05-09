package tb;

import com.alibaba.ability.MegaUtils;
import com.taobao.umipublish.extension.preview.video.UmiVideoPreviewActivity;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class wev {

    /* renamed from: a  reason: collision with root package name */
    public final String f30661a;
    public final Map<String, ? extends Object> b;
    public final Map<String, ? extends Object> c;
    public final String d;
    public final Boolean e;
    public final Boolean f;
    public final Boolean g;
    public final Boolean h;

    static {
        t2o.a(525337647);
    }

    public wev() {
    }

    public wev(Map<String, ? extends Object> map) {
        this();
        this.f30661a = MegaUtils.x(map, "videoPath", null);
        this.b = MegaUtils.s(map, "video");
        this.c = MegaUtils.s(map, "cover");
        this.d = MegaUtils.x(map, "ratio", null);
        this.e = MegaUtils.h(map, UmiVideoPreviewActivity.KEY_CAN_EDIT_VIDEO, null);
        this.f = MegaUtils.h(map, UmiVideoPreviewActivity.KEY_CAN_EDIT_COVER, null);
        this.g = MegaUtils.h(map, UmiVideoPreviewActivity.KEY_CAN_DELETE_VIDEO, null);
        this.h = MegaUtils.h(map, "originalAudioMute", null);
    }
}
