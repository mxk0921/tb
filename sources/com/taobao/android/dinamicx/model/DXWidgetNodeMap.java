package com.taobao.android.dinamicx.model;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kxb;
import tb.qub;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXWidgetNodeMap extends DXLongSparseArray<qub> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final kxb f7325a;

    static {
        t2o.a(444596886);
    }

    public DXWidgetNodeMap(kxb kxbVar) {
        super(20);
        this.f7325a = kxbVar;
    }

    public static /* synthetic */ Object ipc$super(DXWidgetNodeMap dXWidgetNodeMap, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/model/DXWidgetNodeMap");
    }

    /* renamed from: b */
    public qub get(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qub) ipChange.ipc$dispatch("a3667fbc", new Object[]{this, new Long(j)});
        }
        qub qubVar = get(j, null);
        if (qubVar != null) {
            return qubVar;
        }
        kxb kxbVar = this.f7325a;
        if (kxbVar != null) {
            return kxbVar.get(j);
        }
        return null;
    }
}
