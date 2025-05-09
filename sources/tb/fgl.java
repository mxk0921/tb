package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicLong;
import tb.l0j;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class fgl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final qkc b;

    /* renamed from: a  reason: collision with root package name */
    public int f19278a = 10;
    public final AtomicLong c = new AtomicLong(0);
    public final a d = new a();
    public final l0j.a e = new l0j.a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f19279a = true;
        public boolean b;
        public int c;
        public int d;
        public String e;

        public a a(int i, int i2, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("718727dc", new Object[]{this, new Integer(i), new Integer(i2), str});
            }
            this.f19279a = false;
            this.c = i;
            this.d = i2;
            this.e = str;
            return this;
        }
    }

    public fgl(qkc qkcVar) {
        this.b = qkcVar;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14086c27", new Object[]{this, str});
            return;
        }
        qkc qkcVar = this.b;
        if (qkcVar != null) {
            qkcVar.b(this.c.get(), str);
        }
    }

    public void a(v9f v9fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0e0d1f3", new Object[]{this, v9fVar});
        } else if (this.b != null) {
            zzp zzpVar = v9fVar.b;
            a aVar = this.d;
            if (aVar.f19279a) {
                zzpVar.f33127a = true;
                zzpVar.d = v9fVar.e.getAbsolutePath();
                zzpVar.b = this.f19278a;
                zzpVar.c = "下载成功";
            } else {
                zzpVar.f33127a = false;
                zzpVar.b = aVar.c;
                zzpVar.j.b(aVar.b);
                int i = zzpVar.b;
                if (i != -21) {
                    if (i != -18 && i != -15) {
                        switch (i) {
                            case -12:
                                zzpVar.c = "网络错误";
                                break;
                            case -11:
                                zzpVar.c = "文件读写错误";
                                break;
                            case -10:
                                zzpVar.c = "url错误";
                                break;
                            default:
                                zzpVar.c = "下载失败";
                                break;
                        }
                    } else {
                        zzpVar.c = "文件校验失败";
                    }
                } else {
                    zzpVar.c = "手机剩余空间不足";
                }
            }
            l0j.a aVar2 = this.e;
            aVar2.f23039a = v9fVar.c;
            aVar2.b = zzpVar.e.b;
            long j = aVar2.f;
            if (0 != j) {
                aVar2.h = (aVar2.r / 1024.0d) / (j / 1000.0d);
            }
            boolean z = zzpVar.f33127a;
            aVar2.c = z;
            if (z) {
                aVar2.s = String.valueOf(this.f19278a);
            } else {
                a aVar3 = this.d;
                aVar2.s = String.valueOf((aVar3.c * 1000) - aVar3.d);
            }
            l0j.a aVar4 = this.e;
            aVar4.t = this.d.e;
            aVar4.i = zzpVar.f.f29547a;
            zzpVar.k = aVar4;
            this.b.a(zzpVar);
        }
    }
}
