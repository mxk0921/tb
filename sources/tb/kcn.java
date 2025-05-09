package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import org.json.JSONException;
import org.json.JSONStringer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class kcn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public RVLLevel f22567a;
    public final String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public long h;
    public String i;
    public boolean j = false;
    public String k;

    static {
        t2o.a(649068551);
    }

    public kcn(RVLLevel rVLLevel, String str, long j) {
        this.f22567a = rVLLevel;
        this.b = str;
        this.h = j;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8c32fc8", new Object[]{this});
        }
        if (this.k == null) {
            if (this.j) {
                try {
                    JSONStringer object = new JSONStringer().object();
                    if (this.e != null) {
                        object.key("event").value(this.e);
                    }
                    if (this.c != null) {
                        object.key("id").value(this.c);
                    }
                    if (this.d != null) {
                        object.key("parentId").value(this.d);
                    }
                    object.key("time").value(this.h);
                    if (this.f != null) {
                        object.key("errorCode").value(this.f);
                    }
                    if (this.g != null) {
                        object.key("errorMsg").value(this.g);
                    }
                    if (this.i == null) {
                        object.endObject();
                        this.k = object.toString();
                    } else {
                        this.k = object + ",\"ext\":" + this.i + "}";
                    }
                } catch (JSONException unused) {
                }
            } else {
                this.k = this.i;
            }
        }
        return this.k;
    }

    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eae1dbed", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        this.e = str;
        return true;
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3aaf138", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            this.d = str;
        }
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb8b6e8f", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            this.c = str;
        }
    }

    public boolean e(Object obj) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("402628f3", new Object[]{this, obj})).booleanValue();
        }
        if (obj == null) {
            return false;
        }
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            if (obj instanceof Number) {
                str = obj.toString();
            }
            return false;
        }
        if (!TextUtils.isEmpty(str) && !"0".contentEquals(str)) {
            this.f = str;
            if (this.f22567a.value > RVLLevel.Warn.value) {
                this.f22567a = RVLLevel.Error;
            }
            return true;
        }
        return false;
    }
}
