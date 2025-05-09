package com.taobao.android.ultronx.engine;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultronx.base.CPointer;
import com.taobao.android.ultronx.protocol.UltronProtocol;
import com.taobao.android.ultronx.tree.StatusTree;
import tb.fr2;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class UltronContext extends fr2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private UltronProtocol mProtocol;
    private StatusTree mTree;

    static {
        t2o.a(939524104);
    }

    public UltronContext(CPointer cPointer) {
        super(cPointer);
    }

    public static /* synthetic */ Object ipc$super(UltronContext ultronContext, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ultronx/engine/UltronContext");
    }

    public native long _getProtocol(long j);

    public native long _getStatusTree(long j);

    public UltronProtocol getProtocol() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UltronProtocol) ipChange.ipc$dispatch("23644d8b", new Object[]{this});
        }
        long _getProtocol = _getProtocol(this.mPointer.f9875a);
        if (_getProtocol == 0) {
            return null;
        }
        UltronProtocol ultronProtocol = this.mProtocol;
        if (ultronProtocol == null || ultronProtocol.getAddress() != _getProtocol) {
            this.mProtocol = new UltronProtocol(new CPointer(_getProtocol));
        }
        return this.mProtocol;
    }

    public StatusTree getStatusTree() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StatusTree) ipChange.ipc$dispatch("a17e6bf5", new Object[]{this});
        }
        long _getStatusTree = _getStatusTree(this.mPointer.f9875a);
        if (_getStatusTree == 0) {
            return null;
        }
        StatusTree statusTree = this.mTree;
        if (statusTree == null || statusTree.getAddress() != _getStatusTree) {
            this.mTree = new StatusTree(new CPointer(_getStatusTree));
        }
        return this.mTree;
    }
}
