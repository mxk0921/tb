package com.taobao.android.ultronx.tree;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultronx.base.CPointer;
import com.taobao.android.ultronx.node.StatusNode;
import java.util.ArrayList;
import java.util.List;
import tb.fr2;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class StatusTree extends fr2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private StatusNode mRoot;

    static {
        t2o.a(939524115);
    }

    public StatusTree(CPointer cPointer) {
        super(cPointer);
    }

    public static /* synthetic */ Object ipc$super(StatusTree statusTree, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ultronx/tree/StatusTree");
    }

    public native long[] _filterNode(long j, String str);

    public native long _findNode(long j, String str);

    public native long _getRoot(long j);

    public native void _removeNode(long j, String str);

    public List<StatusNode> filterNode(String str) {
        long[] _filterNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("fe776a3c", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str) || (_filterNode = _filterNode(this.mPointer.f9875a, str)) == null || _filterNode.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (long j : _filterNode) {
            if (j != 0) {
                arrayList.add(new StatusNode(new CPointer(j)));
            }
        }
        return arrayList;
    }

    public StatusNode findNode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StatusNode) ipChange.ipc$dispatch("a1f90996", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        long _findNode = _findNode(this.mPointer.f9875a, str);
        if (_findNode == 0) {
            return null;
        }
        return new StatusNode(new CPointer(_findNode));
    }

    public StatusNode getRoot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StatusNode) ipChange.ipc$dispatch("2e01cd83", new Object[]{this});
        }
        long _getRoot = _getRoot(this.mPointer.f9875a);
        if (_getRoot == 0) {
            return null;
        }
        StatusNode statusNode = this.mRoot;
        if (statusNode == null || statusNode.getAddress() != _getRoot) {
            this.mRoot = new StatusNode(new CPointer(_getRoot));
        }
        return this.mRoot;
    }

    public void removeNode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2402d2b7", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            _removeNode(this.mPointer.f9875a, str);
        }
    }
}
