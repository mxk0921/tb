package com.taobao.android.ultronx.node;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultronx.base.CPointer;
import com.taobao.android.ultronx.protocol.UltronComponent;
import com.taobao.android.ultronx.protocol.UltronEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.fr2;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class StatusNode extends fr2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private UltronComponent mComponent;
    private Map<String, List<UltronEvent>> mEvents;
    private String mName;
    private StatusNode mParent;
    private RenderTemplate mTemplate;
    private Boolean mbRoot = null;
    private Boolean mbBlock = null;
    private Boolean mbLeaf = null;

    static {
        t2o.a(939524111);
    }

    public StatusNode(CPointer cPointer) {
        super(cPointer);
    }

    public static /* synthetic */ Object ipc$super(StatusNode statusNode, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ultronx/node/StatusNode");
    }

    public native long[] _getChildren(long j);

    public native String _getName(long j);

    public native long _getParent(long j);

    public native long _getRenderTemplate(long j);

    public native long _getUltronComponent(long j);

    public native HashMap _getUltronEvents(long j);

    public native boolean _isBlock(long j);

    public native boolean _isLeaf(long j);

    public native boolean _isRoot(long j);

    public List<StatusNode> getChildren() {
        long[] _getChildren;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("faa24d4b", new Object[]{this});
        }
        long j = this.mPointer.f9875a;
        if (j == 0 || (_getChildren = _getChildren(j)) == null || _getChildren.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (long j2 : _getChildren) {
            if (j2 != 0) {
                arrayList.add(new StatusNode(new CPointer(j2)));
            }
        }
        return arrayList;
    }

    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        if (this.mPointer.f9875a == 0) {
            return "";
        }
        if (TextUtils.isEmpty(this.mName)) {
            this.mName = _getName(this.mPointer.f9875a);
        }
        return this.mName;
    }

    public StatusNode getParent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StatusNode) ipChange.ipc$dispatch("50ddd23b", new Object[]{this});
        }
        long j = this.mPointer.f9875a;
        if (j == 0) {
            return null;
        }
        long _getParent = _getParent(j);
        StatusNode statusNode = this.mParent;
        if (statusNode == null || statusNode.getAddress() != _getParent) {
            this.mParent = new StatusNode(new CPointer(_getParent));
        }
        return this.mParent;
    }

    public RenderTemplate getRenderTemplate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RenderTemplate) ipChange.ipc$dispatch("6f2e8959", new Object[]{this});
        }
        long j = this.mPointer.f9875a;
        if (j == 0) {
            return null;
        }
        RenderTemplate renderTemplate = this.mTemplate;
        if (renderTemplate != null) {
            return renderTemplate;
        }
        long _getRenderTemplate = _getRenderTemplate(j);
        if (_getRenderTemplate == 0) {
            return null;
        }
        RenderTemplate renderTemplate2 = new RenderTemplate(new CPointer(_getRenderTemplate));
        this.mTemplate = renderTemplate2;
        return renderTemplate2;
    }

    public UltronComponent getUltronComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UltronComponent) ipChange.ipc$dispatch("1404791b", new Object[]{this});
        }
        long j = this.mPointer.f9875a;
        if (j == 0) {
            return null;
        }
        UltronComponent ultronComponent = this.mComponent;
        if (ultronComponent != null) {
            return ultronComponent;
        }
        long _getUltronComponent = _getUltronComponent(j);
        if (_getUltronComponent == 0) {
            return null;
        }
        UltronComponent ultronComponent2 = new UltronComponent(new CPointer(_getUltronComponent));
        this.mComponent = ultronComponent2;
        return ultronComponent2;
    }

    public Map<String, List<UltronEvent>> getUltronEvents() {
        long[] jArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("634fd45f", new Object[]{this});
        }
        long j = this.mPointer.f9875a;
        if (j == 0) {
            return null;
        }
        Map<String, List<UltronEvent>> map = this.mEvents;
        if (map != null) {
            return map;
        }
        HashMap _getUltronEvents = _getUltronEvents(j);
        if (_getUltronEvents == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Object obj : _getUltronEvents.keySet()) {
            if ((obj instanceof String) && (jArr = (long[]) _getUltronEvents.get(obj)) != null && jArr.length > 0) {
                ArrayList arrayList = new ArrayList();
                for (long j2 : jArr) {
                    if (j2 != 0) {
                        arrayList.add(new UltronEvent(new CPointer(j2)));
                    }
                }
                hashMap.put((String) obj, arrayList);
            }
        }
        this.mEvents = hashMap;
        return hashMap;
    }

    public boolean isBlock() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a2b7c8e", new Object[]{this})).booleanValue();
        }
        long j = this.mPointer.f9875a;
        if (j == 0) {
            return false;
        }
        if (this.mbBlock == null) {
            this.mbBlock = Boolean.valueOf(_isBlock(j));
        }
        return this.mbBlock.booleanValue();
    }

    public boolean isLeaf() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2dc4ec33", new Object[]{this})).booleanValue();
        }
        long j = this.mPointer.f9875a;
        if (j == 0) {
            return false;
        }
        if (this.mbLeaf == null) {
            this.mbLeaf = Boolean.valueOf(_isLeaf(j));
        }
        return this.mbLeaf.booleanValue();
    }

    public boolean isRoot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6b36bb7", new Object[]{this})).booleanValue();
        }
        long j = this.mPointer.f9875a;
        if (j == 0) {
            return false;
        }
        if (this.mbRoot == null) {
            this.mbRoot = Boolean.valueOf(_isRoot(j));
        }
        return this.mbRoot.booleanValue();
    }
}
