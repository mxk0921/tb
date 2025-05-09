package tb;

import com.alibaba.android.ultron.engine.template.TemplateInfo;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class tq6 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DATA_LOADER_TYPE_CLIENT = "dataLoaderTypeClient";
    public static final String DATA_LOADER_TYPE_REMOTE = "dataLoaderTypeRemote";
    public static final String DATA_PARSER_TYPE_SCRIPT = "dataLoaderParserScript";
    public TemplateInfo c;
    public String d;
    public String e;

    /* renamed from: a  reason: collision with root package name */
    public String f28880a = DATA_LOADER_TYPE_CLIENT;
    public final String b = DATA_PARSER_TYPE_SCRIPT;
    public boolean f = false;

    static {
        t2o.a(157286596);
    }

    public static tq6 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tq6) ipChange.ipc$dispatch("92b02c11", new Object[0]);
        }
        return new tq6();
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a9229d79", new Object[]{this});
        }
        return this.f28880a;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3dbcd8cc", new Object[]{this});
        }
        return this.b;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d550a91c", new Object[]{this});
        }
        return this.e;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aace99cb", new Object[]{this});
        }
        return this.d;
    }

    public TemplateInfo f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateInfo) ipChange.ipc$dispatch("4cd2cc0c", new Object[]{this});
        }
        return this.c;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("141bfb06", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcf861d", new Object[]{this, str});
        } else {
            this.f28880a = str;
        }
    }

    public void i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9df77da", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57023642", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31425b73", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public void l(TemplateInfo templateInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4711a3a6", new Object[]{this, templateInfo});
        } else {
            this.c = templateInfo;
        }
    }

    public void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57aebb24", new Object[]{this, str});
            return;
        }
        if (this.c == null) {
            this.c = new TemplateInfo();
        }
        this.c.setUrl(str);
    }
}
