package com.taobao.android.detail.ttdetail.request;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import mtopsdk.mtop.domain.BaseOutDo;
import tb.owc;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int PRE_LOAD_STATE_CONSUMED = 4;
    public static final int PRE_LOAD_STATE_FINISHED_FAILURE = 3;
    public static final int PRE_LOAD_STATE_FINISHED_SUCCESS = 2;
    public static final int PRE_LOAD_STATE_NOT_START = 0;
    public static final int PRE_LOAD_STATE_REQUESTING = 1;

    /* renamed from: a  reason: collision with root package name */
    public final ReentrantLock f6874a = new ReentrantLock();
    public final Map<String, C0380a> b = new ConcurrentHashMap();
    public final Map<String, List<owc>> c = new ConcurrentHashMap();
    public final Map<String, Integer> d = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.detail.ttdetail.request.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class C0380a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final MtopInfo f6875a;
        public final int b;
        public final BaseOutDo c;
        public final Object d;

        static {
            t2o.a(912262162);
        }

        public C0380a(MtopInfo mtopInfo, int i, BaseOutDo baseOutDo, Object obj) {
            this.f6875a = mtopInfo;
            this.b = i;
            this.c = baseOutDo;
            this.d = obj;
        }

        public BaseOutDo a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BaseOutDo) ipChange.ipc$dispatch("3b0134c3", new Object[]{this});
            }
            return this.c;
        }

        public int b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1ddaaf0b", new Object[]{this})).intValue();
            }
            return this.b;
        }

        public MtopInfo c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MtopInfo) ipChange.ipc$dispatch("9535a51b", new Object[]{this});
            }
            return this.f6875a;
        }

        public Object d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("a8d7ee76", new Object[]{this});
            }
            return this.d;
        }
    }

    static {
        t2o.a(912262161);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4a42606", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            ((ConcurrentHashMap) this.b).remove(str);
        }
    }

    public C0380a b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C0380a) ipChange.ipc$dispatch("2ac75948", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (C0380a) ((ConcurrentHashMap) this.b).get(str);
    }

    public boolean c(String str) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d6a2a31", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        this.f6874a.lock();
        try {
            Object obj = ((ConcurrentHashMap) this.d).get(str);
            if (obj instanceof Integer) {
                if (((Integer) obj).intValue() != 0) {
                    z = true;
                }
                if (!z) {
                    ((ConcurrentHashMap) this.d).put(str, 1);
                }
                return z;
            }
            ((ConcurrentHashMap) this.d).put(str, 1);
            return false;
        } finally {
            this.f6874a.unlock();
        }
    }

    public boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0ed760c", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        this.f6874a.lock();
        try {
            Object obj = ((ConcurrentHashMap) this.d).get(str);
            if (!(obj instanceof Integer) || ((Integer) obj).intValue() != 2) {
                return false;
            }
            ((ConcurrentHashMap) this.d).put(str, 4);
            return true;
        } finally {
            this.f6874a.unlock();
        }
    }

    public boolean e(String str, owc owcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f1b2848", new Object[]{this, str, owcVar})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        this.f6874a.lock();
        try {
            Object obj = ((ConcurrentHashMap) this.d).get(str);
            if (!(obj instanceof Integer) || ((Integer) obj).intValue() != 1 || owcVar == null) {
                this.f6874a.unlock();
                return false;
            }
            List list = (List) ((ConcurrentHashMap) this.c).get(str);
            if (list == null) {
                list = Collections.synchronizedList(new ArrayList());
                ((ConcurrentHashMap) this.c).put(str, list);
            }
            if (!list.contains(owcVar)) {
                list.add(owcVar);
            }
            this.f6874a.unlock();
            return true;
        } catch (Throwable th) {
            this.f6874a.unlock();
            throw th;
        }
    }

    public void f(String str, C0380a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee67bdf7", new Object[]{this, str, aVar});
        } else if (!TextUtils.isEmpty(str)) {
            ((ConcurrentHashMap) this.b).put(str, aVar);
        }
    }

    public boolean g(String str, MtopInfo mtopInfo, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("95e48657", new Object[]{this, str, mtopInfo, new Integer(i), obj})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        this.f6874a.lock();
        try {
            ((ConcurrentHashMap) this.d).put(str, 3);
            List<owc> list = (List) ((ConcurrentHashMap) this.c).get(str);
            if (list != null) {
                for (owc owcVar : list) {
                    owcVar.b(mtopInfo, i, obj);
                }
                list.clear();
                ((ConcurrentHashMap) this.d).put(str, 4);
                this.f6874a.unlock();
                return true;
            }
            this.f6874a.unlock();
            return false;
        } catch (Throwable th) {
            this.f6874a.unlock();
            throw th;
        }
    }

    public boolean h(String str, MtopInfo mtopInfo, int i, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b49e37ca", new Object[]{this, str, mtopInfo, new Integer(i), baseOutDo, obj})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        this.f6874a.lock();
        try {
            ((ConcurrentHashMap) this.d).put(str, 2);
            List<owc> list = (List) ((ConcurrentHashMap) this.c).get(str);
            if (list != null) {
                for (owc owcVar : list) {
                    owcVar.a(mtopInfo, i, baseOutDo, obj);
                }
                list.clear();
                ((ConcurrentHashMap) this.d).put(str, 4);
                this.f6874a.unlock();
                return true;
            }
            this.f6874a.unlock();
            return false;
        } catch (Throwable th) {
            this.f6874a.unlock();
            throw th;
        }
    }
}
