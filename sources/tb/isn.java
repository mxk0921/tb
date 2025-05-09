package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class isn extends pig {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final b1i f21554a;

    static {
        t2o.a(912262051);
    }

    public isn(Context context, ze7 ze7Var) {
        this.f21554a = new b1i(context, ze7Var, new d1i(new JSONObject()), new DataEntry[0]);
    }

    public static /* synthetic */ Object ipc$super(isn isnVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/layout/RecyclerLayout");
    }

    @Override // tb.pig
    public <C extends oa4> C a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C) ((oa4) ipChange.ipc$dispatch("97436efd", new Object[]{this, str}));
        }
        return (C) this.f21554a.findComponentByUltronName(str);
    }

    @Override // tb.pig
    public <C extends oa4> C b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C) ((oa4) ipChange.ipc$dispatch("461d3b0a", new Object[]{this, str}));
        }
        if (TextUtils.equals("mainScreen", str)) {
            return this.f21554a;
        }
        return (C) this.f21554a.findComponent(str);
    }

    @Override // tb.pig
    public View c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("17b33166", new Object[]{this});
        }
        return this.f21554a.getComponentView(null);
    }

    @Override // tb.pig
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            this.f21554a.destroy();
        }
    }

    @Override // tb.pig
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("754b5b9b", new Object[]{this});
        } else {
            this.f21554a.D();
        }
    }
}
