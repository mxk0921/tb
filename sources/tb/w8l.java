package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbreachflow.shortcuts.config.ShortcutConfig;
import com.taobao.tbreachflow.shortcuts.config.ShortcutControlConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class w8l {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static String f = "";
    public static List<String> g;

    /* renamed from: a  reason: collision with root package name */
    public boolean f30515a = true;
    public boolean b = false;
    public String c = "";
    public Map<String, ShortcutConfig> d = new HashMap();
    public Map<String, ShortcutControlConfig> e = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final w8l f30516a = new w8l();

        public static /* synthetic */ w8l a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (w8l) ipChange.ipc$dispatch("fa100517", new Object[0]);
            }
            return f30516a;
        }
    }

    public static w8l d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w8l) ipChange.ipc$dispatch("61472892", new Object[0]);
        }
        return a.a();
    }

    public Map<String, ShortcutConfig> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8226875a", new Object[]{this});
        }
        return this.d;
    }

    public Map<String, ShortcutControlConfig> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("667c25f5", new Object[]{this});
        }
        return this.e;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("abdb5855", new Object[]{this});
        }
        return this.c;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8773fbd1", new Object[]{this})).booleanValue();
        }
        return this.f30515a;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f34dfe8", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public void g(Map<String, ShortcutConfig> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2677a20c", new Object[]{this, map});
        } else {
            this.d = map;
        }
    }

    public void h(Map<String, ShortcutControlConfig> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1264e339", new Object[]{this, map});
        } else {
            this.e = map;
        }
    }

    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd0eba29", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("add613df", new Object[]{this, new Boolean(z)});
        } else {
            this.f30515a = z;
        }
    }

    public void k(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97488138", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }
}
