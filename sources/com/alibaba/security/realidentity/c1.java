package com.alibaba.security.realidentity;

import com.alibaba.security.realidentity.algo.wrapper.entity.detector.ABDetectType;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class c1 implements e1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<ABDetectType> f2671a;

    public c1(List<ABDetectType> list) {
        LinkedList linkedList = new LinkedList();
        this.f2671a = linkedList;
        linkedList.addAll(list);
    }

    public List<ABDetectType> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : this.f2671a;
    }

    @Override // com.alibaba.security.realidentity.e1
    public List<ABDetectType> a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("87fd354c", new Object[]{this, new Integer(i)});
        }
        if (i >= this.f2671a.size()) {
            return new LinkedList(this.f2671a);
        }
        LinkedList linkedList = new LinkedList();
        for (int i2 = 0; i2 < i; i2++) {
            linkedList.add(a().get(i2));
        }
        return linkedList;
    }
}
