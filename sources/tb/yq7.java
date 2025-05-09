package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class yq7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, zzb<?>> f32279a = new HashMap();

    public static void a(String str, zzb<?> zzbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("349bd8a9", new Object[]{str, zzbVar});
        } else {
            ((HashMap) f32279a).put(str, zzbVar);
        }
    }

    public static zzb<?> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zzb) ipChange.ipc$dispatch("877f9d60", new Object[]{str});
        }
        zzb<?> zzbVar = (zzb) ((HashMap) f32279a).get(str);
        if (zzbVar == null) {
            return jc8.b;
        }
        return zzbVar;
    }

    public static boolean c(zzb<?> zzbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d029717c", new Object[]{zzbVar})).booleanValue();
        }
        if (zzbVar == null || zzbVar == jc8.b) {
            return true;
        }
        return false;
    }
}
