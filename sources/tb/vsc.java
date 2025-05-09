package tb;

import com.alibaba.ability.result.ErrorResult;
import com.taobao.android.abilityidl.ability.ImagePreviewCloseResult;
import com.taobao.android.abilityidl.ability.ImagePreviewInteractionParam;
import kotlin.jvm.JvmDefault;
import tb.gec;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final /* synthetic */ class vsc {
    @JvmDefault
    public static void a(wsc wscVar, ImagePreviewCloseResult imagePreviewCloseResult) {
        ckf.g(imagePreviewCloseResult, "result");
    }

    @JvmDefault
    public static void b(wsc wscVar, ErrorResult errorResult) {
        ckf.g(errorResult, "result");
        gec.a.a(wscVar, errorResult);
    }

    @JvmDefault
    public static void c(wsc wscVar, ImagePreviewInteractionParam imagePreviewInteractionParam) {
        ckf.g(imagePreviewInteractionParam, "result");
    }
}
