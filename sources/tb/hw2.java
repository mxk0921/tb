package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSAppMonitor;
import java.net.URL;
import java.util.HashMap;
import tb.amo;
import tb.l0j;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class hw2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f20922a;
    public boolean b;
    public String c;
    public String d;
    public final String e;
    public final zu7 f;
    public final tu7 g;
    public final long h = System.currentTimeMillis();

    public hw2(String str, zu7 zu7Var, tu7 tu7Var) {
        this.e = str;
        this.f = zu7Var;
        this.g = tu7Var;
    }

    public final HashMap<String, String> a(zzp zzpVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("15b56246", new Object[]{this, zzpVar});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (zzpVar == null) {
            return hashMap;
        }
        int i = zzpVar.b;
        String str2 = zzpVar.c;
        boolean z = zzpVar.f33127a;
        hashMap.put("errorCode", String.valueOf(i));
        hashMap.put("errorMsg", str2);
        hashMap.put("success", String.valueOf(z));
        l0j.a aVar = zzpVar.k;
        if (aVar != null) {
            String str3 = aVar.s;
            String str4 = aVar.t;
            boolean z2 = aVar.d;
            long j = aVar.e;
            long j2 = aVar.f;
            long j3 = aVar.b;
            URL url = aVar.f23039a;
            String str5 = aVar.i;
            hashMap.put("error_code", str3);
            hashMap.put(MUSAppMonitor.ERROR_MSG, str4);
            hashMap.put(x96.REFRESH_TYPE_RANGE, String.valueOf(z2));
            hashMap.put("retry", String.valueOf(false));
            hashMap.put("connectTime", String.valueOf(j));
            hashMap.put(amo.c.POINT_NAME, String.valueOf(j2));
            hashMap.put("size", String.valueOf(j3));
            if (url == null) {
                str = "";
            } else {
                str = url.toString();
            }
            hashMap.put("url", str);
            hashMap.put("biz", str5);
            hashMap.put("prefetch", String.valueOf(false));
        }
        return hashMap;
    }

    public void b(zzp zzpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5575715", new Object[]{this, zzpVar});
        } else if (zzpVar != null) {
            try {
                if (zzpVar.f33127a) {
                    fs7.c("Callback", "onDownloadFinish", "task", zzpVar);
                    this.g.onDownloadFinish(zzpVar.e.f25507a, zzpVar.d);
                } else {
                    fs7.c("Callback", "onDownloadError", "task", zzpVar);
                    this.g.onDownloadError(zzpVar.e.f25507a, zzpVar.b, zzpVar.c);
                    this.b = true;
                    this.c = String.valueOf(zzpVar.b);
                    this.d = zzpVar.e.f25507a;
                }
                if (this.g instanceof ev7) {
                    HashMap<String, String> a2 = a(zzpVar);
                    ((ev7) this.g).a(zzpVar.e.f25507a, a2);
                    fs7.c("Callback", "onDownloadFinish", "task", a2.toString());
                }
                zzpVar.k.m = System.currentTimeMillis() - this.h;
                l0j.c(zzpVar.k, "download_task");
                int i = this.f20922a + 1;
                this.f20922a = i;
                if (i == this.f.f33016a.size()) {
                    fs7.c("onFinish", "task", zzpVar);
                    if (this.b) {
                        l0j.a(wyi.POINT_ALL_CALLBACK, zzpVar.f.l + this.e, this.c, this.d);
                    } else {
                        l0j.b(wyi.POINT_ALL_CALLBACK, zzpVar.f.l + this.e);
                    }
                    this.g.onFinish(!this.b);
                }
            } catch (Throwable th) {
                fs7.d("Callback", "on callback", th, new Object[0]);
            }
        }
    }
}
