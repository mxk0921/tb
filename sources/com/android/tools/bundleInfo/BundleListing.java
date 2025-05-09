package com.android.tools.bundleInfo;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class BundleListing implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ConcurrentHashMap<String, a> bundles = new ConcurrentHashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Boolean f4604a;
        public String b;
        public String c;
        public String d;
        public String e;
        public Map<String, Boolean> f = new HashMap();
        public Map<String, Boolean> g = new HashMap();
        public Map<String, Boolean> h = new HashMap();
        public List<String> i = new ArrayList();
        public List<String> j = new ArrayList();
        public Map<String, String> k = new HashMap();
        public List<String> l = new ArrayList();
        public List<String> m = new ArrayList();
        public String n;
        public String o;
        public int p;

        public a() {
            new HashMap();
            new ArrayList();
        }
    }

    public ConcurrentHashMap<String, a> getBundles() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("407a46a4", new Object[]{this});
        }
        return this.bundles;
    }

    public void setBundles(ConcurrentHashMap<String, a> concurrentHashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44d5e846", new Object[]{this, concurrentHashMap});
        } else {
            this.bundles = concurrentHashMap;
        }
    }
}
