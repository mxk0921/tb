package com.taobao.activelocation.location.impl;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.os.Handler;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.location.aidl.ITBLocationCallback;
import com.taobao.location.common.LocationTypeEnum;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.location.common.TBLocationOption;
import com.taobao.passivelocation.business.TBServerGeocodeResponse;
import com.taobao.tao.Globals;
import com.taobao.tao.TaoApplication;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.HashMap;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.awv;
import tb.e20;
import tb.t2o;
import tb.usj;
import tb.zah;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class TBServerLocation extends e20 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String g = "lbs_TBServerLocation";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements LocationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f6104a;

        public a() {
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d13e08b", new Object[]{this, location});
            } else if (!this.f6104a) {
                this.f6104a = true;
                TBServerLocation.i(TBServerLocation.this, location);
            }
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("20eea11d", new Object[]{this, str});
            } else if (!this.f6104a) {
                this.f6104a = true;
                TBServerLocation.k(TBServerLocation.this);
            }
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("faf9c02", new Object[]{this, str});
            }
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("adf45405", new Object[]{this, str, new Integer(i), bundle});
            } else if ((i == 0 || i == 1) && !this.f6104a) {
                this.f6104a = true;
                TBServerLocation.j(TBServerLocation.this);
            }
        }
    }

    static {
        t2o.a(789577739);
    }

    public TBServerLocation(Handler handler, TBLocationOption tBLocationOption, ITBLocationCallback iTBLocationCallback, HashMap<String, String> hashMap) {
        super(handler, tBLocationOption, iTBLocationCallback, LocationTypeEnum.TBSEVERLOCATION, hashMap);
    }

    public static /* synthetic */ void i(TBServerLocation tBServerLocation, Location location) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("651c6d48", new Object[]{tBServerLocation, location});
        } else {
            tBServerLocation.s(location);
        }
    }

    public static /* synthetic */ Object ipc$super(TBServerLocation tBServerLocation, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/activelocation/location/impl/TBServerLocation");
    }

    public static /* synthetic */ void j(TBServerLocation tBServerLocation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a85bff4b", new Object[]{tBServerLocation});
        } else {
            tBServerLocation.f();
        }
    }

    public static /* synthetic */ void k(TBServerLocation tBServerLocation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f61b774c", new Object[]{tBServerLocation});
        } else {
            tBServerLocation.f();
        }
    }

    public static /* synthetic */ String l(TBServerLocation tBServerLocation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("469be8f3", new Object[]{tBServerLocation});
        }
        return tBServerLocation.g;
    }

    public static /* synthetic */ void m(TBServerLocation tBServerLocation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("919a674e", new Object[]{tBServerLocation});
        } else {
            tBServerLocation.f();
        }
    }

    public static /* synthetic */ TBLocationOption n(TBServerLocation tBServerLocation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLocationOption) ipChange.ipc$dispatch("cc47ba8b", new Object[]{tBServerLocation});
        }
        return tBServerLocation.f18219a;
    }

    public static /* synthetic */ TBLocationOption o(TBServerLocation tBServerLocation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLocationOption) ipChange.ipc$dispatch("ad53f50c", new Object[]{tBServerLocation});
        }
        return tBServerLocation.f18219a;
    }

    public static /* synthetic */ void p(TBServerLocation tBServerLocation, TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa367961", new Object[]{tBServerLocation, tBLocationDTO});
        } else {
            tBServerLocation.h(tBLocationDTO);
        }
    }

    public static /* synthetic */ void q(TBServerLocation tBServerLocation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8984752", new Object[]{tBServerLocation});
        } else {
            tBServerLocation.f();
        }
    }

    public static /* synthetic */ void r(TBServerLocation tBServerLocation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1657bf53", new Object[]{tBServerLocation});
        } else {
            tBServerLocation.f();
        }
    }

    @Override // tb.e20
    public LocationTypeEnum a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocationTypeEnum) ipChange.ipc$dispatch("4d2b50ed", new Object[]{this});
        }
        if (usj.c(Globals.getApplication())) {
            return LocationTypeEnum.GDLOCATION;
        }
        return null;
    }

    @Override // tb.e20
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abb229e7", new Object[]{this});
            return;
        }
        TLog.logd(this.g, "使用淘宝服务端定位");
        if (!awv.h(this.e, this.f18219a, new a())) {
            f();
        }
    }

    public final void s(Location location) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("739a2dae", new Object[]{this, location});
            return;
        }
        TBLocationDTO d = awv.d(location);
        if (d == null) {
            f();
        } else {
            t(d);
        }
    }

    public final void t(final TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42350009", new Object[]{this, tBLocationDTO});
            return;
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName("mtop.taobao.wireless.lbs.regeo.getAddress");
        mtopRequest.setVersion("1.0");
        mtopRequest.setNeedEcode(true);
        final String c = c();
        mtopRequest.setData("{\"latitude\":" + tBLocationDTO.latitude + ",\"longitude\":" + tBLocationDTO.longitude + ",\"options\":{\"regionType\":\"district\",\"bizCode\":\"" + c + "\"}}");
        StringBuilder sb = new StringBuilder("{\"regionType\":\"");
        sb.append(d());
        sb.append("\"}");
        final String sb2 = sb.toString();
        RemoteBusiness.build((Context) this.e, mtopRequest, TaoApplication.getTTID()).registeListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.activelocation.location.impl.TBServerLocation.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                String str;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                String l = TBServerLocation.l(TBServerLocation.this);
                if (("onError ：" + mtopResponse) != null) {
                    str = "";
                } else {
                    str = mtopResponse.getRetMsg();
                }
                TLog.loge(l, str);
                TBServerLocation.r(TBServerLocation.this);
                awv.b(zah.LOCATION_FROM_TB_SERVER, true, sb2, c);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                } else if (baseOutDo != null) {
                    Integer num = null;
                    TBServerGeocodeResponse.TBServerGeocodeResponseData tBServerGeocodeResponseData = baseOutDo.getData() instanceof TBServerGeocodeResponse.TBServerGeocodeResponseData ? (TBServerGeocodeResponse.TBServerGeocodeResponseData) baseOutDo.getData() : null;
                    if (tBServerGeocodeResponseData != null) {
                        TLog.logd(TBServerLocation.l(TBServerLocation.this), "使用淘宝服务端定位-获取数据成功");
                        tBLocationDTO.address = tBServerGeocodeResponseData.getDescription();
                        tBLocationDTO.cityName = tBServerGeocodeResponseData.getCity();
                        tBLocationDTO.cityCode = tBServerGeocodeResponseData.getCitycode();
                        tBLocationDTO.areaCode = tBServerGeocodeResponseData.getDistrictcode();
                        tBLocationDTO.areaName = tBServerGeocodeResponseData.getDistrict();
                        tBLocationDTO.countryName = tBServerGeocodeResponseData.getCountry();
                        tBLocationDTO.countryCode = tBServerGeocodeResponseData.getCountry();
                        tBLocationDTO.provinceName = tBServerGeocodeResponseData.getProvince();
                        tBLocationDTO.locationType = Integer.valueOf(LocationTypeEnum.TBSEVERLOCATION.getType());
                        try {
                            TBLocationDTO tBLocationDTO2 = tBLocationDTO;
                            if (TBServerLocation.n(TBServerLocation.this) != null) {
                                num = Integer.valueOf(TBServerLocation.o(TBServerLocation.this).getRegionType().getKey());
                            }
                            tBLocationDTO2.regionType = num;
                            int parseInt = Integer.parseInt(tBServerGeocodeResponseData.getDistrictcode());
                            tBLocationDTO.provinceCode = String.valueOf(parseInt - (parseInt % 10000));
                        } catch (Exception e) {
                            String l = TBServerLocation.l(TBServerLocation.this);
                            TLog.loge(l, "provinceCode 解析数据异常：" + e.getMessage());
                        }
                    }
                    TBServerLocation.p(TBServerLocation.this, tBLocationDTO);
                    awv.b(zah.LOCATION_FROM_TB_SERVER, true, sb2, c);
                } else {
                    TBServerLocation.q(TBServerLocation.this);
                    awv.b(zah.LOCATION_FROM_TB_SERVER, true, sb2, c);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                String str;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                String l = TBServerLocation.l(TBServerLocation.this);
                if (("onSystemError ：" + mtopResponse) != null) {
                    str = "";
                } else {
                    str = mtopResponse.getRetMsg();
                }
                TLog.loge(l, str);
                TBServerLocation.m(TBServerLocation.this);
                awv.b(zah.LOCATION_FROM_TB_SERVER, true, sb2, c);
            }
        }).showLoginUI(false).setBizId(75).startRequest(TBServerGeocodeResponse.class);
    }
}
