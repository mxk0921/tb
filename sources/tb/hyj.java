package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.biz.superitemcard.viewholder.SuperItemViewHolder;
import com.taobao.utils.Global;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class hyj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean b;
    public boolean c;
    public String d;
    public String e;
    public final g8n g;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, String> f20969a = new HashMap<>();
    public final List<String> f = new ArrayList();
    public int h = 0;
    public boolean i = false;

    static {
        t2o.a(352321785);
    }

    public hyj(g8n g8nVar) {
        this.g = g8nVar;
        g();
    }

    public final String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16356e4a", new Object[]{this, str});
        }
        String str2 = "";
        if (TextUtils.isEmpty(str)) {
            str = str2;
        }
        g8n g8nVar = this.g;
        if (g8nVar != null && !TextUtils.isEmpty(g8nVar.m)) {
            str2 = this.g.m;
        }
        return str + str2;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d1406309", new Object[]{this})).intValue();
        }
        return this.h;
    }

    public List<String> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8d35fd77", new Object[]{this});
        }
        return this.f;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1e996551", new Object[]{this});
        }
        return this.e;
    }

    public HashMap<String, String> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("33b47a52", new Object[]{this});
        }
        return this.f20969a;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4bf85c7", new Object[]{this});
        }
        return this.d;
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c01e21c", new Object[]{this});
            return;
        }
        o2r.a("NewDetailSPConfigInit");
        this.f20969a.put(a("item"), xmo.l(Global.getApplication(), a("item")));
        this.f20969a.put(a(SuperItemViewHolder.VIEWHOLDER_KEY), xmo.l(Global.getApplication(), a(SuperItemViewHolder.VIEWHOLDER_KEY)));
        this.b = "true".equals(xmo.h(Global.getApplication()));
        this.c = "true".equals(xmo.f(Global.getApplication()));
        this.e = xmo.g(Global.getApplication());
        this.h = xmo.i(Global.getApplication());
        this.i = xmo.H(Global.getApplication());
        if (!TextUtils.isEmpty(this.e)) {
            Collections.addAll(this.f, this.e.split(","));
        }
        this.d = xmo.o(Global.getApplication());
        o2r.b();
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("72c30037", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("55dad7ee", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26f58eb9", new Object[]{this})).booleanValue();
        }
        return this.i;
    }
}
