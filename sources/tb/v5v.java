package tb;

import android.os.SystemClock;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.external.UCPManager;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class v5v implements fjb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f29799a;
    public boolean b;
    public int c = 1024;
    public int d = 10;

    static {
        t2o.a(729808987);
        t2o.a(729808960);
    }

    public v5v(String str) {
        this.f29799a = str;
    }

    @Override // tb.fjb
    public String build() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5d594b", new Object[]{this});
        }
        uqa.b("CreateCommonParams", "UcpParamsBuilder", "requestType : " + this.f29799a);
        e();
        if (!d()) {
            return null;
        }
        String c = c();
        if (a(c, this.c)) {
            return c;
        }
        uqa.b("CreateCommonParams", "UcpParamsBuilder", "checkDataLengthValid is false");
        return null;
    }

    public final String c() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("88d1058b", new Object[]{this});
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            str = UCPManager.h("Page_Home");
        } catch (Throwable th) {
            uqa.b("CreateCommonParams", "UcpParamsBuilder", "UCPManager.fetchFatigueWithBizName error : " + th.getMessage());
            str = null;
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        uqa.b("CreateCommonParams", "UcpParamsBuilder", this.f29799a + " UCPManager.fetchFatigueWithBizName 耗时 : " + elapsedRealtime2);
        b(elapsedRealtime2, this.d);
        return str;
    }

    @Override // tb.fjb
    public String getKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16c52370", new Object[]{this});
        }
        return "ucpFatigueData";
    }

    public final void b(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21097689", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j > i) {
            HashMap hashMap = new HashMap(2);
            hashMap.put("sMaxTime", i + "");
            hashMap.put(iiz.PERF_STAG_TOTAL, j + "");
            hashMap.put("requestType", this.f29799a);
            hrg.a("UcpParamsBuilder", "UcpParamsBuilder", "1.0", "Page_Home", "UcpParamsBuilder", hashMap, "UcpParamsBuildUcpDataMaxTime", "接口调用超时");
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4fa0472", new Object[]{this});
            return;
        }
        this.b = f4b.b("ucpDataEnable", true);
        this.c = f4b.i("ucpDataLimitedSize", 1024);
        this.d = f4b.i("ucpDataMaxTime", 10);
    }

    public final boolean a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad1fa592", new Object[]{this, str, new Integer(i)})).booleanValue();
        }
        if (str == null || TextUtils.isEmpty(str)) {
            return false;
        }
        int length = str.toCharArray().length;
        if (length <= i) {
            return true;
        }
        hrg.e("UcpParamsBuilder", "UcpParamsBuilder", "数据长度超过最大长度, 数据长度为 : " + length);
        return false;
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b190a7a", new Object[]{this})).booleanValue();
        }
        if (vxl.i()) {
            uqa.b("CreateCommonParams", "UcpParamsBuilder", "isLowDevice");
            return false;
        } else if (this.b) {
            return true;
        } else {
            uqa.b("CreateCommonParams", "UcpParamsBuilder", "ucpDataEnable : false");
            return false;
        }
    }
}
