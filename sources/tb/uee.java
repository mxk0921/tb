package tb;

import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface uee {
    void A0(boolean z);

    void A1(JSONObject jSONObject);

    acx<? extends o02<? extends BaseSearchResult, ?>> B();

    boolean E(int i);

    void F(int i, int i2);

    void I1(int i, int i2);

    void L0(int i, int i2);

    void N1(int i);

    void O0(int i);

    void Q1(t48 t48Var);

    void T(int i, int i2);

    boolean T0();

    void T1(int i);

    void U0(int i);

    void U1(String str);

    void X1(boolean z);

    void Z1(int i);

    void d2(String str, String str2);

    void destroyAndRemoveFromParent();

    void e1(int i, boolean z);

    void f1(kuc kucVar);

    void f2(boolean z);

    phw<?, ?, ?> g0(int i);

    void g1(lox loxVar);

    ViewGroup getView();

    void i1(String str, int i, boolean z, int i2);

    boolean isReachBottom();

    boolean isReachTop();

    void k0(boolean z);

    void k1(int i);

    void l0(int i);

    void onCtxDestroyInternal();

    void onCtxPauseInternal();

    void onCtxResumeInternal();

    void postEvent(Object obj);

    void subscribeEvent(Object obj);

    void w0(boolean z, int i);

    void x0(int i, int i2);

    void z1(boolean z);
}
