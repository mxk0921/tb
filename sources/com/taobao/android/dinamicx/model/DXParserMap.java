package com.taobao.android.dinamicx.model;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.evb;
import tb.jwb;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXParserMap extends DXLongSparseArray<evb> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final jwb f7323a;

    static {
        t2o.a(444596876);
    }

    public DXParserMap(jwb jwbVar) {
        super(20);
        this.f7323a = jwbVar;
    }

    public static /* synthetic */ Object ipc$super(DXParserMap dXParserMap, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/model/DXParserMap");
    }

    /* renamed from: b */
    public evb get(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (evb) ipChange.ipc$dispatch("ac447d9e", new Object[]{this, new Long(j)});
        }
        evb evbVar = get(j, null);
        if (evbVar != null) {
            return evbVar;
        }
        jwb jwbVar = this.f7323a;
        if (jwbVar != null) {
            return jwbVar.get(j);
        }
        return null;
    }
}
