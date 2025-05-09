package tb;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.meta.Content;
import com.taobao.android.detail.ttdetail.data.meta.Item;
import kotlin.TypeCastException;
import tb.lvd;
import tb.our;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class yis {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final lvd f32118a;
    public boolean b;
    public final ze7 c;

    static {
        t2o.a(912261526);
    }

    public yis(ze7 ze7Var, pur purVar) {
        ckf.h(ze7Var, "detailContext");
        ckf.h(purVar, "model");
        this.c = ze7Var;
        our.a aVar = our.Companion;
        Context c = ze7Var.c();
        ckf.c(c, "detailContext.androidContext");
        this.f32118a = aVar.a(c, purVar);
    }

    public final View a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a36f6900", new Object[]{this});
        }
        View view = this.f32118a.getView();
        if (view != null) {
            return view;
        }
        return new View(this.c.c());
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("321cdedb", new Object[]{this});
        } else {
            lvd.b.a(this.f32118a, null, 1, null);
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            this.f32118a.destroy();
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3d60f0b", new Object[]{this});
        } else {
            this.f32118a.disappear();
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        } else {
            this.f32118a.start();
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        } else {
            this.f32118a.stop();
        }
    }

    public final void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa69bd32", new Object[]{this, new Boolean(z)});
            return;
        }
        bq6 e = this.c.e();
        ckf.c(e, "detailContext.dataEngine");
        Item item = (Item) e.f(Item.class);
        Content content = (Content) e.f(Content.class);
        pur purVar = new pur();
        if (item != null) {
            purVar.d(item.getCategoryId());
            purVar.f(item.getItemId());
        }
        if (content != null) {
            Object json = JSON.toJSON(content);
            if (json != null) {
                purVar.e((JSONObject) json);
                purVar.g(content.getTitle());
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
            }
        }
        this.f32118a.c(purVar);
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940e810a", new Object[]{this});
        } else if (!this.b) {
            this.f32118a.init();
        } else {
            this.b = true;
        }
    }

    public final void i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56e2046b", new Object[]{this, str, str2});
            return;
        }
        ckf.h(str, "contentId");
        ckf.h(str2, "title");
        this.f32118a.a(str, str2);
    }
}
