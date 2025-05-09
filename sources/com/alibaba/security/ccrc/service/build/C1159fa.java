package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.ccrc.common.util.JsonUtils;
import com.alibaba.security.ccrc.manager.CcrcContextImpl;
import com.alibaba.security.client.smart.core.heart.AlgoHeartRequest;
import com.alibaba.security.client.smart.core.heart.LrcAlgoHeartRequest;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* renamed from: com.alibaba.security.ccrc.service.build.fa  reason: case insensitive filesystem */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class C1159fa {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f2589a = "ccrc_tblive_content_risk_control";
    public static final long b = 5000;
    public final String c;
    public List<String> e;
    public String f;
    public long g;
    public AbstractC1167i h;
    public Map<String, Object> j;
    public final Object d = new Object();
    public boolean i = true;

    public C1159fa(String str) {
        this.c = str;
    }

    private void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else if (b()) {
            if (this.h == null) {
                this.h = new C1164h(CcrcContextImpl.getContext());
            }
            if (!c()) {
                AlgoHeartRequest algoHeartRequest = new AlgoHeartRequest(this.c);
                String str2 = this.f;
                algoHeartRequest.pId = str2;
                algoHeartRequest.dataId = str2;
                algoHeartRequest.algoList = str;
                algoHeartRequest.ts = System.currentTimeMillis();
                this.h.a(algoHeartRequest, null);
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("algoCode", str);
                hashMap.put("ts", Long.valueOf(System.currentTimeMillis()));
                hashMap.put("liveNumId", this.f);
                Map<String, Object> map = this.j;
                if (map != null) {
                    hashMap.putAll(map);
                }
                this.h.a(new LrcAlgoHeartRequest(f2589a, hashMap), null);
            }
            this.g = System.currentTimeMillis();
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        this.f = str;
        this.g = System.currentTimeMillis();
        List<String> list = this.e;
        if (list == null) {
            this.e = new ArrayList();
        } else {
            list.clear();
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        synchronized (this.d) {
            try {
                if (b()) {
                    if (!this.e.contains(str)) {
                        this.e.add(str);
                    }
                    if (System.currentTimeMillis() - this.g >= 5000) {
                        d(JsonUtils.toJSONString(this.e));
                        this.e.clear();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : f2589a.equalsIgnoreCase(this.c);
    }

    public void a() {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (b() && (list = this.e) != null && !list.isEmpty()) {
            d(JsonUtils.toJSONString(this.e));
            this.e.clear();
        }
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.i && d();
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.i = z;
        }
    }

    public void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            this.j = map;
        }
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : vb.c().c(this.c);
    }
}
