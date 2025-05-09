package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class db5 implements gub {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Boolean> f17703a = new LinkedHashMap();

    @Override // tb.gub
    public boolean isFeatureOpened(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d63361a", new Object[]{this, context, str})).booleanValue();
        }
        ckf.g(context, "context");
        ckf.g(str, ru1.FEATURE_NAME);
        Boolean bool = (Boolean) ((LinkedHashMap) this.f17703a).get(str);
        if (bool == null) {
            bool = Boolean.valueOf(ABGlobal.isFeatureOpened(context, str));
            this.f17703a.put(str, bool);
        }
        return bool.booleanValue();
    }
}
