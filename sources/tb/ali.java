package tb;

import android.os.Handler;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.location.aidl.ITBLocationCallback;
import com.taobao.location.common.LocationTypeEnum;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.location.common.TBLocationOption;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ali extends e20 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final anc g;
    public final TBLocationOption h;

    static {
        t2o.a(789577736);
    }

    public ali(Handler handler, TBLocationOption tBLocationOption, ITBLocationCallback iTBLocationCallback, anc ancVar, HashMap<String, String> hashMap) {
        super(handler, tBLocationOption, iTBLocationCallback, LocationTypeEnum.MEMORYLOCATION, hashMap);
        this.h = tBLocationOption;
        this.g = ancVar;
    }

    public static /* synthetic */ Object ipc$super(ali aliVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/activelocation/location/impl/MemoryLocation");
    }

    @Override // tb.e20
    public LocationTypeEnum a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocationTypeEnum) ipChange.ipc$dispatch("4d2b50ed", new Object[]{this});
        }
        if (this.h.getRegionType() != TBLocationOption.RegionType.DISTRICT || !"on".equals(OrangeConfig.getInstance().getConfig("passivelocation", "tbserverLocation", "on"))) {
            if (usj.c(Globals.getApplication())) {
                return LocationTypeEnum.GDLOCATION;
            }
            return null;
        } else if (usj.c(Globals.getApplication())) {
            return LocationTypeEnum.TBSEVERLOCATION;
        } else {
            return null;
        }
    }

    @Override // tb.e20
    public void b() {
        TBLocationOption tBLocationOption;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abb229e7", new Object[]{this});
            return;
        }
        TBLocationDTO q = ((gbh) this.g).q();
        if (q == null || (tBLocationOption = this.h) == null || !tBLocationOption.getTimeLimit().matchTimeLimit(q.getTimeStamp().longValue(), System.currentTimeMillis()) || !this.h.getAccuracy().matchAccuray(q.getAccuracy().intValue()) || !this.h.getDataModel().matchAddressModel(q) || !this.h.getRegionType().matchRegionType(q) || !this.h.getDataModel().matchPoiModel(q)) {
            f();
            return;
        }
        h(q);
        TLog.logd("lbs_MemoryLocation", "缓存数据匹配成功");
        awv.b(zah.MEMORY_LOCATION, true, "{\"regionType\":\"" + c() + "\"}", c());
    }
}
