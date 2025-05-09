package com.taobao.android.dinamicx.model;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.mvb;
import tb.t2o;
import tb.yvb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXHandlerMap extends DXLongSparseArray<mvb> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final yvb f7322a;

    static {
        t2o.a(444596872);
    }

    public DXHandlerMap(yvb yvbVar) {
        super(20);
        this.f7322a = yvbVar;
    }

    public static /* synthetic */ Object ipc$super(DXHandlerMap dXHandlerMap, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/model/DXHandlerMap");
    }

    /* renamed from: b */
    public mvb get(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mvb) ipChange.ipc$dispatch("7250bb1e", new Object[]{this, new Long(j)});
        }
        mvb mvbVar = get(j, null);
        if (mvbVar != null) {
            return mvbVar;
        }
        yvb yvbVar = this.f7322a;
        if (yvbVar != null) {
            return yvbVar.get(j);
        }
        return null;
    }
}
