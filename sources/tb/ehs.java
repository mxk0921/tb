package tb;

import android.content.Context;
import android.text.TextUtils;
import android.util.Patterns;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.taopassword.busniess.model.TemplateId;
import com.taobao.share.taopassword.constants.TPAction;
import com.taobao.share.taopassword.genpassword.mtop.ITaoPasswordGenerateRequest;
import java.util.HashMap;
import java.util.regex.Matcher;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ehs {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String c = "TPGenerateManager";

    /* renamed from: a  reason: collision with root package name */
    public ryd f18581a;
    public b b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements r4o {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f18582a;
        public final /* synthetic */ gis b;

        public a(Context context, gis gisVar) {
            this.f18582a = context;
            this.b = gisVar;
        }

        @Override // tb.r4o
        public void f(vhs vhsVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("522f58eb", new Object[]{this, vhsVar});
                return;
            }
            ehs.a(ehs.this, null);
            ehs.b();
            String str = vhsVar.c;
            if (TextUtils.isEmpty(vhsVar.d)) {
                ehs.b();
                his.a();
                if (his.a()) {
                    if (!TextUtils.isEmpty(vhsVar.c)) {
                        ehs.l(this.f18582a, vhsVar.c);
                    } else if (!TextUtils.isEmpty(vhsVar.b)) {
                        ehs.l(this.f18582a, vhsVar.b);
                    }
                }
            }
            this.b.a(new fis(), vhsVar);
            if (ehs.c(ehs.this) != null) {
                ehs.c(ehs.this).a(null, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public String f18583a;
        public String b;

        static {
            t2o.a(665845908);
        }

        public b() {
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface c {
        void a(String str, String str2);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final ehs f18584a = new ehs(null);

        static {
            t2o.a(665845910);
        }

        public static /* synthetic */ ehs a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ehs) ipChange.ipc$dispatch("6b2978eb", new Object[0]);
            }
            return f18584a;
        }
    }

    static {
        t2o.a(665845906);
    }

    public /* synthetic */ ehs(a aVar) {
        this();
    }

    public static /* synthetic */ ryd a(ehs ehsVar, ryd rydVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ryd) ipChange.ipc$dispatch("691f999c", new Object[]{ehsVar, rydVar});
        }
        ehsVar.f18581a = rydVar;
        return rydVar;
    }

    public static /* synthetic */ String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("60292585", new Object[0]);
        }
        return c;
    }

    public static /* synthetic */ c c(ehs ehsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("2ed5cdfe", new Object[]{ehsVar});
        }
        ehsVar.getClass();
        return null;
    }

    public static ehs j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ehs) ipChange.ipc$dispatch("47f2bea6", new Object[0]);
        }
        return d.a();
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        ryd rydVar = this.f18581a;
        if (rydVar != null) {
            rydVar.cancel();
            this.f18581a = null;
        }
    }

    public final boolean e(eis eisVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("733beae7", new Object[]{this, eisVar})).booleanValue();
        }
        b bVar = this.b;
        if (bVar == null) {
            b bVar2 = new b(null);
            this.b = bVar2;
            bVar2.f18583a = eisVar.b;
            bVar2.b = eisVar.c;
            return true;
        } else if (eisVar.b.equals(bVar.f18583a) && eisVar.c.equals(this.b.b) && this.f18581a != null) {
            return false;
        } else {
            d();
            b bVar3 = this.b;
            bVar3.f18583a = eisVar.b;
            bVar3.b = eisVar.c;
            return true;
        }
    }

    public final boolean f(eis eisVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7b53145b", new Object[]{this, eisVar})).booleanValue();
        }
        if (eisVar == null) {
            return false;
        }
        return true;
    }

    public String g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a80f01ef", new Object[]{this, str});
        }
        return new l87().a(str);
    }

    public final void h(Context context, eis eisVar, gis gisVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14086730", new Object[]{this, context, eisVar, gisVar});
            return;
        }
        ITaoPasswordGenerateRequest iTaoPasswordGenerateRequest = new ITaoPasswordGenerateRequest();
        this.f18581a = iTaoPasswordGenerateRequest;
        iTaoPasswordGenerateRequest.request(context, eisVar, new a(context, gisVar));
    }

    public void i(Context context, eis eisVar, TPAction tPAction, gis gisVar, String str) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bcfe04f", new Object[]{this, context, eisVar, tPAction, gisVar, str});
        } else if (gisVar != null) {
            if (!TextUtils.isEmpty(str)) {
                j8t.c(str);
            } else if (TextUtils.isEmpty(j8t.a())) {
                throw new Exception("ttid is null.");
            }
            if (context == null || eisVar == null || !f(eisVar)) {
                vhs vhsVar = new vhs();
                vhsVar.d = "TPShareError_MissRequiredParameter";
                gisVar.a(null, vhsVar);
            } else if (e(eisVar)) {
                h(context, k(eisVar, tPAction), gisVar);
            }
        } else {
            throw new Exception("listener can not be null!");
        }
    }

    public ehs() {
        this.f18581a = null;
    }

    public static void l(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e8faa0b", new Object[]{context, str});
            return;
        }
        new StringBuilder("saveTaoPassword text=").append(str);
        if (!TextUtils.isEmpty(str)) {
            Matcher matcher = Patterns.WEB_URL.matcher(str);
            if (matcher.find()) {
                String group = matcher.group();
                int indexOf = str.indexOf("?");
                String substring = indexOf <= 0 ? group : group.substring(0, indexOf);
                StringBuilder sb = new StringBuilder("saveTaoPassword url=");
                sb.append(group);
                sb.append("  shortUrl=");
                sb.append(substring);
                kwr.f(context, substring);
                return;
            }
            kwr.f(context, str);
        }
    }

    public final eis k(eis eisVar, TPAction tPAction) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eis) ipChange.ipc$dispatch("b7e4e207", new Object[]{this, eisVar, tPAction});
        }
        eis eisVar2 = new eis();
        String str = eisVar.f18604a;
        eisVar2.f18604a = str;
        if (TextUtils.isEmpty(str)) {
            throw new Exception("bizId is null");
        } else if (TextUtils.isEmpty(eisVar.b)) {
            throw new Exception("text is null");
        } else if (!TextUtils.isEmpty(eisVar.c)) {
            eisVar2.b = ftl.a(eisVar.b);
            if (tPAction != null) {
                eisVar2.f = tPAction.toString();
            } else if (!TextUtils.isEmpty(eisVar.f)) {
                eisVar2.f = eisVar.f;
            } else {
                eisVar2.f = TPAction.OTHER.toString();
            }
            eisVar2.d = eisVar.d;
            if (eisVar.h != null) {
                HashMap hashMap = new HashMap();
                eisVar2.h = hashMap;
                hashMap.putAll(eisVar.h);
            }
            int i = eisVar.l;
            eisVar2.l = i;
            if (i != -1) {
                if (eisVar2.h == null) {
                    eisVar2.h = new HashMap();
                }
                eisVar2.h.put("isCallClient", Integer.toString(0));
            }
            eisVar2.c = eisVar.c;
            eisVar2.e = eisVar.e;
            if (TextUtils.isEmpty(eisVar.e)) {
                eisVar2.e = "other";
            }
            String str2 = eisVar.m;
            eisVar2.m = str2;
            if (TextUtils.isEmpty(str2)) {
                if (eisVar2.e.equals("item")) {
                    eisVar2.m = TemplateId.ITEM.toString();
                } else if (eisVar2.e.equals("shop")) {
                    eisVar2.m = TemplateId.SHOP.toString();
                } else {
                    eisVar2.m = TemplateId.COMMON.toString();
                }
            }
            eisVar2.g = eisVar.g;
            eisVar2.i = eisVar.i;
            eisVar2.j = eisVar.j;
            eisVar2.k = eisVar.k;
            return eisVar2;
        } else {
            throw new Exception("url is null");
        }
    }
}
