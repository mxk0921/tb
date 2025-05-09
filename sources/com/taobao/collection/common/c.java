package com.taobao.collection.common;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.collection.common.SwitchOption;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public SwitchOption.CollectionType f10303a;
    public Code b;
    public Object c;

    static {
        t2o.a(789577787);
    }

    public Code a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Code) ipChange.ipc$dispatch("bcf42212", new Object[]{this});
        }
        return this.b;
    }

    public Object b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("4ca84d6b", new Object[]{this});
        }
        return this.c;
    }

    public SwitchOption.CollectionType c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SwitchOption.CollectionType) ipChange.ipc$dispatch("b5965281", new Object[]{this});
        }
        return this.f10303a;
    }

    public void d(Code code) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62cba3c6", new Object[]{this, code});
        } else {
            this.b = code;
        }
    }

    public void e(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4f836cf", new Object[]{this, obj});
        } else {
            this.c = obj;
        }
    }

    public void f(SwitchOption.CollectionType collectionType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b168085", new Object[]{this, collectionType});
        } else {
            this.f10303a = collectionType;
        }
    }
}
