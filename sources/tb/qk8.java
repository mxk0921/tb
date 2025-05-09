package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class qk8 implements s3c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_START_REPORT = "com.taobao.taolive.room.start_report_from_btns";

    /* renamed from: a  reason: collision with root package name */
    public final TBLiveDataModel f26794a;
    public final boolean b;
    public final Context c;
    public final ux9 d;

    static {
        t2o.a(779092500);
        t2o.a(806355016);
    }

    public qk8(TBLiveDataModel tBLiveDataModel, boolean z, Context context, ux9 ux9Var) {
        this.f26794a = tBLiveDataModel;
        this.b = z;
        this.c = context;
        this.d = ux9Var;
        sjr.g().a(this);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0306f9b", new Object[]{this});
        } else {
            sjr.g().b(this);
        }
    }

    @Override // tb.s3c
    public String bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
        }
        return "EventLiveListener";
    }

    @Override // tb.s3c
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
        }
        return new String[]{"com.taobao.taolive.room.start_report_from_btns", "com.taobao.taolive.room.goods_list_showing", uyg.EVENT_SHOW_GOODSPACKAGE, uyg.EVENT_SHOW_GOODSPACKAGE_DISMISS, "com.taobao.taolive.room.hide_goods_list", "com.taobao.taolive.room.interactive_render_finished", "com.taobao.taolive.goods.open.shop_vip", uyg.EVENT_HIGHLIHT_REFRESH_BY_NOTIFY, "com.taobao.taolive.goods.open.shop_vip", uyg.EVENT_HIGHLIGHT_BACK_TO_LIVE_EVENT, uyg.EVENT_HIGHLIGHT_SUBSCRIBE_EVENT};
    }

    @Override // tb.s3c
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        ux9 ux9Var = this.d;
        if (ux9Var == null) {
            return null;
        }
        return ux9Var.C();
    }

    @Override // tb.s3c
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
            return;
        }
        dxa b = dxa.b(this.d);
        if ("com.taobao.taolive.room.start_report_from_btns".equals(str)) {
            hxa.a(this.c, this.f26794a, this.b, this.d);
        } else if ("com.taobao.taolive.room.goods_list_showing".equals(str)) {
            if (b.d() != null) {
                b.d().a(obj);
            }
        } else if (uyg.EVENT_SHOW_GOODSPACKAGE.equals(str)) {
            if (b.g() != null) {
                b.g().b(obj);
            }
        } else if (uyg.EVENT_SHOW_GOODSPACKAGE_DISMISS.equals(str) || "com.taobao.taolive.room.hide_goods_list".equals(str)) {
            if (b.g() != null) {
                b.g().d(obj);
            }
        } else if ("com.taobao.taolive.room.interactive_render_finished".equals(str)) {
            if (b.g() != null) {
                b.g().a(obj);
            }
        } else if ("com.taobao.taolive.goods.open.shop_vip".equals(str)) {
            if (b.g() != null) {
                b.g().c(obj);
            }
        } else if (uyg.EVENT_HIGHLIHT_REFRESH_BY_NOTIFY.equals(str)) {
            ux9 ux9Var = this.d;
            if (ux9Var != null && (ux9Var.l() instanceof wwa)) {
                HashMap hashMap = new HashMap();
                hashMap.put("itemId", ((wwa) this.d.l()).d);
                if (dxa.b(this.d).l() != null) {
                    dxa.b(this.d).l().h(hashMap, true, null);
                }
            }
        } else if (uyg.EVENT_HIGHLIGHT_BACK_TO_LIVE_EVENT.equals(str)) {
            if (b.k() != null) {
                b.k().a();
            }
        } else if (uyg.EVENT_HIGHLIGHT_SUBSCRIBE_EVENT.equals(str) && (obj instanceof Boolean) && b.k() != null) {
            if (((Boolean) obj).booleanValue()) {
                b.k().c();
            } else {
                b.k().b();
            }
        }
    }
}
