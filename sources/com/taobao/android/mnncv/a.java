package com.taobao.android.mnncv;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.mnncv.MNNCVExecutor;
import com.taobao.mrt.task.MRTRuntimeException;
import com.taobao.mrt.task.desc.MRTCodeDescription;
import com.taobao.mrt.task.desc.MRTFilesDescription;
import com.taobao.mrt.task.desc.MRTTaskDescription;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import tb.bqh;
import tb.mqh;
import tb.oqh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static a c;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<String, MRTTaskDescription> f8991a = new ConcurrentHashMap<>();
    public final Set<String> b = Collections.synchronizedSet(new HashSet());

    public static a e() {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("9bee6cb3", new Object[0]);
        }
        synchronized (a.class) {
            try {
                if (c == null) {
                    c = new a();
                }
                aVar = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    public final boolean a(String str, MRTTaskDescription mRTTaskDescription, MNNCVExecutor.i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("176360ee", new Object[]{this, str, mRTTaskDescription, iVar})).booleanValue();
        }
        String str2 = mqh.d;
        mqh.x(mRTTaskDescription.toJSONObjet().toString(), new File(str2, str + "_cache.json"));
        return true;
    }

    public boolean b(String str, MRTTaskDescription mRTTaskDescription, MNNCVExecutor.i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c142ca07", new Object[]{this, str, mRTTaskDescription, iVar})).booleanValue();
        }
        String str2 = mRTTaskDescription.name;
        File file = new File(mqh.b, str);
        File file2 = new File(mqh.b, str2);
        if (file.exists()) {
            if (file2.exists()) {
                mqh.k(file2);
            }
            try {
                boolean f = mqh.f(file, file2);
                mqh.s(mRTTaskDescription.model);
                if (!f) {
                    return false;
                }
            } catch (Exception e) {
                if (iVar != null) {
                    iVar.onError("copy model file" + e.getMessage());
                }
                return false;
            }
        }
        File file3 = new File(mqh.c, str);
        File file4 = new File(mqh.c, str2);
        if (file3.exists()) {
            if (file4.exists()) {
                mqh.k(file4);
            }
            if (!mqh.f(file3, file4)) {
                if (iVar != null) {
                    iVar.onError("copy resource file ");
                }
                return false;
            }
            mqh.s(mRTTaskDescription.resource);
        }
        return true;
    }

    public void c(String str, Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58fc9f0c", new Object[]{this, str, set});
        } else if (str != null) {
            d(mqh.b, str, set);
            d(mqh.c, str, set);
        }
    }

    public final void d(String str, String str2, Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac60f615", new Object[]{this, str, str2, set});
            return;
        }
        File file = new File(str);
        String[] list = file.list();
        if (list != null) {
            for (String str3 : list) {
                if (!this.b.contains(str3) && (set == null || !set.contains(str3))) {
                    if (str3.startsWith(str2 + "_")) {
                        mqh.k(new File(file, str3));
                    }
                }
            }
        }
    }

    public final MRTTaskDescription f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MRTTaskDescription) ipChange.ipc$dispatch("d6c6efaa", new Object[]{this, str});
        }
        File file = new File(mqh.d);
        if (!file.isDirectory()) {
            return null;
        }
        File file2 = new File(file, str + "_cache.json");
        if (!file2.exists()) {
            return null;
        }
        String p = mqh.p(file2);
        if (TextUtils.isEmpty(p)) {
            return null;
        }
        try {
            MRTTaskDescription d = bqh.d(JSON.parseObject(p));
            if (d == null) {
                return null;
            }
            MRTCodeDescription mRTCodeDescription = d.model;
            if (mRTCodeDescription != null && mqh.l(mRTCodeDescription) != 0) {
                return null;
            }
            MRTFilesDescription mRTFilesDescription = d.resource;
            if (mRTFilesDescription == null || mqh.l(mRTFilesDescription) == 0) {
                return d;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public MRTTaskDescription g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MRTTaskDescription) ipChange.ipc$dispatch("b55de904", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (this.f8991a.containsKey(str)) {
            return this.f8991a.get(str);
        }
        MRTTaskDescription f = f(str);
        if (f != null) {
            this.f8991a.put(str, f);
        }
        return f;
    }

    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdb5c01f", new Object[]{this, str});
        } else if (str != null) {
            this.b.remove(str);
        }
    }

    public boolean i(String str, MNNCVExecutor.i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f649ac3", new Object[]{this, str, iVar})).booleanValue();
        }
        MRTTaskDescription e = oqh.d().e(str);
        if (e == null) {
            if (iVar != null) {
                iVar.onError("remote task desc not exist");
            }
            return false;
        }
        MRTTaskDescription g = g(str);
        if (g != null && TextUtils.equals(e.cid, g.cid)) {
            return true;
        }
        JSONObject jSONObjet = e.toJSONObjet();
        jSONObjet.put("n", (Object) (e.name + "_" + e.cid));
        try {
            MRTTaskDescription d = bqh.d(jSONObjet);
            if (!b(str, d, iVar)) {
                return false;
            }
            boolean a2 = a(str, d, iVar);
            if (a2) {
                this.f8991a.remove(str);
            }
            return a2;
        } catch (MRTRuntimeException unused) {
            return false;
        }
    }
}
