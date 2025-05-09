package tb;

import com.taobao.alilive.aliliveframework.context.atmo.bean.AtmosphereResListResponseData;
import com.taobao.alilive.aliliveframework.context.atmo.bean.EffectResConfig;
import com.taobao.alilive.aliliveframework.context.atmo.bean.StickerConfig;
import com.taobao.alilive.aliliveframework.context.atmo.bean.StickerGroup;
import java.util.HashMap;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public interface mhb {
    void b(ux9 ux9Var, AtmosphereResListResponseData.AtmosphereResItem atmosphereResItem, s98 s98Var);

    void destroy();

    List<EffectResConfig> e(String str);

    HashMap<String, StickerConfig> f();

    List<StickerGroup> j();

    void l(ux9 ux9Var, String str, String str2, String str3);

    HashMap<Integer, String> n();

    HashMap<String, StickerConfig> r();
}
