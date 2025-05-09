package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.runtimepermission.MegaPermissionAbility;
import java.util.HashMap;
import java.util.Map;
import tb.zla;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class n47 extends p10 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f24501a;
    public final Map<String, String> b;

    public n47(Map<String, String> map, boolean z) {
        this.f24501a = z;
        this.b = map;
    }

    public static Map<String, String> h(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("26fae95b", new Object[]{strArr});
        }
        HashMap hashMap = new HashMap(strArr.length);
        for (String str : strArr) {
            hashMap.put(str, "AUTHORIZED");
        }
        return hashMap;
    }

    public static /* synthetic */ Object ipc$super(n47 n47Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/runtimepermission/group/strategy/DefaultPermissionStrategy");
    }

    @Override // tb.p10
    public yla a(Context context, String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yla) ipChange.ipc$dispatch("e19bf5b9", new Object[]{this, context, str, strArr});
        }
        if (this.f24501a) {
            return new yla(true, h(strArr), null, null);
        }
        Map<String, String> map = this.b;
        if (map == null) {
            return new yla(false, null, "UNKNOWN_BIZ_ERROR", "stub");
        }
        return p10.b(context, str, strArr, map);
    }

    @Override // tb.p10
    public void c(xla xlaVar, zla.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4de6e0f8", new Object[]{this, xlaVar, aVar});
        } else if (this.f24501a) {
            ((MegaPermissionAbility.a) aVar).a(new yla(true, h(xlaVar.b), null, null));
        } else {
            Map<String, String> map = this.b;
            if (map == null) {
                ((MegaPermissionAbility.a) aVar).a(new yla(false, null, "UNKNOWN_BIZ_ERROR", "stub"));
            } else {
                p10.d(xlaVar, aVar, map);
            }
        }
    }
}
