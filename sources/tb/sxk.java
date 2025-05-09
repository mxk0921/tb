package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class sxk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final OpenAbilityCompontentTypeEnum f28340a;
    public final boolean b;
    public Object c;

    static {
        t2o.a(806355751);
    }

    public sxk(OpenAbilityCompontentTypeEnum openAbilityCompontentTypeEnum, boolean z, Object obj) {
        this.f28340a = openAbilityCompontentTypeEnum;
        this.b = z;
        this.c = obj;
    }

    public Map<OpenAbilityCompontentTypeEnum, sxk> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f1b74af7", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put(this.f28340a, this);
        return hashMap;
    }
}
