package com.alibaba.security.ccrc.service.build;

import android.util.Log;
import com.alibaba.security.ccrc.common.util.JsonUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class nb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Exception f2609a;
    public Map<String, Object> b;
    public Map<String, Object> c;

    public nb(Exception exc) {
        this.f2609a = exc;
    }

    public Map<String, Object> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this});
        }
        Map<String, Object> map = this.c;
        if (map != null) {
            return map;
        }
        Map<String, Object> map2 = (Map) JsonUtils.parseObject((String) c().get("algoRet"), (Class<Object>) Map.class);
        this.c = map2;
        if (map2 == null) {
            this.c = new HashMap();
        }
        return this.c;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        if (!d()) {
            return Log.getStackTraceString(this.f2609a);
        }
        return null;
    }

    public Map<String, Object> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3b696c1f", new Object[]{this});
        }
        if (this.b == null) {
            this.b = new HashMap();
        }
        return this.b;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        if (this.f2609a == null) {
            return true;
        }
        return false;
    }
}
