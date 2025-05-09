package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.shop.fetcher.TBSRCacheData;
import com.taobao.tao.shop.rule.mtop.MtopTaobaoWirelessShopRouteProcessResponseData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ivr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f21603a;

    static {
        t2o.a(668991537);
    }

    public ivr(Context context) {
        this.f21603a = context;
    }

    public MtopTaobaoWirelessShopRouteProcessResponseData a(String str, String str2, boolean z, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopTaobaoWirelessShopRouteProcessResponseData) ipChange.ipc$dispatch("a638901b", new Object[]{this, str, str2, new Boolean(z), new Long(j)});
        }
        mvr.c("try to read cache, useRemoteCache: " + z + " local cache valid time is " + String.valueOf(j));
        return cop.Z(this.f21603a).i0(str, str2, z, j);
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8cec3207", new Object[]{this});
        }
        SharedPreferences sharedPreferences = this.f21603a.getSharedPreferences("MODULE_TBSR", 0);
        if (sharedPreferences == null) {
            return null;
        }
        String string = sharedPreferences.getString("TBSRCacheAdapter.K_CACHE_MD5", null);
        mvr.c("[TBSRCacheAdapter] : getCacheMD5=" + string);
        return string;
    }

    public MtopTaobaoWirelessShopRouteProcessResponseData c(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopTaobaoWirelessShopRouteProcessResponseData) ipChange.ipc$dispatch("d693b78d", new Object[]{this, str, new Long(j)});
        }
        return cop.Z(this.f21603a).c0(str, j);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e4b7a8c", new Object[]{this});
        } else {
            cop.Z(this.f21603a).u0();
        }
    }

    public final void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a75e292", new Object[]{this, str});
            return;
        }
        SharedPreferences sharedPreferences = this.f21603a.getSharedPreferences("MODULE_TBSR", 0);
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString("TBSRCacheAdapter.K_CACHE_MD5", str);
            edit.apply();
        }
    }

    public boolean f(TBSRCacheData tBSRCacheData, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("87e49cbf", new Object[]{this, tBSRCacheData, str})).booleanValue();
        }
        boolean E0 = cop.Z(this.f21603a).E0(tBSRCacheData);
        mvr.c("[TBSRCacheAdapter] : setCacheDO, DO=" + Boolean.toString(E0));
        if (E0) {
            e(str);
            mvr.c("[TBSRCacheAdapter] : setCacheDO,  md5=" + str);
        }
        return E0;
    }
}
