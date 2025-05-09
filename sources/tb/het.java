package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.preload.core.task.PreloadTaskEntity;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class het {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NEW_DETAIL_RANDOM = "new_detail_random";
    public static final String[] b = {PreloadTaskEntity.PAGE_DETAIL, "new_detail", yq0.PRELOAD_REQUESTER_BIZ_NAME_LITE, "new_detail_random"};

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, kzd> f20588a = new HashMap<>();

    public kzd a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kzd) ipChange.ipc$dispatch("ac75c06f", new Object[]{this, str});
        }
        if (!Arrays.asList(b).contains(str)) {
            return null;
        }
        if (this.f20588a.containsKey(str)) {
            return this.f20588a.get(str);
        }
        det detVar = new det();
        this.f20588a.put(str, detVar);
        return detVar;
    }

    public kzd b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kzd) ipChange.ipc$dispatch("5f25ed5f", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        kzd kzdVar = this.f20588a.get(str);
        if (kzdVar != null) {
            return kzdVar;
        }
        return a(str);
    }
}
