package tb;

import android.content.Context;
import com.taobao.android.turbo.core.component.BaseOuterComponent;
import com.taobao.android.turbo.core.service.BaseServiceDelegate;
import com.taobao.android.turbo.core.subpage.BaseSubPageComponent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface s4d {
    BaseOuterComponent<?, ?> getOuterComponentClasses(BaseOuterComponent.OuterComponentType outerComponentType, String str, Context context, Object obj, String str2, String str3, BaseServiceDelegate baseServiceDelegate);

    BaseSubPageComponent<?, ?> getSubPageComponent(String str, BaseOuterComponent.OuterComponentType outerComponentType, String str2, Context context, Object obj, String str3, String str4, BaseServiceDelegate baseServiceDelegate);

    j12<?> getSubPageConfig(BaseSubPageComponent.SubPageModel subPageModel);

    htd getSubPagePreload(String str, qpu qpuVar, String str2);
}
