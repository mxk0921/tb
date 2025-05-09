package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.location.client.TBLocationClient;
import com.taobao.location.common.TBLocationDTO;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class wah implements zmc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements bnc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final TBLocationDTO f30560a;

        static {
            t2o.a(487588003);
            t2o.a(487588007);
        }

        @Override // tb.bnc
        public long a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("aeaa0ebb", new Object[]{this})).longValue();
            }
            return this.f30560a.timeStamp.longValue();
        }

        @Override // tb.bnc
        public String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("88ab898b", new Object[]{this});
            }
            return this.f30560a.areaName;
        }

        @Override // tb.bnc
        public String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("6efa769", new Object[]{this});
            }
            return this.f30560a.areaCode;
        }

        @Override // tb.bnc
        public String d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("6a55f44b", new Object[]{this});
            }
            return this.f30560a.cityCode;
        }

        @Override // tb.bnc
        public String e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("58314526", new Object[]{this});
            }
            return this.f30560a.provinceCode;
        }

        @Override // tb.bnc
        public String f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d9ed2748", new Object[]{this});
            }
            return this.f30560a.provinceName;
        }

        @Override // tb.bnc
        public String g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ec11d66d", new Object[]{this});
            }
            return this.f30560a.cityName;
        }

        @Override // tb.bnc
        public String getLatitude() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("6f4fa657", new Object[]{this});
            }
            return this.f30560a.latitude;
        }

        @Override // tb.bnc
        public String getLongitude() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("16d079a0", new Object[]{this});
            }
            return this.f30560a.longitude;
        }

        @Override // tb.bnc
        public String h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f250a1ce", new Object[]{this});
            }
            return this.f30560a.countryName;
        }

        @Override // tb.bnc
        public String i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("6b6339fb", new Object[]{this});
            }
            return this.f30560a.address;
        }

        public b(wah wahVar, TBLocationDTO tBLocationDTO) {
            this.f30560a = tBLocationDTO;
        }
    }

    static {
        t2o.a(487588001);
        t2o.a(487587957);
    }

    @Override // tb.zmc
    public bnc a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bnc) ipChange.ipc$dispatch("6f1d8af9", new Object[]{this});
        }
        TBLocationDTO d = TBLocationClient.d();
        if (d == null) {
            return null;
        }
        return new b(d);
    }
}
