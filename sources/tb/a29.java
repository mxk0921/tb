package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.arch.flow.fatigue.LocalRecordModel;
import com.taobao.bootimage.arch.flow.fatigue.RemoteFatigueDataModel;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a29 implements vxb, m7c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public RemoteFatigueDataModel f15502a;
    public LocalRecordModel b;
    public JSONObject d;
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final AtomicInteger e = new AtomicInteger(0);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements kmc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.kmc
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7839eaea", new Object[]{this, str});
                return;
            }
            try {
                if (!TextUtils.isEmpty(str)) {
                    try {
                        a29.g(a29.this, (RemoteFatigueDataModel) JSON.parseObject(str, RemoteFatigueDataModel.class));
                        tm1.a("FatigueWorkFlow", "loadFinish: " + a29.f(a29.this).toString());
                    } catch (Exception e) {
                        tm1.b("FatigueWorkFlow", "loadDataFromCache error ", e);
                    }
                }
            } finally {
                a29.e(a29.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements kmc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.kmc
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7839eaea", new Object[]{this, str});
                return;
            }
            try {
                if (!TextUtils.isEmpty(str)) {
                    try {
                        a29.i(a29.this, (LocalRecordModel) JSON.parseObject(str, LocalRecordModel.class));
                        tm1.a("FatigueWorkFlow", "loadFinish: " + a29.h(a29.this).toString());
                    } catch (Exception e) {
                        tm1.b("FatigueWorkFlow", "loadDataFromCache error ", e);
                    }
                }
            } finally {
                a29.e(a29.this);
            }
        }
    }

    static {
        t2o.a(736100394);
        t2o.a(736100376);
        t2o.a(736100366);
    }

    public static /* synthetic */ void e(a29 a29Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45c58069", new Object[]{a29Var});
        } else {
            a29Var.j();
        }
    }

    public static /* synthetic */ RemoteFatigueDataModel f(a29 a29Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RemoteFatigueDataModel) ipChange.ipc$dispatch("86429174", new Object[]{a29Var});
        }
        return a29Var.f15502a;
    }

    public static /* synthetic */ RemoteFatigueDataModel g(a29 a29Var, RemoteFatigueDataModel remoteFatigueDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RemoteFatigueDataModel) ipChange.ipc$dispatch("e47592f8", new Object[]{a29Var, remoteFatigueDataModel});
        }
        a29Var.f15502a = remoteFatigueDataModel;
        return remoteFatigueDataModel;
    }

    public static /* synthetic */ LocalRecordModel h(a29 a29Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocalRecordModel) ipChange.ipc$dispatch("2b2443e6", new Object[]{a29Var});
        }
        return a29Var.b;
    }

    public static /* synthetic */ LocalRecordModel i(a29 a29Var, LocalRecordModel localRecordModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocalRecordModel) ipChange.ipc$dispatch("c07f88b9", new Object[]{a29Var, localRecordModel});
        }
        a29Var.b = localRecordModel;
        return localRecordModel;
    }

    @Override // tb.vxb
    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f55dc7a5", new Object[]{this, jSONObject});
        } else if (!this.c.get()) {
            this.d = jSONObject;
            tm1.a("FatigueWorkFlow", "updateAwesomeData wait load ");
        } else {
            JSONObject jSONObject2 = jSONObject.getJSONObject("ext");
            if (jSONObject2 == null) {
                tm1.a("FatigueWorkFlow", "upDateGlobalFrequency ext null");
                return;
            }
            try {
                this.f15502a = (RemoteFatigueDataModel) JSON.parseObject(jSONObject2.toJSONString(), RemoteFatigueDataModel.class);
                tm1.a("FatigueWorkFlow", "updateAwesomeData: " + this.f15502a);
                kt2.c().e("remoteGlobalFrequency", jSONObject2.toJSONString());
            } catch (Exception e) {
                tm1.b("FatigueWorkFlow", "updateAwesomeData error ", e);
            }
        }
    }

    @Override // tb.vxb
    public void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e90d432f", new Object[]{this, jSONObject});
        }
    }

    public final String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6378940", new Object[]{this});
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date());
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea470ec9", new Object[]{this});
            return;
        }
        tm1.a("FatigueWorkFlow", "onTerminate:enableUpdateData reUpdateAwesomeData");
        q();
    }

    public final void q() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcf12438", new Object[]{this});
            return;
        }
        this.c.set(true);
        StringBuilder sb = new StringBuilder("FatigueWorkFlow:reUpdateAwesomeData data is null:");
        if (this.d == null) {
            z = true;
        }
        sb.append(z);
        tm1.a("FatigueWorkFlow", sb.toString());
        JSONObject jSONObject = this.d;
        if (jSONObject != null) {
            b(jSONObject);
            this.d = null;
        }
    }

    @Override // tb.m7c
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c579d4a", new Object[]{this})).booleanValue();
        }
        boolean l = l();
        if (l) {
            usg.d().e().c(wzi.LAUNCHER, "InGlobalFatigue", "", "", "", "");
        }
        return true ^ l;
    }

    @Override // tb.vxb
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35d752af", new Object[]{this});
            return;
        }
        this.c.set(false);
        kt2.c().d("remoteGlobalFrequency", new a());
        kt2.c().d("localGlobalFrequency", new b());
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7d2cf9", new Object[]{this});
            return;
        }
        tm1.a("FatigueWorkFlow", "loadCacheFinish: count" + this.e.get());
        if (this.e.incrementAndGet() == 2) {
            q();
            this.e.set(0);
        }
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        tm1.a("FatigueWorkFlow", "onStart:enableUpdateData wait");
        this.c.set(false);
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5764be4c", new Object[]{this});
            return;
        }
        if (this.b == null) {
            this.b = new LocalRecordModel();
        }
        this.b.localLastShowDay = k();
        this.b.localLastShowTime = String.valueOf(System.currentTimeMillis());
        this.b.localLastShowDayCount++;
        tm1.a("FatigueWorkFlow", "updateLocalFatigue: " + JSON.toJSONString(this.b));
        kt2.c().e("localGlobalFrequency", JSON.toJSONString(this.b));
    }

    public final boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa4c400", new Object[]{this})).booleanValue();
        }
        if (this.f15502a != null && this.b != null) {
            return n() || m();
        }
        tm1.a("FatigueWorkFlow", "isInGlobalFatigue: mFatigueDataModel null");
        return false;
    }

    public final boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3683dd93", new Object[]{this})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (TextUtils.isEmpty(this.b.localLastShowTime) || TextUtils.isEmpty(this.f15502a.globalLimitSeconds)) {
            return false;
        }
        long parseLong = (currentTimeMillis - Long.parseLong(this.b.localLastShowTime)) / 1000;
        tm1.a("FatigueWorkFlow", "isInHourLimit: diffTime = " + parseLong + ",limitSecondsValue:" + this.b.localLastShowTime);
        return parseLong <= Long.parseLong(this.f15502a.globalLimitSeconds);
    }

    public final boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42bfecee", new Object[]{this})).booleanValue();
        }
        String k = k();
        tm1.a("FatigueWorkFlow", "isInLimitInSingleDay currentDay: " + k);
        if (!TextUtils.equals(k, this.b.localLastShowDay)) {
            tm1.a("FatigueWorkFlow", "isInLimitInSingleDay diff lastShowDayValue : " + this.b.localLastShowDay);
            return false;
        }
        tm1.a("FatigueWorkFlow", "isInLimitInSingleDay lastShowDayCountValue : " + this.b.localLastShowDayCount + ",limitInSingleDayValue: " + this.f15502a.globalLimitInSingleDay);
        return ((long) this.b.localLastShowDayCount) > Long.parseLong(this.f15502a.globalLimitInSingleDay);
    }
}
