package tb;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import com.taobao.android.detail.ttdetail.data.meta.Params;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.utils.DataUtils;
import com.taobao.android.detail.ttdetail.utils.PerformanceUtils;
import com.taobao.android.detail.ttdetail.utils.UtUtils;
import com.taobao.android.detail.ttdetail.widget.TTObservedImageView;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class u3a extends oa4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f29107a;
    public final JSONObject b = new JSONObject(2);
    public final TTObservedImageView.b c = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements TTObservedImageView.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public void a(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("595509ac", new Object[]{this, drawable});
            } else if (!u3a.u(u3a.this) && u3a.this.z() == 0) {
                boolean o = u3a.this.mDetailContext.e().o();
                u3a.v(u3a.this, o);
                if (!o) {
                    u3a.w(u3a.this);
                }
            }
        }
    }

    static {
        t2o.a(912261419);
    }

    public u3a(Context context, ze7 ze7Var, nb4 nb4Var, DataEntry... dataEntryArr) {
        super(context, ze7Var, nb4Var, dataEntryArr);
    }

    public static /* synthetic */ Object ipc$super(u3a u3aVar, String str, Object... objArr) {
        if (str.hashCode() == 1985561551) {
            super.fireExposeEvent((RuntimeAbilityParam[]) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/component/module/GalleryComponent");
    }

    public static /* synthetic */ boolean u(u3a u3aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b9f694a1", new Object[]{u3aVar})).booleanValue();
        }
        return u3aVar.f29107a;
    }

    public static /* synthetic */ void v(u3a u3aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9dde0376", new Object[]{u3aVar, new Boolean(z)});
        } else {
            u3aVar.G(z);
        }
    }

    public static /* synthetic */ void w(u3a u3aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb93919f", new Object[]{u3aVar});
        } else {
            u3aVar.D();
        }
    }

    public String A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c75f5c45", new Object[]{this});
        }
        return "DetailPic_industry";
    }

    public JSONObject B() {
        rql i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f006ec1d", new Object[]{this});
        }
        Object data = getData("componentCreateIndex");
        if (data instanceof Integer) {
            this.b.put("index", data);
        }
        rql i2 = this.mComponentData.i();
        if ((i2 instanceof tx9) && (i = i2.i()) != null) {
            this.b.put("bizCode", (Object) i.g());
        }
        return this.b;
    }

    public float C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dd831c62", new Object[]{this})).floatValue();
        }
        Object data = getData("framePageWidthRatio");
        if (data instanceof Float) {
            return ((Float) data).floatValue();
        }
        return 1.0f;
    }

    public final void D() {
        View findViewById;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcad3043", new Object[]{this});
            return;
        }
        Context context = this.mContext;
        if ((context instanceof Activity) && (findViewById = ((Activity) context).findViewById(R.id.cl_image_holder_container)) != null) {
            findViewById.setVisibility(8);
            this.f29107a = true;
        }
    }

    public void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9d3d21", new Object[]{this});
        }
    }

    public void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cd24a7a", new Object[]{this});
        }
    }

    public final void G(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19128499", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            str = "preRenderHeaderEnd";
        } else {
            str = "renderHeaderEnd";
        }
        PerformanceUtils.q(this.mDetailContext, str, System.currentTimeMillis());
        long F = DataUtils.F((Params) this.mDetailContext.e().f(Params.class));
        if (F > 0) {
            PerformanceUtils.n(this.mDetailContext, "SRT", F);
        }
        bw7.c(str, null);
    }

    @Override // tb.oa4
    public void fireExposeEvent(RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("765943cf", new Object[]{this, runtimeAbilityParamArr});
            return;
        }
        if (!vbl.Z0()) {
            super.fireExposeEvent(runtimeAbilityParamArr);
        }
        JSONObject c = UtUtils.c(this.mDetailContext.e());
        c.putAll(B());
        c.put("spm", (Object) "a2141.7631564.detailpic");
        UtUtils.h(2201, A(), c);
    }

    public JSONObject x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e2c447a8", new Object[]{this});
        }
        return B();
    }

    public String y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f2c1fb0f", new Object[]{this});
        }
        return null;
    }

    public int z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb85d649", new Object[]{this})).intValue();
        }
        Object data = getData("componentCreateIndex");
        if (data instanceof Integer) {
            return ((Integer) data).intValue();
        }
        return -1;
    }
}
