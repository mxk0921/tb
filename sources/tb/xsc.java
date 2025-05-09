package tb;

import com.alibaba.ability.result.ErrorResult;
import com.taobao.android.abilityidl.ability.OpenContainerLoadAppInfoResult;
import kotlin.jvm.JvmDefault;
import tb.p3d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final /* synthetic */ class xsc {
    @JvmDefault
    public static void a(ysc yscVar, OpenContainerLoadAppInfoResult openContainerLoadAppInfoResult) {
        ckf.g(openContainerLoadAppInfoResult, "result");
    }

    @JvmDefault
    public static void b(ysc yscVar, ErrorResult errorResult) {
        ckf.g(errorResult, "result");
        p3d.a.a(yscVar, errorResult);
    }
}
