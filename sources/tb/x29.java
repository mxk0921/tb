package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class x29 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final f29 f31097a = new f29();

    static {
        t2o.a(1007681537);
        t2o.a(1007681567);
    }

    public String c(xoh xohVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dc4206f0", new Object[]{this, xohVar});
        }
        ckf.g(xohVar, "requestParams");
        String c = xohVar.c();
        g29 a2 = this.f31097a.a(c);
        String a3 = a2 != null ? a2.a() : null;
        if (a3 != null) {
            l4s l4sVar = l4s.INSTANCE;
            l4sVar.e("查询收藏数量 biz=" + xohVar.a() + " id=" + c + "  返回opt缓存=" + a3);
            return a3;
        }
        String b = this.f31097a.b(c);
        if (b != null) {
            l4s l4sVar2 = l4s.INSTANCE;
            l4sVar2.e("查询收藏数量 biz=" + xohVar.a() + " id=" + c + "  返回tmp缓存=" + b);
            return b;
        }
        l4s l4sVar3 = l4s.INSTANCE;
        l4sVar3.e("查询收藏数量 biz=" + xohVar.a() + " id=" + c + "  返回空");
        return "";
    }

    public String d(voh vohVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2f625e67", new Object[]{this, vohVar});
        }
        ckf.g(vohVar, "requestParams");
        String c = vohVar.c();
        String b = vohVar.b();
        g29 a2 = this.f31097a.a(c);
        if (a2 == null || h29.a(a2)) {
            this.f31097a.c(c);
            this.f31097a.e(c, b);
            l4s l4sVar = l4s.INSTANCE;
            l4sVar.e("查询收藏数量带数字 biz=" + vohVar.a() + " id=" + c + " 数量=" + b + " 返回默认值=" + b);
            return b;
        }
        l4s l4sVar2 = l4s.INSTANCE;
        l4sVar2.e("查询收藏数量带数字 biz=" + vohVar.a() + " id=" + c + " 数量=" + b + " 返回缓存值=" + a2.a());
        return a2.a();
    }

    public final void a(String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25b3a966", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str2, "id");
        g29 a2 = this.f31097a.a(str2);
        if ((a2 != null && (str3 = a2.a()) != null) || (str3 = this.f31097a.b(str2)) != null) {
            Integer m = ssq.m(str3);
            if (m != null && m.intValue() > 0) {
                str3 = String.valueOf(m.intValue() - 1);
            }
            this.f31097a.d(str2, str3);
            l4s l4sVar = l4s.INSTANCE;
            l4sVar.e("假减一成功 biz=" + str + " id=" + str2 + " newCount=" + str3);
        }
    }

    public final void b(String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ed93072", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str2, "id");
        g29 a2 = this.f31097a.a(str2);
        if ((a2 != null && (str3 = a2.a()) != null) || (str3 = this.f31097a.b(str2)) != null) {
            Integer m = ssq.m(str3);
            if (m != null) {
                str3 = String.valueOf(m.intValue() + 1);
            }
            this.f31097a.d(str2, str3);
            l4s l4sVar = l4s.INSTANCE;
            l4sVar.e("假加一成功 biz=" + str + " id=" + str2 + " newCount=" + str3);
        }
    }
}
