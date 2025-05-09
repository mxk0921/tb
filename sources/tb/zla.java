package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.runtimepermission.MegaPermissionAbility;
import com.taobao.runtimepermission.group.GroupedPermissionManifest;
import com.taobao.runtimepermission.group.strategy.GroupedPermissionStrategyFactory;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class zla {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface a {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f32845a;
        public final String b;
        public final String c;
        public final String d;

        public b(boolean z, String str, String str2, String str3) {
            this.f32845a = z;
            this.b = str;
            this.c = str2;
            this.d = str3;
        }
    }

    public static yla a(Context context, String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yla) ipChange.ipc$dispatch("e19bf5b9", new Object[]{context, str, strArr});
        }
        if (context == null || TextUtils.isEmpty(str)) {
            return new yla(false, null, "UNKNOWN_BIZ_ERROR", "The context or bizName parameter is empty");
        }
        if (strArr == null || strArr.length == 0) {
            return new yla(false, null, "UNKNOWN_BIZ_ERROR", "The permissionKeys parameter is empty");
        }
        b c = c(strArr);
        if (!c.f32845a) {
            return new yla(false, null, c.c, c.d);
        }
        return GroupedPermissionStrategyFactory.a(c.b).a(context, str, strArr);
    }

    public static void b(xla xlaVar, a aVar) {
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4de6e0f8", new Object[]{xlaVar, aVar});
        } else if (xlaVar.f31453a == null || (strArr = xlaVar.b) == null || strArr.length == 0) {
            ((MegaPermissionAbility.a) aVar).a(new yla(false, null, "UNKNOWN_BIZ_ERROR", "The context or permissionKeys parameter is empty"));
        } else {
            b c = c(strArr);
            if (!c.f32845a) {
                ((MegaPermissionAbility.a) aVar).a(new yla(false, null, c.c, c.d));
            } else {
                GroupedPermissionStrategyFactory.a(c.b).c(xlaVar, aVar);
            }
        }
    }

    public static b c(String[] strArr) {
        String str;
        Set<String> set;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("c4dc9d25", new Object[]{strArr});
        }
        String str2 = strArr[0];
        Map<String, Set<String>> a2 = GroupedPermissionManifest.a();
        Iterator<String> it = a2.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                str = null;
                set = null;
                break;
            }
            str = it.next();
            set = a2.get(str);
            if (set != null && set.contains(str2)) {
                break;
            }
        }
        if (str == null) {
            return new b(false, null, "PERMISSIONS_INVALID", "The permission parameter is illegal");
        }
        for (int i = 1; i < strArr.length; i++) {
            if (!set.contains(strArr[i])) {
                return new b(false, null, "PERMISSIONS_GROUP_ERROR", "The permissions parameter is not in the same group of contents");
            }
        }
        return new b(true, str, null, null);
    }
}
