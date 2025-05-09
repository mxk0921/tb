package com.taobao.android.detail2.core.mainpic.viewholder;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.mainpic.MainPicContainer;
import com.taobao.android.detail2.core.mainpic.a;
import java.util.UUID;
import tb.ec7;
import tb.gbx;
import tb.qrc;
import tb.t2o;
import tb.txj;
import tb.u0i;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class MainPicAbsViewHolder<T extends u0i> extends RecyclerView.ViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final a.b f7219a;
    public final a b;
    public final MainPicContainer c;
    public T d;
    public final String e = UUID.randomUUID().toString();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface a {
        void a(gbx.d dVar);

        void b(gbx.d dVar);

        void c(gbx.d dVar);

        void d(gbx.d dVar);
    }

    static {
        t2o.a(352322165);
    }

    public MainPicAbsViewHolder(ViewGroup viewGroup, MainPicContainer mainPicContainer, a.b bVar, a aVar) {
        super(viewGroup);
        this.f7219a = bVar;
        this.b = aVar;
        this.c = mainPicContainer;
    }

    public static /* synthetic */ Object ipc$super(MainPicAbsViewHolder mainPicAbsViewHolder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/mainpic/viewholder/MainPicAbsViewHolder");
    }

    public void b0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcfb1117", new Object[]{this, str});
            return;
        }
        i0(str);
        txj.e(txj.TAG_MAIN_PIC, this + "active");
    }

    public void c0(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78e5a256", new Object[]{this, t});
            return;
        }
        this.d = t;
        j0(t);
    }

    public void d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0cbe1a6", new Object[]{this});
        } else {
            k0();
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            onDestroy();
        }
    }

    public void e0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("620ac404", new Object[]{this, str});
            return;
        }
        l0(str);
        txj.e(txj.TAG_MAIN_PIC, this + "containerDisActive");
    }

    public void f0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a37e68c5", new Object[]{this, str});
            return;
        }
        m0(str);
        this.d.d = true;
        txj.e(txj.TAG_MAIN_PIC, this + "disActive");
    }

    public int g0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b656e206", new Object[]{this})).intValue();
        }
        T t = this.d;
        if (t != null) {
            return t.c;
        }
        return -1;
    }

    public String h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a0188ffc", new Object[]{this});
        }
        T t = this.d;
        if (t != null) {
            return t.e();
        }
        return "";
    }

    public abstract void i0(String str);

    public abstract void j0(T t);

    public abstract void k0();

    public abstract void l0(String str);

    public abstract void m0(String str);

    public abstract void n0(JSONObject jSONObject);

    public abstract void o0();

    public abstract void onDestroy();

    public abstract void p0();

    public abstract void q0(String str);

    public abstract void r0(String str);

    public void s0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae68639a", new Object[]{this, jSONObject});
            return;
        }
        n0(jSONObject);
        txj.e(txj.TAG_MAIN_PIC, this + "processMediaOperate");
    }

    public void t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51af759a", new Object[]{this});
        } else {
            o0();
        }
    }

    public void u0(qrc qrcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fd0a1cf", new Object[]{this, qrcVar});
            return;
        }
        T t = this.d;
        if (t != null && t.c == 0 && qrcVar != null && !t.d) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("width", (Object) String.valueOf(ec7.d(this.f7219a.getNewDetailContext().i(), qrcVar.b)));
            jSONObject3.put("height", (Object) String.valueOf(ec7.d(this.f7219a.getNewDetailContext().i(), qrcVar.f26895a)));
            jSONObject3.put("x", (Object) String.valueOf(ec7.d(this.f7219a.getNewDetailContext().i(), qrcVar.g)));
            jSONObject3.put("y", (Object) String.valueOf(ec7.d(this.f7219a.getNewDetailContext().i(), qrcVar.f)));
            jSONObject2.put("containerFrame", (Object) jSONObject3);
            jSONObject.put("args", (Object) jSONObject2);
            jSONObject.put("type", (Object) "append");
            this.f7219a.f("interactiveUTParams", jSONObject);
        }
    }

    public void v0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd104245", new Object[]{this});
            return;
        }
        p0();
        txj.e(txj.TAG_MAIN_PIC, this + "supplementUTParams");
    }

    public void w0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b4ec609", new Object[]{this, str});
            return;
        }
        q0(str);
        txj.e(txj.TAG_MAIN_PIC, this + "willActive");
    }

    public void x0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("728c3693", new Object[]{this, str});
            return;
        }
        r0(str);
        txj.e(txj.TAG_MAIN_PIC, this + "willDisActive");
    }
}
