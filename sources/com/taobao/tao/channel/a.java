package com.taobao.tao.channel;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.core.share.mtop.TBShareActivityInfoService;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.tao.channel.ChannelProvider;
import com.ut.share.business.ShareBusiness;
import tb.fwr;
import tb.li3;
import tb.mip;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public c f11924a;
    public boolean b;
    public boolean c;
    public TBShareContent d;
    public li3 e;
    public ChannelProvider.c f;
    public boolean g;
    public boolean h;
    public String i;
    public final boolean j;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.tao.channel.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class C0673a implements TBShareActivityInfoService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f11925a;
        public final /* synthetic */ String b;
        public final /* synthetic */ ChannelProvider.c c;
        public final /* synthetic */ li3 d;
        public final /* synthetic */ boolean e;

        public C0673a(String str, String str2, ChannelProvider.c cVar, li3 li3Var, boolean z) {
            this.f11925a = str;
            this.b = str2;
            this.c = cVar;
            this.d = li3Var;
            this.e = z;
        }

        @Override // com.taobao.share.core.share.mtop.TBShareActivityInfoService.a
        public void a(TBShareContent tBShareContent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("249b36fa", new Object[]{this, tBShareContent});
            } else if (!TextUtils.equals(tBShareContent.businessId, this.f11925a) || !TextUtils.equals(tBShareContent.url, this.b)) {
                ChannelProvider.n().i(tBShareContent, this.d, this.c, this.e, true);
            } else {
                a.a(a.this, false);
                if (a.b(a.this)) {
                    a.c(a.this, this.c);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements TBShareActivityInfoService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ li3 f11926a;
        public final /* synthetic */ ChannelProvider.c b;
        public final /* synthetic */ boolean c;

        public b(a aVar, li3 li3Var, ChannelProvider.c cVar, boolean z) {
            this.f11926a = li3Var;
            this.b = cVar;
            this.c = z;
        }

        @Override // com.taobao.share.core.share.mtop.TBShareActivityInfoService.a
        public void a(TBShareContent tBShareContent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("249b36fa", new Object[]{this, tBShareContent});
            } else {
                ChannelProvider.n().i(tBShareContent, this.f11926a, this.b, this.c, false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface c {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final a f11927a = new a(null);

        static {
            t2o.a(666894379);
        }

        public static /* synthetic */ a a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c923aa54", new Object[0]);
            }
            return f11927a;
        }
    }

    static {
        t2o.a(666894375);
    }

    public /* synthetic */ a(C0673a aVar) {
        this();
    }

    public static /* synthetic */ boolean a(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d0b73087", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.c = z;
        return z;
    }

    public static /* synthetic */ boolean b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b337a34", new Object[]{aVar})).booleanValue();
        }
        return aVar.b;
    }

    public static /* synthetic */ void c(a aVar, ChannelProvider.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ee0aab4", new Object[]{aVar, cVar});
        } else {
            aVar.e(cVar);
        }
    }

    public static a d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("9aa2dfba", new Object[0]);
        }
        return d.a();
    }

    public final void e(ChannelProvider.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c837cb5", new Object[]{this, cVar});
            return;
        }
        if (!this.j) {
            cVar = this.f;
        }
        if (TextUtils.isEmpty(this.i)) {
            ((ChannelProvider) this.f11924a).l(this.d, this.e, cVar);
        } else {
            ((ChannelProvider) this.f11924a).m(this.d, this.e, cVar, this.g, this.h, this.i);
        }
    }

    public void f(TBShareContent tBShareContent, li3 li3Var, ChannelProvider.c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("658a806d", new Object[]{this, tBShareContent, li3Var, cVar, new Boolean(z)});
        } else if (tBShareContent != null) {
            if (!mip.n()) {
                fwr.a("GetChannelProcessor", "isGetBizConfigBeforeActivity: false");
                ShareBusiness.sShareUTArgs.put(ShareBusiness.IS_GET_BIZ_CONFIG_BEFORE_ACTIVITY, (Object) Boolean.FALSE);
                ChannelProvider.n().i(tBShareContent, li3Var, cVar, z, false);
            } else if (mip.k()) {
                fwr.a("GetChannelProcessor", "isGetBizConfigBeforeActivity: true");
                ShareBusiness.sShareUTArgs.put(ShareBusiness.IS_GET_BIZ_CONFIG_BEFORE_ACTIVITY, (Object) Boolean.TRUE);
                new TBShareActivityInfoService().a(new C0673a(tBShareContent.businessId, tBShareContent.url, cVar, li3Var, z), tBShareContent);
                ChannelProvider.n().i(tBShareContent, li3Var, cVar, z, false);
            } else {
                fwr.a("GetChannelProcessor", "isGetBizConfigBeforeActivity: false");
                ShareBusiness.sShareUTArgs.put(ShareBusiness.IS_GET_BIZ_CONFIG_BEFORE_ACTIVITY, (Object) Boolean.FALSE);
                new TBShareActivityInfoService().a(new b(this, li3Var, cVar, z), tBShareContent);
            }
        }
    }

    public void g(TBShareContent tBShareContent, li3 li3Var, ChannelProvider.c cVar, boolean z, boolean z2, boolean z3, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdd79b87", new Object[]{this, tBShareContent, li3Var, cVar, new Boolean(z), new Boolean(z2), new Boolean(z3), str});
        } else if (tBShareContent != null) {
            this.b = true;
            j(tBShareContent, li3Var, cVar, z, z3, str);
            if (!mip.n() || !mip.k()) {
                e(cVar);
            } else if (z2 || !this.c) {
                e(cVar);
            }
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.b = false;
        this.c = true;
    }

    public void i(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95719e1", new Object[]{this, cVar});
        } else if (this.f11924a == null) {
            this.f11924a = cVar;
        }
    }

    public final void j(TBShareContent tBShareContent, li3 li3Var, ChannelProvider.c cVar, boolean z, boolean z2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78f7d8b4", new Object[]{this, tBShareContent, li3Var, cVar, new Boolean(z), new Boolean(z2), str});
            return;
        }
        this.d = tBShareContent;
        this.e = li3Var;
        if (!this.j) {
            this.f = cVar;
        }
        this.g = z;
        this.h = z2;
        this.i = str;
    }

    public a() {
        this.j = mip.j();
    }
}
