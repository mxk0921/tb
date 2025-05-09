package tb;

import com.alibaba.ability.MegaUtils;
import com.taobao.android.abilityidl.ability.PhotoCaptureType;
import com.taobao.android.abilityidl.ability.PhotoMediaType;
import com.taobao.android.abilityidl.ability.PhotoToggleState;
import com.taobao.browser.jsbridge.ui.CameraActivity;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class z1m {

    /* renamed from: a  reason: collision with root package name */
    public final String f32463a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Integer f;
    public final Integer g;
    public final Integer h;
    public final String i;
    public final String j;
    public final String k;
    public final Double l;
    public final Double m;
    public final Map<String, ? extends Object> n;

    static {
        t2o.a(525337393);
    }

    public z1m() {
        this.b = "all";
        this.c = "back";
        this.i = "false";
        this.j = "false";
    }

    public z1m(Map<String, ? extends Object> map) {
        this();
        MegaUtils.x(map, "bizName", null);
        this.f32463a = MegaUtils.x(map, dov.URL_KEY_BIZ_LINE, null);
        MegaUtils.x(map, z9u.KEY_TAOKE_BIZSCENE, null);
        String str = "all";
        String a2 = PhotoMediaType.Companion.a(MegaUtils.x(map, "type", str));
        this.b = a2 != null ? a2 : str;
        String str2 = "back";
        String a3 = PhotoCaptureType.Companion.a(MegaUtils.x(map, "captureType", str2));
        this.c = a3 != null ? a3 : str2;
        this.d = MegaUtils.x(map, "imgUploadBizCode", null);
        MegaUtils.x(map, "imgUploadBizLine", null);
        this.e = MegaUtils.x(map, "videoUploadBizCode", null);
        MegaUtils.m(map, "videoMaxDuration", -1);
        this.f = MegaUtils.m(map, "videoMaxSize", null);
        this.g = MegaUtils.m(map, "imageMaxSize", null);
        this.h = MegaUtils.m(map, "maxSelection", null);
        PhotoToggleState.a aVar = PhotoToggleState.Companion;
        String str3 = "false";
        String a4 = aVar.a(MegaUtils.x(map, "needUpload", str3));
        this.i = a4 == null ? str3 : a4;
        String a5 = aVar.a(MegaUtils.x(map, "needThumbBase64", str3));
        this.j = a5 != null ? a5 : str3;
        this.k = MegaUtils.x(map, "maskImg", null);
        this.l = MegaUtils.j(map, CameraActivity.MASK_WIDTH, null);
        this.m = MegaUtils.j(map, CameraActivity.MASK_HEIGHT, null);
        this.n = MegaUtils.s(map, "extra");
    }
}
