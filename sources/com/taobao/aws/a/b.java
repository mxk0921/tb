package com.taobao.aws.a;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class b extends Exception {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f10218a;

    static {
        t2o.a(401604611);
    }

    public b(int i) {
        this.f10218a = i;
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/aws/a/b");
    }

    public int getCloseCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d42ffa49", new Object[]{this})).intValue();
        }
        return this.f10218a;
    }

    public b(int i, String str) {
        super(str);
        this.f10218a = i;
    }

    public b(int i, Throwable th) {
        super(th);
        this.f10218a = i;
    }
}
