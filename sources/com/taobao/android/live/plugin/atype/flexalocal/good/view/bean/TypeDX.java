package com.taobao.android.live.plugin.atype.flexalocal.good.view.bean;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.n10;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TypeDX extends RecyclerView.ViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f8536a;
    public n10 b;

    static {
        t2o.a(295699288);
    }

    public TypeDX(View view) {
        super(view);
    }

    public static /* synthetic */ Object ipc$super(TypeDX typeDX, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/view/bean/TypeDX");
    }

    public n10 b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n10) ipChange.ipc$dispatch("60ab12bc", new Object[]{this});
        }
        return this.b;
    }

    public String c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("850c6035", new Object[]{this});
        }
        return this.f8536a;
    }

    public void d0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31e12484", new Object[]{this, new Boolean(z)});
        }
    }

    public void e0(n10 n10Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d064ecba", new Object[]{this, n10Var});
        } else {
            this.b = n10Var;
        }
    }

    public void f0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93692de1", new Object[]{this, str});
        } else {
            this.f8536a = str;
        }
    }
}
