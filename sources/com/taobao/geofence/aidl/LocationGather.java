package com.taobao.geofence.aidl;

import android.os.Looper;
import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.fence.client.TBFenceClient;
import com.taobao.fence.common.ResultEnums;
import com.taobao.location.client.TBLocationClient;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.location.common.TBLocationOption;
import tb.bda;
import tb.mdh;
import tb.t2o;
import tb.unr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class LocationGather {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String LOG = "lbs_sdk.fence_LocationGather";
    public unr callback = new unr() { // from class: com.taobao.geofence.aidl.LocationGather.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Finally extract failed */
        @Override // tb.unr
        public void onLocationChanged(TBLocationDTO tBLocationDTO) {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("240b6877", new Object[]{this, tBLocationDTO});
                return;
            }
            try {
                if (tBLocationDTO == null) {
                    mdh.a(LocationGather.LOG, "[onLocationChanged] data=null");
                    LocationGather.access$200(LocationGather.this).setGatherData(TBFenceClient.TypeEnum.GEOMETRY, null);
                    if (LocationGather.access$000(LocationGather.this) != null) {
                        LocationGather.access$000(LocationGather.this).quit();
                        return;
                    }
                    return;
                }
                if (tBLocationDTO.isNavSuccess) {
                    String str = tBLocationDTO.latitude;
                    String str2 = tBLocationDTO.longitude;
                    Integer num = tBLocationDTO.accuracy;
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(";");
                    sb.append(str2);
                    sb.append(";");
                    if (num != null) {
                        i = num.intValue();
                    }
                    sb.append(i);
                    String sb2 = sb.toString();
                    mdh.a(LocationGather.LOG, "[onLocationChanged] data=" + sb2 + "; locationType=" + tBLocationDTO.locationType);
                    if (num != null) {
                        LocationGather.access$200(LocationGather.this).setGatherData(TBFenceClient.TypeEnum.GEOMETRY, JSON.toJSONString(new Loction(Double.parseDouble(str), Double.parseDouble(str2), num.intValue())));
                    } else {
                        LocationGather.access$200(LocationGather.this).setGatherData(TBFenceClient.TypeEnum.GEOMETRY, JSON.toJSONString(new Loction(Double.parseDouble(str), Double.parseDouble(str2), 0)));
                    }
                } else {
                    mdh.b(LocationGather.LOG, "[onLocationChanged] error,errorCode=" + tBLocationDTO.getErrorCode());
                    LocationGather.access$200(LocationGather.this).setGatherData(TBFenceClient.TypeEnum.GEOMETRY, null);
                }
                if (LocationGather.access$000(LocationGather.this) != null) {
                    LocationGather.access$000(LocationGather.this).quit();
                }
            } catch (Throwable th) {
                if (LocationGather.access$000(LocationGather.this) != null) {
                    LocationGather.access$000(LocationGather.this).quit();
                }
                throw th;
            }
        }
    };
    private GatherManager gatherManager;
    private Looper looper;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class Loction {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final int accuracy;
        public final double latitude;
        public final double longitude;

        static {
            t2o.a(789577816);
        }

        public Loction(double d, double d2, int i) {
            this.latitude = d;
            this.longitude = d2;
            this.accuracy = i;
        }

        public int getAccuracy() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1891ab69", new Object[]{this})).intValue();
            }
            return this.accuracy;
        }

        public double getLatitude() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7b6fad57", new Object[]{this})).doubleValue();
            }
            return this.latitude;
        }

        public double getLongitude() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b61adaee", new Object[]{this})).doubleValue();
            }
            return this.longitude;
        }
    }

    static {
        t2o.a(789577813);
    }

    public LocationGather(GatherManager gatherManager) {
        this.gatherManager = gatherManager;
        AppMonitor.Counter.commit("passivelocation", "LocationGather", 1.0d);
    }

    public static /* synthetic */ Looper access$000(LocationGather locationGather) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Looper) ipChange.ipc$dispatch("ee7ef34c", new Object[]{locationGather});
        }
        return locationGather.looper;
    }

    public static /* synthetic */ Looper access$002(LocationGather locationGather, Looper looper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Looper) ipChange.ipc$dispatch("238c15e5", new Object[]{locationGather, looper});
        }
        locationGather.looper = looper;
        return looper;
    }

    public static /* synthetic */ TBLocationOption access$100(LocationGather locationGather) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLocationOption) ipChange.ipc$dispatch("aa6e14d2", new Object[]{locationGather});
        }
        return locationGather.createOption();
    }

    public static /* synthetic */ GatherManager access$200(LocationGather locationGather) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GatherManager) ipChange.ipc$dispatch("9f7d7901", new Object[]{locationGather});
        }
        return locationGather.gatherManager;
    }

    private TBLocationOption createOption() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLocationOption) ipChange.ipc$dispatch("cf0a0e54", new Object[]{this});
        }
        TBLocationOption tBLocationOption = new TBLocationOption();
        tBLocationOption.setDataModel(TBLocationOption.DataModel.DEFAULT);
        tBLocationOption.setAccuracy(TBLocationOption.Accuracy.DEFAULT);
        tBLocationOption.setTimeLimit(TBLocationOption.TimeLimit.NO_CACHE);
        return tBLocationOption;
    }

    public ResultEnums check() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResultEnums) ipChange.ipc$dispatch("d8c6307e", new Object[]{this});
        }
        return null;
    }

    public void startGather() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b047b04", new Object[]{this});
        } else {
            new Thread(new Runnable() { // from class: com.taobao.geofence.aidl.LocationGather.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    TBLocationClient g = TBLocationClient.g(bda.a());
                    LocationGather.access$002(LocationGather.this, Looper.myLooper());
                    if (LocationGather.access$000(LocationGather.this) == null) {
                        Looper.prepare();
                    }
                    LocationGather.access$002(LocationGather.this, Looper.myLooper());
                    mdh.a(LocationGather.LOG, "[startGather] start");
                    g.h(LocationGather.access$100(LocationGather.this), LocationGather.this.callback, Looper.getMainLooper());
                    Looper.loop();
                }
            }, "locaton_gather_thread").start();
        }
    }
}
