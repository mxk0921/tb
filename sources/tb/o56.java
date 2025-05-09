package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class o56 extends an6 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXTEMPLATE_HASPARAMS = -1664973152736847703L;
    public static final long DXTEMPLATE_NAME = 36442092789L;
    public static final long DXTEMPLATE_URL = 528128262;
    public static final long DXTEMPLATE_VERSION = 5435381891761953165L;
    public static final long DXTEMPLATE__STORAGETYPE = -4416109363904538046L;
    public static final long DXTEMPLATE__TEMPLATEDATA = 324196793780517186L;
    public static final long DX_VIEW_ORIENTATION = -7199229155167727177L;
    public static final int HORIZONTAL = 0;
    public static final int STORAGE_TYPE_RESULT_TYPE_CONSTANT_DESCRIPTION = 2;
    public static final int STORAGE_TYPE_RESULT_TYPE_DYNAMIC_DESCRIPTION = 3;
    public static final int STORAGE_TYPE_RESULT_TYPE_INLINE = 1;
    public static final int VERTICAL = 1;

    /* renamed from: a  reason: collision with root package name */
    public String f25147a;
    public String b;
    public String c;
    public JSONObject d;
    public JSONObject e;
    public List<String> f;
    public int k;
    public int l;

    static {
        t2o.a(444596467);
    }

    public static /* synthetic */ Object ipc$super(o56 o56Var, String str, Object... objArr) {
        if (str.hashCode() == -1764761226) {
            super.b((fae) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamic_v35/widget/DXNanoTemplateProps");
    }

    @Override // tb.an6, tb.fae
    public void b(fae faeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96cfe176", new Object[]{this, faeVar});
            return;
        }
        super.b(faeVar);
        o56 o56Var = (o56) faeVar;
        this.f25147a = o56Var.f25147a;
        this.b = o56Var.b;
        this.c = o56Var.c;
        this.d = o56Var.d;
        this.e = o56Var.e;
        this.f = o56Var.f;
        this.l = o56Var.l;
    }

    @Override // tb.an6, tb.fae
    public void d(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a9d1f1", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j != -1664973152736847703L) {
            if (j == -4416109363904538046L) {
                this.l = i;
            } else if (j == -7199229155167727177L) {
                this.k = i;
            }
        }
    }

    @Override // tb.an6, tb.fae
    public void f(long j, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6f31251", new Object[]{this, new Long(j), jSONObject});
        } else if (j == 324196793780517186L) {
            k(jSONObject);
        }
    }

    @Override // tb.an6, tb.fae
    public void g(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ebe4270", new Object[]{this, new Long(j), str});
        } else if (j == 36442092789L) {
            this.f25147a = str;
        } else if (j == 528128262) {
            this.b = str;
        } else if (j == 5435381891761953165L) {
            this.c = str;
        }
    }

    public JSONObject i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9e8abe12", new Object[]{this});
        }
        return this.e;
    }

    public JSONObject j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5a2baab4", new Object[]{this});
        }
        return this.d;
    }

    public final void k(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33723d6", new Object[]{this, jSONObject});
            return;
        }
        this.e = null;
        this.f = null;
        if (jSONObject != null) {
            this.d = jSONObject;
        }
    }

    public void l(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d019bb2", new Object[]{this, jSONObject});
        } else {
            this.e = jSONObject;
        }
    }

    public int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6dd599b9", new Object[]{this})).intValue();
        }
        return this.l;
    }
}
