package com.taobao.umipublish.extension.windvane;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.extension.windvane.call.WindvaneCall;
import kotlin.Metadata;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/taobao/umipublish/extension/windvane/Item;", "", "umipublish_extends_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class Item {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f14002a;
    public final boolean b;
    public final Class<? extends WindvaneCall> c;

    static {
        t2o.a(944767073);
    }

    public Item(String str, String str2, boolean z, Class<? extends WindvaneCall> cls) {
        ckf.g(str, "actionName");
        this.f14002a = str2;
        this.b = z;
        this.c = cls;
    }

    public final Class<? extends WindvaneCall> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("12ecf838", new Object[]{this});
        }
        return this.c;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e6eadaaa", new Object[]{this});
        }
        return this.f14002a;
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bf69e69b", new Object[]{this})).booleanValue();
        }
        return this.b;
    }
}
