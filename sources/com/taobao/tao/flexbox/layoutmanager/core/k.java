package com.taobao.tao.flexbox.layoutmanager.core;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import tb.hk8;
import tb.nwv;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class k implements j, o.t {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, LinkedList<j>> f12220a = new HashMap<>();
    public boolean b = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LinkedList f12221a;
        public final /* synthetic */ j b;

        public a(LinkedList linkedList, j jVar) {
            this.f12221a = linkedList;
            this.b = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!this.f12221a.contains(this.b)) {
                this.f12221a.add(this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LinkedList f12222a;
        public final /* synthetic */ j b;

        public b(LinkedList linkedList, j jVar) {
            this.f12222a = linkedList;
            this.b = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f12222a.remove(this.b);
            }
        }
    }

    static {
        t2o.a(503317093);
        t2o.a(503317092);
        t2o.a(503317155);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.o.t
    public void a(String str, j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc13caec", new Object[]{this, str, jVar});
            return;
        }
        LinkedList<j> linkedList = this.f12220a.get(str);
        if (linkedList != null) {
            if (this.b) {
                nwv.y0(new b(linkedList, jVar));
            } else {
                linkedList.remove(jVar);
            }
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.o.t
    public void b(String str, j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d0e47e5", new Object[]{this, str, jVar});
            return;
        }
        LinkedList<j> linkedList = this.f12220a.get(str);
        if (linkedList == null) {
            linkedList = new LinkedList<>();
            this.f12220a.put(str, linkedList);
        }
        if (this.b) {
            nwv.y0(new a(linkedList, jVar));
        } else if (!linkedList.contains(jVar)) {
            linkedList.add(jVar);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.j
    public boolean onHandleMessage(n.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e782cf4", new Object[]{this, gVar})).booleanValue();
        }
        LinkedList<j> linkedList = this.f12220a.get(gVar.d);
        if (linkedList != null) {
            this.b = true;
            Iterator<j> it = linkedList.iterator();
            while (it.hasNext()) {
                it.next().onHandleMessage(gVar);
            }
            this.b = false;
        }
        return false;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.j
    public boolean onHandleTNodeMessage(n nVar, n nVar2, String str, String str2, Map map, hk8 hk8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abab8f80", new Object[]{this, nVar, nVar2, str, str2, map, hk8Var})).booleanValue();
        }
        return false;
    }
}
