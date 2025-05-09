package com.taobao.tao.flexbox.layoutmanager.core;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.f;
import com.taobao.tao.flexbox.layoutmanager.core.r;
import com.taobao.tao.flexbox.layoutmanager.filter.Utils;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class s implements Utils.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public f.h f12291a;
    public Object b;
    public Object c;
    public r.c d;
    public f.h e;
    public String f;
    public Utils.a g;

    static {
        t2o.a(503317208);
        t2o.a(503317255);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.filter.Utils.b
    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e95f827", new Object[]{this, str, obj});
            return;
        }
        if (this.g == null) {
            this.g = new Utils.a();
        }
        this.g.a(str, obj);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.filter.Utils.b
    public Object b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("645ce260", new Object[]{this, str});
        }
        Utils.a aVar = this.g;
        if (aVar != null) {
            return aVar.b(str);
        }
        return null;
    }
}
