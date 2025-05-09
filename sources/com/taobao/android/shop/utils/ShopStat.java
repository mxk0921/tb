package com.taobao.android.shop.utils;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValue;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.egh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public enum ShopStat {
    INSTANCE;
    
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DONE = "track_done_";
    private static final String MODULE_PAGE_SHOP = "Page_Shop";
    private static final String MONITOR_POINT_LOAD_PERFORMANCE = "LoadPerformance";
    public static final String SHOP_STAT_INIT = "init";
    public static final String SHOP_STAT_RENDER = "render";
    public static final String SHOP_STAT_REQUEST = "request";
    private static final String SHOP_STAT_TOTAL = "total";
    public static final String SHOP_STAT_INIT_INNER = "initInner";
    private static final String[] SHOP_STAT_TYPES = {"init", "request", SHOP_STAT_INIT_INNER, "render"};
    private final ConcurrentHashMap<String, Long> statMap = new ConcurrentHashMap<>();
    private boolean hasRegister = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public @interface ShopStatType {
    }

    ShopStat() {
    }

    private boolean checkAllTrackDone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25742e7f", new Object[]{this})).booleanValue();
        }
        for (String str : SHOP_STAT_TYPES) {
            if (!checkTrackDone(str)) {
                return false;
            }
        }
        return true;
    }

    private boolean checkTrackDone(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8aa8981a", new Object[]{this, str})).booleanValue();
        }
        return this.statMap.containsKey(typeDoneKey(str));
    }

    public static /* synthetic */ Object ipc$super(ShopStat shopStat, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/shop/utils/ShopStat");
    }

    private void markTrackDone(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f39af33", new Object[]{this, str, new Long(j)});
            return;
        }
        egh.a("type:" + typeDoneKey(str) + " duration: " + j);
        this.statMap.put(typeDoneKey(str), Long.valueOf(j));
    }

    private long pickDoneValue(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("450b07f3", new Object[]{this, str})).longValue();
        }
        Long l = this.statMap.get(typeDoneKey(str));
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    private String typeDoneKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("493655ec", new Object[]{this, str});
        }
        return DONE + str;
    }

    public static ShopStat valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopStat) ipChange.ipc$dispatch("a58492be", new Object[]{str});
        }
        return (ShopStat) Enum.valueOf(ShopStat.class, str);
    }

    public void end(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41f4dd2c", new Object[]{this, str});
        } else if (!checkTrackDone(str)) {
            Long l = this.statMap.get(str);
            if (l == null) {
                egh.b(" call end() while start() does not called on type :" + str + ", please check");
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            egh.a("type:" + str + "  end  @ " + currentTimeMillis);
            markTrackDone(str, currentTimeMillis - l.longValue());
        }
    }

    public void resetMission() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a921d344", new Object[]{this});
        } else {
            this.statMap.clear();
        }
    }

    public void start(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a37a973", new Object[]{this, str});
        } else if (!checkTrackDone(str)) {
            long currentTimeMillis = System.currentTimeMillis();
            egh.a("type:" + str + "  start -- @ " + currentTimeMillis);
            this.statMap.put(str, Long.valueOf(currentTimeMillis));
        }
    }

    public void finishMission() {
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e392f180", new Object[]{this});
        } else if (checkAllTrackDone()) {
            MeasureValueSet create = MeasureValueSet.create();
            long j = 0;
            for (String str : SHOP_STAT_TYPES) {
                long pickDoneValue = pickDoneValue(str);
                create.setValue(str, pickDoneValue);
                j += pickDoneValue;
            }
            create.setValue("total", j);
            AppMonitor.Stat.commit("Page_Shop", MONITOR_POINT_LOAD_PERFORMANCE, (DimensionValueSet) null, create);
            for (Map.Entry<String, MeasureValue> entry : create.getMap().entrySet()) {
                egh.a(entry.getKey() + "   " + entry.getValue().getValue());
            }
            this.statMap.clear();
        }
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else if (!this.hasRegister) {
            this.hasRegister = true;
            MeasureSet create = MeasureSet.create();
            for (String str : SHOP_STAT_TYPES) {
                create.addMeasure(str);
            }
            create.addMeasure("total");
            AppMonitor.register("Page_Shop", MONITOR_POINT_LOAD_PERFORMANCE, create, (DimensionSet) null);
        }
    }
}
