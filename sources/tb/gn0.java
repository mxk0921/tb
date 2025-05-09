package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.f7d;
import tb.g7d;
import tb.h7d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class gn0<EMPTY extends f7d, ERROR extends g7d, LOADING extends h7d> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(301989909);
    }

    public EMPTY a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EMPTY) ((f7d) ipChange.ipc$dispatch("3321c686", new Object[]{this}));
        }
        return null;
    }

    public ERROR b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ERROR) ((g7d) ipChange.ipc$dispatch("1d3cd950", new Object[]{this}));
        }
        return null;
    }

    public LOADING c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LOADING) ((h7d) ipChange.ipc$dispatch("becba628", new Object[]{this}));
        }
        return null;
    }

    public LOADING d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LOADING) ((h7d) ipChange.ipc$dispatch("5fef16cb", new Object[]{this}));
        }
        return null;
    }
}
