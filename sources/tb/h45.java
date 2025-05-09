package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.internal.config.Config;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class h45 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f20401a;
    public boolean b;
    public String c;
    public String d;
    public JSONObject e;
    public String f;
    public String g;
    public String h;
    public List<j45> i;
    public Config.ModelResource j;
    public String k;
    public String l;

    static {
        t2o.a(1034944694);
    }

    public void a(j45... j45VarArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f1b624d", new Object[]{this, j45VarArr});
        } else if (j45VarArr != null && j45VarArr.length != 0) {
            if (this.i == null) {
                this.i = new ArrayList();
            }
            for (j45 j45Var : j45VarArr) {
                if (j45Var != null) {
                    this.i.add(j45Var);
                }
            }
        }
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5686c271", new Object[]{this});
        }
        return null;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("93fed1ba", new Object[]{this});
        }
        return this.k;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15a34d0e", new Object[]{this});
        }
        return null;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("70020a6e", new Object[]{this});
        }
        return null;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f3d04d", new Object[]{this});
        }
        return this.h;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de71c0fc", new Object[]{this});
        }
        return this.g;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.f;
    }

    public Config.ModelResource i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Config.ModelResource) ipChange.ipc$dispatch("35a8492", new Object[]{this});
        }
        return this.j;
    }

    public i45 j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i45) ipChange.ipc$dispatch("5daced09", new Object[]{this});
        }
        return null;
    }

    public Map<String, Object> k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f59be2d0", new Object[]{this});
        }
        try {
            new HashMap();
            throw null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<j45> l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2331d80f", new Object[]{this});
        }
        return this.i;
    }

    public void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2deee64", new Object[]{this, str});
        } else {
            this.k = str;
        }
    }

    public void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c89c231", new Object[]{this, str});
        } else {
            this.h = str;
        }
    }

    public void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6c9e762", new Object[]{this, str});
        } else {
            this.g = str;
        }
    }

    public void p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99b22cde", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public void q(Config.ModelResource modelResource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71b843be", new Object[]{this, modelResource});
        } else {
            this.j = modelResource;
        }
    }
}
