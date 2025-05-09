package com.taobao.android.detail.ttdetail;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.communication.ThreadMode;
import tb.cos;
import tb.ins;
import tb.ir;
import tb.jns;
import tb.kns;
import tb.nb4;
import tb.ntc;
import tb.oa4;
import tb.q84;
import tb.rc7;
import tb.t2o;
import tb.xi2;
import tb.yns;
import tb.ze7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class TTMainScreenContainer extends ins implements ntc<rc7> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TTMainScreenContainer";

    static {
        t2o.a(912261218);
        t2o.a(912261362);
    }

    public TTMainScreenContainer(Context context, String str) {
        this(context, str, null);
    }

    public static /* synthetic */ Object ipc$super(TTMainScreenContainer tTMainScreenContainer, String str, Object... objArr) {
        if (str.hashCode() == -1983604863) {
            super.g();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/TTMainScreenContainer");
    }

    @Override // tb.ntc
    public ThreadMode W2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadMode) ipChange.ipc$dispatch("e1b5ec98", new Object[]{this});
        }
        return ThreadMode.MainThread;
    }

    @Override // tb.ins
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        q84.m(this.b, this);
        super.g();
    }

    public <T extends nb4> oa4<T> j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oa4) ipChange.ipc$dispatch("fdcf54e4", new Object[]{this});
        }
        return h().h().d("bottomBar");
    }

    public View k() {
        yns s;
        xi2 o;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d9ca72c0", new Object[]{this});
        }
        jns jnsVar = (jns) h().e().e(kns.PARSER_ID);
        if (jnsVar == null || (s = jnsVar.s()) == null || (o = s.o()) == null) {
            return null;
        }
        o.p();
        View d = o.d(h().d());
        o.r();
        o.q();
        return d;
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45d0c0d7", new Object[]{this});
        } else {
            cos.b(h(), h().c());
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eee9a4ec", new Object[]{this});
        } else {
            h().h().f();
        }
    }

    /* renamed from: n */
    public boolean y1(rc7 rc7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("55d21ae9", new Object[]{this, rc7Var})).booleanValue();
        }
        JSONObject b = rc7Var.b();
        if (b != null) {
            h().b().h(new ir(b), rc7Var.d());
        } else {
            h().b().h(new ir(new JSONObject(rc7Var) { // from class: com.taobao.android.detail.ttdetail.TTMainScreenContainer.1
                public final /* synthetic */ rc7 val$message;

                {
                    this.val$message = rc7Var;
                    put("type", (Object) rc7Var.m1123b());
                    put("fields", (Object) rc7Var.c());
                }
            }), rc7Var.d());
        }
        return false;
    }

    public void o(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("463f33b5", new Object[]{this, jSONObject});
            return;
        }
        h().e().t(jSONObject);
        m();
    }

    public TTMainScreenContainer(Context context, String str, ze7 ze7Var) {
        super(context, str, ze7Var);
        l();
        q84.i(context, rc7.class, this);
    }
}
