package tb;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.model.TabModel;
import com.taobao.taobao.R;
import tb.tpu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class z0p extends qr1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final b Companion = new b(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            z0p.n(z0p.this);
            z0p.m(z0p.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b {
        static {
            t2o.a(916455686);
        }

        public b() {
        }

        public /* synthetic */ b(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(916455685);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0p(qpu qpuVar) {
        super(qpuVar);
        ckf.g(qpuVar, "turboEngineContext");
    }

    public static /* synthetic */ Object ipc$super(z0p z0pVar, String str, Object... objArr) {
        if (str.hashCode() == -41557118) {
            super.l(((Number) objArr[0]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/service/topbar/component/SearchButtonComponent");
    }

    public static final /* synthetic */ void m(z0p z0pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af836c5c", new Object[]{z0pVar});
        } else {
            z0pVar.p();
        }
    }

    public static final /* synthetic */ void n(z0p z0pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49aa9e3f", new Object[]{z0pVar});
        } else {
            z0pVar.q();
        }
    }

    @Override // tb.qr1
    public void l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd85e382", new Object[]{this, new Integer(i)});
            return;
        }
        super.l(i);
        ImageView imageView = (ImageView) getView();
        if (imageView != null) {
            imageView.setImageTintList(ColorStateList.valueOf(i));
        }
    }

    /* renamed from: o */
    public ImageView createViewImpl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("76f3ad08", new Object[]{this});
        }
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.top_bar_search_icon);
        imageView.setContentDescription("搜索，按钮");
        imageView.setOnClickListener(new a());
        r();
        return imageView;
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a8ab904", new Object[]{this});
        } else {
            ((f2e) k().getService(f2e.class)).q("Searchguang", null, "topbar.2");
        }
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd09d2f9", new Object[]{this});
        } else {
            ((f2e) k().getService(f2e.class)).D0("Searchguang", null, "topbar.2");
        }
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c79264c7", new Object[]{this});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "sceneSource", "searchguang");
        xwc xwcVar = (xwc) k().getService(xwc.class);
        TabModel d0 = xwcVar.d0(xwcVar.getCurrentIndex());
        String spm = d0 != null ? d0.getSpm() : null;
        String d = mnv.Companion.d("https://h5.m.taobao.com/tnode/index.htm?utparam=%7B%22x_source%22%3A%22guang_search%22%7D&tnode=page_search%3Fpangesture%3Dpullrightexit%26navbarHide%3Dtrue%26pageTrack%3Dfalse%26immersive%3dtrue", kotlin.collections.a.j(jpu.a("extParams", jSONObject.toString()), jpu.a("spm", spm != null ? spm.concat(".topbar.2") : null)));
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "SearchButtonComponent", "处理点击，url=" + d, null, 4, null);
        ((azc) k().getService(azc.class)).e(getContext(), d, null);
    }
}
