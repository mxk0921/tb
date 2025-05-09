package tb;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class uea implements oac {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final mac f29322a;
    public final dxa b;
    public final ux9 c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements iyc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.iyc
        public void a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7d84582e", new Object[]{this, obj});
            }
        }

        @Override // tb.iyc
        public void c(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2840ed9e", new Object[]{this, obj});
            }
        }

        @Override // tb.iyc
        public void d(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b0624d15", new Object[]{this, obj});
            } else {
                uea.a(uea.this).hide();
            }
        }

        @Override // tb.iyc
        public void b(Object obj) {
            HashMap<String, String> hashMap;
            boolean z;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("566d5490", new Object[]{this, obj});
                return;
            }
            if (obj == null || !(obj instanceof HashMap)) {
                hashMap = null;
                z = false;
            } else {
                HashMap<String, String> hashMap2 = (HashMap) obj;
                hashMap = hashMap2;
                z = zqq.c(hashMap2.get("show_item_group"));
            }
            uea.a(uea.this).show(z, hashMap, 0L, false);
        }
    }

    static {
        t2o.a(779092508);
        t2o.a(806356112);
    }

    public uea(Activity activity, ux9 ux9Var, String str, boolean z, TBLiveDataModel tBLiveDataModel, View view) {
        this.c = ux9Var;
        mac createGoodFrameKandian = d9m.n().createGoodFrameKandian(activity, str, z, tBLiveDataModel, view, ux9Var);
        this.f29322a = createGoodFrameKandian;
        createGoodFrameKandian.setFrameEventListener(this);
        this.b = dxa.b(ux9Var);
        d();
    }

    public static /* synthetic */ mac a(uea ueaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mac) ipChange.ipc$dispatch("3426a7b4", new Object[]{ueaVar});
        }
        return ueaVar.f29322a;
    }

    public BaseFrame b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("3229a038", new Object[]{this});
        }
        return this.f29322a.getFrame();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            return;
        }
        if (this.b.f() != null) {
            this.b.f().a(this.c, Boolean.FALSE);
            this.b.f().n(this.c);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("isOpen", "false");
        kjr.a().b("TBLiveWeex.Event.goodListStatus", hashMap);
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e6686f1", new Object[]{this});
        } else {
            this.b.p(new a());
        }
    }

    public void e(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a1a1cc6", new Object[]{this, viewGroup});
        } else {
            this.f29322a.setContainer((ViewGroup) viewGroup.findViewById(R.id.taolive_goods_list_dx_container), (ViewGroup) viewGroup.findViewById(R.id.taolive_goods_list_itemgroup_container));
        }
    }

    public void f(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
        } else {
            d();
        }
    }

    public void g(boolean z, HashMap<String, String> hashMap, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b02cc6d", new Object[]{this, new Boolean(z), hashMap, str});
            return;
        }
        HashMap hashMap2 = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap2.put("glopenfrom", str);
        }
        sbu.f(this.c, "Goodslist", hashMap2);
        if (this.b.f() != null) {
            this.b.f().a(this.c, Boolean.TRUE);
            this.b.f().g(this.c, "goodsList");
        }
        HashMap hashMap3 = new HashMap();
        hashMap3.put("isOpen", "true");
        kjr.a().b("TBLiveWeex.Event.goodListStatus", hashMap3);
    }
}
