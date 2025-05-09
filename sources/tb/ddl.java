package tb;

import com.alibaba.android.aura.dynamicFeature.model.AURADynamicFeatureBundleType;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.BundleInfoManager;
import java.util.HashMap;
import tb.ci;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class ddl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final ci f17743a = new ci.b().b(u58.DYNAMIC_NAME_TAOBAO_ANDROID_AMAP_DYNAMIC).d("com.taobao.android.order").c(AURADynamicFeatureBundleType.AAR).a();
    public static Boolean b = null;
    public static ebb c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements ebb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.ebb
        public void a(ci ciVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("146d4700", new Object[]{this, ciVar});
                return;
            }
            ddl.a(Boolean.TRUE);
            hav.d(ncl.b, "地图模块安装成功");
        }

        @Override // tb.ebb
        public void b(ci ciVar, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d95c3b86", new Object[]{this, ciVar, str, str2});
                return;
            }
            ddl.a(Boolean.FALSE);
            HashMap hashMap = new HashMap();
            hashMap.put("errorCode", str);
            hashMap.put("errorMsg", str2);
            hav.f(ncl.b, "地图模块安装失败", hashMap);
        }
    }

    public static /* synthetic */ Boolean a(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("f0a618b1", new Object[]{bool});
        }
        b = bool;
        return bool;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c18af31", new Object[0])).booleanValue();
        }
        if (BundleInfoManager.instance().getDynamicFeatureInfo(u58.DYNAMIC_NAME_TAOBAO_ANDROID_AMAP_DYNAMIC) == null) {
            return true;
        }
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("628d494e", new Object[0]);
            return;
        }
        gi d = gi.d();
        ci ciVar = f17743a;
        if (!d.e(ciVar)) {
            hav.d(ncl.b, "不是动态模块");
        }
        if (!d()) {
            e();
            c = new a();
            gi.d().h(ciVar, c);
            gi.d().i(ciVar);
        }
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd5152a1", new Object[0])).booleanValue();
        }
        if (b()) {
            return true;
        }
        if (4 == gi.d().g(f17743a)) {
            z = true;
        }
        b = Boolean.valueOf(z);
        return z;
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31b4f0d6", new Object[0]);
        } else if (c != null) {
            gi.d().j(f17743a, c);
            c = null;
        }
    }

    static {
        t2o.a(297795655);
    }
}
