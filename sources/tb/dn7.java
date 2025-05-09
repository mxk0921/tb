package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.tempate.DTemplateManager;
import com.taobao.android.dinamic.tempate.DinamicTemplate;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class dn7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ul7 f17959a;

    static {
        t2o.a(444596270);
    }

    public dn7(ul7 ul7Var) {
        this.f17959a = ul7Var;
    }

    public final StringBuilder a(StringBuilder sb, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StringBuilder) ipChange.ipc$dispatch("72d8c7dc", new Object[]{this, sb, str, str2});
        }
        if (sb == null) {
            sb = new StringBuilder();
        }
        if (sb.length() > 0) {
            sb.append(",");
        }
        sb.append(str);
        sb.append("=");
        sb.append(str2);
        return sb;
    }

    public final String b(String str, String str2, DinamicTemplate dinamicTemplate, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c355f828", new Object[]{this, str, str2, dinamicTemplate, str3});
        }
        StringBuilder sb = new StringBuilder("[");
        sb.append(str);
        sb.append("]:");
        sb.append(str2);
        sb.append("|");
        if (dinamicTemplate == null) {
            return sb.toString();
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("template", (Object) dinamicTemplate.name);
        jSONObject.put("version", (Object) dinamicTemplate.version);
        if (str3 != null) {
            jSONObject.put("error", (Object) str3);
        }
        sb.append(jSONObject.toJSONString());
        return sb.toString();
    }

    public final StringBuilder c(DinamicTemplate dinamicTemplate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StringBuilder) ipChange.ipc$dispatch("661c1de6", new Object[]{this, dinamicTemplate});
        }
        if (dinamicTemplate == null) {
            return new StringBuilder();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("templateName=");
        sb.append(dinamicTemplate.name);
        sb.append(",templateVersion=");
        sb.append(dinamicTemplate.version);
        return sb;
    }

    public void h(String str, String str2, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c14b7e5c", new Object[]{this, str, str2, new Double(d)});
        } else if (this.f17959a != null) {
            StringBuilder sb = new StringBuilder();
            a(sb, "identifier", str2);
            a(sb, "module", str);
            this.f17959a.b("Dinamic_2", "HandleEvent", sb.toString(), d);
        }
    }

    public void i(String str, DinamicTemplate dinamicTemplate, boolean z, mm7 mm7Var, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b798ce1", new Object[]{this, str, dinamicTemplate, new Boolean(z), mm7Var, new Double(d)});
        } else if (this.f17959a != null) {
            StringBuilder c = c(dinamicTemplate);
            a(c, "module", str);
            if (z) {
                this.f17959a.c("Dinamic_2", "ReadTemplate", c.toString());
                this.f17959a.b("Dinamic_2", "ReadTemplate", c.toString(), d);
                return;
            }
            ul7 ul7Var = this.f17959a;
            String sb = c.toString();
            String str2 = "";
            String obj = (mm7Var == null || mm7Var.d()) ? str2 : mm7Var.c().keySet().toString();
            if (mm7Var != null) {
                str2 = mm7Var.b();
            }
            ul7Var.a("Dinamic_2", "ReadTemplate", sb, obj, str2);
        }
    }

    public void d(String str, DinamicTemplate dinamicTemplate, boolean z, mm7 mm7Var, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bb684f8", new Object[]{this, str, dinamicTemplate, new Boolean(z), mm7Var, new Double(d)});
        } else if (this.f17959a != null) {
            StringBuilder c = c(dinamicTemplate);
            a(c, "module", str);
            if (z) {
                this.f17959a.c("Dinamic_2", "BindData", c.toString());
                this.f17959a.b("Dinamic_2", "BindData", c.toString(), d);
                ym7.j("Dinamic_2", "Dinamic_2", b(str, "trackBindData", dinamicTemplate, null));
                return;
            }
            String str2 = "";
            this.f17959a.a("Dinamic_2", "BindData", c.toString(), (mm7Var == null || mm7Var.d()) ? str2 : mm7Var.c().keySet().toString(), mm7Var == null ? str2 : mm7Var.b());
            if (mm7Var != null) {
                str2 = mm7Var.b();
            }
            ym7.i("Dinamic_2", "Dinamic_2", b(str, "trackBindData", dinamicTemplate, str2));
        }
    }

    public void e(String str, DinamicTemplate dinamicTemplate, boolean z, mm7 mm7Var, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65e269f2", new Object[]{this, str, dinamicTemplate, new Boolean(z), mm7Var, new Double(d)});
        } else if (this.f17959a != null) {
            StringBuilder c = c(dinamicTemplate);
            a(c, "module", str);
            if (z) {
                this.f17959a.c("Dinamic_2", "CreateView", c.toString());
                this.f17959a.b("Dinamic_2", "CreateView", c.toString(), d);
                ym7.j("Dinamic_2", "Dinamic_2", b(str, "trackCreateView", dinamicTemplate, null));
                return;
            }
            String str2 = "";
            this.f17959a.a("Dinamic_2", "CreateView", c.toString(), (mm7Var == null || mm7Var.d()) ? str2 : mm7Var.c().keySet().toString(), mm7Var == null ? str2 : mm7Var.b());
            if (mm7Var != null) {
                str2 = mm7Var.b();
            }
            ym7.i("Dinamic_2", "Dinamic_2", b(str, "trackCreateView", dinamicTemplate, str2));
        }
    }

    public void f(String str, DinamicTemplate dinamicTemplate, boolean z, mm7 mm7Var, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47759d3", new Object[]{this, str, dinamicTemplate, new Boolean(z), mm7Var, new Double(d)});
        } else if (this.f17959a != null) {
            StringBuilder c = c(dinamicTemplate);
            a(c, "module", str);
            if (z) {
                this.f17959a.c("Dinamic_2", "DownloadTemplate", c.toString());
                this.f17959a.b("Dinamic_2", "DownloadTemplate", c.toString(), d);
                ym7.j("Dinamic_2", "Dinamic_2", b(str, "trackDownloadTemplate", dinamicTemplate, null));
                return;
            }
            ul7 ul7Var = this.f17959a;
            String sb = c.toString();
            String str2 = "";
            String obj = (mm7Var == null || mm7Var.d()) ? str2 : mm7Var.c().keySet().toString();
            if (mm7Var != null) {
                str2 = mm7Var.b();
            }
            ul7Var.a("Dinamic_2", "DownloadTemplate", sb, obj, str2);
            ym7.i("Dinamic_2", "Dinamic_2", b(str, "trackDownloadTemplate", dinamicTemplate, wzi.DOWNLOAD_ERROR));
        }
    }

    public void j(String str, DinamicTemplate dinamicTemplate, boolean z, mm7 mm7Var, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99bc1ff4", new Object[]{this, str, dinamicTemplate, new Boolean(z), mm7Var, new Double(d)});
        } else if (this.f17959a != null) {
            StringBuilder c = c(dinamicTemplate);
            a(c, "module", str);
            if (z) {
                this.f17959a.c("Dinamic_2", "WriteTemplate", c.toString());
                this.f17959a.b("Dinamic_2", "WriteTemplate", c.toString(), d);
                ym7.j("Dinamic_2", "Dinamic_2", b(str, "trackWriteTemplate", dinamicTemplate, null));
                return;
            }
            ul7 ul7Var = this.f17959a;
            String sb = c.toString();
            String str2 = "";
            String obj = (mm7Var == null || mm7Var.d()) ? str2 : mm7Var.c().keySet().toString();
            if (mm7Var != null) {
                str2 = mm7Var.b();
            }
            ul7Var.a("Dinamic_2", "WriteTemplate", sb, obj, str2);
            ym7.i("Dinamic_2", "Dinamic_2", b(str, "trackWriteTemplate", dinamicTemplate, "writeTemplateError"));
        }
    }

    public void g(String str, DTemplateManager.CacheStrategy cacheStrategy, DinamicTemplate dinamicTemplate, DinamicTemplate dinamicTemplate2, double d) {
        String str2;
        boolean z = true;
        z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aae009c8", new Object[]{this, str, cacheStrategy, dinamicTemplate, dinamicTemplate2, new Double(d)});
        } else if (this.f17959a != null) {
            StringBuilder c = c(dinamicTemplate2);
            a(c, "originalTemplateVersion", dinamicTemplate.version);
            a(c, "module", str);
            if (cacheStrategy.equals(DTemplateManager.CacheStrategy.STRATEGY_DEFAULT)) {
                str2 = "0";
            } else {
                str2 = "1";
            }
            a(c, "cacheStrategy", str2);
            if (dinamicTemplate2 != null) {
                if (dinamicTemplate.isPreset() && !dinamicTemplate2.isPreset()) {
                    z = false;
                }
                if (dinamicTemplate.isPreset() || dinamicTemplate.version.equals(dinamicTemplate2.version)) {
                }
            }
            if (z) {
                this.f17959a.c("Dinamic_2", "FetchExactTemplate", c.toString());
            } else {
                this.f17959a.a("Dinamic_2", "FetchExactTemplate", c.toString(), null, null);
            }
            this.f17959a.b("Dinamic_2", "FetchExactTemplate", c.toString(), d);
        }
    }
}
